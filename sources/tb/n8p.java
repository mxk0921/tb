package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SeekBarScrollInterceptView;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.layoutmanager.module.NavigationTabModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n8p extends gr9 implements NavigationTabModule.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String f = "SeekBarScrollInterceptLayer";
    private static final String g = "SeekBarScrollInterceptLayer";
    private final prp e;

    static {
        t2o.a(468714017);
        t2o.a(502268122);
    }

    public n8p(FluidContext fluidContext, prp prpVar) {
        super(fluidContext, prpVar);
        this.e = prpVar;
        IHostAppService iHostAppService = (IHostAppService) fluidContext.getService(IHostAppService.class);
        if (iHostAppService != null) {
            iHostAppService.addNavigationShowHideStatusListener(this);
        }
    }

    private SeekBarScrollInterceptView P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SeekBarScrollInterceptView) ipChange.ipc$dispatch("784ff14c", new Object[]{this});
        }
        IContainerService iContainerService = (IContainerService) this.b.getService(IContainerService.class);
        if (iContainerService != null) {
            return iContainerService.getScrollInterceptView();
        }
        return null;
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        ir9.b("SeekBarScrollInterceptLayer", "hide, logCardName=" + this.c.X());
        SeekBarScrollInterceptView P = P();
        if (P != null) {
            P.setVisibility(8);
            ir9.b("SeekBarScrollInterceptLayer", "hide, setViewGone");
        }
    }

    public static /* synthetic */ Object ipc$super(n8p n8pVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1249298707:
                super.onDisActive((uq9) objArr[0]);
                return null;
            case -147728739:
                super.onActive((uq9) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/layer/seekbar/SeekBarScrollInterceptLayer");
        }
    }

    @Override // tb.ojc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17e2e1f3", new Object[]{this});
        }
        return "SeekBarScrollInterceptLayer";
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onDisActive(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
            return;
        }
        super.onDisActive(uq9Var);
        Q();
    }

    @Override // tb.gr9, tb.ojc, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        Q();
    }

    private void R(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d758ed25", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        SeekBarScrollInterceptView P = P();
        boolean d = f2k.d(this.b);
        int e0 = this.e.e0();
        ir9.b("SeekBarScrollInterceptLayer", "setRelatedViewAndShowHide, videoBottomGap=" + e0 + ", logCardName=" + this.c.X());
        if (P != null && z && z2) {
            if (z3 || (d && e0 > 0)) {
                P.setVisibility(8);
                ir9.b("SeekBarScrollInterceptLayer", "setRelatedViewAndShow, setViewGone");
                return;
            }
            P.setCurrentRelatedView(this.e.x1().R(), this.e.y1().Y());
            P.setVisibility(0);
            ir9.b("SeekBarScrollInterceptLayer", "setRelatedViewAndShow, setViewVisible");
        }
    }

    @Override // tb.gr9, tb.ojc, tb.o6d
    public void onResume() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        boolean h0 = this.c.h0();
        IHostAppService iHostAppService = (IHostAppService) this.b.getService(IHostAppService.class);
        if (iHostAppService != null && iHostAppService.isTabBarHide()) {
            z = true;
        }
        ir9.b("SeekBarScrollInterceptLayer", "onResume, isActive=" + h0 + ", isTabBarHide=" + z + ", logCardName=" + this.c.X());
        R(true, h0, z);
    }

    @Override // com.taobao.android.layoutmanager.module.NavigationTabModule.d
    public void F(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a4f1fd", new Object[]{this, new Boolean(z)});
            return;
        }
        ILifecycleService iLifecycleService = (ILifecycleService) this.b.getService(ILifecycleService.class);
        if (iLifecycleService == null || iLifecycleService.getPageState() != 2) {
            z2 = false;
        }
        boolean h0 = this.c.h0();
        ir9.b("SeekBarScrollInterceptLayer", "onNavigationShowHideStatusChanged, isResume=" + z2 + ", isActive=" + h0 + ", isHideStatus=" + z + ", logCardName=" + this.c.X());
        R(z2, h0, z);
    }

    @Override // tb.gr9, tb.ojc, tb.wlb
    public void onActive(uq9 uq9Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
            return;
        }
        super.onActive(uq9Var);
        ILifecycleService iLifecycleService = (ILifecycleService) this.b.getService(ILifecycleService.class);
        boolean z2 = iLifecycleService != null && iLifecycleService.getPageState() == 2;
        IHostAppService iHostAppService = (IHostAppService) this.b.getService(IHostAppService.class);
        if (iHostAppService != null && iHostAppService.isTabBarHide()) {
            z = true;
        }
        ir9.b("SeekBarScrollInterceptLayer", "onActive, isResume=" + z2 + ", isTabBarHide=" + z + ", logCardName=" + this.c.X());
        R(z2, true, z);
    }
}
