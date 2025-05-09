package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import kotlin.Metadata;
import tb.ckf;
import tb.en9;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0080\b\u001a\u0006\u0010\f\u001a\u00020\u0007\u001a\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b\u001a\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\u00072\n\u0010\u0010\u001a\u00020\u0001\"\u00020\u000b\u001a\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b\u001a\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b\u001a\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b\u001a\u0012\u0010\u0011\u001a\u00020\u00052\n\u0010\u0010\u001a\u00020\u0001\"\u00020\u000b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyLongArray", "", "getEmptyLongArray", "()[J", "EmptyLongSet", "Landroidx/collection/MutableLongSet;", "emptyLongSet", "Landroidx/collection/LongSet;", "hash", "", at.k, "", "longSetOf", "element1", "element2", "element3", tep.KEY_UNIFORM_RESULT, "mutableLongSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LongSetKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableLongSet EmptyLongSet = new MutableLongSet(0);
    private static final long[] EmptyLongArray = new long[0];

    public static final LongSet emptyLongSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSet) ipChange.ipc$dispatch("bd46fb36", new Object[0]);
        }
        return EmptyLongSet;
    }

    public static final long[] getEmptyLongArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("25c4598", new Object[0]);
        }
        return EmptyLongArray;
    }

    public static final int hash(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9f3ac2", new Object[]{new Long(j)})).intValue();
        }
        int a2 = en9.a(j) * ScatterMapKt.MurmurHashC1;
        return a2 ^ (a2 << 16);
    }

    public static final LongSet longSetOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongSet) ipChange.ipc$dispatch("fc7509ba", new Object[0]) : EmptyLongSet;
    }

    public static final MutableLongSet mutableLongSetOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableLongSet) ipChange.ipc$dispatch("12b27c9c", new Object[0]) : new MutableLongSet(0, 1, null);
    }

    public static final LongSet longSetOf(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongSet) ipChange.ipc$dispatch("310f1176", new Object[]{new Long(j)}) : mutableLongSetOf(j);
    }

    public static final MutableLongSet mutableLongSetOf(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongSet) ipChange.ipc$dispatch("b4384394", new Object[]{new Long(j)});
        }
        MutableLongSet mutableLongSet = new MutableLongSet(1);
        mutableLongSet.plusAssign(j);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongSet) ipChange.ipc$dispatch("8fb6013a", new Object[]{new Long(j), new Long(j2)}) : mutableLongSetOf(j, j2);
    }

    public static final LongSet longSetOf(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongSet) ipChange.ipc$dispatch("5ed09f6", new Object[]{new Long(j), new Long(j2), new Long(j3)}) : mutableLongSetOf(j, j2, j3);
    }

    public static final MutableLongSet mutableLongSetOf(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongSet) ipChange.ipc$dispatch("436b5b9c", new Object[]{new Long(j), new Long(j2)});
        }
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        mutableLongSet.plusAssign(j);
        mutableLongSet.plusAssign(j2);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongSet) ipChange.ipc$dispatch("9aea3f09", new Object[]{jArr});
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        MutableLongSet mutableLongSet = new MutableLongSet(jArr.length);
        mutableLongSet.plusAssign(jArr);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongSet) ipChange.ipc$dispatch("9a9b4494", new Object[]{new Long(j), new Long(j2), new Long(j3)});
        }
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        mutableLongSet.plusAssign(j);
        mutableLongSet.plusAssign(j2);
        mutableLongSet.plusAssign(j3);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongSet) ipChange.ipc$dispatch("9c7bc6ed", new Object[]{jArr});
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        MutableLongSet mutableLongSet = new MutableLongSet(jArr.length);
        mutableLongSet.plusAssign(jArr);
        return mutableLongSet;
    }
}
