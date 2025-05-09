package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.disk.CacheUnavailableException;
import com.taobao.phenix.cache.disk.CacheWriteFailedException;
import com.taobao.phenix.cache.disk.OnlyCacheFailedException;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jqm extends zt1<nqm, wd8> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757048);
    }

    public jqm(eq7 eq7Var) {
        super(1, 1, eq7Var);
    }

    public static /* synthetic */ Object ipc$super(jqm jqmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/cache/disk/PrefetchDiskCacheProducer");
    }

    /* renamed from: V */
    public void K(kk4<nqm, a> kk4Var, boolean z, wd8 wd8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656d9b5", new Object[]{this, kk4Var, new Boolean(z), wd8Var});
            return;
        }
        a context = kk4Var.getContext();
        ImageStatistics Y = context.Y();
        Y.A(wd8Var.g());
        Y.G(wd8Var.b);
        int U = U(context, wd8Var, true);
        if (U == 1 || U == 2 || U == 0) {
            nqm nqmVar = new nqm();
            nqmVar.f24892a = wd8Var.b;
            v0a.g(context.Y());
            kk4Var.c(nqmVar, z);
            return;
        }
        zp7 T = T(context.E());
        String O = context.O();
        if (U == 3) {
            kk4Var.a(new CacheUnavailableException(T, O));
        } else {
            kk4Var.a(new CacheWriteFailedException(T, O));
        }
    }

    @Override // tb.oh3
    public boolean c(kk4<nqm, a> kk4Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        a context = kk4Var.getContext();
        v0a.e(context.Y());
        if (s0m.B().s() != null) {
            s0m.B().s().d(kk4Var.getContext().Y());
        }
        if (context.j0()) {
            return false;
        }
        t(kk4Var);
        long Q = Q(context.E(), context.D(), context.C());
        if (Q > 0) {
            z = true;
        }
        s(kk4Var, z);
        if (z) {
            context.Y().B = Q;
            v0a.j(context.Y());
            v0a.g(context.Y());
            nqm nqmVar = new nqm();
            nqmVar.f24892a = Q;
            context.O();
            kk4Var.c(nqmVar, true);
        }
        if (z || !context.g0()) {
            return z;
        }
        kk4Var.a(new OnlyCacheFailedException("PrefetchDiskCache"));
        return true;
    }
}
