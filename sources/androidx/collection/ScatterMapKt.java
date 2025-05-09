package androidx.collection;

import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.Pair;
import tb.ckf;
import tb.ic1;
import tb.pg1;
import tb.slo;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000l\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0001\n\u0002\b\u000b\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aQ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\n\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u0006\u0010\u000b\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0080\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001c\u001a\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b!\u0010\u001c\u001a\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\"\u0010\u001c\u001a \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000eH\u0081\b¢\u0006\u0004\b&\u0010'\u001a0\u0010)\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020%H\u0080\b¢\u0006\u0004\b)\u0010*\u001a(\u0010+\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020%H\u0080\b¢\u0006\u0004\b+\u0010,\u001a \u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u000eH\u0080\b¢\u0006\u0004\b/\u00100\u001a \u00101\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u000eH\u0080\b¢\u0006\u0004\b1\u00100\u001a \u00102\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u000eH\u0080\b¢\u0006\u0004\b2\u00100\u001a\u0018\u00102\u001a\u00020.2\u0006\u0010(\u001a\u00020%H\u0081\b¢\u0006\u0004\b2\u00103\u001a\u0018\u00105\u001a\u00020\u000e*\u00060%j\u0002`4H\u0081\b¢\u0006\u0004\b5\u00106\u001a\u0018\u00108\u001a\u00020\u000e*\u00060%j\u0002`7H\u0080\b¢\u0006\u0004\b8\u00106\u001a\u0018\u00109\u001a\u00020%*\u00060%j\u0002`7H\u0080\b¢\u0006\u0004\b9\u0010:\u001a\u0018\u0010;\u001a\u00020.*\u00060%j\u0002`7H\u0080\b¢\u0006\u0004\b;\u00103\u001a$\u0010=\u001a\u00060%j\u0002`<2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000eH\u0080\b¢\u0006\u0004\b=\u0010'\u001a$\u0010?\u001a\u00060%j\u0002`7*\u00060%j\u0002`<2\u0006\u0010>\u001a\u00020\u000eH\u0081\b¢\u0006\u0004\b?\u0010@\u001a\u001c\u0010A\u001a\u00060%j\u0002`7*\u00060%j\u0002`<H\u0080\b¢\u0006\u0004\bA\u0010:\u001a\u001c\u0010B\u001a\u00060%j\u0002`7*\u00060%j\u0002`<H\u0081\b¢\u0006\u0004\bB\u0010:\"\u0014\u0010C\u001a\u00020%8\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010D\"\u0014\u0010E\u001a\u00020%8\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010D\"\u0014\u0010F\u001a\u00020%8\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010D\"\u001a\u0010G\u001a\u00020%8\u0000X\u0081T¢\u0006\f\n\u0004\bG\u0010D\u0012\u0004\bH\u0010I\"\u0014\u0010J\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bJ\u0010K\"\u0014\u0010L\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010M\"\u0014\u0010N\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010M\"\u0014\u0010O\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\bO\u0010M\"\"\u0010Q\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020P0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\"\u0014\u0010S\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\bS\u0010M\"\u001a\u0010T\u001a\u00020%8\u0000X\u0081T¢\u0006\f\n\u0004\bT\u0010D\u0012\u0004\bU\u0010I\"\u001a\u0010V\u001a\u00020%8\u0000X\u0081T¢\u0006\f\n\u0004\bV\u0010D\u0012\u0004\bW\u0010I*\f\b\u0000\u0010X\"\u00020%2\u00020%*\f\b\u0000\u0010Y\"\u00020%2\u00020%*\f\b\u0000\u0010Z\"\u00020%2\u00020%¨\u0006["}, d2 = {"K", "V", "Landroidx/collection/ScatterMap;", "emptyScatterMap", "()Landroidx/collection/ScatterMap;", "Landroidx/collection/MutableScatterMap;", "mutableScatterMapOf", "()Landroidx/collection/MutableScatterMap;", "", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)Landroidx/collection/MutableScatterMap;", "", "metadata", "", "capacity", "Ltb/xhv;", "convertMetadataForCleanup", "([JI)V", "start", "end", "findEmptySlot", "([JII)I", "", at.k, "hash", "(Ljava/lang/Object;)I", "h1", "(I)I", pg1.ATOM_EXT_h2, "nextCapacity", "n", "normalizeCapacity", "loadedCapacity", "unloadedCapacity", "data", "offset", "", "readRawMetadata", "([JI)J", "value", "writeMetadata", "([JIIJ)V", "writeRawMetadata", "([JIJ)V", "index", "", "isEmpty", "([JI)Z", "isDeleted", slo.KEY_IS_FULL, "(J)Z", "Landroidx/collection/StaticBitmask;", "lowestBitSet", "(J)I", "Landroidx/collection/Bitmask;", "get", "next", "(J)J", "hasNext", "Landroidx/collection/Group;", "group", "m", pg1.ATOM_EXT_match, "(JI)J", "maskEmpty", "maskEmptyOrDeleted", "AllEmpty", "J", "Empty", Constant.VALUE_NAME_VPR_DELETED, "Sentinel", "getSentinel$annotations", "()V", "EmptyGroup", "[J", "GroupWidth", TLogTracker.LEVEL_INFO, "ClonedMetadataCount", "DefaultScatterCapacity", "", "EmptyScatterMap", "Landroidx/collection/MutableScatterMap;", "MurmurHashC1", "BitmaskLsb", "getBitmaskLsb$annotations", "BitmaskMsb", "getBitmaskMsb$annotations", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ScatterMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScatterMap) ipChange.ipc$dispatch("b6d1de2a", new Object[0]);
        }
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        ckf.e(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72fc197a", new Object[]{new Long(j)})).intValue();
        }
        return Long.numberOfTrailingZeros(j) >> 3;
    }

    public static /* synthetic */ void getBitmaskLsb$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb39a07f", new Object[0]);
        }
    }

    public static /* synthetic */ void getBitmaskMsb$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e40240", new Object[0]);
        }
    }

    public static /* synthetic */ void getSentinel$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af172a1", new Object[0]);
        }
    }

    public static final int h1(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d3c10826", new Object[]{new Integer(i)})).intValue() : i >>> 7;
    }

    public static final int h2(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d575e0c5", new Object[]{new Integer(i)})).intValue() : i & 127;
    }

    public static final boolean hasNext(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fab294", new Object[]{new Long(j)})).booleanValue();
        }
        if (j != 0) {
            return true;
        }
        return false;
    }

    public static final int hash(Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8ca6324", new Object[]{obj})).intValue();
        }
        if (obj != null) {
            i = obj.hashCode();
        }
        int i2 = i * MurmurHashC1;
        return (i2 << 16) ^ i2;
    }

    public static final boolean isFull(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df72e3e8", new Object[]{new Long(j)})).booleanValue() : j < 128;
    }

    public static final int loadedCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20653ed0", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int lowestBitSet(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("723f0709", new Object[]{new Long(j)})).intValue();
        }
        return Long.numberOfTrailingZeros(j) >> 3;
    }

    public static final long maskEmpty(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("705371f0", new Object[]{new Long(j)})).longValue();
        }
        return j & ((~j) << 6) & (-9187201950435737472L);
    }

    public static final long maskEmptyOrDeleted(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29b483c", new Object[]{new Long(j)})).longValue();
        }
        return j & ((~j) << 7) & (-9187201950435737472L);
    }

    public static final long match(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ea8057f", new Object[]{new Long(j), new Integer(i)})).longValue();
        }
        long j2 = j ^ (i * BitmaskLsb);
        return (~j2) & (j2 - BitmaskLsb) & (-9187201950435737472L);
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableScatterMap) ipChange.ipc$dispatch("6b688a3a", new Object[0]) : new MutableScatterMap<>(0, 1, null);
    }

    public static final long next(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45b7d7fe", new Object[]{new Long(j)})).longValue();
        }
        return j & (j - 1);
    }

    public static final int normalizeCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7f2bcc8", new Object[]{new Integer(i)})).intValue();
        }
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final long readRawMetadata(long[] jArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d1dbd00", new Object[]{jArr, new Integer(i)})).longValue();
        }
        ckf.g(jArr, "data");
        return (jArr[i >> 3] >> ((i & 7) << 3)) & 255;
    }

    public static final int unloadedCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69d78f97", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 7) {
            return 8;
        }
        return i + ((i - 1) / 7);
    }

    public static final long group(long[] jArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52b920c2", new Object[]{jArr, new Integer(i)})).longValue();
        }
        ckf.g(jArr, "metadata");
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        return (((-i3) >> 63) & (jArr[i2 + 1] << (64 - i3))) | (jArr[i2] >>> i3);
    }

    public static final boolean isFull(long[] jArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf47df38", new Object[]{jArr, new Integer(i)})).booleanValue();
        }
        ckf.g(jArr, "metadata");
        return ((jArr[i >> 3] >> ((i & 7) << 3)) & 255) < 128;
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(Pair<? extends K, ? extends V>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableScatterMap) ipChange.ipc$dispatch("3615013e", new Object[]{pairArr});
        }
        ckf.g(pairArr, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairArr.length);
        mutableScatterMap.putAll(pairArr);
        return mutableScatterMap;
    }

    public static final int nextCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e49a96a2", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final void writeMetadata(long[] jArr, int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf370ca0", new Object[]{jArr, new Integer(i), new Integer(i2), new Long(j)});
            return;
        }
        ckf.g(jArr, "data");
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        long j2 = (j << i4) | (jArr[i3] & (~(255 << i4)));
        jArr[i3] = j2;
        jArr[(((i2 - 7) & i) + (i & 7)) >> 3] = j2;
    }

    public static final void writeRawMetadata(long[] jArr, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c66be4f", new Object[]{jArr, new Integer(i), new Long(j)});
            return;
        }
        ckf.g(jArr, "data");
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (j << i3) | (jArr[i2] & (~(255 << i3)));
    }

    public static final void convertMetadataForCleanup(long[] jArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b14ac50", new Object[]{jArr, new Integer(i)});
            return;
        }
        ckf.g(jArr, "metadata");
        int i2 = (i + 7) >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int J = ic1.J(jArr);
        int i4 = J - 1;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[J] = jArr[0];
    }

    public static final int findEmptySlot(long[] jArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53b1119b", new Object[]{jArr, new Integer(i), new Integer(i2)})).intValue();
        }
        ckf.g(jArr, "metadata");
        while (i < i2) {
            if (((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 128) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final boolean isDeleted(long[] jArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("872e4dc2", new Object[]{jArr, new Integer(i)})).booleanValue();
        }
        ckf.g(jArr, "metadata");
        return ((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 254;
    }

    public static final boolean isEmpty(long[] jArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("346ce08e", new Object[]{jArr, new Integer(i)})).booleanValue();
        }
        ckf.g(jArr, "metadata");
        return ((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 128;
    }
}
