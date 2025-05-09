package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793307);
    }

    public static Map<String, String> a(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35f63363", new Object[]{s4pVar});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm", "a2141.7631685.0.0");
        if (o4p.Y0()) {
            hashMap.put("sellerId", f(s4pVar));
            hashMap.put("shopId", g(s4pVar));
            hashMap.put(r4p.KEY_IS_WEEX_SHOP, m(s4pVar));
            hashMap.put(r4p.KEY_MINI_APP, j(s4pVar));
            hashMap.put(r4p.KEY_MINI_APP_DETAIL_URL, c(s4pVar));
            hashMap.put(r4p.KEY_MINI_APP_CATEGORY_URL, b(s4pVar));
            hashMap.put("photoSearch", l(s4pVar));
            hashMap.put(r4p.KEY_SHOP_SEARCH_ELDER, k(s4pVar));
            String h = h(s4pVar);
            if (!TextUtils.isEmpty(h)) {
                hashMap.put(r4p.KEY_STORE_ID, h);
            }
            String d = d(s4pVar);
            if (!TextUtils.isEmpty(d)) {
                hashMap.put("localInshopId", d);
            }
        } else {
            hashMap.putAll(s4pVar.w());
        }
        return hashMap;
    }

    public static String b(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dc1580d", new Object[]{s4pVar});
        }
        return e(s4pVar, r4p.KEY_MINI_APP_CATEGORY_URL, "");
    }

    public static String c(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f59c0b9a", new Object[]{s4pVar});
        }
        return e(s4pVar, r4p.KEY_MINI_APP_DETAIL_URL, "");
    }

    public static String d(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30d473d2", new Object[]{s4pVar});
        }
        return e(s4pVar, "localInshopId", "");
    }

    public static String e(s4p s4pVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7617437b", new Object[]{s4pVar, str, str2});
        }
        if (s4pVar == null || s4pVar.w() == null) {
            return str2;
        }
        String str3 = s4pVar.w().get(str);
        if (str3 == null) {
            return str2;
        }
        return str3;
    }

    public static String f(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3d473d7", new Object[]{s4pVar});
        }
        return e(s4pVar, "sellerId", "");
    }

    public static String g(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bbf428e", new Object[]{s4pVar});
        }
        return e(s4pVar, "shopId", "");
    }

    public static String h(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3634e0d", new Object[]{s4pVar});
        }
        return e(s4pVar, r4p.KEY_STORE_ID, "");
    }

    public static void i(View view) {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b264dfa2", new Object[]{view});
        } else if (view != null && (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static String j(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55e55b27", new Object[]{s4pVar});
        }
        return e(s4pVar, r4p.KEY_MINI_APP, "false");
    }

    public static String k(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8dfb8838", new Object[]{s4pVar});
        }
        return e(s4pVar, r4p.KEY_SHOP_SEARCH_ELDER, "");
    }

    public static String l(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7ea079a", new Object[]{s4pVar});
        }
        return e(s4pVar, "photoSearch", "");
    }

    public static String m(s4p s4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db6a291b", new Object[]{s4pVar});
        }
        return e(s4pVar, r4p.KEY_IS_WEEX_SHOP, "false");
    }

    public static void n(s4p s4pVar, Activity activity, String str, Map<String, String> map, abx abxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d964d207", new Object[]{s4pVar, activity, str, map, abxVar});
        } else if (map != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("query", str);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
            map.put("q", str);
            if (map.get("spm") == null) {
                map.put("spm", "a2141.7631685.0.0");
            }
            if (o4p.Y0()) {
                map.put("sellerId", f(s4pVar));
                map.put("shopId", g(s4pVar));
                map.put(r4p.KEY_IS_WEEX_SHOP, m(s4pVar));
                map.put(r4p.KEY_MINI_APP, j(s4pVar));
                map.put(r4p.KEY_MINI_APP_DETAIL_URL, c(s4pVar));
                map.put(r4p.KEY_MINI_APP_CATEGORY_URL, b(s4pVar));
                map.put("photoSearch", l(s4pVar));
                map.put(r4p.KEY_SHOP_SEARCH_ELDER, k(s4pVar));
                String h = h(s4pVar);
                if (!TextUtils.isEmpty(h)) {
                    map.put(r4p.KEY_STORE_ID, h);
                }
                String d = d(s4pVar);
                if (!TextUtils.isEmpty(d)) {
                    map.put("localInshopId", d);
                }
            } else {
                map.putAll(s4pVar.w());
            }
            Nav.from(activity).toUri(f6p.c("http://shop.m.taobao.com/goods/index.htm", map));
            abxVar.postEvent(x1p.a(str));
        }
    }
}
