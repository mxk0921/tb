package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jov {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TT_DETAIL_TMP_HOST = "internal.tt.detail.taobao.com";

    static {
        t2o.a(912262867);
    }

    public static String a(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b45080a", new Object[]{str, map});
        }
        return b(str, map, true);
    }

    public static String b(String str, Map<String, ? extends Object> map, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecac3fe5", new Object[]{str, map, new Boolean(z)});
        }
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty()) {
            try {
                HashMap hashMap = new HashMap();
                Uri parse = Uri.parse(str);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str3 : queryParameterNames) {
                        hashMap.put(str3, parse.getQueryParameter(str3));
                    }
                }
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.clearQuery();
                HashMap hashMap2 = new HashMap();
                if (z) {
                    hashMap2.putAll(hashMap);
                    hashMap2.putAll(map);
                } else {
                    hashMap2.putAll(map);
                    hashMap2.putAll(hashMap);
                }
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Object value = entry.getValue();
                    String str4 = (String) entry.getKey();
                    if (value != null) {
                        str2 = String.valueOf(value);
                    } else {
                        str2 = "";
                    }
                    buildUpon.appendQueryParameter(str4, str2);
                }
                return buildUpon.toString();
            } catch (Exception e) {
                tgh.c(kov.TAG, "appendUrlParams error: ", e);
            }
        }
        return str;
    }

    public static Uri c(Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("eef780bf", new Object[]{uri});
        }
        String scheme = uri.getScheme();
        String uri2 = uri.toString();
        if (scheme == null) {
            if (uri2.startsWith(itw.URL_SEPARATOR)) {
                str = "http:".concat(uri2);
            } else {
                str = h1p.HTTP_PREFIX.concat(uri2);
            }
            return Uri.parse(str);
        } else if (!scheme.startsWith(itw.URL_SEPARATOR)) {
            return uri;
        } else {
            return Uri.parse("http:" + uri2);
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80f42702", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(h1p.HTTP_PREFIX) || str.startsWith(h1p.HTTPS_PREFIX)) {
            return str;
        }
        if (str.startsWith(itw.URL_SEPARATOR)) {
            return uyv.HTTPS_SCHEMA.concat(str);
        }
        return h1p.HTTPS_PREFIX.concat(str);
    }

    public static String e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40cede2a", new Object[]{str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            if (z) {
                return str;
            }
            return "";
        } else if (str.startsWith(h1p.HTTP_PREFIX) || str.startsWith(h1p.HTTPS_PREFIX)) {
            return str;
        } else {
            if (str.startsWith(itw.URL_SEPARATOR)) {
                return uyv.HTTPS_SCHEMA.concat(str);
            }
            return h1p.HTTPS_PREFIX.concat(str);
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7214c94", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri c = c(Uri.parse(str));
            return c.getAuthority() + c.getPath();
        } catch (Throwable th) {
            tgh.c(kov.TAG, "extractUrlHostPath error with url: " + str, th);
            return null;
        }
    }

    public static Map<String, String> g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("39aeb056", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri == null) {
            return hashMap;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static boolean h(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e205851", new Object[]{intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        ComponentName component = intent.getComponent();
        Uri data = intent.getData();
        if (component == null || data == null) {
            if (component != null) {
                return TextUtils.equals("com.taobao.android.detail.alittdetail.TTDetailActivity", component.getClassName());
            }
            if (data != null) {
                return TextUtils.equals(TT_DETAIL_TMP_HOST, data.getAuthority());
            }
            if (!TextUtils.isEmpty(intent.getStringExtra("detailRequestId"))) {
                return true;
            }
            return false;
        } else if (!TextUtils.equals("com.taobao.android.detail.alittdetail.TTDetailActivity", component.getClassName()) || !TextUtils.equals(TT_DETAIL_TMP_HOST, data.getAuthority())) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean i(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("759e60ce", new Object[]{runtimeAbilityParamArr})).booleanValue();
        }
        if (runtimeAbilityParamArr == null) {
            return false;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("appendURLParamsOnly".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof Boolean) {
                    return ((Boolean) value).booleanValue();
                }
            }
        }
        return false;
    }

    public static boolean j(Context context, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48195a72", new Object[]{context, bundle, str})).booleanValue();
        }
        return xq0.c().a(context).d(bundle).c(str);
    }

    public static boolean k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa1fe2fe", new Object[]{context, str})).booleanValue();
        }
        return xq0.c().a(context).c(str);
    }

    public static Uri l(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("9f1b6ccc", new Object[]{uri, str});
        }
        return uri.buildUpon().authority(str).build();
    }
}
