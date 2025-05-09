package tb;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.List;
import mtopsdk.mtop.domain.MtopRequest;
import tb.ck;
import tb.pk;
import tb.ubb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class on extends dt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final q3o c;
    public final dxl b = new dxl();

    /* renamed from: a  reason: collision with root package name */
    public final xbb f25498a = new pk();

    static {
        t2o.a(80740468);
    }

    public on(String str, boolean z) {
        this.c = q3o.Companion.a(pn.a(str));
    }

    public static /* synthetic */ Object ipc$super(on onVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/nextrpc/AURAStreamNextRPCClientV2");
    }

    @Override // tb.ubb
    public void a(AURANextRPCEndpoint aURANextRPCEndpoint, ubb.a aVar) {
        pk.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764a70b6", new Object[]{this, aURANextRPCEndpoint, aVar});
        } else if (aURANextRPCEndpoint.getNextRPCPrefetch() != null) {
            ubb.a f = ((pk) this.f25498a).f(aURANextRPCEndpoint);
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
        } else if (bVar == null || aURANextRPCEndpoint.getNextRPCPrefetch() == null || !((pk) this.f25498a).i(aURANextRPCEndpoint, aVar, bVar)) {
            AURATraceUtil.g(2, "aura-stream-request-start[" + System.currentTimeMillis() + "]");
            MtopRequest b = x5o.b(aURANextRPCEndpoint);
            MtopBusiness a2 = x5o.a(b, aURANextRPCEndpoint);
            a2.supportStreamJson(true);
            if (fj.d("allowParseJson", true)) {
                a2.allowParseJson(false);
            }
            this.b.b();
            a3o a3 = a3o.Companion.a(b, a2);
            a3.i(this.b);
            this.c.d(a3, new a(aVar));
        }
    }

    @Override // tb.ubb
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.c.h();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements r5o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ubb.a f25499a;
        public final long b = System.currentTimeMillis();

        static {
            t2o.a(80740469);
        }

        public a(ubb.a aVar) {
            this.f25499a = aVar;
        }

        @Override // tb.r5o
        public void b(fj9 fj9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9ebfbe3", new Object[]{this, fj9Var});
            }
        }

        @Override // tb.r5o
        public void c(szh szhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40186e18", new Object[]{this, szhVar});
            } else if (this.f25499a != null) {
                this.f25499a.b(f(szhVar));
            }
        }

        @Override // tb.r5o
        public void d(a3o a3oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f01fd9d0", new Object[]{this, a3oVar});
            }
        }

        @Override // tb.r5o
        public void e(List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba18dfd3", new Object[]{this, list, new Boolean(z)});
            } else if (this.f25499a != null) {
                rbb g = ck.g();
                g.e("收到 流式 副响应 " + System.currentTimeMillis(), ck.b.b().i("AURA/performance").a());
                this.f25499a.a(dt.d(list));
            }
        }

        public final mn f(szh szhVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mn) ipChange.ipc$dispatch("93afb2d4", new Object[]{this, szhVar});
            }
            mn mnVar = new mn();
            if (ao.a()) {
                str = "UI";
            } else {
                str = "非UI线程接收到主数据";
            }
            hl.a(str);
            mnVar.A(szhVar.e());
            mnVar.r(szhVar.a());
            mnVar.t(szhVar.b());
            mnVar.v(szhVar.d());
            hl.a("解析主数据结束");
            return mnVar;
        }

        public final mn g(z0i z0iVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mn) ipChange.ipc$dispatch("45921468", new Object[]{this, z0iVar});
            }
            mn mnVar = new mn();
            if (ao.a()) {
                str = "UI";
            } else {
                str = "非UI线程接收到主数据";
            }
            hl.a(str);
            mnVar.A(z0iVar.h());
            mnVar.n(z0iVar.e());
            mnVar.k(z0iVar.g().c);
            mnVar.x(z0iVar.g().d);
            mnVar.o(z0iVar.f());
            mnVar.s(z0iVar.g());
            hl.a("解析主数据结束");
            return mnVar;
        }

        @Override // tb.r5o
        public void a(z0i z0iVar, List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89132812", new Object[]{this, z0iVar, list, new Boolean(z)});
            } else if (this.f25499a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                rbb g = ck.g();
                g.e("收到nextRPC流式2数据 第" + z0iVar.h() + "段 " + currentTimeMillis, ck.b.b().h("uiThread", ao.a()).i("stream").a());
                mn g2 = g(z0iVar);
                try {
                    if (z0iVar.h() == 1) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        uk.b(g2, null);
                        uk.a(g2.g(), 0, this.b, currentTimeMillis2);
                        uk.a(g2.g(), 1, currentTimeMillis, currentTimeMillis2);
                        AURATraceUtil.g(2, "aura-stream-request-thread-switch-end[" + currentTimeMillis2 + "]");
                    }
                    this.f25499a.c(g2, dt.d(list));
                } catch (Throwable th) {
                    ck.g().e(AURATraceUtil.c(th), ck.b.b().i("AURA/error").a());
                    this.f25499a.b(g2);
                }
            }
        }
    }
}
