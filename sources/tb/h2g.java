package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.h2g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h2g<RCT extends h2g<RCT>> implements hic<RCT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RCT f20370a;
    public final i2g b;
    public String c;

    static {
        t2o.a(1002438688);
        t2o.a(1002438686);
    }

    public h2g(RCT rct, i2g i2gVar) {
        this.f20370a = rct;
        this.b = i2gVar;
    }

    public <X extends d2g<Y, Z>, Y extends fic, Z extends hic<RCT>> X a(g1a<? super hic<RCT>, ? extends X> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X) ((d2g) ipChange.ipc$dispatch("512ff57a", new Object[]{this, g1aVar}));
        }
        ckf.g(g1aVar, "factory");
        return (X) ((d2g) g1aVar.invoke(this));
    }

    public <X extends k2g<Z>, Z extends hic<RCT>> X b(g1a<? super hic<RCT>, ? extends X> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X) ((k2g) ipChange.ipc$dispatch("25df9922", new Object[]{this, g1aVar}));
        }
        ckf.g(g1aVar, "factory");
        return (X) ((k2g) g1aVar.invoke(this));
    }

    public <X extends iic> X e(g1a<? super hic<RCT>, ? extends X> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X) ((iic) ipChange.ipc$dispatch("aa53aed0", new Object[]{this, g1aVar}));
        }
        ckf.g(g1aVar, "factory");
        return (X) ((iic) g1aVar.invoke(this));
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        RCT m = m();
        if (m != null) {
            m.f();
        }
    }

    public <X extends p2g<Z>, Z extends hic<RCT>> X g(g1a<? super hic<RCT>, ? extends X> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X) ((p2g) ipChange.ipc$dispatch("8e68b606", new Object[]{this, g1aVar}));
        }
        ckf.g(g1aVar, "factory");
        return (X) ((p2g) g1aVar.invoke(this));
    }

    public <X extends g3g<Z>, Z extends hic<RCT>> X h(g1a<? super hic<RCT>, ? extends X> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X) ((g3g) ipChange.ipc$dispatch("f07842c5", new Object[]{this, g1aVar}));
        }
        ckf.g(g1aVar, "factory");
        return (X) ((g3g) g1aVar.invoke(this));
    }

    public <X extends i3g<Z, DT>, Z extends hic<RCT>, DT extends gic> X j(g1a<? super hic<RCT>, ? extends X> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X) ((i3g) ipChange.ipc$dispatch("3c757ff7", new Object[]{this, g1aVar}));
        }
        ckf.g(g1aVar, "factory");
        return (X) ((i3g) g1aVar.invoke(this));
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("238da2f3", new Object[]{this});
        }
        return this.c;
    }

    public final i2g l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2g) ipChange.ipc$dispatch("45d1ad7e", new Object[]{this});
        }
        return this.b;
    }

    public RCT m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RCT) ((h2g) ipChange.ipc$dispatch("260d467a", new Object[]{this}));
        }
        return this.f20370a;
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43374a6", new Object[]{this, str});
            return;
        }
        ckf.g(str, "identifier");
        this.c = str;
    }
}
