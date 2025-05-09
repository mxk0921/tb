package com.taobao.android.weex.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexDarkMode {
    LIGHT,
    DARK;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WeexDarkMode weexDarkMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/config/WeexDarkMode");
    }

    public static WeexDarkMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexDarkMode) ipChange.ipc$dispatch("9edd70fe", new Object[]{str});
        }
        return (WeexDarkMode) Enum.valueOf(WeexDarkMode.class, str);
    }
}
