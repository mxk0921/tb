package com.taobao.themis.container.app.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import kotlin.Metadata;
import tb.ckf;
import tb.p8s;
import tb.t2o;
import tb.x5d;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSTBHomeSubPageFragment;", "Lcom/taobao/themis/container/app/page/TMSBaseFragment;", "<init>", "()V", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSTBHomeSubPageFragment extends TMSBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public x5d e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    static {
        t2o.a(835715116);
    }

    public static final /* synthetic */ void J2(TMSTBHomeSubPageFragment tMSTBHomeSubPageFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ec0b91", new Object[]{tMSTBHomeSubPageFragment});
        } else {
            tMSTBHomeSubPageFragment.K2();
        }
    }

    public static /* synthetic */ Object ipc$super(TMSTBHomeSubPageFragment tMSTBHomeSubPageFragment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/container/app/page/TMSTBHomeSubPageFragment");
    }

    public final void K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d719660a", new Object[]{this});
            return;
        }
        E2();
        ITMSPage z2 = z2();
        if (z2 != null) {
            z2.B(this);
        }
        ITMSPage z22 = z2();
        if (z22 != null) {
            z22.s();
        }
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, tb.tll
    public x5d getPageContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x5d) ipChange.ipc$dispatch("9b384128", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, tb.tll
    public y0e getTitleBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
        }
        x5d x5dVar = this.e;
        if (x5dVar == null) {
            return null;
        }
        return x5dVar.getTitleBar();
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x5d x5dVar;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
        ViewGroup viewGroup2 = null;
        if (iContainerViewFactory == null) {
            x5dVar = null;
        } else {
            FragmentActivity activity = getActivity();
            ckf.f(activity, "activity");
            ITMSPage z2 = z2();
            ckf.d(z2);
            x5dVar = iContainerViewFactory.createPageContainer(activity, z2);
        }
        this.e = x5dVar;
        if (x5dVar == null) {
            view = null;
        } else {
            view = x5dVar.getView();
        }
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            }
            if (viewGroup2 != null) {
                viewGroup2.endViewTransition(view);
                viewGroup2.removeAllViews();
            }
        }
        View A2 = A2();
        if (A2 != null) {
            A2.setBackgroundColor(-1);
        }
        View A22 = A2();
        if (A22 != null) {
            ViewProxy.setOnClickListener(A22, a.INSTANCE);
        }
        return view;
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else if (!isAdded() || getActivity() == null) {
            CommonExtKt.q(new TMSTBHomeSubPageFragment$onViewCreated$1(this), 32L);
        } else {
            K2();
        }
    }
}
