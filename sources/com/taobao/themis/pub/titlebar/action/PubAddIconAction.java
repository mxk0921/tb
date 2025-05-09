package com.taobao.themis.pub.titlebar.action;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.model.PubAddIconTipsModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.pub_kit.widget.IActionViewTheme;
import com.taobao.themis.pub_kit.widget.PubAddIconActionView;
import kotlin.Metadata;
import tb.a07;
import tb.a90;
import tb.ckf;
import tb.fbs;
import tb.jpu;
import tb.les;
import tb.pl4;
import tb.q9s;
import tb.t2o;
import tb.t3n;
import tb.tm2;
import tb.u3n;
import tb.v3n;
import tb.xcs;
import tb.y2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubAddIconAction extends a90 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "PubAddIconAction";
    public final PubUserGuideModule c;
    public final b d;
    public FrameLayout e;
    public ImageView f;
    public final PubAddIconTipsModel g;
    public PubAddIconGuide h;
    public final long i;
    public volatile boolean j;
    public final Runnable k;
    public PubAddIconActionView m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(844103739);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void hasClickAddIcon();
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
            if (r4.b(r6, r2) == true) goto L_0x0091;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.pub.titlebar.action.PubAddIconAction.d.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(844103741);
            int[] iArr = new int[Window.Theme.values().length];
            iArr[Window.Theme.LIGHT.ordinal()] = 1;
            iArr[Window.Theme.DARK.ordinal()] = 2;
            iArr[Window.Theme.AUTO.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(844103738);
        t2o.a(844103737);
    }

    public PubAddIconAction() {
        this(null, null, 3, null);
    }

    public static final /* synthetic */ PubAddIconActionView a(PubAddIconAction pubAddIconAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubAddIconActionView) ipChange.ipc$dispatch("cfc12d7f", new Object[]{pubAddIconAction});
        }
        return pubAddIconAction.m;
    }

    public static /* synthetic */ Object ipc$super(PubAddIconAction pubAddIconAction, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubAddIconAction");
        }
    }

    public static final /* synthetic */ PubAddIconTipsModel r(PubAddIconAction pubAddIconAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubAddIconTipsModel) ipChange.ipc$dispatch("16ed4a64", new Object[]{pubAddIconAction});
        }
        return pubAddIconAction.g;
    }

    public static final /* synthetic */ boolean s(PubAddIconAction pubAddIconAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ea973a1", new Object[]{pubAddIconAction})).booleanValue();
        }
        return pubAddIconAction.j;
    }

    public static final /* synthetic */ ITMSPage t(PubAddIconAction pubAddIconAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("2d028aa5", new Object[]{pubAddIconAction});
        }
        return pubAddIconAction.k();
    }

    public static final /* synthetic */ FrameLayout u(PubAddIconAction pubAddIconAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("244a58d8", new Object[]{pubAddIconAction});
        }
        return pubAddIconAction.e;
    }

    public static final /* synthetic */ PubUserGuideModule v(PubAddIconAction pubAddIconAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubUserGuideModule) ipChange.ipc$dispatch("e40da513", new Object[]{pubAddIconAction});
        }
        return pubAddIconAction.c;
    }

    public static final /* synthetic */ void w(PubAddIconAction pubAddIconAction, ITMSPage iTMSPage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b0821b", new Object[]{pubAddIconAction, iTMSPage, str});
        } else {
            pubAddIconAction.A(iTMSPage, str);
        }
    }

    public static final /* synthetic */ void x(PubAddIconAction pubAddIconAction, ITMSPage iTMSPage, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927a4f5c", new Object[]{pubAddIconAction, iTMSPage, str});
        } else {
            pubAddIconAction.B(iTMSPage, str);
        }
    }

    @Override // tb.a90
    public void i(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cee1ba6", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        super.i(iTMSPage);
        PubContainerContext pubContainerContext = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
        this.h = pubContainerContext == null ? null : pubContainerContext.getPubAddIconGuide();
        z();
        fbs.c(iTMSPage.getInstance(), new c(iTMSPage));
    }

    @Override // tb.a90
    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (q9s.n4()) {
            if (this.m == null) {
                PubAddIconActionView pubAddIconActionView = new PubAddIconActionView(context);
                les.d(pubAddIconActionView, 0L, new PubAddIconAction$getView$1$1(this), 1, null);
                pubAddIconActionView.setTag(TAG);
                this.m = pubAddIconActionView;
            }
            return this.m;
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            return frameLayout;
        }
        this.f = new ImageView(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xcs.a(context, 32.0f), xcs.a(context, 32.0f));
        layoutParams.rightMargin = xcs.a(context, 12.0f);
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setBackgroundResource(R.drawable.tms_pub_square_bg_dark);
        frameLayout2.addView(this.f);
        les.d(frameLayout2, 0L, new PubAddIconAction$getView$2$2(this), 1, null);
        this.e = frameLayout2;
        ImageView imageView = this.f;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.width = xcs.a(context, 28.0f);
                layoutParams3.height = xcs.a(context, 28.0f);
                layoutParams3.gravity = 17;
                imageView.setLayoutParams(layoutParams3);
                imageView.setImageResource(R.drawable.tms_pub_add_home_light);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        FrameLayout frameLayout3 = this.e;
        if (frameLayout3 != null) {
            frameLayout3.setTag(TAG);
        }
        return this.e;
    }

    @Override // tb.a90
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.m();
        CommonExtKt.l(this.k);
        PubAddIconGuide pubAddIconGuide = this.h;
        if (pubAddIconGuide != null) {
            pubAddIconGuide.g();
        }
    }

    @Override // tb.a90
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            return;
        }
        super.n();
        CommonExtKt.l(this.k);
        PubAddIconGuide pubAddIconGuide = this.h;
        if (pubAddIconGuide != null) {
            pubAddIconGuide.j();
        }
    }

    @Override // tb.a90
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.o();
        z();
    }

    public final void z() {
        String stayTime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efd59dc", new Object[]{this});
        } else if (k() != null && !this.j) {
            PubAddIconTipsModel pubAddIconTipsModel = this.g;
            int i = 2;
            if (!(pubAddIconTipsModel == null || (stayTime = pubAddIconTipsModel.getStayTime()) == null)) {
                i = Integer.parseInt(stayTime);
            }
            long currentTimeMillis = System.currentTimeMillis() - this.i;
            long j = i * 1000;
            if (currentTimeMillis > j) {
                CommonExtKt.p(this.k, 300L);
            } else {
                CommonExtKt.p(this.k, j - currentTimeMillis);
            }
        }
    }

    public /* synthetic */ PubAddIconAction(PubUserGuideModule pubUserGuideModule, b bVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : pubUserGuideModule, (i & 2) != 0 ? null : bVar);
    }

    public final void A(ITMSPage iTMSPage, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed0816c", new Object[]{this, iTMSPage, str});
            return;
        }
        PubAddIconGuide pubAddIconGuide = this.h;
        if (pubAddIconGuide != null) {
            if (q9s.n4()) {
                PubAddIconActionView pubAddIconActionView = this.m;
                PubAddIconGuide.PubAddIconGuideType pubAddIconGuideType = PubAddIconGuide.PubAddIconGuideType.DETAIL_FAVOR_TIPS;
                String L = iTMSPage.getInstance().L();
                ckf.f(L, "page.getInstance().appId");
                z = pubAddIconGuide.k(pubAddIconActionView, pubAddIconGuideType, L, str);
            } else {
                FrameLayout frameLayout = this.e;
                PubAddIconGuide.PubAddIconGuideType pubAddIconGuideType2 = PubAddIconGuide.PubAddIconGuideType.DETAIL_FAVOR_TIPS;
                String L2 = iTMSPage.getInstance().L();
                ckf.f(L2, "page.getInstance().appId");
                z = pubAddIconGuide.k(frameLayout, pubAddIconGuideType2, L2, str);
            }
            if (z) {
                PubContainerContext pubContainerContext = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
                if (pubContainerContext != null) {
                    pubContainerContext.setAddIconGuideIsShowing(true);
                }
                PubContainerContext pubContainerContext2 = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
                if (pubContainerContext2 != null) {
                    pubContainerContext2.setAddIconTipsDisplayInApp(true);
                }
                this.j = true;
            }
        }
    }

    public final void B(ITMSPage iTMSPage, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126005ad", new Object[]{this, iTMSPage, str});
        } else if (iTMSPage.getInstance().c0().isFragmentContainer()) {
            TMSLogger.b(TAG, "Fragment 下关闭底部 Pop");
        } else {
            PubAddIconGuide pubAddIconGuide = this.h;
            if (pubAddIconGuide != null) {
                if (q9s.n4()) {
                    PubAddIconActionView pubAddIconActionView = this.m;
                    PubAddIconGuide.PubAddIconGuideType pubAddIconGuideType = PubAddIconGuide.PubAddIconGuideType.DETAIL_BOTTOM_TIPS;
                    String L = iTMSPage.getInstance().L();
                    ckf.f(L, "page.getInstance().appId");
                    z = pubAddIconGuide.k(pubAddIconActionView, pubAddIconGuideType, L, str);
                } else {
                    FrameLayout frameLayout = this.e;
                    PubAddIconGuide.PubAddIconGuideType pubAddIconGuideType2 = PubAddIconGuide.PubAddIconGuideType.DETAIL_BOTTOM_TIPS;
                    String L2 = iTMSPage.getInstance().L();
                    ckf.f(L2, "page.getInstance().appId");
                    z = pubAddIconGuide.k(frameLayout, pubAddIconGuideType2, L2, str);
                }
                if (z) {
                    PubContainerContext pubContainerContext = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
                    if (pubContainerContext != null) {
                        pubContainerContext.setAddIconGuideIsShowing(true);
                    }
                    PubContainerContext pubContainerContext2 = (PubContainerContext) iTMSPage.getInstance().g(PubContainerContext.class);
                    if (pubContainerContext2 != null) {
                        pubContainerContext2.setAddIconTipsDisplayInApp(true);
                    }
                    this.j = true;
                }
            }
        }
    }

    public void y(PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55850761", new Object[]{this, pubUserGuideModule});
            return;
        }
        ckf.g(pubUserGuideModule, "userGuideModule");
        ITMSPage k = k();
        if (k != null) {
            Activity I = k.getInstance().I();
            ckf.f(I, "page.getInstance().activity");
            t3n t3nVar = new t3n(I, pubUserGuideModule, null, 4, null);
            PubAddIconGuide pubAddIconGuide = this.h;
            if (pubAddIconGuide != null) {
                pubAddIconGuide.j();
            }
            b bVar = this.d;
            if (bVar != null) {
                bVar.hasClickAddIcon();
            }
            PubContainerContext pubContainerContext = (PubContainerContext) k.getInstance().g(PubContainerContext.class);
            if (pubContainerContext != null) {
                pubContainerContext.setHasClickAddIconButton(true);
            }
            t3nVar.a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f13706a;

        public c(ITMSPage iTMSPage) {
            this.f13706a = iTMSPage;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule != null) {
                v3n.b("Page_MiniApp_Show-NavBar-2", kotlin.collections.a.k(jpu.a("miniapp_id", this.f13706a.getInstance().L()), jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule)), jpu.a("spm", "Page_MiniApp.1.NavBar.2"), jpu.a(pl4.KEY_PAGE_ID, this.f13706a.getPageParams().e().g()), jpu.a("pageUrl", this.f13706a.c())));
            }
        }
    }

    public PubAddIconAction(PubUserGuideModule pubUserGuideModule, b bVar) {
        this.c = pubUserGuideModule;
        this.d = bVar;
        this.g = pubUserGuideModule == null ? null : pubUserGuideModule.getAddIconTips();
        if (pubUserGuideModule != null) {
            pubUserGuideModule.getUserActiveIconChangeGuidePopup();
        }
        this.i = System.currentTimeMillis();
        this.k = new d();
    }

    @Override // tb.a90
    public void q(Window.Theme theme) {
        PubAddIconActionView pubAddIconActionView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        super.q(theme);
        if (q9s.n4()) {
            int i = e.$EnumSwitchMapping$0[theme.ordinal()];
            if (i == 1) {
                PubAddIconActionView pubAddIconActionView2 = this.m;
                if (pubAddIconActionView2 != null) {
                    pubAddIconActionView2.setTheme(IActionViewTheme.Theme.LIGHT);
                }
            } else if (i == 2) {
                PubAddIconActionView pubAddIconActionView3 = this.m;
                if (pubAddIconActionView3 != null) {
                    pubAddIconActionView3.setTheme(IActionViewTheme.Theme.DARK);
                }
            } else if (i == 3 && (pubAddIconActionView = this.m) != null) {
                pubAddIconActionView.setTheme(IActionViewTheme.Theme.LIGHT);
            }
        } else if (theme == Window.Theme.LIGHT) {
            FrameLayout frameLayout = this.e;
            if (frameLayout != null) {
                frameLayout.setBackgroundResource(R.drawable.tms_pub_square_bg_dark);
            }
            ImageView imageView = this.f;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.tms_pub_add_home_light);
            }
        } else {
            FrameLayout frameLayout2 = this.e;
            if (frameLayout2 != null) {
                frameLayout2.setBackgroundResource(R.drawable.tms_pub_square_bg_white);
            }
            ImageView imageView2 = this.f;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.tms_pub_add_home_dark);
            }
        }
    }
}
