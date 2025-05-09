package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyLongFloatMap", "Landroidx/collection/MutableLongFloatMap;", "emptyLongFloatMap", "Landroidx/collection/LongFloatMap;", "longFloatMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongFloatMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LongFloatMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableLongFloatMap EmptyLongFloatMap = new MutableLongFloatMap(0);

    public static final LongFloatMap emptyLongFloatMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongFloatMap) ipChange.ipc$dispatch("f407102e", new Object[0]);
        }
        return EmptyLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongFloatMap) ipChange.ipc$dispatch("2383a164", new Object[0]) : EmptyLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableLongFloatMap) ipChange.ipc$dispatch("97a6d0ba", new Object[0]) : new MutableLongFloatMap(0, 1, null);
    }

    public static final LongFloatMap longFloatMapOf(long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongFloatMap) ipChange.ipc$dispatch("68b6bde8", new Object[]{new Long(j), new Float(f)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongFloatMap) ipChange.ipc$dispatch("57a87e36", new Object[]{new Long(j), new Float(f)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j, float f, long j2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongFloatMap) ipChange.ipc$dispatch("2d94c96c", new Object[]{new Long(j), new Float(f), new Long(j2), new Float(f2)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j, float f, long j2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongFloatMap) ipChange.ipc$dispatch("1df4bcb2", new Object[]{new Long(j), new Float(f), new Long(j2), new Float(f2)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j, float f, long j2, float f2, long j3, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongFloatMap) ipChange.ipc$dispatch("331e03f0", new Object[]{new Long(j), new Float(f), new Long(j2), new Float(f2), new Long(j3), new Float(f3)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j, float f, long j2, float f2, long j3, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongFloatMap) ipChange.ipc$dispatch("822b4c2e", new Object[]{new Long(j), new Float(f), new Long(j2), new Float(f2), new Long(j3), new Float(f3)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j, float f, long j2, float f2, long j3, float f3, long j4, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongFloatMap) ipChange.ipc$dispatch("fb42ad74", new Object[]{new Long(j), new Float(f), new Long(j2), new Float(f2), new Long(j3), new Float(f3), new Long(j4), new Float(f4)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j, float f, long j2, float f2, long j3, float f3, long j4, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongFloatMap) ipChange.ipc$dispatch("b2fbecaa", new Object[]{new Long(j), new Float(f), new Long(j2), new Float(f2), new Long(j3), new Float(f3), new Long(j4), new Float(f4)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j, float f, long j2, float f2, long j3, float f3, long j4, float f4, long j5, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongFloatMap) ipChange.ipc$dispatch("4ce305f8", new Object[]{new Long(j), new Float(f), new Long(j2), new Float(f2), new Long(j3), new Float(f3), new Long(j4), new Float(f4), new Long(j5), new Float(f5)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        mutableLongFloatMap.set(j5, f5);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j, float f, long j2, float f2, long j3, float f3, long j4, float f4, long j5, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongFloatMap) ipChange.ipc$dispatch("f2265e26", new Object[]{new Long(j), new Float(f), new Long(j2), new Float(f2), new Long(j3), new Float(f3), new Long(j4), new Float(f4), new Long(j5), new Float(f5)});
        }
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j, f);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        mutableLongFloatMap.set(j5, f5);
        return mutableLongFloatMap;
    }
}
