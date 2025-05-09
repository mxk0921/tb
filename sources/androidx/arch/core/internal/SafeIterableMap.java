package androidx.arch.core.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Entry<K, V> mEnd;
    private final WeakHashMap<SupportRemove<K, V>, Boolean> mIterators = new WeakHashMap<>();
    private int mSize = 0;
    public Entry<K, V> mStart;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AscendingIterator<K, V> extends ListIterator<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AscendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }

        public static /* synthetic */ Object ipc$super(AscendingIterator ascendingIterator, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/arch/core/internal/SafeIterableMap$AscendingIterator");
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public Entry<K, V> backward(Entry<K, V> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Entry) ipChange.ipc$dispatch("ed6ec11c", new Object[]{this, entry});
            }
            return entry.mPrevious;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public Entry<K, V> forward(Entry<K, V> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Entry) ipChange.ipc$dispatch("f58bb07a", new Object[]{this, entry});
            }
            return entry.mNext;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DescendingIterator<K, V> extends ListIterator<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DescendingIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            super(entry, entry2);
        }

        public static /* synthetic */ Object ipc$super(DescendingIterator descendingIterator, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/arch/core/internal/SafeIterableMap$DescendingIterator");
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public Entry<K, V> backward(Entry<K, V> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Entry) ipChange.ipc$dispatch("ed6ec11c", new Object[]{this, entry});
            }
            return entry.mNext;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        public Entry<K, V> forward(Entry<K, V> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Entry) ipChange.ipc$dispatch("f58bb07a", new Object[]{this, entry});
            }
            return entry.mPrevious;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Entry<K, V> implements Map.Entry<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final K mKey;
        public Entry<K, V> mNext;
        public Entry<K, V> mPrevious;
        public final V mValue;

        public Entry(K k, V v) {
            this.mKey = k;
            this.mValue = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!this.mKey.equals(entry.mKey) || !this.mValue.equals(entry.mValue)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (K) ipChange.ipc$dispatch("24024602", new Object[]{this});
            }
            return this.mKey;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return this.mValue;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.mKey.hashCode() ^ this.mValue.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (V) ipChange.ipc$dispatch("b40eb7e0", new Object[]{this, v});
            }
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.mKey + "=" + this.mValue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean mBeforeStart = true;
        private Entry<K, V> mCurrent;

        public IteratorWithAdditions() {
        }

        public static /* synthetic */ Object ipc$super(IteratorWithAdditions iteratorWithAdditions, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/arch/core/internal/SafeIterableMap$IteratorWithAdditions");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
            }
            if (!this.mBeforeStart) {
                Entry<K, V> entry = this.mCurrent;
                if (entry == null || entry.mNext == null) {
                    return false;
                }
                return true;
            } else if (SafeIterableMap.this.mStart != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry<K, V> entry) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f2639f1", new Object[]{this, entry});
                return;
            }
            Entry<K, V> entry2 = this.mCurrent;
            if (entry == entry2) {
                Entry<K, V> entry3 = entry2.mPrevious;
                this.mCurrent = entry3;
                if (entry3 != null) {
                    z = false;
                }
                this.mBeforeStart = z;
            }
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map.Entry) ipChange.ipc$dispatch("48be12c1", new Object[]{this});
            }
            if (this.mBeforeStart) {
                this.mBeforeStart = false;
                this.mCurrent = SafeIterableMap.this.mStart;
            } else {
                Entry<K, V> entry = this.mCurrent;
                this.mCurrent = entry != null ? entry.mNext : null;
            }
            return this.mCurrent;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class ListIterator<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Entry<K, V> mExpectedEnd;
        public Entry<K, V> mNext;

        public ListIterator(Entry<K, V> entry, Entry<K, V> entry2) {
            this.mExpectedEnd = entry2;
            this.mNext = entry;
        }

        public static /* synthetic */ Object ipc$super(ListIterator listIterator, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/arch/core/internal/SafeIterableMap$ListIterator");
        }

        private Entry<K, V> nextNode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Entry) ipChange.ipc$dispatch("87144cb7", new Object[]{this});
            }
            Entry<K, V> entry = this.mNext;
            Entry<K, V> entry2 = this.mExpectedEnd;
            if (entry == entry2 || entry2 == null) {
                return null;
            }
            return forward(entry);
        }

        public abstract Entry<K, V> backward(Entry<K, V> entry);

        public abstract Entry<K, V> forward(Entry<K, V> entry);

        @Override // java.util.Iterator
        public boolean hasNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
            }
            if (this.mNext != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void supportRemove(Entry<K, V> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f2639f1", new Object[]{this, entry});
                return;
            }
            if (this.mExpectedEnd == entry && entry == this.mNext) {
                this.mNext = null;
                this.mExpectedEnd = null;
            }
            Entry<K, V> entry2 = this.mExpectedEnd;
            if (entry2 == entry) {
                this.mExpectedEnd = backward(entry2);
            }
            if (this.mNext == entry) {
                this.mNext = nextNode();
            }
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map.Entry) ipChange.ipc$dispatch("48be12c1", new Object[]{this});
            }
            Entry<K, V> entry = this.mNext;
            this.mNext = nextNode();
            return entry;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class SupportRemove<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void supportRemove(Entry<K, V> entry);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("ff0d414a", new Object[]{this});
        }
        DescendingIterator descendingIterator = new DescendingIterator(this.mEnd, this.mStart);
        this.mIterators.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    public Map.Entry<K, V> eldest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map.Entry) ipChange.ipc$dispatch("89294597", new Object[]{this});
        }
        return this.mStart;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public Entry<K, V> get(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Entry) ipChange.ipc$dispatch("3db3d954", new Object[]{this, k});
        }
        Entry<K, V> entry = this.mStart;
        while (entry != null && !entry.mKey.equals(k)) {
            entry = entry.mNext;
        }
        return entry;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        AscendingIterator ascendingIterator = new AscendingIterator(this.mStart, this.mEnd);
        this.mIterators.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IteratorWithAdditions) ipChange.ipc$dispatch("89b91534", new Object[]{this});
        }
        SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions();
        this.mIterators.put(iteratorWithAdditions, Boolean.FALSE);
        return iteratorWithAdditions;
    }

    public Map.Entry<K, V> newest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map.Entry) ipChange.ipc$dispatch("4d8f9ab4", new Object[]{this});
        }
        return this.mEnd;
    }

    public Entry<K, V> put(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Entry) ipChange.ipc$dispatch("c339d469", new Object[]{this, k, v});
        }
        Entry<K, V> entry = new Entry<>(k, v);
        this.mSize++;
        Entry<K, V> entry2 = this.mEnd;
        if (entry2 == null) {
            this.mStart = entry;
            this.mEnd = entry;
            return entry;
        }
        entry2.mNext = entry;
        entry.mPrevious = entry2;
        this.mEnd = entry;
        return entry;
    }

    public V putIfAbsent(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("244c40e", new Object[]{this, k, v});
        }
        Entry<K, V> entry = get(k);
        if (entry != null) {
            return entry.mValue;
        }
        put(k, v);
        return null;
    }

    public V remove(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, k});
        }
        Entry<K, V> entry = get(k);
        if (entry == null) {
            return null;
        }
        this.mSize--;
        if (!this.mIterators.isEmpty()) {
            for (SupportRemove<K, V> supportRemove : this.mIterators.keySet()) {
                supportRemove.supportRemove(entry);
            }
        }
        Entry<K, V> entry2 = entry.mPrevious;
        if (entry2 != null) {
            entry2.mNext = entry.mNext;
        } else {
            this.mStart = entry.mNext;
        }
        Entry<K, V> entry3 = entry.mNext;
        if (entry3 != null) {
            entry3.mPrevious = entry2;
        } else {
            this.mEnd = entry2;
        }
        entry.mNext = null;
        entry.mPrevious = null;
        return entry.mValue;
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.mSize;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
