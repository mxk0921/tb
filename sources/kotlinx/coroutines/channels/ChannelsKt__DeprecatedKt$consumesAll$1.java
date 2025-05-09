package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.bj3;
import tb.g1a;
import tb.sm8;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Ltb/xhv;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class ChannelsKt__DeprecatedKt$consumesAll$1 extends Lambda implements g1a<Throwable, xhv> {
    final /* synthetic */ ReceiveChannel<?>[] $channels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$consumesAll$1(ReceiveChannel<?>[] receiveChannelArr) {
        super(1);
        this.$channels = receiveChannelArr;
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        invoke2(th);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Throwable th2 = null;
        for (ReceiveChannel<?> receiveChannel : this.$channels) {
            try {
                bj3.b(receiveChannel, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    sm8.a(th2, th3);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }
}
