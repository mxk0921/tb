package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class l5b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l5b INSTANCE = new l5b();

    /* renamed from: a  reason: collision with root package name */
    public static String f23119a;
    public static String b;
    public static Map<String, String> c;
    public static Map<String, String> d;

    static {
        t2o.a(815792212);
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4634f00", new Object[0]);
        }
        return b;
    }

    @JvmStatic
    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f547f0c5", new Object[0]);
        }
        return f23119a;
    }

    @JvmStatic
    public static final Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e927f7a8", new Object[0]);
        }
        return c;
    }

    public final Map<String, String> d(String str) {
        HashMap hashMap;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83b092c5", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject2 = JSON.parseObject(str);
                if (parseObject2 == null) {
                    return null;
                }
                hashMap = new HashMap();
                for (String str2 : parseObject2.keySet()) {
                    String string = parseObject2.getString(str2);
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(string)) {
                        hashMap.put(str2, string);
                    }
                }
                String str3 = (String) hashMap.remove("searchPassParams");
                if (TextUtils.isEmpty(str3) || (parseObject = JSON.parseObject(str3)) == null) {
                    return hashMap;
                }
                for (String str4 : parseObject.keySet()) {
                    String string2 = parseObject.getString(str4);
                    if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(string2)) {
                        hashMap.put(str4, string2);
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return hashMap;
    }

    public final Map<String, String> e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b27bea2a", new Object[]{this, map});
        }
        HashMap hashMap = null;
        if (map != null && !map.isEmpty()) {
            List<String> f = f();
            if (f.isEmpty()) {
                return null;
            }
            hashMap = new HashMap();
            for (String str : map.keySet()) {
                if (f.contains(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        hashMap.put(str, str2);
                    }
                }
            }
        }
        return hashMap;
    }

    public final List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("36c7cf6c", new Object[]{this});
        }
        String b2 = p4p.b();
        if (TextUtils.isEmpty(b2)) {
            return new ArrayList();
        }
        ckf.d(b2);
        String[] strArr = (String[]) wsq.z0(b2, new String[]{","}, false, 0, 6, null).toArray(new String[0]);
        return yz3.l(Arrays.copyOf(strArr, strArr.length));
    }

    @JvmStatic
    public static final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c811be0", new Object[]{context});
        } else if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("homepage_common", 0);
            if (sharedPreferences == null) {
                b4p.b("HomepageVersionManager", "home page sp is null");
                return;
            }
            f23119a = sharedPreferences.getString("HomePageLatestVersion", "");
            l5b l5bVar = INSTANCE;
            String string = sharedPreferences.getString("homePassParams", "");
            ckf.f(string, "getString(...)");
            Map<String, String> d2 = l5bVar.d(string);
            d = d2;
            c = l5bVar.e(d2);
            if (p4p.e()) {
                b = "";
                return;
            }
            b = sharedPreferences.getString("tb_homepage_clientCache_lbs", "");
            b4p.a("HomepageVersionManager", "HomePageLbs:" + b);
        }
    }
}
