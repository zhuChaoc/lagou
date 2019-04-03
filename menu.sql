

CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `linkurl` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `menu` */

insert  into `menu`(`id`,`name`,`linkurl`) values (1,'首页','index.html'),(2,'公司','companylist.html'),(3,'论坛','forum.html'),(4,'简历管理','jianli.html'),(5,'发布职位','create.html');

