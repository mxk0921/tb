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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001988);
    }

    public static String a(String str, ArrayMap<String, String> arrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db91d353", new Object[]{str, arrayMap});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!(arrayMap == null || arrayMap.size() == 0)) {
                Uri parse = Uri.parse(str);
                Map<String, String> f = f(str);
                f.putAll(arrayMap);
                int size = arrayMap.size();
                for (int i = 0; i < size; i++) {
                    String keyAt = arrayMap.keyAt(i);
                    String valueAt = arrayMap.valueAt(i);
                    if (!TextUtils.isEmpty(keyAt) && !TextUtils.isEmpty(valueAt)) {
                        f.put(keyAt, valueAt);
                    }
                }
                return h(parse.buildUpon(), f).toString();
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8c1b3c0", new Object[]{str, str2, str3});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str);
                Map<String, String> f = f(str);
                f.put(str2, str3);
                return h(parse.buildUpon(), f).toString();
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("318e2187", new Object[]{str, map});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!(map == null || map.size() == 0)) {
                Uri parse = Uri.parse(str);
                Map<String, String> f = f(str);
                f.putAll(map);
                return h(parse.buildUpon(), f).toString();
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82cf5651", new Object[]{str});
        }
        if (str == null) {
            str = null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96ea7917", new Object[]{str, str2});
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                return Uri.parse(str).getQueryParameter(str2);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ebf9fcf", new Object[]{str});
        }
        try {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                return hashMap;
            }
            Uri parse = Uri.parse(str);
            for (String str2 : parse.getQueryParameterNames()) {
                hashMap.put(str2, parse.getQueryParameter(str2));
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return new HashMap();
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89ca9934", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return Uri.parse(str).getPath();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Uri.Builder h(Uri.Builder builder, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri.Builder) ipChange.ipc$dispatch("51c421ba", new Object[]{builder, map});
        }
        builder.clearQuery();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                builder = builder.appendQueryParameter(key, value);
            }
        }
        return builder;
    }
}
