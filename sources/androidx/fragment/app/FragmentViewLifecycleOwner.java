package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewModelProvider.Factory mDefaultFactory;
    private final Fragment mFragment;
    private final Runnable mRestoreViewSavedStateRunnable;
    private final ViewModelStore mViewModelStore;
    private LifecycleRegistry mLifecycleRegistry = null;
    private SavedStateRegistryController mSavedStateRegistryController = null;

    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore, Runnable runnable) {
        this.mFragment = fragment;
        this.mViewModelStore = viewModelStore;
        this.mRestoreViewSavedStateRunnable = runnable;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CreationExtras) ipChange.ipc$dispatch("9cb4037b", new Object[]{this});
        }
        Context applicationContext = this.mFragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.mFragment);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (this.mFragment.getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.mFragment.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelProvider.Factory) ipChange.ipc$dispatch("69487ace", new Object[]{this});
        }
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.mFragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.mFragment.mDefaultFactory)) {
            this.mDefaultFactory = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = this.mFragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            Fragment fragment = this.mFragment;
            this.mDefaultFactory = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Lifecycle) ipChange.ipc$dispatch("a130f2cb", new Object[]{this});
        }
        initialize();
        return this.mLifecycleRegistry;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SavedStateRegistry) ipChange.ipc$dispatch("4bef1e3b", new Object[]{this});
        }
        initialize();
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelStore) ipChange.ipc$dispatch("b3fdec63", new Object[]{this});
        }
        initialize();
        return this.mViewModelStore;
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca321059", new Object[]{this, event});
        } else {
            this.mLifecycleRegistry.handleLifecycleEvent(event);
        }
    }

    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        } else if (this.mLifecycleRegistry == null) {
            this.mLifecycleRegistry = new LifecycleRegistry(this);
            SavedStateRegistryController create = SavedStateRegistryController.create(this);
            this.mSavedStateRegistryController = create;
            create.performAttach();
            this.mRestoreViewSavedStateRunnable.run();
        }
    }

    public boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[]{this})).booleanValue();
        }
        if (this.mLifecycleRegistry != null) {
            return true;
        }
        return false;
    }

    public void performRestore(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4fae60", new Object[]{this, bundle});
        } else {
            this.mSavedStateRegistryController.performRestore(bundle);
        }
    }

    public void performSave(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02baaf", new Object[]{this, bundle});
        } else {
            this.mSavedStateRegistryController.performSave(bundle);
        }
    }

    public void setCurrentState(Lifecycle.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac6384", new Object[]{this, state});
        } else {
            this.mLifecycleRegistry.setCurrentState(state);
        }
    }
}
