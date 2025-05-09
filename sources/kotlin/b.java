package kotlin;

import kotlin.Result;
import tb.ckf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class b {
    public static final Object a(Throwable th) {
        ckf.g(th, "exception");
        return new Result.Failure(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
