package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.b9b;
import tb.d9j;
import tb.dqz;
import tb.f4b;
import tb.fuq;
import tb.i2b;
import tb.maj;
import tb.p2b;
import tb.r5a;
import tb.srs;
import tb.t2o;
import tb.trs;
import tb.vaj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final srs f12473a;
    public final com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c b;
    public final fuq c;
    public final Map<Integer, String> d = new HashMap();
    public final Map<Integer, View> e = new HashMap();
    public final Map<Integer, String> f = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MultiTabLayout f12474a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map c;

        public a(MultiTabLayout multiTabLayout, int i, Map map) {
            this.f12474a = multiTabLayout;
            this.b = i;
            this.c = map;
        }

        public void a(FrameLayout frameLayout, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0583015", new Object[]{this, frameLayout, new Integer(i)});
            } else {
                g.a(g.this, frameLayout, i, this.f12474a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MultiTabLayout f12475a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Map d;

        public b(MultiTabLayout multiTabLayout, int i, int i2, Map map) {
            this.f12475a = multiTabLayout;
            this.b = i;
            this.c = i2;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d9j.c("TabViewProvider", "gif切换");
            dqz h = g.b(g.this).h(this.f12475a.getContext(), this.b, this.c, false, null);
            String a2 = h.a();
            if (!TextUtils.isEmpty(a2) && !a2.endsWith("apng") && !a2.endsWith("gif")) {
                g.c(g.this, this.b, this.f12475a, h, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12476a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ dqz e;
        public final /* synthetic */ Map f;

        public c(View view, View view2, View view3, int i, dqz dqzVar, Map map) {
            this.f12476a = view;
            this.b = view2;
            this.c = view3;
            this.d = i;
            this.e = dqzVar;
            this.f = map;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/TabViewProvider$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            ((ViewGroup) this.b).removeView(this.c);
            this.b.requestLayout();
            g.d(g.this, this.d, this.b, this.e.a());
            JSONObject s = g.e(g.this).s(this.d);
            if (s != null) {
                s.put("isTracked", (Object) Boolean.FALSE);
                vaj.b(s, vaj.I(this.f, g.this.j(this.e.b()), g.this.m(this.e.b()), this.e.a()));
                r5a.l(s);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
                return;
            }
            super.onAnimationStart(animator, z);
            this.f12476a.setVisibility(0);
        }
    }

    static {
        t2o.a(729809532);
    }

    public g(srs srsVar, com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c cVar, fuq fuqVar) {
        this.f12473a = srsVar;
        this.b = cVar;
        this.c = fuqVar;
    }

    public static /* synthetic */ void a(g gVar, View view, int i, MultiTabLayout multiTabLayout, int i2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3884cbdb", new Object[]{gVar, view, new Integer(i), multiTabLayout, new Integer(i2), map});
        } else {
            gVar.p(view, i, multiTabLayout, i2, map);
        }
    }

    public static /* synthetic */ com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c) ipChange.ipc$dispatch("b2257985", new Object[]{gVar});
        }
        return gVar.b;
    }

    public static /* synthetic */ void c(g gVar, int i, MultiTabLayout multiTabLayout, dqz dqzVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f948653f", new Object[]{gVar, new Integer(i), multiTabLayout, dqzVar, map});
        } else {
            gVar.o(i, multiTabLayout, dqzVar, map);
        }
    }

    public static /* synthetic */ void d(g gVar, int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cef33e", new Object[]{gVar, new Integer(i), view, str});
        } else {
            gVar.h(i, view, str);
        }
    }

    public static /* synthetic */ fuq e(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuq) ipChange.ipc$dispatch("cef73104", new Object[]{gVar});
        }
        return gVar.c;
    }

    public final void f(int i, FrameLayout frameLayout) {
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5639264d", new Object[]{this, new Integer(i), frameLayout});
            return;
        }
        String c2 = this.f12473a.c(i);
        if (!TextUtils.isEmpty(c2)) {
            d9j.c("TabViewProvider", "addBubbleView");
            int a2 = trs.a(frameLayout.getContext(), this.f12473a.n);
            TUrlImageView tUrlImageView = new TUrlImageView(frameLayout.getContext());
            if (!TextUtils.isEmpty(c2)) {
                ((HashMap) this.d).put(Integer.valueOf(i), c2);
                if (c2.endsWith("apng") || c2.endsWith("gif")) {
                    tUrlImageView.setSkipAutoSize(true);
                    tUrlImageView.setWhenNullClearImg(false);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                if (b9b.h()) {
                    i2 = 8388629;
                } else {
                    i2 = BadgeDrawable.TOP_END;
                }
                layoutParams.gravity = i2;
                layoutParams.height = trs.a(frameLayout.getContext(), 17.0f);
                int a3 = trs.a(frameLayout.getContext(), 26.0f);
                if (!b9b.h()) {
                    i4 = a2;
                }
                layoutParams.width = i4 + a3;
                if (b9b.h()) {
                    i3 = (a2 * 2) - a3;
                } else {
                    i3 = (-a2) / 2;
                }
                layoutParams.rightMargin = i3;
                tUrlImageView.setImageUrl(c2);
                tUrlImageView.setLayoutParams(layoutParams);
                tUrlImageView.bringToFront();
                tUrlImageView.setTag(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.BUBBLE_TAG);
                frameLayout.addView(tUrlImageView);
            }
        }
    }

    public View g(MultiTabLayout multiTabLayout, int i, int i2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ea076e54", new Object[]{this, multiTabLayout, new Integer(i), new Integer(i2), map});
        }
        dqz h = this.b.h(multiTabLayout.getContext(), i, i2, false, new a(multiTabLayout, i2, map));
        View b2 = h.b();
        h(i, h.b(), h.a());
        if (b2 instanceof FrameLayout) {
            f(i, (FrameLayout) b2);
        }
        h(i, h.b(), h.a());
        return b2;
    }

    public final void h(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f641b438", new Object[]{this, new Integer(i), view, str});
        } else if (((srs.b) ((ConcurrentHashMap) this.f12473a.A).get(Integer.valueOf(i))) != null) {
            ((HashMap) this.f).put(Integer.valueOf(i), str);
            ((HashMap) this.e).put(Integer.valueOf(i), view);
        }
    }

    public View i(int i, boolean z) {
        Map<Integer, srs.b> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("164effa8", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        if (!f4b.b("enableTabViewOptimize", true)) {
            n(i);
            return null;
        }
        View view = (View) ((HashMap) this.e).get(Integer.valueOf(i));
        if (view == null) {
            n(i);
            return null;
        }
        String str = (String) ((HashMap) this.f).get(Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            n(i);
            return null;
        }
        srs srsVar = this.f12473a;
        if (srsVar == null || (map = srsVar.A) == null) {
            n(i);
            return null;
        }
        srs.b bVar = (srs.b) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
        if (bVar == null) {
            n(i);
            return null;
        }
        boolean equals = TextUtils.equals(this.f12473a.c(i), (CharSequence) ((HashMap) this.d).get(Integer.valueOf(i)));
        String k = this.f12473a.k(i, z);
        if (TextUtils.isEmpty(k)) {
            k = bVar.f28239a;
        }
        if (!TextUtils.equals(k, str)) {
            n(i);
            return null;
        } else if ((j(view) instanceof TUrlImageView) && equals) {
            return view;
        } else {
            if ((j(view) instanceof LinearLayout) && equals) {
                return view;
            }
            n(i);
            return null;
        }
    }

    public View j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5fc12549", new Object[]{this, view});
        }
        if (!(view instanceof FrameLayout)) {
            return view;
        }
        View findViewWithTag = view.findViewWithTag(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.TAB_TAG);
        return ((findViewWithTag instanceof TUrlImageView) || (findViewWithTag instanceof LinearLayout)) ? findViewWithTag : view;
    }

    public String k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5abd2b16", new Object[]{this, new Integer(i)});
        }
        return (String) ((HashMap) this.f).get(Integer.valueOf(i));
    }

    public final void l(View view) {
        View findViewWithTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beeeeb58", new Object[]{this, view});
        } else if ((view instanceof FrameLayout) && (findViewWithTag = view.findViewWithTag(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.BUBBLE_TAG)) != null) {
            findViewWithTag.setVisibility(8);
        }
    }

    public boolean m(View view) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ef925f7", new Object[]{this, view})).booleanValue();
        }
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null || viewGroup.findViewWithTag(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.BUBBLE_TAG) == null) {
            return false;
        }
        return true;
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7436446b", new Object[]{this, new Integer(i)});
            return;
        }
        ((HashMap) this.e).remove(Integer.valueOf(i));
        ((HashMap) this.f).remove(Integer.valueOf(i));
    }

    public final void p(View view, int i, MultiTabLayout multiTabLayout, int i2, Map<String, String> map) {
        srs.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6832048", new Object[]{this, view, new Integer(i), multiTabLayout, new Integer(i2), map});
            return;
        }
        View j = j(view);
        if ((j instanceof TUrlImageView) && (bVar = (srs.b) ((ConcurrentHashMap) this.f12473a.A).get(Integer.valueOf(i))) != null && bVar.p != 0) {
            String k = k(i);
            if (!TextUtils.isEmpty(k)) {
                if (k.endsWith("apng") || k.endsWith("gif")) {
                    boolean localVisibleRect = j.getLocalVisibleRect(new Rect());
                    long j2 = bVar.p;
                    if (!localVisibleRect) {
                        j2 += 300;
                    }
                    int i3 = (int) j2;
                    d9j.c("TabViewProvider", "展示gif transformTabView:" + i3);
                    multiTabLayout.postDelayed(new b(multiTabLayout, i, i2, map), bVar.p);
                }
            }
        }
    }

    public void q(View view, int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865a9c4a", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        View j = j(view);
        if (j != null && ((srs.b) ((ConcurrentHashMap) this.f12473a.A).get(Integer.valueOf(i))) != null) {
            if (i2 != i) {
                z = false;
            }
            t(j, i);
            r(j, i, z);
            w(j, i, z);
        }
    }

    public final void t(View view, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df326bcb", new Object[]{this, view, new Integer(i)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        int a2 = trs.a(view.getContext(), this.f12473a.n);
        int a3 = trs.a(view.getContext(), this.f12473a.o);
        if (i == 0) {
            i2 = a3;
        }
        layoutParams.leftMargin = i2;
        layoutParams.gravity = 8388627;
        layoutParams.rightMargin = a2 * 2;
        view.setLayoutParams(layoutParams);
    }

    public void u(int i, MultiTabLayout multiTabLayout) {
        TabLayout.f tabAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d53c84", new Object[]{this, new Integer(i), multiTabLayout});
        } else if (!TextUtils.isEmpty(this.f12473a.c(i))) {
            String t = this.c.t(i);
            if (!TextUtils.isEmpty(t) && (tabAt = multiTabLayout.getTabAt(i)) != null) {
                View d = tabAt.d();
                if (d instanceof FrameLayout) {
                    l(d);
                    this.f12473a.A(t);
                }
            }
        }
    }

    public void v(View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740638ab", new Object[]{this, view, new Integer(i), new Boolean(z)});
            return;
        }
        View j = j(view);
        if (j != null) {
            r(j, i, z);
            w(j, i, z);
        }
    }

    public final void r(View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7c1665", new Object[]{this, view, new Integer(i), new Boolean(z)});
        } else if (view instanceof TUrlImageView) {
            TUrlImageView tUrlImageView = (TUrlImageView) view;
            String k = this.f12473a.k(i, z);
            if (!TextUtils.isEmpty(k)) {
                if (k.endsWith("apng") || k.endsWith("gif")) {
                    tUrlImageView.setSkipAutoSize(true);
                    tUrlImageView.setWhenNullClearImg(false);
                }
                if (!maj.c(maj.TAB_IMAGE + i, k)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                    int a2 = trs.a(view.getContext(), this.f12473a.k);
                    layoutParams.width = (int) (a2 * this.f12473a.i(i, z));
                    layoutParams.height = a2;
                    tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    p2b.q(tUrlImageView, k, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
                    this.f12473a.B(k);
                    tUrlImageView.setImageUrl(k);
                }
            }
        }
    }

    public final void s(TUrlImageView tUrlImageView, int i, boolean z) {
        float f;
        int i2;
        int i3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1d3d53", new Object[]{this, tUrlImageView, new Integer(i), new Boolean(z)});
            return;
        }
        srs.b bVar = (srs.b) ((ConcurrentHashMap) this.f12473a.A).get(Integer.valueOf(i));
        if (bVar != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tUrlImageView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-2, -2);
            }
            boolean equals = TextUtils.equals(bVar.u, "right");
            Context context = tUrlImageView.getContext();
            if (z) {
                f = bVar.A * 24.0f;
            } else {
                f = bVar.v * 21.0f;
            }
            int a2 = trs.a(context, f);
            if (z) {
                i2 = trs.a(tUrlImageView.getContext(), 24.0f);
            } else {
                i2 = trs.a(tUrlImageView.getContext(), 21.0f);
            }
            layoutParams.leftMargin = equals ? 2 : 0;
            if (equals) {
                i3 = 0;
            }
            layoutParams.rightMargin = i3;
            layoutParams.gravity = 16;
            layoutParams.width = a2;
            layoutParams.height = i2;
            tUrlImageView.setLayoutParams(layoutParams);
            LinearLayout linearLayout = (LinearLayout) tUrlImageView.getParent();
            linearLayout.removeView(tUrlImageView);
            if (equals) {
                linearLayout.addView(tUrlImageView);
            } else {
                linearLayout.addView(tUrlImageView, 0);
            }
        }
    }

    public final void w(View view, int i, boolean z) {
        int i2;
        boolean z2;
        Typeface typeface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58111b46", new Object[]{this, view, new Integer(i), new Boolean(z)});
        } else if (view instanceof LinearLayout) {
            TextView textView = (TextView) view.findViewWithTag(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.TAG_TEXT);
            int o = this.f12473a.o(z);
            if (!maj.b(maj.TAB_TEXT_COLOR + i, o)) {
                textView.setTextColor(o);
            }
            srs srsVar = this.f12473a;
            if (z) {
                i2 = srsVar.i;
            } else {
                i2 = srsVar.h;
            }
            if (!maj.b(maj.TAB_TEXT_SIZE + i, i2)) {
                textView.setTextSize(0, trs.a(view.getContext(), i2));
                srs srsVar2 = this.f12473a;
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
            String y = this.f12473a.y(i, z);
            TUrlImageView tUrlImageView = (TUrlImageView) view.findViewWithTag(com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.TAG_LABEL);
            if (tUrlImageView != null) {
                tUrlImageView.setVisibility(TextUtils.isEmpty(y) ? 8 : 0);
                if (!TextUtils.isEmpty(y)) {
                    if (y.endsWith("apng") || y.endsWith("gif")) {
                        tUrlImageView.setSkipAutoSize(true);
                        tUrlImageView.setWhenNullClearImg(false);
                    }
                    tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    tUrlImageView.setImageUrl(y);
                    s(tUrlImageView, i, z);
                }
            }
        }
    }

    public final void o(int i, MultiTabLayout multiTabLayout, dqz dqzVar, Map<String, String> map) {
        View d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341d3946", new Object[]{this, new Integer(i), multiTabLayout, dqzVar, map});
            return;
        }
        TabLayout.f tabAt = multiTabLayout.getTabAt(i);
        if (tabAt != null && (d = tabAt.d()) != null && d.getAnimation() == null) {
            View j = j(d);
            if (j instanceof TUrlImageView) {
                dqzVar.b().setVisibility(8);
                AnimatorSet animatorSet = new AnimatorSet();
                int height = d.getHeight() / 4;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j, "translationY", 0.0f, -height);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(500L);
                ofFloat2.setDuration(500L);
                animatorSet.playTogether(ofFloat, ofFloat2);
                View b2 = dqzVar.b();
                ((ViewGroup) d).addView(b2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                b2.setAlpha(0.0f);
                float f = height;
                b2.setTranslationY(f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b2, "translationY", f, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(b2, "alpha", 0.0f, 1.0f);
                ofFloat3.setDuration(500L);
                ofFloat4.setDuration(500L);
                animatorSet2.playTogether(ofFloat3, ofFloat4);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(animatorSet, animatorSet2);
                animatorSet2.addListener(new c(b2, d, j, i, dqzVar, map));
                animatorSet3.start();
            }
        }
    }
}
