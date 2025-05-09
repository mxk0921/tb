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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(J\u001d\u0010'\u001a\u00020)2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b'\u0010*J-\u0010-\u001a\u00020\u00072\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)0+H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b/\u0010\u0006J\u0018\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0086\n¢\u0006\u0004\b/\u00102J\u0018\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u000203H\u0086\n¢\u0006\u0004\b/\u00104J\u0018\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u000205H\u0086\n¢\u0006\u0004\b/\u00106J\u0019\u00107\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0016\u001a\u00020\u0003H\u0001¢\u0006\u0004\b7\u0010(J\r\u00108\u001a\u00020\u0007¢\u0006\u0004\b8\u0010\fJ\r\u00109\u001a\u00020\u0003¢\u0006\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006="}, d2 = {"Landroidx/collection/MutableIntObjectMap;", "V", "Landroidx/collection/IntObjectMap;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "key", "findAbsoluteInsertIndex", "(I)I", "hash1", "findFirstAvailableSlot", "adjustStorage", "dropDeletes", "newCapacity", "resizeStorage", "index", "", "value", "writeMetadata", "(IJ)V", "Lkotlin/Function0;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrPut", "(ILtb/d1a;)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)V", "put", "(ILjava/lang/Object;)Ljava/lang/Object;", "from", "putAll", "(Landroidx/collection/IntObjectMap;)V", "plusAssign", "remove", "(I)Ljava/lang/Object;", "", "(ILjava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Ltb/u1a;)V", "minusAssign", "", "keys", "([I)V", "Landroidx/collection/IntSet;", "(Landroidx/collection/IntSet;)V", "Landroidx/collection/IntList;", "(Landroidx/collection/IntList;)V", "removeValueAt", pg1.ATOM_EXT_clear, "trim", "()I", "growthLimit", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableIntObjectMap<V> extends IntObjectMap<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    public MutableIntObjectMap() {
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
        Object[] objArr = this.values;
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
                            objArr[findFirstAvailableSlot] = objArr[i5];
                            objArr[i5] = null;
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
                            objArr[i6] = objArr[findFirstAvailableSlot];
                            objArr[findFirstAvailableSlot] = objArr[i5];
                            objArr[i5] = objArr[i6];
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

    private final int findAbsoluteInsertIndex(int i) {
        int i2;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc4897c6", new Object[]{this, new Integer(i)})).intValue();
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
                return findFirstAvailableSlot;
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

    public static /* synthetic */ Object ipc$super(MutableIntObjectMap mutableIntObjectMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableIntObjectMap");
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
        Object[] objArr = this.values;
        int i4 = this._capacity;
        initializeStorage(i);
        long[] jArr2 = this.metadata;
        int[] iArr2 = this.keys;
        Object[] objArr2 = this.values;
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
                long j2 = (j << i10) | (jArr2[i9] & (~(255 << i10)));
                jArr2[i9] = j2;
                jArr2[(((findFirstAvailableSlot - 7) & i5) + (i5 & 7)) >> 3] = j2;
                iArr2[findFirstAvailableSlot] = i6;
                objArr2[findFirstAvailableSlot] = objArr[i2];
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
        hc1.q(this.values, null, 0, this._capacity);
        initializeGrowth();
    }

    public final V getOrPut(int i, d1a<? extends V> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("b421cc5", new Object[]{this, new Integer(i), d1aVar});
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        V v = get(i);
        if (v != null) {
            return v;
        }
        V v2 = (V) d1aVar.invoke();
        set(i, v2);
        return v2;
    }

    public final void minusAssign(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3230d53d", new Object[]{this, new Integer(i)});
        } else {
            remove(i);
        }
    }

    public final void plusAssign(IntObjectMap<V> intObjectMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5a6f46", new Object[]{this, intObjectMap});
            return;
        }
        ckf.g(intObjectMap, "from");
        putAll(intObjectMap);
    }

    public final V put(int i, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("78b6f609", new Object[]{this, new Integer(i), v});
        }
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(i);
        Object[] objArr = this.values;
        V v2 = (V) objArr[findAbsoluteInsertIndex];
        this.keys[findAbsoluteInsertIndex] = i;
        objArr[findAbsoluteInsertIndex] = v;
        return v2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(int r15) {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.MutableIntObjectMap.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r15)
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r1] = r14
            r15[r0] = r3
            java.lang.String r0 = "e3aab8da"
            java.lang.Object r15 = r2.ipc$dispatch(r0, r15)
            return r15
        L_0x001c:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r15
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r14._capacity
            int r2 = r2 >>> 7
        L_0x002a:
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
        L_0x0057:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0072
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r12 = r14.keys
            r12 = r12[r11]
            if (r12 != r15) goto L_0x006c
            goto L_0x007c
        L_0x006c:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L_0x0057
        L_0x0072:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0085
            r11 = -1
        L_0x007c:
            if (r11 < 0) goto L_0x0083
            java.lang.Object r15 = r14.removeValueAt(r11)
            return r15
        L_0x0083:
            r15 = 0
            return r15
        L_0x0085:
            int r1 = r1 + 8
            int r2 = r2 + r1
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntObjectMap.remove(int):java.lang.Object");
    }

    public final void set(int i, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833c4596", new Object[]{this, new Integer(i), v});
            return;
        }
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(i);
        this.keys[findAbsoluteInsertIndex] = i;
        this.values[findAbsoluteInsertIndex] = v;
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

    public /* synthetic */ MutableIntObjectMap(int i, int i2, a07 a07Var) {
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
        Object[] objArr = this.values;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public MutableIntObjectMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L_0x009e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008a, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(int r20, V r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1
            r4 = 0
            r5 = 3
            com.android.alibaba.ip.runtime.IpChange r6 = androidx.collection.MutableIntObjectMap.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x002a
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r0
            r1[r3] = r7
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "4e848338"
            java.lang.Object r1 = r6.ipc$dispatch(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x002a:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r6 = r6 * r1
            int r7 = r6 << 16
            r6 = r6 ^ r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r8 = r0._capacity
            int r6 = r6 >>> 7
            r6 = r6 & r8
            r9 = 0
        L_0x003a:
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
        L_0x0065:
            r17 = 0
            int r14 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r14 == 0) goto L_0x0081
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> r5
            int r14 = r14 + r6
            r14 = r14 & r8
            int[] r5 = r0.keys
            r5 = r5[r14]
            if (r5 != r1) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r5 = 3
            goto L_0x0065
        L_0x0081:
            long r10 = ~r3
            r5 = 6
            long r10 = r10 << r5
            long r3 = r3 & r10
            long r3 = r3 & r12
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x009e
            r14 = -1
        L_0x008b:
            if (r14 < 0) goto L_0x009c
            java.lang.Object[] r1 = r0.values
            r1 = r1[r14]
            boolean r1 = tb.ckf.b(r1, r2)
            if (r1 == 0) goto L_0x009c
            r0.removeValueAt(r14)
            r3 = 1
            return r3
        L_0x009c:
            r4 = 0
            return r4
        L_0x009e:
            r3 = 1
            r4 = 0
            int r9 = r9 + 8
            int r6 = r6 + r9
            r6 = r6 & r8
            r5 = 3
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntObjectMap.remove(int, java.lang.Object):boolean");
    }

    public final void putAll(IntObjectMap<V> intObjectMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502cd96f", new Object[]{this, intObjectMap});
            return;
        }
        ckf.g(intObjectMap, "from");
        int[] iArr = intObjectMap.keys;
        Object[] objArr = intObjectMap.values;
        long[] jArr = intObjectMap.metadata;
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
                            set(iArr[i4], objArr[i4]);
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

    public final void removeIf(u1a<? super Integer, ? super V, Boolean> u1aVar) {
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
                            if (u1aVar.invoke(Integer.valueOf(this.keys[i4]), this.values[i4]).booleanValue()) {
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
