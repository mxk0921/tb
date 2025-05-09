package com.taobao.themis.web.runtime;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.themis.fallback.ErrorType;
import com.taobao.themis.fallback.ServerErrorDetector;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.uc.webview.export.WebResourceRequest;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebView;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Result;
import kotlin.b;
import kotlin.text.Regex;
import tb.a07;
import tb.ckf;
import tb.ct2;
import tb.ges;
import tb.h8s;
import tb.huc;
import tb.i04;
import tb.ies;
import tb.jwd;
import tb.kzw;
import tb.lcs;
import tb.ltw;
import tb.ocs;
import tb.p8s;
import tb.pcp;
import tb.q9s;
import tb.qcp;
import tb.qqm;
import tb.rbe;
import tb.t2o;
import tb.wsq;
import tb.x74;
import tb.xhv;
import tb.yz3;
import tb.z9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSWebViewClient extends WVUCWebViewClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final ocs b;
    public final ITMSPage c;
    public final qqm d;
    public final boolean e;
    public final boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public pcp j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(850395178);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(850395177);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWebViewClient(Context context, ocs ocsVar, ITMSPage iTMSPage, qqm qqmVar) {
        super(context);
        ckf.g(context, "context");
        ckf.g(iTMSPage, "mPage");
        this.b = ocsVar;
        this.c = iTMSPage;
        this.d = qqmVar;
        int h3 = q9s.h3();
        if (h3 == 1) {
            this.e = true;
        } else if (h3 == 2) {
            this.e = true;
            this.f = true;
        }
        TMSLogger.f("TMSWebViewClient", ckf.p("fallbackMode: ", Integer.valueOf(h3)));
        if (qqmVar != null) {
            TMSLogger.f("TMSWebViewClient", "prefetchInfo: " + qqmVar.b + ", " + ((Object) qqmVar.f26884a));
            return;
        }
        TMSLogger.f("TMSWebViewClient", "prefetchInfo: null");
    }

    public static final /* synthetic */ void a(TMSWebViewClient tMSWebViewClient, WebView webView, pcp pcpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28472dbb", new Object[]{tMSWebViewClient, webView, pcpVar});
        } else {
            tMSWebViewClient.e(webView, pcpVar);
        }
    }

    public static final /* synthetic */ void b(TMSWebViewClient tMSWebViewClient, pcp pcpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d51429f", new Object[]{tMSWebViewClient, pcpVar});
        } else {
            tMSWebViewClient.g(pcpVar);
        }
    }

    public static /* synthetic */ Object ipc$super(TMSWebViewClient tMSWebViewClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1725202173:
                return super.shouldInterceptRequest((WebView) objArr[0], (WebResourceRequest) objArr[1]);
            case -1456974963:
                super.onReceivedHttpError((WebView) objArr[0], (WebResourceRequest) objArr[1], (WebResourceResponse) objArr[2]);
                return null;
            case -623958539:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (String) objArr[1]));
            case -486123589:
                return new Boolean(super.shouldOverrideUrlLoading((WebView) objArr[0], (WebResourceRequest) objArr[1]));
            case -332805219:
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            case 534767588:
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            case 1373550412:
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/runtime/TMSWebViewClient");
        }
    }

    public final void c(final WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2ebf8b", new Object[]{this, webView});
        } else {
            ServerErrorDetector.a(webView, this.c.getPageParams().e().h(), new qcp() { // from class: com.taobao.themis.web.runtime.TMSWebViewClient$detectAndNotifyServerError$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qcp
                public void a(pcp pcpVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49468f91", new Object[]{this, pcpVar});
                        return;
                    }
                    ckf.g(pcpVar, OConstant.DIMEN_SERVER_ERROR);
                    CommonExtKt.o(new TMSWebViewClient$detectAndNotifyServerError$1$onError$1(TMSWebViewClient.this, webView, pcpVar));
                }

                @Override // tb.qcp
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        TMSWebViewClient.b(TMSWebViewClient.this, null);
                    }
                }
            });
        }
    }

    public final boolean f(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Uri url;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b41f5d20", new Object[]{this, webView, webResourceRequest, webResourceResponse})).booleanValue();
        }
        if (!(webView == null || webResourceRequest == null || webResourceResponse == null)) {
            try {
                if (!(q9s.K1() && q9s.n3("httpErrorCodeNumbers").contains(Integer.valueOf(webResourceResponse.getStatusCode())) && (url = webResourceRequest.getUrl()) != null)) {
                    return false;
                }
                for (Map.Entry<String, String> entry : h8s.r("enableReloadMap").entrySet()) {
                    String value = entry.getValue();
                    Uri g = ies.g(entry.getKey());
                    if (g != null && TextUtils.equals(g.getPath(), url.getPath()) && TextUtils.equals(g.getHost(), url.getHost()) && TextUtils.equals(g.getScheme(), url.getScheme())) {
                        String b = ges.b(value, url.getQuery(), null, null);
                        if (!TextUtils.isEmpty(b)) {
                            webView.loadUrl(b);
                            return true;
                        }
                    }
                }
            } catch (Exception e) {
                TMSLogger.d("TMSWebViewClient", e);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: all -> 0x00da, TryCatch #0 {all -> 0x00da, blocks: (B:7:0x001f, B:10:0x002c, B:11:0x0030, B:15:0x0084, B:18:0x008b, B:21:0x0095, B:24:0x009c, B:30:0x00b7, B:31:0x00bb, B:34:0x00c3, B:38:0x00cb, B:39:0x00d5), top: B:46:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(tb.pcp r12) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.web.runtime.TMSWebViewClient.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "fe9e3da2"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r11
            r3 = 1
            r2[r3] = r12
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            com.taobao.themis.kernel.page.ITMSPage r0 = r11.c
            tb.ccs r0 = r0.getPageParams()
            tb.unl r0 = r0.e()
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject     // Catch: all -> 0x00da
            r1.<init>()     // Catch: all -> 0x00da
            java.lang.String r2 = "strategy"
            r3 = 0
            if (r12 != 0) goto L_0x002c
            r4 = r3
            goto L_0x0030
        L_0x002c:
            com.taobao.themis.fallback.ErrorType r4 = r12.b()     // Catch: all -> 0x00da
        L_0x0030:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: all -> 0x00da
            r1.put(r2, r4)     // Catch: all -> 0x00da
            java.lang.String r2 = "page_url"
            java.lang.String r4 = r0.k()     // Catch: all -> 0x00da
            r1.put(r2, r4)     // Catch: all -> 0x00da
            java.lang.String r2 = "page_id"
            java.lang.String r0 = r0.g()     // Catch: all -> 0x00da
            r1.put(r2, r0)     // Catch: all -> 0x00da
            java.lang.String r0 = "uniapp_id"
            com.taobao.themis.kernel.page.ITMSPage r2 = r11.c     // Catch: all -> 0x00da
            tb.bbs r2 = r2.getInstance()     // Catch: all -> 0x00da
            java.lang.String r2 = r2.d0()     // Catch: all -> 0x00da
            r1.put(r0, r2)     // Catch: all -> 0x00da
            java.lang.String r0 = "uniapp_version"
            com.taobao.themis.kernel.page.ITMSPage r2 = r11.c     // Catch: all -> 0x00da
            tb.bbs r2 = r2.getInstance()     // Catch: all -> 0x00da
            java.lang.String r2 = tb.r8s.i(r2)     // Catch: all -> 0x00da
            r1.put(r0, r2)     // Catch: all -> 0x00da
            java.lang.String r0 = "uniapp_url"
            com.taobao.themis.kernel.page.ITMSPage r2 = r11.c     // Catch: all -> 0x00da
            tb.bbs r2 = r2.getInstance()     // Catch: all -> 0x00da
            java.lang.String r2 = r2.e0()     // Catch: all -> 0x00da
            r1.put(r0, r2)     // Catch: all -> 0x00da
            java.lang.String r0 = "msg"
            java.lang.String r2 = ""
            if (r12 != 0) goto L_0x0084
        L_0x0082:
            r4 = r2
            goto L_0x008b
        L_0x0084:
            java.lang.String r4 = r12.a()     // Catch: all -> 0x00da
            if (r4 != 0) goto L_0x008b
            goto L_0x0082
        L_0x008b:
            r1.put(r0, r4)     // Catch: all -> 0x00da
            java.lang.String r0 = "value"
            if (r12 != 0) goto L_0x0095
        L_0x0093:
            r4 = r2
            goto L_0x009c
        L_0x0095:
            java.lang.String r4 = r12.c()     // Catch: all -> 0x00da
            if (r4 != 0) goto L_0x009c
            goto L_0x0093
        L_0x009c:
            r1.put(r0, r4)     // Catch: all -> 0x00da
            java.lang.String r0 = "Themis/Fallback"
            tb.mcs.c(r0, r3, r3, r3, r1)     // Catch: all -> 0x00da
            java.lang.Class<com.taobao.themis.kernel.adapter.IMonitorAdapter> r0 = com.taobao.themis.kernel.adapter.IMonitorAdapter.class
            java.lang.Object r0 = tb.p8s.b(r0)     // Catch: all -> 0x00da
            r4 = r0
            com.taobao.themis.kernel.adapter.IMonitorAdapter r4 = (com.taobao.themis.kernel.adapter.IMonitorAdapter) r4     // Catch: all -> 0x00da
            if (r4 != 0) goto L_0x00b0
            goto L_0x00d5
        L_0x00b0:
            java.lang.String r6 = "Themis"
            java.lang.String r7 = "TMSFallback"
            if (r12 != 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            com.taobao.themis.fallback.ErrorType r3 = r12.b()     // Catch: all -> 0x00da
        L_0x00bb:
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch: all -> 0x00da
            if (r12 != 0) goto L_0x00c3
        L_0x00c1:
            r9 = r2
            goto L_0x00cb
        L_0x00c3:
            java.lang.String r12 = r12.a()     // Catch: all -> 0x00da
            if (r12 != 0) goto L_0x00ca
            goto L_0x00c1
        L_0x00ca:
            r9 = r12
        L_0x00cb:
            java.lang.String r10 = r1.toJSONString()     // Catch: all -> 0x00da
            r5 = 0
            r4.trackAlarm(r5, r6, r7, r8, r9, r10)     // Catch: all -> 0x00da
            tb.xhv r3 = tb.xhv.INSTANCE     // Catch: all -> 0x00da
        L_0x00d5:
            java.lang.Object r12 = kotlin.Result.m1108constructorimpl(r3)     // Catch: all -> 0x00da
            goto L_0x00e3
        L_0x00da:
            r12 = move-exception
            java.lang.Object r12 = kotlin.b.a(r12)
            java.lang.Object r12 = kotlin.Result.m1108constructorimpl(r12)
        L_0x00e3:
            java.lang.Throwable r12 = kotlin.Result.m1111exceptionOrNullimpl(r12)
            if (r12 != 0) goto L_0x00ea
            goto L_0x00f1
        L_0x00ea:
            java.lang.String r0 = "TMSWebViewClient"
            java.lang.String r1 = "Failed to report server error"
            com.taobao.themis.kernel.basic.TMSLogger.c(r0, r1, r12)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.web.runtime.TMSWebViewClient.g(tb.pcp):void");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        if (webView != null && str != null) {
            ct2 ct2Var = (ct2) this.c.getExtension(ct2.class);
            if (ct2Var != null) {
                ct2Var.h(webView, str);
            }
            IWebAdapter iWebAdapter = (IWebAdapter) p8s.b(IWebAdapter.class);
            if (iWebAdapter != null) {
                iWebAdapter.onPageStarted(this.c, webView);
            }
        }
    }

    @Override // com.uc.webview.export.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a928538d", new Object[]{this, webView, webResourceRequest, webResourceResponse});
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        f(webView, webResourceRequest, webResourceResponse);
        kzw kzwVar = null;
        if (this.e && webResourceRequest != null && webResourceRequest.isForMainFrame() && webResourceResponse != null && webResourceResponse.getStatusCode() >= 400 && webResourceResponse.getStatusCode() < 600 && (q9s.H0() || this.c.getInstance().a0() == TMSSolutionType.UNIAPP)) {
            ErrorType errorType = ErrorType.STATUS_CODE;
            this.j = new pcp(errorType, "http error, statusCode: " + webResourceResponse.getStatusCode() + ", reasonPhrase: " + ((Object) webResourceResponse.getReasonPhrase()) + ", url: " + webResourceRequest.getUrl(), null);
        }
        if (q9s.N()) {
            rbe rbeVar = (rbe) this.c.getExtension(rbe.class);
            if (rbeVar != null) {
                kzwVar = rbeVar.I();
            }
            if (kzwVar != null) {
                try {
                    kzw I = rbeVar.I();
                    ckf.d(I);
                    ckf.d(webResourceRequest);
                    String uri = webResourceRequest.getUrl().toString();
                    ckf.d(webResourceResponse);
                    I.a(uri, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
                } catch (Throwable th) {
                    TMSLogger.d("TMSWebViewClient", th);
                }
            }
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient
    public void onResourceReceivedZCacheInfo(String str, ltw ltwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a146f9ac", new Object[]{this, str, ltwVar});
            return;
        }
        ckf.g(str, "url");
        ckf.g(ltwVar, "zcacheResponse");
        ct2 ct2Var = (ct2) this.c.getExtension(ct2.class);
        if (ct2Var != null) {
            String str2 = ltwVar.e;
            ckf.f(str2, "zcacheResponse.zcacheInfo");
            ct2Var.l(str, str2);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
        }
        this.h = true;
        IWebAdapter iWebAdapter = (IWebAdapter) p8s.b(IWebAdapter.class);
        if (iWebAdapter == null) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return iWebAdapter.shouldOverrideUrlLoading(this.c, new WebResourceRequest(str, null));
    }

    public final String d(int i, String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b07b1e1f", new Object[]{this, new Integer(i), str});
        }
        try {
            List<String> split = new Regex("_").split(str, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = i04.v0(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = yz3.i();
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return ckf.p("-", Integer.valueOf(Integer.parseInt(strArr[strArr.length - 1])));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (Exception e) {
            TMSLogger.c("TMSWebViewClient", "parse getWebViewError error", e);
            return i + "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.uc.webview.export.WebView r8, tb.pcp r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.themis.web.runtime.TMSWebViewClient.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "9b3f7658"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r8 = 2
            r4[r8] = r9
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            com.taobao.themis.kernel.page.ITMSPage r2 = r7.c
            tb.ccs r2 = r2.getPageParams()
            tb.unl r2 = r2.e()
            boolean r3 = r7.g
            if (r3 != 0) goto L_0x002c
            boolean r3 = r7.f
            if (r3 == 0) goto L_0x002c
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            r7.g = r0
            com.taobao.themis.kernel.page.ITMSPage r4 = r7.c
            tb.bbs r4 = r4.getInstance()
            com.taobao.themis.kernel.solution.TMSSolutionType r4 = r4.a0()
            com.taobao.themis.kernel.solution.TMSSolutionType r5 = com.taobao.themis.kernel.solution.TMSSolutionType.UNIAPP
            if (r4 != r5) goto L_0x0048
            if (r3 == 0) goto L_0x0047
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            com.taobao.themis.kernel.metaInfo.manifest.AppManifest$PageFallbackStrategy r2 = r2.h()
            boolean r4 = r7.f
            java.lang.String r2 = r2.getFallbackPage()
            java.lang.String r5 = "TMSWebViewClient"
            if (r2 == 0) goto L_0x0083
            if (r3 == 0) goto L_0x0083
            r3 = 0
            if (r8 != 0) goto L_0x005d
        L_0x005b:
            r1 = r4
            goto L_0x0079
        L_0x005d:
            boolean r6 = r8.isDestroied()
            if (r6 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r8 = r3
        L_0x0065:
            if (r8 != 0) goto L_0x0068
            goto L_0x005b
        L_0x0068:
            r7.i = r0
            r8.loadUrl(r2)
            java.lang.String r8 = "load fallback page: "
            java.lang.String r8 = tb.ckf.p(r8, r2)
            com.taobao.themis.kernel.basic.TMSLogger.f(r5, r8)
            tb.xhv r3 = tb.xhv.INSTANCE
        L_0x0079:
            if (r3 != 0) goto L_0x0081
            java.lang.String r8 = "webView is destroyed, skip loading fallback page"
            com.taobao.themis.kernel.basic.TMSLogger.f(r5, r8)
        L_0x0081:
            r4 = r1
            goto L_0x0088
        L_0x0083:
            java.lang.String r8 = "Cannot use fallback page"
            com.taobao.themis.kernel.basic.TMSLogger.f(r5, r8)
        L_0x0088:
            if (r4 == 0) goto L_0x0098
            tb.ocs r8 = r7.b
            if (r8 != 0) goto L_0x008f
            goto L_0x0098
        L_0x008f:
            java.lang.String r0 = "TMS_ERR_WEB_SERVER"
            java.lang.String r1 = r9.a()
            r8.b(r0, r1)
        L_0x0098:
            r7.g(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.web.runtime.TMSWebViewClient.e(com.uc.webview.export.WebView, tb.pcp):void");
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
            return;
        }
        super.onPageFinished(webView, str);
        ocs ocsVar = this.b;
        if (ocsVar != null) {
            ocsVar.a();
        }
        WVUCWebView wVUCWebView = webView instanceof WVUCWebView ? (WVUCWebView) webView : null;
        if (wVUCWebView != null) {
            if (q9s.L1()) {
                wVUCWebView.evaluateJavascript(TMSWebScripts.CACHE_STATISTICS_JS);
            }
            if (q9s.Z1() && this.c.getInstance().a0() == TMSSolutionType.WEB_SINGLE_PAGE) {
                ITMSPage iTMSPage = this.c;
                if (iTMSPage != null) {
                    jwd jwdVar = (jwd) iTMSPage.getExtension(jwd.class);
                    if (jwdVar != null && wVUCWebView.getWebViewContext().isHitSnapshot()) {
                        jwdVar.setHitSnapshot(true);
                    }
                    final huc hucVar = (huc) iTMSPage.getExtension(huc.class);
                    if (hucVar != null) {
                        wVUCWebView.evaluateJavascript(huc.Companion.a(), new ValueCallback<String>() { // from class: com.taobao.themis.web.runtime.TMSWebViewClient$onPageFinished$1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public void onReceiveValue(String str2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str2});
                                } else {
                                    huc.this.N(str2);
                                }
                            }
                        });
                        if (!wVUCWebView.isCurrentU4()) {
                            Activity I = this.c.getInstance().I();
                            ckf.f(I, "mPage.getInstance().activity");
                            if (z9.b(I).d()) {
                                wVUCWebView.evaluateJavascript(z9.a());
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (this.i) {
                TMSLogger.f("TMSWebViewClient", "clearHistory");
                try {
                    wVUCWebView.clearHistory();
                    Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th) {
                    Result.m1108constructorimpl(b.a(th));
                }
                this.i = false;
            }
            if (this.h || this.g || !this.e) {
                z = false;
            }
            pcp pcpVar = this.j;
            if (z) {
                if (pcpVar != null) {
                    e(wVUCWebView, pcpVar);
                } else if (this.c.getInstance().a0() == TMSSolutionType.UNIAPP) {
                    c(wVUCWebView);
                }
            }
            this.j = null;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
            return;
        }
        TMSLogger.f("TMSWebViewClient", "onReceivedError " + i + ' ' + ((Object) str2));
        if (i == -205) {
            lcs.Companion.a().add(Integer.valueOf(i));
        }
        if (((!URLUtil.isHttpsUrl(str2) && !URLUtil.isHttpUrl(str2)) || !x74.m(str2)) && ((i > -16 && i < 0) || i == -80 || i == -50)) {
            String url = webView == null ? null : webView.getUrl();
            if (url == null || ckf.b(url, str2)) {
                if (this.b != null) {
                    String str3 = "";
                    if (!(webView instanceof WVUCWebView) || !((WVUCWebView) webView).getWebViewContext().isHitSnapshot()) {
                        if (webView != null) {
                            webView.loadUrl("about:blank", null);
                        }
                        if (webView != null) {
                            webView.setVisibility(4);
                        }
                        ocs ocsVar = this.b;
                        if (str != null) {
                            str3 = str;
                        }
                        String p = ckf.p("TMS_ERR_WEB_", d(i, str3));
                        ocsVar.b(p, ((Object) str) + " [" + i + ']');
                        return;
                    }
                    jwd jwdVar = (jwd) this.c.getExtension(jwd.class);
                    if (jwdVar != null) {
                        jwdVar.setHitSnapshot(true);
                    }
                    ocs ocsVar2 = this.b;
                    if (str != null) {
                        str3 = str;
                    }
                    String p2 = ckf.p("TMS_ERR_WEB_FCC_", d(i, str3));
                    ocsVar2.b(p2, ((Object) str) + " [" + i + ']');
                    return;
                }
                return;
            }
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        WebResourceResponse shouldInterceptRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebResourceResponse) ipChange.ipc$dispatch("992b8103", new Object[]{this, webView, webResourceRequest});
        }
        if (webResourceRequest == null || webView == null || (url = webResourceRequest.getUrl()) == null) {
            return null;
        }
        String uri = url.toString();
        ckf.f(uri, "uri.toString()");
        if (TextUtils.isEmpty(uri)) {
            return null;
        }
        IWebAdapter iWebAdapter = (IWebAdapter) p8s.b(IWebAdapter.class);
        if (iWebAdapter != null && (shouldInterceptRequest = iWebAdapter.shouldInterceptRequest(this.c, webResourceRequest)) != null) {
            return shouldInterceptRequest;
        }
        if (webView.getCurrentViewCoreType() == 3) {
            if (wsq.O(uri, "x-ssr=true", false, 2, null)) {
                TMSLogger.f("TMSWebViewClient", ckf.p("don't intercept ssr request: ", uri));
                return null;
            } else if (webResourceRequest.isForMainFrame()) {
                qqm qqmVar = this.d;
                if (qqmVar != null && android.taobao.windvane.export.network.b.e(qqmVar.b)) {
                    TMSLogger.f("TMSWebViewClient", ckf.p("don't intercept prefetch request: ", uri));
                    return null;
                } else if (android.taobao.windvane.export.network.b.f(uri)) {
                    TMSLogger.f("TMSWebViewClient", ckf.p("don't intercept prefetch request: ", uri));
                    return null;
                }
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e30657bb", new Object[]{this, webView, webResourceRequest})).booleanValue();
        }
        if (webResourceRequest == null) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        IWebAdapter iWebAdapter = (IWebAdapter) p8s.b(IWebAdapter.class);
        if (iWebAdapter == null || url == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return iWebAdapter.shouldOverrideUrlLoading(this.c, webResourceRequest);
    }
}
