package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.en9;
import tb.g1a;
import tb.pg1;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u001b\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010\u001f\u001a\u00020\u001926\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00190\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J6\u0010!\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00190\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001cJ6\u0010\"\u001a\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00190\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001cJ-\u0010$\u001a\u00020\u00042\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%J-\u0010\u0005\u001a\u00020\u00042\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010%J\r\u0010&\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J-\u0010&\u001a\u00020\u00152\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010(J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b+\u0010*J\u0015\u0010,\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b,\u0010*JA\u00104\u001a\u0002032\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-2\b\b\u0002\u00101\u001a\u00020\u00152\b\b\u0002\u00102\u001a\u00020-H\u0007¢\u0006\u0004\b4\u00105J\u007f\u00104\u001a\u0002032\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020-2\b\b\u0002\u00101\u001a\u00020\u00152\b\b\u0002\u00102\u001a\u00020-28\b\u0004\u00106\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020-0\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b4\u00107J\u000f\u00108\u001a\u00020\u0015H\u0016¢\u0006\u0004\b8\u0010'J\u001a\u0010:\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000203H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b>\u0010?R\u001c\u0010A\u001a\u00020@8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010\u0003R\u001c\u0010D\u001a\u00020@8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bD\u0010B\u0012\u0004\bE\u0010\u0003R\u001c\u0010F\u001a\u00020@8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bF\u0010B\u0012\u0004\bG\u0010\u0003R\u001c\u0010H\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bH\u0010I\u0012\u0004\bJ\u0010\u0003R\u001c\u0010K\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bK\u0010I\u0012\u0004\bL\u0010\u0003R\u0011\u0010N\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bM\u0010'R\u0011\u0010P\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bO\u0010'\u0082\u0001\u0001Q\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006R"}, d2 = {"Landroidx/collection/LongLongMap;", "", "<init>", "()V", "", pg1.ATOM_EXT_any, "()Z", "none", "isEmpty", "isNotEmpty", "", "key", "get", "(J)J", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(JJ)J", "Lkotlin/Function0;", "getOrElse", "(JLtb/d1a;)J", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "Ltb/xhv;", pg1.ATOM_EXT_block, "forEachIndexed", "(Ltb/g1a;)V", "Lkotlin/Function2;", "value", pg1.ATOM_EXT_forEach, "(Ltb/u1a;)V", "forEachKey", "forEachValue", "predicate", "all", "(Ltb/u1a;)Z", "count", "()I", "(Ltb/u1a;)I", "contains", "(J)Z", "containsKey", "containsValue", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ltb/u1a;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "findKeyIndex", "(J)I", "", "metadata", "[J", "getMetadata$annotations", "keys", "getKeys$annotations", pg1.ATOM_values, "getValues$annotations", "_capacity", TLogTracker.LEVEL_INFO, "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableLongLongMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class LongLongMap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public long[] values;

    public /* synthetic */ LongLongMap(a07 a07Var) {
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

    public static /* synthetic */ String joinToString$default(LongLongMap longLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b1a99ce", new Object[]{longLongMap, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, new Integer(i2), obj});
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
            return longLongMap.joinToString(charSequence, charSequence6, charSequence5, i3, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb02877", new Object[]{this})).booleanValue() : this._size != 0;
    }

    public final boolean contains(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("894e0862", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (findKeyIndex(j) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29caa7cf", new Object[]{this, new Long(j)})).booleanValue();
        }
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr2[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128 && j == jArr[(i << 3) + i3]) {
                            return true;
                        }
                        j2 >>= 8;
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

    public final int count() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue() : getSize();
    }

    public boolean equals(Object obj) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongLongMap)) {
            return false;
        }
        LongLongMap longLongMap = (LongLongMap) obj;
        if (longLongMap.getSize() != getSize()) {
            return false;
        }
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            i = i5;
                            if (jArr2[i6] != longLongMap.get(jArr[i6])) {
                                return false;
                            }
                            i3 = 8;
                        } else {
                            i = i5;
                        }
                        j >>= i3;
                        i5 = i + 1;
                    }
                    if (i4 != i3) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final int findKeyIndex(long j) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69836c04", new Object[]{this, new Long(j)})).intValue();
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
                if (this.keys[numberOfTrailingZeros] == j) {
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

    public final void forEach(u1a<? super Long, ? super Long, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be275416", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            u1aVar.invoke(Long.valueOf(jArr[i4]), Long.valueOf(jArr2[i4]));
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

    public final void forEachValue(g1a<? super Long, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571a6bf4", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        long[] jArr = this.values;
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

    public final long get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc197b", new Object[]{this, new Long(j)})).longValue();
        }
        int findKeyIndex = findKeyIndex(j);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        throw new NoSuchElementException("Cannot find value for key " + j);
    }

    public final int getCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e903eaa", new Object[]{this})).intValue();
        }
        return this._capacity;
    }

    public final long getOrDefault(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("958d9563", new Object[]{this, new Long(j), new Long(j2)})).longValue();
        }
        int findKeyIndex = findKeyIndex(j);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return j2;
    }

    public final long getOrElse(long j, d1a<Long> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c828706", new Object[]{this, new Long(j), d1aVar})).longValue();
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        int findKeyIndex = findKeyIndex(j);
        if (findKeyIndex < 0) {
            return d1aVar.invoke().longValue();
        }
        return this.values[findKeyIndex];
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
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            i3 += en9.a(jArr[i6]) ^ en9.a(jArr2[i6]);
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

    private LongLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
        this.values = LongSetKt.getEmptyLongArray();
    }

    public final boolean any(u1a<? super Long, ? super Long, Boolean> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937fde9c", new Object[]{this, u1aVar})).booleanValue();
        }
        ckf.g(u1aVar, "predicate");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (u1aVar.invoke(Long.valueOf(jArr[i4]), Long.valueOf(jArr2[i4])).booleanValue()) {
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

    public final int count(u1a<? super Long, ? super Long, Boolean> u1aVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d38202e", new Object[]{this, u1aVar})).intValue();
        }
        ckf.g(u1aVar, "predicate");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (u1aVar.invoke(Long.valueOf(jArr[i6]), Long.valueOf(jArr2[i6])).booleanValue()) {
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

    public final boolean containsKey(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff845361", new Object[]{this, new Long(j)})).booleanValue();
        }
        return findKeyIndex(j) >= 0;
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

    public static /* synthetic */ String joinToString$default(LongLongMap longLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u1a u1aVar, int i2, Object obj) {
        int i3;
        int i4;
        char c = 7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26587973", new Object[]{longLongMap, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, u1aVar, new Integer(i2), obj});
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
            ckf.g(u1aVar, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence6);
            long[] jArr = longLongMap.keys;
            long[] jArr2 = longLongMap.values;
            long[] jArr3 = longLongMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                CharSequence charSequence7 = str;
                int i6 = 0;
                int i7 = 0;
                loop0: while (true) {
                    long j = jArr3[i6];
                    if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        int i9 = i7;
                        for (int i10 = 0; i10 < i8; i10 += i4) {
                            if ((j & 255) < 128) {
                                int i11 = (i6 << 3) + i10;
                                long j2 = jArr[i11];
                                long j3 = jArr2[i11];
                                if (i9 == i5) {
                                    sb.append(str2);
                                    break loop0;
                                }
                                charSequence7 = charSequence7;
                                if (i9 != 0) {
                                    sb.append(charSequence7);
                                }
                                jArr3 = jArr3;
                                Long valueOf = Long.valueOf(j2);
                                str2 = str2;
                                sb.append((CharSequence) u1aVar.invoke(valueOf, Long.valueOf(j3)));
                                i4 = 1;
                                i9++;
                            } else {
                                charSequence7 = charSequence7;
                                jArr3 = jArr3;
                                str2 = str2;
                                i4 = 1;
                            }
                            j >>= 8;
                        }
                        charSequence7 = charSequence7;
                        jArr3 = jArr3;
                        str2 = str2;
                        i3 = 1;
                        if (i8 != 8) {
                            break;
                        }
                        i7 = i9;
                    } else {
                        charSequence7 = charSequence7;
                        jArr3 = jArr3;
                        str2 = str2;
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

    public String toString() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr3[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6 = i2 + 1) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i6;
                            long j2 = jArr[i7];
                            long j3 = jArr2[i7];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(j3);
                            i4++;
                            if (i4 < this._size) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i6;
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
        sb.append('}');
        String sb2 = sb.toString();
        ckf.f(sb2, "s.append('}').toString()");
        return sb2;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        long j;
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
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6 += i2) {
                        if ((j2 & 255) < 128) {
                            int i7 = (i3 << 3) + i6;
                            j = j2;
                            long j3 = jArr[i7];
                            jArr = jArr;
                            long j4 = jArr2[i7];
                            if (i4 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(j3);
                            sb.append('=');
                            sb.append(j4);
                            i2 = 1;
                            i4++;
                        } else {
                            j = j2;
                            jArr = jArr;
                            i2 = 1;
                        }
                        j2 = j >> 8;
                    }
                    jArr = jArr;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr;
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

    public final boolean all(u1a<? super Long, ? super Long, Boolean> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d154e7d1", new Object[]{this, u1aVar})).booleanValue();
        }
        ckf.g(u1aVar, "predicate");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr3[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (!u1aVar.invoke(Long.valueOf(jArr[i4]), Long.valueOf(jArr2[i4])).booleanValue()) {
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

    public final void forEachKey(g1a<? super Long, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe36cf62", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        long[] jArr = this.keys;
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u1a<? super Long, ? super Long, ? extends CharSequence> u1aVar) {
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
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            StringBuilder sb3 = sb2;
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr3[i3];
                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = i4;
                    int i7 = 0;
                    while (i7 < i5) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            long j2 = jArr[i8];
                            long j3 = jArr2[i8];
                            if (i6 == i) {
                                sb = sb3;
                                sb.append(charSequence4);
                                break loop0;
                            }
                            sb3 = sb3;
                            if (i6 != 0) {
                                sb3.append(charSequence5);
                            }
                            sb3.append((CharSequence) u1aVar.invoke(Long.valueOf(j2), Long.valueOf(j3)));
                            i2 = 1;
                            i6++;
                        } else {
                            sb3 = sb3;
                            i2 = 1;
                        }
                        j >>= 8;
                        i7 += i2;
                        charSequence5 = charSequence;
                    }
                    sb = sb3;
                    if (i5 != 8) {
                        break;
                    }
                    i4 = i6;
                } else {
                    sb = sb3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                sb3 = sb;
                c = 7;
                charSequence5 = charSequence;
            }
        } else {
            sb = sb2;
        }
        sb.append(charSequence3);
        String sb4 = sb.toString();
        ckf.f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, u1a<? super Long, ? super Long, ? extends CharSequence> u1aVar) {
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
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr3[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            long j2 = jArr[i8];
                            long j3 = jArr2[i8];
                            if (i4 == i) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(Long.valueOf(j2), Long.valueOf(j3)));
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, u1a<? super Long, ? super Long, ? extends CharSequence> u1aVar) {
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
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr3[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6 += i2) {
                        if ((j & 255) < 128) {
                            int i7 = (i3 << 3) + i6;
                            long j2 = jArr[i7];
                            long j3 = jArr2[i7];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(Long.valueOf(j2), Long.valueOf(j3)));
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, u1a<? super Long, ? super Long, ? extends CharSequence> u1aVar) {
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
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr3[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            long j2 = jArr[i8];
                            long j3 = jArr2[i8];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(Long.valueOf(j2), Long.valueOf(j3)));
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

    public final String joinToString(CharSequence charSequence, u1a<? super Long, ? super Long, ? extends CharSequence> u1aVar) {
        StringBuilder sb;
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f619e25a", new Object[]{this, charSequence, u1aVar});
        }
        ckf.g(charSequence, "separator");
        ckf.g(u1aVar, "transform");
        StringBuilder sb2 = new StringBuilder("");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr3[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i4 - length)) >>> 31);
                    while (i3 < i7) {
                        if ((j & 255) < 128) {
                            int i8 = (i4 << 3) + i3;
                            long j2 = jArr[i8];
                            long j3 = jArr2[i8];
                            if (i5 == -1) {
                                sb = sb2;
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb2 = sb2;
                            if (i5 != 0) {
                                sb2.append(charSequence);
                            }
                            sb2.append((CharSequence) u1aVar.invoke(Long.valueOf(j2), Long.valueOf(j3)));
                            i2 = 1;
                            i5++;
                            i6 = 8;
                        } else {
                            sb2 = sb2;
                            i2 = 1;
                        }
                        j >>= i6;
                        i3 += i2;
                    }
                    sb = sb2;
                    i = 1;
                    if (i7 != i6) {
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
            String sb3 = sb.toString();
            ckf.f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        sb = sb2;
        sb.append((CharSequence) "");
        String sb32 = sb.toString();
        ckf.f(sb32, "StringBuilder().apply(builderAction).toString()");
        return sb32;
    }

    public final String joinToString(u1a<? super Long, ? super Long, ? extends CharSequence> u1aVar) {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a7137e", new Object[]{this, u1aVar});
        }
        ckf.g(u1aVar, "transform");
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr3[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    while (i < i6) {
                        if ((j & 255) < 128) {
                            int i7 = (i3 << 3) + i;
                            long j2 = jArr[i7];
                            long j3 = jArr2[i7];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) u1aVar.invoke(Long.valueOf(j2), Long.valueOf(j3)));
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
