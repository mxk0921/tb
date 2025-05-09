package com.taobao.android.detail.ttdetail.lightoff;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.DetailAdjustModel;
import com.taobao.android.detail.ttdetail.lightoff.DXFloatContainer;
import com.taobao.android.detail.ttdetail.runtime.RuntimeParam;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.util.SystemBarDecorator;
import tb.cy9;
import tb.eo7;
import tb.hl6;
import tb.l38;
import tb.mop;
import tb.mr7;
import tb.nb4;
import tb.pb6;
import tb.q2q;
import tb.t2o;
import tb.tgh;
import tb.vbl;
import tb.yc4;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LightOffLayerManger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PRICE_SECTION = "lightPriceSection";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6861a;
    public final DXFloatContainer b;
    public View c;
    public nb4 d;
    public final int e = pb6.j();
    public int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements DXFloatContainer.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail.ttdetail.lightoff.LightOffLayerManger$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0377a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f6864a;

            public RunnableC0377a(int i) {
                this.f6864a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LightOffLayerManger.a(LightOffLayerManger.this, this.f6864a);
                }
            }
        }

        public a() {
        }

        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fd15d77", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                LightOffLayerManger.b(LightOffLayerManger.this).post(new RunnableC0377a(i2));
            }
        }
    }

    static {
        t2o.a(912262069);
    }

    public LightOffLayerManger(ze7 ze7Var, DXFloatContainer dXFloatContainer) {
        this.f6861a = ze7Var;
        this.b = dXFloatContainer;
    }

    public static /* synthetic */ void a(LightOffLayerManger lightOffLayerManger, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81886c8", new Object[]{lightOffLayerManger, new Integer(i)});
        } else {
            lightOffLayerManger.l(i);
        }
    }

    public static /* synthetic */ DXFloatContainer b(LightOffLayerManger lightOffLayerManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXFloatContainer) ipChange.ipc$dispatch("b487bc0f", new Object[]{lightOffLayerManger});
        }
        return lightOffLayerManger.b;
    }

    public static /* synthetic */ View c(LightOffLayerManger lightOffLayerManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5b539d5b", new Object[]{lightOffLayerManger});
        }
        return lightOffLayerManger.c;
    }

    public static /* synthetic */ View d(LightOffLayerManger lightOffLayerManger, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("be22185d", new Object[]{lightOffLayerManger, view});
        }
        lightOffLayerManger.c = view;
        return view;
    }

    public static /* synthetic */ nb4 e(LightOffLayerManger lightOffLayerManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb4) ipChange.ipc$dispatch("d94a9cb4", new Object[]{lightOffLayerManger});
        }
        return lightOffLayerManger.d;
    }

    public static /* synthetic */ int f(LightOffLayerManger lightOffLayerManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d8eb30a", new Object[]{lightOffLayerManger})).intValue();
        }
        return lightOffLayerManger.e;
    }

    public static /* synthetic */ int g(LightOffLayerManger lightOffLayerManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd967e9", new Object[]{lightOffLayerManger})).intValue();
        }
        return lightOffLayerManger.f;
    }

    public static /* synthetic */ ze7 h(LightOffLayerManger lightOffLayerManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("aea7d9c5", new Object[]{lightOffLayerManger});
        }
        return lightOffLayerManger.f6861a;
    }

    public static boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e15c1739", new Object[]{str, str2})).booleanValue();
        }
        if (str2 == null) {
            return TextUtils.isEmpty(str);
        }
        if (TextUtils.equals(str2, str)) {
            return true;
        }
        return false;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        this.b.setVisibility(4);
        if (this.c instanceof DXRootView) {
            this.f6861a.g().z((DXRootView) this.c);
        }
    }

    public final void l(int i) {
        final JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f018a025", new Object[]{this, new Integer(i)});
            return;
        }
        nb4 nb4Var = this.d;
        if (nb4Var != null && (f = nb4Var.f()) != null && !f.isEmpty()) {
            final int statusBarHeight = SystemBarDecorator.SystemBarConfig.getStatusBarHeight(mr7.d());
            this.f = View.MeasureSpec.makeMeasureSpec((i - statusBarHeight) - hl6.d(this.b), 1073741824);
            final eo7 g = this.f6861a.g();
            hl6.e(g, f, new eo7.s() { // from class: com.taobao.android.detail.ttdetail.lightoff.LightOffLayerManger.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.eo7.s
                public void a(l38 l38Var) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8845bc8b", new Object[]{this, l38Var});
                        return;
                    }
                    tgh.b("LightOffLayerManger", "loadTemplates onSuccess:" + l38Var.a());
                    View c = LightOffLayerManger.c(LightOffLayerManger.this);
                    JSONObject d = LightOffLayerManger.e(LightOffLayerManger.this).d();
                    JSONObject jSONObject = new JSONObject(d.size());
                    jSONObject.putAll(d);
                    jSONObject.put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.lightoff.LightOffLayerManger.2.1
                        {
                            putAll(f);
                            put("_enableChain", "true");
                        }
                    });
                    LightOffLayerManger lightOffLayerManger = LightOffLayerManger.this;
                    LightOffLayerManger.d(lightOffLayerManger, hl6.j(g, jSONObject, l38Var, LightOffLayerManger.f(lightOffLayerManger), LightOffLayerManger.g(LightOffLayerManger.this), new RuntimeParam("_client_ut_args_", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.lightoff.LightOffLayerManger.2.2
                        {
                            put("sceneType", "galleryLightOffLayer");
                        }
                    })));
                    if (LightOffLayerManger.c(LightOffLayerManger.this) instanceof DXRootView) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.topMargin = statusBarHeight;
                        if (vbl.R()) {
                            LightOffLayerManger.b(LightOffLayerManger.this).removeAllViews();
                        }
                        LightOffLayerManger.b(LightOffLayerManger.this).addView(LightOffLayerManger.c(LightOffLayerManger.this), layoutParams);
                        g.y((DXRootView) LightOffLayerManger.c(LightOffLayerManger.this));
                    }
                    if ((c instanceof DXRootView) && c != LightOffLayerManger.c(LightOffLayerManger.this)) {
                        LightOffLayerManger.h(LightOffLayerManger.this).g().z((DXRootView) c);
                    }
                }

                @Override // tb.eo7.s
                public void b(l38 l38Var, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c26b7f5c", new Object[]{this, l38Var, str});
                        return;
                    }
                    tgh.b("LightOffLayerManger", "loadTemplates onFailure:" + str + " info:" + l38Var.a());
                }
            });
        }
    }

    public void m(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3acbcf", new Object[]{this, nb4Var});
        } else {
            this.d = nb4Var;
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.b.setVisibility(0);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df871f62", new Object[]{this});
            return;
        }
        i();
        this.b.setOnSizeChangeListener(new a());
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a030b", new Object[]{this});
            return;
        }
        nb4 nb4Var = this.d;
        if (nb4Var != null && nb4Var.d() != null && this.c != null) {
            eo7 g = this.f6861a.g();
            JSONObject d = nb4Var.d();
            JSONObject jSONObject = new JSONObject(d.size());
            jSONObject.putAll(d);
            jSONObject.put("fields", (Object) new JSONObject(d.getJSONObject("fields")) { // from class: com.taobao.android.detail.ttdetail.lightoff.LightOffLayerManger.3
                public final /* synthetic */ JSONObject val$fields;

                {
                    this.val$fields = r2;
                    if (r2 != null) {
                        putAll(r2);
                    }
                    put("_enableChain", "true");
                }
            });
            hl6.l(g, (DXRootView) this.c, jSONObject, this.e, this.f, new RuntimeParam("_client_ut_args_", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.lightoff.LightOffLayerManger.4
                {
                    put("sceneType", "galleryLightOffLayer");
                }
            }));
        }
    }

    public void q(cy9 cy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ed79c6", new Object[]{this, cy9Var});
            return;
        }
        r(yc4.l(cy9Var));
        p();
    }

    public final void i() {
        JSONObject f;
        JSONObject jSONObject;
        DetailAdjustModel detailAdjustModel;
        JSONArray adjustModel;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26994992", new Object[]{this});
            return;
        }
        nb4 nb4Var = this.d;
        if (!(nb4Var == null || (f = nb4Var.f()) == null || f.isEmpty() || (jSONObject = f.getJSONObject("bottomBar")) == null)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(KEY_PRICE_SECTION);
            if (!((jSONObject3 != null && !jSONObject3.isEmpty()) || (detailAdjustModel = (DetailAdjustModel) this.f6861a.e().f(DetailAdjustModel.class)) == null || (adjustModel = detailAdjustModel.getAdjustModel()) == null)) {
                int size = adjustModel.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject4 = adjustModel.getJSONObject(i);
                    if (jSONObject4 != null && !jSONObject4.isEmpty() && (jSONObject2 = jSONObject4.getJSONObject(KEY_PRICE_SECTION)) != null && !jSONObject2.isEmpty()) {
                        String string = jSONObject4.getString("propPath");
                        if (TextUtils.isEmpty(jSONObject4.getString(q2q.KEY_SKU_ID)) && TextUtils.isEmpty(string)) {
                            jSONObject.put(KEY_PRICE_SECTION, (Object) jSONObject2);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final int r(String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5758ad24", new Object[]{this, str})).intValue();
        }
        nb4 nb4Var = this.d;
        if (nb4Var == null || nb4Var.d() == null || nb4Var.f() == null || (jSONObject = nb4Var.f().getJSONObject("skuBar")) == null || jSONObject.isEmpty() || (jSONArray = jSONObject.getJSONArray("skuContents")) == null || jSONArray.isEmpty()) {
            return -1;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.size(); i3++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            if (jSONObject2 != null) {
                if (i2 == -1 && Boolean.parseBoolean(jSONObject2.getString("isSelected"))) {
                    i2 = i3;
                }
                if (j(jSONObject2.getString("propPath"), str)) {
                    jSONObject2.put("isSelected", (Object) Boolean.TRUE.toString());
                    i = i3;
                } else {
                    jSONObject2.put("isSelected", (Object) Boolean.FALSE.toString());
                }
            }
        }
        jSONObject.put(mop.KEY_SELECTED_INDEX, (Object) String.valueOf(Math.max(i, 0)));
        JSONObject jSONObject3 = jSONObject.getJSONObject("mainPic");
        if (jSONObject3 != null) {
            if (i != -1) {
                bool = Boolean.FALSE;
            } else {
                bool = Boolean.TRUE;
            }
            jSONObject3.put("isSelected", (Object) bool.toString());
        }
        return i;
    }
}
