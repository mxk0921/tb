package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexInstanceMode {
    DOM,
    MUS,
    XR,
    CANAL,
    SCRIPT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WeexInstanceMode weexInstanceMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexInstanceMode");
    }

    public static WeexInstanceMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstanceMode) ipChange.ipc$dispatch("4aeac1f8", new Object[]{str});
        }
        return (WeexInstanceMode) Enum.valueOf(WeexInstanceMode.class, str);
    }
}
