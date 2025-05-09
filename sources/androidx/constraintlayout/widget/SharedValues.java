package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SharedValues {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UNSET = -1;
    private SparseIntArray mValues = new SparseIntArray();
    private HashMap<Integer, HashSet<WeakReference<SharedValuesListener>>> mValuesListeners = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface SharedValuesListener {
        void onNewValue(int i, int i2, int i3);
    }

    public void addListener(int i, SharedValuesListener sharedValuesListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a677fce7", new Object[]{this, new Integer(i), sharedValuesListener});
            return;
        }
        HashSet<WeakReference<SharedValuesListener>> hashSet = this.mValuesListeners.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.mValuesListeners.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(sharedValuesListener));
    }

    public void clearListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd6fdf9", new Object[]{this});
        } else {
            this.mValuesListeners.clear();
        }
    }

    public void fireNewValue(int i, int i2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98453dee", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.mValues.get(i, -1);
        if (i3 != i2) {
            this.mValues.put(i, i2);
            HashSet<WeakReference<SharedValuesListener>> hashSet = this.mValuesListeners.get(Integer.valueOf(i));
            if (hashSet != null) {
                Iterator<WeakReference<SharedValuesListener>> it = hashSet.iterator();
                while (it.hasNext()) {
                    SharedValuesListener sharedValuesListener = it.next().get();
                    if (sharedValuesListener != null) {
                        sharedValuesListener.onNewValue(i, i2, i3);
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<WeakReference<SharedValuesListener>> it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        WeakReference<SharedValuesListener> next = it2.next();
                        if (next.get() == null) {
                            arrayList.add(next);
                        }
                    }
                    hashSet.removeAll(arrayList);
                }
            }
        }
    }

    public int getValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6535e474", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mValues.get(i, -1);
    }

    public void removeListener(int i, SharedValuesListener sharedValuesListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c457764", new Object[]{this, new Integer(i), sharedValuesListener});
            return;
        }
        HashSet<WeakReference<SharedValuesListener>> hashSet = this.mValuesListeners.get(Integer.valueOf(i));
        if (hashSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<SharedValuesListener>> it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference<SharedValuesListener> next = it.next();
                SharedValuesListener sharedValuesListener2 = next.get();
                if (sharedValuesListener2 == null || sharedValuesListener2 == sharedValuesListener) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public void removeListener(SharedValuesListener sharedValuesListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f2f6bf", new Object[]{this, sharedValuesListener});
            return;
        }
        for (Integer num : this.mValuesListeners.keySet()) {
            removeListener(num.intValue(), sharedValuesListener);
        }
    }
}
