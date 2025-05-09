package tb;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gt2 extends fs1<uw6, uw6, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757011);
    }

    public gt2() {
        super(1, 2);
    }

    public static /* synthetic */ Object ipc$super(gt2 gt2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/bitmap/CacheProcessProducer");
    }

    /* renamed from: P */
    public void K(kk4<uw6, a> kk4Var, boolean z, uw6 uw6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaf58dd", new Object[]{this, kk4Var, new Boolean(z), uw6Var});
        } else {
            kk4Var.c(uw6Var, z);
        }
    }

    public final void Q(kk4<uw6, a> kk4Var) {
        ImageStatistics Y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dbf996", new Object[]{this, kk4Var});
        } else if (s0m.B().s() != null && (Y = kk4Var.getContext().Y()) != null && TextUtils.isEmpty(Y.s)) {
            Y.K = true;
            s0m.B().s().d(Y);
        }
    }

    @Override // tb.oh3
    public boolean c(kk4<uw6, a> kk4Var) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        if (!s0m.B().g0()) {
            fiv.p("Phenix", "CacheProcessProducer conductResult. skip read decoded cache", kk4Var.getContext());
            return false;
        }
        a context = kk4Var.getContext();
        String L = context.L();
        String str = context.Y().t;
        String N = kk4Var.getContext().N();
        if (s0m.B().h0() && "32001".equals(str)) {
            bitmap = jcu.f().e(str, L);
        } else if (s0m.B().b0()) {
            bitmap = f2b.h().g(kk4Var.getContext().W(), context.L());
            if (bitmap != null) {
                fiv.q("Phenix", "CacheProcessorProducer hit local cache from HomePageCacheManager " + context.W() + ", " + context.L(), context, true);
            }
        } else {
            bitmap = us2.e().d(N, L);
            if (bitmap != null) {
                fiv.q("Phenix", "CacheProcessorProducer hit local cache from CacheManager " + N + ", " + context.L(), context, true);
            }
        }
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            fiv.q("Phenix", "CacheProcessorProducer bitmap is recycle " + context.W() + ", " + context.L(), context, true);
            return false;
        }
        uw6 uw6Var = new uw6(null, q0m.a(bitmap).f26429a);
        context.Y().b(ImageStatistics.FromType.FROM_FAST_DISK_CACHE);
        Q(kk4Var);
        kk4Var.c(uw6Var, true);
        if (s0m.B().h0() && TextUtils.equals("32001", context.Y().t)) {
            jcu.f().j(str, context.L(), bitmap);
        } else if (!s0m.B().b0()) {
            us2.e().j(N, context.L(), bitmap);
        }
        return true;
    }
}
