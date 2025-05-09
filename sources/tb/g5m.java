package tb;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class g5m extends y20 {
    @Override // tb.y20
    public Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        ckf.f(current, "current(...)");
        return current;
    }

    @Override // kotlin.random.Random
    public double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // kotlin.random.Random
    public int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
