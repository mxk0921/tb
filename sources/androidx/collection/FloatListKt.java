package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00012\n\u0010\b\u001a\u00020\t\"\u00020\u0005\u001a\t\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0015\u0010\n\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\t\"\u00020\u0005H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EmptyFloatList", "Landroidx/collection/FloatList;", "emptyFloatList", "floatListOf", "element1", "", "element2", "element3", tep.KEY_UNIFORM_RESULT, "", "mutableFloatListOf", "Landroidx/collection/MutableFloatList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FloatListKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final FloatList EmptyFloatList = new MutableFloatList(0);

    public static final FloatList emptyFloatList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatList) ipChange.ipc$dispatch("b3b043b6", new Object[0]);
        }
        return EmptyFloatList;
    }

    public static final FloatList floatListOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatList) ipChange.ipc$dispatch("72729cfa", new Object[0]) : EmptyFloatList;
    }

    public static final MutableFloatList mutableFloatListOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableFloatList) ipChange.ipc$dispatch("e5a9e9b4", new Object[0]) : new MutableFloatList(0, 1, null);
    }

    public static final FloatList floatListOf(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatList) ipChange.ipc$dispatch("cfd38a8a", new Object[]{new Float(f)}) : mutableFloatListOf(f);
    }

    public static final MutableFloatList mutableFloatListOf(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatList) ipChange.ipc$dispatch("a3361a58", new Object[]{new Float(f)});
        }
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.add(f);
        return mutableFloatList;
    }

    public static final FloatList floatListOf(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatList) ipChange.ipc$dispatch("1e904efa", new Object[]{new Float(f), new Float(f2)}) : mutableFloatListOf(f, f2);
    }

    public static final FloatList floatListOf(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatList) ipChange.ipc$dispatch("a76c188a", new Object[]{new Float(f), new Float(f2), new Float(f3)}) : mutableFloatListOf(f, f2, f3);
    }

    public static final MutableFloatList mutableFloatListOf(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatList) ipChange.ipc$dispatch("972ffe34", new Object[]{new Float(f), new Float(f2)});
        }
        MutableFloatList mutableFloatList = new MutableFloatList(2);
        mutableFloatList.add(f);
        mutableFloatList.add(f2);
        return mutableFloatList;
    }

    public static final FloatList floatListOf(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatList) ipChange.ipc$dispatch("222b6585", new Object[]{fArr});
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        MutableFloatList mutableFloatList = new MutableFloatList(fArr.length);
        mutableFloatList.plusAssign(fArr);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatList) ipChange.ipc$dispatch("227295d8", new Object[]{new Float(f), new Float(f2), new Float(f3)});
        }
        MutableFloatList mutableFloatList = new MutableFloatList(3);
        mutableFloatList.add(f);
        mutableFloatList.add(f2);
        mutableFloatList.add(f3);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatList) ipChange.ipc$dispatch("20538549", new Object[]{fArr});
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        MutableFloatList mutableFloatList = new MutableFloatList(fArr.length);
        mutableFloatList.plusAssign(fArr);
        return mutableFloatList;
    }
}
