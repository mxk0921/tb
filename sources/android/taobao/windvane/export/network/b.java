package android.taobao.windvane.export.network;

import android.os.Handler;
import android.taobao.windvane.export.network.Request;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.esd;
import tb.icn;
import tb.jfq;
import tb.lcn;
import tb.rsa;
import tb.t2o;
import tb.vpw;
import tb.y71;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, RequestCache> f1767a = new LinkedHashMap();
    public static final Object b = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a extends RequestCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Request f1768a;
        public final /* synthetic */ RequestCache b;
        public final /* synthetic */ RequestCallback c;
        public final /* synthetic */ int d;

        public a(Request request, RequestCache requestCache, RequestCallback requestCallback, int i) {
            this.f1768a = request;
            this.b = requestCache;
            this.c = requestCallback;
            this.d = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/export/network/NetworkService$1");
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onCustomCallback(int i, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i), objArr});
                return;
            }
            this.b.onCustomCallback(i, objArr);
            RequestCallback requestCallback = this.c;
            if (requestCallback != null) {
                requestCallback.onCustomCallback(i, objArr);
            }
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            this.b.onError(i, str);
            RequestCallback requestCallback = this.c;
            if (requestCallback != null) {
                requestCallback.onError(i, str);
            }
            lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("finish").a("requestId", Integer.valueOf(this.d)).a("success", Boolean.FALSE).a("errorMsg", str).f();
            this.f1768a.l(Request.StageName.DOCUMENT_REQUEST_END);
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            this.b.onFinish();
            RequestCallback requestCallback = this.c;
            if (requestCallback != null) {
                requestCallback.onFinish();
            }
            lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("finish").a("requestId", Integer.valueOf(this.d)).a("success", Boolean.TRUE).f();
            this.f1768a.l(Request.StageName.DOCUMENT_REQUEST_END);
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onNetworkResponse(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
                return;
            }
            this.f1768a.l(Request.StageName.DOCUMENT_NETWORK_TTFB);
            this.b.onNetworkResponse(i, map);
            RequestCallback requestCallback = this.c;
            if (requestCallback != null) {
                requestCallback.onNetworkResponse(i, map);
            }
            lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("onNetworkResponse").a("requestId", Integer.valueOf(this.d)).a("headers", map).f();
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onReceiveData(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
                return;
            }
            this.b.onReceiveData(bArr);
            RequestCallback requestCallback = this.c;
            if (requestCallback != null) {
                requestCallback.onReceiveData(bArr);
            }
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onResponse(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
                return;
            }
            this.f1768a.l(Request.StageName.DOCUMENT_TTFB);
            this.b.onResponse(i, map);
            RequestCallback requestCallback = this.c;
            if (requestCallback != null) {
                requestCallback.onResponse(i, map);
            }
            lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("onResponse").a("requestId", Integer.valueOf(this.d)).a("headers", map).f();
        }
    }

    /* compiled from: Taobao */
    /* renamed from: android.taobao.windvane.export.network.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class RunnableC0004b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1769a;
        public final /* synthetic */ String b;

        public RunnableC0004b(int i, String str) {
            this.f1769a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (b.j(this.f1769a)) {
                lcn.a(RVLLevel.Error, "Themis/Performance/RequestPrefetch").j("prefetchExpired").a("requestId", Integer.valueOf(this.f1769a)).f();
                b.a(this.b);
            }
        }
    }

    static {
        t2o.a(989855871);
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            k(str);
        }
    }

    public static boolean b(int i, RequestCallback requestCallback, esd esdVar) {
        RequestCache remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8433afff", new Object[]{new Integer(i), requestCallback, esdVar})).booleanValue();
        }
        synchronized (b) {
            remove = f1767a.remove(Integer.valueOf(i));
        }
        if (remove == null) {
            return false;
        }
        return d(remove, requestCallback, esdVar);
    }

    public static boolean c(String str, RequestCallback requestCallback, esd esdVar) {
        RequestCache requestCache;
        Integer num;
        Exception e;
        Request c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49d73f21", new Object[]{str, requestCallback, esdVar})).booleanValue();
        }
        synchronized (b) {
            requestCache = null;
            try {
            } catch (Exception e2) {
                e = e2;
                requestCache = null;
            }
            for (Map.Entry entry : ((LinkedHashMap) f1767a).entrySet()) {
                requestCache = (RequestCache) entry.getValue();
                if (requestCache != null && requestCache.d() && (c2 = requestCache.c()) != null && c2.g().a(str, c2.j())) {
                    try {
                        num = (Integer) entry.getKey();
                    } catch (Exception e3) {
                        e = e3;
                        lcn.f(RVLLevel.Error, "Themis/Performance/RequestPrefetch", "consumePrefetchResponseWithUrl error: " + e.getMessage());
                        num = null;
                        break;
                        if (requestCache == null) {
                            f1767a.remove(num);
                        }
                        return d(requestCache, requestCallback, esdVar);
                    }
                    break;
                }
            }
            num = null;
            if (!(requestCache == null || num == null)) {
                f1767a.remove(num);
            }
        }
        return d(requestCache, requestCallback, esdVar);
    }

    public static boolean e(int i) {
        boolean containsKey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c024c083", new Object[]{new Integer(i)})).booleanValue();
        }
        synchronized (b) {
            containsKey = f1767a.containsKey(Integer.valueOf(i));
        }
        return containsKey;
    }

    public static int g(Request request, RequestCallback requestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2e9751c", new Object[]{request, requestCallback})).intValue();
        }
        return h(request, requestCallback, false);
    }

    public static int h(Request request, RequestCallback requestCallback, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d602a01", new Object[]{request, requestCallback, new Boolean(z)})).intValue();
        }
        Request request2 = new Request(request);
        request2.l(Request.StageName.DOCUMENT_REQUEST_START);
        int i = -1;
        if (request2.d()) {
            if (jfq.a(request2.j())) {
                request2.a("x-s-first-chunk", "true");
            } else {
                if (requestCallback != null) {
                    requestCallback.onError(-1, "url not in ssr white list");
                }
                return request2.h();
            }
        }
        RequestCache requestCache = new RequestCache(request2);
        requestCache.e(z);
        int h = request2.h();
        String j = request2.j();
        try {
            i = f1767a.size();
        } catch (Exception unused) {
        }
        lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("sendRequest").a("existingPrefetchCount", Integer.valueOf(i)).a("requestId", Integer.valueOf(h)).a("url", request2.j()).a("headers", request2.c()).f();
        new android.taobao.windvane.export.network.a().c(request2, new a(request2, requestCache, requestCallback, h), null);
        synchronized (b) {
            f1767a.put(Integer.valueOf(h), requestCache);
        }
        Handler a2 = rsa.b().a();
        if (a2 != null) {
            a2.postDelayed(new RunnableC0004b(h, j), 30000L);
        }
        return h;
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f60186b", new Object[]{str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        y71.commitSuccess("wvPrefetchExpired", jSONObject.toJSONString());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class c implements esd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f1770a;
        public final icn b = lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("prefetchTiming");
        public int c = 0;
        public final /* synthetic */ esd d;
        public final /* synthetic */ Request e;

        public c(esd esdVar, Request request) {
            this.d = esdVar;
            this.e = request;
        }

        @Override // tb.esd
        public void recordProperty(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d2bd161", new Object[]{this, str, str2});
                return;
            }
            esd esdVar = this.d;
            if (esdVar != null) {
                esdVar.recordProperty(str, str2);
            }
        }

        @Override // tb.esd
        public void recordStage(String str, long j) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a661a86", new Object[]{this, str, new Long(j)});
                return;
            }
            esd esdVar = this.d;
            if (esdVar != null) {
                esdVar.recordStage(str, j);
            }
            if (Request.StageName.DOCUMENT_REQUEST_START.equals(str)) {
                this.f1770a = j;
            } else {
                this.b.a(str, Long.valueOf(j - this.f1770a));
            }
            if (Request.StageName.DOCUMENT_REQUEST_END.equals(str) || Request.StageName.DOCUMENT_PREFETCH_CONSUME.equals(str)) {
                this.c++;
            }
            if (this.c == 2) {
                try {
                    icn icnVar = this.b;
                    if (this.d == null) {
                        str2 = "system";
                    } else {
                        str2 = "uc";
                    }
                    icnVar.a("type", str2).a("requestId", Integer.valueOf(this.e.h())).a("url", this.e.j()).f();
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void i(Request request) {
        Request c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67a7849", new Object[]{request});
        } else if (!vpw.commonConfig.m2) {
            lcn.a(RVLLevel.Error, "Themis/Performance/RequestPrefetch").j("sharedResourcePrefetch disabled").f();
        } else {
            synchronized (b) {
                Map<Integer, RequestCache> map = f1767a;
                if (map.size() >= 30) {
                    RVLLevel rVLLevel = RVLLevel.Error;
                    lcn.f(rVLLevel, "Themis/Performance/RequestPrefetch", "sharedResource prefetch count exceed limit, url: " + request.j());
                    return;
                }
                try {
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        RequestCache requestCache = (RequestCache) entry.getValue();
                        if (requestCache != null && requestCache.d() && (c2 = requestCache.c()) != null && c2.g().a(request.j(), c2.j())) {
                            RVLLevel rVLLevel2 = RVLLevel.Error;
                            lcn.f(rVLLevel2, "Themis/Performance/RequestPrefetch", "sharedResource url already exist, url: " + request.j());
                            return;
                        }
                    }
                } catch (Exception unused) {
                }
                h(request, null, true);
            }
        }
    }

    public static boolean d(RequestCache requestCache, RequestCallback requestCallback, esd esdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47c7967", new Object[]{requestCache, requestCallback, esdVar})).booleanValue();
        }
        if (requestCache == null || !requestCache.b(requestCallback)) {
            return false;
        }
        Request c2 = requestCache.c();
        c2.l(Request.StageName.DOCUMENT_PREFETCH_CONSUME);
        c2.b(new c(esdVar, c2));
        lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("consume").a("requestId", Integer.valueOf(c2.h())).a("url", c2.j()).a("isShared", Boolean.valueOf(requestCache.d())).f();
        return true;
    }

    public static boolean f(String str) {
        RequestCache requestCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6ce03d2", new Object[]{str})).booleanValue();
        }
        synchronized (b) {
            requestCache = null;
            try {
                Iterator it = ((LinkedHashMap) f1767a).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RequestCache requestCache2 = (RequestCache) ((Map.Entry) it.next()).getValue();
                    if (requestCache2 != null && requestCache2.d()) {
                        Request c2 = requestCache2.c();
                        if (c2.g().a(str, c2.j())) {
                            requestCache = requestCache2;
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                RVLLevel rVLLevel = RVLLevel.Error;
                lcn.f(rVLLevel, "Themis/Performance/RequestPrefetch", "consumePrefetchResponseWithUrl error: " + e.getMessage());
            }
        }
        return requestCache != null && requestCache.d();
    }

    public static boolean j(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebab395c", new Object[]{new Integer(i)})).booleanValue();
        }
        synchronized (b) {
            if (f1767a.remove(Integer.valueOf(i)) != null) {
                z = true;
            }
        }
        return z;
    }

    public static boolean l(RequestCache requestCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61eb64b2", new Object[]{requestCache})).booleanValue();
        }
        int h = requestCache.c().h();
        Map<Integer, RequestCache> map = f1767a;
        if (map.containsKey(Integer.valueOf(h))) {
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "Themis/Performance/RequestPrefetch", "the request needed to be restore cache has existed, requestId: " + h);
            return false;
        }
        map.put(Integer.valueOf(requestCache.c().h()), requestCache);
        lcn.a(RVLLevel.Info, "Themis/Performance/RequestPrefetch").j("restore").a("requestId", Integer.valueOf(h)).a("url", requestCache.c().j()).a("isShared", Boolean.valueOf(requestCache.d())).f();
        return true;
    }
}
