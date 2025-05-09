package com.taobao.themis.inside.adapter;

import android.app.Application;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.statist.StatisticData;
import anetwork.channel.util.RequestConstant;
import com.alibaba.security.realidentity.o;
import com.alibaba.security.realidentity.u2;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.adapter.ITransportAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.e0d;
import tb.gcn;
import tb.h11;
import tb.hcn;
import tb.p8s;
import tb.t2o;
import tb.x9s;
import tb.y9s;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSTransportAdapter;", "Lcom/taobao/themis/kernel/adapter/ITransportAdapter;", "<init>", "()V", "Ltb/gcn;", h11.HTTPREQUET, "Ltb/e0d;", "networkTracker", "Ltb/hcn;", "(Ltb/gcn;Ltb/e0d;)Ltb/hcn;", "Ltb/y9s;", "downloadRequest", "Ltb/x9s;", "downloadCallback", "Ltb/xhv;", "addDownload", "(Ltb/y9s;Ltb/x9s;)V", "Companion", "a", TplMsg.VALUE_T_NATIVE_RETURN, "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTransportAdapter implements ITransportAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static int f13554a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(837812312);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class b implements NetworkCallBack.FinishListener, NetworkCallBack.ResponseCodeListener, NetworkCallBack.InputStreamListener {
        static {
            t2o.a(837812313);
            t2o.a(607125966);
            t2o.a(607125969);
            t2o.a(607125967);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ByteArrayOutputStream f13555a;
        public final /* synthetic */ hcn b;
        public final /* synthetic */ gcn c;
        public final /* synthetic */ e0d d;
        public final /* synthetic */ long e;
        public final /* synthetic */ CountDownLatch f;
        public final /* synthetic */ Request g;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ hcn b;
            public final /* synthetic */ NetworkEvent.FinishEvent c;
            public final /* synthetic */ gcn d;
            public final /* synthetic */ e0d e;
            public final /* synthetic */ long f;
            public final /* synthetic */ CountDownLatch g;

            public a(hcn hcnVar, NetworkEvent.FinishEvent finishEvent, gcn gcnVar, e0d e0dVar, long j, CountDownLatch countDownLatch) {
                this.b = hcnVar;
                this.c = finishEvent;
                this.d = gcnVar;
                this.e = e0dVar;
                this.f = j;
                this.g = countDownLatch;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e0d e0dVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (c.this.a() != null) {
                    hcn hcnVar = this.b;
                    ByteArrayOutputStream a2 = c.this.a();
                    ckf.d(a2);
                    hcnVar.e(new ByteArrayInputStream(a2.toByteArray()));
                }
                this.b.f(this.c.getHttpCode());
                StatisticData statisticData = this.c.getStatisticData();
                if (200 != this.b.c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("networkErrorUrl", this.d.l());
                    hashMap.put("desc", this.c.getDesc());
                    if (statisticData != null) {
                        try {
                            hashMap.put("connectionType", statisticData.connectionType);
                            hashMap.put("dataSpeed", Long.valueOf(statisticData.dataSpeed));
                            hashMap.put("host", statisticData.host);
                            hashMap.put("ip_port", statisticData.ip_port);
                            hashMap.put("isSSL", Boolean.valueOf(statisticData.isSSL));
                            hashMap.put("resultCode", Integer.valueOf(statisticData.resultCode));
                            hashMap.put("rtt", Long.valueOf(statisticData.rtt));
                            hashMap.put("sendSize", Long.valueOf(statisticData.sendSize));
                            hashMap.put("totalSize", Long.valueOf(statisticData.totalSize));
                            hashMap.put("cacheTime", Long.valueOf(statisticData.cacheTime));
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    HashMap hashMap2 = new HashMap();
                    String g = this.d.g("appId");
                    this.d.g("sessionId");
                    ckf.f(g, "appId");
                    hashMap2.put("appId", g);
                    String g2 = this.d.g(gcn.PLUGIN_ID);
                    ckf.f(g2, "rvHttpRequest.getExtPara…(RVHttpRequest.PLUGIN_ID)");
                    hashMap2.put(gcn.PLUGIN_ID, g2);
                    e0d e0dVar2 = this.e;
                    if (e0dVar2 != null) {
                        String desc = this.c.getDesc();
                        ckf.f(desc, "finishEvent.desc");
                        e0dVar2.c(desc);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - this.f;
                    TMSLogger.a("TMSTransportAdapter", "http request end, url:" + ((Object) this.d.l()) + ", duration:" + currentTimeMillis);
                    ByteArrayOutputStream a3 = c.this.a();
                    if (!(a3 == null || (e0dVar = this.e) == null)) {
                        byte[] byteArray = a3.toByteArray();
                        ckf.f(byteArray, "it.toByteArray()");
                        e0dVar.d(byteArray);
                    }
                    e0d e0dVar3 = this.e;
                    if (e0dVar3 != null) {
                        e0dVar3.b();
                    }
                }
                this.g.countDown();
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ParcelableInputStream f13557a;
            public final /* synthetic */ c b;

            public b(ParcelableInputStream parcelableInputStream, c cVar) {
                this.f13557a = parcelableInputStream;
                this.b = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (this.f13557a.length() > 0) {
                        i = this.f13557a.length();
                    } else {
                        i = 20480;
                    }
                    this.b.b(new ByteArrayOutputStream(i));
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = this.f13557a.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        ByteArrayOutputStream a2 = this.b.a();
                        ckf.d(a2);
                        a2.write(bArr, 0, read);
                    }
                    this.f13557a.close();
                    if (this.b.a() != null) {
                        ByteArrayOutputStream a3 = this.b.a();
                        ckf.d(a3);
                        a3.close();
                    }
                } catch (Exception e) {
                    TMSLogger.c("TMSTransportAdapter", "asyncHttpRequest error", e);
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: com.taobao.themis.inside.adapter.TMSTransportAdapter$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class RunnableC0771c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ hcn f13558a;
            public final /* synthetic */ Map<String, List<String>> b;
            public final /* synthetic */ e0d c;
            public final /* synthetic */ Request d;
            public final /* synthetic */ int e;

            /* JADX WARN: Multi-variable type inference failed */
            public RunnableC0771c(hcn hcnVar, Map<String, ? extends List<String>> map, e0d e0dVar, Request request, int i) {
                this.f13558a = hcnVar;
                this.b = map;
                this.c = e0dVar;
                this.d = request;
                this.e = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                this.f13558a.d(this.b);
                e0d e0dVar = this.c;
                if (e0dVar != null) {
                    String urlString = this.d.getUrlString();
                    ckf.f(urlString, "anetReq.urlString");
                    e0dVar.f(urlString, this.e, false, this.b);
                }
            }
        }

        public c(hcn hcnVar, gcn gcnVar, e0d e0dVar, long j, CountDownLatch countDownLatch, Request request) {
            this.b = hcnVar;
            this.c = gcnVar;
            this.d = e0dVar;
            this.e = j;
            this.f = countDownLatch;
            this.g = request;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/inside/adapter/TMSTransportAdapter$asyncHttpRequest$2");
        }

        public final ByteArrayOutputStream a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteArrayOutputStream) ipChange.ipc$dispatch("cdd80dd1", new Object[]{this});
            }
            return this.f13555a;
        }

        public final void b(ByteArrayOutputStream byteArrayOutputStream) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4531da9", new Object[]{this, byteArrayOutputStream});
            } else {
                this.f13555a = byteArrayOutputStream;
            }
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            ckf.g(finishEvent, "finishEvent");
            ckf.g(obj, o.b);
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.IO)) != null) {
                executor.execute(new a(this.b, finishEvent, this.c, this.d, this.e, this.f));
            }
        }

        @Override // anetwork.channel.NetworkCallBack.InputStreamListener
        public void onInputStreamGet(ParcelableInputStream parcelableInputStream, Object obj) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91cf6995", new Object[]{this, parcelableInputStream, obj});
                return;
            }
            ckf.g(parcelableInputStream, "parcelableInputStream");
            ckf.g(obj, o.b);
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.IO)) != null) {
                executor.execute(new b(parcelableInputStream, this));
            }
        }

        @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
        public boolean onResponseCode(int i, Map<String, ? extends List<String>> map, Object obj) {
            Executor executor;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
            }
            ckf.g(map, "map");
            ckf.g(obj, o.b);
            IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
            if (!(iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.IO)) == null)) {
                executor.execute(new RunnableC0771c(this.b, map, this.d, this.g, i));
            }
            return false;
        }
    }

    static {
        t2o.a(837812311);
        t2o.a(839909488);
    }

    public static /* synthetic */ hcn asyncHttpRequest$default(TMSTransportAdapter tMSTransportAdapter, gcn gcnVar, e0d e0dVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hcn) ipChange.ipc$dispatch("b49276de", new Object[]{tMSTransportAdapter, gcnVar, e0dVar, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            e0dVar = null;
        }
        return tMSTransportAdapter.a(gcnVar, e0dVar);
    }

    public static /* synthetic */ hcn syncHttpRequest$default(TMSTransportAdapter tMSTransportAdapter, gcn gcnVar, e0d e0dVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hcn) ipChange.ipc$dispatch("79e0addf", new Object[]{tMSTransportAdapter, gcnVar, e0dVar, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            e0dVar = null;
        }
        return tMSTransportAdapter.c(gcnVar, e0dVar);
    }

    @Override // com.taobao.themis.kernel.adapter.ITransportAdapter
    public void addDownload(y9s y9sVar, x9s x9sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796af25c", new Object[]{this, y9sVar, x9sVar});
        } else {
            ckf.g(y9sVar, "downloadRequest");
            throw null;
        }
    }

    public final hcn d(Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hcn) ipChange.ipc$dispatch("7be355ae", new Object[]{this, response});
        }
        hcn hcnVar = new hcn();
        hcnVar.d(response.getConnHeadFields());
        hcnVar.f(response.getStatusCode());
        if (response.getBytedata() != null) {
            hcnVar.e(new ByteArrayInputStream(response.getBytedata()));
        }
        return hcnVar;
    }

    public final String b() {
        Locale locale;
        LocaleList localeList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f55639da", new Object[]{this});
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                localeList = LocaleList.getDefault();
                locale = localeList.get(0);
                ckf.f(locale, "{\n                Locale…efault()[0]\n            }");
            } else {
                locale = Locale.getDefault();
                ckf.f(locale, "{\n                Locale…etDefault()\n            }");
            }
            String str = locale.getLanguage() + '-' + ((Object) locale.getCountry());
            if (ckf.b("zh", locale.getLanguage())) {
                return str + ",zh;q=0.8,en-US;q=0.5,en;q=0.3";
            }
            return str + ',' + ((Object) locale.getLanguage()) + ";q=0.8,en-US;q=0.5,en;q=0.3";
        } catch (Exception unused) {
            return ckf.p("zh-CN,zh;q=0.8", ",en-US;q=0.5,en;q=0.3");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITransportAdapter
    public hcn httpRequest(gcn gcnVar, e0d e0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hcn) ipChange.ipc$dispatch("752a540c", new Object[]{this, gcnVar, e0dVar});
        }
        ckf.g(gcnVar, h11.HTTPREQUET);
        String g = gcnVar.g("requestType");
        ckf.f(g, "httpRequest.getExtParams…nstants.CDN_REQUEST_TYPE)");
        f13554a++;
        if (gcnVar.h() != null) {
            Map<String, String> h = gcnVar.h();
            ckf.f(h, "httpRequest.headers");
            h.put("triverRequestId", String.valueOf(f13554a));
        }
        if (TextUtils.equals("async", g)) {
            return a(gcnVar, e0dVar);
        }
        Map<String, String> h2 = gcnVar.h();
        if (ckf.b("true", h2 == null ? null : h2.get("x-miniapp-big-file"))) {
            return a(gcnVar, e0dVar);
        }
        return c(gcnVar, e0dVar);
    }

    public final hcn c(gcn gcnVar, e0d e0dVar) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hcn) ipChange.ipc$dispatch("e6a60887", new Object[]{this, gcnVar, e0dVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        TMSLogger.a("TMSTransportAdapter", ckf.p("http request , url:", gcnVar.l()));
        Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
        ckf.f(applicationContext, "getNotNull(IEnvironmentS….java).applicationContext");
        RequestImpl requestImpl = new RequestImpl(gcnVar.l());
        requestImpl.setBizId("windmill");
        String i2 = gcnVar.i();
        byte[] j = gcnVar.j();
        if (gcnVar.h() != null) {
            for (String str : gcnVar.h().keySet()) {
                requestImpl.addHeader(str, gcnVar.h().get(str));
            }
        }
        requestImpl.addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, b());
        if (TextUtils.isEmpty(i2)) {
            i2 = "GET";
        }
        requestImpl.setMethod(i2);
        requestImpl.setCharset("UTF-8");
        String g = gcnVar.g(u2.k);
        if (!TextUtils.isEmpty(g)) {
            try {
                ckf.f(g, "retryTimeStr");
                i = Integer.parseInt(g);
            } catch (Exception e) {
                TMSLogger.c("TMSTransportAdapter", "parse retryTime error", e);
            }
        }
        requestImpl.setRetryTime(i);
        int i3 = 15000;
        try {
            if (gcnVar.k() > 0) {
                i3 = (int) gcnVar.k();
            }
        } catch (Exception unused) {
        }
        requestImpl.setReadTimeout(i3);
        requestImpl.setConnectTimeout(i3);
        String g2 = gcnVar.g("cookie");
        if (!TextUtils.isEmpty(g2)) {
            requestImpl.addHeader("Cookie", g2);
        } else {
            requestImpl.setExtProperty(RequestConstant.KEEP_CUSTOM_COOKIE, "true");
        }
        if (!(j == null || j.length == 0)) {
            requestImpl.setBodyEntry(new ByteArrayEntry(j));
        }
        if (e0dVar != null) {
            e0d.a aVar = new e0d.a();
            aVar.h(requestImpl.getUrlString());
            aVar.e(gcnVar.h());
            aVar.f(requestImpl.getMethod());
            if (j != null) {
                aVar.g(j);
            }
            e0dVar.a(aVar);
        }
        Response syncSend = new DegradableNetwork(applicationContext).syncSend(requestImpl, null);
        if (syncSend != null) {
            hcn d = d(syncSend);
            if (e0dVar != null) {
                String urlString = requestImpl.getUrlString();
                ckf.f(urlString, "anetReq.urlString");
                e0dVar.f(urlString, syncSend.getStatusCode(), false, syncSend.getConnHeadFields());
            }
            if (200 != syncSend.getStatusCode()) {
                HashMap hashMap = new HashMap();
                hashMap.put("networkErrorUrl", gcnVar.l());
                hashMap.put("desc", syncSend.getDesc());
                try {
                    StatisticData statisticData = syncSend.getStatisticData();
                    if (statisticData != null) {
                        hashMap.put("connectionType", statisticData.connectionType);
                        hashMap.put("dataSpeed", Long.valueOf(statisticData.dataSpeed));
                        hashMap.put("host", statisticData.host);
                        hashMap.put("ip_port", statisticData.ip_port);
                        hashMap.put("isSSL", Boolean.valueOf(statisticData.isSSL));
                        hashMap.put("resultCode", Integer.valueOf(statisticData.resultCode));
                        hashMap.put("rtt", Long.valueOf(statisticData.rtt));
                        hashMap.put("sendSize", Long.valueOf(statisticData.sendSize));
                        hashMap.put("totalSize", Long.valueOf(statisticData.totalSize));
                        hashMap.put("cacheTime", Long.valueOf(statisticData.cacheTime));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                HashMap hashMap2 = new HashMap();
                String g3 = gcnVar.g("appId");
                gcnVar.g("sessionId");
                ckf.f(g3, "appId");
                hashMap2.put("appId", g3);
                String g4 = gcnVar.g(gcn.PLUGIN_ID);
                ckf.f(g4, "rvHttpRequest.getExtPara…(RVHttpRequest.PLUGIN_ID)");
                hashMap2.put(gcn.PLUGIN_ID, g4);
                if (e0dVar != null) {
                    String desc = syncSend.getDesc();
                    ckf.f(desc, "response.desc");
                    e0dVar.c(desc);
                }
            } else {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (e0dVar != null) {
                    byte[] bytedata = syncSend.getBytedata();
                    ckf.f(bytedata, "response.bytedata");
                    e0dVar.d(bytedata);
                }
                if (e0dVar != null) {
                    e0dVar.b();
                }
                TMSLogger.a("TMSTransportAdapter", "http request end, url:" + ((Object) gcnVar.l()) + ", duration:" + currentTimeMillis2);
            }
            TMSLogger.a("TMSTransportAdapter", "syncHttpRequest finish");
            return d;
        }
        TMSLogger.b("TMSTransportAdapter", "syncHttpRequest finish");
        return null;
    }

    public final hcn a(gcn gcnVar, e0d e0dVar) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hcn) ipChange.ipc$dispatch("98d58da8", new Object[]{this, gcnVar, e0dVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        TMSLogger.a("TMSTransportAdapter", ckf.p("http request , url:", gcnVar.l()));
        Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
        ckf.f(applicationContext, "getNotNull(IEnvironmentS…).getApplicationContext()");
        RequestImpl requestImpl = new RequestImpl(gcnVar.l());
        requestImpl.setBizId("windmill");
        String i2 = gcnVar.i();
        byte[] j = gcnVar.j();
        if (gcnVar.h() != null) {
            for (String str : gcnVar.h().keySet()) {
                requestImpl.addHeader(str, gcnVar.h().get(str));
            }
        }
        requestImpl.addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, b());
        if (TextUtils.isEmpty(i2)) {
            i2 = "GET";
        }
        requestImpl.setMethod(i2);
        requestImpl.setCharset("UTF-8");
        String g = gcnVar.g(u2.k);
        if (!TextUtils.isEmpty(g)) {
            try {
                ckf.f(g, "retryTimeStr");
                i = Integer.parseInt(g);
            } catch (Exception e) {
                TMSLogger.c("TMSTransportAdapter", "parse retryTime error", e);
            }
        }
        requestImpl.setRetryTime(i);
        int i3 = 15000;
        try {
            if (gcnVar.k() > 0) {
                i3 = (int) gcnVar.k();
            }
        } catch (Exception unused) {
        }
        requestImpl.setReadTimeout(i3);
        requestImpl.setConnectTimeout(i3);
        String g2 = gcnVar.g("cookie");
        if (!TextUtils.isEmpty(g2)) {
            requestImpl.addHeader("Cookie", g2);
        } else {
            requestImpl.setExtProperty(RequestConstant.KEEP_CUSTOM_COOKIE, "true");
        }
        if (!(j == null || j.length == 0)) {
            requestImpl.setBodyEntry(new ByteArrayEntry(j));
        }
        if (e0dVar != null) {
            e0d.a aVar = new e0d.a();
            aVar.h(requestImpl.getUrlString());
            aVar.e(gcnVar.h());
            aVar.f(requestImpl.getMethod());
            aVar.g(j);
            e0dVar.a(aVar);
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(applicationContext);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hcn hcnVar = new hcn();
        degradableNetwork.asyncSend(requestImpl, null, null, new c(hcnVar, gcnVar, e0dVar, currentTimeMillis, countDownLatch, requestImpl));
        try {
            countDownLatch.await(30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            TMSLogger.c("TMSTransportAdapter", "asyncHttpRequest error", e2);
        }
        TMSLogger.a("TMSTransportAdapter", "asyncHttpRequest finish");
        return hcnVar;
    }
}
