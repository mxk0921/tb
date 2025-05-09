package tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class kss<T> {
    public static final Comparator<? super Map.Entry<Integer, ?>> b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f22894a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Comparator<Map.Entry<Integer, ?>> {
        /* renamed from: a */
        public int compare(Map.Entry<Integer, ?> entry, Map.Entry<Integer, ?> entry2) {
            return entry.getKey().compareTo(entry2.getKey());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b<T> extends kss<T> {
        public final Object[] c;
        public final int d;

        public b(Map<Integer, T> map, int i) {
            super(map);
            this.d = i;
            this.c = new Object[i + 1];
            for (Map.Entry<Integer, T> entry : map.entrySet()) {
                Integer key = entry.getKey();
                if (key.intValue() > 0) {
                    this.c[key.intValue()] = entry.getValue();
                } else {
                    throw new IllegalArgumentException("Input map key is negative or zero");
                }
            }
        }

        public static <T> b<T> h(Map<Integer, T> map, int i) {
            return new b<>(map, i);
        }

        @Override // tb.kss
        public boolean a(int i) {
            if (i <= this.d && this.c[i] != null) {
                return true;
            }
            return false;
        }

        @Override // tb.kss
        public T b(int i) {
            if (i > this.d) {
                return null;
            }
            return (T) this.c[i];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c<T> extends kss<T> {
        public final Map<Integer, T> c;

        public c(Map<Integer, T> map) {
            super(map);
            this.c = map;
        }

        public static <T> c<T> h(Map<Integer, T> map) {
            return new c<>(map);
        }

        @Override // tb.kss
        public boolean a(int i) {
            return this.c.containsKey(Integer.valueOf(i));
        }

        @Override // tb.kss
        public T b(int i) {
            return this.c.get(Integer.valueOf(i));
        }
    }

    public kss(Map<Integer, T> map) {
        this.f22894a = f(map);
    }

    public static boolean c(int i, int i2) {
        if (i2 <= 64 || i / i2 > 0.75f) {
            return true;
        }
        return false;
    }

    public static <T> int d(Map<Integer, T> map) {
        int i = -1;
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (intValue > i) {
                i = intValue;
            }
        }
        return i;
    }

    public static <T> kss<T> e(Map<Integer, T> map) {
        int d = d(map);
        if (c(map.size(), d)) {
            return b.h(map, d);
        }
        return c.h(map);
    }

    public static <T> List<T> f(Map<Integer, T> map) {
        TreeSet treeSet = new TreeSet(b);
        treeSet.addAll(map.entrySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public abstract boolean a(int i);

    public abstract T b(int i);

    public Collection<T> g() {
        return this.f22894a;
    }
}
