package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class y10<T> implements Iterator<T>, rzf {

    /* renamed from: a  reason: collision with root package name */
    public int f31775a;
    public T b;

    public abstract void a();

    public final void c() {
        this.f31775a = 2;
    }

    public final void d(T t) {
        this.b = t;
        this.f31775a = 1;
    }

    public final boolean e() {
        this.f31775a = 3;
        a();
        if (this.f31775a == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.f31775a;
        if (i == 0) {
            return e();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f31775a;
        if (i == 1) {
            this.f31775a = 0;
            return this.b;
        } else if (i == 2 || !e()) {
            throw new NoSuchElementException();
        } else {
            this.f31775a = 0;
            return this.b;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
