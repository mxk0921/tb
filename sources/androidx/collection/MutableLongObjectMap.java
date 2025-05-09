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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\rH\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b(\u0010)J\u001d\u0010(\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b(\u0010+J-\u0010.\u001a\u00020\u00072\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*0,H\u0086\bø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0086\n¢\u0006\u0004\b0\u00101J\u0018\u00100\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0086\n¢\u0006\u0004\b0\u00104J\u0018\u00100\u001a\u00020\u00072\u0006\u00103\u001a\u000205H\u0086\n¢\u0006\u0004\b0\u00106J\u0018\u00100\u001a\u00020\u00072\u0006\u00103\u001a\u000207H\u0086\n¢\u0006\u0004\b0\u00108J\u0019\u00109\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u0003H\u0001¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0007¢\u0006\u0004\b;\u0010\fJ\r\u0010<\u001a\u00020\u0003¢\u0006\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006@"}, d2 = {"Landroidx/collection/MutableLongObjectMap;", "V", "Landroidx/collection/LongObjectMap;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "", "key", "findAbsoluteInsertIndex", "(J)I", "hash1", "findFirstAvailableSlot", "(I)I", "adjustStorage", "dropDeletes", "newCapacity", "resizeStorage", "index", "value", "writeMetadata", "(IJ)V", "Lkotlin/Function0;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrPut", "(JLtb/d1a;)Ljava/lang/Object;", "set", "(JLjava/lang/Object;)V", "put", "(JLjava/lang/Object;)Ljava/lang/Object;", "from", "putAll", "(Landroidx/collection/LongObjectMap;)V", "plusAssign", "remove", "(J)Ljava/lang/Object;", "", "(JLjava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Ltb/u1a;)V", "minusAssign", "(J)V", "", "keys", "([J)V", "Landroidx/collection/LongSet;", "(Landroidx/collection/LongSet;)V", "Landroidx/collection/LongList;", "(Landroidx/collection/LongList;)V", "removeValueAt", "(I)Ljava/lang/Object;", pg1.ATOM_EXT_clear, "trim", "()I", "growthLimit", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    public MutableLongObjectMap() {
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
        Object[] objArr = this.values;
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
                            objArr[findFirstAvailableSlot] = objArr[i5];
                            objArr[i5] = null;
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
                            objArr[i6] = objArr[findFirstAvailableSlot];
                            objArr[findFirstAvailableSlot] = objArr[i5];
                            objArr[i5] = objArr[i6];
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

    private final int findAbsoluteInsertIndex(long j) {
        int i;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc489b87", new Object[]{this, new Long(j)})).intValue();
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
                return findFirstAvailableSlot;
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

    public static /* synthetic */ Object ipc$super(MutableLongObjectMap mutableLongObjectMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableLongObjectMap");
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
        Object[] objArr = this.values;
        int i4 = this._capacity;
        initializeStorage(i);
        long[] jArr5 = this.metadata;
        long[] jArr6 = this.keys;
        Object[] objArr2 = this.values;
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
                objArr2[findFirstAvailableSlot] = objArr[i3];
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
        hc1.q(this.values, null, 0, this._capacity);
        initializeGrowth();
    }

    public final V getOrPut(long j, d1a<? extends V> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("391ab724", new Object[]{this, new Long(j), d1aVar});
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        V v = get(j);
        if (v != null) {
            return v;
        }
        V v2 = (V) d1aVar.invoke();
        set(j, v2);
        return v2;
    }

    public final void minusAssign(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3230d8fe", new Object[]{this, new Long(j)});
        } else {
            remove(j);
        }
    }

    public final void plusAssign(LongObjectMap<V> longObjectMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f780ac7b", new Object[]{this, longObjectMap});
            return;
        }
        ckf.g(longObjectMap, "from");
        putAll(longObjectMap);
    }

    public final V put(long j, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("da0992a8", new Object[]{this, new Long(j), v});
        }
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(j);
        Object[] objArr = this.values;
        V v2 = (V) objArr[findAbsoluteInsertIndex];
        this.keys[findAbsoluteInsertIndex] = j;
        objArr[findAbsoluteInsertIndex] = v;
        return v2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(long r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = androidx.collection.MutableLongObjectMap.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001f
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            r1[r3] = r6
            java.lang.String r2 = "cb4c8f39"
            java.lang.Object r1 = r5.ipc$dispatch(r2, r1)
            return r1
        L_0x001f:
            int r5 = tb.en9.a(r19)
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r5 = r5 ^ r6
            r6 = r5 & 127(0x7f, float:1.78E-43)
            int r7 = r0._capacity
            int r5 = r5 >>> 7
        L_0x0031:
            r5 = r5 & r7
            long[] r8 = r0.metadata
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            int r9 = r9 + r3
            r13 = r8[r9]
            int r8 = 64 - r10
            long r8 = r13 << r8
            long r13 = (long) r10
            long r13 = -r13
            r10 = 63
            long r13 = r13 >> r10
            long r8 = r8 & r13
            long r8 = r8 | r11
            long r10 = (long) r6
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r8
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L_0x005e:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x007b
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r5
            r14 = r14 & r7
            long[] r15 = r0.keys
            r16 = r15[r14]
            int r15 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r15 != 0) goto L_0x0075
            goto L_0x0087
        L_0x0075:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x005e
        L_0x007b:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0090
            r14 = -1
        L_0x0087:
            if (r14 < 0) goto L_0x008e
            java.lang.Object r1 = r0.removeValueAt(r14)
            return r1
        L_0x008e:
            r1 = 0
            return r1
        L_0x0090:
            int r4 = r4 + 8
            int r5 = r5 + r4
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongObjectMap.remove(long):java.lang.Object");
    }

    public final void set(long j, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd53b17", new Object[]{this, new Long(j), v});
            return;
        }
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(j);
        this.keys[findAbsoluteInsertIndex] = j;
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

    public /* synthetic */ MutableLongObjectMap(int i, int i2, a07 a07Var) {
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

    public MutableLongObjectMap(int i) {
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

    public final void putAll(LongObjectMap<V> longObjectMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ffb8772", new Object[]{this, longObjectMap});
            return;
        }
        ckf.g(longObjectMap, "from");
        long[] jArr = longObjectMap.keys;
        Object[] objArr = longObjectMap.values;
        long[] jArr2 = longObjectMap.metadata;
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
                            set(jArr[i4], objArr[i4]);
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L_0x00a4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
        r15 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(long r21, V r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = r23
            r4 = 1
            r5 = 0
            r6 = 3
            com.android.alibaba.ip.runtime.IpChange r7 = androidx.collection.MutableLongObjectMap.$ipChange
            boolean r8 = r7 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r8 == 0) goto L_0x002a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r0
            r1[r4] = r8
            r2 = 2
            r1[r2] = r3
            java.lang.String r2 = "5b1d78b9"
            java.lang.Object r1 = r7.ipc$dispatch(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x002a:
            int r7 = tb.en9.a(r21)
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r0._capacity
            int r7 = r7 >>> 7
            r7 = r7 & r9
            r10 = 0
        L_0x003e:
            long[] r11 = r0.metadata
            int r12 = r7 >> 3
            r13 = r7 & 7
            int r13 = r13 << r6
            r14 = r11[r12]
            long r14 = r14 >>> r13
            int r12 = r12 + r4
            r16 = r11[r12]
            int r11 = 64 - r13
            long r11 = r16 << r11
            long r4 = (long) r13
            long r4 = -r4
            r13 = 63
            long r4 = r4 >> r13
            long r4 = r4 & r11
            long r4 = r4 | r14
            long r11 = (long) r8
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r4
            long r13 = r11 - r13
            long r11 = ~r11
            long r11 = r11 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
        L_0x0069:
            r18 = 0
            int r15 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r15 == 0) goto L_0x0087
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> r6
            int r15 = r15 + r7
            r15 = r15 & r9
            long[] r6 = r0.keys
            r18 = r6[r15]
            int r6 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x007f
            goto L_0x0091
        L_0x007f:
            r18 = 1
            long r18 = r11 - r18
            long r11 = r11 & r18
            r6 = 3
            goto L_0x0069
        L_0x0087:
            long r11 = ~r4
            r6 = 6
            long r11 = r11 << r6
            long r4 = r4 & r11
            long r4 = r4 & r13
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x00a4
            r15 = -1
        L_0x0091:
            if (r15 < 0) goto L_0x00a2
            java.lang.Object[] r1 = r0.values
            r1 = r1[r15]
            boolean r1 = tb.ckf.b(r1, r3)
            if (r1 == 0) goto L_0x00a2
            r0.removeValueAt(r15)
            r4 = 1
            return r4
        L_0x00a2:
            r5 = 0
            return r5
        L_0x00a4:
            r4 = 1
            r5 = 0
            int r10 = r10 + 8
            int r7 = r7 + r10
            r7 = r7 & r9
            r6 = 3
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongObjectMap.remove(long, java.lang.Object):boolean");
    }

    public final void removeIf(u1a<? super Long, ? super V, Boolean> u1aVar) {
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
                            if (u1aVar.invoke(Long.valueOf(this.keys[i4]), this.values[i4]).booleanValue()) {
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
