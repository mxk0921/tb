package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00012\n\u0010\b\u001a\u00020\t\"\u00020\u0005\u001a\t\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0015\u0010\n\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\t\"\u00020\u0005H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EmptyLongList", "Landroidx/collection/LongList;", "emptyLongList", "longListOf", "element1", "", "element2", "element3", tep.KEY_UNIFORM_RESULT, "", "mutableLongListOf", "Landroidx/collection/MutableLongList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LongListKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final LongList EmptyLongList = new MutableLongList(0);

    public static final LongList emptyLongList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongList) ipChange.ipc$dispatch("3870b632", new Object[0]);
        }
        return EmptyLongList;
    }

    public static final LongList longListOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongList) ipChange.ipc$dispatch("ae50e868", new Object[0]) : EmptyLongList;
    }

    public static final MutableLongList mutableLongListOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableLongList) ipChange.ipc$dispatch("fbba937a", new Object[0]) : new MutableLongList(0, 1, null);
    }

    public static final LongList longListOf(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongList) ipChange.ipc$dispatch("649e1494", new Object[]{new Long(j)}) : mutableLongListOf(j);
    }

    public static final MutableLongList mutableLongListOf(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongList) ipChange.ipc$dispatch("29ba9b02", new Object[]{new Long(j)});
        }
        MutableLongList mutableLongList = new MutableLongList(1);
        mutableLongList.add(j);
        return mutableLongList;
    }

    public static final LongList longListOf(long j, long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongList) ipChange.ipc$dispatch("77f66de8", new Object[]{new Long(j), new Long(j2)}) : mutableLongListOf(j, j2);
    }

    public static final LongList longListOf(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongList) ipChange.ipc$dispatch("cfa93f14", new Object[]{new Long(j), new Long(j2), new Long(j3)}) : mutableLongListOf(j, j2, j3);
    }

    public static final MutableLongList mutableLongListOf(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongList) ipChange.ipc$dispatch("bbbb847a", new Object[]{new Long(j), new Long(j2)});
        }
        MutableLongList mutableLongList = new MutableLongList(2);
        mutableLongList.add(j);
        mutableLongList.add(j2);
        return mutableLongList;
    }

    public static final LongList longListOf(long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongList) ipChange.ipc$dispatch("d349e9f9", new Object[]{jArr});
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        MutableLongList mutableLongList = new MutableLongList(jArr.length);
        mutableLongList.plusAssign(jArr);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongList) ipChange.ipc$dispatch("69d7ca02", new Object[]{new Long(j), new Long(j2), new Long(j3)});
        }
        MutableLongList mutableLongList = new MutableLongList(3);
        mutableLongList.add(j);
        mutableLongList.add(j2);
        mutableLongList.add(j3);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongList) ipChange.ipc$dispatch("84b88349", new Object[]{jArr});
        }
        ckf.g(jArr, tep.KEY_UNIFORM_RESULT);
        MutableLongList mutableLongList = new MutableLongList(jArr.length);
        mutableLongList.plusAssign(jArr);
        return mutableLongList;
    }
}
