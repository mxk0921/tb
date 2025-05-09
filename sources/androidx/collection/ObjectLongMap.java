package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
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
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J6\u0010\u001c\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0015H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010 \u001a\u00020\u001a26\u0010\u001b\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!J6\u0010\"\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001dJ6\u0010#\u001a\u00020\u001a2!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u001a0\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010\u001dJ-\u0010%\u001a\u00020\u00052\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010&J-\u0010\u0006\u001a\u00020\u00052\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010&J\r\u0010'\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J-\u0010'\u001a\u00020\u00162\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010)J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b-\u0010.JA\u00106\u001a\u0002052\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020\u00162\b\b\u0002\u00104\u001a\u00020/H\u0007¢\u0006\u0004\b6\u00107J\u007f\u00106\u001a\u0002052\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020\u00162\b\b\u0002\u00104\u001a\u00020/28\b\u0004\u00108\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020/0\u001eH\u0087\bø\u0001\u0000¢\u0006\u0004\b6\u00109J\u000f\u0010:\u001a\u00020\u0016H\u0016¢\u0006\u0004\b:\u0010(J\u001a\u0010<\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b<\u0010+J\u000f\u0010=\u001a\u000205H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b?\u0010@R\u001c\u0010B\u001a\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010\u0004R$\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020E8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u0010\u0004R\u001c\u0010I\u001a\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bI\u0010C\u0012\u0004\bJ\u0010\u0004R\u001c\u0010K\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bK\u0010L\u0012\u0004\bM\u0010\u0004R\u001c\u0010N\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bN\u0010L\u0012\u0004\bO\u0010\u0004R\u0011\u0010Q\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bP\u0010(R\u0011\u0010S\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bR\u0010(\u0082\u0001\u0001T\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006U"}, d2 = {"Landroidx/collection/ObjectLongMap;", "K", "", "<init>", "()V", "", pg1.ATOM_EXT_any, "()Z", "none", "isEmpty", "isNotEmpty", "key", "", "get", "(Ljava/lang/Object;)J", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "getOrDefault", "(Ljava/lang/Object;J)J", "Lkotlin/Function0;", "getOrElse", "(Ljava/lang/Object;Ltb/d1a;)J", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "Ltb/xhv;", pg1.ATOM_EXT_block, "forEachIndexed", "(Ltb/g1a;)V", "Lkotlin/Function2;", "value", pg1.ATOM_EXT_forEach, "(Ltb/u1a;)V", "forEachKey", "forEachValue", "predicate", "all", "(Ltb/u1a;)Z", "count", "()I", "(Ltb/u1a;)I", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "(J)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ltb/u1a;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "findKeyIndex", "(Ljava/lang/Object;)I", "", "metadata", "[J", "getMetadata$annotations", "", "keys", "[Ljava/lang/Object;", "getKeys$annotations", pg1.ATOM_values, "getValues$annotations", "_capacity", TLogTracker.LEVEL_INFO, "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableObjectLongMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ObjectLongMap<K> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public long[] values;

    public /* synthetic */ ObjectLongMap(a07 a07Var) {
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

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66d4712b", new Object[]{objectLongMap, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, new Integer(i2), obj});
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
            return objectLongMap.joinToString(charSequence, charSequence6, charSequence5, i3, charSequence4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb02877", new Object[]{this})).booleanValue() : this._size != 0;
    }

    public final boolean contains(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, k})).booleanValue();
        }
        if (findKeyIndex(k) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsKey(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, k})).booleanValue();
        }
        if (findKeyIndex(k) >= 0) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectLongMap)) {
            return false;
        }
        ObjectLongMap objectLongMap = (ObjectLongMap) obj;
        if (objectLongMap.getSize() != getSize()) {
            return false;
        }
        Object[] objArr = this.keys;
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
                            int i4 = (i << 3) + i3;
                            if (jArr[i4] != objectLongMap.get(objArr[i4])) {
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

    public final int findKeyIndex(K k) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d4a9e22", new Object[]{this, k})).intValue();
        }
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * ScatterMapKt.MurmurHashC1;
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
                if (ckf.b(this.keys[numberOfTrailingZeros], k)) {
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

    public final void forEach(u1a<? super K, ? super Long, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be275416", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.keys;
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
                            int i4 = (i << 3) + i3;
                            u1aVar.invoke(objArr[i4], Long.valueOf(jArr[i4]));
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

    public final long get(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3dfcb6d", new Object[]{this, k})).longValue();
        }
        int findKeyIndex = findKeyIndex(k);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        throw new NoSuchElementException("There is no key " + k + " in the map");
    }

    public final int getCapacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e903eaa", new Object[]{this})).intValue();
        }
        return this._capacity;
    }

    public final long getOrDefault(K k, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fbd614d", new Object[]{this, k, new Long(j)})).longValue();
        }
        int findKeyIndex = findKeyIndex(k);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return j;
    }

    public final long getOrElse(K k, d1a<Long> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff11dd30", new Object[]{this, k, d1aVar})).longValue();
        }
        ckf.g(d1aVar, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
        int findKeyIndex = findKeyIndex(k);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return d1aVar.invoke().longValue();
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
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            long j2 = jArr[i7];
                            if (obj != null) {
                                i = obj.hashCode();
                            } else {
                                i = 0;
                            }
                            i4 += i ^ en9.a(j2);
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

    private ObjectLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = LongSetKt.getEmptyLongArray();
    }

    public final boolean any(u1a<? super K, ? super Long, Boolean> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937fde9c", new Object[]{this, u1aVar})).booleanValue();
        }
        ckf.g(u1aVar, "predicate");
        Object[] objArr = this.keys;
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
                            int i4 = (i << 3) + i3;
                            if (u1aVar.invoke(objArr[i4], Long.valueOf(jArr[i4])).booleanValue()) {
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

    public final int count(u1a<? super K, ? super Long, Boolean> u1aVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d38202e", new Object[]{this, u1aVar})).intValue();
        }
        ckf.g(u1aVar, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
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
                            int i6 = (i2 << 3) + i5;
                            if (u1aVar.invoke(objArr[i6], Long.valueOf(jArr[i6])).booleanValue()) {
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

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u1a u1aVar, int i2, Object obj) {
        int i3;
        int i4;
        char c = 7;
        int i5 = 8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4559cd0", new Object[]{objectLongMap, charSequence, charSequence2, charSequence3, new Integer(i), charSequence4, u1aVar, new Integer(i2), obj});
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
            Object[] objArr = objectLongMap.keys;
            long[] jArr = objectLongMap.values;
            long[] jArr2 = objectLongMap.metadata;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i7 = 0;
                int i8 = 0;
                loop0: while (true) {
                    long j = jArr2[i7];
                    if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        int i10 = i8;
                        int i11 = 0;
                        while (i11 < i9) {
                            if ((j & 255) < 128) {
                                int i12 = (i7 << 3) + i11;
                                Object obj2 = objArr[i12];
                                long j2 = jArr[i12];
                                if (i10 == i6) {
                                    sb.append(str2);
                                    break loop0;
                                }
                                jArr2 = jArr2;
                                if (i10 != 0) {
                                    sb.append(str);
                                }
                                sb.append((CharSequence) u1aVar.invoke(obj2, Long.valueOf(j2)));
                                i4 = 1;
                                i10++;
                                i5 = 8;
                            } else {
                                jArr2 = jArr2;
                                i4 = 1;
                            }
                            j >>= i5;
                            i11 += i4;
                        }
                        jArr2 = jArr2;
                        i3 = 1;
                        if (i9 != i5) {
                            break;
                        }
                        i8 = i10;
                    } else {
                        jArr2 = jArr2;
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
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5 = i + 1) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj = objArr[i6];
                            i = i5;
                            long j2 = jArr[i6];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j2);
                            i3++;
                            if (i3 < this._size) {
                                sb.append(", ");
                            }
                        } else {
                            i = i5;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
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
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6 += i2) {
                        if ((j & 255) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            objArr = objArr;
                            long j2 = jArr[i7];
                            if (i4 == i) {
                                sb.append(charSequence4);
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(obj);
                            sb.append('=');
                            sb.append(j2);
                            i2 = 1;
                            i4++;
                        } else {
                            objArr = objArr;
                            i2 = 1;
                        }
                        j >>= 8;
                    }
                    objArr = objArr;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr;
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

    public final boolean all(u1a<? super K, ? super Long, Boolean> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d154e7d1", new Object[]{this, u1aVar})).booleanValue();
        }
        ckf.g(u1aVar, "predicate");
        Object[] objArr = this.keys;
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
                            int i4 = (i << 3) + i3;
                            if (!u1aVar.invoke(objArr[i4], Long.valueOf(jArr[i4])).booleanValue()) {
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

    public final void forEachKey(g1a<? super K, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe36cf62", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        Object[] objArr = this.keys;
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, u1a<? super K, ? super Long, ? extends CharSequence> u1aVar) {
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
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            StringBuilder sb3 = sb2;
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << c) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < i6) {
                        if ((j & 255) < 128) {
                            int i9 = (i3 << 3) + i8;
                            Object obj = objArr[i9];
                            long j2 = jArr[i9];
                            if (i7 == i) {
                                sb = sb3;
                                sb.append(charSequence4);
                                break loop0;
                            }
                            sb3 = sb3;
                            if (i7 != 0) {
                                sb3.append(charSequence5);
                            }
                            sb3.append((CharSequence) u1aVar.invoke(obj, Long.valueOf(j2)));
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, u1a<? super K, ? super Long, ? extends CharSequence> u1aVar) {
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
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            Object obj = objArr[i8];
                            long j2 = jArr[i8];
                            if (i4 == i) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(obj, Long.valueOf(j2)));
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, u1a<? super K, ? super Long, ? extends CharSequence> u1aVar) {
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
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6 += i2) {
                        if ((j & 255) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            long j2 = jArr[i7];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(obj, Long.valueOf(j2)));
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, u1a<? super K, ? super Long, ? extends CharSequence> u1aVar) {
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
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            Object obj = objArr[i8];
                            long j2 = jArr[i8];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(obj, Long.valueOf(j2)));
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

    public final String joinToString(CharSequence charSequence, u1a<? super K, ? super Long, ? extends CharSequence> u1aVar) {
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
        Object[] objArr = this.keys;
        long[] jArr = this.values;
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
                            int i7 = (i4 << 3) + i3;
                            Object obj = objArr[i7];
                            long j2 = jArr[i7];
                            if (i5 == -1) {
                                sb = sb;
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            sb = sb;
                            if (i5 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append((CharSequence) u1aVar.invoke(obj, Long.valueOf(j2)));
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

    public final String joinToString(u1a<? super K, ? super Long, ? extends CharSequence> u1aVar) {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a7137e", new Object[]{this, u1aVar});
        }
        ckf.g(u1aVar, "transform");
        StringBuilder sb = new StringBuilder("");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    while (i < i6) {
                        if ((j & 255) < 128) {
                            int i7 = (i3 << 3) + i;
                            Object obj = objArr[i7];
                            long j2 = jArr[i7];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) u1aVar.invoke(obj, Long.valueOf(j2)));
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
