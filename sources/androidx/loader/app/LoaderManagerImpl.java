package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;
import tb.wyf;
import tb.zew;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoaderManagerImpl extends LoaderManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean DEBUG = false;
    public static final String TAG = "LoaderManager";
    private final LifecycleOwner mLifecycleOwner;
    private final LoaderViewModel mLoaderViewModel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Bundle mArgs;
        private final int mId;
        private LifecycleOwner mLifecycleOwner;
        private final Loader<D> mLoader;
        private LoaderObserver<D> mObserver;
        private Loader<D> mPriorLoader;

        public LoaderInfo(int i, Bundle bundle, Loader<D> loader, Loader<D> loader2) {
            this.mId = i;
            this.mArgs = bundle;
            this.mLoader = loader;
            this.mPriorLoader = loader2;
            loader.registerListener(i, this);
        }

        public static /* synthetic */ Object ipc$super(LoaderInfo loaderInfo, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 990834015) {
                super.removeObserver((Observer) objArr[0]);
                return null;
            } else if (hashCode == 1835267474) {
                super.setValue(objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/loader/app/LoaderManagerImpl$LoaderInfo");
            }
        }

        public Loader<D> destroy(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Loader) ipChange.ipc$dispatch("65c3533", new Object[]{this, new Boolean(z)});
            }
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Destroying: ").append(this);
            }
            this.mLoader.cancelLoad();
            this.mLoader.abandon();
            LoaderObserver<D> loaderObserver = this.mObserver;
            if (loaderObserver != null) {
                removeObserver(loaderObserver);
                if (z) {
                    loaderObserver.reset();
                }
            }
            this.mLoader.unregisterListener(this);
            if ((loaderObserver == null || loaderObserver.hasDeliveredData()) && !z) {
                return this.mLoader;
            }
            this.mLoader.reset();
            return this.mPriorLoader;
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab37b0f", new Object[]{this, str, fileDescriptor, printWriter, strArr});
                return;
            }
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.mId);
            printWriter.print(" mArgs=");
            printWriter.println(this.mArgs);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.mLoader);
            Loader<D> loader = this.mLoader;
            loader.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.mObserver != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mObserver);
                LoaderObserver<D> loaderObserver = this.mObserver;
                loaderObserver.dump(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(getLoader().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        public Loader<D> getLoader() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Loader) ipChange.ipc$dispatch("f09f61f6", new Object[]{this});
            }
            return this.mLoader;
        }

        public boolean isCallbackWaitingForData() {
            LoaderObserver<D> loaderObserver;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6e111480", new Object[]{this})).booleanValue();
            }
            if (hasActiveObservers() && (loaderObserver = this.mObserver) != null && !loaderObserver.hasDeliveredData()) {
                return true;
            }
            return false;
        }

        public void markForRedelivery() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c02b20a", new Object[]{this});
                return;
            }
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            LoaderObserver<D> loaderObserver = this.mObserver;
            if (lifecycleOwner != null && loaderObserver != null) {
                super.removeObserver(loaderObserver);
                observe(lifecycleOwner, loaderObserver);
            }
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40df6fcc", new Object[]{this});
                return;
            }
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Starting: ").append(this);
            }
            this.mLoader.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11263ef1", new Object[]{this});
                return;
            }
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("  Stopping: ").append(this);
            }
            this.mLoader.stopLoading();
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void onLoadComplete(Loader<D> loader, D d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dacb49d1", new Object[]{this, loader, d});
                return;
            }
            if (LoaderManagerImpl.DEBUG) {
                new StringBuilder("onLoadComplete: ").append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
            } else {
                postValue(d);
            }
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(Observer<? super D> observer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b0eed5f", new Object[]{this, observer});
                return;
            }
            super.removeObserver(observer);
            this.mLifecycleOwner = null;
            this.mObserver = null;
        }

        public Loader<D> setCallback(LifecycleOwner lifecycleOwner, LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Loader) ipChange.ipc$dispatch("331b00d1", new Object[]{this, lifecycleOwner, loaderCallbacks});
            }
            LoaderObserver<D> loaderObserver = new LoaderObserver<>(this.mLoader, loaderCallbacks);
            observe(lifecycleOwner, loaderObserver);
            LoaderObserver<D> loaderObserver2 = this.mObserver;
            if (loaderObserver2 != null) {
                removeObserver(loaderObserver2);
            }
            this.mLifecycleOwner = lifecycleOwner;
            this.mObserver = loaderObserver;
            return this.mLoader;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d63f592", new Object[]{this, d});
                return;
            }
            super.setValue(d);
            Loader<D> loader = this.mPriorLoader;
            if (loader != null) {
                loader.reset();
                this.mPriorLoader = null;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.mId);
            sb.append(" : ");
            DebugUtils.buildShortClassTag(this.mLoader, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LoaderObserver<D> implements Observer<D> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final LoaderManager.LoaderCallbacks<D> mCallback;
        private boolean mDeliveredData = false;
        private final Loader<D> mLoader;

        public LoaderObserver(Loader<D> loader, LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            this.mLoader = loader;
            this.mCallback = loaderCallbacks;
        }

        public void dump(String str, PrintWriter printWriter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f57f0d8", new Object[]{this, str, printWriter});
                return;
            }
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.mDeliveredData);
        }

        public boolean hasDeliveredData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4e7d845f", new Object[]{this})).booleanValue();
            }
            return this.mDeliveredData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(D d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3d3a6b8", new Object[]{this, d});
                return;
            }
            if (LoaderManagerImpl.DEBUG) {
                Objects.toString(this.mLoader);
                this.mLoader.dataToString(d);
            }
            this.mCallback.onLoadFinished(this.mLoader, d);
            this.mDeliveredData = true;
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
            } else if (this.mDeliveredData) {
                if (LoaderManagerImpl.DEBUG) {
                    new StringBuilder("  Resetting: ").append(this.mLoader);
                }
                this.mCallback.onLoaderReset(this.mLoader);
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.mCallback.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class LoaderViewModel extends ViewModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() { // from class: androidx.loader.app.LoaderManagerImpl.LoaderViewModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
                return zew.b(this, cls, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public /* synthetic */ ViewModel create(wyf wyfVar, CreationExtras creationExtras) {
                return zew.c(this, wyfVar, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(Class<T> cls) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (T) ((ViewModel) ipChange.ipc$dispatch("9d9ab72", new Object[]{this, cls})) : new LoaderViewModel();
            }
        };
        private SparseArrayCompat<LoaderInfo> mLoaders = new SparseArrayCompat<>();
        private boolean mCreatingLoader = false;

        public static LoaderViewModel getInstance(ViewModelStore viewModelStore) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoaderViewModel) ipChange.ipc$dispatch("391f7255", new Object[]{viewModelStore});
            }
            return (LoaderViewModel) new ViewModelProvider(viewModelStore, FACTORY).get(LoaderViewModel.class);
        }

        public static /* synthetic */ Object ipc$super(LoaderViewModel loaderViewModel, String str, Object... objArr) {
            if (str.hashCode() == -607929644) {
                super.onCleared();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/loader/app/LoaderManagerImpl$LoaderViewModel");
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab37b0f", new Object[]{this, str, fileDescriptor, printWriter, strArr});
            } else if (this.mLoaders.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.mLoaders.size(); i++) {
                    LoaderInfo valueAt = this.mLoaders.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.mLoaders.keyAt(i));
                    printWriter.print(": ");
                    printWriter.println(valueAt.toString());
                    valueAt.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void finishCreatingLoader() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd9dd4a6", new Object[]{this});
            } else {
                this.mCreatingLoader = false;
            }
        }

        public <D> LoaderInfo<D> getLoader(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoaderInfo) ipChange.ipc$dispatch("54136a3", new Object[]{this, new Integer(i)});
            }
            return this.mLoaders.get(i);
        }

        public boolean hasRunningLoaders() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("65786846", new Object[]{this})).booleanValue();
            }
            int size = this.mLoaders.size();
            for (int i = 0; i < size; i++) {
                if (this.mLoaders.valueAt(i).isCallbackWaitingForData()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isCreatingLoader() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b873fd81", new Object[]{this})).booleanValue();
            }
            return this.mCreatingLoader;
        }

        public void markForRedelivery() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c02b20a", new Object[]{this});
                return;
            }
            int size = this.mLoaders.size();
            for (int i = 0; i < size; i++) {
                this.mLoaders.valueAt(i).markForRedelivery();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbc3bad4", new Object[]{this});
                return;
            }
            super.onCleared();
            int size = this.mLoaders.size();
            for (int i = 0; i < size; i++) {
                this.mLoaders.valueAt(i).destroy(true);
            }
            this.mLoaders.clear();
        }

        public void putLoader(int i, LoaderInfo loaderInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c00111fa", new Object[]{this, new Integer(i), loaderInfo});
            } else {
                this.mLoaders.put(i, loaderInfo);
            }
        }

        public void removeLoader(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9add5805", new Object[]{this, new Integer(i)});
            } else {
                this.mLoaders.remove(i);
            }
        }

        public void startCreatingLoader() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a456b5", new Object[]{this});
            } else {
                this.mCreatingLoader = true;
            }
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.mLifecycleOwner = lifecycleOwner;
        this.mLoaderViewModel = LoaderViewModel.getInstance(viewModelStore);
    }

    private <D> Loader<D> createAndInstallLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks<D> loaderCallbacks, Loader<D> loader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Loader) ipChange.ipc$dispatch("ae4f80ad", new Object[]{this, new Integer(i), bundle, loaderCallbacks, loader});
        }
        try {
            this.mLoaderViewModel.startCreatingLoader();
            Loader<D> onCreateLoader = loaderCallbacks.onCreateLoader(i, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                }
                LoaderInfo loaderInfo = new LoaderInfo(i, bundle, onCreateLoader, loader);
                if (DEBUG) {
                    new StringBuilder("  Created new loader ").append(loaderInfo);
                }
                this.mLoaderViewModel.putLoader(i, loaderInfo);
                this.mLoaderViewModel.finishCreatingLoader();
                return loaderInfo.setCallback(this.mLifecycleOwner, loaderCallbacks);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.mLoaderViewModel.finishCreatingLoader();
            throw th;
        }
    }

    public static /* synthetic */ Object ipc$super(LoaderManagerImpl loaderManagerImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/loader/app/LoaderManagerImpl");
    }

    @Override // androidx.loader.app.LoaderManager
    public void destroyLoader(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0188acf", new Object[]{this, new Integer(i)});
        } else if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (DEBUG) {
                StringBuilder sb = new StringBuilder("destroyLoader in ");
                sb.append(this);
                sb.append(" of ");
                sb.append(i);
            }
            LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
            if (loader != null) {
                loader.destroy(true);
                this.mLoaderViewModel.removeLoader(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    @Override // androidx.loader.app.LoaderManager
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab37b0f", new Object[]{this, str, fileDescriptor, printWriter, strArr});
        } else {
            this.mLoaderViewModel.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> Loader<D> getLoader(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Loader) ipChange.ipc$dispatch("b1d0c6b3", new Object[]{this, new Integer(i)});
        }
        if (!this.mLoaderViewModel.isCreatingLoader()) {
            LoaderInfo<D> loader = this.mLoaderViewModel.getLoader(i);
            if (loader != null) {
                return loader.getLoader();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.LoaderManager
    public boolean hasRunningLoaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65786846", new Object[]{this})).booleanValue();
        }
        return this.mLoaderViewModel.hasRunningLoaders();
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> Loader<D> initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Loader) ipChange.ipc$dispatch("2d2b35cd", new Object[]{this, new Integer(i), bundle, loaderCallbacks});
        }
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            LoaderInfo<D> loader = this.mLoaderViewModel.getLoader(i);
            if (DEBUG) {
                StringBuilder sb = new StringBuilder("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
            }
            if (loader == null) {
                return createAndInstallLoader(i, bundle, loaderCallbacks, null);
            }
            if (DEBUG) {
                new StringBuilder("  Re-using existing loader ").append(loader);
            }
            return loader.setCallback(this.mLifecycleOwner, loaderCallbacks);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public void markForRedelivery() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c02b20a", new Object[]{this});
        } else {
            this.mLoaderViewModel.markForRedelivery();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.buildShortClassTag(this.mLifecycleOwner, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> Loader<D> restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Loader) ipChange.ipc$dispatch("b1ed5ccc", new Object[]{this, new Integer(i), bundle, loaderCallbacks});
        }
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (DEBUG) {
                StringBuilder sb = new StringBuilder("restartLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
            }
            LoaderInfo<D> loader = this.mLoaderViewModel.getLoader(i);
            return createAndInstallLoader(i, bundle, loaderCallbacks, loader != null ? loader.destroy(false) : null);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }
}
