package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.floatview.lowprice.LowPriceInfoController;
import com.taobao.android.detail.ttdetail.widget.BarrageView;
import com.taobao.android.dinamicx.DXRootView;
import java.util.List;
import java.util.Map;
import tb.eo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lp1 extends u3a implements omh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c d;
    public DXRootView e;
    public DXRootView f;
    public JSONObject g;
    public LowPriceInfoController h;
    public JSONObject i;
    public FrameLayout j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements eo7.s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eo7 f23481a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ FrameLayout c;

        public a(eo7 eo7Var, JSONObject jSONObject, FrameLayout frameLayout) {
            this.f23481a = eo7Var;
            this.b = jSONObject;
            this.c = frameLayout;
        }

        @Override // tb.eo7.s
        public void a(l38 l38Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8845bc8b", new Object[]{this, l38Var});
                return;
            }
            tgh.b("BarrageComponent", "downLoadTemplates onSuccess:" + l38Var.toString());
            ViewGroup h = hl6.h(this.f23481a, this.b, l38Var);
            if (h instanceof DXRootView) {
                lp1.I(lp1.this, (DXRootView) h);
                this.c.addView(h);
                this.f23481a.y(lp1.H(lp1.this));
            }
        }

        @Override // tb.eo7.s
        public void b(l38 l38Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c26b7f5c", new Object[]{this, l38Var, str});
                return;
            }
            tgh.b("BarrageComponent", "downLoadTemplates onFailure:" + str + " info:" + l38Var.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements eo7.s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eo7 f23482a;

        public b(eo7 eo7Var) {
            this.f23482a = eo7Var;
        }

        @Override // tb.eo7.s
        public void a(l38 l38Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8845bc8b", new Object[]{this, l38Var});
                return;
            }
            tgh.b("BarrageComponent", "downLoadTemplates onSuccess: info:" + l38Var.a());
            ViewGroup h = hl6.h(this.f23482a, lp1.J(lp1.this), l38Var);
            if (h instanceof DXRootView) {
                FrameLayout frameLayout = new FrameLayout(lp1.this.mContext);
                lp1.K(lp1.this).addView(frameLayout, new FrameLayout.LayoutParams(-2, -2, 80));
                lp1.M(lp1.this, (DXRootView) h);
                frameLayout.addView(h);
                this.f23482a.y(lp1.L(lp1.this));
            }
        }

        @Override // tb.eo7.s
        public void b(l38 l38Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c26b7f5c", new Object[]{this, l38Var, str});
                return;
            }
            tgh.b("BarrageComponent", "downLoadTemplates onFailure:" + str + " info:" + l38Var.a());
        }
    }

    static {
        t2o.a(912261393);
        t2o.a(912261815);
    }

    public lp1(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ DXRootView H(lp1 lp1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("17fd220a", new Object[]{lp1Var});
        }
        return lp1Var.e;
    }

    public static /* synthetic */ DXRootView I(lp1 lp1Var, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("55b04a7", new Object[]{lp1Var, dXRootView});
        }
        lp1Var.e = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ JSONObject J(lp1 lp1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6ff2cce", new Object[]{lp1Var});
        }
        return lp1Var.i;
    }

    public static /* synthetic */ FrameLayout K(lp1 lp1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("90c42b4a", new Object[]{lp1Var});
        }
        return lp1Var.j;
    }

    public static /* synthetic */ DXRootView L(lp1 lp1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("7a3f8927", new Object[]{lp1Var});
        }
        return lp1Var.f;
    }

    public static /* synthetic */ DXRootView M(lp1 lp1Var, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("dd0f4ac4", new Object[]{lp1Var, dXRootView});
        }
        lp1Var.f = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ Object ipc$super(lp1 lp1Var, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/BarrageComponent");
    }

    public final void N(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4ace4e", new Object[]{this, jSONObject});
            return;
        }
        if (this.i == null) {
            jSONObject.put("template", (Object) this.g);
            this.i = jSONObject;
        }
        eo7 g = this.mDetailContext.g();
        hl6.e(g, this.i, new b(g));
    }

    public final void O(JSONObject jSONObject, FrameLayout frameLayout) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f675e1", new Object[]{this, jSONObject, frameLayout});
        } else if (frameLayout != null && (jSONObject2 = jSONObject.getJSONObject("shopTreasure")) != null && !jSONObject2.isEmpty() && (jSONObject3 = jSONObject2.getJSONObject("fields")) != null && !jSONObject3.isEmpty()) {
            FrameLayout frameLayout2 = new FrameLayout(this.mContext);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-2, -2, 80));
            eo7 g = this.mDetailContext.g();
            hl6.e(g, jSONObject3, new a(g, jSONObject3, frameLayout2));
        }
    }

    public final FrameLayout P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("5a5b06cb", new Object[]{this});
        }
        FrameLayout I = ((sx9) getParentComponent()).I();
        if (I != null) {
            I.removeAllViews();
        }
        return I;
    }

    public final boolean Q() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e918a9c", new Object[]{this})).booleanValue();
        }
        if (!vbl.K()) {
            return true;
        }
        JSONObject j = this.mDetailContext.e().j();
        if (j != null && com.taobao.android.detail.ttdetail.floatview.globalbarrage.c.a(j)) {
            z = true;
        }
        return !z;
    }

    public void R(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4584e6c", new Object[]{this, jSONObject});
        } else {
            N(jSONObject);
        }
    }

    public final void S(boolean z, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99d2506", new Object[]{this, new Boolean(z), frameLayout});
            return;
        }
        if (z) {
            P();
        }
        this.j = frameLayout;
    }

    public final void T(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d069f", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("mtopConfig");
            JSONObject jSONObject4 = jSONObject2.getJSONObject("template");
            this.g = jSONObject4;
            if (jSONObject3 != null && jSONObject4 != null) {
                String string = jSONObject3.getString("apiMethod");
                String string2 = jSONObject3.getString("apiVersion");
                JSONObject jSONObject5 = jSONObject3.getJSONObject("data");
                if (jSONObject5 != null && string != null && string2 != null) {
                    this.h = new LowPriceInfoController(jSONObject5, string, string2, this);
                }
            }
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.j(false);
        }
        this.mDetailContext.g().y(this.e);
    }

    @Override // tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.j(true);
        }
        this.mDetailContext.g().z(this.e);
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        BarrageView barrageView = new BarrageView(this.mContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        boolean v = yc4.v((tx9) getParentComponent().getComponentData());
        layoutParams.bottomMargin = mr7.b(this.mContext, v ? 72.0f : 50.0f);
        frameLayout.addView(barrageView, layoutParams);
        if (this.mDetailContext.e().o()) {
            return frameLayout;
        }
        if (Q()) {
            c cVar = new c(null);
            this.d = cVar;
            c.a(cVar, this.mContext, this.mDetailContext, barrageView, this.mComponentData.f(), this.mComponentData.c());
        }
        JSONObject jSONObject = new JSONObject(this.mComponentData.f()).getJSONObject("extraFloat");
        if (jSONObject == null || jSONObject.isEmpty()) {
            if (v) {
                P();
            }
            return frameLayout;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sameTypeLowPrice");
        if (jSONObject2 != null && this.h == null) {
            S(v, frameLayout);
            T(jSONObject2);
            return frameLayout;
        } else if (this.f != null) {
            S(v, frameLayout);
            N(null);
            return frameLayout;
        } else {
            if (v) {
                FrameLayout P = P();
                if (P != null) {
                    O(jSONObject, P);
                }
            } else {
                O(jSONObject, frameLayout);
            }
            zqp.a().d((Resource) this.mDetailContext.e().f(Resource.class), this.mContext);
            return frameLayout;
        }
    }

    @Override // tb.oa4
    public zy9 onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("5fd8d0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return new zy9(-1, -1, 17);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONArray f23483a;
        public int b;
        public BarrageView c;
        public eo7 d;
        public l38 e;
        public double f;
        public boolean g;
        public int h;
        public boolean i;
        public final BarrageView.c j;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements eo7.s {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(c cVar) {
            }

            @Override // tb.eo7.s
            public void a(l38 l38Var) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8845bc8b", new Object[]{this, l38Var});
                    return;
                }
                tgh.b("BarrageComponent", "downLoadTemplates onSuccess:" + l38Var.toString());
            }

            @Override // tb.eo7.s
            public void b(l38 l38Var, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c26b7f5c", new Object[]{this, l38Var, str});
                    return;
                }
                tgh.b("BarrageComponent", "downLoadTemplates onFailure:" + str + " info:" + l38Var.a());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    c.b(c.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.lp1$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0984c implements BarrageView.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0984c() {
            }

            @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.c
            public View a(Context context, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (View) ipChange.ipc$dispatch("2108ceec", new Object[]{this, context, obj});
                }
                return hl6.h(c.c(c.this), (JSONObject) obj, c.d(c.this));
            }

            @Override // com.taobao.android.detail.ttdetail.widget.BarrageView.c
            public void b(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ffb7ec6c", new Object[]{this, view});
                } else {
                    c.e(c.this);
                }
            }
        }

        static {
            t2o.a(912261396);
        }

        public c() {
            this.b = 0;
            this.f = 1.0d;
            this.i = false;
            this.j = new C0984c();
        }

        public static /* synthetic */ void a(c cVar, Context context, ze7 ze7Var, BarrageView barrageView, JSONObject jSONObject, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5752ec10", new Object[]{cVar, context, ze7Var, barrageView, jSONObject, map});
            } else {
                cVar.h(context, ze7Var, barrageView, jSONObject, map);
            }
        }

        public static /* synthetic */ void b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7891cae", new Object[]{cVar});
            } else {
                cVar.i();
            }
        }

        public static /* synthetic */ eo7 c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eo7) ipChange.ipc$dispatch("c21f0d1a", new Object[]{cVar});
            }
            return cVar.d;
        }

        public static /* synthetic */ l38 d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l38) ipChange.ipc$dispatch("3f4b910a", new Object[]{cVar});
            }
            return cVar.e;
        }

        public static /* synthetic */ void e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4fccacb", new Object[]{cVar});
            } else {
                cVar.g();
            }
        }

        public final void f(Map<String, List<ir>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43179474", new Object[]{this, map});
            } else if (map != null && map.size() != 0) {
                for (int i = 0; i < this.f23483a.size(); i++) {
                    this.f23483a.getJSONObject(i).put("events", (Object) map);
                }
            }
        }

        public final void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("701c5b4b", new Object[]{this});
            } else {
                this.c.postDelayed(new b(), (long) (this.f * 1000.0d));
            }
        }

        public final void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a523265f", new Object[]{this});
            } else if (!this.i) {
                int i = this.b;
                int i2 = i + 1;
                JSONArray jSONArray = this.f23483a;
                if (jSONArray != null) {
                    if (i2 < jSONArray.size()) {
                        this.b = i2;
                    } else if (this.g) {
                        this.b = 0;
                    } else {
                        return;
                    }
                    if (!this.c.addData(this.f23483a.getJSONObject(this.b), true)) {
                        this.b = i;
                    }
                }
            }
        }

        public void j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba159a29", new Object[]{this, new Boolean(z)});
            } else if (!this.i || z) {
                this.i = z;
            } else {
                this.i = z;
                i();
            }
        }

        public final void h(Context context, ze7 ze7Var, BarrageView barrageView, JSONObject jSONObject, Map<String, List<ir>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a502a74", new Object[]{this, context, ze7Var, barrageView, jSONObject, map});
                return;
            }
            this.d = ze7Var.g();
            this.f = jSONObject.getDoubleValue("scrollTimeInterval");
            JSONArray jSONArray = jSONObject.getJSONArray("barrageData");
            if (jSONArray == null || jSONArray.size() == 0) {
                tgh.b("BarrageComponent", "no barrage data");
                return;
            }
            JSONArray jSONArray2 = this.f23483a;
            boolean z = jSONArray2 == null || jSONArray2.size() != jSONArray.size();
            this.f23483a = jSONArray;
            this.g = jSONObject.getBooleanValue("isInfinite");
            this.h = jSONObject.getIntValue("maxBarrageCount");
            f(map);
            l38 e = hl6.e(this.d, jSONObject, new a(this));
            if (e != null) {
                this.e = e;
                barrageView.setMaxCount(this.h);
                barrageView.setItemSpace(0);
                barrageView.setAnimatorDuration(300L);
                this.c = barrageView;
                if (z) {
                    barrageView.initDatas(this.f23483a.subList(0, 1), this.j);
                    g();
                }
            }
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }
}
