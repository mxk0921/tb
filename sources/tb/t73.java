package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ability.localization.Localization;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView;
import com.etao.feimagesearch.capture.scan.irp.ImgChannelDetectManager;
import com.etao.feimagesearch.intelli.ObjectDetectorWrapper;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class t73 extends d32<w63, yr3, CaptureManager> implements pdc, web {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static String D = "Page_PhotoSearchTake";
    public static final int E = Result.ALIPAY_VERIFY_UNREG_NODE_FAILED;
    public static final String TAG = "AutoSize_CaptureViewV2";
    public pi2 A;
    public p53 B;
    public p7 C;
    public k53 l;
    public pv1 m;
    public d73 n;
    public t63 o;
    public l73 p;
    public y63 q;
    public g63 r;
    public hjb s;
    public HashMap<String, b> t;
    public CaptureBottomAreaView u;
    public m43 v;
    public ScheduledExecutorService w;
    public ScheduledFuture<?> x;
    public yfl y;
    public boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(730857516);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53d434dc", new Object[]{this})).intValue();
            }
            return t73.X();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a(String str, boolean z);

        void b(String str, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FrameLayout b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ t73 c;
            public final /* synthetic */ FrameLayout d;
            public final /* synthetic */ CaptureBottomAreaView e;

            public a(t73 t73Var, FrameLayout frameLayout, CaptureBottomAreaView captureBottomAreaView) {
                this.c = t73Var;
                this.d = frameLayout;
                this.e = captureBottomAreaView;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureViewV2$createBottomView$1$1");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                } else if (t73.Q(this.c) == null) {
                    this.d.addView(this.e.b0(), new FrameLayout.LayoutParams(-1, -1));
                    t73.c0(this.c, this.e);
                    this.c.f(this.e);
                    pi2 P = t73.P(this.c);
                    if (P != null) {
                        CaptureBottomAreaView captureBottomAreaView = this.e;
                        t73 t73Var = this.c;
                        captureBottomAreaView.d0(P.c());
                        captureBottomAreaView.f0(P.a(), P.b());
                        int T = t73.T(t73Var);
                        if (T == 2) {
                            captureBottomAreaView.F();
                        } else if (T == 3) {
                            captureBottomAreaView.D();
                        } else if (T == 4) {
                            captureBottomAreaView.H();
                        } else if (T == 5) {
                            captureBottomAreaView.A();
                        }
                        t73.b0(t73Var, null);
                    }
                }
            }
        }

        public c(FrameLayout frameLayout) {
            this.b = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Activity O = t73.O(t73.this);
            ckf.f(O, "activity");
            t73 t73Var = t73.this;
            FrameLayout frameLayout = this.b;
            ckf.f(frameLayout, "bottomAreaContainer");
            CaptureBottomAreaView captureBottomAreaView = new CaptureBottomAreaView(O, t73Var, frameLayout, false);
            agh.h(t73.TAG, "onLoadFinish: CaptureBottomAreaView");
            vpt.g("CaptureViewV2_addBottomView", new a(t73.this, this.b, captureBottomAreaView));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureViewV2$execResume$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            CaptureManager q0 = t73.this.m();
            q0.e(t73.O(t73.this));
            q0.m0();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureViewV2$execScreenChanged$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            pv1 R = t73.R(t73.this);
            if (R == null) {
                ckf.y("hybridView");
                throw null;
            } else if (!R.q()) {
                t73.f0(t73.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements qv8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l63 f28520a;
        public final /* synthetic */ DynCaptureImgGotConfig b;
        public final /* synthetic */ t73 c;

        public f(l63 l63Var, DynCaptureImgGotConfig dynCaptureImgGotConfig, t73 t73Var) {
            this.f28520a = l63Var;
            this.b = dynCaptureImgGotConfig;
            this.c = t73Var;
        }

        @Override // tb.qv8
        public final void a(Bitmap bitmap, boolean z, rv8 rv8Var, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a91cac83", new Object[]{this, bitmap, new Boolean(z), rv8Var, new Boolean(z2)});
            } else if (bitmap == null) {
                this.f28520a.a(null, -1, "get preview data failed");
            } else {
                w7m f = this.b.f().f();
                f.E(bitmap);
                Map<String, String> extraParams = this.c.p().getExtraParams();
                ckf.f(extraParams, "pageModel.extraParams");
                f.H(kotlin.collections.a.t(extraParams));
                new f48(this.b).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.t73.b
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbc9d18", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            vso.c(str, t73.this.m());
            t73.this.m().u0(str);
            t73.this.m().e(t73.O(t73.this));
            if (z) {
                d73 Y = t73.Y(t73.this);
                if (Y != null) {
                    Y.T(true);
                    w63 w63Var = (w63) t73.V(t73.this);
                    if (w63Var != null) {
                        w63Var.E(str);
                    }
                } else {
                    ckf.y("scanView");
                    throw null;
                }
            }
            t73 t73Var = t73.this;
            d73 Y2 = t73.Y(t73Var);
            if (Y2 != null) {
                t73.d0(t73Var, Y2);
                t73.g0(t73.this, true);
                return;
            }
            ckf.y("scanView");
            throw null;
        }

        @Override // tb.t73.b
        public void b(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5799ea59", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            if (z) {
                d73 Y = t73.Y(t73.this);
                if (Y != null) {
                    Y.T(false);
                } else {
                    ckf.y("scanView");
                    throw null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.t73.b
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbc9d18", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            vso.c(str, t73.this.m());
            t73.this.m().u0(str);
            t73.this.m().e(t73.O(t73.this));
            if (z) {
                t63 U = t73.U(t73.this);
                if (U != null) {
                    U.U(true);
                    w63 w63Var = (w63) t73.V(t73.this);
                    if (w63Var != null) {
                        w63Var.E(str);
                    }
                } else {
                    ckf.y("paiView");
                    throw null;
                }
            }
            t73 t73Var = t73.this;
            t63 U2 = t73.U(t73Var);
            if (U2 != null) {
                t73.d0(t73Var, U2);
                t73.g0(t73.this, true);
                return;
            }
            ckf.y("paiView");
            throw null;
        }

        @Override // tb.t73.b
        public void b(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5799ea59", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            if (z) {
                t63 U = t73.U(t73.this);
                if (U != null) {
                    U.U(false);
                } else {
                    ckf.y("paiView");
                    throw null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.t73.b
        public void b(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5799ea59", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            if (z) {
                t63 U = t73.U(t73.this);
                if (U != null) {
                    U.U(false);
                } else {
                    ckf.y("paiView");
                    throw null;
                }
            }
        }

        @Override // tb.t73.b
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbc9d18", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            vso.c(str, t73.this.m());
            t73.this.m().u0(str);
            t73.this.m().e(t73.O(t73.this));
            if (z) {
                t63 U = t73.U(t73.this);
                if (U != null) {
                    U.U(true);
                    w63 w63Var = (w63) t73.V(t73.this);
                    if (w63Var != null) {
                        w63Var.E(str);
                    }
                } else {
                    ckf.y("paiView");
                    throw null;
                }
            }
            t73 t73Var = t73.this;
            t63 U2 = t73.U(t73Var);
            if (U2 != null) {
                t73.d0(t73Var, U2);
                t73.g0(t73.this, false);
                return;
            }
            ckf.y("paiView");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.t73.b
        public void b(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5799ea59", new Object[]{this, str, new Boolean(z)});
            } else {
                ckf.g(str, "scene");
            }
        }

        @Override // tb.t73.b
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbc9d18", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            vso.c(str, t73.this.m());
            t73.this.m().u0(str);
            t73.this.m().j0();
            w63 w63Var = (w63) t73.V(t73.this);
            if (w63Var != null) {
                w63Var.E(str);
            }
            t73.d0(t73.this, null);
            t73.g0(t73.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class k implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // tb.t73.b
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbc9d18", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            agh.h(t73.TAG, ckf.p("onSceneEnter", str));
            vso.c(str, t73.this.m());
            t73.this.m().u0(str);
            t73.this.m().j0();
            if (z) {
                l73 Z = t73.Z(t73.this);
                if (Z != null) {
                    Z.O(true);
                    w63 w63Var = (w63) t73.V(t73.this);
                    if (w63Var != null) {
                        w63Var.E(str);
                    }
                } else {
                    ckf.y("translateView");
                    throw null;
                }
            }
            t73 t73Var = t73.this;
            l73 Z2 = t73.Z(t73Var);
            if (Z2 != null) {
                t73.d0(t73Var, Z2);
            } else {
                ckf.y("translateView");
                throw null;
            }
        }

        @Override // tb.t73.b
        public void b(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5799ea59", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            if (z) {
                l73 Z = t73.Z(t73.this);
                if (Z != null) {
                    Z.O(false);
                } else {
                    ckf.y("translateView");
                    throw null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class l implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // tb.t73.b
        public void b(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5799ea59", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            if (z) {
                y63 W = t73.W(t73.this);
                if (W != null) {
                    W.P(false);
                } else {
                    ckf.y("questionView");
                    throw null;
                }
            }
        }

        @Override // tb.t73.b
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbc9d18", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            agh.h(t73.TAG, ckf.p("onSceneEnter", str));
            vso.c(str, t73.this.m());
            t73.this.m().u0(str);
            t73.this.m().j0();
            t73.g0(t73.this, false);
            if (z) {
                y63 W = t73.W(t73.this);
                if (W != null) {
                    W.P(true);
                    w63 w63Var = (w63) t73.V(t73.this);
                    if (w63Var != null) {
                        w63Var.E(str);
                    }
                } else {
                    ckf.y("questionView");
                    throw null;
                }
            }
            t73 t73Var = t73.this;
            y63 W2 = t73.W(t73Var);
            if (W2 != null) {
                t73.d0(t73Var, W2);
            } else {
                ckf.y("questionView");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class m implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // tb.t73.b
        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbc9d18", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            agh.h(t73.TAG, ckf.p("onSceneEnter", str));
            vso.c(str, t73.this.m());
            t73.this.m().u0(str);
            t73.this.m().j0();
            if (z) {
                g63 S = t73.S(t73.this);
                if (S != null) {
                    S.P(true);
                    w63 w63Var = (w63) t73.V(t73.this);
                    if (w63Var != null) {
                        w63Var.E(str);
                    }
                } else {
                    ckf.y("identifyView");
                    throw null;
                }
            }
            t73 t73Var = t73.this;
            g63 S2 = t73.S(t73Var);
            if (S2 != null) {
                t73.d0(t73Var, S2);
            } else {
                ckf.y("identifyView");
                throw null;
            }
        }

        @Override // tb.t73.b
        public void b(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5799ea59", new Object[]{this, str, new Boolean(z)});
                return;
            }
            ckf.g(str, "scene");
            if (z) {
                g63 S = t73.S(t73.this);
                if (S != null) {
                    S.P(false);
                } else {
                    ckf.y("identifyView");
                    throw null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class n implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // tb.qqt
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return ckf.p(t73.TAG, Integer.valueOf(t73.this.hashCode()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class o implements uck {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // tb.uck
        public final m2d create(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m2d) ipChange.ipc$dispatch("5f1042a6", new Object[]{this, context});
            }
            if (lg4.q4()) {
                return null;
            }
            t73 t73Var = t73.this;
            ckf.f(context, "context");
            return t73.N(t73Var, context, t73.this.m());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            pv1 R = t73.R(t73.this);
            if (R == null) {
                ckf.y("hybridView");
                throw null;
            } else if (!R.q()) {
                t73.f0(t73.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class r implements m7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        @Override // tb.m7
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da73b02d", new Object[]{this});
                return;
            }
            p7 p7Var = new p7(true);
            if (t73.this.m().B().q()) {
                t73.this.m().B().t(p7Var);
            } else {
                t73.a0(t73.this, p7Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class s implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class t extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ t73 d;
        public final /* synthetic */ t73 e;

        public t(boolean z, t73 t73Var, t73 t73Var2) {
            this.c = z;
            this.d = t73Var;
            this.e = t73Var2;
        }

        public static /* synthetic */ Object ipc$super(t tVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureViewV2$uiContainerDegrade$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            if (this.c && lg4.b()) {
                pv1 R = t73.R(this.d);
                if (R != null) {
                    R.A();
                } else {
                    ckf.y("hybridView");
                    throw null;
                }
            }
            t73.e0(this.d, new r53(t73.O(this.d), this.e));
        }
    }

    static {
        t2o.a(730857515);
        t2o.a(481297502);
        t2o.a(481297499);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t73(Activity activity) {
        super(activity);
        String str;
        ckf.g(activity, "activity");
        if (caa.r()) {
            str = "Page_PhotoSearchTakeY";
        } else {
            str = "Page_PhotoSearchTake";
        }
        D = str;
        m().n0(this);
    }

    public static final /* synthetic */ m2d N(t73 t73Var, Context context, CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2d) ipChange.ipc$dispatch("48316fb5", new Object[]{t73Var, context, captureManager});
        }
        return t73Var.n0(context, captureManager);
    }

    public static final /* synthetic */ Activity O(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("8b93d97d", new Object[]{t73Var});
        }
        return t73Var.c;
    }

    public static final /* synthetic */ pi2 P(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pi2) ipChange.ipc$dispatch("89c84a13", new Object[]{t73Var});
        }
        return t73Var.A;
    }

    public static final /* synthetic */ CaptureBottomAreaView Q(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureBottomAreaView) ipChange.ipc$dispatch("498e80c0", new Object[]{t73Var});
        }
        return t73Var.u;
    }

    public static final /* synthetic */ pv1 R(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pv1) ipChange.ipc$dispatch("b2805e8e", new Object[]{t73Var});
        }
        return t73Var.m;
    }

    public static final /* synthetic */ g63 S(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g63) ipChange.ipc$dispatch("a6766fa8", new Object[]{t73Var});
        }
        return t73Var.r;
    }

    public static final /* synthetic */ int T(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1852946", new Object[]{t73Var})).intValue();
        }
        return t73Var.e;
    }

    public static final /* synthetic */ t63 U(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t63) ipChange.ipc$dispatch("e25d5fa4", new Object[]{t73Var});
        }
        return t73Var.o;
    }

    public static final /* synthetic */ mz1 V(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mz1) ipChange.ipc$dispatch("b3aea3fb", new Object[]{t73Var});
        }
        return t73Var.f17536a;
    }

    public static final /* synthetic */ y63 W(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y63) ipChange.ipc$dispatch("b2a46af4", new Object[]{t73Var});
        }
        return t73Var.q;
    }

    public static final /* synthetic */ int X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c15cb4a9", new Object[0])).intValue();
        }
        return E;
    }

    public static final /* synthetic */ d73 Y(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d73) ipChange.ipc$dispatch("c5b552ea", new Object[]{t73Var});
        }
        return t73Var.n;
    }

    public static final /* synthetic */ l73 Z(t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l73) ipChange.ipc$dispatch("268bcc0", new Object[]{t73Var});
        }
        return t73Var.p;
    }

    public static final /* synthetic */ void a0(t73 t73Var, p7 p7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6291b32e", new Object[]{t73Var, p7Var});
        } else {
            t73Var.C = p7Var;
        }
    }

    public static final /* synthetic */ void b0(t73 t73Var, pi2 pi2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233bfab7", new Object[]{t73Var, pi2Var});
        } else {
            t73Var.A = pi2Var;
        }
    }

    public static final /* synthetic */ void c0(t73 t73Var, CaptureBottomAreaView captureBottomAreaView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c2df18", new Object[]{t73Var, captureBottomAreaView});
        } else {
            t73Var.u = captureBottomAreaView;
        }
    }

    public static final /* synthetic */ void d0(t73 t73Var, hjb hjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15384ac5", new Object[]{t73Var, hjbVar});
        } else {
            t73Var.s = hjbVar;
        }
    }

    public static final /* synthetic */ void e0(t73 t73Var, r53 r53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65aeb6fb", new Object[]{t73Var, r53Var});
        } else {
            t73Var.getClass();
        }
    }

    public static final /* synthetic */ void f0(t73 t73Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3a7934", new Object[]{t73Var, new Boolean(z)});
        } else {
            t73Var.D0(z);
        }
    }

    public static final /* synthetic */ void g0(t73 t73Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c15a72", new Object[]{t73Var, new Boolean(z)});
        } else {
            t73Var.G0(z);
        }
    }

    public static /* synthetic */ Object ipc$super(t73 t73Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1805108756:
                super.D();
                return null;
            case -587316827:
                super.F();
                return null;
            case 1411002928:
                super.A();
                return null;
            case 1876185637:
                super.G(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureViewV2");
        }
    }

    @Override // tb.d32
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541a3230", new Object[]{this});
            return;
        }
        super.A();
        if (m().I()) {
            ff2.L().a(String.valueOf(this.c.hashCode()));
        }
        m().j0();
        ScheduledExecutorService scheduledExecutorService = this.w;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            pv1 pv1Var = this.m;
            if (pv1Var != null) {
                if (!pv1Var.P()) {
                    pv1 pv1Var2 = this.m;
                    if (pv1Var2 != null) {
                        pv1Var2.A();
                    } else {
                        ckf.y("hybridView");
                        throw null;
                    }
                }
                ImgChannelDetectManager.Companion.b().d(String.valueOf(this.c.hashCode()));
                hx8.Companion.a().e();
                return;
            }
            ckf.y("hybridView");
            throw null;
        }
        ckf.y("scheduledExecutorService");
        throw null;
    }

    public final void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b91f90c", new Object[]{this});
        } else {
            m().y0(false);
        }
    }

    public final void B0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58b620", new Object[]{this, new Boolean(z)});
        } else {
            m().a0(z);
        }
    }

    public final void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df136cf2", new Object[]{this});
            return;
        }
        k53 k53Var = this.l;
        if (k53Var != null) {
            k53Var.Z(null);
        } else {
            ckf.y("cameraView");
            throw null;
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
        m().C0();
        m().l0();
        m().k0();
    }

    public final boolean E0(r7m r7mVar, boolean z) {
        Boolean bool;
        pi2 pi2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb6f15d", new Object[]{this, r7mVar, new Boolean(z)})).booleanValue();
        }
        CaptureBottomAreaView captureBottomAreaView = this.u;
        xhv xhvVar = null;
        if (captureBottomAreaView == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(captureBottomAreaView.f0(r7mVar, z));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        pi2 pi2Var2 = this.A;
        if (pi2Var2 != null) {
            pi2Var2.d(r7mVar);
            pi2Var2.e(z);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar != null || (pi2Var = this.A) == null) {
            return false;
        }
        pi2Var.d(r7mVar);
        pi2Var.e(z);
        return false;
    }

    @Override // tb.d32
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfe41a5", new Object[]{this});
            return;
        }
        vpt.g("AutoSize_CaptureViewV2_execResume", new d());
        super.F();
        y0(false);
    }

    public final void F0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c116d064", new Object[]{this, new Integer(i2)});
            return;
        }
        pi2 pi2Var = this.A;
        if (pi2Var != null) {
            pi2Var.f(i2);
        }
    }

    public final void G0(boolean z) {
        xhv xhvVar;
        pi2 pi2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bc2f22", new Object[]{this, new Boolean(z)});
            return;
        }
        CaptureBottomAreaView captureBottomAreaView = this.u;
        if (captureBottomAreaView == null) {
            xhvVar = null;
        } else {
            captureBottomAreaView.d0(z);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null && (pi2Var = this.A) != null) {
            pi2Var.g(z);
        }
    }

    public final void H0(List<MusOuterAlbumBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b56a79f", new Object[]{this, list});
            return;
        }
        ckf.g(list, "albumData");
        yfl yflVar = new yfl(list);
        if (m().B().q()) {
            m().B().t(yflVar);
            m().c();
            return;
        }
        this.y = yflVar;
    }

    public final void h0(boolean z, boolean z2, l63 l63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03ff770", new Object[]{this, new Boolean(z), new Boolean(z2), l63Var});
            return;
        }
        ckf.g(l63Var, "callback");
        if (z) {
            k53 k53Var = this.l;
            if (k53Var != null) {
                k53Var.U();
                k53 k53Var2 = this.l;
                if (k53Var2 != null) {
                    k53Var2.Q(z2);
                } else {
                    ckf.y("cameraView");
                    throw null;
                }
            } else {
                ckf.y("cameraView");
                throw null;
            }
        } else {
            k53 k53Var3 = this.l;
            if (k53Var3 != null) {
                k53Var3.V();
            } else {
                ckf.y("cameraView");
                throw null;
            }
        }
    }

    public final void j0() {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554a46ce", new Object[]{this});
            return;
        }
        CaptureBottomAreaView captureBottomAreaView = this.u;
        if (captureBottomAreaView == null) {
            xhvVar = null;
        } else {
            captureBottomAreaView.l(0);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            F0(0);
        }
    }

    @Override // tb.pdc
    public void k(Integer num, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ae1bc6", new Object[]{this, num, str});
            return;
        }
        m43 m43Var = this.v;
        String str3 = null;
        if (m43Var != null) {
            if (num != null) {
                str3 = num.toString();
            }
            m43Var.a("PageMuiseLoad", str3, str, p().getPssource(), true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (num == null || (str2 = num.toString()) == null) {
                str2 = "";
            }
            linkedHashMap.put("errCode", str2);
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("errMsg", str);
            TLogTracker.k("HybridLoad", linkedHashMap);
            D0(false);
            return;
        }
        ckf.y("captureAvaRecord");
        throw null;
    }

    public final void k0() {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42f9c73", new Object[]{this});
            return;
        }
        CaptureBottomAreaView captureBottomAreaView = this.u;
        if (captureBottomAreaView == null) {
            xhvVar = null;
        } else {
            captureBottomAreaView.l(1);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            F0(1);
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6e55c7", new Object[]{this});
        } else {
            m().y0(true);
        }
    }

    public final CaptureBottomAreaView m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureBottomAreaView) ipChange.ipc$dispatch("4bec687d", new Object[]{this});
        }
        FrameLayout frameLayout = (FrameLayout) this.c.findViewById(R.id.fl_bottom_area_ui);
        if (m().h()) {
            m().j(new c(frameLayout));
            return null;
        }
        Activity activity = this.c;
        ckf.f(activity, "activity");
        ckf.f(frameLayout, "bottomAreaContainer");
        return new CaptureBottomAreaView(activity, this, frameLayout, false, 8, null);
    }

    @Override // tb.web
    public void n(pei peiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc9fe03", new Object[]{this, peiVar, new Boolean(z)});
            return;
        }
        hjb hjbVar = this.s;
        if (hjbVar != null) {
            hjbVar.u(peiVar, !z);
        }
    }

    public final m2d n0(Context context, CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2d) ipChange.ipc$dispatch("ccd39265", new Object[]{this, context, captureManager});
        }
        if (lg4.u4() && lg4.k0()) {
            mzu.n(D, "createDetector4GapDevice", 19999, new String[0]);
            return new sq0(context, captureManager);
        } else if (captureManager.S()) {
            return new ObjectDetectorWrapper(context, captureManager);
        } else {
            if (captureManager.i()) {
                return new z4q(context, captureManager);
            }
            if (lg4.s()) {
                return new fg0(context, captureManager);
            }
            return new sq0(context, captureManager);
        }
    }

    /* renamed from: o0 */
    public w63 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w63) ipChange.ipc$dispatch("6546bcde", new Object[]{this});
        }
        return new w63();
    }

    /* renamed from: q0 */
    public CaptureManager m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("fbe80eb4", new Object[]{this});
        }
        T t2 = this.f17536a;
        ckf.d(t2);
        return ((w63) t2).y();
    }

    /* renamed from: r0 */
    public yr3 p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr3) ipChange.ipc$dispatch("e1db49a9", new Object[]{this});
        }
        T t2 = this.f17536a;
        ckf.d(t2);
        return ((w63) t2).C();
    }

    public final void s0(DynCaptureImgGotConfig dynCaptureImgGotConfig, l63 l63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a315993", new Object[]{this, dynCaptureImgGotConfig, l63Var});
            return;
        }
        ckf.g(dynCaptureImgGotConfig, "imgGotConfig");
        ckf.g(l63Var, "callback");
        k53 k53Var = this.l;
        if (k53Var != null) {
            k53Var.Z(new f(l63Var, dynCaptureImgGotConfig, this));
        } else {
            ckf.y("cameraView");
            throw null;
        }
    }

    public final void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39ae3e3", new Object[]{this});
            return;
        }
        HashMap<String, b> hashMap = new HashMap<>(5);
        this.t = hashMap;
        hashMap.put("scan", new g());
        HashMap<String, b> hashMap2 = this.t;
        if (hashMap2 != null) {
            hashMap2.put(l53.b.SCENE_AUTO_DETECT, new h());
            HashMap<String, b> hashMap3 = this.t;
            if (hashMap3 != null) {
                hashMap3.put(l53.b.SCENE_META_SIGHT, new i());
                HashMap<String, b> hashMap4 = this.t;
                if (hashMap4 != null) {
                    hashMap4.put(l53.b.SCENE_MARKETING, new j());
                    HashMap<String, b> hashMap5 = this.t;
                    if (hashMap5 != null) {
                        hashMap5.put("translate", new k());
                        HashMap<String, b> hashMap6 = this.t;
                        if (hashMap6 != null) {
                            hashMap6.put(l53.b.SCENE_QUESTION, new l());
                            HashMap<String, b> hashMap7 = this.t;
                            if (hashMap7 != null) {
                                hashMap7.put(l53.b.SCENE_IDENTIFY_ALL, new m());
                            } else {
                                ckf.y("sceneCallbacks");
                                throw null;
                            }
                        } else {
                            ckf.y("sceneCallbacks");
                            throw null;
                        }
                    } else {
                        ckf.y("sceneCallbacks");
                        throw null;
                    }
                } else {
                    ckf.y("sceneCallbacks");
                    throw null;
                }
            } else {
                ckf.y("sceneCallbacks");
                throw null;
            }
        } else {
            ckf.y("sceneCallbacks");
            throw null;
        }
    }

    public final boolean u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb721cd", new Object[]{this})).booleanValue();
        }
        return true ^ p().scanOnly();
    }

    @Override // tb.pdc
    public void v(Integer num, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a87ad6", new Object[]{this, num, str});
            return;
        }
        m43 m43Var = this.v;
        String str3 = null;
        if (m43Var != null) {
            if (num != null) {
                str3 = num.toString();
            }
            m43Var.a("PageMuiseRun", str3, str, p().getPssource(), true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (num == null || (str2 = num.toString()) == null) {
                str2 = "";
            }
            linkedHashMap.put("errCode", str2);
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("errMsg", str);
            TLogTracker.k("HybridRun", linkedHashMap);
            return;
        }
        ckf.y("captureAvaRecord");
        throw null;
    }

    public final void v0(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        w63 w63Var = (w63) this.f17536a;
        if (w63Var != null) {
            w63Var.F(i2, i3, intent);
        }
    }

    public final void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        m2d z2 = m().z();
        if (z2 != null) {
            z2.d(z);
        }
    }

    public final void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ba187b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            k53 k53Var = this.l;
            if (k53Var != null) {
                k53Var.d0();
            } else {
                ckf.y("cameraView");
                throw null;
            }
        } else {
            k53 k53Var2 = this.l;
            if (k53Var2 != null) {
                k53Var2.c0();
            } else {
                ckf.y("cameraView");
                throw null;
            }
        }
    }

    public final void z0(DynCaptureImgGotConfig dynCaptureImgGotConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccbebf6", new Object[]{this, dynCaptureImgGotConfig});
            return;
        }
        ckf.g(dynCaptureImgGotConfig, "imgGotConfig");
        T t2 = this.f17536a;
        ckf.d(t2);
        ((w63) t2).D(dynCaptureImgGotConfig);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class q implements CaptureManager.RealtimeModelLoadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                t2o.a(730857534);
                int[] iArr = new int[CaptureManager.RealtimeModelLoadListener.LoadState.values().length];
                iArr[CaptureManager.RealtimeModelLoadListener.LoadState.BUILD_SUCCESS.ordinal()] = 1;
                iArr[CaptureManager.RealtimeModelLoadListener.LoadState.BUILD_FAILED.ordinal()] = 2;
                iArr[CaptureManager.RealtimeModelLoadListener.LoadState.DESTROYED.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public q() {
        }

        @Override // com.etao.feimagesearch.structure.capture.CaptureManager.RealtimeModelLoadListener
        public final void a(CaptureManager.RealtimeModelLoadListener.LoadState loadState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d8c437", new Object[]{this, loadState});
                return;
            }
            int i = loadState == null ? -1 : a.$EnumSwitchMapping$0[loadState.ordinal()];
            String str = "close";
            if (i == 1) {
                if (t73.this.m().Q()) {
                    str = "open";
                }
                t73.this.m().B().t(new mkn("show", str));
            } else if (i == 2) {
                if (t73.this.m().Q()) {
                    str = "open";
                }
                t73.this.m().B().t(new mkn("hide", str));
            } else if (i == 3) {
                if (t73.this.m().Q()) {
                    str = "open";
                }
                t73.this.m().B().t(new mkn("hide", str));
            }
        }
    }

    public final void D0(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150239e4", new Object[]{this, new Boolean(z)});
        } else if (!m().T()) {
            m().A0(true);
            n73.m();
            vpt.g("uiContainerDegrade", new t(z, this, this));
            m43 m43Var = this.v;
            if (m43Var != null) {
                if (z) {
                    str = "timeout";
                } else {
                    str = "render";
                }
                m43Var.a("PageDowngrade", "-1", ckf.p(str, " "), p().getPssource(), true);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("isTimeout", String.valueOf(z));
                TLogTracker.k("HybridDowngrade", linkedHashMap);
                return;
            }
            ckf.y("captureAvaRecord");
            throw null;
        }
    }

    @Override // tb.d32
    public void G(int i2) {
        CaptureManager y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd45225", new Object[]{this, new Integer(i2)});
            return;
        }
        agh.r("Dynamic", TAG, ckf.p("execScreenChanged ", Integer.valueOf(i2)));
        super.G(i2);
        w63 w63Var = (w63) this.f17536a;
        if (!(w63Var == null || (y = w63Var.y()) == null)) {
            y.l0();
        }
        if (caa.q()) {
            i0u.b().d(caa.c(), ckf.p("screenChange ", Integer.valueOf(i2)));
        }
        if (u0()) {
            CaptureBottomAreaView captureBottomAreaView = this.u;
            if (captureBottomAreaView != null) {
                captureBottomAreaView.A();
                FrameLayout frameLayout = (FrameLayout) this.c.findViewById(R.id.fl_bottom_area_ui);
                Activity activity = this.c;
                ckf.f(activity, "activity");
                ckf.f(frameLayout, "bottomAreaContainer");
                CaptureBottomAreaView captureBottomAreaView2 = new CaptureBottomAreaView(activity, this, frameLayout, false, 8, null);
                this.u = captureBottomAreaView2;
                captureBottomAreaView2.F();
            }
            this.A = null;
        }
        if (!m().T()) {
            ScheduledFuture<?> scheduledFuture = this.x;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.x = null;
            e eVar = new e();
            Long i22 = lg4.i2();
            ckf.f(i22, "getDynamicCaptureLoadTimeLimit()");
            vpt.h("AutoSize_CaptureViewV2_execScreenChanged", eVar, i22.longValue());
        }
    }

    public final void i(MusOuterAlbumBean musOuterAlbumBean) {
        qu3 g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dffb4e", new Object[]{this, musOuterAlbumBean});
            return;
        }
        ckf.g(musOuterAlbumBean, "albumBean");
        if (!TextUtils.isEmpty(musOuterAlbumBean.getImgKey())) {
            if (musOuterAlbumBean.getRemote()) {
                pmf.e0();
                jzu.i(p73.f25916a, "OuterAlbumRemote", new String[0]);
                IrpParamModel irpParamModel = new IrpParamModel(p());
                irpParamModel.updateSessionId();
                PhotoFrom.Values values = PhotoFrom.Values.OUTER_ALBUM_REMOTE;
                irpParamModel.setPhotoFrom(values);
                Uri parse = Uri.parse(musOuterAlbumBean.getImgKey());
                ckf.f(parse, "parse(albumBean.imgKey)");
                Float imgRotation = musOuterAlbumBean.getImgRotation();
                int floatValue = (int) (imgRotation == null ? 0.0f : imgRotation.floatValue());
                yr3 r0 = p();
                long sessionId = irpParamModel.getSessionId();
                m2d z = m().z();
                String str = null;
                if (z != null && (g2 = z.g()) != null) {
                    str = g2.a();
                }
                a8m.c(parse, null, floatValue, values, r0, sessionId, -1, 0, str);
                nmj.e(this.c, irpParamModel);
                return;
            }
            hjb hjbVar = this.s;
            if (hjbVar != null) {
                hjbVar.i(musOuterAlbumBean);
            }
        }
    }

    @Override // tb.d32
    public void K() {
        pv1 pv1Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        m().z0(this);
        ScheduledExecutorService newSingleThreadScheduledExecutor = VExecutors.newSingleThreadScheduledExecutor(new n());
        ckf.f(newSingleThreadScheduledExecutor, "override fun initViews()…    }\n      }))\n    }\n  }");
        this.w = newSingleThreadScheduledExecutor;
        this.v = new m43();
        b8m.INSTANCE.c();
        if (m().h()) {
            Activity activity = this.c;
            ckf.f(activity, "activity");
            pv1Var = new e63(activity, this);
        } else {
            Activity activity2 = this.c;
            ckf.f(activity2, "activity");
            pv1Var = new d63(activity2, this);
        }
        this.m = pv1Var;
        pv1Var.T();
        Activity activity3 = this.c;
        ckf.f(activity3, "activity");
        this.l = new k53(activity3, this);
        View findViewById = I().findViewById(R.id.fl_smart_debug_container);
        ckf.f(findViewById, "getActivity().findViewBy…fl_smart_debug_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        if (caa.q()) {
            Activity activity4 = this.c;
            ckf.f(activity4, "activity");
            this.B = new p53(activity4, this, frameLayout);
        }
        Activity activity5 = this.c;
        ckf.f(activity5, "activity");
        this.o = new t63(activity5, this);
        Activity activity6 = this.c;
        ckf.f(activity6, "activity");
        this.n = new d73(activity6, this);
        Activity activity7 = this.c;
        ckf.f(activity7, "activity");
        this.p = new l73(activity7, this);
        Activity activity8 = this.c;
        ckf.f(activity8, "activity");
        this.q = new y63(activity8, this);
        Activity activity9 = this.c;
        ckf.f(activity9, "activity");
        this.r = new g63(activity9, this);
        m().w0((ViewGroup) I().findViewById(R.id.fl_intelli));
        m().e0(new o());
        t0();
        if (u0()) {
            CaptureBottomAreaView m0 = m0();
            this.u = m0;
            if (m0 == null) {
                this.A = new pi2(0, true, null, false);
            }
        }
        if (!this.z) {
            i0(new zso(p().getInitScene(), null), true);
        }
        ScheduledExecutorService scheduledExecutorService = this.w;
        if (scheduledExecutorService != null) {
            p pVar = new p();
            Long i2 = lg4.i2();
            ckf.f(i2, "getDynamicCaptureLoadTimeLimit()");
            this.x = scheduledExecutorService.schedule(pVar, i2.longValue(), TimeUnit.MILLISECONDS);
            m().h0(new q());
            if (!Localization.o()) {
                o7.INSTANCE.i(new WeakReference<>(new r()));
                return;
            }
            return;
        }
        ckf.y("scheduledExecutorService");
        throw null;
    }

    @Override // tb.pdc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa7b794", new Object[]{this});
        } else if (!m().T()) {
            TLogTracker.f("Default", "HybridLoad", "{\"load\":\"success\"}");
            ScheduledFuture<?> scheduledFuture = this.x;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.x = null;
            }
            p7 p7Var = this.C;
            if (p7Var != null) {
                m().B().t(p7Var);
                this.C = null;
            }
            yfl yflVar = this.y;
            if (yflVar != null) {
                m().B().t(yflVar);
                m().c();
                this.y = null;
            }
            m43 m43Var = this.v;
            if (m43Var != null) {
                m43Var.b("PageMuiseLoad", p().getPssource(), true);
                m43 m43Var2 = this.v;
                if (m43Var2 != null) {
                    m43Var2.b("PageDowngrade", p().getPssource(), true);
                    if (m().O()) {
                        m().B().t(new h63());
                    }
                    hjb hjbVar = this.s;
                    if (hjbVar != null) {
                        hjbVar.r();
                        return;
                    }
                    return;
                }
                ckf.y("captureAvaRecord");
                throw null;
            }
            ckf.y("captureAvaRecord");
            throw null;
        }
    }

    public final void i0(zso zsoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc32bb9", new Object[]{this, zsoVar, new Boolean(z)});
            return;
        }
        ckf.g(zsoVar, "targetSceneConfig");
        this.z = true;
        String b2 = zsoVar.b();
        if (b2 == null) {
            b2 = "";
        }
        if (!vso.a(b2, z, m(), p().getPssource())) {
            p().setAssignRequestConfig(zsoVar.a());
            if (ckf.b(b2, l53.b.SCENE_AUTO_DETECT) || ckf.b(b2, l53.b.SCENE_META_SIGHT)) {
                p53 p53Var = this.B;
                if (p53Var != null) {
                    p53Var.T(true);
                }
            } else {
                p53 p53Var2 = this.B;
                if (p53Var2 != null) {
                    p53Var2.T(false);
                }
            }
            boolean b3 = vso.b(m().s(), b2);
            HashMap<String, b> hashMap = this.t;
            if (hashMap != null) {
                b bVar = hashMap.get(l53.b.a(b2));
                if (bVar != null) {
                    HashMap<String, b> hashMap2 = this.t;
                    if (hashMap2 != null) {
                        b bVar2 = hashMap2.get(l53.b.a(m().s()));
                        if (bVar2 != null) {
                            String s2 = m().s();
                            ckf.f(s2, "manager.currentScene");
                            bVar2.b(s2, b3);
                        }
                        HashMap<String, b> hashMap3 = this.t;
                        if (hashMap3 != null) {
                            b bVar3 = hashMap3.get(m().s());
                            if (bVar3 != null) {
                                String s3 = m().s();
                                ckf.f(s3, "manager.currentScene");
                                bVar3.b(s3, b3);
                            }
                            bVar.a(b2, b3);
                            return;
                        }
                        ckf.y("sceneCallbacks");
                        throw null;
                    }
                    ckf.y("sceneCallbacks");
                    throw null;
                }
                return;
            }
            ckf.y("sceneCallbacks");
            throw null;
        }
    }

    public final void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8612579", new Object[]{this});
            return;
        }
        k53 k53Var = this.l;
        if (k53Var != null) {
            k53Var.a0();
            String str = p73.f25916a;
            jzu.g(str, "cameraFlip", "pssource", p().getPssource());
            if (m().t() == 1) {
                jzu.i(str, "SelfTake", new String[0]);
                return;
            }
            return;
        }
        ckf.y("cameraView");
        throw null;
    }

    public final void y0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("397f7446", new Object[]{this, new Boolean(z)});
            return;
        }
        View findViewById = this.c.findViewById(R.id.view_jump_hint);
        if (findViewById != null) {
            if (z) {
                if (m().P()) {
                    findViewById.setVisibility(0);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "translationX", findViewById.getWidth(), 0.0f);
                    ofFloat.addListener(new s());
                    ofFloat.setDuration(50L);
                    ofFloat.start();
                }
            } else if (findViewById.getVisibility() != 8) {
                findViewById.setVisibility(8);
            }
        }
    }
}
