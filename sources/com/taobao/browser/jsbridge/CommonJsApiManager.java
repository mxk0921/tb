package com.taobao.browser.jsbridge;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.WVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import com.taobao.tao.favorite.jsbridge.FavoriteJsBridge;
import tb.fsw;
import tb.ivf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CommonJsApiManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708506);
    }

    @Deprecated
    public static void initCommonJsbridge(Context context, WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e4dfad", new Object[]{context, wVWebView});
        } else {
            initCommonJsbridge(context);
        }
    }

    @Deprecated
    public static void initCommonJsbridge(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548bbf98", new Object[]{context, iWVWebView});
        } else {
            initCommonJsbridge(context);
        }
    }

    @Deprecated
    public static void initCommonJsbridge(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3c5df4", new Object[]{context});
        } else {
            initCommonJsbridge();
        }
    }

    public static void initCommonJsbridge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5bf454", new Object[0]);
            return;
        }
        try {
            fsw.i("TBUserTrackHelper", TBUserTrackHelper.class, true);
            fsw.i("TBWeakNetStatus", TBWeakNetStatus.class, true);
            fsw.i("WVLocation", WVLocationProxy.class, true);
            fsw.i("H5AudioPlayer", H5AudioPlayer.class, true);
            fsw.i("WVUIImagepreview", WVUIImagepreview.class, true);
            fsw.i("WVTBLocation", WVTBLocation.class, true);
            fsw.i("WVClient", WVClient.class, true);
            fsw.i("TBWVSecurity", TBWVSecurity.class, true);
            fsw.i(PayPasswrdValidateBridge.PLUGIN_NAME, PayPasswrdValidateBridge.class, true);
            ivf.a();
            fsw.i("TBFavoriteModule", FavoriteJsBridge.class, true);
            fsw.i("TBWVDialog", TBWVDialog.class, true);
            fsw.i("WVUIToast", TBWVToast.class, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
