package com.alipay.mobile.verifyidentity.log;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerifyBehavor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f4301a;
    public final Map<String, String> b = new HashMap();

    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return this.b;
    }

    public String getParam1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b57edaff", new Object[]{this});
        }
        return null;
    }

    public String getParam2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c04959e", new Object[]{this});
        }
        return null;
    }

    public String getParam3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c28a503d", new Object[]{this});
        }
        return null;
    }

    public String getUserCaseID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d90d568d", new Object[]{this});
        }
        return this.f4301a;
    }

    @Deprecated
    public void setAppID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531292cb", new Object[]{this, str});
        }
    }

    public void setUserCaseID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf870289", new Object[]{this, str});
        } else {
            this.f4301a = str;
        }
    }
}
