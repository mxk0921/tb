package com.ali.user.open.session;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class InternalSession {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String autoLoginToken;
    public String avatarUrl;
    public String bindToken;
    public String deviceTokenKey;
    public String deviceTokenSalt;
    public String email;
    public long expireIn;
    public String[] externalCookies;
    public String loginId;
    public long loginTime;
    public String mobile;
    public String nick;
    public String openId;
    public String openSid;
    public Map<String, Object> otherInfo;
    public String sid;
    public String site;
    public String topAccessToken;
    public String topAuthCode;
    public String topExpireTime;
    public String userId;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("InternalSession [sid=");
        sb.append(this.sid);
        sb.append(", expireIn=");
        sb.append(this.expireIn);
        sb.append(", loginTime=");
        sb.append(this.loginTime);
        sb.append(", autoLoginToken=");
        sb.append(this.autoLoginToken);
        sb.append(",topAccessToken=");
        sb.append(this.topAccessToken);
        sb.append(",topAuthCode");
        sb.append(this.topAuthCode);
        sb.append(",topExpireTime");
        sb.append(this.topExpireTime);
        sb.append(", otherInfo=");
        sb.append(this.otherInfo);
        sb.append(", cookies=");
        String[] strArr = this.externalCookies;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
            }
        } else {
            sb.append("null");
        }
        sb.append("]");
        return sb.toString();
    }
}
