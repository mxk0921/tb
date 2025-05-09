package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j8h extends fs1<wd8, wd8, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final rc9 j;

    static {
        t2o.a(620757112);
    }

    public j8h(rc9 rc9Var) {
        super(1, 0);
        this.j = rc9Var;
    }

    public static /* synthetic */ Object ipc$super(j8h j8hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/loader/file/LocalImageProducer");
    }

    public final ud8 P(kk4<wd8, a> kk4Var, boolean z, uuo uuoVar, String str) throws Exception {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ud8) ipChange.ipc$dispatch("b4bd0e76", new Object[]{this, kk4Var, new Boolean(z), uuoVar, str});
        }
        a context = kk4Var.getContext();
        t9o a2 = this.j.a(uuoVar, str, context.I());
        if (context.i()) {
            fiv.s("LocalFile", context, "Request is cancelled before reading file", new Object[0]);
            kk4Var.b();
            a2.release();
            return null;
        }
        int i2 = a2.b;
        if (!z) {
            i = context.S();
        }
        xpq xpqVar = new xpq(kk4Var, i2, i);
        ud8 c = ud8.c(a2, xpqVar);
        if (xpqVar.d()) {
            return null;
        }
        return c;
    }

    @Override // tb.oh3
    public boolean c(kk4<wd8, a> kk4Var) {
        char c;
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        a context = kk4Var.getContext();
        dpe G = context.G();
        dpe X = context.X();
        uuo m = G.m();
        if (m.a()) {
            c = 1;
        } else {
            c = (X == null || !X.m().a()) ? (char) 0 : (char) 2;
        }
        if (c == 0) {
            return false;
        }
        String l = G.l();
        t(kk4Var);
        fiv.p("Phenix", "LocalImage started.", context);
        ud8 ud8Var = null;
        if (c != 1) {
            if (c == 2) {
                try {
                    l = X.l();
                    ud8Var = P(kk4Var, true, X.m(), l);
                    kk4Var.getContext().x();
                    fiv.n("LocalFile", l, "load file(secondary) result=%B", Boolean.valueOf(ud8Var != null && ud8Var.a()));
                } catch (Exception e) {
                    fiv.r("LocalFile", l, "load file(secondary) error=%s", e);
                }
            }
            z = false;
        } else {
            try {
                ud8Var = P(kk4Var, false, m, l);
                fiv.n("LocalFile", l, "load file result=%B", Boolean.valueOf(ud8Var != null && ud8Var.a()));
            } catch (Exception e2) {
                fiv.r("LocalFile", l, "load file error=%s", e2);
                kk4Var.a(e2);
            }
            l = l;
            z = true;
        }
        s(kk4Var, z);
        fiv.p("Phenix", "LocalImage Finished.", context);
        if (ud8Var != null) {
            if (z) {
                context.Y().G(ud8Var.b);
                context.Y().B = ud8Var.b;
                v0a.j(context.Y());
            }
            wd8 wd8Var = new wd8(ud8Var, l, 1, true, G.j());
            if (c != 2) {
                z2 = false;
            }
            wd8Var.p = z2;
            kk4Var.c(wd8Var, z);
        }
        return z;
    }
}
