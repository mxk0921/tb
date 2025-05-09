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
import tb.en9;
import tb.hc1;
import tb.ic1;
import tb.pg1;
import tb.u1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010!J%\u0010\"\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010$J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b(\u0010'J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\u00020+2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001c¢\u0006\u0004\b)\u0010,J-\u0010/\u001a\u00020\u00062\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020+0-H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0086\n¢\u0006\u0004\b1\u0010*J\u0018\u00101\u001a\u00020\u00062\u0006\u00103\u001a\u000202H\u0086\n¢\u0006\u0004\b1\u00104J\u0018\u00101\u001a\u00020\u00062\u0006\u00103\u001a\u000205H\u0086\n¢\u0006\u0004\b1\u00106J\u0018\u00101\u001a\u00020\u00062\u0006\u00103\u001a\u000207H\u0086\n¢\u0006\u0004\b1\u00108J\u0017\u00109\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0001¢\u0006\u0004\b9\u0010\u0005J\r\u0010:\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u000bJ\r\u0010;\u001a\u00020\u0002¢\u0006\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006?"}, d2 = {"Landroidx/collection/MutableLongFloatMap;", "Landroidx/collection/LongFloatMap;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "", "key", "findInsertIndex", "(J)I", "hash1", "findFirstAvailableSlot", "(I)I", "adjustStorage", "dropDeletes", "newCapacity", "resizeStorage", "index", "value", "writeMetadata", "(IJ)V", "Lkotlin/Function0;", "", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrPut", "(JLtb/d1a;)F", "set", "(JF)V", "put", "default", "(JFF)F", "from", "putAll", "(Landroidx/collection/LongFloatMap;)V", "plusAssign", "remove", "(J)V", "", "(JF)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Ltb/u1a;)V", "minusAssign", "", "keys", "([J)V", "Landroidx/collection/LongSet;", "(Landroidx/collection/LongSet;)V", "Landroidx/collection/LongList;", "(Landroidx/collection/LongList;)V", "removeValueAt", pg1.ATOM_EXT_clear, "trim", "()I", "growthLimit", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableLongFloatMap extends LongFloatMap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    public MutableLongFloatMap() {
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
        long[] jArr;
        int i2;
        char c = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98867e40", new Object[]{this});
            return;
        }
        long[] jArr2 = this.metadata;
        int i4 = this._capacity;
        long[] jArr3 = this.keys;
        float[] fArr = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr2, i4);
        int i5 = 0;
        int i6 = -1;
        while (i5 != i4) {
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr2[i7] >> i8) & 255;
            if (j == 128) {
                i6 = i5;
                i5++;
            } else {
                if (j == 254) {
                    int a2 = en9.a(jArr3[i5]) * ScatterMapKt.MurmurHashC1;
                    int i9 = (a2 ^ (a2 << 16)) >>> 7;
                    int findFirstAvailableSlot = findFirstAvailableSlot(i9);
                    int i10 = i9 & i4;
                    if (((findFirstAvailableSlot - i10) & i4) / 8 == ((i5 - i10) & i4) / 8) {
                        jArr2[i7] = ((i & 127) << i8) | (jArr2[i7] & (~(255 << i8)));
                        jArr2[ic1.J(jArr2)] = (jArr2[c] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i11 = findFirstAvailableSlot >> 3;
                        long j2 = jArr2[i11];
                        int i12 = (findFirstAvailableSlot & 7) << 3;
                        if (((j2 >> i12) & 255) == 128) {
                            jArr = jArr3;
                            jArr2[i11] = ((i & 127) << i12) | (j2 & (~(255 << i12)));
                            jArr2[i7] = (jArr2[i7] & (~(255 << i8))) | (128 << i8);
                            jArr[findFirstAvailableSlot] = jArr[i5];
                            jArr[i5] = 0;
                            fArr[findFirstAvailableSlot] = fArr[i5];
                            fArr[i5] = 0.0f;
                            i6 = i5;
                            i2 = i4;
                        } else {
                            jArr = jArr3;
                            jArr2[i11] = ((i & 127) << i12) | (j2 & (~(255 << i12)));
                            if (i6 == -1) {
                                i2 = i4;
                                i6 = ScatterMapKt.findEmptySlot(jArr2, i5 + 1, i2);
                            } else {
                                i2 = i4;
                            }
                            jArr[i6] = jArr[findFirstAvailableSlot];
                            jArr[findFirstAvailableSlot] = jArr[i5];
                            jArr[i5] = jArr[i6];
                            fArr[i6] = fArr[findFirstAvailableSlot];
                            fArr[findFirstAvailableSlot] = fArr[i5];
                            fArr[i5] = fArr[i6];
                            i5--;
                        }
                        jArr2[ic1.J(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i3 = 1;
                        i5++;
                        i4 = i2;
                        jArr3 = jArr;
                        c = 0;
                    }
                }
                i5 += i3;
            }
        }
        initializeGrowth();
    }

    private final int findInsertIndex(long j) {
        int i;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2dc00f0", new Object[]{this, new Long(j)})).intValue();
        }
        int a2 = en9.a(j) * ScatterMapKt.MurmurHashC1;
        int i3 = a2 ^ (a2 << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this._capacity;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j2 = (((-i10) >> 63) & (jArr[i9 + i2] << (64 - i10))) | (jArr[i9] >>> i10);
            long j3 = i5;
            long j4 = j2 ^ (j3 * ScatterMapKt.BitmaskLsb);
            for (long j5 = (j4 - ScatterMapKt.BitmaskLsb) & (~j4) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j5) >> 3)) & i6;
                if (this.keys[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i4);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i4);
                }
                this._size++;
                int i11 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i12 = findFirstAvailableSlot >> 3;
                long j6 = jArr2[i12];
                int i13 = (findFirstAvailableSlot & 7) << 3;
                if (((j6 >> i13) & 255) == 128) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.growthLimit = i11 - i;
                int i14 = this._capacity;
                long j7 = ((~(255 << i13)) & j6) | (j3 << i13);
                jArr2[i12] = j7;
                jArr2[(((findFirstAvailableSlot - 7) & i14) + (i14 & 7)) >> 3] = j7;
                return ~findFirstAvailableSlot;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = 1;
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

    public static /* synthetic */ Object ipc$super(MutableLongFloatMap mutableLongFloatMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableLongFloatMap");
    }

    private final void resizeStorage(int i) {
        long[] jArr;
        long[] jArr2;
        int i2 = 1;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85581495", new Object[]{this, new Integer(i)});
            return;
        }
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.keys;
        float[] fArr = this.values;
        int i4 = this._capacity;
        initializeStorage(i);
        long[] jArr5 = this.metadata;
        long[] jArr6 = this.keys;
        float[] fArr2 = this.values;
        int i5 = this._capacity;
        while (i3 < i4) {
            if (((jArr3[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr4[i3];
                int a2 = en9.a(j) * ScatterMapKt.MurmurHashC1;
                int i6 = a2 ^ (a2 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                long j2 = i6 & 127;
                int i7 = findFirstAvailableSlot >> 3;
                int i8 = (findFirstAvailableSlot & 7) << 3;
                jArr2 = jArr3;
                jArr = jArr4;
                long j3 = (jArr5[i7] & (~(255 << i8))) | (j2 << i8);
                jArr5[i7] = j3;
                jArr5[(((findFirstAvailableSlot - 7) & i5) + (i5 & 7)) >> 3] = j3;
                jArr6[findFirstAvailableSlot] = j;
                fArr2[findFirstAvailableSlot] = fArr[i3];
                i2 = 1;
            } else {
                jArr2 = jArr3;
                jArr = jArr4;
            }
            i3 += i2;
            jArr3 = jArr2;
            jArr4 = jArr;
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

    public final float getOrPut(long j, d1a<Float> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd28f5be", new Object[]{this, new Long(j), d1aVar})).floatValue();
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        int findKeyIndex = findKeyIndex(j);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        float floatValue = d1aVar.invoke().floatValue();
        put(j, floatValue);
        return floatValue;
    }

    public final void minusAssign(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3230d8fe", new Object[]{this, new Long(j)});
        } else {
            remove(j);
        }
    }

    public final void plusAssign(LongFloatMap longFloatMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d922f8", new Object[]{this, longFloatMap});
            return;
        }
        ckf.g(longFloatMap, "from");
        putAll(longFloatMap);
    }

    public final void put(long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1023412", new Object[]{this, new Long(j), new Float(f)});
        } else {
            set(j, f);
        }
    }

    public final void remove(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3d19", new Object[]{this, new Long(j)});
            return;
        }
        int findKeyIndex = findKeyIndex(j);
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

    public final void set(long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbcb325", new Object[]{this, new Long(j), new Float(f)});
            return;
        }
        int findInsertIndex = findInsertIndex(j);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = j;
        this.values[findInsertIndex] = f;
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

    public /* synthetic */ MutableLongFloatMap(int i, int i2, a07 a07Var) {
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
        this.keys = new long[i2];
        this.values = new float[i2];
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

    public final void minusAssign(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f277d5", new Object[]{this, jArr});
            return;
        }
        ckf.g(jArr, "keys");
        for (long j : jArr) {
            remove(j);
        }
    }

    public final float put(long j, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f44b5de", new Object[]{this, new Long(j), new Float(f), new Float(f2)})).floatValue();
        }
        int findInsertIndex = findInsertIndex(j);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        } else {
            f2 = this.values[findInsertIndex];
        }
        this.keys[findInsertIndex] = j;
        this.values[findInsertIndex] = f;
        return f2;
    }

    public MutableLongFloatMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final boolean remove(long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89bccdcb", new Object[]{this, new Long(j), new Float(f)})).booleanValue();
        }
        int findKeyIndex = findKeyIndex(j);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != f) {
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

    public final void minusAssign(LongSet longSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed806000", new Object[]{this, longSet});
            return;
        }
        ckf.g(longSet, "keys");
        long[] jArr = longSet.elements;
        long[] jArr2 = longSet.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            remove(jArr[(i << 3) + i3]);
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

    public final void putAll(LongFloatMap longFloatMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbab8d21", new Object[]{this, longFloatMap});
            return;
        }
        ckf.g(longFloatMap, "from");
        long[] jArr = longFloatMap.keys;
        float[] fArr = longFloatMap.values;
        long[] jArr2 = longFloatMap.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            set(jArr[i4], fArr[i4]);
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

    public final void removeIf(u1a<? super Long, ? super Float, Boolean> u1aVar) {
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
                            if (u1aVar.invoke(Long.valueOf(this.keys[i4]), Float.valueOf(this.values[i4])).booleanValue()) {
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

    public final void minusAssign(LongList longList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571f73d0", new Object[]{this, longList});
            return;
        }
        ckf.g(longList, "keys");
        long[] jArr = longList.content;
        int i = longList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(jArr[i2]);
        }
    }
}
