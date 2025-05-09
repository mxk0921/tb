package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.a;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jfv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PUBLISH_SESSION = "umiPubSession";

    static {
        t2o.a(944767259);
    }

    public static List<String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2babf99", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (!map.isEmpty()) {
            String str = map.get("umi_edit_session");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (TextUtils.isEmpty(str) || !TextUtils.equals("umi_pub_session", key)) {
                    arrayList.add(key + "=" + entry.getValue());
                } else {
                    arrayList.add(key + "=" + str);
                }
            }
        }
        return arrayList;
    }

    public static void b(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b610b5c", new Object[]{str, new Integer(i), obj, obj2, obj3, strArr});
        } else if (TextUtils.isEmpty(str)) {
            TBS.Ext.commitEvent(i, obj, obj2, obj3, strArr);
        } else {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, strArr);
        }
    }

    public static final void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f74a8", new Object[]{str, str2, map});
            return;
        }
        try {
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(str + "_" + str2);
            uTHitBuilders$UTCustomHitBuilder.setEventPage(str);
            if (map != null) {
                for (String str3 : map.keySet()) {
                    uTHitBuilders$UTCustomHitBuilder.setProperty(str3, map.get(str3));
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
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_" + str2, null, null, map).build());
    }

    public static Map<String, String> e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e34a463f", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            String valueOf = String.valueOf(entry.getValue());
            if (!TextUtils.isEmpty(key)) {
                hashMap.put(key, valueOf);
            }
        }
        return hashMap;
    }

    public static void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c84b991", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            f(e(jSONObject));
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83f5d49", new Object[]{str});
        } else {
            f(dov.b(str).o());
        }
    }

    public static void i(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305431da", new Object[]{jSONObject, str});
        } else if (jSONObject != null) {
            List<String> a2 = a(e(jSONObject));
            a2.add(z9u.ARG_CONTENT_ID + str);
            b("Page_UmiPublish", 2101, "Page_UmiPublish_ContentPubSuccess", null, null, (String[]) a2.toArray(new String[0]));
        }
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ea6ff4", new Object[]{str, str2});
            return;
        }
        List<String> a2 = a(dov.b(str).o());
        a2.add(z9u.ARG_CONTENT_ID + str2);
        b("Page_UmiPublish", 2101, "Page_UmiPublish_ContentPubSuccess", null, null, (String[]) a2.toArray(new String[0]));
    }

    public static void k(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("577ebd79", new Object[]{str, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("biz_scene", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("is_remote_wait", str2);
        hashMap.put(dov.K_DEVICE_SCORE, String.valueOf(qp0.c()));
        hashMap.put("device_level", String.valueOf(qp0.b()));
        hashMap.put("tp_remote_status", ddq.a().a(a.TAOPAI_SDK_FEATURE, "baseline"));
        d("Page_UmiPublish", "EntryClick", hashMap);
    }

    public static void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dcaf981", new Object[]{map});
            return;
        }
        String str = map.get("biz_scene");
        if (!TextUtils.equals(str, "x_rate") && !TextUtils.equals(str, "x_ask_everyone")) {
            b("Page_UmiPublish", 2101, "Page_UmiPublish_ContentPubStart", null, null, (String[]) a(map).toArray(new String[0]));
        }
    }
}
