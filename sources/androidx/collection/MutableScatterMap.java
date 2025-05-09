package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.hc1;
import tb.ic1;
import tb.pg1;
import tb.sbp;
import tb.u1a;
import tb.vzf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001TB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJU\u0010#\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u000028\u0010\"\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001a\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00028\u00010\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001¢\u0006\u0004\b'\u0010(J)\u0010,\u001a\u00020\b2\u001a\u0010+\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0)¢\u0006\u0004\b,\u0010-J'\u0010,\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0.¢\u0006\u0004\b,\u0010/J'\u0010,\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*00¢\u0006\u0004\b,\u00101J!\u0010,\u001a\u00020\b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000102¢\u0006\u0004\b,\u00104J!\u0010,\u001a\u00020\b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b,\u00105J$\u00107\u001a\u00020\b2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*H\u0086\n¢\u0006\u0004\b7\u00108J,\u00107\u001a\u00020\b2\u001a\u0010+\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0)H\u0086\n¢\u0006\u0004\b7\u0010-J*\u00107\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0.H\u0086\n¢\u0006\u0004\b7\u0010/J*\u00107\u001a\u00020\b2\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*00H\u0086\n¢\u0006\u0004\b7\u00101J$\u00107\u001a\u00020\b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000102H\u0086\n¢\u0006\u0004\b7\u00104J$\u00107\u001a\u00020\b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\n¢\u0006\u0004\b7\u00105J\u0017\u00109\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b9\u0010:J\u001d\u00109\u001a\u00020;2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001¢\u0006\u0004\b9\u0010<J-\u0010>\u001a\u00020\b2\u0018\u0010=\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020;0\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b@\u0010AJ \u0010@\u001a\u00020\b2\u000e\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000)H\u0086\n¢\u0006\u0004\b@\u0010CJ\u001e\u0010@\u001a\u00020\b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0086\n¢\u0006\u0004\b@\u0010/J\u001e\u0010@\u001a\u00020\b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0086\n¢\u0006\u0004\b@\u00101J\u001e\u0010@\u001a\u00020\b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000DH\u0086\n¢\u0006\u0004\b@\u0010EJ\u001e\u0010@\u001a\u00020\b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000FH\u0086\n¢\u0006\u0004\b@\u0010GJ\u0019\u0010H\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\b¢\u0006\u0004\bJ\u0010\rJ\u0017\u0010K\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0001¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u0004¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010O¢\u0006\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006U"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "hash1", "findFirstAvailableSlot", "(I)I", "adjustStorage", "dropDeletes", "newCapacity", "resizeStorage", "index", "", "value", "writeMetadata", "(IJ)V", "key", "Lkotlin/Function0;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrPut", "(Ljava/lang/Object;Ltb/d1a;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "computeBlock", "compute", "(Ljava/lang/Object;Ltb/u1a;)Ljava/lang/Object;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "pairs", "putAll", "([Lkotlin/Pair;)V", "", "(Ljava/lang/Iterable;)V", "Ltb/sbp;", "(Ltb/sbp;)V", "", "from", "(Ljava/util/Map;)V", "(Landroidx/collection/ScatterMap;)V", "pair", "plusAssign", "(Lkotlin/Pair;)V", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeIf", "(Ltb/u1a;)V", "minusAssign", "(Ljava/lang/Object;)V", "keys", "([Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)V", "removeValueAt", "(I)Ljava/lang/Object;", pg1.ATOM_EXT_clear, "findInsertIndex", "(Ljava/lang/Object;)I", "trim", "()I", "", "asMutableMap", "()Ljava/util/Map;", "growthLimit", TLogTracker.LEVEL_INFO, "MutableMapWrapper", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00120\u0001R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/collection/MutableScatterMap$MutableMapWrapper;", "Landroidx/collection/ScatterMap$MapWrapper;", "Landroidx/collection/ScatterMap;", "", "<init>", "(Landroidx/collection/MutableScatterMap;)V", "Ltb/xhv;", pg1.ATOM_EXT_clear, "()V", "key", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "getEntries", "()Ljava/util/Set;", pg1.ATOM_EXT_entries, "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", pg1.ATOM_values, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, vzf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public MutableMapWrapper() {
            super();
        }

        public static /* synthetic */ Object ipc$super(MutableMapWrapper mutableMapWrapper, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableScatterMap$MutableMapWrapper");
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            } else {
                MutableScatterMap.this.clear();
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<Map.Entry<K, V>> getEntries() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("6aee8610", new Object[]{this});
            }
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<K> getKeys() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("2d9cf820", new Object[]{this});
            }
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Collection<V> getValues() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Collection) ipChange.ipc$dispatch("7d4fad88", new Object[]{this});
            }
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V put(K k, V v) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
            }
            return MutableScatterMap.this.put(k, v);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
                return;
            }
            ckf.g(map, "from");
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj});
            }
            return MutableScatterMap.this.remove(obj);
        }
    }

    public MutableScatterMap() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        int compare;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed8273", new Object[]{this});
            return;
        }
        int i = this._capacity;
        if (i > 8) {
            compare = Long.compare((this._size * 32) ^ Long.MIN_VALUE, (i * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                dropDeletes();
                return;
            }
        }
        resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
    }

    private final void dropDeletes() {
        int i;
        int i2;
        Object[] objArr;
        int i3;
        char c = 0;
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98867e40", new Object[]{this});
            return;
        }
        long[] jArr = this.metadata;
        int i5 = this._capacity;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i5);
        int i6 = 0;
        int i7 = -1;
        while (i6 != i5) {
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = (jArr[i8] >> i9) & 255;
            if (j == 128) {
                i7 = i6;
                i6++;
            } else {
                if (j == 254) {
                    Object obj = objArr2[i6];
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    int i10 = i * ScatterMapKt.MurmurHashC1;
                    int i11 = (i10 ^ (i10 << 16)) >>> 7;
                    int findFirstAvailableSlot = findFirstAvailableSlot(i11);
                    int i12 = i11 & i5;
                    if (((findFirstAvailableSlot - i12) & i5) / 8 == ((i6 - i12) & i5) / 8) {
                        jArr[i8] = ((i2 & 127) << i9) | (jArr[i8] & (~(255 << i9)));
                        jArr[ic1.J(jArr)] = jArr[c];
                    } else {
                        int i13 = findFirstAvailableSlot >> 3;
                        long j2 = jArr[i13];
                        int i14 = (findFirstAvailableSlot & 7) << 3;
                        if (((j2 >> i14) & 255) == 128) {
                            objArr = objArr2;
                            jArr[i13] = ((i2 & 127) << i14) | (j2 & (~(255 << i14)));
                            jArr[i8] = (jArr[i8] & (~(255 << i9))) | (128 << i9);
                            objArr[findFirstAvailableSlot] = objArr[i6];
                            objArr[i6] = null;
                            objArr3[findFirstAvailableSlot] = objArr3[i6];
                            objArr3[i6] = null;
                            i7 = i6;
                            i3 = i5;
                        } else {
                            objArr = objArr2;
                            jArr[i13] = ((i2 & 127) << i14) | (j2 & (~(255 << i14)));
                            if (i7 == -1) {
                                i3 = i5;
                                i7 = ScatterMapKt.findEmptySlot(jArr, i6 + 1, i3);
                            } else {
                                i3 = i5;
                            }
                            objArr[i7] = objArr[findFirstAvailableSlot];
                            objArr[findFirstAvailableSlot] = objArr[i6];
                            objArr[i6] = objArr[i7];
                            objArr3[i7] = objArr3[findFirstAvailableSlot];
                            objArr3[findFirstAvailableSlot] = objArr3[i6];
                            objArr3[i6] = objArr3[i7];
                            i6--;
                        }
                        jArr[ic1.J(jArr)] = jArr[0];
                        i4 = 1;
                        i6++;
                        i5 = i3;
                        objArr2 = objArr;
                        c = 0;
                    }
                }
                i6 += i4;
            }
        }
        initializeGrowth();
    }

    private final void initializeGrowth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cf9e7e", new Object[]{this});
        } else {
            this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
        }
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("630d57dd", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            hc1.s(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        initializeGrowth();
    }

    public static /* synthetic */ Object ipc$super(MutableScatterMap mutableScatterMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableScatterMap");
    }

    private final void resizeStorage(int i) {
        int i2;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85581495", new Object[]{this, new Integer(i)});
            return;
        }
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i4 = this._capacity;
        initializeStorage(i);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i5 = this._capacity;
        for (int i6 = 0; i6 < i4; i6 += i3) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i6];
                if (obj != null) {
                    i2 = obj.hashCode();
                } else {
                    i2 = 0;
                }
                int i7 = i2 * ScatterMapKt.MurmurHashC1;
                int i8 = i7 ^ (i7 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i8 >>> 7);
                long j = i8 & 127;
                int i9 = findFirstAvailableSlot >> 3;
                int i10 = (findFirstAvailableSlot & 7) << 3;
                long j2 = (jArr2[i9] & (~(255 << i10))) | (j << i10);
                jArr2[i9] = j2;
                jArr2[(((findFirstAvailableSlot - 7) & i5) + (i5 & 7)) >> 3] = j2;
                objArr3[findFirstAvailableSlot] = obj;
                objArr4[findFirstAvailableSlot] = objArr2[i6];
                i3 = 1;
            }
        }
    }

    public final Map<K, V> asMutableMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71afd2a4", new Object[]{this});
        }
        return new MutableMapWrapper();
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            hc1.s(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        hc1.q(this.values, null, 0, this._capacity);
        hc1.q(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final int findInsertIndex(K k) {
        int i;
        int i2;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac28feb6", new Object[]{this, k})).intValue();
        }
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * ScatterMapKt.MurmurHashC1;
        int i5 = i4 ^ (i4 << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this._capacity;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j = ((jArr[i11 + i3] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j2 = i7;
            long j3 = j ^ (j2 * ScatterMapKt.BitmaskLsb);
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i9) & i8;
                if (ckf.b(this.keys[numberOfTrailingZeros], k)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i6);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i6);
                }
                this._size++;
                int i13 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i14 = findFirstAvailableSlot >> 3;
                long j5 = jArr2[i14];
                int i15 = (findFirstAvailableSlot & 7) << 3;
                if (((j5 >> i15) & 255) == 128) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                this.growthLimit = i13 - i2;
                int i16 = this._capacity;
                long j6 = ((~(255 << i15)) & j5) | (j2 << i15);
                jArr2[i14] = j6;
                jArr2[(((findFirstAvailableSlot - 7) & i16) + (i16 & 7)) >> 3] = j6;
                return ~findFirstAvailableSlot;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i7 = i7;
            i3 = 1;
        }
    }

    public final V getOrPut(K k, d1a<? extends V> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("fea39932", new Object[]{this, k, d1aVar});
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        V v = get(k);
        if (v != null) {
            return v;
        }
        V v2 = (V) d1aVar.invoke();
        set(k, v2);
        return v2;
    }

    public final void minusAssign(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab108e2", new Object[]{this, k});
        } else {
            remove(k);
        }
    }

    public final void plusAssign(Pair<? extends K, ? extends V> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("563008c9", new Object[]{this, pair});
            return;
        }
        ckf.g(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    public final V put(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
        }
        int findInsertIndex = findInsertIndex(k);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        Object[] objArr = this.values;
        V v2 = (V) objArr[findInsertIndex];
        this.keys[findInsertIndex] = k;
        objArr[findInsertIndex] = v;
        return v2;
    }

    public final void putAll(Pair<? extends K, ? extends V>[] pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27f915d", new Object[]{this, pairArr});
            return;
        }
        ckf.g(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            set(pair.component1(), pair.component2());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L_0x008b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(K r15) {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.MutableScatterMap.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = "5a7e4beb"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r14
            r4[r0] = r15
            java.lang.Object r15 = r2.ipc$dispatch(r3, r4)
            return r15
        L_0x0016:
            if (r15 == 0) goto L_0x001d
            int r2 = r15.hashCode()
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r14._capacity
            int r2 = r2 >>> 7
        L_0x002c:
            r2 = r2 & r4
            long[] r5 = r14.metadata
            int r6 = r2 >> 3
            r7 = r2 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + r0
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r3
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L_0x0059:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0078
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            java.lang.Object[] r12 = r14.keys
            r12 = r12[r11]
            boolean r12 = tb.ckf.b(r12, r15)
            if (r12 == 0) goto L_0x0072
            goto L_0x0082
        L_0x0072:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L_0x0059
        L_0x0078:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x008b
            r11 = -1
        L_0x0082:
            if (r11 < 0) goto L_0x0089
            java.lang.Object r15 = r14.removeValueAt(r11)
            return r15
        L_0x0089:
            r15 = 0
            return r15
        L_0x008b:
            int r1 = r1 + 8
            int r2 = r2 + r1
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object):java.lang.Object");
    }

    public final void set(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f806021", new Object[]{this, k, v});
            return;
        }
        int findInsertIndex = findInsertIndex(k);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = k;
        this.values[findInsertIndex] = v;
    }

    public final int trim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59d1179c", new Object[]{this})).intValue();
        }
        int i = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(normalizeCapacity);
        return i - this._capacity;
    }

    public /* synthetic */ MutableScatterMap(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final void initializeStorage(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bad971", new Object[]{this, new Integer(i)});
            return;
        }
        if (i > 0) {
            i2 = Math.max(7, ScatterMapKt.normalizeCapacity(i));
        }
        this._capacity = i2;
        initializeMetadata(i2);
        this.keys = new Object[i2];
        this.values = new Object[i2];
    }

    private final void writeMetadata(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc57096", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        long[] jArr = this.metadata;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this._capacity;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public final void minusAssign(K[] kArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32412eb", new Object[]{this, kArr});
            return;
        }
        ckf.g(kArr, "keys");
        for (K k : kArr) {
            remove(k);
        }
    }

    public final void plusAssign(Pair<? extends K, ? extends V>[] pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("540b38b4", new Object[]{this, pairArr});
            return;
        }
        ckf.g(pairArr, "pairs");
        putAll(pairArr);
    }

    public final V removeValueAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dc94f7b6", new Object[]{this, new Integer(i)});
        }
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.keys[i] = null;
        Object[] objArr = this.values;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public MutableScatterMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final V compute(K k, u1a<? super K, ? super V, ? extends V> u1aVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("c099dd53", new Object[]{this, k, u1aVar});
        }
        ckf.g(u1aVar, "computeBlock");
        int findInsertIndex = findInsertIndex(k);
        if (findInsertIndex >= 0) {
            z = false;
        }
        V v = (V) u1aVar.invoke(k, z ? null : this.values[findInsertIndex]);
        if (z) {
            int i = ~findInsertIndex;
            this.keys[i] = k;
            this.values[i] = v;
        } else {
            this.values[findInsertIndex] = v;
        }
        return v;
    }

    public final void plusAssign(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a82c39", new Object[]{this, iterable});
            return;
        }
        ckf.g(iterable, "pairs");
        putAll(iterable);
    }

    public final void putAll(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b77a222", new Object[]{this, iterable});
            return;
        }
        ckf.g(iterable, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            set(pair.component1(), pair.component2());
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc12901f", new Object[]{this, new Integer(i)})).intValue();
        }
        int i3 = this._capacity;
        while (true) {
            int i4 = i & i3;
            long[] jArr = this.metadata;
            int i5 = i4 >> 3;
            int i6 = (i4 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j2) >> 3)) & i3;
            }
            i2 += 8;
            i = i4 + i2;
        }
    }

    public final void minusAssign(Iterable<? extends K> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc2ec8f", new Object[]{this, iterable});
            return;
        }
        ckf.g(iterable, "keys");
        Iterator<? extends K> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(sbp<? extends Pair<? extends K, ? extends V>> sbpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f9f585", new Object[]{this, sbpVar});
            return;
        }
        ckf.g(sbpVar, "pairs");
        putAll(sbpVar);
    }

    public final void plusAssign(Map<K, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ecee55", new Object[]{this, map});
            return;
        }
        ckf.g(map, "from");
        putAll(map);
    }

    public final void putAll(sbp<? extends Pair<? extends K, ? extends V>> sbpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abeb77c", new Object[]{this, sbpVar});
            return;
        }
        ckf.g(sbpVar, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> it = sbpVar.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            set(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(sbp<? extends K> sbpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afec486f", new Object[]{this, sbpVar});
            return;
        }
        ckf.g(sbpVar, "keys");
        Iterator<? extends K> it = sbpVar.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(ScatterMap<K, V> scatterMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc62b4f6", new Object[]{this, scatterMap});
            return;
        }
        ckf.g(scatterMap, "from");
        putAll(scatterMap);
    }

    public final void putAll(Map<K, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
            return;
        }
        ckf.g(map, "from");
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    public final void minusAssign(ScatterSet<K> scatterSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed8e786", new Object[]{this, scatterSet});
            return;
        }
        ckf.g(scatterSet, "keys");
        Object[] objArr = scatterSet.elements;
        long[] jArr = scatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            remove(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L_0x00a5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(K r20, V r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1
            r4 = 0
            r5 = 3
            com.android.alibaba.ip.runtime.IpChange r6 = androidx.collection.MutableScatterMap.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0025
            java.lang.String r7 = "b2235247"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            r5[r3] = r1
            r1 = 2
            r5[r1] = r2
            java.lang.Object r1 = r6.ipc$dispatch(r7, r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0025:
            if (r1 == 0) goto L_0x002c
            int r6 = r20.hashCode()
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r6 = r6 ^ r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r8 = r0._capacity
            int r6 = r6 >>> 7
            r6 = r6 & r8
            r9 = 0
        L_0x003d:
            long[] r10 = r0.metadata
            int r11 = r6 >> 3
            r12 = r6 & 7
            int r12 = r12 << r5
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r3
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            long r3 = (long) r12
            long r3 = -r3
            r12 = 63
            long r3 = r3 >> r12
            long r3 = r3 & r10
            long r3 = r3 | r13
            long r10 = (long) r7
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r3
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L_0x0068:
            r17 = 0
            int r14 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r14 == 0) goto L_0x0088
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> r5
            int r14 = r14 + r6
            r14 = r14 & r8
            java.lang.Object[] r5 = r0.keys
            r5 = r5[r14]
            boolean r5 = tb.ckf.b(r5, r1)
            if (r5 == 0) goto L_0x0080
            goto L_0x0092
        L_0x0080:
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r5 = 3
            goto L_0x0068
        L_0x0088:
            long r10 = ~r3
            r5 = 6
            long r10 = r10 << r5
            long r3 = r3 & r10
            long r3 = r3 & r12
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x00a5
            r14 = -1
        L_0x0092:
            if (r14 < 0) goto L_0x00a3
            java.lang.Object[] r1 = r0.values
            r1 = r1[r14]
            boolean r1 = tb.ckf.b(r1, r2)
            if (r1 == 0) goto L_0x00a3
            r0.removeValueAt(r14)
            r3 = 1
            return r3
        L_0x00a3:
            r4 = 0
            return r4
        L_0x00a5:
            r3 = 1
            r4 = 0
            int r9 = r9 + 8
            int r6 = r6 + r9
            r6 = r6 & r8
            r5 = 3
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    public final void removeIf(u1a<? super K, ? super V, Boolean> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88d4eed", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, "predicate");
        long[] jArr = this.metadata;
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
                            if (u1aVar.invoke(this.keys[i4], this.values[i4]).booleanValue()) {
                                removeValueAt(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void putAll(ScatterMap<K, V> scatterMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aceb955f", new Object[]{this, scatterMap});
            return;
        }
        ckf.g(scatterMap, "from");
        Object[] objArr = scatterMap.keys;
        Object[] objArr2 = scatterMap.values;
        long[] jArr = scatterMap.metadata;
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
                            set(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void minusAssign(ObjectList<K> objectList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a12d2d", new Object[]{this, objectList});
            return;
        }
        ckf.g(objectList, "keys");
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }
}
