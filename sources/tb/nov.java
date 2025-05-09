package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317440);
    }

    public static String a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("585b6fad", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str) || map == null || map.size() == 0) {
            return str;
        }
        Set<String> keySet = map.keySet();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : keySet) {
            Object obj = map.get(str2);
            if (obj != null) {
                buildUpon.appendQueryParameter(str2, obj.toString());
            }
        }
        return buildUpon.toString();
    }

    public static String c(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13b498ad", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getAuthority());
            sb.append(parse.getPath());
            Iterator it = new TreeSet(parse.getQueryParameterNames()).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String queryParameter = parse.getQueryParameter(str2);
                if (TextUtils.isEmpty(queryParameter)) {
                    break;
                }
                if (f(queryParameter)) {
                    queryParameter = c(queryParameter);
                }
                if (i == 0) {
                    sb.append("?");
                    sb.append(str2);
                    sb.append("=");
                    sb.append(queryParameter);
                } else {
                    sb.append("&");
                    sb.append(str2);
                    sb.append("=");
                    sb.append(queryParameter);
                }
                i++;
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static Map<String, String> d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("96e4d4ab", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    public static String e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c838b4f", new Object[]{uri});
        }
        if (uri == null) {
            return "";
        }
        String queryParameter = uri.getQueryParameter("tnode");
        if (!TextUtils.isEmpty(queryParameter)) {
            return Uri.parse(queryParameter).getPath();
        }
        return "";
    }

    public static String b(String str) {
        String str2;
        Uri uri;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13d76d34", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getAuthority());
            sb.append(parse.getPath());
            String queryParameter = parse.getQueryParameter("tnode");
            if (!TextUtils.isEmpty(queryParameter)) {
                uri = nwv.v0(Uri.parse(queryParameter), pl4.sIgnoreTNodeQuery);
                str2 = uri.toString();
            } else {
                uri = null;
                str2 = queryParameter;
            }
            if (uri != null ? TextUtils.equals(uri.getQueryParameter("preload"), "true") : false) {
                sb.append("?");
                sb.append("tnode");
                sb.append("=");
                sb.append(str2);
            } else {
                Iterator it = new TreeSet(parse.getQueryParameterNames()).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    String queryParameter2 = parse.getQueryParameter(str3);
                    if ("tnode".equals(str3)) {
                        queryParameter2 = str2;
                    }
                    if (!TextUtils.isEmpty(queryParameter2) && !pl4.sIgnoreBizQuery.contains(str3) && !"tnodeTime".equals(str3)) {
                        if (f(queryParameter2)) {
                            queryParameter2 = b(queryParameter2);
                        }
                        if (i == 0) {
                            sb.append("?");
                            sb.append(str3);
                            sb.append("=");
                            sb.append(queryParameter2);
                        } else {
                            sb.append("&");
                            sb.append(str3);
                            sb.append("=");
                            sb.append(queryParameter2);
                        }
                        i++;
                    }
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("976348ba", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(h1p.HTTP_PREFIX) || str.startsWith(h1p.HTTPS_PREFIX) || str.startsWith("h5.m.taobao.com") || str.startsWith("wapp.wapa.taobao.com");
    }
}
