package com.taobao.tao.navigation;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum NavigationTabIconSourceType {
    DRAWABLE,
    DRAWABLE2,
    LOCALCACHEDDRAWABLE,
    URL;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(NavigationTabIconSourceType navigationTabIconSourceType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/navigation/NavigationTabIconSourceType");
    }

    public static NavigationTabIconSourceType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabIconSourceType) ipChange.ipc$dispatch("d935cab6", new Object[]{str});
        }
        return (NavigationTabIconSourceType) Enum.valueOf(NavigationTabIconSourceType.class, str);
    }
}
