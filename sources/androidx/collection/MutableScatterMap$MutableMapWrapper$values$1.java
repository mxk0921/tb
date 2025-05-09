package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import tb.ckf;
import tb.i04;
import tb.lz3;
import tb.pg1;
import tb.szf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1", "", "", "isEmpty", "()Z", "", pg1.ATOM_EXT_iterator, "()Ljava/util/Iterator;", "Ltb/xhv;", pg1.ATOM_EXT_clear, "()V", "", tep.KEY_UNIFORM_RESULT, "addAll", "(Ljava/util/Collection;)Z", "element", "add", "(Ljava/lang/Object;)Z", "retainAll", "removeAll", "remove", "containsAll", "contains", "", "getSize", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1 implements Collection<V>, szf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MutableScatterMap<K, V> this$0;

    public MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Collection
    public boolean add(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, v})).booleanValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.this$0.clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, obj})).booleanValue();
        }
        return this.this$0.containsValue(obj);
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.this$0._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.this$0.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return new MutableScatterMap$MutableMapWrapper$values$1$iterator$1(this.this$0);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this}) : lz3.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
        }
        ckf.g(tArr, "array");
        return (T[]) lz3.b(this, tArr);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176f677e", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        Collection<? extends Object> collection2 = collection;
        ScatterMap scatterMap = this.this$0;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!scatterMap.containsValue(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
        }
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (ckf.b(mutableScatterMap.values[i4], obj)) {
                                mutableScatterMap.removeValueAt(i4);
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            boolean z2 = false;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (i04.R(collection, mutableScatterMap.values[i4])) {
                                mutableScatterMap.removeValueAt(i4);
                                z2 = true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return z2;
                    }
                }
                if (i == length) {
                    z = z2;
                    break;
                }
                i++;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            boolean z2 = false;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (!i04.R(collection, mutableScatterMap.values[i4])) {
                                mutableScatterMap.removeValueAt(i4);
                                z2 = true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return z2;
                    }
                }
                if (i == length) {
                    z = z2;
                    break;
                }
                i++;
            }
        } else {
            z = false;
        }
        return z;
    }
}
