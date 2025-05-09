package androidx.databinding;

import androidx.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WeakListener<T> extends WeakReference<ViewDataBinding> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int mLocalFieldId;
    private final ObservableReference<T> mObservable;
    private T mTarget;

    public WeakListener(ViewDataBinding viewDataBinding, int i, ObservableReference<T> observableReference, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.mLocalFieldId = i;
        this.mObservable = observableReference;
    }

    public static /* synthetic */ Object ipc$super(WeakListener weakListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/WeakListener");
    }

    public ViewDataBinding getBinder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewDataBinding) ipChange.ipc$dispatch("f5e2f0e2", new Object[]{this});
        }
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            unregister();
        }
        return viewDataBinding;
    }

    public T getTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("737ca764", new Object[]{this});
        }
        return this.mTarget;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9ddc1b", new Object[]{this, lifecycleOwner});
        } else {
            this.mObservable.setLifecycleOwner(lifecycleOwner);
        }
    }

    public void setTarget(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d9c8f6", new Object[]{this, t});
            return;
        }
        unregister();
        this.mTarget = t;
        if (t != null) {
            this.mObservable.addListener(t);
        }
    }

    public boolean unregister() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50cd9ac7", new Object[]{this})).booleanValue();
        }
        T t = this.mTarget;
        if (t != null) {
            this.mObservable.removeListener(t);
            z = true;
        }
        this.mTarget = null;
        return z;
    }
}
