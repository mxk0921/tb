package tb;

import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class wox {
    public static final Object a(ar4<? super xhv> ar4Var) {
        uq7 uq7Var;
        Object obj;
        d context = ar4Var.getContext();
        quf.f(context);
        ar4 c = IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var);
        if (c instanceof uq7) {
            uq7Var = (uq7) c;
        } else {
            uq7Var = null;
        }
        if (uq7Var == null) {
            obj = xhv.INSTANCE;
        } else {
            if (uq7Var.d.isDispatchNeeded(context)) {
                uq7Var.m(context, xhv.INSTANCE);
            } else {
                r rVar = new r();
                d plus = context.plus(rVar);
                xhv xhvVar = xhv.INSTANCE;
                uq7Var.m(plus, xhvVar);
                if (rVar.f15386a) {
                    if (vq7.c(uq7Var)) {
                        obj = dkf.d();
                    } else {
                        obj = xhvVar;
                    }
                }
            }
            obj = dkf.d();
        }
        if (obj == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (obj == dkf.d()) {
            return obj;
        }
        return xhv.INSTANCE;
    }
}
