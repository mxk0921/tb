package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexInstanceStatus {
    NOT_INITED,
    INITED,
    RENDERED,
    INVALID,
    DESTROYED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WeexInstanceStatus weexInstanceStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceStatus");
    }

    public static void preloadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    public static WeexInstanceStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceStatus) ipChange.ipc$dispatch("810d3589", new Object[]{str});
        }
        return (WeexInstanceStatus) Enum.valueOf(WeexInstanceStatus.class, str);
    }
}
