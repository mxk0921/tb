package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.taolivecontainer.TBLiveH5Container;
import java.util.HashMap;
import java.util.Map;
import tb.b0h;
import tb.bza;
import tb.dza;
import tb.e2h;
import tb.nkr;
import tb.qw0;
import tb.r0h;
import tb.t2o;
import tb.uxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeBottomH5Fragment extends HomeNormalFragment implements uxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean A = qw0.a();
    public int B;
    public int C;
    public int D;
    public nkr v;
    public TBLiveH5Container w;
    public String x;
    public boolean y;
    public FrameLayout z;

    static {
        t2o.a(310378653);
        t2o.a(806355488);
    }

    public static /* synthetic */ Object ipc$super(HomeBottomH5Fragment homeBottomH5Fragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -2049624054:
                super.X2();
                return null;
            case -1990827289:
                super.W2();
                return null;
            case -1665651870:
                super.v2((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1126882532:
                return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 86521170:
                super.e3();
                return null;
            case 303778162:
                super.T2();
                return null;
            case 999033108:
                super.U2();
                return null;
            case 1685858968:
                super.S2(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/HomeBottomH5Fragment");
        }
    }

    public static HomeBottomH5Fragment j3(Bundle bundle, b0h b0hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeBottomH5Fragment) ipChange.ipc$dispatch("23e493c0", new Object[]{bundle, b0hVar});
        }
        HomeBottomH5Fragment homeBottomH5Fragment = new HomeBottomH5Fragment();
        homeBottomH5Fragment.setArguments(bundle);
        homeBottomH5Fragment.f3(b0hVar);
        return homeBottomH5Fragment;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public String N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this});
        }
        return "HomeBottomH5Fragment";
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void S2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
            return;
        }
        super.S2(z);
        if (this.p != null) {
            int i = Globals.getApplication().getResources().getDisplayMetrics().widthPixels;
            b0h b0hVar = this.p;
            float f = i;
            this.B = (int) (((b0hVar.l * 1.0f) / f) * 375.0f);
            this.C = (int) (((b0hVar.k * 1.0f) / f) * 375.0f);
            int i2 = b0hVar.j;
            b0hVar.getClass();
            this.D = (int) (((Math.max(i2, 0) * 1.0f) / f) * 375.0f);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        super.U2();
        if (this.w != null) {
            r0h.b("HomeBottomH5Fragment", "onEvent " + this + " mTBLiveH5Container.pageDisAppear()");
            this.w.pageDisAppear();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895662e7", new Object[]{this});
            return;
        }
        super.W2();
        if (this.w != null) {
            r0h.b("HomeBottomH5Fragment", "onEvent " + this + " mTBLiveH5Container.onPause()");
            this.w.onPause();
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
        if (this.w != null) {
            r0h.b("HomeBottomH5Fragment", "onEvent " + this + " mTBLiveH5Container.onResume()");
            this.w.onResume();
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void e3() {
        b0h b0hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5283552", new Object[]{this});
            return;
        }
        super.e3();
        if (this.w != null && (b0hVar = this.p) != null) {
            if (b0hVar.v()) {
                this.w.changeScreenLandscape();
            } else {
                this.w.changeScreenPortrait();
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        if (this.A) {
            return R.layout.taolivehome_hotmarking_h5tab_flexalocal;
        }
        return -1;
    }

    public final void h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b8ad55", new Object[]{this});
            return;
        }
        if (this.w != null) {
            r0h.b("HomeBottomH5Fragment", "onEvent " + this + " mTBLiveH5Container.destroy()");
            if (this.w.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.w.getParent()).removeView(this.w);
            }
            this.w.destroy();
            this.w = null;
        }
        if (this.v != null) {
            r0h.b("HomeBottomH5Fragment", "onEvent " + this + " mTBLiveH5ContainerBuilder.destroy()");
            this.v.a();
            this.v = null;
        }
        if (this.z != null) {
            r0h.b("HomeBottomH5Fragment", "onEvent " + this + " mH5RootView.destroy()");
            this.z = null;
        }
    }

    @Override // tb.uxd
    public Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b1e0b2e5", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("h5ContainerRenderType", "Native");
        hashMap.put("appear", Boolean.valueOf(this.r));
        hashMap.put("tabBottom", JSON.toJSONString(this.t));
        hashMap.put("bottomBarHeight", Integer.valueOf(this.B));
        hashMap.put("navBarHeight", Integer.valueOf(this.C));
        hashMap.put("statusBarHeight", Integer.valueOf(this.D));
        return hashMap;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        TabManager.TabBottom tabBottom = this.t;
        if (tabBottom != null) {
            this.x = tabBottom.jumpUrl;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!this.A) {
            this.c.addView(layoutInflater.inflate(R.layout.taolivehome_hotmarking_h5tab_flexalocal, viewGroup, false));
            i3();
        }
        return this.c;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2, com.taobao.live.home.view.BaseLiveRecyclerFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        h3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        bundle.putSerializable("tab_bottom", this.t);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.live.home.view.BaseLiveRecyclerFragment
    public void v2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb82b62", new Object[]{this, view});
            return;
        }
        super.v2(view);
        i3();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment, com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2
    public void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        super.T2();
        if (!this.y) {
            r0h.b("HomeBottomH5Fragment", "onEvent " + this + " APPEAR mInit false");
            this.y = true;
            this.v.k(this.x);
            TBLiveH5Container f = this.v.f();
            this.w = f;
            f.setEnableWebViewGestureLogic(e2h.p());
            this.z.addView(this.w);
        }
        if (this.w != null) {
            r0h.b("HomeBottomH5Fragment", "onEvent " + this + " mTBLiveH5Container.pageAppear()");
            this.w.pageAppear();
        }
    }

    public final void i3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.z = (FrameLayout) this.c.findViewById(R.id.taolive_home_h5_container);
        this.B = (int) (((this.p.l * 1.0f) / qw0.l()) * 375.0f);
        this.C = (int) (((this.p.k * 1.0f) / qw0.l()) * 375.0f);
        int max = (int) (((Math.max(this.p.j, 0) * 1.0f) / qw0.l()) * 375.0f);
        this.D = max;
        String format = String.format("window._tlHomeInfo={safeArea:{statusBarHeight:%d,navBarHeight:%d,bottomBarHeight:%d}}", Integer.valueOf(max), Integer.valueOf(this.C), Integer.valueOf(this.B));
        if (this.v == null) {
            r0h.b("HomeBottomH5Fragment", "onRenderView " + this + " new mTBLiveH5ContainerBuilder");
            nkr nkrVar = new nkr(getContext(), "LiveUltraHomeTab", new bza(this), new dza(this), new String[]{format});
            this.v = nkrVar;
            nkrVar.u(this);
            this.v.n(this.x);
        }
    }
}
