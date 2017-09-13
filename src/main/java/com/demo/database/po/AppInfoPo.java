package com.demo.database.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "app_info")
public class AppInfoPo implements Serializable {
    @Id
    @Column(name = "app_key")
    private String appKey;

    @Column(name = "app_secret")
    private String appSecret;

    private Date time;

    private static final long serialVersionUID = 1L;

    /**
     * @return app_key
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * @param appKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    /**
     * @return app_secret
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * @param appSecret
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    /**
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
    }
}