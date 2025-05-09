package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import tb.a07;
import tb.ckf;
import tb.hc1;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J!\u0010\u0010\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\rJ'\u0010\u001a\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000e2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010\u000bJ\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010\u001fJ\u0017\u0010+\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u0010\u001fJ\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110=8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0017\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010@R\u0011\u0010%\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\bA\u0010&¨\u0006B"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "", "initialCapacity", "<init>", "(I)V", "clone", "()Landroidx/collection/SparseArrayCompat;", "key", "get", "(I)Ljava/lang/Object;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "(ILjava/lang/Object;)Ljava/lang/Object;", "Ltb/xhv;", "delete", "remove", "", "value", "", "(ILjava/lang/Object;)Z", "index", "removeAt", "size", "removeAtRange", "(II)V", "replace", "oldValue", "newValue", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "put", "(ILjava/lang/Object;)V", "other", "putAll", "(Landroidx/collection/SparseArrayCompat;)V", "putIfAbsent", "()I", "isEmpty", "()Z", "keyAt", "(I)I", "valueAt", "setValueAt", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "containsKey", "(I)Z", "containsValue", "(Ljava/lang/Object;)Z", pg1.ATOM_EXT_clear, "()V", "append", "", "toString", "()Ljava/lang/String;", "garbage", "Z", "", "keys", "[I", "", pg1.ATOM_values, "[Ljava/lang/Object;", TLogTracker.LEVEL_INFO, "getIsEmpty", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    @Deprecated(message = "Alias for remove(int).", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4ccc91", new Object[]{this, new Integer(i)});
        } else {
            remove(i);
        }
    }

    public E get(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (E) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)}) : (E) SparseArrayCompatKt.commonGet(this, i);
    }

    public final boolean getIsEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb5e2418", new Object[]{this})).booleanValue();
        }
        return isEmpty();
    }

    public int indexOfKey(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c9555b9", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i);
    }

    public int indexOfValue(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fe1733e", new Object[]{this, e})).intValue();
        }
        if (this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public int keyAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea22fb9d", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        return this.keys[i];
    }

    public void remove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
        } else {
            SparseArrayCompatKt.commonRemove(this, i);
        }
    }

    public void removeAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0bdde5", new Object[]{this, new Integer(i)});
        } else if (this.values[i] != SparseArrayCompatKt.access$getDELETED$p()) {
            this.values[i] = SparseArrayCompatKt.access$getDELETED$p();
            this.garbage = true;
        }
    }

    public E replace(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("a602acae", new Object[]{this, new Integer(i), e});
        }
        int indexOfKey = indexOfKey(i);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e2 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e;
        return e2;
    }

    public void setValueAt(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7f4b36", new Object[]{this, new Integer(i), e});
            return;
        }
        if (this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        this.values[i] = e;
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        if (this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        return this.size;
    }

    public E valueAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("935101da", new Object[]{this, new Integer(i)});
        }
        if (this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        return (E) this.values[i];
    }

    public SparseArrayCompat(int i) {
        if (i == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
            return;
        }
        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i);
        this.keys = new int[idealIntArraySize];
        this.values = new Object[idealIntArraySize];
    }

    public void append(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6523a3de", new Object[]{this, new Integer(i), e});
            return;
        }
        int i2 = this.size;
        if (i2 == 0 || i > this.keys[i2 - 1]) {
            if (this.garbage && i2 >= this.keys.length) {
                SparseArrayCompatKt.access$gc(this);
            }
            int i3 = this.size;
            if (i3 >= this.keys.length) {
                int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                ckf.f(copyOf, "copyOf(this, newSize)");
                this.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                ckf.f(copyOf2, "copyOf(this, newSize)");
                this.values = copyOf2;
            }
            this.keys[i3] = i;
            this.values[i3] = e;
            this.size = i3 + 1;
            return;
        }
        put(i, e);
    }

    public SparseArrayCompat<E> clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArrayCompat) ipChange.ipc$dispatch("20f80e05", new Object[]{this});
        }
        Object clone = super.clone();
        ckf.e(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) clone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int i, E e) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (E) ipChange.ipc$dispatch("f316bf50", new Object[]{this, new Integer(i), e}) : (E) SparseArrayCompatKt.commonGet(this, i, e);
    }

    public void put(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b51c49", new Object[]{this, new Integer(i), e});
            return;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e;
            return;
        }
        int i2 = ~binarySearch;
        if (i2 >= this.size || this.values[i2] != SparseArrayCompatKt.access$getDELETED$p()) {
            if (this.garbage && this.size >= this.keys.length) {
                SparseArrayCompatKt.access$gc(this);
                i2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i);
            }
            int i3 = this.size;
            if (i3 >= this.keys.length) {
                int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                ckf.f(copyOf, "copyOf(this, newSize)");
                this.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                ckf.f(copyOf2, "copyOf(this, newSize)");
                this.values = copyOf2;
            }
            int i4 = this.size;
            if (i4 - i2 != 0) {
                int[] iArr = this.keys;
                int i5 = i2 + 1;
                hc1.f(iArr, iArr, i5, i2, i4);
                Object[] objArr = this.values;
                hc1.h(objArr, objArr, i5, i2, this.size);
            }
            this.keys[i2] = i;
            this.values[i2] = e;
            this.size++;
            return;
        }
        this.keys[i2] = i;
        this.values[i2] = e;
    }

    public E putIfAbsent(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("576e9fdf", new Object[]{this, new Integer(i), e});
        }
        E e2 = (E) SparseArrayCompatKt.commonGet(this, i);
        if (e2 == null) {
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i);
            if (binarySearch >= 0) {
                this.values[binarySearch] = e;
            } else {
                int i2 = ~binarySearch;
                if (i2 >= this.size || this.values[i2] != SparseArrayCompatKt.access$getDELETED$p()) {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.access$gc(this);
                        i2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i);
                    }
                    int i3 = this.size;
                    if (i3 >= this.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                        int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                        ckf.f(copyOf, "copyOf(this, newSize)");
                        this.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                        ckf.f(copyOf2, "copyOf(this, newSize)");
                        this.values = copyOf2;
                    }
                    int i4 = this.size;
                    if (i4 - i2 != 0) {
                        int[] iArr = this.keys;
                        int i5 = i2 + 1;
                        hc1.f(iArr, iArr, i5, i2, i4);
                        Object[] objArr = this.values;
                        hc1.h(objArr, objArr, i5, i2, this.size);
                    }
                    this.keys[i2] = i;
                    this.values[i2] = e;
                    this.size++;
                } else {
                    this.keys[i2] = i;
                    this.values[i2] = e;
                }
            }
        }
        return e2;
    }

    public boolean remove(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e848338", new Object[]{this, new Integer(i), obj})).booleanValue();
        }
        int indexOfKey = indexOfKey(i);
        if (indexOfKey < 0 || !ckf.b(obj, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public void removeAtRange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf27b24d", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int min = Math.min(i2, i + i2);
        while (i < min) {
            removeAt(i);
            i++;
        }
    }

    public boolean containsKey(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff844fa0", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return indexOfKey(i) >= 0;
    }

    public boolean containsValue(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, e})).booleanValue();
        }
        if (this.garbage) {
            SparseArrayCompatKt.access$gc(this);
        }
        int i = this.size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            } else if (this.values[i2] == e) {
                break;
            } else {
                i2++;
            }
        }
        return i2 >= 0;
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return size() == 0;
    }

    public void putAll(SparseArrayCompat<? extends E> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e723d38", new Object[]{this, sparseArrayCompat});
            return;
        }
        ckf.g(sparseArrayCompat, "other");
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArrayCompat.keyAt(i);
            Object valueAt = sparseArrayCompat.valueAt(i);
            int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
            if (binarySearch >= 0) {
                this.values[binarySearch] = valueAt;
            } else {
                int i2 = ~binarySearch;
                if (i2 >= this.size || this.values[i2] != SparseArrayCompatKt.access$getDELETED$p()) {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.access$gc(this);
                        i2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
                    }
                    int i3 = this.size;
                    if (i3 >= this.keys.length) {
                        int idealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                        int[] copyOf = Arrays.copyOf(this.keys, idealIntArraySize);
                        ckf.f(copyOf, "copyOf(this, newSize)");
                        this.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf(this.values, idealIntArraySize);
                        ckf.f(copyOf2, "copyOf(this, newSize)");
                        this.values = copyOf2;
                    }
                    int i4 = this.size;
                    if (i4 - i2 != 0) {
                        int[] iArr = this.keys;
                        int i5 = i2 + 1;
                        hc1.f(iArr, iArr, i5, i2, i4);
                        Object[] objArr = this.values;
                        hc1.h(objArr, objArr, i5, i2, this.size);
                    }
                    this.keys[i2] = keyAt;
                    this.values[i2] = valueAt;
                    this.size++;
                } else {
                    this.keys[i2] = keyAt;
                    this.values[i2] = valueAt;
                }
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append('=');
            E valueAt = valueAt(i2);
            if (valueAt != this) {
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

    public boolean replace(int i, E e, E e2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d72b09e4", new Object[]{this, new Integer(i), e, e2})).booleanValue();
        }
        int indexOfKey = indexOfKey(i);
        if (indexOfKey < 0 || !ckf.b(this.values[indexOfKey], e)) {
            return false;
        }
        this.values[indexOfKey] = e2;
        return true;
    }

    public /* synthetic */ SparseArrayCompat(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
