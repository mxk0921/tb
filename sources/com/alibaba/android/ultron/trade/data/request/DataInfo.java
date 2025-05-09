package com.alibaba.android.ultron.trade.data.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum DataInfo {
    NORMAL_DATA,
    EMPTY_DATA,
    ERROR_DATA;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DataInfo dataInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/data/request/DataInfo");
    }

    public static DataInfo valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataInfo) ipChange.ipc$dispatch("ca97e654", new Object[]{str});
        }
        return (DataInfo) Enum.valueOf(DataInfo.class, str);
    }
}
