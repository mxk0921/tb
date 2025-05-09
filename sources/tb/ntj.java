package tb;

import android.text.TextUtils;
import anetwork.channel.util.RequestConstant;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.loader.network.IncompleteResponseException;
import com.taobao.phenix.request.ImageStatistics;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Future;
import tb.n7b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ntj extends fs1<wd8, t9o, com.taobao.phenix.request.a> implements p3o<com.taobao.phenix.request.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final n7b j;

    static {
        t2o.a(620757119);
    }

    public ntj(n7b n7bVar) {
        super(2, 0);
        fpm.c(n7bVar);
        this.j = n7bVar;
    }

    public static /* synthetic */ void P(ntj ntjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aeecc69", new Object[]{ntjVar, new Integer(i)});
        } else {
            ntjVar.U(i);
        }
    }

    public static /* synthetic */ void Q(ntj ntjVar, kk4 kk4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b660ca10", new Object[]{ntjVar, kk4Var, new Boolean(z)});
        } else {
            ntjVar.s(kk4Var, z);
        }
    }

    public static /* synthetic */ void R(ntj ntjVar, kk4 kk4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e291ef", new Object[]{ntjVar, kk4Var, new Boolean(z)});
        } else {
            ntjVar.s(kk4Var, z);
        }
    }

    public static /* synthetic */ Object ipc$super(ntj ntjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/loader/network/NetworkImageProducer");
    }

    public final String T(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7801ab0a", new Object[]{this, map});
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (String.valueOf(map.get(strArr[i])).trim().length() > 0) {
                sb.append(strArr[i]);
                sb.append(":");
                sb.append(String.valueOf(map.get(strArr[i])).trim());
            }
            if (i != strArr.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9410a8a0", new Object[]{this, new Integer(i)});
            return;
        }
        huo g = g();
        if (g instanceof dpl) {
            ((dpl) g).i(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements n7b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f24941a;
        public final /* synthetic */ kk4 b;
        public final /* synthetic */ com.taobao.phenix.request.a c;

        public a(long j, kk4 kk4Var, com.taobao.phenix.request.a aVar) {
            this.f24941a = j;
            this.b = kk4Var;
            this.c = aVar;
        }

        public void a(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
                return;
            }
            if (exc != null) {
                fiv.p("Phenix", "Network Connect Error." + exc.getMessage(), this.c);
            }
            ntj.P(ntj.this, ((com.taobao.phenix.request.a) this.b.getContext()).d());
            this.b.a(exc);
        }

        public void b(t9o t9oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5467c6de", new Object[]{this, t9oVar});
                return;
            }
            boolean z = this.f24941a != Thread.currentThread().getId();
            com.taobao.phenix.request.a aVar = (com.taobao.phenix.request.a) this.b.getContext();
            aVar.t("inner_is_async_http", Boolean.toString(z));
            if (aVar.i()) {
                fiv.p("Phenix", "request is cancelled before consuming response data", this.c);
                this.b.b();
                t9oVar.release();
                ntj.P(ntj.this, aVar.d());
                return;
            }
            fiv.p("Phenix", "Network Connect Finished.", this.c);
            ntj.Q(ntj.this, this.b, true);
            if (z) {
                ntj.this.E(this.b, true, t9oVar, false);
            } else {
                ntj.this.K(this.b, true, t9oVar);
            }
        }

        public void c(t9o t9oVar, boolean z, boolean z2) {
            boolean z3 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9a7e1de", new Object[]{this, t9oVar, new Boolean(z), new Boolean(z2)});
                return;
            }
            com.taobao.phenix.request.a aVar = (com.taobao.phenix.request.a) this.b.getContext();
            if (z) {
                fiv.p("Phenix", "Network data receive Started.", this.c);
                aVar.Y().z = System.currentTimeMillis();
            }
            if (this.f24941a != Thread.currentThread().getId()) {
                z3 = true;
            }
            aVar.t("inner_is_async_http", Boolean.toString(z3));
            if (aVar.i()) {
                fiv.p("Phenix", "request is cancelled before consuming response data", this.c);
                this.b.b();
                if (t9oVar != null) {
                    t9oVar.release();
                }
                ntj.P(ntj.this, aVar.d());
            } else if (t9oVar != null && z2) {
                fiv.p("Phenix", "Network data receive Finished.", this.c);
                aVar.Y().A = System.currentTimeMillis();
                fiv.p("Phenix", "Network Connect Finished.", this.c);
                ntj.R(ntj.this, this.b, true);
                ntj.this.K(this.b, true, t9oVar);
            }
        }
    }

    @Override // tb.oh3
    public boolean d(kk4<wd8, com.taobao.phenix.request.a> kk4Var, buo buoVar) {
        Map<String, String> I;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e41db0a", new Object[]{this, kk4Var, buoVar})).booleanValue();
        }
        com.taobao.phenix.request.a context = kk4Var.getContext();
        long id = Thread.currentThread().getId();
        t(kk4Var);
        sz8.b("phenix", "network_read " + context.d());
        fiv.p("Phenix", "Network Connect Started.", context);
        context.t("inner_network_start_time", String.valueOf(System.currentTimeMillis()));
        if (s0m.B().A()) {
            context.t("Image-Gray-Traffic", "true");
        }
        context.l(this);
        ImageStatistics Y = context.Y();
        if (!TextUtils.isEmpty(Y.s)) {
            context.t(RequestConstant.KEY_TRACE_ID, Y.s);
        }
        if (Y.o() != null && Y.o().size() > 0) {
            context.t("open_trace_context", T(Y.o()));
        }
        context.s0(this.j.a(context.O(), context.I(), new a(id, kk4Var, context)));
        if (buoVar != null && ((I = context.I()) == null || (str = I.get("inner_is_async_http")) == null || Boolean.valueOf(str).booleanValue())) {
            buoVar.o(true);
        }
        sz8.e();
        return true;
    }

    /* renamed from: V */
    public void b(com.taobao.phenix.request.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe6678f", new Object[]{this, aVar});
            return;
        }
        U(aVar.d());
        fiv.p("Phenix", "received cancellation.", aVar);
        Future<?> B = aVar.B();
        if (B != null) {
            aVar.s0(null);
            try {
                B.cancel(true);
                fiv.m(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, aVar, "cancelled blocking future(%s), result=%b", B, Boolean.valueOf(B.isCancelled()));
            } catch (Exception e) {
                fiv.o(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, aVar, "cancel blocking future error=%s", e);
            }
        }
    }

    /* renamed from: S */
    public void K(kk4<wd8, com.taobao.phenix.request.a> kk4Var, boolean z, t9o t9oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26732a57", new Object[]{this, kk4Var, new Boolean(z), t9oVar});
            return;
        }
        v(kk4Var, z);
        com.taobao.phenix.request.a context = kk4Var.getContext();
        fiv.p("Phenix", "Network Read Started.", context);
        sz8.b("phenix", "network_write " + context.d());
        v0a.j(context.Y());
        if (context.i()) {
            fiv.s(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, context, "request is cancelled before reading response stream", new Object[0]);
            kk4Var.b();
            t9oVar.release();
            return;
        }
        int i = t9oVar.b;
        xpq xpqVar = new xpq(kk4Var, i, context.S());
        try {
            ud8 c = ud8.c(t9oVar, xpqVar);
            if (!xpqVar.d()) {
                context.Y().G(c.b);
                if (!c.g) {
                    fiv.o(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, context, "miss bytes while reading response[type:%d], read=%d, content=%d", Integer.valueOf(t9oVar.f28582a), Integer.valueOf(xpqVar.b()), Integer.valueOf(i));
                    kk4Var.a(new IncompleteResponseException());
                    return;
                }
                context.s(this);
                dpe G = context.G();
                u(kk4Var, true, z);
                fiv.p("Phenix", "Network Read Finished.", context);
                sz8.e();
                kk4Var.c(new wd8(c, G.l(), 1, false, G.j()), z);
            }
        } catch (Exception e) {
            fiv.o(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, context, "transform data from response[type:%d] error, read=%d, content=%d, throwable=%s", Integer.valueOf(t9oVar.f28582a), Integer.valueOf(xpqVar.b()), Integer.valueOf(xpqVar.d), e);
            kk4Var.a(e);
        }
    }
}
