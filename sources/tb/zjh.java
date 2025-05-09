package tb;

import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class zjh extends wjh {

    /* renamed from: a  reason: collision with root package name */
    public final long f32803a;
    public final long b;
    public boolean c;
    public long d;

    public zjh(long j, long j2, long j3) {
        this.f32803a = j3;
        this.b = j2;
        boolean z = false;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 >= 0 : i2 <= 0) {
            z = true;
        }
        this.c = z;
        this.d = !z ? j2 : j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }

    @Override // tb.wjh
    public long nextLong() {
        long j = this.d;
        if (j != this.b) {
            this.d = this.f32803a + j;
        } else if (this.c) {
            this.c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }
}
