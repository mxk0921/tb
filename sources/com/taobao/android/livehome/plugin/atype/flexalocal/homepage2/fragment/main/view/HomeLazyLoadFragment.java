package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.q0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class HomeLazyLoadFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f8840a = HomeLazyLoadFragment.class.getSimpleName() + toString();
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public ViewGroup g;

    static {
        t2o.a(310378789);
    }

    public static /* synthetic */ Object ipc$super(HomeLazyLoadFragment homeLazyLoadFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/HomeLazyLoadFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        q0h.a(this.f8840a, getClass().getSimpleName().concat("  onActivityCreated"));
        this.c = true;
        p2();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        q0h.a(this.f8840a, getClass().getSimpleName().concat("  onCreate"));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        q0h.a(this.f8840a, getClass().getSimpleName().concat("  onCreateView"));
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        q0h.a(this.f8840a, getClass().getSimpleName().concat("  onDestroy"));
        this.g = null;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        q0h.a(this.f8840a, getClass().getSimpleName().concat("  onDestroyView"));
        this.c = false;
        this.g = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        q0h.a(this.f8840a, getClass().getSimpleName().concat("  onPause"));
        u2();
        this.f = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        q0h.a(this.f8840a, getClass().getSimpleName().concat("  onResume"));
        if (this.d && this.c && this.f && this.e) {
            v2();
            this.f = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        q0h.a(this.f8840a, getClass().getSimpleName().concat("  onStart"));
    }

    public final void p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f8fe69", new Object[]{this});
            return;
        }
        String str = this.f8840a;
        q0h.a(str, "  dispatchVisibleEvent isVisibleToUser = " + getUserVisibleHint() + " --- isLayoutInitialized = " + this.c + " --- isLazyLoadFinished = " + this.d);
        if (!getUserVisibleHint() || !this.c) {
            if (this.d && this.e) {
                r2();
            }
        } else if (!this.d) {
            this.d = s2();
        } else {
            z2();
        }
        this.e = getUserVisibleHint();
    }

    public abstract void r2();

    public abstract boolean s2();

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        String str = this.f8840a;
        q0h.a(str, getClass().getSimpleName() + "  setUserVisibleHint isVisibleToUser = " + z);
        p2();
    }

    public abstract void u2();

    public abstract void v2();

    public abstract void z2();
}
