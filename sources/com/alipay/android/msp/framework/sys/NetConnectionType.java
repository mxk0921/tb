package com.alipay.android.msp.framework.sys;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum NetConnectionType {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NETWORK_TYPE_16(16, "MOBILE_UNKNOWN"),
    NETWORK_TYPE_20(20, "5G");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;
    private String name;

    NetConnectionType(int i, String str) {
        this.code = i;
        this.name = str;
    }

    public static NetConnectionType getTypeByCode(int i) {
        NetConnectionType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetConnectionType) ipChange.ipc$dispatch("e3a7c737", new Object[]{new Integer(i)});
        }
        for (NetConnectionType netConnectionType : values()) {
            if (netConnectionType.getCode() == i) {
                return netConnectionType;
            }
        }
        return NETWORK_TYPE_16;
    }

    public static /* synthetic */ Object ipc$super(NetConnectionType netConnectionType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/sys/NetConnectionType");
    }

    public static NetConnectionType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetConnectionType) ipChange.ipc$dispatch("ff900d86", new Object[]{str});
        }
        return (NetConnectionType) Enum.valueOf(NetConnectionType.class, str);
    }

    public final int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }
}
