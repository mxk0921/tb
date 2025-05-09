package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.tbmainfragment.SupportFragment;
import com.taobao.tao.tbmainfragment.TBMainFragment;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import java.util.List;
import tb.akt;
import tb.anl;
import tb.rnl;
import tb.sll;
import tb.t2o;
import tb.zcr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBFragmentContainer extends SupportFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rnl f8193a;
    public zcr.a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements sll.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.sll.a
        public void a(int i, anl anlVar) {
            zcr p2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("454ef19e", new Object[]{this, new Integer(i), anlVar});
            } else if (i == 0 && (p2 = TBFragmentContainer.p2(TBFragmentContainer.this)) != null) {
                p2.pop();
            }
        }
    }

    static {
        t2o.a(502268059);
    }

    public static /* synthetic */ Object ipc$super(TBFragmentContainer tBFragmentContainer, String str, Object... objArr) {
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
            case 1615357278:
                return new Boolean(super.onBackPressedSupport());
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/TBFragmentContainer");
        }
    }

    public static /* synthetic */ zcr p2(TBFragmentContainer tBFragmentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zcr) ipChange.ipc$dispatch("88810444", new Object[]{tBFragmentContainer});
        }
        return tBFragmentContainer.r2();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public FragmentAnimator getFragmentAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("ce8bca08", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public boolean onBackPressedSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6048655e", new Object[]{this})).booleanValue();
        }
        rnl rnlVar = this.f8193a;
        if (rnlVar == null || rnlVar.y().isEmpty()) {
            return super.onBackPressedSupport();
        }
        this.f8193a.h(true, true);
        return true;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        return null;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public FragmentAnimator onCreateFragmentAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentAnimator) ipChange.ipc$dispatch("c5eed56d", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        rnl rnlVar = this.f8193a;
        if (rnlVar != null) {
            rnlVar.i();
        }
        zcr r2 = r2();
        if (r2 != null) {
            r2.h1();
        }
        s2();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        rnl rnlVar = this.f8193a;
        if (rnlVar != null) {
            if (isRemoving() || isDetached()) {
                z = true;
            }
            rnlVar.b(z);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        rnl rnlVar = this.f8193a;
        if (rnlVar != null) {
            rnlVar.c();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        rnl rnlVar = this.f8193a;
        if (rnlVar != null) {
            rnlVar.d();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        rnl rnlVar = this.f8193a;
        if (rnlVar != null) {
            rnlVar.e();
        }
    }

    public final zcr r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zcr) ipChange.ipc$dispatch("eff1d9a6", new Object[]{this});
        }
        try {
            List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
            if (fragments == null) {
                return null;
            }
            for (Fragment fragment : fragments) {
                if (fragment instanceof TBMainFragment) {
                    for (Fragment fragment2 : ((TBMainFragment) fragment).getChildFragmentManager().getFragments()) {
                        if (fragment2 instanceof zcr) {
                            return (zcr) fragment2;
                        }
                    }
                    continue;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void s2() {
        List<Pair<View, String>> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb7a202", new Object[]{this});
            return;
        }
        zcr.a aVar = this.c;
        if (!(aVar == null || (list = aVar.b) == null)) {
            for (Pair<View, String> pair : list) {
                ((View) pair.first).setVisibility(0);
            }
        }
    }

    public void u2(View view, List<Pair<View, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f97922", new Object[]{this, view, list});
        } else {
            this.c = new zcr.a(view, list);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.f8193a == null) {
            String string = getArguments().getString("url");
            Bundle bundle2 = getArguments().getBundle("params");
            rnl rnlVar = new rnl(getActivity());
            this.f8193a = rnlVar;
            rnlVar.l(akt.A2());
            this.f8193a.m(true, this.c);
            rnl rnlVar2 = this.f8193a;
            zcr.a aVar = this.c;
            rnlVar2.t(string, aVar != null ? aVar.b : null, bundle2);
            this.f8193a.v(new a());
        }
        return this.f8193a.getContainerView();
    }
}
