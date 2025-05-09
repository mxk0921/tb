package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u0005¢\u0006\u0002\u0010\r\u001aG\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0010\u001aW\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0013\u001ag\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0018\u001a7\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0019\u001aG\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001a\u001aW\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001b\u001ag\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001c\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"EmptyIntObjectMap", "Landroidx/collection/MutableIntObjectMap;", "", "emptyIntObjectMap", "Landroidx/collection/IntObjectMap;", "V", "intObjectMapOf", "key1", "", "value1", "(ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key2", "value2", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key3", "value3", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key4", "value4", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key5", "value5", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "mutableIntObjectMapOf", "(ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IntObjectMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableIntObjectMap EmptyIntObjectMap = new MutableIntObjectMap(0);

    public static final <V> IntObjectMap<V> emptyIntObjectMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntObjectMap) ipChange.ipc$dispatch("b4a3d0ca", new Object[0]);
        }
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        ckf.e(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntObjectMap) ipChange.ipc$dispatch("f8d56680", new Object[0]);
        }
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        ckf.e(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableIntObjectMap) ipChange.ipc$dispatch("8d3a277a", new Object[0]) : new MutableIntObjectMap<>(0, 1, null);
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntObjectMap) ipChange.ipc$dispatch("a17df899", new Object[]{new Integer(i), v});
        }
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i, v);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntObjectMap) ipChange.ipc$dispatch("c7b6b5f5", new Object[]{new Integer(i), v});
        }
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i, v);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i, V v, int i2, V v2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntObjectMap) ipChange.ipc$dispatch("92e615e0", new Object[]{new Integer(i), v, new Integer(i2), v2});
        }
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i, v);
        mutableIntObjectMap.set(i2, v2);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i, V v, int i2, V v2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntObjectMap) ipChange.ipc$dispatch("3365679a", new Object[]{new Integer(i), v, new Integer(i2), v2});
        }
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i, v);
        mutableIntObjectMap.set(i2, v2);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i, V v, int i2, V v2, int i3, V v3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntObjectMap) ipChange.ipc$dispatch("aba94d39", new Object[]{new Integer(i), v, new Integer(i2), v2, new Integer(i3), v3});
        }
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i, v);
        mutableIntObjectMap.set(i2, v2);
        mutableIntObjectMap.set(i3, v3);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i, V v, int i2, V v2, int i3, V v3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntObjectMap) ipChange.ipc$dispatch("cd7e41d5", new Object[]{new Integer(i), v, new Integer(i2), v2, new Integer(i3), v3});
        }
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i, v);
        mutableIntObjectMap.set(i2, v2);
        mutableIntObjectMap.set(i3, v3);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i, V v, int i2, V v2, int i3, V v3, int i4, V v4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntObjectMap) ipChange.ipc$dispatch("2a583d40", new Object[]{new Integer(i), v, new Integer(i2), v2, new Integer(i3), v3, new Integer(i4), v4});
        }
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i, v);
        mutableIntObjectMap.set(i2, v2);
        mutableIntObjectMap.set(i3, v3);
        mutableIntObjectMap.set(i4, v4);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i, V v, int i2, V v2, int i3, V v3, int i4, V v4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntObjectMap) ipChange.ipc$dispatch("3f3f8fba", new Object[]{new Integer(i), v, new Integer(i2), v2, new Integer(i3), v3, new Integer(i4), v4});
        }
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i, v);
        mutableIntObjectMap.set(i2, v2);
        mutableIntObjectMap.set(i3, v3);
        mutableIntObjectMap.set(i4, v4);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i, V v, int i2, V v2, int i3, V v3, int i4, V v4, int i5, V v5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntObjectMap) ipChange.ipc$dispatch("af5029d9", new Object[]{new Integer(i), v, new Integer(i2), v2, new Integer(i3), v3, new Integer(i4), v4, new Integer(i5), v5});
        }
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i, v);
        mutableIntObjectMap.set(i2, v2);
        mutableIntObjectMap.set(i3, v3);
        mutableIntObjectMap.set(i4, v4);
        mutableIntObjectMap.set(i5, v5);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i, V v, int i2, V v2, int i3, V v3, int i4, V v4, int i5, V v5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntObjectMap) ipChange.ipc$dispatch("ad1de5b5", new Object[]{new Integer(i), v, new Integer(i2), v2, new Integer(i3), v3, new Integer(i4), v4, new Integer(i5), v5});
        }
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i, v);
        mutableIntObjectMap.set(i2, v2);
        mutableIntObjectMap.set(i3, v3);
        mutableIntObjectMap.set(i4, v4);
        mutableIntObjectMap.set(i5, v5);
        return mutableIntObjectMap;
    }
}
