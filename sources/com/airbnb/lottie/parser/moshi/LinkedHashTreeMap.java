package com.airbnb.lottie.parser.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import tb.zhh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Comparator<Comparable> NATURAL_ORDER = new a();
    Comparator<? super K> comparator;
    private LinkedHashTreeMap<K, V>.d entrySet;
    final g<K, V> header;
    private LinkedHashTreeMap<K, V>.e keySet;
    int modCount;
    int size;
    g<K, V>[] table;
    int threshold;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Comparator<Comparable> {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public g<K, V> f1860a;
        public int b;
        public int c;
        public int d;

        public void a(g<K, V> gVar) {
            gVar.c = null;
            gVar.f1865a = null;
            gVar.b = null;
            gVar.i = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.c++;
                }
            }
            gVar.f1865a = this.f1860a;
            this.f1860a = gVar;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            int i5 = this.b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.d = i3 + 2;
                this.b = i5 - 1;
                this.c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.d & i7) == i7) {
                    int i8 = this.c;
                    if (i8 == 0) {
                        g<K, V> gVar2 = this.f1860a;
                        g<K, V> gVar3 = gVar2.f1865a;
                        g<K, V> gVar4 = gVar3.f1865a;
                        gVar3.f1865a = gVar4.f1865a;
                        this.f1860a = gVar3;
                        gVar3.b = gVar4;
                        gVar3.c = gVar2;
                        gVar3.i = gVar2.i + 1;
                        gVar4.f1865a = gVar3;
                        gVar2.f1865a = gVar3;
                    } else if (i8 == 1) {
                        g<K, V> gVar5 = this.f1860a;
                        g<K, V> gVar6 = gVar5.f1865a;
                        this.f1860a = gVar6;
                        gVar6.c = gVar5;
                        gVar6.i = gVar5.i + 1;
                        gVar5.f1865a = gVar6;
                        this.c = 0;
                    } else if (i8 == 2) {
                        this.c = 0;
                    }
                    i6 *= 2;
                } else {
                    return;
                }
            }
        }

        public void b(int i) {
            this.b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.d = 0;
            this.c = 0;
            this.f1860a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.f1860a;
            if (gVar.f1865a != null) {
                zhh.b("stacktTop.parent is not null to trigger IllegalStateException");
            }
            return gVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public g<K, V> f1861a;

        public g<K, V> a() {
            g<K, V> gVar = this.f1861a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f1865a;
            gVar.f1865a = null;
            g<K, V> gVar3 = gVar.c;
            while (true) {
                gVar2 = gVar3;
                if (gVar2 != null) {
                    gVar2.f1865a = gVar2;
                    gVar3 = gVar2.b;
                } else {
                    this.f1861a = gVar2;
                    return gVar;
                }
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f1865a = gVar2;
                gVar2 = gVar;
                gVar = gVar.b;
            }
            this.f1861a = gVar2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class d extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a extends LinkedHashTreeMap<K, V>.f<Map.Entry<K, V>> {
            public a(d dVar) {
                super();
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry) || LinkedHashTreeMap.this.findByEntry((Map.Entry) obj) == null) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap;
            g<K, V> findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = (linkedHashTreeMap = LinkedHashTreeMap.this).findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            linkedHashTreeMap.removeInternal(findByEntry, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public final class e extends AbstractSet<K> {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a extends LinkedHashTreeMap<K, V>.f<K> {
            public a(e eVar) {
                super();
            }

            @Override // com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.f, java.util.Iterator
            public K next() {
                return b().f;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (LinkedHashTreeMap.this.removeInternalByKey(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public abstract class f<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public g<K, V> f1864a;
        public g<K, V> b = null;

        public f() {
            this.f1864a = LinkedHashTreeMap.this.header.d;
            int i = LinkedHashTreeMap.this.modCount;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            return b();
        }

        public final g<K, V> b() {
            g<K, V> gVar = this.f1864a;
            this.f1864a = gVar.d;
            this.b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f1864a != LinkedHashTreeMap.this.header) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.b;
            if (gVar != null) {
                LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                linkedHashTreeMap.removeInternal(gVar, true);
                this.b = null;
                int i = linkedHashTreeMap.modCount;
            }
        }
    }

    public LinkedHashTreeMap() {
        this(null);
    }

    private void doubleCapacity() {
        g<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    private boolean equal(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    private void rebalance(g<K, V> gVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (gVar != null) {
            g<K, V> gVar2 = gVar.b;
            g<K, V> gVar3 = gVar.c;
            int i5 = 0;
            if (gVar2 != null) {
                i = gVar2.i;
            } else {
                i = 0;
            }
            if (gVar3 != null) {
                i2 = gVar3.i;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                g<K, V> gVar4 = gVar3.b;
                g<K, V> gVar5 = gVar3.c;
                if (gVar5 != null) {
                    i4 = gVar5.i;
                } else {
                    i4 = 0;
                }
                if (gVar4 != null) {
                    i5 = gVar4.i;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    rotateLeft(gVar);
                } else {
                    rotateRight(gVar3);
                    rotateLeft(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                g<K, V> gVar6 = gVar2.b;
                g<K, V> gVar7 = gVar2.c;
                if (gVar7 != null) {
                    i3 = gVar7.i;
                } else {
                    i3 = 0;
                }
                if (gVar6 != null) {
                    i5 = gVar6.i;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    rotateRight(gVar);
                } else {
                    rotateLeft(gVar2);
                    rotateRight(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                gVar.i = i + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f1865a;
        }
    }

    private void replaceInParent(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f1865a;
        gVar.f1865a = null;
        if (gVar2 != null) {
            gVar2.f1865a = gVar3;
        }
        if (gVar3 == null) {
            g<K, V>[] gVarArr = this.table;
            gVarArr[gVar.g & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.b == gVar) {
            gVar3.b = gVar2;
        } else {
            gVar3.c = gVar2;
        }
    }

    private void rotateLeft(g<K, V> gVar) {
        int i;
        int i2;
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.c;
        g<K, V> gVar4 = gVar3.b;
        g<K, V> gVar5 = gVar3.c;
        gVar.c = gVar4;
        if (gVar4 != null) {
            gVar4.f1865a = gVar;
        }
        replaceInParent(gVar, gVar3);
        gVar3.b = gVar;
        gVar.f1865a = gVar3;
        int i3 = 0;
        if (gVar2 != null) {
            i = gVar2.i;
        } else {
            i = 0;
        }
        if (gVar4 != null) {
            i2 = gVar4.i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.i = max;
        if (gVar5 != null) {
            i3 = gVar5.i;
        }
        gVar3.i = Math.max(max, i3) + 1;
    }

    private void rotateRight(g<K, V> gVar) {
        int i;
        int i2;
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.c;
        g<K, V> gVar4 = gVar2.b;
        g<K, V> gVar5 = gVar2.c;
        gVar.b = gVar5;
        if (gVar5 != null) {
            gVar5.f1865a = gVar;
        }
        replaceInParent(gVar, gVar2);
        gVar2.c = gVar;
        gVar.f1865a = gVar2;
        int i3 = 0;
        if (gVar3 != null) {
            i = gVar3.i;
        } else {
            i = 0;
        }
        if (gVar5 != null) {
            i2 = gVar5.i;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        gVar.i = max;
        if (gVar4 != null) {
            i3 = gVar4.i;
        }
        gVar2.i = Math.max(max, i3) + 1;
    }

    private static int secondaryHash(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        g<K, V> gVar = this.header;
        g<K, V> gVar2 = gVar.d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.d;
            gVar2.e = null;
            gVar2.d = null;
            gVar2 = gVar3;
        }
        gVar.e = gVar;
        gVar.d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (findByObject(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.entrySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new d();
        this.entrySet = dVar2;
        return dVar2;
    }

    public g<K, V> find(K k, boolean z) {
        int i;
        g<K, V> gVar;
        g<K, V> gVar2;
        Comparable comparable;
        int i2;
        g<K, V> gVar3;
        Comparator<? super K> comparator = this.comparator;
        g<K, V>[] gVarArr = this.table;
        int secondaryHash = secondaryHash(k.hashCode());
        int length = (gVarArr.length - 1) & secondaryHash;
        g<K, V> gVar4 = gVarArr[length];
        if (gVar4 != null) {
            if (comparator == NATURAL_ORDER) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj = (K) gVar4.f;
                if (comparable != null) {
                    i2 = comparable.compareTo(obj);
                } else {
                    i2 = comparator.compare(k, obj);
                }
                if (i2 == 0) {
                    return gVar4;
                }
                if (i2 < 0) {
                    gVar3 = gVar4.b;
                } else {
                    gVar3 = gVar4.c;
                }
                if (gVar3 == null) {
                    gVar = gVar4;
                    i = i2;
                    break;
                }
                gVar4 = gVar3;
            }
        } else {
            gVar = gVar4;
            i = 0;
        }
        if (!z) {
            return null;
        }
        g<K, V> gVar5 = this.header;
        if (gVar != null) {
            gVar2 = new g<>(gVar, k, secondaryHash, gVar5, gVar5.e);
            if (i < 0) {
                gVar.b = gVar2;
            } else {
                gVar.c = gVar2;
            }
            rebalance(gVar, true);
        } else if (comparator != NATURAL_ORDER || (k instanceof Comparable)) {
            gVar2 = new g<>(gVar, k, secondaryHash, gVar5, gVar5.e);
            gVarArr[length] = gVar2;
        } else {
            zhh.b(k.getClass().getName().concat(" is not Comparable"));
            return new g<>(gVar, k, secondaryHash, gVar5, gVar5.e);
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            doubleCapacity();
        }
        this.modCount++;
        return gVar2;
    }

    public g<K, V> findByEntry(Map.Entry<?, ?> entry) {
        g<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject == null || !equal(findByObject.h, entry.getValue())) {
            return null;
        }
        return findByObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<K, V> findByObject(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.e eVar = this.keySet;
        if (eVar != null) {
            return eVar;
        }
        LinkedHashTreeMap<K, V>.e eVar2 = new e();
        this.keySet = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            zhh.b("key == null");
            return v;
        }
        g<K, V> find = find(k, true);
        V v2 = find.h;
        find.h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.h;
        }
        return null;
    }

    public void removeInternal(g<K, V> gVar, boolean z) {
        g<K, V> gVar2;
        int i;
        if (z) {
            g<K, V> gVar3 = gVar.e;
            gVar3.d = gVar.d;
            gVar.d.e = gVar3;
            gVar.e = null;
            gVar.d = null;
        }
        g<K, V> gVar4 = gVar.b;
        g<K, V> gVar5 = gVar.c;
        g<K, V> gVar6 = gVar.f1865a;
        int i2 = 0;
        if (gVar4 == null || gVar5 == null) {
            if (gVar4 != null) {
                replaceInParent(gVar, gVar4);
                gVar.b = null;
            } else if (gVar5 != null) {
                replaceInParent(gVar, gVar5);
                gVar.c = null;
            } else {
                replaceInParent(gVar, null);
            }
            rebalance(gVar6, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (gVar4.i > gVar5.i) {
            gVar2 = gVar4.b();
        } else {
            gVar2 = gVar5.a();
        }
        removeInternal(gVar2, false);
        g<K, V> gVar7 = gVar.b;
        if (gVar7 != null) {
            i = gVar7.i;
            gVar2.b = gVar7;
            gVar7.f1865a = gVar2;
            gVar.b = null;
        } else {
            i = 0;
        }
        g<K, V> gVar8 = gVar.c;
        if (gVar8 != null) {
            i2 = gVar8.i;
            gVar2.c = gVar8;
            gVar8.f1865a = gVar2;
            gVar.c = null;
        }
        gVar2.i = Math.max(i, i2) + 1;
        replaceInParent(gVar, gVar2);
    }

    public g<K, V> removeInternalByKey(Object obj) {
        g<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator == null ? NATURAL_ORDER : comparator;
        this.header = new g<>();
        this.table = new g[16];
        this.threshold = 12;
    }

    public static <K, V> g<K, V>[] doubleCapacity(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i = 0; i < length; i++) {
            g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.b(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    g<K, V> a2 = cVar.a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.b(i2);
                bVar2.b(i3);
                cVar.b(gVar);
                while (true) {
                    g<K, V> a3 = cVar.a();
                    if (a3 == null) {
                        break;
                    } else if ((a3.g & length) == 0) {
                        bVar.a(a3);
                    } else {
                        bVar2.a(a3);
                    }
                }
                g<K, V> gVar2 = null;
                gVarArr2[i] = i2 > 0 ? bVar.c() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar2 = bVar2.c();
                }
                gVarArr2[i4] = gVar2;
            }
        }
        return gVarArr2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public g<K, V> f1865a;
        public g<K, V> b;
        public g<K, V> c;
        public g<K, V> d;
        public g<K, V> e;
        public final K f;
        public final int g;
        public V h;
        public int i;

        public g() {
            this.f = null;
            this.g = -1;
            this.e = this;
            this.d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.b; gVar2 != null; gVar2 = gVar2.b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.c; gVar2 != null; gVar2 = gVar2.c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.h;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i;
            int i2 = 0;
            K k = this.f;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.h;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i2 ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.h;
            this.h = v;
            return v2;
        }

        public String toString() {
            return this.f + "=" + this.h;
        }

        public g(g<K, V> gVar, K k, int i, g<K, V> gVar2, g<K, V> gVar3) {
            this.f1865a = gVar;
            this.f = k;
            this.g = i;
            this.i = 1;
            this.d = gVar2;
            this.e = gVar3;
            gVar3.d = this;
            gVar2.e = this;
        }
    }
}
