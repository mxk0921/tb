package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyFloatIntMap", "Landroidx/collection/MutableFloatIntMap;", "emptyFloatIntMap", "Landroidx/collection/FloatIntMap;", "floatIntMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableFloatIntMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FloatIntMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableFloatIntMap EmptyFloatIntMap = new MutableFloatIntMap(0);

    public static final FloatIntMap emptyFloatIntMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatIntMap) ipChange.ipc$dispatch("61d5016", new Object[0]);
        }
        return EmptyFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatIntMap) ipChange.ipc$dispatch("4727d15a", new Object[0]) : EmptyFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableFloatIntMap) ipChange.ipc$dispatch("5d93cf16", new Object[0]) : new MutableFloatIntMap(0, 1, null);
    }

    public static final FloatIntMap floatIntMapOf(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatIntMap) ipChange.ipc$dispatch("a9c97add", new Object[]{new Float(f), new Integer(i)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatIntMap) ipChange.ipc$dispatch("4d54c2b3", new Object[]{new Float(f), new Integer(i)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f, int i, float f2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatIntMap) ipChange.ipc$dispatch("eaa6cfa0", new Object[]{new Float(f), new Integer(i), new Float(f2), new Integer(i2)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatIntMap) ipChange.ipc$dispatch("50a74310", new Object[]{new Float(f), new Integer(i), new Float(f2), new Integer(i2)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f, int i, float f2, int i2, float f3, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatIntMap) ipChange.ipc$dispatch("6981ffa3", new Object[]{new Float(f), new Integer(i), new Float(f2), new Integer(i2), new Float(f3), new Integer(i3)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2, float f3, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatIntMap) ipChange.ipc$dispatch("c95b202d", new Object[]{new Float(f), new Integer(i), new Float(f2), new Integer(i2), new Float(f3), new Integer(i3)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatIntMap) ipChange.ipc$dispatch("9e513ae6", new Object[]{new Float(f), new Integer(i), new Float(f2), new Integer(i2), new Float(f3), new Integer(i3), new Float(f4), new Integer(i4)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatIntMap) ipChange.ipc$dispatch("e48c2a0a", new Object[]{new Float(f), new Integer(i), new Float(f2), new Integer(i2), new Float(f3), new Integer(i3), new Float(f4), new Integer(i4)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4, float f5, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatIntMap) ipChange.ipc$dispatch("dc3eb169", new Object[]{new Float(f), new Integer(i), new Float(f2), new Integer(i2), new Float(f3), new Integer(i3), new Float(f4), new Integer(i4), new Float(f5), new Integer(i5)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        mutableFloatIntMap.set(f5, i5);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4, float f5, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatIntMap) ipChange.ipc$dispatch("f7a230a7", new Object[]{new Float(f), new Integer(i), new Float(f2), new Integer(i2), new Float(f3), new Integer(i3), new Float(f4), new Integer(i4), new Float(f5), new Integer(i5)});
        }
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        mutableFloatIntMap.set(f5, i5);
        return mutableFloatIntMap;
    }
}
