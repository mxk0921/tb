package tb;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class yeo<T> extends c20<T> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f32022a;
    public final int b;
    public int c;
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends y10<T> {
        public int c;
        public int d;
        public final /* synthetic */ yeo<T> e;

        public a(yeo<T> yeoVar) {
            this.e = yeoVar;
            this.c = yeoVar.size();
            this.d = yeoVar.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.y10
        public void a() {
            if (this.c == 0) {
                c();
                return;
            }
            yeo<T> yeoVar = this.e;
            d(yeoVar.f32022a[this.d]);
            this.d = (this.d + 1) % yeoVar.b;
            this.c--;
        }
    }

    public yeo(Object[] objArr, int i) {
        ckf.g(objArr, pg1.ATOM_EXT_buffer);
        this.f32022a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        } else if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    public final void f(T t) {
        if (!h()) {
            this.f32022a[(this.c + size()) % this.b] = t;
            this.d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yeo<T> g(int i) {
        Object[] objArr;
        int i2 = this.b;
        int f = hfn.f(i2 + (i2 >> 1) + 1, i);
        if (this.c == 0) {
            objArr = Arrays.copyOf(this.f32022a, f);
            ckf.f(objArr, "copyOf(...)");
        } else {
            objArr = toArray(new Object[f]);
        }
        return new yeo<>(objArr, size());
    }

    @Override // tb.c20, java.util.List
    public T get(int i) {
        c20.Companion.b(i, size());
        return (T) this.f32022a[(this.c + i) % this.b];
    }

    @Override // tb.c20, tb.n00
    public int getSize() {
        return this.d;
    }

    public final boolean h() {
        if (size() == this.b) {
            return true;
        }
        return false;
    }

    public final void i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        } else if (i > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        } else if (i > 0) {
            int i2 = this.c;
            int i3 = (i2 + i) % this.b;
            Object[] objArr = this.f32022a;
            if (i2 > i3) {
                hc1.q(objArr, null, i2, this.b);
                hc1.q(objArr, null, 0, i3);
            } else {
                hc1.q(objArr, null, i2, i3);
            }
            this.c = i3;
            this.d = size() - i;
        }
    }

    @Override // tb.c20, tb.n00, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.n00, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Object[] objArr;
        ckf.g(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            ckf.f(tArr, "copyOf(...)");
        }
        int size = size();
        int i = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr = this.f32022a;
            if (i3 >= size || i >= this.b) {
                break;
            }
            tArr[i3] = objArr[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            tArr[i3] = objArr[i2];
            i3++;
            i2++;
        }
        xz3.f(size, tArr);
        return tArr;
    }

    public yeo(int i) {
        this(new Object[i], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.n00, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
