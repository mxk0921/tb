package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.k9p;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public /* synthetic */ class LazyActorCoroutine$onSend$1 extends FunctionReferenceImpl implements w1a<LazyActorCoroutine<?>, k9p<?>, Object, xhv> {
    public static final LazyActorCoroutine$onSend$1 INSTANCE = new LazyActorCoroutine$onSend$1();

    public LazyActorCoroutine$onSend$1() {
        super(3, LazyActorCoroutine.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(LazyActorCoroutine<?> lazyActorCoroutine, k9p<?> k9pVar, Object obj) {
        invoke2(lazyActorCoroutine, k9pVar, obj);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyActorCoroutine<?> lazyActorCoroutine, k9p<?> k9pVar, Object obj) {
        lazyActorCoroutine.y1(k9pVar, obj);
    }
}
