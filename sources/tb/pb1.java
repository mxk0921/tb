package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class pb1<T> implements Iterator<T>, rzf {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f25990a;
    public int b;

    public pb1(T[] tArr) {
        ckf.g(tArr, "array");
        this.f25990a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.b < this.f25990a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f25990a;
            int i = this.b;
            this.b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
