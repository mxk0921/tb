package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import kotlin.Metadata;
import tb.ckf;
import tb.tep;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u0012\u0010\b\u001a\u00020\u00072\n\u0010\r\u001a\u00020\u0001\"\u00020\n\u001a\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0080\b\u001a\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u0012\u0010\u0011\u001a\u00020\u00052\n\u0010\r\u001a\u00020\u0001\"\u00020\n\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyFloatArray", "", "getEmptyFloatArray", "()[F", "EmptyFloatSet", "Landroidx/collection/MutableFloatSet;", "emptyFloatSet", "Landroidx/collection/FloatSet;", "floatSetOf", "element1", "", "element2", "element3", tep.KEY_UNIFORM_RESULT, "hash", "", at.k, "mutableFloatSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FloatSetKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);
    private static final float[] EmptyFloatArray = new float[0];

    public static final FloatSet emptyFloatSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatSet) ipChange.ipc$dispatch("58eb62da", new Object[0]);
        }
        return EmptyFloatSet;
    }

    public static final FloatSet floatSetOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatSet) ipChange.ipc$dispatch("2df95010", new Object[0]) : EmptyFloatSet;
    }

    public static final float[] getEmptyFloatArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("a0f5f166", new Object[0]);
        }
        return EmptyFloatArray;
    }

    public static final int hash(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9f2bbe", new Object[]{new Float(f)})).intValue();
        }
        int floatToIntBits = Float.floatToIntBits(f) * ScatterMapKt.MurmurHashC1;
        return floatToIntBits ^ (floatToIntBits << 16);
    }

    public static final MutableFloatSet mutableFloatSetOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableFloatSet) ipChange.ipc$dispatch("4f95c1fa", new Object[0]) : new MutableFloatSet(0, 1, null);
    }

    public static final FloatSet floatSetOf(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatSet) ipChange.ipc$dispatch("3ddad498", new Object[]{new Float(f)}) : mutableFloatSetOf(f);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatSet) ipChange.ipc$dispatch("b1da91a6", new Object[]{new Float(f)});
        }
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatSet) ipChange.ipc$dispatch("2a29e110", new Object[]{new Float(f), new Float(f2)}) : mutableFloatSetOf(f, f2);
    }

    public static final FloatSet floatSetOf(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatSet) ipChange.ipc$dispatch("c7bc6398", new Object[]{new Float(f), new Float(f2), new Float(f3)}) : mutableFloatSetOf(f, f2, f3);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatSet) ipChange.ipc$dispatch("982fb77a", new Object[]{new Float(f), new Float(f2)});
        }
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f);
        mutableFloatSet.plusAssign(f2);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatSet) ipChange.ipc$dispatch("7cdc4d25", new Object[]{fArr});
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        MutableFloatSet mutableFloatSet = new MutableFloatSet(fArr.length);
        mutableFloatSet.plusAssign(fArr);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatSet) ipChange.ipc$dispatch("7c7f4c26", new Object[]{new Float(f), new Float(f2), new Float(f3)});
        }
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f);
        mutableFloatSet.plusAssign(f2);
        mutableFloatSet.plusAssign(f3);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float... fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatSet) ipChange.ipc$dispatch("bda479c5", new Object[]{fArr});
        }
        ckf.g(fArr, tep.KEY_UNIFORM_RESULT);
        MutableFloatSet mutableFloatSet = new MutableFloatSet(fArr.length);
        mutableFloatSet.plusAssign(fArr);
        return mutableFloatSet;
    }
}
