package tb;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.extension.dianmicX.AutoScrollTextView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderInfoTemplate;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class inp implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String A;
    public View B;
    public int C;
    public View D;
    public View E;
    public View F;
    public final cyo G;
    public final sop H;
    public final sop I;
    public Shop2023TopNavBarNativeComponent J;
    public d1a<xhv> K;
    public g1a<? super Boolean, xhv> L;
    public final View M;
    public final View N;
    public int O;
    public boolean P;
    public int Q;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21461a;
    public final ShopDataParser b;
    public final ShopComponentModel c;
    public final TUrlImageView d;
    public final FrameLayout e;
    public final TUrlImageView f;
    public final TUrlImageView g;
    public final ImageView h;
    public final TUrlImageView i;
    public final TUrlImageView j;
    public final TUrlImageView k;
    public final TUrlImageView l;
    public final AutoScrollTextView m;
    public final FrameLayout n;
    public final TextView o;
    public final LinearLayout p;
    public final LinearLayout q;
    public final FrameLayout r;
    public final List<View> s = new ArrayList();
    public boolean t;
    public final boolean u;
    public boolean v;
    public boolean w;
    public Boolean x;
    public boolean y;
    public final boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            inp inpVar = inp.this;
            int i = this.b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                inpVar.G(i - ((Integer) animatedValue).intValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public c(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (inp.this.v()) {
                inp inpVar = inp.this;
                inp.e(inpVar, inpVar.t());
                inp.f(inp.this, true ^ this.b);
                inp.g(inp.this);
            } else {
                inp.this.G(0);
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
            inp inpVar = inp.this;
            inpVar.G(inpVar.t());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            } else if (inp.a(inp.this).getWidth() != 0) {
                inp inpVar = inp.this;
                inp.e(inpVar, inp.b(inpVar));
                inp.a(inp.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            inp inpVar = inp.this;
            inp.e(inpVar, inpVar.t());
        }
    }

    static {
        t2o.a(766510361);
    }

    public static /* synthetic */ void X(inp inpVar, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341af95e", new Object[]{inpVar, str, map, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 2) != 0) {
                map = null;
            }
            inpVar.W(str, map);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: utNativeShopClick");
        }
    }

    public static /* synthetic */ void Z(inp inpVar, String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4ae7b2", new Object[]{inpVar, str, map, new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 2) != 0) {
                map = null;
            }
            inpVar.Y(str, map);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: utNativeShopExpose");
        }
    }

    public static final /* synthetic */ TUrlImageView a(inp inpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9c84efdf", new Object[]{inpVar});
        }
        return inpVar.i;
    }

    public static final /* synthetic */ int b(inp inpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20185d5c", new Object[]{inpVar})).intValue();
        }
        return inpVar.Q;
    }

    public static final /* synthetic */ ShopComponentModel c(inp inpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopComponentModel) ipChange.ipc$dispatch("90578c9c", new Object[]{inpVar});
        }
        return inpVar.c;
    }

    public static final /* synthetic */ boolean d(inp inpVar, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5df3b3a0", new Object[]{inpVar, motionEvent})).booleanValue();
        }
        return inpVar.E(motionEvent);
    }

    public static final /* synthetic */ void e(inp inpVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f9dc74", new Object[]{inpVar, new Integer(i)});
        } else {
            inpVar.H(i);
        }
    }

    public static final /* synthetic */ void f(inp inpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d19044", new Object[]{inpVar, new Boolean(z)});
        } else {
            inpVar.P = z;
        }
    }

    public static final /* synthetic */ void g(inp inpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca5a453", new Object[]{inpVar});
        } else {
            inpVar.U();
        }
    }

    public static final /* synthetic */ void h(inp inpVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8215901e", new Object[]{inpVar, str, map});
        } else {
            inpVar.W(str, map);
        }
    }

    public final Shop2023TopNavBarNativeComponent A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shop2023TopNavBarNativeComponent) ipChange.ipc$dispatch("9d3159de", new Object[]{this});
        }
        return this.J;
    }

    public final HashMap<String, String> B(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("719e0466", new Object[]{this, map});
        }
        HashMap<String, String> l1 = this.b.l1();
        l1.put("shop_id", this.b.W0());
        l1.put("seller_id", this.b.N0());
        l1.put("identityCode", this.b.s0());
        l1.put("industryShop", this.b.u0());
        if (!this.t) {
            str = Shop2023HeaderInfoTemplate.HeaderStyle.OTHER_PAGE.getStyleName();
        } else if (this.P) {
            str = Shop2023HeaderInfoTemplate.HeaderStyle.INDEX_PAGE_FOLDED.getStyleName();
        } else {
            str = Shop2023HeaderInfoTemplate.HeaderStyle.DEFAULT.getStyleName();
        }
        l1.put("currentStyle", str);
        l1.put("identityCode", this.b.s0());
        if (map != null) {
            l1.putAll(map);
        }
        return l1;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        K();
        U();
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        r(this.H);
        kew.d0(this.d, kew.v(12));
        kew.d0(this.q, kew.v(12));
        kew.X(this.d, kew.P(12));
        kew.g(this.d, kew.P(54));
        kew.e(this.d, kew.P(54));
        kew.f(this.k, kew.v(54), kew.v(54));
        kew.f(this.l, kew.v(54), kew.v(54));
        this.e.setPivotX(0.0f);
        this.e.setPivotY(0.0f);
        this.n.setPivotX(0.0f);
        this.n.setPivotY(0.0f);
        this.p.setPivotX(0.0f);
        this.p.setPivotY(0.0f);
        kew.e(this.i, kew.P(20));
        kew.e(this.j, kew.P(20));
        this.m.getTextView().setTypeface(Typeface.DEFAULT_BOLD);
        kew.g(this.m, this.H.j() * 13);
        this.n.setOnClickListener(this);
        ViewProxy.setOnClickListener(this.N, this);
        kew.d0(this.N, kew.P(66));
        this.e.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.o.setOnClickListener(this);
        ViewProxy.setOnTouchListener(this.N, new e());
    }

    public final boolean E(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae14ff66", new Object[]{this, motionEvent})).booleanValue();
        }
        if (new Rect((int) this.n.getX(), (int) this.n.getY(), ((int) this.n.getX()) + ((int) (this.m.getTextView().getPaint().measureText(this.m.getTextView().getText().toString()) * r54.I(Float.valueOf(this.I.k()), Integer.valueOf(this.H.k())))), ((int) this.p.getY()) + this.p.getHeight()).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return false;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3493fdd1", new Object[]{this})).booleanValue();
        }
        if (!this.t || !this.u) {
            return false;
        }
        return true;
    }

    public final void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd9fe2b", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            if (i == 0) {
                this.P = false;
                U();
                Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent = this.J;
                if (shop2023TopNavBarNativeComponent != null) {
                    shop2023TopNavBarNativeComponent.r(false);
                }
            } else if (i == this.C) {
                this.P = true;
                U();
                Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent2 = this.J;
                if (shop2023TopNavBarNativeComponent2 != null) {
                    shop2023TopNavBarNativeComponent2.r(true);
                }
            }
            if (r54.I(Float.valueOf(Math.abs(i)), Integer.valueOf(this.C)) >= 0.15d) {
                Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent3 = this.J;
                if (shop2023TopNavBarNativeComponent3 != null) {
                    shop2023TopNavBarNativeComponent3.r(true);
                }
            } else {
                Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent4 = this.J;
                if (shop2023TopNavBarNativeComponent4 != null) {
                    shop2023TopNavBarNativeComponent4.r(false);
                }
            }
            if (!F() || i >= this.C) {
                H(i);
            }
        }
    }

    public final void H(int i) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        LinearLayout linearLayout;
        FrameLayout frameLayout5;
        FrameLayout frameLayout6;
        TUrlImageView tUrlImageView;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e0d66e", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.O == -1 && (view = this.E) != null) {
            ckf.d(view);
            this.O = (int) view.getY();
        }
        int i2 = this.C;
        if (i2 == 0) {
            npp.Companion.f("contentMaxMoveUpDistance=0");
        } else if (i <= i2) {
            this.Q = i;
            float I = r54.I(Float.valueOf(Math.abs(i)), Integer.valueOf(this.C));
            float I2 = r54.I(Float.valueOf(this.I.c()), Integer.valueOf(this.H.c()));
            float f2 = 1;
            float f3 = f2 - I;
            float f4 = I2 + ((f2 - I2) * f3);
            float e2 = (this.H.e() - this.I.e()) * 0.85f;
            float f5 = I * e2;
            this.e.setY(frameLayout.getTop() - f5);
            this.e.setX(frameLayout2.getLeft() + (kew.v(45) * I));
            this.e.setScaleX(f4);
            this.e.setScaleY(f4);
            int f6 = this.H.f() - this.I.f();
            float I3 = r54.I(Float.valueOf(this.I.k()), Integer.valueOf(this.H.k()));
            float f7 = I3 + ((f2 - I3) * f3);
            this.n.setScaleX(f7);
            this.n.setScaleY(f7);
            float f8 = f6;
            this.n.setX((frameLayout3.getLeft() - ((I * f8) * 1.3f)) + (kew.v(45) * I));
            this.n.setY(frameLayout4.getTop() - (((0.25f * f8) + (1.06f * e2)) * I));
            if (I()) {
                this.i.scrollTo((int) (tUrlImageView.getWidth() * I), 0);
                this.i.setAlpha(f3);
            }
            this.p.setX(this.n.getX());
            this.p.setY(linearLayout.getTop() - (((0.95f * e2) + f8) * I));
            int childCount = this.p.getChildCount();
            if (1 < childCount) {
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    View childAt = this.p.getChildAt(i3);
                    if (I()) {
                        childAt.setTranslationX((-I) * this.i.getWidth());
                    }
                    if (i3 >= 3) {
                        childAt.setAlpha(f2 - (2 * I));
                    }
                    if (i4 >= childCount) {
                        break;
                    }
                    i3 = i4;
                }
            }
            this.r.setY(frameLayout5.getTop() - (f5 * 1.05f));
            this.r.setX(frameLayout6.getLeft() - (kew.v(Integer.valueOf((int) SecExceptionCode.SEC_ERROR_INIT_CLAZZ_NULL_ERROR)) * I));
            View view2 = this.E;
            if (view2 != null) {
                view2.setY(this.O - ((f8 + e2) * I));
            }
            View view3 = this.F;
            if (view3 != null) {
                view3.setAlpha(f2 - (2 * I));
            }
            this.k.setAlpha((3 * I) - 2);
            if (I < 0.1f) {
                View view4 = this.D;
                if (view4 != null) {
                    view4.setZ(1.0f);
                }
                kew.e(this.N, -1);
                kew.d0(this.N, kew.P(66));
                this.k.setClickable(false);
            } else if (I > 0.9f) {
                View view5 = this.D;
                if (view5 != null) {
                    view5.setZ(0.0f);
                }
                kew.e(this.N, this.I.o());
                kew.d0(this.N, 0);
                this.k.setClickable(true);
            }
            this.G.d(i - this.C);
            this.G.b();
        }
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15712091", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4270502e", new Object[]{this, new Integer(i)});
        } else {
            this.C = i;
        }
    }

    public final void L(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341d31bf", new Object[]{this, view});
        } else {
            this.E = view;
        }
    }

    public final void M(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3097930", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public final void N(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa004752", new Object[]{this, d1aVar});
        } else {
            this.K = d1aVar;
        }
    }

    public final void O(g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfae66d", new Object[]{this, g1aVar});
        } else {
            this.L = g1aVar;
        }
    }

    public final void P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81660337", new Object[]{this, new Integer(i)});
        }
    }

    public final void Q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1db17dd", new Object[]{this, view});
        } else {
            this.F = view;
        }
    }

    public final void R(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8d2a67", new Object[]{this, view});
        } else {
            this.D = view;
        }
    }

    public final void S(Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f88ba32", new Object[]{this, shop2023TopNavBarNativeComponent});
        } else {
            this.J = shop2023TopNavBarNativeComponent;
        }
    }

    public final void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
        } else if (z) {
            kew.C(this.e);
            kew.C(this.n);
            kew.C(this.p);
            View view = this.B;
            if (view != null) {
                kew.C(view);
            }
            kew.C(this.k);
            kew.C(this.N);
        } else {
            kew.g0(this.e);
            kew.g0(this.n);
            kew.g0(this.p);
            View view2 = this.B;
            if (view2 != null) {
                kew.g0(view2);
            }
            kew.g0(this.k);
            kew.g0(this.N);
        }
    }

    public final void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
            return;
        }
        this.v = z;
        if (z) {
            kew.g0(this.f);
        } else {
            kew.C(this.f);
        }
    }

    public final void W(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3531cd18", new Object[]{this, str, map});
        } else {
            a1v.m(ShopConstants.PAGE_SHOP, str, B(map));
        }
    }

    public final void Y(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b063ac44", new Object[]{this, str, map});
        } else {
            a1v.n(ShopConstants.PAGE_SHOP, str, B(map));
        }
    }

    public final void k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ada548", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new b(i));
        ofInt.start();
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("267ca589", new Object[]{this, new Boolean(z)});
        } else if (this.y) {
            G(this.C);
        }
    }

    public final void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b86354", new Object[]{this, new Boolean(z)});
            return;
        }
        this.t = true;
        AutoScrollTextView autoScrollTextView = this.m;
        autoScrollTextView.setRight(autoScrollTextView.getLeft() + (this.H.j() * 13));
        o();
        Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent = this.J;
        if (shop2023TopNavBarNativeComponent != null) {
            shop2023TopNavBarNativeComponent.r(true ^ z);
        }
        if (z) {
            this.M.post(new c(z));
        } else {
            this.M.post(new d());
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7e6a3b", new Object[]{this});
            return;
        }
        this.t = false;
        o();
        G(this.C);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fdd17d", new Object[]{this});
            return;
        }
        this.m.stopScroll();
        this.m.startScroll();
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5272f04", new Object[]{this});
            return;
        }
        Activity activity = (Activity) this.f21461a;
        ShopDataParser shopDataParser = this.b;
        ShopMoreUtils.INSTANCE.w(activity, shopDataParser, shopDataParser.P(), this.b.R(), null, null, null);
        if (!this.b.H1()) {
            brp.g(this.b);
        }
        X(this, "Page_Shop_Page_Shop_Button-More", null, 2, null);
    }

    public final void r(sop sopVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6236b60f", new Object[]{this, sopVar});
            return;
        }
        kew.e0(this.g, true, kew.P(12));
        kew.X(this.n, sopVar.i());
        kew.X(this.p, sopVar.i());
        kew.U(this.p, sopVar.m());
        kew.b0(this.q, kew.v(18));
        kew.b0(this.r, sopVar.a());
        this.o.setTextSize(0, sopVar.n());
        kew.X(this.k, kew.P(20));
        kew.X(this.l, kew.P(20));
        if (this.A.length() <= 10) {
            this.m.getTextView().setTextSize(0, sopVar.k());
        } else {
            this.m.getTextView().setTextSize(0, sopVar.j());
        }
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ecb6cc", new Object[]{this, new Boolean(z)});
            return;
        }
        this.w = z;
        U();
    }

    public final int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddf0ee5c", new Object[]{this})).intValue();
        }
        return this.C;
    }

    public final Context u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f21461a;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50cf6b7", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public final TUrlImageView w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9923a62b", new Object[]{this});
        }
        return this.d;
    }

    public final TUrlImageView x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("32514bfd", new Object[]{this});
        }
        return this.l;
    }

    public final sop y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sop) ipChange.ipc$dispatch("42103519", new Object[]{this});
        }
        return this.I;
    }

    public final View z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.M;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() != 0 || !inp.this.F() || !inp.d(inp.this, motionEvent)) {
                return false;
            }
            JSONObject data = inp.c(inp.this).getData();
            khu.h(inp.this.u(), data == null ? null : data.getString("introUrl"));
            return true;
        }
    }

    public final void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8762e7", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        this.B = view;
        this.r.addView(view, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ckf.g(view, "v");
        int id = view.getId();
        String str = null;
        if (id == R.id.clickView) {
            if (!this.u || !this.t || this.P) {
                JSONObject data = this.c.getData();
                if (data != null) {
                    str = data.getString("introUrl");
                }
                khu.h(this.f21461a, str);
                return;
            }
            d1a<xhv> d1aVar = this.K;
            if (d1aVar != null) {
                d1aVar.invoke();
            }
        } else if (id == R.id.fl_head) {
            X(this, "Page_Shop_ShopLogo", null, 2, null);
            if (!this.v || this.y) {
                JSONObject data2 = this.c.getData();
                if (data2 != null) {
                    str = data2.getString("introUrl");
                }
                khu.h(this.f21461a, str);
                return;
            }
            d1a<xhv> d1aVar2 = this.K;
            if (d1aVar2 != null) {
                d1aVar2.invoke();
            }
        } else {
            int i = R.id.fl_shop_name;
            if (id == i || id == R.id.iv_biz || id == R.id.iv_rank || id == R.id.tv_fans) {
                JSONObject data3 = this.c.getData();
                khu.h(this.f21461a, data3 == null ? null : data3.getString("introUrl"));
                if (view.getId() == i) {
                    X(this, "Page_Shop_ShopName", null, 2, null);
                }
            } else if (id == R.id.iv_search) {
                JSONObject data4 = this.c.getData();
                khu.h(this.f21461a, data4 == null ? null : data4.getString("searchUrl"));
                brp.i(this.b);
                X(this, "Page_Shop_Search-Input", null, 2, null);
            } else if (id == R.id.iv_more) {
                q();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21462a;
        public final /* synthetic */ inp b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(String str, inp inpVar, String str2, String str3) {
            this.f21462a = str;
            this.b = inpVar;
            this.c = str2;
            this.d = str3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String str = this.f21462a;
            if (str == null || str.length() == 0) {
                JSONObject data = inp.c(this.b).getData();
                khu.h(this.b.u(), data == null ? null : data.getString("introUrl"));
            } else {
                khu.h(this.b.u(), this.f21462a);
            }
            inp.h(this.b, "Page_Shop_FeatureType", kotlin.collections.a.k(jpu.a("featureTypeName", this.c), jpu.a("utArgs", this.d)));
        }
    }

    public final void K() {
        JSONObject jSONObject;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1232db3", new Object[]{this});
            return;
        }
        JSONObject data = this.c.getData();
        String string = data == null ? null : data.getString("logoActivityPicUrl");
        JSONObject data2 = this.c.getData();
        String string2 = data2 == null ? null : data2.getString("shopLogo");
        JSONObject data3 = this.c.getData();
        String string3 = data3 == null ? null : data3.getString("rankImageUrl");
        JSONObject data4 = this.c.getData();
        String string4 = data4 == null ? null : data4.getString("bizLogoUrl");
        JSONObject data5 = this.c.getData();
        JSONArray jSONArray = data5 == null ? null : data5.getJSONArray("tagList");
        JSONObject data6 = this.c.getData();
        String p = (data6 == null || (jSONObject = data6.getJSONObject("relation")) == null) ? null : ckf.p(jSONObject.getString("fansNumStr"), jSONObject.getString("fansDes"));
        FrameLayout frameLayout = this.n;
        frameLayout.setContentDescription(this.A + ' ' + ((Object) p));
        if (!(string4 == null || string4.length() == 0)) {
            kew.g0(this.i);
            this.i.setImageUrl(string4);
            this.i.getViewTreeObserver().addOnGlobalLayoutListener(new f());
        }
        ((ArrayList) this.s).clear();
        if (jSONArray != null) {
            for (Object obj : jSONArray) {
                i++;
                if (i < 0) {
                    yz3.p();
                    throw null;
                } else if (obj != null) {
                    j((JSONObject) obj, i);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
        }
        this.g.setImageUrl(string2);
        this.j.setImageUrl(string3);
        this.m.getTextView().setText(this.A);
        o();
        this.o.setText(p);
        int g2 = (this.H.g() - this.H.c()) / 2;
        kew.d0(this.n, ((int) (this.H.l() * 0.9f)) + g2);
        kew.d0(this.r, this.H.l());
        kew.X(this.e, (this.H.d() - g2) + kew.v(10));
        kew.d0(this.e, this.H.e() - g2);
        kew.g(this.e, this.H.h());
        kew.e(this.e, this.H.g());
        kew.g(this.g, this.H.f());
        kew.e(this.g, this.H.c());
        kew.g(this.h, this.H.f() - kew.v(2));
        kew.e(this.h, this.H.c() - kew.v(2));
        kew.e0(this.g, true, kew.P(16));
        kew.e0(this.h, true, kew.P(16));
        kew.U(this.p, this.H.m() + g2);
        kew.X(this.n, this.H.d() - g2);
        kew.X(this.p, this.H.d() - g2);
        if (this.v || (string != null && !wsq.a0(string))) {
            this.f.setSkipAutoSize(true);
            if (this.v) {
                this.f.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01wwaSbJ1Z02x2IdXJB_!!6000000003131-54-tps-200-200.apng");
                kew.b0(this.p, this.H.b());
            } else {
                this.f.setImageUrl(string);
            }
        }
        if (F()) {
            this.M.post(new g());
        }
    }

    public final void U() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ddfdc99", new Object[]{this});
            return;
        }
        if (this.y || this.w || this.z || (this.t && !this.P && this.u)) {
            z = true;
        }
        Context context = this.f21461a;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            khu.a(fragmentActivity, true ^ z);
        }
        if (!ckf.b(this.x, Boolean.valueOf(z))) {
            this.x = Boolean.valueOf(z);
            if (z) {
                this.m.getTextView().setTextColor(-1);
                this.o.setTextColor(-1);
                for (View view : this.s) {
                    Object tag = view.getTag();
                    if (tag != null) {
                        ((TextView) tag).setTextColor(-1);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                }
                this.d.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01veFzJg1GGYWcBCdcm_!!6000000000595-2-tps-108-108.png");
                this.k.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN0190h4nA1n8f2Ld4Pk8_!!6000000005045-2-tps-216-216.png");
                this.l.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN012O9nk4293Y92xO8cN_!!6000000008012-2-tps-108-108.png");
            } else {
                this.m.getTextView().setTextColor(-15658735);
                this.o.setTextColor(-10066330);
                for (View view2 : this.s) {
                    Object tag2 = view2.getTag();
                    if (tag2 != null) {
                        ((TextView) tag2).setTextColor(-10066330);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                }
                this.d.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN013dzdLg1MxVMViYez0_!!6000000001501-2-tps-108-108.png");
                this.k.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01Zv2KPX1o1cZBkUuMW_!!6000000005165-2-tps-216-216.png");
                this.l.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01ObPozU1ErXGtZezPP_!!6000000000405-2-tps-108-108.png");
            }
            g1a<? super Boolean, xhv> g1aVar = this.L;
            if (g1aVar != null) {
                g1aVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    public final void j(JSONObject jSONObject, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74110553", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        View K = kew.K(this.f21461a, R.layout.item_tag);
        ckf.d(K);
        String string = jSONObject.getString("icon");
        String string2 = jSONObject.getString("text");
        String string3 = jSONObject.getString("url");
        String string4 = jSONObject.getString("utArgs");
        TUrlImageView tUrlImageView = (TUrlImageView) K.findViewById(R.id.iv_icon);
        TextView textView = (TextView) K.findViewById(R.id.tv_tag);
        K.setImportantForAccessibility(2);
        tUrlImageView.setImportantForAccessibility(2);
        textView.setImportantForAccessibility(2);
        textView.setSingleLine();
        kew.e(tUrlImageView, kew.P(20));
        tUrlImageView.setAdjustViewBounds(true);
        if (string != null && !wsq.a0(string)) {
            kew.b0(tUrlImageView, kew.v(6));
        }
        if (this.z) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(-10066330);
        }
        textView.setTextSize(0, kew.P(20));
        ViewProxy.setOnClickListener(K, new a(string3, this, string2, string4));
        Y("Page_Shop_FeatureType", kotlin.collections.a.k(jpu.a("featureTypeName", string2), jpu.a("utArgs", string4)));
        tUrlImageView.setImageUrl(string);
        textView.setText(string2);
        ViewGroup.LayoutParams layoutParams = K.findViewById(R.id.divider).getLayoutParams();
        if (i != 0) {
            i2 = kew.P(2);
        }
        layoutParams.width = i2;
        layoutParams.height = kew.P(14);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = kew.P(6);
        layoutParams2.rightMargin = kew.P(6);
        K.setTag(textView);
        this.p.addView(K);
        ((ArrayList) this.s).add(K);
    }

    public inp(Context context, ShopDataParser shopDataParser, int i) {
        int i2;
        int i3;
        String string;
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        this.f21461a = context;
        this.b = shopDataParser;
        boolean z = true;
        this.t = shopDataParser.d0() == 0;
        this.u = (!shopDataParser.O0().p() || khu.e()) ? false : z;
        this.v = shopDataParser.V1();
        JSONObject o0 = shopDataParser.o0();
        this.z = tsq.y(o0 == null ? null : o0.getString("renderStyle"), ThemeUtils.COLOR_SCHEME_DARK, false, 2, null);
        this.G = new cyo(0);
        sop sopVar = new sop(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
        this.H = sopVar;
        sop sopVar2 = new sop(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
        sop sopVar3 = new sop(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
        this.I = sopVar3;
        View K = kew.K(context, R.layout.shop_header_info_layout);
        ckf.d(K);
        this.M = K;
        View findViewById = K.findViewById(R.id.clickView);
        ckf.f(findViewById, "rootView.findViewById(R.id.clickView)");
        this.N = findViewById;
        Map<String, ShopComponentModel> m = shopDataParser.O0().m();
        ckf.d(m);
        ShopComponentModel shopComponentModel = m.get("tb_shop_header_shop_info_2023_native");
        ckf.d(shopComponentModel);
        ShopComponentModel shopComponentModel2 = shopComponentModel;
        this.c = shopComponentModel2;
        JSONObject data = shopComponentModel2.getData();
        String str = "";
        if (!(data == null || (string = data.getString("shopName")) == null)) {
            str = string;
        }
        this.A = str;
        JSONObject extData = shopComponentModel2.getExtData();
        sopVar.p(extData == null ? null : extData.getJSONObject("defaultStyleConfig"));
        sopVar.F(kew.P(Integer.valueOf(shopComponentModel2.getRenderHeight())));
        JSONObject extData2 = shopComponentModel2.getExtData();
        sopVar2.p(extData2 == null ? null : extData2.getJSONObject("foldStyleConfig"));
        JSONObject extData3 = shopComponentModel2.getExtData();
        Integer valueOf = extData3 == null ? null : Integer.valueOf(extData3.getIntValue("indexPageHeaderFoldedStyleHeight"));
        Integer valueOf2 = valueOf == null ? null : Integer.valueOf(kew.P(valueOf));
        if (valueOf2 == null) {
            i2 = (int) (shopComponentModel2.getRenderHeight() * 0.75f);
        } else {
            i2 = valueOf2.intValue();
        }
        sopVar2.F(i2);
        JSONObject extData4 = shopComponentModel2.getExtData();
        sopVar3.p(extData4 == null ? null : extData4.getJSONObject("otherPageStyleConfig"));
        JSONObject extData5 = shopComponentModel2.getExtData();
        Integer valueOf3 = extData5 == null ? null : Integer.valueOf(kew.P(Integer.valueOf(extData5.getIntValue("otherPageHeaderStyleHeight"))));
        if (valueOf3 == null) {
            i3 = (int) (shopComponentModel2.getRenderHeight() * 0.75f);
        } else {
            i3 = valueOf3.intValue();
        }
        sopVar3.F(i3);
        Z(this, "Page_Shop_Impression_Pi_Widget_Show", null, 2, null);
        Z(this, "Page_Shop_ShopLogo", null, 2, null);
        Z(this, "Page_Shop_ShopName", null, 2, null);
        Z(this, "Page_Shop_Page_Shop_Button-More", null, 2, null);
        View findViewById2 = K.findViewById(R.id.iv_back);
        ckf.f(findViewById2, "rootView.findViewById(R.id.iv_back)");
        this.d = (TUrlImageView) findViewById2;
        View findViewById3 = K.findViewById(R.id.fl_head);
        ckf.f(findViewById3, "rootView.findViewById(R.id.fl_head)");
        this.e = (FrameLayout) findViewById3;
        View findViewById4 = K.findViewById(R.id.iv_state);
        ckf.f(findViewById4, "rootView.findViewById(R.id.iv_state)");
        this.f = (TUrlImageView) findViewById4;
        View findViewById5 = K.findViewById(R.id.iv_logo);
        ckf.f(findViewById5, "rootView.findViewById(R.id.iv_logo)");
        this.g = (TUrlImageView) findViewById5;
        View findViewById6 = K.findViewById(R.id.iv_logo_bg);
        ckf.f(findViewById6, "rootView.findViewById(R.id.iv_logo_bg)");
        this.h = (ImageView) findViewById6;
        View findViewById7 = K.findViewById(R.id.iv_biz);
        ckf.f(findViewById7, "rootView.findViewById(R.id.iv_biz)");
        this.i = (TUrlImageView) findViewById7;
        View findViewById8 = K.findViewById(R.id.iv_rank);
        ckf.f(findViewById8, "rootView.findViewById(R.id.iv_rank)");
        this.j = (TUrlImageView) findViewById8;
        View findViewById9 = K.findViewById(R.id.iv_search);
        ckf.f(findViewById9, "rootView.findViewById(R.id.iv_search)");
        this.k = (TUrlImageView) findViewById9;
        View findViewById10 = K.findViewById(R.id.iv_more);
        ckf.f(findViewById10, "rootView.findViewById(R.id.iv_more)");
        this.l = (TUrlImageView) findViewById10;
        View findViewById11 = K.findViewById(R.id.tv_shop_name);
        ckf.f(findViewById11, "rootView.findViewById(R.id.tv_shop_name)");
        this.m = (AutoScrollTextView) findViewById11;
        View findViewById12 = K.findViewById(R.id.fl_shop_name);
        ckf.f(findViewById12, "rootView.findViewById(R.id.fl_shop_name)");
        this.n = (FrameLayout) findViewById12;
        View findViewById13 = K.findViewById(R.id.tv_fans);
        ckf.f(findViewById13, "rootView.findViewById(R.id.tv_fans)");
        this.o = (TextView) findViewById13;
        View findViewById14 = K.findViewById(R.id.ll_shop_info);
        ckf.f(findViewById14, "rootView.findViewById(R.id.ll_shop_info)");
        this.p = (LinearLayout) findViewById14;
        View findViewById15 = K.findViewById(R.id.ll_right);
        ckf.f(findViewById15, "rootView.findViewById(R.id.ll_right)");
        this.q = (LinearLayout) findViewById15;
        View findViewById16 = K.findViewById(R.id.fl_follow_button);
        ckf.f(findViewById16, "rootView.findViewById(R.id.fl_follow_button)");
        this.r = (FrameLayout) findViewById16;
        D();
        this.O = -1;
    }
}
