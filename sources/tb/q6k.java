package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q6k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lzm<dtl, a> f26549a;
    public lzm<dtl, a> b;
    public ouo c;
    public final ih3 d;
    public boolean e = false;
    public boolean f = true;

    static {
        t2o.a(620757068);
    }

    public q6k(ih3 ih3Var) {
        fpm.d(ih3Var, "ChainBuilders cannot be NULL when DrawableChainProducerSupplier constructed");
        this.d = ih3Var;
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c1c7fa", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.c = ((s0m) this.d).j0().d(this.f).a();
            boolean R0 = ((s0m) this.d).R0();
            if (this.e) {
                this.b = ph3.b(new pki(((s0m) this.d).Z().a()), R0).c(new gt2()).c(new a5o(uw6.class).y(this.c.f())).c(new fq7(((s0m) this.d).h().a(), ((s0m) this.d).i().a())).c(new zc2()).c(new com.taobao.phenix.decode.a().e(this.c.e())).c(new j8h(((s0m) this.d).l().a())).c(new dq7(((s0m) this.d).h().a(), ((s0m) this.d).i().a())).c(new ntj(((s0m) this.d).z().a())).a();
            } else {
                this.b = ph3.b(new pki(((s0m) this.d).Z().a()), R0).c(new a5o(uw6.class)).c(new fq7(((s0m) this.d).h().a(), ((s0m) this.d).i().a())).c(new zc2()).c(new com.taobao.phenix.decode.a().e(this.c.e())).c(new j8h(((s0m) this.d).l().a()).y(this.c.f())).c(new dq7(((s0m) this.d).h().a(), ((s0m) this.d).i().a())).c(new ntj(((s0m) this.d).z().a())).a();
            }
            this.f26549a = null;
        }
    }

    public ouo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouo) ipChange.ipc$dispatch("c0e7dc93", new Object[]{this});
        }
        return this.c;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfa6165", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ac5807", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public synchronized lzm<dtl, a> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzm) ipChange.ipc$dispatch("e5d37b2", new Object[]{this});
        }
        lzm<dtl, a> lzmVar = this.b;
        if (lzmVar != null) {
            return lzmVar;
        }
        if (this.f26549a == null) {
            this.c = new f57(null, 0, 6, 8, 5, 1500, 3, 5, 2, -1, true);
            this.f26549a = ph3.b(new pki(new c6k()), ((s0m) this.d).R0()).c(new a5o(uw6.class)).c(new com.taobao.phenix.decode.a().e(this.c.e())).c(new j8h(new d17()).y(this.c.f())).c(new ntj(new l17())).a();
        }
        fiv.k("NormalChain", "use temporary chain producer before Phenix.instance().build() calling", new Object[0]);
        return this.f26549a;
    }
}
