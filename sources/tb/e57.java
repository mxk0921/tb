package tb;

import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class e57 extends luo {
    public static final e57 INSTANCE = new e57();

    public e57() {
        super(vft.CORE_POOL_SIZE, vft.MAX_POOL_SIZE, vft.IDLE_WORKER_KEEP_ALIVE_NS, vft.DEFAULT_SCHEDULER_NAME);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i) {
        apg.a(i);
        if (i >= vft.CORE_POOL_SIZE) {
            return this;
        }
        return super.limitedParallelism(i);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.Default";
    }
}
