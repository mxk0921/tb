package com.taobao.themis.container.app.page;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.o9s;
import tb.p8s;
import tb.t2o;
import tb.tll;
import tb.vbs;
import tb.x5d;
import tb.y0e;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSFragment;", "Lcom/taobao/themis/container/app/page/TMSBaseFragment;", "<init>", "()V", "themis_container_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSFragment extends TMSBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile x5d e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final Map<String, Object> i = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements tll {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.tll
        public Activity getCurrentActivity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
            }
            return TMSFragment.this.getActivity();
        }

        @Override // tb.tll
        public Fragment getCurrentFragment() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("cb9d6b14", new Object[]{this});
            }
            return TMSFragment.this;
        }

        @Override // tb.tll
        public x5d getPageContainer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x5d) ipChange.ipc$dispatch("9b384128", new Object[]{this});
            }
            return TMSFragment.K2(TMSFragment.this);
        }

        @Override // tb.tll
        public y0e getTitleBar() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y0e) ipChange.ipc$dispatch("f0b2774c", new Object[]{this});
            }
            return tll.a.a(this);
        }
    }

    static {
        t2o.a(835715102);
    }

    public static final /* synthetic */ void J2(TMSFragment tMSFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57548cb5", new Object[]{tMSFragment});
        } else {
            tMSFragment.N2();
        }
    }

    public static final /* synthetic */ x5d K2(TMSFragment tMSFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x5d) ipChange.ipc$dispatch("a8fbf0ea", new Object[]{tMSFragment});
        }
        return tMSFragment.e;
    }

    public static final /* synthetic */ void M2(TMSFragment tMSFragment, ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17b40e8", new Object[]{tMSFragment, iTMSPage});
        } else {
            tMSFragment.O2(iTMSPage);
        }
    }

    public static /* synthetic */ Object ipc$super(TMSFragment tMSFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2147180915) {
            super.onSaveInstanceState((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/container/app/page/TMSFragment");
        }
    }

    public final void O2(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782fc1b5", new Object[]{this, iTMSPage});
            return;
        }
        E2();
        if (!this.f) {
            this.f = true;
            if (this.e == null) {
                IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
                x5d x5dVar = null;
                ViewGroup viewGroup = null;
                x5dVar = null;
                if (iContainerViewFactory != null) {
                    FragmentActivity activity = getActivity();
                    ckf.f(activity, "activity");
                    x5d createPageContainer = iContainerViewFactory.createPageContainer(activity, iTMSPage);
                    if (createPageContainer != null) {
                        View A2 = A2();
                        if (A2 instanceof ViewGroup) {
                            viewGroup = (ViewGroup) A2;
                        }
                        if (viewGroup != null) {
                            viewGroup.addView(createPageContainer.getView());
                        }
                        x5dVar = createPageContainer;
                    }
                }
                this.e = x5dVar;
            }
            iTMSPage.B(new a());
            iTMSPage.s();
        }
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
        View view;
        ViewParent viewParent;
        x5d x5dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ITMSPage z2 = z2();
        ViewGroup viewGroup2 = null;
        if (this.e == null && z2 != null) {
            IContainerViewFactory iContainerViewFactory = (IContainerViewFactory) p8s.b(IContainerViewFactory.class);
            if (iContainerViewFactory == null) {
                x5dVar = null;
            } else {
                FragmentActivity activity = getActivity();
                ckf.f(activity, "activity");
                x5dVar = iContainerViewFactory.createPageContainer(activity, z2);
            }
            this.e = x5dVar;
        }
        x5d x5dVar2 = this.e;
        if (x5dVar2 == null) {
            view = null;
        } else {
            view = x5dVar2.getView();
        }
        if (view == null) {
            view = new LinearLayout(getContext());
        }
        C2(view);
        View A2 = A2();
        if (A2 == null) {
            viewParent = null;
        } else {
            viewParent = A2.getParent();
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) viewParent;
        }
        if (viewGroup2 != null) {
            viewGroup2.endViewTransition(A2());
            viewGroup2.removeAllViews();
        }
        return A2();
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ITMSPage z2 = z2();
        if (z2 != null) {
            z2.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        this.i.put("onSaveInstanceState", Boolean.TRUE);
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else {
            N2();
        }
    }

    @Override // com.taobao.themis.container.app.page.TMSBaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (this.g && !this.h) {
            this.h = true;
            JSONObject jSONObject = new JSONObject(this.i);
            if (jSONObject.get("onSaveInstanceState") == null) {
                jSONObject.put((JSONObject) "onSaveInstanceState", (String) Boolean.FALSE);
            }
            vbs.v(jSONObject);
        }
    }

    public final void N2() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4803f602", new Object[]{this});
            return;
        }
        ITMSPage z2 = z2();
        if (!isAdded() || getActivity() == null || z2 == null) {
            if (!this.g) {
                this.g = true;
                this.i.put("isAdded", Boolean.valueOf(isAdded()));
                this.i.put("activity", Boolean.valueOf(getActivity() == null));
                Map<String, Object> map = this.i;
                if (z2 == null) {
                    z = true;
                }
                map.put("page", Boolean.valueOf(z));
                this.i.put("isDetached", Boolean.valueOf(isDetached()));
                this.i.put("isRemoving", Boolean.valueOf(isRemoving()));
            }
            CommonExtKt.q(new TMSFragment$createViewSafely$2(this), 32L);
        } else if (!u2(z2) || !o9s.i(getContext())) {
            O2(z2);
        } else {
            CommonExtKt.q(new TMSFragment$createViewSafely$1(this, z2), 100L);
        }
    }
}
