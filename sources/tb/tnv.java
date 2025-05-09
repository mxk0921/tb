package tb;

import android.net.Uri;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544440);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c41ab4d", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(":");
        if (str.charAt(1 + indexOf) == '/' && str.charAt(indexOf + 2) == '/') {
            return str;
        }
        return itw.URL_SEPARATOR.concat(str);
    }

    @Deprecated
    public static URI b(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("16179b22", new Object[]{str, str2, new Integer(i), str3, str4, str5});
        }
        return new URI(c(str, str2, i, str3, str4, str5));
    }

    public static String c(String str, String str2, int i, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3681c47b", new Object[]{str, str2, new Integer(i), str3, str4, str5});
        }
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append(HttpConstant.SCHEME_SPLIT);
            } else {
                sb.append(itw.URL_SEPARATOR);
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(f7l.CONDITION_IF_MIDDLE);
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append(wh6.DIR);
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append(f7l.CONDITION_IF);
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return sb.toString();
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1654a8f", new Object[]{str, str2});
        }
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public static String e(Map<String, String> map, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fa233b3", new Object[]{map, str});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String d = d(entry.getKey(), str);
            String value = entry.getValue();
            if (value != null) {
                str2 = d(value, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(d);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }

    public static String f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8dcd5a9d", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value == null) {
                value = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(value);
        }
        return sb.toString();
    }

    public static Map<String, String> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af930a26", new Object[]{str});
        }
        unv c = unv.c(str);
        Set<String> b = c.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : b) {
            linkedHashMap.put(str2, c.a(str2));
        }
        return linkedHashMap;
    }

    @Deprecated
    public static LinkedHashMap<String, String> h(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("60456ca0", new Object[]{uri});
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (String str : queryParameterNames) {
            linkedHashMap.put(str, uri.getQueryParameter(str));
        }
        return linkedHashMap;
    }

    public static LinkedHashMap<String, String> i(LinkedHashMap<String, String> linkedHashMap, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("3a506f80", new Object[]{linkedHashMap, uri});
        }
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
        LinkedHashMap<String, String> h = h(uri);
        if (h != null && !h.isEmpty()) {
            linkedHashMap2.putAll(h);
        }
        return linkedHashMap2;
    }

    public static Uri j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("fd7cfcc1", new Object[]{str});
        }
        return k(str, true);
    }

    public static Uri k(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3f7591c1", new Object[]{str, new Boolean(z)});
        }
        if (z) {
            try {
                str = a(str);
            } catch (Exception e) {
                ogh.j("UriUtils", "Uri parse fail", e);
                return null;
            }
        }
        return Uri.parse(str);
    }
}
