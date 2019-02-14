INSERT INTO `guns`.`sys_menu` (`id`, `code`, `pcode`, `pcodes`, `name`, `icon`, `url`, `num`, `levels`, `ismenu`, `tips`, `status`, `isopen`) VALUES ('1095192432879112194', 'bizOrder', '0', '[0],', '订单管理', '', '/bizOrder', '99', '1', '1', NULL, '1', '0');
INSERT INTO `guns`.`sys_menu` (`id`, `code`, `pcode`, `pcodes`, `name`, `icon`, `url`, `num`, `levels`, `ismenu`, `tips`, `status`, `isopen`) VALUES ('1095192432879112195', 'bizOrder_list', 'bizOrder', '[0],[bizOrder],', '订单管理列表', '', '/bizOrder/list', '99', '2', '0', NULL, '1', '0');
INSERT INTO `guns`.`sys_menu` (`id`, `code`, `pcode`, `pcodes`, `name`, `icon`, `url`, `num`, `levels`, `ismenu`, `tips`, `status`, `isopen`) VALUES ('1095192432879112196', 'bizOrder_add', 'bizOrder', '[0],[bizOrder],', '订单管理添加', '', '/bizOrder/add', '99', '2', '0', NULL, '1', '0');
INSERT INTO `guns`.`sys_menu` (`id`, `code`, `pcode`, `pcodes`, `name`, `icon`, `url`, `num`, `levels`, `ismenu`, `tips`, `status`, `isopen`) VALUES ('1095192432879112197', 'bizOrder_update', 'bizOrder', '[0],[bizOrder],', '订单管理更新', '', '/bizOrder/update', '99', '2', '0', NULL, '1', '0');
INSERT INTO `guns`.`sys_menu` (`id`, `code`, `pcode`, `pcodes`, `name`, `icon`, `url`, `num`, `levels`, `ismenu`, `tips`, `status`, `isopen`) VALUES ('1095192432879112198', 'bizOrder_delete', 'bizOrder', '[0],[bizOrder],', '订单管理删除', '', '/bizOrder/delete', '99', '2', '0', NULL, '1', '0');
INSERT INTO `guns`.`sys_menu` (`id`, `code`, `pcode`, `pcodes`, `name`, `icon`, `url`, `num`, `levels`, `ismenu`, `tips`, `status`, `isopen`) VALUES ('1095192432879112199', 'bizOrder_detail', 'bizOrder', '[0],[bizOrder],', '订单管理详情', '', '/bizOrder/detail', '99', '2', '0', NULL, '1', '0');


 DROP TABLE IF EXISTS `biz_order`;
 CREATE TABLE `biz_order` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
 `goods_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
 `place` varchar(255) DEFAULT NULL COMMENT '下单地点',
 `create_time` datetime DEFAULT NULL COMMENT '下单时间',
 `user_name` varchar(255) DEFAULT NULL COMMENT '下单用户名称',
 `user_phone` varchar(255) DEFAULT NULL COMMENT '下单用户电话',
 PRIMARY KEY (`id`) USING BTREE
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='订单表'


  SET FOREIGN_KEY_CHECKS = 1;