package com.etao.feimagesearch.newresult.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint$DataPoint;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint$PageName;
import com.etao.feimagesearch.newresult.widget.titlebar.IrpTitleBarGuideWidget;
import com.etao.feimagesearch.result.ScrollInterceptView;
import com.etao.feimagesearch.struct.ViewWidget;
import com.etao.feimagesearch.view.ContentOffsetView;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$FloatRef;
import tb.a07;
import tb.abk;
import tb.agh;
import tb.anf;
import tb.bmf;
import tb.bnf;
import tb.caa;
import tb.ckf;
import tb.cmf;
import tb.cnf;
import tb.d1a;
import tb.dmf;
import tb.enf;
import tb.fk2;
import tb.hfn;
import tb.hmf;
import tb.hpk;
import tb.ipj;
import tb.ivn;
import tb.ixn;
import tb.jzu;
import tb.k7;
import tb.lg4;
import tb.lz1;
import tb.mh7;
import tb.mvm;
import tb.my4;
import tb.mzu;
import tb.nmf;
import tb.p1p;
import tb.p9j;
import tb.pmf;
import tb.pv8;
import tb.qmf;
import tb.t2o;
import tb.tlf;
import tb.trl;
import tb.tv;
import tb.txh;
import tb.ulf;
import tb.umf;
import tb.vlf;
import tb.wlf;
import tb.wxi;
import tb.xfw;
import tb.xhv;
import tb.xlf;
import tb.y2o;
import tb.yak;
import tb.yeu;
import tb.ylf;
import tb.yz3;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpWidget extends txh<FrameLayout, IrpWidget, lz1<IrpWidget>, IrpDatasource, IrpV2Presenter> implements ScrollInterceptView.b, ylf.a, dmf.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int MSG_CHECK_TITLE_BAR_LOCATION = 10001;
    public static final String TAG = "IrpWidget";
    public boolean A;
    public final wlf B;
    public boolean D;
    public ValueAnimator F;
    public int G;
    public long H;
    public boolean I;
    public final SparseIntArray K;
    public int L;
    public int M;
    public float S;
    public final cnf m;
    public final IrpDatasource n;
    public cmf o;
    public xlf p;
    public tv q;
    public enf r;
    public mvm s;
    public anf t;
    public ylf u;
    public IrpTitleBarGuideWidget v;
    public hmf w;
    public k7 x;
    public final bmf y;
    public boolean z;
    public final boolean C = lg4.r0();
    public boolean E = true;
    public final Handler J = new Handler(Looper.getMainLooper(), new o());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297156);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout frameLayout = (FrameLayout) IrpWidget.this.X();
            if (frameLayout != null) {
                frameLayout.addView(view);
            }
            return (ViewGroup) IrpWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return (ViewGroup) IrpWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout frameLayout = (FrameLayout) IrpWidget.this.X();
            if (frameLayout != null) {
                frameLayout.addView(view);
            }
            return (ViewGroup) IrpWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return (ViewGroup) IrpWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            IrpWidget.this.V0().b();
            IrpWidget.this.E().finish();
        }

        @Override // tb.d1a
        public /* bridge */ /* synthetic */ xhv invoke() {
            a();
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout frameLayout = (FrameLayout) IrpWidget.this.X();
            if (frameLayout != null) {
                frameLayout.addView(view);
            }
            return (ViewGroup) IrpWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return (ViewGroup) IrpWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout frameLayout = (FrameLayout) IrpWidget.this.X();
            if (frameLayout != null) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            return (ViewGroup) IrpWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return (ViewGroup) IrpWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout frameLayout = (FrameLayout) IrpWidget.this.X();
            if (frameLayout != null) {
                frameLayout.addView(view);
            }
            return (ViewGroup) IrpWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return (ViewGroup) IrpWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout frameLayout = (FrameLayout) IrpWidget.this.X();
            if (frameLayout != null) {
                frameLayout.addView(view);
            }
            return (ViewGroup) IrpWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return (ViewGroup) IrpWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return (ViewGroup) IrpWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            Integer b = ipj.INSTANCE.b(IrpWidget.this.E());
            if (b == null) {
                i = p1p.a(32.0f);
            } else {
                i = b.intValue();
            }
            layoutParams.setMargins(0, i, 0, 0);
            FrameLayout frameLayout = (FrameLayout) IrpWidget.this.X();
            if (frameLayout != null) {
                frameLayout.addView(view, layoutParams);
            }
            return (ViewGroup) IrpWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class k implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout frameLayout = (FrameLayout) IrpWidget.this.X();
            if (frameLayout != null) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            return (ViewGroup) IrpWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return (ViewGroup) IrpWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class l implements hpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a<xhv> f4824a;

        public l(d1a<xhv> d1aVar) {
            this.f4824a = d1aVar;
        }

        @Override // tb.hpk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d104132", new Object[]{this});
            } else {
                this.f4824a.invoke();
            }
        }

        @Override // tb.hpk
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d24ee9f", new Object[]{this, new Integer(i)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class m implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$FloatRef f4825a;
        public final /* synthetic */ IrpWidget b;
        public final /* synthetic */ float c;

        public m(Ref$FloatRef ref$FloatRef, IrpWidget irpWidget, float f) {
            this.f4825a = ref$FloatRef;
            this.b = irpWidget;
            this.c = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, "animator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f = floatValue - this.f4825a.element;
                float f2 = 0.0f;
                if (f != 0.0f) {
                    IrpWidget irpWidget = this.b;
                    ylf n0 = IrpWidget.n0(irpWidget);
                    if (n0 != null) {
                        ContentOffsetView X = n0.X();
                        ckf.d(X);
                        IrpWidget.c(irpWidget, X.getTranslationY());
                        ylf n02 = IrpWidget.n0(this.b);
                        if (n02 != null) {
                            ContentOffsetView X2 = n02.X();
                            ckf.d(X2);
                            X2.setTranslationY(floatValue);
                            this.f4825a.element = floatValue;
                            hmf l0 = IrpWidget.l0(this.b);
                            if (l0 != null) {
                                FrameLayout X3 = l0.X();
                                ckf.d(X3);
                                float translationY = X3.getTranslationY() + f;
                                if (translationY >= 0.0f) {
                                    f2 = this.c;
                                    if (translationY <= f2) {
                                        f2 = translationY;
                                    }
                                }
                                hmf l02 = IrpWidget.l0(this.b);
                                if (l02 != null) {
                                    l02.A0(f2);
                                    IrpWidget.p0(this.b, floatValue, this.c);
                                    return;
                                }
                                ckf.y("hybridWidget");
                                throw null;
                            }
                            ckf.y("hybridWidget");
                            throw null;
                        }
                        ckf.y("titleBarWidget");
                        throw null;
                    }
                    ckf.y("titleBarWidget");
                    throw null;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class n extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/base/IrpWidget$createScrollInterceptWidgetAnimation$1$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            IrpWidget.s0(IrpWidget.this, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            IrpWidget.s0(IrpWidget.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class p implements hpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // tb.hpk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d104132", new Object[]{this});
            } else if (IrpWidget.this.W().w().n()) {
                IrpWidget.r0(IrpWidget.this);
            }
        }

        @Override // tb.hpk
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d24ee9f", new Object[]{this, new Integer(i)});
            }
        }
    }

    static {
        t2o.a(481297155);
        t2o.a(481297435);
        t2o.a(481297259);
        t2o.a(481297222);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpWidget(Activity activity, cnf cnfVar, Object obj, IrpDatasource irpDatasource, xfw xfwVar) {
        super(activity, obj, irpDatasource, xfwVar, false, 16, null);
        ckf.g(activity, "activity");
        ckf.g(cnfVar, "tracker");
        ckf.g(irpDatasource, "irpDatasource");
        ckf.g(xfwVar, "setter");
        this.m = cnfVar;
        this.n = irpDatasource;
        if (activity instanceof vlf) {
            this.B = ((vlf) activity).p1();
        }
        this.y = new bmf(activity);
        ViewWidget.T(this, null, 1, null);
        x0();
        y0();
        G();
        ((IrpV2Presenter) i0()).A0(cnfVar);
        if (this.q != null) {
            xlf xlfVar = this.p;
            if (xlfVar != null) {
                xlfVar.t0(false);
            } else {
                ckf.y("previewWidget");
                throw null;
            }
        }
        if (irpDatasource.a0() && irpDatasource.Q()) {
            a1(null);
        }
        this.K = new SparseIntArray();
        this.M = -1;
    }

    public static /* synthetic */ void H1(IrpWidget irpWidget, int i2, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, String str2, String str3, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197ac71a", new Object[]{irpWidget, new Integer(i2), str, onClickListener, onClickListener2, str2, str3, new Integer(i3), obj});
            return;
        }
        if ((i3 & 16) != 0) {
            str2 = Localization.q(R.string.irp_error_message_retry_text);
        }
        if ((i3 & 32) != 0) {
            str3 = Localization.q(R.string.irp_error_message_cancel_text);
        }
        irpWidget.G1(i2, str, onClickListener, onClickListener2, str2, str3);
    }

    public static /* synthetic */ void J0(IrpWidget irpWidget, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f14bb8b", new Object[]{irpWidget, new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        irpWidget.I0(z);
    }

    public static final /* synthetic */ void c(IrpWidget irpWidget, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254a70e8", new Object[]{irpWidget, new Float(f2)});
        } else {
            irpWidget.S = f2;
        }
    }

    public static /* synthetic */ Object ipc$super(IrpWidget irpWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1794064906) {
            super.M();
            return null;
        } else if (hashCode == 731174045) {
            super.L();
            return null;
        } else if (hashCode == 1083424568) {
            super.K();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/newresult/base/IrpWidget");
        }
    }

    public static final /* synthetic */ void k0(IrpWidget irpWidget, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda05493", new Object[]{irpWidget, message});
        } else {
            irpWidget.K0(message);
        }
    }

    public static final /* synthetic */ hmf l0(IrpWidget irpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hmf) ipChange.ipc$dispatch("e59b46af", new Object[]{irpWidget});
        }
        return irpWidget.w;
    }

    public static final /* synthetic */ anf m0(IrpWidget irpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anf) ipChange.ipc$dispatch("87af9fac", new Object[]{irpWidget});
        }
        return irpWidget.t;
    }

    public static final /* synthetic */ ylf n0(IrpWidget irpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylf) ipChange.ipc$dispatch("7e5cc0ad", new Object[]{irpWidget});
        }
        return irpWidget.u;
    }

    public static final /* synthetic */ void o0(IrpWidget irpWidget, RectF rectF, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a4e740", new Object[]{irpWidget, rectF, num});
        } else {
            irpWidget.l1(rectF, num);
        }
    }

    public static final /* synthetic */ void p0(IrpWidget irpWidget, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64cb8951", new Object[]{irpWidget, new Float(f2), new Float(f3)});
        } else {
            irpWidget.s1(f2, f3);
        }
    }

    public static final /* synthetic */ void q0(IrpWidget irpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd08d3b", new Object[]{irpWidget});
        } else {
            irpWidget.A1();
        }
    }

    public static final /* synthetic */ void r0(IrpWidget irpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144a65a0", new Object[]{irpWidget});
        } else {
            irpWidget.C1();
        }
    }

    public static final /* synthetic */ void s0(IrpWidget irpWidget, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8e140e", new Object[]{irpWidget, valueAnimator});
        } else {
            irpWidget.F = valueAnimator;
        }
    }

    public static final /* synthetic */ void t0(IrpWidget irpWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d50639", new Object[]{irpWidget, new Boolean(z)});
        } else {
            irpWidget.I = z;
        }
    }

    public static /* synthetic */ void u1(IrpWidget irpWidget, boolean z, boolean z2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60143220", new Object[]{irpWidget, new Boolean(z), new Boolean(z2), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        irpWidget.t1(z, z2);
    }

    public final void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe151e8a", new Object[]{this});
            return;
        }
        IrpTitleBarGuideWidget irpTitleBarGuideWidget = new IrpTitleBarGuideWidget(E(), this, W(), new c());
        this.v = irpTitleBarGuideWidget;
        ViewWidget.T(irpTitleBarGuideWidget, null, 1, null);
    }

    public final void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642c6698", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.J.removeCallbacksAndMessages(null);
        Message obtainMessage = this.J.obtainMessage(10001);
        ckf.f(obtainMessage, "mainHandler.obtainMessag…CHECK_TITLE_BAR_LOCATION)");
        obtainMessage.obj = Long.valueOf(currentTimeMillis);
        this.J.sendMessageDelayed(obtainMessage, 60L);
    }

    @Override // tb.dmf.a
    public void B(boolean z, Integer num, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("947e57d0", new Object[]{this, new Boolean(z), num, str});
            return;
        }
        String str3 = null;
        if (z) {
            wlf wlfVar = this.B;
            if (wlfVar != null) {
                if (num != null) {
                    str3 = num.toString();
                }
                wlfVar.h("PageWebLoad", str3, str);
            }
        } else {
            wlf wlfVar2 = this.B;
            if (wlfVar2 != null) {
                if (num != null) {
                    str3 = num.toString();
                }
                wlfVar2.h("PageMuiseLoad", str3, str);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put("hybrid", "web");
        } else {
            linkedHashMap.put("hybrid", "muise");
        }
        if (num == null || (str2 = num.toString()) == null) {
            str2 = "";
        }
        linkedHashMap.put("errCode", str2);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("errMsg", str);
        TLogTracker.k("HybridLoad", linkedHashMap);
    }

    public final void B1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192a89d5", new Object[]{this, new Boolean(z)});
            return;
        }
        Bitmap H = W().H();
        if (H != null) {
            xlf xlfVar = this.p;
            if (xlfVar != null) {
                xlfVar.q0(H, z);
                ylf ylfVar = this.u;
                if (ylfVar != null) {
                    ylfVar.x0(H);
                } else {
                    ckf.y("titleBarWidget");
                    throw null;
                }
            } else {
                ckf.y("previewWidget");
                throw null;
            }
        }
    }

    public final void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae8297a", new Object[]{this});
            return;
        }
        mvm mvmVar = new mvm(E(), this, W(), new f());
        ViewWidget.T(mvmVar, null, 1, null);
        this.s = mvmVar;
    }

    public final void C1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7481613", new Object[]{this});
        } else if (lg4.u() && !W().b0() && !caa.t() && !caa.s() && !W().X()) {
            IrpTitleBarGuideWidget irpTitleBarGuideWidget = this.v;
            if (irpTitleBarGuideWidget != null) {
                ylf ylfVar = this.u;
                if (ylfVar != null) {
                    LinkedList<p9j> o0 = ylfVar.o0();
                    ylf ylfVar2 = this.u;
                    if (ylfVar2 != null) {
                        boolean r0 = ylfVar2.r0();
                        ylf ylfVar3 = this.u;
                        if (ylfVar3 != null) {
                            irpTitleBarGuideWidget.l0(o0, r0, ylfVar3.n0());
                        } else {
                            ckf.y("titleBarWidget");
                            throw null;
                        }
                    } else {
                        ckf.y("titleBarWidget");
                        throw null;
                    }
                } else {
                    ckf.y("titleBarWidget");
                    throw null;
                }
            } else {
                ckf.y("titleBarGuideWidget");
                throw null;
            }
        }
    }

    public final void D0() {
        xlf xlfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e95c6ee", new Object[]{this});
            return;
        }
        i iVar = new i();
        if (W().w().d()) {
            xlfVar = new tlf(E(), this, W(), new g(), iVar);
        } else {
            xlfVar = new qmf(E(), this, W(), new h(), iVar);
        }
        this.p = xlfVar;
        ViewWidget.T(xlfVar, null, 1, null);
    }

    public final void D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4780846", new Object[]{this});
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.M0();
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final void E1(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("679e2f14", new Object[]{this, rectF});
        } else if (!lg4.l()) {
            if (!W().b0()) {
                if (rectF.width() > 0.95f) {
                    rectF.left = 0.05f;
                    rectF.right = 0.95f;
                }
                if (rectF.height() > 0.95f) {
                    rectF.top = 0.05f;
                    rectF.bottom = 0.95f;
                    return;
                }
                return;
            }
            if (rectF.width() > 0.8f) {
                rectF.left = 0.1f;
                rectF.right = 0.9f;
            }
            if (rectF.height() > 0.8f) {
                rectF.top = 0.1f;
                rectF.bottom = 0.9f;
            }
        }
    }

    public final void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407cb588", new Object[]{this});
        } else if (W().X()) {
            enf enfVar = new enf(E(), this, W(), new IrpWidget$attachTranslateUIWidget$1(this), new k());
            ViewWidget.T(enfVar, null, 1, null);
            this.r = enfVar;
        }
    }

    public final void G1(int i2, String str, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cd1107", new Object[]{this, new Integer(i2), str, onClickListener, onClickListener2, str2, str3});
            return;
        }
        ckf.g(str, "msg");
        if (!this.A && !this.y.b()) {
            this.y.c(str, onClickListener, str2, onClickListener2, str3);
        }
    }

    public final void I0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55454bfe", new Object[]{this, new Boolean(z)});
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.r0(z);
            anf anfVar2 = this.t;
            if (anfVar2 != null) {
                ylf x0 = anfVar2.x0();
                this.u = x0;
                if (x0 != null) {
                    x0.x0(W().H());
                } else {
                    ckf.y("titleBarWidget");
                    throw null;
                }
            } else {
                ckf.y("scrollInterceptWidget");
                throw null;
            }
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final void I1(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae446fc4", new Object[]{this, new Float(f2)});
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.F0(f2, 150L, null);
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final void J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        tv tvVar = this.q;
        if (tvVar != null) {
            tvVar.i0();
        }
    }

    @Override // tb.txh, tb.vz
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        super.K();
        this.J.removeCallbacksAndMessages(null);
    }

    public final void K0(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd6f7c6", new Object[]{this, message});
        } else if (!this.I && this.F == null) {
            Object obj = message.obj;
            if (obj instanceof Long) {
                long j2 = this.H;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                } else if (j2 > ((Long) obj).longValue()) {
                    A1();
                } else {
                    ylf ylfVar = this.u;
                    if (ylfVar != null) {
                        ContentOffsetView X = ylfVar.X();
                        ckf.d(X);
                        float translationY = X.getTranslationY();
                        ylf ylfVar2 = this.u;
                        if (ylfVar2 != null) {
                            float l0 = ylfVar2.l0();
                            if (Math.abs(translationY) < l0) {
                                float f2 = 0.0f;
                                if (translationY != 0.0f) {
                                    if (this.G > 0) {
                                        f2 = -l0;
                                    }
                                    ValueAnimator P0 = P0(translationY, f2);
                                    ValueAnimator valueAnimator = this.F;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    this.F = P0;
                                    if (P0 != null) {
                                        P0.start();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ckf.y("titleBarWidget");
                        throw null;
                    }
                    ckf.y("titleBarWidget");
                    throw null;
                }
            }
        }
    }

    @Override // tb.txh, tb.vz
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
            return;
        }
        super.L();
        this.A = true;
    }

    @Override // tb.txh, tb.vz
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
            return;
        }
        super.M();
        if (this.E) {
            this.E = false;
        } else {
            ((IrpV2Presenter) i0()).a0();
        }
        this.A = false;
    }

    public final void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d863c685", new Object[]{this});
            return;
        }
        xlf xlfVar = this.p;
        if (xlfVar != null) {
            xlfVar.h0();
        } else {
            ckf.y("previewWidget");
            throw null;
        }
    }

    public final void M1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691cb16e", new Object[]{this, jSONObject});
            return;
        }
        k7 k7Var = this.x;
        if (k7Var != null) {
            k7Var.i(jSONObject);
        } else {
            ckf.y("aiWidget");
            throw null;
        }
    }

    public final void N0(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d769f315", new Object[]{this, d1aVar});
            return;
        }
        ckf.g(d1aVar, "closePageOption");
        if (((IrpV2Presenter) i0()).p0() || !W().b0()) {
            d1aVar.invoke();
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.F0(1.0f, 400L, new l(d1aVar));
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final void N1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a4222d", new Object[]{this, jSONObject});
            return;
        }
        k7 k7Var = this.x;
        if (k7Var != null) {
            k7Var.j(jSONObject);
        } else {
            ckf.y("aiWidget");
            throw null;
        }
    }

    /* renamed from: O0 */
    public IrpV2Presenter h0(IrpWidget irpWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpV2Presenter) ipChange.ipc$dispatch("8c29b843", new Object[]{this, irpWidget});
        }
        ckf.g(irpWidget, "widget");
        return new IrpV2Presenter(E(), this, false, 4, null);
    }

    public final void O1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe748a9", new Object[]{this, new Boolean(z)});
            return;
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.C0(z);
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    public final void P1(Pair<String, String> pair, Pair<String, String> pair2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b508120", new Object[]{this, pair, pair2});
            return;
        }
        ckf.g(pair, "srcLang");
        ckf.g(pair2, "targetLang");
        enf enfVar = this.r;
        if (enfVar != null) {
            enfVar.i0(pair, pair2);
        }
    }

    public final int Q0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("736e96fe", new Object[]{this, new Integer(i2)})).intValue();
        }
        agh.h(TAG, ckf.p("elasticPageScroll: dy=", Integer.valueOf(i2)));
        this.G = i2;
        this.H = System.currentTimeMillis();
        ylf ylfVar = this.u;
        if (ylfVar != null) {
            ContentOffsetView X = ylfVar.X();
            ckf.d(X);
            float translationY = X.getTranslationY();
            ylf ylfVar2 = this.u;
            if (ylfVar2 != null) {
                float l0 = ylfVar2.l0();
                float f2 = i2;
                float f3 = translationY - f2;
                ValueAnimator valueAnimator = this.F;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    A1();
                }
                float f4 = -l0;
                if (f3 < f4) {
                    f3 = f4;
                } else if (f3 > 0.0f) {
                    f3 = 0.0f;
                }
                ylf ylfVar3 = this.u;
                if (ylfVar3 != null) {
                    ContentOffsetView X2 = ylfVar3.X();
                    ckf.d(X2);
                    this.S = X2.getTranslationY();
                    ylf ylfVar4 = this.u;
                    if (ylfVar4 != null) {
                        ContentOffsetView X3 = ylfVar4.X();
                        ckf.d(X3);
                        X3.setTranslationY(f3);
                        s1(f3, l0);
                        hmf hmfVar = this.w;
                        if (hmfVar != null) {
                            FrameLayout X4 = hmfVar.X();
                            ckf.d(X4);
                            float translationY2 = X4.getTranslationY();
                            float f5 = translationY2 - f2;
                            if (f5 < 0.0f) {
                                l0 = 0.0f;
                            } else if (f5 <= l0) {
                                l0 = f5;
                            }
                            hmf hmfVar2 = this.w;
                            if (hmfVar2 != null) {
                                hmfVar2.A0(l0);
                                return (int) (translationY2 - l0);
                            }
                            ckf.y("hybridWidget");
                            throw null;
                        }
                        ckf.y("hybridWidget");
                        throw null;
                    }
                    ckf.y("titleBarWidget");
                    throw null;
                }
                ckf.y("titleBarWidget");
                throw null;
            }
            ckf.y("titleBarWidget");
            throw null;
        }
        ckf.y("titleBarWidget");
        throw null;
    }

    public final void Q1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd49b306", new Object[]{this, new Boolean(z)});
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.R0(z);
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final Bitmap R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("53fdd5b8", new Object[]{this});
        }
        ylf ylfVar = this.u;
        if (ylfVar != null) {
            return ylfVar.k0();
        }
        ckf.y("titleBarWidget");
        throw null;
    }

    public final void R1(float f2, float f3) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("612b6fb5", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (W().H() != null && !lg4.d()) {
            nmf o2 = W().o();
            if (o2 == null) {
                jSONObject = null;
            } else {
                jSONObject = o2.d();
            }
            if (jSONObject != null) {
                this.D = true;
                if (W().M()) {
                    F1(W().l(), false);
                    return;
                }
                nmf o3 = W().o();
                ckf.d(o3);
                JSONObject d2 = o3.d();
                ckf.d(d2);
                ixn a2 = fk2.a(d2);
                if (a2 == null || (a2.b() == null && a2.c() == null)) {
                    wlf wlfVar = this.B;
                    if (wlfVar != null) {
                        wlfVar.h("CropEmpty", "-1", "empty");
                    }
                    if (W().H() != null) {
                        if (a2 == null) {
                            a2 = new ixn();
                        }
                        int[] x = W().x();
                        a2.d(new RectF(x[0], x[1], 0.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                a2.a(f2, f3);
                if (a2.c() != null) {
                    F1(a2.c(), true);
                } else if (a2.b() != null) {
                    F1(yz3.m(a2.b()), true);
                }
            }
        }
    }

    public final boolean S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27d1219a", new Object[]{this})).booleanValue();
        }
        return this.D;
    }

    public final void S1(List<ivn> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aaa6787", new Object[]{this, list});
            return;
        }
        xlf xlfVar = this.p;
        if (xlfVar != null) {
            xlfVar.u0(list);
        } else {
            ckf.y("previewWidget");
            throw null;
        }
    }

    public final IrpDatasource T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpDatasource) ipChange.ipc$dispatch("56eb987f", new Object[]{this});
        }
        return this.n;
    }

    public final void T1(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d6baf0", new Object[]{this, new Integer(i2)});
            return;
        }
        ylf ylfVar = this.u;
        if (ylfVar != null) {
            ylfVar.A0(i2);
        } else {
            ckf.y("titleBarWidget");
            throw null;
        }
    }

    public final int U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ede02b9d", new Object[]{this})).intValue();
        }
        xlf xlfVar = this.p;
        if (xlfVar != null) {
            return xlfVar.k0();
        }
        ckf.y("previewWidget");
        throw null;
    }

    public final void U1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba7d667", new Object[]{this, str});
            return;
        }
        ylf ylfVar = this.u;
        if (ylfVar != null) {
            ylfVar.y0(str);
        } else {
            ckf.y("titleBarWidget");
            throw null;
        }
    }

    public final cnf V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cnf) ipChange.ipc$dispatch("be6a1ed5", new Object[]{this});
        }
        return this.m;
    }

    public final void V1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f73bc2", new Object[]{this, str});
            return;
        }
        ylf ylfVar = this.u;
        if (ylfVar != null) {
            ylfVar.z0(str);
        } else {
            ckf.y("titleBarWidget");
            throw null;
        }
    }

    public final void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7944d055", new Object[]{this});
        } else {
            this.y.a();
        }
    }

    public final void W1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112275c0", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ylf ylfVar = this.u;
            if (ylfVar != null) {
                ylfVar.D0();
            } else {
                ckf.y("titleBarWidget");
                throw null;
            }
        } else {
            ylf ylfVar2 = this.u;
            if (ylfVar2 != null) {
                ylfVar2.C0();
            } else {
                ckf.y("titleBarWidget");
                throw null;
            }
        }
    }

    public final void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47d4b6d", new Object[]{this});
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.z0();
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35387db9", new Object[]{this});
        } else {
            E().finish();
        }
    }

    public final void a1(hpk hpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a29dcc", new Object[]{this, hpkVar});
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.F0(W().w().i(), 150L, hpkVar);
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final boolean b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94b6e5", new Object[]{this})).booleanValue();
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            return hmfVar.s0();
        }
        ckf.y("hybridWidget");
        throw null;
    }

    public final boolean c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80f0ce2f", new Object[]{this})).booleanValue();
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            return hmfVar.t0();
        }
        ckf.y("hybridWidget");
        throw null;
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4844c693", new Object[]{this, jSONObject});
            return;
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.o0("changeMainFrameState", jSONObject);
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    public final void e1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990f11f1", new Object[]{this, new Boolean(z)});
            return;
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) Constant.API_PARAMS_KEY_ENABLE, String.valueOf(z));
            xhv xhvVar = xhv.INSTANCE;
            hmfVar.o0("aiWidgetState", jSONObject);
            return;
        }
        ckf.y("hybridWidget");
        throw null;
    }

    public final void f1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce07439a", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "params");
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.o0("notifyScreenshotsUpdate", jSONObject);
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    public final void g1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ff690b", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "params");
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.o0("pageScrollState", jSONObject);
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    public final void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6d8402", new Object[]{this});
            return;
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.y0();
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    public final void i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c5c063", new Object[]{this});
            return;
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.z0();
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    @Override // tb.dmf.a
    public void j(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f249dc", new Object[]{this, new Boolean(z), view});
            return;
        }
        ckf.g(view, "containerView");
        if (z) {
            wlf wlfVar = this.B;
            if (wlfVar != null) {
                wlfVar.i("PageWebLoad");
                return;
            }
            return;
        }
        wlf wlfVar2 = this.B;
        if (wlfVar2 != null) {
            wlfVar2.i("PageMuiseLoad");
        }
        pmf.y0();
    }

    public final void j1(Integer num, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25bcd492", new Object[]{this, num, rectF, new Boolean(z)});
        } else if (rectF != null) {
            l1(rectF, num);
            ylf ylfVar = this.u;
            String str = null;
            if (ylfVar != null) {
                ylfVar.B0(rectF, z);
                nmf o2 = W().o();
                if (TextUtils.isEmpty(o2 == null ? null : o2.f())) {
                    str = "";
                } else {
                    nmf o3 = W().o();
                    if (o3 != null) {
                        str = o3.f();
                    }
                }
                mzu.i("Page_PhotoSearchResult", "objectSwitch", "for_bts", str);
                return;
            }
            ckf.y("titleBarWidget");
            throw null;
        }
    }

    @Override // tb.dmf.a
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43c0ff9", new Object[]{this});
            return;
        }
        W0();
        ((IrpV2Presenter) i0()).s0();
        wlf wlfVar = this.B;
        if (wlfVar != null) {
            wlfVar.i("PageDowngrade");
        }
        TLogTracker.k("HybridDowngrade", null);
    }

    public final void k1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fe1d9d", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "params");
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.o0("parentPageScrollState", jSONObject);
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    public final void l1(RectF rectF, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3ef9f9", new Object[]{this, rectF, num});
        } else {
            ((IrpV2Presenter) i0()).r0(rectF, num);
        }
    }

    @Override // tb.ylf.a
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4403c15", new Object[]{this});
            return;
        }
        jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), StatisticalDataPoint$DataPoint.IRP_CLOSE_RESULT_PAGE_CLICK.getPoint(), new String[0]);
        E().finish();
    }

    public final void m1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b0dd46", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "params");
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.o0("notifyPopLayerState", jSONObject);
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    @Override // tb.dmf.a
    public void n(boolean z, Integer num, String str) {
        String str2;
        String num2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e57c1e", new Object[]{this, new Boolean(z), num, str});
        } else if (!z) {
            wlf wlfVar = this.B;
            if (wlfVar != null) {
                String str3 = "unknown";
                if (!(num == null || (num2 = num.toString()) == null)) {
                    str3 = num2;
                }
                wlfVar.h("PageMuiseRun", str3, str);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("hybrid", "muise");
            if (num == null || (str2 = num.toString()) == null) {
                str2 = "";
            }
            linkedHashMap.put("errCode", str2);
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("errMsg", str);
            TLogTracker.k("HybridRun", linkedHashMap);
        }
    }

    public final void n1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad83821", new Object[]{this, jSONObject});
            return;
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.D0(jSONObject);
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    public final void o1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1f69e3", new Object[]{this, jSONObject});
            return;
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.E0(jSONObject);
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    public final boolean p1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a6b109d", new Object[]{this})).booleanValue();
        }
        if (W().X()) {
            if (this.M != 3) {
                return true;
            }
            v1(false);
            return false;
        } else if (((IrpV2Presenter) i0()).b0()) {
            return false;
        } else {
            ((IrpV2Presenter) i0()).Y();
            return true;
        }
    }

    /* renamed from: q1 */
    public FrameLayout b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(E());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (!W().b0()) {
            frameLayout.setBackgroundColor(Color.parseColor("#000000"));
        }
        frameLayout.setClipChildren(false);
        return frameLayout;
    }

    public final void r1(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
            return;
        }
        hmf hmfVar = this.w;
        if (hmfVar != null) {
            hmfVar.w0(num);
            xlf xlfVar = this.p;
            if (xlfVar != null) {
                xlfVar.o0(num);
                xlf xlfVar2 = this.p;
                if (xlfVar2 != null) {
                    float g2 = caa.g(E());
                    anf anfVar = this.t;
                    if (anfVar != null) {
                        xlfVar2.s0(Float.valueOf(g2 - p1p.b(anfVar.u0())));
                        anf anfVar2 = this.t;
                        if (anfVar2 != null) {
                            anfVar2.H0(num);
                        } else {
                            ckf.y("scrollInterceptWidget");
                            throw null;
                        }
                    } else {
                        ckf.y("scrollInterceptWidget");
                        throw null;
                    }
                } else {
                    ckf.y("previewWidget");
                    throw null;
                }
            } else {
                ckf.y("previewWidget");
                throw null;
            }
        } else {
            ckf.y("hybridWidget");
            throw null;
        }
    }

    @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
    public void s(int i2, int i3, int i4, int i5) {
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691aec9", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        if (i3 <= i5) {
            i5 = i3;
        }
        if (i3 >= 0) {
            i6 = i5;
        }
        int i7 = i2 - i6;
        if (i7 < 0) {
            Y0(i7);
        }
        mvm mvmVar = this.s;
        if (mvmVar != null && i4 != 0) {
            mvmVar.h0(Math.min(Math.max(1 - (i6 / i4), 0.0f), 1.0f));
        }
    }

    public final void t1(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196ee357", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (z) {
            k7 k7Var = this.x;
            if (k7Var != null) {
                k7Var.h(z2, false);
            } else {
                ckf.y("aiWidget");
                throw null;
            }
        } else {
            k7 k7Var2 = this.x;
            if (k7Var2 != null) {
                k7Var2.e(z2);
            } else {
                ckf.y("aiWidget");
                throw null;
            }
        }
    }

    @Override // tb.dmf.a
    public int u(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df098bad", new Object[]{this, new Integer(i2)})).intValue();
        }
        return Y0(i2);
    }

    public final void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("563c9dd8", new Object[]{this});
            return;
        }
        Activity E = E();
        IrpDatasource W = W();
        V X = X();
        ckf.d(X);
        this.x = new k7(E, this, W, (ViewGroup) X, new IrpWidget$attachAIWidget$1(this));
    }

    public final void v1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e2055e", new Object[]{this, new Boolean(z)});
        } else if (z) {
            I1(0.0f);
            enf enfVar = this.r;
            if (enfVar != null) {
                enfVar.j0(true);
            }
        } else {
            I1(1.0f);
            enf enfVar2 = this.r;
            if (enfVar2 != null) {
                enfVar2.j0(false);
            }
        }
    }

    public final void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531de0f7", new Object[]{this, new Boolean(z)});
            return;
        }
        k7 k7Var = this.x;
        if (k7Var != null) {
            k7Var.d();
            k7 k7Var2 = this.x;
            if (k7Var2 != null) {
                k7Var2.h(true, z);
            } else {
                ckf.y("aiWidget");
                throw null;
            }
        } else {
            ckf.y("aiWidget");
            throw null;
        }
    }

    public final void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b41202", new Object[]{this});
            return;
        }
        D0();
        C0();
        z0();
        F0();
        E0();
        A0();
        B0();
        v0();
    }

    public final void x1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e433a119", new Object[]{this, new Boolean(z)});
            return;
        }
        enf enfVar = this.r;
        if (enfVar != null) {
            enfVar.k0(z);
        }
    }

    public final void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564dda79", new Object[]{this});
        } else if (yak.f31939a.e().a()) {
            new y2o(E(), new IrpWidget$attachDebugWidget$1(this)).a();
        }
    }

    public final void y1(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccfee460", new Object[]{this, new Boolean(z), str});
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.K0(z, str);
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    @Override // tb.ylf.a
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce74979", new Object[]{this});
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.F0(0.0f, 150L, null);
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5abc7fe2", new Object[]{this});
        } else {
            this.o = new cmf(E(), this, W(), new b());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements xlf.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.xlf.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbd78e04", new Object[]{this});
                return;
            }
            anf m0 = IrpWidget.m0(IrpWidget.this);
            if (m0 != null) {
                m0.F0(0.0f, 150L, null);
            } else {
                ckf.y("scrollInterceptWidget");
                throw null;
            }
        }

        @Override // tb.xlf.a
        public void b(RectF rectF, mh7 mh7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55b1e807", new Object[]{this, rectF, mh7Var});
                return;
            }
            my4.d(true);
            IrpWidget irpWidget = IrpWidget.this;
            ylf n0 = IrpWidget.n0(irpWidget);
            if (n0 != null) {
                irpWidget.j1(Integer.valueOf(n0.j0(rectF)), rectF, false);
                IrpWidget.this.W().d("objectFrom", "editor");
                jzu.e("changeObjectClick", wxi.KEY_PHOTO_FROM, IrpWidget.this.W().B().getValue());
                return;
            }
            ckf.y("titleBarWidget");
            throw null;
        }

        @Override // tb.xlf.a
        public void e(RectF rectF, mh7 mh7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d98b96f", new Object[]{this, rectF, mh7Var});
                return;
            }
            my4.d(true);
            if (rectF != null) {
                try {
                    nmf o = IrpWidget.this.W().o();
                    String w = o == null ? null : o.w();
                    if (TextUtils.isEmpty(w)) {
                        jzu.e("changebox", wxi.KEY_PHOTO_FROM, IrpWidget.this.W().B().getValue());
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(rectF.left);
                        sb.append('-');
                        sb.append(rectF.top);
                        sb.append('-');
                        sb.append(rectF.right);
                        sb.append('-');
                        sb.append(rectF.bottom);
                        jzu.e("changebox", "tfs", w, "region", sb.toString(), wxi.KEY_PHOTO_FROM, IrpWidget.this.W().B().getValue());
                    }
                    jzu.n("Page_PhotoSearchResult", "resizeQuery", 19999, "pssource", IrpWidget.this.W().y());
                } catch (Exception unused) {
                }
                jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), StatisticalDataPoint$DataPoint.SEARCH_MOVE_REGION.getPoint(), new String[0]);
                IrpWidget.this.W().d("objectFrom", "custom");
                IrpWidget irpWidget = IrpWidget.this;
                ylf n0 = IrpWidget.n0(irpWidget);
                if (n0 != null) {
                    IrpWidget.o0(irpWidget, rectF, Integer.valueOf(n0.j0(rectF)));
                    ylf n02 = IrpWidget.n0(IrpWidget.this);
                    if (n02 != null) {
                        n02.i0(rectF);
                    } else {
                        ckf.y("titleBarWidget");
                        throw null;
                    }
                } else {
                    ckf.y("titleBarWidget");
                    throw null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class o implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            ckf.g(message, "msg");
            if (message.what != 10001) {
                return false;
            }
            IrpWidget.k0(IrpWidget.this, message);
            return true;
        }
    }

    public final void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65268362", new Object[]{this});
        } else if (!W().Q()) {
            umf umfVar = new umf(E(), this, W(), new e(), new d());
            ViewWidget.T(umfVar, null, 1, null);
            umfVar.i0();
            HashMap hashMap = new HashMap();
            String y = W().y();
            if (y == null) {
                y = "";
            }
            hashMap.put("pssource", y);
            String value = W().B().getValue();
            ckf.f(value, "model.photoFrom.value");
            hashMap.put(wxi.KEY_PHOTO_FROM, value);
            hashMap.put("loadingtype", "pic");
            mzu.p("Page_PhotoSearchResult", "loadingExpose", hashMap);
            this.q = umfVar;
        }
    }

    public final void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5ef45b", new Object[]{this});
            return;
        }
        anf anfVar = new anf(E(), this, W(), new j(), this, this, this, null);
        this.t = anfVar;
        ViewWidget.T(anfVar, null, 1, null);
        anf anfVar2 = this.t;
        if (anfVar2 != null) {
            this.w = anfVar2.w0();
            anf anfVar3 = this.t;
            if (anfVar3 != null) {
                this.u = anfVar3.x0();
                anf anfVar4 = this.t;
                if (anfVar4 != null) {
                    anfVar4.Q0(new IrpWidget$attachScrollInterceptWidget$2(this));
                } else {
                    ckf.y("scrollInterceptWidget");
                    throw null;
                }
            } else {
                ckf.y("scrollInterceptWidget");
                throw null;
            }
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final void H0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d945c66", new Object[]{this, new Integer(i2)});
            return;
        }
        int i3 = this.L;
        if (i3 != i2) {
            SparseIntArray sparseIntArray = this.K;
            ylf ylfVar = this.u;
            if (ylfVar != null) {
                sparseIntArray.put(i3, ylfVar.p0());
                ylf ylfVar2 = this.u;
                if (ylfVar2 != null) {
                    float l0 = ylfVar2.l0();
                    float f2 = this.K.get(i2, 0);
                    ylf ylfVar3 = this.u;
                    if (ylfVar3 != null) {
                        ContentOffsetView X = ylfVar3.X();
                        if (X != null) {
                            float f3 = -l0;
                            if (f2 >= f3) {
                                f3 = f2 > 0.0f ? 0.0f : f2;
                            }
                            X.setTranslationY(f3);
                        }
                        float f4 = f2 + l0;
                        hmf hmfVar = this.w;
                        if (hmfVar != null) {
                            FrameLayout X2 = hmfVar.X();
                            if (X2 != null) {
                                if (f4 < 0.0f) {
                                    l0 = 0.0f;
                                } else if (f4 <= l0) {
                                    l0 = f4;
                                }
                                X2.setTranslationY(l0);
                            }
                            this.L = i2;
                            return;
                        }
                        ckf.y("hybridWidget");
                        throw null;
                    }
                    ckf.y("titleBarWidget");
                    throw null;
                }
                ckf.y("titleBarWidget");
                throw null;
            }
            ckf.y("titleBarWidget");
            throw null;
        }
    }

    public final int Y0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("217e2efe", new Object[]{this, new Integer(i2)})).intValue();
        }
        ylf ylfVar = this.u;
        if (ylfVar == null) {
            ckf.y("titleBarWidget");
            throw null;
        } else if (ylfVar.s0()) {
            return 0;
        } else {
            anf anfVar = this.t;
            if (anfVar == null) {
                ckf.y("scrollInterceptWidget");
                throw null;
            } else if (anfVar.t0()) {
                return 0;
            } else {
                anf anfVar2 = this.t;
                if (anfVar2 != null) {
                    if (anfVar2.E0()) {
                        anf anfVar3 = this.t;
                        if (anfVar3 == null) {
                            ckf.y("scrollInterceptWidget");
                            throw null;
                        } else if (!anfVar3.D0()) {
                            return 0;
                        }
                    }
                    return Q0(i2);
                }
                ckf.y("scrollInterceptWidget");
                throw null;
            }
        }
    }

    @Override // tb.ylf.a
    public void p(p9j p9jVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f38a71c", new Object[]{this, p9jVar});
        } else if (p9jVar != null) {
            jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), "ObjectchangeClickon", wxi.KEY_PHOTO_FROM, W().B().getValue());
            Bitmap H = W().H();
            xlf xlfVar = this.p;
            if (xlfVar != null) {
                RectF rectF = p9jVar.b;
                int width = H == null ? 0 : H.getWidth();
                if (H != null) {
                    i2 = H.getHeight();
                }
                xlfVar.r0(rectF, width, i2);
                W().d("objectFrom", "header");
                j1(Integer.valueOf(p9jVar.f25964a), p9jVar.b, p9jVar.h);
                return;
            }
            ckf.y("previewWidget");
            throw null;
        }
    }

    public final void w1(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a268555", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        ckf.g(jSONObject, "pageScrollState");
        if (this.C) {
            anf anfVar = this.t;
            if (anfVar != null) {
                anfVar.O0(!z);
                g1(jSONObject);
                return;
            }
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final void z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dee87ac", new Object[]{this});
            return;
        }
        anf anfVar = this.t;
        if (anfVar != null) {
            anfVar.s0(0);
        } else {
            ckf.y("scrollInterceptWidget");
            throw null;
        }
    }

    public final void F1(List<RectF> list, boolean z) {
        List<RectF> list2;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa01b1f", new Object[]{this, list, new Boolean(z)});
        } else if ((!this.z || W().H() != null) && (list2 = list) != null && !list2.isEmpty()) {
            this.z = true;
            int[] x = W().x();
            ArrayList arrayList = new ArrayList();
            LinkedList<mh7> linkedList = new LinkedList<>();
            ArrayList arrayList2 = new ArrayList();
            if (!W().q().isEmpty()) {
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i2 = 0;
                        break;
                    }
                    int i4 = i3 + 1;
                    RectF rectF = list.get(i3);
                    if (rectF == null) {
                        i3 = i4;
                    } else {
                        if (z) {
                            float f2 = rectF.left;
                            float f3 = x[0];
                            float f4 = rectF.top;
                            float f5 = x[1];
                            rectF.set(f2 / f3, f4 / f5, rectF.right / f3, rectF.bottom / f5);
                        }
                        E1(rectF);
                        mh7 mh7Var = new mh7(rectF, pv8.REGION_SEARCH);
                        arrayList.add(mh7Var);
                        linkedList.add(mh7Var);
                        arrayList2.add(rectF);
                        i2 = i4;
                    }
                }
                for (zmf.a aVar : W().q()) {
                    RectF rectF2 = aVar.b;
                    if (rectF2 != null) {
                        E1(rectF2);
                        mh7 mh7Var2 = new mh7(rectF2, pv8.REGION_SCAN, aVar.g);
                        aVar.d = new RectF(rectF2);
                        arrayList.add(mh7Var2);
                        linkedList.add(mh7Var2);
                        arrayList2.add(rectF2);
                    } else {
                        return;
                    }
                }
                u0(i2, z, list, arrayList, linkedList, arrayList2);
            } else {
                u0(0, z, list, arrayList, linkedList, arrayList2);
            }
            W().e0(linkedList);
            L0(linkedList.size());
            ylf ylfVar = this.u;
            if (ylfVar != null) {
                ylfVar.h0(arrayList);
                xlf xlfVar = this.p;
                if (xlfVar != null) {
                    anf anfVar = this.t;
                    if (anfVar != null) {
                        xlfVar.v0(arrayList, Float.valueOf(anfVar.v0()));
                    } else {
                        ckf.y("scrollInterceptWidget");
                        throw null;
                    }
                } else {
                    ckf.y("previewWidget");
                    throw null;
                }
            } else {
                ckf.y("titleBarWidget");
                throw null;
            }
        } else {
            L0(0);
        }
    }

    public final void G0(boolean z) {
        mh7 mh7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5833df0b", new Object[]{this, new Boolean(z)});
            return;
        }
        xlf xlfVar = this.p;
        RectF rectF = null;
        if (xlfVar != null) {
            xlfVar.t0(true ^ W().X());
            tv tvVar = this.q;
            if (tvVar != null) {
                boolean m2 = W().w().m();
                if (z || m2) {
                    tvVar.h0();
                    return;
                }
                if (W().M()) {
                    List<RectF> l2 = W().l();
                    if (l2 != null) {
                        rectF = l2.get(0);
                    }
                } else {
                    LinkedList<mh7> g2 = W().g();
                    if (!(g2 == null || (mh7Var = g2.get(0)) == null)) {
                        rectF = mh7Var.f24039a;
                    }
                }
                if (rectF == null) {
                    tvVar.h0();
                } else {
                    tvVar.h0();
                }
            }
        } else {
            ckf.y("previewWidget");
            throw null;
        }
    }

    public final void K1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7ef30", new Object[]{this});
            return;
        }
        if (W().a0() && W().H() == null) {
            Q1(true);
        } else if (!W().P() || W().H() != null) {
            hmf hmfVar = this.w;
            if (hmfVar == null) {
                ckf.y("hybridWidget");
                throw null;
            } else if (hmfVar.s0()) {
                Q1(true);
                xlf xlfVar = this.p;
                if (xlfVar != null) {
                    xlfVar.q0(null, false);
                    W().w().z("text");
                    J0(this, false, 1, null);
                } else {
                    ckf.y("previewWidget");
                    throw null;
                }
            } else {
                Q1(!W().w().b());
                ylf ylfVar = this.u;
                if (ylfVar != null) {
                    ylfVar.E0(true, W().w().g());
                } else {
                    ckf.y("titleBarWidget");
                    throw null;
                }
            }
        } else {
            Q1(true);
            ylf ylfVar2 = this.u;
            if (ylfVar2 != null) {
                ylfVar2.E0(false, false);
            } else {
                ckf.y("titleBarWidget");
                throw null;
            }
        }
        ylf ylfVar3 = this.u;
        if (ylfVar3 != null) {
            ylfVar3.u0();
            a1(new p());
            return;
        }
        ckf.y("titleBarWidget");
        throw null;
    }

    public final void L0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de8a4af", new Object[]{this, new Integer(i2)});
            return;
        }
        ylf ylfVar = this.u;
        if (ylfVar == null) {
            ckf.y("titleBarWidget");
            throw null;
        } else if (!(ylfVar instanceof ulf)) {
            if (W().a0() && W().H() == null) {
                ylf ylfVar2 = this.u;
                if (ylfVar2 == null) {
                    ckf.y("titleBarWidget");
                    throw null;
                } else if (!(ylfVar2 instanceof ulf)) {
                    W().w().z("text");
                    J0(this, false, 1, null);
                }
            } else if (i2 <= 1) {
                I0(true);
            }
        }
    }

    public final void L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e6f431", new Object[]{this});
            return;
        }
        if (W().a0() && W().H() == null) {
            Q1(true);
        } else if (!W().P() || W().H() != null) {
            hmf hmfVar = this.w;
            if (hmfVar == null) {
                ckf.y("hybridWidget");
                throw null;
            } else if (hmfVar.s0()) {
                Q1(true);
                xlf xlfVar = this.p;
                if (xlfVar != null) {
                    xlfVar.q0(null, false);
                    W().w().z("text");
                    J0(this, false, 1, null);
                } else {
                    ckf.y("previewWidget");
                    throw null;
                }
            } else {
                Q1(!W().w().b());
                ylf ylfVar = this.u;
                if (ylfVar != null) {
                    ylfVar.E0(true, W().w().g());
                } else {
                    ckf.y("titleBarWidget");
                    throw null;
                }
            }
        } else {
            Q1(true);
            ylf ylfVar2 = this.u;
            if (ylfVar2 != null) {
                ylfVar2.E0(false, false);
            } else {
                ckf.y("titleBarWidget");
                throw null;
            }
        }
        ylf ylfVar3 = this.u;
        if (ylfVar3 != null) {
            ylfVar3.u0();
            C1();
            return;
        }
        ckf.y("titleBarWidget");
        throw null;
    }

    public final void X1(ArrayList<yeu> arrayList) {
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f79fdec1", new Object[]{this, arrayList});
            return;
        }
        ckf.g(arrayList, "result");
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int[] x = W().x();
            if (x.length > 1) {
                i2 = x[0];
                i3 = x[1];
            } else {
                i3 = 0;
                i2 = 0;
            }
            xlf xlfVar = this.p;
            if (xlfVar != null) {
                View j0 = xlfVar.j0();
                int width = j0 == null ? 0 : j0.getWidth();
                xlf xlfVar2 = this.p;
                if (xlfVar2 != null) {
                    View j02 = xlfVar2.j0();
                    if (j02 != null) {
                        i4 = j02.getHeight();
                    }
                    float b2 = (i2 <= 0 || i3 <= 0 || width <= 0 || i4 <= 0) ? 1.0f : width / hfn.b(i2, i4 / i3);
                    Iterator<yeu> it = arrayList.iterator();
                    while (it.hasNext()) {
                        yeu next = it.next();
                        RectF d2 = next.d();
                        String f2 = trl.f(d2);
                        ckf.f(f2, "regionKey");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "region", f2);
                        jSONObject.put((JSONObject) "textSize", (String) Float.valueOf(next.b() * b2));
                        jSONObject.put((JSONObject) "maxWidth", (String) Integer.valueOf((int) (width * d2.width())));
                        jSONObject.put((JSONObject) "lineCount", (String) Integer.valueOf(next.c()));
                        jSONObject.put((JSONObject) "result", next.a());
                        xhv xhvVar = xhv.INSTANCE;
                        arrayList2.add(new ivn(f2, "nt_translate_result", jSONObject, true));
                    }
                    xlf xlfVar3 = this.p;
                    if (xlfVar3 != null) {
                        xlfVar3.w0(arrayList2);
                    } else {
                        ckf.y("previewWidget");
                        throw null;
                    }
                } else {
                    ckf.y("previewWidget");
                    throw null;
                }
            } else {
                ckf.y("previewWidget");
                throw null;
            }
        }
    }

    public final void Z0() {
        LinkedList<mh7> g2;
        MaType type;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50313ce4", new Object[]{this});
            return;
        }
        List<zmf.a> q = W().q();
        if (!q.isEmpty() && (g2 = W().g()) != null && !g2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int[] x = W().x();
            Iterator<zmf.a> it = q.iterator();
            int i2 = 1;
            while (true) {
                String str = null;
                if (it.hasNext()) {
                    zmf.a next = it.next();
                    RectF rectF = next.b;
                    if (rectF != null) {
                        E1(rectF);
                        mh7 mh7Var = new mh7(rectF, pv8.REGION_SCAN, next.g);
                        next.d = new RectF(rectF);
                        g2.add(i2, mh7Var);
                        arrayList.add(mh7Var);
                        if (!next.g) {
                            String f2 = trl.f(rectF);
                            ckf.f(f2, "regionKey");
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put((JSONObject) "region", f2);
                            if (x.length == 2) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(x[0]);
                                sb.append('_');
                                sb.append(x[1]);
                                jSONObject.put((JSONObject) "imgSize", sb.toString());
                            }
                            MaResult maResult = next.f32866a;
                            jSONObject.put((JSONObject) "type", (String) ((maResult == null || (type = maResult.getType()) == null) ? null : Integer.valueOf(type.getDiscernType())));
                            MaResult maResult2 = next.f32866a;
                            jSONObject.put((JSONObject) "content", maResult2 == null ? null : maResult2.getText());
                            nmf o2 = W().o();
                            if (o2 != null) {
                                str = o2.w();
                            }
                            jSONObject.put((JSONObject) "tfskey", str);
                            xhv xhvVar = xhv.INSTANCE;
                            arrayList2.add(new ivn(f2, "nt_scan_code_hint", jSONObject, true));
                        }
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    ylf ylfVar = this.u;
                    if (ylfVar != null) {
                        ylfVar.q0(arrayList, 1);
                        xlf xlfVar = this.p;
                        if (xlfVar != null) {
                            xlfVar.l0(arrayList2);
                            return;
                        } else {
                            ckf.y("previewWidget");
                            throw null;
                        }
                    } else {
                        ckf.y("titleBarWidget");
                        throw null;
                    }
                }
            }
        }
    }

    public final ValueAnimator P0(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("30ee4f72", new Object[]{this, new Float(f2), new Float(f3)});
        }
        ylf ylfVar = this.u;
        if (ylfVar != null) {
            float l0 = ylfVar.l0();
            if (l0 <= 0.0f) {
                return null;
            }
            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            ref$FloatRef.element = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
            ofFloat.setDuration((((float) 250) * Math.abs(f3 - f2)) / l0);
            ofFloat.setInterpolator(new LinearInterpolator());
            ValueAnimator.setFrameDelay(16L);
            ofFloat.addUpdateListener(new m(ref$FloatRef, this, l0));
            ofFloat.addListener(new n());
            return ofFloat;
        }
        ckf.y("titleBarWidget");
        throw null;
    }

    public final void s1(float f2, float f3) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abbe4b02", new Object[]{this, new Float(f2), new Float(f3)});
        } else if (f3 != 0.0f) {
            float abs = Math.abs(f2);
            if (0.0f <= abs && abs <= f3) {
                bnf.INSTANCE.a(E(), Math.abs(f2 / f3));
                if (abs >= f3 / 2) {
                    z = false;
                }
                anf anfVar = this.t;
                if (anfVar != null) {
                    anfVar.J0(z);
                    if (z) {
                        str = "#F3F6F8";
                    } else {
                        str = "#FFFFFF";
                    }
                    anf anfVar2 = this.t;
                    if (anfVar2 != null) {
                        anfVar2.I0(Color.parseColor(str));
                    } else {
                        ckf.y("scrollInterceptWidget");
                        throw null;
                    }
                } else {
                    ckf.y("scrollInterceptWidget");
                    throw null;
                }
            }
            if (IrpRainbowManager.Companion.a().d()) {
                float f4 = -f3;
                if (this.S > f4 && f2 <= f4) {
                    agh.h(TAG, "onTitleBarTransYChange: titleBarWidgetLastTransY=" + this.S + ", curTitleBarTransY=" + f2 + ", titleBarHeight=" + f3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) "state", "headerHide");
                    d(jSONObject);
                }
            }
        }
    }

    @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
    public void l(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa83a09", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (i3 == 1) {
            anf anfVar = this.t;
            if (anfVar != null) {
                anfVar.O0(false);
            } else {
                ckf.y("scrollInterceptWidget");
                throw null;
            }
        } else if (i3 == -1 && this.M != -1) {
            this.M = i3;
            jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollOffScreen", new String[0]);
        } else if (i3 == 0 && (i6 = this.M) != 0) {
            if (i6 != -1) {
                this.M = i3;
                jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollDown", wxi.KEY_PHOTO_FROM, W().B().getValue());
                cmf cmfVar = this.o;
                if (cmfVar != null) {
                    cmfVar.i0();
                    ((IrpV2Presenter) i0()).y0();
                    W().d("regionCropShow", "trigger");
                    if (!W().b0()) {
                        W().d("regionCropShowV3", "trigger");
                    }
                } else {
                    ckf.y("guideViewWidget");
                    throw null;
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "state", "down");
            k1(jSONObject);
            hmf hmfVar = this.w;
            if (hmfVar != null) {
                if (hmfVar.k0()) {
                    w1(false, jSONObject);
                }
                k7 k7Var = this.x;
                if (k7Var == null) {
                    ckf.y("aiWidget");
                    throw null;
                } else if (k7Var.f()) {
                    u1(this, false, false, 2, null);
                }
            } else {
                ckf.y("hybridWidget");
                throw null;
            }
        } else if (i3 != 3 || (i5 = this.M) == 3 || i5 == -1) {
            if (i3 == 4 && (i4 = this.M) != 4) {
                if (i4 != -1) {
                    this.M = i3;
                    jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollHalf", wxi.KEY_PHOTO_FROM, W().B().getValue(), "manuallyClick", String.valueOf(0));
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "state", BottomSheetComponentInterface.State.HALF);
                k1(jSONObject2);
                w1(false, jSONObject2);
            }
            if (i3 == -1 || i3 == 0 || i3 == 3) {
                this.M = i3;
            }
        } else {
            this.M = i3;
            jzu.i(StatisticalDataPoint$PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollUp", wxi.KEY_PHOTO_FROM, W().B().getValue(), "manuallyClick", String.valueOf(0));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) "state", abk.FROM_FULL);
            k1(jSONObject3);
            hmf hmfVar2 = this.w;
            if (hmfVar2 != null) {
                if (!hmfVar2.k0()) {
                    w1(true, jSONObject3);
                }
                k7 k7Var2 = this.x;
                if (k7Var2 == null) {
                    ckf.y("aiWidget");
                    throw null;
                } else if (k7Var2.f()) {
                    u1(this, true, false, 2, null);
                }
            } else {
                ckf.y("hybridWidget");
                throw null;
            }
        }
    }

    public final void u0(int i2, boolean z, List<RectF> list, List<mh7> list2, LinkedList<mh7> linkedList, List<RectF> list3) {
        char c2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff4de4a", new Object[]{this, new Integer(i2), new Boolean(z), list, list2, linkedList, list3});
            return;
        }
        int i3 = i2;
        int[] x = W().x();
        int size = list.size();
        while (i3 < size) {
            i3++;
            RectF rectF = list.get(i3);
            if (rectF != null) {
                if (z) {
                    float f2 = rectF.left;
                    int i4 = x[c2];
                    float f3 = rectF.top;
                    int i5 = x[1];
                    rectF.set(f2 / i4, f3 / i5, rectF.right / i4, rectF.bottom / i5);
                }
                E1(rectF);
                mh7 mh7Var = new mh7(rectF, pv8.REGION_SEARCH);
                list2.add(mh7Var);
                list3.add(rectF);
                linkedList.add(mh7Var);
            }
            c2 = 0;
        }
    }
}
