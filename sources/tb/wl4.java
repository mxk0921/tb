package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.b0;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.web.TBVideoErrorView;
import com.taobao.android.fluid.framework.container.render.DefaultPageType;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wl4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f30760a;
    public final RelativeLayout b;
    public final FrameLayout c;
    public final e d;
    public View e = null;
    public View f = null;
    public TBVideoErrorView g = null;
    public TBErrorViewWidget h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (wl4.a(wl4.this) != null) {
                wl4.a(wl4.this).a(DefaultPageType.EMPTY_FOLLOW, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(wl4 wl4Var) {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() instanceof cy0) {
                ((cy0) succPhenixEvent.getDrawable()).B(0);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (wl4.a(wl4.this) != null) {
                wl4.a(wl4.this).a(DefaultPageType.NORMAL_ERROR, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$fluid$framework$container$render$DefaultPageType;

        static {
            int[] iArr = new int[DefaultPageType.values().length];
            $SwitchMap$com$taobao$android$fluid$framework$container$render$DefaultPageType = iArr;
            try {
                iArr[DefaultPageType.EMPTY_FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$fluid$framework$container$render$DefaultPageType[DefaultPageType.NO_PERMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        void a(DefaultPageType defaultPageType, Object obj);
    }

    static {
        t2o.a(468714149);
    }

    public wl4(FluidContext fluidContext, RelativeLayout relativeLayout, FrameLayout frameLayout, e eVar) {
        this.f30760a = fluidContext;
        this.b = relativeLayout;
        this.c = frameLayout;
        this.d = eVar;
    }

    public static /* synthetic */ e a(wl4 wl4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("9db63041", new Object[]{wl4Var});
        }
        return wl4Var.d;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        c();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66117ca", new Object[]{this});
            return;
        }
        TBErrorViewWidget tBErrorViewWidget = this.h;
        if (tBErrorViewWidget != null) {
            tBErrorViewWidget.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (r6.isEmpty() == false) goto L_0x0058;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View g(android.widget.FrameLayout r5, java.lang.Object r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.wl4.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "d6e0e899"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            android.view.View r5 = (android.view.View) r5
            return r5
        L_0x001b:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setBackgroundColor(r0)
            com.taobao.android.fluid.framework.card.cards.web.TBVideoErrorView r0 = r4.g
            if (r0 != 0) goto L_0x0046
            com.taobao.android.fluid.framework.card.cards.web.TBVideoErrorView r0 = new com.taobao.android.fluid.framework.card.cards.web.TBVideoErrorView
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            r4.g = r0
            r1 = 8
            r0.setActionVisibility(r1)
            com.taobao.android.fluid.framework.card.cards.web.TBVideoErrorView r0 = r4.g
            r0.setSubTitleVisibility(r1)
            com.taobao.android.fluid.framework.card.cards.web.TBVideoErrorView r0 = r4.g
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 17
            r3 = -2
            r1.<init>(r3, r3, r2)
            r5.addView(r0, r1)
        L_0x0046:
            com.taobao.android.fluid.framework.card.cards.web.TBVideoErrorView r5 = r4.g
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L_0x0055
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            java.lang.String r6 = "由于作者设置，原分享内容暂时没有权限查看哦~"
        L_0x0058:
            r5.setTitle(r6)
            com.taobao.android.fluid.framework.card.cards.web.TBVideoErrorView r5 = r4.g
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wl4.g(android.widget.FrameLayout, java.lang.Object):android.view.View");
    }

    public final View e(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bf828470", new Object[]{this, frameLayout});
        }
        frameLayout.setBackgroundColor(-16777216);
        if (this.f == null) {
            Context context = frameLayout.getContext();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setGravity(17);
            linearLayout.setOrientation(1);
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01WADadP1MyQHs6J4J7_!!6000000001503-2-tps-280-200.png");
            tUrlImageView.setSkipAutoSize(true);
            linearLayout.addView(tUrlImageView, new LinearLayout.LayoutParams(jxv.b(context, 140.0f), jxv.b(context, 100.0f)));
            TextView textView = new TextView(context);
            textView.setText("亲，暂时没有关注的内容哦");
            textView.setTextColor(-8615780);
            textView.setTextSize(1, 18.0f);
            textView.setTypeface(null, 1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = jxv.b(context, 9.0f);
            linearLayout.addView(textView, layoutParams);
            TextView textView2 = new TextView(context);
            textView2.setText("去关注感兴趣的账号吧");
            textView2.setTextColor(-1719891812);
            textView2.setTextSize(1, 15.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = jxv.b(context, 15.0f);
            linearLayout.addView(textView2, layoutParams2);
            igs.c();
            TextView textView3 = new TextView(context);
            textView3.setText("去“推荐”看看");
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 15.0f);
            textView3.setTypeface(null, 1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(b0.DEFAULT_COLOR);
            gradientDrawable.setCornerRadius(jxv.b(frameLayout.getContext(), 12.0f));
            textView3.setBackground(gradientDrawable);
            int b2 = jxv.b(frameLayout.getContext(), 18.0f);
            int b3 = jxv.b(frameLayout.getContext(), 12.0f);
            textView3.setPadding(b2, b3, b2, b3);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.topMargin = jxv.b(context, 40.0f);
            linearLayout.addView(textView3, layoutParams3);
            textView3.setOnClickListener(new a());
            frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f = linearLayout;
        }
        return this.f;
    }

    public final void h(Object obj) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e05bae1", new Object[]{this, obj});
            return;
        }
        if (this.h == null) {
            Context context = this.b.getContext();
            TBErrorViewWidget tBErrorViewWidget = new TBErrorViewWidget(context);
            this.h = tBErrorViewWidget;
            tBErrorViewWidget.setTopic("Page_videointeract");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            Activity k = nwv.k(context);
            if (k != null) {
                layoutParams.width = TBErrorViewWidget.getSuggestedWidth(k);
            }
            int b2 = jxv.b(context, 8.0f);
            if (b93.n(this.f30760a)) {
                boolean q = pto.q(this.f30760a);
                if (!q) {
                    i = bbw.c(this.f30760a, context, q);
                }
                layoutParams.bottomMargin = b2;
                this.h.setCustomEnableButtons(5);
                this.h.setVisibility(0);
                this.h.setRefreshButton(new c());
                this.h.setUserInterfaceStyle(TBErrorViewWidget.UserInterfaceStyle.DARK);
                this.h.setDefaultLoadingInterval(-1);
                this.b.addView(this.h, layoutParams);
            } else {
                i = p91.i();
            }
            b2 += i;
            layoutParams.bottomMargin = b2;
            this.h.setCustomEnableButtons(5);
            this.h.setVisibility(0);
            this.h.setRefreshButton(new c());
            this.h.setUserInterfaceStyle(TBErrorViewWidget.UserInterfaceStyle.DARK);
            this.h.setDefaultLoadingInterval(-1);
            this.b.addView(this.h, layoutParams);
        }
        if (!(obj instanceof MtopResponse) || !hn4.c()) {
            this.h.setError(Error.Factory.newError("FAIL", "网络不太好"));
        } else {
            MtopResponse mtopResponse = (MtopResponse) obj;
            this.h.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        }
        this.h.stopLoadingIfNeed();
        this.h.setVisibility(0);
    }

    public final View f(FrameLayout frameLayout, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e9f0c3", new Object[]{this, frameLayout, new Boolean(z)});
        }
        ir9.b("ContainerErrorLayer", "show normal error。 needLoading:" + z);
        if (!hn4.d()) {
            i = -16777216;
        }
        frameLayout.setBackgroundColor(i);
        if (z) {
            if (this.e == null) {
                TUrlImageView tUrlImageView = new TUrlImageView(frameLayout.getContext());
                tUrlImageView.setSkipAutoSize(true);
                tUrlImageView.setImageUrl(uuo.p("videosdk_error_loading_icon.apng"));
                tUrlImageView.succListener(new b(this));
                this.e = tUrlImageView;
            }
            if (this.e.getParent() != frameLayout) {
                if (this.e.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.e.getParent()).removeView(this.e);
                }
                frameLayout.addView(this.e, new FrameLayout.LayoutParams(pr9.c(frameLayout.getContext(), 60), pr9.c(frameLayout.getContext(), 48), 17));
            }
            return this.e;
        }
        View view = this.e;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.e.getParent()).removeView(this.e);
        }
        return frameLayout;
    }

    public void d(DefaultPageType defaultPageType, String str, Object obj) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49027dbb", new Object[]{this, defaultPageType, str, obj});
            return;
        }
        ir9.b("ContainerErrorLayer", "show error。 type:" + defaultPageType + " msg:" + str + " data:" + obj);
        if (!(this.b == null || this.c == null)) {
            int i = d.$SwitchMap$com$taobao$android$fluid$framework$container$render$DefaultPageType[defaultPageType.ordinal()];
            if (i == 1) {
                view = e(this.c);
                c();
            } else if (i != 2) {
                view = f(this.c, ((IUsePreloadService) this.f30760a.getService(IUsePreloadService.class)).findPreloadVideo() == null);
                h(obj);
            } else {
                view = g(this.c, str);
                c();
            }
            for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
                View childAt = this.c.getChildAt(i2);
                if (childAt == view) {
                    childAt.setVisibility(0);
                } else {
                    childAt.setVisibility(8);
                }
            }
            this.c.setVisibility(0);
            this.c.setClickable(true);
            s0j.B(this.c);
        }
    }
}
