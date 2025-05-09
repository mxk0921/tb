package com.ut.mini;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum UTPageStatus {
    UT_H5_IN_WebView,
    UT_PV_WITH_ROUTER_INDEX;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UTPageStatus uTPageStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/UTPageStatus");
    }

    public static UTPageStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTPageStatus) ipChange.ipc$dispatch("ca49d7b6", new Object[]{str});
        }
        return (UTPageStatus) Enum.valueOf(UTPageStatus.class, str);
    }
}
