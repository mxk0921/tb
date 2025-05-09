package tb;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class u65 extends f85 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<g85> c;
    public final h85 e;
    public boolean g;
    public final List<g85> f = new ArrayList();
    public DWVideoScreenType d = this.f19096a.screenType();

    static {
        t2o.a(452985091);
    }

    public u65(DWContext dWContext, h85 h85Var) {
        super(dWContext);
        this.e = h85Var;
    }

    public static /* synthetic */ Object ipc$super(u65 u65Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/interactivelifecycle/display/DWBaseTimelineInteractive");
    }

    @Override // tb.f85
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71e3b9b5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void g(g85 g85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa61703", new Object[]{this, g85Var});
        } else if (g85Var.b()) {
        } else {
            if (g85Var.g.f31174a.renderFinished() || g85Var.e.f31174a.renderFinished()) {
                g85Var.d = 1;
                h(g85Var.e, DWVideoScreenType.NORMAL);
                h(g85Var.f, DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                h(g85Var.g, DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                g85Var.h = true;
            }
        }
    }

    public final void h(x65 x65Var, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45da919a", new Object[]{this, x65Var, dWVideoScreenType});
            return;
        }
        DWComponent dWComponent = x65Var.f31174a;
        if (dWComponent.getView() != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dWComponent.getView().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            View view = x65Var.f31174a.getView();
            if (view != null && !TextUtils.isEmpty(x65Var.f31174a.getSource())) {
                view.setTag(R.id.weex_view_source, x65Var.f31174a.getSource());
                view.setTag(R.id.target_screen_type, dWVideoScreenType.toString());
            }
            this.e.a(x65Var.f31174a.getView(), layoutParams);
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466e6131", new Object[]{this, new Integer(i)});
            return;
        }
        List<g85> list = this.c;
        if (list != null) {
            int size = ((ArrayList) list).size();
            for (int i2 = 0; i2 < size; i2++) {
                g85 g85Var = (g85) ((ArrayList) this.c).get(i2);
                if (g85Var.b >= i || g85Var.c < i || this.f19096a.isFloating()) {
                    int i3 = g85Var.d;
                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                        g85Var.f19782a = this.d;
                        m(g85Var);
                    }
                } else {
                    if (!g85Var.h) {
                        g85Var.f19782a = this.d;
                        if (d()) {
                            g85Var.c();
                        }
                        g(g85Var);
                    }
                    int i4 = g85Var.d;
                    if (i4 == 1 || i4 == 4) {
                        g85Var.f19782a = this.d;
                        p(g85Var);
                    }
                    int i5 = g85Var.d;
                    if (i5 == 2 || i5 == 3) {
                        g85Var.f19782a = this.d;
                        s(g85Var);
                    }
                }
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<g85> list = this.c;
        if (list != null && ((ArrayList) list).size() > 0) {
            int size = ((ArrayList) this.c).size();
            for (int i = 0; i < size; i++) {
                g85 g85Var = (g85) ((ArrayList) this.c).get(i);
                x65 x65Var = g85Var.e;
                if (!(x65Var == null || x65Var.f31174a == null)) {
                    this.f19096a.getDWComponentManager().d(x65Var.f31174a.getDWComponentInstance());
                    x65Var.f31174a.destroy();
                }
                x65 x65Var2 = g85Var.g;
                if (!(x65Var2 == null || x65Var2.f31174a == null)) {
                    this.f19096a.getDWComponentManager().c(x65Var2.f31174a.getDWComponentInstance());
                    x65Var2.f31174a.destroy();
                }
                x65 x65Var3 = g85Var.f;
                if (!(x65Var3 == null || x65Var3.f31174a == null)) {
                    this.f19096a.getDWComponentManager().e(x65Var3.f31174a.getDWComponentInstance());
                    x65Var3.f31174a.destroy();
                }
            }
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e105c45", new Object[]{this});
            return;
        }
        List<g85> list = this.c;
        if (list != null) {
            int size = ((ArrayList) list).size();
            for (int i = 0; i < size; i++) {
                g85 g85Var = (g85) ((ArrayList) this.c).get(i);
                int i2 = g85Var.d;
                if (i2 == 2 || i2 == 3) {
                    m(g85Var);
                }
            }
        }
    }

    public final void l() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb09792", new Object[]{this});
            return;
        }
        List<g85> list = this.f;
        if (list == null) {
            i = 0;
        } else {
            i = ((ArrayList) list).size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            ((g85) ((ArrayList) this.f).get(i2)).a();
        }
    }

    public void m(g85 g85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3ca824", new Object[]{this, g85Var});
        } else if (!g85Var.b()) {
            g85Var.f19782a = this.d;
            g85Var.a();
            DWContext dWContext = this.f19096a;
            if (!(dWContext == null || dWContext.getIctShowWeexCallback() == null)) {
                this.f19096a.getIctShowWeexCallback().b(g85Var.j, g85Var.f19782a.getValue());
            }
            ((ArrayList) this.f).remove(g85Var);
            g85Var.k = false;
            g85Var.d = 4;
        }
    }

    public final void n() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa64c70d", new Object[]{this});
            return;
        }
        List<g85> list = this.f;
        if (list == null) {
            i = 0;
        } else {
            i = ((ArrayList) list).size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            ((g85) ((ArrayList) this.f).get(i2)).d();
        }
    }

    public void o(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c3e19b", new Object[]{this, dWVideoScreenType});
            return;
        }
        List<g85> list = this.f;
        if (list != null && ((ArrayList) list).size() > 0) {
            int size = ((ArrayList) this.f).size();
            for (int i = 0; i < size; i++) {
                ((g85) ((ArrayList) this.f).get(i)).f19782a = dWVideoScreenType;
                s((g85) ((ArrayList) this.f).get(i));
                p((g85) ((ArrayList) this.f).get(i));
            }
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        } else {
            k();
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            i(i);
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else if (this.d != dWVideoScreenType) {
            this.d = dWVideoScreenType;
            List<g85> list = this.c;
            if (list != null && ((ArrayList) list).size() > 0) {
                o(this.d);
            }
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        } else {
            i(i);
        }
    }

    @Override // tb.i95, tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }

    public void p(g85 g85Var) {
        vtb vtbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd8b75f", new Object[]{this, g85Var});
        } else if (g85Var.b()) {
        } else {
            if (g85Var.e.f31174a.getView() != null || g85Var.g.f31174a.getView() != null) {
                g85Var.f19782a = this.d;
                if (!((ArrayList) this.f).contains(g85Var)) {
                    ((ArrayList) this.f).add(g85Var);
                }
                if (!this.g) {
                    g85Var.d = 2;
                    return;
                }
                g85Var.d();
                DWContext dWContext = this.f19096a;
                if (!(dWContext == null || dWContext.getIctShowWeexCallback() == null)) {
                    this.f19096a.getIctShowWeexCallback().a(g85Var.j, g85Var.f19782a.getValue());
                }
                DWContext dWContext2 = this.f19096a;
                if (!(dWContext2 == null || (vtbVar = dWContext2.mUTAdapter) == null || g85Var.k)) {
                    vtbVar.a("Page_DWVideo_Button-videoShowInteract", "expose", null, g85Var.i, dWContext2.getUTParams());
                    g85Var.k = true;
                }
                g85Var.d = 2;
            }
        }
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        if (!z) {
            l();
        } else {
            n();
        }
    }

    public final void s(g85 g85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccb4b2b", new Object[]{this, g85Var});
        } else if (!g85Var.b() && g85Var.e.f31174a.getView() != null && g85Var.g.f31174a.getView() != null && g85Var.f.f31174a.getView() != null) {
            g85Var.d = 3;
        }
    }

    public void r() {
        List<g85> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684668ab", new Object[]{this});
        } else if (this.f19096a != null && (list = this.c) != null && ((ArrayList) list).size() > 0) {
            try {
                int size = ((ArrayList) this.c).size();
                for (int i = 0; i < size; i++) {
                    if (!(((ArrayList) this.c).get(i) == null || !((g85) ((ArrayList) this.c).get(i)).h || ((g85) ((ArrayList) this.c).get(i)).e == null || ((g85) ((ArrayList) this.c).get(i)).e.f31174a == null)) {
                        ((g85) ((ArrayList) this.c).get(i)).e.f31174a.updateFrame();
                    }
                }
            } catch (Throwable unused) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "updateFrame error");
            }
        }
    }
}
