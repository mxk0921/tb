package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.camera.AutoFitSurfaceView;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.view.CameraZoomView;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class k53 extends d32<j53, yr3, CaptureManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public FrameLayout l;
    public ov8 m;
    public CameraZoomView n;
    public long o;
    public AutoFitSurfaceView p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296489);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ k53 c;
            public final /* synthetic */ CameraZoomView d;

            /* compiled from: Taobao */
            /* renamed from: tb.k53$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class C0964a implements CameraZoomView.c {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ k53 f22403a;

                public C0964a(k53 k53Var) {
                    this.f22403a = k53Var;
                }

                @Override // com.etao.feimagesearch.structure.capture.view.CameraZoomView.c
                public final void i(float f) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("c1eea957", new Object[]{this, new Float(f)});
                    } else {
                        this.f22403a.e0(f);
                    }
                }
            }

            public a(k53 k53Var, CameraZoomView cameraZoomView) {
                this.c = k53Var;
                this.d = cameraZoomView;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureCameraViewV2$initViews$2$runSafe$1$1");
            }

            @Override // tb.zio
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                ((FrameLayout) this.c.I().findViewById(R.id.root_layout)).addView(this.d, 1, new FrameLayout.LayoutParams(-1, -1));
                this.d.setCallback(new C0964a(this.c));
            }
        }

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureCameraViewV2$initViews$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            k53 k53Var = k53.this;
            CameraZoomView cameraZoomView = new CameraZoomView(k53.this.I());
            vpt.h("addZoomView", new a(k53.this, cameraZoomView), 1000L);
            k53.O(k53Var, cameraZoomView);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements qv8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ k53 c;
            public final /* synthetic */ Bitmap d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ boolean f;

            public a(k53 k53Var, Bitmap bitmap, boolean z, boolean z2) {
                this.c = k53Var;
                this.d = bitmap;
                this.e = z;
                this.f = z2;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureCameraViewV2$takePicture$tmpListener$1$onPictureTake$1");
            }

            @Override // tb.zio
            public void c() {
                qlb p;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                CaptureManager m = this.c.m();
                if (m != null && (p = m.p()) != null) {
                    p.j(this.d, this.e, this.f);
                }
            }
        }

        public c() {
        }

        @Override // tb.qv8
        public void a(Bitmap bitmap, boolean z, rv8 rv8Var, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a91cac83", new Object[]{this, bitmap, new Boolean(z), rv8Var, new Boolean(z2)});
                return;
            }
            mzu.n(p73.f25916a, "onPictureTake", 19999, new String[0]);
            if (!k53.N(k53.this).isFinishing()) {
                if (bitmap == null) {
                    agh.h("AutoSize_CaptureCameraViewV2", "snapshot or yuvImage is null");
                } else {
                    vpt.g("onCaptureFinished", new a(k53.this, bitmap, z, z2));
                }
            }
        }
    }

    static {
        t2o.a(481296488);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k53(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
        ckf.g(rccVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static final /* synthetic */ Activity N(k53 k53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("fd625e02", new Object[]{k53Var});
        }
        return k53Var.c;
    }

    public static final /* synthetic */ void O(k53 k53Var, CameraZoomView cameraZoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37dee254", new Object[]{k53Var, cameraZoomView});
        } else {
            k53Var.n = cameraZoomView;
        }
    }

    public static /* synthetic */ Object ipc$super(k53 k53Var, String str, Object... objArr) {
        if (str.hashCode() == -587316827) {
            super.F();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureCameraViewV2");
    }

    @Override // tb.d32
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfe41a5", new Object[]{this});
            return;
        }
        super.F();
        ov8 ov8Var = this.m;
        if (ov8Var != null) {
            ov8Var.o((ivm) this.f17536a);
        }
    }

    @Override // tb.d32
    public void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd45225", new Object[]{this, new Integer(i)});
            return;
        }
        agh.r("PltCamera", "AutoSize_CaptureCameraViewV2", ckf.p("execScreenChanged screenType=", Integer.valueOf(i)));
        j53 j53Var = (j53) this.f17536a;
        if (j53Var != null && j53Var.E()) {
            V();
            W();
        }
        FrameLayout R = R();
        AutoFitSurfaceView autoFitSurfaceView = this.p;
        if (autoFitSurfaceView != null) {
            if (autoFitSurfaceView.getParent() == R) {
                AutoFitSurfaceView autoFitSurfaceView2 = this.p;
                if (autoFitSurfaceView2 != null) {
                    R.removeView(autoFitSurfaceView2);
                } else {
                    ckf.y("surfaceView");
                    throw null;
                }
            }
            Activity activity = this.c;
            ckf.f(activity, "activity");
            this.p = new AutoFitSurfaceView(activity, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            AutoFitSurfaceView autoFitSurfaceView3 = this.p;
            if (autoFitSurfaceView3 != null) {
                autoFitSurfaceView3.setLayoutParams(layoutParams);
                AutoFitSurfaceView autoFitSurfaceView4 = this.p;
                if (autoFitSurfaceView4 != null) {
                    R.addView(autoFitSurfaceView4, new FrameLayout.LayoutParams(-1, -1));
                    Activity activity2 = this.c;
                    AutoFitSurfaceView autoFitSurfaceView5 = this.p;
                    if (autoFitSurfaceView5 != null) {
                        ov8 ov8Var = new ov8(activity2, R, autoFitSurfaceView5, m());
                        this.m = ov8Var;
                        ov8Var.o((ivm) this.f17536a);
                        j53 j53Var2 = (j53) this.f17536a;
                        if (j53Var2 != null) {
                            j53Var2.G();
                            j53Var2.v();
                            return;
                        }
                        return;
                    }
                    ckf.y("surfaceView");
                    throw null;
                }
                ckf.y("surfaceView");
                throw null;
            }
            ckf.y("surfaceView");
            throw null;
        }
        ckf.y("surfaceView");
        throw null;
    }

    @Override // tb.d32
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        View findViewById = I().findViewById(R.id.capture_camera_container);
        ckf.d(findViewById);
        Y((FrameLayout) findViewById);
        View findViewById2 = R().findViewById(R.id.camera_surface_view);
        ckf.f(findViewById2, "rootView.findViewById<Au…R.id.camera_surface_view)");
        this.p = (AutoFitSurfaceView) findViewById2;
        Activity activity = this.c;
        FrameLayout R = R();
        AutoFitSurfaceView autoFitSurfaceView = this.p;
        if (autoFitSurfaceView != null) {
            ov8 ov8Var = new ov8(activity, R, autoFitSurfaceView, m());
            ov8Var.o((ivm) this.f17536a);
            this.m = ov8Var;
            m().j(new b());
            return;
        }
        ckf.y("surfaceView");
        throw null;
    }

    /* renamed from: P */
    public j53 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j53) ipChange.ipc$dispatch("d983db63", new Object[]{this});
        }
        return new j53();
    }

    public final void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c43c7b", new Object[]{this, new Boolean(z)});
            return;
        }
        ov8 ov8Var = this.m;
        if (ov8Var != null) {
            m().x0(z);
            ov8Var.d(z);
            if (lg4.s1()) {
                c0();
            }
        }
    }

    public final FrameLayout R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    public final int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed8ac39c", new Object[]{this})).intValue();
        }
        ov8 ov8Var = this.m;
        if (ov8Var == null) {
            return 0;
        }
        return ov8Var.e();
    }

    public final int T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("964d2a65", new Object[]{this})).intValue();
        }
        ov8 ov8Var = this.m;
        if (ov8Var == null) {
            return 0;
        }
        return ov8Var.f();
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204a6724", new Object[]{this});
            return;
        }
        j53 j53Var = (j53) this.f17536a;
        if (j53Var != null) {
            j53Var.G();
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c2b3c2", new Object[]{this});
            return;
        }
        j53 j53Var = (j53) this.f17536a;
        if (j53Var != null) {
            j53Var.H();
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c11493", new Object[]{this});
            return;
        }
        ov8 ov8Var = this.m;
        if (ov8Var != null) {
            ov8Var.k();
        }
    }

    public final void Y(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76050b3", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.l = frameLayout;
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2caba0", new Object[]{this});
            return;
        }
        ov8 ov8Var = this.m;
        if (ov8Var != null) {
            m().x0(true ^ ov8Var.j());
            ov8Var.q();
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5b3150", new Object[]{this});
            return;
        }
        ov8 ov8Var = this.m;
        if (ov8Var != null) {
            ov8Var.n();
            ov8Var.l();
        }
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512a819d", new Object[]{this});
            return;
        }
        ov8 ov8Var = this.m;
        if (ov8Var != null && ov8Var.i()) {
            ov8Var.r();
            m().b0(false);
            mzu.i("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "5");
        }
    }

    public final void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc3eadf", new Object[]{this});
            return;
        }
        ov8 ov8Var = this.m;
        if (ov8Var != null && !ov8Var.i()) {
            jzu.i("PhotoSearchTake", "FlashLamp", new String[0]);
            ov8Var.s();
            m().b0(true);
            mzu.i("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "5");
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b83d39", new Object[]{this});
            return;
        }
        agh.h("AutoSize_CaptureCameraViewV2", "resumeCamera");
        ov8 ov8Var = this.m;
        if (ov8Var != null) {
            ov8Var.m();
        }
        CameraZoomView cameraZoomView = this.n;
        if (cameraZoomView != null) {
            cameraZoomView.reset();
            cameraZoomView.setVisibility(0);
        }
    }

    public final void e0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5faebc26", new Object[]{this, new Float(f)});
            return;
        }
        ov8 ov8Var = this.m;
        if (ov8Var != null && ov8Var.g()) {
            try {
                mzu.i("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "2");
                m().c0(true);
                ov8Var.t(f);
            } catch (Exception e) {
                agh.r("PltCamera", "AutoSize_CaptureCameraViewV2", agh.f("zoom", e));
            }
        }
    }

    public final void Z(qv8 qv8Var) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d81677", new Object[]{this, qv8Var});
            return;
        }
        agh.r("PltCamera", "AutoSize_CaptureCameraViewV2", "takePicture");
        if (Math.abs(System.currentTimeMillis() - this.o) < 1000) {
            if (qv8Var != null) {
                qv8Var.a(null, false, null, false);
            }
            agh.r("PltCamera", "AutoSize_CaptureCameraViewV2", "takePicture too often");
            return;
        }
        this.o = System.currentTimeMillis();
        if (qv8Var == null) {
            qv8Var = new c();
        }
        ov8 ov8Var = this.m;
        if (ov8Var == null) {
            xhvVar = null;
        } else {
            ov8Var.p(qv8Var, true, m().I());
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            qv8Var.a(null, false, null, false);
        }
    }
}
