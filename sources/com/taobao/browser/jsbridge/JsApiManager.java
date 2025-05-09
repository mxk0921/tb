package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.taobao.windvane.extra.jsbridge.TBJsApiManager;
import android.taobao.windvane.jsbridge.api.WVMotion;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.windvane.TBACCS;
import com.taobao.tao.Globals;
import tb.fsw;
import tb.t2o;
import tb.vpw;
import tb.y7t;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JsApiManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = JsApiManager.class.getSimpleName();

    static {
        t2o.a(619708514);
        try {
            if (Globals.getApplication() != null) {
                yaa.n = Globals.getApplication();
            }
        } catch (Exception e) {
            y7t.a(TAG, "config Observer update config fail: " + e.getMessage());
        }
    }

    public static void initJsApiInPha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676ff4aa", new Object[0]);
            return;
        }
        CommonJsApiManager.initCommonJsbridge();
        if (vpw.commonConfig.Z0) {
            TBJsApiManager.initJsApi();
        }
        fsw.i("WVACCS", TBACCS.class, true);
        fsw.i("WebAppInterface", WebAppInterface.class, true);
        fsw.i("WVDevelopTool", DevelopTool.class, true);
    }

    public static void initJsApi(Activity activity, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7946ede", new Object[]{activity, iWVWebView});
        } else if (activity == null || iWVWebView == null) {
            throw new NullPointerException("init js api, context, handler or webview should not be null.");
        } else {
            CommonJsApiManager.initCommonJsbridge(activity);
            if (vpw.commonConfig.Z0) {
                TBJsApiManager.initJsApi();
            }
            fsw.i("WVNative", TBNative.class, true);
            fsw.i("WVACCS", TBACCS.class, true);
            fsw.i("WebAppInterface", WebAppInterface.class, true);
            fsw.i("Base", WVWindow.class, true);
            fsw.i("WVCameraPlus", WVCameraPlus.class, true);
            fsw.i("WVUICityList", WVUICityList.class, true);
            fsw.f("WVCamera", "takePhotoPlus", "WVCameraPlus", "takePhotoPlus");
            fsw.i("TBURLCache", TBUrlCacheAndDevice.class, true);
            fsw.i("TBDeviceInfo", TBUrlCacheAndDevice.class, true);
            fsw.i("TBQGURLCache", TBUrlCacheAndDevice.class, true);
            fsw.i("WVDevelopTool", DevelopTool.class, true);
            WVTBBase wVTBBase = new WVTBBase();
            wVTBBase.initialize(activity.getApplicationContext(), iWVWebView);
            iWVWebView.addJsObject("TBBase", wVTBBase);
            WVMotion wVMotion = new WVMotion();
            wVMotion.initialize(activity, iWVWebView);
            iWVWebView.addJsObject("WVMotion", wVMotion);
            if (yaa.n == null) {
                yaa.n = activity.getApplication();
            }
        }
    }
}
