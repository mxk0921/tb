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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J \u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b)\u0010,J-\u0010/\u001a\u00020\u00072\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+0-H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0086\n¢\u0006\u0004\b1\u00102J\u0018\u00101\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0086\n¢\u0006\u0004\b1\u00105J\u0018\u00101\u001a\u00020\u00072\u0006\u00104\u001a\u000206H\u0086\n¢\u0006\u0004\b1\u00107J\u0018\u00101\u001a\u00020\u00072\u0006\u00104\u001a\u000208H\u0086\n¢\u0006\u0004\b1\u00109J\u0019\u0010:\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u0003H\u0001¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0007¢\u0006\u0004\b<\u0010\fJ\r\u0010=\u001a\u00020\u0003¢\u0006\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {"Landroidx/collection/MutableFloatObjectMap;", "V", "Landroidx/collection/FloatObjectMap;", "", "initialCapacity", "<init>", "(I)V", "Ltb/xhv;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "", "key", "findAbsoluteInsertIndex", "(F)I", "hash1", "findFirstAvailableSlot", "(I)I", "adjustStorage", "dropDeletes", "newCapacity", "resizeStorage", "index", "", "value", "writeMetadata", "(IJ)V", "Lkotlin/Function0;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrPut", "(FLtb/d1a;)Ljava/lang/Object;", "set", "(FLjava/lang/Object;)V", "put", "(FLjava/lang/Object;)Ljava/lang/Object;", "from", "putAll", "(Landroidx/collection/FloatObjectMap;)V", "plusAssign", "remove", "(F)Ljava/lang/Object;", "", "(FLjava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Ltb/u1a;)V", "minusAssign", "(F)V", "", "keys", "([F)V", "Landroidx/collection/FloatSet;", "(Landroidx/collection/FloatSet;)V", "Landroidx/collection/FloatList;", "(Landroidx/collection/FloatList;)V", "removeValueAt", "(I)Ljava/lang/Object;", pg1.ATOM_EXT_clear, "trim", "()I", "growthLimit", TLogTracker.LEVEL_INFO, "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MutableFloatObjectMap<V> extends FloatObjectMap<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int growthLimit;

    public MutableFloatObjectMap() {
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
        float[] fArr2 = this.keys;
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
                    int floatToIntBits = Float.floatToIntBits(fArr2[i5]) * ScatterMapKt.MurmurHashC1;
                    int i9 = (floatToIntBits ^ (floatToIntBits << 16)) >>> 7;
                    int findFirstAvailableSlot = findFirstAvailableSlot(i9);
                    int i10 = i9 & i4;
                    if (((findFirstAvailableSlot - i10) & i4) / 8 == ((i5 - i10) & i4) / 8) {
                        jArr[i7] = ((i & 127) << i8) | (jArr[i7] & (~(255 << i8)));
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
                            objArr[findFirstAvailableSlot] = objArr[i5];
                            objArr[i5] = null;
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
                            objArr[i6] = objArr[findFirstAvailableSlot];
                            objArr[findFirstAvailableSlot] = objArr[i5];
                            objArr[i5] = objArr[i6];
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
                if (this.keys[numberOfTrailingZeros] == f) {
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

    public static /* synthetic */ Object ipc$super(MutableFloatObjectMap mutableFloatObjectMap, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/MutableFloatObjectMap");
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
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        int i4 = this._capacity;
        initializeStorage(i);
        long[] jArr2 = this.metadata;
        float[] fArr2 = this.keys;
        Object[] objArr2 = this.values;
        int i5 = this._capacity;
        while (i3 < i4) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                float f = fArr[i3];
                int floatToIntBits = Float.floatToIntBits(f) * ScatterMapKt.MurmurHashC1;
                int i6 = floatToIntBits ^ (floatToIntBits << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                i2 = i3;
                long j = i6 & 127;
                int i7 = findFirstAvailableSlot >> 3;
                int i8 = (findFirstAvailableSlot & 7) << 3;
                long j2 = (j << i8) | (jArr2[i7] & (~(255 << i8)));
                jArr2[i7] = j2;
                jArr2[(((findFirstAvailableSlot - 7) & i5) + (i5 & 7)) >> 3] = j2;
                fArr2[findFirstAvailableSlot] = f;
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

    public final V getOrPut(float f, d1a<? extends V> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("81b84da8", new Object[]{this, new Float(f), d1aVar});
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        V v = get(f);
        if (v != null) {
            return v;
        }
        V v2 = (V) d1aVar.invoke();
        set(f, v2);
        return v2;
    }

    public final void minusAssign(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3230c9fa", new Object[]{this, new Float(f)});
        } else {
            remove(f);
        }
    }

    public final void plusAssign(FloatObjectMap<V> floatObjectMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2630333", new Object[]{this, floatObjectMap});
            return;
        }
        ckf.g(floatObjectMap, "from");
        putAll(floatObjectMap);
    }

    public final V put(float f, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("54bf202c", new Object[]{this, new Float(f), v});
        }
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(f);
        Object[] objArr = this.values;
        V v2 = (V) objArr[findAbsoluteInsertIndex];
        this.keys[findAbsoluteInsertIndex] = f;
        objArr[findAbsoluteInsertIndex] = v;
        return v2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L_0x008a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(float r15) {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.MutableFloatObjectMap.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r15)
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r1] = r14
            r15[r0] = r3
            java.lang.String r0 = "2cc535bd"
            java.lang.Object r15 = r2.ipc$dispatch(r0, r15)
            return r15
        L_0x001b:
            int r2 = java.lang.Float.floatToIntBits(r15)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r14._capacity
            int r2 = r2 >>> 7
        L_0x002d:
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
        L_0x005a:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0077
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            float[] r12 = r14.keys
            r12 = r12[r11]
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 != 0) goto L_0x0071
            goto L_0x0081
        L_0x0071:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L_0x005a
        L_0x0077:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x008a
            r11 = -1
        L_0x0081:
            if (r11 < 0) goto L_0x0088
            java.lang.Object r15 = r14.removeValueAt(r11)
            return r15
        L_0x0088:
            r15 = 0
            return r15
        L_0x008a:
            int r1 = r1 + 8
            int r2 = r2 + r1
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float):java.lang.Object");
    }

    public final void set(float f, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d716513", new Object[]{this, new Float(f), v});
            return;
        }
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(f);
        this.keys[findAbsoluteInsertIndex] = f;
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

    public /* synthetic */ MutableFloatObjectMap(int i, int i2, a07 a07Var) {
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
        this.keys = new float[i2];
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

    public final void minusAssign(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f268d1", new Object[]{this, fArr});
            return;
        }
        ckf.g(fArr, "keys");
        for (float f : fArr) {
            remove(f);
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

    public MutableFloatObjectMap(int i) {
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

    public final void minusAssign(FloatSet floatSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8dad24", new Object[]{this, floatSet});
            return;
        }
        ckf.g(floatSet, "keys");
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
                            remove(fArr[(i << 3) + i3]);
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

    public final void putAll(FloatObjectMap<V> floatObjectMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3943871c", new Object[]{this, floatObjectMap});
            return;
        }
        ckf.g(floatObjectMap, "from");
        float[] fArr = floatObjectMap.keys;
        Object[] objArr = floatObjectMap.values;
        long[] jArr = floatObjectMap.metadata;
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
                            set(fArr[i4], objArr[i4]);
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
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L_0x00a4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(float r20, V r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1
            r4 = 0
            r5 = 3
            com.android.alibaba.ip.runtime.IpChange r6 = androidx.collection.MutableFloatObjectMap.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x002a
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r0
            r1[r3] = r7
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "28b9a2b5"
            java.lang.Object r1 = r6.ipc$dispatch(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x002a:
            int r6 = java.lang.Float.floatToIntBits(r20)
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r6 = r6 ^ r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r8 = r0._capacity
            int r6 = r6 >>> 7
            r6 = r6 & r8
            r9 = 0
        L_0x003e:
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
        L_0x0069:
            r17 = 0
            int r14 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r14 == 0) goto L_0x0087
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> r5
            int r14 = r14 + r6
            r14 = r14 & r8
            float[] r5 = r0.keys
            r5 = r5[r14]
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x007f
            goto L_0x0091
        L_0x007f:
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r5 = 3
            goto L_0x0069
        L_0x0087:
            long r10 = ~r3
            r5 = 6
            long r10 = r10 << r5
            long r3 = r3 & r10
            long r3 = r3 & r12
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x00a4
            r14 = -1
        L_0x0091:
            if (r14 < 0) goto L_0x00a2
            java.lang.Object[] r1 = r0.values
            r1 = r1[r14]
            boolean r1 = tb.ckf.b(r1, r2)
            if (r1 == 0) goto L_0x00a2
            r0.removeValueAt(r14)
            r3 = 1
            return r3
        L_0x00a2:
            r4 = 0
            return r4
        L_0x00a4:
            r3 = 1
            r4 = 0
            int r9 = r9 + 8
            int r6 = r6 + r9
            r6 = r6 & r8
            r5 = 3
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float, java.lang.Object):boolean");
    }

    public final void removeIf(u1a<? super Float, ? super V, Boolean> u1aVar) {
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
                            if (u1aVar.invoke(Float.valueOf(this.keys[i4]), this.values[i4]).booleanValue()) {
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

    public final void minusAssign(FloatList floatList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bbcb2c", new Object[]{this, floatList});
            return;
        }
        ckf.g(floatList, "keys");
        float[] fArr = floatList.content;
        int i = floatList._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }
}
