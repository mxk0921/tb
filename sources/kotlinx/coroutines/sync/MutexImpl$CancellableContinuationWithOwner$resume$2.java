package kotlinx.coroutines.sync;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.MutexImpl;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class MutexImpl$CancellableContinuationWithOwner$resume$2 extends Lambda implements g1a<Throwable, xhv> {
    final /* synthetic */ MutexImpl this$0;
    final /* synthetic */ MutexImpl.CancellableContinuationWithOwner this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutexImpl$CancellableContinuationWithOwner$resume$2(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        super(1);
        this.this$0 = mutexImpl;
        this.this$1 = cancellableContinuationWithOwner;
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        invoke2(th);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.this$0.unlock(this.this$1.b);
    }
}
