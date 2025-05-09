package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.w1a;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements w1a<MutexImpl, Object, Object, Object> {
    public static final MutexImpl$onLock$2 INSTANCE = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, MutexImpl.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(MutexImpl mutexImpl, Object obj, Object obj2) {
        mutexImpl.u(obj, obj2);
        return mutexImpl;
    }
}
