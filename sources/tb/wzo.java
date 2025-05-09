package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wzo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f31043a;

    static {
        t2o.a(283115582);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b1a51a", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageName();
        } catch (Exception e) {
            qgh.a("TANX_EXPOSE_UTIL", "getVersionName: exception" + e.getMessage());
            return "";
        }
    }

    public static String b() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c888a235", new Object[0]);
        }
        if (!TextUtils.isEmpty(f31043a)) {
            return f31043a;
        }
        ad0 e = ed0.h().e();
        if (e == null) {
            return "";
        }
        if (TextUtils.isEmpty(e.e())) {
            str = a(ed0.h().f());
        } else {
            str = e.e();
        }
        if (TextUtils.isEmpty(e.a())) {
            str2 = c(ed0.h().f());
        } else {
            str2 = e.a();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        f31043a = str + ";" + str2 + ";Android;" + Build.VERSION.RELEASE + ";" + Build.MODEL;
        if (qgh.f26737a) {
            qgh.a("TANX_EXPOSE_UTIL", "getUserAgent: mUserAgent = " + f31043a);
        }
        return f31043a;
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("904e852c", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            qgh.a("TANX_EXPOSE_UTIL", "getVersionName: exception" + e.getMessage());
            return "";
        }
    }

    public static Map<String, Object> d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("69087572", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (!TextUtils.isEmpty(next) && opt != null) {
                hashMap.put(next, opt);
            }
        }
        return hashMap;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257656f1", new Object[]{str});
        }
        try {
            return String.format("%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String f(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6072ffee", new Object[]{str, jSONObject});
        }
        if (!(str == null || jSONObject == null)) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    str = str.replace(next, optString);
                }
            }
        }
        return str;
    }
}
