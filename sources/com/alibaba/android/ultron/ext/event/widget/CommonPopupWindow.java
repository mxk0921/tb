package com.alibaba.android.ultron.ext.event.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import java.util.HashMap;
import java.util.Map;
import tb.ask;
import tb.cbo;
import tb.g4w;
import tb.guk;
import tb.i4w;
import tb.mgw;
import tb.pb6;
import tb.t2o;
import tb.tj8;
import tb.ykl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CommonPopupWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VESSEL_METHOD_MAP_KEY_FILEDS = "fields";
    public static final String VESSEL_METHOD_MAP_KEY_TYPE = "type";
    public static final String VESSEL_METHOD_NAME_CLOSE_POP_WINDOW = "closePopWindow";
    public static final String VESSEL_METHOD_NAME_RELOAD = "reload";
    public static final float r = 0.6f;

    /* renamed from: a  reason: collision with root package name */
    public PopupWindow f2271a;
    public FrameLayout b;
    public FrameLayout c;
    public ImageView d;
    public View e;
    public AlphaAnimation f;
    public AlphaAnimation g;
    public TranslateAnimation h;
    public TranslateAnimation i;
    public RelativeLayout j;
    public final VesselView k;
    public i l;
    public h m;
    public final Context n;
    public boolean o = false;
    public boolean p;
    public OnScreenChangedListener q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                CommonPopupWindow.a(CommonPopupWindow.this).dismiss();
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
    public class b implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
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
            CommonPopupWindow commonPopupWindow = CommonPopupWindow.this;
            if (i == 2) {
                z = false;
            }
            CommonPopupWindow.c(commonPopupWindow, z);
            if (CommonPopupWindow.this.o()) {
                CommonPopupWindow.e(CommonPopupWindow.this);
                CommonPopupWindow.f(CommonPopupWindow.this);
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
            CommonPopupWindow.g(CommonPopupWindow.this).setEnabled(false);
            CommonPopupWindow.this.k(false);
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
            if (i == 4 && CommonPopupWindow.a(CommonPopupWindow.this).isShowing() && !CommonPopupWindow.h(CommonPopupWindow.this).hasStarted()) {
                CommonPopupWindow.this.k(false);
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
                CommonPopupWindow.this.k(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements ask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(CommonPopupWindow commonPopupWindow) {
        }

        @Override // tb.ask
        public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
            } else {
                tj8.b(f.class.getSimpleName(), "vesselViewOnDowngrade", "vesselViewDowngrade", g4wVar.b);
            }
        }

        @Override // tb.ask
        public void onLoadError(g4w g4wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
            } else {
                tj8.b(f.class.getSimpleName(), "vesselViewOnLoadError", "vesselViewError", g4wVar.b);
            }
        }

        @Override // tb.ask
        public void onLoadFinish(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
            }
        }

        @Override // tb.ask
        public void onLoadStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g implements i4w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.i4w
        public void u2(Map<String, Object> map, cbo cboVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef7dc0c", new Object[]{this, map, cboVar});
            } else {
                CommonPopupWindow.d(CommonPopupWindow.this, map, cboVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface h {
        void onCancel();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_BOTTOM_RADIUS = "popupWindowBottomRadius";
        public static final String KEY_TOP_RADIUS = "popupWindowTopRadius";

        /* renamed from: a  reason: collision with root package name */
        public float f2278a;
        public int b;
        public String c;
        public boolean d = true;

        static {
            t2o.a(156237912);
        }

        public static /* synthetic */ String a(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b67d423d", new Object[]{iVar});
            }
            return iVar.c;
        }

        public static /* synthetic */ int b(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea75ca77", new Object[]{iVar})).intValue();
            }
            return iVar.b;
        }

        public static /* synthetic */ int c(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4c4a8acc", new Object[]{iVar})).intValue();
            }
            iVar.getClass();
            return 0;
        }

        public static /* synthetic */ float d(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3c6648a", new Object[]{iVar})).floatValue();
            }
            return iVar.f2278a;
        }

        public static /* synthetic */ boolean e(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9b423e5f", new Object[]{iVar})).booleanValue();
            }
            return iVar.d;
        }

        public void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98556ef4", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }

        public void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c44ad488", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public void i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("258dffb9", new Object[]{this, new Integer(i)});
            }
        }

        public void j(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2aef0d00", new Object[]{this, new Float(f)});
            } else {
                this.f2278a = f;
            }
        }
    }

    static {
        t2o.a(156237902);
    }

    public CommonPopupWindow(Context context) {
        this.n = context;
        this.k = new VesselView(context);
        this.p = TBAutoSizeConfig.x().T(context);
        v();
        n();
        j();
        l();
    }

    public static /* synthetic */ PopupWindow a(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("14ce7a0d", new Object[]{commonPopupWindow});
        }
        return commonPopupWindow.f2271a;
    }

    public static /* synthetic */ boolean b(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a59f3c", new Object[]{commonPopupWindow})).booleanValue();
        }
        return commonPopupWindow.o;
    }

    public static /* synthetic */ boolean c(CommonPopupWindow commonPopupWindow, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6089d7b4", new Object[]{commonPopupWindow, new Boolean(z)})).booleanValue();
        }
        commonPopupWindow.p = z;
        return z;
    }

    public static /* synthetic */ void d(CommonPopupWindow commonPopupWindow, Map map, cbo cboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31883537", new Object[]{commonPopupWindow, map, cboVar});
        } else {
            commonPopupWindow.p(map, cboVar);
        }
    }

    public static /* synthetic */ void e(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1953785", new Object[]{commonPopupWindow});
        } else {
            commonPopupWindow.t();
        }
    }

    public static /* synthetic */ void f(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a759824", new Object[]{commonPopupWindow});
        } else {
            commonPopupWindow.u();
        }
    }

    public static /* synthetic */ View g(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("580f0645", new Object[]{commonPopupWindow});
        }
        return commonPopupWindow.e;
    }

    public static /* synthetic */ AlphaAnimation h(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlphaAnimation) ipChange.ipc$dispatch("14d2c98", new Object[]{commonPopupWindow});
        }
        return commonPopupWindow.g;
    }

    public static /* synthetic */ h i(CommonPopupWindow commonPopupWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("a2b52a79", new Object[]{commonPopupWindow});
        }
        return commonPopupWindow.m;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f509184", new Object[]{this});
            return;
        }
        ViewProxy.setOnClickListener(this.e, new c());
        this.b.setOnKeyListener(new d());
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f412e3", new Object[]{this, new Boolean(z)});
            return;
        }
        this.o = z;
        this.e.startAnimation(this.g);
        this.j.startAnimation(this.i);
        if (this.m != null) {
            TBAutoSizeConfig.x().h0(this.q);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de75c2db", new Object[]{this});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.f = alphaAnimation;
        alphaAnimation.setDuration(200L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.g = alphaAnimation2;
        alphaAnimation2.setDuration(200L);
        this.g.setAnimationListener(new a());
        u();
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5071d3", new Object[]{this});
            return;
        }
        VesselView vesselView = this.k;
        if (vesselView != null) {
            vesselView.setOnLoadListener(new f(this));
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.b = new FrameLayout(this.n);
        View view = new View(this.n);
        this.e = view;
        view.setBackgroundColor(Color.parseColor("#7F000000"));
        this.b.addView(this.e);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.n).inflate(R.layout.common_popop_window, (ViewGroup) this.b, false);
        this.j = relativeLayout;
        relativeLayout.setClickable(true);
        this.c = (FrameLayout) this.j.findViewById(R.id.ultron_popup_view);
        this.d = (ImageView) this.j.findViewById(R.id.ultron_popup_close_button);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) (mgw.d(this.n) * r), 80);
        this.c.addView(this.k, new FrameLayout.LayoutParams(-1, -1));
        this.b.addView(this.j, layoutParams);
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        PopupWindow popupWindow = this.f2271a;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return false;
        }
        return true;
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfab1ee", new Object[]{this, str});
            return;
        }
        VesselView vesselView = this.k;
        if (vesselView != null) {
            vesselView.loadUrl(str);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57549641", new Object[]{this});
            return;
        }
        this.q = new b();
        TBAutoSizeConfig.x().d0(this.q);
    }

    public void s(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50311757", new Object[]{this, hVar});
        } else {
            this.m = hVar;
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94566bb7", new Object[]{this});
            return;
        }
        int r2 = pb6.r(this.n);
        int s = pb6.s(this.n);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j.getLayoutParams();
        if (this.p) {
            layoutParams.height = (int) (r2 * i.d(this.l));
            layoutParams.width = s;
            layoutParams.gravity = 80;
        } else {
            layoutParams.height = r2;
            layoutParams.width = s / 2;
            layoutParams.gravity = GravityCompat.END;
        }
        this.j.setLayoutParams(layoutParams);
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51255697", new Object[]{this});
            return;
        }
        if (this.p) {
            this.h = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            this.i = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        } else {
            this.h = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            this.i = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        }
        this.h.setDuration(200L);
        this.i.setDuration(200L);
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02b3a4", new Object[]{this});
            return;
        }
        VesselView vesselView = this.k;
        if (vesselView != null) {
            vesselView.setVesselViewCallback(new g());
        }
    }

    public final void p(Map<String, Object> map, cbo cboVar) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e7e716", new Object[]{this, map, cboVar});
        } else if (map != null) {
            String str = (!map.containsKey("type") || (obj2 = map.get("type")) == null || !(obj2 instanceof String)) ? null : (String) obj2;
            if (map.containsKey("fields") && (obj = map.get("fields")) != null && (obj instanceof JSONObject)) {
                JSONObject jSONObject = (JSONObject) obj;
            }
            if (str != null) {
                if (str.equals(VESSEL_METHOD_NAME_CLOSE_POP_WINDOW)) {
                    k(false);
                } else if (str.equals("reload")) {
                    q(i.a(this.l));
                }
            }
            cboVar.invoke(new HashMap());
        }
    }

    public void w(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e2b2e60", new Object[]{this, iVar});
            return;
        }
        this.l = iVar;
        if (ykl.a()) {
            r();
        }
        if (this.f2271a == null) {
            PopupWindow popupWindow = new PopupWindow(this.n);
            this.f2271a = popupWindow;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            this.f2271a.setWidth(-1);
            this.f2271a.setHeight(-1);
            this.f2271a.setSoftInputMode(16);
            this.f2271a.setOutsideTouchable(true);
            this.f2271a.setFocusable(true);
        }
        i iVar2 = this.l;
        if (iVar2 != null) {
            if (i.c(iVar2) < 0) {
                this.e.setBackgroundColor(i.c(this.l));
            }
            if (i.d(this.l) > 0.0f) {
                t();
            }
            if (i.e(this.l)) {
                this.d.setVisibility(0);
                this.d.setContentDescription("关闭");
                this.d.setOnClickListener(new e());
            } else {
                this.d.setVisibility(8);
            }
            if (ykl.a() || (this.j instanceof RoundRelativeLayout)) {
                ((RoundRelativeLayout) this.j).setRadius(0.0f);
            }
        }
        this.e.setEnabled(true);
        this.f2271a.setContentView(this.b);
        this.f2271a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.alibaba.android.ultron.ext.event.widget.CommonPopupWindow.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else if (CommonPopupWindow.i(CommonPopupWindow.this) != null && !CommonPopupWindow.b(CommonPopupWindow.this)) {
                    CommonPopupWindow.i(CommonPopupWindow.this).onCancel();
                }
            }
        });
        m();
        q(i.a(this.l));
        this.e.startAnimation(this.f);
        this.j.startAnimation(this.h);
        this.f2271a.showAtLocation(this.b, i.b(this.l), 0, 0);
    }
}
