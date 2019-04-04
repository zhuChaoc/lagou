
CREATE TABLE `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpname` varchar(50) NOT NULL,
  `cpphone` varchar(20) NOT NULL,
  `cpemail` varchar(45) NOT NULL,
  `cpshort` varchar(50) DEFAULT NULL,
  `cplogo` varchar(50) DEFAULT NULL,
  `cplicense` varchar(50) DEFAULT NULL,
  `cpurl` varchar(45) DEFAULT NULL,
  `cpcity` varchar(20) DEFAULT NULL,
  `cparea` varchar(50) DEFAULT NULL,
  `cpsize` varchar(20) DEFAULT NULL,
  `cpdevelop` varchar(20) DEFAULT NULL,
  `cpinvestor` varchar(50) DEFAULT NULL,
  `cpshortinfo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('1', '沃尔玛（WALMART)', '17678436857', '12312312@qq.com', 'WMT', '1.png', '101.png', 'www.walmart.com', '美国阿肯色州本顿维尔', '连锁零售商', '99999', '上市公司', '彦祖基金', '沃尔玛百货有限公司，即沃尔玛公司（WalMart Inc.）（NYSE：WMT），是一家美国的世界性连锁企业，以营业额计算为全球最大的公司，其控股人为沃尔顿家族。总部位于美国阿肯色州的本顿维尔。沃尔玛主要涉足零售业，是世界上雇员最多的企业，连续5年在美国《财富》杂志世界500强企业中居首位。');
INSERT INTO `company` VALUES ('2', '国家电网公司（STATE GRID)', '16746374633', '2131232@163.com', 'SGCC', '2.png', '102.png', 'www.sgcc.com.cn', '北京市西城区西长安街86号', '投资建设运营电网', '99999', '上市公司', '希望基金', '国家电网有限公司成立于2002年12月29日，是根据《公司法》规定设立的中央直接管理的国有独资公司，是关系国民经济命脉和国家能源安全的特大型国有重点骨干企业。公司以投资建设运营电网为核心业务，承担着保障安全、经济、清洁、可持续电力供应的基本使命。');
INSERT INTO `company` VALUES ('3', '中国石油化工集团公司（SINOPEC GROUP)', '17637823455', '2323@qq.com', 'SY', '3.png', '103.png', 'www.sinopec.com', '北京', '石油贸易、石油开发与化工等', '810,538', '上市公司', '可可投资', '中国石油化工集团有限公司（英文缩写Sinopec Group）是1998年7月国家在原中国石油化工总公司基础上重组成立的特大型石油石化企业集团，是国家独资设立的国有公司、国家授权投资的机构和国家控股公司。公司注册资本2316亿元，董事长为法定代表人，总部设在北京。');
INSERT INTO `company` VALUES ('4', '中国石油天然气集团公司（CHINA NATIONAL PETROLEUM)', '18764583645', '123@163.com', 'CNPC', '4.png', '104.png', 'www.cnpc.com.cn', '北京', '油气业务、工程技术服务、石油工程建设等', '1589508（2016年）', '上市公司', '柯柯基金', '中国石油天然气集团有限公司（英文缩写China National Petroleum Corporation，中文简称“中国石油”或“中石油”）是国有重要骨干企业， [1]  是以油气业务、工程技术服务、石油工程建设、石油装备制造、金融服务、新能源开发等为主营业务的综合性国际能源公司，是中国主要的油气生产商和供应商之一。');
INSERT INTO `company` VALUES ('5', '荷兰皇家壳牌石油公司（ROYAL DUTCH SHELL)', '16736476574', '987@qq.com', 'HLSY', '5.png', '105.png', 'www.shell.com', '荷兰海牙、英国伦敦', '炼油，化学', '90000', '上市公司', '晨晨投资', '荷兰皇家壳牌集团（Royal Dutch /Shell Group of Companies），又译“蚬壳”，是目前世界第一大石油公司，总部位于荷兰海牙和英国伦敦，由荷兰皇家石油与英国的壳牌两家公司合并组成。');
INSERT INTO `company` VALUES ('6', '丰田汽车公司（TOYOTA MOTOR)', '17634757474', '555@qq.com', 'FT', '6.png', '106.png', 'www.toyota-global.com', '日本爱知县丰田市和东京都文京区', '汽车,钢铁,电子,化工等', '348,877', '上市公司', '尘尘基金', '丰田汽车公司（Toyota Motor Corporation），是一家总部设在日本爱知县丰田市和东京都文京区的著名汽车制造公司，隶属于日本三井财阀。');
INSERT INTO `company` VALUES ('7', '大众公司（VOLKSWAGEN)', '18736475433', '444@163.com', 'VW', '7.png', '107.png', 'www.volkswagenag.com', '德国沃尔夫斯堡', '汽车制造', '99999', '上市公司', '朦朦基金', '大众汽车（德语：Volkswagen），台湾译为福斯汽车，港澳译为福士汽车，马新译为大众汽车，Volks在德语中意思为“国民”，意思是“国民的汽车”，又常简称为“VW”。大众汽车是一家总部位于德国沃尔夫斯堡的汽车制造公司，它也是世界四大汽车生产商之一的大众集团的核心企业。2009年5月7日，在经过长达4年之久的收购大战之后，保时捷和大众的控股家族于本周三达成了初步协议。这两家公司将合二为一，打造出一家拥有10大品牌的欧洲最大汽车制造商。');
INSERT INTO `company` VALUES ('8', '英国石油公司（BP)', '16748344544', '333@qq.com', 'BP', '8.png', '108.png', 'www.bp.com', '英国伦敦', '石油公司', '79,800', '上市公司', '萌萌投资', '909年BP由威廉·诺克斯·达西创立，最初的名字为Anglo Persian石油公司，1935年改为英（国）伊（朗）石油公司，1954年改为现名。1973年,BP中国成立。BP由前英国石油、阿莫科、阿科和嘉实多等公司整合重组形成，是世界上最大的石油和石化集团公司之一。BP的太阳花标志是根据古希腊的太阳神命名的。');
INSERT INTO `company` VALUES ('9', '埃克森美孚（EXXON MOBIL)', '17263748333', '222@163.com', 'IKS', '9.png', '109.png', 'www.exxonmobil.com', '美国德克萨斯州爱文市', '石油天然气', '8.6万', '上市公司', '希望投资', '埃克森美孚公司（Exxon Mobil Corporation），是世界最大的非政府石油天然气生产商，总部设在美国德克萨斯州爱文市。在全球拥有生产设施和销售产品，在六大洲从事石油天然气勘探业务；在能源和石化领域的诸多方面位居行业领先地位。');
INSERT INTO `company` VALUES ('10', '伯克希尔－哈撒韦公司（BERKSHIRE HATHAWAY)', '18734565433', '111@qq.com', 'BKXR', '10.png', '110.png', 'www.berkshirehathaway.com', '美国', '主营保险业务', '99999', '上市公司', '彦祖投资', '伯克希尔·哈撒韦公司（Berkshire Hathaway Incorporation），是美国一家世界著名的保险和多元化投资集团，总部在美国。该公司主要通过国民保障公司和GEICO以及再保险巨头通用科隆再保险公司等附属机构从事财产/伤亡保险、再保险业务。');
