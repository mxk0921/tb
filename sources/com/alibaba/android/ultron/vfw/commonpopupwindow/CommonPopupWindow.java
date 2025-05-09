package com.alibaba.android.ultron.vfw.commonpopupwindow;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.android.ultron.vfw.popupwindow.PopupRecyclerViewLayoutManager;
import com.alibaba.android.ultron.vfw.widget.RoundRelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.guk;
import tb.hav;
import tb.mgw;
import tb.rhx;
import tb.t2o;
import tb.z7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CommonPopupWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float v = 0.6f;

    /* renamed from: a  reason: collision with root package name */
    public PopupWindow f2308a;
    public FrameLayout b;
    public LinearLayout c;
    public RecyclerView d;
    public LinearLayout e;
    public ImageView f;
    public View g;
    public AlphaAnimation h;
    public AlphaAnimation i;
    public TranslateAnimation j;
    public TranslateAnimation k;
    public RelativeLayout l;
    public f m;
    public boolean n;
    public final boolean o;
    public boolean p;
    public final com.alibaba.android.ultron.vfw.instance.a q;
    public final Context r;
    public g s;
    public final int t;
    public OnScreenChangedListener u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                CommonPopupWindow.h(CommonPopupWindow.this).dismiss();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            CommonPopupWindow.i(CommonPopupWindow.this).setEnabled(false);
            CommonPopupWindow.this.l(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements View.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bdbaa648", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue();
            }
            if (i == 4 && CommonPopupWindow.h(CommonPopupWindow.this).isShowing() && !CommonPopupWindow.j(CommonPopupWindow.this).hasStarted()) {
                CommonPopupWindow.this.l(false);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                CommonPopupWindow.this.l(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface f {
        void a(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_BOTTOM_RADIUS = "popupWindowBottomRadius";
        public static final String KEY_TOP_RADIUS = "popupWindowTopRadius";

        /* renamed from: a  reason: collision with root package name */
        public float f2314a;
        public int b;
        public float c;
        public float d;

        static {
            t2o.a(157286573);
        }

        public static /* synthetic */ float a(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("21b44606", new Object[]{gVar})).floatValue();
            }
            return gVar.f2314a;
        }

        public static /* synthetic */ Drawable b(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("d84240a5", new Object[]{gVar});
            }
            gVar.getClass();
            return null;
        }

        public static /* synthetic */ int c(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e66a73c7", new Object[]{gVar})).intValue();
            }
            gVar.getClass();
            return 0;
        }

        public static /* synthetic */ float d(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("48c58aa3", new Object[]{gVar})).floatValue();
            }
            return gVar.c;
        }

        public static /* synthetic */ float e(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ab20a182", new Object[]{gVar})).floatValue();
            }
            return gVar.d;
        }

        public static /* synthetic */ int f(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d231e622", new Object[]{gVar})).intValue();
            }
            return gVar.b;
        }

        public static /* synthetic */ int g(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e3aae52f", new Object[]{gVar})).intValue();
            }
            gVar.getClass();
            return 0;
        }

        public void h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c44ad488", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public void i(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afe57360", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            this.c = f;
            this.d = f2;
        }

        public void j(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2aef0d00", new Object[]{this, new Float(f)});
            } else {
                this.f2314a = f;
            }
        }
    }

    static {
        t2o.a(157286564);
    }

    public CommonPopupWindow(Context context) {
        this(context, new UltronInstanceConfig());
    }

    public static /* synthetic */ boolean a(CommonPopupWindow commonPopupWindow, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e84c5720", new Object[]{commonPopupWindow, new Boolean(z)})).booleanValue();
        }
        commonPopupWindow.p = z;
        return z;
    }

    public static /* synthetic */ f b(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("fd5cce3a", new Object[]{commonPopupWindow});
        }
        return commonPopupWindow.m;
    }

    public static /* synthetic */ boolean c(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc41802e", new Object[]{commonPopupWindow})).booleanValue();
        }
        return commonPopupWindow.n;
    }

    public static /* synthetic */ void d(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea10f77", new Object[]{commonPopupWindow});
        } else {
            commonPopupWindow.x();
        }
    }

    public static /* synthetic */ void e(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124f3a38", new Object[]{commonPopupWindow});
        } else {
            commonPopupWindow.w();
        }
    }

    public static /* synthetic */ void f(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45fd64f9", new Object[]{commonPopupWindow});
        } else {
            commonPopupWindow.u();
        }
    }

    public static /* synthetic */ void g(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab8fba", new Object[]{commonPopupWindow});
        } else {
            commonPopupWindow.r();
        }
    }

    public static /* synthetic */ PopupWindow h(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("ec943559", new Object[]{commonPopupWindow});
        }
        return commonPopupWindow.f2308a;
    }

    public static /* synthetic */ View i(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9326267e", new Object[]{commonPopupWindow});
        }
        return commonPopupWindow.g;
    }

    public static /* synthetic */ AlphaAnimation j(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaAnimation) ipChange.ipc$dispatch("a5ea16f3", new Object[]{commonPopupWindow});
        }
        return commonPopupWindow.i;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f509184", new Object[]{this});
            return;
        }
        ViewProxy.setOnClickListener(this.g, new c());
        this.b.setOnKeyListener(new d());
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f412e3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.n = z;
        if (this.u != null) {
            TBAutoSizeConfig.x().h0(this.u);
        }
        this.g.startAnimation(this.i);
        this.l.startAnimation(this.k);
    }

    public int m() {
        Window window;
        View decorView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcfb6611", new Object[]{this})).intValue();
        }
        Context context = this.r;
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return 0;
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return rhx.a((Activity) this.r).height() - rect.height();
    }

    public com.alibaba.android.ultron.vfw.instance.a n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("53dc8f1e", new Object[]{this});
        }
        return this.q;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de75c2db", new Object[]{this});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.h = alphaAnimation;
        alphaAnimation.setDuration(200L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.i = alphaAnimation2;
        alphaAnimation2.setDuration(200L);
        this.i.setAnimationListener(new b());
        x();
    }

    public final void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cbdea3", new Object[]{this, context});
            return;
        }
        this.b = new FrameLayout(context);
        View view = new View(context);
        this.g = view;
        view.setBackgroundColor(Color.parseColor("#7F000000"));
        this.b.addView(this.g);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.ultron_popop_window, (ViewGroup) this.b, false);
        this.l = relativeLayout;
        relativeLayout.setClickable(true);
        this.c = (LinearLayout) this.l.findViewById(R.id.ultron_popup_header_view);
        RecyclerView recyclerView = (RecyclerView) this.l.findViewById(R.id.ultron_popup_recycler_view);
        this.d = recyclerView;
        recyclerView.setLayoutManager(new PopupRecyclerViewLayoutManager(context, 1, false));
        this.e = (LinearLayout) this.l.findViewById(R.id.ultron_popup_footer_view);
        this.f = (ImageView) this.l.findViewById(R.id.ultron_popup_close_button);
        this.b.addView(this.l, new FrameLayout.LayoutParams(-1, (int) (mgw.d(context) * v), 80));
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.q.O(this.c, this.d, this.e);
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        PopupWindow popupWindow = this.f2308a;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return false;
        }
        return true;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f10de8d", new Object[]{this});
        } else {
            this.q.V(127);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57549641", new Object[]{this});
            return;
        }
        this.u = new a();
        TBAutoSizeConfig.x().d0(this.u);
    }

    public void t(JSONObject jSONObject, a.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb04ccc", new Object[]{this, jSONObject, hVar});
            return;
        }
        u();
        this.q.e0(jSONObject, hVar);
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b69b2f5", new Object[]{this});
            return;
        }
        Context context = this.r;
        if (context instanceof Activity) {
            int width = rhx.a((Activity) context).width();
            if (!this.p) {
                width /= 2;
            }
            this.q.G().h1(DXWidgetNode.DXMeasureSpec.c(width, 1073741824));
        }
    }

    public void v(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608dee8b", new Object[]{this, fVar});
        } else {
            this.m = fVar;
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94566bb7", new Object[]{this});
            return;
        }
        Context context = this.r;
        if (context instanceof Activity) {
            int height = rhx.a((Activity) context).height();
            int width = rhx.a((Activity) this.r).width();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
            if (this.p) {
                layoutParams.height = (int) (height * g.a(this.s));
                layoutParams.width = width;
                layoutParams.gravity = 80;
            } else {
                layoutParams.height = height - Math.max(this.t, 0);
                layoutParams.width = width / 2;
                layoutParams.gravity = GravityCompat.END;
            }
            this.l.setLayoutParams(layoutParams);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51255697", new Object[]{this});
            return;
        }
        if (this.p) {
            this.j = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.k = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        } else {
            this.j = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            this.k = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        }
        this.j.setDuration(200L);
        this.k.setDuration(200L);
    }

    public void y(g gVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23051978", new Object[]{this, gVar});
            return;
        }
        this.s = gVar;
        if (this.o) {
            s();
        }
        try {
            if (this.f2308a == null) {
                PopupWindow popupWindow = new PopupWindow(this.r);
                this.f2308a = popupWindow;
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                this.f2308a.setWidth(-1);
                this.f2308a.setHeight(-1);
                this.f2308a.setSoftInputMode(16);
                this.f2308a.setOutsideTouchable(true);
                this.f2308a.setFocusable(true);
            }
            if (gVar != null) {
                if (g.g(gVar) < 0) {
                    this.g.setBackgroundColor(g.g(gVar));
                }
                if (g.a(gVar) > 0.0f) {
                    w();
                }
                if (g.b(gVar) != null) {
                    this.f.setVisibility(0);
                    this.f.setContentDescription(Localization.q(R.string.app_close));
                    this.f.setImageDrawable(g.b(gVar));
                    this.f.setOnClickListener(new e());
                } else {
                    this.f.setVisibility(8);
                }
                if (g.c(gVar) < 0) {
                    if (this.o) {
                        gVar.i(0.0f, 0.0f);
                    }
                    this.l.setBackgroundDrawable(mgw.b(g.c(gVar), g.d(gVar), g.e(gVar)));
                }
                if (this.o && (this.l instanceof RoundRelativeLayout)) {
                    gVar.i(0.0f, 0.0f);
                    ((RoundRelativeLayout) this.l).setRadius(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.g.setEnabled(true);
            this.f2308a.setContentView(this.b);
            this.f2308a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.alibaba.android.ultron.vfw.commonpopupwindow.CommonPopupWindow.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    } else if (CommonPopupWindow.b(CommonPopupWindow.this) != null) {
                        CommonPopupWindow.b(CommonPopupWindow.this).a(CommonPopupWindow.c(CommonPopupWindow.this));
                    }
                }
            });
            this.g.startAnimation(this.h);
            this.l.startAnimation(this.j);
            PopupWindow popupWindow2 = this.f2308a;
            FrameLayout frameLayout = this.b;
            if (gVar != null) {
                i = g.f(gVar);
            } else {
                i = 0;
            }
            popupWindow2.showAtLocation(frameLayout, i, 0, 0);
        } catch (Throwable th) {
            UnifyLog.e("CommonPopupWindow", th.getMessage());
        }
    }

    public CommonPopupWindow(Context context, UltronInstanceConfig ultronInstanceConfig) {
        boolean z = false;
        this.n = false;
        this.o = false;
        this.p = true;
        z = (TBDeviceUtils.p(context) || TBDeviceUtils.P(context)) ? true : z;
        this.o = z;
        this.p = TBAutoSizeConfig.x().T(context);
        this.r = context;
        ultronInstanceConfig.G(new z7v.b().l(new DXEngineConfig.b(ultronInstanceConfig.i()).H(true, true)).i());
        com.alibaba.android.ultron.vfw.instance.a q = com.alibaba.android.ultron.vfw.instance.a.q(ultronInstanceConfig, context);
        this.q = q;
        p(context);
        k();
        this.t = m();
        o();
        if (z) {
            u();
        }
        q.d().put("CommonPopupWindow", this);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            hav.d("DeviceAdapter", "order-onScreenChanged");
            CommonPopupWindow commonPopupWindow = CommonPopupWindow.this;
            if (i == 2) {
                z = false;
            }
            CommonPopupWindow.a(commonPopupWindow, z);
            CommonPopupWindow.d(CommonPopupWindow.this);
            if (CommonPopupWindow.this.q()) {
                CommonPopupWindow.e(CommonPopupWindow.this);
                CommonPopupWindow.f(CommonPopupWindow.this);
                CommonPopupWindow.g(CommonPopupWindow.this);
            }
        }
    }
}
