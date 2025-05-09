package com.taobao.tao.tbmainfragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.tao.log.TLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBMainFragmentLifecycle extends FragmentManager.FragmentLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946391);
    }

    public static /* synthetic */ Object ipc$super(TBMainFragmentLifecycle tBMainFragmentLifecycle, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2028521039:
                super.onFragmentCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case -1819213449:
                super.onFragmentViewDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1791925260:
                super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1704408514:
                super.onFragmentStopped((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -938247425:
                super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -701661701:
                super.onFragmentDetached((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -588941558:
                super.onFragmentViewCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (View) objArr[2], (Bundle) objArr[3]);
                return null;
            case -378518774:
                super.onFragmentStarted((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -228225358:
                super.onFragmentDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case 1276074722:
                super.onFragmentActivityCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/tbmainfragment/TBMainFragmentLifecycle");
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0f5ae2", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentActivityCreated".concat(fragment.getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871739b1", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentCreated".concat(fragment.getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2658eb2", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentDestroyed(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentDestroyed".concat(fragment.getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d7dfb", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentDetached(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentDetached".concat(fragment.getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentPaused(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentPaused".concat(fragment.getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        FragmentActivity activity;
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
        if (!(!Versions.isDebug() || (activity = fragment.getActivity()) == null || (intent = activity.getIntent()) == null || (data = intent.getData()) == null)) {
            Log.e("TBMainFragmentLifecycle", "onActivityResumed url:" + data.toString());
        }
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentResumed".concat(fragment.getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e970430a", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStarted(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentStarted".concat(fragment.getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a68ca3e", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStopped(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentStopped".concat(fragment.getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce5770a", new Object[]{this, fragmentManager, fragment, view, bundle});
            return;
        }
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentViewCreated".concat(fragment.getClass().getSimpleName()));
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93910177", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentViewDestroyed".concat(fragment.getClass().getSimpleName()));
    }
}
