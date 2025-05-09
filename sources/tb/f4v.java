package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import com.taobao.tao.Globals;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.dov;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class f4v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPM_CD = "spm_cd";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f19009a = new HashMap<>();
    public static final HashMap<String, String> b = new HashMap<>();

    static {
        t2o.a(511705568);
    }

    public static Map<String, String> a(Map<String, String> map, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6eff442f", new Object[]{map, new Boolean(z)});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        String str2 = map.get("session_id");
        if (TextUtils.isEmpty(str2)) {
            return map;
        }
        JSONObject e = p6g.c(str2).e();
        try {
            if (z) {
                str = URLEncoder.encode(e.toJSONString(), "utf-8");
            } else {
                str = e.toJSONString();
            }
            map.put("ab_test_info", str);
        } catch (Throwable unused) {
        }
        String str3 = MediaStatInfo.getGlobalStatInfo().get(str2);
        if (!TextUtils.isEmpty(str3)) {
            if (z) {
                try {
                    str3 = URLEncoder.encode(str3, "utf-8");
                } catch (Throwable unused2) {
                }
            }
            map.put("stat_info", str3);
        }
        return map;
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5344f3", new Object[]{str, str2, map});
        } else if (str != null && str2 != null) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!str.startsWith("Page_")) {
                str = "Page_".concat(str);
            }
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder(str, "Button-" + str2);
            uTHitBuilders$UTControlHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        }
    }

    public static void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f74a8", new Object[]{str, str2, map});
            return;
        }
        try {
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str + "_" + str2);
            uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
            String str3 = "";
            if (map != null) {
                for (String str4 : map.keySet()) {
                    uTHitBuilders$UTCustomHitBuilder.setProperty(str4, map.get(str4));
                    str3 = str3 + "[" + str4 + ":" + map.get(str4) + "]";
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        } catch (Throwable unused) {
        }
    }

    public static void d(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c7eb06", new Object[]{str, str2, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str + "_Show-" + str2);
        uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
        uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
        uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_EVENT_ID, "2201");
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b2b7c5a", new Object[0]);
        }
        return new HashMap(f19009a);
    }

    public static Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("671a8fca", new Object[0]);
        }
        return new HashMap(b);
    }

    public static void g(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9bfbf0", new Object[]{context, str, str2, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(context);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
            String remove = map.remove(SPM_CD);
            if (!TextUtils.isEmpty(remove)) {
                str2 = str2 + "." + remove;
            }
        }
        hashMap.put("spm-cnt", str2);
        HashMap<String, String> hashMap2 = f19009a;
        hashMap2.put("spm-cnt", str2);
        Activity activity = (Activity) context;
        String pageSpmUrl = UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl(activity);
        if (!TextUtils.isEmpty(pageSpmUrl)) {
            hashMap.put("spm-url", pageSpmUrl);
            hashMap2.put("spm-url", pageSpmUrl);
        }
        String pageSpmPre = UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre(activity);
        if (!TextUtils.isEmpty(pageSpmPre)) {
            hashMap2.put("spm-pre", pageSpmPre);
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("spm-url", str2);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap3);
    }

    public static void i(dov.a aVar, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd24711b", new Object[]{aVar, strArr, str});
        } else {
            h(f19009a, aVar, strArr, str);
        }
    }

    public static void j(dov.a aVar, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc53505", new Object[]{aVar, strArr, str});
        } else {
            h(b, aVar, strArr, str);
        }
    }

    public static void h(HashMap<String, String> hashMap, dov.a aVar, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd4b5666", new Object[]{hashMap, aVar, strArr, str});
            return;
        }
        String m = aVar.m("umi_edit_session");
        if (m != null) {
            str = m;
        }
        hashMap.put("umi_pub_session", str);
        hashMap.put("is_tablet", String.valueOf(TBDeviceUtils.P(Globals.getApplication())));
        hashMap.put("is_fold_device", String.valueOf(TBDeviceUtils.p(Globals.getApplication())));
        if (strArr != null) {
            for (String str2 : strArr) {
                String m2 = aVar.m(str2);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(m2)) {
                    hashMap.put(str2, m2);
                }
            }
        }
    }
}
