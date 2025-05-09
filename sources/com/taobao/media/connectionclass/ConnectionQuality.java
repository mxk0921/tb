package com.taobao.media.connectionclass;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum ConnectionQuality {
    POOR,
    MODERATE,
    GOOD,
    EXCELLENT,
    UNKNOWN;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ConnectionQuality connectionQuality, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/media/connectionclass/ConnectionQuality");
    }

    public static ConnectionQuality valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectionQuality) ipChange.ipc$dispatch("9522e03e", new Object[]{str});
        }
        return (ConnectionQuality) Enum.valueOf(ConnectionQuality.class, str);
    }
}
