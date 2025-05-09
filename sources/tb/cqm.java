package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lzm<nqm, a> f17234a;
    public ouo b;
    public final ih3 c;

    static {
        t2o.a(620757073);
    }

    public cqm(ih3 ih3Var) {
        fpm.d(ih3Var, "ChainBuilders cannot be NULL when DrawableChainProducerSupplier constructed");
        this.c = ih3Var;
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c1c7fa", new Object[]{this});
            return;
        }
        if (this.f17234a == null) {
            this.b = ((s0m) this.c).j0().a();
            this.f17234a = ph3.b(new a5o(nqm.class), ((s0m) this.c).R0()).c(new jqm(((s0m) this.c).h().a()).y(this.b.c()).e(this.b.c())).c(new ntj(((s0m) this.c).z().a()).y(this.b.b()).e(this.b.b())).a();
        }
    }

    public synchronized lzm<nqm, a> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lzm) ipChange.ipc$dispatch("e5d37b2", new Object[]{this});
        }
        return this.f17234a;
    }

    public ouo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouo) ipChange.ipc$dispatch("c0e7dc93", new Object[]{this});
        }
        return this.b;
    }
}
