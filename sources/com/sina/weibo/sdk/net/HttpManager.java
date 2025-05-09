package com.sina.weibo.sdk.net;

import android.content.Context;
import android.text.TextUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HttpManager {
    public static String a(Context context, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        return calcOauthSignNative(context, sb.toString(), str4);
    }

    private static native String calcOauthSignNative(Context context, String str, String str2);

    static {
        t2o.a(988807221);
        System.loadLibrary("weibosdkcore");
    }
}
