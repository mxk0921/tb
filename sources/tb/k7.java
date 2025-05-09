package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.struct.ViewWidget;
import com.ut.mini.UTAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class k7 extends ViewWidget<View, IrpDatasource, k7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final g1a<Boolean, xhv> l;
    public final String m = "plt_ai_manual_close";
    public volatile JSONObject n = new JSONObject();
    public volatile int o = 2;
    public final String p = "试试追加搜索或提问";
    public Map<String, String> q;
    public volatile JSONObject r;
    public int s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements bab {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f22441a;
        public final /* synthetic */ k7 b;
        public final /* synthetic */ IrpDatasource c;

        public a(Activity activity, k7 k7Var, IrpDatasource irpDatasource) {
            this.f22441a = activity;
            this.b = k7Var;
            this.c = irpDatasource;
        }

        @Override // tb.bab
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bed52ff", new Object[]{this});
            }
        }

        @Override // tb.bab
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40c03b92", new Object[]{this, str});
            } else if (str != null && str.length() != 0) {
                k7 k7Var = this.b;
                k7.m0(k7Var, k7.h0(k7Var));
            }
        }

        @Override // tb.bab
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44828456", new Object[]{this});
                return;
            }
            k7.n0(this.b, UTAnalytics.getInstance().getDefaultTracker().getPageProperties(this));
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f22441a);
        }

        @Override // tb.bab
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c06fdf14", new Object[]{this});
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f22441a);
            jzu.r(this.f22441a, "Page_PhotoSearchResult");
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f22441a, k7.i0(this.b));
        }

        @Override // tb.bab
        public void e() {
            String w;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4d00cff", new Object[]{this});
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IrpDatasource irpDatasource = this.c;
            String y = irpDatasource.y();
            String str = "";
            if (y == null) {
                y = str;
            }
            linkedHashMap.put("pssource", y);
            String value = irpDatasource.B().getValue();
            ckf.f(value, "model.photoFrom.value");
            linkedHashMap.put(wxi.KEY_PHOTO_FROM, value);
            nmf o = irpDatasource.o();
            if (!(o == null || (w = o.w()) == null)) {
                str = w;
            }
            linkedHashMap.put("tfskey", str);
            xhv xhvVar = xhv.INSTANCE;
            mzu.h("Page_PhotoSearchResult", "close_Clk", linkedHashMap);
            k7 k7Var = this.b;
            k7.o0(k7Var, k7.k0(k7Var) + 1);
            Activity activity = this.f22441a;
            String j0 = k7.j0(this.b);
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append('_');
            sb.append(k7.k0(this.b));
            mno.h(activity, j0, sb.toString());
            this.b.e(true);
        }

        @Override // tb.bab
        public void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d532fe98", new Object[]{this, new Integer(i)});
                return;
            }
            TextView l0 = k7.l0(this.b);
            if (l0 != null) {
                ViewGroup.LayoutParams layoutParams = l0.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.setMargins(0, 0, 0, i + p1p.a(140.0f));
                    l0.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    static {
        t2o.a(481297189);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k7(Activity activity, Object obj, IrpDatasource irpDatasource, ViewGroup viewGroup, g1a<? super Boolean, xhv> g1aVar) {
        super(activity, obj, irpDatasource, null, false, false, 32, null);
        ckf.g(activity, "activity");
        ckf.g(irpDatasource, "model");
        ckf.g(viewGroup, "parentView");
        ckf.g(g1aVar, "onWidgetStateChange");
        this.l = g1aVar;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("promptText", (Object) "看看大家怎么说");
        jSONArray.add(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("promptText", (Object) "该如何选择");
        jSONArray.add(jSONObject3);
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put("promptList", (Object) jSONArray);
        this.r = jSONObject;
        l7 l7Var = new l7();
        l7Var.g(p0());
        l7Var.f(new a(activity, this, irpDatasource));
    }

    public static final /* synthetic */ int h0(k7 k7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d74941", new Object[]{k7Var})).intValue();
        }
        return k7Var.o;
    }

    public static final /* synthetic */ Map i0(k7 k7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3044bc17", new Object[]{k7Var});
        }
        return k7Var.q;
    }

    public static /* synthetic */ Object ipc$super(k7 k7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1794064906) {
            super.M();
            return null;
        } else if (hashCode == 731174045) {
            super.L();
            return null;
        } else if (hashCode == 1083424568) {
            super.K();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/newresult/widget/AIWidget");
        }
    }

    public static final /* synthetic */ String j0(k7 k7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("476c5bbb", new Object[]{k7Var});
        }
        return k7Var.m;
    }

    public static final /* synthetic */ int k0(k7 k7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18932072", new Object[]{k7Var})).intValue();
        }
        return k7Var.s;
    }

    public static final /* synthetic */ TextView l0(k7 k7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("82b37b3b", new Object[]{k7Var});
        }
        k7Var.getClass();
        return null;
    }

    public static final /* synthetic */ boolean m0(k7 k7Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6311ad6a", new Object[]{k7Var, new Integer(i)})).booleanValue();
        }
        return k7Var.g(i);
    }

    public static final /* synthetic */ void n0(k7 k7Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f298fef", new Object[]{k7Var, map});
        } else {
            k7Var.q = map;
        }
    }

    public static final /* synthetic */ void o0(k7 k7Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e782d8", new Object[]{k7Var, new Integer(i)});
        } else {
            k7Var.s = i;
        }
    }

    @Override // tb.vz
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
        } else {
            super.K();
        }
    }

    @Override // tb.vz
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
        } else {
            super.L();
        }
    }

    @Override // tb.vz
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
        } else {
            super.M();
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget
    public View b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        return null;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61877f1", new Object[]{this});
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a88e41f", new Object[]{this, new Boolean(z)});
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2bf91e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final boolean g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1673cc63", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void h(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae12d10", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public final void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5897af7a", new Object[]{this, jSONObject});
        }
    }

    public final void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7265d8a1", new Object[]{this, jSONObject});
        }
    }

    public final JSONObject p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3317983", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "universalParams", (String) this.n);
        jSONObject.put((JSONObject) "prompt", (String) this.r);
        jSONObject.put((JSONObject) "placeholder", this.p);
        return jSONObject;
    }
}
