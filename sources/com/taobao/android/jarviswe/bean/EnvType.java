package com.taobao.android.jarviswe.bean;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum EnvType {
    ONLINE,
    PRE,
    DAILY;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(EnvType envType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/jarviswe/bean/EnvType");
    }

    public static EnvType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnvType) ipChange.ipc$dispatch("d9e4375b", new Object[]{str});
        }
        return (EnvType) Enum.valueOf(EnvType.class, str);
    }
}
