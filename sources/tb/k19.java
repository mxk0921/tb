package tb;

import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class k19 {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f22337a;

    static {
        Object obj;
        try {
            obj = Result.m1108constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        f22337a = Result.m1115isSuccessimpl(obj);
    }

    public static final boolean a() {
        return f22337a;
    }
}
