package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ies {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Uri> f21278a = new LruCache<>(20);

    static {
        t2o.a(849346581);
        new LruCache(20);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("990a5a69", new Object[]{str, str2})).booleanValue();
        }
        Uri g = g(str);
        Uri g2 = g(str2);
        if (!(TextUtils.equals(g.getHost(), g2.getHost()) && TextUtils.equals(g.getPath(), g2.getPath()) && TextUtils.equals(g.getFragment(), g2.getFragment()))) {
            return false;
        }
        Map<String, String> e = e(str);
        Map<String, String> e2 = e(str2);
        if (e.size() == e2.size()) {
            for (String str3 : e.keySet()) {
                if (e2.containsKey(str3)) {
                    if (!e.get(str3).equals(e2.get(str3))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String b(String str) {
        String str2;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d31ef82b", new Object[]{str});
        }
        Uri g = g(str);
        if (g != null) {
            str2 = g.getFragment();
        } else {
            str2 = null;
        }
        if (str2 != null && (indexOf = str2.indexOf("?")) > 0) {
            str2 = str2.substring(0, indexOf);
        }
        if (str2 == null || !str2.startsWith("/")) {
            return str2;
        }
        return str2.substring(1);
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82bd2d51", new Object[]{str, str2});
        }
        return d(str, str2, false);
    }

    public static String d(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7826a1bb", new Object[]{str, str2, new Boolean(z)});
        }
        Map<String, String> f = f(str, z);
        if (f == null) {
            return null;
        }
        return f.get(str2);
    }

    public static Map<String, String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e6224a5", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f(str, false);
    }

    public static Uri g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("5c5ce684", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LruCache<String, Uri> lruCache = f21278a;
        Uri uri = lruCache.get(str);
        if (uri != null) {
            return uri;
        }
        try {
            uri = Uri.parse(str);
            lruCache.put(str, uri);
            return uri;
        } catch (Exception e) {
            Log.e("URLUtils", "parse url exception.", e);
            return uri;
        }
    }

    public static Map<String, String> f(String str, boolean z) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c997d99", new Object[]{str, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        if (z) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        try {
            split = str.split("\\?");
        } catch (Exception e) {
            Log.e("URLUtils", "parse URL param error " + e.getMessage());
        }
        if (split.length < 2) {
            return hashMap;
        }
        String str2 = split[1];
        String[] split2 = str2.split("#");
        if (split2.length > 1) {
            str2 = split2[0];
        }
        for (String str3 : str2.split("&")) {
            String[] split3 = str3.split("=");
            if (split3.length == 2) {
                hashMap.put(split3[0], split3[1]);
            } else if (split3.length >= 2) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < split3.length; i++) {
                    sb.append(split3[i]);
                    if (i != split3.length - 1) {
                        sb.append("=");
                    }
                }
                hashMap.put(split3[0], sb.toString());
            }
        }
        return hashMap;
    }
}
