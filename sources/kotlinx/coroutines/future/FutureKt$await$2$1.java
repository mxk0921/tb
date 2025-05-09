package kotlinx.coroutines.future;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class FutureKt$await$2$1 extends Lambda implements g1a<Throwable, xhv> {
    final /* synthetic */ a<Object> $consumer;
    final /* synthetic */ CompletableFuture<Object> $future;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureKt$await$2$1(CompletableFuture<Object> completableFuture, a<Object> aVar) {
        super(1);
        this.$future = completableFuture;
        this.$consumer = aVar;
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        invoke2(th);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$future.cancel(false);
        this.$consumer.f15380a = null;
    }
}
