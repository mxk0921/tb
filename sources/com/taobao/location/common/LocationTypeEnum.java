package com.taobao.location.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum LocationTypeEnum {
    NOLOCATION(0),
    GDLOCATION(1),
    NoNetwork(2),
    WIFILOCATION(3),
    NLPLOCATION(4),
    MEMORYLOCATION(5),
    GPSLOCATION(6),
    TBSEVERLOCATION(7);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    LocationTypeEnum(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(LocationTypeEnum locationTypeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/location/common/LocationTypeEnum");
    }

    public static LocationTypeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationTypeEnum) ipChange.ipc$dispatch("a0c7d33d", new Object[]{str});
        }
        return (LocationTypeEnum) Enum.valueOf(LocationTypeEnum.class, str);
    }

    public static LocationTypeEnum valueOfType(int i) {
        LocationTypeEnum[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationTypeEnum) ipChange.ipc$dispatch("c5d8241e", new Object[]{new Integer(i)});
        }
        for (LocationTypeEnum locationTypeEnum : values()) {
            if (locationTypeEnum.getType() == i) {
                return locationTypeEnum;
            }
        }
        return null;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }
}
