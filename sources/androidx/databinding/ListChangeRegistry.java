package androidx.databinding;

import androidx.core.util.Pools;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.ObservableList;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, ListChanges> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ALL = 0;
    private static final int CHANGED = 1;
    private static final int INSERTED = 2;
    private static final int MOVED = 3;
    private static final int REMOVED = 4;
    private static final Pools.SynchronizedPool<ListChanges> sListChanges = new Pools.SynchronizedPool<>(10);
    private static final CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges> NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback<ObservableList.OnListChangedCallback, ObservableList, ListChanges>() { // from class: androidx.databinding.ListChangeRegistry.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ListChangeRegistry$1");
        }

        public void onNotifyCallback(ObservableList.OnListChangedCallback onListChangedCallback, ObservableList observableList, int i, ListChanges listChanges) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99b92244", new Object[]{this, onListChangedCallback, observableList, new Integer(i), listChanges});
            } else if (i == 1) {
                onListChangedCallback.onItemRangeChanged(observableList, listChanges.start, listChanges.count);
            } else if (i == 2) {
                onListChangedCallback.onItemRangeInserted(observableList, listChanges.start, listChanges.count);
            } else if (i == 3) {
                onListChangedCallback.onItemRangeMoved(observableList, listChanges.start, listChanges.to, listChanges.count);
            } else if (i != 4) {
                onListChangedCallback.onChanged(observableList);
            } else {
                onListChangedCallback.onItemRangeRemoved(observableList, listChanges.start, listChanges.count);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ListChanges {
        public int count;
        public int start;
        public int to;
    }

    public ListChangeRegistry() {
        super(NOTIFIER_CALLBACK);
    }

    private static ListChanges acquire(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListChanges) ipChange.ipc$dispatch("684201d1", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        ListChanges acquire = sListChanges.acquire();
        if (acquire == null) {
            acquire = new ListChanges();
        }
        acquire.start = i;
        acquire.to = i2;
        acquire.count = i3;
        return acquire;
    }

    public static /* synthetic */ Object ipc$super(ListChangeRegistry listChangeRegistry, String str, Object... objArr) {
        if (str.hashCode() == 1553378487) {
            super.notifyCallbacks((ListChangeRegistry) objArr[0], ((Number) objArr[1]).intValue(), (int) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ListChangeRegistry");
    }

    public void notifyChanged(ObservableList observableList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c902f4", new Object[]{this, observableList});
        } else {
            notifyCallbacks(observableList, 0, (ListChanges) null);
        }
    }

    public void notifyMoved(ObservableList observableList, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c055f26e", new Object[]{this, observableList, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            notifyCallbacks(observableList, 3, acquire(i, i2, i3));
        }
    }

    public void notifyRemoved(ObservableList observableList, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f16d28", new Object[]{this, observableList, new Integer(i), new Integer(i2)});
        } else {
            notifyCallbacks(observableList, 4, acquire(i, 0, i2));
        }
    }

    public synchronized void notifyCallbacks(ObservableList observableList, int i, ListChanges listChanges) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8e7472", new Object[]{this, observableList, new Integer(i), listChanges});
            return;
        }
        super.notifyCallbacks((ListChangeRegistry) observableList, i, (int) listChanges);
        if (listChanges != null) {
            sListChanges.release(listChanges);
        }
    }

    public void notifyChanged(ObservableList observableList, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a27654", new Object[]{this, observableList, new Integer(i), new Integer(i2)});
        } else {
            notifyCallbacks(observableList, 1, acquire(i, 0, i2));
        }
    }

    public void notifyInserted(ObservableList observableList, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc7843e", new Object[]{this, observableList, new Integer(i), new Integer(i2)});
        } else {
            notifyCallbacks(observableList, 2, acquire(i, 0, i2));
        }
    }
}
