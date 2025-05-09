package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00012\n\u0010\b\u001a\u00020\t\"\u00020\u0005\u001a\t\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0015\u0010\n\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\t\"\u00020\u0005H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EmptyIntList", "Landroidx/collection/IntList;", "emptyIntList", "intListOf", "element1", "", "element2", "element3", tep.KEY_UNIFORM_RESULT, "", "mutableIntListOf", "Landroidx/collection/MutableIntList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IntListKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final IntList EmptyIntList = new MutableIntList(0);

    public static final IntList emptyIntList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntList) ipChange.ipc$dispatch("fed3bc16", new Object[0]);
        }
        return EmptyIntList;
    }

    public static final IntList intListOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntList) ipChange.ipc$dispatch("19e82cda", new Object[0]) : EmptyIntList;
    }

    public static final MutableIntList mutableIntListOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableIntList) ipChange.ipc$dispatch("dfd7678e", new Object[0]) : new MutableIntList(0, 1, null);
    }

    public static final IntList intListOf(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntList) ipChange.ipc$dispatch("5d7822e7", new Object[]{new Integer(i)}) : mutableIntListOf(i);
    }

    public static final MutableIntList mutableIntListOf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntList) ipChange.ipc$dispatch("dabeb315", new Object[]{new Integer(i)});
        }
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i);
        return mutableIntList;
    }

    public static final IntList intListOf(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntList) ipChange.ipc$dispatch("8be6ee7a", new Object[]{new Integer(i), new Integer(i2)}) : mutableIntListOf(i, i2);
    }

    public static final IntList intListOf(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntList) ipChange.ipc$dispatch("2b519547", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)}) : mutableIntListOf(i, i2, i3);
    }

    public static final MutableIntList mutableIntListOf(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntList) ipChange.ipc$dispatch("3cc0d86e", new Object[]{new Integer(i), new Integer(i2)});
        }
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i);
        mutableIntList.add(i2);
        return mutableIntList;
    }

    public static final IntList intListOf(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntList) ipChange.ipc$dispatch("1f4b6c28", new Object[]{iArr});
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        mutableIntList.plusAssign(iArr);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntList) ipChange.ipc$dispatch("1b035e35", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i);
        mutableIntList.add(i2);
        mutableIntList.add(i3);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntList) ipChange.ipc$dispatch("5ed23b00", new Object[]{iArr});
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        mutableIntList.plusAssign(iArr);
        return mutableIntList;
    }
}
