package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.uc.webview.export.AsyncJavascriptInterface;
import com.uc.webview.export.JavascriptInterface;
import com.uc.webview.export.extension.JSInterface;
import java.io.Serializable;
import kotlin.Metadata;
import tb.ckf;
import tb.d1a;
import tb.icn;
import tb.lcn;
import tb.t2o;
import tb.vpw;
import tb.yd1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\n\u001a\u00060\tR\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroid/taobao/windvane/extra/jsbridge/CommonAsyncJSAPIBridge;", "Lcom/uc/webview/export/extension/JSInterface;", "Ljava/io/Serializable;", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "webView", "<init>", "(Landroid/taobao/windvane/extra/uc/WVUCWebView;)V", "", "callToken", "Lcom/uc/webview/export/extension/JSInterface$JSRoute;", "targetJSRoute", "", "success", "result", "keepAlive", "Ltb/xhv;", "sendJSResult", "(Ljava/lang/String;Lcom/uc/webview/export/extension/JSInterface$JSRoute;ZLjava/lang/String;Z)V", "getResultForLogging", "(Ljava/lang/String;)Ljava/lang/String;", DxContainerActivity.PARAMS_NAMESPACE, FluidException.METHOD_NAME, "methodParam", "invokeNativeMethod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parentId", "Ljava/lang/String;", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "getWebView", "()Landroid/taobao/windvane/extra/uc/WVUCWebView;", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CommonAsyncJSAPIBridge extends JSInterface implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String parentId;
    private final WVUCWebView webView;

    static {
        t2o.a(989855939);
    }

    public CommonAsyncJSAPIBridge(WVUCWebView wVUCWebView) {
        ckf.g(wVUCWebView, "webView");
        this.webView = wVUCWebView;
        this.parentId = wVUCWebView.getCurId();
    }

    public static final /* synthetic */ String access$getParentId$p(CommonAsyncJSAPIBridge commonAsyncJSAPIBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea08e670", new Object[]{commonAsyncJSAPIBridge});
        }
        return commonAsyncJSAPIBridge.parentId;
    }

    private final String getResultForLogging(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90b3b046", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        if (str.length() < 10000) {
            return str;
        }
        return "RESULT_TOO_LONG";
    }

    public static /* synthetic */ Object ipc$super(CommonAsyncJSAPIBridge commonAsyncJSAPIBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/jsbridge/CommonAsyncJSAPIBridge");
    }

    public static /* synthetic */ void sendJSResult$default(CommonAsyncJSAPIBridge commonAsyncJSAPIBridge, String str, JSInterface.JSRoute jSRoute, boolean z, String str2, boolean z2, int i, Object obj) {
        String str3;
        boolean z3;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819e0c48", new Object[]{commonAsyncJSAPIBridge, str, jSRoute, new Boolean(z), str2, new Boolean(z2), new Integer(i), obj});
            return;
        }
        if ((4 & i) == 0) {
            z4 = z;
        }
        if ((i & 8) != 0) {
            str3 = "";
        } else {
            str3 = str2;
        }
        if ((i & 16) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        commonAsyncJSAPIBridge.sendJSResult(str, jSRoute, z4, str3, z3);
    }

    public final WVUCWebView getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("151ffdcd", new Object[]{this});
        }
        return this.webView;
    }

    @AsyncJavascriptInterface
    @JavascriptInterface
    public final void invokeNativeMethod(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f9221f", new Object[]{this, str, str2, str3, str4});
        } else if (!this.webView.isDestroied()) {
            final CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 commonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1 = new CommonAsyncJSAPIBridge$invokeNativeMethod$apiCallBlock$1(this, str, str2, str3, str4, getJSRoute(), getUrl());
            yd1 asyncApiProxy = this.webView.getAsyncApiProxy();
            if (asyncApiProxy != null) {
                asyncApiProxy.apiCall(new Runnable() { // from class: android.taobao.windvane.extra.jsbridge.CommonAsyncJSAPIBridge$sam$java_lang_Runnable$0
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ckf.f(d1a.this.invoke(), "invoke(...)");
                        }
                    }
                });
            }
        }
    }

    private final void sendJSResult(String str, JSInterface.JSRoute jSRoute, boolean z, String str2, boolean z2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e690c6e", new Object[]{this, str, jSRoute, new Boolean(z), str2, new Boolean(z2)});
        } else if (!this.webView.isDestroied()) {
            if (vpw.commonConfig.C2) {
                icn k = lcn.a(RVLLevel.Info, "Bridge").m(this.parentId).k("callback", str);
                if (z) {
                    str3 = "SUCCESS";
                } else {
                    str3 = "FAILED";
                }
                k.a("status", str3).a("result", getResultForLogging(str2)).a("keepAlive", Boolean.valueOf(z2)).f();
            }
            jSRoute.send(new Object[]{Boolean.valueOf(z), str2, str, Boolean.valueOf(z2)}, null);
        }
    }
}
