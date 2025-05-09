package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ubp<T> extends vbp<T> implements Iterator<T>, ar4<xhv>, rzf {

    /* renamed from: a  reason: collision with root package name */
    public int f29280a;
    public T b;
    public Iterator<? extends T> c;
    public ar4<? super xhv> d;

    @Override // tb.vbp
    public Object a(T t, ar4<? super xhv> ar4Var) {
        this.b = t;
        this.f29280a = 3;
        this.d = ar4Var;
        Object d = dkf.d();
        if (d == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (d == dkf.d()) {
            return d;
        }
        return xhv.INSTANCE;
    }

    @Override // tb.vbp
    public Object c(Iterator<? extends T> it, ar4<? super xhv> ar4Var) {
        if (!it.hasNext()) {
            return xhv.INSTANCE;
        }
        this.c = it;
        this.f29280a = 2;
        this.d = ar4Var;
        Object d = dkf.d();
        if (d == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (d == dkf.d()) {
            return d;
        }
        return xhv.INSTANCE;
    }

    public final Throwable e() {
        int i = this.f29280a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f29280a);
    }

    public final T f() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void g(ar4<? super xhv> ar4Var) {
        this.d = ar4Var;
    }

    @Override // tb.ar4
    public d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.f29280a;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.c;
                    ckf.d(it);
                    if (it.hasNext()) {
                        this.f29280a = 2;
                        return true;
                    }
                    this.c = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw e();
                }
            }
            this.f29280a = 5;
            ar4<? super xhv> ar4Var = this.d;
            ckf.d(ar4Var);
            this.d = null;
            ar4Var.resumeWith(Result.m1108constructorimpl(xhv.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f29280a;
        if (i == 0 || i == 1) {
            return f();
        }
        if (i == 2) {
            this.f29280a = 1;
            Iterator<? extends T> it = this.c;
            ckf.d(it);
            return (T) it.next();
        } else if (i == 3) {
            this.f29280a = 0;
            T t = this.b;
            this.b = null;
            return t;
        } else {
            throw e();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // tb.ar4
    public void resumeWith(Object obj) {
        b.b(obj);
        this.f29280a = 4;
    }
}
