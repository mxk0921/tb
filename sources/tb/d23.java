package tb;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class d23 implements Camera.PreviewCallback, Camera.AutoFocusCallback, x9d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_PREFIX = "Camera1_";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f17509a;
    public volatile Camera b;
    public final HandlerThread f;
    public final Handler g;
    public final Handler h;
    public final j03 i;
    public volatile ivm j;
    public l7m k;
    public m7m l;
    public volatile byte[] m;
    public final boolean s;
    public SurfaceHolder t;
    public volatile boolean c = false;
    public volatile boolean d = false;
    public volatile boolean e = false;
    public boolean n = false;
    public Camera.Size o = null;
    public int p = -1;
    public volatile int q = 0;
    public int r = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$10");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d23.z(d23.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$11");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (d23.A(d23.this) != null) {
                try {
                    d23.A(d23.this).stopPreview();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;

        public c(boolean z) {
            this.c = z;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$12");
        }

        @Override // tb.zio
        public void c() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            d23 d23Var = d23.this;
            if (this.c) {
                str = "torch";
            } else {
                str = "off";
            }
            d23.q(d23Var, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements Comparator<Camera.Size> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("40f1fdcb", new Object[]{this, size, size2})).intValue();
            }
            return size.width - size2.width;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$14");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d23.y(d23.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Point c;

        public f(Point point) {
            this.c = point;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$15");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d23.r(d23.this, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int c;

        public g(int i) {
            this.c = i;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$17");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            Camera A = d23.A(d23.this);
            if (A != null) {
                try {
                    Camera.Parameters parameters = A.getParameters();
                    if (parameters != null) {
                        parameters.setZoom(this.c);
                        A.setParameters(parameters);
                    }
                } catch (Exception e) {
                    agh.r("PltCamera", "Camera1_CameraWrapper", agh.f("changeZoom", e));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d23.o(d23.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class i extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (d23.p(d23.this) != null) {
                d23.p(d23.this).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class j extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$3");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (d23.p(d23.this) != null) {
                d23.p(d23.this).c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class k extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$4");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (d23.p(d23.this) != null) {
                d23.p(d23.this).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class l extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float c;

        public l(float f) {
            this.c = f;
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$5");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d23.t(d23.this, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class m extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ q c;

        public m(q qVar) {
            this.c = qVar;
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$6");
        }

        @Override // tb.zio
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            } else {
                d23.v(d23.this, this.c, null, null, false);
            }
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d23.u(d23.this, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class n extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$7");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d23.w(d23.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class o extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ SurfaceHolder c;

        public o(SurfaceHolder surfaceHolder) {
            this.c = surfaceHolder;
        }

        public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$8");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d23.x(d23.this, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class p extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraWrapper$9");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d23.y(d23.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface q {
    }

    static {
        t2o.a(481296848);
        t2o.a(481296833);
    }

    public d23(Activity activity, boolean z) {
        HandlerThread handlerThread;
        this.f17509a = activity;
        this.s = z;
        if (lg4.n0()) {
            handlerThread = new HandlerThread("CameraWrapperThread" + hashCode());
        } else {
            handlerThread = wsa.a("CameraWrapperThread" + hashCode());
        }
        this.f = handlerThread;
        handlerThread.start();
        this.i = new j03();
        Handler handler = new Handler(handlerThread.getLooper());
        this.g = handler;
        handler.post(new h());
        this.h = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ Camera A(d23 d23Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera) ipChange.ipc$dispatch("6113100e", new Object[]{d23Var});
        }
        return d23Var.b;
    }

    public static int D(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81c9cf95", new Object[]{new Integer(i2), new Integer(i3)})).intValue();
        }
        if (Math.abs(i2) + i3 <= 1000) {
            return i2 - (i3 / 2);
        }
        if (i2 > 0) {
            return 1000 - i3;
        }
        return i3 - 1000;
    }

    public static Point F(Camera.Parameters parameters) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("1cc6319", new Object[]{parameters});
        }
        int i3 = 1280;
        int i4 = 720;
        if (parameters == null) {
            return new Point(1280, 720);
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null || supportedPreviewSizes.isEmpty()) {
            return new Point(1280, 720);
        }
        Collections.sort(supportedPreviewSizes, new d());
        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = 720;
                break;
            }
            Camera.Size next = it.next();
            int i5 = next.width;
            if (i5 >= 1280) {
                i2 = next.height;
                i3 = i5;
                break;
            }
        }
        if (i2 <= 720) {
            i4 = i2;
        }
        return new Point(i3, i4);
    }

    public static /* synthetic */ j03 o(d23 d23Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j03) ipChange.ipc$dispatch("b92c52e1", new Object[]{d23Var});
        }
        return d23Var.i;
    }

    public static /* synthetic */ l7m p(d23 d23Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l7m) ipChange.ipc$dispatch("c18a2126", new Object[]{d23Var});
        }
        return d23Var.k;
    }

    public static /* synthetic */ void q(d23 d23Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95df0ed", new Object[]{d23Var, str});
        } else {
            d23Var.P(str);
        }
    }

    public static /* synthetic */ void r(d23 d23Var, Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b2cc65", new Object[]{d23Var, point});
        } else {
            d23Var.I(point);
        }
    }

    public static /* synthetic */ void s(d23 d23Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f4ffa1", new Object[]{d23Var});
        } else {
            d23Var.E();
        }
    }

    public static /* synthetic */ void t(d23 d23Var, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308138d0", new Object[]{d23Var, new Float(f2)});
        } else {
            d23Var.V(f2);
        }
    }

    public static /* synthetic */ void u(d23 d23Var, q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536d5edb", new Object[]{d23Var, qVar});
        } else {
            d23Var.T(qVar);
        }
    }

    public static /* synthetic */ void v(d23 d23Var, q qVar, byte[] bArr, Camera camera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6519f5c2", new Object[]{d23Var, qVar, bArr, camera, new Boolean(z)});
        } else {
            d23Var.J(qVar, bArr, camera, z);
        }
    }

    public static /* synthetic */ void w(d23 d23Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263bc58d", new Object[]{d23Var});
        } else {
            d23Var.K();
        }
    }

    public static /* synthetic */ void x(d23 d23Var, SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02cb3ec", new Object[]{d23Var, surfaceHolder});
        } else {
            d23Var.S(surfaceHolder);
        }
    }

    public static /* synthetic */ void y(d23 d23Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a86b4b", new Object[]{d23Var});
        } else {
            d23Var.N();
        }
    }

    public static /* synthetic */ void z(d23 d23Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29debe2a", new Object[]{d23Var});
        } else {
            d23Var.U();
        }
    }

    public final Rect B(float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("d55ab618", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
        }
        int intValue = Float.valueOf(300 * f4).intValue();
        int D = D(Float.valueOf(((f3 / caa.k(this.f17509a)) * 2000.0f) - 1000.0f).intValue(), intValue);
        int D2 = D(Float.valueOf((((caa.m(this.f17509a) - f2) / caa.m(this.f17509a)) * 2000.0f) - 1000.0f).intValue(), intValue);
        return new Rect(D, D2, D + intValue, intValue + D2);
    }

    public final boolean C(float f2, boolean z) {
        Camera camera;
        Camera.Parameters parameters;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1918f42", new Object[]{this, new Float(f2), new Boolean(z)})).booleanValue();
        }
        if (this.b == null || (camera = this.b) == null) {
            return false;
        }
        int max = Math.max(Math.min(Math.round(G(camera) * f2), G(camera)), 0);
        try {
            parameters = camera.getParameters();
        } catch (Exception e2) {
            agh.r("PltCamera", "Camera1_CameraWrapper", agh.f("changeZoom", e2));
        }
        if (!z || !parameters.isSmoothZoomSupported()) {
            if (parameters != null && parameters.isZoomSupported()) {
                parameters.setZoom(max);
                camera.setParameters(parameters);
                return true;
            }
            return false;
        }
        camera.startSmoothZoom(max);
        return true;
    }

    public final synchronized void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305816ef", new Object[]{this});
            return;
        }
        Camera camera = this.b;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Exception unused) {
            }
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFocusAreas(null);
            parameters.setMeteringAreas(null);
            if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                parameters.setFocusMode("continuous-picture");
            }
            try {
                camera.setParameters(parameters);
            } catch (Exception e2) {
                agh.r("PltCamera", "Camera1_CameraWrapper", agh.f("failed to set parameters.", e2));
            }
        }
    }

    public final int G(Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee4b1160", new Object[]{this, camera})).intValue();
        }
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null || !parameters.isZoomSupported()) {
            return -1;
        }
        return parameters.getMaxZoom();
    }

    public final Point H(Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("cb21534", new Object[]{this, camera});
        }
        Camera.Parameters parameters = camera.getParameters();
        caa.m(this.f17509a);
        caa.k(this.f17509a);
        Point F = F(parameters);
        String str = Build.MODEL;
        if (str.contains("HTC") && str.contains("One")) {
            return new Point(1280, 720);
        }
        if (str.contains("GT-N7100")) {
            return new Point(1280, 720);
        }
        if (str.contains("M2-A01L")) {
            return new Point(1280, 720);
        }
        if (str.contains("JGS")) {
            return new Point(1280, 720);
        }
        if (str.contains("T1-A21L")) {
            return new Point(1280, 720);
        }
        if (str.contains("GT-I9300")) {
            return new Point(1280, 720);
        }
        return str.equals("u8800") ? new Point(720, 480) : F;
    }

    public final synchronized void I(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42579440", new Object[]{this, point});
            return;
        }
        Camera camera = this.b;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getMaxNumFocusAreas() <= 0) {
                try {
                    camera.autoFocus(this);
                } catch (Exception unused) {
                }
                return;
            }
            try {
                camera.cancelAutoFocus();
            } catch (Exception unused2) {
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Rect B = B(point.x, point.y, 1.0f);
            Rect B2 = B(point.x, point.y, 1.5f);
            arrayList.add(new Camera.Area(B, 1000));
            arrayList2.add(new Camera.Area(B2, 1000));
            parameters.setMeteringAreas(arrayList2);
            parameters.setFocusMode("auto");
            parameters.setFocusAreas(arrayList);
            try {
                camera.setParameters(parameters);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                camera.autoFocus(this);
            } catch (Exception unused3) {
            }
        }
    }

    public final void J(q qVar, byte[] bArr, Camera camera, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57675671", new Object[]{this, qVar, bArr, camera, new Boolean(z)});
        } else if (qVar != null) {
            if (camera == null) {
                ((rv8) qVar).g(bArr, 0, 0, 0, z);
                return;
            }
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            int i2 = previewSize.width;
            int i3 = previewSize.height;
            int m2 = m();
            agh.r("PltCamera", "Camera1_CameraWrapper", "--onTakePicture front=" + z + ", rotate=" + m2);
            ((rv8) qVar).g(bArr, i2, i3, m2, z);
        }
    }

    public final synchronized void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a340bd8b", new Object[]{this});
            return;
        }
        this.c = false;
        this.h.post(new j());
    }

    public final synchronized void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0f4e6b", new Object[]{this});
            return;
        }
        Camera camera = this.b;
        if (camera != null) {
            try {
                camera.setPreviewCallbackWithBuffer(null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                camera.release();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            this.b = null;
        }
        this.c = false;
        this.h.post(new k());
    }

    public final void O(Activity activity, boolean z, Camera camera) {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396aec4f", new Object[]{this, activity, new Boolean(z), camera});
            return;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(z ? 1 : 0, cameraInfo);
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i3 = 90;
            } else if (rotation == 2) {
                i3 = 180;
            } else if (rotation == 3) {
                i3 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            i2 = (360 - ((cameraInfo.orientation + i3) % 360)) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i3) + 360) % 360;
        }
        camera.setDisplayOrientation(i2);
    }

    public final synchronized void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1255ad5f", new Object[]{this, str});
            return;
        }
        Camera camera = this.b;
        if (camera != null) {
            if (!Build.MODEL.contains("G750")) {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters != null) {
                    List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                    if (supportedFlashModes != null && !supportedFlashModes.isEmpty()) {
                        if (supportedFlashModes.contains(str)) {
                            parameters.setFlashMode(str);
                            camera.setParameters(parameters);
                        }
                    }
                }
            }
        }
    }

    public final void Q(Camera.PreviewCallback previewCallback, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3d8747", new Object[]{this, previewCallback, new Integer(i2)});
            return;
        }
        Camera camera = this.b;
        if (camera != null) {
            if (previewCallback != null) {
                camera.addCallbackBuffer(new byte[i2]);
                camera.addCallbackBuffer(new byte[i2]);
                camera.addCallbackBuffer(new byte[i2]);
            }
            camera.setPreviewCallbackWithBuffer(previewCallback);
        }
    }

    public final int R(Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a1e9ab", new Object[]{this, camera})).intValue();
        }
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        this.n = false;
        return ((previewSize.width * previewSize.height) * 3) / 2;
    }

    public final synchronized void S(SurfaceHolder surfaceHolder) {
        Camera camera;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d0176a", new Object[]{this, surfaceHolder});
            return;
        }
        try {
            if (this.s) {
                this.t = surfaceHolder;
            }
            camera = this.b;
        } catch (Exception e2) {
            agh.r("PltCamera", "Camera1_CameraWrapper", agh.f("startPreviewInternal error", e2));
        }
        if (camera != null) {
            long currentTimeMillis = System.currentTimeMillis();
            camera.setPreviewDisplay(surfaceHolder);
            camera.startPreview();
            n73.q();
            agh.r("PltCamera", "Camera1_CameraWrapper", "startPreviewInternal cost:" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public final synchronized void T(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17b174f", new Object[]{this, qVar});
            return;
        }
        if (this.n) {
            J(qVar, this.m, this.b, this.e);
        } else {
            J(qVar, null, null, this.e);
        }
    }

    public final synchronized void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf15638", new Object[]{this});
        } else if (this.i.a() > 1) {
            this.d = true ^ this.d;
            this.i.f(this.d);
            N();
            K();
        }
    }

    public final synchronized void V(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52c1e24", new Object[]{this, new Float(f2)});
        } else {
            C(f2, false);
        }
    }

    @Override // tb.x9d
    public void a(ivm ivmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3459ca90", new Object[]{this, ivmVar});
        } else {
            this.j = ivmVar;
        }
    }

    @Override // tb.x9d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2caba0", new Object[]{this});
        } else {
            this.g.post(new a());
        }
    }

    @Override // tb.x9d
    public void c(SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d763068d", new Object[]{this, surfaceHolder});
        } else {
            this.g.post(new o(surfaceHolder));
        }
    }

    @Override // tb.x9d
    public void closeCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a613d144", new Object[]{this});
        } else {
            this.g.post(new p());
        }
    }

    @Override // tb.x9d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa95b16", new Object[]{this});
        } else {
            this.g.post(new n());
        }
    }

    @Override // tb.x9d
    public synchronized void e(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bed910c", new Object[]{this, qVar});
        } else {
            this.g.post(new m(qVar));
        }
    }

    @Override // tb.x9d
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f09005da", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // tb.x9d
    public boolean g(int i2, int i3) {
        Camera.Parameters parameters;
        int G;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac6ba507", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        Camera camera = this.b;
        if (camera == null || (parameters = camera.getParameters()) == null || !parameters.isZoomSupported() || i2 < 0 || (G = G(camera)) < 0) {
            return false;
        }
        int min = Math.min((i2 * G) / 15, G);
        int zoom = parameters.getZoom();
        if (i3 == 1) {
            if (min <= zoom) {
                return false;
            }
        } else if (i3 == 2) {
            if (min >= zoom) {
                return false;
            }
        } else if (min == zoom) {
            return false;
        }
        this.g.post(new g(min));
        return true;
    }

    @Override // tb.x9d
    public void h(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3958e6c1", new Object[]{this, new Float(f2)});
        } else {
            this.g.post(new l(f2));
        }
    }

    @Override // tb.x9d
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c43c7b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            if (!this.d) {
                b();
            }
        } else if (this.d) {
            b();
        }
    }

    @Override // tb.x9d
    public boolean isOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e7ed3e", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.x9d
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956a51f3", new Object[]{this, new Boolean(z)});
        } else {
            this.g.post(new c(z));
        }
    }

    @Override // tb.x9d
    public void k(m7m m7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8ed454", new Object[]{this, m7mVar});
        } else {
            this.l = m7mVar;
        }
    }

    @Override // tb.x9d
    public void l(l7m l7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb1c654", new Object[]{this, l7mVar});
        } else {
            this.k = l7mVar;
        }
    }

    @Override // tb.x9d
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e185dba4", new Object[]{this})).intValue();
        }
        if (!lg4.g4()) {
            return 0;
        }
        if (this.r < 0) {
            this.r = s13.a(this.f17509a);
        }
        return this.r;
    }

    @Override // tb.x9d
    public void n(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cdc2edc", new Object[]{this, point});
        } else {
            this.g.post(new f(point));
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedbc0d2", new Object[]{this, new Boolean(z), camera});
        } else if (!z) {
            agh.b("Camera1_CameraWrapper", "failed to onAutoFocus", new Object[0]);
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public synchronized void onPreviewFrame(byte[] bArr, Camera camera) {
        byte[] bArr2;
        ivm ivmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a13143", new Object[]{this, bArr, camera});
        } else if (this.c) {
            if (bArr != null && camera != null && this.q > 0) {
                try {
                    if (this.o == null) {
                        this.o = camera.getParameters().getPreviewSize();
                    }
                    if (this.p <= 0) {
                        this.p = camera.getParameters().getPreviewFormat();
                    }
                    int i2 = this.q;
                    bArr2 = new byte[i2];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    this.m = bArr2;
                    this.n = true;
                    camera.addCallbackBuffer(bArr);
                    ivmVar = this.j;
                } catch (Exception e2) {
                    agh.r("PltCamera", "Camera1_CameraWrapper", agh.f("frame preview error", e2));
                }
                if (ivmVar != null) {
                    Camera.Size size = this.o;
                    ivmVar.h(bArr2, size.width, size.height, this.p, this.e, m());
                }
            }
        }
    }

    @Override // tb.x9d
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        agh.h("Camera1_CameraWrapper", "release");
        this.g.post(new e());
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    @Override // tb.x9d
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
        } else {
            this.g.post(new b());
        }
    }

    public final synchronized void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138cd073", new Object[]{this});
        } else if (!this.c) {
            mzu.n(p73.f25916a, "tryOpenCamera", 19999, new String[0]);
            agh.r("PltCamera", "Camera1_CameraWrapper", "tryOpenCamera");
            this.b = this.i.e(500, 1000);
            Camera camera = this.b;
            if (camera == null) {
                agh.r("PltCamera", "Camera1_CameraWrapper", "open failed");
                L();
                return;
            }
            agh.r("PltCamera", "Camera1_CameraWrapper", "open success");
            this.e = this.i.c();
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                parameters.setFocusMode("continuous-picture");
            }
            Point H = H(camera);
            parameters.setPreviewFormat(17);
            parameters.setPreviewSize(H.x, H.y);
            if (lg4.J()) {
                parameters.setWhiteBalance("auto");
            }
            if (parameters.isZoomSupported()) {
                parameters.setZoom(0);
            }
            camera.setParameters(parameters);
            O(this.f17509a, this.d, camera);
            this.q = R(camera);
            Q(this, this.q);
            M();
        }
    }

    public final synchronized void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bed25bd", new Object[]{this});
            return;
        }
        this.c = true;
        mzu.n(p73.f25916a, "openCameraSuccess", 19999, new String[0]);
        Camera.Size previewSize = this.b.getParameters().getPreviewSize();
        int i2 = previewSize.width;
        int i3 = previewSize.height;
        this.h.post(new i());
        m7m m7mVar = this.l;
        if (m7mVar != null) {
            m7mVar.a(i2, i3);
        }
        if (this.s && this.t != null) {
            agh.h("Camera1_CameraWrapper", "prepare startPreviewInternal");
            S(this.t);
        }
    }
}
