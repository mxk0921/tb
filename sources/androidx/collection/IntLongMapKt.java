package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyIntLongMap", "Landroidx/collection/MutableIntLongMap;", "emptyIntLongMap", "Landroidx/collection/IntLongMap;", "intLongMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableIntLongMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IntLongMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableIntLongMap EmptyIntLongMap = new MutableIntLongMap(0);

    public static final IntLongMap emptyIntLongMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntLongMap) ipChange.ipc$dispatch("10ff4684", new Object[0]);
        }
        return EmptyIntLongMap;
    }

    public static final IntLongMap intLongMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntLongMap) ipChange.ipc$dispatch("415855ba", new Object[0]) : EmptyIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableIntLongMap) ipChange.ipc$dispatch("9362cc1a", new Object[0]) : new MutableIntLongMap(0, 1, null);
    }

    public static final IntLongMap intLongMapOf(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntLongMap) ipChange.ipc$dispatch("5918d39", new Object[]{new Integer(i), new Long(j)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntLongMap) ipChange.ipc$dispatch("e98b5e3b", new Object[]{new Integer(i), new Long(j)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i, long j, int i2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntLongMap) ipChange.ipc$dispatch("a05ae0f8", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Long(j2)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntLongMap) ipChange.ipc$dispatch("57d7ec1c", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Long(j2)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i, long j, int i2, long j2, int i3, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntLongMap) ipChange.ipc$dispatch("ae1e40f7", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Long(j2), new Integer(i3), new Long(j3)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2, int i3, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntLongMap) ipChange.ipc$dispatch("653885bd", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Long(j2), new Integer(i3), new Long(j3)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntLongMap) ipChange.ipc$dispatch("58899d36", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Long(j2), new Integer(i3), new Long(j3), new Integer(i4), new Long(j4)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntLongMap) ipChange.ipc$dispatch("9cd93b1e", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Long(j2), new Integer(i3), new Long(j3), new Integer(i4), new Long(j4)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4, int i5, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntLongMap) ipChange.ipc$dispatch("158ee5b5", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Long(j2), new Integer(i3), new Long(j3), new Integer(i4), new Long(j4), new Integer(i5), new Long(j5)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        mutableIntLongMap.set(i5, j5);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4, int i5, long j5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntLongMap) ipChange.ipc$dispatch("6f221c3f", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Long(j2), new Integer(i3), new Long(j3), new Integer(i4), new Long(j4), new Integer(i5), new Long(j5)});
        }
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        mutableIntLongMap.set(i5, j5);
        return mutableIntLongMap;
    }
}
