package com.alibaba.android.ultron.trade.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum NetType {
    NET_TYPE_UNKNOW(0, "unknow"),
    NET_TYPE_2G(2, "2g"),
    NET_TYPE_3G(3, "3g"),
    NET_TYPE_WIFI(1, "wifi"),
    NET_TYPE_23G(4, "23g");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int code;
    private String desc;

    NetType(int i, String str) {
        this.code = i;
        this.desc = str;
    }

    public static /* synthetic */ Object ipc$super(NetType netType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/utils/NetType");
    }

    public static NetType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetType) ipChange.ipc$dispatch("fdf867b8", new Object[]{str});
        }
        return (NetType) Enum.valueOf(NetType.class, str);
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }

    public String getDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.desc;
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.desc;
    }
}
