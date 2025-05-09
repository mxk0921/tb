package com.taobao.weex.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import tb.itw;
import tb.qj4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UriUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(773849135);
    }

    public static Uri addScheme(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("4942af1", new Object[]{uri});
        }
        if (!TextUtils.isEmpty(uri.getScheme())) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        if (uri.getHost() == null) {
            String uri2 = uri.toString();
            buildUpon = Uri.parse(itw.URL_SEPARATOR + uri2).buildUpon();
        }
        buildUpon.scheme("http");
        return buildUpon.build();
    }

    public static Uri getBundleUri(Uri uri) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("20222683", new Object[]{uri});
        }
        if (uri.getBooleanQueryParameter(qj4.h, false)) {
            return uri;
        }
        String queryParameter = uri.getQueryParameter(qj4.g);
        WXLogUtils.d("TBWXNavPreProcessor", "origin WX_TPL:" + queryParameter);
        if (TextUtils.isEmpty(queryParameter) || (parse = Uri.parse(queryParameter)) == null) {
            return null;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder buildUpon = parse.buildUpon();
        for (String str : queryParameterNames) {
            if (!TextUtils.equals(str, qj4.g)) {
                buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return buildUpon.build();
    }
}
