package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.hc1;
import tb.ic1;
import tb.pg1;
import tb.sbp;
import tb.szf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001@B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00132\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001a\u0010\u001dJ\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\u001a\u0010\u001fJ\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001a\u0010 J\u001b\u0010\u001a\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0004\b\u001a\u0010\"J \u0010\u0016\u001a\u00020\u00072\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b\u0016\u0010#J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\u0002¢\u0006\u0004\b\u0016\u0010$J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\u0002¢\u0006\u0004\b\u0016\u0010%J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\u0016\u0010&J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0086\u0002¢\u0006\u0004\b\u0016\u0010'J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b(\u0010\u0015J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b)\u0010\u0017J\u001d\u0010*\u001a\u00020\u00132\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018¢\u0006\u0004\b*\u0010\u001bJ\u001b\u0010*\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b*\u0010\u001fJ\u001b\u0010*\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b*\u0010\u001dJ\u001b\u0010*\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b*\u0010 J\u001b\u0010*\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0004\b*\u0010\"J \u0010)\u001a\u00020\u00072\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0018H\u0086\u0002¢\u0006\u0004\b)\u0010#J\u001e\u0010)\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\u0002¢\u0006\u0004\b)\u0010%J\u001e\u0010)\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\u0002¢\u0006\u0004\b)\u0010$J\u001e\u0010)\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b)\u0010&J\u001e\u0010)\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0086\u0002¢\u0006\u0004\b)\u0010'J'\u0010-\u001a\u00020\u00072\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130+H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0003H\u0001¢\u0006\u0004\b0\u0010\u0006J\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u0010\fJ\u000f\u00102\u001a\u00020\u0003H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u00020\u0007H\u0000¢\u0006\u0004\b4\u0010\fJ\u000f\u00107\u001a\u00020\u0007H\u0000¢\u0006\u0004\b6\u0010\fJ\u0017\u0010:\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0003H\u0000¢\u0006\u0004\b9\u0010\u0006J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;¢\u0006\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {"Landroidx/collection/MutableScatterSet;", "E", "Landroidx/collection/ScatterSet;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "element", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "(I)I", "", "add", "(Ljava/lang/Object;)Z", "plusAssign", "(Ljava/lang/Object;)V", "", tep.KEY_UNIFORM_RESULT, "addAll", "([Ljava/lang/Object;)Z", "", "(Ljava/lang/Iterable;)Z", "Ltb/sbp;", "(Ltb/sbp;)Z", "(Landroidx/collection/ScatterSet;)Z", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)Z", "([Ljava/lang/Object;)V", "(Ljava/lang/Iterable;)V", "(Ltb/sbp;)V", "(Landroidx/collection/ScatterSet;)V", "(Landroidx/collection/ObjectList;)V", "remove", "minusAssign", "removeAll", "Lkotlin/Function1;", "predicate", "removeIf", "(Ltb/g1a;)V", "index", "removeElementAt", pg1.ATOM_EXT_clear, "trim", "()I", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "", "asMutableSet", "()Ljava/util/Set;", "growthLimit", TLogTracker.LEVEL_INFO, "MutableSetWrapper", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableScatterSet<E> extends ScatterSet<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    public MutableScatterSet() {
        this(0, 1, null);
    }

    private final int findAbsoluteInsertIndex(E e) {
        int i;
        int i2;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc5004ff", new Object[]{this, e})).intValue();
        }
        if (e != null) {
            i = e.hashCode();
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
                if (ckf.b(this.elements[numberOfTrailingZeros], e)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i6);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
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

    public static /* synthetic */ Object ipc$super(MutableScatterSet mutableScatterSet, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableScatterSet");
    }

    public final boolean add(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
        }
        int size = getSize();
        this.elements[findAbsoluteInsertIndex(e)] = e;
        if (getSize() != size) {
            return true;
        }
        return false;
    }

    public final boolean addAll(E[] eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e367f20e", new Object[]{this, eArr})).booleanValue();
        }
        ckf.g(eArr, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        plusAssign((Object[]) eArr);
        return size != getSize();
    }

    public final void adjustStorage$collection() {
        int compare;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4dfbdd", new Object[]{this});
            return;
        }
        int i = this._capacity;
        if (i > 8) {
            compare = Long.compare((this._size * 32) ^ Long.MIN_VALUE, (i * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                dropDeletes$collection();
                return;
            }
        }
        resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
    }

    public final Set<E> asMutableSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("92793de4", new Object[]{this});
        }
        return new MutableSetWrapper();
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
        hc1.q(this.elements, null, 0, this._capacity);
        initializeGrowth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0087;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(E r15) {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.MutableScatterSet.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "ab108e2"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r14
            r4[r0] = r15
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            if (r15 == 0) goto L_0x001c
            int r2 = r15.hashCode()
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r14._capacity
            int r2 = r2 >>> 7
        L_0x002b:
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
        L_0x0058:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0077
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            java.lang.Object[] r12 = r14.elements
            r12 = r12[r11]
            boolean r12 = tb.ckf.b(r12, r15)
            if (r12 == 0) goto L_0x0071
            goto L_0x0081
        L_0x0071:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L_0x0058
        L_0x0077:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0087
            r11 = -1
        L_0x0081:
            if (r11 < 0) goto L_0x0086
            r14.removeElementAt(r11)
        L_0x0086:
            return
        L_0x0087:
            int r1 = r1 + 8
            int r2 = r2 + r1
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5562b0c", new Object[]{this, e});
        } else {
            this.elements[findAbsoluteInsertIndex(e)] = e;
        }
    }

    public final boolean removeAll(E[] eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ca28c31", new Object[]{this, eArr})).booleanValue();
        }
        ckf.g(eArr, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        minusAssign((Object[]) eArr);
        return size != getSize();
    }

    public final void removeElementAt(int i) {
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
        this.elements[i] = null;
    }

    public final void resizeStorage$collection(int i) {
        long[] jArr;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0759401", new Object[]{this, new Integer(i)});
            return;
        }
        long[] jArr2 = this.metadata;
        Object[] objArr = this.elements;
        int i3 = this._capacity;
        initializeStorage(i);
        long[] jArr3 = this.metadata;
        Object[] objArr2 = this.elements;
        int i4 = this._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                if (obj != null) {
                    i2 = obj.hashCode();
                } else {
                    i2 = 0;
                }
                int i6 = i2 * ScatterMapKt.MurmurHashC1;
                int i7 = i6 ^ (i6 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i7 >>> 7);
                jArr = jArr2;
                long j = i7 & 127;
                int i8 = findFirstAvailableSlot >> 3;
                int i9 = (findFirstAvailableSlot & 7) << 3;
                long j2 = (j << i9) | (jArr3[i8] & (~(255 << i9)));
                jArr3[i8] = j2;
                jArr3[(((findFirstAvailableSlot - 7) & i4) + (i4 & 7)) >> 3] = j2;
                objArr2[findFirstAvailableSlot] = obj;
            } else {
                jArr = jArr2;
            }
            i5++;
            jArr2 = jArr;
        }
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
        resizeStorage$collection(normalizeCapacity);
        return i - this._capacity;
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u001d\u0010\u0016\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Landroidx/collection/MutableScatterSet$MutableSetWrapper;", "Landroidx/collection/ScatterSet$SetWrapper;", "Landroidx/collection/ScatterSet;", "", "<init>", "(Landroidx/collection/MutableScatterSet;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", tep.KEY_UNIFORM_RESULT, "addAll", "(Ljava/util/Collection;)Z", "Ltb/xhv;", pg1.ATOM_EXT_clear, "()V", "", pg1.ATOM_EXT_iterator, "()Ljava/util/Iterator;", "remove", "retainAll", "removeAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class MutableSetWrapper extends ScatterSet<E>.SetWrapper implements Set<E>, szf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public MutableSetWrapper() {
            super();
        }

        public static /* synthetic */ Object ipc$super(MutableSetWrapper mutableSetWrapper, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableScatterSet$MutableSetWrapper");
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean add(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
            }
            return MutableScatterSet.this.add(e);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
            }
            ckf.g(collection, tep.KEY_UNIFORM_RESULT);
            return MutableScatterSet.this.addAll(collection);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            } else {
                MutableScatterSet.this.clear();
            }
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
            }
            return new MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet.this);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            return MutableScatterSet.this.remove(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
            }
            ckf.g(collection, tep.KEY_UNIFORM_RESULT);
            int size = MutableScatterSet.this.getSize();
            for (Object obj : collection) {
                MutableScatterSet.this.minusAssign((MutableScatterSet<E>) obj);
            }
            return size != MutableScatterSet.this.getSize();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
            }
            ckf.g(collection, tep.KEY_UNIFORM_RESULT);
            MutableScatterSet<E> mutableScatterSet = MutableScatterSet.this;
            long[] jArr = mutableScatterSet.metadata;
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
                                if (!collection.contains(mutableScatterSet.elements[i4])) {
                                    mutableScatterSet.removeElementAt(i4);
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
            }
            return z;
        }
    }

    public MutableScatterSet(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
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
        this.elements = new Object[i2];
    }

    public final void plusAssign(E[] eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d233601", new Object[]{this, eArr});
            return;
        }
        ckf.g(eArr, tep.KEY_UNIFORM_RESULT);
        for (E e : eArr) {
            plusAssign((MutableScatterSet<E>) e);
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

    public final boolean addAll(Iterable<? extends E> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5faf154", new Object[]{this, iterable})).booleanValue();
        }
        ckf.g(iterable, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        plusAssign((Iterable) iterable);
        return size != getSize();
    }

    public final boolean removeAll(sbp<? extends E> sbpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d865fb5", new Object[]{this, sbpVar})).booleanValue();
        }
        ckf.g(sbpVar, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        minusAssign((sbp) sbpVar);
        return size != getSize();
    }

    public final void dropDeletes$collection() {
        int i;
        char c = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01b8df0", new Object[]{this});
            return;
        }
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        Object[] objArr = this.elements;
        ScatterMapKt.convertMetadataForCleanup(jArr, i3);
        int i4 = 0;
        int i5 = -1;
        while (i4 != i3) {
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = (jArr[i6] >> i7) & 255;
            if (j == 128) {
                i4++;
                i5 = i4;
            } else {
                if (j == 254) {
                    Object obj = objArr[i4];
                    int hashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                    int i8 = (hashCode ^ (hashCode << 16)) >>> 7;
                    int findFirstAvailableSlot = findFirstAvailableSlot(i8);
                    int i9 = i8 & i3;
                    if (((findFirstAvailableSlot - i9) & i3) / 8 == ((i4 - i9) & i3) / 8) {
                        jArr[i6] = ((i & 127) << i7) | ((~(255 << i7)) & jArr[i6]);
                        jArr[ic1.J(jArr)] = (jArr[c] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i10 = findFirstAvailableSlot >> 3;
                        long j2 = jArr[i10];
                        int i11 = (findFirstAvailableSlot & 7) << 3;
                        if (((j2 >> i11) & 255) == 128) {
                            objArr = objArr;
                            jArr[i10] = ((i & 127) << i11) | (j2 & (~(255 << i11)));
                            jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                            objArr[findFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = null;
                            i5 = i4;
                            i3 = i3;
                        } else {
                            objArr = objArr;
                            jArr[i10] = ((i & 127) << i11) | (j2 & (~(255 << i11)));
                            if (i5 == -1) {
                                i3 = i3;
                                i5 = ScatterMapKt.findEmptySlot(jArr, i4 + 1, i3);
                            } else {
                                i3 = i3;
                            }
                            objArr[i5] = objArr[findFirstAvailableSlot];
                            objArr[findFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = objArr[i5];
                            i4--;
                        }
                        jArr[ic1.J(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i2 = 1;
                        i4++;
                        c = 0;
                    }
                }
                i4 += i2;
            }
        }
        initializeGrowth();
    }

    public final void plusAssign(Iterable<? extends E> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a82c39", new Object[]{this, iterable});
            return;
        }
        ckf.g(iterable, tep.KEY_UNIFORM_RESULT);
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public /* synthetic */ MutableScatterSet(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final boolean addAll(sbp<? extends E> sbpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e2a9892", new Object[]{this, sbpVar})).booleanValue();
        }
        ckf.g(sbpVar, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        plusAssign((sbp) sbpVar);
        return size != getSize();
    }

    public final void plusAssign(sbp<? extends E> sbpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f9f585", new Object[]{this, sbpVar});
            return;
        }
        ckf.g(sbpVar, tep.KEY_UNIFORM_RESULT);
        Iterator<? extends E> it = sbpVar.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.collection.MutableScatterSet.$ipChange
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
            if (r1 == 0) goto L_0x0028
            int r4 = r18.hashCode()
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L_0x0039:
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
        L_0x0065:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0084
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r4
            r14 = r14 & r6
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r14]
            boolean r15 = tb.ckf.b(r15, r1)
            if (r15 == 0) goto L_0x007e
            goto L_0x0090
        L_0x007e:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x0065
        L_0x0084:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x009a
            r14 = -1
        L_0x0090:
            if (r14 < 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            if (r2 == 0) goto L_0x0099
            r0.removeElementAt(r14)
        L_0x0099:
            return r2
        L_0x009a:
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(Iterable<? extends E> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44139b91", new Object[]{this, iterable})).booleanValue();
        }
        ckf.g(iterable, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        minusAssign((Iterable) iterable);
        return size != getSize();
    }

    public final void minusAssign(E[] eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32412eb", new Object[]{this, eArr});
            return;
        }
        ckf.g(eArr, tep.KEY_UNIFORM_RESULT);
        for (E e : eArr) {
            minusAssign((MutableScatterSet<E>) e);
        }
    }

    public final void removeIf(g1a<? super E, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88cda8e", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "predicate");
        Object[] objArr = this.elements;
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
                            if (g1aVar.invoke(objArr[i4]).booleanValue()) {
                                removeElementAt(i4);
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

    public final void plusAssign(ScatterSet<E> scatterSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d9f830", new Object[]{this, scatterSet});
            return;
        }
        ckf.g(scatterSet, tep.KEY_UNIFORM_RESULT);
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
                            plusAssign((MutableScatterSet<E>) objArr[(i << 3) + i3]);
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

    public final boolean addAll(ScatterSet<E> scatterSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff2d2cb", new Object[]{this, scatterSet})).booleanValue();
        }
        ckf.g(scatterSet, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        plusAssign((ScatterSet) scatterSet);
        return size != getSize();
    }

    public final void minusAssign(sbp<? extends E> sbpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afec486f", new Object[]{this, sbpVar});
            return;
        }
        ckf.g(sbpVar, tep.KEY_UNIFORM_RESULT);
        Iterator<? extends E> it = sbpVar.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean removeAll(ScatterSet<E> scatterSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81950988", new Object[]{this, scatterSet})).booleanValue();
        }
        ckf.g(scatterSet, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        minusAssign((ScatterSet) scatterSet);
        return size != getSize();
    }

    public final void minusAssign(Iterable<? extends E> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc2ec8f", new Object[]{this, iterable});
            return;
        }
        ckf.g(iterable, tep.KEY_UNIFORM_RESULT);
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(ObjectList<E> objectList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33bb1872", new Object[]{this, objectList})).booleanValue();
        }
        ckf.g(objectList, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        plusAssign((ObjectList) objectList);
        return size != getSize();
    }

    public final boolean removeAll(ObjectList<E> objectList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("355d4f2f", new Object[]{this, objectList})).booleanValue();
        }
        ckf.g(objectList, tep.KEY_UNIFORM_RESULT);
        int size = getSize();
        minusAssign((ObjectList) objectList);
        return size != getSize();
    }

    public final void minusAssign(ScatterSet<E> scatterSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed8e786", new Object[]{this, scatterSet});
            return;
        }
        ckf.g(scatterSet, tep.KEY_UNIFORM_RESULT);
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
                            minusAssign((MutableScatterSet<E>) objArr[(i << 3) + i3]);
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

    public final void plusAssign(ObjectList<E> objectList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa23dd7", new Object[]{this, objectList});
            return;
        }
        ckf.g(objectList, tep.KEY_UNIFORM_RESULT);
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            plusAssign((MutableScatterSet<E>) objArr[i2]);
        }
    }

    public final void minusAssign(ObjectList<E> objectList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a12d2d", new Object[]{this, objectList});
            return;
        }
        ckf.g(objectList, tep.KEY_UNIFORM_RESULT);
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            minusAssign((MutableScatterSet<E>) objArr[i2]);
        }
    }
}
