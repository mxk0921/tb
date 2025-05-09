package androidx.fragment.app;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.wyf;
import tb.zew;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentManagerViewModel extends ViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() { // from class: androidx.fragment.app.FragmentManagerViewModel.1
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
            return ipChange instanceof IpChange ? (T) ((ViewModel) ipChange.ipc$dispatch("9d9ab72", new Object[]{this, cls})) : new FragmentManagerViewModel(true);
        }
    };
    private static final String TAG = "FragmentManager";
    private final boolean mStateAutomaticallySaved;
    private final HashMap<String, Fragment> mRetainedFragments = new HashMap<>();
    private final HashMap<String, FragmentManagerViewModel> mChildNonConfigs = new HashMap<>();
    private final HashMap<String, ViewModelStore> mViewModelStores = new HashMap<>();
    private boolean mHasBeenCleared = false;
    private boolean mHasSavedSnapshot = false;
    private boolean mIsStateSaved = false;

    public FragmentManagerViewModel(boolean z) {
        this.mStateAutomaticallySaved = z;
    }

    private void clearNonConfigStateInternal(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c17a7f7", new Object[]{this, str, new Boolean(z)});
            return;
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.mChildNonConfigs.get(str);
        if (fragmentManagerViewModel != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.mChildNonConfigs.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fragmentManagerViewModel.clearNonConfigState((String) it.next(), true);
                }
            }
            fragmentManagerViewModel.onCleared();
            this.mChildNonConfigs.remove(str);
        }
        ViewModelStore viewModelStore = this.mViewModelStores.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.mViewModelStores.remove(str);
        }
    }

    public static FragmentManagerViewModel getInstance(ViewModelStore viewModelStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManagerViewModel) ipChange.ipc$dispatch("e013c3f0", new Object[]{viewModelStore});
        }
        return (FragmentManagerViewModel) new ViewModelProvider(viewModelStore, FACTORY).get(FragmentManagerViewModel.class);
    }

    public static /* synthetic */ Object ipc$super(FragmentManagerViewModel fragmentManagerViewModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/FragmentManagerViewModel");
    }

    public void addRetainedFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51713c94", new Object[]{this, fragment});
        } else if (this.mIsStateSaved) {
            FragmentManager.isLoggingEnabled(2);
        } else if (!this.mRetainedFragments.containsKey(fragment.mWho)) {
            this.mRetainedFragments.put(fragment.mWho, fragment);
            if (FragmentManager.isLoggingEnabled(2)) {
                new StringBuilder("Updating retained Fragments: Added ").append(fragment);
            }
        }
    }

    public void clearNonConfigState(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08bad86", new Object[]{this, fragment, new Boolean(z)});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("Clearing non-config state for ").append(fragment);
        }
        clearNonConfigStateInternal(fragment.mWho, z);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        if (!this.mRetainedFragments.equals(fragmentManagerViewModel.mRetainedFragments) || !this.mChildNonConfigs.equals(fragmentManagerViewModel.mChildNonConfigs) || !this.mViewModelStores.equals(fragmentManagerViewModel.mViewModelStores)) {
            return false;
        }
        return true;
    }

    public Fragment findRetainedFragmentByWho(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("97b6b863", new Object[]{this, str});
        }
        return this.mRetainedFragments.get(str);
    }

    public FragmentManagerViewModel getChildNonConfig(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManagerViewModel) ipChange.ipc$dispatch("698fd6cf", new Object[]{this, fragment});
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.mChildNonConfigs.get(fragment.mWho);
        if (fragmentManagerViewModel != null) {
            return fragmentManagerViewModel;
        }
        FragmentManagerViewModel fragmentManagerViewModel2 = new FragmentManagerViewModel(this.mStateAutomaticallySaved);
        this.mChildNonConfigs.put(fragment.mWho, fragmentManagerViewModel2);
        return fragmentManagerViewModel2;
    }

    public Collection<Fragment> getRetainedFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("d7be2b57", new Object[]{this});
        }
        return new ArrayList(this.mRetainedFragments.values());
    }

    @Deprecated
    public FragmentManagerNonConfig getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManagerNonConfig) ipChange.ipc$dispatch("83f2340b", new Object[]{this});
        }
        if (this.mRetainedFragments.isEmpty() && this.mChildNonConfigs.isEmpty() && this.mViewModelStores.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, FragmentManagerViewModel> entry : this.mChildNonConfigs.entrySet()) {
            FragmentManagerNonConfig snapshot = entry.getValue().getSnapshot();
            if (snapshot != null) {
                hashMap.put(entry.getKey(), snapshot);
            }
        }
        this.mHasSavedSnapshot = true;
        if (!this.mRetainedFragments.isEmpty() || !hashMap.isEmpty() || !this.mViewModelStores.isEmpty()) {
            return new FragmentManagerNonConfig(new ArrayList(this.mRetainedFragments.values()), hashMap, new HashMap(this.mViewModelStores));
        }
        return null;
    }

    public ViewModelStore getViewModelStore(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelStore) ipChange.ipc$dispatch("eccc735b", new Object[]{this, fragment});
        }
        ViewModelStore viewModelStore = this.mViewModelStores.get(fragment.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.mViewModelStores.put(fragment.mWho, viewModelStore2);
        return viewModelStore2;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((this.mRetainedFragments.hashCode() * 31) + this.mChildNonConfigs.hashCode()) * 31) + this.mViewModelStores.hashCode();
    }

    public boolean isCleared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b29cead", new Object[]{this})).booleanValue();
        }
        return this.mHasBeenCleared;
    }

    public void removeRetainedFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1054a0f7", new Object[]{this, fragment});
        } else if (this.mIsStateSaved) {
            FragmentManager.isLoggingEnabled(2);
        } else if (this.mRetainedFragments.remove(fragment.mWho) != null && FragmentManager.isLoggingEnabled(2)) {
            new StringBuilder("Updating retained Fragments: Removed ").append(fragment);
        }
    }

    @Deprecated
    public void restoreFromSnapshot(FragmentManagerNonConfig fragmentManagerNonConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0e6419", new Object[]{this, fragmentManagerNonConfig});
            return;
        }
        this.mRetainedFragments.clear();
        this.mChildNonConfigs.clear();
        this.mViewModelStores.clear();
        if (fragmentManagerNonConfig != null) {
            Collection<Fragment> fragments = fragmentManagerNonConfig.getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    if (fragment != null) {
                        this.mRetainedFragments.put(fragment.mWho, fragment);
                    }
                }
            }
            Map<String, FragmentManagerNonConfig> childNonConfigs = fragmentManagerNonConfig.getChildNonConfigs();
            if (childNonConfigs != null) {
                for (Map.Entry<String, FragmentManagerNonConfig> entry : childNonConfigs.entrySet()) {
                    FragmentManagerViewModel fragmentManagerViewModel = new FragmentManagerViewModel(this.mStateAutomaticallySaved);
                    fragmentManagerViewModel.restoreFromSnapshot(entry.getValue());
                    this.mChildNonConfigs.put(entry.getKey(), fragmentManagerViewModel);
                }
            }
            Map<String, ViewModelStore> viewModelStores = fragmentManagerNonConfig.getViewModelStores();
            if (viewModelStores != null) {
                this.mViewModelStores.putAll(viewModelStores);
            }
        }
        this.mHasSavedSnapshot = false;
    }

    public void setIsStateSaved(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d9d31ab", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsStateSaved = z;
        }
    }

    public boolean shouldDestroy(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca0b20ca", new Object[]{this, fragment})).booleanValue();
        }
        if (!this.mRetainedFragments.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.mStateAutomaticallySaved) {
            return this.mHasBeenCleared;
        }
        return !this.mHasSavedSnapshot;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.mRetainedFragments.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.mChildNonConfigs.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.mViewModelStores.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc3bad4", new Object[]{this});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("onCleared called for ").append(this);
        }
        this.mHasBeenCleared = true;
    }

    public void clearNonConfigState(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f5c74", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            new StringBuilder("Clearing non-config state for saved state of Fragment ").append(str);
        }
        clearNonConfigStateInternal(str, z);
    }
}
