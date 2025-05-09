package com.taobao.tao.topmultitab.service.performance.basic;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum ScreenPosition {
    CENTER,
    EDGE,
    OUTSIDE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ScreenPosition screenPosition, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/performance/basic/ScreenPosition");
    }

    public static ScreenPosition valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenPosition) ipChange.ipc$dispatch("a21169dd", new Object[]{str});
        }
        return (ScreenPosition) Enum.valueOf(ScreenPosition.class, str);
    }
}
