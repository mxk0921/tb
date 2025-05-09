package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class mwu implements Iterator<kwu>, rzf {

    /* renamed from: a  reason: collision with root package name */
    public final long f24357a;
    public boolean b;
    public final long c;
    public long d;

    public /* synthetic */ mwu(long j, long j2, long j3, a07 a07Var) {
        this(j, j2, j3);
    }

    public long a() {
        long j = this.d;
        if (j != this.f24357a) {
            this.d = this.c + j;
        } else if (this.b) {
            this.b = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ kwu next() {
        return kwu.b(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public mwu(long j, long j2, long j3) {
        int compare;
        this.f24357a = j2;
        boolean z = false;
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        if (i <= 0 ? compare >= 0 : compare <= 0) {
            z = true;
        }
        this.b = z;
        this.c = j3;
        this.d = !z ? j2 : j;
    }
}
