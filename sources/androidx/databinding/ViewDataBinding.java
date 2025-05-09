package androidx.databinding;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.Observable;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ViewDataBinding extends BaseObservable {
    private static final int BINDING_NUMBER_START = 8;
    public static final String BINDING_TAG_PREFIX = "binding_";
    private static final int HALTED = 2;
    private static final int REBIND = 1;
    private static final int REBOUND = 3;
    protected final DataBindingComponent mBindingComponent;
    private Choreographer mChoreographer;
    private ViewDataBinding mContainingBinding;
    private final Choreographer.FrameCallback mFrameCallback;
    private boolean mInLiveDataRegisterObserver;
    protected boolean mInStateFlowRegisterObserver;
    private boolean mIsExecutingPendingBindings;
    private LifecycleOwner mLifecycleOwner;
    private WeakListener[] mLocalFieldObservers;
    private OnStartListener mOnStartListener;
    private boolean mPendingRebind;
    private CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> mRebindCallbacks;
    private boolean mRebindHalted;
    private final Runnable mRebindRunnable;
    private final View mRoot;
    private Handler mUIThreadHandler;
    static int SDK_INT = Build.VERSION.SDK_INT;
    private static final boolean USE_CHOREOGRAPHER = true;
    private static final CreateWeakListener CREATE_PROPERTY_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("d140ce11", new Object[]{this, viewDataBinding, new Integer(i), referenceQueue});
            }
            return new WeakPropertyListener(viewDataBinding, i, referenceQueue).getListener();
        }
    };
    private static final CreateWeakListener CREATE_LIST_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("d140ce11", new Object[]{this, viewDataBinding, new Integer(i), referenceQueue});
            }
            return new WeakListListener(viewDataBinding, i, referenceQueue).getListener();
        }
    };
    private static final CreateWeakListener CREATE_MAP_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("d140ce11", new Object[]{this, viewDataBinding, new Integer(i), referenceQueue});
            }
            return new WeakMapListener(viewDataBinding, i, referenceQueue).getListener();
        }
    };
    private static final CreateWeakListener CREATE_LIVE_DATA_LISTENER = new CreateWeakListener() { // from class: androidx.databinding.ViewDataBinding.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // androidx.databinding.CreateWeakListener
        public WeakListener create(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("d140ce11", new Object[]{this, viewDataBinding, new Integer(i), referenceQueue});
            }
            return new LiveDataListener(viewDataBinding, i, referenceQueue).getListener();
        }
    };
    private static final CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void> REBIND_NOTIFIER = new CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void>() { // from class: androidx.databinding.ViewDataBinding.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ViewDataBinding$5");
        }

        public void onNotifyCallback(OnRebindCallback onRebindCallback, ViewDataBinding viewDataBinding, int i, Void r10) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab9a0ed8", new Object[]{this, onRebindCallback, viewDataBinding, new Integer(i), r10});
            } else if (i != 1) {
                if (i == 2) {
                    onRebindCallback.onCanceled(viewDataBinding);
                } else if (i == 3) {
                    onRebindCallback.onBound(viewDataBinding);
                }
            } else if (!onRebindCallback.onPreBind(viewDataBinding)) {
                viewDataBinding.mRebindHalted = true;
            }
        }
    };
    private static final ReferenceQueue<ViewDataBinding> sReferenceQueue = new ReferenceQueue<>();
    private static final View.OnAttachStateChangeListener ROOT_REATTACHED_LISTENER = new View.OnAttachStateChangeListener() { // from class: androidx.databinding.ViewDataBinding.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            ViewDataBinding.getBinding(view).mRebindRunnable.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class IncludedLayouts {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final String[][] layouts;

        public IncludedLayouts(int i) {
            this.layouts = new String[i];
            this.indexes = new int[i];
            this.layoutIds = new int[i];
        }

        public void setIncludes(int i, String[] strArr, int[] iArr, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27bb432c", new Object[]{this, new Integer(i), strArr, iArr, iArr2});
                return;
            }
            this.layouts[i] = strArr;
            this.indexes[i] = iArr;
            this.layoutIds[i] = iArr2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class LiveDataListener implements Observer, ObservableReference<LiveData<?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public WeakReference<LifecycleOwner> mLifecycleOwnerRef = null;
        public final WeakListener<LiveData<?>> mListener;

        public LiveDataListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i, this, referenceQueue);
        }

        private LifecycleOwner getLifecycleOwner() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LifecycleOwner) ipChange.ipc$dispatch("5d2380e3", new Object[]{this});
            }
            WeakReference<LifecycleOwner> weakReference = this.mLifecycleOwnerRef;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<LiveData<?>> getListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("15c0bf1c", new Object[]{this});
            }
            return this.mListener;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3d3a6b8", new Object[]{this, obj});
                return;
            }
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null) {
                WeakListener<LiveData<?>> weakListener = this.mListener;
                binder.handleFieldChange(weakListener.mLocalFieldId, weakListener.getTarget(), 0);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b9ddc1b", new Object[]{this, lifecycleOwner});
                return;
            }
            LifecycleOwner lifecycleOwner2 = getLifecycleOwner();
            LiveData<?> target = this.mListener.getTarget();
            if (target != null) {
                if (lifecycleOwner2 != null) {
                    target.removeObserver(this);
                }
                if (lifecycleOwner != null) {
                    target.observe(lifecycleOwner, this);
                }
            }
            if (lifecycleOwner != null) {
                this.mLifecycleOwnerRef = new WeakReference<>(lifecycleOwner);
            }
        }

        public void addListener(LiveData<?> liveData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef20bbe4", new Object[]{this, liveData});
                return;
            }
            LifecycleOwner lifecycleOwner = getLifecycleOwner();
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, this);
            }
        }

        public void removeListener(LiveData<?> liveData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11103761", new Object[]{this, liveData});
            } else {
                liveData.removeObserver(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class OnStartListener implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final WeakReference<ViewDataBinding> mBinding;

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            ViewDataBinding viewDataBinding = this.mBinding.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.mBinding = new WeakReference<>(viewDataBinding);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback implements InverseBindingListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int mPropertyId;

        public PropertyChangedInverseListener(int i) {
            this.mPropertyId = i;
        }

        public static /* synthetic */ Object ipc$super(PropertyChangedInverseListener propertyChangedInverseListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ViewDataBinding$PropertyChangedInverseListener");
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d239026", new Object[]{this, observable, new Integer(i)});
            } else if (i == this.mPropertyId || i == 0) {
                onChange();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class WeakListListener extends ObservableList.OnListChangedCallback implements ObservableReference<ObservableList> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final WeakListener<ObservableList> mListener;

        public WeakListListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i, this, referenceQueue);
        }

        public static /* synthetic */ Object ipc$super(WeakListListener weakListListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ViewDataBinding$WeakListListener");
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<ObservableList> getListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("15c0bf1c", new Object[]{this});
            }
            return this.mListener;
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onChanged(ObservableList observableList) {
            ObservableList target;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("995db58a", new Object[]{this, observableList});
                return;
            }
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && (target = this.mListener.getTarget()) == observableList) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, target, 0);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeChanged(ObservableList observableList, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20433956", new Object[]{this, observableList, new Integer(i), new Integer(i2)});
            } else {
                onChanged(observableList);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeInserted(ObservableList observableList, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("453f217c", new Object[]{this, observableList, new Integer(i), new Integer(i2)});
            } else {
                onChanged(observableList);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeMoved(ObservableList observableList, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8efc72c", new Object[]{this, observableList, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                onChanged(observableList);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public void onItemRangeRemoved(ObservableList observableList, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5392302a", new Object[]{this, observableList, new Integer(i), new Integer(i2)});
            } else {
                onChanged(observableList);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b9ddc1b", new Object[]{this, lifecycleOwner});
            }
        }

        public void addListener(ObservableList observableList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8c35cea", new Object[]{this, observableList});
            } else {
                observableList.addOnListChangedCallback(this);
            }
        }

        public void removeListener(ObservableList observableList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2720b67", new Object[]{this, observableList});
            } else {
                observableList.removeOnListChangedCallback(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class WeakMapListener extends ObservableMap.OnMapChangedCallback implements ObservableReference<ObservableMap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final WeakListener<ObservableMap> mListener;

        public WeakMapListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i, this, referenceQueue);
        }

        public static /* synthetic */ Object ipc$super(WeakMapListener weakMapListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ViewDataBinding$WeakMapListener");
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<ObservableMap> getListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("15c0bf1c", new Object[]{this});
            }
            return this.mListener;
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public void onMapChanged(ObservableMap observableMap, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51a4934a", new Object[]{this, observableMap, obj});
                return;
            }
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && observableMap == this.mListener.getTarget()) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, observableMap, 0);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b9ddc1b", new Object[]{this, lifecycleOwner});
            }
        }

        public void addListener(ObservableMap observableMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8316a86c", new Object[]{this, observableMap});
            } else {
                observableMap.addOnMapChangedCallback(this);
            }
        }

        public void removeListener(ObservableMap observableMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc9b64f", new Object[]{this, observableMap});
            } else {
                observableMap.removeOnMapChangedCallback(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class WeakPropertyListener extends Observable.OnPropertyChangedCallback implements ObservableReference<Observable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final WeakListener<Observable> mListener;

        public WeakPropertyListener(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.mListener = new WeakListener<>(viewDataBinding, i, this, referenceQueue);
        }

        public static /* synthetic */ Object ipc$super(WeakPropertyListener weakPropertyListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/ViewDataBinding$WeakPropertyListener");
        }

        @Override // androidx.databinding.ObservableReference
        public WeakListener<Observable> getListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakListener) ipChange.ipc$dispatch("15c0bf1c", new Object[]{this});
            }
            return this.mListener;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d239026", new Object[]{this, observable, new Integer(i)});
                return;
            }
            ViewDataBinding binder = this.mListener.getBinder();
            if (binder != null && this.mListener.getTarget() == observable) {
                binder.handleFieldChange(this.mListener.mLocalFieldId, observable, i);
            }
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b9ddc1b", new Object[]{this, lifecycleOwner});
            }
        }

        public void addListener(Observable observable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c447268", new Object[]{this, observable});
            } else {
                observable.addOnPropertyChangedCallback(this);
            }
        }

        public void removeListener(Observable observable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9adfe765", new Object[]{this, observable});
            } else {
                observable.removeOnPropertyChangedCallback(this);
            }
        }
    }

    public ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i) {
        this.mRebindRunnable = new Runnable() { // from class: androidx.databinding.ViewDataBinding.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (this) {
                    ViewDataBinding.this.mPendingRebind = false;
                }
                ViewDataBinding.processReferenceQueue();
                if (!ViewDataBinding.this.mRoot.isAttachedToWindow()) {
                    ViewDataBinding.this.mRoot.removeOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                    ViewDataBinding.this.mRoot.addOnAttachStateChangeListener(ViewDataBinding.ROOT_REATTACHED_LISTENER);
                    return;
                }
                ViewDataBinding.this.executePendingBindings();
            }
        };
        this.mPendingRebind = false;
        this.mRebindHalted = false;
        this.mBindingComponent = dataBindingComponent;
        this.mLocalFieldObservers = new WeakListener[i];
        this.mRoot = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (USE_CHOREOGRAPHER) {
            this.mChoreographer = Choreographer.getInstance();
            this.mFrameCallback = new Choreographer.FrameCallback() { // from class: androidx.databinding.ViewDataBinding.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                    } else {
                        ViewDataBinding.this.mRebindRunnable.run();
                    }
                }
            };
        } else {
            this.mFrameCallback = null;
            this.mUIThreadHandler = new Handler(Looper.myLooper());
        }
    }

    public static ViewDataBinding bind(Object obj, View view, int i) {
        return DataBindingUtil.bind(checkAndCastToBindingComponent(obj), view, i);
    }

    private static DataBindingComponent checkAndCastToBindingComponent(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void executeBindingsInternal() {
        if (this.mIsExecutingPendingBindings) {
            requestRebind();
        } else if (hasPendingBindings()) {
            this.mIsExecutingPendingBindings = true;
            this.mRebindHalted = false;
            CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
            if (callbackRegistry != null) {
                callbackRegistry.notifyCallbacks(this, 1, null);
                if (this.mRebindHalted) {
                    this.mRebindCallbacks.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.mRebindHalted) {
                executeBindings();
                CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry2 = this.mRebindCallbacks;
                if (callbackRegistry2 != null) {
                    callbackRegistry2.notifyCallbacks(this, 3, null);
                }
            }
            this.mIsExecutingPendingBindings = false;
        }
    }

    public static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.executeBindingsInternal();
    }

    private static int findIncludeIndex(String str, int i, IncludedLayouts includedLayouts, int i2) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = includedLayouts.layouts[i2];
        int length = strArr.length;
        while (i < length) {
            if (TextUtils.equals(subSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int findLastMatching(ViewGroup viewGroup, int i) {
        String str;
        String str2 = (String) viewGroup.getChildAt(i).getTag();
        String substring = str2.substring(0, str2.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getTag() instanceof String) {
                str = (String) childAt.getTag();
            } else {
                str = null;
            }
            if (str != null && str.startsWith(substring)) {
                if (str.length() == str2.length() && str.charAt(str.length() - 1) == '0') {
                    return i;
                }
                if (isNumeric(str, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    public static ViewDataBinding getBinding(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    public static int getBuildSdkInt() {
        return SDK_INT;
    }

    public static int getColorFromResource(View view, int i) {
        int color;
        if (Build.VERSION.SDK_INT < 23) {
            return view.getResources().getColor(i);
        }
        color = view.getContext().getColor(i);
        return color;
    }

    public static ColorStateList getColorStateListFromResource(View view, int i) {
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT < 23) {
            return view.getResources().getColorStateList(i);
        }
        colorStateList = view.getContext().getColorStateList(i);
        return colorStateList;
    }

    public static Drawable getDrawableFromResource(View view, int i) {
        return view.getContext().getDrawable(i);
    }

    public static <K, T> T getFrom(Map<K, T> map, K k) {
        if (map == null) {
            return null;
        }
        return map.get(k);
    }

    public static <T> T getFromArray(T[] tArr, int i) {
        if (tArr == null || i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static <T> T getFromList(List<T> list, int i) {
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static <T extends ViewDataBinding> T inflateInternal(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, Object obj) {
        return (T) DataBindingUtil.inflate(layoutInflater, i, viewGroup, z, checkAndCastToBindingComponent(obj));
    }

    private static boolean isNumeric(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    public static boolean parse(String str, boolean z) {
        return str == null ? z : Boolean.parseBoolean(str);
    }

    private static int parseTagInt(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processReferenceQueue() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = sReferenceQueue.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof WeakListener) {
                ((WeakListener) poll).unregister();
            }
        }
    }

    public static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void setBindingInverseListener(ViewDataBinding viewDataBinding, InverseBindingListener inverseBindingListener, PropertyChangedInverseListener propertyChangedInverseListener) {
        if (inverseBindingListener != propertyChangedInverseListener) {
            if (inverseBindingListener != null) {
                viewDataBinding.removeOnPropertyChangedCallback((PropertyChangedInverseListener) inverseBindingListener);
            }
            if (propertyChangedInverseListener != null) {
                viewDataBinding.addOnPropertyChangedCallback(propertyChangedInverseListener);
            }
        }
    }

    public static <T> void setTo(T[] tArr, int i, T t) {
        if (tArr != null && i >= 0 && i < tArr.length) {
            tArr[i] = t;
        }
    }

    public void addOnRebindCallback(OnRebindCallback onRebindCallback) {
        if (this.mRebindCallbacks == null) {
            this.mRebindCallbacks = new CallbackRegistry<>(REBIND_NOTIFIER);
        }
        this.mRebindCallbacks.add(onRebindCallback);
    }

    public void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent == null) {
            throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
        }
    }

    public abstract void executeBindings();

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding == null) {
            executeBindingsInternal();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    public void forceExecuteBindings() {
        executeBindings();
    }

    public LifecycleOwner getLifecycleOwner() {
        return this.mLifecycleOwner;
    }

    public Object getObservedField(int i) {
        WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            return null;
        }
        return weakListener.getTarget();
    }

    public View getRoot() {
        return this.mRoot;
    }

    public void handleFieldChange(int i, Object obj, int i2) {
        if (!this.mInLiveDataRegisterObserver && !this.mInStateFlowRegisterObserver && onFieldChange(i, obj, i2)) {
            requestRebind();
        }
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    public abstract boolean onFieldChange(int i, Object obj, int i2);

    public void registerTo(int i, Object obj, CreateWeakListener createWeakListener) {
        if (obj != null) {
            WeakListener weakListener = this.mLocalFieldObservers[i];
            if (weakListener == null) {
                weakListener = createWeakListener.create(this, i, sReferenceQueue);
                this.mLocalFieldObservers[i] = weakListener;
                LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
                if (lifecycleOwner != null) {
                    weakListener.setLifecycleOwner(lifecycleOwner);
                }
            }
            weakListener.setTarget(obj);
        }
    }

    public void removeOnRebindCallback(OnRebindCallback onRebindCallback) {
        CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.mRebindCallbacks;
        if (callbackRegistry != null) {
            callbackRegistry.remove(onRebindCallback);
        }
    }

    public void requestRebind() {
        ViewDataBinding viewDataBinding = this.mContainingBinding;
        if (viewDataBinding != null) {
            viewDataBinding.requestRebind();
            return;
        }
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            synchronized (this) {
                try {
                    if (!this.mPendingRebind) {
                        this.mPendingRebind = true;
                        if (USE_CHOREOGRAPHER) {
                            this.mChoreographer.postFrameCallback(this.mFrameCallback);
                        } else {
                            this.mUIThreadHandler.post(this.mRebindRunnable);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.mContainingBinding = this;
        }
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        WeakListener[] weakListenerArr;
        boolean z = lifecycleOwner instanceof Fragment;
        LifecycleOwner lifecycleOwner2 = this.mLifecycleOwner;
        if (lifecycleOwner2 != lifecycleOwner) {
            if (lifecycleOwner2 != null) {
                lifecycleOwner2.getLifecycle().removeObserver(this.mOnStartListener);
            }
            this.mLifecycleOwner = lifecycleOwner;
            if (lifecycleOwner != null) {
                if (this.mOnStartListener == null) {
                    this.mOnStartListener = new OnStartListener();
                }
                lifecycleOwner.getLifecycle().addObserver(this.mOnStartListener);
            }
            for (WeakListener weakListener : this.mLocalFieldObservers) {
                if (weakListener != null) {
                    weakListener.setLifecycleOwner(lifecycleOwner);
                }
            }
        }
    }

    public void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean setVariable(int i, Object obj);

    public void unbind() {
        WeakListener[] weakListenerArr;
        for (WeakListener weakListener : this.mLocalFieldObservers) {
            if (weakListener != null) {
                weakListener.unregister();
            }
        }
    }

    public boolean unregisterFrom(int i) {
        WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener != null) {
            return weakListener.unregister();
        }
        return false;
    }

    public boolean updateLiveDataRegistration(int i, LiveData<?> liveData) {
        this.mInLiveDataRegisterObserver = true;
        try {
            return updateRegistration(i, liveData, CREATE_LIVE_DATA_LISTENER);
        } finally {
            this.mInLiveDataRegisterObserver = false;
        }
    }

    public boolean updateRegistration(int i, Object obj, CreateWeakListener createWeakListener) {
        if (obj == null) {
            return unregisterFrom(i);
        }
        WeakListener weakListener = this.mLocalFieldObservers[i];
        if (weakListener == null) {
            registerTo(i, obj, createWeakListener);
            return true;
        } else if (weakListener.getTarget() == obj) {
            return false;
        } else {
            unregisterFrom(i);
            registerTo(i, obj, createWeakListener);
            return true;
        }
    }

    public static byte parse(String str, byte b) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b;
        }
    }

    public static long safeUnbox(Long l) {
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    public static boolean getFromArray(boolean[] zArr, int i) {
        if (zArr == null || i < 0 || i >= zArr.length) {
            return false;
        }
        return zArr[i];
    }

    public static <T> T getFromList(SparseArray<T> sparseArray, int i) {
        if (sparseArray == null || i < 0) {
            return null;
        }
        return sparseArray.get(i);
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        for (View view : viewArr) {
            mapBindings(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        }
        return objArr;
    }

    public static short parse(String str, short s) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s;
        }
    }

    public static short safeUnbox(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public static void setTo(boolean[] zArr, int i, boolean z) {
        if (zArr != null && i >= 0 && i < zArr.length) {
            zArr[i] = z;
        }
    }

    public static <T> T getFromList(LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get(i);
    }

    public static int parse(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static byte safeUnbox(Byte b) {
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
    }

    public static byte getFromArray(byte[] bArr, int i) {
        if (bArr == null || i < 0 || i >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i];
    }

    public static <T> T getFromList(androidx.collection.LongSparseArray<T> longSparseArray, int i) {
        if (longSparseArray == null || i < 0) {
            return null;
        }
        return longSparseArray.get(i);
    }

    public static long parse(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static char safeUnbox(Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    public static void setTo(byte[] bArr, int i, byte b) {
        if (bArr != null && i >= 0 && i < bArr.length) {
            bArr[i] = b;
        }
    }

    public static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i) {
        if (sparseBooleanArray == null || i < 0) {
            return false;
        }
        return sparseBooleanArray.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void mapBindings(androidx.databinding.DataBindingComponent r16, android.view.View r17, java.lang.Object[] r18, androidx.databinding.ViewDataBinding.IncludedLayouts r19, android.util.SparseIntArray r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.mapBindings(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$IncludedLayouts, android.util.SparseIntArray, boolean):void");
    }

    public static float parse(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static double safeUnbox(Double d) {
        return d == null ? vu3.b.GEO_NOT_SUPPORT : d.doubleValue();
    }

    public static short getFromArray(short[] sArr, int i) {
        if (sArr == null || i < 0 || i >= sArr.length) {
            return (short) 0;
        }
        return sArr[i];
    }

    public static int getFromList(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray == null || i < 0) {
            return 0;
        }
        return sparseIntArray.get(i);
    }

    public static double parse(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public static float safeUnbox(Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public static void setTo(short[] sArr, int i, short s) {
        if (sArr != null && i >= 0 && i < sArr.length) {
            sArr[i] = s;
        }
    }

    public boolean updateRegistration(int i, Observable observable) {
        return updateRegistration(i, observable, CREATE_PROPERTY_LISTENER);
    }

    public static long getFromList(SparseLongArray sparseLongArray, int i) {
        if (sparseLongArray == null || i < 0) {
            return 0L;
        }
        return sparseLongArray.get(i);
    }

    public static char parse(String str, char c) {
        return (str == null || str.isEmpty()) ? c : str.charAt(0);
    }

    public static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean updateRegistration(int i, ObservableList observableList) {
        return updateRegistration(i, observableList, CREATE_LIST_LISTENER);
    }

    public static char getFromArray(char[] cArr, int i) {
        if (cArr == null || i < 0 || i >= cArr.length) {
            return (char) 0;
        }
        return cArr[i];
    }

    public static void setTo(char[] cArr, int i, char c) {
        if (cArr != null && i >= 0 && i < cArr.length) {
            cArr[i] = c;
        }
    }

    public boolean updateRegistration(int i, ObservableMap observableMap) {
        return updateRegistration(i, observableMap, CREATE_MAP_LISTENER);
    }

    public static int getFromArray(int[] iArr, int i) {
        if (iArr == null || i < 0 || i >= iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    public static void setTo(int[] iArr, int i, int i2) {
        if (iArr != null && i >= 0 && i < iArr.length) {
            iArr[i] = i2;
        }
    }

    public static long getFromArray(long[] jArr, int i) {
        if (jArr == null || i < 0 || i >= jArr.length) {
            return 0L;
        }
        return jArr[i];
    }

    public static void setTo(long[] jArr, int i, long j) {
        if (jArr != null && i >= 0 && i < jArr.length) {
            jArr[i] = j;
        }
    }

    public ViewDataBinding(Object obj, View view, int i) {
        this(checkAndCastToBindingComponent(obj), view, i);
    }

    public static float getFromArray(float[] fArr, int i) {
        if (fArr == null || i < 0 || i >= fArr.length) {
            return 0.0f;
        }
        return fArr[i];
    }

    public static void setTo(float[] fArr, int i, float f) {
        if (fArr != null && i >= 0 && i < fArr.length) {
            fArr[i] = f;
        }
    }

    public static double getFromArray(double[] dArr, int i) {
        return (dArr == null || i < 0 || i >= dArr.length) ? vu3.b.GEO_NOT_SUPPORT : dArr[i];
    }

    public static void setTo(double[] dArr, int i, double d) {
        if (dArr != null && i >= 0 && i < dArr.length) {
            dArr[i] = d;
        }
    }

    public static <T> void setTo(List<T> list, int i, T t) {
        if (list != null && i >= 0 && i < list.size()) {
            list.set(i, t);
        }
    }

    public static <T> void setTo(SparseArray<T> sparseArray, int i, T t) {
        if (sparseArray != null && i >= 0 && i < sparseArray.size()) {
            sparseArray.put(i, t);
        }
    }

    public static <T> void setTo(LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray != null && i >= 0 && i < longSparseArray.size()) {
            longSparseArray.put(i, t);
        }
    }

    public static <T> void setTo(androidx.collection.LongSparseArray<T> longSparseArray, int i, T t) {
        if (longSparseArray != null && i >= 0 && i < longSparseArray.size()) {
            longSparseArray.put(i, t);
        }
    }

    public static void setTo(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        if (sparseBooleanArray != null && i >= 0 && i < sparseBooleanArray.size()) {
            sparseBooleanArray.put(i, z);
        }
    }

    public static void setTo(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray != null && i >= 0 && i < sparseIntArray.size()) {
            sparseIntArray.put(i, i2);
        }
    }

    public static void setTo(SparseLongArray sparseLongArray, int i, long j) {
        if (sparseLongArray != null && i >= 0 && i < sparseLongArray.size()) {
            sparseLongArray.put(i, j);
        }
    }

    public static <K, T> void setTo(Map<K, T> map, K k, T t) {
        if (map != null) {
            map.put(k, t);
        }
    }
}
