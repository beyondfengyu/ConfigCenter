package com.wolfbe.configcenter.common.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "config_history")
public class ConfigHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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