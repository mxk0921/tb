package com.taobao.themis.fallback;

import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.web.runtime.TMSWebScripts;
import com.uc.webview.export.WebView;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.pcp;
import tb.qcp;
import tb.ssq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ServerErrorDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ServerErrorDetector INSTANCE = new ServerErrorDetector();

    static {
        t2o.a(850395142);
    }

    @JvmStatic
    public static final void a(final WebView webView, final AppManifest.PageFallbackStrategy pageFallbackStrategy, final qcp qcpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ae915", new Object[]{webView, pageFallbackStrategy, qcpVar});
            return;
        }
        ckf.g(webView, "webView");
        ckf.g(pageFallbackStrategy, "fallbackStrategy");
        ckf.g(qcpVar, "callback");
        if (!webView.isDestroied()) {
            webView.evaluateJavascript(TMSWebScripts.OUTER_HTML_LENGTH_JS, new ValueCallback() { // from class: com.taobao.themis.fallback.ServerErrorDetector$detect$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public final void onReceiveValue(String str) {
                    Integer m;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    int intValue = (str == null || (m = ssq.m(str)) == null) ? -1 : m.intValue();
                    if (intValue >= 0 && intValue <= AppManifest.PageFallbackStrategy.this.getMinDocumentSize()) {
                        qcpVar.a(new pcp(ErrorType.DOCUMENT_SIZE_TOO_SMALL, ckf.p("document size is too small, size: ", Integer.valueOf(intValue)), null));
                    } else if (!webView.isDestroied()) {
                        WebView webView2 = webView;
                        String a2 = TMSWebScripts.INSTANCE.a(AppManifest.PageFallbackStrategy.this.getRequiredElementsDetection());
                        final qcp qcpVar2 = qcpVar;
                        final AppManifest.PageFallbackStrategy pageFallbackStrategy2 = AppManifest.PageFallbackStrategy.this;
                        webView2.evaluateJavascript(a2, new ValueCallback() { // from class: com.taobao.themis.fallback.ServerErrorDetector$detect$1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public final void onReceiveValue(String str2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("138ac29e", new Object[]{this, str2});
                                    return;
                                }
                                if (!ckf.b(str2, "true")) {
                                    qcp.this.a(new pcp(ErrorType.REQUIRED_ELEMENTS_NOT_FOUND, ckf.p("not all required elements exist, required elements: ", pageFallbackStrategy2.getRequiredElementsDetection()), str2));
                                }
                                qcp.this.onSuccess();
                            }
                        });
                    }
                }
            });
        }
    }
}
