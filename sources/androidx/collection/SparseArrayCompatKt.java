package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.Arrays;
import kotlin.Metadata;
import tb.ckf;
import tb.hc1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a<\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0001H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a2\u0010\u000b\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\b\u000b\u0010\u0010\u001a(\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0012\u0010\f\u001a0\u0010\u0014\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0007\u001a8\u0010\u0016\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a0\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a0\u0010\u001f\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a2\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b!\u0010\u0007\u001a \u0010\"\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a \u0010$\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b$\u0010%\u001a(\u0010&\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b&\u0010'\u001a(\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010\t\u001a0\u0010)\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b)\u0010\u001d\u001a(\u0010*\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b*\u0010'\u001a(\u0010+\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b+\u0010,\u001a(\u0010-\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010.\u001a(\u0010/\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b/\u00100\u001a \u00101\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b1\u0010\u001b\u001a0\u00102\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b2\u0010\u001d\u001a \u00104\u001a\u000203\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\b¢\u0006\u0004\b4\u00105\"\u0014\u00106\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"E", "T", "Landroidx/collection/SparseArrayCompat;", "", "key", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "internalGet", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "Ltb/xhv;", "commonRemove", "(Landroidx/collection/SparseArrayCompat;I)V", "", "value", "", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Z", "index", "commonRemoveAt", "size", "commonRemoveAtRange", "(Landroidx/collection/SparseArrayCompat;II)V", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "gc", "(Landroidx/collection/SparseArrayCompat;)V", "commonPut", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "other", "commonPutAll", "(Landroidx/collection/SparseArrayCompat;Landroidx/collection/SparseArrayCompat;)V", "commonPutIfAbsent", "commonSize", "(Landroidx/collection/SparseArrayCompat;)I", "commonIsEmpty", "(Landroidx/collection/SparseArrayCompat;)Z", "commonKeyAt", "(Landroidx/collection/SparseArrayCompat;I)I", "commonValueAt", "commonSetValueAt", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonContainsKey", "(Landroidx/collection/SparseArrayCompat;I)Z", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonClear", "commonAppend", "", "commonToString", "(Landroidx/collection/SparseArrayCompat;)Ljava/lang/String;", "DELETED", "Ljava/lang/Object;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SparseArrayCompatKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object DELETED = new Object();

    public static final /* synthetic */ void access$gc(SparseArrayCompat sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af4e6ee", new Object[]{sparseArrayCompat});
        } else {
            gc(sparseArrayCompat);
        }
    }

    public static final /* synthetic */ Object access$getDELETED$p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("787ce5bc", new Object[0]);
        }
        return DELETED;
    }

    public static final <E> void commonClear(SparseArrayCompat<E> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0859c28", new Object[]{sparseArrayCompat});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        int i = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> sparseArrayCompat, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f4afce3", new Object[]{sparseArrayCompat, e})).booleanValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        int i = sparseArrayCompat.size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            } else if (sparseArrayCompat.values[i2] == e) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i) {
        E e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("51a8970e", new Object[]{sparseArrayCompat, new Integer(i)});
        }
        ckf.g(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (binarySearch < 0 || (e = (E) sparseArrayCompat.values[binarySearch]) == DELETED) {
            return null;
        }
        return e;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> sparseArrayCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efeaedcd", new Object[]{sparseArrayCompat, new Integer(i)})).intValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> sparseArrayCompat, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c560dc86", new Object[]{sparseArrayCompat, e})).intValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        int i = sparseArrayCompat.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (sparseArrayCompat.values[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c0babb6", new Object[]{sparseArrayCompat})).booleanValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() == 0) {
            return true;
        }
        return false;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> sparseArrayCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbcb8cf3", new Object[]{sparseArrayCompat, new Integer(i)})).intValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i];
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b00a788", new Object[]{sparseArrayCompat, new Integer(i)});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (binarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[binarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[binarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> sparseArrayCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a5079b", new Object[]{sparseArrayCompat, new Integer(i)});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i] != access$getDELETED$p()) {
            sparseArrayCompat.values[i] = access$getDELETED$p();
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("f24f6314", new Object[]{sparseArrayCompat, new Integer(i), e});
        }
        ckf.g(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e2 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e;
        return e2;
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b7a1a2", new Object[]{sparseArrayCompat, new Integer(i), e});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i] = e;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6b62471", new Object[]{sparseArrayCompat})).intValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    public static final <E> E commonValueAt(SparseArrayCompat<E> sparseArrayCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("dc097620", new Object[]{sparseArrayCompat, new Integer(i)});
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        return (E) sparseArrayCompat.values[i];
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i, T t) {
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("63f35804", new Object[]{sparseArrayCompat, new Integer(i), t});
        }
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (binarySearch < 0 || (t2 = (T) sparseArrayCompat.values[binarySearch]) == DELETED) {
            return t;
        }
        return t2;
    }

    public static final <E> void commonAppend(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950b997a", new Object[]{sparseArrayCompat, new Integer(i), e});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        int i2 = sparseArrayCompat.size;
        if (i2 == 0 || i > sparseArrayCompat.keys[i2 - 1]) {
            if (sparseArrayCompat.garbage && i2 >= sparseArrayCompat.keys.length) {
                access$gc(sparseArrayCompat);
            }
            int i3 = sparseArrayCompat.size;
            if (i3 >= sparseArrayCompat.keys.length) {
                int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                ckf.f(copyOf, "copyOf(this, newSize)");
                sparseArrayCompat.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                ckf.f(copyOf2, "copyOf(this, newSize)");
                sparseArrayCompat.values = copyOf2;
            }
            sparseArrayCompat.keys[i3] = i;
            sparseArrayCompat.values[i3] = e;
            sparseArrayCompat.size = i3 + 1;
            return;
        }
        sparseArrayCompat.put(i, e);
    }

    public static final <E> void commonPut(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420de179", new Object[]{sparseArrayCompat, new Integer(i), e});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (binarySearch >= 0) {
            sparseArrayCompat.values[binarySearch] = e;
            return;
        }
        int i2 = ~binarySearch;
        if (i2 >= sparseArrayCompat.size || sparseArrayCompat.values[i2] != access$getDELETED$p()) {
            if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                access$gc(sparseArrayCompat);
                i2 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
            }
            int i3 = sparseArrayCompat.size;
            if (i3 >= sparseArrayCompat.keys.length) {
                int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                ckf.f(copyOf, "copyOf(this, newSize)");
                sparseArrayCompat.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                ckf.f(copyOf2, "copyOf(this, newSize)");
                sparseArrayCompat.values = copyOf2;
            }
            int i4 = sparseArrayCompat.size;
            if (i4 - i2 != 0) {
                int[] iArr = sparseArrayCompat.keys;
                int i5 = i2 + 1;
                hc1.f(iArr, iArr, i5, i2, i4);
                Object[] objArr = sparseArrayCompat.values;
                hc1.h(objArr, objArr, i5, i2, sparseArrayCompat.size);
            }
            sparseArrayCompat.keys[i2] = i;
            sparseArrayCompat.values[i2] = e;
            sparseArrayCompat.size++;
            return;
        }
        sparseArrayCompat.keys[i2] = i;
        sparseArrayCompat.values[i2] = e;
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("26a24d43", new Object[]{sparseArrayCompat, new Integer(i), e});
        }
        ckf.g(sparseArrayCompat, "<this>");
        E e2 = (E) commonGet(sparseArrayCompat, i);
        if (e2 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = e;
            } else {
                int i2 = ~binarySearch;
                if (i2 >= sparseArrayCompat.size || sparseArrayCompat.values[i2] != access$getDELETED$p()) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        access$gc(sparseArrayCompat);
                        i2 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
                    }
                    int i3 = sparseArrayCompat.size;
                    if (i3 >= sparseArrayCompat.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                        int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                        ckf.f(copyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                        ckf.f(copyOf2, "copyOf(this, newSize)");
                        sparseArrayCompat.values = copyOf2;
                    }
                    int i4 = sparseArrayCompat.size;
                    if (i4 - i2 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i5 = i2 + 1;
                        hc1.f(iArr, iArr, i5, i2, i4);
                        Object[] objArr = sparseArrayCompat.values;
                        hc1.h(objArr, objArr, i5, i2, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i2] = i;
                    sparseArrayCompat.values[i2] = e;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i2] = i;
                    sparseArrayCompat.values[i2] = e;
                }
            }
        }
        return e2;
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> sparseArrayCompat, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ad02cf", new Object[]{sparseArrayCompat, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        int min = Math.min(i2, i + i2);
        while (i < min) {
            sparseArrayCompat.removeAt(i);
            i++;
        }
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> sparseArrayCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2667912", new Object[]{sparseArrayCompat, new Integer(i)})).booleanValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i) >= 0;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        E e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("44e91bb2", new Object[]{sparseArrayCompat, new Integer(i), e});
        }
        ckf.g(sparseArrayCompat, "<this>");
        int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        return (binarySearch < 0 || (e2 = (E) sparseArrayCompat.values[binarySearch]) == DELETED) ? e : e2;
    }

    public static final <E> void commonPutAll(SparseArrayCompat<E> sparseArrayCompat, SparseArrayCompat<? extends E> sparseArrayCompat2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e30bc4", new Object[]{sparseArrayCompat, sparseArrayCompat2});
            return;
        }
        ckf.g(sparseArrayCompat, "<this>");
        ckf.g(sparseArrayCompat2, "other");
        int size = sparseArrayCompat2.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArrayCompat2.keyAt(i);
            Object valueAt = sparseArrayCompat2.valueAt(i);
            int binarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
            if (binarySearch >= 0) {
                sparseArrayCompat.values[binarySearch] = valueAt;
            } else {
                int i2 = ~binarySearch;
                if (i2 >= sparseArrayCompat.size || sparseArrayCompat.values[i2] != access$getDELETED$p()) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        access$gc(sparseArrayCompat);
                        i2 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, keyAt);
                    }
                    int i3 = sparseArrayCompat.size;
                    if (i3 >= sparseArrayCompat.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                        int[] copyOf = Arrays.copyOf(sparseArrayCompat.keys, idealIntArraySize);
                        ckf.f(copyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(sparseArrayCompat.values, idealIntArraySize);
                        ckf.f(copyOf2, "copyOf(this, newSize)");
                        sparseArrayCompat.values = copyOf2;
                    }
                    int i4 = sparseArrayCompat.size;
                    if (i4 - i2 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i5 = i2 + 1;
                        hc1.f(iArr, iArr, i5, i2, i4);
                        Object[] objArr = sparseArrayCompat.values;
                        hc1.h(objArr, objArr, i5, i2, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i2] = keyAt;
                    sparseArrayCompat.values[i2] = valueAt;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i2] = keyAt;
                    sparseArrayCompat.values[i2] = valueAt;
                }
            }
        }
    }

    public static final <E> String commonToString(SparseArrayCompat<E> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3321264d", new Object[]{sparseArrayCompat});
        }
        ckf.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(sparseArrayCompat.size * 28);
        sb.append('{');
        int i = sparseArrayCompat.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(sparseArrayCompat.keyAt(i2));
            sb.append('=');
            E valueAt = sparseArrayCompat.valueAt(i2);
            if (valueAt != sparseArrayCompat) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        ckf.f(sb2, "buffer.toString()");
        return sb2;
    }

    private static final <E> void gc(SparseArrayCompat<E> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67b162e", new Object[]{sparseArrayCompat});
            return;
        }
        int i = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i2;
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i, E e, E e2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1475203e", new Object[]{sparseArrayCompat, new Integer(i), e, e2})).booleanValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i);
        if (indexOfKey < 0 || !ckf.b(sparseArrayCompat.values[indexOfKey], e)) {
            return false;
        }
        sparseArrayCompat.values[indexOfKey] = e2;
        return true;
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("388cc568", new Object[]{sparseArrayCompat, new Integer(i), obj})).booleanValue();
        }
        ckf.g(sparseArrayCompat, "<this>");
        int indexOfKey = sparseArrayCompat.indexOfKey(i);
        if (indexOfKey < 0 || !ckf.b(obj, sparseArrayCompat.valueAt(indexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(indexOfKey);
        return true;
    }
}
