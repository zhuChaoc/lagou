

CREATE TABLE `user_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginerid` int(11) NOT NULL,
  `menuid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

/*Data for the table `user_menu` */

insert  into `user_menu`(`id`,`loginerid`,`menuid`) values (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,2,1),(7,2,2),(8,2,3),(9,2,4),(10,2,5),(11,3,1),(12,3,2),(13,3,3),(14,3,4),(15,3,5),(16,4,1),(17,4,2),(18,4,3),(19,4,4),(20,4,5),(21,5,1),(22,5,2),(23,5,3),(24,5,4),(25,5,5),(26,6,1),(27,6,2),(28,6,3),(29,6,4),(30,6,5),(31,7,1),(32,7,2),(33,7,3),(34,7,4),(35,7,5),(36,8,1),(37,8,2),(38,8,3),(39,8,4),(40,8,5),(41,9,1),(42,9,2),(43,9,3),(44,9,4),(45,9,5),(46,10,1),(47,10,2),(48,10,3),(49,10,4),(50,10,5);