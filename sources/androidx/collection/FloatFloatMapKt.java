package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\u001a\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyFloatFloatMap", "Landroidx/collection/MutableFloatFloatMap;", "emptyFloatFloatMap", "Landroidx/collection/FloatFloatMap;", "floatFloatMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableFloatFloatMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class FloatFloatMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableFloatFloatMap EmptyFloatFloatMap = new MutableFloatFloatMap(0);

    public static final FloatFloatMap emptyFloatFloatMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatFloatMap) ipChange.ipc$dispatch("68139676", new Object[0]);
        }
        return EmptyFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatFloatMap) ipChange.ipc$dispatch("2bfa16ba", new Object[0]) : EmptyFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableFloatFloatMap) ipChange.ipc$dispatch("9eb01bb0", new Object[0]) : new MutableFloatFloatMap(0, 1, null);
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatFloatMap) ipChange.ipc$dispatch("9fc8a03a", new Object[]{new Float(f), new Float(f2)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatFloatMap) ipChange.ipc$dispatch("3c9d68b0", new Object[]{new Float(f), new Float(f2)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatFloatMap) ipChange.ipc$dispatch("5a1ac9ba", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatFloatMap) ipChange.ipc$dispatch("146b75b0", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatFloatMap) ipChange.ipc$dispatch("c888933a", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatFloatMap) ipChange.ipc$dispatch("30ea42b0", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatFloatMap) ipChange.ipc$dispatch("52a9fcba", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatFloatMap) ipChange.ipc$dispatch("28e9cfb0", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatFloatMap) ipChange.ipc$dispatch("da17063a", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8), new Float(f9), new Float(f10)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        mutableFloatFloatMap.set(f9, f10);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableFloatFloatMap) ipChange.ipc$dispatch("1f3a1cb0", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), new Float(f7), new Float(f8), new Float(f9), new Float(f10)});
        }
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        mutableFloatFloatMap.set(f9, f10);
        return mutableFloatFloatMap;
    }
}
