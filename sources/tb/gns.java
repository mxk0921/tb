package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.DinamicXComponent;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.taobao.R;
import java.util.Arrays;
import kotlin.TypeCastException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class gns extends hrj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String EVENT_TYPE = "asyncComponentRetry";
    public final LinearLayout c;
    public boolean d;
    public int e;
    public int f;
    public DinamicXComponent g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        static {
            t2o.a(912262571);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912262569);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gns(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, (DataEntry[]) Arrays.copyOf(dataEntryArr, dataEntryArr.length));
        LinearLayout linearLayout;
        ckf.h(context, "context");
        ckf.h(dataEntryArr, "initComponentData");
        this.mContext = context;
        PreRenderManager g = PreRenderManager.g(context);
        if (g != null) {
            View j = g.j(this.mContext, R.layout.tt_detail_match_container, null, true);
            if (j != null) {
                linearLayout = (LinearLayout) j;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
        } else {
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_match_container, (ViewGroup) null);
            if (inflate != null) {
                linearLayout = (LinearLayout) inflate;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
        }
        this.c = linearLayout;
        A(nb4Var);
    }

    public static /* synthetic */ Object ipc$super(gns gnsVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/match/TTDetailAiMatchComponent");
    }

    public static final /* synthetic */ DinamicXComponent y(gns gnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXComponent) ipChange.ipc$dispatch("7914719", new Object[]{gnsVar});
        }
        return gnsVar.g;
    }

    @Override // tb.hrj, tb.ozc
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.d = false;
        DinamicXComponent dinamicXComponent = this.g;
        if (dinamicXComponent != null) {
            dinamicXComponent.destroy();
        }
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        if (!this.d) {
            a();
        }
        DinamicXComponent dinamicXComponent = this.g;
        if (dinamicXComponent != null) {
            dinamicXComponent.willAppear();
            dinamicXComponent.didAppear();
        }
    }

    @Override // tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        DinamicXComponent dinamicXComponent = this.g;
        if (dinamicXComponent != null) {
            dinamicXComponent.willDisAppear();
            dinamicXComponent.disAppear();
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return this.c;
    }

    @Override // tb.hrj, tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.hrj
    public TTDetailScrollerLayout.LayoutParams u() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("99746aed", new Object[]{this});
        }
        if (this.e == 0 && this.f == 0) {
            i = -2;
        } else {
            i = z();
        }
        return new TTDetailScrollerLayout.LayoutParams(-1, i);
    }

    @Override // tb.hrj
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("978e443e", new Object[]{this});
        }
        return "";
    }

    public final int z() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca281852", new Object[]{this})).intValue();
        }
        if (this.e != 0) {
            int s = pb6.s(this.mContext);
            float f = 375.0f / this.e;
            if (nj7.i(this.mContext)) {
                s = (s / 2) - pb6.f(this.mContext, 16.0f);
            }
            i = (int) (s / f);
        } else {
            i = 0;
        }
        if (this.f != 0) {
            ze7 ze7Var = this.mDetailContext;
            ckf.c(ze7Var, "mDetailContext");
            eo7 g = ze7Var.g();
            ckf.c(g, "mDetailContext.dinamicXEngine");
            i2 = pb6.d(g.o(), this.mContext, this.f);
        }
        return i + i2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class a implements zre {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262570);
            t2o.a(912261826);
        }

        public a() {
        }

        @Override // tb.zre
        public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
            }
            ckf.h(irVar, "event");
            ckf.h(runtimeAbilityParamArr, "runtimeParams");
            JSONObject a2 = irVar.a();
            if (a2 == null || TextUtils.isEmpty(a2.getString("componentKey"))) {
                return false;
            }
            DinamicXComponent y = gns.y(gns.this);
            if (y != null) {
                y.updateComponent();
            }
            return true;
        }
    }

    public final void A(nb4 nb4Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63be2b8b", new Object[]{this, nb4Var});
        } else if (nb4Var != null && nb4Var.f() != null && (jSONObject = nb4Var.f().getJSONObject("template")) != null) {
            this.e = nb4Var.f().getIntValue("placeholderScaleHeight");
            this.f = nb4Var.f().getIntValue("placeholderFixedHeight");
            String str = "dinamicx$" + jSONObject.getString("name") + "$" + jSONObject.getString("version");
            jSONObject.put("type", "dinamicx");
            ComponentViewMeta componentViewMeta = new ComponentViewMeta(jSONObject);
            ze7 ze7Var = this.mDetailContext;
            ckf.c(ze7Var, "mDetailContext");
            ze7Var.d().h(str, componentViewMeta);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object) str);
            jSONObject2.put("fields", (Object) nb4Var.f());
            jSONObject2.put("events", (Object) nb4Var.d().getJSONObject("events"));
            ze7 ze7Var2 = this.mDetailContext;
            ckf.c(ze7Var2, "mDetailContext");
            oc4 d = ze7Var2.d();
            ze7 ze7Var3 = this.mDetailContext;
            ckf.c(ze7Var3, "mDetailContext");
            this.g = (DinamicXComponent) d.b(new nb4(jSONObject2, ze7Var3.b().d()), new DataEntry[0]);
            ze7 ze7Var4 = this.mDetailContext;
            ckf.c(ze7Var4, "mDetailContext");
            ze7Var4.b().i(EVENT_TYPE, new a());
        }
    }

    @Override // tb.hrj, tb.ozc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
            return;
        }
        if (!this.d) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page", (Object) "Page_Detail");
                jSONObject.put("eventId", (Object) 2201);
                jSONObject.put("arg1", (Object) "Page_Detail_Show_DESC_Price");
                jSONObject.put("args", (Object) new JSONObject());
                q84.f(this.mContext, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                tgh.c("TTDetailAiMatchComponent", "Page_Detail_Show_Navigation error", e);
            }
            DinamicXComponent dinamicXComponent = this.g;
            if (dinamicXComponent != null) {
                dinamicXComponent.create();
                View componentView = dinamicXComponent.getComponentView(this.c);
                LinearLayout linearLayout = this.c;
                if (linearLayout != componentView) {
                    linearLayout.removeAllViews();
                    this.c.addView(componentView, new FrameLayout.LayoutParams(-1, -2));
                }
            }
        }
        this.d = true;
    }
}
