package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import kotlin.Metadata;
import tb.ckf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0080\b\u001a\u0006\u0010\u000b\u001a\u00020\u0007\u001a\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\u00072\n\u0010\u000f\u001a\u00020\u0001\"\u00020\t\u001a\u0006\u0010\u0010\u001a\u00020\u0005\u001a\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u0010\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u0001\"\u00020\t\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyIntArray", "", "getEmptyIntArray", "()[I", "EmptyIntSet", "Landroidx/collection/MutableIntSet;", "emptyIntSet", "Landroidx/collection/IntSet;", "hash", "", at.k, "intSetOf", "element1", "element2", "element3", tep.KEY_UNIFORM_RESULT, "mutableIntSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IntSetKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);
    private static final int[] EmptyIntArray = new int[0];

    public static final IntSet emptyIntSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntSet) ipChange.ipc$dispatch("c6ead5c0", new Object[0]);
        }
        return EmptyIntSet;
    }

    public static final int[] getEmptyIntArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("1759917c", new Object[0]);
        }
        return EmptyIntArray;
    }

    public static final int hash(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9f3701", new Object[]{new Integer(i)})).intValue();
        }
        int i2 = i * ScatterMapKt.MurmurHashC1;
        return i2 ^ (i2 << 16);
    }

    public static final IntSet intSetOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntSet) ipChange.ipc$dispatch("aed6cef6", new Object[0]) : EmptyIntSet;
    }

    public static final MutableIntSet mutableIntSetOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableIntSet) ipChange.ipc$dispatch("4f02515a", new Object[0]) : new MutableIntSet(0, 1, null);
    }

    public static final IntSet intSetOf(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntSet) ipChange.ipc$dispatch("90a00a95", new Object[]{new Integer(i)}) : mutableIntSetOf(i);
    }

    public static final MutableIntSet mutableIntSetOf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntSet) ipChange.ipc$dispatch("c8a54c0f", new Object[]{new Integer(i)});
        }
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i);
        return mutableIntSet;
    }

    public static final IntSet intSetOf(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntSet) ipChange.ipc$dispatch("e7fe42d6", new Object[]{new Integer(i), new Integer(i2)}) : mutableIntSetOf(i, i2);
    }

    public static final IntSet intSetOf(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntSet) ipChange.ipc$dispatch("7c6712b5", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)}) : mutableIntSetOf(i, i2, i3);
    }

    public static final MutableIntSet mutableIntSetOf(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntSet) ipChange.ipc$dispatch("8361a7fa", new Object[]{new Integer(i), new Integer(i2)});
        }
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i2);
        return mutableIntSet;
    }

    public static final IntSet intSetOf(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntSet) ipChange.ipc$dispatch("605c5768", new Object[]{iArr});
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        MutableIntSet mutableIntSet = new MutableIntSet(iArr.length);
        mutableIntSet.plusAssign(iArr);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntSet) ipChange.ipc$dispatch("2030c96f", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i2);
        mutableIntSet.plusAssign(i3);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntSet) ipChange.ipc$dispatch("5b30ab28", new Object[]{iArr});
        }
        ckf.g(iArr, tep.KEY_UNIFORM_RESULT);
        MutableIntSet mutableIntSet = new MutableIntSet(iArr.length);
        mutableIntSet.plusAssign(iArr);
        return mutableIntSet;
    }
}
