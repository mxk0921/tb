package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J!\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000f2\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0014H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\u001dJ\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0?8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\"\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\"\u0010C¨\u0006D"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "", "initialCapacity", "<init>", "(I)V", "clone", "()Landroidx/collection/LongSparseArray;", "", "key", "get", "(J)Ljava/lang/Object;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "(JLjava/lang/Object;)Ljava/lang/Object;", "Ltb/xhv;", "delete", "(J)V", "remove", "value", "", "(JLjava/lang/Object;)Z", "index", "removeAt", "replace", "oldValue", "newValue", "(JLjava/lang/Object;Ljava/lang/Object;)Z", "put", "(JLjava/lang/Object;)V", "other", "putAll", "(Landroidx/collection/LongSparseArray;)V", "putIfAbsent", "size", "()I", "isEmpty", "()Z", "keyAt", "(I)J", "valueAt", "(I)Ljava/lang/Object;", "setValueAt", "(ILjava/lang/Object;)V", "indexOfKey", "(J)I", "indexOfValue", "(Ljava/lang/Object;)I", "containsKey", "(J)Z", "containsValue", "(Ljava/lang/Object;)Z", pg1.ATOM_EXT_clear, "()V", "append", "", "toString", "()Ljava/lang/String;", "garbage", "Z", "", "keys", "[J", "", "", pg1.ATOM_values, "[Ljava/lang/Object;", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LongSparseArray<E> implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public LongSparseArray() {
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

    @Deprecated(message = "Alias for `remove(key)`.", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4cd052", new Object[]{this, new Long(j)});
            return;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (binarySearch >= 0 && this.values[binarySearch] != LongSparseArrayKt.access$getDELETED$p()) {
            this.values[binarySearch] = LongSparseArrayKt.access$getDELETED$p();
            this.garbage = true;
        }
    }

    public E get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("a2fe5c8b", new Object[]{this, new Long(j)});
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.access$getDELETED$p()) {
            return null;
        }
        return (E) this.values[binarySearch];
    }

    public int indexOfKey(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c95597a", new Object[]{this, new Long(j)})).intValue();
        }
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, j);
    }

    public int indexOfValue(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fe1733e", new Object[]{this, e})).intValue();
        }
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.values[i5] == e) {
                return i5;
            }
        }
        return -1;
    }

    public E putIfAbsent(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("b8c13c7e", new Object[]{this, new Long(j), e});
        }
        E e2 = get(j);
        if (e2 == null) {
            put(j, e);
        }
        return e2;
    }

    public void remove(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3d19", new Object[]{this, new Long(j)});
            return;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (binarySearch >= 0 && this.values[binarySearch] != LongSparseArrayKt.access$getDELETED$p()) {
            this.values[binarySearch] = LongSparseArrayKt.access$getDELETED$p();
            this.garbage = true;
        }
    }

    public void removeAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0bdde5", new Object[]{this, new Integer(i)});
        } else if (this.values[i] != LongSparseArrayKt.access$getDELETED$p()) {
            this.values[i] = LongSparseArrayKt.access$getDELETED$p();
            this.garbage = true;
        }
    }

    public E replace(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("755494d", new Object[]{this, new Long(j), e});
        }
        int indexOfKey = indexOfKey(j);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e2 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e;
        return e2;
    }

    public void setValueAt(int i, E e) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7f4b36", new Object[]{this, new Integer(i), e});
            return;
        }
        if (i < 0 || i >= this.size) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        this.values[i] = e;
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return this.size;
    }

    public E valueAt(int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("935101da", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.size) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return (E) this.values[i];
    }

    public LongSparseArray(int i) {
        if (i == 0) {
            this.keys = ContainerHelpersKt.EMPTY_LONGS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
            return;
        }
        int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i);
        this.keys = new long[idealLongArraySize];
        this.values = new Object[idealLongArraySize];
    }

    public LongSparseArray<E> clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSparseArray) ipChange.ipc$dispatch("dce9b083", new Object[]{this});
        }
        Object clone = super.clone();
        ckf.e(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray<E> longSparseArray = (LongSparseArray) clone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (Object[]) this.values.clone();
        return longSparseArray;
    }

    public void append(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71bc995f", new Object[]{this, new Long(j), e});
            return;
        }
        int i = this.size;
        if (i == 0 || j > this.keys[i - 1]) {
            if (this.garbage) {
                long[] jArr = this.keys;
                if (i >= jArr.length) {
                    Object[] objArr = this.values;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    this.garbage = false;
                    this.size = i2;
                }
            }
            int i4 = this.size;
            if (i4 >= this.keys.length) {
                int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i4 + 1);
                long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
                ckf.f(copyOf, "copyOf(this, newSize)");
                this.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
                ckf.f(copyOf2, "copyOf(this, newSize)");
                this.values = copyOf2;
            }
            this.keys[i4] = j;
            this.values[i4] = e;
            this.size = i4 + 1;
            return;
        }
        put(j, e);
    }

    public boolean containsKey(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff845361", new Object[]{this, new Long(j)})).booleanValue();
        }
        return indexOfKey(j) >= 0;
    }

    public boolean containsValue(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, e})).booleanValue();
        }
        return indexOfValue(e) >= 0;
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return size() == 0;
    }

    public long keyAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea22fb9e", new Object[]{this, new Integer(i)})).longValue();
        }
        if (!(i >= 0 && i < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return this.keys[i];
    }

    public void put(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4e11ca", new Object[]{this, new Long(j), e});
            return;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e;
            return;
        }
        int i = ~binarySearch;
        if (i >= this.size || this.values[i] != LongSparseArrayKt.access$getDELETED$p()) {
            if (this.garbage) {
                int i2 = this.size;
                long[] jArr = this.keys;
                if (i2 >= jArr.length) {
                    Object[] objArr = this.values;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        Object obj = objArr[i4];
                        if (obj != LongSparseArrayKt.access$getDELETED$p()) {
                            if (i4 != i3) {
                                jArr[i3] = jArr[i4];
                                objArr[i3] = obj;
                                objArr[i4] = null;
                            }
                            i3++;
                        }
                    }
                    this.garbage = false;
                    this.size = i3;
                    i = ~ContainerHelpersKt.binarySearch(this.keys, i3, j);
                }
            }
            int i5 = this.size;
            if (i5 >= this.keys.length) {
                int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i5 + 1);
                long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
                ckf.f(copyOf, "copyOf(this, newSize)");
                this.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
                ckf.f(copyOf2, "copyOf(this, newSize)");
                this.values = copyOf2;
            }
            int i6 = this.size;
            if (i6 - i != 0) {
                long[] jArr2 = this.keys;
                int i7 = i + 1;
                hc1.g(jArr2, jArr2, i7, i, i6);
                Object[] objArr2 = this.values;
                hc1.h(objArr2, objArr2, i7, i, this.size);
            }
            this.keys[i] = j;
            this.values[i] = e;
            this.size++;
            return;
        }
        this.keys[i] = j;
        this.values[i] = e;
    }

    public void putAll(LongSparseArray<? extends E> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2cc9b6", new Object[]{this, longSparseArray});
            return;
        }
        ckf.g(longSparseArray, "other");
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            put(longSparseArray.keyAt(i), longSparseArray.valueAt(i));
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
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public E get(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("54695bef", new Object[]{this, new Long(j), e});
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        return (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.access$getDELETED$p()) ? e : (E) this.values[binarySearch];
    }

    public boolean replace(long j, E e, E e2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a02c0125", new Object[]{this, new Long(j), e, e2})).booleanValue();
        }
        int indexOfKey = indexOfKey(j);
        if (indexOfKey < 0 || !ckf.b(this.values[indexOfKey], e)) {
            return false;
        }
        this.values[indexOfKey] = e2;
        return true;
    }

    public boolean remove(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1d78b9", new Object[]{this, new Long(j), e})).booleanValue();
        }
        int indexOfKey = indexOfKey(j);
        if (indexOfKey < 0 || !ckf.b(e, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public /* synthetic */ LongSparseArray(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
