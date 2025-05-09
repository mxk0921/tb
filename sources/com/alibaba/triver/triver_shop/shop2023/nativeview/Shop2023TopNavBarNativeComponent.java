package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import tb.a1v;
import tb.ckf;
import tb.d1a;
import tb.i04;
import tb.kew;
import tb.onp;
import tb.pnp;
import tb.t2o;
import tb.u1a;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Shop2023TopNavBarNativeComponent implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3339a;
    public final ShopDataParser b;
    public final ViewGroup c;
    public final LinearLayout d;
    public final ShopIndicatorView e;
    public int f;
    public int g;
    public final List<View> h;
    public u1a<? super Integer, ? super Integer, xhv> i;
    public final JSONArray j;
    public final int k;
    public final int l;
    public final Drawable m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
            super(0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023TopNavBarNativeComponent$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent = Shop2023TopNavBarNativeComponent.this;
            Shop2023TopNavBarNativeComponent.c(shop2023TopNavBarNativeComponent, Shop2023TopNavBarNativeComponent.a(shop2023TopNavBarNativeComponent));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent = Shop2023TopNavBarNativeComponent.this;
            Shop2023TopNavBarNativeComponent.c(shop2023TopNavBarNativeComponent, Shop2023TopNavBarNativeComponent.a(shop2023TopNavBarNativeComponent));
        }
    }

    static {
        t2o.a(766510390);
    }

    public static final /* synthetic */ int a(Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fe87a3", new Object[]{shop2023TopNavBarNativeComponent})).intValue();
        }
        return shop2023TopNavBarNativeComponent.g;
    }

    public static final /* synthetic */ void b(Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent, float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d07d462", new Object[]{shop2023TopNavBarNativeComponent, new Float(f), new Integer(i), new Integer(i2)});
        } else {
            shop2023TopNavBarNativeComponent.m(f, i, i2);
        }
    }

    public static final /* synthetic */ void c(Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ac79e6", new Object[]{shop2023TopNavBarNativeComponent, new Integer(i)});
        } else {
            shop2023TopNavBarNativeComponent.x(i);
        }
    }

    public static /* synthetic */ void n(Shop2023TopNavBarNativeComponent shop2023TopNavBarNativeComponent, float f, int i, int i2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d636180", new Object[]{shop2023TopNavBarNativeComponent, new Float(f), new Integer(i), new Integer(i2), new Integer(i3), obj});
        } else if (obj == null) {
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            shop2023TopNavBarNativeComponent.m(f, i, i2);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveLine");
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dfd43f1", new Object[]{this, new Integer(i)});
        } else if (i <= this.h.size() - 1) {
            if (!this.r) {
                int i2 = this.g;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new pnp(i, i2, this, ofFloat));
                ofFloat.start();
            } else if (this.f >= 2) {
                x(i);
            }
            int i3 = this.g;
            if (i != i3) {
                if (i3 < this.h.size()) {
                    TextView textView = (TextView) this.h.get(this.g).findViewById(R.id.tv_name);
                    textView.setTextColor(-10066330);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setContentDescription(((Object) textView.getText()) + " 按钮");
                }
                TextView textView2 = (TextView) this.h.get(i).findViewById(R.id.tv_name);
                textView2.setTextColor(-44800);
                textView2.setTypeface(Typeface.DEFAULT_BOLD);
                textView2.setContentDescription(((Object) textView2.getText()) + " 已选中 按钮");
                this.g = i;
            }
        }
    }

    public final double f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("571cdbdb", new Object[]{this, new Float(f)})).doubleValue();
        }
        double d = 1;
        return d - Math.pow(d - f, 1.4d);
    }

    public final ViewGroup g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.c;
    }

    public final ShopDataParser h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        return this.b;
    }

    public JSONArray i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b731ee42", new Object[]{this});
        }
        return this.b.O0().j();
    }

    public final u1a<Integer, Integer, xhv> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("24493930", new Object[]{this});
        }
        return this.i;
    }

    public final float k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe7096ca", new Object[]{this, new Integer(i)})).floatValue();
        }
        View view = (View) i04.d0(this.h, i);
        if (view == null) {
            return 0.0f;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_name);
        return view.getLeft() + ((view.getWidth() - textView.getPaint().measureText(textView.getText().toString())) / 2) + this.k + (this.d.getLeft() - ((int) this.e.getTranslationX()));
    }

    public final float l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f3c482b", new Object[]{this, new Integer(i)})).floatValue();
        }
        View view = (View) i04.d0(this.h, i);
        if (view == null) {
            return 0.0f;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_name);
        return ((view.getRight() - ((view.getWidth() - textView.getPaint().measureText(textView.getText().toString())) / 2)) - this.k) + (this.d.getLeft() - ((int) this.e.getTranslationX()));
    }

    public final void m(float f, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1f734", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
        } else if (f <= 0.0f) {
            if (1 <= i && i <= this.p) {
                float k = k(i);
                float l = l(i);
                o(this.c.getLeft());
                float k2 = k(i - i2) - k;
                double d = k;
                float f2 = -f;
                this.e.setLeft((int) (d + (f(f2) * k2)));
                this.e.setRight((int) (l + (v(f2) * (l(i3) - l))));
            }
            if (i > this.p) {
                o(this.c.getLeft() - (((i - this.p) + f) * this.c.getWidth()));
            }
        } else if (i < 0 || i >= this.p) {
            o(this.c.getLeft() - (((i - this.p) + f) * this.c.getWidth()));
        } else {
            float k3 = k(i);
            float l2 = l(i);
            int i4 = i + i2;
            this.e.setLeft((int) (k3 + (v(f) * (k(i4) - k3))));
            this.e.setRight((int) (l2 + (f(f) * (l(i4) - l2))));
        }
    }

    public void o(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f09b73", new Object[]{this, new Float(f)});
        } else {
            this.c.setX(f);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.r = false;
        } else if (i == 1) {
            this.r = true;
            this.o = this.n;
            this.p = this.j.size() - 1;
            this.q = this.n;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (this.r) {
            n(this, (f + i) - this.q, this.o, 0, 4, null);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public void p(int i) {
        u1a<? super Integer, ? super Integer, xhv> u1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a487206", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.f;
        if (i2 == 1) {
            u1a<? super Integer, ? super Integer, xhv> u1aVar2 = this.i;
            if (u1aVar2 != null) {
                u1aVar2.invoke(Integer.valueOf(i2), Integer.valueOf(i - this.l));
            }
        } else if (i2 == 0 && (u1aVar = this.i) != null) {
            u1aVar.invoke(Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    public final void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639902d7", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6ffd1f", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.c.setBackgroundDrawable(this.m);
        } else if (this.f != 0) {
            this.c.setBackgroundDrawable(this.m);
        } else if (this.s || this.t) {
            this.c.setBackgroundColor(-1);
        } else {
            this.c.setBackgroundDrawable(this.m);
        }
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d74a66", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9bbc6b9", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public final void u(u1a<? super Integer, ? super Integer, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2cd971c", new Object[]{this, u1aVar});
        } else {
            this.i = u1aVar;
        }
    }

    public final double v(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aee8e340", new Object[]{this, new Float(f)})).doubleValue();
        }
        return Math.pow(f, 1.4d);
    }

    public void w(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335dd7c9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i < 2) {
            if (i == 1) {
                e(i2 + this.l);
            } else {
                e(i2);
            }
        }
        if (i <= 1) {
            o(this.c.getLeft());
        } else {
            o(this.c.getLeft() - this.c.getWidth());
        }
        this.f = i;
    }

    public final void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f96a3d6", new Object[]{this, new Integer(i)});
            return;
        }
        this.e.setLeft((int) k(i));
        this.e.setRight((int) l(i));
    }

    public final void d(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870c310e", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        a1v.s(this.b, jSONObject.getString("utArg1"), null, 2, null);
        View K = kew.K(this.f3339a, R.layout.shop_top_nav_bar_tab);
        ckf.d(K);
        TextView textView = (TextView) K.findViewById(R.id.tv_name);
        View findViewById = K.findViewById(R.id.dot);
        ckf.f(textView, "tvName");
        kew.c0(textView, kew.v(32));
        ckf.f(findViewById, "dot");
        kew.f(findViewById, kew.v(12), kew.v(12));
        textView.setText(jSONObject.getString("title"));
        textView.setContentDescription(((Object) textView.getText()) + " 按钮");
        if (i == this.g) {
            textView.setTextColor(-44800);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setContentDescription(((Object) textView.getText()) + " 已选中 按钮");
        }
        this.d.addView(K);
        ((ArrayList) this.h).add(K);
        if (this.j.size() > 4) {
            kew.g(K, kew.v(118));
        } else {
            kew.g(K, kew.v(130));
        }
        ViewProxy.setOnClickListener(K, new onp(this, jSONObject, i));
    }

    public Shop2023TopNavBarNativeComponent(Context context, ShopDataParser shopDataParser, int i) {
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        this.f3339a = context;
        this.b = shopDataParser;
        View K = kew.K(context, R.layout.shop_top_nar_bar_layout);
        if (K != null) {
            ViewGroup viewGroup = (ViewGroup) K;
            this.c = viewGroup;
            this.d = (LinearLayout) viewGroup.findViewById(R.id.ll_tab_container);
            ShopIndicatorView shopIndicatorView = (ShopIndicatorView) viewGroup.findViewById(R.id.indicator);
            this.e = shopIndicatorView;
            this.f = shopDataParser.d0();
            this.h = new ArrayList();
            this.k = kew.v(6);
            this.m = kew.u(-1, null, null, 0, kew.v(30), kew.v(30), 0, 0, 0, 0, 974, null);
            ckf.f(shopIndicatorView, WXBasicComponentType.INDICATOR);
            kew.f(shopIndicatorView, kew.v(50), kew.v(4));
            kew.e0(shopIndicatorView, true, kew.v(4));
            kew.d0(shopIndicatorView, (i / 2) + kew.v(26));
            shopIndicatorView.setOnLayoutListener(new AnonymousClass1());
            JSONArray i2 = i();
            this.j = i2;
            Iterator<Object> it = i2.iterator();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                JSONArray jSONArray = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    i4++;
                    if (i4 < 0) {
                        yz3.p();
                        throw null;
                    } else if (next != null) {
                        d((JSONObject) next, i4);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                    }
                } else {
                    Object obj = this.b.p0(0).get("tabData");
                    jSONArray = obj instanceof JSONArray ? (JSONArray) obj : jSONArray;
                    this.l = jSONArray != null ? jSONArray.size() : i3;
                    this.c.post(new a());
                    this.p = this.j.size() - 1;
                    return;
                }
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }
}
