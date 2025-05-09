package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Preconditions;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FragmentController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final FragmentHostCallback<?> mHost;

    private FragmentController(FragmentHostCallback<?> fragmentHostCallback) {
        this.mHost = fragmentHostCallback;
    }

    public static FragmentController createController(FragmentHostCallback<?> fragmentHostCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentController) ipChange.ipc$dispatch("a4e7bde8", new Object[]{fragmentHostCallback});
        }
        return new FragmentController((FragmentHostCallback) Preconditions.checkNotNull(fragmentHostCallback, "callbacks == null"));
    }

    public void attachHost(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c900808c", new Object[]{this, fragment});
            return;
        }
        FragmentManager fragmentManager = this.mHost.getFragmentManager();
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        fragmentManager.attachController(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public void dispatchActivityCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c870206", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().dispatchActivityCreated();
        }
    }

    @Deprecated
    public void dispatchConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc85c91", new Object[]{this, configuration});
        } else {
            this.mHost.getFragmentManager().dispatchConfigurationChanged(configuration, true);
        }
    }

    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("228f2e3f", new Object[]{this, menuItem})).booleanValue();
        }
        return this.mHost.getFragmentManager().dispatchContextItemSelected(menuItem);
    }

    public void dispatchCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8d979d", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().dispatchCreate();
        }
    }

    @Deprecated
    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("690e5367", new Object[]{this, menu, menuInflater})).booleanValue();
        }
        return this.mHost.getFragmentManager().dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public void dispatchDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912b4aa7", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().dispatchDestroy();
        }
    }

    public void dispatchDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3194feec", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().dispatchDestroyView();
        }
    }

    @Deprecated
    public void dispatchLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e134c122", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().dispatchLowMemory(true);
        }
    }

    @Deprecated
    public void dispatchMultiWindowModeChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9942e60b", new Object[]{this, new Boolean(z)});
        } else {
            this.mHost.getFragmentManager().dispatchMultiWindowModeChanged(z, true);
        }
    }

    @Deprecated
    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b19be70", new Object[]{this, menuItem})).booleanValue();
        }
        return this.mHost.getFragmentManager().dispatchOptionsItemSelected(menuItem);
    }

    @Deprecated
    public void dispatchOptionsMenuClosed(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41dc0f82", new Object[]{this, menu});
        } else {
            this.mHost.getFragmentManager().dispatchOptionsMenuClosed(menu);
        }
    }

    public void dispatchPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d030423", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().dispatchPause();
        }
    }

    @Deprecated
    public void dispatchPictureInPictureModeChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6869b1b1", new Object[]{this, new Boolean(z)});
        } else {
            this.mHost.getFragmentManager().dispatchPictureInPictureModeChanged(z, true);
        }
    }

    @Deprecated
    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dd6645", new Object[]{this, menu})).booleanValue();
        }
        return this.mHost.getFragmentManager().dispatchPrepareOptionsMenu(menu);
    }

    @Deprecated
    public void dispatchReallyStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3edc6f6e", new Object[]{this});
        }
    }

    public void dispatchResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bcbe4e", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().dispatchResume();
        }
    }

    public void dispatchStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca88c8f", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().dispatchStart();
        }
    }

    public void dispatchStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48104a23", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().dispatchStop();
        }
    }

    @Deprecated
    public void doLoaderDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dd023", new Object[]{this});
        }
    }

    @Deprecated
    public void doLoaderRetain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c55962a", new Object[]{this});
        }
    }

    @Deprecated
    public void doLoaderStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd56410b", new Object[]{this});
        }
    }

    @Deprecated
    public void doLoaderStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa7618d", new Object[]{this, new Boolean(z)});
        }
    }

    @Deprecated
    public void dumpLoaders(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e129dd47", new Object[]{this, str, fileDescriptor, printWriter, strArr});
        }
    }

    public boolean execPendingActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28b7e362", new Object[]{this})).booleanValue();
        }
        return this.mHost.getFragmentManager().execPendingActions(true);
    }

    public Fragment findFragmentByWho(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("b7da3ddf", new Object[]{this, str});
        }
        return this.mHost.getFragmentManager().findFragmentByWho(str);
    }

    public List<Fragment> getActiveFragments(List<Fragment> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("57a908e8", new Object[]{this, list});
        }
        return this.mHost.getFragmentManager().getActiveFragments();
    }

    public int getActiveFragmentsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41143c42", new Object[]{this})).intValue();
        }
        return this.mHost.getFragmentManager().getActiveFragmentCount();
    }

    public FragmentManager getSupportFragmentManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("55fc71c6", new Object[]{this});
        }
        return this.mHost.getFragmentManager();
    }

    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoaderManager) ipChange.ipc$dispatch("3aa6e783", new Object[]{this});
        }
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void noteStateNotSaved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a435a", new Object[]{this});
        } else {
            this.mHost.getFragmentManager().noteStateNotSaved();
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4fe43b3d", new Object[]{this, view, str, context, attributeSet});
        }
        return this.mHost.getFragmentManager().getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void reportLoaderStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33c7142", new Object[]{this});
        }
    }

    @Deprecated
    public void restoreAllState(Parcelable parcelable, List<Fragment> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f28f7f", new Object[]{this, parcelable, list});
        } else {
            this.mHost.getFragmentManager().restoreAllState(parcelable, new FragmentManagerNonConfig(list, null, null));
        }
    }

    @Deprecated
    public void restoreLoaderNonConfig(SimpleArrayMap<String, LoaderManager> simpleArrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f470ae44", new Object[]{this, simpleArrayMap});
        }
    }

    @Deprecated
    public void restoreSaveState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4919386", new Object[]{this, parcelable});
            return;
        }
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            fragmentHostCallback.getFragmentManager().restoreSaveState(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    @Deprecated
    public SimpleArrayMap<String, LoaderManager> retainLoaderNonConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleArrayMap) ipChange.ipc$dispatch("ce897c7", new Object[]{this});
        }
        return null;
    }

    @Deprecated
    public FragmentManagerNonConfig retainNestedNonConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManagerNonConfig) ipChange.ipc$dispatch("1c7d7932", new Object[]{this});
        }
        return this.mHost.getFragmentManager().retainNonConfig();
    }

    @Deprecated
    public List<Fragment> retainNonConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("df9931b6", new Object[]{this});
        }
        FragmentManagerNonConfig retainNonConfig = this.mHost.getFragmentManager().retainNonConfig();
        if (retainNonConfig == null || retainNonConfig.getFragments() == null) {
            return null;
        }
        return new ArrayList(retainNonConfig.getFragments());
    }

    @Deprecated
    public Parcelable saveAllState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("db9217", new Object[]{this});
        }
        return this.mHost.getFragmentManager().saveAllState();
    }

    @Deprecated
    public void restoreAllState(Parcelable parcelable, FragmentManagerNonConfig fragmentManagerNonConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605f10e4", new Object[]{this, parcelable, fragmentManagerNonConfig});
        } else {
            this.mHost.getFragmentManager().restoreAllState(parcelable, fragmentManagerNonConfig);
        }
    }
}
