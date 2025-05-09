package com.taobao.search.searchdoor.ai;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.BaseSearchDoorFragment;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.ai.AISearchDoorFragment;
import com.taobao.search.searchdoor.ai.AISearchWidget;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import kotlin.a;
import tb.ckf;
import tb.d1a;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class AISearchDoorFragment extends BaseSearchDoorFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean g;
    public final njg h = a.b(new d1a() { // from class: tb.b32
        @Override // tb.d1a
        public final Object invoke() {
            AISearchWidget d;
            d = AISearchDoorFragment.d(AISearchDoorFragment.this);
            return d;
        }
    });
    public SearchDoorActivity i;

    static {
        t2o.a(815793042);
    }

    public static final AISearchWidget d(AISearchDoorFragment aISearchDoorFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AISearchWidget) ipChange.ipc$dispatch("b34d3572", new Object[]{aISearchDoorFragment});
        }
        ckf.g(aISearchDoorFragment, "this$0");
        SearchDoorActivity searchDoorActivity = aISearchDoorFragment.i;
        if (searchDoorActivity == null) {
            ckf.y("activity");
            throw null;
        } else if (searchDoorActivity != null) {
            return new AISearchWidget(searchDoorActivity, searchDoorActivity);
        } else {
            ckf.y("activity");
            throw null;
        }
    }

    public static /* synthetic */ Object ipc$super(AISearchDoorFragment aISearchDoorFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 303778162) {
            super.u2();
            return null;
        } else if (hashCode == 999033108) {
            super.v2();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/ai/AISearchDoorFragment");
        }
    }

    public final AISearchWidget E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AISearchWidget) ipChange.ipc$dispatch("47eb5ece", new Object[]{this});
        }
        return (AISearchWidget) this.h.getValue();
    }

    public void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8eaedd", new Object[]{this});
        } else if (!this.g) {
            this.g = true;
            AISearchWidget E2 = E2();
            ViewGroup r2 = r2();
            ckf.d(r2);
            E2.J2(r2);
        }
    }

    public final void K2(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6753fc3f", new Object[]{this, searchDoorActivity});
            return;
        }
        ckf.g(searchDoorActivity, "activity");
        this.i = searchDoorActivity;
    }

    public final void M2(SearchDoorContext searchDoorContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a62b53", new Object[]{this, searchDoorContext});
            return;
        }
        ckf.g(searchDoorContext, "searchContext");
        E2().O2(searchDoorContext);
    }

    public final void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            E2().destroyAndRemoveFromParent();
        }
    }

    @Override // com.taobao.search.searchdoor.BaseSearchDoorFragment
    public ViewGroup p2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2f81585e", new Object[]{this, layoutInflater, viewGroup});
        }
        ckf.d(layoutInflater);
        return new FrameLayout(layoutInflater.getContext());
    }

    @Override // com.taobao.search.searchdoor.BaseSearchDoorFragment
    public void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.u2();
        J2();
        E2().onCtxResumeInternal();
    }

    @Override // com.taobao.search.searchdoor.BaseSearchDoorFragment
    public void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        super.v2();
        E2().onCtxPauseInternal();
    }
}
