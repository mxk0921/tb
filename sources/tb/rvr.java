package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991613);
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e60dba39", new Object[]{str, map});
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        String encodedQuery = parse.getEncodedQuery();
        String encodedFragment = parse.getEncodedFragment();
        if (pvr.a(encodedQuery)) {
            encodedQuery = "";
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                if (!TextUtils.isEmpty(encodedQuery)) {
                    encodedQuery = encodedQuery + "&";
                }
                encodedQuery = encodedQuery + entry.getKey() + "=" + entry.getValue();
            }
        }
        return new f5v().e(scheme).b(host).c(path).d(encodedQuery).a(encodedFragment).toString();
    }

    public static String b(String str) {
        Uri parse;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("802e2223", new Object[]{str});
        }
        if (pvr.a(str) || (parse = Uri.parse(str)) == null) {
            return null;
        }
        String host = parse.getHost();
        if (!pvr.a(host) && (indexOf = host.indexOf(".")) > 0) {
            return host.substring(0, indexOf);
        }
        return null;
    }

    public static String c(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11095d6c", new Object[]{str});
        }
        if (pvr.a(str) || (parse = Uri.parse(str)) == null) {
            return null;
        }
        String host = parse.getHost();
        String str2 = "";
        if (pvr.a(host)) {
            host = str2;
        }
        String path = parse.getPath();
        if (!pvr.a(path)) {
            str2 = path;
        }
        return host + str2;
    }

    public static String d(String str) {
        Map<String, String> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd8c7dbf", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        if (parse == null || (g = iio.g(parse)) == null || g.size() <= 0) {
            return null;
        }
        return e(g);
    }

    public static String e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774cd6b2", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String str = map.get("userId");
        if (!TextUtils.isEmpty(str)) {
            return Uri.decode(str);
        }
        String str2 = map.get("sellerId");
        if (!TextUtils.isEmpty(str2)) {
            return Uri.decode(str2);
        }
        String str3 = map.get("user_id");
        if (!TextUtils.isEmpty(str3)) {
            return Uri.decode(str3);
        }
        String str4 = map.get("seller_id");
        if (!TextUtils.isEmpty(str4)) {
            return Uri.decode(str4);
        }
        String str5 = map.get("uid");
        if (!TextUtils.isEmpty(str5)) {
            return Uri.decode(str5);
        }
        return null;
    }

    public static String f(String str) {
        Map<String, String> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91a45bb7", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        if (parse == null || (g = iio.g(parse)) == null || g.size() <= 0) {
            return null;
        }
        return g(g);
    }

    public static String g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df1a7bba", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String str = map.get("nick");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = map.get("sellerNick");
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return null;
    }

    public static String h(String str) {
        Map<String, String> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2adeea8", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        if (parse == null || (g = iio.g(parse)) == null || g.size() <= 0) {
            return null;
        }
        return i(g);
    }

    public static String i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a0e3669", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String str = map.get("shop_id");
        if (!TextUtils.isEmpty(str)) {
            return Uri.decode(str);
        }
        String str2 = map.get("shopId");
        if (!TextUtils.isEmpty(str2)) {
            return Uri.decode(str2);
        }
        return null;
    }
}
