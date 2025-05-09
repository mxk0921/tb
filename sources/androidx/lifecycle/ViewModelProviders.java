package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewModelProviders {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Deprecated
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory {
        @Deprecated
        public DefaultFactory(Application application) {
            super(application);
        }
    }

    private static Activity checkActivity(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("a99b7e32", new Object[]{fragment});
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    private static Application checkApplication(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("f3aece90", new Object[]{activity});
        }
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    public static ViewModelProvider of(Fragment fragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewModelProvider) ipChange.ipc$dispatch("bc762445", new Object[]{fragment}) : of(fragment, (ViewModelProvider.Factory) null);
    }

    public static ViewModelProvider of(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewModelProvider) ipChange.ipc$dispatch("40b78e74", new Object[]{fragmentActivity}) : of(fragmentActivity, (ViewModelProvider.Factory) null);
    }

    public static ViewModelProvider of(Fragment fragment, ViewModelProvider.Factory factory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelProvider) ipChange.ipc$dispatch("baba1ce6", new Object[]{fragment, factory});
        }
        Application checkApplication = checkApplication(checkActivity(fragment));
        if (factory == null) {
            factory = ViewModelProvider.AndroidViewModelFactory.getInstance(checkApplication);
        }
        return new ViewModelProvider(fragment.getViewModelStore(), factory);
    }

    public static ViewModelProvider of(FragmentActivity fragmentActivity, ViewModelProvider.Factory factory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewModelProvider) ipChange.ipc$dispatch("1a7f0cd5", new Object[]{fragmentActivity, factory});
        }
        Application checkApplication = checkApplication(fragmentActivity);
        if (factory == null) {
            factory = ViewModelProvider.AndroidViewModelFactory.getInstance(checkApplication);
        }
        return new ViewModelProvider(fragmentActivity.getViewModelStore(), factory);
    }
}
