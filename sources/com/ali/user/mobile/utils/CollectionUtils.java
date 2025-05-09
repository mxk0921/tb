package com.ali.user.mobile.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CollectionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157634);
    }

    public static boolean isEmpty(List<?> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a436963f", new Object[]{list})).booleanValue() : list == null || list.size() == 0;
    }

    public static boolean isEmpty(Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("489e80ff", new Object[]{map})).booleanValue() : map == null || map.size() == 0;
    }
}
