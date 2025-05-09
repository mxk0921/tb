package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.hc1;
import tb.ic1;
import tb.pg1;
import tb.u1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u0019J\u001d\u0010\u001f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u0019J%\u0010\u001f\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010!J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0005J\u001d\u0010&\u001a\u00020'2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010(J-\u0010+\u001a\u00020\u00062\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020'0)H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b-\u0010\u0005J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0086\n¢\u0006\u0004\b-\u00100J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u000201H\u0086\n¢\u0006\u0004\b-\u00102J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u000203H\u0086\n¢\u0006\u0004\b-\u00104J\u0017\u00105\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0001¢\u0006\u0004\b5\u0010\u0005J\r\u00106\u001a\u00020\u0006¢\u0006\u0004\b6\u0010\u000bJ\r\u00107\u001a\u00020\u0002¢\u0006\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"Landroidx/collection/MutableIntLongMap;", "Landroidx/collection/IntLongMap;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "key", "findInsertIndex", "(I)I", "hash1", "findFirstAvailableSlot", "adjustStorage", "dropDeletes", "newCapacity", "resizeStorage", "index", "", "value", "writeMetadata", "(IJ)V", "Lkotlin/Function0;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrPut", "(ILtb/d1a;)J", "set", "put", "default", "(IJJ)J", "from", "putAll", "(Landroidx/collection/IntLongMap;)V", "plusAssign", "remove", "", "(IJ)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Ltb/u1a;)V", "minusAssign", "", "keys", "([I)V", "Landroidx/collection/IntSet;", "(Landroidx/collection/IntSet;)V", "Landroidx/collection/IntList;", "(Landroidx/collection/IntList;)V", "removeValueAt", pg1.ATOM_EXT_clear, "trim", "()I", "growthLimit", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableIntLongMap extends IntLongMap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    public MutableIntLongMap() {
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
        int[] iArr;
        int i2;
        char c = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98867e40", new Object[]{this});
            return;
        }
        long[] jArr = this.metadata;
        int i4 = this._capacity;
        int[] iArr2 = this.keys;
        long[] jArr2 = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i4);
        int i5 = 0;
        int i6 = -1;
        while (i5 != i4) {
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr[i7] >> i8) & 255;
            if (j == 128) {
                i6 = i5;
                i5++;
            } else {
                if (j == 254) {
                    int i9 = iArr2[i5] * ScatterMapKt.MurmurHashC1;
                    int i10 = (i9 ^ (i9 << 16)) >>> 7;
                    int findFirstAvailableSlot = findFirstAvailableSlot(i10);
                    int i11 = i10 & i4;
                    if (((findFirstAvailableSlot - i11) & i4) / 8 == ((i5 - i11) & i4) / 8) {
                        jArr[i7] = ((i & 127) << i8) | (jArr[i7] & (~(255 << i8)));
                        jArr[ic1.J(jArr)] = (jArr[c] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i12 = findFirstAvailableSlot >> 3;
                        long j2 = jArr[i12];
                        int i13 = (findFirstAvailableSlot & 7) << 3;
                        if (((j2 >> i13) & 255) == 128) {
                            iArr = iArr2;
                            jArr[i12] = ((i & 127) << i13) | (j2 & (~(255 << i13)));
                            jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                            iArr[findFirstAvailableSlot] = iArr[i5];
                            iArr[i5] = 0;
                            jArr2[findFirstAvailableSlot] = jArr2[i5];
                            jArr2[i5] = 0;
                            i6 = i5;
                            i2 = i4;
                        } else {
                            iArr = iArr2;
                            jArr[i12] = ((i & 127) << i13) | (j2 & (~(255 << i13)));
                            if (i6 == -1) {
                                i2 = i4;
                                i6 = ScatterMapKt.findEmptySlot(jArr, i5 + 1, i2);
                            } else {
                                i2 = i4;
                            }
                            iArr[i6] = iArr[findFirstAvailableSlot];
                            iArr[findFirstAvailableSlot] = iArr[i5];
                            iArr[i5] = iArr[i6];
                            jArr2[i6] = jArr2[findFirstAvailableSlot];
                            jArr2[findFirstAvailableSlot] = jArr2[i5];
                            jArr2[i5] = jArr2[i6];
                            i5--;
                        }
                        jArr[ic1.J(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i3 = 1;
                        i5++;
                        i4 = i2;
                        iArr2 = iArr;
                        c = 0;
                    }
                }
                i5 += i3;
            }
        }
        initializeGrowth();
    }

    private final int findInsertIndex(int i) {
        int i2;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2dbfd2f", new Object[]{this, new Integer(i)})).intValue();
        }
        int i4 = ScatterMapKt.MurmurHashC1 * i;
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
                if (this.keys[numberOfTrailingZeros] == i) {
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

    public static /* synthetic */ Object ipc$super(MutableIntLongMap mutableIntLongMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableIntLongMap");
    }

    private final void resizeStorage(int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85581495", new Object[]{this, new Integer(i)});
            return;
        }
        long[] jArr = this.metadata;
        int[] iArr = this.keys;
        long[] jArr2 = this.values;
        int i4 = this._capacity;
        initializeStorage(i);
        long[] jArr3 = this.metadata;
        int[] iArr2 = this.keys;
        long[] jArr4 = this.values;
        int i5 = this._capacity;
        while (i3 < i4) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i6 = iArr[i3];
                int i7 = ScatterMapKt.MurmurHashC1 * i6;
                int i8 = i7 ^ (i7 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i8 >>> 7);
                i2 = i3;
                long j = i8 & 127;
                int i9 = findFirstAvailableSlot >> 3;
                int i10 = (findFirstAvailableSlot & 7) << 3;
                long j2 = (j << i10) | (jArr3[i9] & (~(255 << i10)));
                jArr3[i9] = j2;
                jArr3[(((findFirstAvailableSlot - 7) & i5) + (i5 & 7)) >> 3] = j2;
                iArr2[findFirstAvailableSlot] = i6;
                jArr4[findFirstAvailableSlot] = jArr2[i2];
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
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
        initializeGrowth();
    }

    public final long getOrPut(int i, d1a<Long> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76503601", new Object[]{this, new Integer(i), d1aVar})).longValue();
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        int findKeyIndex = findKeyIndex(i);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        long longValue = d1aVar.invoke().longValue();
        put(i, longValue);
        return longValue;
    }

    public final void minusAssign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3230d53d", new Object[]{this, new Integer(i)});
        } else {
            remove(i);
        }
    }

    public final void plusAssign(IntLongMap intLongMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d160383", new Object[]{this, intLongMap});
            return;
        }
        ckf.g(intLongMap, "from");
        putAll(intLongMap);
    }

    public final void put(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a101ceb7", new Object[]{this, new Integer(i), new Long(j)});
        } else {
            set(i, j);
        }
    }

    public final void remove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
            return;
        }
        int findKeyIndex = findKeyIndex(i);
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
    }

    public final void set(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbc4dca", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        int findInsertIndex = findInsertIndex(i);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = i;
        this.values[findInsertIndex] = j;
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

    public /* synthetic */ MutableIntLongMap(int i, int i2, a07 a07Var) {
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
        this.keys = new int[i2];
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

    public final void minusAssign(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f27414", new Object[]{this, iArr});
            return;
        }
        ckf.g(iArr, "keys");
        for (int i : iArr) {
            remove(i);
        }
    }

    public final long put(int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f387ee1", new Object[]{this, new Integer(i), new Long(j), new Long(j2)})).longValue();
        }
        int findInsertIndex = findInsertIndex(i);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        } else {
            j2 = this.values[findInsertIndex];
        }
        this.keys[findInsertIndex] = i;
        this.values[findInsertIndex] = j;
        return j2;
    }

    public MutableIntLongMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final boolean remove(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89bc6870", new Object[]{this, new Integer(i), new Long(j)})).booleanValue();
        }
        int findKeyIndex = findKeyIndex(i);
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

    public final void minusAssign(IntSet intSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a19a0f7", new Object[]{this, intSet});
            return;
        }
        ckf.g(intSet, "keys");
        int[] iArr = intSet.elements;
        long[] jArr = intSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            remove(iArr[(i << 3) + i3]);
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

    public final void putAll(IntLongMap intLongMap) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ee3ec", new Object[]{this, intLongMap});
            return;
        }
        ckf.g(intLongMap, "from");
        int[] iArr = intLongMap.keys;
        long[] jArr = intLongMap.values;
        long[] jArr2 = intLongMap.metadata;
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
                            set(iArr[i5], jArr[i5]);
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

    public final void removeIf(u1a<? super Integer, ? super Long, Boolean> u1aVar) {
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
                            if (u1aVar.invoke(Integer.valueOf(this.keys[i4]), Long.valueOf(this.values[i4])).booleanValue()) {
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

    public final void minusAssign(IntList intList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dae51b9", new Object[]{this, intList});
            return;
        }
        ckf.g(intList, "keys");
        int[] iArr = intList.content;
        int i = intList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }
}
