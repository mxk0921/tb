package tb;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kpt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f22841a;
    public FrameLayout b;
    public a6b c;
    public int d = 8;
    public final yo1 e;

    static {
        t2o.a(491782834);
    }

    public kpt(cfc cfcVar) {
        this.f22841a = cfcVar;
        this.e = new yo1(cfcVar);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73d8d678", new Object[]{this})).intValue();
        }
        a6b a6bVar = this.c;
        if (a6bVar != null) {
            return a6bVar.j();
        }
        return -1;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859cff20", new Object[]{this});
            return;
        }
        if (this.c != null) {
            eve.c("ThemeWaiter", "updateGlobalThemeView");
            this.c.x();
            eve.b("ThemeWaiter", "updateGlobalThemeView");
        } else {
            k(this.f22841a);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        a6b a6bVar = this.c;
        if (a6bVar != null) {
            a6bVar.h();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badbf99e", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public void f(String str, s9c s9cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa3eba3", new Object[]{this, str, s9cVar});
        } else {
            this.c = new a6b(this.f22841a, str, s9cVar);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9f381e", new Object[]{this});
            return;
        }
        fve.e("ThemeWaiter", "onGlobalThemeChange");
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.f22841a.a(IDxItemRenderService.class);
        if (iDxItemRenderService != null) {
            iDxItemRenderService.reset();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f22841a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            iMainFeedsViewService.reloadUi();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe0f9c2", new Object[]{this});
            return;
        }
        a6b a6bVar = this.c;
        if (a6bVar != null) {
            a6bVar.r();
        }
    }

    public final void k(cfc cfcVar) {
        r9c g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a874638", new Object[]{this, cfcVar});
            return;
        }
        IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
        if (iHostService != null && (g = iHostService.getInvokeCallback().g()) != null) {
            g.setBgView(null);
        }
    }

    public FrameLayout c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("838f040f", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setBackgroundColor(0);
        this.b.setVisibility(this.d);
        fve.e("ThemeWaiter", "onGlobalThemeVisible mVisibility : " + this.d);
        return this.b;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
        } else if (vxl.b().y()) {
            fve.e("ThemeWaiter", "onFestivalRefresh.onFestivalRefresh");
            this.e.a();
        } else if (mve.a("enableResponseFestivalRefresh", true)) {
            fve.e("ThemeWaiter", "onFestivalRefresh.onGlobalThemeChange");
            h();
        }
    }

    public void i(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ade022", new Object[]{this, new Boolean(z)});
            return;
        }
        fve.e("ThemeWaiter", "onGlobalThemeVisible isVisible : " + z);
        if (z) {
            i = 8;
        }
        this.d = i;
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
    }
}
