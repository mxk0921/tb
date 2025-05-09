package com.taobao.weex.adapter;

import android.net.Uri;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface URIAdapter {
    public static final String BUNDLE = "bundle";
    public static final String FONT = "font";
    public static final String IMAGE = "image";
    public static final String LINK = "link";
    public static final String OTHERS = "others";
    public static final String REQUEST = "request";
    public static final String VIDEO = "video";
    public static final String WEB = "web";

    Uri rewrite(WXSDKInstance wXSDKInstance, String str, Uri uri);

    Uri rewrite(String str, String str2, Uri uri);
}
