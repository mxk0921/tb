package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w9q<T> implements Iterable<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public w9q<T>.b<T> f30545a = null;
    public w9q<T>.b<T> b = null;
    public final Comparator<? super T> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Iterator<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public w9q<T>.b<T> f30546a;

        public a(w9q w9qVar) {
            this.f30546a = w9q.a(w9qVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
            }
            if (this.f30546a != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("b9bf2c78", new Object[]{this});
            }
            if (hasNext()) {
                w9q<T>.b<T> bVar = this.f30546a;
                T t = bVar.f30547a;
                this.f30546a = bVar.c;
                return t;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f30547a;
        public w9q<T>.b<T> b = null;
        public w9q<T>.b<T> c = null;

        static {
            t2o.a(468713684);
        }

        public b(w9q w9qVar, T t) {
            this.f30547a = t;
        }
    }

    static {
        t2o.a(468713682);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w9q(Comparator<T> comparator) {
        this.c = comparator;
    }

    public static /* synthetic */ b a(w9q w9qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4d04d8eb", new Object[]{w9qVar});
        }
        return w9qVar.f30545a;
    }

    public void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2da84", new Object[]{this, t});
        } else if (t != null) {
            w9q<T>.b<T> bVar = new b<>(this, t);
            w9q<T>.b<T> bVar2 = this.f30545a;
            if (bVar2 == null) {
                this.b = bVar;
                this.f30545a = bVar;
            } else if (this.c.compare(t, (T) bVar2.f30547a) <= 0) {
                w9q<T>.b<T> bVar3 = this.f30545a;
                bVar.c = bVar3;
                bVar3.b = bVar;
                this.f30545a = bVar;
            } else if (this.c.compare(t, (T) this.b.f30547a) >= 0) {
                w9q<T>.b<T> bVar4 = this.b;
                bVar.b = bVar4;
                bVar4.c = bVar;
                this.b = bVar;
            } else {
                w9q<T>.b<T> bVar5 = this.f30545a;
                while (bVar5 != null && this.c.compare(t, (T) bVar5.f30547a) > 0) {
                    bVar5 = bVar5.c;
                }
                bVar.c = bVar5;
                bVar.b = bVar5.b;
                bVar5.b.c = bVar;
                bVar5.b = bVar;
            }
        } else {
            throw new IllegalArgumentException("Data cannot be null");
        }
    }

    public boolean c(spm<T> spmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd2fe472", new Object[]{this, spmVar})).booleanValue();
        }
        if (d(spmVar) != null) {
            return true;
        }
        return false;
    }

    public w9q<T>.b<T> d(spm<T> spmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6639033", new Object[]{this, spmVar});
        }
        if (spmVar == null) {
            return null;
        }
        for (w9q<T>.b<T> bVar = this.f30545a; bVar != null; bVar = bVar.c) {
            if (spmVar.apply(bVar.f30547a)) {
                return bVar;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return new a(this);
    }
}
