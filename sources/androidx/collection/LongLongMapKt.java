package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\u001a\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyLongLongMap", "Landroidx/collection/MutableLongLongMap;", "emptyLongLongMap", "Landroidx/collection/LongLongMap;", "longLongMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongLongMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LongLongMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableLongLongMap EmptyLongLongMap = new MutableLongLongMap(0);

    public static final LongLongMap emptyLongLongMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongLongMap) ipChange.ipc$dispatch("d501a5f6", new Object[0]);
        }
        return EmptyLongLongMap;
    }

    public static final LongLongMap longLongMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongLongMap) ipChange.ipc$dispatch("4b59c47a", new Object[0]) : EmptyLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableLongLongMap) ipChange.ipc$dispatch("95c9ce0", new Object[0]) : new MutableLongLongMap(0, 1, null);
    }

    public static final LongLongMap longLongMapOf(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongLongMap) ipChange.ipc$dispatch("fe2c5c7a", new Object[]{new Long(j), new Long(j2)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongLongMap) ipChange.ipc$dispatch("2397cb60", new Object[]{new Long(j), new Long(j2)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongLongMap) ipChange.ipc$dispatch("46b8f47a", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        mutableLongLongMap.set(j3, j4);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongLongMap) ipChange.ipc$dispatch("9bc159e0", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        mutableLongLongMap.set(j3, j4);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long j, long j2, long j3, long j4, long j5, long j6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongLongMap) ipChange.ipc$dispatch("9e7f8c7a", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        mutableLongLongMap.set(j3, j4);
        mutableLongLongMap.set(j5, j6);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j, long j2, long j3, long j4, long j5, long j6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongLongMap) ipChange.ipc$dispatch("afc14860", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        mutableLongLongMap.set(j3, j4);
        mutableLongLongMap.set(j5, j6);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongLongMap) ipChange.ipc$dispatch("1f00247a", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6), new Long(j7), new Long(j8)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        mutableLongLongMap.set(j3, j4);
        mutableLongLongMap.set(j5, j6);
        mutableLongLongMap.set(j7, j8);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongLongMap) ipChange.ipc$dispatch("c37f96e0", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6), new Long(j7), new Long(j8)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        mutableLongLongMap.set(j3, j4);
        mutableLongLongMap.set(j5, j6);
        mutableLongLongMap.set(j7, j8);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongLongMap) ipChange.ipc$dispatch("81babc7a", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6), new Long(j7), new Long(j8), new Long(j9), new Long(j10)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        mutableLongLongMap.set(j3, j4);
        mutableLongLongMap.set(j5, j6);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableLongLongMap) ipChange.ipc$dispatch("e0e44560", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6), new Long(j7), new Long(j8), new Long(j9), new Long(j10)});
        }
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j, j2);
        mutableLongLongMap.set(j3, j4);
        mutableLongLongMap.set(j5, j6);
        mutableLongLongMap.set(j7, j8);
        mutableLongLongMap.set(j9, j10);
        return mutableLongLongMap;
    }
}
