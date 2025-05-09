package com.taobao.message.sp.framework.model;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleProfile extends SimpleBaseProfile implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AVATARURL = "avatarURL";
    public static final String KEY_BIRTH = "birth";
    public static final String KEY_DISPLAYNAME = "displayName";
    public static final String KEY_EXTINFO = "extInfo";
    public static final String KEY_GENDER = "gender";
    public static final String KEY_MODIFY_TIME = "modifyTime";
    public static final String KEY_NICK = "nick";
    public static final String KEY_SIGNATURE = "signature";
    private long birth;
    private String bizType = "";
    private String gender;
    private String nick;
    private String signature;

    static {
        t2o.a(552599680);
    }

    public static String decryptBySecurityGuard(Context context, String str) {
        SecurityGuardManager instance;
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3f47236", new Object[]{context, str});
        }
        if (TextUtils.isEmpty(str) || (instance = SecurityGuardManager.getInstance(context)) == null || (staticDataEncryptComp = instance.getStaticDataEncryptComp()) == null) {
            return str;
        }
        String staticSafeDecrypt = staticDataEncryptComp.staticSafeDecrypt(16, "tbwangwang_security1", str);
        if (staticSafeDecrypt != null) {
            return staticSafeDecrypt;
        }
        Log.e("encryptBySecurityGuard", "decryptBySecurityGuard error, result is null, will return '' ");
        return "";
    }

    public static /* synthetic */ Object ipc$super(SimpleProfile simpleProfile, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/framework/model/SimpleProfile");
    }

    public Object clone() {
        SimpleProfile simpleProfile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        try {
            simpleProfile = (SimpleProfile) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            simpleProfile = null;
        }
        if (simpleProfile != null) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(hashMap);
            simpleProfile.setExtInfo(hashMap);
        }
        return simpleProfile;
    }

    public long getBirth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b742f304", new Object[]{this})).longValue();
        }
        return this.birth;
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.bizType;
    }

    public String getGender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72b5a1a2", new Object[]{this});
        }
        return this.gender;
    }

    public String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return this.nick;
    }

    public String getSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this});
        }
        return this.signature;
    }

    public void setBirth(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f4033c0", new Object[]{this, new Long(j)});
        } else {
            this.birth = j;
        }
    }

    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.bizType = str;
        }
    }

    public void setGender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a88014", new Object[]{this, str});
        } else {
            this.gender = str;
        }
    }

    public void setNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04e97b6", new Object[]{this, str});
        } else {
            this.nick = str;
        }
    }

    public void setSignature(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e32887", new Object[]{this, str});
        } else {
            this.signature = str;
        }
    }

    @Override // com.taobao.message.sp.framework.model.SimpleBaseProfile
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Profile{nick='" + this.nick + "', signature='" + this.signature + "', gender='" + this.gender + "', birth=" + this.birth + ", bizType='" + this.bizType + "', target='" + this.target.toString() + "', displayName='" + this.displayName + "', avatarURL='" + this.avatarURL + "', modifyTime=" + this.modifyTime + ", serverTime=" + this.serverTime + '}';
    }
}
