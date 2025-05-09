package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayMap<K, V>.EntrySet mEntrySet;
    public ArrayMap<K, V>.KeySet mKeySet;
    public ArrayMap<K, V>.ValueCollection mValues;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public EntrySet() {
        }

        public static /* synthetic */ Object ipc$super(EntrySet entrySet, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/ArrayMap$EntrySet");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
            }
            return new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return ArrayMap.this.size();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class KeyIterator extends IndexBasedArrayIterator<K> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public KeyIterator() {
            super(ArrayMap.this.size());
        }

        public static /* synthetic */ Object ipc$super(KeyIterator keyIterator, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/ArrayMap$KeyIterator");
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public K elementAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (K) ipChange.ipc$dispatch("c82a5e65", new Object[]{this, new Integer(i)});
            }
            return ArrayMap.this.keyAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public void removeAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b0bdde5", new Object[]{this, new Integer(i)});
            } else {
                ArrayMap.this.removeAt(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mEnd;
        public boolean mEntryValid;
        public int mIndex = -1;

        public MapIterator() {
            this.mEnd = ArrayMap.this.size() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!ContainerHelpersKt.equal(entry.getKey(), ArrayMap.this.keyAt(this.mIndex)) || !ContainerHelpersKt.equal(entry.getValue(), ArrayMap.this.valueAt(this.mIndex))) {
                    return false;
                }
                return true;
            }
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (K) ipChange.ipc$dispatch("24024602", new Object[]{this});
            }
            if (this.mEntryValid) {
                return ArrayMap.this.keyAt(this.mIndex);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            if (this.mEntryValid) {
                return ArrayMap.this.valueAt(this.mIndex);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
            }
            if (this.mIndex < this.mEnd) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            if (this.mEntryValid) {
                K keyAt = ArrayMap.this.keyAt(this.mIndex);
                V valueAt = ArrayMap.this.valueAt(this.mIndex);
                if (keyAt == null) {
                    i = 0;
                } else {
                    i = keyAt.hashCode();
                }
                if (valueAt != null) {
                    i2 = valueAt.hashCode();
                }
                return i2 ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41689b0b", new Object[]{this});
            } else if (this.mEntryValid) {
                ArrayMap.this.removeAt(this.mIndex);
                this.mIndex--;
                this.mEnd--;
                this.mEntryValid = false;
            } else {
                throw new IllegalStateException();
            }
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("b40eb7e0", new Object[]{this, v});
            }
            if (this.mEntryValid) {
                return ArrayMap.this.setValueAt(this.mIndex, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map.Entry) ipChange.ipc$dispatch("48be12c1", new Object[]{this});
            }
            if (hasNext()) {
                this.mIndex++;
                this.mEntryValid = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class ValueIterator extends IndexBasedArrayIterator<V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ValueIterator() {
            super(ArrayMap.this.size());
        }

        public static /* synthetic */ Object ipc$super(ValueIterator valueIterator, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/ArrayMap$ValueIterator");
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public V elementAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("c82a5e65", new Object[]{this, new Integer(i)});
            }
            return ArrayMap.this.valueAt(i);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public void removeAt(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b0bdde5", new Object[]{this, new Integer(i)});
            } else {
                ArrayMap.this.removeAt(i);
            }
        }
    }

    public ArrayMap() {
    }

    public static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("192c0227", new Object[]{set, obj})).booleanValue();
        }
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(ArrayMap arrayMap, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2084926247:
                return super.get(objArr[0]);
            case -1515997081:
                return new Boolean(super.containsKey(objArr[0]));
            case -453046855:
                return new Boolean(super.containsValue(objArr[0]));
            case 1518226411:
                return super.remove(objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/collection/ArrayMap");
        }
    }

    public boolean containsAll(Collection<?> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176f677e", new Object[]{this, collection})).booleanValue();
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsKey(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a3b867", new Object[]{this, obj})).booleanValue();
        }
        return super.containsKey(obj);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsValue(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4ff0db9", new Object[]{this, obj})).booleanValue();
        }
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("b3acf2c6", new Object[]{this});
        }
        ArrayMap<K, V>.EntrySet entrySet = this.mEntrySet;
        if (entrySet != null) {
            return entrySet;
        }
        ArrayMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.mEntrySet = entrySet2;
        return entrySet2;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V get(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, obj});
        }
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        ArrayMap<K, V>.KeySet keySet = this.mKeySet;
        if (keySet != null) {
            return keySet;
        }
        ArrayMap<K, V>.KeySet keySet2 = new KeySet();
        this.mKeySet = keySet2;
        return keySet2;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6703aacc", new Object[]{this, map});
            return;
        }
        ensureCapacity(size() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V remove(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, obj});
        }
        return (V) super.remove(obj);
    }

    public boolean retainAll(Collection<?> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
        }
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(keyAt(size2))) {
                removeAt(size2);
            }
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("26a6afbe", new Object[]{this});
        }
        ArrayMap<K, V>.ValueCollection valueCollection = this.mValues;
        if (valueCollection != null) {
            return valueCollection;
        }
        ArrayMap<K, V>.ValueCollection valueCollection2 = new ValueCollection();
        this.mValues = valueCollection2;
        return valueCollection2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class KeySet implements Set<K> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, k})).booleanValue();
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            } else {
                ArrayMap.this.clear();
            }
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, obj})).booleanValue();
            }
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("176f677e", new Object[]{this, collection})).booleanValue();
            }
            return ArrayMap.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            return ArrayMap.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int i2 = 0;
            for (int size = ArrayMap.this.size() - 1; size >= 0; size--) {
                K keyAt = ArrayMap.this.keyAt(size);
                if (keyAt == null) {
                    i = 0;
                } else {
                    i = keyAt.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
            }
            return new KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
            }
            return ArrayMap.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
            }
            return ArrayMap.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return ArrayMap.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this});
            }
            int size = ArrayMap.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = ArrayMap.this.keyAt(i);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            int indexOfKey = ArrayMap.this.indexOfKey(obj);
            if (indexOfKey < 0) {
                return false;
            }
            ArrayMap.this.removeAt(indexOfKey);
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
            }
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = ArrayMap.this.keyAt(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class ValueCollection implements Collection<V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ValueCollection() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, v})).booleanValue();
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            } else {
                ArrayMap.this.clear();
            }
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, obj})).booleanValue();
            }
            if (ArrayMap.this.__restricted$indexOfValue(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("176f677e", new Object[]{this, collection})).booleanValue();
            }
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
            }
            return new ValueIterator();
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c63b5e58", new Object[]{this, collection})).booleanValue();
            }
            int size = ArrayMap.this.size();
            boolean z = false;
            while (i < size) {
                if (!collection.contains(ArrayMap.this.valueAt(i))) {
                    ArrayMap.this.removeAt(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return ArrayMap.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Object[]) ipChange.ipc$dispatch("a69fe546", new Object[]{this});
            }
            int size = ArrayMap.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = ArrayMap.this.valueAt(i);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
            }
            int __restricted$indexOfValue = ArrayMap.this.__restricted$indexOfValue(obj);
            if (__restricted$indexOfValue < 0) {
                return false;
            }
            ArrayMap.this.removeAt(__restricted$indexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
            }
            int size = ArrayMap.this.size();
            boolean z = false;
            while (i < size) {
                if (collection.contains(ArrayMap.this.valueAt(i))) {
                    ArrayMap.this.removeAt(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T[]) ((Object[]) ipChange.ipc$dispatch("800a0c4d", new Object[]{this, tArr}));
            }
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = ArrayMap.this.valueAt(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public ArrayMap(int i) {
        super(i);
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    public boolean removeAll(Collection<?> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1b8db39", new Object[]{this, collection})).booleanValue();
        }
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }
}
