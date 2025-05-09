package tb;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlinx.coroutines.a;
import kotlinx.coroutines.m;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ltb/s94;", "T", "Lkotlinx/coroutines/a;", "Ljava/util/function/BiFunction;", "", "Ltb/xhv;", "Lkotlin/coroutines/d;", "context", "Ljava/util/concurrent/CompletableFuture;", "future", "<init>", "(Lkotlin/coroutines/d;Ljava/util/concurrent/CompletableFuture;)V", "value", "exception", "w1", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "u1", "(Ljava/lang/Object;)V", "cause", "", "handled", lca.STAGE_T1, "(Ljava/lang/Throwable;Z)V", "f", "Ljava/util/concurrent/CompletableFuture;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class s94<T> extends a<T> implements BiFunction<T, Throwable, xhv> {
    private final CompletableFuture<T> f;

    public s94(d dVar, CompletableFuture<T> completableFuture) {
        super(dVar, true, true);
        this.f = completableFuture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ xhv apply(Object obj, Throwable th) {
        w1(obj, th);
        return xhv.INSTANCE;
    }

    @Override // kotlinx.coroutines.a
    public void t1(Throwable th, boolean z) {
        this.f.completeExceptionally(th);
    }

    @Override // kotlinx.coroutines.a
    public void u1(T t) {
        this.f.complete(t);
    }

    public void w1(T t, Throwable th) {
        m.a.b(this, null, 1, null);
    }
}
