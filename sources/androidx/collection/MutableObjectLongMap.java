package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Iterator;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.hc1;
import tb.ic1;
import tb.pg1;
import tb.sbp;
import tb.u1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00182\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010!J%\u0010\"\u001a\u00020\u00182\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010$J\u001b\u0010&\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n¢\u0006\u0004\b(\u0010'J\u0015\u0010)\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\u00020+2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b)\u0010,J-\u0010/\u001a\u00020\u00072\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020+0-H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b1\u0010*J \u00101\u001a\u00020\u00072\u000e\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u000002H\u0086\n¢\u0006\u0004\b1\u00104J\u001e\u00101\u001a\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0086\n¢\u0006\u0004\b1\u00106J\u001e\u00101\u001a\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0086\n¢\u0006\u0004\b1\u00108J\u001e\u00101\u001a\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0086\n¢\u0006\u0004\b1\u0010:J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0001¢\u0006\u0004\b;\u0010\u0006J\r\u0010<\u001a\u00020\u0007¢\u0006\u0004\b<\u0010\fJ\r\u0010=\u001a\u00020\u0003¢\u0006\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {"Landroidx/collection/MutableObjectLongMap;", "K", "Landroidx/collection/ObjectLongMap;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "key", pg1.ATOM_EXT_findIndex, "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "(I)I", "adjustStorage", "dropDeletes", "newCapacity", "resizeStorage", "index", "", "value", "writeMetadata", "(IJ)V", "Lkotlin/Function0;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrPut", "(Ljava/lang/Object;Ltb/d1a;)J", "set", "(Ljava/lang/Object;J)V", "put", "default", "(Ljava/lang/Object;JJ)J", "from", "putAll", "(Landroidx/collection/ObjectLongMap;)V", "plusAssign", "remove", "(Ljava/lang/Object;)V", "", "(Ljava/lang/Object;J)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Ltb/u1a;)V", "minusAssign", "", "keys", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "Ltb/sbp;", "(Ltb/sbp;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "removeValueAt", pg1.ATOM_EXT_clear, "trim", "()I", "growthLimit", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableObjectLongMap<K> extends ObjectLongMap<K> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    public MutableObjectLongMap() {
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
        long[] jArr2 = this.values;
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
                        jArr[ic1.J(jArr)] = (jArr[c] & 72057594037927935L) | Long.MIN_VALUE;
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
                            jArr2[findFirstAvailableSlot] = jArr2[i6];
                            jArr2[i6] = 0;
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
                            jArr2[i7] = jArr2[findFirstAvailableSlot];
                            jArr2[findFirstAvailableSlot] = jArr2[i6];
                            jArr2[i6] = jArr2[i7];
                            i6--;
                        }
                        jArr[ic1.J(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
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

    public static /* synthetic */ Object ipc$super(MutableObjectLongMap mutableObjectLongMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableObjectLongMap");
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
        long[] jArr2 = this.values;
        int i4 = this._capacity;
        initializeStorage(i);
        long[] jArr3 = this.metadata;
        Object[] objArr2 = this.keys;
        long[] jArr4 = this.values;
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
                long j2 = (jArr3[i9] & (~(255 << i10))) | (j << i10);
                jArr3[i9] = j2;
                jArr3[(((findFirstAvailableSlot - 7) & i5) + (i5 & 7)) >> 3] = j2;
                objArr2[findFirstAvailableSlot] = obj;
                jArr4[findFirstAvailableSlot] = jArr2[i6];
                i3 = 1;
            }
        }
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
        hc1.q(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final long getOrPut(K k, d1a<Long> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9773df4", new Object[]{this, k, d1aVar})).longValue();
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        int findKeyIndex = findKeyIndex(k);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        long longValue = d1aVar.invoke().longValue();
        set(k, longValue);
        return longValue;
    }

    public final void minusAssign(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab108e2", new Object[]{this, k});
        } else {
            remove(k);
        }
    }

    public final void plusAssign(ObjectLongMap<K> objectLongMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9729fb", new Object[]{this, objectLongMap});
            return;
        }
        ckf.g(objectLongMap, "from");
        putAll(objectLongMap);
    }

    public final void put(K k, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2d692", new Object[]{this, k, new Long(j)});
        } else {
            set(k, j);
        }
    }

    public final void remove(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2dfe27", new Object[]{this, k});
            return;
        }
        int findKeyIndex = findKeyIndex(k);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final void removeValueAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989776fc", new Object[]{this, new Integer(i)});
            return;
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
    }

    public final void set(K k, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce49ffdf", new Object[]{this, k, new Long(j)});
            return;
        }
        int findIndex = findIndex(k);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        }
        this.keys[findIndex] = k;
        this.values[findIndex] = j;
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

    public /* synthetic */ MutableObjectLongMap(int i, int i2, a07 a07Var) {
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
        this.values = new long[i2];
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

    public final long put(K k, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c987266", new Object[]{this, k, new Long(j), new Long(j2)})).longValue();
        }
        int findIndex = findIndex(k);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        } else {
            j2 = this.values[findIndex];
        }
        this.keys[findIndex] = k;
        this.values[findIndex] = j;
        return j2;
    }

    public MutableObjectLongMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final boolean remove(K k, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99923d81", new Object[]{this, k, new Long(j)})).booleanValue();
        }
        int findKeyIndex = findKeyIndex(k);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != j) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
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

    private final int findIndex(K k) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f122066f", new Object[]{this, k})).intValue();
        }
        int hashCode = (k != null ? k.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this._capacity;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + i] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            long j3 = j ^ (j2 * ScatterMapKt.BitmaskLsb);
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (ckf.b(this.keys[numberOfTrailingZeros], k)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = findFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return ~findFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i4;
            i = 1;
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

    public final void putAll(ObjectLongMap<K> objectLongMap) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331204f2", new Object[]{this, objectLongMap});
            return;
        }
        ckf.g(objectLongMap, "from");
        Object[] objArr = objectLongMap.keys;
        long[] jArr = objectLongMap.values;
        long[] jArr2 = objectLongMap.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            i2 = i2;
                            set(objArr[i5], jArr[i5]);
                        } else {
                            i2 = i2;
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    i = i2;
                }
                if (i != length) {
                    i2 = i + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void removeIf(u1a<? super K, ? super Long, Boolean> u1aVar) {
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
                            if (u1aVar.invoke(this.keys[i4], Long.valueOf(this.values[i4])).booleanValue()) {
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
}
