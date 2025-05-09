package androidx.databinding;

import androidx.databinding.ObservableList;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ObservableArrayList<T> extends ArrayList<T> implements ObservableList<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private transient ListChangeRegistry mListeners = new ListChangeRegistry();

    public static /* synthetic */ Object ipc$super(ObservableArrayList observableArrayList, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1530880303:
                return new Boolean(super.addAll(((Number) objArr[0]).intValue(), (Collection) objArr[1]));
            case -1306005412:
                return super.set(((Number) objArr[0]).intValue(), objArr[1]);
            case -1272099756:
                super.clear();
                return null;
            case -475350822:
                return super.remove(((Number) objArr[0]).intValue());
            case 117664640:
                super.removeRange(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 195222152:
                return new Boolean(super.add(objArr[0]));
            case 497758839:
                super.add(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 1730268220:
                return new Boolean(super.addAll((Collection) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ObservableArrayList");
        }
    }

    private void notifyAdd(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49d45bf", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ListChangeRegistry listChangeRegistry = this.mListeners;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyInserted(this, i, i2);
        }
    }

    private void notifyRemove(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf41aa94", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ListChangeRegistry listChangeRegistry = this.mListeners;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyRemoved(this, i, i2);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, t})).booleanValue();
        }
        super.add(t);
        notifyAdd(size() - 1, 1);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
        }
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            notifyAdd(size, size() - size);
        }
        return addAll;
    }

    @Override // androidx.databinding.ObservableList
    public void addOnListChangedCallback(ObservableList.OnListChangedCallback onListChangedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42118f8c", new Object[]{this, onListChangedCallback});
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new ListChangeRegistry();
        }
        this.mListeners.add(onListChangedCallback);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        int size = size();
        super.clear();
        if (size != 0) {
            notifyRemove(0, size);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e3aab8da", new Object[]{this, new Integer(i)});
        }
        T t = (T) super.remove(i);
        notifyRemove(i, 1);
        return t;
    }

    @Override // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(ObservableList.OnListChangedCallback onListChangedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d2a7ef", new Object[]{this, onListChangedCallback});
            return;
        }
        ListChangeRegistry listChangeRegistry = this.mListeners;
        if (listChangeRegistry != null) {
            listChangeRegistry.remove(onListChangedCallback);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7036b80", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.removeRange(i, i2);
        notifyRemove(i, i2 - i);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("b227f05c", new Object[]{this, new Integer(i), t});
        }
        T t2 = (T) super.set(i, t);
        ListChangeRegistry listChangeRegistry = this.mListeners;
        if (listChangeRegistry != null) {
            listChangeRegistry.notifyChanged(this, i, 1);
        }
        return t2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dab3277", new Object[]{this, new Integer(i), t});
            return;
        }
        super.add(i, t);
        notifyAdd(i, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec2dfe2b", new Object[]{this, obj})).booleanValue();
        }
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4c09ed1", new Object[]{this, new Integer(i), collection})).booleanValue();
        }
        boolean addAll = super.addAll(i, collection);
        if (addAll) {
            notifyAdd(i, collection.size());
        }
        return addAll;
    }
}
