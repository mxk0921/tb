package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001970);
    }

    public static Map<String, String> a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("89db37bd", new Object[]{bundle});
        }
        HashMap hashMap = new HashMap();
        if (bundle == null) {
            return hashMap;
        }
        try {
            Set<String> keySet = bundle.keySet();
            if (keySet == null) {
                c4p.n("ParamParseUtil", "bundle keyset is null");
                return hashMap;
            }
            for (String str : keySet) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                }
            }
            return hashMap;
        } catch (Exception unused) {
            c4p.n("ParamParseUtil", "get bundle keyset exception");
            return hashMap;
        }
    }

    public static Map<String, String> b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("75bfd98", new Object[]{intent});
        }
        return c(intent, new HashMap());
    }

    public static Map<String, String> c(Intent intent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("98726337", new Object[]{intent, map});
        }
        if (intent == null) {
            return map;
        }
        map.putAll(d(intent.getData()));
        map.putAll(a(intent.getExtras()));
        return map;
    }

    public static Map<String, String> d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f4b3fc2c", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri == null) {
            return hashMap;
        }
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    public static Map<String, String> e(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("80f12422", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            for (String str2 : str.split("&")) {
                if (str2.contains("=")) {
                    hashMap.put(str2.substring(0, str2.indexOf("=")), str2.substring(str2.indexOf("=") + 1, str2.length()));
                }
            }
        } catch (Exception unused) {
            c4p.n("ParamParseUtil", "parse params from url query error");
        }
        return hashMap;
    }
}
