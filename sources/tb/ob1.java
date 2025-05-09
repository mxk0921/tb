package tb;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ob1<E> extends q20<E> {
    public static final a Companion = new a(null);
    public static final Object[] d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f25274a;
    public Object[] b;
    public int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public ob1(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.b = objArr;
    }

    public final void a(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.f25274a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        if (collection.isEmpty()) {
            return false;
        }
        registerModification();
        e(size() + collection.size());
        a(j(this.f25274a + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        registerModification();
        e(size() + 1);
        int d2 = d(this.f25274a);
        this.f25274a = d2;
        this.b[d2] = e;
        this.c = size() + 1;
    }

    public final void addLast(E e) {
        registerModification();
        e(size() + 1);
        this.b[j(this.f25274a + size())] = e;
        this.c = size() + 1;
    }

    public final void c(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.b;
        hc1.h(objArr2, objArr, 0, this.f25274a, objArr2.length);
        Object[] objArr3 = this.b;
        int length = objArr3.length;
        int i2 = this.f25274a;
        hc1.h(objArr3, objArr, length - i2, 0, i2);
        this.f25274a = 0;
        this.b = objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            registerModification();
            i(this.f25274a, j(this.f25274a + size()));
        }
        this.f25274a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i) {
        if (i == 0) {
            return ic1.K(this.b);
        }
        return i - 1;
    }

    public final void e(int i) {
        if (i >= 0) {
            Object[] objArr = this.b;
            if (i > objArr.length) {
                if (objArr == d) {
                    this.b = new Object[hfn.c(i, 10)];
                } else {
                    c(c20.Companion.e(objArr.length, i));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    public final int f(int i) {
        if (i == ic1.K(this.b)) {
            return 0;
        }
        return i + 1;
    }

    public final E g() {
        if (!isEmpty()) {
            return (E) this.b[j(this.f25274a + yz3.k(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        c20.Companion.b(i, size());
        return (E) this.b[j(this.f25274a + i)];
    }

    @Override // tb.q20
    public int getSize() {
        return this.c;
    }

    public final int h(int i) {
        if (i < 0) {
            return i + this.b.length;
        }
        return i;
    }

    public final void i(int i, int i2) {
        if (i < i2) {
            hc1.q(this.b, null, i, i2);
            return;
        }
        Object[] objArr = this.b;
        hc1.q(objArr, null, i, objArr.length);
        hc1.q(this.b, null, 0, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int j = j(this.f25274a + size());
        int i2 = this.f25274a;
        if (i2 < j) {
            while (i2 < j) {
                if (ckf.b(obj, this.b[i2])) {
                    i = this.f25274a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < j) {
            return -1;
        } else {
            int length = this.b.length;
            while (true) {
                if (i2 >= length) {
                    for (int i3 = 0; i3 < j; i3++) {
                        if (ckf.b(obj, this.b[i3])) {
                            i2 = i3 + this.b.length;
                            i = this.f25274a;
                        }
                    }
                    return -1;
                } else if (ckf.b(obj, this.b[i2])) {
                    i = this.f25274a;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i) {
        Object[] objArr = this.b;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final E k() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final void l(int i, int i2) {
        int j = j(this.f25274a + (i - 1));
        int j2 = j(this.f25274a + (i2 - 1));
        while (i > 0) {
            int i3 = j + 1;
            int min = Math.min(i, Math.min(i3, j2 + 1));
            Object[] objArr = this.b;
            int i4 = j2 - min;
            int i5 = j - min;
            hc1.h(objArr, objArr, i4 + 1, i5 + 1, i3);
            j = h(i5);
            j2 = h(i4);
            i -= min;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int K;
        int i;
        int j = j(this.f25274a + size());
        int i2 = this.f25274a;
        if (i2 < j) {
            K = j - 1;
            if (i2 <= K) {
                while (!ckf.b(obj, this.b[K])) {
                    if (K != i2) {
                        K--;
                    }
                }
                i = this.f25274a;
                return K - i;
            }
            return -1;
        }
        if (i2 > j) {
            int i3 = j - 1;
            while (true) {
                if (-1 >= i3) {
                    K = ic1.K(this.b);
                    int i4 = this.f25274a;
                    if (i4 <= K) {
                        while (!ckf.b(obj, this.b[K])) {
                            if (K != i4) {
                                K--;
                            }
                        }
                        i = this.f25274a;
                    }
                } else if (ckf.b(obj, this.b[i3])) {
                    K = i3 + this.b.length;
                    i = this.f25274a;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return -1;
    }

    public final void m(int i, int i2) {
        int j = j(this.f25274a + i2);
        int j2 = j(this.f25274a + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size > 0) {
                Object[] objArr = this.b;
                i2 = Math.min(size, Math.min(objArr.length - j, objArr.length - j2));
                Object[] objArr2 = this.b;
                int i3 = j + i2;
                hc1.h(objArr2, objArr2, j2, j, i3);
                j = j(i3);
                j2 = j(j2 + i2);
            } else {
                return;
            }
        }
    }

    public final void registerModification() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int i;
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int j = j(this.f25274a + size());
            int i2 = this.f25274a;
            if (i2 < j) {
                i = i2;
                while (i2 < j) {
                    Object obj = this.b[i2];
                    if (!collection.contains(obj)) {
                        this.b[i] = obj;
                        i++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                hc1.q(this.b, null, i, j);
            } else {
                int length = this.b.length;
                int i3 = i2;
                boolean z2 = false;
                while (i2 < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                i = j(i3);
                for (int i4 = 0; i4 < j; i4++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (!collection.contains(obj3)) {
                        this.b[i] = obj3;
                        i = f(i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.c = h(i - this.f25274a);
            }
        }
        return z;
    }

    @Override // tb.q20
    public E removeAt(int i) {
        c20.Companion.b(i, size());
        if (i == yz3.k(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int j = j(this.f25274a + i);
        E e = (E) this.b[j];
        if (i < (size() >> 1)) {
            int i2 = this.f25274a;
            if (j >= i2) {
                Object[] objArr = this.b;
                hc1.h(objArr, objArr, i2 + 1, i2, j);
            } else {
                Object[] objArr2 = this.b;
                hc1.h(objArr2, objArr2, 1, 0, j);
                Object[] objArr3 = this.b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f25274a;
                hc1.h(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.b;
            int i4 = this.f25274a;
            objArr4[i4] = null;
            this.f25274a = f(i4);
        } else {
            int j2 = j(this.f25274a + yz3.k(this));
            if (j <= j2) {
                Object[] objArr5 = this.b;
                hc1.h(objArr5, objArr5, j, j + 1, j2 + 1);
            } else {
                Object[] objArr6 = this.b;
                hc1.h(objArr6, objArr6, j, j + 1, objArr6.length);
                Object[] objArr7 = this.b;
                objArr7[objArr7.length - 1] = objArr7[0];
                hc1.h(objArr7, objArr7, 0, 1, j2 + 1);
            }
            this.b[j2] = null;
        }
        this.c = size() - 1;
        return e;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            registerModification();
            Object[] objArr = this.b;
            int i = this.f25274a;
            E e = (E) objArr[i];
            objArr[i] = null;
            this.f25274a = f(i);
            this.c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            registerModification();
            int j = j(this.f25274a + yz3.k(this));
            Object[] objArr = this.b;
            E e = (E) objArr[j];
            objArr[j] = null;
            this.c = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        c20.Companion.d(i, i2, size());
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == size()) {
                clear();
            } else if (i3 == 1) {
                remove(i);
            } else {
                registerModification();
                if (i < size() - i2) {
                    l(i, i2);
                    int j = j(this.f25274a + i3);
                    i(this.f25274a, j);
                    this.f25274a = j;
                } else {
                    m(i, i2);
                    int j2 = j(this.f25274a + size());
                    i(h(j2 - i3), j2);
                }
                this.c = size() - i3;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int i;
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int j = j(this.f25274a + size());
            int i2 = this.f25274a;
            if (i2 < j) {
                i = i2;
                while (i2 < j) {
                    Object obj = this.b[i2];
                    if (collection.contains(obj)) {
                        this.b[i] = obj;
                        i++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                hc1.q(this.b, null, i, j);
            } else {
                int length = this.b.length;
                int i3 = i2;
                boolean z2 = false;
                while (i2 < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        this.b[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                i = j(i3);
                for (int i4 = 0; i4 < j; i4++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        this.b[i] = obj3;
                        i = f(i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                registerModification();
                this.c = h(i - this.f25274a);
            }
        }
        return z;
    }

    @Override // tb.q20, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        c20.Companion.b(i, size());
        int j = j(this.f25274a + i);
        Object[] objArr = this.b;
        E e2 = (E) objArr[j];
        objArr[j] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        ckf.g(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) fc1.a(tArr, size());
        }
        int j = j(this.f25274a + size());
        int i = this.f25274a;
        if (i < j) {
            hc1.l(this.b, tArr, 0, i, j, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.b;
            hc1.h(objArr, tArr, 0, this.f25274a, objArr.length);
            Object[] objArr2 = this.b;
            hc1.h(objArr2, tArr, objArr2.length - this.f25274a, 0, j);
        }
        xz3.f(size(), tArr);
        return tArr;
    }

    @Override // tb.q20, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        c20.Companion.c(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            registerModification();
            e(size() + 1);
            int j = j(this.f25274a + i);
            if (i < ((size() + 1) >> 1)) {
                int d2 = d(j);
                int d3 = d(this.f25274a);
                int i2 = this.f25274a;
                if (d2 >= i2) {
                    Object[] objArr = this.b;
                    objArr[d3] = objArr[i2];
                    hc1.h(objArr, objArr, i2, i2 + 1, d2 + 1);
                } else {
                    Object[] objArr2 = this.b;
                    hc1.h(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    hc1.h(objArr3, objArr3, 0, 1, d2 + 1);
                }
                this.b[d2] = e;
                this.f25274a = d3;
            } else {
                int j2 = j(this.f25274a + size());
                if (j < j2) {
                    Object[] objArr4 = this.b;
                    hc1.h(objArr4, objArr4, j + 1, j, j2);
                } else {
                    Object[] objArr5 = this.b;
                    hc1.h(objArr5, objArr5, 1, 0, j2);
                    Object[] objArr6 = this.b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    hc1.h(objArr6, objArr6, j + 1, j, objArr6.length - 1);
                }
                this.b[j] = e;
            }
            this.c = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        c20.Companion.c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        registerModification();
        e(size() + collection.size());
        int j = j(this.f25274a + size());
        int j2 = j(this.f25274a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f25274a;
            int i3 = i2 - size;
            if (j2 < i2) {
                Object[] objArr = this.b;
                hc1.h(objArr, objArr, i3, i2, objArr.length);
                if (size >= j2) {
                    Object[] objArr2 = this.b;
                    hc1.h(objArr2, objArr2, objArr2.length - size, 0, j2);
                } else {
                    Object[] objArr3 = this.b;
                    hc1.h(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.b;
                    hc1.h(objArr4, objArr4, 0, size, j2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.b;
                hc1.h(objArr5, objArr5, i3, i2, j2);
            } else {
                Object[] objArr6 = this.b;
                i3 += objArr6.length;
                int i4 = j2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    hc1.h(objArr6, objArr6, i3, i2, j2);
                } else {
                    hc1.h(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.b;
                    hc1.h(objArr7, objArr7, 0, this.f25274a + length, j2);
                }
            }
            this.f25274a = i3;
            a(h(j2 - size), collection);
        } else {
            int i5 = j2 + size;
            if (j2 < j) {
                int i6 = size + j;
                Object[] objArr8 = this.b;
                if (i6 <= objArr8.length) {
                    hc1.h(objArr8, objArr8, i5, j2, j);
                } else if (i5 >= objArr8.length) {
                    hc1.h(objArr8, objArr8, i5 - objArr8.length, j2, j);
                } else {
                    int length2 = j - (i6 - objArr8.length);
                    hc1.h(objArr8, objArr8, 0, length2, j);
                    Object[] objArr9 = this.b;
                    hc1.h(objArr9, objArr9, i5, j2, length2);
                }
            } else {
                Object[] objArr10 = this.b;
                hc1.h(objArr10, objArr10, size, 0, j);
                Object[] objArr11 = this.b;
                if (i5 >= objArr11.length) {
                    hc1.h(objArr11, objArr11, i5 - objArr11.length, j2, objArr11.length);
                } else {
                    hc1.h(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.b;
                    hc1.h(objArr12, objArr12, i5, j2, objArr12.length - size);
                }
            }
            a(j2, collection);
        }
        return true;
    }

    public ob1() {
        this.b = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
