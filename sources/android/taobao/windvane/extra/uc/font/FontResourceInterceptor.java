package android.taobao.windvane.extra.uc.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.t2o;
import tb.v7t;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FontResourceInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final List<String> FONT_SUFFIX = Arrays.asList("ttf", "otf", "woff");
    private static final String TAG = "FontResourceInterceptor";

    public static WebResourceResponse interceptFontResources(WebView webView, String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("b98c1e89", new Object[]{webView, str});
        }
        if (!vpw.commonConfig.y1 || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
        } catch (Throwable th) {
            v7t.e(TAG, "font resource load fail", th, new Object[0]);
        }
        if (!str.startsWith("font")) {
            return null;
        }
        String str2 = "";
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf > 0 && lastIndexOf < str.length() - 1) {
            str2 = str.substring(lastIndexOf + 1);
        }
        if (!FONT_SUFFIX.contains(str2)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return null;
        }
        String host = parse.getHost();
        if (TextUtils.isEmpty(host) || (context = webView.getContext()) == null) {
            return null;
        }
        AssetManager assets = context.getResources().getAssets();
        InputStream proxy_open = AssetsDelegate.proxy_open(assets, "iconfonts/" + host);
        if (proxy_open != null) {
            WebResourceResponse webResourceResponse = new WebResourceResponse("font/" + str2, "UTF-8", proxy_open);
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", "*");
            hashMap.put(HttpConstant.CACHE_CONTROL, "max-age=2592000,s-maxage=86400");
            webResourceResponse.setResponseHeaders(hashMap);
            return webResourceResponse;
        }
        return null;
    }

    static {
        t2o.a(989856156);
    }
}
