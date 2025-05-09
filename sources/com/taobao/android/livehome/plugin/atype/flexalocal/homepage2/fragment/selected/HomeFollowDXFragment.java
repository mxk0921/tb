package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.login4android.api.Login;
import tb.b0h;
import tb.bjr;
import tb.myg;
import tb.nlc;
import tb.nvs;
import tb.qw0;
import tb.qyg;
import tb.r0h;
import tb.rzb;
import tb.sj7;
import tb.t2o;
import tb.wl7;
import tb.yl7;
import tb.zzg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeFollowDXFragment extends HomeSelectedBaseFragment implements nlc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DXRootView u;
    public JSONObject w;
    public JSONObject y;
    public boolean v = false;
    public boolean x = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements rzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.rzb
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6216d0", new Object[]{this, view});
            } else {
                HomeFollowDXFragment.this.getClass();
            }
        }

        @Override // tb.rzb
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a14aabed", new Object[]{this});
            } else {
                HomeFollowDXFragment.this.getClass();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements wl7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.wl7
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67253d14", new Object[]{this});
                return;
            }
            HomeFollowDXFragment.this.getClass();
            r0h.b("TaoLiveHomepage", "renderFollowDXContainer createDX fail");
        }

        @Override // tb.wl7
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fc7a84f", new Object[]{this});
                return;
            }
            HomeFollowDXFragment.this.getClass();
            r0h.b("TaoLiveHomepage", "renderFollowDXContainer createDX success");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements yl7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(HomeFollowDXFragment homeFollowDXFragment) {
        }

        @Override // tb.yl7
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            }
        }

        @Override // tb.yl7
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ac1a9ba", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(310378844);
        t2o.a(806355483);
    }

    public static /* synthetic */ Object ipc$super(HomeFollowDXFragment homeFollowDXFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2049624054:
                super.X2();
                return null;
            case -1665651870:
                super.v2((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1418964012:
                super.d3();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 303778162:
                super.T2();
                return null;
            case 999033108:
                super.U2();
                return null;
            case 1345585887:
                super.b3();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/selected/HomeFollowDXFragment");
        }
    }

    public static HomeFollowDXFragment m3(Bundle bundle, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeFollowDXFragment) ipChange.ipc$dispatch("38b43aa7", new Object[]{bundle, b0hVar});
        }
        HomeFollowDXFragment homeFollowDXFragment = new HomeFollowDXFragment();
        homeFollowDXFragment.setArguments(bundle);
        homeFollowDXFragment.f3(b0hVar);
        return homeFollowDXFragment;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this});
        }
        return "HomeFollowDXFragment";
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.T2();
        if (!this.v && this.c != null) {
            j3();
            this.v = true;
        }
        if (this.v && this.c != null) {
            n3();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
        } else {
            super.U2();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d5380a", new Object[]{this});
            return;
        }
        super.X2();
        if (this.v && this.c != null) {
            n3();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void d3() {
        RecyclerView j0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6c53d4", new Object[]{this});
            return;
        }
        super.d3();
        DXRootView dXRootView = this.u;
        if (dXRootView != null && dXRootView.getExpandWidgetNode() != null) {
            DXWidgetNode queryWidgetNodeByUserId = this.u.getExpandWidgetNode().queryWidgetNodeByUserId(k3());
            if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId;
                DXRecyclerLayout Z = dXRecyclerLayout.Z();
                if (dXRecyclerLayout.j0() != null) {
                    dXRecyclerLayout.j0().scrollToPosition(0);
                }
                if (!(dXRecyclerLayout.q0() == null || dXRecyclerLayout.q0().l() == null)) {
                    dXRecyclerLayout.q0().l().setAutoRefreshing(true);
                }
                if (Z != null && (j0 = Z.j0()) != null) {
                    j0.scrollToPosition(0);
                }
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment
    public void h3() {
        RecyclerView j0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafec08d", new Object[]{this});
            return;
        }
        DXRootView dXRootView = this.u;
        if (dXRootView != null) {
            JSONObject data = dXRootView.getData();
            DinamicXEngine dinamicEngine = this.p.q().getDinamicSdkManager().getDinamicEngine();
            if (dinamicEngine != null && this.u.getExpandWidgetNode() != null && getContext() != null) {
                int i = qw0.i((Activity) getContext());
                if (nvs.T()) {
                    i = qw0.i((Activity) getContext()) - sj7.c;
                }
                if (data != null) {
                    dinamicEngine.I0(this.u.getExpandWidgetNode(), 0, new DXWidgetRefreshOption.a().d(true).c(1).f(TBAutoSizeConfig.x().H(getContext())).e(i).g(false).a());
                }
                if (nvs.y()) {
                    DXWidgetNode queryWidgetNodeByUserId = this.u.getExpandWidgetNode().queryWidgetNodeByUserId(k3());
                    if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId;
                        DXRecyclerLayout Z = dXRecyclerLayout.Z();
                        if (dXRecyclerLayout.j0() != null) {
                            dXRecyclerLayout.j0().scrollToPosition(0);
                        }
                        if (Z != null && (j0 = Z.j0()) != null) {
                            j0.scrollToPosition(0);
                        }
                    }
                }
            }
        }
    }

    public void j3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7528eeb", new Object[]{this});
        } else if (this.c != null) {
            r0h.b("TaoLiveHomepage", "HomeFollowDXFragment forceReload");
            JSONObject d = this.p.d();
            this.w = d;
            if (d != null) {
                d.put("enableOptimize", (Object) Boolean.TRUE);
            }
            if (!(this.w == null || this.p == null || TabManager.q().j() == null || TabManager.q().j().sjsdParam == null)) {
                this.w.put("followSjsdParam", (Object) TabManager.q().j().sjsdParam);
            }
            o3();
        }
    }

    public String k3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ebaa97e", new Object[]{this});
        }
        return "followMainRecycler_new";
    }

    public String l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26e4135b", new Object[]{this});
        }
        return "follow_tabPage_appear";
    }

    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58d361b", new Object[]{this});
            return;
        }
        b0h b0hVar = this.p;
        if (b0hVar != null && b0hVar.q() != null && this.p.q().getDinamicSdkManager() != null && this.p.q().getDinamicSdkManager().getDinamicEngine() != null) {
            this.p.q().getDinamicSdkManager().getDinamicEngine().r(l3(), this.u, null, null, null);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        qyg.c().f(this);
        r0h.b("TaoLiveHomepage", "HomeFollowDXFragment");
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        qyg.c().j(this);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedBaseFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void v2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
            return;
        }
        super.v2(view);
        r0h.b("TaoLiveHomepage", "HomeFollowDXFragment lazyInitView");
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503402df", new Object[]{this});
            return;
        }
        super.b3();
        bjr.d().c(zzg.PLAY_PAGEID, false);
    }

    public void o3() {
        b0h b0hVar;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3983348d", new Object[]{this});
            return;
        }
        TabManager.TabUp tabUp = this.t;
        if (tabUp == null || tabUp.container == null) {
            r0h.b("HomeFollowDXFragment", "mTabUp == null || mTabUp.container == null");
        } else if (this.w != null && this.c != null && (b0hVar = this.p) != null && b0hVar.q() != null) {
            this.c.removeAllViews();
            if (!this.p.w || !nvs.t()) {
                r0h.b("TaoLiveHomepage", "renderFollowDXContainer createDX");
                this.u = this.p.q().getDinamicSdkManager().createDX(getContext(), this.t.container.getString("name"), new b());
            } else {
                r0h.b("TaoLiveHomepage", "renderFollowDXContainer preCreateDX");
                this.u = this.p.q().getDinamicSdkManager().preCreateDX(getContext(), this.t.container.getString("name"), new a());
            }
            r0h.b("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer 1");
            if (this.u != null) {
                r0h.b("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer render start");
                myg mygVar = new myg();
                if (this.w.get("stautsNavHeight") instanceof Integer) {
                    mygVar.o(this.w.getInteger("stautsNavHeight").intValue());
                }
                if (this.w.get("height") instanceof Float) {
                    mygVar.k(this.w.getFloat("height").floatValue());
                }
                if (this.w.get("bottomBarHeight") instanceof Float) {
                    mygVar.j(this.w.getFloat("bottomBarHeight").floatValue());
                }
                z = this.p.q().getDinamicSdkManager().renderDX(getContext(), this.u, this.w, new DXRenderOptions.b().E(mygVar).q(), new c(this));
            } else {
                z = false;
            }
            r0h.b("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer 2");
            if (z) {
                r0h.b("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer render success");
                this.c.addView(this.u);
                this.c.setVisibility(0);
            }
            r0h.b("TaoLiveHomepage", "HomeFollowDXFragment renderFollowDXContainer 3");
        }
    }

    @Override // tb.nlc
    public void onLiveEvent(String str, Object obj) {
        JSONObject jSONObject;
        b0h b0hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d9ef1c", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.login.success".equals(str)) {
            if (Login.checkSessionValid() && !this.x) {
                this.x = true;
                if (Login.checkSessionValid() && (jSONObject = this.y) != null) {
                    String string = jSONObject.getString("chainName");
                    JSONObject jSONObject2 = this.y.getJSONObject("params");
                    if (!TextUtils.isEmpty(string) && jSONObject2 != null && (b0hVar = this.p) != null && b0hVar.q() != null) {
                        this.p.q().getDinamicSdkManager().getDinamicEngine().r(string, this.u, jSONObject2, null, null);
                    }
                }
            }
        } else if ("com.taobao.taolive.follow.login".equals(str) && (obj instanceof JSONObject)) {
            this.y = (JSONObject) obj;
        }
    }
}
