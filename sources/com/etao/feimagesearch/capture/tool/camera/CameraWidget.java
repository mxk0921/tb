package com.etao.feimagesearch.capture.tool.camera;

import android.app.Activity;
import android.util.Size;
import android.view.SurfaceHolder;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.base.CaptureManager;
import com.etao.feimagesearch.cip.camera.AutoFitSurfaceView;
import com.etao.feimagesearch.struct.ViewWidget;
import com.taobao.taobao.R;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import tb.a23;
import tb.agh;
import tb.c23;
import tb.c2a;
import tb.caa;
import tb.ckf;
import tb.clb;
import tb.elb;
import tb.j53;
import tb.kl7;
import tb.lg4;
import tb.r73;
import tb.t2o;
import tb.t4p;
import tb.u7m;
import tb.w13;
import tb.xfw;
import tb.xhv;
import tb.y13;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CameraWidget extends ViewWidget<AutoFitSurfaceView, CaptureManager, CameraWidget> implements elb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile CaptureManager l;
    public c2a<? super byte[], ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super Integer, xhv> m;
    public volatile BaseCameraHolder n;
    public volatile boolean o;
    public SurfaceHolder p;
    public volatile long q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseCameraHolder h0 = CameraWidget.h0(CameraWidget.this);
            if (h0 != null) {
                h0.q(true, CameraWidget.i0(CameraWidget.this));
            } else {
                ckf.y("cameraHolder");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Size b;

        public b(Size size) {
            this.b = size;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AutoFitSurfaceView X = CameraWidget.this.X();
            if (X != null) {
                X.setAspectRatio(this.b.getWidth(), this.b.getHeight(), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements SurfaceHolder.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ AutoFitSurfaceView b;

        public c(AutoFitSurfaceView autoFitSurfaceView) {
            this.b = autoFitSurfaceView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                ckf.g(surfaceHolder, "holder");
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
                return;
            }
            ckf.g(surfaceHolder, "holder");
            BaseCameraHolder h0 = CameraWidget.h0(CameraWidget.this);
            if (h0 != null) {
                h0.y(new Size(this.b.getRootView().getWidth(), this.b.getRootView().getHeight()));
                CameraWidget.l0(CameraWidget.this, true);
                CameraWidget.k0(CameraWidget.this, surfaceHolder);
                CameraWidget.this.o0();
                return;
            }
            ckf.y("cameraHolder");
            throw null;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
                return;
            }
            ckf.g(surfaceHolder, "holder");
            BaseCameraHolder h0 = CameraWidget.h0(CameraWidget.this);
            if (h0 != null) {
                h0.q(false, surfaceHolder);
                BaseCameraHolder h02 = CameraWidget.h0(CameraWidget.this);
                if (h02 != null) {
                    h02.o(false);
                    CameraWidget.l0(CameraWidget.this, false);
                    return;
                }
                ckf.y("cameraHolder");
                throw null;
            }
            ckf.y("cameraHolder");
            throw null;
        }
    }

    static {
        t2o.a(481296817);
        t2o.a(481296828);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraWidget(Activity activity, Object obj, CaptureManager captureManager, xfw xfwVar, c2a<? super byte[], ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super Integer, xhv> c2aVar) {
        super(activity, obj, captureManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(captureManager, "captureManager");
        ckf.g(xfwVar, "viewSetter");
        ckf.g(c2aVar, "onFrameUpdate");
        this.l = captureManager;
        this.m = c2aVar;
        new Size(1280, 720);
    }

    public static final /* synthetic */ BaseCameraHolder h0(CameraWidget cameraWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCameraHolder) ipChange.ipc$dispatch("47b0ee17", new Object[]{cameraWidget});
        }
        return cameraWidget.n;
    }

    public static final /* synthetic */ SurfaceHolder i0(CameraWidget cameraWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceHolder) ipChange.ipc$dispatch("94845d1a", new Object[]{cameraWidget});
        }
        return cameraWidget.p;
    }

    public static /* synthetic */ Object ipc$super(CameraWidget cameraWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1794064906:
                super.M();
                return null;
            case 731174045:
                super.L();
                return null;
            case 1083424568:
                super.K();
                return null;
            case 1250151579:
                super.G();
                return null;
            case 1585798659:
                super.q((String) objArr[0], objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/camera/CameraWidget");
        }
    }

    public static final /* synthetic */ void j0(CameraWidget cameraWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d7939f", new Object[]{cameraWidget});
        } else {
            cameraWidget.p0();
        }
    }

    public static final /* synthetic */ void k0(CameraWidget cameraWidget, SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91618008", new Object[]{cameraWidget, surfaceHolder});
        } else {
            cameraWidget.p = surfaceHolder;
        }
    }

    public static final /* synthetic */ void l0(CameraWidget cameraWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9313af2", new Object[]{cameraWidget, new Boolean(z)});
        } else {
            cameraWidget.o = z;
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        super.G();
        this.n = new Camera1Holder(E(), this, (c2a) new MutablePropertyReference0Impl(this) { // from class: com.etao.feimagesearch.capture.tool.camera.CameraWidget$initWidgetAfterAllChildWidgetsAdded$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(CameraWidget$initWidgetAfterAllChildWidgetsAdded$1 cameraWidget$initWidgetAfterAllChildWidgetsAdded$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/camera/CameraWidget$initWidgetAfterAllChildWidgetsAdded$1");
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
            public Object get() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("6352d3f5", new Object[]{this});
                }
                return ((CameraWidget) this.receiver).m0();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
            public void set(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6236785", new Object[]{this, obj});
                } else {
                    ((CameraWidget) this.receiver).q0((c2a) obj);
                }
            }
        }.invoke());
        this.l.b().b(r73.EVENT_OPERATE_FLASH_LIGHT, this);
        this.l.b().b(r73.EVENT_FLIP_CAMERA, this);
        this.l.b().b("take_photo", this);
    }

    @Override // tb.vz
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
        } else {
            super.K();
        }
    }

    @Override // tb.vz
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
        } else {
            super.L();
        }
    }

    @Override // tb.vz
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
        } else {
            super.M();
        }
    }

    @Override // tb.elb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ceaf48", new Object[]{this});
        }
    }

    @Override // tb.elb
    public void f(Size size) {
        AutoFitSurfaceView X;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92297a9d", new Object[]{this, size});
        } else if (size != null && this.o && (X = X()) != null) {
            X.post(new b(size));
        }
    }

    @Override // tb.elb
    public void h(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35179aa", new Object[]{this, new Boolean(z), str});
        } else {
            e0(new a());
        }
    }

    public final c2a<byte[], Integer, Integer, Integer, Boolean, Integer, xhv> m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c2a) ipChange.ipc$dispatch("e461046f", new Object[]{this});
        }
        return this.m;
    }

    /* renamed from: n0 */
    public AutoFitSurfaceView b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoFitSurfaceView) ipChange.ipc$dispatch("d0312cf8", new Object[]{this});
        }
        AutoFitSurfaceView autoFitSurfaceView = new AutoFitSurfaceView(E(), null, 0, 6, null);
        autoFitSurfaceView.registerCallback(new c(autoFitSurfaceView));
        return autoFitSurfaceView;
    }

    public final void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6091ae", new Object[]{this});
        } else {
            kl7.a(E(), Localization.q(R.string.taobao_app_1007_title), lg4.M1(Localization.q(R.string.taobao_app_1007_1_content)), Localization.q(R.string.taobao_app_1007_1_18965), new a23(this), Localization.q(R.string.irp_error_message_cancel_text), c23.INSTANCE);
        }
    }

    public final void q0(c2a<? super byte[], ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super Integer, xhv> c2aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8352999d", new Object[]{this, c2aVar});
            return;
        }
        ckf.g(c2aVar, "<set-?>");
        this.m = c2aVar;
    }

    public final void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa95b16", new Object[]{this});
        } else if (u7m.e(E())) {
            BaseCameraHolder baseCameraHolder = this.n;
            if (baseCameraHolder != null) {
                baseCameraHolder.o(true);
            } else {
                ckf.y("cameraHolder");
                throw null;
            }
        } else {
            agh.r("PltCamera", j53.TAG, ckf.p("request camera permission isPermissionReqOptEnable=", Boolean.valueOf(lg4.w4())));
            com.taobao.runtimepermission.a.c(caa.c(), new String[]{t4p.CAMERA}).t("biz_image_search").A(new w13(this)).z(new y13(this)).x(true).w(Localization.q(R.string.feis_request_camera_explain)).y(lg4.t3()).m();
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.v9e
    public void q(String str, Object obj) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e855e03", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "action");
        super.q(str, obj);
        int hashCode = str.hashCode();
        if (hashCode != -778038150) {
            if (hashCode != -191243465) {
                if (hashCode == 736433612 && str.equals(r73.EVENT_OPERATE_FLASH_LIGHT)) {
                    BaseCameraHolder baseCameraHolder = this.n;
                    if (baseCameraHolder != null) {
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            z = bool.booleanValue();
                        }
                        baseCameraHolder.p(z);
                        return;
                    }
                    ckf.y("cameraHolder");
                    throw null;
                }
            } else if (str.equals(r73.EVENT_FLIP_CAMERA)) {
                BaseCameraHolder baseCameraHolder2 = this.n;
                if (baseCameraHolder2 != null) {
                    Boolean bool2 = (Boolean) obj;
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    }
                    baseCameraHolder2.a(z);
                    return;
                }
                ckf.y("cameraHolder");
                throw null;
            }
        } else if (str.equals("take_photo")) {
            if (Math.abs(System.currentTimeMillis() - this.q) < 1000) {
                agh.r("PltCamera", "CaptureCameraWidget", "takePicture too often");
            } else if (obj instanceof clb) {
                this.q = System.currentTimeMillis();
                BaseCameraHolder baseCameraHolder3 = this.n;
                if (baseCameraHolder3 != null) {
                    baseCameraHolder3.x(new CameraWidget$onViewEvent$1(this, obj));
                } else {
                    ckf.y("cameraHolder");
                    throw null;
                }
            }
        }
    }
}
