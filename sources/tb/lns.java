package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.data.meta.DetailClientData;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.taobao.R;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lns extends hrj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ozc c;
    public final Context d;
    public final FrameLayout e;
    public final FrameLayout f;
    public LinearLayout g;
    public LinearLayout h;
    public ff7 i;
    public boolean j;
    public lcd l;
    public TTDetailScrollerLayout.LayoutParams n;
    public int o;
    public boolean k = false;
    public boolean m = false;
    public final Runnable p = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!tq4.e(lns.y(lns.this))) {
                q84.f(lns.y(lns.this), new DescNativeController.c("adjust"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        public static final int DEFAULT = -1;
        public static final int LOADFAILED = 0;
        public static final int RENDERFAILED = 1;

        boolean a(int i);
    }

    static {
        t2o.a(912262250);
    }

    public lns(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        this.d = context;
        oa4 oa4Var = null;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_component_container, (ViewGroup) null);
        this.e = frameLayout;
        this.f = (FrameLayout) frameLayout.findViewById(R.id.desc_frame);
        R(nb4Var);
        z4k r = ((jns) this.mDetailContext.e().e(kns.PARSER_ID)).s().r();
        jos josVar = (jos) (r != null ? r.f(this.mDetailContext.d()) : oa4Var);
    }

    public static /* synthetic */ TTDetailScrollerLayout.LayoutParams A(lns lnsVar, ff7 ff7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("8b2024d9", new Object[]{lnsVar, ff7Var});
        }
        return lnsVar.Q(ff7Var);
    }

    public static /* synthetic */ ozc B(lns lnsVar, ozc ozcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozc) ipChange.ipc$dispatch("71be0dd9", new Object[]{lnsVar, ozcVar});
        }
        lnsVar.c = ozcVar;
        return ozcVar;
    }

    public static /* synthetic */ boolean C(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79b65a0e", new Object[]{lnsVar})).booleanValue();
        }
        return lnsVar.S();
    }

    public static /* synthetic */ FrameLayout D(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c23075ae", new Object[]{lnsVar});
        }
        return lnsVar.f;
    }

    public static /* synthetic */ FrameLayout E(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b3d5313d", new Object[]{lnsVar});
        }
        return lnsVar.e;
    }

    public static /* synthetic */ LinearLayout F(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("e12ebc34", new Object[]{lnsVar});
        }
        return lnsVar.g;
    }

    public static /* synthetic */ LinearLayout G(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("2159a2f5", new Object[]{lnsVar});
        }
        return lnsVar.h;
    }

    public static /* synthetic */ boolean H(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("713a8ce3", new Object[]{lnsVar})).booleanValue();
        }
        return lnsVar.j;
    }

    public static /* synthetic */ boolean I(lns lnsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e81a6517", new Object[]{lnsVar, new Boolean(z)})).booleanValue();
        }
        lnsVar.j = z;
        return z;
    }

    public static /* synthetic */ int J(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78636f13", new Object[]{lnsVar})).intValue();
        }
        return lnsVar.o;
    }

    public static /* synthetic */ int K(lns lnsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c60d8b14", new Object[]{lnsVar, new Integer(i)})).intValue();
        }
        lnsVar.o = i;
        return i;
    }

    public static /* synthetic */ int L(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f8c5154", new Object[]{lnsVar})).intValue();
        }
        return lnsVar.P();
    }

    public static /* synthetic */ boolean M(lns lnsVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ff1b3a5", new Object[]{lnsVar, new Integer(i)})).booleanValue();
        }
        return lnsVar.O(i);
    }

    public static /* synthetic */ lcd N(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcd) ipChange.ipc$dispatch("ff741a3f", new Object[]{lnsVar});
        }
        return lnsVar.l;
    }

    public static /* synthetic */ Object ipc$super(lns lnsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/TTDetailDescComponent");
    }

    public static /* synthetic */ Context y(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("275d292", new Object[]{lnsVar});
        }
        return lnsVar.d;
    }

    public static /* synthetic */ ozc z(lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozc) ipChange.ipc$dispatch("f6e298ab", new Object[]{lnsVar});
        }
        return lnsVar.c;
    }

    public final boolean O(int i) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9535cd87", new Object[]{this, new Integer(i)})).booleanValue();
        }
        TTDetailScrollerLayout.LayoutParams Q = Q(this.i);
        ff7 ff7Var = this.i;
        if (ff7Var == null) {
            f = 0.0f;
        } else {
            f = ff7Var.h;
        }
        if ((((ViewGroup.MarginLayoutParams) Q).height != -1 || i > P()) && i > ((ViewGroup.MarginLayoutParams) Q).height && (Float.compare(f, 1.0f) > 0 || i <= ((ViewGroup.MarginLayoutParams) Q).height || i > P())) {
            return false;
        }
        ((ViewGroup.MarginLayoutParams) Q).height = i;
        this.n = Q;
        this.b = false;
        this.m = true;
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        return true;
    }

    public final int P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfff1dc2", new Object[]{this})).intValue();
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout == null || frameLayout.getParent() == null) {
            return 0;
        }
        return ((View) this.e.getParent()).getMeasuredHeight();
    }

    public final TTDetailScrollerLayout.LayoutParams Q(ff7 ff7Var) {
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("ad51c795", new Object[]{this, ff7Var});
        }
        if (ff7Var == null || !this.j) {
            TTDetailScrollerLayout.LayoutParams layoutParams = new TTDetailScrollerLayout.LayoutParams(-1, -1);
            layoutParams.f7033a = this;
            this.b = false;
            return layoutParams;
        }
        float f = ff7Var.h;
        if (Float.compare(f, 0.0f) <= 0 || Float.compare(f, 1.0f) > 0) {
            z = false;
        }
        if (z) {
            i = jf7.INSTANCE.a(this.d, ff7Var);
        } else {
            i = -1;
        }
        TTDetailScrollerLayout.LayoutParams layoutParams2 = new TTDetailScrollerLayout.LayoutParams(-1, i);
        layoutParams2.f7033a = this;
        if (z) {
            this.b = ff7Var.f;
        } else {
            this.b = false;
        }
        return layoutParams2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [tb.ed7] */
    public final void R(nb4 nb4Var) {
        String str;
        od7 od7Var;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63be2b8b", new Object[]{this, nb4Var});
        } else if (nb4Var == null) {
            tgh.b("TTDetailDescComponent", "componentData is null");
        } else {
            ff7 a2 = ff7.a(nb4Var);
            if (a2 == null) {
                tgh.b("TTDetailDescComponent", "detailDescModel is null");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean T = T(a2);
            this.i = a2;
            this.h = (LinearLayout) this.e.findViewById(R.id.desc_container_linear);
            LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.desc_container_expand);
            this.g = linearLayout;
            linearLayout.setOnClickListener(new mns(this));
            boolean z = a2.f;
            this.j = z;
            if (T) {
                this.g.setVisibility(8);
                this.h.setVisibility(8);
            } else {
                LinearLayout linearLayout2 = this.g;
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                linearLayout2.setVisibility(i);
                LinearLayout linearLayout3 = this.h;
                if (this.j) {
                    i2 = 8;
                }
                linearLayout3.setVisibility(i2);
            }
            nns nnsVar = new nns(this, a2);
            if (T) {
                DescNativeController descNativeController = new DescNativeController(this.d, a2);
                descNativeController.e0(this.e);
                descNativeController.h0(nnsVar);
                descNativeController.g0(this.mDetailContext);
                descNativeController.i0(new ons(this));
                this.c = descNativeController;
                descNativeController.f0(new pns(this, a2, nnsVar));
            } else {
                if (S()) {
                    od7Var = new ed7(this.d, a2);
                } else {
                    od7Var = new od7(this.d, a2);
                }
                this.c = od7Var;
                od7Var.e(nnsVar);
                od7Var.c(this.mDetailContext);
                od7Var.b(new qns(this));
            }
            this.f.removeAllViews();
            this.f.addView(this.c.getComponentView(null));
            Context context = this.d;
            if (T) {
                str = "native";
            } else {
                str = "h5";
            }
            UserBehaviorTracker.m(context, "detail_desc_component_type", str);
            long currentTimeMillis2 = System.currentTimeMillis();
            tgh.b("TTDetailPerTag", "TTDetailDescComponent.initData( web: " + (true ^ T) + "): " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    public final boolean S() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7ce1502", new Object[]{this})).booleanValue();
        }
        DetailClientData detailClientData = (DetailClientData) this.mDetailContext.e().f(DetailClientData.class);
        if (detailClientData == null || (jSONObject = detailClientData.detailClientOpt) == null) {
            return false;
        }
        return jSONObject.getBooleanValue("descH5Themis");
    }

    public final boolean T(ff7 ff7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3722bfd4", new Object[]{this, ff7Var})).booleanValue();
        }
        Map<String, String> map = ff7Var.d;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return true;
    }

    public void U(int i) {
        TTDetailScrollerLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
            return;
        }
        ozc ozcVar = this.c;
        if (ozcVar instanceof DescNativeController) {
            ((DescNativeController) ozcVar).Y(i);
            if (vbl.d() && this.m && (layoutParams = this.n) != null) {
                this.m = false;
                this.e.setLayoutParams(layoutParams);
                this.e.post(this.p);
            }
            W();
        } else if (ozcVar instanceof od7) {
            ((od7) ozcVar).w(i);
        } else if (ozcVar instanceof ed7) {
            ((ed7) ozcVar).x(i);
        }
    }

    public void V(lcd lcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a37f6", new Object[]{this, lcdVar});
        } else {
            this.l = lcdVar;
        }
    }

    @Override // tb.hrj, tb.ozc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
            return;
        }
        ozc ozcVar = this.c;
        if (ozcVar != null) {
            ozcVar.a();
        }
    }

    @Override // tb.hrj, tb.ozc
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
            return;
        }
        ozc ozcVar = this.c;
        if (ozcVar != null) {
            ozcVar.k(i);
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ozc ozcVar = this.c;
        if (ozcVar != null) {
            ozcVar.destroy();
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            frameLayout.removeCallbacks(this.p);
        }
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        ozc ozcVar = this.c;
        if (ozcVar != null) {
            ozcVar.didAppear();
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return this.e;
    }

    @Override // tb.hrj, tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        ozc ozcVar = this.c;
        if (ozcVar == null) {
            return null;
        }
        return ozcVar.r();
    }

    @Override // tb.hrj, tb.ozc
    public void t(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9588d6ca", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        ozc ozcVar = this.c;
        if (ozcVar != null) {
            ozcVar.t(z, z2);
        }
    }

    @Override // tb.hrj
    public TTDetailScrollerLayout.LayoutParams u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("99746aed", new Object[]{this});
        }
        return Q(this.i);
    }

    @Override // tb.hrj
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72940b2", new Object[]{this});
        } else {
            a();
        }
    }

    public final void W() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e801c4c1", new Object[]{this});
        } else if (!this.k && this.j && (linearLayout = this.g) != null && linearLayout.getVisibility() == 0 && this.g.getGlobalVisibleRect(new Rect())) {
            this.k = true;
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("page", (Object) "Page_Detail");
                jSONObject2.put("eventId", (Object) 2201);
                jSONObject2.put("arg1", (Object) "Page_Detail_Show_DESC_Fold");
                jSONObject2.put("args", (Object) jSONObject);
                q84.f(this.d, new rc7("userTrack", jSONObject2, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                tgh.c("TTDetailDescComponent", "Page_Detail_Show_DESC_Fold error", e);
            }
        }
    }
}
