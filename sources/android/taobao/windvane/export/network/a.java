package android.taobao.windvane.export.network;

import android.os.Handler;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.extra.uc.prefetch.UCDefaultUserAgent;
import android.webkit.CookieManager;
import anet.channel.util.HttpConstant;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.zcache.ResourceResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.c7j;
import tb.ffs;
import tb.ikd;
import tb.jfq;
import tb.lcn;
import tb.rsa;
import tb.t2o;
import tb.vpw;
import tb.y8o;
import tb.yox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCEPTENCODING = "gzip, deflate";
    public static final String ACCEPTLANGSTR = "zh-CN,zh;q=0.9,en-CN;q=0.8,en-US;q=0.7,en;q=0.6;";
    public static final String ACCEPTSTR = "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";

    /* compiled from: Taobao */
    /* renamed from: android.taobao.windvane.export.network.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class RunnableC0003a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f1766a;
        public final /* synthetic */ RequestCallback b;
        public final /* synthetic */ Handler c;

        public RunnableC0003a(Request request, RequestCallback requestCallback, Handler handler) {
            this.f1766a = request;
            this.b = requestCallback;
            this.c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.a(a.this, this.f1766a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(989855869);
        t2o.a(989855863);
    }

    public static /* synthetic */ void a(a aVar, Request request, RequestCallback requestCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adcd4d44", new Object[]{aVar, request, requestCallback, handler});
        } else {
            aVar.d(request, requestCallback, handler);
        }
    }

    public void c(Request request, RequestCallback requestCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71150c06", new Object[]{this, request, requestCallback, handler});
            return;
        }
        if (handler == null) {
            handler = rsa.b().a();
        }
        if (handler == null) {
            d(request, requestCallback, null);
        } else {
            handler.post(new RunnableC0003a(request, requestCallback, handler));
        }
    }

    public final void d(Request request, RequestCallback requestCallback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11b3046", new Object[]{this, request, requestCallback, handler});
            return;
        }
        request.l(Request.StageName.DOCUMENT_REQUEST_THREAD_SWITCHED);
        b(request);
        request.l(Request.StageName.DOCUMENT_REQUEST_HEADER_ADDED);
        String j = request.j();
        if (!vpw.commonConfig.s2 || j.contains("prefetch-disable-zcache=true")) {
            lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("zcacheDisable").a("requestId", Integer.valueOf(request.h())).f();
        } else {
            try {
                ResourceResponse h = yox.h(new y8o(j, request.c()));
                if (!(h == null || h.getError() != null || h.getData() == null)) {
                    ikd i = request.i();
                    if (i != null && !i.a(h.getHeader())) {
                        lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("zcacheInvalid").a("requestId", Integer.valueOf(request.h())).f();
                    }
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, String> entry : h.getHeader().entrySet()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(entry.getValue());
                        hashMap.put(entry.getKey(), arrayList);
                    }
                    requestCallback.onResponse(200, hashMap);
                    requestCallback.onNetworkResponse(200, hashMap);
                    requestCallback.onReceiveData(h.getData());
                    requestCallback.onFinish();
                    lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("zcacheHit").a("requestId", Integer.valueOf(request.h())).f();
                    return;
                }
            } catch (Exception e) {
                lcn.a(RVLLevel.Error, "Themis/Performance/RequestPrefetch").j("zcacheError").a("requestId", Integer.valueOf(request.h())).a("e", e).f();
            }
        }
        request.l(Request.StageName.DOCUMENT_REQUEST_ZCACHE_READ);
        boolean a2 = jfq.a(j);
        if (a2) {
            new c7j().a(request, requestCallback, handler);
        } else {
            new ffs().a(request, requestCallback, null);
        }
        request.l(Request.StageName.DOCUMENT_REQUEST_SENT);
        lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("requestSent").a("isMtopSSRRequest", Boolean.valueOf(a2)).a("requestId", Integer.valueOf(request.h())).a("headers", request.c()).f();
    }

    public final void b(Request request) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3635de5", new Object[]{this, request});
            return;
        }
        request.a(HttpRequest.HEADER_ACCEPT, ACCEPTSTR);
        request.a("Accept-Encoding", ACCEPTENCODING);
        request.a(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, ACCEPTLANGSTR);
        request.a(HttpConstant.USER_AGENT, UCDefaultUserAgent.VALUE);
        if (1 == vpw.commonConfig.g0) {
            try {
                str = CookieManager.getInstance().getCookie(request.j());
            } catch (Throwable th) {
                lcn.a(RVLLevel.Error, "Themis/Performance/RequestPrefetch").j("getCookieError").a("url", Integer.valueOf(request.h())).a("e", th).f();
                str = null;
            }
        } else {
            str = com.uc.webview.export.CookieManager.getInstance().getCookie(request.j());
        }
        if (str != null) {
            request.a("Cookie", str);
        }
    }
}
