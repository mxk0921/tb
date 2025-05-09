package com.taobao.linkmanager.afc.xbs;

import android.app.Activity;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.math.BigDecimal;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bh0;
import tb.hxt;
import tb.k81;
import tb.pg1;
import tb.qg0;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBFloatingLayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile TBFloatingLayer B;
    public static volatile boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    public float f10921a;
    public float b;
    public float c;
    public LinearLayout f;
    public LinearLayout g;
    public WindowManager h;
    public WindowManager.LayoutParams i;
    public int j;
    public BigDecimal k;
    public Timer o;
    public e p;
    public d r;
    public TUrlImageView s;
    public LinearLayout t;
    public RelativeLayout u;
    public FrameLayout v;
    public TextView w;
    public TextView x;
    public View y;
    public BigDecimal d = BigDecimal.valueOf(-1L);
    public boolean e = false;
    public hxt l = null;
    public FloatingType m = FloatingType.SHOW_ALWAYS;
    public FloatingShowStatus n = FloatingShowStatus.CLOSE;
    public final Handler q = new Handler(Looper.getMainLooper());
    public boolean z = false;
    public final AtomicBoolean A = new AtomicBoolean(false);

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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/xbs/TBFloatingLayer$FloatingShowStatus");
        }

        public static FloatingShowStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FloatingShowStatus) ipChange.ipc$dispatch("2e8a3108", new Object[]{str});
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/xbs/TBFloatingLayer$FloatingType");
        }

        public static FloatingType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FloatingType) ipChange.ipc$dispatch("a50b617d", new Object[]{str});
            }
            return (FloatingType) Enum.valueOf(FloatingType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (TBFloatingLayer.a(TBFloatingLayer.this) == FloatingType.SHOW_ALWAYS) {
                TBFloatingLayer.e(TBFloatingLayer.this, FloatingShowStatus.HIDE);
            } else {
                TBFloatingLayer.e(TBFloatingLayer.this, FloatingShowStatus.CLOSE);
            }
            if (TBFloatingLayer.i(TBFloatingLayer.this) != null) {
                TBFloatingLayer.i(TBFloatingLayer.this).a(com.taobao.linkmanager.afc.xbs.a.CLOSE_REASON_CLOSE_BTN);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBFloatingLayer tBFloatingLayer = TBFloatingLayer.this;
            tBFloatingLayer.i.x = -tBFloatingLayer.f.getWidth();
            try {
                TBFloatingLayer tBFloatingLayer2 = TBFloatingLayer.this;
                tBFloatingLayer2.h.updateViewLayout(tBFloatingLayer2.f, tBFloatingLayer2.i);
            } catch (Exception unused) {
            }
            TBFloatingLayer.this.f.setVisibility(0);
            TBFloatingLayer.d(TBFloatingLayer.this, new e());
            TBFloatingLayer.g(TBFloatingLayer.this, new Timer());
            TBFloatingLayer.f(TBFloatingLayer.this).schedule(TBFloatingLayer.c(TBFloatingLayer.this), 0L, 16L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10926a;
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
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.a.$ipChange
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
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$e r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.this
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer r1 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.this
                    android.view.WindowManager$LayoutParams r1 = r1.i
                    int r1 = r1.x
                    int r0 = r0.f10926a
                    int r1 = r1 - r0
                    int r0 = java.lang.Math.abs(r1)
                    r1 = 4
                    if (r0 <= r1) goto L_0x004e
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$e r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.this
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer r2 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.this
                    android.view.WindowManager$LayoutParams r2 = r2.i
                    int r2 = r2.y
                    int r0 = r0.b
                    int r2 = r2 - r0
                    int r0 = java.lang.Math.abs(r2)
                    if (r0 <= r1) goto L_0x004e
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$e r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.this
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer r2 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.this
                    android.view.WindowManager$LayoutParams r2 = r2.i
                    int r3 = r0.f10926a
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
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$e r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.this
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer r1 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.this
                    android.view.WindowManager$LayoutParams r1 = r1.i
                    int r2 = r0.f10926a
                    r1.x = r2
                    int r2 = r0.b
                    r1.y = r2
                    r0.cancel()
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$e r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.this
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.this
                    java.util.Timer r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.f(r0)
                    r0.cancel()
                L_0x006a:
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$e r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.this     // Catch: Exception -> 0x0078
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.this     // Catch: Exception -> 0x0078
                    android.view.WindowManager r1 = r0.h     // Catch: Exception -> 0x0078
                    android.widget.LinearLayout r2 = r0.f     // Catch: Exception -> 0x0078
                    android.view.WindowManager$LayoutParams r0 = r0.i     // Catch: Exception -> 0x0078
                    r1.updateViewLayout(r2, r0)     // Catch: Exception -> 0x0078
                    goto L_0x007c
                L_0x0078:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x007c:
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$e r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.this
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.this
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$FloatingShowStatus r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.b(r0)
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$FloatingShowStatus r1 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.FloatingShowStatus.CLOSE
                    if (r0 != r1) goto L_0x008f
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer$e r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.this
                    com.taobao.linkmanager.afc.xbs.TBFloatingLayer r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.this
                    r0.v()
                L_0x008f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.linkmanager.afc.xbs.TBFloatingLayer.e.a.run():void");
            }
        }

        static {
            t2o.a(744489064);
        }

        public e() {
            if (TBFloatingLayer.b(TBFloatingLayer.this) == FloatingShowStatus.CLOSE) {
                this.f10926a = -TBFloatingLayer.this.f.getWidth();
            } else if (TBFloatingLayer.b(TBFloatingLayer.this) == FloatingShowStatus.HIDE) {
                this.f10926a = -TBFloatingLayer.t(TBFloatingLayer.this).getWidth();
            } else {
                this.f10926a = 0;
            }
            this.b = TBFloatingLayer.this.i.y;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/xbs/TBFloatingLayer$TrayAnimationTimerTask");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TBFloatingLayer.this.q.post(new a());
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(744489057);
    }

    public static /* synthetic */ FloatingType a(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingType) ipChange.ipc$dispatch("f8923713", new Object[]{tBFloatingLayer});
        }
        return tBFloatingLayer.m;
    }

    public static /* synthetic */ FloatingShowStatus b(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingShowStatus) ipChange.ipc$dispatch("624f7f1f", new Object[]{tBFloatingLayer});
        }
        return tBFloatingLayer.n;
    }

    public static /* synthetic */ e c(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("fc324fc6", new Object[]{tBFloatingLayer});
        }
        return tBFloatingLayer.p;
    }

    public static /* synthetic */ e d(TBFloatingLayer tBFloatingLayer, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("f4ecbaa0", new Object[]{tBFloatingLayer, eVar});
        }
        tBFloatingLayer.p = eVar;
        return eVar;
    }

    public static /* synthetic */ FloatingShowStatus e(TBFloatingLayer tBFloatingLayer, FloatingShowStatus floatingShowStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatingShowStatus) ipChange.ipc$dispatch("7499bb5c", new Object[]{tBFloatingLayer, floatingShowStatus});
        }
        tBFloatingLayer.n = floatingShowStatus;
        return floatingShowStatus;
    }

    public static /* synthetic */ Timer f(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("f83a34ab", new Object[]{tBFloatingLayer});
        }
        return tBFloatingLayer.o;
    }

    public static /* synthetic */ Timer g(TBFloatingLayer tBFloatingLayer, Timer timer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timer) ipChange.ipc$dispatch("38057107", new Object[]{tBFloatingLayer, timer});
        }
        tBFloatingLayer.o = timer;
        return timer;
    }

    public static /* synthetic */ AtomicBoolean h(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("27770d40", new Object[]{tBFloatingLayer});
        }
        return tBFloatingLayer.A;
    }

    public static /* synthetic */ hxt i(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hxt) ipChange.ipc$dispatch("b2a3ab1", new Object[]{tBFloatingLayer});
        }
        return tBFloatingLayer.l;
    }

    public static /* synthetic */ float j(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8627ba02", new Object[]{tBFloatingLayer})).floatValue();
        }
        return tBFloatingLayer.f10921a;
    }

    public static /* synthetic */ float k(TBFloatingLayer tBFloatingLayer, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7306ed1c", new Object[]{tBFloatingLayer, new Float(f)})).floatValue();
        }
        tBFloatingLayer.f10921a = f;
        return f;
    }

    public static /* synthetic */ float l(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af7c0f43", new Object[]{tBFloatingLayer})).floatValue();
        }
        return tBFloatingLayer.b;
    }

    public static /* synthetic */ float m(TBFloatingLayer tBFloatingLayer, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("743d3ffb", new Object[]{tBFloatingLayer, new Float(f)})).floatValue();
        }
        tBFloatingLayer.b = f;
        return f;
    }

    public static /* synthetic */ float n(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8d06484", new Object[]{tBFloatingLayer})).floatValue();
        }
        return tBFloatingLayer.c;
    }

    public static /* synthetic */ float o(TBFloatingLayer tBFloatingLayer, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("757392da", new Object[]{tBFloatingLayer, new Float(f)})).floatValue();
        }
        tBFloatingLayer.c = f;
        return f;
    }

    public static /* synthetic */ BigDecimal p(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("ffaf3ae5", new Object[]{tBFloatingLayer});
        }
        return tBFloatingLayer.k;
    }

    public static /* synthetic */ BigDecimal q(TBFloatingLayer tBFloatingLayer, BigDecimal bigDecimal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BigDecimal) ipChange.ipc$dispatch("71df3d1f", new Object[]{tBFloatingLayer, bigDecimal});
        }
        tBFloatingLayer.k = bigDecimal;
        return bigDecimal;
    }

    public static /* synthetic */ boolean r(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b790f1a", new Object[]{tBFloatingLayer})).booleanValue();
        }
        return tBFloatingLayer.e;
    }

    public static /* synthetic */ boolean s(TBFloatingLayer tBFloatingLayer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77e083c0", new Object[]{tBFloatingLayer, new Boolean(z)})).booleanValue();
        }
        tBFloatingLayer.e = z;
        return z;
    }

    public static /* synthetic */ LinearLayout t(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("8c71fd2e", new Object[]{tBFloatingLayer});
        }
        return tBFloatingLayer.g;
    }

    public static /* synthetic */ int u(TBFloatingLayer tBFloatingLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e21b98b", new Object[]{tBFloatingLayer})).intValue();
        }
        return tBFloatingLayer.j;
    }

    public static TBFloatingLayer w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("4dd6cc9c", new Object[0]);
        }
        if (B == null) {
            synchronized (TBFloatingLayer.class) {
                try {
                    if (B == null) {
                        B = new TBFloatingLayer();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return B;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        try {
            LayoutInflater layoutInflater = (LayoutInflater) Globals.getApplication().getSystemService("layout_inflater");
            if (this.z) {
                this.f = (LinearLayout) layoutInflater.inflate(R.layout.alibc_tipsview_layer_layout_new, (ViewGroup) null);
            } else {
                this.f = (LinearLayout) layoutInflater.inflate(R.layout.alibc_tipsview_layer_layout, (ViewGroup) null);
            }
            this.g = (LinearLayout) this.f.findViewById(R.id.layer_hidepart);
            this.f.setLayoutParams(this.i);
            this.t = (LinearLayout) this.f.findViewById(R.id.alibc_tips_container);
            this.u = (RelativeLayout) this.f.findViewById(R.id.alibc_tips_icon);
            TUrlImageView tUrlImageView = (TUrlImageView) this.f.findViewById(R.id.alibc_circle_imageview);
            this.s = tUrlImageView;
            tUrlImageView.setErrorImageResId(R.drawable.alibc_placeholder);
            TextView textView = (TextView) this.f.findViewById(R.id.layer_content);
            this.v = (FrameLayout) this.f.findViewById(R.id.app_name_container);
            this.w = (TextView) this.f.findViewById(R.id.app_name);
            this.x = (TextView) this.f.findViewById(R.id.back_text);
            if (this.z) {
                View findViewById = this.f.findViewById(R.id.alibc_tips_close);
                this.y = findViewById;
                ViewProxy.setOnClickListener(findViewById, new a());
            }
            this.h = (WindowManager) Globals.getApplication().getSystemService(pg1.ATOM_EXT_window);
        } catch (Throwable unused) {
        }
    }

    public TBFloatingLayer B(BigDecimal bigDecimal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("cddea18b", new Object[]{this, bigDecimal});
        }
        this.d = bigDecimal;
        return B;
    }

    public TBFloatingLayer D(FloatingType floatingType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("8afd47c3", new Object[]{this, floatingType});
        }
        this.m = floatingType;
        return B;
    }

    public TBFloatingLayer E(hxt hxtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("9a6367b", new Object[]{this, hxtVar});
        }
        if (hxtVar != null) {
            this.l = hxtVar;
        }
        return B;
    }

    public void G(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bca215b", new Object[]{this, activity});
            return;
        }
        try {
            BigDecimal valueOf = BigDecimal.valueOf(TimestampSynchronizer.getServerTime());
            if (this.d.floatValue() > 0.0f && valueOf.subtract(this.d).floatValue() >= 0.0f) {
                C = false;
                B = null;
                hxt hxtVar = this.l;
                if (hxtVar != null) {
                    hxtVar.c();
                }
            } else if (w() != null && C) {
                d dVar = new d(activity);
                this.r = dVar;
                this.q.postDelayed(dVar, 1000L);
            }
        } catch (Throwable unused) {
        }
    }

    public final String H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f848f525", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || str.length() <= 4) {
            return str;
        }
        return str.substring(0, 4) + "...";
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            C = false;
            try {
                this.h.removeViewImmediate(this.f);
                this.i.token = null;
            } catch (Exception unused) {
            }
            B = null;
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
    public void x() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "68b7c40e"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
            w()     // Catch: Exception -> 0x0028
            r0 = move-result     // Catch: Exception -> 0x0028
            if (r0 == 0) goto L_0x0028     // Catch: Exception -> 0x0028
            boolean r0 = com.taobao.linkmanager.afc.xbs.TBFloatingLayer.C     // Catch: Exception -> 0x0028
            if (r0 == 0) goto L_0x0028
            android.view.WindowManager r0 = r4.h
            android.widget.LinearLayout r1 = r4.f
            r0.removeViewImmediate(r1)
            android.view.WindowManager$LayoutParams r0 = r4.i
            r1 = 0
            r0.token = r1
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.linkmanager.afc.xbs.TBFloatingLayer.x():void");
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54e0b0eb", new Object[]{this});
        } else {
            this.f.setOnTouchListener(new b());
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        this.j = Globals.getApplication().getResources().getDisplayMetrics().heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 1003, 520, -3);
        this.i = layoutParams;
        layoutParams.gravity = 51;
        layoutParams.x = 0;
        layoutParams.y = (this.j / 6) * 4;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10925a = 0;
        private Activity b;

        static {
            t2o.a(744489063);
        }

        public d(Activity activity) {
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IBinder iBinder;
            d dVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b != null && TBFloatingLayer.C && !this.b.isFinishing()) {
                try {
                    iBinder = this.b.getWindow().getDecorView().getWindowToken();
                } catch (Exception unused) {
                    iBinder = null;
                }
                if (iBinder != null) {
                    try {
                        try {
                            TBFloatingLayer tBFloatingLayer = TBFloatingLayer.this;
                            tBFloatingLayer.i.token = iBinder;
                            tBFloatingLayer.f.setVisibility(0);
                            TBFloatingLayer tBFloatingLayer2 = TBFloatingLayer.this;
                            tBFloatingLayer2.h.addView(tBFloatingLayer2.f, tBFloatingLayer2.i);
                            vp9.a("linkx", "ShowRunnable addView");
                            if (TBFloatingLayer.h(TBFloatingLayer.this).compareAndSet(false, true)) {
                                TBFloatingLayer.i(TBFloatingLayer.this).b(k81.c().a());
                            }
                            this.b = null;
                            return;
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        if (TBFloatingLayer.this.f.getParent() != null) {
                            TBFloatingLayer tBFloatingLayer3 = TBFloatingLayer.this;
                            tBFloatingLayer3.h.removeView(tBFloatingLayer3.f);
                        }
                        TBFloatingLayer tBFloatingLayer4 = TBFloatingLayer.this;
                        tBFloatingLayer4.h.addView(tBFloatingLayer4.f, tBFloatingLayer4.i);
                        return;
                    }
                }
                int i = this.f10925a + 1;
                this.f10925a = i;
                TBFloatingLayer tBFloatingLayer5 = TBFloatingLayer.this;
                WindowManager.LayoutParams layoutParams = tBFloatingLayer5.i;
                if (layoutParams != null) {
                    layoutParams.token = null;
                }
                if (i < 10 && (dVar = tBFloatingLayer5.r) != null) {
                    tBFloatingLayer5.q.postDelayed(dVar, 500L);
                }
            }
        }
    }

    public TBFloatingLayer C(qg0 qg0Var, AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFloatingLayer) ipChange.ipc$dispatch("20345df8", new Object[]{this, qg0Var, afcXbsData});
        }
        vp9.a("linkx", "TBFloatingLayer  === setDisplayContent ==  设置小把手内容");
        this.z = bh0.d(afcXbsData);
        z();
        A();
        y();
        if (this.u == null || qg0Var == null) {
            return B;
        }
        String str = afcXbsData.type;
        if (TextUtils.equals(str, "1") && !TextUtils.isEmpty(afcXbsData.tipsIcon)) {
            if (!this.z) {
                this.t.getLayoutParams().width = (int) TFCCommonUtils.h(71.0f);
            }
            this.u.setVisibility(0);
            this.s.setImageUrl(afcXbsData.tipsIcon);
            this.v.setVisibility(8);
            this.x.setVisibility(0);
            return B;
        } else if (TextUtils.equals(str, "2") && !TextUtils.isEmpty(afcXbsData.appName)) {
            if (!this.z) {
                this.t.getLayoutParams().width = (int) TFCCommonUtils.h(78.0f);
            }
            this.v.setVisibility(0);
            this.w.setText(H(afcXbsData.appName));
            this.u.setVisibility(8);
            this.x.setVisibility(8);
            return B;
        } else if (!TextUtils.equals(str, "3") || TextUtils.isEmpty(afcXbsData.tipsIcon)) {
            if (!this.z) {
                this.t.getLayoutParams().width = (int) TFCCommonUtils.h(57.0f);
            }
            this.x.setVisibility(0);
            this.u.setVisibility(8);
            this.v.setVisibility(8);
            return B;
        } else {
            this.u.setVisibility(0);
            this.s.setImageUrl(afcXbsData.tipsIcon);
            this.v.setVisibility(0);
            this.w.setText(H(afcXbsData.appName));
            this.x.setVisibility(8);
            return B;
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            if (w() != null && this.f != null && this.n == FloatingShowStatus.CLOSE) {
                C = true;
                this.n = FloatingShowStatus.SHOW;
                vp9.a("linkx", "TBFloatingLayer  === show ==  小把手绘制ing");
                if (k81.c().f22459a != null) {
                    G(k81.c().f22459a.get());
                    vp9.a("linkx", "TBFloatingLayer  === show == mShowStatus: " + this.n);
                    this.f.postDelayed(new c(), 100L);
                }
            }
        } catch (Exception e2) {
            vp9.b("linkx", "TBFloatingLayer == show 小把手展示异常了： " + e2.getMessage());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            if (r9 != 3) goto L_0x0208;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
                Method dump skipped, instructions count: 521
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.linkmanager.afc.xbs.TBFloatingLayer.b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }
}
