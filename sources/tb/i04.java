package tb;

import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class i04 extends f04 {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements sbp<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterable f21002a;

        public a(Iterable iterable) {
            this.f21002a = iterable;
        }

        @Override // tb.sbp
        public Iterator<T> iterator() {
            return this.f21002a.iterator();
        }
    }

    public static int[] A0(Collection<Integer> collection) {
        ckf.g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> B0(Iterable<? extends T> iterable) {
        Object obj;
        ckf.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return yz3.n(D0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return yz3.i();
        }
        if (size != 1) {
            return E0(collection);
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = collection.iterator().next();
        }
        return xz3.e(obj);
    }

    public static long[] C0(Collection<Long> collection) {
        ckf.g(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long l : collection) {
            jArr[i] = l.longValue();
            i++;
        }
        return jArr;
    }

    public static final <T> List<T> D0(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return E0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        y0(iterable, arrayList);
        return arrayList;
    }

    public static <T> List<T> E0(Collection<? extends T> collection) {
        ckf.g(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> F0(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        y0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> G0(Iterable<? extends T> iterable) {
        Object obj;
        ckf.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return kfp.d();
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(v3i.e(collection.size()));
                y0(iterable, linkedHashSet);
                return linkedHashSet;
            }
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = collection.iterator().next();
            }
            return jfp.c(obj);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        y0(iterable, linkedHashSet2);
        return kfp.g(linkedHashSet2);
    }

    public static <T> Iterable<hte<T>> H0(final Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        return new ite(new d1a() { // from class: tb.g04
            @Override // tb.d1a
            public final Object invoke() {
                Iterator I0;
                I0 = i04.I0(iterable);
                return I0;
            }
        });
    }

    public static final Iterator I0(Iterable iterable) {
        return iterable.iterator();
    }

    public static <T, R> List<Pair<T, R>> J0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        ckf.g(iterable, "<this>");
        ckf.g(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(zz3.q(iterable, 10), zz3.q(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(jpu.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends java.lang.Comparable<? super T>> T K0(java.lang.Iterable<? extends T> r3) {
        /*
            java.lang.String r0 = "<this>"
            tb.ckf.g(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0011
            r3 = 0
            return r3
        L_0x0011:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L_0x0017:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L_0x0017
            r0 = r1
            goto L_0x0017
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.i04.K0(java.lang.Iterable):java.lang.Comparable");
    }

    public static /* synthetic */ Object O(int i, int i2) {
        V(i, i2);
        throw null;
    }

    public static <T> sbp<T> Q(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> boolean R(Iterable<? extends T> iterable, T t) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (e0(iterable, t) >= 0) {
            return true;
        }
        return false;
    }

    public static <T> List<T> S(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        return B0(F0(iterable));
    }

    public static <T> List<T> T(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        ckf.g(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return B0(iterable);
        } else {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i;
                if (size <= 0) {
                    return yz3.i();
                }
                if (size == 1) {
                    return xz3.e(k0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            for (Object obj : iterable) {
                if (i2 >= i) {
                    arrayList.add(obj);
                } else {
                    i2++;
                }
            }
            return yz3.n(arrayList);
        }
    }

    public static <T> T U(Iterable<? extends T> iterable, final int i) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) W(iterable, i, new g1a() { // from class: tb.h04
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                i04.O(i, ((Integer) obj).intValue());
                throw null;
            }
        });
    }

    public static final Object V(int i, int i2) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
    }

    public static final <T> T W(Iterable<? extends T> iterable, int i, g1a<? super Integer, ? extends T> g1aVar) {
        ckf.g(iterable, "<this>");
        ckf.g(g1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i < 0 || i >= list.size()) {
                return (T) g1aVar.invoke(Integer.valueOf(i));
            }
            return (T) list.get(i);
        } else if (i < 0) {
            return (T) g1aVar.invoke(Integer.valueOf(i));
        } else {
            int i2 = 0;
            for (T t : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return t;
                }
                i2 = i3;
            }
            return (T) g1aVar.invoke(Integer.valueOf(i));
        }
    }

    public static <T> List<T> X(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Y(iterable, arrayList);
        return arrayList;
    }

    public static final <C extends Collection<? super T>, T> C Y(Iterable<? extends T> iterable, C c) {
        ckf.g(iterable, "<this>");
        ckf.g(c, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                c.add(obj);
            }
        }
        return c;
    }

    public static <T> T Z(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) a0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T a0(List<? extends T> list) {
        ckf.g(list, "<this>");
        if (!list.isEmpty()) {
            return (T) list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T b0(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return (T) it.next();
    }

    public static <T> T c0(List<? extends T> list) {
        ckf.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(0);
    }

    public static <T> T d0(List<? extends T> list, int i) {
        ckf.g(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (T) list.get(i);
    }

    public static <T> int e0(Iterable<? extends T> iterable, T t) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object obj : iterable) {
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

    public static <T> int f0(List<? extends T> list, T t) {
        ckf.g(list, "<this>");
        return list.indexOf(t);
    }

    public static final <T, A extends Appendable> A g0(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a<? super T, ? extends CharSequence> g1aVar) {
        ckf.g(iterable, "<this>");
        ckf.g(a2, pg1.ATOM_EXT_buffer);
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            jsq.a(a2, obj, g1aVar);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static /* synthetic */ Appendable h0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a g1aVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        g0(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : g1aVar);
        return appendable;
    }

    public static final <T> String i0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a<? super T, ? extends CharSequence> g1aVar) {
        ckf.g(iterable, "<this>");
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        g0(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, g1aVar);
        return sb.toString();
    }

    public static /* synthetic */ String j0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a g1aVar, int i2, Object obj) {
        CharSequence charSequence5;
        int i3;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            g1aVar = null;
        }
        return i0(iterable, charSequence, charSequence5, charSequence6, i3, charSequence4, g1aVar);
    }

    public static final <T> T k0(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) l0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t = (T) it.next();
            while (it.hasNext()) {
                t = (T) it.next();
            }
            return t;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T l0(List<? extends T> list) {
        ckf.g(list, "<this>");
        if (!list.isEmpty()) {
            return (T) list.get(yz3.k(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T m0(List<? extends T> list) {
        ckf.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(list.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends java.lang.Comparable<? super T>> T n0(java.lang.Iterable<? extends T> r3) {
        /*
            java.lang.String r0 = "<this>"
            tb.ckf.g(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x0011
            r3 = 0
            return r3
        L_0x0011:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L_0x0017:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L_0x0017
            r0 = r1
            goto L_0x0017
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.i04.n0(java.lang.Iterable):java.lang.Comparable");
    }

    public static <T> List<T> o0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        ckf.g(collection, "<this>");
        ckf.g(iterable, tep.KEY_UNIFORM_RESULT);
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        d04.v(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> p0(Collection<? extends T> collection, T t) {
        ckf.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> List<T> q0(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return B0(iterable);
        }
        List<T> D0 = D0(iterable);
        f04.N(D0);
        return D0;
    }

    public static <T> T r0(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) s0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t = (T) it.next();
            if (!it.hasNext()) {
                return t;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T s0(List<? extends T> list) {
        ckf.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return (T) list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> t0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        ckf.g(iterable, "<this>");
        ckf.g(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return B0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            hc1.z(array, comparator);
            return hc1.c(array);
        }
        List<T> D0 = D0(iterable);
        c04.u(D0, comparator);
        return D0;
    }

    public static int u0(Iterable<Integer> iterable) {
        ckf.g(iterable, "<this>");
        int i = 0;
        for (Integer num : iterable) {
            i += num.intValue();
        }
        return i;
    }

    public static <T> List<T> v0(Iterable<? extends T> iterable, int i) {
        ckf.g(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return yz3.i();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return B0(iterable);
                }
                if (i == 1) {
                    return xz3.e(Z(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator<? extends T> it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return yz3.n(arrayList);
        }
    }

    public static <T> List<T> w0(List<? extends T> list, int i) {
        ckf.g(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return yz3.i();
        } else {
            int size = list.size();
            if (i >= size) {
                return B0(list);
            }
            if (i == 1) {
                return xz3.e(l0(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator<? extends T> listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static byte[] x0(Collection<Byte> collection) {
        ckf.g(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Byte b : collection) {
            bArr[i] = b.byteValue();
            i++;
        }
        return bArr;
    }

    public static <T, C extends Collection<? super T>> C y0(Iterable<? extends T> iterable, C c) {
        ckf.g(iterable, "<this>");
        ckf.g(c, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static <T> HashSet<T> z0(Iterable<? extends T> iterable) {
        ckf.g(iterable, "<this>");
        HashSet<T> hashSet = new HashSet<>(v3i.e(zz3.q(iterable, 12)));
        y0(iterable, hashSet);
        return hashSet;
    }
}
