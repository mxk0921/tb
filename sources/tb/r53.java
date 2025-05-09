package tb;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class r53 extends d32<q53, yr3, CaptureManager> implements View.OnClickListener, p3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String A = "";
    public int B = -1;
    public final xr1 C;
    public boolean D;
    public View l;
    public TUrlImageView m;
    public TUrlImageView n;
    public TUrlImageView o;
    public TUrlImageView p;
    public TUrlImageView q;
    public View r;
    public TUrlImageView s;
    public TextView t;
    public View u;
    public TextView v;
    public TextView w;
    public View x;
    public ValueAnimator y;
    public TextView z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f27109a;

        public a(ViewGroup viewGroup) {
            this.f27109a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f27109a.addView(r53.N(r53.this), new ViewGroup.LayoutParams(-1, -1));
            r53 r53Var = r53.this;
            r53.O(r53Var, r53Var.p().getInitScene(), true);
            r53.V(r53.this, true);
            if (lg4.O()) {
                i0u.f(r53.this.I(), Localization.q(R.string.taobao_app_1007_1_18954), 0);
            }
            if (r53.this.m().f()) {
                r53.W(r53.this).setVisibility(0);
                r53.X(r53.this).setVisibility(0);
                return;
            }
            r53.W(r53.this).setVisibility(8);
            r53.X(r53.this).setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) r53.Y(r53.this).getLayoutParams();
            layoutParams.bottomMargin = CaptureBottomAreaView.Companion.b(r53.Z(r53.this), lg4.O1(r53.a0(r53.this)));
            r53.Y(r53.this).setLayoutParams(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TUrlImageView f27111a;
            public final /* synthetic */ float b;
            public final /* synthetic */ float c;
            public final /* synthetic */ float d;
            public final /* synthetic */ float e;

            public a(TUrlImageView tUrlImageView, float f, float f2, float f3, float f4) {
                this.f27111a = tUrlImageView;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                Float f = (Float) valueAnimator.getAnimatedValue();
                if (f != null) {
                    this.f27111a.setTranslationY(f.floatValue());
                    float floatValue = f.floatValue();
                    float f2 = this.b;
                    if (floatValue <= f2) {
                        this.f27111a.setAlpha(1.0f - ((f2 - f.floatValue()) / this.c));
                        return;
                    }
                    float floatValue2 = f.floatValue() - this.d;
                    if (floatValue2 < 0.0f) {
                        this.f27111a.setAlpha(1.0f);
                    } else {
                        this.f27111a.setAlpha(1.0f - (floatValue2 / this.e));
                    }
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (r53.b0(r53.this) != null && ((q53) r53.c0(r53.this)).o()) {
            } else {
                if (r53.P(r53.this) == null || !r53.P(r53.this).isRunning()) {
                    TUrlImageView tUrlImageView = (TUrlImageView) r53.R(r53.this).findViewById(R.id.iv_animate_line);
                    tUrlImageView.setVisibility(0);
                    float bottom = (((TextView) r53.R(r53.this).findViewById(R.id.tv_hint)).getRootView().getBottom() - zb7.a(190.0f)) - tUrlImageView.getBottom();
                    float f = -zb7.a(149.0f);
                    float a2 = zb7.a(75.0f);
                    float a3 = zb7.a(40.0f);
                    r53.Q(r53.this, ValueAnimator.ofFloat(f, bottom));
                    r53.P(r53.this).addUpdateListener(new a(tUrlImageView, f + a3, a3, bottom - a2, a2));
                    r53.P(r53.this).setRepeatCount(-1);
                    r53.P(r53.this).setDuration(2000L);
                    r53.P(r53.this).setInterpolator(new LinearInterpolator());
                    r53.P(r53.this).start();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ q22 c;

        public c(q22 q22Var) {
            this.c = q22Var;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/degree/CaptureDegradeUIView$3");
        }

        @Override // tb.zio
        public void c() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            q22 q22Var = this.c;
            if (q22Var instanceof qog) {
                View S = r53.S(r53.this);
                if (!((qog) this.c).e()) {
                    i = 8;
                }
                S.setVisibility(i);
                r53.T(r53.this, ((qog) this.c).f());
            } else if ((q22Var instanceof TipShowMsg) && !TextUtils.isEmpty(((TipShowMsg) q22Var).c())) {
                r53.U(r53.this).setText(((TipShowMsg) this.c).c());
                if (((TipShowMsg) this.c).d() == 0) {
                    r53.U(r53.this).setVisibility(0);
                }
            }
        }
    }

    static {
        t2o.a(481296627);
        t2o.a(481297504);
    }

    public r53(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        this.C = l53.l(activity);
        m().B0(this);
    }

    public static /* synthetic */ View N(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d336f8e4", new Object[]{r53Var});
        }
        return r53Var.l;
    }

    public static /* synthetic */ void O(r53 r53Var, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f4a987", new Object[]{r53Var, str, new Boolean(z)});
        } else {
            r53Var.e0(str, z);
        }
    }

    public static /* synthetic */ ValueAnimator P(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("b3935035", new Object[]{r53Var});
        }
        return r53Var.y;
    }

    public static /* synthetic */ ValueAnimator Q(r53 r53Var, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("12420b25", new Object[]{r53Var, valueAnimator});
        }
        r53Var.y = valueAnimator;
        return valueAnimator;
    }

    public static /* synthetic */ View R(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("30bbad54", new Object[]{r53Var});
        }
        return r53Var.x;
    }

    public static /* synthetic */ View S(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("166709d5", new Object[]{r53Var});
        }
        return r53Var.r;
    }

    public static /* synthetic */ void T(r53 r53Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4952a40", new Object[]{r53Var, new Boolean(z)});
        } else {
            r53Var.f0(z);
        }
    }

    public static /* synthetic */ TextView U(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d6c0cf49", new Object[]{r53Var});
        }
        return r53Var.z;
    }

    public static /* synthetic */ boolean V(r53 r53Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c94efef2", new Object[]{r53Var, new Boolean(z)})).booleanValue();
        }
        r53Var.D = z;
        return z;
    }

    public static /* synthetic */ TUrlImageView W(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("c3246677", new Object[]{r53Var});
        }
        return r53Var.o;
    }

    public static /* synthetic */ TUrlImageView X(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("b6565e16", new Object[]{r53Var});
        }
        return r53Var.n;
    }

    public static /* synthetic */ View Y(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4f8fc769", new Object[]{r53Var});
        }
        return r53Var.u;
    }

    public static /* synthetic */ Activity Z(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("e37fce00", new Object[]{r53Var});
        }
        return r53Var.c;
    }

    public static /* synthetic */ Activity a0(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c40195df", new Object[]{r53Var});
        }
        return r53Var.c;
    }

    public static /* synthetic */ mz1 b0(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mz1) ipChange.ipc$dispatch("1017620f", new Object[]{r53Var});
        }
        return r53Var.f17536a;
    }

    public static /* synthetic */ mz1 c0(r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mz1) ipChange.ipc$dispatch("52fc012e", new Object[]{r53Var});
        }
        return r53Var.f17536a;
    }

    public static /* synthetic */ Object ipc$super(r53 r53Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1805108756:
                super.D();
                return null;
            case -587316827:
                super.F();
                return null;
            case -3136315:
                super.K();
                return null;
            case 1876185637:
                super.G(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/degree/CaptureDegradeUIView");
        }
    }

    @Override // tb.d32
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946839ec", new Object[]{this});
            return;
        }
        super.D();
        g0(true);
    }

    @Override // tb.d32
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfe41a5", new Object[]{this});
            return;
        }
        super.F();
        g0(false);
    }

    @Override // tb.d32
    public void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd45225", new Object[]{this, new Integer(i)});
            return;
        }
        super.G(i);
        if (!m().f()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.u.getLayoutParams();
            CaptureBottomAreaView.a aVar = CaptureBottomAreaView.Companion;
            Activity activity = this.c;
            layoutParams.bottomMargin = aVar.b(activity, lg4.O1(activity));
            this.u.setLayoutParams(layoutParams);
        }
    }

    @Override // tb.d32
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.K();
        ViewGroup viewGroup = (ViewGroup) this.c.findViewById(R.id.fl_capture_ui);
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.feis_view_capture_degrade, (ViewGroup) null);
        this.l = inflate;
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.feis_capture_btn_back);
        this.m = tUrlImageView;
        tUrlImageView.setImageResource(R.drawable.feis_ic_close);
        this.m.setOnClickListener(this);
        TUrlImageView tUrlImageView2 = (TUrlImageView) this.l.findViewById(R.id.iv_album);
        this.n = tUrlImageView2;
        tUrlImageView2.setImageResource(R.drawable.feis_ic_album_entrance);
        this.n.setOnClickListener(this);
        TUrlImageView tUrlImageView3 = (TUrlImageView) this.l.findViewById(R.id.feis_capture_btn_history);
        this.o = tUrlImageView3;
        tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01H6jO9D1VgrPqPAd8d_!!6000000002683-2-tps-132-132.png");
        this.o.setOnClickListener(this);
        TUrlImageView tUrlImageView4 = (TUrlImageView) this.l.findViewById(R.id.feis_capture_btn_change);
        this.p = tUrlImageView4;
        tUrlImageView4.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01jIDvMX1KBktying3g_!!6000000001126-2-tps-144-144.png");
        this.p.setOnClickListener(this);
        View findViewById = this.l.findViewById(R.id.ll_flashlight);
        this.r = findViewById;
        ViewProxy.setOnClickListener(findViewById, this);
        this.s = (TUrlImageView) this.l.findViewById(R.id.feis_capture_btn_light);
        this.t = (TextView) this.l.findViewById(R.id.feis_capture_btn_light_alert);
        TUrlImageView tUrlImageView5 = (TUrlImageView) this.l.findViewById(R.id.iv_take);
        this.q = tUrlImageView5;
        tUrlImageView5.setImageResource(R.drawable.feis_ic_take);
        this.q.setContentDescription(Localization.q(R.string.taobao_app_1007_1_18964));
        this.q.setOnClickListener(this);
        this.z = (TextView) this.l.findViewById(R.id.tv_user_hint);
        ((TUrlImageView) this.l.findViewById(R.id.iv_tab_mask)).setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01fTWwds1z7XIgX2X6C_!!6000000006667-2-tps-750-400.png");
        this.u = this.l.findViewById(R.id.view_tab);
        TextView textView = (TextView) this.l.findViewById(R.id.tab_scan);
        this.v = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) this.l.findViewById(R.id.tab_pai);
        this.w = textView2;
        textView2.setOnClickListener(this);
        viewGroup.post(new a(viewGroup));
    }

    /* renamed from: d0 */
    public q53 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q53) ipChange.ipc$dispatch("5cef1627", new Object[]{this});
        }
        return new q53();
    }

    public final void g0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8b1495", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.x;
        if (view != null) {
            if (z) {
                ValueAnimator valueAnimator = this.y;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.y.cancel();
                    this.y.removeAllUpdateListeners();
                    this.y = null;
                }
            } else if (view.getVisibility() == 0) {
                ValueAnimator valueAnimator2 = this.y;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    this.x.post(new b());
                    this.x.invalidate();
                }
            }
        }
    }

    public void i0(String str, q22 q22Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f998659c", new Object[]{this, str, q22Var});
        } else {
            vpt.g("CaptureDegradeUIView_sendMsg", new c(q22Var));
        }
    }

    @Override // tb.p3e
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e57dc0ff", new Object[]{this})).booleanValue();
        }
        return this.D;
    }

    @Override // tb.p3e
    public void t(q22 q22Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23dba8a6", new Object[]{this, q22Var});
        } else {
            i0("", q22Var);
        }
    }

    public final void e0(String str, boolean z) {
        xr1 xr1Var;
        xr1 xr1Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fb15c6", new Object[]{this, str, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && !str.equals(this.A)) {
            if (str.equals("scan") || str.equals(l53.b.SCENE_AUTO_DETECT)) {
                if (str.equals("scan")) {
                    h0(true);
                    this.v.setTextColor(-1);
                    this.w.setTextColor(-2130706433);
                    this.q.setVisibility(8);
                    this.p.setVisibility(8);
                    this.z.setVisibility(0);
                    this.z.setText(lg4.w3(m().M()));
                    if (m().K() && (xr1Var2 = this.C) != null) {
                        xr1Var2.flipCamera();
                    }
                } else {
                    h0(false);
                    this.w.setTextColor(-1);
                    this.v.setTextColor(-2130706433);
                    this.q.setVisibility(0);
                    this.p.setVisibility(0);
                    this.z.setVisibility(8);
                }
                if (!z && (xr1Var = this.C) != null) {
                    xr1Var.changeScene(new zso(str, null));
                }
                this.A = str;
            }
        }
    }

    public final void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae5ddc3", new Object[]{this, new Boolean(z)});
        } else if (this.B != z) {
            m().b0(z);
            mzu.i("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "5");
            if (z) {
                this.s.setImageUrl("https://img.alicdn.com/tfs/TB1OVsH0hz1gK0jSZSgXXavwpXa-33-39.png");
                this.s.setContentDescription(Localization.q(R.string.taobao_app_1007_1_18931));
                this.t.setText(Localization.q(R.string.taobao_app_1007_1_18927));
                xr1 xr1Var = this.C;
                if (xr1Var != null) {
                    xr1Var.operateLight(true);
                }
            } else {
                this.s.setImageUrl("https://img.alicdn.com/tfs/TB1y83HnjMZ7e4jSZFOXXX7epXa-41-53.png");
                this.s.setContentDescription(Localization.q(R.string.taobao_app_1007_1_18913));
                this.t.setText(Localization.q(R.string.taobao_app_1007_1_18937));
                xr1 xr1Var2 = this.C;
                if (xr1Var2 != null) {
                    xr1Var2.operateLight(false);
                }
            }
            this.B = z ? 1 : 0;
        }
    }

    public final void h0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99a8486", new Object[]{this, new Boolean(z)});
        } else if (z) {
            if (this.x == null) {
                View inflate = ((ViewStub) this.l.findViewById(R.id.vs_scan)).inflate();
                this.x = inflate;
                ((TUrlImageView) inflate.findViewById(R.id.iv_animate_line)).setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN013pVK8s1rRfmsKZSpl_!!6000000005628-2-tps-751-298.png");
                this.x.findViewById(R.id.tv_hint).setVisibility(4);
            }
            this.x.setVisibility(0);
            g0(false);
        } else {
            View view = this.x;
            if (view != null) {
                view.setVisibility(8);
                g0(true);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view == this.n) {
            xr1 xr1Var = this.C;
            if (xr1Var != null) {
                xr1Var.clickAlbum();
            }
        } else if (view == this.o) {
            xr1 xr1Var2 = this.C;
            if (xr1Var2 != null) {
                xr1Var2.clickHistory();
            }
        } else if (view == this.p) {
            xr1 xr1Var3 = this.C;
            if (xr1Var3 != null) {
                xr1Var3.flipCamera();
            }
        } else if (view == this.m) {
            xr1 xr1Var4 = this.C;
            if (xr1Var4 != null) {
                xr1Var4.getActivity().finish();
            }
        } else if (view == this.q) {
            mzu.n(p73.f25916a, "clickTakePhotoOnDegrade", 19999, new String[0]);
            xr1 xr1Var5 = this.C;
            if (xr1Var5 != null) {
                xr1Var5.takePhoto();
            }
        } else if (view == this.v) {
            e0("scan", false);
        } else if (view == this.w) {
            e0(l53.b.SCENE_AUTO_DETECT, false);
        } else if (view != this.r) {
        } else {
            if (m().J()) {
                f0(false);
            } else if (!m().K()) {
                f0(true);
            }
        }
    }
}
