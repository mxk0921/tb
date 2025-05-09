package tb;

import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ov6 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(ar4<?> ar4Var) {
        Object obj;
        if (ar4Var instanceof uq7) {
            return ar4Var.toString();
        }
        try {
            obj = Result.m1108constructorimpl(ar4Var + '@' + b(ar4Var));
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        if (Result.m1111exceptionOrNullimpl(obj) != null) {
            obj = ar4Var.getClass().getName() + '@' + b(ar4Var);
        }
        return (String) obj;
    }
}
