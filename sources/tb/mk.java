package tb;

import android.content.Context;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.CachedMainResponse;
import com.alibaba.android.nextrpc.request.NextRpcRequest;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ck;
import tb.pk;
import tb.ubb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mk extends dt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x2k f24089a;
    public final xbb b = new pk();
    public final boolean c;
    public final boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements c.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24090a;

        public a(mk mkVar, String str) {
            this.f24090a = str;
        }

        @Override // tb.mk.c.h
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7f1edbcf", new Object[]{this});
            }
            return this.f24090a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$alibaba$android$aura$datamodel$nextrpc$AURANextRPCEndpoint$AttachedResponseStrategy;

        static {
            int[] iArr = new int[AURANextRPCEndpoint.AttachedResponseStrategy.values().length];
            $SwitchMap$com$alibaba$android$aura$datamodel$nextrpc$AURANextRPCEndpoint$AttachedResponseStrategy = iArr;
            try {
                iArr[AURANextRPCEndpoint.AttachedResponseStrategy.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$android$aura$datamodel$nextrpc$AURANextRPCEndpoint$AttachedResponseStrategy[AURANextRPCEndpoint.AttachedResponseStrategy.IMMEDIATELY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements b3k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ubb.a f24091a;
        public h b;
        public final boolean c;
        public final long d = System.currentTimeMillis();
        public final boolean e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kk f24092a;

            public a(kk kkVar) {
                this.f24092a = kkVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.g(c.this).b(this.f24092a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kk f24093a;

            public b(kk kkVar) {
                this.f24093a = kkVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.g(c.this).b(this.f24093a);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.mk$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0997c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kk f24094a;

            public RunnableC0997c(kk kkVar) {
                this.f24094a = kkVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.g(c.this).d(this.f24094a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kk f24095a;

            public d(kk kkVar) {
                this.f24095a = kkVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.g(c.this).b(this.f24095a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kk f24096a;
            public final /* synthetic */ long b;
            public final /* synthetic */ long c;
            public final /* synthetic */ List d;

            public e(kk kkVar, long j, long j2, List list) {
                this.f24096a = kkVar;
                this.b = j;
                this.c = j2;
                this.d = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                AURATraceUtil.g(2, "aura-request-thread-switch-end[" + System.currentTimeMillis() + "]");
                uk.a(this.f24096a.g(), 0, c.h(c.this), currentTimeMillis);
                uk.a(this.f24096a.g(), 1, this.b, this.c);
                uk.a(this.f24096a.g(), 2, this.c, currentTimeMillis);
                c.g(c.this).c(this.f24096a, dt.e(this.d, c.i(c.this).a()));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class f implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kk f24097a;

            public f(kk kkVar) {
                this.f24097a = kkVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.g(c.this).b(this.f24097a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class g implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f24098a;

            public g(List list) {
                this.f24098a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.g(c.this).a(dt.e(this.f24098a, c.i(c.this).a()));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public interface h {
            String a();
        }

        static {
            t2o.a(80740442);
        }

        public c(ubb.a aVar, boolean z, boolean z2) {
            this.f24091a = aVar;
            this.c = z;
            this.e = z2;
        }

        public static /* synthetic */ ubb.a g(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ubb.a) ipChange.ipc$dispatch("1e826d8d", new Object[]{cVar});
            }
            return cVar.f24091a;
        }

        public static /* synthetic */ long h(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f1f72053", new Object[]{cVar})).longValue();
            }
            return cVar.d;
        }

        public static /* synthetic */ h i(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("66dd8f0", new Object[]{cVar});
            }
            return cVar.b;
        }

        @Override // tb.b3k
        public void a(List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f0800fd", new Object[]{this, list});
            } else if (this.f24091a != null && list != null) {
                rbb g2 = ck.g();
                g2.e("收到 副响应 " + System.currentTimeMillis(), ck.b.b().i("AURA/performance").a());
                dn.f(new g(list), 0L);
            }
        }

        @Override // tb.b3k
        public void b(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f21c02c6", new Object[]{this, remoteMainResponse});
            } else if (this.f24091a != null && remoteMainResponse != null) {
                dn.f(new a(m(remoteMainResponse.getMtopResponse())), 0L);
            }
        }

        @Override // tb.b3k
        public void c(CachedMainResponse cachedMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32e3a7b8", new Object[]{this, cachedMainResponse});
            } else if (this.f24091a != null && cachedMainResponse != null) {
                kk m = m(cachedMainResponse.getMtopCacheEvent().getMtopResponse());
                dn.g(new RunnableC0997c(m), new d(m));
            }
        }

        @Override // tb.b3k
        public void f(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a607b1d7", new Object[]{this, remoteMainResponse});
            } else if (this.f24091a != null && remoteMainResponse != null) {
                dn.f(new b(l(remoteMainResponse)), 0L);
            }
        }

        public final JSONObject j(MtopResponse mtopResponse) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d16489c4", new Object[]{this, mtopResponse});
            }
            if (mtopResponse.getOriginFastJsonObject() != null) {
                return mtopResponse.getOriginFastJsonObject();
            }
            if (mtopResponse.getBytedata() == null) {
                str = "";
            } else {
                str = new String(mtopResponse.getBytedata());
            }
            return tj.a(str);
        }

        public void k(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4eaa4912", new Object[]{this, hVar});
            } else {
                this.b = hVar;
            }
        }

        public final kk l(RemoteMainResponse remoteMainResponse) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kk) ipChange.ipc$dispatch("3e040bb3", new Object[]{this, remoteMainResponse});
            }
            kk kkVar = new kk();
            if (ao.a()) {
                str = "UI";
            } else {
                str = "非UI线程接收到主数据";
            }
            hl.a(str);
            MtopResponse mtopResponse = remoteMainResponse.getMtopResponse();
            if (mtopResponse == null) {
                return kkVar;
            }
            kkVar.q(mtopResponse);
            if (this.c) {
                kkVar.n(mtopResponse.getOriginFastJsonObject());
            } else {
                kkVar.k(mtopResponse.getApi());
                kkVar.x(mtopResponse.getV());
                kkVar.v(mtopResponse.getRetMsg());
                kkVar.n(j(mtopResponse));
            }
            kkVar.u(mtopResponse.getRetCode());
            kkVar.w(mtopResponse.isApiSuccess());
            kkVar.r(mtopResponse.getMappingCode());
            kkVar.t(mtopResponse.getResponseCode());
            kkVar.o(mtopResponse.getHeaderFields());
            hl.a("解析主数据结束");
            return kkVar;
        }

        public final kk m(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kk) ipChange.ipc$dispatch("c6a2e0df", new Object[]{this, mtopResponse});
            }
            kk kkVar = new kk();
            hl.a("接收到主数据");
            if (mtopResponse == null) {
                return kkVar;
            }
            kkVar.q(mtopResponse);
            kkVar.k(mtopResponse.getApi());
            kkVar.x(mtopResponse.getV());
            kkVar.v(mtopResponse.getRetMsg());
            kkVar.n(j(mtopResponse));
            kkVar.u(mtopResponse.getRetCode());
            kkVar.w(mtopResponse.isApiSuccess());
            kkVar.r(mtopResponse.getMappingCode());
            kkVar.t(mtopResponse.getResponseCode());
            kkVar.o(mtopResponse.getHeaderFields());
            hl.a("解析主数据结束");
            return kkVar;
        }

        @Override // tb.b3k
        public void e(RemoteMainResponse remoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24ebdbd0", new Object[]{this, remoteMainResponse, list});
                return;
            }
            AURATraceUtil.g(2, "aura-request-end[" + System.currentTimeMillis() + "]");
            if (this.f24091a != null && remoteMainResponse != null) {
                long currentTimeMillis = System.currentTimeMillis();
                rbb g2 = ck.g();
                g2.e("收到nextRPC主数据 " + currentTimeMillis, ck.b.b().i("AURA/performance").a());
                kk l = l(remoteMainResponse);
                long currentTimeMillis2 = System.currentTimeMillis();
                AURATraceUtil.g(2, "aura-request-thread-switch-start[" + currentTimeMillis + "]");
                dt.c(this.e, new e(l, currentTimeMillis, currentTimeMillis2, list), new f(l));
            }
        }
    }

    static {
        t2o.a(80740439);
    }

    public mk(Context context, String str, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.f24089a = new y2k().d(context).e(pn.a(str)).a();
    }

    public static ubb g(Context context, String str, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ubb) ipChange.ipc$dispatch("d284ccb9", new Object[]{context, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        if (!z) {
            return new mk(context.getApplicationContext(), str, z2, z3);
        }
        if (fj.d("enableNewNextRPCStream", true)) {
            return new on(str, z3);
        }
        return new nn(context.getApplicationContext(), str, z2, z3);
    }

    public static /* synthetic */ Object ipc$super(mk mkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/nextrpc/AURANextRPCClientV2");
    }

    @Override // tb.ubb
    public void a(AURANextRPCEndpoint aURANextRPCEndpoint, ubb.a aVar) {
        pk.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764a70b6", new Object[]{this, aURANextRPCEndpoint, aVar});
        } else if (aURANextRPCEndpoint.getNextRPCPrefetch() != null) {
            ubb.a f = ((pk) this.b).f(aURANextRPCEndpoint);
            if (aVar == null) {
                aVar2 = new pk.a(f);
            } else {
                aVar2 = new pk.a(f, aVar);
            }
            b(aURANextRPCEndpoint, aVar2, null);
        }
    }

    @Override // tb.ubb
    public void b(AURANextRPCEndpoint aURANextRPCEndpoint, ubb.a aVar, ubb.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d92405", new Object[]{this, aURANextRPCEndpoint, aVar, bVar});
        } else if (bVar == null || aURANextRPCEndpoint.getNextRPCPrefetch() == null || !((pk) this.b).i(aURANextRPCEndpoint, aVar, bVar)) {
            AURATraceUtil.g(2, "aura-request-start[" + System.currentTimeMillis() + "]");
            MtopBusiness a2 = x5o.a(x5o.b(aURANextRPCEndpoint), aURANextRPCEndpoint);
            if (this.c) {
                a2.supportStreamJson(true);
            }
            NextRpcRequest nextRpcRequest = new NextRpcRequest(a2, aURANextRPCEndpoint.getAllTimeOutSeconds(), f(aURANextRPCEndpoint));
            c cVar = new c(aVar, this.c, this.d);
            cVar.k(new a(this, this.f24089a.b(nextRpcRequest, cVar)));
        }
    }

    public final NextRpcRequest.AttachedResponseStrategy f(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NextRpcRequest.AttachedResponseStrategy) ipChange.ipc$dispatch("b00dc88", new Object[]{this, aURANextRPCEndpoint});
        }
        NextRpcRequest.AttachedResponseStrategy attachedResponseStrategy = NextRpcRequest.AttachedResponseStrategy.IMMEDIATELY;
        AURANextRPCEndpoint.AttachedResponseStrategy attachedResponseStrategy2 = aURANextRPCEndpoint.getAttachedResponseStrategy();
        if (attachedResponseStrategy2 == null || b.$SwitchMap$com$alibaba$android$aura$datamodel$nextrpc$AURANextRPCEndpoint$AttachedResponseStrategy[attachedResponseStrategy2.ordinal()] != 1) {
            return attachedResponseStrategy;
        }
        return NextRpcRequest.AttachedResponseStrategy.FULL;
    }

    @Override // tb.ubb
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.f24089a.destroy();
        }
    }
}
