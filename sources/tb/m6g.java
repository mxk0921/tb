package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m6g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f23810a;

    static {
        t2o.a(729808977);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c20c9480", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && "LBS".equals(str)) {
            if (f23810a == null) {
                c();
            }
            JSONObject jSONObject = f23810a;
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                String string = jSONObject.getString(str2);
                bqa.j("homepage.LBSSharedPreferenceUtils", "getCacheValue", str, str2, string);
                return string;
            } else if (jSONObject != null) {
                String jSONString = jSONObject.toJSONString();
                bqa.j("homepage.LBSSharedPreferenceUtils", "getCacheValue", str, str2, jSONString);
                return jSONString;
            } else {
                bqa.j("homepage.LBSSharedPreferenceUtils", "getCacheValue", str, str2, mx8.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
            }
        }
        return null;
    }

    public static SharedPreferences b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        return m0b.c().getSharedPreferences("homepage_common", 0);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62114ad6", new Object[0]);
            return;
        }
        String string = b().getString("tb_homepage_clientCache_lbs", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                f23810a = JSON.parseObject(string);
            } catch (Exception unused) {
                bqa.j("homepage.LBSSharedPreferenceUtils", "getCacheValue exception read local data wrong");
            }
        }
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f74700e6", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JSONObject jSONObject = f23810a;
        if (jSONObject != null && str.equals(jSONObject.toJSONString())) {
            return false;
        }
        try {
            f23810a = JSON.parseObject(str);
        } catch (Exception unused) {
        }
        if (f23810a == null) {
            return false;
        }
        bqa.j("homepage.LBSSharedPreferenceUtils", "setCacheValue complete", str);
        SharedPreferences.Editor edit = b().edit();
        edit.putString("tb_homepage_clientCache_lbs", f23810a.toJSONString());
        edit.commit();
        return true;
    }

    public static boolean e(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f38c6c", new Object[]{str, str2, str3, str4})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3) && "LBS".equals(str)) {
            bqa.j("homepage.LBSSharedPreferenceUtils", "updateCache", str, str2, str3);
            if (f23810a == null) {
                c();
            }
            JSONObject jSONObject = f23810a;
            if (jSONObject != null && !TextUtils.isEmpty(str2) && jSONObject.containsKey(str2)) {
                jSONObject.put(str2, (Object) str3);
                String jSONString = f23810a.toJSONString();
                SharedPreferences b = b();
                if (b != null) {
                    SharedPreferences.Editor edit = b.edit();
                    edit.putString("tb_homepage_clientCache_lbs", jSONString);
                    edit.commit();
                    bqa.j("homepage.LBSSharedPreferenceUtils", "updateCache complete", jSONString);
                }
                return true;
            }
        }
        return false;
    }
}
