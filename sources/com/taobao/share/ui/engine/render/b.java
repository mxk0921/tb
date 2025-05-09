package com.taobao.share.ui.engine.render;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.render.PanelWindow;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.base.VesselBaseView;
import com.ut.share.business.ShareBusiness;
import java.util.HashMap;
import tb.kkp;
import tb.ma4;
import tb.ogs;
import tb.rb;
import tb.t2o;
import tb.ukj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_SHARE_DIALOG_CLOSE = "action.share_dialog_close";

    /* renamed from: a  reason: collision with root package name */
    public PanelWindow f11779a;
    public com.taobao.share.ui.engine.render.a b;
    public VesselView c;
    public WeexBizView d;
    public com.taobao.share.ui.engine.weex.a e;
    public boolean g;
    public ma4 h;
    public final Handler f = new Handler(Looper.getMainLooper());
    public final PanelWindow.b i = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements PanelWindow.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            } else if (b.a(b.this) != null) {
                kkp.e().i(b.this.d, kkp.SHARE_PANEL_DESTROY);
                b.a(b.this).dismiss();
            }
        }
    }

    static {
        t2o.a(667942966);
    }

    public b(Activity activity) {
        this.f11779a = new PanelWindow(activity);
    }

    public static /* synthetic */ PanelWindow a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PanelWindow) ipChange.ipc$dispatch("80b3c8fe", new Object[]{bVar});
        }
        return bVar.f11779a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f11779a != null) {
            kkp.e().i(this.d, kkp.SHARE_PANEL_DESTROY);
            this.f11779a.close();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (this.f11779a != null) {
            kkp.e().i(this.d, kkp.SHARE_PANEL_DESTROY);
            this.f11779a.dismiss();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        if (ShareBizAdapter.getInstance().getFriendsProvider() != null) {
            ShareBizAdapter.getInstance().getFriendsProvider().f();
        }
        ogs.a();
        com.taobao.share.ui.engine.weex.a aVar = this.e;
        if (aVar != null) {
            aVar.c();
        }
        this.e = null;
        VesselView vesselView = this.c;
        if (vesselView != null && (vesselView.getChildProxyView() instanceof VesselBaseView)) {
            try {
                ((VesselBaseView) this.c.getChildProxyView()).releaseMemory();
            } catch (Throwable unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(rb.RESULT_KEY, "close");
        ShareBusiness.getInstance().onSharePanelClosed(hashMap);
        this.f11779a = null;
    }

    public void e(PopupWindow.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51c1bc7", new Object[]{this, onDismissListener});
            return;
        }
        PanelWindow panelWindow = this.f11779a;
        if (panelWindow != null) {
            panelWindow.setOnDismissListener(onDismissListener);
        }
    }

    public void f(com.taobao.share.ui.engine.weex.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754addb7", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public void g(com.taobao.share.ui.engine.render.a aVar) {
        PanelWindow panelWindow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afc50eb", new Object[]{this, aVar});
        } else if (aVar != null && (panelWindow = this.f11779a) != null) {
            this.b = aVar;
            if (!panelWindow.isShowing()) {
                this.f11779a.show((Activity) ((ukj) aVar).j().getContext());
            }
            this.f11779a.container.removeAllViews();
            ukj ukjVar = (ukj) aVar;
            this.f11779a.container.addView(ukjVar.j());
            ukjVar.p(this.i);
        }
    }

    public void h(WeexBizView weexBizView) {
        PanelWindow panelWindow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ef2cff", new Object[]{this, weexBizView});
        } else if (weexBizView != null && (panelWindow = this.f11779a) != null) {
            this.d = weexBizView;
            if (!panelWindow.isShowing()) {
                kkp.e().h(this.d, kkp.SHARE_PANEL_CREATE, kkp.SHARE_PANEL_PAGENAME, "https://web.m.taobao.com/app/message-social-front/share-panel/N4?wh_weex=true&weex_mode=dom", null);
                this.f11779a.show((Activity) weexBizView.getContext());
            }
            this.f11779a.container.removeAllViews();
            this.f11779a.container.addView(weexBizView);
        }
    }

    public void i(VesselView vesselView) {
        PanelWindow panelWindow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd918112", new Object[]{this, vesselView});
        } else if (vesselView != null && (panelWindow = this.f11779a) != null) {
            this.c = vesselView;
            if (!panelWindow.isShowing()) {
                this.f11779a.show((Activity) vesselView.getContext());
            }
            this.f11779a.container.removeAllViews();
            this.f11779a.container.addView(vesselView);
        }
    }
}
