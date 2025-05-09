package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dq7 extends zt1<wd8, wd8> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cq7 k;

    static {
        t2o.a(620757039);
    }

    public dq7(eq7 eq7Var, cq7 cq7Var) {
        super(1, 0, eq7Var);
        this.k = cq7Var;
    }

    public static /* synthetic */ Object ipc$super(dq7 dq7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/cache/disk/DiskCacheReader");
    }

    public final void V(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44527548", new Object[]{this, imageStatistics});
        } else if (s0m.B().s() != null) {
            s0m.B().s().d(imageStatistics);
        }
    }

    public final boolean X(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b784194", new Object[]{this, aVar})).booleanValue();
        }
        cq7 cq7Var = this.k;
        if (cq7Var == null || !cq7Var.d(aVar.O())) {
            return false;
        }
        return true;
    }

    @Override // tb.oh3
    public boolean c(kk4<wd8, a> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        a context = kk4Var.getContext();
        V(kk4Var.getContext().Y());
        if (context.j0()) {
            return false;
        }
        return W(kk4Var, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean W(tb.kk4<tb.wd8, com.taobao.phenix.request.a> r26, com.taobao.phenix.request.a r27) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dq7.W(tb.kk4, com.taobao.phenix.request.a):boolean");
    }
}
