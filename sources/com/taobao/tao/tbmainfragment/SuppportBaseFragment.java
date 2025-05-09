package com.taobao.tao.tbmainfragment;

import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBBaseFragment;
import tb.nx9;
import tb.qxq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SuppportBaseFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12793a = true;
    public boolean c = true;
    public boolean d = true;

    static {
        t2o.a(775946382);
    }

    public static /* synthetic */ Object ipc$super(SuppportBaseFragment suppportBaseFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/tbmainfragment/SuppportBaseFragment");
        }
    }

    public final boolean checkSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32fb98e7", new Object[]{this})).booleanValue();
        }
        if (nx9.q(this.mActivity) || nx9.r(this.mActivity)) {
            return true;
        }
        return false;
    }

    public final boolean isForceDoOnStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("130f8e2", new Object[]{this})).booleanValue();
        }
        return qxq.k();
    }

    public final boolean isFragmentVisible() {
        FragmentActivity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12e2e603", new Object[]{this})).booleanValue();
        }
        if (checkSwitch() && (activity = getActivity()) != null) {
            return qxq.m(activity.getSupportFragmentManager());
        }
        return true;
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        if (shouldDoOnPause()) {
            this.d = true;
        }
        super.onPause();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        if (shouldDoOnResume()) {
            this.f12793a = true;
            this.c = true;
            this.d = false;
        }
        super.onResume();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        if (shouldDoOnStart()) {
            this.f12793a = true;
            this.d = true;
            this.c = false;
            setForceDoOnStart(false);
        }
        super.onStart();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        if (shouldDoOnStop()) {
            this.d = true;
            this.f12793a = false;
        }
        super.onStop();
    }

    public final void setForceDoOnStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483fab7e", new Object[]{this, new Boolean(z)});
        } else {
            qxq.n(z);
        }
    }

    public boolean shouldDoOnPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b71917e4", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch()) {
            return true;
        }
        return this.f12793a;
    }

    public boolean shouldDoOnResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10692235", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch()) {
            return true;
        }
        if (isFragmentVisible()) {
            return this.d;
        }
        return false;
    }

    public boolean shouldDoOnStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea050", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch() || isForceDoOnStart()) {
            return true;
        }
        if (isFragmentVisible()) {
            return this.c;
        }
        return false;
    }

    public boolean shouldDoOnStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("833a4aca", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch()) {
            return true;
        }
        return this.f12793a;
    }
}
