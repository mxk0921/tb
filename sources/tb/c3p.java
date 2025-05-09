package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.mmd.datasource.bean.ReviewBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.crosstips.CrossTipsWidget;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c3p extends phw<bn9, LinearLayout, b64> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ay4<x02, c3p> CREATOR = new b();
    public static final String KEY_LAST_TIME_PREFIX = "tbsearch_float_toolbar_last_time";
    public final boolean A;
    public LinearLayout b;
    public LinearLayout c;
    public TUrlImageView d;
    public TUrlImageView e;
    public TUrlImageView f;
    public TUrlImageView g;
    public View h;
    public FrameLayout i;
    public TextView j;
    public TUrlImageView k;
    public FrameLayout l;
    public ReviewBean m;
    public o5n n;
    public View o;
    public ViewGroup p;
    public TextView q;
    public TextView r;
    public LinearLayout s;
    public kae u;
    public boolean v;
    public boolean w;
    public int x;
    public ogo y;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f16831a = new a();
    public final List<kae> t = new ArrayList();
    public boolean z = false;
    public boolean B = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/floatbar/SearchFloatBarWidget$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (c3p.q2(c3p.this) && c3p.s2(c3p.this).getVisibility() == 0) {
                int[] iArr = new int[2];
                c3p.s2(c3p.this).getLocationInWindow(iArr);
                c3p.this.postEvent(new i(iArr[0], iArr[1]));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ay4<x02, c3p> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public c3p a(x02 x02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c3p) ipChange.ipc$dispatch("b013870b", new Object[]{this, x02Var});
            }
            return new c3p(x02Var.f31046a, x02Var.b, (b64) x02Var.c, x02Var.d, x02Var.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/floatbar/SearchFloatBarWidget$3");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                c3p.A2(c3p.this).setVisibility(4);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements vfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.vfw
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d136b904", new Object[]{this, view});
            } else {
                c3p.B2(c3p.this).addView(view);
            }
        }

        @Override // tb.vfw
        public void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c9d0363", new Object[]{this, view});
            } else {
                kgw.c(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c3p.z2(c3p.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f {
        static {
            t2o.a(815793608);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g {
        static {
            t2o.a(815793609);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h {
        static {
            t2o.a(815793610);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final int f16835a;
        public final int b;

        static {
            t2o.a(815793611);
        }

        public i(int i, int i2) {
            this.f16835a = i;
            this.b = i2;
        }
    }

    static {
        t2o.a(815793595);
    }

    public c3p(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        this.A = false;
        subscribeScopeEvent(this, "childPageWidget");
        subscribeEvent(this);
        getModel().e().subscribe(this);
        this.A = getModel().e().C();
    }

    public static /* synthetic */ TUrlImageView A2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("bd246a06", new Object[]{c3pVar});
        }
        return c3pVar.d;
    }

    public static /* synthetic */ FrameLayout B2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ea7ee4a4", new Object[]{c3pVar});
        }
        return c3pVar.i;
    }

    public static /* synthetic */ TUrlImageView C2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("f082f388", new Object[]{c3pVar});
        }
        return c3pVar.f;
    }

    public static /* synthetic */ View D2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b7dbf255", new Object[]{c3pVar});
        }
        return c3pVar.h;
    }

    public static /* synthetic */ FrameLayout E2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46ad8be7", new Object[]{c3pVar});
        }
        return c3pVar.l;
    }

    public static /* synthetic */ TUrlImageView F2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("3d90c1cb", new Object[]{c3pVar});
        }
        return c3pVar.k;
    }

    public static /* synthetic */ Activity G2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("ebb6f938", new Object[]{c3pVar});
        }
        return c3pVar.mActivity;
    }

    public static /* synthetic */ Activity H2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d16255b9", new Object[]{c3pVar});
        }
        return c3pVar.mActivity;
    }

    public static /* synthetic */ Object ipc$super(c3p c3pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/floatbar/SearchFloatBarWidget");
    }

    public static /* synthetic */ boolean q2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a81b407c", new Object[]{c3pVar})).booleanValue();
        }
        return c3pVar.A;
    }

    public static /* synthetic */ View s2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d81885d9", new Object[]{c3pVar});
        }
        return c3pVar.o;
    }

    public static /* synthetic */ TextView t2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ff87ee9d", new Object[]{c3pVar});
        }
        return c3pVar.j;
    }

    public static /* synthetic */ Activity u2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1be0c9a0", new Object[]{c3pVar});
        }
        return c3pVar.mActivity;
    }

    public static /* synthetic */ Activity v2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("18c2621", new Object[]{c3pVar});
        }
        return c3pVar.mActivity;
    }

    public static /* synthetic */ AnimationSet w2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("7c1db644", new Object[]{c3pVar});
        }
        return c3pVar.K2();
    }

    public static /* synthetic */ AnimationSet x2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("414fa7a3", new Object[]{c3pVar});
        }
        return c3pVar.J2();
    }

    public static /* synthetic */ TUrlImageView y2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("a1ac43f8", new Object[]{c3pVar});
        }
        return c3pVar.g;
    }

    public static /* synthetic */ void z2(c3p c3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f062e63", new Object[]{c3pVar});
        } else {
            c3pVar.g3();
        }
    }

    /* renamed from: I2 */
    public void bindWithData(bn9 bn9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed47e8b7", new Object[]{this, bn9Var});
            return;
        }
        CommonBaseDatasource e2 = getModel().e();
        if (e2.z()) {
            this.o.setVisibility(0);
            h3(e2);
        } else {
            this.o.setVisibility(8);
        }
        int currentPage = e2.getCurrentPage();
        if (bn9Var != null) {
            o5n o5nVar = bn9Var.b;
            if (o5nVar != null) {
                this.n = o5nVar;
                V2();
                j3(currentPage, bn9Var.b);
            }
            k3(bn9Var.f16490a);
        }
    }

    public final AnimationSet J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("176e85c2", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        return animationSet;
    }

    public final AnimationSet K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("a29d70f7", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.setDuration(300L);
        animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, 1.0f, 1, 1.0f));
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        return animationSet;
    }

    public final kae L2(BaseTypedBean baseTypedBean) {
        ay4<gu1, ? extends pwc> ay4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("74c4c69c", new Object[]{this, baseTypedBean});
        }
        if (kxi.b(baseTypedBean)) {
            if (getModel().e().getTemplate(baseTypedBean.type) == null) {
                return null;
            }
            ((xua) c().j().a()).getClass();
            return null;
        } else if (kxi.a(baseTypedBean)) {
            TemplateBean template = getModel().e().getTemplate(baseTypedBean.type);
            if (template == null || (ay4Var = c().j().c.f28608a) == null) {
                return null;
            }
            return (kae) ay4Var.a(new gu1(M2(), template));
        } else {
            x02 M2 = M2();
            M2.d = new LinearLayout(this.mActivity);
            return c().m().a(baseTypedBean.getClass(), M2);
        }
    }

    public final x02 M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x02) ipChange.ipc$dispatch("15e5665d", new Object[]{this});
        }
        return new x02(getActivity(), this, getModel());
    }

    public void N2(BaseTypedBean baseTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4295120", new Object[]{this, baseTypedBean});
            return;
        }
        kae kaeVar = this.u;
        if (kaeVar != null) {
            kaeVar.destroyAndRemoveFromParent();
        }
        if (baseTypedBean != null) {
            kae L2 = L2(baseTypedBean);
            this.u = L2;
            if (L2 != null) {
                L2.bindWithData(baseTypedBean);
                this.u.attachToContainer(new d());
            }
        }
    }

    public void O2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d698499b", new Object[]{this, new Boolean(z)});
            return;
        }
        Q2(z);
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().e().getLastSearchResult();
        if (commonSearchResult != null && commonSearchResult.floatBarBean != null) {
            ((LinearLayout) getView()).post(new e());
        }
    }

    public void P2(List<o5n> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1740606a", new Object[]{this, list});
            return;
        }
        Iterator it = ((ArrayList) this.t).iterator();
        while (it.hasNext()) {
            ((kae) it.next()).destroyAndRemoveFromParent();
        }
        ((ArrayList) this.t).clear();
        if (list != null) {
            for (o5n o5nVar : list) {
                q5n a2 = p5n.a(o5nVar, getActivity(), this, getModel(), this.s, new ye0(this.s));
                if (a2 != null) {
                    a2.ensureView();
                    a2.bindWithData(o5nVar);
                    a2.attachToContainer();
                    ((ArrayList) this.t).add(a2);
                }
            }
        }
    }

    public void Q2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7211120", new Object[]{this, new Boolean(z)});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().e().getLastSearchResult();
        if (commonSearchResult != null) {
            bindWithData(commonSearchResult.floatBarBean);
            if (z) {
                N2(commonSearchResult.floatBarBean.d);
                P2(commonSearchResult.floatBarBean.c);
            }
        }
    }

    public void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4384e8fe", new Object[]{this});
            return;
        }
        this.p.setVisibility(8);
        this.w = false;
        if (this.d.getVisibility() == 8) {
            this.d.setVisibility(0);
        }
    }

    public final void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49dc0034", new Object[]{this});
        } else if ("true".equals(getModel().e().getParamValue("show_shopping_cart"))) {
            this.c.setVisibility(8);
        }
    }

    public final void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.d = (TUrlImageView) this.b.findViewById(R.id.toolbar_backtop);
        this.c = (LinearLayout) this.b.findViewById(R.id.ll_float_container);
        this.i = (FrameLayout) this.b.findViewById(R.id.fl_bottom_bar_container);
        this.d.setVisibility(8);
        this.d.setOnClickListener(this);
        if (xyd.a(getActivity())) {
            this.d.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01ecAmov1RGWOMJD8kY_!!6000000002084-2-tps-160-160.png");
        } else {
            this.d.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01O8AXxB1wOzoBiOEXV_!!6000000006299-2-tps-120-120.png");
        }
        TUrlImageView tUrlImageView = (TUrlImageView) this.b.findViewById(R.id.toolbar_review);
        this.e = tUrlImageView;
        tUrlImageView.setVisibility(8);
        TUrlImageView tUrlImageView2 = this.e;
        int i2 = R.drawable.tbsearch_review_icon;
        tUrlImageView2.setPlaceHoldImageResId(i2);
        this.e.setErrorImageResId(i2);
        this.e.setOnClickListener(this);
        TUrlImageView tUrlImageView3 = (TUrlImageView) this.b.findViewById(R.id.highlight_float_button);
        this.g = tUrlImageView3;
        tUrlImageView3.setVisibility(8);
        this.h = this.b.findViewById(R.id.highlight_red_dot);
        TUrlImageView tUrlImageView4 = (TUrlImageView) this.b.findViewById(R.id.normal_float_button);
        this.f = tUrlImageView4;
        tUrlImageView4.setVisibility(8);
        this.f.setOnClickListener(this);
        FrameLayout frameLayout = (FrameLayout) this.b.findViewById(R.id.hint_parent);
        this.l = frameLayout;
        frameLayout.setOnClickListener(this);
        this.l.setVisibility(8);
        TextView textView = (TextView) this.b.findViewById(R.id.hintText);
        this.j = textView;
        textView.setLayerType(1, null);
        ogo ogoVar = new ogo();
        this.y = ogoVar;
        this.j.setBackgroundDrawable(ogoVar);
        TUrlImageView tUrlImageView5 = (TUrlImageView) this.b.findViewById(R.id.hintPic);
        this.k = tUrlImageView5;
        tUrlImageView5.setVisibility(8);
        View findViewById = this.b.findViewById(R.id.open_cart);
        this.o = findViewById;
        findViewById.setVisibility(8);
        ViewProxy.setOnClickListener(this.o, this);
        ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.tool_bar_currentpos);
        this.p = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.q = (TextView) this.p.findViewById(R.id.currentPos);
            this.r = (TextView) this.p.findViewById(R.id.totalNum);
        }
        Activity activity = this.mActivity;
        if (activity == null || activity.getResources() == null) {
            this.x = DensityUtil.dip2px(Globals.getApplication(), 47.0f);
        } else {
            this.x = this.mActivity.getResources().getDimensionPixelOffset(R.dimen.tbsearch_feeds_height) + DensityUtil.dip2px(this.mActivity, 8.0f);
        }
        this.s = (LinearLayout) this.b.findViewById(R.id.ll_push_button_container);
        String paramStr = getModel().e().getParamStr("bottomPadding");
        if (!TextUtils.isEmpty(paramStr)) {
            this.b.setPadding(0, 0, 0, srl.e(paramStr, 0));
        }
    }

    public final void V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1d77d9", new Object[]{this});
        } else if (!this.z) {
            attachToContainer();
            this.z = true;
        }
    }

    /* renamed from: W2 */
    public LinearLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("887bc65e", new Object[]{this});
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_float_toolbar, getContainer(), false);
        this.b = linearLayout;
        linearLayout.setPadding(0, 0, 0, 0);
        U2();
        T2();
        return this.b;
    }

    public final void X2(o5n o5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3503749e", new Object[]{this, o5nVar});
            return;
        }
        this.g.setImageUrl(o5nVar.c);
        this.g.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(3.0f));
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.setDuration(300L);
        this.g.startAnimation(animationSet);
        this.g.postDelayed(new g3p(this), (o5nVar.g * 1000) + 300);
    }

    public final void Y2(o5n o5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc1fe4b", new Object[]{this, o5nVar});
        } else {
            this.l.postDelayed(new f3p(this, o5nVar), 300L);
        }
    }

    public final void Z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a28db71", new Object[]{this});
            return;
        }
        this.f.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(3.0f));
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.setDuration(300L);
        this.f.startAnimation(animationSet);
    }

    public void a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c21a3fe", new Object[]{this});
            return;
        }
        this.v = true;
        this.d.setVisibility(4);
    }

    public void b3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d2faee", new Object[]{this, str});
        } else if (str != null) {
            this.q.setText(str);
        }
    }

    public void e3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1146363", new Object[]{this});
            return;
        }
        this.p.setVisibility(0);
        this.w = true;
        if (this.d.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
    }

    public final void g3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d4b7e8", new Object[]{this});
        } else if (getView() != 0) {
            ((LinearLayout) getView()).removeCallbacks(this.f16831a);
            ((LinearLayout) getView()).postDelayed(this.f16831a, 500L);
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SearchFloatBarWidget";
    }

    public final void h3(CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d803aad", new Object[]{this, commonBaseDatasource});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (commonBaseDatasource.getTotalSearchResult() != 0) {
            ResultMainInfoBean mainInfo = ((CommonSearchResult) commonBaseDatasource.getTotalSearchResult()).getMainInfo();
            jSONObject.put(h1p.a.PARAM_KEY_FIRST_RN, (Object) mainInfo.rn);
            jSONObject.put("x_object_type_search", (Object) "srpshoppingcart");
            jSONObject.put(h1p.LIST_PARAM_KEY, (Object) (commonBaseDatasource.getKeyword() + "_" + mainInfo.abtest + "_" + mainInfo.rn));
            jSONObject.put("from", (Object) commonBaseDatasource.s("from"));
            jSONObject.put("channelSrp", (Object) commonBaseDatasource.s("channelSrp"));
            JSONObject jSONObject2 = ((CommonSearchResult) commonBaseDatasource.getTotalSearchResult()).pageInfo;
            if (jSONObject2 != null) {
                jSONObject.put("for_bts", (Object) jSONObject2.getString("for_bts"));
            }
            HashMap hashMap = new HashMap();
            Map<String, String> map = mainInfo.pageTraceArgs;
            if (map != null) {
                hashMap.put("spm", map.get("spm-cnt"));
            }
            hashMap.put("utLogMap", f6p.d(jSONObject.toString()));
            sen.l("Page_SearchItemList_srpshoppingcart_QueryExposure", hashMap);
        }
    }

    public final void k3(ReviewBean reviewBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c04bad", new Object[]{this, reviewBean});
        } else if (reviewBean == null || !reviewBean.show) {
            TUrlImageView tUrlImageView = this.e;
            if (tUrlImageView != null && tUrlImageView.getVisibility() != 8) {
                this.e.setVisibility(8);
            }
        } else {
            V2();
            f3(reviewBean);
        }
    }

    public void onEventMainThread(t2p t2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
        } else {
            Q2(t2pVar.c());
        }
    }

    public void c3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbfa003", new Object[]{this, str});
        } else if (str != null) {
            if (srl.f(str, 0, "SearchFloatBarWidget", "当前宝贝总数不是有效数字") > 999) {
                this.r.setText("999+");
            } else {
                this.r.setText(str);
            }
        }
    }

    public final void f3(ReviewBean reviewBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("165290e1", new Object[]{this, reviewBean});
            return;
        }
        this.m = reviewBean;
        this.e.setImageUrl(reviewBean.iconUrl);
        CommonBaseDatasource e2 = getModel().e();
        CommonSearchResult commonSearchResult = (CommonSearchResult) e2.getTotalSearchResult();
        HashMap hashMap = new HashMap();
        hashMap.put("query", e2.getKeyword());
        if (commonSearchResult != null) {
            hashMap.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
            hashMap.put("for_bts", commonSearchResult.pageInfo.getString("for_bts"));
        }
        sen.j("SrpReviewButtonExpose");
        this.e.setVisibility(0);
    }

    public final void j3(int i2, o5n o5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be0296", new Object[]{this, new Integer(i2), o5nVar});
        } else if (o5n.MODE_BY_PAGE_WITHOUT_CLICK.equalsIgnoreCase(o5nVar.k)) {
            int i3 = o5nVar.m;
            if (i3 > 0 && i2 >= i3 && i2 < o5nVar.n) {
                boolean i32 = i3(o5nVar, i2);
                if (this.f.getVisibility() == 8) {
                    boolean equals = "promotion".equals(o5nVar.l);
                    if (equals) {
                        this.l.getLayoutParams().height = DensityUtil.dip2px(this.mActivity, 39.0f);
                        this.j.setTextSize(1, 14.0f);
                        ((ViewGroup.MarginLayoutParams) this.l.getLayoutParams()).rightMargin = DensityUtil.dip2px(this.mActivity, 10.0f);
                    }
                    this.y.d(o5nVar.i);
                    this.y.b(o5nVar.j);
                    this.y.c(equals);
                    this.y.a();
                    this.j.setTextColor(o5nVar.h);
                    this.f.setContentDescription(o5nVar.f25151a);
                    this.f.setImageUrl(o5nVar.b);
                    if (!i32 || TextUtils.isEmpty(o5nVar.c)) {
                        Z2();
                    }
                    String keyword = getModel().e().getKeyword();
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("q", keyword);
                    arrayMap.put("highlighted", String.valueOf(i32));
                    sen.f("PushButton" + o5nVar.p + "Display", arrayMap);
                }
            } else if (this.f.getVisibility() == 0) {
                if (!o5nVar.s) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new d3p(this));
                    this.f.startAnimation(alphaAnimation);
                }
                this.g.setVisibility(8);
                this.l.setVisibility(8);
                this.h.setVisibility(8);
            }
        }
    }

    public void onEventMainThread(ljz ljzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8d6b65", new Object[]{this, ljzVar});
            return;
        }
        kae kaeVar = this.u;
        if (kaeVar instanceof m8j) {
            ((m8j) kaeVar).y2(ljzVar.b(), ljzVar.a());
        }
    }

    public void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed0b2aa", new Object[]{this});
        } else if (this.v && !this.d.isInLayout()) {
            if (this.B) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, "translationY", 0.0f, this.x);
                ofFloat.setDuration(400L);
                ofFloat.addListener(new c());
                ofFloat.start();
            } else {
                this.c.setTranslationY(this.x);
            }
            b4p.a("SearchFloatBarWidget", "hide back to top");
            this.v = false;
            g3();
        }
    }

    public void d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc602d0f", new Object[]{this});
        } else if (!this.v && !this.d.isInLayout()) {
            this.d.setVisibility(0);
            if (!this.w) {
                if (this.B) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, "translationY", this.x, 0.0f);
                    ofFloat.setDuration(400L);
                    ofFloat.start();
                } else {
                    this.c.setTranslationY(0.0f);
                }
            }
            b4p.a("SearchFloatBarWidget", "show back to top");
            this.v = true;
            g3();
        }
    }

    public final boolean i3(o5n o5nVar, int i2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb0ed2a4", new Object[]{this, o5nVar, new Integer(i2)})).booleanValue();
        }
        if (o5nVar.u || o5nVar.f != i2) {
            return false;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.mActivity);
        if (System.currentTimeMillis() - defaultSharedPreferences.getLong(KEY_LAST_TIME_PREFIX + o5nVar.p, 0L) < o5nVar.r) {
            o5nVar.u = true;
            return false;
        }
        if (!TextUtils.isEmpty(o5nVar.d) || !TextUtils.isEmpty(o5nVar.e)) {
            Y2(o5nVar);
            z = true;
        }
        if (!TextUtils.isEmpty(o5nVar.c)) {
            X2(o5nVar);
            z = true;
        } else {
            this.g.setVisibility(8);
        }
        if (z) {
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putLong(KEY_LAST_TIME_PREFIX + o5nVar.p, System.currentTimeMillis()).apply();
            this.h.postDelayed(new e3p(this, o5nVar), (long) ((o5nVar.g * 1000) + 600));
            o5nVar.t = true;
        }
        o5nVar.u = true;
        return z;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == this.d.getId()) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.putAll(evn.Companion.a((jrh) getModel().e()));
            sen.g("BackToTop", arrayMap, "a2141.7631709.1999021175.4922318");
            R2();
            postEvent(new CrossTipsWidget.a(false));
            getModel().e().postEvent(vxo.a());
        } else if (view.getId() == this.e.getId()) {
            ArrayMap arrayMap2 = new ArrayMap();
            arrayMap2.put("query", getModel().e().getKeyword());
            sen.f("Review", arrayMap2);
            cqv.u(c2v.getInstance().getCurrentPageName(), "Page_SearchItemList_Button-Review", "", "", h6p.a(arrayMap2));
            xlo.d(getModel().e(), this.m, this.mActivity);
        } else if (view.getId() == this.o.getId()) {
            Nav.from(this.mActivity).toUri("http://h5.m.taobao.com/awp/base/cart.htm?cartfrom=detail");
        } else if (view == this.f || view == this.l) {
            try {
                o5n o5nVar = this.n;
                if (o5nVar != null && !TextUtils.isEmpty(o5nVar.o)) {
                    o5n o5nVar2 = this.n;
                    o5nVar2.s = true;
                    String str = o5nVar2.o;
                    ArrayMap arrayMap3 = new ArrayMap();
                    arrayMap3.put("srpKey", String.valueOf(getModel().e().hashCode()));
                    CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().e().getLastSearchResult();
                    if (commonSearchResult != null) {
                        arrayMap3.put(yj4.PARAM_SEARCH_KEYWORD_RN, commonSearchResult.getMainInfo().rn);
                    }
                    Nav.from(this.mActivity).toUri(f6p.a(str, arrayMap3));
                    String keyword = getModel().e().getKeyword();
                    ArrayMap arrayMap4 = new ArrayMap();
                    arrayMap4.put("q", keyword);
                    arrayMap4.put("highlighted", String.valueOf(this.n.t));
                    sen.f("PushButton" + this.n.p + "Click", arrayMap4);
                }
                this.h.clearAnimation();
                this.h.setVisibility(8);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void onEventMainThread(y2p y2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2e0d0", new Object[]{this, y2pVar});
        } else {
            Q2(true);
        }
    }

    public void onEventMainThread(yxo yxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ab402f", new Object[]{this, yxoVar});
        } else {
            R2();
        }
    }

    public void onEventMainThread(xxo xxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58dbe06", new Object[]{this, xxoVar});
            return;
        }
        V2();
        d3();
    }

    public void onEventMainThread(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8a65ee", new Object[]{this, fVar});
        } else {
            g3();
        }
    }

    public void onEventMainThread(wxo wxoVar) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea0506", new Object[]{this, wxoVar});
            return;
        }
        int totalResultCount = getModel().a().getTotalResultCount();
        if (!this.A || (i2 = wxoVar.f31002a) <= 10 || i2 > totalResultCount) {
            S2();
            return;
        }
        b3(String.valueOf(i2 + 1));
        e3();
        c3(String.valueOf(totalResultCount));
    }

    public void onEventMainThread(ayo ayoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f64efd3", new Object[]{this, ayoVar});
        } else if (this.A) {
            S2();
        }
    }

    public void onEventMainThread(zyo zyoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a55f60", new Object[]{this, zyoVar});
        } else {
            R2();
        }
    }

    public void onEventMainThread(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6baba4e8", new Object[]{this, gVar});
        } else {
            ((LinearLayout) getView()).setVisibility(8);
        }
    }

    public void onEventMainThread(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd2e223", new Object[]{this, hVar});
        } else {
            ((LinearLayout) getView()).setVisibility(0);
        }
    }
}
