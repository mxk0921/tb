package com.taobao.themis.container.app.page;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import kotlin.Metadata;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.dee;
import tb.jes;
import tb.o9s;
import tb.p8s;
import tb.q9s;
import tb.qml;
import tb.t2o;
import tb.tll;
import tb.x5d;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSBaseFragment;", "Landroidx/fragment/app/Fragment;", "Ltb/tll;", "<init>", "()V", "Companion", "a", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class TMSBaseFragment extends Fragment implements tll {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public ITMSPage f13487a;
    public x5d c;
    public View d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(835715095);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(835715094);
        t2o.a(839909509);
    }

    public static /* synthetic */ Object ipc$super(TMSBaseFragment tMSBaseFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/page/TMSBaseFragment");
        }
    }

    public static final /* synthetic */ void p2(TMSBaseFragment tMSBaseFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ad0aa4", new Object[]{tMSBaseFragment});
        } else {
            tMSBaseFragment.s2();
        }
    }

    public static final /* synthetic */ void r2(TMSBaseFragment tMSBaseFragment, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238d1f69", new Object[]{tMSBaseFragment, iTMSPage});
        } else {
            tMSBaseFragment.B2(iTMSPage);
        }
    }

    public final View A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7f28de07", new Object[]{this});
        }
        return this.d;
    }

    public final void B2(ITMSPage iTMSPage) {
        x5d createPageContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b47cc47", new Object[]{this, iTMSPage});
            return;
        }
        TMSLogger.a("TMSBaseFragment", "loadPage");
        this.f13487a = iTMSPage;
        E2();
        Context context = getContext();
        if (context == null) {
            TMSLogger.b("TMSBaseFragment", "Activity context is null, loadPage fail");
            return;
        }
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
        x5d x5dVar = null;
        ViewGroup viewGroup = null;
        x5dVar = null;
        if (!(iContainerViewFactory == null || (createPageContainer = iContainerViewFactory.createPageContainer(context, iTMSPage)) == null)) {
            View A2 = A2();
            if (A2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) A2;
            }
            if (viewGroup != null) {
                viewGroup.addView(createPageContainer.getView());
            }
            x5dVar = createPageContainer;
        }
        this.c = x5dVar;
        iTMSPage.B(this);
        iTMSPage.s();
    }

    public final void C2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8628b9", new Object[]{this, view});
        } else {
            this.d = view;
        }
    }

    public final void D2(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11535bc3", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        this.f13487a = iTMSPage;
        E2();
    }

    public final void E2() {
        bbs bbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9616946e", new Object[]{this});
        } else if (q9s.N1()) {
            ITMSPage iTMSPage = this.f13487a;
            String str = null;
            if (iTMSPage == null) {
                bbsVar = null;
            } else {
                bbsVar = iTMSPage.getInstance();
            }
            IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter != null) {
                iUserTrackerAdapter.updatePageProperties(getActivity(), jes.c(bbsVar));
            }
            IUserTrackerAdapter iUserTrackerAdapter2 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter2 != null) {
                iUserTrackerAdapter2.updatePageUtParam(getActivity(), jes.d(bbsVar));
            }
            IUserTrackerAdapter iUserTrackerAdapter3 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter3 != null) {
                iUserTrackerAdapter3.updatePageName(getActivity(), jes.a(bbsVar));
            }
            if (q9s.s2()) {
                ITMSPage iTMSPage2 = this.f13487a;
                if (iTMSPage2 != null && qml.z(iTMSPage2)) {
                    IUserTrackerAdapter iUserTrackerAdapter4 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
                    if (iUserTrackerAdapter4 != null) {
                        FragmentActivity activity = getActivity();
                        if (bbsVar != null) {
                            str = bbsVar.e0();
                        }
                        iUserTrackerAdapter4.updatePageUrl(activity, str);
                        return;
                    }
                    return;
                }
                IUserTrackerAdapter iUserTrackerAdapter5 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
                if (iUserTrackerAdapter5 != null) {
                    FragmentActivity activity2 = getActivity();
                    ITMSPage iTMSPage3 = this.f13487a;
                    if (iTMSPage3 != null) {
                        str = iTMSPage3.c();
                    }
                    iUserTrackerAdapter5.updatePageUrl(activity2, str);
                    return;
                }
                return;
            }
            IUserTrackerAdapter iUserTrackerAdapter6 = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
            if (iUserTrackerAdapter6 != null) {
                FragmentActivity activity3 = getActivity();
                if (bbsVar != null) {
                    str = bbsVar.e0();
                }
                iUserTrackerAdapter6.updatePageUrl(activity3, str);
            }
        }
    }

    @Override // tb.tll
    public Activity getCurrentActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        return getActivity();
    }

    @Override // tb.tll
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
        }
        return this;
    }

    @Override // tb.tll
    public x5d getPageContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x5d) ipChange.ipc$dispatch("9b384128", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.tll
    public y0e getTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
        }
        return tll.a.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewParent viewParent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View view = this.d;
        if (view != null) {
            ViewGroup viewGroup2 = null;
            if (view == null) {
                viewParent = null;
            } else {
                viewParent = view.getParent();
            }
            if (viewParent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewParent;
            }
            if (viewGroup2 != null) {
                viewGroup2.endViewTransition(A2());
                viewGroup2.removeAllViews();
            }
            return this.d;
        }
        LinearLayout linearLayout = new LinearLayout(getActivity());
        this.d = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view2 = this.d;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
        return this.d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ITMSPage iTMSPage = this.f13487a;
        if (iTMSPage != null) {
            iTMSPage.destroy();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        dee deeVar;
        ITMSPage topPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ITMSPage iTMSPage = this.f13487a;
        if (iTMSPage != null) {
            iTMSPage.onPause();
        }
        ITMSPage iTMSPage2 = this.f13487a;
        if (iTMSPage2 != null && (deeVar = (dee) iTMSPage2.getExtension(dee.class)) != null && deeVar.S0() && (topPage = iTMSPage2.getInstance().W().getTopPage()) != null && qml.z(topPage)) {
            topPage.onStart();
            topPage.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ITMSPage iTMSPage = this.f13487a;
        if (iTMSPage != null) {
            iTMSPage.onResume();
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
        ITMSPage iTMSPage = this.f13487a;
        if (iTMSPage != null) {
            iTMSPage.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        ITMSPage iTMSPage = this.f13487a;
        if (iTMSPage != null) {
            iTMSPage.onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        TMSLogger.a("TMSBaseFragment", "onViewCreated");
        s2();
    }

    public final void s2() {
        ITMSPage iTMSPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4803f602", new Object[]{this});
            return;
        }
        TMSLogger.a("TMSBaseFragment", "createViewSafely");
        if (!isAdded() || this.d == null || getActivity() == null || (iTMSPage = this.f13487a) == null) {
            CommonExtKt.q(new TMSBaseFragment$createViewSafely$2(this), 32L);
            return;
        }
        ckf.d(iTMSPage);
        if (!u2(iTMSPage) || !o9s.i(getContext())) {
            ITMSPage iTMSPage2 = this.f13487a;
            ckf.d(iTMSPage2);
            B2(iTMSPage2);
            return;
        }
        CommonExtKt.q(new TMSBaseFragment$createViewSafely$1(this), 100L);
    }

    public final boolean v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("537348b2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final ITMSPage z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("26554f74", new Object[]{this});
        }
        return this.f13487a;
    }

    public final boolean u2(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4e78869", new Object[]{this, iTMSPage})).booleanValue();
        }
        ckf.g(iTMSPage, "page");
        return qml.y(iTMSPage) && q9s.A();
    }
}
