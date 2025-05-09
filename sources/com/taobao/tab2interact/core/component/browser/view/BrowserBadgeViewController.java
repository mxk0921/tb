package com.taobao.tab2interact.core.component.browser.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import com.taobao.tab2interact.core.component.browser.view.AmountRollView;
import com.taobao.tab2interact.core.component.browser.view.BrowserBadgeRootView;
import com.taobao.tab2interact.core.component.browser.view.CircleProgressView;
import com.taobao.tab2interact.core.component.browser.view.CroppedRoundCornerFrameLayout;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import tb.cy0;
import tb.fru;
import tb.fy0;
import tb.j0r;
import tb.nwv;
import tb.s6o;
import tb.s8d;
import tb.sgw;
import tb.t2o;
import tb.vgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BrowserBadgeViewController implements CircleProgressView.c, AmountRollView.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAYOUT_BOTTOM_COMPONENT_TO_PROGRESS_BAR_HORIZONTAL_DISTANCE = 0;
    public static final int LAYOUT_BOTTOM_COMPONENT_TO_PROGRESS_BAR_VERTICAL_DISTANCE = 34;
    public BrowserBadgeModel.BrowserBadgeViewModel A;
    public BrowserBadgeModel.BrowserBadgeViewModel.PicModel B;
    public boolean D;
    public long E;
    public long F;
    public BrowserBadgeModel.TaskType H;
    public boolean I;
    public boolean J;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11815a;
    public BrowserBadgeRootView b;
    public LinearLayout c;
    public TUrlImageView d;
    public TextView e;
    public FrameLayout f;
    public LinearLayout g;
    public TextView h;
    public TextView i;
    public CircleProgressView j;
    public TUrlImageView k;
    public cy0 l;
    public TUrlImageView m;
    public AmountRollView n;
    public FrameLayout o;
    public TextView p;
    public List<TextSwitcher> q;
    public TextView r;
    public FrameLayout s;
    public TextView t;
    public TUrlImageView u;
    public TUrlImageView v;
    public TUrlImageView w;
    public CroppedRoundCornerFrameLayout x;
    public h z;
    public static final int K = s6o.S(Globals.getApplication(), 90);
    public static int L = Integer.MIN_VALUE;
    public static int M = Integer.MIN_VALUE;
    public boolean y = true;
    public int C = -1;
    public long G = Long.MAX_VALUE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements CroppedRoundCornerFrameLayout.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfcb726c", new Object[]{this, new Boolean(z)});
            } else if (BrowserBadgeViewController.b(BrowserBadgeViewController.this) != null) {
                BrowserBadgeViewController.b(BrowserBadgeViewController.this).d(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fy0 f11818a;

        public c(fy0 fy0Var) {
            this.f11818a = fy0Var;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable instanceof cy0) {
                vgh.c(this, "BrowserBadgeViewController", "初始化View，中部组件动图加载完毕");
                BrowserBadgeViewController.g(BrowserBadgeViewController.this).setVisibility(4);
                BrowserBadgeViewController.h(BrowserBadgeViewController.this).setVisibility(0);
                BrowserBadgeViewController.d(BrowserBadgeViewController.this, (cy0) drawable);
                BrowserBadgeViewController.c(BrowserBadgeViewController.this).A(this.f11818a);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements BrowserBadgeRootView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
            } else if (i == 0 && BrowserBadgeViewController.b(BrowserBadgeViewController.this) != null) {
                BrowserBadgeViewController.b(BrowserBadgeViewController.this).i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (BrowserBadgeViewController.b(BrowserBadgeViewController.this) != null) {
                BrowserBadgeViewController.b(BrowserBadgeViewController.this).g();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f11821a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        public f(TextView textView, String str, int i) {
            this.f11821a = textView;
            this.b = str;
            this.c = i;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/view/BrowserBadgeViewController$7");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            BrowserBadgeViewController.j(BrowserBadgeViewController.this, this.f11821a, this.b, this.c);
            BrowserBadgeViewController.k(BrowserBadgeViewController.this, this.f11821a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(BrowserBadgeViewController browserBadgeViewController) {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/component/browser/view/BrowserBadgeViewController$8");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                super.onAnimationEnd(animator);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface h {
        void a(float f, long j, long j2, long j3);

        void d(boolean z);

        void f(BrowserBadgeModel.TaskType taskType);

        void g();

        void i();

        void j(int i, int i2, long j, long j2, long j3);
    }

    static {
        t2o.a(689963065);
        t2o.a(689963078);
        t2o.a(689963062);
    }

    public BrowserBadgeViewController(Context context) {
        this.f11815a = context;
        F(context);
    }

    public static void B() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f93a93", new Object[0]);
            return;
        }
        Pair<Integer, Integer> i = j0r.i();
        if (i != null && (obj = i.first) != null && i.second != null) {
            L = ((Integer) obj).intValue();
            M = ((Integer) i.second).intValue();
        }
    }

    public static /* synthetic */ h b(BrowserBadgeViewController browserBadgeViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("8d4a52c6", new Object[]{browserBadgeViewController});
        }
        return browserBadgeViewController.z;
    }

    public static /* synthetic */ cy0 c(BrowserBadgeViewController browserBadgeViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cy0) ipChange.ipc$dispatch("913737b6", new Object[]{browserBadgeViewController});
        }
        return browserBadgeViewController.l;
    }

    public static /* synthetic */ cy0 d(BrowserBadgeViewController browserBadgeViewController, cy0 cy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cy0) ipChange.ipc$dispatch("7422fbb7", new Object[]{browserBadgeViewController, cy0Var});
        }
        browserBadgeViewController.l = cy0Var;
        return cy0Var;
    }

    public static /* synthetic */ BrowserBadgeModel.BrowserBadgeViewModel.PicModel e(BrowserBadgeViewController browserBadgeViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel.BrowserBadgeViewModel.PicModel) ipChange.ipc$dispatch("46f6c08e", new Object[]{browserBadgeViewController});
        }
        return browserBadgeViewController.B;
    }

    public static /* synthetic */ void f(BrowserBadgeViewController browserBadgeViewController, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37534401", new Object[]{browserBadgeViewController, str, str2, str3});
        } else {
            browserBadgeViewController.P(str, str2, str3);
        }
    }

    public static /* synthetic */ TUrlImageView g(BrowserBadgeViewController browserBadgeViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("5d77add8", new Object[]{browserBadgeViewController});
        }
        return browserBadgeViewController.m;
    }

    public static /* synthetic */ TUrlImageView h(BrowserBadgeViewController browserBadgeViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9dd02ef7", new Object[]{browserBadgeViewController});
        }
        return browserBadgeViewController.k;
    }

    public static /* synthetic */ Context i(BrowserBadgeViewController browserBadgeViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d3a00b1e", new Object[]{browserBadgeViewController});
        }
        return browserBadgeViewController.f11815a;
    }

    public static /* synthetic */ void j(BrowserBadgeViewController browserBadgeViewController, TextView textView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45465e9c", new Object[]{browserBadgeViewController, textView, str, new Integer(i)});
        } else {
            browserBadgeViewController.V(textView, str, i);
        }
    }

    public static /* synthetic */ void k(BrowserBadgeViewController browserBadgeViewController, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b8929c", new Object[]{browserBadgeViewController, textView});
        } else {
            browserBadgeViewController.n(textView);
        }
    }

    public static int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72086d29", new Object[0])).intValue();
        }
        if (M < 0) {
            B();
        }
        return Math.max(0, M);
    }

    public static int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e66662", new Object[0])).intValue();
        }
        if (L < 0) {
            B();
        }
        return Math.max(0, L);
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db68f699", new Object[]{this});
        } else if (this.o == null) {
            ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.browser_badge_center_component_top_bottom_stub);
            viewStub.setLayoutResource(R.layout.browser_badge_center_component_top_bottom_layout);
            FrameLayout frameLayout = (FrameLayout) viewStub.inflate();
            this.o = frameLayout;
            this.p = (TextView) frameLayout.findViewById(R.id.top_text);
            ArrayList arrayList = new ArrayList();
            this.q = arrayList;
            arrayList.add((TextSwitcher) this.o.findViewById(R.id.bottom_countdown_minute_tens));
            this.q.add((TextSwitcher) this.o.findViewById(R.id.bottom_countdown_minute_ones));
            this.q.add((TextSwitcher) this.o.findViewById(R.id.bottom_countdown_second_tens));
            this.q.add((TextSwitcher) this.o.findViewById(R.id.bottom_countdown_second_ones));
            this.r = (TextView) this.o.findViewById(R.id.bottom_countdown_colon);
            ((FrameLayout.LayoutParams) this.p.getLayoutParams()).topMargin = s6o.S(this.f11815a, 12);
            this.p.setTextSize(0, s6o.S(this.f11815a, 20));
            ((FrameLayout.LayoutParams) ((LinearLayout) this.o.findViewById(R.id.bottom_countdown)).getLayoutParams()).topMargin = s6o.S(this.f11815a, 38);
            ViewSwitcher.ViewFactory viewFactory = new ViewSwitcher.ViewFactory() { // from class: com.taobao.tab2interact.core.component.browser.view.BrowserBadgeViewController.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.ViewSwitcher.ViewFactory
                public View makeView() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (View) ipChange2.ipc$dispatch("f2361e7c", new Object[]{this});
                    }
                    TextView textView = new TextView(BrowserBadgeViewController.i(BrowserBadgeViewController.this));
                    textView.setLayoutParams(new FrameLayout.LayoutParams(-2, s6o.S(BrowserBadgeViewController.i(BrowserBadgeViewController.this), 18)));
                    textView.setTextSize(0, s6o.S(BrowserBadgeViewController.i(BrowserBadgeViewController.this), 20));
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                    textView.setPadding(0, s6o.S(BrowserBadgeViewController.i(BrowserBadgeViewController.this), -6), 0, 0);
                    return textView;
                }
            };
            for (TextSwitcher textSwitcher : this.q) {
                if (textSwitcher != null) {
                    textSwitcher.setFactory(viewFactory);
                }
            }
            ((LinearLayout.LayoutParams) this.r.getLayoutParams()).height = s6o.S(this.f11815a, 18);
            this.r.setTextSize(0, s6o.S(this.f11815a, 20));
            this.r.setPadding(0, s6o.S(this.f11815a, -6), 0, 0);
        }
    }

    public void C(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e318e4", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        CircleProgressView circleProgressView = this.j;
        if (circleProgressView != null) {
            circleProgressView.init(j, j2, false);
            vgh.c(this, "BrowserBadgeViewController", "初始化进度条，totalDuration=" + j2 + "，accumulatedDuration=" + j + "，hashcode=" + hashCode());
        }
    }

    public void D() {
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel;
        BrowserBadgeModel.BrowserBadgeViewModel.h hVar;
        BrowserBadgeModel.BrowserBadgeViewModel.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9330569f", new Object[]{this});
            return;
        }
        CircleProgressView circleProgressView = this.j;
        if (circleProgressView != null && (browserBadgeViewModel = this.A) != null && (hVar = browserBadgeViewModel.b) != null && (dVar = hVar.g) != null) {
            circleProgressView.init(0L, dVar.b, true);
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f529", new Object[]{this});
        } else if (this.c == null) {
            ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.browser_badge_top_component_stub);
            viewStub.setLayoutResource(R.layout.browser_badge_top_component_layout);
            LinearLayout linearLayout = (LinearLayout) viewStub.inflate();
            this.c = linearLayout;
            this.d = (TUrlImageView) linearLayout.findViewById(R.id.browser_badge_top_component_icon);
            TextView textView = (TextView) this.c.findViewById(R.id.browser_badge_top_component_text);
            this.e = textView;
            textView.setTextSize(0, s6o.S(this.f11815a, 32));
        }
    }

    public final void F(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        BrowserBadgeRootView browserBadgeRootView = (BrowserBadgeRootView) LayoutInflater.from(context).inflate(R.layout.browser_badge_layout, (ViewGroup) null);
        this.b = browserBadgeRootView;
        this.f = (FrameLayout) browserBadgeRootView.findViewById(R.id.browser_badge_center_component);
        this.g = (LinearLayout) this.b.findViewById(R.id.browser_badge_center_component_text_container);
        this.h = (TextView) this.b.findViewById(R.id.browser_badge_center_component_text);
        this.i = (TextView) this.b.findViewById(R.id.browser_badge_center_component_text_description);
        this.j = (CircleProgressView) this.b.findViewById(R.id.browser_badge_center_component_circle_progress_view);
        this.k = (TUrlImageView) this.b.findViewById(R.id.browser_badge_center_component_image_apng);
        this.m = (TUrlImageView) this.b.findViewById(R.id.browser_badge_center_component_image_png);
        this.n = (AmountRollView) this.b.findViewById(R.id.browser_badge_center_component_amount_roll_view);
        this.k.setSkipAutoSize(true);
        this.k.succListener(new c(new b()));
        FrameLayout frameLayout = this.f;
        int i = K;
        R(frameLayout, i, i, GravityCompat.END);
        R(this.j, i, i, 17);
        if (this.f.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.topMargin = s6o.S(this.f11815a, 48);
            layoutParams.bottomMargin = s6o.S(this.f11815a, 8);
            this.f.setLayoutParams(layoutParams);
        }
        this.h.setTextSize(0, s6o.S(this.f11815a, 26));
        this.h.setTypeface(fru.c(this.f11815a, "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf", null, false, false));
        this.i.setTextSize(0, s6o.S(this.f11815a, 18));
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.n.setVisibility(8);
        this.j.setProgressListener(this);
        this.n.setAmountRollChangedListener(this);
        this.b.setOnVisibilityChangedListener(new d());
        this.b.setOnClickListener(new e());
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4829f80", new Object[]{this})).booleanValue();
        }
        CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = this.x;
        if (croppedRoundCornerFrameLayout == null || !croppedRoundCornerFrameLayout.isVisible() || !this.y) {
            return false;
        }
        return true;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5645218e", new Object[]{this})).booleanValue();
        }
        BrowserBadgeRootView browserBadgeRootView = this.b;
        if (browserBadgeRootView == null || browserBadgeRootView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void I(int i, int i2, long j, long j2, long j3) {
        BrowserBadgeModel.BrowserBadgeViewModel.h hVar;
        BrowserBadgeModel.BrowserBadgeViewModel.b bVar;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2533a5dd", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.A;
        if (!(browserBadgeViewModel == null || (hVar = browserBadgeViewModel.b) == null || (bVar = hVar.f) == null || i == this.C || i <= 0 || (i3 = bVar.e) <= 0 || i % i3 != 0)) {
            X();
        }
        this.C = i;
        h hVar2 = this.z;
        if (hVar2 != null) {
            hVar2.j(i, i2, j, j2, j3);
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8009a692", new Object[]{this});
            return;
        }
        AmountRollView amountRollView = this.n;
        if (amountRollView != null) {
            amountRollView.pauseAmountRoll();
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98afa14a", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "暂停进度条");
        CircleProgressView circleProgressView = this.j;
        if (circleProgressView != null) {
            circleProgressView.pause();
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209251a0", new Object[]{this});
            return;
        }
        this.C = -1;
        this.E = 0L;
        this.F = 0L;
        this.G = Long.MAX_VALUE;
        this.H = null;
    }

    public void M(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22aa8d4d", new Object[]{this, hVar});
        } else {
            this.z = hVar;
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c92339", new Object[]{this});
            return;
        }
        long ceil = (long) Math.ceil(this.E / 1000.0d);
        this.F = ceil;
        if (ceil < 0) {
            this.F = 0L;
        }
    }

    public void Q(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f10920", new Object[]{this, browserBadgeViewModel});
        } else if (browserBadgeViewModel == null) {
            vgh.c(this, "BrowserBadgeViewController", "【setData】BrowserBadgeViewModel is null");
        } else {
            this.A = browserBadgeViewModel;
            vgh.c(this, "BrowserBadgeViewController", "【setData】BrowserBadgeViewModel");
            e0(browserBadgeViewModel);
            g0(browserBadgeViewModel);
            d0(browserBadgeViewModel);
            f0(browserBadgeViewModel);
        }
    }

    public final void R(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e16562a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i || layoutParams.height != i2) {
            layoutParams.width = i;
            layoutParams.height = i2;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = i3;
            }
            view.setLayoutParams(layoutParams);
            vgh.c(this, "BrowserBadgeViewController", "设置布局参数，pixelWidth=" + i + "，pixelHeight=" + i2);
        }
    }

    public final void S(View view, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb7636", new Object[]{this, view, str, str2, new Integer(i)});
        } else {
            R(view, s6o.T(this.f11815a, str), s6o.T(this.f11815a, str2), i);
        }
    }

    public void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fcad5", new Object[]{this, new Boolean(z)});
        } else if (this.y != z) {
            this.y = z;
            CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = this.x;
            if (croppedRoundCornerFrameLayout != null) {
                croppedRoundCornerFrameLayout.setEnable(z);
            }
        }
    }

    public final void U(List<TextSwitcher> list, String str, int i) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61df0ed3", new Object[]{this, list, str, new Integer(i)});
        } else if (list != null && str != null && (size = list.size()) <= str.length()) {
            for (int i2 = 0; i2 < size; i2++) {
                TextSwitcher textSwitcher = list.get(i2);
                if (textSwitcher != null) {
                    textSwitcher.setCurrentText(str.substring(i2, i2 + 1));
                    TextView textView = (TextView) textSwitcher.getCurrentView();
                    if (textView != null) {
                        textView.setTextColor(i);
                    }
                    TextView textView2 = (TextView) textSwitcher.getNextView();
                    if (textView2 != null) {
                        textView2.setTextColor(i);
                    }
                }
            }
        }
    }

    public final void V(TextView textView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7055fb0", new Object[]{this, textView, str, new Integer(i)});
        } else if (textView != null) {
            textView.setText(str);
            textView.setTextColor(i);
        }
    }

    public void W(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144c01c2", new Object[]{this, new Boolean(z)});
            return;
        }
        BrowserBadgeRootView browserBadgeRootView = this.b;
        if (browserBadgeRootView == null) {
            return;
        }
        if (z) {
            browserBadgeRootView.setVisibility(0);
        } else {
            browserBadgeRootView.setVisibility(8);
        }
    }

    public void X() {
        BrowserBadgeModel.BrowserBadgeViewModel.h hVar;
        BrowserBadgeModel.BrowserBadgeViewModel.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3ae579", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "展示由金额触发的中间图片");
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.A;
        if (browserBadgeViewModel != null && (hVar = browserBadgeViewModel.b) != null && (bVar = hVar.f) != null && bVar.f11797a == BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.APNG) {
            O(bVar.b, bVar.c, bVar.d);
        }
    }

    public void Z() {
        BrowserBadgeModel.BrowserBadgeViewModel.h hVar;
        BrowserBadgeModel.BrowserBadgeViewModel.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bb41a4", new Object[]{this});
            return;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.A;
        if (browserBadgeViewModel != null && (hVar = browserBadgeViewModel.b) != null && (fVar = hVar.d) != null && TextUtils.equals(fVar.d, "BROWSE_WITHDRAW_BUBBLE_HIDDEN")) {
            Y();
        }
    }

    @Override // com.taobao.tab2interact.core.component.browser.view.CircleProgressView.c
    public void a(float f2, long j, long j2, long j3) {
        BrowserBadgeModel.BrowserBadgeViewModel.h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6712aba0", new Object[]{this, new Float(f2), new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.A;
        if (!(browserBadgeViewModel == null || (hVar = browserBadgeViewModel.b) == null || hVar.d == null)) {
            this.E -= j3;
            N();
            if (this.F < this.G) {
                c0(this.q, r());
                h hVar2 = this.z;
                if (hVar2 != null && this.F == 0) {
                    hVar2.f(this.A.b.d.c);
                }
            }
            this.G = this.F;
        }
        h hVar3 = this.z;
        if (hVar3 != null) {
            hVar3.a(f2, j, j2, j3);
        }
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e097fe", new Object[]{this});
            return;
        }
        AmountRollView amountRollView = this.n;
        if (amountRollView != null) {
            amountRollView.startAmountRoll();
        }
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2bfdb6", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "开启进度条");
        CircleProgressView circleProgressView = this.j;
        if (circleProgressView != null) {
            circleProgressView.start();
        }
    }

    public final void d0(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c21feb", new Object[]{this, browserBadgeViewModel});
        } else if (!j0r.d() || browserBadgeViewModel.c == null || this.D) {
            FrameLayout frameLayout = this.s;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            z();
            int i3 = 34;
            int i4 = 86;
            if (browserBadgeViewModel.c.d != null) {
                this.w.setVisibility(0);
                this.w.setImageUrl(browserBadgeViewModel.c.d.b);
                TUrlImageView tUrlImageView = this.w;
                BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel = browserBadgeViewModel.c.d;
                S(tUrlImageView, picModel.c, picModel.d, GravityCompat.END);
                i2 = nwv.t(browserBadgeViewModel.c.d.c, 86);
                i = nwv.t(browserBadgeViewModel.c.d.d, 34);
                this.v.setVisibility(8);
                this.t.setVisibility(8);
                this.u.setVisibility(8);
            } else {
                this.w.setVisibility(8);
                if (browserBadgeViewModel.c.c != null) {
                    this.v.setVisibility(0);
                    this.v.setImageUrl(browserBadgeViewModel.c.c.b);
                    TUrlImageView tUrlImageView2 = this.v;
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel2 = browserBadgeViewModel.c.c;
                    S(tUrlImageView2, picModel2.c, picModel2.d, GravityCompat.END);
                    i4 = nwv.t(browserBadgeViewModel.c.c.c, 86);
                    i3 = nwv.t(browserBadgeViewModel.c.c.d, 34);
                } else {
                    this.v.setVisibility(8);
                }
                if (browserBadgeViewModel.c.f11799a != null) {
                    this.t.setVisibility(0);
                    this.t.setText(browserBadgeViewModel.c.f11799a.f11804a);
                    this.t.setTextColor(sgw.INSTANCE.a(browserBadgeViewModel.c.f11799a.b));
                } else {
                    this.t.setVisibility(8);
                }
                if (browserBadgeViewModel.c.b != null) {
                    this.u.setVisibility(0);
                    this.u.setImageUrl(browserBadgeViewModel.c.b.b);
                    TUrlImageView tUrlImageView3 = this.u;
                    BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel3 = browserBadgeViewModel.c.b;
                    S(tUrlImageView3, picModel3.c, picModel3.d, GravityCompat.END);
                } else {
                    this.u.setVisibility(8);
                }
                this.s.setVisibility(8);
                i = i3;
                i2 = i4;
            }
            if (this.s.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s.getLayoutParams();
                layoutParams.gravity = GravityCompat.END;
                layoutParams.topMargin = s6o.S(this.f11815a, 127 - (i / 2));
                layoutParams.rightMargin = s6o.S(this.f11815a, 45 - (i2 / 2));
                this.s.setLayoutParams(layoutParams);
            }
        }
    }

    public final void e0(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        BrowserBadgeModel.BrowserBadgeViewModel.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1563001", new Object[]{this, browserBadgeViewModel});
            return;
        }
        BrowserBadgeModel.BrowserBadgeViewModel.h hVar = browserBadgeViewModel.b;
        if (hVar != null) {
            if (hVar.f11803a != null) {
                this.h.setVisibility(0);
                BrowserBadgeModel.BrowserBadgeViewModel.i iVar = browserBadgeViewModel.b.f11803a;
                String str = iVar.f11804a;
                int a2 = sgw.INSTANCE.a(iVar.b);
                if (str != null) {
                    if (TextUtils.isEmpty(this.h.getText())) {
                        V(this.h, str, a2);
                        n(this.h);
                    } else {
                        m(this.h, str, a2);
                    }
                }
                this.I = true;
            } else {
                this.h.setVisibility(8);
                this.I = false;
            }
            if (browserBadgeViewModel.b.b != null) {
                this.i.setVisibility(0);
                BrowserBadgeModel.BrowserBadgeViewModel.i iVar2 = browserBadgeViewModel.b.b;
                String str2 = iVar2.f11804a;
                int a3 = sgw.INSTANCE.a(iVar2.b);
                if (str2 != null) {
                    if (TextUtils.isEmpty(this.i.getText())) {
                        V(this.i, str2, a3);
                        n(this.i);
                    } else {
                        m(this.i, str2, a3);
                    }
                }
            } else {
                this.i.setVisibility(8);
            }
            BrowserBadgeModel.BrowserBadgeViewModel.h hVar2 = browserBadgeViewModel.b;
            if (hVar2.c != null && (fVar = hVar2.d) != null) {
                this.E = fVar.f11801a;
                this.H = fVar.c;
                N();
                if (!this.J) {
                    A();
                    this.o.setAlpha(0.0f);
                    TextView textView = this.p;
                    BrowserBadgeModel.BrowserBadgeViewModel.i iVar3 = browserBadgeViewModel.b.c;
                    String str3 = iVar3.f11804a;
                    sgw sgwVar = sgw.INSTANCE;
                    V(textView, str3, sgwVar.a(iVar3.b));
                    int a4 = sgwVar.a(browserBadgeViewModel.b.d.b);
                    U(this.q, r(), a4);
                    this.r.setTextColor(a4);
                    if (TextUtils.isEmpty(browserBadgeViewModel.b.d.d)) {
                        Y();
                    }
                }
            } else if (this.J) {
                x();
                h hVar3 = this.z;
                if (hVar3 != null && this.F > 0) {
                    hVar3.f(this.H);
                }
            }
            BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel = browserBadgeViewModel.b.e;
            if (picModel != null) {
                if (picModel.f11797a == BrowserBadgeModel.BrowserBadgeViewModel.PicModel.Type.APNG) {
                    O(picModel.b, picModel.c, picModel.d);
                } else {
                    this.B = picModel;
                    P(picModel.b, picModel.c, picModel.d);
                }
            }
            BrowserBadgeModel.BrowserBadgeViewModel.d dVar = browserBadgeViewModel.b.g;
            if (dVar != null) {
                this.j.setProgressColor(sgw.INSTANCE.a(dVar.f11800a));
            }
            if (browserBadgeViewModel.b.h != null) {
                this.n.init();
                this.n.setVisibility(0);
                this.n.setAmountUnit(browserBadgeViewModel.b.h.d);
                this.n.setDecimalPoint(".");
                return;
            }
            this.n.setVisibility(8);
        }
    }

    public final void f0(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        BrowserBadgeModel.BrowserBadgeViewModel.g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c00254f", new Object[]{this, browserBadgeViewModel});
        } else if (this.y) {
            if (browserBadgeViewModel == null || (gVar = browserBadgeViewModel.d) == null || TextUtils.isEmpty(gVar.f11802a) || TextUtils.isEmpty(browserBadgeViewModel.d.b)) {
                CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = this.x;
                if (croppedRoundCornerFrameLayout != null) {
                    croppedRoundCornerFrameLayout.updateText(null, null);
                    return;
                }
                return;
            }
            if (this.x == null) {
                ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.browser_badge_left_component_stub);
                viewStub.setLayoutResource(R.layout.browser_badge_left_component_layout);
                CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout2 = (CroppedRoundCornerFrameLayout) viewStub.inflate();
                this.x = croppedRoundCornerFrameLayout2;
                croppedRoundCornerFrameLayout2.initView(s6o.S(this.f11815a, 10), K, s6o.S(this.f11815a, 48), s6o.S(this.f11815a, 8));
                this.x.setVisibilityChangeListener(new a());
                this.x.setEnable(this.y);
            }
            CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout3 = this.x;
            BrowserBadgeModel.BrowserBadgeViewModel.g gVar2 = browserBadgeViewModel.d;
            croppedRoundCornerFrameLayout3.updateText(gVar2.f11802a, gVar2.b);
        }
    }

    public final void g0(BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7665ff73", new Object[]{this, browserBadgeViewModel});
        } else if (browserBadgeViewModel.f11796a != null) {
            E();
            this.c.setPadding(0, s6o.S(this.f11815a, 48), 0, 0);
            if (this.c.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
                layoutParams.gravity = 1;
                this.c.setLayoutParams(layoutParams);
            }
            BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel = browserBadgeViewModel.f11796a.b;
            if (picModel != null) {
                this.d.setImageUrl(picModel.b);
                TUrlImageView tUrlImageView = this.d;
                BrowserBadgeModel.BrowserBadgeViewModel.PicModel picModel2 = browserBadgeViewModel.f11796a.b;
                S(tUrlImageView, picModel2.c, picModel2.d, GravityCompat.END);
            }
            BrowserBadgeModel.BrowserBadgeViewModel.i iVar = browserBadgeViewModel.f11796a.f11805a;
            if (iVar != null) {
                this.e.setText(iVar.f11804a);
                this.e.setTextColor(sgw.INSTANCE.a(browserBadgeViewModel.f11796a.f11805a.b));
            }
            if (!this.I || this.J) {
                p();
            }
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da03d6a3", new Object[]{this, new Integer(i)});
            return;
        }
        AmountRollView amountRollView = this.n;
        if (amountRollView != null) {
            amountRollView.addAmount(i);
        }
    }

    public final void m(TextView textView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7826efdc", new Object[]{this, textView, str, new Integer(i)});
        } else if (textView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new f(textView, str, i));
            ofFloat.start();
        }
    }

    public final void n(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609a3bcd", new Object[]{this, textView});
        } else if (textView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        AmountRollView amountRollView = this.n;
        if (amountRollView != null) {
            amountRollView.destroyView();
        }
        CroppedRoundCornerFrameLayout croppedRoundCornerFrameLayout = this.x;
        if (croppedRoundCornerFrameLayout != null) {
            croppedRoundCornerFrameLayout.clear();
        }
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83f923c6", new Object[]{this});
        }
        return String.format(Locale.US, "%02d%02d", Long.valueOf(this.F / 60), Long.valueOf(this.F % 60));
    }

    public View u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public FrameLayout.LayoutParams v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("9b39d05b", new Object[]{this});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.topMargin = s6o.S(this.f11815a, t() - 93) + s6o.z(this.f11815a);
        layoutParams.rightMargin = s6o.S(this.f11815a, s() - 45);
        return layoutParams;
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c90d37c1", new Object[]{this});
            return;
        }
        this.D = true;
        FrameLayout frameLayout = this.s;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public void y(long j, long j2) {
        BrowserBadgeModel.BrowserBadgeViewModel.h hVar;
        BrowserBadgeModel.BrowserBadgeViewModel.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb04edac", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "初始化金额翻滚动画");
        AmountRollView amountRollView = this.n;
        if (amountRollView != null) {
            BrowserBadgeModel.BrowserBadgeViewModel browserBadgeViewModel = this.A;
            if (browserBadgeViewModel == null || (hVar = browserBadgeViewModel.b) == null || (aVar = hVar.h) == null) {
                amountRollView.initAmountRoll(-1, -1, j, j2, 0L);
                return;
            }
            vgh.c(this, "BrowserBadgeViewController", "初始化金额翻滚动画，mAmountRollViewModel不为空，mStartValue: " + aVar.f11798a + "，mEndValue: " + aVar.f11798a + "，mSingleChangeDuration: " + aVar.c + "，currentDuration: " + j + "，totalDuration: " + j2);
            this.n.initAmountRoll(aVar.f11798a, aVar.b, j, j2, aVar.c);
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bee3833", new Object[]{this});
        } else if (this.s == null) {
            ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.browser_badge_bottom_component_stub);
            viewStub.setLayoutResource(R.layout.browser_badge_bottom_component_layout);
            FrameLayout frameLayout = (FrameLayout) viewStub.inflate();
            this.s = frameLayout;
            this.t = (TextView) frameLayout.findViewById(R.id.browser_badge_bottom_component_text);
            this.u = (TUrlImageView) this.s.findViewById(R.id.browser_badge_bottom_component_arrow);
            this.v = (TUrlImageView) this.s.findViewById(R.id.browser_badge_bottom_component_background);
            this.w = (TUrlImageView) this.s.findViewById(R.id.browser_badge_bottom_component_image);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements fy0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.fy0
        public boolean onLoopCompleted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            vgh.c(this, "BrowserBadgeViewController", "初始化View，中部组件动图drawable播放完成，completedLoop=" + i + "，totalLoop=" + i2);
            if (i2 <= 0 || i < i2) {
                return true;
            }
            if (BrowserBadgeViewController.c(BrowserBadgeViewController.this) != null) {
                BrowserBadgeViewController.c(BrowserBadgeViewController.this).D();
            }
            if (BrowserBadgeViewController.e(BrowserBadgeViewController.this) != null) {
                BrowserBadgeViewController browserBadgeViewController = BrowserBadgeViewController.this;
                BrowserBadgeViewController.f(browserBadgeViewController, BrowserBadgeViewController.e(browserBadgeViewController).b, BrowserBadgeViewController.e(BrowserBadgeViewController.this).c, BrowserBadgeViewController.e(BrowserBadgeViewController.this).d);
            }
            return false;
        }
    }

    public final void O(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f5b222", new Object[]{this, str, str2, str3});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "设置中部组件动图");
        this.m.setVisibility(4);
        this.k.setVisibility(0);
        S(this.k, str2, str3, 17);
        if (TextUtils.equals(this.k.getImageUrl(), str)) {
            cy0 cy0Var = this.l;
            if (cy0Var != null) {
                cy0Var.C();
                vgh.c(this, "BrowserBadgeViewController", "设置中部组件动图，url未发生变化，执行动画");
                return;
            }
            return;
        }
        this.k.setImageUrl(str);
        vgh.c(this, "BrowserBadgeViewController", "设置中部组件动图，url发生变化，url=" + str);
    }

    public final void P(String str, String str2, String str3) {
        cy0 cy0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c43e79", new Object[]{this, str, str2, str3});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "设置中部组件静图");
        if (!TextUtils.equals(this.m.getImageUrl(), str) || (cy0Var = this.l) == null || !cy0Var.u()) {
            this.k.setVisibility(4);
            this.m.setVisibility(0);
            cy0 cy0Var2 = this.l;
            if (cy0Var2 != null) {
                cy0Var2.D();
            }
            S(this.m, str2, str3, 17);
            this.m.setImageUrl(str);
            vgh.c(this, "BrowserBadgeViewController", "设置中部组件静图，满足条件，url=" + str);
        }
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b87cdd3", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "展示中部组件的顶部底部布局容器");
        if (!this.J) {
            o(this.o, true, 300L);
            o(this.g, false, 0L);
            o(this.k, false, 0L);
            o(this.m, false, 0L);
            this.J = true;
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cea42ae", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "隐藏中部组件的顶部底部布局容器");
        if (this.J) {
            o(this.o, false, 0L);
            o(this.g, true, 300L);
            o(this.k, true, 300L);
            o(this.m, true, 300L);
            this.J = false;
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7df70b0", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "执行顶部组件动画");
        float top = this.f.getTop();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, "translationY", top, top - (s6o.S(this.f11815a, 48) + s6o.S(this.f11815a, 48)));
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.c, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.c, "scaleX", 0.8f, 1.0f);
        ofFloat3.setDuration(300L);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.c, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(300L);
        ofFloat4.setInterpolator(new LinearInterpolator());
        ofFloat4.setStartDelay(1700L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new g(this));
        animatorSet.start();
    }

    public final void c0(List<TextSwitcher> list, String str) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33298cc1", new Object[]{this, list, str});
            return;
        }
        vgh.c(this, "BrowserBadgeViewController", "执行文本切换器列表的位移动画，targetValue=" + str);
        if (!(list == null || str == null || (size = list.size()) > str.length())) {
            for (int i = 0; i < size; i++) {
                TextSwitcher textSwitcher = list.get(i);
                if (textSwitcher != null) {
                    TextView textView = (TextView) textSwitcher.getCurrentView();
                    String substring = str.substring(i, i + 1);
                    if (textView != null && !TextUtils.equals(textView.getText(), substring)) {
                        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                        translateAnimation.setDuration(1000L);
                        translateAnimation2.setDuration(1000L);
                        textSwitcher.setInAnimation(translateAnimation);
                        textSwitcher.setOutAnimation(translateAnimation2);
                        textSwitcher.setText(substring);
                    }
                }
            }
        }
    }

    public final void o(View view, boolean z, long j) {
        float[] fArr;
        float[] fArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39b9fe6", new Object[]{this, view, new Boolean(z), new Long(j)});
        } else if (view != null) {
            if (z) {
                fArr2 = new float[]{0.0f, 1.12f, 1.0f};
                fArr = new float[]{0.0f, 1.0f};
            } else {
                fArr2 = new float[]{1.0f, 1.12f, 0.0f};
                fArr = new float[]{1.0f, 0.0f};
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr2[0], fArr2[1]);
            ofFloat.setDuration(200L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr2[1], fArr2[2]);
            ofFloat2.setDuration(200L);
            ofFloat2.setStartDelay(200L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr2[0], fArr2[1]);
            ofFloat3.setDuration(200L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", fArr2[1], fArr2[2]);
            ofFloat4.setDuration(200L);
            ofFloat4.setStartDelay(200L);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "alpha", fArr[0], fArr[1]);
            ofFloat5.setDuration(400L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
            animatorSet.setStartDelay(j);
            animatorSet.start();
        }
    }
}
