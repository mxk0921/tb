package com.taobao.android.order.core.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum PageStatus {
    FIRST_PAGE,
    NEXT_PAGE,
    LAST_PAGE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(PageStatus pageStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/request/PageStatus");
    }

    public static PageStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStatus) ipChange.ipc$dispatch("2943364f", new Object[]{str});
        }
        return (PageStatus) Enum.valueOf(PageStatus.class, str);
    }
}
