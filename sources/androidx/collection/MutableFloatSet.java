package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.hc1;
import tb.ic1;
import tb.pg1;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J \u0010\u001b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0086\u0002¢\u0006\u0004\b \u0010&J\u0015\u0010$\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0001¢\u0006\u0004\b$\u0010'J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b \u0010(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b*\u0010!J\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010%J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0001¢\u0006\u0004\b+\u0010'J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b*\u0010(J\r\u0010,\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\u000bJ\u000f\u0010-\u001a\u00020\u0002H\u0007¢\u0006\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Landroidx/collection/MutableFloatSet;", "Landroidx/collection/FloatSet;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "index", "removeElementAt", "", "element", "findAbsoluteInsertIndex", "(F)I", "hash1", "findFirstAvailableSlot", "(I)I", "adjustStorage", "dropDeletes", "newCapacity", "resizeStorage", "", "value", "writeMetadata", "(IJ)V", "", "add", "(F)Z", "plusAssign", "(F)V", "", tep.KEY_UNIFORM_RESULT, "addAll", "([F)Z", "([F)V", "(Landroidx/collection/FloatSet;)Z", "(Landroidx/collection/FloatSet;)V", "remove", "minusAssign", "removeAll", pg1.ATOM_EXT_clear, "trim", "()I", "growthLimit", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableFloatSet extends FloatSet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    public MutableFloatSet() {
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
        float[] fArr;
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
        float[] fArr2 = this.elements;
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
                    int floatToIntBits = Float.floatToIntBits(fArr2[i5]) * ScatterMapKt.MurmurHashC1;
                    int i9 = (floatToIntBits ^ (floatToIntBits << 16)) >>> 7;
                    int findFirstAvailableSlot = findFirstAvailableSlot(i9);
                    int i10 = i9 & i4;
                    if (((findFirstAvailableSlot - i10) & i4) / 8 == ((i5 - i10) & i4) / 8) {
                        jArr[i7] = ((i & 127) << i8) | ((~(255 << i8)) & jArr[i7]);
                        jArr[ic1.J(jArr)] = (jArr[c] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i11 = findFirstAvailableSlot >> 3;
                        long j2 = jArr[i11];
                        int i12 = (findFirstAvailableSlot & 7) << 3;
                        if (((j2 >> i12) & 255) == 128) {
                            fArr = fArr2;
                            jArr[i11] = ((i & 127) << i12) | (j2 & (~(255 << i12)));
                            jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                            fArr[findFirstAvailableSlot] = fArr[i5];
                            fArr[i5] = 0.0f;
                            i6 = i5;
                            i2 = i4;
                        } else {
                            fArr = fArr2;
                            jArr[i11] = ((i & 127) << i12) | (j2 & (~(255 << i12)));
                            if (i6 == -1) {
                                i2 = i4;
                                i6 = ScatterMapKt.findEmptySlot(jArr, i5 + 1, i2);
                            } else {
                                i2 = i4;
                            }
                            fArr[i6] = fArr[findFirstAvailableSlot];
                            fArr[findFirstAvailableSlot] = fArr[i5];
                            fArr[i5] = fArr[i6];
                            i5--;
                        }
                        jArr[ic1.J(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i3 = 1;
                        i5++;
                        i4 = i2;
                        fArr2 = fArr;
                        c = 0;
                    }
                }
                i5 += i3;
            }
        }
        initializeGrowth();
    }

    private final int findAbsoluteInsertIndex(float f) {
        int i;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc488c83", new Object[]{this, new Float(f)})).intValue();
        }
        int floatToIntBits = Float.floatToIntBits(f) * ScatterMapKt.MurmurHashC1;
        int i3 = floatToIntBits ^ (floatToIntBits << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this._capacity;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = ((jArr[i9 + i2] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = i5;
            long j3 = j ^ (j2 * ScatterMapKt.BitmaskLsb);
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i7) & i6;
                if (this.elements[numberOfTrailingZeros] == f) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i4);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    findFirstAvailableSlot = findFirstAvailableSlot(i4);
                }
                this._size++;
                int i11 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i12 = findFirstAvailableSlot >> 3;
                long j5 = jArr2[i12];
                int i13 = (findFirstAvailableSlot & 7) << 3;
                if (((j5 >> i13) & 255) == 128) {
                    i = 1;
                } else {
                    i = 0;
                }
                this.growthLimit = i11 - i;
                int i14 = this._capacity;
                long j6 = ((~(255 << i13)) & j5) | (j2 << i13);
                jArr2[i12] = j6;
                jArr2[(((findFirstAvailableSlot - 7) & i14) + (i14 & 7)) >> 3] = j6;
                return findFirstAvailableSlot;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i5;
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

    public static /* synthetic */ Object ipc$super(MutableFloatSet mutableFloatSet, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableFloatSet");
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85581495", new Object[]{this, new Integer(i)});
            return;
        }
        long[] jArr = this.metadata;
        float[] fArr = this.elements;
        int i2 = this._capacity;
        initializeStorage(i);
        long[] jArr2 = this.metadata;
        float[] fArr2 = this.elements;
        int i3 = this._capacity;
        for (int i4 = 0; i4 < i2; i4++) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                float f = fArr[i4];
                int floatToIntBits = Float.floatToIntBits(f) * ScatterMapKt.MurmurHashC1;
                int i5 = floatToIntBits ^ (floatToIntBits << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j = i5 & 127;
                int i6 = findFirstAvailableSlot >> 3;
                int i7 = (findFirstAvailableSlot & 7) << 3;
                long j2 = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                jArr2[i6] = j2;
                jArr2[(((findFirstAvailableSlot - 7) & i3) + (i3 & 7)) >> 3] = j2;
                fArr2[findFirstAvailableSlot] = f;
            }
        }
    }

    public final boolean add(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b381381c", new Object[]{this, new Float(f)})).booleanValue();
        }
        int i = this._size;
        this.elements[findAbsoluteInsertIndex(f)] = f;
        if (this._size != i) {
            return true;
        }
        return false;
    }

    public final boolean addAll(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ab2cbd6", new Object[]{this, fArr})).booleanValue();
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        plusAssign(fArr);
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0086;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(float r15) {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.MutableFloatSet.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r15)
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r1] = r14
            r15[r0] = r3
            java.lang.String r0 = "3230c9fa"
            r2.ipc$dispatch(r0, r15)
            return
        L_0x001a:
            int r2 = java.lang.Float.floatToIntBits(r15)
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
            if (r13 == 0) goto L_0x0076
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            float[] r12 = r14.elements
            r12 = r12[r11]
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x0070
            goto L_0x0080
        L_0x0070:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L_0x0059
        L_0x0076:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0086
            r11 = -1
        L_0x0080:
            if (r11 < 0) goto L_0x0085
            r14.removeElementAt(r11)
        L_0x0085:
            return
        L_0x0086:
            int r1 = r1 + 8
            int r2 = r2 + r1
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatSet.minusAssign(float):void");
    }

    public final void plusAssign(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d859a690", new Object[]{this, new Float(f)});
        } else {
            this.elements[findAbsoluteInsertIndex(f)] = f;
        }
    }

    public final boolean removeAll(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c77b53", new Object[]{this, fArr})).booleanValue();
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        minusAssign(fArr);
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

    public /* synthetic */ MutableFloatSet(int i, int i2, a07 a07Var) {
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
        this.elements = new float[i2];
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

    public MutableFloatSet(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public final void plusAssign(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e51efb", new Object[]{this, fArr});
            return;
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        for (float f : fArr) {
            plusAssign(f);
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

    public final boolean addAll(FloatSet floatSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34fb74a9", new Object[]{this, floatSet})).booleanValue();
        }
        ckf.g(floatSet, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        plusAssign(floatSet);
        return i != this._size;
    }

    public final boolean removeAll(FloatSet floatSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e4636a6", new Object[]{this, floatSet})).booleanValue();
        }
        ckf.g(floatSet, tep.KEY_UNIFORM_RESULT);
        int i = this._size;
        minusAssign(floatSet);
        return i != this._size;
    }

    public final void plusAssign(FloatSet floatSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30ee04e", new Object[]{this, floatSet});
            return;
        }
        ckf.g(floatSet, tep.KEY_UNIFORM_RESULT);
        float[] fArr = floatSet.elements;
        long[] jArr = floatSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            plusAssign(fArr[(i << 3) + i3]);
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0099;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008e, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(float r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.collection.MutableFloatSet.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0026
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            r1[r2] = r5
            java.lang.String r2 = "ebab2e19"
            java.lang.Object r1 = r4.ipc$dispatch(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0026:
            int r4 = java.lang.Float.floatToIntBits(r18)
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L_0x003a:
            long[] r8 = r0.metadata
            int r9 = r4 >> 3
            r10 = r4 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            int r9 = r9 + r2
            r13 = r8[r9]
            int r8 = 64 - r10
            long r8 = r13 << r8
            long r13 = (long) r10
            long r13 = -r13
            r10 = 63
            long r13 = r13 >> r10
            long r8 = r8 & r13
            long r8 = r8 | r11
            long r10 = (long) r5
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r8
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L_0x0066:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0083
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r4
            r14 = r14 & r6
            float[] r15 = r0.elements
            r15 = r15[r14]
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 != 0) goto L_0x007d
            goto L_0x008f
        L_0x007d:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x0066
        L_0x0083:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0099
            r14 = -1
        L_0x008f:
            if (r14 < 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            if (r2 == 0) goto L_0x0098
            r0.removeElementAt(r14)
        L_0x0098:
            return r2
        L_0x0099:
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatSet.remove(float):boolean");
    }

    public final void minusAssign(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f268d1", new Object[]{this, fArr});
            return;
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        for (float f : fArr) {
            minusAssign(f);
        }
    }

    public final void minusAssign(FloatSet floatSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8dad24", new Object[]{this, floatSet});
            return;
        }
        ckf.g(floatSet, tep.KEY_UNIFORM_RESULT);
        float[] fArr = floatSet.elements;
        long[] jArr = floatSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            minusAssign(fArr[(i << 3) + i3]);
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
