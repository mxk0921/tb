package tb;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class d04 extends c04 {
    public static <T> boolean A(List<T> list, g1a<? super T, Boolean> g1aVar) {
        ckf.g(list, "<this>");
        ckf.g(g1aVar, "predicate");
        return z(list, g1aVar, true);
    }

    public static <T> T B(List<T> list) {
        ckf.g(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T C(List<T> list) {
        ckf.g(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(yz3.k(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T D(List<T> list) {
        ckf.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(yz3.k(list));
    }

    public static <T> boolean E(Iterable<? extends T> iterable, g1a<? super T, Boolean> g1aVar) {
        ckf.g(iterable, "<this>");
        ckf.g(g1aVar, "predicate");
        return y(iterable, g1aVar, false);
    }

    public static <T> boolean v(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ckf.g(collection, "<this>");
        ckf.g(iterable, tep.KEY_UNIFORM_RESULT);
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((Object) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean w(Collection<? super T> collection, T[] tArr) {
        ckf.g(collection, "<this>");
        ckf.g(tArr, tep.KEY_UNIFORM_RESULT);
        return collection.addAll(hc1.c(tArr));
    }

    public static final <T> Collection<T> x(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = i04.B0(iterable);
        }
        return (Collection) iterable;
    }

    public static final <T> boolean y(Iterable<? extends T> iterable, g1a<? super T, Boolean> g1aVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (g1aVar.invoke((Object) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final <T> boolean z(List<T> list, g1a<? super T, Boolean> g1aVar, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            ckf.e(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return y(kqu.b(list), g1aVar, z);
        }
        int k = yz3.k(list);
        if (k >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (g1aVar.invoke(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == k) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int k2 = yz3.k(list);
        if (i > k2) {
            return true;
        }
        while (true) {
            list.remove(k2);
            if (k2 == i) {
                return true;
            }
            k2--;
        }
    }
}
