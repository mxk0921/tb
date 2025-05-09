package com.taobao.android.behavir.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum BHRTaskConfigType {
    kBHRTaskConfigTypeUndefined,
    kBHRTaskConfigTypeBR,
    kBHRTaskConfigTypeUT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(BHRTaskConfigType bHRTaskConfigType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/config/BHRTaskConfigType");
    }

    public static BHRTaskConfigType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRTaskConfigType) ipChange.ipc$dispatch("766a79ab", new Object[]{str});
        }
        return (BHRTaskConfigType) Enum.valueOf(BHRTaskConfigType.class, str);
    }
}
