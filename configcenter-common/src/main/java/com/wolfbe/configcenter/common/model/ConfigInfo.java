package com.wolfbe.configcenter.common.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "config_info")
public class ConfigInfo {
    /**
     * 组名,grp+key作为主键
     */
    @Id
    private String gname;

    /**
     * 配置项键，grp+key作为主键
     */
    @Id
    private String ckey;

    /**
     * 版本号
     */
    private Integer version;

    @Column(name = "commit_time")
    private Date commitTime;

    /**
     * 配置项的值
     */
    private String cval;

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