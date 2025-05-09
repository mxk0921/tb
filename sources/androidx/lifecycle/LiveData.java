package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class LiveData<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Object NOT_SET = new Object();
    public static final int START_VERSION = -1;
    public int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    public final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> mObservers;
    public volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AlwaysActiveObserver(Observer<? super T> observer) {
            super(observer);
        }

        public static /* synthetic */ Object ipc$super(AlwaysActiveObserver alwaysActiveObserver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/LiveData$AlwaysActiveObserver");
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("116c3687", new Object[]{this})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final LifecycleOwner mOwner;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
            super(observer);
            this.mOwner = lifecycleOwner;
        }

        public static /* synthetic */ Object ipc$super(LifecycleBoundObserver lifecycleBoundObserver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/LiveData$LifecycleBoundObserver");
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public void detachObserver() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb32390", new Object[]{this});
            } else {
                this.mOwner.getLifecycle().removeObserver(this);
            }
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c7281cc1", new Object[]{this, lifecycleOwner})).booleanValue();
            }
            if (this.mOwner == lifecycleOwner) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa8a81fe", new Object[]{this, lifecycleOwner, event});
                return;
            }
            Lifecycle.State currentState = this.mOwner.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.mObserver);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                activeStateChanged(shouldBeActive());
                state = currentState;
                currentState = this.mOwner.getLifecycle().getCurrentState();
            }
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("116c3687", new Object[]{this})).booleanValue();
            }
            return this.mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public abstract class ObserverWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean mActive;
        public int mLastVersion = -1;
        public final Observer<? super T> mObserver;

        public ObserverWrapper(Observer<? super T> observer) {
            this.mObserver = observer;
        }

        public void activeStateChanged(boolean z) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c1aa1c4", new Object[]{this, new Boolean(z)});
            } else if (z != this.mActive) {
                this.mActive = z;
                LiveData liveData = LiveData.this;
                if (!z) {
                    i = -1;
                }
                liveData.changeActiveCounter(i);
                if (this.mActive) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        public void detachObserver() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb32390", new Object[]{this});
            }
        }

        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c7281cc1", new Object[]{this, lifecycleOwner})).booleanValue();
            }
            return false;
        }

        public abstract boolean shouldBeActive();
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (LiveData.this.mDataLock) {
                    obj = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj);
            }
        };
        this.mData = t;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8c5eda", new Object[]{str});
        } else if (!ArchTaskExecutor.getInstance().isMainThread()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void considerNotify(LiveData<T>.ObserverWrapper observerWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6642de", new Object[]{this, observerWrapper});
        } else if (observerWrapper.mActive) {
            if (!observerWrapper.shouldBeActive()) {
                observerWrapper.activeStateChanged(false);
                return;
            }
            int i = observerWrapper.mLastVersion;
            int i2 = this.mVersion;
            if (i < i2) {
                observerWrapper.mLastVersion = i2;
                observerWrapper.mObserver.onChanged((Object) this.mData);
            }
        }
    }

    public void changeActiveCounter(int i) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56dc44d6", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (!this.mChangingActiveState) {
            this.mChangingActiveState = true;
            while (true) {
                try {
                    int i3 = this.mActiveCount;
                    if (i2 != i3) {
                        if (i2 != 0 || i3 <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (i2 <= 0 || i3 != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z) {
                            onActive();
                        } else if (z2) {
                            onInactive();
                        }
                        i2 = i3;
                    } else {
                        this.mChangingActiveState = false;
                        return;
                    }
                } catch (Throwable th) {
                    this.mChangingActiveState = false;
                    throw th;
                }
            }
        }
    }

    public void dispatchingValue(LiveData<T>.ObserverWrapper observerWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc6d6f7", new Object[]{this, observerWrapper});
        } else if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
        } else {
            this.mDispatchingValue = true;
            do {
                this.mDispatchInvalidated = false;
                if (observerWrapper == null) {
                    SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper>.IteratorWithAdditions iteratorWithAdditions = this.mObservers.iteratorWithAdditions();
                    while (iteratorWithAdditions.hasNext()) {
                        considerNotify((ObserverWrapper) iteratorWithAdditions.next().getValue());
                        if (this.mDispatchInvalidated) {
                            break;
                        }
                    }
                } else {
                    considerNotify(observerWrapper);
                    observerWrapper = null;
                }
            } while (this.mDispatchInvalidated);
            this.mDispatchingValue = false;
        }
    }

    public T getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        T t = (T) this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b04bcc08", new Object[]{this})).booleanValue();
        }
        if (this.mActiveCount > 0) {
            return true;
        }
        return false;
    }

    public boolean hasObservers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86393dee", new Object[]{this})).booleanValue();
        }
        if (this.mObservers.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
        }
        if (this.mData != NOT_SET) {
            return true;
        }
        return false;
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797fe8b6", new Object[]{this, lifecycleOwner, observer});
            return;
        }
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
            LiveData<T>.ObserverWrapper putIfAbsent = this.mObservers.putIfAbsent(observer, lifecycleBoundObserver);
            if (putIfAbsent != null && !putIfAbsent.isAttachedTo(lifecycleOwner)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (putIfAbsent == null) {
                lifecycleOwner.getLifecycle().addObserver(lifecycleBoundObserver);
            }
        }
    }

    public void onActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40df6fcc", new Object[]{this});
        }
    }

    public void onInactive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11263ef1", new Object[]{this});
        }
    }

    public void postValue(T t) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e76294", new Object[]{this, t});
            return;
        }
        synchronized (this.mDataLock) {
            if (this.mPendingData != NOT_SET) {
                z = false;
            }
            this.mPendingData = t;
        }
        if (z) {
            ArchTaskExecutor.getInstance().postToMainThread(this.mPostValueRunnable);
        }
    }

    public void removeObservers(LifecycleOwner lifecycleOwner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56616e8d", new Object[]{this, lifecycleOwner});
            return;
        }
        assertMainThread("removeObservers");
        Iterator<Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper> next = it.next();
            if (next.getValue().isAttachedTo(lifecycleOwner)) {
                removeObserver(next.getKey());
            }
        }
    }

    public void observeForever(Observer<? super T> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f59ac24e", new Object[]{this, observer});
            return;
        }
        assertMainThread("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        LiveData<T>.ObserverWrapper putIfAbsent = this.mObservers.putIfAbsent(observer, alwaysActiveObserver);
        if (putIfAbsent instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (putIfAbsent == null) {
            alwaysActiveObserver.activeStateChanged(true);
        }
    }

    public void removeObserver(Observer<? super T> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0eed5f", new Object[]{this, observer});
            return;
        }
        assertMainThread("removeObserver");
        LiveData<T>.ObserverWrapper remove = this.mObservers.remove(observer);
        if (remove != null) {
            remove.detachObserver();
            remove.activeStateChanged(false);
        }
    }

    public void setValue(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, t});
            return;
        }
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                Object obj2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (LiveData.this.mDataLock) {
                    obj2 = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj2);
            }
        };
        this.mData = obj;
        this.mVersion = -1;
    }
}
