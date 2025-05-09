package com.taobao.securityjni;

import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent;
import com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SecBody {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ISecurityBodyComponent proxy;
    private IStaticDataStoreComponent staticDataStoreComp;

    static {
        t2o.a(421527568);
    }

    public SecBody(ContextWrapper contextWrapper) {
        SecurityGuardManager instance = SecurityGuardManager.getInstance(contextWrapper);
        if (instance != null) {
            this.proxy = instance.getSecurityBodyComp();
            this.staticDataStoreComp = instance.getStaticDataStoreComp();
        }
    }

    public String getSecBodyData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bae26da8", new Object[]{this, str});
        }
        if (this.proxy == null || str == null || str.length() <= 0) {
            return null;
        }
        String GetGlobalAppKey = GlobalInit.GetGlobalAppKey();
        if (GetGlobalAppKey == null) {
            GetGlobalAppKey = this.staticDataStoreComp.getAppKeyByIndex(0);
        }
        return this.proxy.getSecurityBodyData(str, GetGlobalAppKey);
    }
}
