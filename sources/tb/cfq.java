package tb;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.ssrcore.callback.SsrCallbackImpl;
import tb.egq;
import tb.tz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cfq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger p = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final i7j f17032a;
    public final MtopNetworkProp b;
    public volatile ScheduledFuture<?> c;
    public final Mtop f;
    public final bgq g;
    public volatile boolean j;
    public afq k;
    public mnf l;
    public ConcurrentHashMap<String, cfq> n;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public int h = 0;
    public long i = 0;
    public String m = "silent-ui";
    public int o = 0;
    public final String d = o();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f17033a;

        public a(WeakReference weakReference) {
            this.f17033a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            bgq bgqVar = (bgq) this.f17033a.get();
            if (bgqVar != null && cfq.a(cfq.this).compareAndSet(false, true) && !cfq.this.u()) {
                cfq.this.h();
                lfq.c(bgqVar, cfq.b(cfq.this), cfq.this.b.handler, new egq.b().b(417).e("SSRE_TIMEOUT").d("请求超时").a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ efq f17034a;

        public b(efq efqVar) {
            this.f17034a = efqVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mfq.d(this.f17034a.d);
            this.f17034a.d.z = cfq.this.f17032a.d();
            cfq.c(cfq.this).checkMtopSDKInit();
            a7c a7cVar = cfq.c(cfq.this).getMtopConfig().mFilterManager;
            if (a7cVar instanceof kfq) {
                ((kfq) a7cVar).d(null, this.f17034a);
            }
            lfq.a(a7cVar, this.f17034a);
        }
    }

    public cfq(Mtop mtop, bgq bgqVar, String str) {
        MtopNetworkProp mtopNetworkProp = new MtopNetworkProp();
        this.b = mtopNetworkProp;
        this.f = mtop;
        this.g = bgqVar;
        mtopNetworkProp.ttid = str;
        this.f17032a = new i7j(mtop.getMtopConfig().uploadStats);
    }

    public static /* synthetic */ AtomicBoolean a(cfq cfqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("50922ef3", new Object[]{cfqVar});
        }
        return cfqVar.e;
    }

    public static /* synthetic */ mnf b(cfq cfqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mnf) ipChange.ipc$dispatch("b63b22ec", new Object[]{cfqVar});
        }
        return cfqVar.l;
    }

    public static /* synthetic */ Mtop c(cfq cfqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("15398b9e", new Object[]{cfqVar});
        }
        return cfqVar.f;
    }

    public static cfq f(Mtop mtop, bgq bgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfq) ipChange.ipc$dispatch("e18bb986", new Object[]{mtop, bgqVar});
        }
        return g(mtop, bgqVar, null);
    }

    public static cfq g(Mtop mtop, bgq bgqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfq) ipChange.ipc$dispatch("40331550", new Object[]{mtop, bgqVar, str});
        }
        return new cfq(mtop, bgqVar, str);
    }

    public cfq d(mnf mnfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfq) ipChange.ipc$dispatch("e6229aa8", new Object[]{this, mnfVar});
        }
        this.l = mnfVar;
        return this;
    }

    public final afq e() {
        String str;
        raq k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (afq) ipChange.ipc$dispatch("6803da6c", new Object[]{this});
        }
        i7j i7jVar = this.f17032a;
        i7jVar.y = i7jVar.d();
        efq k2 = k();
        k2.i = new afq(null, k2);
        try {
            if (Mtop.mIsFullTrackValid) {
                if (!TextUtils.isEmpty(this.b.fullTraceId)) {
                    str = this.b.fullTraceId;
                } else {
                    str = FullTraceAnalysis.getInstance().createRequest(mfq.MODULE_SSR);
                }
                tz8 tz8Var = FalcoGlobalTracer.get();
                if (tz8Var != null) {
                    tz8.a d = tz8Var.d(mfq.MODULE_SSR, "MTOP_SSR_UnknownScene");
                    Map<String, String> map = this.b.openTraceContext;
                    if (!(map == null || map.isEmpty() || (k = tz8Var.k(this.b.openTraceContext)) == null)) {
                        d.b(k);
                    }
                    k2.d.S = d.h();
                }
                if (!TextUtils.isEmpty(str)) {
                    i7j i7jVar2 = k2.d;
                    i7jVar2.T = str;
                    i7jVar2.g();
                    mfq.g(k2.d, k2.g.f16375a);
                }
            }
            if (!MtopUtils.isMainThread() && this.f.isInited()) {
                k2.d.z = this.f17032a.d();
                mfq.d(k2.d);
                a7c a7cVar = this.f.getMtopConfig().mFilterManager;
                if (a7cVar instanceof kfq) {
                    ((kfq) a7cVar).d(null, k2);
                }
                lfq.a(a7cVar, k2);
                return k2.i;
            }
            MtopSDKThreadPoolExecutorFactory.getRequestThreadPoolExecutor().submit(new b(k2));
            return k2.i;
        } catch (Throwable unused) {
            return k2.i;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a20bc", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("ssr.SsrBusiness", this.d, this.g.f16375a);
        }
        ConcurrentHashMap<String, cfq> concurrentHashMap = this.n;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            this.n.remove(this.g.f16375a);
        }
        this.j = true;
        afq afqVar = this.k;
        if (afqVar != null) {
            try {
                afqVar.a();
            } catch (Throwable th) {
                TBSdkLog.w("ssr.SsrBusiness", this.d, this.g.f16375a, th);
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990b633", new Object[]{this});
        } else if (this.c != null) {
            this.c.cancel(false);
            this.c = null;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a949d6", new Object[]{this});
            return;
        }
        bgq bgqVar = this.g;
        if (bgqVar != null && bgqVar.e > 0) {
            if (this.c != null) {
                this.c.cancel(false);
            }
            this.c = MtopSDKThreadPoolExecutorFactory.getSsrScheduledExecutorService().schedule(new a(new WeakReference(this.g)), this.g.e, TimeUnit.MILLISECONDS);
        }
    }

    public final efq k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (efq) ipChange.ipc$dispatch("8d9530ed", new Object[]{this});
        }
        efq efqVar = new efq();
        efqVar.j = this.f;
        i7j i7jVar = this.f17032a;
        efqVar.d = i7jVar;
        efqVar.b = i7jVar.N;
        efqVar.g = this.g;
        efqVar.f18534a = this.b;
        efqVar.k = new SsrCallbackImpl(this);
        efqVar.h = this;
        if (StringUtils.isBlank(efqVar.f18534a.ttid)) {
            efqVar.f18534a.ttid = this.f.getTtid();
        }
        return efqVar;
    }

    public void l(egq egqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad1cbd", new Object[]{this, egqVar});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("doFinish request=");
            sb.append(this.g);
            if (egqVar != null) {
                sb.append(", retCode=");
                sb.append(egqVar.b);
            }
            TBSdkLog.i("ssr.SsrBusiness", this.d, sb.toString());
        }
        if (this.j) {
            i();
            TBSdkLog.w("ssr.SsrBusiness", this.d, "doFinish request is cancelled,don't callback listener.");
            return;
        }
        this.e.compareAndSet(false, true);
        i();
        mnf mnfVar = this.l;
        if (mnfVar != null) {
            if (egqVar == null) {
                mnfVar.onError(this.g, egqVar);
            } else if (egqVar.f18565a != 200 || (!TextUtils.isEmpty(egqVar.b) && !TextUtils.equals(egqVar.b, "SUCCESS"))) {
                this.l.onError(this.g, egqVar);
            } else {
                this.l.onFinish(this.g);
            }
            long d = this.f17032a.d();
            i7j i7jVar = this.f17032a;
            i7jVar.X = d - i7jVar.C;
            i7jVar.Y = d - i7jVar.y;
        }
        ConcurrentHashMap<String, cfq> concurrentHashMap = this.n;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            this.n.remove(this.g.f16375a);
        }
    }

    public void m(bgq bgqVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24346ee", new Object[]{this, bgqVar, bArr});
            return;
        }
        this.e.compareAndSet(false, true);
        if (this.j) {
            TBSdkLog.w("ssr.SsrBusiness", this.d, "doReceiveData request is cancelled,don't callback listener.");
            return;
        }
        mnf mnfVar = this.l;
        if (mnfVar != null) {
            mnfVar.onReceiveData(bgqVar, bArr);
        }
    }

    public void n(bgq bgqVar, int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356dde53", new Object[]{this, bgqVar, new Integer(i), map});
            return;
        }
        this.e.compareAndSet(false, true);
        if (this.j) {
            TBSdkLog.w("ssr.SsrBusiness", this.d, "doResponse request is cancelled,don't callback listener.");
            return;
        }
        mnf mnfVar = this.l;
        if (mnfVar != null) {
            mnfVar.onResponse(bgqVar, i, map);
        }
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e60a3be9", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(Mtop.Id.SSR);
        sb.append(p.incrementAndGet());
        sb.append('.');
        sb.append(this.f17032a.N);
        return sb.toString();
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26b14bf1", new Object[]{this});
        }
        return this.m;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d972c3d9", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3df0a06f", new Object[]{this});
        }
        return this.d;
    }

    public cfq s(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfq) ipChange.ipc$dispatch("5ad0f6bb", new Object[]{this, handler});
        }
        this.b.handler = handler;
        return this;
    }

    public cfq t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfq) ipChange.ipc$dispatch("576f5992", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            MtopNetworkProp mtopNetworkProp = this.b;
            Map<String, String> map2 = mtopNetworkProp.requestHeaders;
            if (map2 != null) {
                map2.putAll(map);
            } else {
                mtopNetworkProp.requestHeaders = map;
            }
        }
        return this;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9d3c13", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public cfq v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfq) ipChange.ipc$dispatch("5e655b89", new Object[]{this, str});
        }
        this.m = str;
        return this;
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03963ce", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("ssr.SsrBusiness", this.d, this.g.f16375a);
        }
        this.h++;
        h();
        y();
    }

    public void x(ConcurrentHashMap<String, cfq> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d1b126", new Object[]{this, concurrentHashMap});
        } else {
            this.n = concurrentHashMap;
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb849d4", new Object[]{this});
        } else if (this.g == null) {
            TBSdkLog.e("ssr.SsrBusiness", this.d, "SsrRequest is null");
        } else {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                String str = this.d;
                TBSdkLog.i("ssr.SsrBusiness", str, "startRequest " + this.g);
            }
            this.j = false;
            this.f17032a.f21141a = false;
            this.i = System.currentTimeMillis();
            this.k = e();
        }
    }

    public cfq z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfq) ipChange.ipc$dispatch("f76930fd", new Object[]{this});
        }
        this.b.wuaFlag = 4;
        return this;
    }
}
