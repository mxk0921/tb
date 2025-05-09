package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import tb.ckf;
import tb.hc1;
import tb.i04;
import tb.pg1;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a'\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a \u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u0019\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u0019\u0010\u0015\u001a(\u0010\u001c\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u001e\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a(\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010 \u001a\u00020\bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a \u0010#\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b#\u0010$\u001a(\u0010%\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b%\u0010\u001d\u001a0\u0010'\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b'\u0010(\u001a(\u0010)\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b)\u0010\u001d\u001a(\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010 \u001a\u00020\bH\u0080\b¢\u0006\u0004\b*\u0010\"\u001a0\u0010+\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b+\u0010,\u001a*\u0010.\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010-\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0004\b.\u0010\u001d\u001a \u0010/\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b/\u0010\u0011\u001a \u00101\u001a\u000200\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b1\u00102\u001a.\u00105\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0080\b¢\u0006\u0004\b5\u00106\u001a.\u0010'\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0080\b¢\u0006\u0004\b'\u00106\u001a.\u0010+\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0080\b¢\u0006\u0004\b+\u00106\u001a.\u00107\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0080\b¢\u0006\u0004\b7\u00106\"\u0014\u00108\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"T", "Landroidx/collection/ArraySet;", "arraySetOf", "()Landroidx/collection/ArraySet;", "", pg1.ATOM_values, "([Ljava/lang/Object;)Landroidx/collection/ArraySet;", "E", "", "hash", "binarySearchInternal", "(Landroidx/collection/ArraySet;I)I", "", "key", pg1.ATOM_EXT_indexOf, "(Landroidx/collection/ArraySet;Ljava/lang/Object;I)I", "indexOfNull", "(Landroidx/collection/ArraySet;)I", "size", "Ltb/xhv;", "allocArrays", "(Landroidx/collection/ArraySet;I)V", "clearInternal", "(Landroidx/collection/ArraySet;)V", "minimumCapacity", "ensureCapacityInternal", "element", "", "containsInternal", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)Z", "indexOfInternal", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)I", "index", "valueAtInternal", "(Landroidx/collection/ArraySet;I)Ljava/lang/Object;", "isEmptyInternal", "(Landroidx/collection/ArraySet;)Z", "addInternal", "array", "addAllInternal", "(Landroidx/collection/ArraySet;Landroidx/collection/ArraySet;)V", "removeInternal", "removeAtInternal", "removeAllInternal", "(Landroidx/collection/ArraySet;Landroidx/collection/ArraySet;)Z", "other", "equalsInternal", "hashCodeInternal", "", "toStringInternal", "(Landroidx/collection/ArraySet;)Ljava/lang/String;", "", tep.KEY_UNIFORM_RESULT, "containsAllInternal", "(Landroidx/collection/ArraySet;Ljava/util/Collection;)Z", "retainAllInternal", "ARRAY_SET_BASE_SIZE", TLogTracker.LEVEL_INFO, "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ArraySetKt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> arraySet2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aff699a", new Object[]{arraySet, arraySet2});
            return;
        }
        ckf.g(arraySet, "<this>");
        ckf.g(arraySet2, "array");
        int i = arraySet2.get_size$collection();
        arraySet.ensureCapacity(arraySet.get_size$collection() + i);
        if (arraySet.get_size$collection() != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                arraySet.add(arraySet2.valueAt(i2));
            }
        } else if (i > 0) {
            hc1.j(arraySet2.getHashes$collection(), arraySet.getHashes$collection(), 0, 0, i, 6, null);
            hc1.l(arraySet2.getArray$collection(), arraySet.getArray$collection(), 0, 0, i, 6, null);
            if (arraySet.get_size$collection() == 0) {
                arraySet.set_size$collection(i);
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void allocArrays(ArraySet<E> arraySet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c36a672", new Object[]{arraySet, new Integer(i)});
            return;
        }
        ckf.g(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i]);
        arraySet.setArray$collection(new Object[i]);
    }

    public static final <T> ArraySet<T> arraySetOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArraySet) ipChange.ipc$dispatch("9be0c3ca", new Object[0]) : new ArraySet<>(0, 1, null);
    }

    public static final <E> int binarySearchInternal(ArraySet<E> arraySet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db64b8ee", new Object[]{arraySet, new Integer(i)})).intValue();
        }
        ckf.g(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes$collection(), arraySet.get_size$collection(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsInternal(ArraySet<E> arraySet, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2ba80fe", new Object[]{arraySet, e})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        if (arraySet.indexOf(e) >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> void ensureCapacityInternal(ArraySet<E> arraySet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b16ec78c", new Object[]{arraySet, new Integer(i)});
            return;
        }
        ckf.g(arraySet, "<this>");
        int i2 = arraySet.get_size$collection();
        if (arraySet.getHashes$collection().length < i) {
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i);
            if (arraySet.get_size$collection() > 0) {
                hc1.j(hashes$collection, arraySet.getHashes$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
                hc1.l(array$collection, arraySet.getArray$collection(), 0, 0, arraySet.get_size$collection(), 6, null);
            }
        }
        if (arraySet.get_size$collection() != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(ArraySet<E> arraySet, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60fe5a9e", new Object[]{arraySet, obj})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        if (arraySet == obj) {
            return true;
        }
        if (!(obj instanceof Set) || arraySet.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = arraySet.get_size$collection();
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(arraySet.valueAt(i2))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(ArraySet<E> arraySet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("399c378d", new Object[]{arraySet})).intValue();
        }
        ckf.g(arraySet, "<this>");
        int[] hashes$collection = arraySet.getHashes$collection();
        int i = arraySet.get_size$collection();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += hashes$collection[i3];
        }
        return i2;
    }

    public static final <E> int indexOfInternal(ArraySet<E> arraySet, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("515a617", new Object[]{arraySet, obj})).intValue();
        }
        ckf.g(arraySet, "<this>");
        if (obj == null) {
            return indexOfNull(arraySet);
        }
        return indexOf(arraySet, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(ArraySet<E> arraySet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f840105", new Object[]{arraySet})).intValue();
        }
        ckf.g(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> boolean isEmptyInternal(ArraySet<E> arraySet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("196b8bc6", new Object[]{arraySet})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        if (arraySet.get_size$collection() <= 0) {
            return true;
        }
        return false;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> arraySet2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d25c5db", new Object[]{arraySet, arraySet2})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        ckf.g(arraySet2, "array");
        int i = arraySet2.get_size$collection();
        int i2 = arraySet.get_size$collection();
        for (int i3 = 0; i3 < i; i3++) {
            arraySet.remove(arraySet2.valueAt(i3));
        }
        return i2 != arraySet.get_size$collection();
    }

    public static final <E> E removeAtInternal(ArraySet<E> arraySet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("8b609165", new Object[]{arraySet, new Integer(i)});
        }
        ckf.g(arraySet, "<this>");
        int i2 = arraySet.get_size$collection();
        E e = (E) arraySet.getArray$collection()[i];
        if (i2 <= 1) {
            arraySet.clear();
        } else {
            int i3 = i2 - 1;
            int i4 = 8;
            if (arraySet.getHashes$collection().length <= 8 || arraySet.get_size$collection() >= arraySet.getHashes$collection().length / 3) {
                if (i < i3) {
                    int i5 = 1 + i;
                    hc1.f(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i, i5, i2);
                    hc1.h(arraySet.getArray$collection(), arraySet.getArray$collection(), i, i5, i2);
                }
                arraySet.getArray$collection()[i3] = null;
            } else {
                if (arraySet.get_size$collection() > 8) {
                    i4 = (arraySet.get_size$collection() >> 1) + arraySet.get_size$collection();
                }
                int[] hashes$collection = arraySet.getHashes$collection();
                Object[] array$collection = arraySet.getArray$collection();
                allocArrays(arraySet, i4);
                if (i > 0) {
                    hc1.j(hashes$collection, arraySet.getHashes$collection(), 0, 0, i, 6, null);
                    hc1.l(array$collection, arraySet.getArray$collection(), 0, 0, i, 6, null);
                }
                if (i < i3) {
                    int i6 = 1 + i;
                    hc1.f(hashes$collection, arraySet.getHashes$collection(), i, i6, i2);
                    hc1.h(array$collection, arraySet.getArray$collection(), i, i6, i2);
                }
            }
            if (i2 == arraySet.get_size$collection()) {
                arraySet.set_size$collection(i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e;
    }

    public static final <E> boolean removeInternal(ArraySet<E> arraySet, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("174155e3", new Object[]{arraySet, e})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        int indexOf = arraySet.indexOf(e);
        if (indexOf < 0) {
            return false;
        }
        arraySet.removeAt(indexOf);
        return true;
    }

    public static final <E> E valueAtInternal(ArraySet<E> arraySet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("18659992", new Object[]{arraySet, new Integer(i)});
        }
        ckf.g(arraySet, "<this>");
        return (E) arraySet.getArray$collection()[i];
    }

    public static final <T> ArraySet<T> arraySetOf(T... tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArraySet) ipChange.ipc$dispatch("769895e7", new Object[]{tArr});
        }
        ckf.g(tArr, pg1.ATOM_values);
        ArraySet<T> arraySet = new ArraySet<>(tArr.length);
        for (T t : tArr) {
            arraySet.add(t);
        }
        return arraySet;
    }

    public static final <E> void clearInternal(ArraySet<E> arraySet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8f634c", new Object[]{arraySet});
            return;
        }
        ckf.g(arraySet, "<this>");
        if (arraySet.get_size$collection() != 0) {
            arraySet.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            arraySet.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            arraySet.set_size$collection(0);
        }
        if (arraySet.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(ArraySet<E> arraySet, Collection<? extends E> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca5774b6", new Object[]{arraySet, collection})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            if (!arraySet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> int indexOf(ArraySet<E> arraySet, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccda730f", new Object[]{arraySet, obj, new Integer(i)})).intValue();
        }
        ckf.g(arraySet, "<this>");
        int i2 = arraySet.get_size$collection();
        if (i2 == 0) {
            return -1;
        }
        int binarySearchInternal = binarySearchInternal(arraySet, i);
        if (binarySearchInternal < 0 || ckf.b(obj, arraySet.getArray$collection()[binarySearchInternal])) {
            return binarySearchInternal;
        }
        int i3 = binarySearchInternal + 1;
        while (i3 < i2 && arraySet.getHashes$collection()[i3] == i) {
            if (ckf.b(obj, arraySet.getArray$collection()[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = binarySearchInternal - 1; i4 >= 0 && arraySet.getHashes$collection()[i4] == i; i4--) {
            if (ckf.b(obj, arraySet.getArray$collection()[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static final <E> String toStringInternal(ArraySet<E> arraySet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("753f9755", new Object[]{arraySet});
        }
        ckf.g(arraySet, "<this>");
        if (arraySet.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(arraySet.get_size$collection() * 14);
        sb.append('{');
        int i = arraySet.get_size$collection();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E valueAt = arraySet.valueAt(i2);
            if (valueAt != arraySet) {
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

    public static final <E> boolean retainAllInternal(ArraySet<E> arraySet, Collection<? extends E> collection) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214d7810", new Object[]{arraySet, collection})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        for (int i = arraySet.get_size$collection() - 1; -1 < i; i--) {
            if (!i04.R(collection, arraySet.getArray$collection()[i])) {
                arraySet.removeAt(i);
                z = true;
            }
        }
        return z;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, Collection<? extends E> collection) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8a74431", new Object[]{arraySet, collection})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= arraySet.remove(it.next());
        }
        return z;
    }

    public static final <E> boolean addInternal(ArraySet<E> arraySet, E e) {
        int i;
        int i2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d98b0480", new Object[]{arraySet, e})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        int i3 = arraySet.get_size$collection();
        if (e == null) {
            i2 = indexOfNull(arraySet);
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = indexOf(arraySet, e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = ~i2;
        if (i3 >= arraySet.getHashes$collection().length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i5);
            if (i3 == arraySet.get_size$collection()) {
                if (arraySet.getHashes$collection().length == 0) {
                    z = true;
                }
                if (!z) {
                    hc1.j(hashes$collection, arraySet.getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                    hc1.l(array$collection, arraySet.getArray$collection(), 0, 0, array$collection.length, 6, null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int i6 = i4 + 1;
            hc1.f(arraySet.getHashes$collection(), arraySet.getHashes$collection(), i6, i4, i3);
            hc1.h(arraySet.getArray$collection(), arraySet.getArray$collection(), i6, i4, i3);
        }
        if (i3 != arraySet.get_size$collection() || i4 >= arraySet.getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        arraySet.getHashes$collection()[i4] = i;
        arraySet.getArray$collection()[i4] = e;
        arraySet.set_size$collection(arraySet.get_size$collection() + 1);
        return true;
    }

    public static final <E> boolean addAllInternal(ArraySet<E> arraySet, Collection<? extends E> collection) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53d65af4", new Object[]{arraySet, collection})).booleanValue();
        }
        ckf.g(arraySet, "<this>");
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        arraySet.ensureCapacity(arraySet.get_size$collection() + collection.size());
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= arraySet.add(it.next());
        }
        return z;
    }
}
