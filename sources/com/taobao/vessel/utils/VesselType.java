package com.taobao.vessel.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum VesselType {
    Weex(1),
    Web(2),
    Native(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int type;

    VesselType(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(VesselType vesselType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/vessel/utils/VesselType");
    }

    public static VesselType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselType) ipChange.ipc$dispatch("8859f2b8", new Object[]{str});
        }
        return (VesselType) Enum.valueOf(VesselType.class, str);
    }
}
