package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyFloatLongMap", "Landroidx/collection/MutableFloatLongMap;", "emptyFloatLongMap", "Landroidx/collection/FloatLongMap;", "floatLongMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableFloatLongMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FloatLongMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableFloatLongMap EmptyFloatLongMap = new MutableFloatLongMap(0);

    public static final FloatLongMap emptyFloatLongMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatLongMap) ipChange.ipc$dispatch("f814c79e", new Object[0]);
        }
        return EmptyFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatLongMap) ipChange.ipc$dispatch("7760cad4", new Object[0]) : EmptyFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableFloatLongMap) ipChange.ipc$dispatch("ff493bba", new Object[0]) : new MutableFloatLongMap(0, 1, null);
    }

    public static final FloatLongMap floatLongMapOf(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatLongMap) ipChange.ipc$dispatch("d8ac6cd0", new Object[]{new Float(f), new Long(j)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatLongMap) ipChange.ipc$dispatch("60fccbe", new Object[]{new Float(f), new Long(j)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f, long j, float f2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatLongMap) ipChange.ipc$dispatch("15977fcc", new Object[]{new Float(f), new Long(j), new Float(f2), new Long(j2)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatLongMap) ipChange.ipc$dispatch("75762cc2", new Object[]{new Float(f), new Long(j), new Float(f2), new Long(j2)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f, long j, float f2, long j2, float f3, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatLongMap) ipChange.ipc$dispatch("c409c3c8", new Object[]{new Float(f), new Long(j), new Float(f2), new Long(j2), new Float(f3), new Long(j3)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2, float f3, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatLongMap) ipChange.ipc$dispatch("a4c49bc6", new Object[]{new Float(f), new Long(j), new Float(f2), new Long(j2), new Float(f3), new Long(j3)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatLongMap) ipChange.ipc$dispatch("9efaf8c4", new Object[]{new Float(f), new Long(j), new Float(f2), new Long(j2), new Float(f3), new Long(j3), new Float(f4), new Long(j4)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatLongMap) ipChange.ipc$dispatch("3a3359ca", new Object[]{new Float(f), new Long(j), new Float(f2), new Long(j2), new Float(f3), new Long(j3), new Float(f4), new Long(j4)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4, float f5, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatLongMap) ipChange.ipc$dispatch("8272dec0", new Object[]{new Float(f), new Long(j), new Float(f2), new Long(j2), new Float(f3), new Long(j3), new Float(f4), new Long(j4), new Float(f5), new Long(j5)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        mutableFloatLongMap.set(f5, j5);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4, float f5, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatLongMap) ipChange.ipc$dispatch("2eeaa6ce", new Object[]{new Float(f), new Long(j), new Float(f2), new Long(j2), new Float(f3), new Long(j3), new Float(f4), new Long(j4), new Float(f5), new Long(j5)});
        }
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        mutableFloatLongMap.set(f5, j5);
        return mutableFloatLongMap;
    }
}
