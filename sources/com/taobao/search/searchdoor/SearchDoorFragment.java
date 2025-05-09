package com.taobao.search.searchdoor;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget;
import tb.ckf;
import tb.o2p;
import tb.q5;
import tb.r2p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchDoorFragment extends BaseSearchDoorFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public r2p g;
    public boolean h;

    static {
        t2o.a(815792947);
    }

    public static /* synthetic */ Object ipc$super(SearchDoorFragment searchDoorFragment, String str, Object... objArr) {
        if (str.hashCode() == 303778162) {
            super.u2();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/SearchDoorFragment");
    }

    public final r2p D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2p) ipChange.ipc$dispatch("c648409", new Object[]{this});
        }
        r2p r2pVar = this.g;
        if (r2pVar != null) {
            return r2pVar;
        }
        ckf.y("wrapper");
        throw null;
    }

    public final void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a27443", new Object[]{this});
            return;
        }
        r2p r2pVar = this.g;
        if (r2pVar != null) {
            r2pVar.S();
        } else {
            ckf.y("wrapper");
            throw null;
        }
    }

    public final void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d052686", new Object[]{this});
            return;
        }
        r2p r2pVar = this.g;
        if (r2pVar != null) {
            r2pVar.T();
        } else {
            ckf.y("wrapper");
            throw null;
        }
    }

    public final void K2(SearchDoorActivity searchDoorActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6753fc3f", new Object[]{this, searchDoorActivity});
            return;
        }
        ckf.g(searchDoorActivity, "activity");
        this.g = new q5(searchDoorActivity);
        z2(new FrameLayout(searchDoorActivity));
        r2p r2pVar = this.g;
        if (r2pVar != null) {
            r2pVar.U(r2());
        } else {
            ckf.y("wrapper");
            throw null;
        }
    }

    public final void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        r2p r2pVar = this.g;
        if (r2pVar != null) {
            r2pVar.M();
        } else {
            ckf.y("wrapper");
            throw null;
        }
    }

    @Override // com.taobao.search.searchdoor.BaseSearchDoorFragment
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        r2p r2pVar = this.g;
        if (r2pVar != null) {
            r2pVar.R(z);
        } else {
            ckf.y("wrapper");
            throw null;
        }
    }

    @Override // com.taobao.search.searchdoor.BaseSearchDoorFragment
    public ViewGroup p2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2f81585e", new Object[]{this, layoutInflater, viewGroup});
        }
        if (r2() == null) {
            ckf.d(layoutInflater);
            z2(new FrameLayout(layoutInflater.getContext()));
        }
        ViewGroup r2 = r2();
        ckf.d(r2);
        return r2;
    }

    @Override // com.taobao.search.searchdoor.BaseSearchDoorFragment
    public void u2() {
        SearchBarWidget O2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.u2();
        r2p r2pVar = this.g;
        if (r2pVar != null) {
            r2pVar.P();
            if (this.h) {
                r2p r2pVar2 = this.g;
                if (r2pVar2 != null) {
                    o2p o2pVar = r2pVar2.c;
                    if (!(o2pVar == null || (O2 = o2pVar.O2()) == null)) {
                        O2.showKeyBoard();
                    }
                    this.h = false;
                    return;
                }
                ckf.y("wrapper");
                throw null;
            }
            return;
        }
        ckf.y("wrapper");
        throw null;
    }

    @Override // com.taobao.search.searchdoor.BaseSearchDoorFragment
    public void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        r2p r2pVar = this.g;
        if (r2pVar != null) {
            r2pVar.O();
            this.h = true;
            return;
        }
        ckf.y("wrapper");
        throw null;
    }
}
