package com.ut.secbody;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.securityjni.GlobalInit;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SecurityMatrix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(421527587);
    }

    public static boolean dataReceive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d8fe9ae", new Object[]{str})).booleanValue();
        }
        ISecurityBodyComponent securityBodyComp = SecurityGuardManager.getInstance(GlobalInit.getGlobalContext()).getSecurityBodyComp();
        if (securityBodyComp != null) {
            return securityBodyComp.putUserTrackRecord(str);
        }
        return false;
    }
}
