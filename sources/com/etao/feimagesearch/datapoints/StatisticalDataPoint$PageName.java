package com.etao.feimagesearch.datapoints;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum StatisticalDataPoint$PageName {
    PHOTO_SEARCH_TAKE("PhotoSearchTake", "搜索核心数据追踪"),
    PHOTO_SEARCH_RESULT("PhotoSearchResult", "IRP数据追踪");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mDesc;
    private final String mPageName;

    StatisticalDataPoint$PageName(String str, String str2) {
        this.mPageName = str;
        this.mDesc = str2;
    }

    public static /* synthetic */ Object ipc$super(StatisticalDataPoint$PageName statisticalDataPoint$PageName, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/datapoints/StatisticalDataPoint$PageName");
    }

    public static StatisticalDataPoint$PageName valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatisticalDataPoint$PageName) ipChange.ipc$dispatch("5cf8894a", new Object[]{str});
        }
        return (StatisticalDataPoint$PageName) Enum.valueOf(StatisticalDataPoint$PageName.class, str);
    }

    public String getDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.mDesc;
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.mPageName;
    }
}
