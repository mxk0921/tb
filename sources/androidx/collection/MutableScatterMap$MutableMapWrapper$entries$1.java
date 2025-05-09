package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import tb.ckf;
import tb.kqu;
import tb.lz3;
import tb.pg1;
import tb.szf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0015\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ)\u0010\u0016\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ#\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1", "", "", "", "isEmpty", "()Z", "", pg1.ATOM_EXT_iterator, "()Ljava/util/Iterator;", "Ltb/xhv;", pg1.ATOM_EXT_clear, "()V", "", tep.KEY_UNIFORM_RESULT, "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/util/Map$Entry;)Z", "addAll", "add", "retainAll", "removeAll", "remove", "", "getSize", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1 implements Set<Map.Entry<K, V>>, szf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MutableScatterMap<K, V> this$0;

    public MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.this$0.clear();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!kqu.n(obj)) {
            return false;
        }
        return contains((Map.Entry) obj);
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.this$0._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.this$0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return new MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(this.this$0);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (!kqu.n(obj)) {
            return false;
        }
        return remove((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this}) : lz3.a(this);
    }

    public boolean add(Map.Entry<K, V> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3ec98b3", new Object[]{this, entry})).booleanValue();
        }
        ckf.g(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean contains(Map.Entry<K, V> entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c3e24f5", new Object[]{this, entry})).booleanValue();
        }
        ckf.g(entry, "element");
        return ckf.b(this.this$0.get(entry.getKey()), entry.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
        if (((r2 & ((~r2) << 6)) & (-9187201950435737472L)) == 0) goto L_0x00b4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(java.util.Map.Entry<K, V> r20) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1.remove(java.util.Map$Entry):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
        }
        ckf.g(tArr, "array");
        return (T[]) lz3.b(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
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
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!ckf.b(scatterMap.get(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        boolean z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Iterator<? extends Object> it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    if (ckf.b(entry.getKey(), mutableScatterMap.keys[i5]) && ckf.b(entry.getValue(), mutableScatterMap.values[i5])) {
                                        mutableScatterMap.removeValueAt(i5);
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        j >>= 8;
                    }
                    i = 1;
                    if (i3 != 8) {
                        return z2;
                    }
                } else {
                    i = 1;
                }
                if (i2 == length) {
                    z = z2;
                    break;
                }
                i2 += i;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        boolean z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
        }
        ckf.g(collection, tep.KEY_UNIFORM_RESULT);
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Iterator<? extends Object> it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    mutableScatterMap.removeValueAt(i5);
                                    z2 = true;
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                if (!ckf.b(entry.getKey(), mutableScatterMap.keys[i5]) || !ckf.b(entry.getValue(), mutableScatterMap.values[i5])) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    i = 1;
                    if (i3 != 8) {
                        return z2;
                    }
                } else {
                    i = 1;
                }
                if (i2 == length) {
                    z = z2;
                    break;
                }
                i2 += i;
            }
        } else {
            z = false;
        }
        return z;
    }
}
