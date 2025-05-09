package tb;

import android.net.Uri;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792253);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82cf5651", new Object[]{str});
        }
        if (str == null) {
            str = "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd8cbad5", new Object[]{str});
        }
        if (!i(str)) {
            return str;
        }
        String str2 = "http:" + str;
        b4p.d("SearchUrlUtil", "url no scheme:" + str2);
        return str2;
    }

    public static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96ea7917", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Uri.parse(e(str)).getQueryParameter(str2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return "";
    }

    public static Map<String, String> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ebf9fcf", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        Uri parse = Uri.parse(e(str));
        for (String str2 : parse.getQueryParameterNames()) {
            hashMap.put(str2, parse.getQueryParameter(str2));
        }
        return hashMap;
    }

    public static String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a222152", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(e(str)).getQueryParameter(str2);
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("647351fc", new Object[]{str})).booleanValue();
        }
        return str.startsWith(itw.URL_SEPARATOR);
    }

    public static String a(String str, ArrayMap<String, String> arrayMap) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db91d353", new Object[]{str, arrayMap});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (arrayMap == null || arrayMap.size() == 0) {
            return str;
        }
        if (i(str)) {
            str = "http:" + str;
            b4p.d("SearchUrlUtil", "url no scheme:" + str);
            z = true;
        } else {
            z = false;
        }
        Uri parse = Uri.parse(str);
        Map<String, String> g = g(str);
        g.putAll(arrayMap);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            String keyAt = arrayMap.keyAt(i);
            String valueAt = arrayMap.valueAt(i);
            if (!TextUtils.isEmpty(keyAt) && !TextUtils.isEmpty(valueAt)) {
                g.put(keyAt, valueAt);
            }
        }
        for (Map.Entry<String, String> entry : g.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        String builder = buildUpon.toString();
        return z ? builder.substring(5) : builder;
    }

    public static String b(String str, String str2, String str3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8c1b3c0", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i(str)) {
            str = "http:" + str;
            b4p.d("SearchUrlUtil", "url no scheme:" + str);
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Map<String, String> g = g(str);
        g.put(str2, str3);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (Map.Entry<String, String> entry : g.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        String builder = buildUpon.toString();
        return z ? builder.substring(5) : builder;
    }

    public static String c(String str, Map<String, String> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("318e2187", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (map == null || map.size() == 0) {
            return str;
        }
        if (i(str)) {
            str = "http:" + str;
            b4p.d("SearchUrlUtil", "url no scheme:" + str);
        } else {
            z = false;
        }
        Uri parse = Uri.parse(str);
        Map<String, String> g = g(str);
        g.putAll(map);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (Map.Entry<String, String> entry : g.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                buildUpon = buildUpon.appendQueryParameter(key, value);
            }
        }
        String builder = buildUpon.toString();
        return z ? builder.substring(5) : builder;
    }
}
