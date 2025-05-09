package com.taobao.android.order.core.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum DataStatus {
    NORMAL_DATA,
    EMPTY_DATA,
    ERROR_DATA;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DataStatus dataStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/request/DataStatus");
    }

    public static DataStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataStatus) ipChange.ipc$dispatch("167fc4d4", new Object[]{str});
        }
        return (DataStatus) Enum.valueOf(DataStatus.class, str);
    }
}
