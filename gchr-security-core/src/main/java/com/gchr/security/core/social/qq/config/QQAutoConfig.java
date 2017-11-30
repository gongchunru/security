package com.gchr.security.core.social.qq.config;

import com.gchr.security.core.properties.QQProperties;
import com.gchr.security.core.properties.SecurityProperties;
import com.gchr.security.core.social.qq.connet.QQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.social.SocialAutoConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.ConnectionFactory;

/**
 * @author gongchunru
 * Date：2017/11/30.
 * Time：16:51
 * 如果 app-id 配置了值的时候，下面的内容才会生效
 */
@Configuration
@ConditionalOnProperty(prefix = "gchr.security.social.qq", name = "app-id")
public class QQAutoConfig extends SocialAutoConfigurerAdapter{

    @Autowired
    private SecurityProperties securityProperties;


    @Override
    protected ConnectionFactory<?> createConnectionFactory() {
        QQProperties qqConfig = securityProperties.getSocial().getQq();
        return new QQConnectionFactory(qqConfig.getProviderId(),qqConfig.getAppId(),qqConfig.getAppSecret());
    }
}
