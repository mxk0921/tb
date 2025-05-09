package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\r\u001aG\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010\u001aW\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u0013\u001ag\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0019\u001a7\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\u001a\u001aG\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u001b\u001aW\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u001c\u001ag\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u001d\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"EmptyObjectFloatMap", "Landroidx/collection/MutableObjectFloatMap;", "", "emptyObjectFloatMap", "Landroidx/collection/ObjectFloatMap;", "K", "mutableObjectFloatMapOf", "key1", "value1", "", "(Ljava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key2", "value2", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key3", "value3", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key4", "value4", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key5", "value5", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "objectFloatMap", "objectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ObjectFloatMapKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final MutableObjectFloatMap<Object> EmptyObjectFloatMap = new MutableObjectFloatMap<>(0);

    public static final <K> ObjectFloatMap<K> emptyObjectFloatMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectFloatMap) ipChange.ipc$dispatch("c635df28", new Object[0]);
        }
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        ckf.e(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MutableObjectFloatMap) ipChange.ipc$dispatch("1acc8ada", new Object[0]) : new MutableObjectFloatMap<>(0, 1, null);
    }

    public static final <K> ObjectFloatMap<K> objectFloatMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectFloatMap) ipChange.ipc$dispatch("3b005e75", new Object[0]);
        }
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        ckf.e(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectFloatMap) ipChange.ipc$dispatch("b4553ed4", new Object[]{k, new Float(f)});
        }
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableObjectFloatMap) ipChange.ipc$dispatch("98138858", new Object[]{k, new Float(f)});
        }
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k, float f, K k2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectFloatMap) ipChange.ipc$dispatch("3741d89e", new Object[]{k, new Float(f), k2, new Float(f2)});
        }
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f, K k2, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableObjectFloatMap) ipChange.ipc$dispatch("8b90ee1a", new Object[]{k, new Float(f), k2, new Float(f2)});
        }
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectFloatMap) ipChange.ipc$dispatch("93a7c694", new Object[]{k, new Float(f), k2, new Float(f2), k3, new Float(f3)});
        }
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableObjectFloatMap) ipChange.ipc$dispatch("c72bdd18", new Object[]{k, new Float(f), k2, new Float(f2), k3, new Float(f3)});
        }
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3, K k4, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectFloatMap) ipChange.ipc$dispatch("b41cb8de", new Object[]{k, new Float(f), k2, new Float(f2), k3, new Float(f3), k4, new Float(f4)});
        }
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3, K k4, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableObjectFloatMap) ipChange.ipc$dispatch("e930e15a", new Object[]{k, new Float(f), k2, new Float(f2), k3, new Float(f3), k4, new Float(f4)});
        }
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3, K k4, float f4, K k5, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectFloatMap) ipChange.ipc$dispatch("a8967e54", new Object[]{k, new Float(f), k2, new Float(f2), k3, new Float(f3), k4, new Float(f4), k5, new Float(f5)});
        }
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        mutableObjectFloatMap.set(k5, f5);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3, K k4, float f4, K k5, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MutableObjectFloatMap) ipChange.ipc$dispatch("f61ea1d8", new Object[]{k, new Float(f), k2, new Float(f2), k3, new Float(f3), k4, new Float(f4), k5, new Float(f5)});
        }
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        mutableObjectFloatMap.set(k5, f5);
        return mutableObjectFloatMap;
    }
}
