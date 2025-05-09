package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gq4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f20163a;
    public final Context b;
    public final DinamicXEngine c;
    public DXRootView d;
    public DXRecyclerLayout e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements gf5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f20165a;
        public final /* synthetic */ int b;
        public final /* synthetic */ DXTemplateItem c;

        public b(JSONObject jSONObject, int i, DXTemplateItem dXTemplateItem) {
            this.f20165a = jSONObject;
            this.b = i;
            this.c = dXTemplateItem;
        }

        @Override // tb.gf5
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            odg.c("ContentViewManager", "create dx( name:" + this.c.f7343a + " version:" + this.c.b + " url:" + this.c.c + " ) failed, error: " + str);
        }

        @Override // tb.gf5
        public void b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
            } else if ((viewGroup instanceof DXRootView) && gq4.b(gq4.this) == null) {
                gq4.c(gq4.this, (DXRootView) viewGroup);
                ViewParent parent = gq4.b(gq4.this).getParent();
                if (parent != gq4.d(gq4.this)) {
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(gq4.b(gq4.this));
                    }
                    gq4.d(gq4.this).removeAllViews();
                    gq4.d(gq4.this).addView(gq4.b(gq4.this));
                }
                gq4 gq4Var = gq4.this;
                gq4Var.s(gq4.b(gq4Var), this.f20165a, this.b);
            }
        }
    }

    static {
        t2o.a(629145621);
    }

    public gq4(Context context, DinamicXEngine dinamicXEngine) {
        this.b = context;
        this.c = dinamicXEngine;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20163a = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-1);
    }

    public static /* synthetic */ DXRecyclerLayout a(gq4 gq4Var, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("32ba99e4", new Object[]{gq4Var, dXRecyclerLayout});
        }
        gq4Var.e = dXRecyclerLayout;
        return dXRecyclerLayout;
    }

    public static /* synthetic */ DXRootView b(gq4 gq4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("1f0df672", new Object[]{gq4Var});
        }
        return gq4Var.d;
    }

    public static /* synthetic */ DXRootView c(gq4 gq4Var, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("9c3c77d3", new Object[]{gq4Var, dXRootView});
        }
        gq4Var.d = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ FrameLayout d(gq4 gq4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("11bdf2b5", new Object[]{gq4Var});
        }
        return gq4Var.f20163a;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d43f837", new Object[]{this, str});
        } else if (this.e != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str);
            dq4.g(DXRecyclerLayout.MSG_METHOD_LOAD_MORE, jSONObject, this.e);
        }
    }

    public final boolean f(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59bc973e", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        DXRootView dXRootView = this.d;
        if (dXRootView == null || dXRootView.getDxTemplateItem() == null || this.d.getParent() != this.f20163a) {
            return false;
        }
        return true;
    }

    public void g(DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea8eaa8", new Object[]{this, dXTemplateItem, jSONObject, new Integer(i)});
        } else if (dXTemplateItem != null && !f(dXTemplateItem)) {
            il6.b(this.c, dXTemplateItem, this.f20163a, new b(jSONObject, i, dXTemplateItem));
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99098998", new Object[]{this})).intValue();
        }
        return this.f20163a.getHeight() - this.f20163a.getPaddingTop();
    }

    public View i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.f20163a;
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e2d366", new Object[]{this, new Integer(i)});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.e;
        if (dXRecyclerLayout != null) {
            dXRecyclerLayout.c1(false, i);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
        } else {
            v();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.d = null;
        this.e = null;
        this.f20163a.removeAllViews();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
        } else {
            w();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            v();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            w();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275e0369", new Object[]{this});
            return;
        }
        int a2 = a65.a(44.0f) + vwo.g(this.b);
        if (a2 >= 0 && this.f20163a.getPaddingTop() != a2) {
            this.f20163a.setPadding(0, a2, 0, 0);
        }
    }

    public void q(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a12f14b", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem != null) {
            int h = h();
            if (f(dXTemplateItem)) {
                s(this.d, jSONObject, h);
            } else {
                g(dXTemplateItem, jSONObject, h);
            }
        }
    }

    public void r(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1b3083", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem != null) {
            int h = h();
            if (f(dXTemplateItem)) {
                s(this.d, jSONObject, h);
            } else {
                g(dXTemplateItem, jSONObject, h);
            }
        }
    }

    public void s(ViewGroup viewGroup, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1c87a3", new Object[]{this, viewGroup, jSONObject, new Integer(i)});
        } else {
            t(viewGroup, jSONObject, pb6.s(Globals.getApplication()), i);
        }
    }

    public final void t(ViewGroup viewGroup, JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d974dfc0", new Object[]{this, viewGroup, jSONObject, new Integer(i), new Integer(i2)});
        } else {
            il6.c(this.c, (DXRootView) viewGroup, DXWidgetNode.DXMeasureSpec.c(i, 1073741824), DXWidgetNode.DXMeasureSpec.c(i2, 1073741824), jSONObject, new a(viewGroup));
        }
    }

    public void u(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97199b21", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem != null) {
            if (f(dXTemplateItem)) {
                x(jSONObject);
            } else {
                g(dXTemplateItem, jSONObject, h());
            }
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9b3e14", new Object[]{this});
        } else if (this.e != null) {
            this.c.t0(this.d);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c932de74", new Object[]{this});
        } else if (this.e != null) {
            this.c.u0(this.d);
        }
    }

    public void x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f20b517", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.e != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(bia.UNDER_TAKE_GOODS_LIST);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONArray);
            dq4.g(DXRecyclerLayout.MSG_METHOD_REFRESH_DATA, jSONObject2, this.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements if5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f20164a;

        public a(ViewGroup viewGroup) {
            this.f20164a = viewGroup;
        }

        @Override // tb.if5
        public void b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
            } else if (viewGroup instanceof DXRootView) {
                gq4.a(gq4.this, (DXRecyclerLayout) ((DXRootView) viewGroup).getExpandWidgetNode().queryWidgetNodeByUserId("recyclerContentList"));
            }
        }

        @Override // tb.if5
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            odg.c("ContentViewManager", "render dxView( " + this.f20164a + " ) failed, error: " + str);
        }
    }
}
