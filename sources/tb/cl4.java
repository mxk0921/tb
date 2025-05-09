package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.devtools.IDevToolsService;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.container.render.DefaultPageType;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.weex_framework.ui.MUSTouchInterceptWrapperView;
import com.taobao.taobao.R;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.wl4;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cl4 implements View.OnClickListener, wl4.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TOPMASK_HEIGHT = 50;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f17128a;
    public final MultiTabLayout b;
    public final DefaultGestureCollectorDelegateLayout c;
    public final FrameLayout d;
    public FrameLayout e;
    public TUrlImageView f;
    public View g;
    public View h;
    public final Context i;
    public TextView j;
    public final TUrlImageView k;
    public final ViewGroup l;
    public final ViewGroup m;
    public ViewGroup n;
    public TUrlImageView o;
    public uq9 p;
    public uq9 q;
    public wl4 r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -372824644) {
                super.onDisAppear((uq9) objArr[0]);
                return null;
            } else if (hashCode == -147728739) {
                super.onActive((uq9) objArr[0]);
                return null;
            } else if (hashCode == 728745324) {
                super.onAppear((uq9) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/container/render/Container$1");
            }
        }

        @Override // tb.wlb.a, tb.wlb
        public void onActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f731d69d", new Object[]{this, uq9Var});
                return;
            }
            super.onActive(uq9Var);
            cl4 cl4Var = cl4.this;
            cl4.f(cl4Var, cl4.d(cl4Var));
        }

        @Override // tb.wlb.a, tb.wlb
        public void onAppear(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b6fc56c", new Object[]{this, uq9Var});
                return;
            }
            super.onAppear(uq9Var);
            cl4 cl4Var = cl4.this;
            cl4.c(cl4Var, cl4.d(cl4Var));
            cl4.e(cl4.this, uq9Var);
        }

        @Override // tb.wlb.a, tb.wlb
        public void onDisAppear(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9c725bc", new Object[]{this, uq9Var});
                return;
            }
            super.onDisAppear(uq9Var);
            if (uq9Var == cl4.d(cl4.this)) {
                cl4 cl4Var = cl4.this;
                cl4.e(cl4Var, cl4.b(cl4Var));
            }
            cl4 cl4Var2 = cl4.this;
            cl4.f(cl4Var2, cl4.d(cl4Var2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(cl4 cl4Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements la2<String, BitmapDrawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17130a;

        public c(String str) {
            this.f17130a = str;
        }

        /* renamed from: b */
        public void a(String str, BitmapDrawable bitmapDrawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7626bc8", new Object[]{this, str, bitmapDrawable});
            } else if (bitmapDrawable != null) {
                bitmapDrawable.setBounds(0, 0, pr9.c(com.taobao.orange.a.g, 15), pr9.c(com.taobao.orange.a.g, 15));
                cl4.g(cl4.this).setCompoundDrawables(bitmapDrawable, null, null, null);
                cl4.g(cl4.this).setText(this.f17130a);
                cl4.g(cl4.this).setVisibility(0);
                ir9.d("Container", "updateTopTitleView: success");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements MultiTabLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f17131a;
        public final /* synthetic */ Context b;

        public d(FluidContext fluidContext, Context context) {
            this.f17131a = fluidContext;
            this.b = context;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            if (!f2k.d(this.f17131a) || !pto.i(this.f17131a)) {
                return 0;
            }
            int a2 = xyr.a(this.b, f2k.c(this.f17131a));
            ir9.b("Container", "getHeight, containerHeight=" + a2);
            return a2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$fluid$framework$container$render$DefaultPageType;

        static {
            int[] iArr = new int[DefaultPageType.values().length];
            $SwitchMap$com$taobao$android$fluid$framework$container$render$DefaultPageType = iArr;
            try {
                iArr[DefaultPageType.NORMAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$fluid$framework$container$render$DefaultPageType[DefaultPageType.EMPTY_FOLLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(468714142);
        t2o.a(468714154);
    }

    public cl4(FluidContext fluidContext, MultiTabLayout multiTabLayout) {
        IpChange ipChange = DefaultPageType.$ipChange;
        this.f17128a = fluidContext;
        Context context = fluidContext.getContext();
        this.i = context;
        MultiTabLayout n = n(context, multiTabLayout, fluidContext.getInstanceConfig().isHideTopLayout(), fluidContext);
        this.b = n;
        ViewGroup viewGroup = (ViewGroup) n.findViewById(R.id.fluid_sdk_top_layout);
        this.l = viewGroup;
        this.m = (ViewGroup) n.findViewById(R.id.fluid_sdk_top_layout_mid_container);
        ImageView imageView = (ImageView) n.findViewById(R.id.fluid_sdk_back);
        this.j = (TextView) n.findViewById(R.id.fluid_sdk_top_title);
        this.c = (DefaultGestureCollectorDelegateLayout) n.findViewById(R.id.fluid_sdk_main_content);
        this.k = (TUrlImageView) n.findViewById(R.id.fluid_sdk_more);
        this.d = (FrameLayout) n.findViewById(R.id.fluid_sdk_tab_anim_layout);
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        if (viewGroup != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            if (f2k.d(fluidContext)) {
                layoutParams.height = pr9.q(pcw.l());
            } else {
                layoutParams.height = s6o.S(context, pcw.l());
            }
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.requestLayout();
        }
        l(n);
    }

    public static /* synthetic */ uq9 b(cl4 cl4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("ccb1ca5c", new Object[]{cl4Var});
        }
        return cl4Var.q;
    }

    public static /* synthetic */ uq9 c(cl4 cl4Var, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("82461ed", new Object[]{cl4Var, uq9Var});
        }
        cl4Var.q = uq9Var;
        return uq9Var;
    }

    public static /* synthetic */ uq9 d(cl4 cl4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("bc74be1d", new Object[]{cl4Var});
        }
        return cl4Var.p;
    }

    public static /* synthetic */ uq9 e(cl4 cl4Var, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("ca22c9ee", new Object[]{cl4Var, uq9Var});
        }
        cl4Var.p = uq9Var;
        return uq9Var;
    }

    public static /* synthetic */ void f(cl4 cl4Var, uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ddacba", new Object[]{cl4Var, uq9Var});
        } else {
            cl4Var.O(uq9Var);
        }
    }

    public static /* synthetic */ TextView g(cl4 cl4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("59f14bbc", new Object[]{cl4Var});
        }
        return cl4Var.j;
    }

    public static MultiTabLayout i(Context context, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTabLayout) ipChange.ipc$dispatch("1bdd5468", new Object[]{context, fluidContext});
        }
        MultiTabLayout multiTabLayout = new MultiTabLayout(context);
        multiTabLayout.setId(R.id.fluid_sdk_multi_tab_layout);
        multiTabLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        multiTabLayout.setBackgroundColor(-16777216);
        multiTabLayout.setHeightProvider(new d(fluidContext, context));
        return multiTabLayout;
    }

    public static FrameLayout j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f2b58af9", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.fluid_sdk_id_preloadview_container);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public View A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("31f308b0", new Object[]{this});
        }
        H(this.i);
        return this.g;
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70aefa7e", new Object[]{this});
            return;
        }
        wl4 wl4Var = this.r;
        if (wl4Var != null) {
            wl4Var.b();
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32bd72f", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        IpChange ipChange2 = DefaultPageType.$ipChange;
    }

    public final View E(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9bc56084", new Object[]{this, context});
        }
        if (this.n == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.fluid_sdk_tab3_had_exposed_loading);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            tUrlImageView.setId(R.id.fluid_sdk_tab3_had_exposed_loading_image_loading);
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(pr9.c(context, 35), pr9.c(context, 35), 1));
            frameLayout2.addView(tUrlImageView);
            frameLayout.addView(frameLayout2);
            this.n = frameLayout;
            this.o = tUrlImageView;
            this.b.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        return this.n;
    }

    public void F(DefaultPageType defaultPageType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a68d1c", new Object[]{this, defaultPageType, str, obj});
            return;
        }
        try {
            if (this.r == null) {
                FluidContext fluidContext = this.f17128a;
                MultiTabLayout multiTabLayout = this.b;
                this.r = new wl4(fluidContext, multiTabLayout, (FrameLayout) multiTabLayout.findViewById(R.id.fluid_sdk_tab_exception_layout_new), this);
            }
            this.r.d(defaultPageType, str, obj);
        } catch (Exception e2) {
            ir9.c("Container", "initErrorAndRefresh_new error", e2);
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379ef3a0", new Object[]{this});
            return;
        }
        ICardService iCardService = (ICardService) this.f17128a.getService(ICardService.class);
        if (iCardService == null) {
            ir9.b("Container", "initLazyLoadingForTopTitleView: null cardService");
        } else {
            iCardService.addCardLifecycleListener((wlb.a) new a());
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16c7b20", new Object[]{this});
        } else if (this.j == null) {
            TextView textView = new TextView(com.taobao.orange.a.g);
            this.j = textView;
            textView.setId(R.id.fluid_sdk_top_title);
            this.j.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            this.j.setEllipsize(TextUtils.TruncateAt.END);
            this.j.setMaxLines(1);
            this.j.setCompoundDrawablePadding(pr9.c(com.taobao.orange.a.g, 3));
            this.j.setPadding(pr9.c(com.taobao.orange.a.g, 6), pr9.c(com.taobao.orange.a.g, 6), pr9.c(com.taobao.orange.a.g, 8), pr9.c(com.taobao.orange.a.g, 6));
            this.j.setTextSize(1, 13.0f);
            this.j.setTextColor(-1);
            this.j.setBackgroundResource(R.drawable.fluid_sdk_top_title_bg);
            this.j.setGravity(8388627);
            this.j.setVisibility(4);
            this.j.setOnClickListener(new b(this));
            this.m.addView(this.j);
            this.m.requestLayout();
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647aa0b8", new Object[]{this});
            return;
        }
        ((IAnalysisService) this.f17128a.getService(IAnalysisService.class)).setRetryFetchContent(true);
        ((IContainerService) this.f17128a.getService(IContainerService.class)).refreshWithCallback(null);
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e29c6", new Object[]{this, new Boolean(z)});
        } else {
            this.b.setLockedTouchEvent(z);
        }
    }

    public void M(RotateAnimation rotateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c865141", new Object[]{this, rotateAnimation});
            return;
        }
        H(this.i);
        TUrlImageView tUrlImageView = this.f;
        if (tUrlImageView != null && rotateAnimation != null && tUrlImageView.isShown()) {
            this.f.startAnimation(rotateAnimation);
            IpChange ipChange2 = DefaultPageType.$ipChange;
        }
    }

    public void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2836955", new Object[]{this, str});
        } else if (this.k != null) {
            if (!TextUtils.isEmpty(str)) {
                this.k.setImageDrawable(null);
                this.k.setImageUrl(str);
            }
            this.k.setVisibility(0);
            this.k.setOnClickListener(this);
        }
    }

    public final void O(uq9 uq9Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d923089", new Object[]{this, uq9Var});
        } else if (!(uq9Var instanceof prp)) {
            TextView textView = this.j;
            if (textView != null) {
                textView.setVisibility(4);
            }
        } else {
            MediaContentDetailData.TopTitle q = ((prp) uq9Var).Y().q();
            if (q == null) {
                TextView textView2 = this.j;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                    ir9.b("Container", "updateTopTitleView: null topTitle");
                    return;
                }
                return;
            }
            I();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(q.typeTag)) {
                str = "";
            } else {
                str = q.typeTag + " ";
            }
            sb.append(str);
            sb.append(q.title);
            FluidSDK.getImageAdapter().load(q.iconUrl, new c(sb.toString()));
        }
    }

    @Override // tb.wl4.e
    public void a(DefaultPageType defaultPageType, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3297aaf", new Object[]{this, defaultPageType, obj});
            return;
        }
        int i = e.$SwitchMap$com$taobao$android$fluid$framework$container$render$DefaultPageType[defaultPageType.ordinal()];
        if (i == 1) {
            J();
        } else if (i == 2) {
            FluidSDK.getNavAdapter().nav(this.f17128a, this.i, "https://h5.m.taobao.com/guangguang/index.htm?tabid=video", null);
        }
    }

    public void h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ce61f6", new Object[]{this, view});
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.c.getChildCount(); i++) {
            if (this.c.getChildAt(i) instanceof MUSTouchInterceptWrapperView) {
                z = true;
            }
        }
        if (z) {
            DefaultGestureCollectorDelegateLayout defaultGestureCollectorDelegateLayout = this.c;
            defaultGestureCollectorDelegateLayout.addView(view, defaultGestureCollectorDelegateLayout.getChildCount() - 1, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        this.c.addView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dd875c", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
    }

    public final void l(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c97f466", new Object[]{this, viewGroup});
        } else if (!p91.j()) {
            ir9.b("Container", "非debug包, 不显示调试工具入口");
        } else if (!vr9.d()) {
            ir9.b("Container", "FluidSDK 新架构未集成 fluid-devtools, 不显示调试工具入口");
        } else {
            IDevToolsService iDevToolsService = (IDevToolsService) this.f17128a.getService(IDevToolsService.class);
            if (iDevToolsService == null) {
                ir9.b("Container", "FluidSDK 新架构未添加调试服务, 不显示调试工具入口");
            } else {
                iDevToolsService.attachDevToolsEntry(viewGroup);
            }
        }
    }

    public final View m(Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3fe512f9", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(R.id.fluid_sdk_top_layout);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int c2 = f2k.c(this.f17128a);
        if (c2 > 0) {
            i = 0;
        } else {
            i = c2 + pr9.c(context, 1);
        }
        layoutParams.setMargins(0, i, 0, 0);
        relativeLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        int i2 = R.id.fluid_sdk_back;
        imageView.setId(i2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(pr9.c(context, 40), pr9.c(context, 40));
        layoutParams2.addRule(15);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(R.drawable.fluid_sdk_back2);
        imageView.setPadding(pr9.c(context, 12), pr9.c(context, 6), 0, pr9.c(context, 6));
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType(scaleType);
        relativeLayout.addView(imageView);
        if (hn4.j()) {
            G();
        } else {
            ir9.a("Container", "generateTopLayout: remote set invisible");
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        int i3 = R.id.fluid_sdk_more;
        tUrlImageView.setId(i3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(pr9.c(context, 40), pr9.c(context, 40));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        tUrlImageView.setLayoutParams(layoutParams3);
        tUrlImageView.setPadding(0, pr9.c(context, 6), pr9.c(context, 12), pr9.c(context, 6));
        tUrlImageView.setScaleType(scaleType);
        tUrlImageView.setImageResource(R.drawable.fluid_sdk_more_label);
        tUrlImageView.setVisibility(8);
        relativeLayout.addView(tUrlImageView);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int c3 = pr9.c(context, 6);
        layoutParams4.rightMargin = c3;
        layoutParams4.leftMargin = c3;
        layoutParams4.addRule(17, i2);
        layoutParams4.addRule(16, i3);
        layoutParams4.addRule(15);
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.fluid_sdk_top_layout_mid_container);
        relativeLayout.addView(frameLayout, layoutParams4);
        return relativeLayout;
    }

    public final MultiTabLayout n(Context context, MultiTabLayout multiTabLayout, boolean z, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTabLayout) ipChange.ipc$dispatch("186abb3d", new Object[]{this, context, multiTabLayout, new Boolean(z), fluidContext});
        }
        if (multiTabLayout == null) {
            multiTabLayout = i(context, fluidContext);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.fluid_sdk_tab_anim_layout);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(frameLayout);
        DefaultGestureCollectorDelegateLayout defaultGestureCollectorDelegateLayout = new DefaultGestureCollectorDelegateLayout(context);
        defaultGestureCollectorDelegateLayout.setId(R.id.fluid_sdk_main_content);
        defaultGestureCollectorDelegateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(defaultGestureCollectorDelegateLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.fluid_sdk_tab_exception_layout_new);
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        frameLayout2.setBackgroundColor(Color.parseColor(xjg.ERROR_COLOR_STRING));
        multiTabLayout.addView(frameLayout2);
        if (!z) {
            multiTabLayout.addView(m(context));
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.fluid_sdk_global_tnode);
        frameLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(frameLayout3);
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setId(R.id.fluid_sdk_global_h5);
        frameLayout4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(frameLayout4);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.fluid_sdk_stub_more_action);
        viewStub.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        multiTabLayout.addView(viewStub);
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.fluid_sdk_good_list_view_stub);
        viewStub2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewStub2.setVisibility(8);
        multiTabLayout.addView(viewStub2);
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(R.id.fluid_sdk_comment_view_stub);
        viewStub3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewStub3.setVisibility(8);
        multiTabLayout.addView(viewStub3);
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(R.id.fluid_sdk_album_detail_view_stub);
        viewStub4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewStub4.setVisibility(8);
        multiTabLayout.addView(viewStub4);
        return multiTabLayout;
    }

    public ViewStub o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("d0fd0b33", new Object[]{this});
        }
        return (ViewStub) this.b.findViewById(R.id.fluid_sdk_album_detail_view_stub);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.fluid_sdk_back) {
            ((IBackEventService) this.f17128a.getService(IBackEventService.class)).handleExitFullPage();
        } else if (view == z()) {
            zq9.a(this.f17128a);
        }
    }

    public int p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a869bbf", new Object[]{this, new Integer(i)})).intValue();
        }
        ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            return ahw.b(viewGroup, i);
        }
        return 8;
    }

    public ViewGroup q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ac1ca7d", new Object[]{this});
        }
        return this.d;
    }

    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("128ba432", new Object[]{this});
        }
        H(this.i);
        return this.h;
    }

    public TUrlImageView s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("b085964a", new Object[]{this});
        }
        E(this.i);
        return this.o;
    }

    public ViewGroup t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("95dbfc54", new Object[]{this});
        }
        E(this.i);
        return this.n;
    }

    public MultiTabLayout u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTabLayout) ipChange.ipc$dispatch("4c2fb452", new Object[]{this});
        }
        return this.b;
    }

    public ViewStub v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("5c6546fa", new Object[]{this});
        }
        return (ViewStub) this.b.findViewById(R.id.fluid_sdk_good_list_view_stub);
    }

    public ViewGroup w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("135b5ce8", new Object[]{this});
        }
        H(this.i);
        return this.e;
    }

    public TUrlImageView x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("525dc880", new Object[]{this});
        }
        H(this.i);
        return this.f;
    }

    public DefaultGestureCollectorDelegateLayout y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultGestureCollectorDelegateLayout) ipChange.ipc$dispatch("c86db4d0", new Object[]{this});
        }
        return this.c;
    }

    public View z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4c38e826", new Object[]{this});
        }
        return this.k;
    }

    public final View H(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dd6bade2", new Object[]{this, context});
        }
        if (this.e == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.fluid_sdk_tab_loading_layout);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setBackgroundResource(R.color.fluid_sdk_black);
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            tUrlImageView.setId(R.id.fluid_sdk_image_loading);
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(pr9.c(context, 200), pr9.c(context, 60), 17));
            tUrlImageView.setTransitionName("share");
            View view = new View(context);
            view.setId(R.id.v_graymask_top);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, pr9.c(context, 50), 48));
            view.setBackgroundResource(R.drawable.fluid_sdk_video_background_top);
            view.setVisibility(4);
            View view2 = new View(context);
            view2.setId(R.id.v_graymask_bottom);
            view2.setLayoutParams(new FrameLayout.LayoutParams(-1, pr9.c(context, 285), 80));
            view2.setBackgroundResource(R.drawable.fluid_sdk_video_background_bottom);
            view2.setVisibility(4);
            frameLayout.addView(tUrlImageView);
            frameLayout.addView(view);
            frameLayout.addView(view2);
            this.f = tUrlImageView;
            this.e = frameLayout;
            this.g = view;
            this.h = view2;
            this.b.addView(frameLayout, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        return this.e;
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529213ea", new Object[]{this});
            return;
        }
        E(this.i);
        this.n.setVisibility(0);
        Drawable drawable = this.i.getResources().getDrawable(R.drawable.fluid_sdk_tab3_loading);
        int c2 = pr9.c(this.i, 35);
        ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
        layoutParams.width = c2;
        layoutParams.height = c2;
        this.o.setLayoutParams(layoutParams);
        this.o.setImageDrawable(drawable);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        this.o.startAnimation(rotateAnimation);
        this.o.setVisibility(0);
        ir9.a("DefaultFluidInstance", "动画开始");
    }
}
