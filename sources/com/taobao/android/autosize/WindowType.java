package com.taobao.android.autosize;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum WindowType {
    MIN,
    SMALL,
    MEDIUM,
    LARGE,
    MAX;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WindowType windowType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/autosize/WindowType");
    }

    public static WindowType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowType) ipChange.ipc$dispatch("e397c576", new Object[]{str});
        }
        return (WindowType) Enum.valueOf(WindowType.class, str);
    }
}
