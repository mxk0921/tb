package com.etao.feimagesearch.capture.tool.bottom;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView;
import com.etao.feimagesearch.capture.tool.base.CaptureManager;
import com.etao.feimagesearch.capture.tool.base.CaptureRainbowManager;
import com.etao.feimagesearch.capture.tool.bottom.album.CaptureAlbumWidget;
import com.etao.feimagesearch.result.ScrollInterceptView;
import com.etao.feimagesearch.struct.ViewWidget;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.caa;
import tb.ckf;
import tb.gib;
import tb.ipj;
import tb.lg4;
import tb.n63;
import tb.ojb;
import tb.p1p;
import tb.t2o;
import tb.xfw;
import tb.y33;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureToolBottomWidget extends ViewWidget<ScrollInterceptView, CaptureManager, CaptureToolBottomWidget> implements ojb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int TYPE_ALBUM = 0;
    public volatile CaptureManager l;
    public FrameLayout m;
    public final int n;
    public final int o;
    public final CaptureAlbumWidget p;
    public gib q;
    public final n63 r;
    public int s;
    public int t;
    public boolean u;
    public static final a Companion = new a(null);
    public static final int v = p1p.a(89.0f);
    public static final int w = p1p.a(1.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296764);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("85978d0a", new Object[]{this})).intValue();
            }
            return CaptureToolBottomWidget.h0();
        }

        @JvmStatic
        public final int b(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("491e39e7", new Object[]{this, activity})).intValue();
            }
            ckf.g(activity, "activity");
            int c = c(activity);
            return ((caa.h(activity) - ((c - 1) * a())) / c) + p1p.a(47.0f);
        }

        @JvmStatic
        public final int c(Activity activity) {
            int h;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("23f3df50", new Object[]{this, activity})).intValue();
            }
            ckf.g(activity, "activity");
            if ((caa.s() || caa.t()) && (h = (int) ((caa.h(activity) + a()) / (CaptureToolBottomWidget.j0() + a()))) > 0) {
                return h;
            }
            return 4;
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            ScrollInterceptView X = CaptureToolBottomWidget.this.X();
            if (!(X == null || (viewTreeObserver = X.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            CaptureToolBottomWidget.this.onTabChanged(0);
            CaptureToolBottomWidget.o0(CaptureToolBottomWidget.this);
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
            FrameLayout k0 = CaptureToolBottomWidget.k0(CaptureToolBottomWidget.this);
            if (k0 != null) {
                k0.addView(view, new FrameLayout.LayoutParams(-1, CaptureToolBottomWidget.m0(CaptureToolBottomWidget.this)));
                FrameLayout k02 = CaptureToolBottomWidget.k0(CaptureToolBottomWidget.this);
                if (k02 != null) {
                    return k02;
                }
                ckf.y("mainContainer");
                throw null;
            }
            ckf.y("mainContainer");
            throw null;
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout k0 = CaptureToolBottomWidget.k0(CaptureToolBottomWidget.this);
            if (k0 != null) {
                return k0;
            }
            ckf.y("mainContainer");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements ScrollInterceptView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.a
        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("81a01aca", new Object[]{this})).booleanValue();
            }
            gib i0 = CaptureToolBottomWidget.i0(CaptureToolBottomWidget.this);
            if (i0 == null) {
                return false;
            }
            return i0.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements ScrollInterceptView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35387db9", new Object[]{this});
            }
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void l(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efa83a09", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i2 != 1 && i2 != 2) {
                if (i2 == -1 && i != -1) {
                    return;
                }
                if (i2 == 0 && i != 0 && i != -1) {
                    CaptureToolBottomWidget.l0(CaptureToolBottomWidget.this).k0(false);
                    CaptureToolBottomWidget.p0(CaptureToolBottomWidget.this, false);
                } else if (i2 == 3 && i != 3 && i != -1) {
                    CaptureToolBottomWidget.l0(CaptureToolBottomWidget.this).k0(true);
                    CaptureToolBottomWidget.p0(CaptureToolBottomWidget.this, true);
                }
            }
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void s(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691aec9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            CaptureToolBottomWidget.r0(CaptureToolBottomWidget.this, i4 - i2);
            CaptureToolBottomWidget.q0(CaptureToolBottomWidget.this, i4);
            gib i0 = CaptureToolBottomWidget.i0(CaptureToolBottomWidget.this);
            if (i0 != null) {
                i0.d(CaptureToolBottomWidget.n0(CaptureToolBottomWidget.this), i4);
            }
        }
    }

    static {
        t2o.a(481296763);
        t2o.a(481296539);
        p1p.a(50.0f);
    }

    public static final /* synthetic */ int h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34d44c3b", new Object[0])).intValue();
        }
        return w;
    }

    public static final /* synthetic */ gib i0(CaptureToolBottomWidget captureToolBottomWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gib) ipChange.ipc$dispatch("979487ba", new Object[]{captureToolBottomWidget});
        }
        return captureToolBottomWidget.q;
    }

    public static /* synthetic */ Object ipc$super(CaptureToolBottomWidget captureToolBottomWidget, String str, Object... objArr) {
        if (str.hashCode() == 1250151579) {
            super.G();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/CaptureToolBottomWidget");
    }

    public static final /* synthetic */ int j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("450dbf8c", new Object[0])).intValue();
        }
        return v;
    }

    public static final /* synthetic */ FrameLayout k0(CaptureToolBottomWidget captureToolBottomWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("309b66ed", new Object[]{captureToolBottomWidget});
        }
        return captureToolBottomWidget.m;
    }

    public static final /* synthetic */ n63 l0(CaptureToolBottomWidget captureToolBottomWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n63) ipChange.ipc$dispatch("397a6a12", new Object[]{captureToolBottomWidget});
        }
        return captureToolBottomWidget.r;
    }

    public static final /* synthetic */ int m0(CaptureToolBottomWidget captureToolBottomWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c18ea41", new Object[]{captureToolBottomWidget})).intValue();
        }
        return captureToolBottomWidget.o;
    }

    public static final /* synthetic */ int n0(CaptureToolBottomWidget captureToolBottomWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("671a0e01", new Object[]{captureToolBottomWidget})).intValue();
        }
        return captureToolBottomWidget.s;
    }

    public static final /* synthetic */ void o0(CaptureToolBottomWidget captureToolBottomWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad469ba", new Object[]{captureToolBottomWidget});
        } else {
            captureToolBottomWidget.t0();
        }
    }

    public static final /* synthetic */ void p0(CaptureToolBottomWidget captureToolBottomWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710904ad", new Object[]{captureToolBottomWidget, new Boolean(z)});
        } else {
            captureToolBottomWidget.u = z;
        }
    }

    public static final /* synthetic */ void q0(CaptureToolBottomWidget captureToolBottomWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a05302", new Object[]{captureToolBottomWidget, new Integer(i)});
        } else {
            captureToolBottomWidget.t = i;
        }
    }

    public static final /* synthetic */ void r0(CaptureToolBottomWidget captureToolBottomWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7329c1", new Object[]{captureToolBottomWidget, new Integer(i)});
        } else {
            captureToolBottomWidget.s = i;
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        ViewTreeObserver viewTreeObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        super.G();
        this.u = false;
        ScrollInterceptView X = X();
        if (X != null && (viewTreeObserver = X.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public final CaptureManager s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("5165d96f", new Object[]{this});
        }
        return this.l;
    }

    public final void t0() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab43333", new Object[]{this});
            return;
        }
        Integer b2 = ipj.INSTANCE.b((AppCompatActivity) E());
        if (b2 == null) {
            i = p1p.a(50.0f);
        } else {
            i = b2.intValue();
        }
        int a2 = i + p1p.a(10.0f);
        ScrollInterceptView X = X();
        if (X != null) {
            X.setContentUpStateOffset(a2);
        }
        ScrollInterceptView X2 = X();
        if (X2 != null) {
            X2.setDownContentHeight(this.n);
        }
        ScrollInterceptView X3 = X();
        if (X3 != null) {
            X3.movePageToAssignPageLocationRatioWithAnim(1.0f, 0L, null);
        }
    }

    /* renamed from: u0 */
    public ScrollInterceptView b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollInterceptView) ipChange.ipc$dispatch("6fedd6c1", new Object[]{this});
        }
        ScrollInterceptView scrollInterceptView = new ScrollInterceptView(E());
        FrameLayout frameLayout = new FrameLayout(E());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(p1p.b(6.5f));
        gradientDrawable.setColor(Color.parseColor("#0E1119"));
        frameLayout.setBackground(gradientDrawable);
        this.m = frameLayout;
        scrollInterceptView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        scrollInterceptView.setStateProvider(new d());
        scrollInterceptView.setAutoScrollInterval(1);
        scrollInterceptView.setOffsetCallback(new e());
        return scrollInterceptView;
    }

    @Override // tb.ojb
    public void w(boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff87768", new Object[]{this, new Boolean(z)});
        } else if (this.u != z) {
            this.u = z;
            gib gibVar = this.q;
            if (gibVar != null) {
                ((CaptureAlbumWidget) gibVar).g(z);
            }
            ScrollInterceptView X = X();
            if (X != null) {
                if (this.u) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                X.movePageToAssignPageLocationRatioWithAnim(f, 150L, null);
            }
        }
    }

    @Override // tb.ojb
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24e7612d", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.ojb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTabChanged(int r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.etao.feimagesearch.capture.tool.bottom.CaptureToolBottomWidget.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r1] = r8
            r9[r0] = r3
            java.lang.String r0 = "62d6597e"
            r2.ipc$dispatch(r0, r9)
            return
        L_0x001a:
            com.etao.feimagesearch.capture.tool.bottom.album.CaptureAlbumWidget r9 = r8.p
            tb.gib r2 = r8.q
            r3 = 0
            java.lang.String r4 = "mainContainer"
            if (r2 != 0) goto L_0x0025
            goto L_0x003b
        L_0x0025:
            com.etao.feimagesearch.capture.tool.bottom.album.CaptureAlbumWidget r2 = (com.etao.feimagesearch.capture.tool.bottom.album.CaptureAlbumWidget) r2
            android.view.View r5 = r2.getView()
            android.widget.FrameLayout r6 = r8.m
            if (r6 == 0) goto L_0x008c
            r6.removeView(r5)
            boolean r5 = r8.u
            int r6 = r8.s
            int r7 = r8.t
            r2.t(r1, r5, r6, r7)
        L_0x003b:
            android.widget.FrameLayout r2 = r8.m
            if (r2 == 0) goto L_0x0088
            android.view.View r3 = r9.X()
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            android.app.Activity r5 = r8.E()
            int r5 = tb.caa.g(r5)
            tb.ipj r6 = tb.ipj.INSTANCE
            android.app.Activity r7 = r8.E()
            androidx.appcompat.app.AppCompatActivity r7 = (androidx.appcompat.app.AppCompatActivity) r7
            java.lang.Integer r6 = r6.b(r7)
            if (r6 != 0) goto L_0x0062
            r6 = 1112014848(0x42480000, float:50.0)
            int r6 = tb.p1p.a(r6)
            goto L_0x0066
        L_0x0062:
            int r6 = r6.intValue()
        L_0x0066:
            r7 = 1092616192(0x41200000, float:10.0)
            int r7 = tb.p1p.a(r7)
            int r6 = r6 + r7
            int r5 = r5 - r6
            r6 = -1
            r4.<init>(r6, r5)
            int r5 = r8.o
            r4.setMargins(r1, r5, r1, r1)
            tb.xhv r1 = tb.xhv.INSTANCE
            r2.addView(r3, r4)
            boolean r1 = r8.u
            int r2 = r8.s
            int r3 = r8.t
            r9.t(r0, r1, r2, r3)
            r8.q = r9
            return
        L_0x0088:
            tb.ckf.y(r4)
            throw r3
        L_0x008c:
            tb.ckf.y(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.capture.tool.bottom.CaptureToolBottomWidget.onTabChanged(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureToolBottomWidget(Activity activity, Object obj, CaptureManager captureManager, xfw xfwVar) {
        super(activity, obj, captureManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        ckf.g(xfwVar, "viewSetter");
        this.l = captureManager;
        int b2 = CaptureBottomAreaView.Companion.b(activity, lg4.O1(activity));
        this.n = b2;
        this.o = p1p.a(CaptureRainbowManager.Companion.a().d() ? 55.0f : 45.0f);
        this.p = new CaptureAlbumWidget(activity, this, true, this.l, null, new CaptureToolBottomWidget$albumWidget$1(this, activity), b2);
        this.r = new y33(activity, this, this.l, true, new c(), this);
    }
}
