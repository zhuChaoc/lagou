create table lagou.cpproduct
(
  id           int auto_increment
    primary key,
  cpid			int							not null,  
  Productname  varchar(20)                  not null,
  Producturl   varchar(50)                  not null,
  Productinfo  varchar(500)                 not null,
  productphoto varchar(50) collate utf8_bin not null
);
INSERT INTO lagou.cpproduct (id, cpid,Productname, Producturl, Productinfo, productphoto) VALUES (1, 1,'创赢智能', 'https://www.duba.com', '选择这种产品一定会好', '1.jpg');
INSERT INTO lagou.cpproduct (id,cpid, Productname, Producturl, Productinfo, productphoto) VALUES (2,2, '新达共创', 'https://www.duba.com', '选择这种产品一定会好', '2.jpg');
INSERT INTO lagou.cpproduct (id, cpid,Productname, Producturl, Productinfo, productphoto) VALUES (3, 3,'芭缇雅', 'https://www.duba.com', '选择这种产品一定会好', '3.jpg');
INSERT INTO lagou.cpproduct (id,cpid, Productname, Producturl, Productinfo, productphoto) VALUES (4, 4,'天魅', 'https://www.duba.com', '选择这种产品一定会好', '4.jpg');
INSERT INTO lagou.cpproduct (id,cpid, Productname, Producturl, Productinfo, productphoto) VALUES (5, 5,'黛萌', 'https://www.duba.com', '选择这种产品一定会好', '5.jpg');
INSERT INTO lagou.cpproduct (id,cpid, Productname, Producturl, Productinfo, productphoto) VALUES (6, 6,'可怩卡莱', 'https://www.duba.com', '选择这种产品一定会好', '6.jpg');
INSERT INTO lagou.cpproduct (id,cpid, Productname, Producturl, Productinfo, productphoto) VALUES (7, 7,'贝诗', 'https://www.duba.com', '选择这种产品一定会好', '7.jpg');
INSERT INTO lagou.cpproduct (id,cpid, Productname, Producturl, Productinfo, productphoto) VALUES (8, 8,'光迅', 'https://www.duba.com', '选择这种产品一定会好', '8.jpg');
INSERT INTO lagou.cpproduct (id,cpid,Productname, Producturl, Productinfo, productphoto) VALUES (9, 9,'生益', 'https://www.duba.com', '选择这种产品一定会好', '9.jpg');
INSERT INTO lagou.cpproduct (id,cpid,Productname, Producturl, Productinfo, productphoto) VALUES (10, 10,'斯维尔', 'https://www.duba.com', '选择这种产品一定会好', '10.jpg');

select * from lagou.cpproduct;