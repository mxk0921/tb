package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffFloatModel;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.dinamicx.DXRootView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.eo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g28 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mog f19697a;
    public final fl6 b;
    public eo7 c;
    public final Map<String, DXRootView> d = new HashMap();
    public FrameLayout e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements eo7.r {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l38 f19698a;
        public final /* synthetic */ FrameLayout b;
        public final /* synthetic */ LightOffFloatModel c;

        public a(l38 l38Var, FrameLayout frameLayout, LightOffFloatModel lightOffFloatModel) {
            this.f19698a = l38Var;
            this.b = frameLayout;
            this.c = lightOffFloatModel;
        }

        @Override // tb.eo7.r
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            String a2 = pfh.a("DxFloatController", BTags.XLightOff);
            tgh.b(a2, "addFloatViews failure: " + str);
        }

        @Override // tb.eo7.r
        public void b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
            } else if (viewGroup instanceof DXRootView) {
                DXRootView dXRootView = (DXRootView) viewGroup;
                g28.a(g28.this).put(this.f19698a.a(), dXRootView);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                if (all.INSTANCE.f(g28.b(g28.this).f24181a)) {
                    layoutParams.gravity = 85;
                }
                this.b.addView(dXRootView, layoutParams);
                g28.this.g(this.c);
                g28.c(g28.this).y(dXRootView);
                tgh.b(pfh.a("DxFloatController", BTags.XLightOff), "addFloatViews success");
            }
        }
    }

    static {
        t2o.a(438304834);
    }

    public g28(mog mogVar, oog oogVar) {
        this.b = oogVar;
        this.f19697a = mogVar;
    }

    public static /* synthetic */ Map a(g28 g28Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("59ff151a", new Object[]{g28Var});
        }
        return g28Var.d;
    }

    public static /* synthetic */ mog b(g28 g28Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mog) ipChange.ipc$dispatch("47f1e75d", new Object[]{g28Var});
        }
        return g28Var.f19697a;
    }

    public static /* synthetic */ eo7 c(g28 g28Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eo7) ipChange.ipc$dispatch("6a389d84", new Object[]{g28Var});
        }
        return g28Var.c;
    }

    public void d(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcfefc7d", new Object[]{this, frameLayout});
            return;
        }
        List<LightOffFloatModel> list = this.f19697a.g;
        if (list != null && ((ArrayList) list).size() != 0) {
            Context context = this.f19697a.f24181a;
            if (context instanceof TTDetailBaseActivity) {
                eo7 g = ((TTDetailBaseActivity) context).q3().g();
                this.c = g;
                g.D(xn6.DX_EVENT_XLIGHTOFFPAGETAP, new xn6());
            } else if (context != null) {
                eo7 i = new eo7.q(this.f19697a.f24181a, eo7.DINAMIC_BIZ_NAME).j(15).k("detail").i();
                this.c = i;
                i.D(xn6.DX_EVENT_XLIGHTOFFPAGETAP, new xn6());
                gos.e(this.c);
                cos.e(this.c);
            }
            this.e = frameLayout;
            Iterator it = ((ArrayList) this.f19697a.g).iterator();
            while (it.hasNext()) {
                LightOffFloatModel lightOffFloatModel = (LightOffFloatModel) it.next();
                if ("dinamicx".equals(lightOffFloatModel.containerType) && this.c != null) {
                    e(lightOffFloatModel);
                    l38 l38Var = new l38(lightOffFloatModel.name, eq4.a(lightOffFloatModel.version), lightOffFloatModel.url);
                    this.c.i(l38Var, new a(l38Var, frameLayout, lightOffFloatModel));
                }
            }
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be73510", new Object[]{this, new Integer(i)});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
            ((DXRootView) entry.getValue()).setVisibility(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements eo7.t {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(g28 g28Var) {
        }

        @Override // tb.eo7.t
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            String a2 = pfh.a("DxFloatController", BTags.XLightOff);
            tgh.b(a2, "updateFloatView failure: " + str);
        }

        @Override // tb.eo7.t
        public void b(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
            } else {
                tgh.b(pfh.a("DxFloatController", BTags.XLightOff), "updateFloatView success");
            }
        }
    }

    public final void e(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594fb4af", new Object[]{this, lightOffFloatModel});
        } else if (lightOffFloatModel.data.getJSONObject("fields") != null) {
            int z = pb6.z(this.f19697a.f24181a, this.e.getHeight());
            lightOffFloatModel.data.getJSONObject("fields").put("dxHeight", (Object) Integer.valueOf(pb6.z(this.f19697a.f24181a, this.e.getHeight())));
            lightOffFloatModel.data.getJSONObject("fields").put("statusHeight", (Object) Integer.valueOf(pb6.z(this.f19697a.f24181a, u1m.a())));
            String a2 = pfh.a("DxFloatController", BTags.XLightOff);
            tgh.b(a2, "renderDX dxHeight:" + z);
        }
    }

    public void g(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc5b16a", new Object[]{this, lightOffFloatModel});
        } else if ("dinamicx".equals(lightOffFloatModel.containerType) && this.c != null) {
            DXRootView dXRootView = (DXRootView) ((HashMap) this.d).get(lightOffFloatModel.name);
            if (dXRootView == null) {
                tgh.b(pfh.a("DxFloatController", BTags.XLightOff), "updateFloatView no rootView");
                return;
            }
            e(lightOffFloatModel);
            this.c.J(dXRootView, pb6.j(), pb6.i(), new JSONObject(lightOffFloatModel.data), new b(this), true, this.b);
        }
    }
}
