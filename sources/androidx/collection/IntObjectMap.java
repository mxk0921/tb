package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.pg1;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u001b\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010\u001f\u001a\u00020\u001926\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00190\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J6\u0010!\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00190\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001cJ6\u0010\"\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00190\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001cJ-\u0010$\u001a\u00020\u00052\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%J-\u0010\u0006\u001a\u00020\u00052\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010%J\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'J-\u0010&\u001a\u00020\u000b2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010(J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b+\u0010*J\u0015\u0010,\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-JA\u00105\u001a\u0002042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\b\b\u0002\u00101\u001a\u00020.2\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020.H\u0007¢\u0006\u0004\b5\u00106J\u007f\u00105\u001a\u0002042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\b\b\u0002\u00101\u001a\u00020.2\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020.28\b\u0004\u00107\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020.0\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b5\u00108J\u000f\u00109\u001a\u00020\u000bH\u0016¢\u0006\u0004\b9\u0010'J\u001a\u0010;\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b;\u0010-J\u000f\u0010<\u001a\u000204H\u0016¢\u0006\u0004\b<\u0010=J\u0018\u0010@\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b>\u0010?R\u001c\u0010B\u001a\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010\u0004R\u001c\u0010F\u001a\u00020E8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010\u0004R$\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020I8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010\u0004R\u001c\u0010M\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bM\u0010N\u0012\u0004\bO\u0010\u0004R\u001c\u0010P\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bP\u0010N\u0012\u0004\bQ\u0010\u0004R\u0011\u0010S\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bR\u0010'R\u0011\u0010U\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bT\u0010'\u0082\u0001\u0001V\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006W"}, d2 = {"Landroidx/collection/IntObjectMap;", "V", "", "<init>", "()V", "", pg1.ATOM_EXT_any, "()Z", "none", "isEmpty", "isNotEmpty", "", "key", "get", "(I)Ljava/lang/Object;", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(ILtb/d1a;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "Ltb/xhv;", pg1.ATOM_EXT_block, "forEachIndexed", "(Ltb/g1a;)V", "Lkotlin/Function2;", "value", pg1.ATOM_EXT_forEach, "(Ltb/u1a;)V", "forEachKey", "forEachValue", "predicate", "all", "(Ltb/u1a;)Z", "count", "()I", "(Ltb/u1a;)I", "contains", "(I)Z", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ltb/u1a;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "findKeyIndex$collection", "(I)I", "findKeyIndex", "", "metadata", "[J", "getMetadata$annotations", "", "keys", "[I", "getKeys$annotations", "", pg1.ATOM_values, "[Ljava/lang/Object;", "getValues$annotations", "_capacity", TLogTracker.LEVEL_INFO, "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableIntObjectMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class IntObjectMap<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ IntObjectMap(a07 a07Var) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff78371", new Object[0]);
        }
    }

    public static /* synthetic */ void getMetadata$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01fcfac", new Object[0]);
        }
    }

    public static /* synthetic */ void getValues$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da75911f", new Object[0]);
        }
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33ddd66", new Object[0]);
        }
    }

    public static /* synthetic */ void get_size$collection$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb8a13f", new Object[0]);
        }
    }

    public static /* synthetic */ String joinToString$default(IntObjectMap intObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fcedf2c", new Object[]{intObjectMap, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, new Integer(i2), obj});
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
            return intObjectMap.joinToString(charSequence, charSequence6, charSequence5, i3, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb02877", new Object[]{this})).booleanValue() : this._size != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x008d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.collection.IntObjectMap.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0025
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            r1[r2] = r5
            java.lang.String r2 = "894e04a1"
            java.lang.Object r1 = r4.ipc$dispatch(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0025:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r1
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L_0x0035:
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
        L_0x0061:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x007c
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r4
            r14 = r14 & r6
            int[] r15 = r0.keys
            r15 = r15[r14]
            if (r15 != r1) goto L_0x0076
            goto L_0x0088
        L_0x0076:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x0061
        L_0x007c:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x008d
            r14 = -1
        L_0x0088:
            if (r14 < 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r2 = 0
        L_0x008c:
            return r2
        L_0x008d:
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.contains(int):boolean");
    }

    public final int count() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue() : getSize();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntObjectMap)) {
            return false;
        }
        IntObjectMap intObjectMap = (IntObjectMap) obj;
        if (intObjectMap.getSize() != getSize()) {
            return false;
        }
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            Object obj2 = objArr[i4];
                            if (obj2 == null) {
                                if (intObjectMap.get(i5) != null || !intObjectMap.containsKey(i5)) {
                                    break loop0;
                                }
                            } else if (!ckf.b(obj2, intObjectMap.get(i5))) {
                                return false;
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
            return false;
        }
        return true;
    }

    public final int findKeyIndex$collection(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5acc2d59", new Object[]{this, new Integer(i)})).intValue();
        }
        int i3 = ScatterMapKt.MurmurHashC1 * i;
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 & 127;
        int i6 = this._capacity;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.metadata;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j2 = (i5 * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i8) & i6;
                if (this.keys[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i7 = i8 + i2;
        }
    }

    public final void forEach(u1a<? super Integer, ? super V, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be275416", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            u1aVar.invoke(Integer.valueOf(iArr[i4]), objArr[i4]);
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

    public final void forEachIndexed(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335d0df4", new Object[]{this, g1aVar});
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

    public final void forEachValue(g1a<? super V, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571a6bf4", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.values;
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
                            g1aVar.invoke(objArr[(i << 3) + i3]);
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L_0x0084;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(int r15) {
        /*
            r14 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.IntObjectMap.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r15)
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r1] = r14
            r15[r0] = r3
            java.lang.String r0 = "bb5c862c"
            java.lang.Object r15 = r2.ipc$dispatch(r0, r15)
            return r15
        L_0x001b:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r15
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r14._capacity
            int r2 = r2 >>> 7
        L_0x0029:
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
        L_0x0056:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0071
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r12 = r14.keys
            r12 = r12[r11]
            if (r12 != r15) goto L_0x006b
            goto L_0x007b
        L_0x006b:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L_0x0056
        L_0x0071:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0084
            r11 = -1
        L_0x007b:
            if (r11 < 0) goto L_0x0082
            java.lang.Object[] r15 = r14.values
            r15 = r15[r11]
            goto L_0x0083
        L_0x0082:
            r15 = 0
        L_0x0083:
            return r15
        L_0x0084:
            int r1 = r1 + 8
            int r2 = r2 + r1
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.get(int):java.lang.Object");
    }

    public final int getCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e903eaa", new Object[]{this})).intValue();
        }
        return this._capacity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x008a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V getOrDefault(int r18, V r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            r4 = 3
            com.android.alibaba.ip.runtime.IpChange r5 = androidx.collection.IntObjectMap.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0022
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            r1[r2] = r6
            r2 = 2
            r1[r2] = r19
            java.lang.String r2 = "b9487222"
            java.lang.Object r1 = r5.ipc$dispatch(r2, r1)
            return r1
        L_0x0022:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r1
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
            int r10 = r10 << r4
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
            long r10 = (long) r6
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r8
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L_0x005c:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0076
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> r4
            int r14 = r14 + r5
            r14 = r14 & r7
            int[] r15 = r0.keys
            r15 = r15[r14]
            if (r15 != r1) goto L_0x0070
            goto L_0x0082
        L_0x0070:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x005c
        L_0x0076:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x008a
            r14 = -1
        L_0x0082:
            if (r14 < 0) goto L_0x0089
            java.lang.Object[] r1 = r0.values
            r1 = r1[r14]
            return r1
        L_0x0089:
            return r19
        L_0x008a:
            int r3 = r3 + 8
            int r5 = r5 + r3
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.getOrDefault(int, java.lang.Object):java.lang.Object");
    }

    public final V getOrElse(int i, d1a<? extends V> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("20dcbc01", new Object[]{this, new Integer(i), d1aVar});
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        V v = get(i);
        return v == null ? (V) d1aVar.invoke() : v;
    }

    public final int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this._size;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            Object obj = objArr[i7];
                            if (obj != null) {
                                i = obj.hashCode();
                            } else {
                                i = 0;
                            }
                            i4 += i ^ i8;
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        return i4;
                    }
                }
                if (i3 == length) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
        }
        return i2;
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

    private IntObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public final boolean any(u1a<? super Integer, ? super V, Boolean> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937fde9c", new Object[]{this, u1aVar})).booleanValue();
        }
        ckf.g(u1aVar, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            if (u1aVar.invoke(Integer.valueOf(iArr[i4]), objArr[i4]).booleanValue()) {
                                return true;
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
        return false;
    }

    public final int count(u1a<? super Integer, ? super V, Boolean> u1aVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d38202e", new Object[]{this, u1aVar})).intValue();
        }
        ckf.g(u1aVar, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (u1aVar.invoke(Integer.valueOf(iArr[i6]), objArr[i6]).booleanValue()) {
                                i3++;
                            }
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
        } else {
            i = 0;
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

    public static /* synthetic */ String joinToString$default(IntObjectMap intObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u1a u1aVar, int i2, Object obj) {
        int i3;
        int i4;
        char c = 7;
        int i5 = 8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65efc6d1", new Object[]{intObjectMap, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, u1aVar, new Integer(i2), obj});
        }
        int i6 = i;
        if (obj == null) {
            String str = (i2 & 1) != 0 ? ", " : charSequence;
            CharSequence charSequence5 = "";
            CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
            if ((4 & i2) == 0) {
                charSequence5 = charSequence3;
            }
            if ((i2 & 8) != 0) {
                i6 = -1;
            }
            String str2 = (i2 & 16) != 0 ? "..." : charSequence4;
            ckf.g(str, "separator");
            ckf.g(charSequence6, "prefix");
            ckf.g(charSequence5, "postfix");
            ckf.g(str2, "truncated");
            ckf.g(u1aVar, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence6);
            int[] iArr = intObjectMap.keys;
            Object[] objArr = intObjectMap.values;
            long[] jArr = intObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                int i8 = 0;
                loop0: while (true) {
                    long j = jArr[i7];
                    if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        int i10 = i8;
                        int i11 = 0;
                        while (i11 < i9) {
                            if ((j & 255) < 128) {
                                int i12 = (i7 << 3) + i11;
                                int i13 = iArr[i12];
                                Object obj2 = objArr[i12];
                                if (i10 == i6) {
                                    sb.append(str2);
                                    break loop0;
                                }
                                jArr = jArr;
                                if (i10 != 0) {
                                    sb.append(str);
                                }
                                sb.append((CharSequence) u1aVar.invoke(Integer.valueOf(i13), obj2));
                                i4 = 1;
                                i10++;
                                i5 = 8;
                            } else {
                                jArr = jArr;
                                i4 = 1;
                            }
                            j >>= i5;
                            i11 += i4;
                        }
                        jArr = jArr;
                        i3 = 1;
                        if (i9 != i5) {
                            break;
                        }
                        i8 = i10;
                    } else {
                        jArr = jArr;
                        i3 = 1;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7 += i3;
                    c = 7;
                }
                String sb2 = sb.toString();
                ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            sb.append(charSequence5);
            String sb22 = sb.toString();
            ckf.f(sb22, "StringBuilder().apply(builderAction).toString()");
            return sb22;
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

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            sb.append(i6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        ckf.f(sb2, "s.append('}').toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        int i2;
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
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            int i9 = iArr[i8];
                            Object obj = objArr[i8];
                            if (i4 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(i9);
                            sb.append('=');
                            sb.append(obj);
                            i2 = 1;
                            i4++;
                            i5 = 8;
                        } else {
                            i2 = 1;
                        }
                        j >>= i5;
                        i7 += i2;
                    }
                    if (i6 != i5) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L_0x008e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.collection.IntObjectMap.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0026
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            r1[r2] = r5
            java.lang.String r2 = "ff844fa0"
            java.lang.Object r1 = r4.ipc$dispatch(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0026:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r1
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L_0x0036:
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
        L_0x0062:
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x007d
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r4
            r14 = r14 & r6
            int[] r15 = r0.keys
            r15 = r15[r14]
            if (r15 != r1) goto L_0x0077
            goto L_0x0089
        L_0x0077:
            r14 = 1
            long r14 = r10 - r14
            long r10 = r10 & r14
            goto L_0x0062
        L_0x007d:
            long r10 = ~r8
            r16 = 6
            long r10 = r10 << r16
            long r8 = r8 & r10
            long r8 = r8 & r12
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x008e
            r14 = -1
        L_0x0089:
            if (r14 < 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            return r2
        L_0x008e:
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.containsKey(int):boolean");
    }

    public final boolean all(u1a<? super Integer, ? super V, Boolean> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d154e7d1", new Object[]{this, u1aVar})).booleanValue();
        }
        ckf.g(u1aVar, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            if (!u1aVar.invoke(Integer.valueOf(iArr[i4]), objArr[i4]).booleanValue()) {
                                return false;
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
        return true;
    }

    public final boolean containsValue(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, v})).booleanValue();
        }
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && ckf.b(v, objArr[(i << 3) + i3])) {
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

    public final void forEachKey(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe36cf62", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        int[] iArr = this.keys;
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
                            g1aVar.invoke(Integer.valueOf(iArr[(i << 3) + i3]));
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u1a<? super Integer, ? super V, ? extends CharSequence> u1aVar) {
        StringBuilder sb;
        int i2;
        CharSequence charSequence5 = charSequence;
        char c = 7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11ff923d", new Object[]{this, charSequence5, charSequence2, charSequence3, new Integer(i), charSequence4, u1aVar});
        }
        ckf.g(charSequence5, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        ckf.g(u1aVar, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            StringBuilder sb3 = sb2;
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < i6) {
                        if ((j & 255) < 128) {
                            int i9 = (i3 << 3) + i8;
                            int i10 = iArr[i9];
                            Object obj = objArr[i9];
                            if (i7 == i) {
                                sb = sb3;
                                sb.append(charSequence4);
                                break loop0;
                            }
                            sb3 = sb3;
                            if (i7 != 0) {
                                sb3.append(charSequence5);
                            }
                            sb3.append((CharSequence) u1aVar.invoke(Integer.valueOf(i10), obj));
                            i2 = 1;
                            i7++;
                            i5 = 8;
                        } else {
                            sb3 = sb3;
                            i2 = 1;
                        }
                        j >>= i5;
                        i8 += i2;
                        charSequence5 = charSequence;
                    }
                    sb = sb3;
                    if (i6 != i5) {
                        break;
                    }
                    i4 = i7;
                } else {
                    sb = sb3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                charSequence5 = charSequence;
                sb3 = sb;
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, u1a<? super Integer, ? super V, ? extends CharSequence> u1aVar) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3707c61", new Object[]{this, charSequence, charSequence2, charSequence3, new Integer(i), u1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(u1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            int i9 = iArr[i8];
                            Object obj = objArr[i8];
                            if (i4 == i) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(Integer.valueOf(i9), obj));
                            i2 = 1;
                            i4++;
                            i5 = 8;
                        } else {
                            i2 = 1;
                        }
                        j >>= i5;
                        i7 += i2;
                    }
                    if (i6 != i5) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
            String sb2 = sb.toString();
            ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append(charSequence3);
        String sb22 = sb.toString();
        ckf.f(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, u1a<? super Integer, ? super V, ? extends CharSequence> u1aVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66a40412", new Object[]{this, charSequence, charSequence2, charSequence3, u1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(u1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6 += i2) {
                        if ((j & 255) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            Object obj = objArr[i7];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(Integer.valueOf(i8), obj));
                            i2 = 1;
                            i4++;
                        } else {
                            i2 = 1;
                        }
                        j >>= 8;
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, u1a<? super Integer, ? super V, ? extends CharSequence> u1aVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b04dd36", new Object[]{this, charSequence, charSequence2, u1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(u1aVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            int i9 = iArr[i8];
                            Object obj = objArr[i8];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(Integer.valueOf(i9), obj));
                            i2 = 1;
                            i4++;
                            i5 = 8;
                        } else {
                            i2 = 1;
                        }
                        j >>= i5;
                        i7 += i2;
                    }
                    i = 1;
                    if (i6 != i5) {
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
            String sb2 = sb.toString();
            ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "");
        String sb22 = sb.toString();
        ckf.f(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence charSequence, u1a<? super Integer, ? super V, ? extends CharSequence> u1aVar) {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f619e25a", new Object[]{this, charSequence, u1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(u1aVar, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    while (i3 < i6) {
                        if ((j & 255) < 128) {
                            int i7 = (i4 << 3) + i3;
                            int i8 = iArr[i7];
                            Object obj = objArr[i7];
                            if (i5 == -1) {
                                sb = sb;
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb = sb;
                            if (i5 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(Integer.valueOf(i8), obj));
                            i2 = 1;
                            i5++;
                        } else {
                            sb = sb;
                            i2 = 1;
                        }
                        j >>= 8;
                        i3 += i2;
                    }
                    sb = sb;
                    i = 1;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    sb = sb;
                    i = 1;
                }
                if (i4 == length) {
                    break;
                }
                i4 += i;
                i3 = 0;
            }
            String sb2 = sb.toString();
            ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append((CharSequence) "");
        String sb22 = sb.toString();
        ckf.f(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(u1a<? super Integer, ? super V, ? extends CharSequence> u1aVar) {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a7137e", new Object[]{this, u1aVar});
        }
        ckf.g(u1aVar, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    while (i < i6) {
                        if ((j & 255) < 128) {
                            int i7 = (i3 << 3) + i;
                            int i8 = iArr[i7];
                            Object obj = objArr[i7];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) u1aVar.invoke(Integer.valueOf(i8), obj));
                            i2 = 1;
                            i4++;
                            i5 = 8;
                        }
                        j >>= i5;
                        i += i2;
                    }
                    if (i6 != i5) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3 += i2;
                i = 0;
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
