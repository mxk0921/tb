package tb;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.LimitedConcurrentHashMap;
import com.taobao.phenix.cache.memory.LimitedQueue;
import com.taobao.phenix.cache.memory.MemOnlyFailedException;
import com.taobao.phenix.request.ImageStatistics;
import java.util.Iterator;
import java.util.Map;
import tb.ojq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pki extends fs1<dtl, uw6, com.taobao.phenix.request.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ojq.a m = new a();
    public final vmh<String, bu2> j;
    public final LimitedQueue<String> k = s0m.B().t();
    public final LimitedConcurrentHashMap<String, Integer> l = new LimitedConcurrentHashMap<>(1024);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ojq.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(ojq ojqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b69e31f3", new Object[]{this, ojqVar});
                return;
            }
            xc2 a2 = s0m.B().c().a();
            if (a2 != null) {
                a2.d(ojqVar);
            }
        }
    }

    static {
        t2o.a(620757058);
    }

    public pki(vmh<String, bu2> vmhVar) {
        super(1, 1);
        fpm.c(vmhVar);
        this.j = vmhVar;
    }

    public static dtl R(vmh<String, bu2> vmhVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtl) ipChange.ipc$dispatch("8710106f", new Object[]{vmhVar, str, new Boolean(z)});
        }
        bu2 bu2Var = vmhVar.get(str);
        if (bu2Var == null) {
            return null;
        }
        dtl V = V(bu2Var, z);
        if (V != null) {
            V.c(true);
            Bitmap bitmap = V.getBitmap();
            if (bitmap != null && bitmap.isRecycled()) {
                vmhVar.remove(str);
                return null;
            }
        }
        return V;
    }

    public static dtl S(vmh<String, bu2> vmhVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtl) ipChange.ipc$dispatch("7d4bf54f", new Object[]{vmhVar, str, new Boolean(z)});
        }
        bu2 bu2Var = vmhVar.get(str);
        if (bu2Var == null) {
            return null;
        }
        dtl V = V(bu2Var, z);
        if (V != null) {
            V.c(true);
            Bitmap bitmap = V.getBitmap();
            if (bitmap != null && bitmap.isRecycled()) {
                vmhVar.remove(str);
                return null;
            }
        }
        return V;
    }

    public static bu2 U(com.taobao.phenix.request.a aVar, uw6 uw6Var, ojq.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bu2) ipChange.ipc$dispatch("92b8b699", new Object[]{aVar, uw6Var, aVar2});
        }
        dpe G = aVar.G();
        if (uw6Var.f()) {
            return new ojq(uw6Var.b(), uw6Var.c(), G.k(), G.g(), G.f(), aVar.E()).n(aVar2);
        }
        return new zx0(uw6Var.a(), G.k(), G.g(), G.f(), aVar.E());
    }

    public static dtl V(bu2 bu2Var, boolean z) {
        Resources resources;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtl) ipChange.ipc$dispatch("3bbb4c2f", new Object[]{bu2Var, new Boolean(z)});
        }
        if (s0m.B().b() != null) {
            resources = s0m.B().b().getResources();
        } else {
            resources = null;
        }
        return bu2Var.e(z, resources);
    }

    public static /* synthetic */ Object ipc$super(pki pkiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/cache/memory/MemoryCacheProducer");
    }

    public final void Q(kk4<dtl, com.taobao.phenix.request.a> kk4Var) {
        ImageStatistics Y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dbf996", new Object[]{this, kk4Var});
        } else if (s0m.B().s() != null && (Y = kk4Var.getContext().Y()) != null) {
            Y.K = true;
            s0m.B().s().d(Y);
        }
    }

    public final String T(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45f2f1ee", new Object[]{this, map});
        }
        return (map == null || (str = map.get("origin_url")) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(tb.kk4<tb.dtl, com.taobao.phenix.request.a> r13, boolean r14, tb.uw6 r15) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pki.K(tb.kk4, boolean, tb.uw6):void");
    }

    @Override // tb.oh3
    public boolean c(kk4<dtl, com.taobao.phenix.request.a> kk4Var) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.taobao.phenix.request.a context = kk4Var.getContext();
        sz8.b("phenix", "mem_read " + context.d());
        v0a.e(context.Y());
        if (kk4Var.getContext().j0() || kk4Var.getContext().k0()) {
            sz8.e();
            return false;
        }
        t(kk4Var);
        String L = context.L();
        boolean h0 = context.h0();
        boolean z = TextUtils.equals(context.Y().t, "10086") || TextUtils.equals(context.Y().t, "51");
        dtl R = R(this.j, L, h0);
        if (z && R != null) {
            try {
                R.getBitmap();
            } catch (Throwable unused) {
            }
        }
        boolean z2 = R != null;
        boolean e0 = context.e0();
        if (!z2 && !e0) {
            String[] strArr = nd2.WHITE_LIST_FUZZY_CACHE;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (TextUtils.equals(context.Y().t, strArr[i])) {
                    e0 = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2 && s0m.B().F() && e0) {
            String F = context.F();
            if (!TextUtils.isEmpty(F)) {
                Iterator<String> it = this.k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(F) && next.contains(F)) {
                        R = S(this.j, next, h0);
                        if (R != null) {
                            if (s0m.B().J() && !context.l0() && !context.b0() && (num = this.l.get(next)) != null && (num.intValue() == 0 || (context.Z() != 0 && (num.intValue() >= context.Z() || context.Z() - num.intValue() <= 60)))) {
                                z2 = true;
                            }
                            if (context.e0() || z2) {
                                context.Y().x(true);
                            }
                        }
                    }
                }
                if (!z2 && !context.e0()) {
                    R = null;
                }
            }
        }
        if (!z2 && R == null && context.X() != null && (R = R(this.j, context.X().k(), h0)) != null) {
            R.d(true);
            context.x();
        }
        if (z2) {
            Q(kk4Var);
        }
        s(kk4Var, z2);
        if (R != null) {
            kk4Var.c(R, z2);
            context.Y().y(true);
        } else {
            context.Y().y(false);
        }
        sz8.e();
        if (z2 || R != null || !context.f0()) {
            fiv.q("Phenix", "End, duration = " + (System.currentTimeMillis() - currentTimeMillis), context, true);
            return z2;
        }
        kk4Var.a(new MemOnlyFailedException());
        Q(kk4Var);
        return true;
    }
}
