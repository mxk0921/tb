package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uhn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59aeda0d", new Object[]{str, str2});
        } else {
            TBS.Adv.ctrlClicked(str, CT.Button, str2);
        }
    }

    public static void b(String str, String str2, JSONObject jSONObject) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa5f9683", new Object[]{str, str2, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (jSONObject != null) {
            for (String str4 : jSONObject.keySet()) {
                sb.append(str4);
                sb.append("=");
                sb.append(jSONObject.get(str4));
                sb.append(",");
            }
            str3 = sb.toString();
        } else {
            str3 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            TBS.Adv.ctrlClicked(str, CT.Button, str2);
        } else {
            TBS.Adv.ctrlClicked(str, CT.Button, str2, str3.split(","));
        }
    }

    public static void c(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c60df2", new Object[]{str, str2, strArr});
        } else {
            TBS.Adv.ctrlClicked(str, CT.Button, str2, strArr);
        }
    }

    public static void d(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56314bc2", new Object[]{str, str2, jSONObject});
        } else {
            e(str, str2, jSONObject);
        }
    }

    public static void e(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822e0221", new Object[]{str, str2, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (String str3 : jSONObject.keySet()) {
                hashMap.put(str3, jSONObject.getString(str3));
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str + "_Show-" + str2, null, null, hashMap).build());
    }

    public static void f(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737d357e", new Object[]{context, str, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(context, str);
        if (map != null) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb547ad", new Object[]{context});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(context);
        }
    }

    public static void h(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28eb0e0e", new Object[]{activity, str, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(activity.getApplicationContext(), str);
        if (map != null) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity.getApplicationContext(), map);
        }
    }

    public static void i(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cf0bfe", new Object[]{activity, str, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity.getApplicationContext());
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(activity, str);
    }

    public static void j(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976b29f7", new Object[]{str, str2, str3, str4, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (String str5 : jSONObject.keySet()) {
                hashMap.put(str5, jSONObject.getString(str5));
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, str3, str4, hashMap).build());
    }
}
