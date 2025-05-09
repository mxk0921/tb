package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import tb.a1v;
import tb.brf;
import tb.c8;
import tb.ckf;
import tb.h9;
import tb.jht;
import tb.kew;
import tb.n8;
import tb.n9;
import tb.nbf;
import tb.npp;
import tb.t2o;
import tb.u8;
import tb.w1a;
import tb.xhv;
import tb.y7;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CarShopTopNavBarNativeComponent implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3301a;
    public final ShopDataParser b;
    public ViewGroup c;
    public ViewGroup d;
    public ViewGroup e;
    public LinearLayout f;
    public LinearLayout g;
    public View h;
    public final int i;
    public int j;
    public int k;
    public w1a<? super Integer, ? super Integer, ? super Integer, xhv> m;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public ArrayList<a> t;
    public final List<View> l = new ArrayList();
    public final int n = kew.v(24);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f3302a;
        public String b;
        public boolean c;
        public List<a> d;

        static {
            t2o.a(766510325);
        }

        public final List<a> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
            }
            return this.d;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9055b0d8", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
            }
            return this.f3302a;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a8e78229", new Object[]{this});
            }
            return this.b;
        }

        public final void e(List<a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f4ad579", new Object[]{this, list});
            } else {
                this.d = list;
            }
        }

        public final void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8a5dbf4", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        public final void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            } else {
                this.f3302a = str;
            }
        }

        public final void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13b2b06d", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a b;
        public final /* synthetic */ int c;

        public b(a aVar, int i) {
            this.b = aVar;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a1v.q(CarShopTopNavBarNativeComponent.this.n(), this.b.d(), null, 2, null);
            CarShopTopNavBarNativeComponent.this.s(this.c);
            CarShopTopNavBarNativeComponent.this.u(this.c, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a b;
        public final /* synthetic */ int c;

        public c(a aVar, int i) {
            this.b = aVar;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a1v.q(CarShopTopNavBarNativeComponent.this.n(), this.b.d(), null, 2, null);
            CarShopTopNavBarNativeComponent.g(CarShopTopNavBarNativeComponent.this, false, this.c);
            CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent = CarShopTopNavBarNativeComponent.this;
            carShopTopNavBarNativeComponent.u(CarShopTopNavBarNativeComponent.d(carShopTopNavBarNativeComponent), this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CarShopTopNavBarNativeComponent f3306a;
            public final /* synthetic */ LinearLayout b;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.shop2023.nativeview.CarShopTopNavBarNativeComponent$d$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class C0104a implements u8 {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public static final C0104a INSTANCE = new C0104a();

                @Override // tb.u8
                public final void callback(String str, c8 c8Var) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
                    }
                }
            }

            public a(CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent, LinearLayout linearLayout) {
                this.f3306a = carShopTopNavBarNativeComponent;
                this.b = linearLayout;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                JSONObject o0 = this.f3306a.n().o0();
                if (o0 != null && (string = o0.getString("carIndexNavUrl")) != null) {
                    LinearLayout linearLayout = this.b;
                    long currentTimeMillis = System.currentTimeMillis();
                    String uri = Uri.parse(string).buildUpon().appendQueryParameter("popId", String.valueOf(currentTimeMillis)).build().toString();
                    ckf.f(uri, "parse(carIndexNavUrl).buildUpon().appendQueryParameter(\"popId\", popId.toString()).build().toString()");
                    n9 n9Var = new n9();
                    n9Var.i(linearLayout.getContext());
                    Context context = linearLayout.getContext();
                    if (context != null) {
                        n9Var.m(((Activity) context).getWindow().getDecorView());
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "type", jht.actionShowWindVanePop);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put((JSONObject) "url", uri);
                        jSONObject2.put((JSONObject) "popId", (String) Long.valueOf(currentTimeMillis));
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put((JSONObject) "gravity", "bottom");
                        Boolean bool = Boolean.FALSE;
                        jSONObject3.put((JSONObject) "isOpaque", (String) bool);
                        jSONObject3.put((JSONObject) "pushType", "outterJump");
                        jSONObject3.put((JSONObject) "animation", nbf.STDPOP_ANIMATION_BOTTOM);
                        jSONObject3.put((JSONObject) "contentBackColor", "#00000000");
                        jSONObject3.put((JSONObject) "tapEnable", (String) bool);
                        jSONObject3.put((JSONObject) "maxHeight", (String) 1);
                        jSONObject2.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject3);
                        jSONObject.put((JSONObject) "params", (String) jSONObject2);
                        new y7().b(new n8(jSONObject), n9Var, C0104a.INSTANCE);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final b INSTANCE = new b();

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                }
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent = CarShopTopNavBarNativeComponent.this;
            CarShopTopNavBarNativeComponent.f(carShopTopNavBarNativeComponent, CarShopTopNavBarNativeComponent.d(carShopTopNavBarNativeComponent));
            LinearLayout c = CarShopTopNavBarNativeComponent.c(CarShopTopNavBarNativeComponent.this);
            FrameLayout.LayoutParams layoutParams = null;
            if (c != null) {
                int width = c.getWidth();
                ViewGroup b2 = CarShopTopNavBarNativeComponent.b(CarShopTopNavBarNativeComponent.this);
                if (b2 == null) {
                    ckf.y("lv2ScrollView");
                    throw null;
                } else if (width > b2.getWidth()) {
                    ViewGroup a2 = CarShopTopNavBarNativeComponent.a(CarShopTopNavBarNativeComponent.this);
                    if (a2 != null) {
                        CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent2 = CarShopTopNavBarNativeComponent.this;
                        FrameLayout frameLayout = new FrameLayout(a2.getContext());
                        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams.width = kew.v(150);
                            ((ViewGroup.LayoutParams) marginLayoutParams).height = -1;
                            frameLayout.setLayoutParams(layoutParams2);
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams2.width = kew.v(150);
                            ((ViewGroup.LayoutParams) marginLayoutParams2).height = -1;
                            xhv xhvVar = xhv.INSTANCE;
                            frameLayout.setLayoutParams(marginLayoutParams2);
                        }
                        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(16);
                        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                            linearLayout.setLayoutParams(layoutParams3);
                        } else {
                            ViewGroup.LayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                            xhv xhvVar2 = xhv.INSTANCE;
                            linearLayout.setLayoutParams(marginLayoutParams3);
                        }
                        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            layoutParams = (FrameLayout.LayoutParams) layoutParams4;
                        }
                        if (layoutParams == null) {
                            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams5.gravity = 17;
                            xhv xhvVar3 = xhv.INSTANCE;
                            linearLayout.setLayoutParams(layoutParams5);
                        } else {
                            layoutParams.gravity = 17;
                        }
                        TextView textView = new TextView(linearLayout.getContext());
                        ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
                        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                            textView.setLayoutParams(layoutParams6);
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
                            xhv xhvVar4 = xhv.INSTANCE;
                            textView.setLayoutParams(marginLayoutParams4);
                        }
                        textView.setText("全部");
                        textView.setTextColor(-1);
                        kew.c0(textView, kew.v(30));
                        linearLayout.addView(textView);
                        xhv xhvVar5 = xhv.INSTANCE;
                        TUrlImageView tUrlImageView = new TUrlImageView(linearLayout.getContext());
                        ViewGroup.LayoutParams layoutParams7 = tUrlImageView.getLayoutParams();
                        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                            tUrlImageView.setLayoutParams(layoutParams7);
                        } else {
                            tUrlImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                        }
                        ViewGroup.LayoutParams layoutParams8 = tUrlImageView.getLayoutParams();
                        if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams8;
                            marginLayoutParams5.width = kew.v(20);
                            marginLayoutParams5.height = kew.v(12);
                            marginLayoutParams5.leftMargin = kew.v(10);
                            marginLayoutParams5.topMargin = kew.v(3);
                            tUrlImageView.setLayoutParams(layoutParams8);
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams6.width = kew.v(20);
                            marginLayoutParams6.height = kew.v(12);
                            marginLayoutParams6.leftMargin = kew.v(10);
                            marginLayoutParams6.topMargin = kew.v(3);
                            tUrlImageView.setLayoutParams(marginLayoutParams6);
                        }
                        tUrlImageView.setImageResource(R.drawable.svg_ic_arrow_down);
                        linearLayout.addView(tUrlImageView);
                        linearLayout.setOnClickListener(new a(carShopTopNavBarNativeComponent2, linearLayout));
                        frameLayout.addView(linearLayout);
                        frameLayout.setOnClickListener(b.INSTANCE);
                        a2.addView(frameLayout);
                        return;
                    }
                    ckf.y("lv2Container");
                    throw null;
                }
            } else {
                ckf.y("lv2TabContainer");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ValueAnimator b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public e(ValueAnimator valueAnimator, int i, int i2) {
            this.b = valueAnimator;
            this.c = i;
            this.d = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent = CarShopTopNavBarNativeComponent.this;
            Object animatedValue = this.b.getAnimatedValue();
            if (animatedValue != null) {
                CarShopTopNavBarNativeComponent.e(carShopTopNavBarNativeComponent, ((Float) animatedValue).floatValue(), this.c, this.d);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3308a;
        public final /* synthetic */ int b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ ViewGroup d;

        public f(int i, int i2, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f3308a = i;
            this.b = i2;
            this.c = viewGroup;
            this.d = viewGroup2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = this.f3308a;
            int i2 = this.b;
            if (i < i2) {
                int right = this.c.getChildAt(i2).getRight() - (this.d.getWidth() + this.d.getScrollX());
                if (right > 0) {
                    ViewGroup viewGroup = this.d;
                    viewGroup.setScrollX(viewGroup.getScrollX() + right);
                }
            } else if (this.c.getChildAt(i2).getLeft() < this.d.getScrollX()) {
                this.d.setScrollX(this.c.getChildAt(this.b).getLeft());
            }
        }
    }

    static {
        t2o.a(766510324);
    }

    public CarShopTopNavBarNativeComponent(Context context, ShopDataParser shopDataParser) {
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        this.f3301a = context;
        this.b = shopDataParser;
        this.i = shopDataParser.d0();
    }

    public static final /* synthetic */ ViewGroup a(CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9680714e", new Object[]{carShopTopNavBarNativeComponent});
        }
        return carShopTopNavBarNativeComponent.e;
    }

    public static final /* synthetic */ ViewGroup b(CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3a7dfdf9", new Object[]{carShopTopNavBarNativeComponent});
        }
        return carShopTopNavBarNativeComponent.c;
    }

    public static final /* synthetic */ LinearLayout c(CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("72d7854d", new Object[]{carShopTopNavBarNativeComponent});
        }
        return carShopTopNavBarNativeComponent.f;
    }

    public static final /* synthetic */ int d(CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5953087a", new Object[]{carShopTopNavBarNativeComponent})).intValue();
        }
        return carShopTopNavBarNativeComponent.j;
    }

    public static final /* synthetic */ void e(CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b502af", new Object[]{carShopTopNavBarNativeComponent, new Float(f2), new Integer(i), new Integer(i2)});
        } else {
            carShopTopNavBarNativeComponent.t(f2, i, i2);
        }
    }

    public static final /* synthetic */ void f(CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6011cb11", new Object[]{carShopTopNavBarNativeComponent, new Integer(i)});
        } else {
            carShopTopNavBarNativeComponent.y(i);
        }
    }

    public static final /* synthetic */ void g(CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a630c14", new Object[]{carShopTopNavBarNativeComponent, new Boolean(z), new Integer(i)});
        } else {
            carShopTopNavBarNativeComponent.z(z, i);
        }
    }

    public static /* synthetic */ void r(CarShopTopNavBarNativeComponent carShopTopNavBarNativeComponent, int i, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da0e89", new Object[]{carShopTopNavBarNativeComponent, new Integer(i), new Boolean(z), new Integer(i2), obj});
        } else if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            carShopTopNavBarNativeComponent.q(i, z);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initLv3Tab");
        }
    }

    public final int k() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ecb5ab9", new Object[]{this})).intValue();
        }
        int i2 = 0;
        int i3 = 0;
        for (Object obj : l()) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                a aVar = (a) obj;
                if (i3 < this.j) {
                    List<a> a2 = aVar.a();
                    if (a2 == null) {
                        i = 0;
                    } else {
                        i = a2.size();
                    }
                    i2 += i;
                }
                i3 = i4;
            } else {
                yz3.p();
                throw null;
            }
        }
        return i2 + this.k;
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("540f3df6", new Object[]{this})).intValue();
        }
        return this.n;
    }

    public final ShopDataParser n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        return this.b;
    }

    public final int o() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9428606a", new Object[]{this})).intValue();
        }
        int i2 = 0;
        for (a aVar : l()) {
            List<a> a2 = aVar.a();
            if (a2 == null) {
                i = 0;
            } else {
                i = a2.size();
            }
            i2 += i;
        }
        return i2;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.s = false;
        } else if (i == 1) {
            this.s = true;
            this.q = this.p;
            this.r = this.j;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f2, int i2) {
        Integer num;
        int i3;
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f2), new Integer(i2)});
        } else if (this.s) {
            float f3 = f2 + i;
            int i5 = this.q;
            float f4 = f3 - i5;
            if (f4 < 0.0f) {
                i4 = -1;
            }
            Pair<Integer, Integer> w = w(i5 + i4);
            if (w == null) {
                num = null;
            } else {
                num = w.getFirst();
            }
            if (num == null) {
                i3 = this.r;
            } else {
                i3 = num.intValue();
            }
            t(Math.abs(f4), this.r, i3);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        this.p = i;
        Pair<Integer, Integer> w = w(i);
        if (w != null) {
            x(w.getFirst().intValue(), w.getSecond().intValue());
        }
        npp.a aVar = npp.Companion;
        aVar.f("CarShopTopNavBarNativeComponent onPageSelected position " + i + " lv2TabIndex " + this.j + " lv3TabIndex " + this.k);
    }

    public void u(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec641bd", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i4 = i2;
        if (i > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                List<a> a2 = l().get(i5).a();
                if (a2 == null) {
                    i3 = 0;
                } else {
                    i3 = a2.size();
                }
                i4 += i3;
                if (i6 >= i) {
                    break;
                }
                i5 = i6;
            }
        }
        w1a<? super Integer, ? super Integer, ? super Integer, xhv> w1aVar = this.m;
        if (w1aVar != null) {
            w1aVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4));
        }
    }

    public final void v(w1a<? super Integer, ? super Integer, ? super Integer, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ce0b7b", new Object[]{this, w1aVar});
        } else {
            this.m = w1aVar;
        }
    }

    public final Pair<Integer, Integer> w(int i) {
        ArrayList<a> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("27099f68", new Object[]{this, new Integer(i)});
        }
        if (i <= this.o - 1 && (arrayList = this.t) != null) {
            int i2 = 0;
            int i3 = 0;
            for (a aVar : arrayList) {
                List<a> a2 = aVar.a();
                if (a2 != null) {
                    int i4 = 0;
                    for (a aVar2 : a2) {
                        if (i3 == i) {
                            return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i4));
                        }
                        i3++;
                        i4++;
                    }
                    continue;
                }
                i2++;
            }
        }
        return null;
    }

    public void x(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335dd7c9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        r(this, i, false, 2, null);
        z(true, i);
        z(false, i2);
        y(i);
    }

    public final void h(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b152e24", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        a1v.s(this.b, aVar.d(), null, 2, null);
        View K = kew.K(this.f3301a, R.layout.shop_top_nav_bar_tab);
        ckf.d(K);
        TextView textView = (TextView) K.findViewById(R.id.tv_name);
        ckf.f(textView, "tvName");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = kew.v(24);
            marginLayoutParams.rightMargin = kew.v(24);
            textView.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.leftMargin = kew.v(24);
            marginLayoutParams2.rightMargin = kew.v(24);
            xhv xhvVar = xhv.INSTANCE;
            textView.setLayoutParams(marginLayoutParams2);
        }
        kew.c0(textView, kew.v(30));
        textView.setTextColor(-1);
        textView.setText(aVar.c());
        textView.setContentDescription(((Object) textView.getText()) + " 按钮");
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.addView(K);
            ViewProxy.setOnClickListener(K, new b(aVar, i));
            return;
        }
        ckf.y("lv2TabContainer");
        throw null;
    }

    public final List<a> l() {
        JSONObject g;
        JSONArray jSONArray;
        ArrayList<a> arrayList;
        List<a> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7474b26c", new Object[]{this});
        }
        ArrayList<a> arrayList2 = this.t;
        if (arrayList2 != null) {
            return arrayList2;
        }
        this.t = new ArrayList<>();
        JSONArray w = this.b.w();
        if (!(w == null || (g = brf.g(w, 0)) == null || (jSONArray = g.getJSONArray("childrens")) == null)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof JSONObject) && (arrayList = this.t) != null) {
                    a aVar = new a();
                    JSONObject jSONObject = (JSONObject) next;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
                    aVar.g(jSONObject2.getString("title"));
                    aVar.h(jSONObject2.getString("utArg1"));
                    aVar.f(ckf.b(jSONObject2.getString("hideChildNodes"), "true"));
                    if (jSONObject.getJSONArray("childrens").size() > 0) {
                        aVar.e(new ArrayList());
                        JSONArray jSONArray2 = jSONObject.getJSONArray("childrens");
                        ckf.f(jSONArray2, "level2Model.getJSONArray(\"childrens\")");
                        for (Object obj : jSONArray2) {
                            JSONObject jSONObject3 = obj instanceof JSONObject ? (JSONObject) obj : null;
                            if (!(jSONObject3 == null || (a2 = aVar.a()) == null)) {
                                a aVar2 = new a();
                                aVar2.g(jSONObject3.getString("title"));
                                aVar2.h(jSONObject3.getString("utArg1"));
                                xhv xhvVar = xhv.INSTANCE;
                                a2.add(aVar2);
                            }
                        }
                    }
                    xhv xhvVar2 = xhv.INSTANCE;
                    arrayList.add(aVar);
                }
            }
        }
        ArrayList<a> arrayList3 = this.t;
        ckf.d(arrayList3);
        return arrayList3;
    }

    public final void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f96a3d6", new Object[]{this, new Integer(i)});
            return;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            View view = this.h;
            if (view != null) {
                int left = childAt.getLeft();
                int width = childAt.getWidth();
                View view2 = this.h;
                if (view2 != null) {
                    view.setTranslationX(left + ((width - view2.getWidth()) / 2));
                } else {
                    ckf.y("line");
                    throw null;
                }
            } else {
                ckf.y("line");
                throw null;
            }
        } else {
            ckf.y("lv2TabContainer");
            throw null;
        }
    }

    public final void i(a aVar, int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942079a5", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        a1v.s(this.b, aVar.d(), null, 2, null);
        List<View> list = this.l;
        if (list == null || ((ArrayList) list).isEmpty()) {
            view = kew.K(this.f3301a, R.layout.shop_top_nav_bar_tab);
            ckf.d(view);
        } else {
            view = (View) ((ArrayList) this.l).remove(0);
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_name);
        ckf.f(textView, "tvName");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = kew.v(24);
            marginLayoutParams.rightMargin = kew.v(24);
            textView.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.leftMargin = kew.v(24);
            marginLayoutParams2.rightMargin = kew.v(24);
            xhv xhvVar = xhv.INSTANCE;
            textView.setLayoutParams(marginLayoutParams2);
        }
        kew.c0(textView, kew.v(26));
        textView.setTextColor(-1);
        textView.setText(aVar.c());
        textView.setContentDescription(((Object) textView.getText()) + " 按钮");
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            linearLayout.addView(view);
            ViewProxy.setOnClickListener(view, new c(aVar, i));
            return;
        }
        ckf.y("lv3TabContainer");
        throw null;
    }

    public final void j(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a79766", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            linearLayout.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar = xhv.INSTANCE;
            linearLayout.setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.LayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams2)).width = -1;
            linearLayout.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.LayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.width = -1;
            xhv xhvVar2 = xhv.INSTANCE;
            linearLayout.setLayoutParams(marginLayoutParams2);
        }
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams3);
        } else {
            ViewGroup.LayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar3 = xhv.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams3);
        }
        this.e = linearLayout2;
        ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            ((ViewGroup.LayoutParams) marginLayoutParams4).width = -1;
            marginLayoutParams4.height = kew.v(88);
            linearLayout2.setLayoutParams(layoutParams4);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams5).width = -1;
            marginLayoutParams5.height = kew.v(88);
            xhv xhvVar4 = xhv.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams5);
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams5 = horizontalScrollView.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            horizontalScrollView.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.LayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar5 = xhv.INSTANCE;
            horizontalScrollView.setLayoutParams(marginLayoutParams6);
        }
        this.c = horizontalScrollView;
        horizontalScrollView.setScrollBarSize(0);
        ViewGroup.LayoutParams layoutParams6 = horizontalScrollView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams7 = null;
        LinearLayout.LayoutParams layoutParams8 = layoutParams6 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams6 : null;
        if (layoutParams8 == null) {
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) layoutParams9).width = -1;
            layoutParams9.weight = 1.0f;
            xhv xhvVar6 = xhv.INSTANCE;
            horizontalScrollView.setLayoutParams(layoutParams9);
        } else {
            ((ViewGroup.LayoutParams) layoutParams8).width = -1;
            layoutParams8.weight = 1.0f;
        }
        FrameLayout frameLayout = new FrameLayout(horizontalScrollView.getContext());
        LinearLayout linearLayout3 = new LinearLayout(frameLayout.getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        ViewGroup.LayoutParams layoutParams10 = linearLayout3.getLayoutParams();
        if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout3.setLayoutParams(layoutParams10);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar7 = xhv.INSTANCE;
            linearLayout3.setLayoutParams(marginLayoutParams7);
        }
        this.f = linearLayout3;
        ViewGroup.LayoutParams layoutParams11 = linearLayout3.getLayoutParams();
        if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams11).height = kew.v(88);
            linearLayout3.setLayoutParams(layoutParams11);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams8 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams8.height = kew.v(88);
            xhv xhvVar8 = xhv.INSTANCE;
            linearLayout3.setLayoutParams(marginLayoutParams8);
        }
        frameLayout.addView(linearLayout3);
        xhv xhvVar9 = xhv.INSTANCE;
        View view = new View(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams12 = view.getLayoutParams();
        if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
            view.setLayoutParams(layoutParams12);
        } else {
            view.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.h = view;
        kew.e0(view, true, kew.v(8));
        ViewGroup.LayoutParams layoutParams13 = view.getLayoutParams();
        if (layoutParams13 instanceof FrameLayout.LayoutParams) {
            layoutParams7 = (FrameLayout.LayoutParams) layoutParams13;
        }
        if (layoutParams7 == null) {
            FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams14.width = m();
            layoutParams14.height = kew.v(4);
            layoutParams14.gravity = 80;
            layoutParams14.bottomMargin = kew.v(16);
            view.setLayoutParams(layoutParams14);
        } else {
            layoutParams7.width = m();
            layoutParams7.height = kew.v(4);
            layoutParams7.gravity = 80;
            layoutParams7.bottomMargin = kew.v(16);
        }
        view.setBackgroundColor(-1);
        frameLayout.addView(view);
        horizontalScrollView.addView(frameLayout);
        linearLayout2.addView(horizontalScrollView);
        linearLayout.addView(linearLayout2);
        HorizontalScrollView horizontalScrollView2 = new HorizontalScrollView(viewGroup.getContext());
        ViewGroup.LayoutParams layoutParams15 = horizontalScrollView2.getLayoutParams();
        if (layoutParams15 instanceof ViewGroup.MarginLayoutParams) {
            horizontalScrollView2.setLayoutParams(layoutParams15);
        } else {
            horizontalScrollView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.d = horizontalScrollView2;
        horizontalScrollView2.setScrollBarSize(0);
        ViewGroup.LayoutParams layoutParams16 = horizontalScrollView2.getLayoutParams();
        if (layoutParams16 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.LayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams16)).width = -1;
            horizontalScrollView2.setLayoutParams(layoutParams16);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams9 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams9).width = -1;
            horizontalScrollView2.setLayoutParams(marginLayoutParams9);
        }
        LinearLayout linearLayout4 = new LinearLayout(horizontalScrollView2.getContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        ViewGroup.LayoutParams layoutParams17 = linearLayout4.getLayoutParams();
        if (layoutParams17 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout4.setLayoutParams(layoutParams17);
        } else {
            linearLayout4.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.g = linearLayout4;
        ViewGroup.LayoutParams layoutParams18 = linearLayout4.getLayoutParams();
        if (layoutParams18 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams18).height = kew.v(70);
            linearLayout4.setLayoutParams(layoutParams18);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams10 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams10.height = kew.v(70);
            linearLayout4.setLayoutParams(marginLayoutParams10);
        }
        horizontalScrollView2.addView(linearLayout4);
        linearLayout.addView(horizontalScrollView2);
        viewGroup.addView(linearLayout);
        p();
        q(this.j, true);
        z(false, this.k);
    }

    public final void p() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda1ddc4", new Object[]{this});
            return;
        }
        for (Object obj : l()) {
            i++;
            if (i >= 0) {
                h((a) obj, i);
            } else {
                yz3.p();
                throw null;
            }
        }
        int o = o();
        this.o = o;
        npp.Companion.f(ckf.p("CarShopTopNavBarNativeComponent initLv2Tab tabCount ", Integer.valueOf(o)));
        z(true, this.j);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.post(new d());
        } else {
            ckf.y("lv2TabContainer");
            throw null;
        }
    }

    public final void q(int i, boolean z) {
        List<a> a2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98e14", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (z || this.j != i) {
            LinearLayout linearLayout = this.g;
            if (linearLayout != null) {
                if (linearLayout.getChildCount() > 0) {
                    LinearLayout linearLayout2 = this.g;
                    if (linearLayout2 != null) {
                        int childCount = linearLayout2.getChildCount();
                        if (childCount > 0) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                List<View> list = this.l;
                                LinearLayout linearLayout3 = this.g;
                                if (linearLayout3 != null) {
                                    View childAt = linearLayout3.getChildAt(i3);
                                    ckf.f(childAt, "lv3TabContainer.getChildAt(i)");
                                    ((ArrayList) list).add(childAt);
                                    if (i4 >= childCount) {
                                        break;
                                    }
                                    i3 = i4;
                                } else {
                                    ckf.y("lv3TabContainer");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        ckf.y("lv3TabContainer");
                        throw null;
                    }
                }
                LinearLayout linearLayout4 = this.g;
                if (linearLayout4 != null) {
                    linearLayout4.removeAllViews();
                    if (!l().get(i).b() && (a2 = l().get(i).a()) != null) {
                        for (Object obj : a2) {
                            i2++;
                            if (i2 >= 0) {
                                i((a) obj, i2);
                            } else {
                                yz3.p();
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                }
                ckf.y("lv3TabContainer");
                throw null;
            }
            ckf.y("lv3TabContainer");
            throw null;
        }
    }

    public final void t(float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1f734", new Object[]{this, new Float(f2), new Integer(i), new Integer(i2)});
        } else if (i != i2 && i2 >= 0) {
            LinearLayout linearLayout = this.f;
            if (linearLayout == null) {
                ckf.y("lv2TabContainer");
                throw null;
            } else if (i2 <= linearLayout.getChildCount() - 1) {
                LinearLayout linearLayout2 = this.f;
                if (linearLayout2 != null) {
                    View childAt = linearLayout2.getChildAt(i);
                    LinearLayout linearLayout3 = this.f;
                    if (linearLayout3 != null) {
                        View childAt2 = linearLayout3.getChildAt(i2);
                        int left = (childAt2.getLeft() + (childAt2.getWidth() / 2)) - (childAt.getLeft() + (childAt.getWidth() / 2));
                        int left2 = childAt.getLeft();
                        int width = childAt.getWidth();
                        View view = this.h;
                        if (view != null) {
                            float width2 = left2 + ((width - view.getWidth()) / 2);
                            View view2 = this.h;
                            if (view2 != null) {
                                view2.setTranslationX(width2 + (left * f2));
                            } else {
                                ckf.y("line");
                                throw null;
                            }
                        } else {
                            ckf.y("line");
                            throw null;
                        }
                    } else {
                        ckf.y("lv2TabContainer");
                        throw null;
                    }
                } else {
                    ckf.y("lv2TabContainer");
                    throw null;
                }
            }
        }
    }

    public final void z(boolean z, int i) {
        ViewGroup viewGroup;
        LinearLayout linearLayout;
        int i2;
        TextView textView;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a588b6f", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (z || !l().get(this.j).b()) {
            if (z) {
                linearLayout = this.f;
                if (linearLayout != null) {
                    viewGroup = this.c;
                    if (viewGroup != null) {
                        i2 = this.j;
                    } else {
                        ckf.y("lv2ScrollView");
                        throw null;
                    }
                } else {
                    ckf.y("lv2TabContainer");
                    throw null;
                }
            } else {
                linearLayout = this.g;
                if (linearLayout != null) {
                    viewGroup = this.d;
                    if (viewGroup != null) {
                        i2 = this.k;
                    } else {
                        ckf.y("lv3ScrollView");
                        throw null;
                    }
                } else {
                    ckf.y("lv3TabContainer");
                    throw null;
                }
            }
            if (i2 < linearLayout.getChildCount()) {
                if (z) {
                    TextView textView2 = (TextView) linearLayout.getChildAt(i2).findViewById(R.id.tv_name);
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setAlpha(0.8f);
                    textView2.setContentDescription(((Object) textView2.getText()) + " 按钮");
                } else {
                    int childCount = linearLayout.getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i4 = i3 + 1;
                            TextView textView3 = (TextView) linearLayout.getChildAt(i3).findViewById(R.id.tv_name);
                            textView3.setAlpha(0.8f);
                            textView3.setTypeface(Typeface.DEFAULT);
                            if (i4 >= childCount) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                }
            }
            View childAt = linearLayout.getChildAt(i);
            if (!(childAt == null || (textView = (TextView) childAt.findViewById(R.id.tv_name)) == null)) {
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setTextColor(-1);
                textView.setAlpha(1.0f);
                textView.setContentDescription(((Object) textView.getText()) + " 已选中 按钮");
            }
            linearLayout.post(new f(i2, i, linearLayout, viewGroup));
            if (z) {
                this.j = i;
            } else {
                this.k = i;
            }
        }
    }

    public final void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9a68e9", new Object[]{this, new Integer(i)});
            return;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            ckf.y("lv2TabContainer");
            throw null;
        } else if (i <= linearLayout.getChildCount() - 1) {
            if (!this.s) {
                int i2 = this.j;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new e(ofFloat, i2, i));
                ofFloat.start();
            } else if (this.i >= 2) {
                y(i);
            }
            if (i != this.j) {
                r(this, i, false, 2, null);
                z(true, i);
                z(false, 0);
            }
        }
    }
}
