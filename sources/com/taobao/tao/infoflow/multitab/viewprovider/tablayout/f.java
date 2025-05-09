package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.tabs.TabLayout;
import com.taobao.homepage.view.widgets.TailFadeFrameLayout;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.concurrent.ConcurrentHashMap;
import tb.b9b;
import tb.d9j;
import tb.fbz;
import tb.fuq;
import tb.i2b;
import tb.p2b;
import tb.srs;
import tb.t2o;
import tb.trs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f implements a.e, a.d, a.AbstractC0710a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f12471a;
    public View b;
    public final c c;
    public final srs d;
    public boolean e;
    public MultiTabLayout f;
    public int g = -1;
    public boolean h;
    public FrameLayout i;
    public LinearLayout j;
    public final fuq k;
    public boolean l;
    public final fbz m;
    public TailFadeFrameLayout n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MultiTabLayout f12472a;
        public final /* synthetic */ int b;

        public a(MultiTabLayout multiTabLayout, int i) {
            this.f12472a = multiTabLayout;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TabLayout.f tabAt;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (f.c(f.this) && (tabAt = this.f12472a.getTabAt(this.b)) != null) {
                tabAt.l();
            }
        }
    }

    static {
        t2o.a(729809529);
        t2o.a(729809499);
        t2o.a(729809498);
        t2o.a(729809585);
    }

    public f(srs srsVar, c cVar, fuq fuqVar, fbz fbzVar) {
        this.c = cVar;
        this.d = srsVar;
        this.k = fuqVar;
        this.m = fbzVar;
    }

    public static /* synthetic */ boolean c(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("199dde74", new Object[]{fVar})).booleanValue();
        }
        return fVar.e;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
    public void a(int i, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff5e72f", new Object[]{this, new Integer(i), jSONObject, new Boolean(z)});
        } else if (this.h) {
            this.l = true;
            q(this.f12471a, this.b, this.d, j());
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.d
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
        } else if (this.h) {
            f(i);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.e
    public void d(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a3619e", new Object[]{this, new Integer(i), jSONObject});
        }
    }

    public void e(MultiTabLayout multiTabLayout, FrameLayout frameLayout, LinearLayout linearLayout, TailFadeFrameLayout tailFadeFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe4bb5f9", new Object[]{this, multiTabLayout, frameLayout, linearLayout, tailFadeFrameLayout, new Integer(i)});
            return;
        }
        this.f = multiTabLayout;
        this.g = i;
        this.i = frameLayout;
        this.j = linearLayout;
        this.n = tailFadeFrameLayout;
        k(frameLayout);
        this.f12471a = this.c.h(multiTabLayout.getContext(), i, i, true, null).b();
        this.b = this.c.a(multiTabLayout);
        this.f12471a.setBackgroundColor(0);
        ViewProxy.setOnClickListener(this.f12471a, new a(multiTabLayout, i));
        this.h = true;
    }

    public final void f(int i) {
        View childTabView;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d76ef93", new Object[]{this, new Integer(i)});
            return;
        }
        srs.b bVar = (srs.b) ((ConcurrentHashMap) this.d.A).get(Integer.valueOf(this.g));
        if (bVar != null && bVar.k && (childTabView = this.f.getChildTabView(this.g)) != null) {
            int left = childTabView.getLeft();
            int width = childTabView.getWidth();
            int[] iArr = new int[2];
            childTabView.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int m = m();
            int i3 = left - m;
            if (i < i3 || i2 >= i3) {
                z = false;
            }
            p(z, width, m);
            o(z, m);
        }
    }

    public final void g() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387e0576", new Object[]{this});
            return;
        }
        srs.b bVar = (srs.b) ((ConcurrentHashMap) this.d.A).get(Integer.valueOf(this.g));
        if (bVar != null && bVar.k && this.f12471a != null) {
            Rect rect = new Rect();
            View childTabView = this.f.getChildTabView(this.g);
            if (childTabView != null) {
                boolean localVisibleRect = childTabView.getLocalVisibleRect(rect);
                int width = childTabView.getWidth();
                int width2 = rect.width() - width;
                if (width2 < 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = -width;
                if ((width2 < i || width2 >= i / 2) && width2 < 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int m = m();
                if (z) {
                    p(true, width, m);
                }
                if (localVisibleRect && z2) {
                    p(false, width, m);
                }
            }
        }
    }

    public final int h() {
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
        }
        TabLayout.f tabAt = this.f.getTabAt(this.g);
        if (tabAt == null || (d = tabAt.d()) == null) {
            return 0;
        }
        return d.getTop();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d910bb1", new Object[]{this});
        } else if (this.h) {
            q(this.f12471a, this.b, this.d, j());
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d4f0589", new Object[]{this})).booleanValue();
        }
        if (this.k.o() == this.g) {
            return true;
        }
        return false;
    }

    public final void k(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05208d3", new Object[]{this, frameLayout});
            return;
        }
        View view = this.f12471a;
        if (view != null) {
            frameLayout.removeView(view);
            this.f12471a = null;
        }
        View view2 = this.b;
        if (view2 != null) {
            frameLayout.removeView(view2);
            this.b = null;
        }
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec1ecb90", new Object[]{this})).intValue();
        }
        int h = this.m.h();
        if (h > 0) {
            return h + this.d.o;
        }
        return 0;
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2581970c", new Object[]{this})).intValue();
        }
        return this.m.h();
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ce6772b", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final void o(boolean z, int i) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ceaa3b", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if (this.b != null) {
            if (!j() || !this.d.m || !z) {
                this.i.removeView(this.b);
                return;
            }
            if (this.b.getParent() != null) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            int width = this.f.getChildTabView(this.g).getWidth();
            if (!b9b.f()) {
                i3 = trs.a(this.f.getContext(), this.d.o) + trs.a(this.f.getContext(), this.d.n);
            }
            if (i > 0) {
                i2 = ((width - this.f.getIndicatorConfig().b) + trs.a(this.f.getContext(), 12.0f)) / 2;
            } else {
                i2 = ((width - this.f.getIndicatorConfig().b) + i3) / 2;
            }
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 80;
                layoutParams2.leftMargin = m() + i2;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f.getIndicatorConfig().c;
            }
            this.b.setLayoutParams(layoutParams);
            this.i.addView(this.b);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.AbstractC0710a
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.AbstractC0710a
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (this.h) {
            g();
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a.AbstractC0710a
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a.d
    public void onScrollStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616aa2a8", new Object[]{this});
        }
    }

    public final void q(View view, View view2, srs srsVar, boolean z) {
        int i;
        boolean z2;
        Typeface typeface;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f4ec8f", new Object[]{this, view, view2, srsVar, new Boolean(z)});
        } else if (view != null) {
            if (view instanceof LinearLayout) {
                TextView textView = (TextView) view.findViewWithTag(c.TAG_TEXT);
                textView.setTextColor(srsVar.o(z));
                d9j.c("TabStickyView", "updateTabView isSelected:" + z);
                Context context = view.getContext();
                if (z) {
                    i = srsVar.i;
                } else {
                    i = srsVar.h;
                }
                textView.setTextSize(0, trs.a(context, i));
                srs srsVar2 = this.d;
                if (z) {
                    z2 = srsVar2.F;
                } else {
                    z2 = srsVar2.G;
                }
                if (z2) {
                    typeface = Typeface.defaultFromStyle(1);
                } else {
                    typeface = Typeface.defaultFromStyle(0);
                }
                textView.setTypeface(typeface);
            }
            if (view instanceof TUrlImageView) {
                String k = srsVar.k(this.g, z);
                if (k.endsWith("apng") || k.endsWith("gif")) {
                    TUrlImageView tUrlImageView = (TUrlImageView) view;
                    tUrlImageView.setSkipAutoSize(true);
                    tUrlImageView.setWhenNullClearImg(false);
                }
                TUrlImageView tUrlImageView2 = (TUrlImageView) view;
                p2b.q(tUrlImageView2, k, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
                tUrlImageView2.setImageUrl(k);
            }
            if (view2 != null) {
                if (!z) {
                    i2 = 8;
                }
                view2.setVisibility(i2);
                Drawable background = view2.getBackground();
                if (background instanceof GradientDrawable) {
                    ((GradientDrawable) background).setColor(srsVar.l());
                }
            }
        }
    }

    public final void p(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a880ff", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        if (this.l && this.f12471a != null) {
            int a2 = trs.a(this.f.getContext(), this.d.n);
            int a3 = trs.a(this.f.getContext(), this.d.o);
            if (b9b.f()) {
                a3 = a2;
            }
            if (i2 > 0) {
                int a4 = trs.a(this.f.getContext(), 12.0f);
                this.f12471a.setPadding(a4, h(), a4, 0);
            } else {
                this.f12471a.setPadding(a3, h(), a2, 0);
            }
            this.l = false;
        }
        if (z && !this.e) {
            d9j.c("TabStickyView", "recommendFloatView 显示: " + i2);
            if (this.f12471a.getParent() != null) {
                ((ViewGroup) this.f12471a.getParent()).removeView(this.f12471a);
            }
            int a5 = trs.a(this.f.getContext(), this.d.n);
            int a6 = trs.a(this.f.getContext(), this.d.o);
            if (b9b.f()) {
                a6 = a5;
            }
            d9j.c("TabStickyView", "recommendFloatView 显示:padding " + a5);
            if (i2 > 0) {
                int a7 = trs.a(this.f.getContext(), 12.0f);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f12471a.getLayoutParams();
                layoutParams.leftMargin = m();
                this.f12471a.setLayoutParams(layoutParams);
                this.f12471a.setPadding(a7, h(), 0, 0);
                int i3 = i + a7;
                this.n.setX(i3);
                this.n.setScrollX(i3);
            } else {
                this.f12471a.setPadding(a6, h(), a5, 0);
                this.j.setX(b9b.f() ? i : (a5 * 2) + i);
                LinearLayout linearLayout = this.j;
                if (!b9b.f()) {
                    i += a5 * 2;
                }
                linearLayout.setScrollX(i);
            }
            this.j.setLayerType(2, null);
            this.i.addView(this.f12471a);
            this.e = true;
            this.i.setLayerType(0, null);
        }
        if (!z && this.e) {
            d9j.c("TabStickyView", "recommendFloatView 隐藏: " + l());
            this.j.setLayerType(2, null);
            if (i2 > 0) {
                this.n.setX(0.0f);
                this.n.setScrollX(0);
            } else {
                this.j.setX(0.0f);
                this.j.setScrollX(0);
            }
            this.i.removeView(this.f12471a);
            this.e = false;
            this.i.setLayerType(0, null);
        }
        d9j.c("TabStickyView", "getX " + this.f.getX() + " | " + this.j.getX() + " | " + this.f.getX() + " " + this.f12471a.getWidth() + " " + this.f12471a.getPaddingLeft() + " " + this.f12471a.hashCode());
    }
}
