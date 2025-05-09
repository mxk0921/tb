package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.hc1;
import tb.i04;
import tb.pb1;
import tb.pg1;
import tb.qb1;
import tb.szf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001IB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tB\u0019\b\u0016\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bB\u001b\b\u0016\u0012\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0007J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0017J\u001d\u0010\"\u001a\u00020\u000f2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000¢\u0006\u0004\b\"\u0010\tJ\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\u0017J\u0015\u0010$\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001eJ\u001d\u0010%\u001a\u00020\u00152\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f¢\u0006\u0004\b'\u0010(J'\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0001\u0010)2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b'\u0010*J\u001a\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b,\u0010\u0017J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0096\u0002¢\u0006\u0004\b3\u00104J\u001d\u00106\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b6\u00107J\u001d\u0010\"\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\"\u00107J\u001d\u0010%\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b%\u00107J\u001d\u00108\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b8\u00107R\"\u0010:\u001a\u0002098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010(\"\u0004\bB\u0010\u000eR\"\u0010C\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010.\"\u0004\bF\u0010\u0007R\u0014\u0010H\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010.¨\u0006J"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "", "capacity", "<init>", "(I)V", "set", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "", "array", "([Ljava/lang/Object;)V", "Ltb/xhv;", pg1.ATOM_EXT_clear, "()V", "minimumCapacity", "ensureCapacity", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", pg1.ATOM_EXT_indexOf, "(Ljava/lang/Object;)I", "index", "valueAt", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "addAll", "remove", "removeAt", "removeAll", "(Landroidx/collection/ArraySet;)Z", "toArray", "()[Ljava/lang/Object;", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", pg1.ATOM_EXT_iterator, "()Ljava/util/Iterator;", tep.KEY_UNIFORM_RESULT, "containsAll", "(Ljava/util/Collection;)Z", "retainAll", "", "hashes", "[I", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "[Ljava/lang/Object;", "getArray$collection", "setArray$collection", "_size", TLogTracker.LEVEL_INFO, "get_size$collection", "set_size$collection", "getSize", "size", "ElementIterator", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, szf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int _size;
    private Object[] array;
    private int[] hashes;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "<init>", "(Landroidx/collection/ArraySet;)V", "", "index", "elementAt", "(I)Ljava/lang/Object;", "Ltb/xhv;", "removeAt", "(I)V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        public static /* synthetic */ Object ipc$super(ElementIterator elementIterator, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/ArraySet$ElementIterator");
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public E elementAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (E) ipChange.ipc$dispatch("c82a5e65", new Object[]{this, new Integer(i)});
            }
            return ArraySet.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public void removeAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b0bdde5", new Object[]{this, new Integer(i)});
            } else {
                ArraySet.this.removeAt(i);
            }
        }
    }

    public ArraySet() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int i2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
        }
        int i3 = get_size$collection();
        if (e == null) {
            i2 = ArraySetKt.indexOfNull(this);
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = ArraySetKt.indexOf(this, e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = ~i2;
        if (i3 >= getHashes$collection().length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i5);
            if (i3 == get_size$collection()) {
                if (getHashes$collection().length == 0) {
                    z = true;
                }
                if (!z) {
                    hc1.j(hashes$collection, getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                    hc1.l(array$collection, getArray$collection(), 0, 0, array$collection.length, 6, null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int i6 = i4 + 1;
            hc1.f(getHashes$collection(), getHashes$collection(), i6, i4, i3);
            hc1.h(getArray$collection(), getArray$collection(), i6, i4, i3);
        }
        if (i3 != get_size$collection() || i4 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[i4] = i;
        getArray$collection()[i4] = e;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(ArraySet<? extends E> arraySet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8912e2", new Object[]{this, arraySet});
            return;
        }
        ckf.g(arraySet, "array");
        int i = arraySet.get_size$collection();
        ensureCapacity(get_size$collection() + i);
        if (get_size$collection() != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(arraySet.valueAt(i2));
            }
        } else if (i > 0) {
            hc1.j(arraySet.getHashes$collection(), getHashes$collection(), 0, 0, i, 6, null);
            hc1.l(arraySet.getArray$collection(), getArray$collection(), 0, 0, i, 6, null);
            if (get_size$collection() == 0) {
                set_size$collection(i);
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, obj})).booleanValue();
        }
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void ensureCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ce3744", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = get_size$collection();
        if (getHashes$collection().length < i) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i);
            if (get_size$collection() > 0) {
                hc1.j(hashes$collection, getHashes$collection(), 0, 0, get_size$collection(), 6, null);
                hc1.l(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6, null);
            }
        }
        if (get_size$collection() != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:686)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:765)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.ArraySet.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "6c2a9726"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r6
            r4[r1] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            if (r6 != r7) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0049
        L_0x0020:
            boolean r2 = r7 instanceof java.util.Set
            if (r2 == 0) goto L_0x0049
            int r2 = r6.size()
            r3 = r7
            java.util.Set r3 = (java.util.Set) r3
            int r3 = r3.size()
            if (r2 == r3) goto L_0x0032
            goto L_0x0049
        L_0x0032:
            int r2 = r6.get_size$collection()     // Catch: NullPointerException | ClassCastException -> 0x0049
            r3 = 0
        L_0x0037:
            if (r3 >= r2) goto L_0x001e
            java.lang.Object r4 = r6.valueAt(r3)     // Catch: NullPointerException | ClassCastException -> 0x0049
            r5 = r7
            java.util.Set r5 = (java.util.Set) r5     // Catch: NullPointerException | ClassCastException -> 0x0049
            boolean r4 = r5.contains(r4)     // Catch: NullPointerException | ClassCastException -> 0x0049
            if (r4 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            int r3 = r3 + r1
            goto L_0x0037
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ArraySet.equals(java.lang.Object):boolean");
    }

    public final Object[] getArray$collection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("5c280327", new Object[]{this});
        }
        return this.array;
    }

    public final int[] getHashes$collection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("2fc245ed", new Object[]{this});
        }
        return this.hashes;
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this._size;
    }

    public final int get_size$collection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf46b8b2", new Object[]{this})).intValue();
        }
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int[] hashes$collection = getHashes$collection();
        int i = get_size$collection();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += hashes$collection[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e3a7a1f", new Object[]{this, obj})).intValue();
        }
        if (obj == null) {
            return ArraySetKt.indexOfNull(this);
        }
        return ArraySetKt.indexOf(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return new ElementIterator();
    }

    public final boolean removeAll(ArraySet<? extends E> arraySet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4d3d4e3", new Object[]{this, arraySet})).booleanValue();
        }
        ckf.g(arraySet, "array");
        int i = arraySet.get_size$collection();
        int i2 = get_size$collection();
        for (int i3 = 0; i3 < i; i3++) {
            remove(arraySet.valueAt(i3));
        }
        return i2 != get_size$collection();
    }

    public final E removeAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("19801fed", new Object[]{this, new Integer(i)});
        }
        int i2 = get_size$collection();
        E e = (E) getArray$collection()[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int i4 = 8;
            if (getHashes$collection().length <= 8 || get_size$collection() >= getHashes$collection().length / 3) {
                if (i < i3) {
                    int i5 = 1 + i;
                    hc1.f(getHashes$collection(), getHashes$collection(), i, i5, i2);
                    hc1.h(getArray$collection(), getArray$collection(), i, i5, i2);
                }
                getArray$collection()[i3] = null;
            } else {
                if (get_size$collection() > 8) {
                    i4 = (get_size$collection() >> 1) + get_size$collection();
                }
                int[] hashes$collection = getHashes$collection();
                Object[] array$collection = getArray$collection();
                ArraySetKt.allocArrays(this, i4);
                if (i > 0) {
                    hc1.j(hashes$collection, getHashes$collection(), 0, 0, i, 6, null);
                    hc1.l(array$collection, getArray$collection(), 0, 0, i, 6, null);
                }
                if (i < i3) {
                    int i6 = 1 + i;
                    hc1.f(hashes$collection, getHashes$collection(), i, i6, i2);
                    hc1.h(array$collection, getArray$collection(), i, i6, i2);
                }
            }
            if (i2 == get_size$collection()) {
                set_size$collection(i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e;
    }

    public final void setArray$collection(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b3149f", new Object[]{this, objArr});
            return;
        }
        ckf.g(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deccd099", new Object[]{this, iArr});
            return;
        }
        ckf.g(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a38498", new Object[]{this, new Integer(i)});
        } else {
            this._size = i;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this}) : hc1.m(this.array, 0, this._size);
    }

    public final E valueAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("935101da", new Object[]{this, new Integer(i)});
        }
        return (E) getArray$collection()[i];
    }

    public ArraySet(int i) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i > 0) {
            ArraySetKt.allocArrays(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
        }
        ckf.g(tArr, "array");
        T[] tArr2 = (T[]) ArraySetJvmUtil.resizeForToArray(tArr, this._size);
        hc1.h(this.array, tArr2, 0, 0, this._size);
        return tArr2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176f677e", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
        }
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(get_size$collection() * 14);
        sb.append('{');
        int i = get_size$collection();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        for (int i = get_size$collection() - 1; -1 < i; i--) {
            if (!i04.R(collection, getArray$collection()[i])) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    public /* synthetic */ ArraySet(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public ArraySet(ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        ensureCapacity(get_size$collection() + collection.size());
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator a2 = qb1.a(eArr);
            while (true) {
                pb1 pb1Var = (pb1) a2;
                if (pb1Var.hasNext()) {
                    add(pb1Var.next());
                } else {
                    return;
                }
            }
        }
    }
}
