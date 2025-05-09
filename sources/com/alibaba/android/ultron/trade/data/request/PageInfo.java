package com.alibaba.android.ultron.trade.data.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum PageInfo {
    FIRST_PAGE,
    NEXT_PAGE,
    LAST_PAGE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(PageInfo pageInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/data/request/PageInfo");
    }

    public static PageInfo valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("14ef7a8f", new Object[]{str});
        }
        return (PageInfo) Enum.valueOf(PageInfo.class, str);
    }
}
