package com.taobao.android.remoteso.status;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum RSoStatus {
    INITIALIZED,
    LOADING,
    LOADED_IN_MEMORY,
    LOAD_FAILED,
    FETCHING,
    FETCHED,
    FETCH_FAILED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(RSoStatus rSoStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/status/RSoStatus");
    }

    public static RSoStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoStatus) ipChange.ipc$dispatch("f589ccaf", new Object[]{str});
        }
        return (RSoStatus) Enum.valueOf(RSoStatus.class, str);
    }
}
