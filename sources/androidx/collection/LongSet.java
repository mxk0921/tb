package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.en9;
import tb.g1a;
import tb.pg1;
import tb.tep;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u000b\u001a\u00020\n2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\u0012JA\u0010\u0017\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\rH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0019\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00150\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u0018JA\u0010\u001a\u001a\u00020\u00042!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u0005\u001a\u00020\u00042!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010\u001c\u001a\u00020\u00132!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\rH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001c\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u001f\u0010 JA\u0010(\u001a\u00020'2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020\u00132\b\b\u0002\u0010&\u001a\u00020!H\u0007¢\u0006\u0004\b(\u0010)J[\u0010(\u001a\u00020'2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020\u00132\b\b\u0002\u0010&\u001a\u00020!2\u0014\b\u0004\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010+J\u000f\u0010,\u001a\u00020\u0013H\u0016¢\u0006\u0004\b,\u0010\u001dJ\u001a\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u00101J\u0018\u00104\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\nH\u0080\b¢\u0006\u0004\b2\u00103R\u001c\u00106\u001a\u0002058\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u0010\u0003R\u001c\u00109\u001a\u0002058\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b9\u00107\u0012\u0004\b:\u0010\u0003R\u0016\u0010;\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0011\u0010?\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b>\u0010\u001dR\u0011\u0010A\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b@\u0010\u001d\u0082\u0001\u0001B\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"Landroidx/collection/LongSet;", "", "<init>", "()V", "", pg1.ATOM_EXT_any, "()Z", "none", "isEmpty", "isNotEmpty", "", "first", "()J", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "predicate", "(Ltb/g1a;)J", "", "index", "Ltb/xhv;", pg1.ATOM_EXT_block, "forEachIndex", "(Ltb/g1a;)V", pg1.ATOM_EXT_forEach, "all", "(Ltb/g1a;)Z", "count", "()I", "(Ltb/g1a;)I", "contains", "(J)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ltb/g1a;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "findElementIndex$collection", "(J)I", "findElementIndex", "", "metadata", "[J", "getMetadata$annotations", tep.KEY_UNIFORM_RESULT, "getElements$annotations", "_capacity", TLogTracker.LEVEL_INFO, "_size", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableLongSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class LongSet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _capacity;
    public int _size;
    public long[] elements;
    public long[] metadata;

    public /* synthetic */ LongSet(a07 a07Var) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fe8574", new Object[0]);
        }
    }

    public static /* synthetic */ void getMetadata$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01fcfac", new Object[0]);
        }
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e69f9bf0", new Object[]{longSet, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, new Integer(i2), obj});
        }
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence5 = "";
            CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
            if ((i2 & 4) == 0) {
                charSequence5 = charSequence3;
            }
            int i3 = (i2 & 8) != 0 ? -1 : i;
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            return longSet.joinToString(charSequence, charSequence6, charSequence5, i3, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb02877", new Object[]{this})).booleanValue() : this._size != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0093;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
        r15 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(long r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = androidx.collection.LongSet.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0025
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            r1[r3] = r6
            java.lang.String r2 = "894e0862"
            java.lang.Object r1 = r5.ipc$dispatch(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0025:
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
        L_0x0039:
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
        L_0x0065:
            r15 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0083
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> 3
            int r15 = r15 + r5
            r15 = r15 & r7
            long[] r3 = r0.elements
            r18 = r3[r15]
            int r3 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x007c
            goto L_0x008d
        L_0x007c:
            r15 = 1
            long r15 = r11 - r15
            long r11 = r11 & r15
            r3 = 1
            goto L_0x0065
        L_0x0083:
            long r11 = ~r9
            r3 = 6
            long r11 = r11 << r3
            long r9 = r9 & r11
            long r9 = r9 & r13
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x0093
            r15 = -1
        L_0x008d:
            if (r15 < 0) goto L_0x0091
            r3 = 1
            goto L_0x0092
        L_0x0091:
            r3 = 0
        L_0x0092:
            return r3
        L_0x0093:
            int r8 = r8 + 8
            int r5 = r5 + r8
            r5 = r5 & r7
            r3 = 1
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.contains(long):boolean");
    }

    public final int count() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue() : this._size;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongSet)) {
            return false;
        }
        LongSet longSet = (LongSet) obj;
        if (longSet._size != this._size) {
            return false;
        }
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !longSet.contains(jArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final int findElementIndex$collection(long j) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6841101d", new Object[]{this, new Long(j)})).intValue();
        }
        int a2 = en9.a(j) * ScatterMapKt.MurmurHashC1;
        int i2 = a2 ^ (a2 << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i4;
                if (this.elements[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final long first() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7db7f2b", new Object[]{this})).longValue();
        }
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            return jArr[(i << 3) + i3];
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        throw new NoSuchElementException("The LongSet is empty");
    }

    public final void forEach(g1a<? super Long, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be26dfb7", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            g1aVar.invoke(Long.valueOf(jArr[(i << 3) + i3]));
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

    public final void forEachIndex(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c0a6d5", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
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
                            g1aVar.invoke(Integer.valueOf((i << 3) + i3));
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

    public final int getCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e903eaa", new Object[]{this})).intValue();
        }
        return this._capacity;
    }

    public final int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this._size;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            i3 += en9.a(jArr[(i2 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final boolean isNotEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8421800f", new Object[]{this})).booleanValue();
        }
        if (this._size != 0) {
            return true;
        }
        return false;
    }

    public final String joinToString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d15b303", new Object[]{this}) : joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53eed7c3", new Object[]{this})).booleanValue();
        }
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
    }

    public final boolean any(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937f6a3d", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && g1aVar.invoke(Long.valueOf(jArr[(i << 3) + i3])).booleanValue()) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final int count(g1a<? super Long, Boolean> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d37abcf", new Object[]{this, g1aVar})).intValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && g1aVar.invoke(Long.valueOf(jArr[(i2 << 3) + i5])).booleanValue()) {
                            i3++;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final String joinToString(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f9af1df", new Object[]{this, charSequence});
        }
        ckf.g(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    public final boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this._size == 0;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f485cbb", new Object[]{this, charSequence, charSequence2});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1159f397", new Object[]{this, charSequence, charSequence2, charSequence3});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a g1aVar, int i2, Object obj) {
        int i3;
        int i4;
        char c = 7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cde82b6", new Object[]{longSet, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, g1aVar, new Integer(i2), obj});
        }
        int i5 = i;
        if (obj == null) {
            String str = (i2 & 1) != 0 ? ", " : charSequence;
            CharSequence charSequence5 = "";
            CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
            if ((4 & i2) == 0) {
                charSequence5 = charSequence3;
            }
            if ((i2 & 8) != 0) {
                i5 = -1;
            }
            String str2 = (i2 & 16) != 0 ? "..." : charSequence4;
            ckf.g(str, "separator");
            ckf.g(charSequence6, "prefix");
            ckf.g(charSequence5, "postfix");
            ckf.g(str2, "truncated");
            ckf.g(g1aVar, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence6);
            long[] jArr = longSet.elements;
            long[] jArr2 = longSet.metadata;
            int length = jArr2.length - 2;
            if (length >= 0) {
                CharSequence charSequence7 = str;
                int i6 = 0;
                int i7 = 0;
                loop0: while (true) {
                    long j = jArr2[i6];
                    if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j & 255) < 128) {
                                long j2 = jArr[(i6 << 3) + i9];
                                if (i7 == i5) {
                                    sb.append(str2);
                                    break loop0;
                                }
                                charSequence7 = charSequence7;
                                if (i7 != 0) {
                                    sb.append(charSequence7);
                                }
                                sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j2)));
                                i4 = 1;
                                i7++;
                            } else {
                                charSequence7 = charSequence7;
                                i4 = 1;
                            }
                            j >>= 8;
                            i9 += i4;
                            jArr2 = jArr2;
                        }
                        charSequence7 = charSequence7;
                        jArr2 = jArr2;
                        i3 = 1;
                        if (i8 != 8) {
                            break;
                        }
                    } else {
                        charSequence7 = charSequence7;
                        jArr2 = jArr2;
                        i3 = 1;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6 += i3;
                    c = 7;
                }
            }
            sb.append(charSequence5);
            String sb2 = sb.toString();
            ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b6367e6", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i)});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83e0edc2", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr2[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7 += i3) {
                        if ((j & 255) < 128) {
                            i4 = i4;
                            long j2 = jArr[(i4 << 3) + i7];
                            if (i5 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(j2);
                            i3 = 1;
                            i5++;
                        } else {
                            i4 = i4;
                            i3 = 1;
                        }
                        j >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                    i2 = i4;
                } else {
                    i2 = i4;
                }
                if (i2 == length) {
                    break;
                }
                i4 = i2 + 1;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final long first(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33feb0f1", new Object[]{this, g1aVar})).longValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i3];
                            if (g1aVar.invoke(Long.valueOf(j2)).booleanValue()) {
                                return j2;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        throw new NoSuchElementException("Could not find a match");
    }

    public final boolean all(g1a<? super Long, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1547372", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "predicate");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !g1aVar.invoke(Long.valueOf(jArr[(i << 3) + i3])).booleanValue()) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a<? super Long, ? extends CharSequence> g1aVar) {
        StringBuilder sb;
        int i2;
        int i3 = 0;
        char c = 7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5669cbc", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        ckf.g(g1aVar, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            StringBuilder sb3 = sb2;
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr2[i4];
                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    while (i3 < i6) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i4 << 3) + i3];
                            if (i5 == i) {
                                sb = sb3;
                                sb.append(charSequence4);
                                break loop0;
                            }
                            sb3 = sb3;
                            if (i5 != 0) {
                                sb3.append(charSequence);
                            }
                            sb3.append((CharSequence) g1aVar.invoke(Long.valueOf(j2)));
                            i2 = 1;
                            i5++;
                        } else {
                            sb3 = sb3;
                            i2 = 1;
                        }
                        j >>= 8;
                        i3 += i2;
                    }
                    sb = sb3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    sb = sb3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                sb3 = sb;
                i3 = 0;
                c = 7;
            }
        } else {
            sb = sb2;
        }
        sb.append(charSequence3);
        String sb4 = sb.toString();
        ckf.f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, g1a<? super Long, ? extends CharSequence> g1aVar) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6d786e0", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr2[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7 += i3) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i4 << 3) + i7];
                            if (i5 == i) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j2)));
                            i3 = 1;
                            i5++;
                        } else {
                            i3 = 1;
                        }
                        j >>= 8;
                    }
                    i2 = 1;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    i2 = 1;
                }
                if (i4 == length) {
                    break;
                }
                i4 += i2;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, g1a<? super Long, ? extends CharSequence> g1aVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a0b0e91", new Object[]{this, charSequence, charSequence2, charSequence3, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i3 << 3) + i6];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j2)));
                            i2 = 1;
                            i4++;
                        } else {
                            i2 = 1;
                        }
                        j >>= 8;
                        i6 += i2;
                    }
                    i = 1;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    i = 1;
                }
                if (i3 == length) {
                    break;
                }
                i3 += i;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, g1a<? super Long, ? extends CharSequence> g1aVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e6be7b5", new Object[]{this, charSequence, charSequence2, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    while (i < i4) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i2 << 3) + i];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j2)));
                            i3++;
                        }
                        j >>= 8;
                        i++;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                i = 0;
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, g1a<? super Long, ? extends CharSequence> g1aVar) {
        StringBuilder sb;
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e980ecd9", new Object[]{this, charSequence, g1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(g1aVar, "transform");
        StringBuilder sb2 = new StringBuilder("");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr2[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    while (i3 < i6) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i4 << 3) + i3];
                            if (i5 == -1) {
                                sb = sb2;
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb2 = sb2;
                            if (i5 != 0) {
                                sb2.append(charSequence);
                            }
                            sb2.append((CharSequence) g1aVar.invoke(Long.valueOf(j2)));
                            i2 = 1;
                            i5++;
                        } else {
                            sb2 = sb2;
                            i2 = 1;
                        }
                        j >>= 8;
                        i3 += i2;
                    }
                    sb = sb2;
                    i = 1;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    sb = sb2;
                    i = 1;
                }
                if (i4 == length) {
                    break;
                }
                i4 += i;
                sb2 = sb;
                i3 = 0;
            }
        } else {
            sb = sb2;
        }
        sb.append((CharSequence) "");
        String sb3 = sb.toString();
        ckf.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String joinToString(g1a<? super Long, ? extends CharSequence> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60e1dfd", new Object[]{this, g1aVar});
        }
        ckf.g(g1aVar, "transform");
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) g1aVar.invoke(Long.valueOf(j2)));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
