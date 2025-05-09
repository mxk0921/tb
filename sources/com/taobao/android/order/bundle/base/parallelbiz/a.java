package com.taobao.android.order.bundle.base.parallelbiz;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import java.util.HashMap;
import java.util.Map;
import tb.c2v;
import tb.pcv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031737);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0e7d006", new Object[0]);
        }
        try {
            Map<String, String> pageProperties = c2v.getInstance().getPageProperties("");
            if (!(pageProperties == null || pageProperties.get("newOrderId") == null)) {
                return pageProperties.get("newOrderId");
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static void b(ParallelBizValueHelper.PageType pageType, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd19fae", new Object[]{pageType, str, map});
            return;
        }
        String c = ParallelBizValueHelper.c(pageType);
        if (!str.startsWith(c)) {
            str = c + str;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey("orderId")) {
            map.put("orderId", a());
        }
        pcv.a(c, str, map);
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add73f8b", new Object[]{str, map});
            return;
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (currentPageName != null) {
            if (!str.startsWith(currentPageName)) {
                str = currentPageName.concat(str);
            }
            if (map == null) {
                map = new HashMap<>();
            }
            if (!map.containsKey("orderId")) {
                map.put("orderId", a());
            }
            pcv.a(currentPageName, str, map);
        }
    }

    public static void d(Context context, ParallelBizValueHelper.PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df4225b", new Object[]{context, pageType});
            return;
        }
        pcv.c(context, ParallelBizValueHelper.c(pageType));
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", ParallelBizValueHelper.d(pageType));
        pcv.d(context, hashMap);
    }

    public static void e(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e60a0f", new Object[]{context, map});
        } else {
            pcv.d(context, map);
        }
    }
}
