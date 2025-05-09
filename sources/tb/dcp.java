package tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class dcp extends bcp {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Iterable<T>, rzf {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sbp f17729a;

        public a(sbp sbpVar) {
            this.f17729a = sbpVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f17729a.iterator();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b implements sbp<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sbp<T> f17730a;
        public final /* synthetic */ Comparator<? super T> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(sbp<? extends T> sbpVar, Comparator<? super T> comparator) {
            this.f17730a = sbpVar;
            this.b = comparator;
        }

        @Override // tb.sbp
        public Iterator<T> iterator() {
            List z = dcp.z(this.f17730a);
            c04.u(z, this.b);
            return ((ArrayList) z).iterator();
        }
    }

    public static <T> Iterable<T> k(sbp<? extends T> sbpVar) {
        ckf.g(sbpVar, "<this>");
        return new a(sbpVar);
    }

    public static <T> boolean l(sbp<? extends T> sbpVar, T t) {
        ckf.g(sbpVar, "<this>");
        if (s(sbpVar, t) >= 0) {
            return true;
        }
        return false;
    }

    public static <T> int m(sbp<? extends T> sbpVar) {
        ckf.g(sbpVar, "<this>");
        Iterator<? extends T> it = sbpVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                yz3.o();
                throw null;
            }
        }
        return i;
    }

    public static <T> sbp<T> n(sbp<? extends T> sbpVar, g1a<? super T, Boolean> g1aVar) {
        ckf.g(sbpVar, "<this>");
        ckf.g(g1aVar, "predicate");
        return new vi9(sbpVar, true, g1aVar);
    }

    public static final <T> sbp<T> o(sbp<? extends T> sbpVar, g1a<? super T, Boolean> g1aVar) {
        ckf.g(sbpVar, "<this>");
        ckf.g(g1aVar, "predicate");
        return new vi9(sbpVar, false, g1aVar);
    }

    public static final <T> sbp<T> p(sbp<? extends T> sbpVar) {
        ckf.g(sbpVar, "<this>");
        return o(sbpVar, new g1a() { // from class: tb.ccp
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                boolean q;
                q = dcp.q(obj);
                return Boolean.valueOf(q);
            }
        });
    }

    public static final boolean q(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }

    public static <T> T r(sbp<? extends T> sbpVar) {
        ckf.g(sbpVar, "<this>");
        Iterator<? extends T> it = sbpVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (T) it.next();
    }

    public static final <T> int s(sbp<? extends T> sbpVar, T t) {
        ckf.g(sbpVar, "<this>");
        int i = 0;
        for (Object obj : sbpVar) {
            if (i < 0) {
                yz3.p();
                throw null;
            } else if (ckf.b(t, obj)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static <T> T t(sbp<? extends T> sbpVar) {
        ckf.g(sbpVar, "<this>");
        Iterator<? extends T> it = sbpVar.iterator();
        if (it.hasNext()) {
            T t = (T) it.next();
            while (it.hasNext()) {
                t = (T) it.next();
            }
            return t;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static <T, R> sbp<R> u(sbp<? extends T> sbpVar, g1a<? super T, ? extends R> g1aVar) {
        ckf.g(sbpVar, "<this>");
        ckf.g(g1aVar, "transform");
        return new deu(sbpVar, g1aVar);
    }

    public static <T, R> sbp<R> v(sbp<? extends T> sbpVar, g1a<? super T, ? extends R> g1aVar) {
        ckf.g(sbpVar, "<this>");
        ckf.g(g1aVar, "transform");
        return p(new deu(sbpVar, g1aVar));
    }

    public static <T> sbp<T> w(sbp<? extends T> sbpVar, Comparator<? super T> comparator) {
        ckf.g(sbpVar, "<this>");
        ckf.g(comparator, "comparator");
        return new b(sbpVar, comparator);
    }

    public static final <T, C extends Collection<? super T>> C x(sbp<? extends T> sbpVar, C c) {
        ckf.g(sbpVar, "<this>");
        ckf.g(c, "destination");
        Iterator<? extends T> it = sbpVar.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static <T> List<T> y(sbp<? extends T> sbpVar) {
        ckf.g(sbpVar, "<this>");
        Iterator<? extends T> it = sbpVar.iterator();
        if (!it.hasNext()) {
            return yz3.i();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return xz3.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final <T> List<T> z(sbp<? extends T> sbpVar) {
        ckf.g(sbpVar, "<this>");
        ArrayList arrayList = new ArrayList();
        x(sbpVar, arrayList);
        return arrayList;
    }
}
