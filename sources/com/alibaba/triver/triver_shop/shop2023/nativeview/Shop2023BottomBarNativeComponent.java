package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.extension.dianmicX.Tab3AnimationIcon;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.a1v;
import tb.bdw;
import tb.ckf;
import tb.fps;
import tb.g1a;
import tb.i04;
import tb.kew;
import tb.khu;
import tb.mop;
import tb.npp;
import tb.r54;
import tb.rsq;
import tb.t2o;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023BottomBarNativeComponent implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int bottomBarHeightWithBottomMarginRpxValue = 162;
    public int A;
    public boolean B;
    public fps C;
    public JSONObject D;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3309a;
    public final ShopDataParser b;
    public FrameLayout c;
    public FrameLayout d;
    public final List<View> e = new ArrayList();
    public View f;
    public g1a<? super Integer, xhv> g;
    public int h;
    public int i;
    public int j;
    public final JSONArray k;
    public JSONArray l;
    public LinearLayout m;
    public View n;
    public final int o;
    public boolean p;
    public final Drawable q;
    public final Drawable r;
    public final Drawable s;
    public boolean t;
    public final int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510337);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ int d;

        public b(JSONObject jSONObject, JSONObject jSONObject2, int i) {
            this.b = jSONObject;
            this.c = jSONObject2;
            this.d = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent = Shop2023BottomBarNativeComponent.this;
            JSONObject jSONObject = this.b;
            String str = null;
            String string = jSONObject == null ? null : jSONObject.getString("clkUtArg1");
            String string2 = this.c.getString("name");
            ckf.f(string2, "info.getString(\"name\")");
            Shop2023BottomBarNativeComponent.I(shop2023BottomBarNativeComponent, string, string2, null, 4, null);
            Object obj = Shop2023BottomBarNativeComponent.this.q().p0(this.d).get("tabData");
            JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
            if (jSONArray != null) {
                Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent2 = Shop2023BottomBarNativeComponent.this;
                int i = this.d;
                JSONObject jSONObject2 = this.c;
                if (jSONArray.size() > 0) {
                    Shop2023BottomBarNativeComponent.a(shop2023BottomBarNativeComponent2, i);
                    g1a<Integer, xhv> r = shop2023BottomBarNativeComponent2.r();
                    if (r != null) {
                        r.invoke(Integer.valueOf(i));
                    }
                } else if (ckf.b(jSONObject2.getString("name"), mop.KEY_WANG_WANG)) {
                    Context p = shop2023BottomBarNativeComponent2.p();
                    JSONObject Z0 = shop2023BottomBarNativeComponent2.q().Z0();
                    if (Z0 != null) {
                        str = Z0.getString("wangWangLink");
                    }
                    khu.h(p, str);
                } else {
                    khu.h(shop2023BottomBarNativeComponent2.p(), shop2023BottomBarNativeComponent2.q().a1());
                }
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
            Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent = Shop2023BottomBarNativeComponent.this;
            Shop2023BottomBarNativeComponent.i(shop2023BottomBarNativeComponent, (((View) Shop2023BottomBarNativeComponent.h(shop2023BottomBarNativeComponent).get(0)).getLeft() + kew.v(24)) - kew.v(20));
            View c = Shop2023BottomBarNativeComponent.c(Shop2023BottomBarNativeComponent.this);
            if (c != null) {
                c.setX(Shop2023BottomBarNativeComponent.e(Shop2023BottomBarNativeComponent.this) + (Shop2023BottomBarNativeComponent.b(Shop2023BottomBarNativeComponent.this) * Shop2023BottomBarNativeComponent.d(Shop2023BottomBarNativeComponent.this)));
            } else {
                ckf.y("slide");
                throw null;
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
            View c = Shop2023BottomBarNativeComponent.c(Shop2023BottomBarNativeComponent.this);
            if (c != null) {
                c.setX(Shop2023BottomBarNativeComponent.e(Shop2023BottomBarNativeComponent.this) + (Shop2023BottomBarNativeComponent.b(Shop2023BottomBarNativeComponent.this) * Shop2023BottomBarNativeComponent.d(Shop2023BottomBarNativeComponent.this)));
            } else {
                ckf.y("slide");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Shop2023BottomBarNativeComponent.this.z();
            JSONArray g = Shop2023BottomBarNativeComponent.g(Shop2023BottomBarNativeComponent.this);
            String str = null;
            Object obj = g == null ? null : g.get(2);
            if (obj != null) {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("userTrackInfo");
                Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent = Shop2023BottomBarNativeComponent.this;
                if (jSONObject != null) {
                    str = jSONObject.getString("clkUtArg1");
                }
                Shop2023BottomBarNativeComponent.I(shop2023BottomBarNativeComponent, str, "livebar", null, 4, null);
                Shop2023BottomBarNativeComponent.a(Shop2023BottomBarNativeComponent.this, 2);
                g1a<Integer, xhv> r = Shop2023BottomBarNativeComponent.this.r();
                if (r != null) {
                    r.invoke(2);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Tab3AnimationIcon f3314a;
        public final /* synthetic */ Shop2023BottomBarNativeComponent b;

        public f(Tab3AnimationIcon tab3AnimationIcon, Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
            this.f3314a = tab3AnimationIcon;
            this.b = shop2023BottomBarNativeComponent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FrameLayout.LayoutParams layoutParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Tab3AnimationIcon tab3AnimationIcon = this.f3314a;
            Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent = this.b;
            ViewGroup.LayoutParams layoutParams2 = tab3AnimationIcon.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams == null) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                int v = kew.v(114);
                fps f = Shop2023BottomBarNativeComponent.f(shop2023BottomBarNativeComponent);
                ckf.d(f);
                layoutParams3.topMargin = (v - f.g().getHeight()) / 2;
                xhv xhvVar = xhv.INSTANCE;
                tab3AnimationIcon.setLayoutParams(layoutParams3);
                return;
            }
            int v2 = kew.v(114);
            fps f2 = Shop2023BottomBarNativeComponent.f(shop2023BottomBarNativeComponent);
            ckf.d(f2);
            layoutParams.topMargin = (v2 - f2.g().getHeight()) / 2;
        }
    }

    static {
        t2o.a(766510336);
    }

    public Shop2023BottomBarNativeComponent(Context context, ShopDataParser shopDataParser) {
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        this.f3309a = context;
        this.b = shopDataParser;
        this.d = new FrameLayout(context);
        this.i = shopDataParser.d0();
        Object obj = shopDataParser.h().get("tabData");
        JSONArray jSONArray = null;
        JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
        this.k = jSONArray2;
        Object obj2 = shopDataParser.p0(this.i).get("tabData");
        this.l = obj2 instanceof JSONArray ? (JSONArray) obj2 : jSONArray;
        this.o = kew.v(662) / (jSONArray2 == null ? 1 : jSONArray2.size());
        this.q = kew.u(0, null, new int[]{-1291845632, 1291845632}, 0, 0, 0, 0, 0, 0, 0, 1019, null);
        this.r = kew.u(kew.c(16777215, 0.95f), null, null, 0, 0, 0, 0, 0, kew.v(1), -1, 254, null);
        this.s = kew.u(0, GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1, 16777215}, 0, 0, 0, 0, 0, 0, 0, 1017, null);
        this.t = true;
        this.u = kew.v(Integer.valueOf((int) bottomBarHeightWithBottomMarginRpxValue));
    }

    public static /* synthetic */ void I(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent, String str, String str2, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a573b99b", new Object[]{shop2023BottomBarNativeComponent, str, str2, map, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        shop2023BottomBarNativeComponent.H(str, str2, map);
    }

    public static /* synthetic */ void K(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent, String str, String str2, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103bbdc7", new Object[]{shop2023BottomBarNativeComponent, str, str2, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        shop2023BottomBarNativeComponent.J(str, str2, map);
    }

    public static final /* synthetic */ void a(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ee7a08", new Object[]{shop2023BottomBarNativeComponent, new Integer(i)});
        } else {
            shop2023BottomBarNativeComponent.m(i);
        }
    }

    public static final /* synthetic */ int b(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2968461c", new Object[]{shop2023BottomBarNativeComponent})).intValue();
        }
        return shop2023BottomBarNativeComponent.i;
    }

    public static final /* synthetic */ View c(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1fa62aa1", new Object[]{shop2023BottomBarNativeComponent});
        }
        return shop2023BottomBarNativeComponent.n;
    }

    public static final /* synthetic */ int d(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("719cd9dd", new Object[]{shop2023BottomBarNativeComponent})).intValue();
        }
        return shop2023BottomBarNativeComponent.o;
    }

    public static final /* synthetic */ int e(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b167850b", new Object[]{shop2023BottomBarNativeComponent})).intValue();
        }
        return shop2023BottomBarNativeComponent.h;
    }

    public static final /* synthetic */ fps f(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fps) ipChange.ipc$dispatch("cb898701", new Object[]{shop2023BottomBarNativeComponent});
        }
        return shop2023BottomBarNativeComponent.C;
    }

    public static final /* synthetic */ JSONArray g(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2bdb2d6d", new Object[]{shop2023BottomBarNativeComponent});
        }
        return shop2023BottomBarNativeComponent.k;
    }

    public static final /* synthetic */ List h(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("28f301ef", new Object[]{shop2023BottomBarNativeComponent});
        }
        return shop2023BottomBarNativeComponent.e;
    }

    public static final /* synthetic */ void i(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c633b5f", new Object[]{shop2023BottomBarNativeComponent, new Integer(i)});
        } else {
            shop2023BottomBarNativeComponent.h = i;
        }
    }

    public final void A(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c666f31", new Object[]{this, g1aVar});
        } else {
            this.g = g1aVar;
        }
    }

    public final void B(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c44722", new Object[]{this, frameLayout});
        } else {
            this.c = frameLayout;
        }
    }

    public final void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c433a809", new Object[]{this, new Integer(i)});
        } else {
            m(i);
        }
    }

    public final void E(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335dd7c9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        npp.Companion.f("switchTabBySwipe");
        this.i = i;
        this.j = i2;
    }

    public final void F(int i) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e7802", new Object[]{this, new Integer(i)});
            return;
        }
        View view = (View) i04.d0(this.e, i);
        if (view != null && (jSONArray = this.k) != null && (jSONObject = jSONArray.getJSONObject(i)) != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_text);
            if (this.v) {
                TUrlImageView tUrlImageView2 = (TUrlImageView) view.findViewById(R.id.iv_tab_icon);
                if (tUrlImageView2 != null) {
                    tUrlImageView2.setImageUrl(jSONObject.getString("defaultPic4Darkmode"));
                }
                if (textView != null) {
                    textView.setTextColor(-1);
                }
            } else {
                TUrlImageView tUrlImageView3 = (TUrlImageView) view.findViewById(R.id.iv_tab_icon);
                if (tUrlImageView3 != null) {
                    tUrlImageView3.setImageUrl(jSONObject.getString("defaultPic"));
                }
                if (textView != null) {
                    textView.setTextColor(-10066330);
                }
            }
            if (i == 0 && (tUrlImageView = (TUrlImageView) view.findViewById(R.id.shop_bottom_nav_bar_tab_item_hover_flag_img)) != null) {
                tUrlImageView.setImageUrl(jSONObject.getString("superscriptDefaultPic"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) (textView == null ? null : textView.getText()));
            sb.append(" 按钮");
            view.setContentDescription(sb.toString());
        }
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
        } else if (z) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                kew.C(frameLayout);
            }
        } else {
            FrameLayout frameLayout2 = this.c;
            if (frameLayout2 != null) {
                kew.g0(frameLayout2);
            }
        }
    }

    public final void H(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8a774e", new Object[]{this, str, str2, map});
        } else {
            a1v.m(ShopConstants.PAGE_SHOP, str, s(str2, map));
        }
    }

    public final void J(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63eb637a", new Object[]{this, str, str2, map});
        } else {
            a1v.n(ShopConstants.PAGE_SHOP, str, s(str2, map));
        }
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76611d32", new Object[]{this})).intValue();
        }
        return this.u;
    }

    public final Drawable o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6e1b4cf", new Object[]{this});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(kew.v(100));
        gradientDrawable.setColor(-1);
        return gradientDrawable;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.B = false;
            u();
        } else if (i == 1) {
            this.B = true;
            this.x = this.i;
            this.y = this.j;
            JSONArray jSONArray = this.l;
            if (jSONArray != null) {
                i2 = jSONArray.size();
            }
            this.z = i2 - 1;
            this.A = this.w;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f2), new Integer(i2)});
        } else if (this.B) {
            float f3 = (i + f2) - this.A;
            if (f3 > 0.0f) {
                if (this.y == this.z) {
                    View view = this.n;
                    if (view != null) {
                        view.setX(this.h + ((this.x + f3) * this.o));
                        C();
                        v(f3);
                        return;
                    }
                    ckf.y("slide");
                    throw null;
                }
                u();
            } else if (f3 >= 0.0f) {
            } else {
                if (this.y == 0) {
                    View view2 = this.n;
                    if (view2 != null) {
                        view2.setX(this.h + ((this.x + f3) * this.o));
                        C();
                        v(f3);
                        return;
                    }
                    ckf.y("slide");
                    throw null;
                }
                u();
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        this.w = i;
        D(this.b.k(i));
    }

    public final Context p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f3309a;
    }

    public final ShopDataParser q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        return this.b;
    }

    public final g1a<Integer, xhv> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("7803a485", new Object[]{this});
        }
        return this.g;
    }

    public final HashMap<String, String> s(String str, Map<String, String> map) {
        JSONObject jSONObject;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("33c0c85c", new Object[]{this, str, map});
        }
        HashMap<String, String> l1 = this.b.l1();
        l1.put("shop_id", this.b.W0());
        l1.put("seller_id", this.b.N0());
        l1.put("identityCode", this.b.s0());
        JSONObject jSONObject2 = this.D;
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject(ckf.p("behaviorSequencePayload_", str))) == null)) {
            l1.put("behaviorSquencePayload", jSONObject.toJSONString());
            if (ckf.b(jSONObject.getString("type"), "bubbleText")) {
                str2 = "true";
            } else {
                str2 = "";
            }
            l1.put("bubble_click", str2);
        }
        if (map != null) {
            l1.putAll(map);
        }
        return l1;
    }

    public final FrameLayout t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6e1abd4e", new Object[]{this});
        }
        return this.c;
    }

    public final void v(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c118286b", new Object[]{this, new Float(f2)});
        } else if (f2 > 0.2f) {
            if (this.x < ((ArrayList) this.e).size() - 1) {
                w(this.x + 1);
            }
        } else if (f2 > 0.0f) {
            if (this.x < ((ArrayList) this.e).size() - 1) {
                F(this.x + 1);
            }
        } else if (f2 > -0.2f) {
            int i = this.x;
            if (i > 0) {
                F(i - 1);
            }
        } else {
            int i2 = this.x;
            if (i2 > 0) {
                w(i2 - 1);
            }
        }
    }

    public final void w(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49cc619b", new Object[]{this, new Integer(i)});
            return;
        }
        View view = (View) i04.d0(this.e, i);
        if (view != null) {
            String str = null;
            if (i == 0) {
                JSONArray jSONArray = this.k;
                String string = (jSONArray == null || (jSONObject3 = jSONArray.getJSONObject(i)) == null) ? null : jSONObject3.getString("superscriptSelectedPic");
                TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.shop_bottom_nav_bar_tab_item_hover_flag_img);
                if (tUrlImageView != null) {
                    tUrlImageView.setImageUrl(string);
                }
            }
            JSONArray jSONArray2 = this.k;
            str = (jSONArray2 == null || (jSONObject2 = jSONArray2.getJSONObject(i)) == null) ? null : jSONObject2.getString("selectedPic");
            if (str == null || str.length() == 0) {
                JSONArray jSONArray3 = this.k;
                if (!(jSONArray3 == null || (jSONObject = jSONArray3.getJSONObject(i)) == null)) {
                    str = jSONObject.getString("selectedPic4Darkmode");
                }
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) view.findViewById(R.id.iv_tab_icon);
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(str);
            }
            TextView textView = (TextView) view.findViewById(R.id.tv_tab_text);
            if (textView != null) {
                textView.setTextColor(-49664);
                view.setContentDescription(((Object) textView.getText()) + " 已选中 按钮");
            }
        }
    }

    public final boolean x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d10e588", new Object[]{this, jSONObject})).booleanValue();
        }
        return ckf.b(jSONObject.getString("name"), "livebar");
    }

    public final void z() {
        Tab3AnimationIcon tab3AnimationIcon;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685a8169", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.d;
        fps fpsVar = this.C;
        if (fpsVar == null) {
            tab3AnimationIcon = null;
        } else {
            tab3AnimationIcon = fpsVar.g();
        }
        frameLayout.removeView(tab3AnimationIcon);
        View view = (View) i04.d0(this.e, 2);
        if (view != null) {
            kew.g0(view);
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3469b7", new Object[]{this});
        } else if (!this.p) {
            this.p = true;
            View view = this.n;
            if (view != null) {
                bdw.c(view, 1.0f, 100L, null, 4, null).start();
            } else {
                ckf.y("slide");
                throw null;
            }
        }
    }

    public final void l(boolean z) {
        JSONObject jSONObject;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ec9bec", new Object[]{this, new Boolean(z)});
            return;
        }
        this.v = z;
        String str3 = null;
        if (z) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.setBackground(null);
            }
            LinearLayout linearLayout = this.m;
            if (linearLayout != null) {
                linearLayout.setBackgroundDrawable(this.q);
                for (View view : this.e) {
                    TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.iv_tab_icon);
                    if (tUrlImageView != null) {
                        JSONArray jSONArray = this.k;
                        if (jSONArray != null) {
                            Object tag = view.getTag();
                            if (tag != null) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(((Integer) tag).intValue());
                                if (jSONObject2 != null) {
                                    str2 = jSONObject2.getString("defaultPic4Darkmode");
                                    tUrlImageView.setImageUrl(str2);
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                            }
                        }
                        str2 = null;
                        tUrlImageView.setImageUrl(str2);
                    }
                    TextView textView = (TextView) view.findViewById(R.id.tv_tab_text);
                    if (textView != null) {
                        textView.setTextColor(-1);
                        view.setContentDescription(((Object) textView.getText()) + " 按钮");
                    }
                }
            } else {
                ckf.y("tabContainer");
                throw null;
            }
        } else {
            FrameLayout frameLayout2 = this.c;
            if (frameLayout2 != null) {
                kew.S(frameLayout2, this.s);
            }
            LinearLayout linearLayout2 = this.m;
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundDrawable(this.r);
                for (View view2 : this.e) {
                    TUrlImageView tUrlImageView2 = (TUrlImageView) view2.findViewById(R.id.iv_tab_icon);
                    if (tUrlImageView2 != null) {
                        JSONArray jSONArray2 = this.k;
                        if (jSONArray2 != null) {
                            Object tag2 = view2.getTag();
                            if (tag2 != null) {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(((Integer) tag2).intValue());
                                if (jSONObject3 != null) {
                                    str = jSONObject3.getString("defaultPic");
                                    tUrlImageView2.setImageUrl(str);
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                            }
                        }
                        str = null;
                        tUrlImageView2.setImageUrl(str);
                    }
                    TextView textView2 = (TextView) view2.findViewById(R.id.tv_tab_text);
                    if (textView2 != null) {
                        textView2.setTextColor(-10066330);
                        view2.setContentDescription(((Object) textView2.getText()) + " 按钮");
                    }
                }
            } else {
                ckf.y("tabContainer");
                throw null;
            }
        }
        TUrlImageView tUrlImageView3 = (TUrlImageView) ((View) ((ArrayList) this.e).get(0)).findViewById(R.id.shop_bottom_nav_bar_tab_item_hover_flag_img);
        if (tUrlImageView3 != null) {
            JSONArray jSONArray3 = this.k;
            if (!(jSONArray3 == null || (jSONObject = jSONArray3.getJSONObject(0)) == null)) {
                str3 = jSONObject.getString("superscriptDefaultPic");
            }
            tUrlImageView3.setImageUrl(str3);
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971f44bc", new Object[]{this});
            return;
        }
        View view = this.n;
        if (view != null) {
            if (view.getAlpha() == 1.0f) {
                View view2 = this.n;
                if (view2 != null) {
                    bdw.c(view2, 0.0f, 100L, null, 4, null).start();
                } else {
                    ckf.y("slide");
                    throw null;
                }
            }
            this.p = false;
            return;
        }
        ckf.y("slide");
        throw null;
    }

    public final void j(JSONObject jSONObject, int i) {
        String string;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870c310e", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        View K = kew.K(this.f3309a, R.layout.shop_bottom_nav_bar_tab);
        ckf.d(K);
        K.setTag(Integer.valueOf(i));
        TUrlImageView tUrlImageView = (TUrlImageView) K.findViewById(R.id.iv_tab_icon);
        TextView textView = (TextView) K.findViewById(R.id.tv_tab_text);
        if (i == 0 && (string = jSONObject.getString("superscriptDefaultPic")) != null) {
            TUrlImageView tUrlImageView2 = (TUrlImageView) K.findViewById(R.id.shop_bottom_nav_bar_tab_item_hover_flag_img);
            ckf.f(tUrlImageView2, "ivMark");
            String string2 = jSONObject.getString("superscriptPicWidth");
            if (string2 == null || (i2 = rsq.l(string2)) == null) {
                i2 = 50;
            }
            kew.g(tUrlImageView2, kew.v(i2));
            String string3 = jSONObject.getString("superscriptPicHeight");
            if (string3 == null || (i3 = rsq.l(string3)) == null) {
                i3 = 22;
            }
            kew.e(tUrlImageView2, kew.v(i3));
            tUrlImageView2.setTranslationY(kew.v(10));
            tUrlImageView2.setTranslationX(kew.v(-22));
            tUrlImageView2.setImageUrl(string);
        }
        textView.setText(jSONObject.getString("title"));
        tUrlImageView.setImageUrl(jSONObject.getString("defaultPic"));
        K.setContentDescription(((Object) textView.getText()) + " 按钮");
        if (x(jSONObject)) {
            tUrlImageView.setSkipAutoSize(true);
        }
        if (ckf.b(jSONObject.getString("displayType"), "2")) {
            textView.setVisibility(8);
            kew.g(tUrlImageView, kew.v(84));
            kew.e(tUrlImageView, kew.v(84));
        } else {
            textView.setVisibility(0);
            kew.g(tUrlImageView, kew.v(48));
            kew.e(tUrlImageView, kew.v(48));
        }
        kew.c0(textView, kew.v(20));
        LinearLayout linearLayout = this.m;
        String str = null;
        if (linearLayout != null) {
            linearLayout.addView(K);
            ((ArrayList) this.e).add(K);
            ViewGroup.LayoutParams layoutParams = K.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = 1.0f;
                layoutParams2.height = -1;
                layoutParams2.width = -1;
                JSONObject jSONObject2 = jSONObject.getJSONObject("userTrackInfo");
                if (jSONObject2 != null) {
                    str = jSONObject2.getString("expUtArg1");
                }
                K(this, str, jSONObject.getString("name"), null, 4, null);
                ViewProxy.setOnClickListener(K, new b(jSONObject2, jSONObject, i));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        ckf.y("tabContainer");
        throw null;
    }

    public final void k(ViewGroup viewGroup, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4bc85d", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        ckf.g(viewGroup, "container");
        K(this, "Page_Shop_Bottom_Bar_Root_Click_23", null, null, 6, null);
        viewGroup.setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        B(frameLayout);
        frameLayout.setBackground(this.s);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.width = -1;
            layoutParams3.height = n();
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.setLayoutParams(layoutParams3);
        } else {
            layoutParams2.width = -1;
            layoutParams2.height = n();
        }
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        this.d = frameLayout2;
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout2.setPadding(kew.v(24), 0, kew.v(24), 0);
        ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams5 = layoutParams4 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams4 : null;
        if (layoutParams5 == null) {
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams6.width = kew.v(750);
            layoutParams6.height = n();
            layoutParams6.gravity = 1;
            xhv xhvVar2 = xhv.INSTANCE;
            frameLayout2.setLayoutParams(layoutParams6);
        } else {
            layoutParams5.width = kew.v(750);
            layoutParams5.height = n();
            layoutParams5.gravity = 1;
        }
        View view = new View(frameLayout2.getContext());
        ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
            view.setLayoutParams(layoutParams7);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar3 = xhv.INSTANCE;
            view.setLayoutParams(marginLayoutParams);
        }
        kew.S(view, o());
        ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams9 = layoutParams8 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams8 : null;
        if (layoutParams9 == null) {
            FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams10.width = this.o + kew.v(40);
            layoutParams10.height = kew.v(100);
            layoutParams10.gravity = 48;
            layoutParams10.topMargin = kew.v(7);
            xhv xhvVar4 = xhv.INSTANCE;
            view.setLayoutParams(layoutParams10);
        } else {
            layoutParams9.width = this.o + kew.v(40);
            layoutParams9.height = kew.v(100);
            layoutParams9.gravity = 48;
            layoutParams9.topMargin = kew.v(7);
        }
        view.setAlpha(0.0f);
        xhv xhvVar5 = xhv.INSTANCE;
        frameLayout2.addView(view);
        this.n = view;
        LinearLayout linearLayout = new LinearLayout(frameLayout2.getContext());
        ViewGroup.LayoutParams layoutParams11 = linearLayout.getLayoutParams();
        if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout.setLayoutParams(layoutParams11);
        } else {
            linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        linearLayout.setBackgroundDrawable(this.r);
        kew.e0(linearLayout, true, kew.v(100));
        linearLayout.setElevation(kew.v(10));
        ViewGroup.LayoutParams layoutParams12 = linearLayout.getLayoutParams();
        if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams12;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = kew.v(114);
            linearLayout.setLayoutParams(layoutParams12);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams3.width = -1;
            marginLayoutParams3.height = kew.v(114);
            linearLayout.setLayoutParams(marginLayoutParams3);
        }
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(kew.v(20), 0, kew.v(20), 0);
        frameLayout2.addView(linearLayout);
        this.m = linearLayout;
        frameLayout.addView(frameLayout2);
        viewGroup.addView(frameLayout);
        JSONArray jSONArray = this.k;
        if (jSONArray != null) {
            for (Object obj : jSONArray) {
                i2++;
                if (i2 < 0) {
                    yz3.p();
                    throw null;
                } else if (obj != null) {
                    j((JSONObject) obj, i2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
            xhv xhvVar6 = xhv.INSTANCE;
        }
        m(this.b.d0());
        this.d.post(new c());
    }

    public final void m(int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dfd43f1", new Object[]{this, new Integer(i)});
            return;
        }
        View view = (View) i04.d0(this.e, i);
        if (view != null && !ckf.b(this.f, view)) {
            this.i = i;
            Object obj = this.b.p0(i).get("tabData");
            this.l = obj instanceof JSONArray ? (JSONArray) obj : null;
            JSONArray jSONArray = this.k;
            if (!(jSONArray == null || (jSONObject = jSONArray.getJSONObject(i)) == null)) {
                if (x(jSONObject)) {
                    l(true);
                } else {
                    l(false);
                }
            }
            w(i);
            this.f = view;
            this.d.post(new d());
            if (this.t) {
                this.t = false;
            } else {
                r54.E(new Shop2023BottomBarNativeComponent$changeTo$3(this), 200L);
            }
        }
    }

    public final void y(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609597a0", new Object[]{this, jSONObject});
            return;
        }
        FrameLayout.LayoutParams layoutParams = null;
        npp.Companion.f(ckf.p("tab3 ", jSONObject == null ? null : jSONObject.toJSONString()));
        if (this.i != 2 && ((View) i04.d0(this.e, 2)) != null) {
            this.D = jSONObject;
            if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("behaviorSequencePayload_livebar")) != null) {
                FrameLayout frameLayout = this.d;
                fps fpsVar = this.C;
                frameLayout.removeView(fpsVar == null ? null : fpsVar.g());
                View view = (View) i04.d0(this.e, 2);
                if (view != null) {
                    kew.g0(view);
                }
                if (ckf.b(jSONObject2.getString("type"), "heterotype")) {
                    View view2 = (View) i04.d0(this.e, 2);
                    if (view2 != null) {
                        kew.C(view2);
                    }
                    fps fpsVar2 = new fps(p(), jSONObject);
                    this.C = fpsVar2;
                    FrameLayout frameLayout2 = this.d;
                    Tab3AnimationIcon g = fpsVar2.g();
                    ViewGroup.LayoutParams layoutParams2 = g.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        g.setLayoutParams(layoutParams2);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        xhv xhvVar = xhv.INSTANCE;
                        g.setLayoutParams(marginLayoutParams);
                    }
                    g.setOnClickListener(new e());
                    ViewGroup.LayoutParams layoutParams3 = g.getLayoutParams();
                    if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                        layoutParams = (FrameLayout.LayoutParams) layoutParams3;
                    }
                    if (layoutParams == null) {
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                        g.setZ(kew.v(11));
                        layoutParams4.gravity = 1;
                        xhv xhvVar2 = xhv.INSTANCE;
                        g.setLayoutParams(layoutParams4);
                    } else {
                        g.setZ(kew.v(11));
                        layoutParams.gravity = 1;
                    }
                    g.post(new f(g, this));
                    frameLayout2.addView(g);
                }
            }
        }
    }
}
