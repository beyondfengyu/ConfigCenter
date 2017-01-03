/*
Navicat MySQL Data Transfer

Source Server         : horselocal
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : config

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-01-03 17:43:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for config_group
-- ----------------------------
DROP TABLE IF EXISTS `config_group`;
CREATE TABLE `config_group` (
  `gname` varchar(255) NOT NULL COMMENT '组名',
  `gpswd` varchar(255) NOT NULL COMMENT '密码',
  `create_uid` bigint(20) DEFAULT NULL COMMENT '拥有者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`gname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_group
-- ----------------------------

-- ----------------------------
-- Table structure for config_history
-- ----------------------------
DROP TABLE IF EXISTS `config_history`;
CREATE TABLE `config_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gname` varchar(255) NOT NULL COMMENT '组名,grp+key作为主键',
  `ckey` varchar(255) NOT NULL COMMENT '配置项键，grp+key作为主键',
  `cval` text NOT NULL COMMENT '配置项的值',
  `version` int(11) DEFAULT NULL COMMENT '版本号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='记录key-value对的正式发布历史信息，供查阅和回滚; \r\n';

-- ----------------------------
-- Records of config_history
-- ----------------------------

-- ----------------------------
-- Table structure for config_info
-- ----------------------------
DROP TABLE IF EXISTS `config_info`;
CREATE TABLE `config_info` (
  `gname` varchar(255) NOT NULL COMMENT '组名,grp+key作为主键',
  `ckey` varchar(255) NOT NULL COMMENT '配置项键，grp+key作为主键',
  `cval` text NOT NULL COMMENT '配置项的值',
  `version` int(11) DEFAULT NULL COMMENT '版本号',
  `commit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`gname`,`ckey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='正常发布的配置key-value信息；\r\n';

-- ----------------------------
-- Records of config_info
-- ----------------------------

-- ----------------------------
-- Table structure for config_log
-- ----------------------------
DROP TABLE IF EXISTS `config_log`;
CREATE TABLE `config_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `log_type` int(6) NOT NULL DEFAULT '0' COMMENT '日志类型，1：正常发布，2：灰度测试发布',
  `gname` varchar(255) NOT NULL COMMENT '组名,grp+key作为主键',
  `ckey` varchar(255) NOT NULL COMMENT '配置项键，grp+key作为主键',
  `cval` text NOT NULL COMMENT '配置项的值',
  `version` int(11) DEFAULT NULL COMMENT '版本号',
  `ipallow` varchar(255) DEFAULT NULL COMMENT 'ip白名单',
  `grpallow` varchar(255) DEFAULT NULL COMMENT '组白名单',
  `commit_time` datetime DEFAULT NULL,
  `op` int(6) DEFAULT NULL COMMENT '操作类型,1:add,2:update,3:delete',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='正式发布/测试发布的配置key-value信息的add/update/delete操作，都会记录下一条日志，供同步；\r\n';

-- ----------------------------
-- Records of config_log
-- ----------------------------

-- ----------------------------
-- Table structure for config_test
-- ----------------------------
DROP TABLE IF EXISTS `config_test`;
CREATE TABLE `config_test` (
  `gname` varchar(255) NOT NULL COMMENT '组名,grp+key作为主键',
  `ckey` varchar(255) NOT NULL COMMENT '配置项键，grp+key作为主键',
  `cval` text NOT NULL COMMENT '配置项的值',
  `version` int(11) DEFAULT NULL COMMENT '版本号',
  `ipallow` varchar(255) DEFAULT NULL COMMENT 'ip白名单',
  `grpallow` varchar(255) DEFAULT NULL COMMENT '组白名单',
  `commit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`gname`,`ckey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='灰度测试发布的配置key-value信息；\r\n';

-- ----------------------------
-- Records of config_test
-- ----------------------------
