package com.sina.weibo.sdk.auth;

import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.b.c;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Oauth2AccessToken {
    protected static final String KEY_ACCESS_TOKEN = "access_token";
    protected static final String KEY_EXPIRES_IN = "expires_in";
    protected static final String KEY_REFRESH_TOKEN = "refresh_token";
    protected static final String KEY_SCREEN_NAME = "userName";
    protected static final String KEY_UID = "uid";
    private String mAccessToken;
    private long mExpiresTime;
    private String mRefreshToken;
    private String mScreenName;
    private String mUid;

    static {
        t2o.a(988807205);
    }

    public static Oauth2AccessToken parseAccessToken(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
            oauth2AccessToken.setUid(bundle.getString("uid"));
            oauth2AccessToken.setScreenName(bundle.getString("userName"));
            oauth2AccessToken.setAccessToken(bundle.getString(KEY_ACCESS_TOKEN));
            oauth2AccessToken.setRefreshToken(bundle.getString(KEY_REFRESH_TOKEN));
            try {
                oauth2AccessToken.setExpiresTime(Long.parseLong(bundle.getString(KEY_EXPIRES_IN)) * 1000);
            } catch (Exception e) {
                c.b("Oauth2AccessToken expires parse error: ", e.getMessage());
            }
            return oauth2AccessToken;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public long getExpiresTime() {
        return this.mExpiresTime;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getScreenName() {
        return this.mScreenName;
    }

    public String getUid() {
        return this.mUid;
    }

    public boolean isSessionValid() {
        if (TextUtils.isEmpty(this.mAccessToken) || this.mExpiresTime <= 0) {
            return false;
        }
        return true;
    }

    public void setAccessToken(String str) {
        this.mAccessToken = str;
    }

    public void setExpiresTime(long j) {
        this.mExpiresTime = j;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public void setScreenName(String str) {
        this.mScreenName = str;
    }

    public void setUid(String str) {
        this.mUid = str;
    }

    public static Oauth2AccessToken parseAccessToken(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
            oauth2AccessToken.setUid(jSONObject.optString("uid"));
            oauth2AccessToken.setScreenName(jSONObject.optString("userName"));
            oauth2AccessToken.setAccessToken(jSONObject.optString(KEY_ACCESS_TOKEN));
            try {
                oauth2AccessToken.setExpiresTime(Long.parseLong(jSONObject.getString(KEY_EXPIRES_IN)) * 1000);
            } catch (Exception e) {
                c.b("Oauth2AccessToken expires parse error: ", e.getMessage());
            }
            oauth2AccessToken.setRefreshToken(jSONObject.optString(KEY_REFRESH_TOKEN));
            return oauth2AccessToken;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
