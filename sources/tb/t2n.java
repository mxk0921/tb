package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.pub_kit.widget.IActionViewTheme;
import com.taobao.themis.pub_kit.widget.PubBackActionView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Pair;
import tb.y2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class t2n extends a90 implements xhb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final d Companion = new d(null);
    public static final String TAG = "PubBackAction";
    public FrameLayout c;
    public View.OnClickListener d;
    public TUrlImageView e;
    public PubBackActionView m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d {
        static {
            t2o.a(844103751);
        }

        public /* synthetic */ d(a07 a07Var) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(844103752);
            int[] iArr = new int[Window.Theme.values().length];
            iArr[Window.Theme.LIGHT.ordinal()] = 1;
            iArr[Window.Theme.DARK.ordinal()] = 2;
            iArr[Window.Theme.AUTO.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public f(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (t2n.r(t2n.this) != null) {
                View.OnClickListener r = t2n.r(t2n.this);
                if (r != null) {
                    r.onClick(view);
                }
            } else {
                Context context = this.b;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public g(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (t2n.r(t2n.this) != null) {
                View.OnClickListener r = t2n.r(t2n.this);
                if (r != null) {
                    r.onClick(view);
                }
            } else {
                Context context = this.b;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }
    }

    static {
        t2o.a(844103750);
        t2o.a(835715174);
    }

    public static /* synthetic */ Object ipc$super(t2n t2nVar, String str, Object... objArr) {
        if (str.hashCode() == 485366694) {
            super.i((ITMSPage) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubBackAction");
    }

    public static final /* synthetic */ View.OnClickListener r(t2n t2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("76cbb1c5", new Object[]{t2nVar});
        }
        return t2nVar.d;
    }

    public static final /* synthetic */ ITMSPage s(t2n t2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("6759d99a", new Object[]{t2nVar});
        }
        return t2nVar.k();
    }

    @Override // tb.xhb
    public boolean hideBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb73ce6", new Object[]{this})).booleanValue();
        }
        if (q9s.n4()) {
            PubBackActionView pubBackActionView = this.m;
            if (pubBackActionView != null) {
                pubBackActionView.setVisibility(4);
            }
        } else {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
            }
        }
        return true;
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
        fbs.c(iTMSPage.getInstance(), new a(iTMSPage));
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
                PubBackActionView pubBackActionView = new PubBackActionView(context);
                pubBackActionView.setOnClickListener(new f(context));
                pubBackActionView.setTag(TAG);
                this.m = pubBackActionView;
            }
            return this.m;
        }
        if (this.c == null) {
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xcs.a(context, 32.0f), xcs.a(context, 32.0f));
            layoutParams.gravity = 17;
            layoutParams.leftMargin = xcs.a(context, 5.0f);
            tUrlImageView.setLayoutParams(layoutParams);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.e = tUrlImageView;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(xcs.a(context, 44.0f), xcs.a(context, 44.0f)));
            frameLayout.setContentDescription("返回");
            frameLayout.addView(this.e);
            frameLayout.setOnClickListener(new g(context));
            this.c = frameLayout;
            frameLayout.setTag(TAG);
        }
        return this.c;
    }

    @Override // tb.xhb
    public boolean showBackButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2041761", new Object[]{this})).booleanValue();
        }
        if (q9s.n4()) {
            PubBackActionView pubBackActionView = this.m;
            if (pubBackActionView != null) {
                pubBackActionView.setVisibility(0);
            }
        } else {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        }
        return true;
    }

    public void t(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20cc06fe", new Object[]{this, onClickListener});
            return;
        }
        ckf.g(onClickListener, "clickListener");
        this.d = onClickListener;
        if (q9s.n4()) {
            PubBackActionView pubBackActionView = this.m;
            if (pubBackActionView != null) {
                pubBackActionView.setOnClickListener(new c());
                return;
            }
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new h());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            bbs instance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage s = t2n.s(t2n.this);
            if (!(s == null || (instance = s.getInstance()) == null)) {
                fbs.c(instance, new a(t2n.this));
            }
            View.OnClickListener r = t2n.r(t2n.this);
            if (r != null) {
                r.onClick(view);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements y2n.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ t2n f28435a;

            public a(t2n t2nVar) {
                this.f28435a = t2nVar;
            }

            @Override // tb.y2n.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule != null) {
                    ITMSPage s = t2n.s(this.f28435a);
                    ckf.d(s);
                    Pair a2 = jpu.a("miniapp_id", s.getInstance().L());
                    Pair a3 = jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule));
                    Pair a4 = jpu.a("spm", "Page_MiniApp.1.NavBar.1");
                    ITMSPage s2 = t2n.s(this.f28435a);
                    ckf.d(s2);
                    Pair a5 = jpu.a(pl4.KEY_PAGE_ID, s2.getPageParams().e().g());
                    ITMSPage s3 = t2n.s(this.f28435a);
                    ckf.d(s3);
                    v3n.a("Page_MiniApp_Button-NavBar-1", kotlin.collections.a.k(a2, a3, a4, a5, jpu.a("pageUrl", s3.c())));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            bbs instance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage s = t2n.s(t2n.this);
            if (!(s == null || (instance = s.getInstance()) == null)) {
                fbs.c(instance, new a(t2n.this));
            }
            View.OnClickListener r = t2n.r(t2n.this);
            if (r != null) {
                r.onClick(view);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements y2n.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ t2n f28439a;

            public a(t2n t2nVar) {
                this.f28439a = t2nVar;
            }

            @Override // tb.y2n.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule != null) {
                    ITMSPage s = t2n.s(this.f28439a);
                    ckf.d(s);
                    Pair a2 = jpu.a("miniapp_id", s.getInstance().L());
                    Pair a3 = jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule));
                    Pair a4 = jpu.a("spm", "Page_MiniApp.1.NavBar.1");
                    ITMSPage s2 = t2n.s(this.f28439a);
                    ckf.d(s2);
                    Pair a5 = jpu.a(pl4.KEY_PAGE_ID, s2.getPageParams().e().g());
                    ITMSPage s3 = t2n.s(this.f28439a);
                    ckf.d(s3);
                    v3n.a("Page_MiniApp_Button-NavBar-1", kotlin.collections.a.k(a2, a3, a4, a5, jpu.a("pageUrl", s3.c())));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f28433a;

        public a(ITMSPage iTMSPage) {
            this.f28433a = iTMSPage;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule != null) {
                v3n.b("Page_MiniApp_Show-NavBar-1", kotlin.collections.a.k(jpu.a("miniapp_id", this.f28433a.getInstance().L()), jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule)), jpu.a("spm", "Page_MiniApp.1.NavBar.1"), jpu.a(pl4.KEY_PAGE_ID, this.f28433a.getPageParams().e().g()), jpu.a("pageUrl", this.f28433a.c())));
            }
        }
    }

    @Override // tb.a90
    public void q(Window.Theme theme) {
        String str;
        PubBackActionView pubBackActionView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        if (q9s.n4()) {
            int i = e.$EnumSwitchMapping$0[theme.ordinal()];
            if (i == 1) {
                PubBackActionView pubBackActionView2 = this.m;
                if (pubBackActionView2 != null) {
                    pubBackActionView2.setTheme(IActionViewTheme.Theme.LIGHT);
                }
            } else if (i == 2) {
                PubBackActionView pubBackActionView3 = this.m;
                if (pubBackActionView3 != null) {
                    pubBackActionView3.setTheme(IActionViewTheme.Theme.DARK);
                }
            } else if (i == 3 && (pubBackActionView = this.m) != null) {
                pubBackActionView.setTheme(IActionViewTheme.Theme.LIGHT);
            }
        } else {
            TUrlImageView tUrlImageView = this.e;
            if (tUrlImageView != null) {
                if (Window.Theme.LIGHT == theme) {
                    str = "https://gw.alicdn.com/imgextra/i2/O1CN01P6gSa71i3YOxUkLZs_!!6000000004357-2-tps-90-90.png";
                } else {
                    str = "https://gw.alicdn.com/imgextra/i2/O1CN01xOOyIU22I1E953tud_!!6000000007096-2-tps-90-90.png";
                }
                tUrlImageView.setImageUrl(str);
            }
        }
    }
}
