package com.taobao.flowcustoms.afc.xbs;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.taobao.R;
import java.math.BigDecimal;
import java.util.Timer;
import java.util.TimerTask;
import tb.hxt;
import tb.k81;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TipsView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSE_REASON_LEFT_SWIPE = "left_swipe";
    public static volatile TipsView v;
    public static volatile boolean w = false;
    public static Integer x = null;

    /* renamed from: a  reason: collision with root package name */
    public float f10574a;
    public float b;
    public float c;
    public LinearLayout f;
    public LinearLayout g;
    public LinearLayout h;
    public TextView i;
    public WindowManager j;
    public WindowManager.LayoutParams k;
    public int l;
    public BigDecimal m;
    public Timer r;
    public d s;
    public c u;
    public BigDecimal d = BigDecimal.valueOf(-1L);
    public boolean e = false;
    public String n = null;
    public hxt o = null;
    public FloatingType p = FloatingType.SHOW_ONCE;
    public FloatingShowStatus q = FloatingShowStatus.CLOSE;
    public final Handler t = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum FloatingShowStatus {
        SHOW,
        CLOSE,
        HIDE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FloatingShowStatus floatingShowStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/flowcustoms/afc/xbs/TipsView$FloatingShowStatus");
        }

        public static FloatingShowStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FloatingShowStatus) ipChange.ipc$dispatch("69625a75", new Object[]{str});
            }
            return (FloatingShowStatus) Enum.valueOf(FloatingShowStatus.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum FloatingType {
        SHOW_ONCE,
        SHOW_ALWAYS;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FloatingType floatingType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/flowcustoms/afc/xbs/TipsView$FloatingType");
        }

        public static FloatingType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FloatingType) ipChange.ipc$dispatch("c9e660aa", new Object[]{str});
            }
            return (FloatingType) Enum.valueOf(FloatingType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TipsView tipsView = TipsView.this;
            tipsView.k.x = -tipsView.f.getWidth();
            try {
                TipsView tipsView2 = TipsView.this;
                tipsView2.j.updateViewLayout(tipsView2.f, tipsView2.k);
            } catch (Exception unused) {
            }
            TipsView.this.f.setVisibility(0);
            TipsView.e(TipsView.this, new d());
            TipsView.h(TipsView.this, new Timer());
            TipsView.g(TipsView.this).schedule(TipsView.d(TipsView.this), 0L, 16L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10577a = 0;
        private Activity b;

        static {
            t2o.a(467664994);
        }

        public c(Activity activity) {
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IBinder iBinder;
            c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b != null && TipsView.w) {
                try {
                    iBinder = this.b.getWindow().getDecorView().getWindowToken();
                } catch (Exception unused) {
                    iBinder = null;
                }
                if (iBinder != null) {
                    try {
                        try {
                            TipsView tipsView = TipsView.this;
                            tipsView.k.token = iBinder;
                            tipsView.f.setVisibility(0);
                            TipsView tipsView2 = TipsView.this;
                            tipsView2.j.addView(tipsView2.f, tipsView2.k);
                            this.b = null;
                            return;
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        if (TipsView.this.f.getParent() != null) {
                            TipsView tipsView3 = TipsView.this;
                            tipsView3.j.removeView(tipsView3.f);
                        }
                        TipsView tipsView4 = TipsView.this;
                        tipsView4.j.addView(tipsView4.f, tipsView4.k);
                        return;
                    }
                }
                int i = this.f10577a + 1;
                this.f10577a = i;
                TipsView tipsView5 = TipsView.this;
                tipsView5.k.token = null;
                if (i < 10 && (cVar = tipsView5.u) != null) {
                    tipsView5.t.postDelayed(cVar, 500L);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10578a;
        public int b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:6|(2:8|(5:10|19|12|15|(2:17|18)(1:21)))|11|19|12|15|(0)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
                r0.printStackTrace();
             */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
            /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r5 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.flowcustoms.afc.xbs.TipsView.d.a.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r1 == 0) goto L_0x0012
                    java.lang.String r1 = "5c510192"
                    r2 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r5
                    r0.ipc$dispatch(r1, r2)
                    return
                L_0x0012:
                    com.taobao.flowcustoms.afc.xbs.TipsView$d r0 = com.taobao.flowcustoms.afc.xbs.TipsView.d.this
                    com.taobao.flowcustoms.afc.xbs.TipsView r1 = com.taobao.flowcustoms.afc.xbs.TipsView.this
                    android.view.WindowManager$LayoutParams r1 = r1.k
                    int r1 = r1.x
                    int r0 = r0.f10578a
                    int r1 = r1 - r0
                    int r0 = java.lang.Math.abs(r1)
                    r1 = 4
                    if (r0 <= r1) goto L_0x004e
                    com.taobao.flowcustoms.afc.xbs.TipsView$d r0 = com.taobao.flowcustoms.afc.xbs.TipsView.d.this
                    com.taobao.flowcustoms.afc.xbs.TipsView r2 = com.taobao.flowcustoms.afc.xbs.TipsView.this
                    android.view.WindowManager$LayoutParams r2 = r2.k
                    int r2 = r2.y
                    int r0 = r0.b
                    int r2 = r2 - r0
                    int r0 = java.lang.Math.abs(r2)
                    if (r0 <= r1) goto L_0x004e
                    com.taobao.flowcustoms.afc.xbs.TipsView$d r0 = com.taobao.flowcustoms.afc.xbs.TipsView.d.this
                    com.taobao.flowcustoms.afc.xbs.TipsView r2 = com.taobao.flowcustoms.afc.xbs.TipsView.this
                    android.view.WindowManager$LayoutParams r2 = r2.k
                    int r3 = r0.f10578a
                    int r4 = r2.x
                    int r3 = r3 - r4
                    int r3 = r3 / r1
                    int r3 = r3 + r4
                    r2.x = r3
                    int r0 = r0.b
                    int r3 = r2.y
                    int r0 = r0 - r3
                    int r0 = r0 / r1
                    int r0 = r0 + r3
                    r2.y = r0
                    goto L_0x006a
                L_0x004e:
                    com.taobao.flowcustoms.afc.xbs.TipsView$d r0 = com.taobao.flowcustoms.afc.xbs.TipsView.d.this
                    com.taobao.flowcustoms.afc.xbs.TipsView r1 = com.taobao.flowcustoms.afc.xbs.TipsView.this
                    android.view.WindowManager$LayoutParams r1 = r1.k
                    int r2 = r0.f10578a
                    r1.x = r2
                    int r2 = r0.b
                    r1.y = r2
                    r0.cancel()
                    com.taobao.flowcustoms.afc.xbs.TipsView$d r0 = com.taobao.flowcustoms.afc.xbs.TipsView.d.this
                    com.taobao.flowcustoms.afc.xbs.TipsView r0 = com.taobao.flowcustoms.afc.xbs.TipsView.this
                    java.util.Timer r0 = com.taobao.flowcustoms.afc.xbs.TipsView.g(r0)
                    r0.cancel()
                L_0x006a:
                    com.taobao.flowcustoms.afc.xbs.TipsView$d r0 = com.taobao.flowcustoms.afc.xbs.TipsView.d.this     // Catch: Exception -> 0x0078
                    com.taobao.flowcustoms.afc.xbs.TipsView r0 = com.taobao.flowcustoms.afc.xbs.TipsView.this     // Catch: Exception -> 0x0078
                    android.view.WindowManager r1 = r0.j     // Catch: Exception -> 0x0078
                    android.widget.LinearLayout r2 = r0.f     // Catch: Exception -> 0x0078
                    android.view.WindowManager$LayoutParams r0 = r0.k     // Catch: Exception -> 0x0078
                    r1.updateViewLayout(r2, r0)     // Catch: Exception -> 0x0078
                    goto L_0x007c
                L_0x0078:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x007c:
                    com.taobao.flowcustoms.afc.xbs.TipsView$d r0 = com.taobao.flowcustoms.afc.xbs.TipsView.d.this
                    com.taobao.flowcustoms.afc.xbs.TipsView r0 = com.taobao.flowcustoms.afc.xbs.TipsView.this
                    com.taobao.flowcustoms.afc.xbs.TipsView$FloatingShowStatus r0 = com.taobao.flowcustoms.afc.xbs.TipsView.r(r0)
                    com.taobao.flowcustoms.afc.xbs.TipsView$FloatingShowStatus r1 = com.taobao.flowcustoms.afc.xbs.TipsView.FloatingShowStatus.CLOSE
                    if (r0 != r1) goto L_0x008f
                    com.taobao.flowcustoms.afc.xbs.TipsView$d r0 = com.taobao.flowcustoms.afc.xbs.TipsView.d.this
                    com.taobao.flowcustoms.afc.xbs.TipsView r0 = com.taobao.flowcustoms.afc.xbs.TipsView.this
                    r0.u()
                L_0x008f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.flowcustoms.afc.xbs.TipsView.d.a.run():void");
            }
        }

        static {
            t2o.a(467664995);
        }

        public d() {
            if (TipsView.r(TipsView.this) == FloatingShowStatus.CLOSE) {
                this.f10578a = -TipsView.this.f.getWidth();
            } else if (TipsView.r(TipsView.this) == FloatingShowStatus.HIDE) {
                this.f10578a = -TipsView.o(TipsView.this).getWidth();
            } else {
                this.f10578a = 0;
            }
            this.b = TipsView.this.k.y;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/flowcustoms/afc/xbs/TipsView$TrayAnimationTimerTask");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TipsView.this.t.post(new a());
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(467664989);
    }

    public TipsView() {
        y();
        z();
        x();
    }

    public static /* synthetic */ float a(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfff4f78", new Object[]{tipsView})).floatValue();
        }
        return tipsView.f10574a;
    }

    public static /* synthetic */ float b(TipsView tipsView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adf55aa", new Object[]{tipsView, new Float(f)})).floatValue();
        }
        tipsView.f10574a = f;
        return f;
    }

    public static /* synthetic */ float c(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19c9f157", new Object[]{tipsView})).floatValue();
        }
        return tipsView.b;
    }

    public static /* synthetic */ d d(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f621892e", new Object[]{tipsView});
        }
        return tipsView.s;
    }

    public static /* synthetic */ d e(TipsView tipsView, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("57a7c7df", new Object[]{tipsView, dVar});
        }
        tipsView.s = dVar;
        return dVar;
    }

    public static /* synthetic */ float f(TipsView tipsView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a68efab", new Object[]{tipsView, new Float(f)})).floatValue();
        }
        tipsView.b = f;
        return f;
    }

    public static /* synthetic */ Timer g(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("67538504", new Object[]{tipsView});
        }
        return tipsView.r;
    }

    public static /* synthetic */ Timer h(TipsView tipsView, Timer timer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("2e7cfd12", new Object[]{tipsView, timer});
        }
        tipsView.r = timer;
        return timer;
    }

    public static /* synthetic */ float i(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53949336", new Object[]{tipsView})).floatValue();
        }
        return tipsView.c;
    }

    public static /* synthetic */ float j(TipsView tipsView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f289ac", new Object[]{tipsView, new Float(f)})).floatValue();
        }
        tipsView.c = f;
        return f;
    }

    public static /* synthetic */ BigDecimal k(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("e729f195", new Object[]{tipsView});
        }
        return tipsView.m;
    }

    public static /* synthetic */ BigDecimal l(TipsView tipsView, BigDecimal bigDecimal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("77f2ca13", new Object[]{tipsView, bigDecimal});
        }
        tipsView.m = bigDecimal;
        return bigDecimal;
    }

    public static /* synthetic */ boolean m(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c729d708", new Object[]{tipsView})).booleanValue();
        }
        return tipsView.e;
    }

    public static /* synthetic */ boolean n(TipsView tipsView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90608d6", new Object[]{tipsView, new Boolean(z)})).booleanValue();
        }
        tipsView.e = z;
        return z;
    }

    public static /* synthetic */ LinearLayout o(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("dda407ba", new Object[]{tipsView});
        }
        return tipsView.g;
    }

    public static /* synthetic */ int p(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3abf1ab5", new Object[]{tipsView})).intValue();
        }
        return tipsView.l;
    }

    public static /* synthetic */ hxt q(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hxt) ipChange.ipc$dispatch("2e981a81", new Object[]{tipsView});
        }
        return tipsView.o;
    }

    public static /* synthetic */ FloatingShowStatus r(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingShowStatus) ipChange.ipc$dispatch("1cb9434e", new Object[]{tipsView});
        }
        return tipsView.q;
    }

    public static /* synthetic */ FloatingShowStatus s(TipsView tipsView, FloatingShowStatus floatingShowStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingShowStatus) ipChange.ipc$dispatch("138f7818", new Object[]{tipsView, floatingShowStatus});
        }
        tipsView.q = floatingShowStatus;
        return floatingShowStatus;
    }

    public static /* synthetic */ FloatingType t(TipsView tipsView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingType) ipChange.ipc$dispatch("b87a6bc4", new Object[]{tipsView});
        }
        return tipsView.p;
    }

    public static TipsView v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("7e4d4721", new Object[0]);
        }
        if (v == null) {
            synchronized (TipsView.class) {
                try {
                    if (v == null) {
                        v = new TipsView();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return v;
    }

    public TipsView A(BigDecimal bigDecimal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("362c9112", new Object[]{this, bigDecimal});
        }
        this.d = bigDecimal;
        return v;
    }

    public void B(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6c7a63", new Object[]{this, context, new Integer(i)});
        } else if (this.h != null) {
            x = Integer.valueOf(i);
            ((GradientDrawable) this.h.getBackground()).setColor(context.getResources().getColor(i));
        }
    }

    public TipsView C(FloatingType floatingType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("8bd73765", new Object[]{this, floatingType});
        }
        this.p = floatingType;
        return v;
    }

    public TipsView D(hxt hxtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("dd39aa22", new Object[]{this, hxtVar});
        }
        if (hxtVar != null) {
            this.o = hxtVar;
        }
        return v;
    }

    public TipsView E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TipsView) ipChange.ipc$dispatch("20d95a0f", new Object[]{this, str});
        }
        if (this.i != null && !TextUtils.isEmpty(str)) {
            this.n = str;
        }
        return v;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            if (v() != null && this.f != null && this.q == FloatingShowStatus.CLOSE && this.n != null) {
                w = true;
                this.q = FloatingShowStatus.SHOW;
                if (k81.c().f22459a != null) {
                    G(k81.c().f22459a.get());
                    this.f.postDelayed(new b(), 100L);
                    hxt hxtVar = this.o;
                    if (hxtVar != null) {
                        hxtVar.b(null);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void G(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bca215b", new Object[]{this, activity});
            return;
        }
        try {
            String str = this.n;
            if (str != null) {
                this.i.setText(str);
            }
            BigDecimal valueOf = BigDecimal.valueOf(System.currentTimeMillis());
            if (this.d.floatValue() > 0.0f && valueOf.subtract(this.d).floatValue() >= 0.0f) {
                w = false;
                v = null;
                hxt hxtVar = this.o;
                if (hxtVar != null) {
                    hxtVar.c();
                }
            } else if (v() != null && w) {
                c cVar = new c(activity);
                this.u = cVar;
                this.t.postDelayed(cVar, 1000L);
            }
        } catch (Throwable unused) {
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            w = false;
            try {
                this.j.removeViewImmediate(this.f);
                this.k.token = null;
            } catch (Exception unused) {
            }
            v = null;
        } catch (Throwable unused2) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x0028
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    public void w() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.flowcustoms.afc.xbs.TipsView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "68b7c40e"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
            v()     // Catch: Exception -> 0x0028
            r0 = move-result     // Catch: Exception -> 0x0028
            if (r0 == 0) goto L_0x0028     // Catch: Exception -> 0x0028
            boolean r0 = com.taobao.flowcustoms.afc.xbs.TipsView.w     // Catch: Exception -> 0x0028
            if (r0 == 0) goto L_0x0028
            android.view.WindowManager r0 = r4.j
            android.widget.LinearLayout r1 = r4.f
            r0.removeViewImmediate(r1)
            android.view.WindowManager$LayoutParams r0 = r4.k
            r1 = 0
            r0.token = r1
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.flowcustoms.afc.xbs.TipsView.w():void");
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e0b0eb", new Object[]{this});
        } else {
            this.f.setOnTouchListener(new a());
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        this.l = AfcCustomSdk.h().f10563a.getResources().getDisplayMetrics().heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 1003, 520, -3);
        this.k = layoutParams;
        layoutParams.gravity = 51;
        layoutParams.x = 0;
        layoutParams.y = (this.l / 6) * 4;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        try {
            Application application = AfcCustomSdk.h().f10563a;
            LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) application.getSystemService("layout_inflater")).inflate(R.layout.alibc_floating_layer_layout, (ViewGroup) null);
            this.f = linearLayout;
            this.g = (LinearLayout) linearLayout.findViewById(R.id.layer_hidepart);
            this.h = (LinearLayout) this.f.findViewById(R.id.layer_back_ground);
            this.f.setLayoutParams(this.k);
            this.i = (TextView) this.f.findViewById(R.id.layer_content);
            this.j = (WindowManager) application.getSystemService(pg1.ATOM_EXT_window);
            Integer num = x;
            if (num != null) {
                B(application, num.intValue());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            if (r9 != 3) goto L_0x0202;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
                Method dump skipped, instructions count: 515
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.flowcustoms.afc.xbs.TipsView.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }
}
