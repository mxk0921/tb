package com.taobao.themis.pub.titlebar.action;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.pub_kit.guide.PubCloseButtonGuide;
import com.taobao.themis.pub_kit.guide.model.PubCloseButtonModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.pub_kit.widget.IActionViewTheme;
import com.taobao.themis.pub_kit.widget.PubMoreCloseActionView;
import com.taobao.uikit.actionbar.TBActionView;
import kotlin.Metadata;
import kotlin.Pair;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.fbs;
import tb.jpu;
import tb.les;
import tb.pl4;
import tb.q9s;
import tb.t2o;
import tb.tm2;
import tb.u2n;
import tb.u3n;
import tb.v0e;
import tb.v3n;
import tb.xcs;
import tb.y2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubMoreCloseAction extends u2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public RelativeLayout f;
    public ImageView g;
    public View h;
    public ImageView i;
    public PubCloseButtonGuide k;
    public PubMoreCloseActionView m;
    public final long j = System.currentTimeMillis();
    public final Runnable l = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(844103783);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            Context r;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule != null && (r = PubMoreCloseAction.this.r()) != null) {
                PubMoreCloseAction.B(PubMoreCloseAction.this, new PubCloseButtonGuide(r, pubUserGuideModule));
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
            if (r2.b(r8, r4) == true) goto L_0x00c0;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.pub.titlebar.action.PubMoreCloseAction.f.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            PubCloseButtonModel closeButtonTip;
            String stayTime;
            int i = 2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                return;
            }
            if (!(pubUserGuideModule == null || (closeButtonTip = pubUserGuideModule.getCloseButtonTip()) == null || (stayTime = closeButtonTip.getStayTime()) == null)) {
                i = Integer.parseInt(stayTime);
            }
            long currentTimeMillis = System.currentTimeMillis() - PubMoreCloseAction.A(PubMoreCloseAction.this);
            long j = i * 1000;
            if (currentTimeMillis > j) {
                CommonExtKt.p(PubMoreCloseAction.z(PubMoreCloseAction.this), 300L);
            } else {
                CommonExtKt.p(PubMoreCloseAction.z(PubMoreCloseAction.this), j - currentTimeMillis);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(844103784);
            int[] iArr = new int[Window.Theme.values().length];
            iArr[Window.Theme.LIGHT.ordinal()] = 1;
            iArr[Window.Theme.DARK.ordinal()] = 2;
            iArr[Window.Theme.AUTO.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(844103782);
        t2o.a(835715175);
    }

    public static final /* synthetic */ long A(PubMoreCloseAction pubMoreCloseAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d683d30", new Object[]{pubMoreCloseAction})).longValue();
        }
        return pubMoreCloseAction.j;
    }

    public static final /* synthetic */ void B(PubMoreCloseAction pubMoreCloseAction, PubCloseButtonGuide pubCloseButtonGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf258fe0", new Object[]{pubMoreCloseAction, pubCloseButtonGuide});
        } else {
            pubMoreCloseAction.k = pubCloseButtonGuide;
        }
    }

    public static final /* synthetic */ PubMoreCloseActionView a(PubMoreCloseAction pubMoreCloseAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubMoreCloseActionView) ipChange.ipc$dispatch("6227d267", new Object[]{pubMoreCloseAction});
        }
        return pubMoreCloseAction.m;
    }

    public static /* synthetic */ Object ipc$super(PubMoreCloseAction pubMoreCloseAction, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1865040893:
                super.o();
                return null;
            case -1504501726:
                super.m();
                return null;
            case -134981876:
                super.q((Window.Theme) objArr[0]);
                return null;
            case 485366694:
                super.i((ITMSPage) objArr[0]);
                return null;
            case 994841544:
                super.n();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubMoreCloseAction");
        }
    }

    public static final /* synthetic */ PubCloseButtonGuide w(PubMoreCloseAction pubMoreCloseAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubCloseButtonGuide) ipChange.ipc$dispatch("8f5da608", new Object[]{pubMoreCloseAction});
        }
        return pubMoreCloseAction.k;
    }

    public static final /* synthetic */ ITMSPage x(PubMoreCloseAction pubMoreCloseAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("bae1c8e", new Object[]{pubMoreCloseAction});
        }
        return pubMoreCloseAction.k();
    }

    public static final /* synthetic */ ImageView y(PubMoreCloseAction pubMoreCloseAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("f38f7759", new Object[]{pubMoreCloseAction});
        }
        return pubMoreCloseAction.i;
    }

    public static final /* synthetic */ Runnable z(PubMoreCloseAction pubMoreCloseAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("ffc5c10d", new Object[]{pubMoreCloseAction});
        }
        return pubMoreCloseAction.l;
    }

    public void C() {
        ITMSPage k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47783ed", new Object[]{this});
        } else if (r() != null && (k = k()) != null) {
            fbs.c(k.getInstance(), new d(k));
            v0e v0eVar = (v0e) k.getInstance().getExtension(v0e.class);
            if (v0eVar != null) {
                v0eVar.p(k);
            }
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c49c87", new Object[]{this});
            return;
        }
        PubCloseButtonGuide pubCloseButtonGuide = this.k;
        if (pubCloseButtonGuide != null) {
            pubCloseButtonGuide.e();
        }
    }

    public final void E() {
        ITMSPage k;
        bbs instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5416ec", new Object[]{this});
        } else if (k() != null && (k = k()) != null && (instance = k.getInstance()) != null) {
            fbs.c(instance, new g());
        }
    }

    @Override // tb.btc
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470eead7", new Object[]{this});
        } else if (Window.Theme.LIGHT == t()) {
            TBActionView s = s();
            if (s != null) {
                s.setIconColor(-1);
            }
        } else {
            TBActionView s2 = s();
            if (s2 != null) {
                s2.setIconColor(-16777216);
            }
        }
    }

    @Override // tb.u2n, tb.a90
    public void i(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        super.i(iTMSPage);
        fbs.c(iTMSPage.getInstance(), new b());
        g();
        fbs.c(iTMSPage.getInstance(), new c(iTMSPage));
        E();
    }

    @Override // tb.a90
    public View l(Context context) {
        TBActionView tBActionView;
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        u(context);
        if (q9s.n4()) {
            if (this.m == null) {
                PubMoreCloseActionView pubMoreCloseActionView = new PubMoreCloseActionView(context);
                pubMoreCloseActionView.setTag("PubMoreCloseAction");
                TBActionView tBActionView2 = pubMoreCloseActionView.getTBActionView();
                tBActionView2.setOnTouchListener(new i());
                v(tBActionView2);
                les.d(pubMoreCloseActionView.getBackHomeView(), 0L, new PubMoreCloseAction$getView$1$2(this), 1, null);
                this.m = pubMoreCloseActionView;
            }
            return this.m;
        }
        RelativeLayout relativeLayout = this.f;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        View view = null;
        View inflate = View.inflate(context, R.layout.tms_pub_more_close_view, null);
        if (inflate != null) {
            RelativeLayout relativeLayout2 = (RelativeLayout) inflate;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xcs.a(context, 65.0f), xcs.a(context, 44.0f));
            layoutParams.rightMargin = xcs.a(context, 12.0f);
            relativeLayout2.setLayoutParams(layoutParams);
            this.f = relativeLayout2;
            this.g = (ImageView) relativeLayout2.findViewById(R.id.pub_more_close_bg);
            RelativeLayout relativeLayout3 = this.f;
            if (relativeLayout3 == null || (tBActionView = (TBActionView) relativeLayout3.findViewById(R.id.more_btn)) == null) {
                tBActionView = null;
            } else {
                View iconView = tBActionView.getIconView();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xcs.a(context, 24.0f), xcs.a(context, 24.0f));
                layoutParams2.gravity = 8388627;
                layoutParams2.setMarginStart(xcs.a(context, 9.0f));
                iconView.setLayoutParams(layoutParams2);
                tBActionView.setOnTouchListener(new j());
            }
            v(tBActionView);
            RelativeLayout relativeLayout4 = this.f;
            if (relativeLayout4 == null || (imageView = (ImageView) relativeLayout4.findViewById(R.id.back_home_btn)) == null) {
                imageView = null;
            } else {
                les.d(imageView, 0L, new PubMoreCloseAction$getView$4$1(this), 1, null);
            }
            this.i = imageView;
            RelativeLayout relativeLayout5 = this.f;
            if (relativeLayout5 != null) {
                view = relativeLayout5.findViewById(R.id.vertical_bar_view);
            }
            this.h = view;
            RelativeLayout relativeLayout6 = this.f;
            if (relativeLayout6 != null) {
                relativeLayout6.setTag("PubMoreCloseAction");
            }
            return this.f;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
    }

    @Override // tb.a90
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.m();
        CommonExtKt.l(this.l);
    }

    @Override // tb.a90
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        super.n();
        boolean z = r() instanceof Activity;
        CommonExtKt.r(new PubMoreCloseAction$onHide$1(this), 0L, 2, null);
        PubCloseButtonGuide pubCloseButtonGuide = this.k;
        if (pubCloseButtonGuide != null) {
            pubCloseButtonGuide.e();
        }
    }

    @Override // tb.u2n, tb.a90
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.o();
        E();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class i implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            bbs instance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                ITMSPage x = PubMoreCloseAction.x(PubMoreCloseAction.this);
                if (x == null || (instance = x.getInstance()) == null) {
                    return false;
                }
                fbs.c(instance, new a(PubMoreCloseAction.this));
                return false;
            } else if (action != 1) {
                return false;
            } else {
                return view.performClick();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements y2n.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PubMoreCloseAction f13717a;

            public a(PubMoreCloseAction pubMoreCloseAction) {
                this.f13717a = pubMoreCloseAction;
            }

            @Override // tb.y2n.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule != null) {
                    ITMSPage x = PubMoreCloseAction.x(this.f13717a);
                    ckf.d(x);
                    Pair a2 = jpu.a("miniapp_id", x.getInstance().L());
                    Pair a3 = jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule));
                    Pair a4 = jpu.a("spm", "Page_MiniApp.1.NavBar.3");
                    ITMSPage x2 = PubMoreCloseAction.x(this.f13717a);
                    ckf.d(x2);
                    Pair a5 = jpu.a(pl4.KEY_PAGE_ID, x2.getPageParams().e().g());
                    ITMSPage x3 = PubMoreCloseAction.x(this.f13717a);
                    ckf.d(x3);
                    v3n.a("Page_MiniApp_Button-NavBar-3", kotlin.collections.a.k(a2, a3, a4, a5, jpu.a("pageUrl", x3.c())));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class j implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            bbs instance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                ITMSPage x = PubMoreCloseAction.x(PubMoreCloseAction.this);
                if (x == null || (instance = x.getInstance()) == null) {
                    return false;
                }
                fbs.c(instance, new a(PubMoreCloseAction.this));
                return false;
            } else if (action != 1) {
                return false;
            } else {
                return view.performClick();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements y2n.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PubMoreCloseAction f13719a;

            public a(PubMoreCloseAction pubMoreCloseAction) {
                this.f13719a = pubMoreCloseAction;
            }

            @Override // tb.y2n.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule != null) {
                    ITMSPage x = PubMoreCloseAction.x(this.f13719a);
                    ckf.d(x);
                    Pair a2 = jpu.a("miniapp_id", x.getInstance().L());
                    Pair a3 = jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule));
                    Pair a4 = jpu.a("spm", "Page_MiniApp.1.NavBar.3");
                    ITMSPage x2 = PubMoreCloseAction.x(this.f13719a);
                    ckf.d(x2);
                    Pair a5 = jpu.a(pl4.KEY_PAGE_ID, x2.getPageParams().e().g());
                    ITMSPage x3 = PubMoreCloseAction.x(this.f13719a);
                    ckf.d(x3);
                    v3n.a("Page_MiniApp_Button-NavBar-3", kotlin.collections.a.k(a2, a3, a4, a5, jpu.a("pageUrl", x3.c())));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f13713a;

        public d(ITMSPage iTMSPage) {
            this.f13713a = iTMSPage;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule != null) {
                v3n.a("Page_MiniApp_Button-NavBar-4", kotlin.collections.a.k(jpu.a("miniapp_id", this.f13713a.getInstance().L()), jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule)), jpu.a("spm", "Page_MiniApp.1.NavBar.4"), jpu.a(pl4.KEY_PAGE_ID, this.f13713a.getPageParams().e().g()), jpu.a("pageUrl", this.f13713a.c())));
            }
        }
    }

    @Override // tb.u2n, tb.a90
    public void q(Window.Theme theme) {
        PubMoreCloseActionView pubMoreCloseActionView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        super.q(theme);
        if (q9s.n4()) {
            int i2 = h.$EnumSwitchMapping$0[theme.ordinal()];
            if (i2 == 1) {
                PubMoreCloseActionView pubMoreCloseActionView2 = this.m;
                if (pubMoreCloseActionView2 != null) {
                    pubMoreCloseActionView2.setTheme(IActionViewTheme.Theme.LIGHT);
                }
            } else if (i2 == 2) {
                PubMoreCloseActionView pubMoreCloseActionView3 = this.m;
                if (pubMoreCloseActionView3 != null) {
                    pubMoreCloseActionView3.setTheme(IActionViewTheme.Theme.DARK);
                }
            } else if (i2 == 3 && (pubMoreCloseActionView = this.m) != null) {
                pubMoreCloseActionView.setTheme(IActionViewTheme.Theme.LIGHT);
            }
        } else if (Window.Theme.LIGHT == t()) {
            View view = this.h;
            if (view != null) {
                view.setAlpha(0.2f);
            }
            ImageView imageView = this.g;
            if (imageView != null) {
                imageView.setBackgroundResource(R.drawable.tms_pub_rectangle_bg_dark);
            }
            ImageView imageView2 = this.i;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.tms_pub_back_home_light);
            }
        } else {
            View view2 = this.h;
            if (view2 != null) {
                view2.setAlpha(0.08f);
            }
            ImageView imageView3 = this.g;
            if (imageView3 != null) {
                imageView3.setBackgroundResource(R.drawable.tms_pub_rectangle_bg_white);
            }
            ImageView imageView4 = this.i;
            if (imageView4 != null) {
                imageView4.setImageResource(R.drawable.tms_pub_back_home_dark);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f13712a;

        public c(ITMSPage iTMSPage) {
            this.f13712a = iTMSPage;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule != null) {
                v3n.b("Page_MiniApp_Show-NavBar-4", kotlin.collections.a.k(jpu.a("miniapp_id", this.f13712a.getInstance().L()), jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule)), jpu.a("spm", "Page_MiniApp.1.NavBar.4"), jpu.a(pl4.KEY_PAGE_ID, this.f13712a.getPageParams().e().g()), jpu.a("pageUrl", this.f13712a.c())));
                v3n.b("Page_MiniApp_Show-NavBar-3", kotlin.collections.a.k(jpu.a("miniapp_id", this.f13712a.getInstance().L()), jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule)), jpu.a("spm", "Page_MiniApp.1.NavBar.3"), jpu.a(pl4.KEY_PAGE_ID, this.f13712a.getPageParams().e().g()), jpu.a("pageUrl", this.f13712a.c())));
            }
        }
    }
}
