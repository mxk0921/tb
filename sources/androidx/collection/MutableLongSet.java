package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.en9;
import tb.hc1;
import tb.ic1;
import tb.pg1;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0086\u0002¢\u0006\u0004\b\u001f\u0010%J\u0015\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b#\u0010&J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010'J\u0015\u0010(\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u001eJ\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b)\u0010 J\u0015\u0010*\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b*\u0010$J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0086\u0002¢\u0006\u0004\b)\u0010%J\u0015\u0010*\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b)\u0010'J\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u000bJ\u000f\u0010,\u001a\u00020\u0002H\u0007¢\u0006\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Landroidx/collection/MutableLongSet;", "Landroidx/collection/LongSet;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "index", "removeElementAt", "", "element", "findAbsoluteInsertIndex", "(J)I", "hash1", "findFirstAvailableSlot", "(I)I", "adjustStorage", "dropDeletes", "newCapacity", "resizeStorage", "value", "writeMetadata", "(IJ)V", "", "add", "(J)Z", "plusAssign", "(J)V", "", tep.KEY_UNIFORM_RESULT, "addAll", "([J)Z", "([J)V", "(Landroidx/collection/LongSet;)Z", "(Landroidx/collection/LongSet;)V", "remove", "minusAssign", "removeAll", pg1.ATOM_EXT_clear, "trim", "()I", "growthLimit", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableLongSet extends LongSet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    public MutableLongSet() {
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
        long[] jArr3 = this.elements;
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
                        jArr2[i7] = ((i & 127) << i8) | ((~(255 << i8)) & jArr2[i7]);
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
                if (this.elements[numberOfTrailingZeros] == j) {
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

    public static /* synthetic */ Object ipc$super(MutableLongSet mutableLongSet, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableLongSet");
    }

    private final void removeElementAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cc8e11", new Object[]{this, new Integer(i)});
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

    private final void resizeStorage(int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85581495", new Object[]{this, new Integer(i)});
            return;
        }
        long[] jArr = this.metadata;
        long[] jArr2 = this.elements;
        int i4 = this._capacity;
        initializeStorage(i);
        long[] jArr3 = this.metadata;
        long[] jArr4 = this.elements;
        int i5 = this._capacity;
        while (i3 < i4) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr2[i3];
                int a2 = en9.a(j) * ScatterMapKt.MurmurHashC1;
                int i6 = a2 ^ (a2 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                i2 = i3;
                long j2 = i6 & 127;
                int i7 = findFirstAvailableSlot >> 3;
                int i8 = (findFirstAvailableSlot & 7) << 3;
                long j3 = (j2 << i8) | (jArr3[i7] & (~(255 << i8)));
                jArr3[i7] = j3;
                jArr3[(((findFirstAvailableSlot - 7) & i5) + (i5 & 7)) >> 3] = j3;
                jArr4[findFirstAvailableSlot] = j;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    public final boolean add(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3814720", new Object[]{this, new Long(j)})).booleanValue();
        }
        int i = this._size;
        this.elements[findAbsoluteInsertIndex(j)] = j;
        if (this._size != i) {
            return true;
        }
        return false;
    }

    public final boolean addAll(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ab2dada", new Object[]{this, jArr})).booleanValue();
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        plusAssign(jArr);
        return i != this._size;
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x008c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(long r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = androidx.collection.MutableLongSet.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x001e
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            r1[r3] = r6
            java.lang.String r2 = "3230d8fe"
            r5.ipc$dispatch(r2, r1)
            return
        L_0x001e:
            int r5 = tb.en9.a(r19)
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r5 = r5 ^ r6
            r6 = r5 & 127(0x7f, float:1.78E-43)
            int r7 = r0._capacity
            int r5 = r5 >>> 7
        L_0x0030:
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
        L_0x005d:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x007a
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r5
            r14 = r14 & r7
            long[] r15 = r0.elements
            r16 = r15[r14]
            int r15 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r15 != 0) goto L_0x0074
            goto L_0x0086
        L_0x0074:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x005d
        L_0x007a:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x008c
            r14 = -1
        L_0x0086:
            if (r14 < 0) goto L_0x008b
            r0.removeElementAt(r14)
        L_0x008b:
            return
        L_0x008c:
            int r4 = r4 + 8
            int r5 = r5 + r4
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.minusAssign(long):void");
    }

    public final void plusAssign(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d859b594", new Object[]{this, new Long(j)});
        } else {
            this.elements[findAbsoluteInsertIndex(j)] = j;
        }
    }

    public final boolean removeAll(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c78a57", new Object[]{this, jArr})).booleanValue();
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        minusAssign(jArr);
        return i != this._size;
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

    public /* synthetic */ MutableLongSet(int i, int i2, a07 a07Var) {
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
        this.elements = new long[i2];
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

    public MutableLongSet(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final void plusAssign(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e52dff", new Object[]{this, jArr});
            return;
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        for (long j : jArr) {
            plusAssign(j);
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

    public final boolean addAll(LongSet longSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f56b2463", new Object[]{this, longSet})).booleanValue();
        }
        ckf.g(longSet, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        plusAssign(longSet);
        return i != this._size;
    }

    public final boolean removeAll(LongSet longSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcf1aec6", new Object[]{this, longSet})).booleanValue();
        }
        ckf.g(longSet, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        minusAssign(longSet);
        return i != this._size;
    }

    public final void plusAssign(LongSet longSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d71f96", new Object[]{this, longSet});
            return;
        }
        ckf.g(longSet, tep.KEY_UNIFORM_RESULT);
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
                            plusAssign(jArr[(i << 3) + i3]);
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
        r15 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(long r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = androidx.collection.MutableLongSet.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0026
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            r1[r3] = r6
            java.lang.String r2 = "ebab3d1d"
            java.lang.Object r1 = r5.ipc$dispatch(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0026:
            int r5 = tb.en9.a(r21)
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r5 = r5 ^ r6
            r6 = r5 & 127(0x7f, float:1.78E-43)
            int r7 = r0._capacity
            int r5 = r5 >>> 7
            r5 = r5 & r7
            r8 = 0
        L_0x003a:
            long[] r9 = r0.metadata
            int r10 = r5 >> 3
            r11 = r5 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            int r10 = r10 + r3
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
        L_0x0066:
            r15 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0084
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> 3
            int r15 = r15 + r5
            r15 = r15 & r7
            long[] r3 = r0.elements
            r18 = r3[r15]
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x007d
            goto L_0x008e
        L_0x007d:
            r15 = 1
            long r15 = r11 - r15
            long r11 = r11 & r15
            r3 = 1
            goto L_0x0066
        L_0x0084:
            long r11 = ~r9
            r3 = 6
            long r11 = r11 << r3
            long r9 = r9 & r11
            long r9 = r9 & r13
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x0099
            r15 = -1
        L_0x008e:
            if (r15 < 0) goto L_0x0092
            r3 = 1
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 == 0) goto L_0x0098
            r0.removeElementAt(r15)
        L_0x0098:
            return r3
        L_0x0099:
            int r8 = r8 + 8
            int r5 = r5 + r8
            r5 = r5 & r7
            r3 = 1
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.remove(long):boolean");
    }

    public final void minusAssign(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f277d5", new Object[]{this, jArr});
            return;
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        for (long j : jArr) {
            minusAssign(j);
        }
    }

    public final void minusAssign(LongSet longSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed806000", new Object[]{this, longSet});
            return;
        }
        ckf.g(longSet, tep.KEY_UNIFORM_RESULT);
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
                            minusAssign(jArr[(i << 3) + i3]);
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
