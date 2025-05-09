package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.RippleLayout;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gh1 extends zr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View l;
    public View m;
    public TextView n;
    public TextView o;
    public TextView p;
    public FrameLayout q;
    public Context r;
    public boolean s;
    public int[] u;
    public RippleLayout v;
    public final Typeface y;
    public boolean z;
    public final int k = p1p.a(32.0f);
    public String t = "";
    public String w = "";
    public String x = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            hvn hvnVar = hvn.INSTANCE;
            Context B = gh1.B(gh1.this);
            if (B != null) {
                ptk a2 = hvnVar.a(B);
                if (a2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    gh1 gh1Var = gh1.this;
                    jSONObject.put((JSONObject) "isRegionChange", (String) Boolean.valueOf(true ^ gh1.G(gh1Var)));
                    jSONObject.put((JSONObject) "region", gh1.D(gh1Var));
                    a2.r(jSONObject);
                }
                if (gh1.G(gh1.this)) {
                    str = "abbreviationCardClick";
                } else {
                    str = "previewCardClick";
                }
                String F = gh1.F(gh1.this);
                String C = gh1.C(gh1.this);
                if (gh1.this.c() == null) {
                    str2 = "point";
                } else {
                    str2 = "preview";
                }
                jzu.g("Page_PhotoSearchResult", str, "title", F, "price", C, "boxType", str2);
                return;
            }
            ckf.y("context");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                gh1.A(gh1.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RippleLayout E = gh1.E(gh1.this);
            if (E != null) {
                E.startRippleAnim();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RippleLayout E = gh1.E(gh1.this);
            if (E != null) {
                E.startRippleAnim();
            }
        }
    }

    static {
        t2o.a(481297566);
    }

    public gh1() {
        super("nt_region_digest");
        Typeface typeface;
        try {
            typeface = Typeface.createFromAsset(caa.c().getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
            ckf.f(typeface, "{\n    Typeface.createFro…_TaoBao-Bd.ttf\"\n    )\n  }");
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
            ckf.f(typeface, "{\n    Typeface.DEFAULT\n  }");
        }
        this.y = typeface;
    }

    public static final /* synthetic */ void A(gh1 gh1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73abbd05", new Object[]{gh1Var});
        } else {
            gh1Var.H();
        }
    }

    public static final /* synthetic */ Context B(gh1 gh1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1ad3c7fb", new Object[]{gh1Var});
        }
        return gh1Var.r;
    }

    public static final /* synthetic */ String C(gh1 gh1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("560e6599", new Object[]{gh1Var});
        }
        return gh1Var.x;
    }

    public static final /* synthetic */ String D(gh1 gh1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f4470ac", new Object[]{gh1Var});
        }
        return gh1Var.t;
    }

    public static final /* synthetic */ RippleLayout E(gh1 gh1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RippleLayout) ipChange.ipc$dispatch("92be092b", new Object[]{gh1Var});
        }
        return gh1Var.v;
    }

    public static final /* synthetic */ String F(gh1 gh1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ff2e2a8", new Object[]{gh1Var});
        }
        return gh1Var.w;
    }

    public static final /* synthetic */ boolean G(gh1 gh1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bfc9f67", new Object[]{gh1Var})).booleanValue();
        }
        return gh1Var.s;
    }

    public static /* synthetic */ Object ipc$super(gh1 gh1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/coordinatorcard/instance/AuctionDigestCard");
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54838a8e", new Object[]{this});
        } else if (c() == null) {
            S();
        } else if (this.s) {
            T();
        } else {
            U();
        }
    }

    public final boolean I(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4cb1c3f", new Object[]{this, jSONObject, jSONObject2, str})).booleanValue();
        }
        boolean e = h19.e(jSONObject, str, false);
        boolean e2 = h19.e(jSONObject2, str, false);
        if (e == e2) {
            return false;
        }
        jSONObject.put((JSONObject) str, (String) Boolean.valueOf(e2));
        return true;
    }

    public final RippleLayout J(boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RippleLayout) ipChange.ipc$dispatch("d0315db3", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            f = 16.0f;
        } else {
            f = 12.0f;
        }
        int a2 = p1p.a(f);
        Context context = this.r;
        if (context != null) {
            RippleLayout rippleLayout = new RippleLayout(context, a2, 0, null, 12, null);
            Context context2 = this.r;
            if (context2 != null) {
                View view = new View(context2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
                view.setBackground(gradientDrawable);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
                layoutParams.gravity = 17;
                rippleLayout.addView(view, layoutParams);
                return rippleLayout;
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be2ab04", new Object[]{this});
            return;
        }
        String str = "";
        String i = h19.i(c(), "title", str);
        ckf.f(i, "parseString(data, \"title\", \"\")");
        this.w = i;
        JSONObject d2 = h19.d(c(), mh1.PRICE_BLOCK);
        if (d2 != null) {
            str = ckf.p(h19.i(d2, mh1.PRICE_UNIT, "￥"), h19.i(d2, "price", str));
        }
        this.x = str;
    }

    public final void N(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05fbcbc", new Object[]{this, jSONObject});
            return;
        }
        JSONObject i = i();
        if (i == null) {
            i = new JSONObject();
        }
        I(i, jSONObject, "isPriceFirst");
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979ad0a7", new Object[]{this});
            return;
        }
        P();
        H();
    }

    public void Q(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2acea8b", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        ckf.g(context, "context");
        this.r = context;
        K();
        x(jSONObject);
        s(jSONObject2);
        M();
        L();
        O();
        if (this.s) {
            str = "abbreviationCardExpose";
        } else {
            str = "previewCardExpose";
        }
        String str3 = this.w;
        String str4 = this.x;
        if (jSONObject2 == null) {
            str2 = "point";
        } else {
            str2 = "preview";
        }
        jzu.q("Page_PhotoSearchResult", str, "title", str3, "price", str4, "boxType", str2);
    }

    @Override // tb.zr1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        RippleLayout rippleLayout = this.v;
        if (rippleLayout != null) {
            rippleLayout.stopRippleAnim();
        }
        n();
    }

    @Override // tb.zr1
    public int[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e1252345", new Object[]{this});
        }
        int[] iArr = this.u;
        if (iArr != null) {
            return iArr;
        }
        ckf.y("measureMetrics");
        throw null;
    }

    @Override // tb.zr1
    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        View view = this.l;
        if (view != null) {
            return view;
        }
        ckf.y("rootView");
        throw null;
    }

    @Override // tb.zr1
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff933d6b", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    @Override // tb.zr1
    public void o(JSONObject jSONObject) {
        JSONObject d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d8d410", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (d2 = h19.d(jSONObject, "status")) != null) {
            N(d2);
            O();
        }
    }

    @Override // tb.zr1
    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b01985", new Object[]{this, new Boolean(z)});
            return;
        }
        this.z = z;
        g().post(new b());
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        Context context = this.r;
        if (context != null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.feis_auction_digest_card, (ViewGroup) null, false);
            ckf.f(inflate, "from(context)\n      .inf…digest_card, null, false)");
            this.l = inflate;
            View findViewById = inflate.findViewById(R.id.rl_full_digest);
            ckf.f(findViewById, "rootView.findViewById(R.id.rl_full_digest)");
            this.m = findViewById;
            View view = this.l;
            if (view != null) {
                View findViewById2 = view.findViewById(R.id.tv_full_title);
                ckf.f(findViewById2, "rootView.findViewById(R.id.tv_full_title)");
                this.n = (TextView) findViewById2;
                View view2 = this.l;
                if (view2 != null) {
                    View findViewById3 = view2.findViewById(R.id.tv_price_hint);
                    ckf.f(findViewById3, "rootView.findViewById(R.id.tv_price_hint)");
                    this.o = (TextView) findViewById3;
                    View view3 = this.l;
                    if (view3 != null) {
                        View findViewById4 = view3.findViewById(R.id.tv_price);
                        ckf.f(findViewById4, "rootView.findViewById(R.id.tv_price)");
                        TextView textView = (TextView) findViewById4;
                        this.p = textView;
                        textView.setTypeface(this.y);
                        View view4 = this.l;
                        if (view4 != null) {
                            View findViewById5 = view4.findViewById(R.id.fl_simple_digest);
                            ckf.f(findViewById5, "rootView.findViewById(R.id.fl_simple_digest)");
                            this.q = (FrameLayout) findViewById5;
                            View view5 = this.l;
                            if (view5 != null) {
                                ViewProxy.setOnClickListener(view5, new a());
                            } else {
                                ckf.y("rootView");
                                throw null;
                            }
                        } else {
                            ckf.y("rootView");
                            throw null;
                        }
                    } else {
                        ckf.y("rootView");
                        throw null;
                    }
                } else {
                    ckf.y("rootView");
                    throw null;
                }
            } else {
                ckf.y("rootView");
                throw null;
            }
        } else {
            ckf.y("context");
            throw null;
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f07e8c", new Object[]{this});
            return;
        }
        this.s = h19.e(i(), slo.KEY_IS_FULL, false);
        String i = h19.i(i(), "region", "");
        ckf.f(i, "parseString(status, \"region\", \"\")");
        this.t = i;
    }

    public final void R(boolean z, boolean z2) {
        GradientDrawable gradientDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731fe630", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            gradientDrawable = null;
        } else {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor("#CC000000"));
            gradientDrawable.setCornerRadius(p1p.b(z2 ? 12.0f : 24.0f));
        }
        View view = this.l;
        if (view != null) {
            view.setBackground(gradientDrawable);
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    public final void U() {
        Typeface typeface;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763daf7f", new Object[]{this});
            return;
        }
        R(false, false);
        View view = this.m;
        if (view != null) {
            view.setVisibility(8);
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                FrameLayout frameLayout2 = this.q;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                    int a2 = p1p.a(24.0f);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
                    if (m()) {
                        layoutParams.gravity = 8388629;
                        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, p1p.a(6.0f), layoutParams.bottomMargin);
                    } else {
                        layoutParams.gravity = 8388627;
                        layoutParams.setMargins(p1p.a(6.0f), layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
                    }
                    RippleLayout rippleLayout = this.v;
                    if (rippleLayout != null) {
                        rippleLayout.stopRippleAnim();
                    }
                    RippleLayout J = J(false);
                    this.v = J;
                    FrameLayout frameLayout3 = this.q;
                    if (frameLayout3 != null) {
                        frameLayout3.addView(J, layoutParams);
                        FrameLayout frameLayout4 = this.q;
                        if (frameLayout4 != null) {
                            frameLayout4.post(new d());
                            boolean e = h19.e(i(), "isPriceFirst", false);
                            Context context = this.r;
                            if (context != null) {
                                TextView textView = new TextView(context);
                                textView.setTextSize(14.0f);
                                if (e) {
                                    typeface = this.y;
                                } else {
                                    typeface = Typeface.DEFAULT;
                                }
                                textView.setTypeface(typeface);
                                textView.setTextColor(Color.parseColor("#FFFFFF"));
                                textView.setSingleLine();
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                                if (m()) {
                                    layoutParams2.gravity = 8388629;
                                    layoutParams2.setMargins(p1p.a(9.0f), layoutParams2.topMargin, p1p.a(36.0f), layoutParams2.bottomMargin);
                                } else {
                                    layoutParams2.gravity = 8388627;
                                    layoutParams2.setMargins(p1p.a(36.0f), layoutParams2.topMargin, p1p.a(9.0f), layoutParams2.bottomMargin);
                                }
                                FrameLayout frameLayout5 = this.q;
                                if (frameLayout5 != null) {
                                    frameLayout5.addView(textView, layoutParams2);
                                    if (e) {
                                        str = this.x;
                                    } else {
                                        str = this.w;
                                    }
                                    textView.setText(str);
                                    return;
                                }
                                ckf.y("simpleContainer");
                                throw null;
                            }
                            ckf.y("context");
                            throw null;
                        }
                        ckf.y("simpleContainer");
                        throw null;
                    }
                    ckf.y("simpleContainer");
                    throw null;
                }
                ckf.y("simpleContainer");
                throw null;
            }
            ckf.y("simpleContainer");
            throw null;
        }
        ckf.y("fullContainer");
        throw null;
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eab8b19", new Object[]{this});
            return;
        }
        this.u = V();
        View view = this.l;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                int[] iArr = this.u;
                if (iArr != null) {
                    layoutParams = new ViewGroup.MarginLayoutParams(iArr[0], iArr[1]);
                } else {
                    ckf.y("measureMetrics");
                    throw null;
                }
            }
            int[] iArr2 = this.u;
            if (iArr2 != null) {
                layoutParams.width = iArr2[0];
                layoutParams.height = iArr2[1];
                View view2 = this.l;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams);
                } else {
                    ckf.y("rootView");
                    throw null;
                }
            } else {
                ckf.y("measureMetrics");
                throw null;
            }
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96233150", new Object[]{this});
            return;
        }
        R(true, false);
        View view = this.m;
        if (view != null) {
            view.setVisibility(8);
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                FrameLayout frameLayout2 = this.q;
                if (frameLayout2 != null) {
                    frameLayout2.removeAllViews();
                    int i = this.k;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
                    layoutParams.gravity = 17;
                    FrameLayout frameLayout3 = this.q;
                    if (frameLayout3 != null) {
                        frameLayout3.setClipChildren(false);
                        RippleLayout rippleLayout = this.v;
                        if (rippleLayout != null) {
                            rippleLayout.stopRippleAnim();
                        }
                        RippleLayout J = J(true);
                        this.v = J;
                        FrameLayout frameLayout4 = this.q;
                        if (frameLayout4 != null) {
                            frameLayout4.addView(J, layoutParams);
                            FrameLayout frameLayout5 = this.q;
                            if (frameLayout5 != null) {
                                frameLayout5.post(new c());
                            } else {
                                ckf.y("simpleContainer");
                                throw null;
                            }
                        } else {
                            ckf.y("simpleContainer");
                            throw null;
                        }
                    } else {
                        ckf.y("simpleContainer");
                        throw null;
                    }
                } else {
                    ckf.y("simpleContainer");
                    throw null;
                }
            } else {
                ckf.y("simpleContainer");
                throw null;
            }
        } else {
            ckf.y("fullContainer");
            throw null;
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a15cdc", new Object[]{this});
            return;
        }
        R(false, true);
        View view = this.m;
        if (view != null) {
            view.setVisibility(0);
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                TextView textView = this.n;
                if (textView != null) {
                    textView.setText(this.w);
                    TextView textView2 = this.p;
                    if (textView2 != null) {
                        textView2.setText(this.x);
                    } else {
                        ckf.y("fullPriceTv");
                        throw null;
                    }
                } else {
                    ckf.y("fullTitleTv");
                    throw null;
                }
            } else {
                ckf.y("simpleContainer");
                throw null;
            }
        } else {
            ckf.y("fullContainer");
            throw null;
        }
    }

    public final int[] V() {
        Typeface typeface;
        String str;
        double ceil;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4f38b2d1", new Object[]{this});
        }
        if (c() == null) {
            int i = this.k;
            float f = (-i) / 2.0f;
            t(f);
            u(f);
            return new int[]{i, i};
        }
        float b2 = p1p.b(12.0f);
        int[] iArr = new int[2];
        if (this.s) {
            t(0.0f);
            u(0.0f);
            float b3 = p1p.b(145.0f);
            float b4 = p1p.b(9.0f);
            TextPaint textPaint = new TextPaint();
            TextView textView = this.n;
            if (textView != null) {
                textPaint.setTextSize(textView.getTextSize());
                TextView textView2 = this.n;
                if (textView2 != null) {
                    textPaint.setTypeface(textView2.getTypeface());
                    float measureText = textPaint.measureText(this.w) + b2 + b2;
                    float abs = Math.abs(textPaint.getFontMetrics().top) + Math.abs(textPaint.getFontMetrics().bottom);
                    float f2 = b4 + abs;
                    if (measureText > b3) {
                        f2 += abs;
                    }
                    float a2 = f2 + p1p.a(5.0f);
                    TextView textView3 = this.o;
                    if (textView3 != null) {
                        textPaint.setTextSize(textView3.getTextSize());
                        TextView textView4 = this.o;
                        if (textView4 != null) {
                            textPaint.setTypeface(textView4.getTypeface());
                            float measureText2 = textPaint.measureText(Localization.q(R.string.taobao_app_1007_1_18940)) + b2 + p1p.a(3.0f);
                            TextView textView5 = this.p;
                            if (textView5 != null) {
                                textPaint.setTextSize(textView5.getTextSize());
                                TextView textView6 = this.p;
                                if (textView6 != null) {
                                    textPaint.setTypeface(textView6.getTypeface());
                                    float measureText3 = measureText2 + textPaint.measureText(this.x) + b2;
                                    float abs2 = a2 + Math.abs(textPaint.getFontMetrics().top) + Math.abs(textPaint.getFontMetrics().bottom) + p1p.a(9.0f);
                                    if (measureText > b3 || measureText3 > b3) {
                                        ceil = Math.ceil(b3);
                                    } else {
                                        ceil = Math.ceil(hfn.b(measureText, measureText3));
                                    }
                                    iArr[0] = ((int) ceil) + p1p.a(2.0f);
                                    iArr[1] = (int) Math.ceil(abs2);
                                } else {
                                    ckf.y("fullPriceTv");
                                    throw null;
                                }
                            } else {
                                ckf.y("fullPriceTv");
                                throw null;
                            }
                        } else {
                            ckf.y("fullPriceHintTv");
                            throw null;
                        }
                    } else {
                        ckf.y("fullPriceHintTv");
                        throw null;
                    }
                } else {
                    ckf.y("fullTitleTv");
                    throw null;
                }
            } else {
                ckf.y("fullTitleTv");
                throw null;
            }
        } else {
            int a3 = p1p.a(29.0f);
            iArr[1] = a3;
            u((-a3) / 2.0f);
            float b5 = p1p.b(36.0f);
            t(-p1p.a(12.0f));
            boolean e = h19.e(i(), "isPriceFirst", false);
            Context context = this.r;
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTextSize(1, 14.0f);
                if (e) {
                    typeface = this.y;
                } else {
                    typeface = Typeface.DEFAULT;
                }
                textView7.setTypeface(typeface);
                TextPaint textPaint2 = new TextPaint();
                textPaint2.setTextSize(textView7.getTextSize());
                textPaint2.setTypeface(textView7.getTypeface());
                if (e) {
                    str = this.x;
                } else {
                    str = this.w;
                }
                iArr[0] = (int) Math.ceil(hfn.e(b5 + textPaint2.measureText(str) + p1p.b(9.0f), p1p.b(165.0f)));
            } else {
                ckf.y("context");
                throw null;
            }
        }
        return iArr;
    }
}
