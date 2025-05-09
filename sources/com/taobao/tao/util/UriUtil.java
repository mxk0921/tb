package com.taobao.tao.util;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class UriUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894621);
    }

    public static Uri appendQueryParameter(Uri uri, String str, String str2) {
        Uri.Builder buildUpon;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("303a26d0", new Object[]{uri, str, str2});
        }
        if (uri == null) {
            return null;
        }
        if (str == null || str2 == null || (buildUpon = uri.buildUpon()) == null) {
            return uri;
        }
        buildUpon.clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str3 : queryParameterNames) {
                if (!str.equals(str3)) {
                    buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
        }
        buildUpon.appendQueryParameter(str, str2);
        return buildUpon.build();
    }

    public static String getValue(Uri uri, String str) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b262f31", new Object[]{uri, str});
        }
        if (!(uri == null || TextUtils.isEmpty(str) || (queryParameterNames = uri.getQueryParameterNames()) == null)) {
            for (String str2 : queryParameterNames) {
                if (str2.equals(str)) {
                    return uri.getQueryParameter(str);
                }
            }
        }
        return null;
    }

    public static Map<String, String> queryUriParams(Uri uri) {
        String[] strArr;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de19b76b", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String fragment = uri.getFragment();
        String query = uri.getQuery();
        if (fragment == null || !fragment.contains("?")) {
            strArr = null;
        } else {
            strArr = fragment.split("\\?");
        }
        if (strArr != null && strArr.length > 0) {
            fragment = strArr[0];
            query = !TextUtils.isEmpty(query) ? query + "&" + strArr[1] : strArr[1];
        }
        if (fragment != null && fragment.contains("&") && (indexOf = fragment.indexOf("&")) > 0) {
            if (!TextUtils.isEmpty(query)) {
                fragment.substring(indexOf + 1);
            } else {
                fragment.substring(indexOf + 1);
            }
            fragment.substring(0, indexOf);
        }
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String[] strArr2 = (String[]) queryParameterNames.toArray(new String[queryParameterNames.size()]);
            if (strArr2 != null && strArr2.length > 0) {
                for (String str : strArr2) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public static Map<String, String> queryUrlParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("371c4c73", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return queryUriParams(Uri.parse(str));
    }

    public static Uri appendQueryParameter(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("e535a617", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return appendQueryParameter(Uri.parse(str), str2, str3);
    }
}
