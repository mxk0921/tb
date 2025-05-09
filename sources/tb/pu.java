package tb;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.DWPenetrateFrameLayout;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class pu implements ccc, xkc, IInteractiveProxy.d, IInteractiveProxy.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_CHECK_RENDER_SUCCESS = 1000;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f26301a;
    public View b;
    public FrameLayout c;
    public b d;
    public Context e;
    public String g;
    public boolean h;
    public zvg j;
    public final boolean k;
    public final Map<String, String> l;
    public final jyw i = new jyw(this);
    public final long f = tws.C() * 1000;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                pu.this.i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(String str, String str2);

        void renderSuccess(View view);
    }

    static {
        t2o.a(295699864);
        t2o.a(806356161);
        t2o.a(295699868);
        t2o.a(806355275);
        t2o.a(806355273);
    }

    public pu(Context context, ViewGroup viewGroup, Map<String, String> map, String str, boolean z) {
        this.e = context;
        this.f26301a = viewGroup;
        this.k = z;
        this.l = map;
    }

    @Override // tb.xkc
    public zvg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zvg) ipChange.ipc$dispatch("e3711b3e", new Object[]{this});
        }
        return this.j;
    }

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113ebb4b", new Object[]{this});
            return;
        }
        this.h = true;
        this.i.removeMessages(1000);
        k();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.g;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
        }
        h(false);
    }

    public void f(String str, ukr ukrVar, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff4edaa", new Object[]{this, str, ukrVar, ux9Var});
        }
    }

    public abstract boolean g();

    @Override // com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.b
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            return frameLayout;
        }
        return this.b;
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c575b92d", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 1000 && !this.h) {
            l();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        jyw jywVar = this.i;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.f26301a;
        if (viewGroup != null) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                viewGroup.removeView(frameLayout);
            }
            View view = this.b;
            if (view != null) {
                this.f26301a.removeView(view);
            }
        }
        this.b = null;
        this.f26301a = null;
        this.c = null;
        this.e = null;
        this.d = null;
        this.g = null;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public abstract void k();

    public abstract void l();

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public void n(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ad89ae", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95df87a7", new Object[]{this, str});
            return;
        }
        this.g = str;
        p(str);
        this.h = false;
        this.i.removeMessages(1000);
        this.i.sendEmptyMessageDelayed(1000, this.f);
    }

    public abstract void p(String str);

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("311aacec", new Object[]{this, str});
        }
    }

    public void r(olc olcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05c3135", new Object[]{this, olcVar});
            return;
        }
        zvg zvgVar = this.j;
        if (zvgVar != null) {
            zvgVar.m(olcVar);
        }
        if (zvg.h() != null) {
            zvg.h().m(olcVar);
        }
    }

    public void s(zlc zlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab61db5", new Object[]{this, zlcVar});
            return;
        }
        zvg zvgVar = this.j;
        if (zvgVar != null) {
            zvgVar.n(zlcVar);
        }
        if (zvg.h() != null) {
            zvg.h().n(zlcVar);
        }
    }

    public void t(zvg zvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded8233e", new Object[]{this, zvgVar});
        } else {
            this.j = zvgVar;
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
        }
        h(true);
    }

    public void e(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        FrameLayout.LayoutParams layoutParams;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1a99d", new Object[]{this, view});
            return;
        }
        this.b = view;
        if (view != null && this.f26301a != null) {
            Map<String, String> map = this.l;
            if (map != null) {
                int m = iw0.m((int) zqq.e(map.get("x")));
                int m2 = iw0.m((int) zqq.e(this.l.get("y")));
                int m3 = iw0.m((int) zqq.e(this.l.get("width")));
                int m4 = iw0.m((int) zqq.e(this.l.get("height")));
                boolean c = zqq.c(this.l.get("modal"));
                i2 = zqq.j(this.l.get("gravity"));
                if (m3 <= 0) {
                    m3 = -1;
                }
                if (m4 > 0) {
                    i5 = m2;
                    i = m;
                    z = c;
                    i3 = m4;
                    i4 = m3;
                } else {
                    i4 = m3;
                    i5 = m2;
                    i = m;
                    z = c;
                    i3 = -1;
                }
            } else {
                i = 0;
                i5 = 0;
                i4 = -1;
                i3 = -1;
                i2 = 80;
            }
            if (g() || z) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, i3);
                if (!tws.W()) {
                    layoutParams2.leftMargin = i;
                    layoutParams2.topMargin = i5;
                }
                layoutParams2.gravity = 80;
                if (i2 != -1) {
                    layoutParams2.gravity = i2;
                }
                if (g()) {
                    DWPenetrateFrameLayout dWPenetrateFrameLayout = new DWPenetrateFrameLayout(this.e);
                    this.c = dWPenetrateFrameLayout;
                    dWPenetrateFrameLayout.updateDrawingCache(true);
                } else {
                    this.c = new FrameLayout(this.e);
                }
                if (z) {
                    this.c.setOnClickListener(new a());
                }
                this.c.addView(this.b, layoutParams2);
                this.f26301a.addView(this.c, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            if (this.f26301a instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i4, i3);
                layoutParams3.gravity = 80;
                if (i2 != -1) {
                    layoutParams3.gravity = i2;
                }
                layoutParams = layoutParams3;
                if (!tws.W()) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = i;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = i5;
                    layoutParams = layoutParams3;
                }
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i4, i3);
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.topMargin = i5;
                layoutParams = marginLayoutParams;
            }
            this.f26301a.addView(this.b, layoutParams);
        }
    }
}
