package androidx.databinding;

import androidx.collection.ArrayMap;
import androidx.databinding.ObservableMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ObservableArrayMap<K, V> extends ArrayMap<K, V> implements ObservableMap<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private transient MapChangeRegistry mListeners;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(ObservableArrayMap observableArrayMap, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1272099756:
                super.clear();
                return null;
            case -1109598532:
                return super.setValueAt(((Number) objArr[0]).intValue(), objArr[1]);
            case -605927644:
                return super.put(objArr[0], objArr[1]);
            case 427827181:
                return super.removeAt(((Number) objArr[0]).intValue());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ObservableArrayMap");
        }
    }

    @Override // androidx.databinding.ObservableMap
    public void addOnMapChangedCallback(ObservableMap.OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e448f7dc", new Object[]{this, onMapChangedCallback});
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new MapChangeRegistry();
        }
        this.mListeners.add(onMapChangedCallback);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else if (!isEmpty()) {
            super.clear();
            notifyChange(null);
        }
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
        }
        super.put(k, v);
        notifyChange(k);
        return v;
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("19801fed", new Object[]{this, new Integer(i)});
        }
        K keyAt = keyAt(i);
        V v = (V) super.removeAt(i);
        if (v != null) {
            notifyChange(keyAt);
        }
        return v;
    }

    @Override // androidx.databinding.ObservableMap
    public void removeOnMapChangedCallback(ObservableMap.OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca167259", new Object[]{this, onMapChangedCallback});
            return;
        }
        MapChangeRegistry mapChangeRegistry = this.mListeners;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.remove(onMapChangedCallback);
        }
    }

    @Override // androidx.collection.ArrayMap
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(keyAt(size))) {
                removeAt(size);
                z = true;
            }
        }
        return z;
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("bddcdebc", new Object[]{this, new Integer(i), v});
        }
        K keyAt = keyAt(i);
        V v2 = (V) super.setValueAt(i, v);
        notifyChange(keyAt);
        return v2;
    }

    private void notifyChange(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec60843c", new Object[]{this, obj});
            return;
        }
        MapChangeRegistry mapChangeRegistry = this.mListeners;
        if (mapChangeRegistry != null) {
            mapChangeRegistry.notifyCallbacks(this, 0, obj);
        }
    }

    @Override // androidx.collection.ArrayMap
    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            int indexOfKey = indexOfKey(it.next());
            if (indexOfKey >= 0) {
                removeAt(indexOfKey);
                z = true;
            }
        }
        return z;
    }
}
