package com.wolfbe.configcenter.common.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "config_log")
public class ConfigLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 日志类型，1：正常发布，2：灰度测试发布
     */
    @Column(name = "log_type")
    private Integer logType;

    /**
     * 组名,grp+key作为主键
     */
    private String gname;

    /**
     * 配置项键，grp+key作为主键
     */
    private String ckey;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * ip白名单
     */
    private String ipallow;

    /**
     * 组白名单
     */
    private String grpallow;

    @Column(name = "commit_time")
    private Date commitTime;

    /**
     * 操作类型,1:add,2:update,3:delete
     */
    private Integer op;

    /**
     * 配置项的值
     */
    private String cval;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取日志类型，1：正常发布，2：灰度测试发布
     *
     * @return log_type - 日志类型，1：正常发布，2：灰度测试发布
     */
    public Integer getLogType() {
        return logType;
    }

    /**
     * 设置日志类型，1：正常发布，2：灰度测试发布
     *
     * @param logType 日志类型，1：正常发布，2：灰度测试发布
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /**
     * 获取组名,grp+key作为主键
     *
     * @return gname - 组名,grp+key作为主键
     */
    public String getGname() {
        return gname;
    }

    /**
     * 设置组名,grp+key作为主键
     *
     * @param gname 组名,grp+key作为主键
     */
    public void setGname(String gname) {
        this.gname = gname;
    }

    /**
     * 获取配置项键，grp+key作为主键
     *
     * @return ckey - 配置项键，grp+key作为主键
     */
    public String getCkey() {
        return ckey;
    }

    /**
     * 设置配置项键，grp+key作为主键
     *
     * @param ckey 配置项键，grp+key作为主键
     */
    public void setCkey(String ckey) {
        this.ckey = ckey;
    }

    /**
     * 获取版本号
     *
     * @return version - 版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取ip白名单
     *
     * @return ipallow - ip白名单
     */
    public String getIpallow() {
        return ipallow;
    }

    /**
     * 设置ip白名单
     *
     * @param ipallow ip白名单
     */
    public void setIpallow(String ipallow) {
        this.ipallow = ipallow;
    }

    /**
     * 获取组白名单
     *
     * @return grpallow - 组白名单
     */
    public String getGrpallow() {
        return grpallow;
    }

    /**
     * 设置组白名单
     *
     * @param grpallow 组白名单
     */
    public void setGrpallow(String grpallow) {
        this.grpallow = grpallow;
    }

    /**
     * @return commit_time
     */
    public Date getCommitTime() {
        return commitTime;
    }

    /**
     * @param commitTime
     */
    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * 获取操作类型,1:add,2:update,3:delete
     *
     * @return op - 操作类型,1:add,2:update,3:delete
     */
    public Integer getOp() {
        return op;
    }

    /**
     * 设置操作类型,1:add,2:update,3:delete
     *
     * @param op 操作类型,1:add,2:update,3:delete
     */
    public void setOp(Integer op) {
        this.op = op;
    }

    /**
     * 获取配置项的值
     *
     * @return cval - 配置项的值
     */
    public String getCval() {
        return cval;
    }

    /**
     * 设置配置项的值
     *
     * @param cval 配置项的值
     */
    public void setCval(String cval) {
        this.cval = cval;
    }
}