package com.wolfbe.configcenter.common.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "config_group")
public class ConfigGroup {
    /**
     * 组名
     */
    @Id
    private String gname;

    /**
     * 密码
     */
    private String gpswd;

    /**
     * 拥有者
     */
    @Column(name = "create_uid")
    private Long createUid;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取组名
     *
     * @return gname - 组名
     */
    public String getGname() {
        return gname;
    }

    /**
     * 设置组名
     *
     * @param gname 组名
     */
    public void setGname(String gname) {
        this.gname = gname;
    }

    /**
     * 获取密码
     *
     * @return gpswd - 密码
     */
    public String getGpswd() {
        return gpswd;
    }

    /**
     * 设置密码
     *
     * @param gpswd 密码
     */
    public void setGpswd(String gpswd) {
        this.gpswd = gpswd;
    }

    /**
     * 获取拥有者
     *
     * @return create_uid - 拥有者
     */
    public Long getCreateUid() {
        return createUid;
    }

    /**
     * 设置拥有者
     *
     * @param createUid 拥有者
     */
    public void setCreateUid(Long createUid) {
        this.createUid = createUid;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}