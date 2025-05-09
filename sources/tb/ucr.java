package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSFileEncodingType;
import com.taobao.nanocompose.megability.ability.FileEncodingType;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ucr extends u1<qhc> implements qhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438762);
        t2o.a(1002438802);
    }

    public ucr(asb asbVar) {
        super(asbVar);
    }

    public static /* synthetic */ Object ipc$super(ucr ucrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBFileService");
    }

    public static final xhv k0(ucr ucrVar, g1a g1aVar, final g1a g1aVar2, mc9 mc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d2ca0558", new Object[]{ucrVar, g1aVar, g1aVar2, mc9Var});
        }
        ckf.g(mc9Var, "$this$exists");
        mc9Var.c(new g1a() { // from class: tb.scr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv l0;
                l0 = ucr.l0(g1a.this, (cc9) obj);
                return l0;
            }
        });
        mc9Var.d(ucrVar.N(g1aVar));
        return xhv.INSTANCE;
    }

    public static final xhv l0(final g1a g1aVar, final cc9 cc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b11c91d", new Object[]{g1aVar, cc9Var});
        }
        ckf.g(cc9Var, "result");
        cvs.Companion.e(new d1a() { // from class: tb.gcr
            @Override // tb.d1a
            public final Object invoke() {
                xhv m0;
                m0 = ucr.m0(g1a.this, cc9Var);
                return m0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv m0(g1a g1aVar, cc9 cc9Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7d9741be", new Object[]{g1aVar, cc9Var});
        }
        Boolean a2 = cc9Var.a();
        if (a2 != null) {
            z = a2.booleanValue();
        }
        g1aVar.invoke(Boolean.valueOf(z));
        return xhv.INSTANCE;
    }

    public static final xhv n0(boolean z, ucr ucrVar, g1a g1aVar, final g1a g1aVar2, tc9 tc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("37b6abd2", new Object[]{new Boolean(z), ucrVar, g1aVar, g1aVar2, tc9Var});
        }
        ckf.g(tc9Var, "$this$makeDir");
        tc9Var.f(z);
        tc9Var.d(new g1a() { // from class: tb.tcr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv o0;
                o0 = ucr.o0(g1a.this, (cc9) obj);
                return o0;
            }
        });
        tc9Var.e(ucrVar.N(g1aVar));
        return xhv.INSTANCE;
    }

    public static final xhv o0(final g1a g1aVar, final cc9 cc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("868eaf96", new Object[]{g1aVar, cc9Var});
        }
        ckf.g(cc9Var, "result");
        cvs.Companion.e(new d1a() { // from class: tb.icr
            @Override // tb.d1a
            public final Object invoke() {
                xhv p0;
                p0 = ucr.p0(g1a.this, cc9Var);
                return p0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv p0(g1a g1aVar, cc9 cc9Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("cf074d8f", new Object[]{g1aVar, cc9Var});
        }
        if (g1aVar != null) {
            Boolean a2 = cc9Var.a();
            if (a2 != null) {
                z = a2.booleanValue();
            }
            g1aVar.invoke(Boolean.valueOf(z));
        }
        return xhv.INSTANCE;
    }

    public static final xhv q0(ucr ucrVar, g1a g1aVar, KSFileEncodingType kSFileEncodingType, final g1a g1aVar2, fd9 fd9Var) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("915dcc75", new Object[]{ucrVar, g1aVar, kSFileEncodingType, g1aVar2, fd9Var});
        }
        ckf.g(fd9Var, "$this$readAsString");
        Iterator<E> it = FileEncodingType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ckf.b(((FileEncodingType) obj).getRawValue(), kSFileEncodingType.getRawValue())) {
                break;
            }
        }
        FileEncodingType fileEncodingType = (FileEncodingType) obj;
        if (fileEncodingType == null) {
            fileEncodingType = FileEncodingType.UTF8;
        }
        fd9Var.d(fileEncodingType);
        fd9Var.e(new g1a() { // from class: tb.ocr
            @Override // tb.g1a
            public final Object invoke(Object obj2) {
                xhv r0;
                r0 = ucr.r0(g1a.this, (hd9) obj2);
                return r0;
            }
        });
        fd9Var.f(ucrVar.N(g1aVar));
        return xhv.INSTANCE;
    }

    public static final xhv r0(final g1a g1aVar, final hd9 hd9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("5e427025", new Object[]{g1aVar, hd9Var});
        }
        ckf.g(hd9Var, "result");
        cvs.Companion.e(new d1a() { // from class: tb.qcr
            @Override // tb.d1a
            public final Object invoke() {
                xhv s0;
                s0 = ucr.s0(g1a.this, hd9Var);
                return s0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv s0(g1a g1aVar, hd9 hd9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7a22bf65", new Object[]{g1aVar, hd9Var});
        }
        g1aVar.invoke(hd9Var.a());
        return xhv.INSTANCE;
    }

    public static final xhv t0(ucr ucrVar, g1a g1aVar, final g1a g1aVar2, kd9 kd9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("cd122ff", new Object[]{ucrVar, g1aVar, g1aVar2, kd9Var});
        }
        ckf.g(kd9Var, "$this$removeFile");
        kd9Var.c(new g1a() { // from class: tb.jcr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv u0;
                u0 = ucr.u0(g1a.this, (cc9) obj);
                return u0;
            }
        });
        kd9Var.d(ucrVar.N(g1aVar));
        return xhv.INSTANCE;
    }

    public static final xhv u0(final g1a g1aVar, final cc9 cc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("2de7f0b5", new Object[]{g1aVar, cc9Var});
        }
        ckf.g(cc9Var, "result");
        cvs.Companion.e(new d1a() { // from class: tb.lcr
            @Override // tb.d1a
            public final Object invoke() {
                xhv v0;
                v0 = ucr.v0(g1a.this, cc9Var);
                return v0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv v0(g1a g1aVar, cc9 cc9Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("563759ad", new Object[]{g1aVar, cc9Var});
        }
        if (g1aVar != null) {
            Boolean a2 = cc9Var.a();
            if (a2 != null) {
                z = a2.booleanValue();
            }
            g1aVar.invoke(Boolean.valueOf(z));
        }
        return xhv.INSTANCE;
    }

    public static final xhv w0(ucr ucrVar, g1a g1aVar, final g1a g1aVar2, cf9 cf9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("26422291", new Object[]{ucrVar, g1aVar, g1aVar2, cf9Var});
        }
        ckf.g(cf9Var, "$this$unzip");
        cf9Var.c(new g1a() { // from class: tb.fcr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv x0;
                x0 = ucr.x0(g1a.this, (df9) obj);
                return x0;
            }
        });
        cf9Var.d(ucrVar.N(g1aVar));
        return xhv.INSTANCE;
    }

    public static final xhv x0(final g1a g1aVar, final df9 df9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("22f4d064", new Object[]{g1aVar, df9Var});
        }
        ckf.g(df9Var, "result");
        cvs.Companion.e(new d1a() { // from class: tb.mcr
            @Override // tb.d1a
            public final Object invoke() {
                xhv y0;
                y0 = ucr.y0(g1a.this, df9Var);
                return y0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv y0(g1a g1aVar, df9 df9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("ad2fbe4c", new Object[]{g1aVar, df9Var});
        }
        if (g1aVar != null) {
            g1aVar.invoke(df9Var.a());
        }
        return xhv.INSTANCE;
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.g();
    }

    @Override // tb.qhc
    public void G(String str, final g1a<? super Boolean, xhv> g1aVar, final g1a<? super n0g, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e7de3d", new Object[]{this, str, g1aVar, g1aVar2});
            return;
        }
        ckf.g(str, "path");
        qb9.INSTANCE.B(str, new g1a() { // from class: tb.hcr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv t0;
                t0 = ucr.t0(ucr.this, g1aVar2, g1aVar, (kd9) obj);
                return t0;
            }
        });
    }

    @Override // tb.qhc
    public void e(String str, final KSFileEncodingType kSFileEncodingType, final g1a<? super String, xhv> g1aVar, final g1a<? super n0g, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a3c305", new Object[]{this, str, kSFileEncodingType, g1aVar, g1aVar2});
            return;
        }
        ckf.g(str, "path");
        ckf.g(kSFileEncodingType, "encoding");
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        qb9.INSTANCE.x(str, new g1a() { // from class: tb.ncr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv q0;
                g1a g1aVar3 = g1aVar2;
                KSFileEncodingType kSFileEncodingType2 = kSFileEncodingType;
                q0 = ucr.q0(ucr.this, g1aVar3, kSFileEncodingType2, g1aVar, (fd9) obj);
                return q0;
            }
        });
    }

    @Override // tb.qhc
    public void k(String str, final g1a<? super Boolean, xhv> g1aVar, final g1a<? super n0g, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3525d79", new Object[]{this, str, g1aVar, g1aVar2});
            return;
        }
        ckf.g(str, "path");
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        qb9.INSTANCE.p(str, new g1a() { // from class: tb.pcr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv k0;
                k0 = ucr.k0(ucr.this, g1aVar2, g1aVar, (mc9) obj);
                return k0;
            }
        });
    }

    @Override // tb.qhc
    public void m(String str, final boolean z, final g1a<? super Boolean, xhv> g1aVar, final g1a<? super n0g, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91f4f50", new Object[]{this, str, new Boolean(z), g1aVar, g1aVar2});
            return;
        }
        ckf.g(str, "path");
        qb9.INSTANCE.t(str, new g1a() { // from class: tb.rcr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv n0;
                ucr ucrVar = this;
                g1a g1aVar3 = g1aVar2;
                n0 = ucr.n0(z, ucrVar, g1aVar3, g1aVar, (tc9) obj);
                return n0;
            }
        });
    }

    @Override // tb.qhc
    public void q(String str, String str2, final g1a<? super String, xhv> g1aVar, final g1a<? super n0g, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538b3b8f", new Object[]{this, str, str2, g1aVar, g1aVar2});
            return;
        }
        ckf.g(str, "zipFilePath");
        ckf.g(str2, "targetPath");
        qb9.INSTANCE.F(str, str2, new g1a() { // from class: tb.kcr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv w0;
                w0 = ucr.w0(ucr.this, g1aVar2, g1aVar, (cf9) obj);
                return w0;
            }
        });
    }

    @Override // tb.qhc
    public String s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63bc253d", new Object[]{this, str});
        }
        ckf.g(str, "path");
        String E = tsq.E(str, "file://", "", false, 4, null);
        return og9.INSTANCE.a("Megability") + wh6.DIR + E;
    }
}
