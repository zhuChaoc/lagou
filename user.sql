
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(20) NOT NULL COMMENT '姓名',
  `password` varchar(45) NOT NULL COMMENT '密码',
  `email` varchar(45) DEFAULT NULL COMMENT '邮箱',
  `job` varchar(20) DEFAULT NULL COMMENT '职位',
  `level` varchar(1) DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_email_uindex` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`email`,`job`,`level`) values (1,'朱超城','96E79218965','zhuchaocheng@163.com','CEO',NULL),(2,'易佳','96E79218965','yijia@yahoo.com','HR',NULL),(3,'毛克麒','96E79218965','maokeqi@yahoo.com','CFO',NULL),(4,'陈启荣','96E79218965','chenqirong@163.com','HR',NULL),(5,'宁博','96E79218965','ningbo@qq.com','HR',NULL),(6,'汤姆','96E79218965','tom@126.com','CEO',NULL),(7,'杰克','96E79218965','jack@126.com','CFO',NULL),(8,'玛丽','96E79218965','mery@yahoo.com','HR',NULL),(9,'刘丽丽','96E79218965','liulili@qq.com','CEO',NULL),(10,'张三','96E79218965','zhangsan@qq.com','CFO',NULL);


