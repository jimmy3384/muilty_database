package com.demo.database.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_last_visit")
public class UserLastVisitPo implements Serializable {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "last_visit_time")
    private Date lastVisitTime;

    @Column(name = "last_city")
    private String lastCity;

    @Column(name = "last_city_code")
    private Integer lastCityCode;

    @Column(name = "last_ip")
    private String lastIp;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "app_version")
    private String appVersion;

    @Column(name = "org_agent")
    private String orgAgent;

    private static final long serialVersionUID = 1L;

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return last_visit_time
     */
    public Date getLastVisitTime() {
        return lastVisitTime;
    }

    /**
     * @param lastVisitTime
     */
    public void setLastVisitTime(Date lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    /**
     * @return last_city
     */
    public String getLastCity() {
        return lastCity;
    }

    /**
     * @param lastCity
     */
    public void setLastCity(String lastCity) {
        this.lastCity = lastCity == null ? null : lastCity.trim();
    }

    /**
     * @return last_city_code
     */
    public Integer getLastCityCode() {
        return lastCityCode;
    }

    /**
     * @param lastCityCode
     */
    public void setLastCityCode(Integer lastCityCode) {
        this.lastCityCode = lastCityCode;
    }

    /**
     * @return last_ip
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * @param lastIp
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    /**
     * @return device_type
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    /**
     * @return app_version
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * @param appVersion
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    /**
     * @return org_agent
     */
    public String getOrgAgent() {
        return orgAgent;
    }

    /**
     * @param orgAgent
     */
    public void setOrgAgent(String orgAgent) {
        this.orgAgent = orgAgent == null ? null : orgAgent.trim();
    }
}