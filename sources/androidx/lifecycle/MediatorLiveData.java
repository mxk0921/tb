package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SafeIterableMap<LiveData<?>, Source<?>> mSources = new SafeIterableMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Source<V> implements Observer<V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final LiveData<V> mLiveData;
        public final Observer<? super V> mObserver;
        public int mVersion = -1;

        public Source(LiveData<V> liveData, Observer<? super V> observer) {
            this.mLiveData = liveData;
            this.mObserver = observer;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(V v) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3d3a6b8", new Object[]{this, v});
            } else if (this.mVersion != this.mLiveData.getVersion()) {
                this.mVersion = this.mLiveData.getVersion();
                this.mObserver.onChanged(v);
            }
        }

        public void plug() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("910c9b15", new Object[]{this});
            } else {
                this.mLiveData.observeForever(this);
            }
        }

        public void unplug() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec0500ae", new Object[]{this});
            } else {
                this.mLiveData.removeObserver(this);
            }
        }
    }

    public MediatorLiveData() {
    }

    public static /* synthetic */ Object ipc$super(MediatorLiveData mediatorLiveData, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/MediatorLiveData");
    }

    public <S> void addSource(LiveData<S> liveData, Observer<? super S> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0f28c3", new Object[]{this, liveData, observer});
        } else if (liveData != null) {
            Source<?> source = new Source<>(liveData, observer);
            Source<?> putIfAbsent = this.mSources.putIfAbsent(liveData, source);
            if (putIfAbsent != null && putIfAbsent.mObserver != observer) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (putIfAbsent == null && hasActiveObservers()) {
                source.plug();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40df6fcc", new Object[]{this});
            return;
        }
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().plug();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11263ef1", new Object[]{this});
            return;
        }
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it = this.mSources.iterator();
        while (it.hasNext()) {
            it.next().getValue().unplug();
        }
    }

    public <S> void removeSource(LiveData<S> liveData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e23da", new Object[]{this, liveData});
            return;
        }
        Source<?> remove = this.mSources.remove(liveData);
        if (remove != null) {
            remove.unplug();
        }
    }

    public MediatorLiveData(T t) {
        super(t);
    }
}
