package tb;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import tb.l9y;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class rft {

    /* renamed from: a  reason: collision with root package name */
    public static final l9y f27349a = new l9y();

    public static <TResult> TResult a(tct<TResult> tctVar) throws ExecutionException, InterruptedException {
        l9y.c("await must not be called on the UI thread");
        if (tctVar.g()) {
            return (TResult) l9y.a(tctVar);
        }
        l9y.b bVar = new l9y.b();
        tctVar.c(bVar);
        tctVar.b(bVar);
        bVar.f23201a.await();
        return (TResult) l9y.a(tctVar);
    }

    public static <TResult> tct<TResult> b(Callable<TResult> callable) {
        return f27349a.b(jet.a(), callable);
    }
}
