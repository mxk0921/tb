package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class hwu implements Iterator<fwu>, rzf {

    /* renamed from: a  reason: collision with root package name */
    public final int f20934a;
    public boolean b;
    public final int c;
    public int d;

    public /* synthetic */ hwu(int i, int i2, int i3, a07 a07Var) {
        this(i, i2, i3);
    }

    public int a() {
        int i = this.d;
        if (i != this.f20934a) {
            this.d = this.c + i;
        } else if (this.b) {
            this.b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ fwu next() {
        return fwu.b(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public hwu(int i, int i2, int i3) {
        int compare;
        this.f20934a = i2;
        boolean z = false;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        if (i3 <= 0 ? compare >= 0 : compare <= 0) {
            z = true;
        }
        this.b = z;
        this.c = i3;
        this.d = !z ? i2 : i;
    }
}
