package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, String> f30148a;

        static {
            t2o.a(701497364);
        }
    }

    static {
        t2o.a(701497363);
    }

    public static Map<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fcbbd9", new Object[]{uri});
        }
        a c = c(uri);
        if (c != null) {
            return c.f30148a;
        }
        return null;
    }

    public static a c(Uri uri) {
        String[] strArr;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a2e4323b", new Object[]{uri});
        }
        a aVar = new a();
        String[] strArr2 = null;
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String fragment = uri.getFragment();
        if (fragment == null || !fragment.contains("?")) {
            strArr = null;
        } else {
            strArr = fragment.split("\\?");
        }
        String str = "";
        if (strArr != null && strArr.length > 0) {
            fragment = strArr[0];
            str = !TextUtils.isEmpty(str) ? "&" + strArr[1] : strArr[1];
        }
        if (fragment != null && fragment.contains("&") && (indexOf = fragment.indexOf("&")) > 0) {
            if (!TextUtils.isEmpty(str)) {
                str = str + "&" + fragment.substring(indexOf + 1);
            } else {
                str = fragment.substring(indexOf + 1);
            }
            fragment.substring(0, indexOf);
        }
        if (!TextUtils.isEmpty(str)) {
            strArr2 = str.split("&");
        }
        if (strArr2 != null && strArr2.length > 0) {
            for (String str2 : strArr2) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        for (String str3 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str3);
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(queryParameter)) {
                hashMap.put(str3, queryParameter);
            }
        }
        aVar.f30148a = hashMap;
        return aVar;
    }

    public static String b(Map<String, ? extends Serializable> map) {
        String next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2c7082a", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext() && (next = it.next()) != null) {
                if (map.get(next) != null) {
                    String str = (String) map.get(next);
                    if (next.equals("track_params")) {
                        try {
                            str = URLEncoder.encode(str, "UTF-8");
                        } catch (Exception unused) {
                        }
                    }
                    sb.append(next);
                    sb.append("=");
                    sb.append(str);
                    sb.append("&");
                }
            }
            if (sb.length() >= 0) {
                return sb.substring(0, sb.length() - 1);
            }
        }
        return "";
    }
}
