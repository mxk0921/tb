package tb;

import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class niv extends CoroutineDispatcher {
    public static final niv INSTANCE = new niv();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(d dVar, Runnable runnable) {
        e57.INSTANCE.O0(runnable, vft.BlockingContext, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(d dVar, Runnable runnable) {
        e57.INSTANCE.O0(runnable, vft.BlockingContext, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i) {
        apg.a(i);
        if (i >= vft.MAX_POOL_SIZE) {
            return this;
        }
        return super.limitedParallelism(i);
    }
}
