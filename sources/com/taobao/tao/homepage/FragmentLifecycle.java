package com.taobao.tao.homepage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import tb.f4b;
import tb.qao;
import tb.sfh;
import tb.t2o;
import tb.ts9;
import tb.uqa;
import tb.wcm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FragmentLifecycle extends FragmentManager.FragmentLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809257);
    }

    public static /* synthetic */ Object ipc$super(FragmentLifecycle fragmentLifecycle, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1791925260) {
            super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
            return null;
        } else if (hashCode == -938247425) {
            super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/homepage/FragmentLifecycle");
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0f5ae2", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        uqa.b("【Homepage_PageLifeCycle】", "onFragmentActivityCreated", "执行onFragmentActivityCreated");
        if (a(fragment.getContext())) {
            ts9.a(fragment, bundle);
        } else {
            qao.a(fragment, bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentPaused(fragmentManager, fragment);
        try {
            wcm.e(fragment);
            if (a(fragment.getContext())) {
                ts9.b();
            }
        } catch (Throwable unused) {
            sfh.d("popcenter.lifecycle", "onFragmentPause(): PopCenter pause error");
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
        try {
            wcm.g(fragment);
            if (a(fragment.getContext())) {
                ts9.c(fragment);
            } else {
                qao.b(fragment);
            }
        } catch (Throwable unused) {
            sfh.d("popcenter.lifecycle", "onFragmentResume(): PopCenter resume error");
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d383dc8", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        uqa.b("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "执行onFragmentSaveInstanceState");
        qao.c(fragment, bundle);
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e747a0ca", new Object[]{this, context})).booleanValue();
        }
        return TBDeviceUtils.p(context) && f4b.b("enableFoldDeviceRestore", true);
    }
}
