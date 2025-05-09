package com.taobao.android.weex_framework.adapter;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum MUSImageQuality {
    LOW,
    NORMAL,
    HIGH,
    ORIGINAL,
    AUTO;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MUSImageQuality mUSImageQuality, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/adapter/MUSImageQuality");
    }

    public static MUSImageQuality valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSImageQuality) ipChange.ipc$dispatch("14afaf17", new Object[]{str});
        }
        return (MUSImageQuality) Enum.valueOf(MUSImageQuality.class, str);
    }
}
