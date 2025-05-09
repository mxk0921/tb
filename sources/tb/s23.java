package tb;

import kotlinx.coroutines.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class s23 {
    public static final void a(q23<?> q23Var, rr7 rr7Var) {
        q23Var.h(new vr7(rr7Var));
    }

    public static final <T> c<T> b(ar4<? super T> ar4Var) {
        if (!(ar4Var instanceof uq7)) {
            return new c<>(ar4Var, 1);
        }
        c<T> k = ((uq7) ar4Var).k();
        if (k != null) {
            if (!k.T()) {
                k = null;
            }
            if (k != null) {
                return k;
            }
        }
        return new c<>(ar4Var, 2);
    }
}
