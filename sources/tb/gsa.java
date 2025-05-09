package tb;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;
import kotlin.b;
import kotlinx.coroutines.android.HandlerContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gsa {
    public static final dsa Main;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Choreographer f20189a;

    static {
        Object obj;
        dsa dsaVar = null;
        try {
            obj = Result.m1108constructorimpl(new HandlerContext(c(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        if (!Result.m1114isFailureimpl(obj)) {
            dsaVar = obj;
        }
        Main = dsaVar;
    }

    public static final Handler c(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            ckf.e(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final void d(Choreographer choreographer, final q23<? super Long> q23Var) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: tb.esa
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                gsa.e(q23.this, j);
            }
        });
    }

    public static final void e(q23 q23Var, long j) {
        q23Var.r(zq7.c(), Long.valueOf(j));
    }

    public static final void f(q23<? super Long> q23Var) {
        Choreographer choreographer = f20189a;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            ckf.d(choreographer);
            f20189a = choreographer;
        }
        d(choreographer, q23Var);
    }
}
