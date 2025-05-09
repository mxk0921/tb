package com.taobao.alimama.services;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.sih;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LoginInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "nickname")
    public String nickname;
    @JSONField(name = "user_id")
    public String userId;

    static {
        t2o.a(1018167385);
    }

    public static LoginInfo from(sih sihVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginInfo) ipChange.ipc$dispatch("a4ec6bba", new Object[]{sihVar});
        }
        LoginInfo loginInfo = new LoginInfo();
        if (sihVar != null) {
            loginInfo.nickname = sihVar.c;
            loginInfo.userId = sihVar.b;
        }
        return loginInfo;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) obj;
        if (!TextUtils.equals(loginInfo.nickname, this.nickname) || !TextUtils.equals(loginInfo.userId, this.userId)) {
            return false;
        }
        return true;
    }

    @JSONField(serialize = false)
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.userId) || TextUtils.isEmpty(this.nickname)) {
            return false;
        }
        return true;
    }
}
