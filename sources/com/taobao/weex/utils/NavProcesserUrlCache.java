package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NavProcesserUrlCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f14146a = new HashMap();

    static {
        t2o.a(773849132);
    }

    public static void addUrlCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a2512f", new Object[]{str, str2});
        } else if (str != null && str2 != null) {
            ((HashMap) f14146a).put(str, str2);
        }
    }

    public static String getOriginalUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd743487", new Object[]{str});
        }
        Map<String, String> map = f14146a;
        if (map != null) {
            return (String) ((HashMap) map).get(str);
        }
        return null;
    }
}
