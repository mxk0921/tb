package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IImageAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import com.taobao.themis.pub_kit.widget.IActionViewTheme;
import com.taobao.themis.pub_kit.widget.PubButtonActionView;
import kotlin.Pair;
import tb.bbs;
import tb.fbs;
import tb.w2n;
import tb.y2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class w2n extends a90 implements kkb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "PubButtonAction";
    public FrameLayout c;
    public ImageView d;
    public String e;
    public String f;
    public Window.Theme g = Window.Theme.DARK;
    public PubButtonActionView m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(844103762);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(844103763);
            int[] iArr = new int[Window.Theme.values().length];
            iArr[Window.Theme.LIGHT.ordinal()] = 1;
            iArr[Window.Theme.DARK.ordinal()] = 2;
            iArr[Window.Theme.AUTO.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(844103761);
        t2o.a(835715176);
    }

    public static /* synthetic */ Object ipc$super(w2n w2nVar, String str, Object... objArr) {
        if (str.hashCode() == 485366694) {
            super.i((ITMSPage) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubButtonAction");
    }

    public static final /* synthetic */ ITMSPage r(w2n w2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("b5e9e0e5", new Object[]{w2nVar});
        }
        return w2nVar.k();
    }

    @Override // tb.kkb
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7450a19a", new Object[]{this})).booleanValue();
        }
        if (q9s.n4()) {
            PubButtonActionView pubButtonActionView = this.m;
            if (pubButtonActionView != null) {
                pubButtonActionView.setVisibility(0);
            }
        } else {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        }
        return true;
    }

    public final void b(Drawable drawable, View.OnClickListener onClickListener) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac0017a", new Object[]{this, drawable, onClickListener});
        } else if (!q9s.n4() && (imageView = this.d) != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
            imageView.setOnClickListener(new f(onClickListener));
        }
    }

    public final void c(String str, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19c2854", new Object[]{this, str, onClickListener});
        } else if (q9s.n4()) {
            PubButtonActionView pubButtonActionView = this.m;
            if (pubButtonActionView != null) {
                pubButtonActionView.setButtonIcon(str, str);
            }
            PubButtonActionView pubButtonActionView2 = this.m;
            if (pubButtonActionView2 != null) {
                pubButtonActionView2.setVisibility(0);
            }
            PubButtonActionView pubButtonActionView3 = this.m;
            if (pubButtonActionView3 != null) {
                pubButtonActionView3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.themis.pub.titlebar.action.PubButtonAction$setButton$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        bbs instance;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        ITMSPage r = w2n.r(w2n.this);
                        if (!(r == null || (instance = r.getInstance()) == null)) {
                            fbs.c(instance, new w2n.d());
                        }
                        View.OnClickListener onClickListener2 = onClickListener;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(view);
                        }
                    }
                });
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && !TextUtils.isEmpty(str)) {
                imageView.setVisibility(0);
                IImageAdapter iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class);
                if (iImageAdapter != null) {
                    ckf.d(str);
                    iImageAdapter.setImageUrl(imageView, str, null);
                }
                imageView.setOnClickListener(new e(onClickListener));
            }
        }
    }

    @Override // tb.kkb
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e195519f", new Object[]{this})).booleanValue();
        }
        if (q9s.n4()) {
            PubButtonActionView pubButtonActionView = this.m;
            if (pubButtonActionView != null) {
                pubButtonActionView.setVisibility(8);
            }
        } else {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
        return true;
    }

    @Override // tb.kkb
    public void h(String str, String str2, View.OnClickListener onClickListener) {
        IImageAdapter iImageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00f298a", new Object[]{this, str, str2, onClickListener});
        } else if (q9s.n4()) {
            PubButtonActionView pubButtonActionView = this.m;
            if (pubButtonActionView != null) {
                pubButtonActionView.setButtonIcon(str, str2);
            }
            PubButtonActionView pubButtonActionView2 = this.m;
            if (pubButtonActionView2 != null) {
                pubButtonActionView2.setVisibility(0);
            }
            PubButtonActionView pubButtonActionView3 = this.m;
            if (pubButtonActionView3 != null) {
                pubButtonActionView3.setOnClickListener(new g(onClickListener));
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null) {
                if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
                    this.e = str;
                    this.f = str2;
                    imageView.setVisibility(0);
                    String s = s(this.g);
                    if (!(s == null || s.length() == 0 || (iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class)) == null)) {
                        iImageAdapter.setImageUrl(imageView, s, null);
                    }
                    imageView.setOnClickListener(new h(onClickListener));
                }
            }
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
                PubButtonActionView pubButtonActionView = new PubButtonActionView(context);
                this.m = pubButtonActionView;
                pubButtonActionView.setTag(TAG);
            }
            return this.m;
        }
        if (this.c == null) {
            this.d = new ImageView(context);
            FrameLayout frameLayout = new FrameLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xcs.a(context, 32.0f), xcs.a(context, 32.0f));
            layoutParams.rightMargin = xcs.a(context, 12.0f);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setBackgroundResource(R.drawable.tms_pub_square_bg_white);
            frameLayout.addView(this.d);
            this.c = frameLayout;
            ImageView imageView = this.d;
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 != null) {
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.width = xcs.a(context, 28.0f);
                    layoutParams3.height = xcs.a(context, 28.0f);
                    layoutParams3.gravity = 17;
                    imageView.setLayoutParams(layoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            FrameLayout frameLayout2 = this.c;
            if (frameLayout2 != null) {
                frameLayout2.setTag(TAG);
            }
        }
        return this.c;
    }

    public final String s(Window.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a1b1350", new Object[]{this, theme});
        }
        String str = this.e;
        if (str == null || str.length() == 0) {
            return this.f;
        }
        String str2 = this.f;
        if (str2 == null || str2.length() == 0) {
            return this.e;
        }
        int i = b.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1) {
            return this.f;
        }
        if (i != 2) {
            return this.e;
        }
        return this.e;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View.OnClickListener b;

        public e(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            bbs instance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage r = w2n.r(w2n.this);
            if (!(r == null || (instance = r.getInstance()) == null)) {
                fbs.c(instance, new a(w2n.this));
            }
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements y2n.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ w2n f30415a;

            public a(w2n w2nVar) {
                this.f30415a = w2nVar;
            }

            @Override // tb.y2n.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule != null) {
                    ITMSPage r = w2n.r(this.f30415a);
                    ckf.d(r);
                    Pair a2 = jpu.a("miniapp_id", r.getInstance().L());
                    Pair a3 = jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule));
                    Pair a4 = jpu.a("spm", "Page_MiniApp.1.NavBar.5");
                    ITMSPage r2 = w2n.r(this.f30415a);
                    ckf.d(r2);
                    Pair a5 = jpu.a(pl4.KEY_PAGE_ID, r2.getPageParams().e().g());
                    ITMSPage r3 = w2n.r(this.f30415a);
                    ckf.d(r3);
                    v3n.a("Page_MiniApp_Button-NavBar-5", kotlin.collections.a.k(a2, a3, a4, a5, jpu.a("pageUrl", r3.c())));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View.OnClickListener b;

        public f(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            bbs instance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage r = w2n.r(w2n.this);
            if (!(r == null || (instance = r.getInstance()) == null)) {
                fbs.c(instance, new a(w2n.this));
            }
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements y2n.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ w2n f30417a;

            public a(w2n w2nVar) {
                this.f30417a = w2nVar;
            }

            @Override // tb.y2n.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule != null) {
                    ITMSPage r = w2n.r(this.f30417a);
                    ckf.d(r);
                    Pair a2 = jpu.a("miniapp_id", r.getInstance().L());
                    Pair a3 = jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule));
                    Pair a4 = jpu.a("spm", "Page_MiniApp.1.NavBar.5");
                    ITMSPage r2 = w2n.r(this.f30417a);
                    ckf.d(r2);
                    Pair a5 = jpu.a(pl4.KEY_PAGE_ID, r2.getPageParams().e().g());
                    ITMSPage r3 = w2n.r(this.f30417a);
                    ckf.d(r3);
                    v3n.a("Page_MiniApp_Button-NavBar-5", kotlin.collections.a.k(a2, a3, a4, a5, jpu.a("pageUrl", r3.c())));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class g implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View.OnClickListener b;

        public g(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            bbs instance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage r = w2n.r(w2n.this);
            if (!(r == null || (instance = r.getInstance()) == null)) {
                fbs.c(instance, new a(w2n.this));
            }
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements y2n.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ w2n f30419a;

            public a(w2n w2nVar) {
                this.f30419a = w2nVar;
            }

            @Override // tb.y2n.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule != null) {
                    ITMSPage r = w2n.r(this.f30419a);
                    ckf.d(r);
                    v3n.a("Page_MiniApp_Button-NavBar-5", kotlin.collections.a.k(jpu.a("miniapp_id", r.getInstance().L()), jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule)), jpu.a("spm", "Page_MiniApp.1.NavBar.5")));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View.OnClickListener b;

        public h(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            bbs instance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ITMSPage r = w2n.r(w2n.this);
            if (!(r == null || (instance = r.getInstance()) == null)) {
                fbs.c(instance, new a(w2n.this));
            }
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements y2n.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ w2n f30421a;

            public a(w2n w2nVar) {
                this.f30421a = w2nVar;
            }

            @Override // tb.y2n.b
            public void onResult(PubUserGuideModule pubUserGuideModule) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                } else if (pubUserGuideModule != null) {
                    ITMSPage r = w2n.r(this.f30421a);
                    ckf.d(r);
                    v3n.a("Page_MiniApp_Button-NavBar-5", kotlin.collections.a.k(jpu.a("miniapp_id", r.getInstance().L()), jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule)), jpu.a("spm", "Page_MiniApp.1.NavBar.5")));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ITMSPage f30412a;

        public c(ITMSPage iTMSPage) {
            this.f30412a = iTMSPage;
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule != null) {
                v3n.b("Page_MiniApp_Show-NavBar-5", kotlin.collections.a.k(jpu.a("miniapp_id", this.f30412a.getInstance().L()), jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule)), jpu.a("spm", "Page_MiniApp.1.NavBar.5"), jpu.a(pl4.KEY_PAGE_ID, this.f30412a.getPageParams().e().g()), jpu.a("pageUrl", this.f30412a.c())));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements y2n.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.y2n.b
        public void onResult(PubUserGuideModule pubUserGuideModule) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
            } else if (pubUserGuideModule != null) {
                ITMSPage r = w2n.r(w2n.this);
                ckf.d(r);
                Pair a2 = jpu.a("miniapp_id", r.getInstance().L());
                Pair a3 = jpu.a(tm2.HOME_BUCKETS, u3n.a(pubUserGuideModule));
                Pair a4 = jpu.a("spm", "Page_MiniApp.1.NavBar.5");
                ITMSPage r2 = w2n.r(w2n.this);
                ckf.d(r2);
                Pair a5 = jpu.a(pl4.KEY_PAGE_ID, r2.getPageParams().e().g());
                ITMSPage r3 = w2n.r(w2n.this);
                ckf.d(r3);
                v3n.a("Page_MiniApp_Button-NavBar-5", kotlin.collections.a.k(a2, a3, a4, a5, jpu.a("pageUrl", r3.c())));
            }
        }
    }

    @Override // tb.a90
    public void q(Window.Theme theme) {
        ImageView imageView;
        IImageAdapter iImageAdapter;
        PubButtonActionView pubButtonActionView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4570c", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "style");
        this.g = theme;
        if (q9s.n4()) {
            int i = b.$EnumSwitchMapping$0[theme.ordinal()];
            if (i == 1) {
                PubButtonActionView pubButtonActionView2 = this.m;
                if (pubButtonActionView2 != null) {
                    pubButtonActionView2.setTheme(IActionViewTheme.Theme.LIGHT);
                }
            } else if (i == 2) {
                PubButtonActionView pubButtonActionView3 = this.m;
                if (pubButtonActionView3 != null) {
                    pubButtonActionView3.setTheme(IActionViewTheme.Theme.DARK);
                }
            } else if (i == 3 && (pubButtonActionView = this.m) != null) {
                pubButtonActionView.setTheme(IActionViewTheme.Theme.LIGHT);
            }
        } else {
            if (Window.Theme.LIGHT == theme) {
                FrameLayout frameLayout = this.c;
                if (!(frameLayout == null || frameLayout == null)) {
                    frameLayout.setBackgroundResource(R.drawable.tms_pub_square_bg_dark);
                }
            } else {
                FrameLayout frameLayout2 = this.c;
                if (frameLayout2 != null) {
                    frameLayout2.setBackgroundResource(R.drawable.tms_pub_square_bg_white);
                }
            }
            String s = s(theme);
            if (s != null && (imageView = this.d) != null && (iImageAdapter = (IImageAdapter) p8s.b(IImageAdapter.class)) != null) {
                iImageAdapter.setImageUrl(imageView, s, null);
            }
        }
    }
}
