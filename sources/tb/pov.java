package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297659);
    }

    public static String a(String str, Map<String, String> map) {
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
                Map<String, String> b = b(str);
                b.putAll(map);
                return c(parse.buildUpon(), b).toString();
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static Map<String, String> b(String str) {
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

    public static Uri.Builder c(Uri.Builder builder, Map<String, String> map) {
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
