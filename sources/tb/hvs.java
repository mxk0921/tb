package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.ContainerType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import tb.pzf;
import tb.qzf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class hvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final njg f20916a;
    public final njg b;
    public final njg c;

    static {
        t2o.a(1002438750);
    }

    public hvs() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f20916a = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.evs
            @Override // tb.d1a
            public final Object invoke() {
                qzf o;
                o = hvs.o();
                return o;
            }
        });
        this.b = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.fvs
            @Override // tb.d1a
            public final Object invoke() {
                pzf e;
                e = hvs.e();
                return e;
            }
        });
        this.c = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.gvs
            @Override // tb.d1a
            public final Object invoke() {
                pzf i;
                i = hvs.i();
                return i;
            }
        });
    }

    public static final pzf e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("1749dfd5", new Object[0]);
        }
        pzf a2 = new re4().a();
        pzf.a.a(a2, "TaoLiveCommonTimeTask", ContainerType.KParallel, 0, 4, null);
        return a2;
    }

    public static final pzf i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("927d557b", new Object[0]);
        }
        pzf a2 = new re4().a();
        pzf.a.a(a2, "TaoLiveCommonTimeTask", ContainerType.KMain, 0, 4, null);
        return a2;
    }

    public static /* synthetic */ void l(hvs hvsVar, d1a d1aVar, long j, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93efdbda", new Object[]{hvsVar, d1aVar, new Long(j), new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            d1aVar = null;
        }
        if ((i & 2) != 0) {
            j = 1000;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        hvsVar.k(d1aVar, j, z);
    }

    public static final xhv m(d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("8df89aa8", new Object[]{d1aVar});
        }
        if (d1aVar != null) {
            d1aVar.invoke();
        }
        return xhv.INSTANCE;
    }

    public static final qzf o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzf) ipChange.ipc$dispatch("aad47c4f", new Object[0]);
        }
        return new re4().b();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            h().destroy();
        }
    }

    public final pzf g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pzf) ipChange.ipc$dispatch("e3d6533a", new Object[]{this});
        }
        return (pzf) this.c.getValue();
    }

    public final qzf h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzf) ipChange.ipc$dispatch("d26b8a46", new Object[]{this});
        }
        return (qzf) this.f20916a.getValue();
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            h().resume();
        }
    }

    public final void k(final d1a<xhv> d1aVar, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8eed17e", new Object[]{this, d1aVar, new Long(j), new Boolean(z)});
        } else {
            qzf.a.a(h(), new d1a() { // from class: tb.dvs
                @Override // tb.d1a
                public final Object invoke() {
                    xhv m;
                    m = hvs.m(d1a.this);
                    return m;
                }
            }, z, j, 0, g(), 8, null);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c96810f", new Object[]{this});
        } else {
            h().b();
        }
    }
}
