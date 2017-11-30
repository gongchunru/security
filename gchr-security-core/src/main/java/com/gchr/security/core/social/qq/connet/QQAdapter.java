package com.gchr.security.core.social.qq.connet;

import com.gchr.security.core.social.qq.api.QQ;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;

/**
 * @author gongchunru
 * Date：2017/11/30.
 * Time：16:42
 */
public class QQAdapter implements ApiAdapter<QQ> {
    @Override
    public boolean test(QQ api) {
        return false;
    }

    @Override
    public void setConnectionValues(QQ api, ConnectionValues values) {

    }

    @Override
    public UserProfile fetchUserProfile(QQ api) {
        return null;
    }

    @Override
    public void updateStatus(QQ api, String message) {

    }
}
