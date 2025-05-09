package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.ability.DownloaderNetworkType;
import com.taobao.nanocompose.megability.ability.DownloaderRequestType;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ubr extends u1<phc> implements phc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438761);
        t2o.a(1002438799);
    }

    public ubr(asb asbVar) {
        super(asbVar);
    }

    public static final xhv c0(h0g h0gVar, ubr ubrVar, g1a g1aVar, final g1a g1aVar2, final g1a g1aVar3, final d1a d1aVar, vv7 vv7Var) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("a1826c14", new Object[]{h0gVar, ubrVar, g1aVar, g1aVar2, g1aVar3, d1aVar, vv7Var});
        }
        ckf.g(vv7Var, "$this$download");
        if (h0gVar != null) {
            vv7Var.r(h0gVar.f());
            vv7Var.q(h0gVar.e());
            Iterator<E> it = DownloaderRequestType.getEntries().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (ckf.b(((DownloaderRequestType) obj2).getRawValue(), h0gVar.d().getRawValue())) {
                    break;
                }
            }
            DownloaderRequestType downloaderRequestType = (DownloaderRequestType) obj2;
            if (downloaderRequestType == null) {
                downloaderRequestType = DownloaderRequestType.GET;
            }
            vv7Var.p(downloaderRequestType);
            vv7Var.x(h0gVar.h());
            vv7Var.o(h0gVar.c());
            Iterator<E> it2 = DownloaderNetworkType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (ckf.b(((DownloaderNetworkType) next).getRawValue(), h0gVar.g().getRawValue())) {
                    obj = next;
                    break;
                }
            }
            DownloaderNetworkType downloaderNetworkType = (DownloaderNetworkType) obj;
            if (downloaderNetworkType == null) {
                downloaderNetworkType = DownloaderNetworkType.ANY;
            }
            vv7Var.s(downloaderNetworkType);
            vv7Var.n(h0gVar.b());
            vv7Var.m(h0gVar.a());
        }
        vv7Var.u(new g1a() { // from class: tb.obr
            @Override // tb.g1a
            public final Object invoke(Object obj3) {
                xhv h0;
                h0 = ubr.h0(g1a.this, (uv7) obj3);
                return h0;
            }
        });
        vv7Var.w(new g1a() { // from class: tb.pbr
            @Override // tb.g1a
            public final Object invoke(Object obj3) {
                xhv d0;
                d0 = ubr.d0(g1a.this, (yv7) obj3);
                return d0;
            }
        });
        vv7Var.t(new d1a() { // from class: tb.qbr
            @Override // tb.d1a
            public final Object invoke() {
                xhv f0;
                f0 = ubr.f0(d1a.this);
                return f0;
            }
        });
        vv7Var.v(ubrVar.N(g1aVar));
        return xhv.INSTANCE;
    }

    public static final xhv d0(final g1a g1aVar, final yv7 yv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e5f3c642", new Object[]{g1aVar, yv7Var});
        }
        ckf.g(yv7Var, "progress");
        cvs.Companion.e(new d1a() { // from class: tb.rbr
            @Override // tb.d1a
            public final Object invoke() {
                xhv e0;
                e0 = ubr.e0(g1a.this, yv7Var);
                return e0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv e0(g1a g1aVar, yv7 yv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("89bebc01", new Object[]{g1aVar, yv7Var});
        }
        if (g1aVar != null) {
            i0g i0gVar = new i0g();
            i0gVar.a(yv7Var.a());
            g1aVar.invoke(i0gVar);
        }
        return xhv.INSTANCE;
    }

    public static final xhv f0(final d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("9fb0462a", new Object[]{d1aVar});
        }
        cvs.Companion.e(new d1a() { // from class: tb.tbr
            @Override // tb.d1a
            public final Object invoke() {
                xhv g0;
                g0 = ubr.g0(d1a.this);
                return g0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv g0(d1a d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("97c38063", new Object[]{d1aVar});
        }
        if (d1aVar != null) {
            d1aVar.invoke();
        }
        return xhv.INSTANCE;
    }

    public static final xhv h0(final g1a g1aVar, final uv7 uv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d607b095", new Object[]{g1aVar, uv7Var});
        }
        ckf.g(uv7Var, "complete");
        cvs.Companion.e(new d1a() { // from class: tb.sbr
            @Override // tb.d1a
            public final Object invoke() {
                xhv i0;
                i0 = ubr.i0(g1a.this, uv7Var);
                return i0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv i0(g1a g1aVar, uv7 uv7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c4810814", new Object[]{g1aVar, uv7Var});
        }
        if (g1aVar != null) {
            f0g f0gVar = new f0g();
            f0gVar.a(uv7Var.a());
            g1aVar.invoke(f0gVar);
        }
        return xhv.INSTANCE;
    }

    public static /* synthetic */ Object ipc$super(ubr ubrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBDownloaderService");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.f();
    }

    @Override // tb.phc
    public g0g w(String str, String str2, final g1a<? super f0g, xhv> g1aVar, final g1a<? super i0g, xhv> g1aVar2, final d1a<xhv> d1aVar, final g1a<? super n0g, xhv> g1aVar3, final h0g h0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g0g) ipChange.ipc$dispatch("5ccff2c7", new Object[]{this, str, str2, g1aVar, g1aVar2, d1aVar, g1aVar3, h0gVar});
        }
        ckf.g(str, "path");
        ckf.g(str2, "url");
        sv7 a2 = sv7.Companion.a();
        a2.e(str, str2, new g1a() { // from class: tb.nbr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv c0;
                g1a g1aVar4 = g1aVar;
                g1a g1aVar5 = g1aVar2;
                c0 = ubr.c0(h0g.this, this, g1aVar3, g1aVar4, g1aVar5, d1aVar, (vv7) obj);
                return c0;
            }
        });
        return new g0g(a2);
    }
}
