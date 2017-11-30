package com.gchr.security.core.social.qq.connet;

import com.gchr.security.core.social.qq.api.QQ;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

/**
 * @author gongchunru
 * Date：2017/11/30.
 * Time：16:56
 */
public class QQConnectionFactory extends OAuth2ConnectionFactory<QQ>{

    public QQConnectionFactory(String providerId, String appId, String appSecret) {
        super(providerId, new QQServiceProvider(appId,appSecret), new QQAdapter());
    }
}
