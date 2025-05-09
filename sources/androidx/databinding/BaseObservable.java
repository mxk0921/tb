package androidx.databinding;

import androidx.databinding.Observable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BaseObservable implements Observable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private transient PropertyChangeRegistry mCallbacks;

    @Override // androidx.databinding.Observable
    public void addOnPropertyChangedCallback(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23abff78", new Object[]{this, onPropertyChangedCallback});
            return;
        }
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new PropertyChangeRegistry();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mCallbacks.add(onPropertyChangedCallback);
    }

    public void notifyChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779aec60", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.mCallbacks;
                if (propertyChangeRegistry != null) {
                    propertyChangeRegistry.notifyCallbacks(this, 0, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyPropertyChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf91486", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.mCallbacks;
                if (propertyChangeRegistry != null) {
                    propertyChangeRegistry.notifyCallbacks(this, i, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.Observable
    public void removeOnPropertyChangedCallback(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95942e5b", new Object[]{this, onPropertyChangedCallback});
            return;
        }
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.mCallbacks;
                if (propertyChangeRegistry != null) {
                    propertyChangeRegistry.remove(onPropertyChangedCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
