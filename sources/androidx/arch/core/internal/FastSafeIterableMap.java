package androidx.arch.core.internal;

import androidx.arch.core.internal.SafeIterableMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final HashMap<K, SafeIterableMap.Entry<K, V>> mHashMap = new HashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(FastSafeIterableMap fastSafeIterableMap, String str, Object... objArr) {
        if (str.hashCode() == 1518226411) {
            return super.remove(objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/arch/core/internal/FastSafeIterableMap");
    }

    public Map.Entry<K, V> ceil(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map.Entry) ipChange.ipc$dispatch("8a5339af", new Object[]{this, k});
        }
        if (contains(k)) {
            return this.mHashMap.get(k).mPrevious;
        }
        return null;
    }

    public boolean contains(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, k})).booleanValue();
        }
        return this.mHashMap.containsKey(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public SafeIterableMap.Entry<K, V> get(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SafeIterableMap.Entry) ipChange.ipc$dispatch("3db3d954", new Object[]{this, k});
        }
        return this.mHashMap.get(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("244c40e", new Object[]{this, k, v});
        }
        SafeIterableMap.Entry<K, V> entry = get(k);
        if (entry != null) {
            return entry.mValue;
        }
        this.mHashMap.put(k, put(k, v));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, k});
        }
        V v = (V) super.remove(k);
        this.mHashMap.remove(k);
        return v;
    }
}
