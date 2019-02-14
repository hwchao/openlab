package cn.stylefeng.guns.modular.order.controller;

import cn.stylefeng.guns.utils.ResultUtils;
import cn.stylefeng.roses.core.base.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import cn.stylefeng.guns.core.log.LogObjectHolder;
import cn.stylefeng.guns.modular.system.model.BizOrder;
import cn.stylefeng.guns.modular.order.service.IBizOrderService;

import java.sql.Date;

/**
 * 订单管理控制器
 *
 * @author fengshuonan
 * @Date 2019-02-12 13:26:38
 */
@Controller
@RequestMapping("/bizOrder")
@Api(description = "订单相关信息")
public class BizOrderController extends BaseController {

    private String PREFIX = "/order/bizOrder/";

    @Autowired
    private IBizOrderService bizOrderService;

    /**
     * 跳转到订单管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "bizOrder.html";
    }

    /**
     * 跳转到添加订单管理
     */
    @RequestMapping("/bizOrder_add")
    public String bizOrderAdd() {
        return PREFIX + "bizOrder_add.html";
    }

    /**
     * 跳转到修改订单管理
     */
    @RequestMapping("/bizOrder_update/{bizOrderId}")
    public String bizOrderUpdate(@PathVariable Integer bizOrderId, Model model) {
        BizOrder bizOrder = bizOrderService.selectById(bizOrderId);
        model.addAttribute("item",bizOrder);
        LogObjectHolder.me().set(bizOrder);
        return PREFIX + "bizOrder_edit.html";
    }

    /**
     * 获取订单管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return bizOrderService.selectList(null);
    }

    /**
     * 新增订单管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(BizOrder bizOrder) {
        bizOrderService.insert(bizOrder);
        return SUCCESS_TIP;
    }

    /**
     * 删除订单管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer bizOrderId) {
        bizOrderService.deleteById(bizOrderId);
        return SUCCESS_TIP;
    }

    /**
     * 修改订单管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(BizOrder bizOrder) {
        bizOrderService.updateById(bizOrder);
        return SUCCESS_TIP;
    }

    /**
     * 订单管理详情
     */
    @RequestMapping(value = "/detail/{bizOrderId}")
    @ResponseBody
    public Object detail(@PathVariable("bizOrderId") Integer bizOrderId) {
        return bizOrderService.selectById(bizOrderId);
    }

    /**
     * 下面是小程序api接口部分
     */

    @RequestMapping(value = "/api/bizOrder_add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="创建订单", notes="创建一条订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "订单", value = "模块名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "订单模块", value = "业务名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "bizOrder", value = "业务英文名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "/bizOrder", value = "项目生成类路径", required = true, dataType = "String")
    })
    public Object api_add(BizOrder bizOrder) {
        bizOrderService.insert(bizOrder);
        return ResultUtils.success(1);
    }
}
