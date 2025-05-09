package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Ltb/xhv;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FutureKt$asCompletableFuture$2 extends Lambda implements g1a<Throwable, xhv> {
    final /* synthetic */ CompletableFuture<xhv> $future;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureKt$asCompletableFuture$2(CompletableFuture<xhv> completableFuture) {
        super(1);
        this.$future = completableFuture;
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        invoke2(th);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        if (th == null) {
            this.$future.complete(xhv.INSTANCE);
        } else {
            this.$future.completeExceptionally(th);
        }
    }
}
