package tb;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class l9y {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fdt f23200a;
        final /* synthetic */ Callable b;

        public a(fdt fdtVar, Callable callable) {
            this.f23200a = fdtVar;
            this.b = callable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f23200a.d(this.b.call());
            } catch (Exception e) {
                this.f23200a.c(e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b<TResult> implements rpk, qqk, fvk<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f23201a = new CountDownLatch(1);

        public final void a() {
            this.f23201a.countDown();
        }

        @Override // tb.qqk
        public final void onFailure(Exception exc) {
            this.f23201a.countDown();
        }

        @Override // tb.fvk
        public final void onSuccess(TResult tresult) {
            this.f23201a.countDown();
        }
    }

    public static <TResult> TResult a(tct<TResult> tctVar) throws ExecutionException {
        if (tctVar.h()) {
            return tctVar.e();
        }
        throw new ExecutionException(tctVar.d());
    }

    public static void c(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public final <TResult> tct<TResult> b(Executor executor, Callable<TResult> callable) {
        fdt fdtVar = new fdt();
        try {
            executor.execute(new a(fdtVar, callable));
        } catch (Exception e) {
            fdtVar.c(e);
        }
        return fdtVar.b();
    }
}
