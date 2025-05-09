package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.hc1;
import tb.pg1;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u00028\u0002\"\n\b\u0002\u0010\u0010*\u0004\u0018\u00018\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u0002H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0007J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00028\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\u0013J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010'J\u001f\u0010)\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b-\u0010\u0013J'\u0010.\u001a\u00020\u00142\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b.\u0010\tJ!\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b/\u0010\u0013J\u0019\u00100\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010#J\u001f\u00100\u001a\u00020\u00192\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010'J!\u00103\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b3\u0010\u0013J'\u00103\u001a\u00020\u00192\u0006\u0010\n\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u00012\u0006\u00105\u001a\u00028\u0001H\u0016¢\u0006\u0004\b3\u00106J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\u000fJ\u001a\u00109\u001a\u00020\u00192\b\u00108\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b9\u0010\u001bJ\u000f\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b:\u0010\u000fJ\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u00107\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010D¨\u0006E"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Landroidx/collection/SimpleArrayMap;)V", "key", "hash", pg1.ATOM_EXT_indexOf, "(Ljava/lang/Object;I)I", "indexOfNull", "()I", "T", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefaultInternal", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ltb/xhv;", pg1.ATOM_EXT_clear, "()V", "minimumCapacity", "ensureCapacity", "", "containsKey", "(Ljava/lang/Object;)Z", "indexOfKey", "(Ljava/lang/Object;)I", "value", "__restricted$indexOfValue", "indexOfValue", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "index", "keyAt", "(I)Ljava/lang/Object;", "valueAt", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "", "hashes", "[I", "", "array", "[Ljava/lang/Object;", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SimpleArrayMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    private final <T extends V> T getOrDefaultInternal(Object obj, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b9b313ee", new Object[]{this, obj, t});
        }
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return (T) this.array[(indexOfKey << 1) + 1];
        }
        return t;
    }

    private final int indexOf(K k, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69153e4a", new Object[]{this, k, new Integer(i)})).intValue();
        }
        int i2 = this.size;
        if (i2 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i2, i);
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (ckf.b(k, this.array[binarySearch << 1])) {
            return binarySearch;
        }
        int i3 = binarySearch + 1;
        while (i3 < i2 && this.hashes[i3] == i) {
            if (ckf.b(k, this.array[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = binarySearch - 1; i4 >= 0 && this.hashes[i4] == i; i4--) {
            if (ckf.b(k, this.array[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int __restricted$indexOfValue(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a47d2c47", new Object[]{this, v})).intValue();
        }
        int i = this.size * 2;
        Object[] objArr = this.array;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (ckf.b(v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, k})).booleanValue();
        }
        if (indexOfKey(k) >= 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i = this.size;
                for (int i2 = 0; i2 < i; i2++) {
                    K keyAt = keyAt(i2);
                    V valueAt = valueAt(i2);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!ckf.b(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this.size;
                for (int i4 = 0; i4 < i3; i4++) {
                    K keyAt2 = keyAt(i4);
                    V valueAt2 = valueAt(i4);
                    Object obj3 = ((Map) obj).get(keyAt2);
                    if (valueAt2 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                            return false;
                        }
                    } else if (!ckf.b(valueAt2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, k});
        }
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return null;
    }

    public V getOrDefault(Object obj, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("8b37602b", new Object[]{this, obj, v});
        }
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return v;
    }

    public int hashCode() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i2 = this.size;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < i2) {
            Object obj = objArr[i5];
            int i6 = iArr[i3];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i4 += i ^ i6;
            i3++;
            i5 += 2;
        }
        return i4;
    }

    public int indexOfKey(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77ee8b6c", new Object[]{this, k})).intValue();
        }
        if (k == null) {
            return indexOfNull();
        }
        return indexOf(k, k.hashCode());
    }

    public K keyAt(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (K) ipChange.ipc$dispatch("4629a4c8", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.size) {
            z = true;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        return (K) this.array[i << 1];
    }

    public V putIfAbsent(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("244c40e", new Object[]{this, k, v});
        }
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public V remove(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, k});
        }
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public V replace(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("f6c00f1f", new Object[]{this, k, v});
        }
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v);
        }
        return null;
    }

    public V setValueAt(int i, V v) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("bddcdebc", new Object[]{this, new Integer(i), v});
        }
        if (i >= 0 && i < this.size) {
            z = true;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.array;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.size;
    }

    public V valueAt(int i) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("935101da", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.size) {
            z = true;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        return (V) this.array[(i << 1) + 1];
    }

    public SimpleArrayMap(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = ContainerHelpersKt.EMPTY_INTS;
        } else {
            iArr = new int[i];
        }
        this.hashes = iArr;
        if (i == 0) {
            objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            objArr = new Object[i << 1];
        }
        this.array = objArr;
    }

    public void ensureCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ce3744", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            ckf.f(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i * 2);
            ckf.f(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
        }
        if (this.size != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsValue(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, v})).booleanValue();
        }
        return __restricted$indexOfValue(v) >= 0;
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.size <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
        }
        int i3 = this.size;
        if (k != null) {
            i2 = k.hashCode();
        }
        if (k != null) {
            i = indexOf(k, i2);
        } else {
            i = indexOfNull();
        }
        if (i >= 0) {
            int i4 = (i << 1) + 1;
            Object[] objArr = this.array;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = ~i;
        int[] iArr = this.hashes;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i6);
            ckf.f(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i6 << 1);
            ckf.f(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
            if (i3 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.hashes;
            int i7 = i5 + 1;
            hc1.f(iArr2, iArr2, i7, i5, i3);
            Object[] objArr2 = this.array;
            hc1.h(objArr2, objArr2, i7 << 1, i5 << 1, this.size << 1);
        }
        int i8 = this.size;
        if (i3 == i8) {
            int[] iArr3 = this.hashes;
            if (i5 < iArr3.length) {
                iArr3[i5] = i2;
                Object[] objArr3 = this.array;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.size = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba92128", new Object[]{this, simpleArrayMap});
            return;
        }
        ckf.g(simpleArrayMap, "map");
        int i = simpleArrayMap.size;
        ensureCapacity(this.size + i);
        if (this.size != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(simpleArrayMap.keyAt(i2), simpleArrayMap.valueAt(i2));
            }
        } else if (i > 0) {
            hc1.f(simpleArrayMap.hashes, this.hashes, 0, 0, i);
            hc1.h(simpleArrayMap.array, this.array, 0, 0, i << 1);
            this.size = i;
        }
    }

    public boolean remove(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2235247", new Object[]{this, k, v})).booleanValue();
        }
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || !ckf.b(v, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public V removeAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("19801fed", new Object[]{this, new Integer(i)});
        }
        if (!(i >= 0 && i < this.size)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i);
        }
        Object[] objArr = this.array;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.size;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.hashes;
            int i5 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    hc1.f(iArr, iArr, i, i6, i3);
                    Object[] objArr2 = this.array;
                    hc1.h(objArr2, objArr2, i2, i6 << 1, i3 << 1);
                }
                Object[] objArr3 = this.array;
                int i7 = i4 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i5);
                ckf.f(copyOf, "copyOf(this, newSize)");
                this.hashes = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.array, i5 << 1);
                ckf.f(copyOf2, "copyOf(this, newSize)");
                this.array = copyOf2;
                if (i3 == this.size) {
                    if (i > 0) {
                        hc1.f(iArr, this.hashes, 0, 0, i);
                        hc1.h(objArr, this.array, 0, 0, i2);
                    }
                    if (i < i4) {
                        int i8 = i + 1;
                        hc1.f(iArr, this.hashes, i, i8, i3);
                        hc1.h(objArr, this.array, i2, i8 << 1, i3 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i3 == this.size) {
                this.size = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    public boolean replace(K k, V v, V v2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e19f593", new Object[]{this, k, v, v2})).booleanValue();
        }
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || !ckf.b(v, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, v2);
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
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i2);
            if (keyAt != sb) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i2);
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

    private final int indexOfNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efd97fea", new Object[]{this})).intValue();
        }
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i, 0);
        if (binarySearch < 0 || this.array[binarySearch << 1] == null) {
            return binarySearch;
        }
        int i2 = binarySearch + 1;
        while (i2 < i && this.hashes[i2] == 0) {
            if (this.array[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = binarySearch - 1; i3 >= 0 && this.hashes[i3] == 0; i3--) {
            if (this.array[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public /* synthetic */ SimpleArrayMap(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
