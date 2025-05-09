package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.k9p;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements w1a<MutexImpl, k9p<?>, Object, xhv> {
    public static final MutexImpl$onLock$1 INSTANCE = new MutexImpl$onLock$1();

    public MutexImpl$onLock$1() {
        super(3, MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(MutexImpl mutexImpl, k9p<?> k9pVar, Object obj) {
        invoke2(mutexImpl, k9pVar, obj);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MutexImpl mutexImpl, k9p<?> k9pVar, Object obj) {
        mutexImpl.v(k9pVar, obj);
    }
}
