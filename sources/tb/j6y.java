package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class j6y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097410);
    }

    public static <T, U> void a(i6y<T> i6yVar, r9y<? super U> r9yVar, boolean z, sxx sxxVar, p8y<T, U> p8yVar) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46324045", new Object[]{i6yVar, r9yVar, new Boolean(z), sxxVar, p8yVar});
            return;
        }
        int i = 1;
        while (!b(p8yVar.d(), i6yVar.d(), r9yVar, z, i6yVar, sxxVar, p8yVar)) {
            while (true) {
                boolean d = p8yVar.d();
                T c = i6yVar.c();
                if (c == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!b(d, z2, r9yVar, z, i6yVar, sxxVar, p8yVar)) {
                    if (z2) {
                        i = p8yVar.a(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        p8yVar.a(r9yVar, c);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static <T, U> boolean b(boolean z, boolean z2, r9y<?> r9yVar, boolean z3, u7y<?> u7yVar, sxx sxxVar, p8y<T, U> p8yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6649b168", new Object[]{new Boolean(z), new Boolean(z2), r9yVar, new Boolean(z3), u7yVar, sxxVar, p8yVar})).booleanValue();
        }
        if (p8yVar.c()) {
            u7yVar.e();
            sxxVar.b_();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable f = p8yVar.f();
                if (f != null) {
                    u7yVar.e();
                    if (sxxVar != null) {
                        sxxVar.b_();
                    }
                    r9yVar.onError(f);
                    return true;
                } else if (z2) {
                    if (sxxVar != null) {
                        sxxVar.b_();
                    }
                    r9yVar.onComplete();
                    return true;
                }
            } else if (z2) {
                if (sxxVar != null) {
                    sxxVar.b_();
                }
                Throwable f2 = p8yVar.f();
                if (f2 != null) {
                    r9yVar.onError(f2);
                } else {
                    r9yVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
