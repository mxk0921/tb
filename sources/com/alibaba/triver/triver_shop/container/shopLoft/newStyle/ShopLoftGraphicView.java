package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftGraphicView;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.aqp;
import tb.brf;
import tb.ckf;
import tb.kew;
import tb.khu;
import tb.npp;
import tb.r54;
import tb.rg0;
import tb.s0m;
import tb.ssq;
import tb.t2o;
import tb.wh6;
import tb.why;
import tb.xhv;
import tb.xpd;
import tb.yf2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftGraphicView extends ShopLoftViewNewStyleBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GraphicViewPager q;
    public a r;
    public ShopLoftGraphicWebView s;
    public JSONArray t;
    public boolean u;
    public final boolean v = aqp.Companion.g0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class GraphicViewPager extends ViewPager {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean alreadyDetect;
        private float startX;
        private float startY;
        private double swipeThreshold;

        static {
            t2o.a(766509246);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GraphicViewPager(Context context) {
            super(context);
            ckf.g(context, "context");
            this.swipeThreshold = ViewConfiguration.get(context).getScaledTouchSlop() * 1.5d;
        }

        private final RecyclerView findRecyclerView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView) ipChange.ipc$dispatch("d44d670b", new Object[]{this});
            }
            return kew.q(this);
        }

        public static /* synthetic */ Object ipc$super(GraphicViewPager graphicViewPager, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftGraphicView$GraphicViewPager");
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.startX = 0.0f;
                this.startY = 0.0f;
                this.alreadyDetect = false;
                RecyclerView findRecyclerView = findRecyclerView();
                if (findRecyclerView != null) {
                    findRecyclerView.requestDisallowInterceptTouchEvent(false);
                }
            }
            if (motionEvent.getAction() == 0) {
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
                RecyclerView findRecyclerView2 = findRecyclerView();
                if (findRecyclerView2 != null) {
                    findRecyclerView2.requestDisallowInterceptTouchEvent(true);
                }
                super.dispatchTouchEvent(motionEvent);
                return true;
            }
            if (motionEvent.getAction() == 2 && !this.alreadyDetect) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float abs = Math.abs(this.startX - x);
                float abs2 = Math.abs(this.startY - y);
                double d = 2;
                if (((float) Math.sqrt(((float) Math.pow(abs, d)) + ((float) Math.pow(abs2, d)))) >= this.swipeThreshold) {
                    if (abs2 <= abs) {
                        RecyclerView findRecyclerView3 = findRecyclerView();
                        if (findRecyclerView3 != null) {
                            findRecyclerView3.requestDisallowInterceptTouchEvent(true);
                        }
                    } else {
                        RecyclerView findRecyclerView4 = findRecyclerView();
                        if (findRecyclerView4 != null) {
                            findRecyclerView4.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    this.alreadyDetect = true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public final boolean getAlreadyDetect() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f13b2770", new Object[]{this})).booleanValue();
            }
            return this.alreadyDetect;
        }

        public final float getStartX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue();
            }
            return this.startX;
        }

        public final float getStartY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue();
            }
            return this.startY;
        }

        public final double getSwipeThreshold() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5f169c3c", new Object[]{this})).doubleValue();
            }
            return this.swipeThreshold;
        }

        public final void setAlreadyDetect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd55faf4", new Object[]{this, new Boolean(z)});
            } else {
                this.alreadyDetect = z;
            }
        }

        public final void setStartX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58c17e1", new Object[]{this, new Float(f)});
            } else {
                this.startX = f;
            }
        }

        public final void setStartY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
            } else {
                this.startY = f;
            }
        }

        public final void setSwipeThreshold(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2020d24", new Object[]{this, new Double(d)});
            } else {
                this.swipeThreshold = d;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class PicAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopLoftGraphicView f3019a;

        static {
            t2o.a(766509248);
        }

        public PicAdapter(ShopLoftGraphicView shopLoftGraphicView) {
            ckf.g(shopLoftGraphicView, "this$0");
            this.f3019a = shopLoftGraphicView;
        }

        public static /* synthetic */ Object ipc$super(PicAdapter picAdapter, String str, Object... objArr) {
            if (str.hashCode() == 50642664) {
                return new Integer(super.getItemPosition(objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftGraphicView$PicAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else if ((obj instanceof View) && viewGroup != null) {
                viewGroup.removeView((View) obj);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            JSONArray S = ShopLoftGraphicView.S(this.f3019a);
            if (S != null) {
                return S.size();
            }
            ckf.y("picList");
            throw null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            ShopLoftGraphicView shopLoftGraphicView = this.f3019a;
            PicPagerItemView picPagerItemView = new PicPagerItemView(shopLoftGraphicView, shopLoftGraphicView.m());
            picPagerItemView.init();
            JSONArray S = ShopLoftGraphicView.S(this.f3019a);
            if (S != null) {
                JSONObject jSONObject = S.getJSONObject(i);
                ckf.f(jSONObject, "picList.getJSONObject(position)");
                picPagerItemView.renderWithData(jSONObject);
                if (viewGroup != null) {
                    kew.a(viewGroup, picPagerItemView);
                }
                return picPagerItemView;
            }
            ckf.y("picList");
            throw null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            if (view == obj) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class ShopLoftGraphicWebView extends ShopWrapWebView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private GraphicViewPager graphicViewPager;

        static {
            t2o.a(766509252);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShopLoftGraphicWebView(Context context) {
            super(context);
            ckf.g(context, "context");
        }

        public static /* synthetic */ Object ipc$super(ShopLoftGraphicWebView shopLoftGraphicWebView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1253202540) {
                return new Boolean(super.coreDispatchTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode == 143825882) {
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftGraphicView$ShopLoftGraphicWebView");
        }

        @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
        public boolean coreDispatchTouchEvent(MotionEvent motionEvent) {
            RecyclerView q;
            RecyclerView q2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b54da594", new Object[]{this, motionEvent})).booleanValue();
            }
            ckf.g(motionEvent, "event");
            if (kew.E(motionEvent) && (q2 = kew.q(this)) != null) {
                q2.requestDisallowInterceptTouchEvent(true);
            }
            if ((kew.G(motionEvent) || kew.D(motionEvent)) && (q = kew.q(this)) != null) {
                q.requestDisallowInterceptTouchEvent(false);
            }
            return super.coreDispatchTouchEvent(motionEvent);
        }

        @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView, android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
        public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            RecyclerView q;
            RecyclerView q2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
            }
            if ((i3 == 0 && i < 0) || (i3 == i5 && i > 0)) {
                return false;
            }
            if (i4 == 0 && i2 <= 0 && (q2 = kew.q(this)) != null) {
                q2.requestDisallowInterceptTouchEvent(false);
            }
            if (i4 == i6 && i2 > 0 && (q = kew.q(this)) != null) {
                q.requestDisallowInterceptTouchEvent(false);
            }
            return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }

        public final GraphicViewPager getGraphicViewPager() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GraphicViewPager) ipChange.ipc$dispatch("62103964", new Object[]{this});
            }
            return this.graphicViewPager;
        }

        public final void setGraphicViewPager(GraphicViewPager graphicViewPager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2e6bda2", new Object[]{this, graphicViewPager});
            } else {
                this.graphicViewPager = graphicViewPager;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f3022a = kew.p(Double.valueOf(2.5d));
        public final int b = kew.p(Double.valueOf(1.5d));
        public final int c = Color.parseColor("#4cFFFFFF");
        public final int d = Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
        public final int e;
        public final LinearLayout f;
        public final TextView g;
        public final ArrayList<View> h;
        public int i;

        static {
            t2o.a(766509247);
        }

        public final LinearLayout a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LinearLayout) ipChange.ipc$dispatch("cb7d1941", new Object[]{this});
            }
            return this.f;
        }

        public final TextView b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("be421236", new Object[]{this});
            }
            return this.g;
        }

        public final void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd2f7773", new Object[]{this, new Integer(i)});
                return;
            }
            Iterator<View> it = this.h.iterator();
            while (it.hasNext()) {
                it.next().setBackgroundColor(this.c);
            }
            if (i < this.h.size()) {
                this.h.get(i).setBackgroundColor(this.d);
                this.i = i;
                d();
            }
        }

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc1f9317", new Object[]{this});
            } else if (this.h.size() == 1) {
                kew.B(this.g);
            } else {
                kew.g0(this.g);
                StringBuilder sb = new StringBuilder();
                sb.append(this.i + 1);
                sb.append(wh6.DIR);
                sb.append(this.e);
                this.g.setText(sb.toString());
            }
        }

        public a(ShopLoftGraphicView shopLoftGraphicView) {
            ckf.g(shopLoftGraphicView, "this$0");
            JSONArray S = ShopLoftGraphicView.S(shopLoftGraphicView);
            if (S != null) {
                int size = S.size();
                this.e = size;
                LinearLayout linearLayout = new LinearLayout(shopLoftGraphicView.m());
                linearLayout.setClickable(false);
                xhv xhvVar = xhv.INSTANCE;
                this.f = linearLayout;
                TextView textView = new TextView(shopLoftGraphicView.m());
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(kew.p(12));
                gradientDrawable.setColor(Color.parseColor("#2a242424"));
                kew.S(textView, gradientDrawable);
                textView.setTextColor(Color.parseColor("#f9f9f9"));
                textView.setTextSize(1, 13.5f);
                textView.setGravity(17);
                this.g = textView;
                this.h = new ArrayList<>();
                if (size > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, this.b, 1.0f);
                        View view = new View(this.f.getContext());
                        view.setLayoutParams(layoutParams);
                        kew.X(view, this.f3022a);
                        kew.b0(view, this.f3022a);
                        view.setClickable(false);
                        if (i == 0) {
                            view.setBackgroundColor(this.d);
                        } else {
                            view.setBackgroundColor(this.c);
                        }
                        this.h.add(view);
                        this.f.addView(view);
                        if (i2 >= size) {
                            break;
                        }
                        i = i2;
                    }
                }
                if (this.e == 1) {
                    kew.B(this.f);
                }
                c(0);
                return;
            }
            ckf.y("picList");
            throw null;
        }
    }

    static {
        t2o.a(766509245);
    }

    public static final /* synthetic */ void P(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de5cdab", new Object[]{shopLoftGraphicView});
        } else {
            shopLoftGraphicView.U();
        }
    }

    public static final /* synthetic */ boolean Q(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("832915d4", new Object[]{shopLoftGraphicView})).booleanValue();
        }
        return shopLoftGraphicView.v;
    }

    public static final /* synthetic */ a R(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("af2b3d25", new Object[]{shopLoftGraphicView});
        }
        return shopLoftGraphicView.r;
    }

    public static final /* synthetic */ JSONArray S(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7b814b24", new Object[]{shopLoftGraphicView});
        }
        return shopLoftGraphicView.t;
    }

    public static final /* synthetic */ boolean T(ShopLoftGraphicView shopLoftGraphicView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("946b2a8c", new Object[]{shopLoftGraphicView})).booleanValue();
        }
        return shopLoftGraphicView.u;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftGraphicView shopLoftGraphicView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 50486379:
                super.didDisappear();
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1100907343:
                super.initWithData((Context) objArr[0], (JSONObject) objArr[1], (xpd.c) objArr[2], (xpd.a) objArr[3]);
                return null;
            case 1580371323:
                super.didAppear();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftGraphicView");
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9233479a", new Object[]{this});
            return;
        }
        this.q = new GraphicViewPager(m());
        PicAdapter picAdapter = new PicAdapter(this);
        GraphicViewPager graphicViewPager = this.q;
        if (graphicViewPager != null) {
            graphicViewPager.setAdapter(picAdapter);
            FrameLayout l = l();
            GraphicViewPager graphicViewPager2 = this.q;
            if (graphicViewPager2 != null) {
                kew.a(l, graphicViewPager2);
                this.r = new a(this);
                FrameLayout l2 = l();
                a aVar = this.r;
                if (aVar != null) {
                    l2.addView(aVar.a(), new FrameLayout.LayoutParams(-1, -2, 80));
                    FrameLayout l3 = l();
                    a aVar2 = this.r;
                    if (aVar2 != null) {
                        l3.addView(aVar2.b(), new FrameLayout.LayoutParams(kew.p(40), kew.p(24), BadgeDrawable.TOP_END));
                        a aVar3 = this.r;
                        if (aVar3 != null) {
                            kew.d0(aVar3.b(), x() + kew.p(9));
                            a aVar4 = this.r;
                            if (aVar4 != null) {
                                kew.b0(aVar4.b(), kew.p(9));
                                ShopLoftGraphicWebView shopLoftGraphicWebView = this.s;
                                if (shopLoftGraphicWebView != null) {
                                    GraphicViewPager graphicViewPager3 = this.q;
                                    if (graphicViewPager3 != null) {
                                        shopLoftGraphicWebView.setGraphicViewPager(graphicViewPager3);
                                    } else {
                                        ckf.y(OrderConfigs.VIEWPAGER);
                                        throw null;
                                    }
                                }
                                GraphicViewPager graphicViewPager4 = this.q;
                                if (graphicViewPager4 != null) {
                                    graphicViewPager4.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftGraphicView$initPager$1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                                        public void onPageScrollStateChanged(int i) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                                            }
                                        }

                                        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                                        public void onPageScrolled(int i, float f, int i2) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                                            }
                                        }

                                        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                                        public void onPageSelected(int i) {
                                            IpChange ipChange2 = $ipChange;
                                            if (ipChange2 instanceof IpChange) {
                                                ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                                                return;
                                            }
                                            ShopLoftGraphicView.a R = ShopLoftGraphicView.R(ShopLoftGraphicView.this);
                                            if (R != null) {
                                                R.c(i);
                                            } else {
                                                ckf.y("indicatorComponent");
                                                throw null;
                                            }
                                        }
                                    });
                                } else {
                                    ckf.y(OrderConfigs.VIEWPAGER);
                                    throw null;
                                }
                            } else {
                                ckf.y("indicatorComponent");
                                throw null;
                            }
                        } else {
                            ckf.y("indicatorComponent");
                            throw null;
                        }
                    } else {
                        ckf.y("indicatorComponent");
                        throw null;
                    }
                } else {
                    ckf.y("indicatorComponent");
                    throw null;
                }
            } else {
                ckf.y(OrderConfigs.VIEWPAGER);
                throw null;
            }
        } else {
            ckf.y(OrderConfigs.VIEWPAGER);
            throw null;
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189c6912", new Object[]{this});
            return;
        }
        GraphicViewPager graphicViewPager = this.q;
        if (graphicViewPager != null) {
            if (graphicViewPager != null) {
                graphicViewPager.postDelayed(new Runnable() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftGraphicView.b
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ShopLoftGraphicView.P(ShopLoftGraphicView.this);
                        }
                    }
                }, Constants.STARTUP_TIME_LEVEL_1);
            } else {
                ckf.y(OrderConfigs.VIEWPAGER);
                throw null;
            }
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d677dc", new Object[]{this});
        } else if (!i()) {
            W();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        super.didAppear();
        play();
        X();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        super.didDisappear();
        pause();
    }

    @Override // tb.xpd
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void initWithData(Context context, JSONObject jSONObject, xpd.c cVar, xpd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419e834f", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        super.initWithData(context, jSONObject, cVar, aVar);
        JSONArray jSONArray = jSONObject == null ? null : jSONObject.getJSONArray("picList");
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        this.t = jSONArray;
        if (jSONArray.size() == 0) {
            npp.Companion.b("picList size is 0");
            return;
        }
        this.u = khu.e();
        V();
        C();
    }

    @Override // tb.xpd
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else {
            super.onActivityPause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView, tb.xpd
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else {
            super.onActivityResume();
        }
    }

    @Override // tb.xpd
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // tb.xpd
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftViewNewStyleBaseView
    public ShopWrapWebView z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("913f6b8e", new Object[]{this});
        }
        if (this.s == null) {
            ShopLoftGraphicWebView shopLoftGraphicWebView = new ShopLoftGraphicWebView(m());
            this.s = shopLoftGraphicWebView;
            M(shopLoftGraphicWebView);
        }
        ShopLoftGraphicWebView shopLoftGraphicWebView2 = this.s;
        ckf.d(shopLoftGraphicWebView2);
        return shopLoftGraphicWebView2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class PicPagerItemView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ImageView backgroundImageView;
        private final TUrlImageView contentView;
        private final boolean enableRenderEffectBlur;
        private final FrameLayout imageContainer;
        public final /* synthetic */ ShopLoftGraphicView this$0;
        private boolean useSystemBlur;
        private final String lowDeviceGuessPicUrl = "https://gw.alicdn.com/imgextra/i2/O1CN01xenXqr1O62GkoCtKn_!!6000000001655-2-tps-750-1334.png";
        private float imageRatio = 1.7777778f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ float f3020a;
            public final /* synthetic */ Ref$IntRef b;
            public final /* synthetic */ Ref$ObjectRef<ViewGroup> c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;
            public final /* synthetic */ LinearLayout f;
            public final /* synthetic */ float g;
            public final /* synthetic */ int h;
            public final /* synthetic */ Ref$ObjectRef<ViewGroup> i;
            public final /* synthetic */ Ref$BooleanRef j;
            public final /* synthetic */ Ref$ObjectRef<ViewGroup> k;

            public a(float f, Ref$IntRef ref$IntRef, Ref$ObjectRef<ViewGroup> ref$ObjectRef, int i, int i2, LinearLayout linearLayout, float f2, int i3, Ref$ObjectRef<ViewGroup> ref$ObjectRef2, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<ViewGroup> ref$ObjectRef3) {
                this.f3020a = f;
                this.b = ref$IntRef;
                this.c = ref$ObjectRef;
                this.d = i;
                this.e = i2;
                this.f = linearLayout;
                this.g = f2;
                this.h = i3;
                this.i = ref$ObjectRef2;
                this.j = ref$BooleanRef;
                this.k = ref$ObjectRef3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                float f = this.f3020a;
                ViewGroup.LayoutParams layoutParams = null;
                if (f < 32.0f) {
                    this.b.element = kew.v(56);
                    ViewGroup viewGroup = this.c.element;
                    ViewGroup.LayoutParams layoutParams2 = viewGroup == null ? null : viewGroup.getLayoutParams();
                    if (layoutParams2 != null) {
                        ((FrameLayout.LayoutParams) layoutParams2).leftMargin = this.d;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                } else if (f < 50.0f) {
                    int i = (int) (this.e * 0.32d);
                    if (this.f.getWidth() >= i) {
                        this.b.element = this.d - this.f.getWidth();
                    } else {
                        this.b.element = (this.d - this.f.getWidth()) - ((i - this.f.getWidth()) / 2);
                        ViewGroup viewGroup2 = this.c.element;
                        ViewGroup.LayoutParams layoutParams3 = viewGroup2 == null ? null : viewGroup2.getLayoutParams();
                        if (layoutParams3 != null) {
                            ((FrameLayout.LayoutParams) layoutParams3).leftMargin = (i - this.f.getWidth()) / 2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    }
                } else if (f < 68.0f) {
                    int i2 = this.e;
                    int i3 = (int) (i2 * 0.32d);
                    int i4 = i2 - this.d;
                    if (this.f.getWidth() >= i3) {
                        this.b.element = i4 - this.f.getWidth();
                    } else {
                        this.b.element = (i4 - this.f.getWidth()) - ((i3 - this.f.getWidth()) / 2);
                    }
                    ViewGroup viewGroup3 = this.c.element;
                    ViewGroup.LayoutParams layoutParams4 = viewGroup3 == null ? null : viewGroup3.getLayoutParams();
                    if (layoutParams4 != null) {
                        ((FrameLayout.LayoutParams) layoutParams4).leftMargin = this.d;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                } else {
                    this.b.element = kew.v(56);
                    ViewGroup viewGroup4 = this.c.element;
                    ViewGroup.LayoutParams layoutParams5 = viewGroup4 == null ? null : viewGroup4.getLayoutParams();
                    if (layoutParams5 != null) {
                        ((FrameLayout.LayoutParams) layoutParams5).leftMargin = (this.d - this.b.element) - this.f.getWidth();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                }
                if (this.b.element < kew.v(26)) {
                    this.b.element = kew.v(26);
                }
                ViewGroup viewGroup5 = this.c.element;
                ViewGroup.LayoutParams layoutParams6 = viewGroup5 == null ? null : viewGroup5.getLayoutParams();
                if (layoutParams6 != null) {
                    ((FrameLayout.LayoutParams) layoutParams6).topMargin = ((int) ((this.g * this.h) / 100)) - (this.f.getHeight() / 2);
                    ViewGroup viewGroup6 = this.i.element;
                    if (viewGroup6 != null) {
                        kew.g(viewGroup6, this.b.element);
                    }
                    if (this.j.element) {
                        ViewGroup viewGroup7 = this.i.element;
                        if (viewGroup7 != null) {
                            layoutParams = viewGroup7.getLayoutParams();
                        }
                        if (layoutParams != null) {
                            ((FrameLayout.LayoutParams) layoutParams).leftMargin = this.f.getWidth();
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    ViewGroup viewGroup8 = this.k.element;
                    if (viewGroup8 != null) {
                        layoutParams = viewGroup8.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        ((FrameLayout.LayoutParams) layoutParams).leftMargin = this.b.element;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LinearLayout f3021a;
            public final /* synthetic */ JSONObject b;

            public b(LinearLayout linearLayout, JSONObject jSONObject) {
                this.f3021a = linearLayout;
                this.b = jSONObject;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Context context = this.f3021a.getContext();
                ckf.f(context, "context");
                khu.h(context, brf.d(this.b, rg0.JUMP_URL));
            }
        }

        static {
            t2o.a(766509249);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PicPagerItemView(ShopLoftGraphicView shopLoftGraphicView, Context context) {
            super(context);
            ckf.g(shopLoftGraphicView, "this$0");
            ckf.g(context, "context");
            this.this$0 = shopLoftGraphicView;
            this.backgroundImageView = new ImageView(context);
            this.contentView = new TUrlImageView(context);
            this.imageContainer = new FrameLayout(context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
        /* JADX WARN: Type inference failed for: r1v14, types: [android.widget.LinearLayout, T, android.view.View, android.view.ViewGroup] */
        /* JADX WARN: Type inference failed for: r1v17, types: [T, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
        /* JADX WARN: Unknown variable types count: 3 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void addTags(com.alibaba.fastjson.JSONObject r28, int r29, int r30) {
            /*
                Method dump skipped, instructions count: 1331
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftGraphicView.PicPagerItemView.addTags(com.alibaba.fastjson.JSONObject, int, int):void");
        }

        public static /* synthetic */ Object ipc$super(PicPagerItemView picPagerItemView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftGraphicView$PicPagerItemView");
        }

        public final void init() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
                return;
            }
            if (Build.VERSION.SDK_INT >= 31 && this.enableRenderEffectBlur) {
                z = true;
            }
            this.useSystemBlur = z;
            kew.a(this, this.backgroundImageView);
            ImageView imageView = this.backgroundImageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            imageView.setScaleType(scaleType);
            this.contentView.setScaleType(scaleType);
            this.imageContainer.addView(this.contentView, new FrameLayout.LayoutParams(-1, -2, 17));
            FrameLayout frameLayout = this.imageContainer;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 17);
            xhv xhvVar = xhv.INSTANCE;
            addView(frameLayout, layoutParams);
        }

        public final void renderWithData(JSONObject jSONObject) {
            Shader.TileMode tileMode;
            RenderEffect createBlurEffect;
            Integer m;
            Integer m2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92af25c3", new Object[]{this, jSONObject});
                return;
            }
            ckf.g(jSONObject, "data");
            String string = jSONObject.getString("picUrl");
            if (string == null) {
                npp.Companion.b("picUrl is null");
                return;
            }
            String string2 = jSONObject.getString("height");
            int intValue = (string2 == null || (m2 = ssq.m(string2)) == null) ? 0 : m2.intValue();
            String string3 = jSONObject.getString("width");
            int intValue2 = (string3 == null || (m = ssq.m(string3)) == null) ? 0 : m.intValue();
            if (!(intValue == 0 || intValue2 == 0)) {
                this.imageRatio = intValue / intValue2;
            }
            Context context = getContext();
            if (context != null) {
                int i = r54.m((Activity) context).widthPixels;
                int i2 = (int) (i * this.imageRatio);
                kew.e(this.contentView, i2);
                this.contentView.setImageUrl(string);
                if (ShopLoftGraphicView.T(this.this$0)) {
                    string = this.lowDeviceGuessPicUrl;
                } else {
                    String string4 = jSONObject.getString("gaussPicUrl");
                    if (string4 != null) {
                        string = string4;
                    }
                }
                String decideUrl = ImageStrategyDecider.decideUrl(string, 300, 300, null);
                if (Build.VERSION.SDK_INT < 31 || !this.useSystemBlur) {
                    s0m.B().T(decideUrl).bitmapProcessors(new yf2(getContext(), 20)).into(this.backgroundImageView, 2.0f);
                    if (ShopLoftGraphicView.Q(this.this$0)) {
                        this.backgroundImageView.setScaleX(3.0f);
                        this.backgroundImageView.setScaleY(3.0f);
                    }
                } else {
                    s0m.B().T(decideUrl).into(this.backgroundImageView);
                    if (!ShopLoftGraphicView.T(this.this$0)) {
                        ImageView imageView = this.backgroundImageView;
                        tileMode = Shader.TileMode.DECAL;
                        createBlurEffect = RenderEffect.createBlurEffect(20.0f, 20.0f, tileMode);
                        imageView.setRenderEffect(createBlurEffect);
                    }
                }
                addTags(jSONObject, i, i2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda4b536", new Object[]{this});
        } else if (!i()) {
            GraphicViewPager graphicViewPager = this.q;
            if (graphicViewPager != null) {
                int currentItem = graphicViewPager.getCurrentItem();
                JSONArray jSONArray = this.t;
                if (jSONArray == null) {
                    ckf.y("picList");
                    throw null;
                } else if (currentItem < jSONArray.size() - 1) {
                    GraphicViewPager graphicViewPager2 = this.q;
                    if (graphicViewPager2 != null) {
                        graphicViewPager2.setCurrentItem(currentItem + 1, true);
                        W();
                        return;
                    }
                    ckf.y(OrderConfigs.VIEWPAGER);
                    throw null;
                }
            } else {
                ckf.y(OrderConfigs.VIEWPAGER);
                throw null;
            }
        }
    }
}
