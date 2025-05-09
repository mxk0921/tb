package android.taobao.windvane.extra.jsbridge;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.extra.performance.WVWebViewPageModel;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.MegaBridgeJS;
import android.taobao.windvane.jsbridge.WVBridgeEngine;
import android.webkit.JavascriptInterface;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
import tb.ace;
import tb.cce;
import tb.pl4;
import tb.s2d;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.x74;
import tb.xq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVMegaBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AbilityHubAdapter mAbilityHubAdapter;
    private final WVUCWebView mWebView;

    static {
        t2o.a(989855959);
    }

    public WVMegaBridge(WVUCWebView wVUCWebView, AbilityHubAdapter abilityHubAdapter) {
        this.mAbilityHubAdapter = abilityHubAdapter;
        this.mWebView = wVUCWebView;
    }

    public static /* synthetic */ WVUCWebView access$000(WVMegaBridge wVMegaBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("79e61341", new Object[]{wVMegaBridge});
        }
        return wVMegaBridge.mWebView;
    }

    public static /* synthetic */ AbilityHubAdapter access$100(WVMegaBridge wVMegaBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("d5dfc142", new Object[]{wVMegaBridge});
        }
        return wVMegaBridge.mAbilityHubAdapter;
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String getInjectJS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27c608e9", new Object[]{this});
        }
        return this.mWebView.getInjectJS();
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String getMegaBridgeJs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dedbf7f", new Object[]{this});
        }
        if (vpw.commonConfig.e2) {
            return WVBridgeEngine.WINDVANE_CORE_JS;
        }
        return MegaBridgeJS.c();
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String getStages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("254c7ae", new Object[]{this});
        }
        try {
            cce webViewPageModel = this.mWebView.getWebViewContext().getWebViewPageModel();
            if (webViewPageModel instanceof WVWebViewPageModel) {
                return JSON.toJSONString(((WVWebViewPageModel) webViewPageModel).getStageMap());
            }
            return "{}";
        } catch (Exception unused) {
            return "{}";
        }
    }

    @JavascriptInterface
    @com.uc.webview.export.JavascriptInterface
    public String nativeCall(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ffe45e6", new Object[]{this, str, str2, str3});
        }
        ace.a megaHandler = this.mWebView.getWebViewContext().getMegaHandler();
        if (megaHandler != null) {
            return megaHandler.a(str, str2, str3);
        }
        final String[] strArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: android.taobao.windvane.extra.jsbridge.WVMegaBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    xq xqVar = new xq();
                    if (WVMegaBridge.access$000(WVMegaBridge.this) != null) {
                        String url = WVMegaBridge.access$000(WVMegaBridge.this).getUrl();
                        xqVar.d("url", url);
                        xqVar.d(pl4.KEY_PAGE_ID, WVMegaBridge.access$000(WVMegaBridge.this).getCurId());
                        xqVar.p(WVMegaBridge.access$000(WVMegaBridge.this));
                        String customMegaBizId = WVMegaBridge.access$000(WVMegaBridge.this).getWebViewContext().getCustomMegaBizId();
                        String customMegaNamespace = WVMegaBridge.access$000(WVMegaBridge.this).getWebViewContext().getCustomMegaNamespace();
                        if (vpw.commonConfig.o2) {
                            xqVar.j(x74.b(url, customMegaBizId, customMegaNamespace, WVMegaBridge.access$000(WVMegaBridge.this).getContext()));
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    ExecuteResult z = WVMegaBridge.access$100(WVMegaBridge.this).z(str, str2, xqVar, JSON.parseObject(str3), new s2d() { // from class: android.taobao.windvane.extra.jsbridge.WVMegaBridge.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.s2d
                        public void onCallback(ExecuteResult executeResult) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                            }
                        }
                    });
                    if (z != null) {
                        strArr[0] = new JSONObject(z.toFormattedData()).toJSONString();
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    if (vpw.commonConfig.A2) {
                        long j = uptimeMillis2 - uptimeMillis;
                        if (j > 100 || strArr[0] == null) {
                            String str4 = strArr[0];
                            int length = str4 == null ? 0 : str4.length();
                            v7t.d("WVMegaBridge", "API: " + str + "." + str2 + " cost: " + j + " resLen: " + length);
                        }
                    }
                } catch (Throwable th) {
                    String[] strArr2 = strArr;
                    if (strArr2[0] == null) {
                        strArr2[0] = ErrorResult.a.f(th.getMessage()).toFormattedData().toString();
                    }
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return strArr[0];
    }
}
