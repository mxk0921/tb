package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\u001a\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyIntIntMap", "Landroidx/collection/MutableIntIntMap;", "emptyIntIntMap", "Landroidx/collection/IntIntMap;", "intIntMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableIntIntMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class IntIntMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableIntIntMap EmptyIntIntMap = new MutableIntIntMap(0);

    public static final IntIntMap emptyIntIntMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntIntMap) ipChange.ipc$dispatch("a662ef76", new Object[0]);
        }
        return EmptyIntIntMap;
    }

    public static final IntIntMap intIntMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IntIntMap) ipChange.ipc$dispatch("ce7a483a", new Object[0]) : EmptyIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableIntIntMap) ipChange.ipc$dispatch("95163f70", new Object[0]) : new MutableIntIntMap(0, 1, null);
    }

    public static final IntIntMap intIntMapOf(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntIntMap) ipChange.ipc$dispatch("13919a1a", new Object[]{new Integer(i), new Integer(i2)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntIntMap) ipChange.ipc$dispatch("13691810", new Object[]{new Integer(i), new Integer(i2)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntIntMap) ipChange.ipc$dispatch("701bf3fa", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntIntMap) ipChange.ipc$dispatch("486848b0", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntIntMap) ipChange.ipc$dispatch("d37755da", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntIntMap) ipChange.ipc$dispatch("3a5dd150", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntIntMap) ipChange.ipc$dispatch("cd81bfba", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        mutableIntIntMap.set(i7, i8);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntIntMap) ipChange.ipc$dispatch("8513b1f0", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        mutableIntIntMap.set(i7, i8);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntIntMap) ipChange.ipc$dispatch("6e99319a", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        mutableIntIntMap.set(i7, i8);
        mutableIntIntMap.set(i9, i10);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableIntIntMap) ipChange.ipc$dispatch("f9d3ea90", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10)});
        }
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        mutableIntIntMap.set(i7, i8);
        mutableIntIntMap.set(i9, i10);
        return mutableIntIntMap;
    }
}
