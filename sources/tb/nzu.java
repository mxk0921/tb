package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class nzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f25056a = new HashMap();
    public static final Map<String, Object> b = new HashMap();
    public static final Map<String, Object> c = new HashMap();

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("915f2636", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.get(next) != null) {
                    hashMap.put(next, jSONObject.get(next) + "");
                } else {
                    hashMap.put(next, "");
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea651912", new Object[]{str});
            return;
        }
        Map<String, String> a2 = a(str);
        if (a2 != null && !a2.isEmpty()) {
            f3v f3vVar = new f3v();
            f3vVar.d(a2.get("kn"));
            f3vVar.e(a2.get("v"));
            f3vVar.f(a2.get(f3v.TYPE_FAR));
            UTAnalytics.getInstance().getDefaultTracker().addTPKItem(f3vVar);
        }
    }

    public static Object c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("39319cb6", new Object[]{str});
        }
        return ((HashMap) f25056a).get(str);
    }

    public static Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b6622016", new Object[0]);
        }
        return c;
    }

    public static Object e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("22645c69", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageSpmPre", UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre((Activity) context));
        } catch (Exception e) {
            Log.e("ut4aplus", "", e);
        }
        return jSONObject;
    }

    public static Object f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("566b6a35", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageSpmUrl", UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl((Activity) context));
        } catch (Exception e) {
            Log.e("ut4aplus", "", e);
        }
        return jSONObject;
    }

    public static Map g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e2dff593", new Object[0]);
        }
        return b;
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c625268e", new Object[]{str});
        } else {
            ((HashMap) f25056a).remove(str);
        }
    }

    public static void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd83667", new Object[]{context});
        }
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a5443a", new Object[]{str, str2});
            return;
        }
        try {
            ((HashMap) f25056a).put(str, new JSONObject(str2));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec952ab", new Object[]{str});
            return;
        }
        Map<String, String> a2 = a(str);
        if (!(a2 == null || a2.isEmpty())) {
            for (String str2 : a2.keySet()) {
                UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(str2, a2.get(str2));
            }
        }
    }

    public static void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c2da73d", new Object[]{str});
        } else {
            UTAnalytics.getInstance().turnOnRealTimeDebug(a(str));
        }
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306f3d31", new Object[]{str});
        } else {
            UTAnalytics.getInstance().updateSessionProperties(a(str));
        }
    }

    public static void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a7f52a", new Object[]{str});
            return;
        }
        Map<String, String> a2 = a(str);
        UTAnalytics.getInstance().updateUserAccount(a2.get("userNick"), a2.get("userId"), a2.get("openId"));
    }

    public static void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74607f9f", new Object[]{str});
        } else {
            UTAnalytics.getInstance().userRegister(a(str).get("userNick"));
        }
    }

    public static void z(String str) {
        Map hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38801c9b", new Object[]{str});
            return;
        }
        try {
            Map<String, String> a2 = a(str);
            if (a2 != null) {
                String remove = a2.remove("pageName");
                int intValue = Integer.valueOf(a2.remove("eventId") + "").intValue();
                String remove2 = a2.remove("arg1");
                String remove3 = a2.remove("arg2");
                String remove4 = a2.remove("arg3");
                String remove5 = a2.remove("args");
                if (!TextUtils.isEmpty(remove5)) {
                    hashMap = a(remove5);
                } else {
                    hashMap = new HashMap();
                }
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(remove, intValue, remove2, remove3, remove4, hashMap).build());
            }
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void h(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487a6c48", new Object[]{context, map});
            return;
        }
        try {
            if (map.containsKey("isRefresh")) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("_h5_refresh", "1");
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, hashMap);
            }
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf08af2", new Object[]{context});
            return;
        }
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put("ut4aplus", "1");
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, hashMap);
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee51327", new Object[]{context, str});
            return;
        }
        thh.e("params", str);
        try {
            Map<String, String> a2 = a(str);
            if (context != null) {
                if ("true".equals(a2.get("isSPA"))) {
                    UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(context);
                }
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(context);
            } else {
                thh.e(null, "cannot get pageObject");
            }
            h(context, a2);
            i(context);
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95621baf", new Object[]{str});
            return;
        }
        thh.e(null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(a(str));
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{str});
            return;
        }
        thh.e(null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ac037", new Object[]{context, str});
            return;
        }
        thh.e(null, "params", str);
        try {
            new JSONObject(str);
        } catch (Exception e) {
            Log.e("ut4aplus", "", e);
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(context);
    }

    public static void s(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc21ca8", new Object[]{context, str});
            return;
        }
        thh.e(null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, a(str).get("pageName"));
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void t(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd8f700", new Object[]{context, str});
            return;
        }
        thh.e(null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, a(str));
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void u(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3394074", new Object[]{context, str});
            return;
        }
        thh.e(null, "params", str);
        try {
            String str2 = a(str).get("pageURL");
            if (!TextUtils.isEmpty(str2)) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(context, Uri.parse(str2));
            }
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void v(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf002b5", new Object[]{context, str});
            return;
        }
        thh.d(null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(context, str);
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }
}
