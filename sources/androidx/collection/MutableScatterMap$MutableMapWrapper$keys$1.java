package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import tb.ckf;
import tb.i04;
import tb.lz3;
import tb.pg1;
import tb.szf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$keys$1", "", "", "isEmpty", "()Z", "", pg1.ATOM_EXT_iterator, "()Ljava/util/Iterator;", "Ltb/xhv;", pg1.ATOM_EXT_clear, "()V", "", tep.KEY_UNIFORM_RESULT, "addAll", "(Ljava/util/Collection;)Z", "element", "add", "(Ljava/lang/Object;)Z", "retainAll", "removeAll", "remove", "containsAll", "contains", "", "getSize", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1 implements Set<K>, szf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MutableScatterMap<K, V> this$0;

    public MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, k})).booleanValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends K> collection) {
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
    public boolean contains(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, obj})).booleanValue();
        }
        return this.this$0.containsKey(obj);
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
    public Iterator<K> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(this.this$0);
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
        for (Object obj : collection2) {
            if (!scatterMap.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L_0x009b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0021
            java.lang.String r5 = "ec2dfe2b"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r0
            r6[r2] = r1
            java.lang.Object r1 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0021:
            androidx.collection.MutableScatterMap<K, V> r4 = r0.this$0
            if (r1 == 0) goto L_0x002a
            int r5 = r19.hashCode()
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r5 = r5 ^ r6
            r6 = r5 & 127(0x7f, float:1.78E-43)
            int r7 = r4._capacity
            int r5 = r5 >>> 7
            r5 = r5 & r7
            r8 = 0
        L_0x003b:
            long[] r9 = r4.metadata
            int r10 = r5 >> 3
            r11 = r5 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            int r10 = r10 + r2
            r14 = r9[r10]
            int r9 = 64 - r11
            long r9 = r14 << r9
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r6
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r9
            long r13 = r11 - r13
            long r11 = ~r11
            long r11 = r11 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
        L_0x0067:
            r15 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0087
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> 3
            int r15 = r15 + r5
            r15 = r15 & r7
            java.lang.Object[] r3 = r4.keys
            r3 = r3[r15]
            boolean r3 = tb.ckf.b(r3, r1)
            if (r3 == 0) goto L_0x0080
            goto L_0x0091
        L_0x0080:
            r15 = 1
            long r15 = r11 - r15
            long r11 = r11 & r15
            r3 = 0
            goto L_0x0067
        L_0x0087:
            long r11 = ~r9
            r3 = 6
            long r11 = r11 << r3
            long r9 = r9 & r11
            long r9 = r9 & r13
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x009b
            r15 = -1
        L_0x0091:
            if (r15 < 0) goto L_0x0099
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            r1.removeValueAt(r15)
            return r2
        L_0x0099:
            r3 = 0
            return r3
        L_0x009b:
            r3 = 0
            int r8 = r8 + 8
            int r5 = r5 + r8
            r5 = r5 & r7
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
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
                            if (i04.R(collection, mutableScatterMap.keys[i4])) {
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

    @Override // java.util.Set, java.util.Collection
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
                            if (!i04.R(collection, mutableScatterMap.keys[i4])) {
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
