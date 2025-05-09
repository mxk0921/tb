package tb;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class s17 extends ExecutorCoroutineDispatcher implements Executor {
    public static final s17 INSTANCE = new s17();

    /* renamed from: a  reason: collision with root package name */
    public static final CoroutineDispatcher f27743a;

    static {
        int e;
        niv nivVar = niv.INSTANCE;
        e = q3r.e("kotlinx.coroutines.io.parallelism", hfn.c(64, o3r.a()), 0, 0, 12, null);
        f27743a = nivVar.limitedParallelism(e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(d dVar, Runnable runnable) {
        f27743a.dispatch(dVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(d dVar, Runnable runnable) {
        f27743a.dispatchYield(dVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i) {
        return niv.INSTANCE.limitedParallelism(i);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }
}
