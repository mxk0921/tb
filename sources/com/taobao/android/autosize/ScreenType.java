package com.taobao.android.autosize;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum ScreenType {
    MIN,
    SMALL,
    MEDIUM,
    LARGE,
    MAX;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ScreenType screenType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/autosize/ScreenType");
    }

    public static ScreenType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("6ee54e7a", new Object[]{str});
        }
        return (ScreenType) Enum.valueOf(ScreenType.class, str);
    }
}
