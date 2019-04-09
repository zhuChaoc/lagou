/*
Navicat MySQL Data Transfer

Source Server         : employee
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : employee

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-04-09 13:53:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `etjob`
-- ----------------------------
DROP TABLE IF EXISTS `etjob`;
CREATE TABLE `etjob` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) NOT NULL,
  `jobType` varchar(255) NOT NULL,
  `expectJob` varchar(255) NOT NULL,
  `expectSal` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of etjob
-- ----------------------------

-- ----------------------------
-- Table structure for `resume`
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume` (
  `REID` int(5) NOT NULL,
  `RNAME` varchar(30) DEFAULT NULL,
  `ALTERTIME` datetime DEFAULT NULL,
  `MYDESCRIBE` varchar(1000) DEFAULT NULL,
  `JID` int(8) NOT NULL,
  `wsid` int(11) DEFAULT NULL,
  `wrid` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `eid` int(11) DEFAULT NULL,
  PRIMARY KEY (`REID`),
  KEY `FK_JID` (`JID`),
  KEY `resume_work_show_wsid_fk` (`wsid`),
  KEY `resume_edu_record_eid_fk` (`eid`),
  KEY `resume_project_record_pid_fk` (`pid`),
  KEY `resume_work_record_wid_fk` (`wrid`),
  CONSTRAINT `FK_JID` FOREIGN KEY (`JID`) REFERENCES `jobseeker` (`JID`),
  CONSTRAINT `resume_edu_record_eid_fk` FOREIGN KEY (`eid`) REFERENCES `edu_record` (`eid`),
  CONSTRAINT `resume_project_record_pid_fk` FOREIGN KEY (`pid`) REFERENCES `project_record` (`pid`),
  CONSTRAINT `resume_work_record_wid_fk` FOREIGN KEY (`wrid`) REFERENCES `work_record` (`wid`),
  CONSTRAINT `resume_work_show_wsid_fk` FOREIGN KEY (`wsid`) REFERENCES `work_show` (`wsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resume
-- ----------------------------
INSERT INTO `resume` VALUES ('1', 'YMX', '2019-04-03 08:02:03', null, '1', null, null, null, null);
