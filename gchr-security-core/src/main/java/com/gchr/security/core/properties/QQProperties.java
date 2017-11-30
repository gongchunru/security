package com.gchr.security.core.properties;

import org.springframework.boot.autoconfigure.social.SocialProperties;

/**
 * @author gongchunru
 * Date：2017/11/30.
 * Time：16:48
 */
public class QQProperties extends SocialProperties {


    private String providerId = "qq";

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

}
