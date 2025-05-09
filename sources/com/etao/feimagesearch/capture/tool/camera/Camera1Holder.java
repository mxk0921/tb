package com.etao.feimagesearch.capture.tool.camera;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import android.view.SurfaceHolder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Pair;
import tb.c04;
import tb.c2a;
import tb.caa;
import tb.ckf;
import tb.elb;
import tb.j03;
import tb.lg4;
import tb.n73;
import tb.njg;
import tb.t2o;
import tb.w1a;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Camera1Holder extends BaseCameraHolder implements Camera.PreviewCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile Camera l;
    public volatile byte[] n;
    public volatile boolean o;
    public volatile int p;
    public final njg m = kotlin.a.b(Camera1Holder$mCameraOpener$2.INSTANCE);
    public final njg q = kotlin.a.b(Camera1Holder$cameraOperateHandler$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a<T> implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a<T> INSTANCE = new a<>();

        /* renamed from: a */
        public final int compare(Camera.Size size, Camera.Size size2) {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("40f1fdcb", new Object[]{this, size, size2})).intValue();
            }
            if (size == null) {
                i = 0;
            } else {
                i = size.width;
            }
            if (size2 != null) {
                i2 = size2.width;
            }
            return i - i2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Camera1Holder.C(Camera1Holder.this).a() > 1) {
                Camera1Holder camera1Holder = Camera1Holder.this;
                camera1Holder.w(!camera1Holder.n());
                Camera1Holder.C(Camera1Holder.this).f(Camera1Holder.this.n());
                Camera1Holder.this.o(false);
                Camera1Holder.this.o(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Camera1Holder camera1Holder = Camera1Holder.this;
            Camera1Holder.H(camera1Holder, Camera1Holder.C(camera1Holder).e(500, 1000));
            Camera B = Camera1Holder.B(Camera1Holder.this);
            if (B == null) {
                elb f = Camera1Holder.this.f();
                if (f != null) {
                    f.h(false, "failed");
                    return;
                }
                return;
            }
            Camera1Holder camera1Holder2 = Camera1Holder.this;
            camera1Holder2.w(Camera1Holder.C(camera1Holder2).c());
            Camera.Parameters parameters = B.getParameters();
            if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
                parameters.setFocusMode("continuous-picture");
            }
            Point D = Camera1Holder.D(Camera1Holder.this, B);
            Camera1Holder.this.s(new Size(D.x, D.y));
            parameters.setPreviewFormat(17);
            parameters.setPreviewSize(D.x, D.y);
            if (lg4.J()) {
                parameters.setWhiteBalance("auto");
            }
            if (parameters.isZoomSupported()) {
                parameters.setZoom(0);
            }
            B.setParameters(parameters);
            Camera1Holder camera1Holder3 = Camera1Holder.this;
            Camera1Holder.E(camera1Holder3, camera1Holder3.b(), Camera1Holder.this.n(), B);
            Camera.Size previewSize = B.getParameters().getPreviewSize();
            Camera1Holder.F(Camera1Holder.this, ((previewSize.width * previewSize.height) * 3) / 2);
            Camera1Holder.G(Camera1Holder.this, false);
            Camera1Holder camera1Holder4 = Camera1Holder.this;
            Camera1Holder.I(camera1Holder4, camera1Holder4, Camera1Holder.A(camera1Holder4));
            elb f2 = Camera1Holder.this.f();
            if (f2 != null) {
                f2.f(Camera1Holder.this.c());
            }
            elb f3 = Camera1Holder.this.f();
            if (f3 != null) {
                f3.h(true, "");
            }
            Camera1Holder.this.u(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public d(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Camera.Parameters parameters;
            List<String> supportedFlashModes;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Camera B = Camera1Holder.B(Camera1Holder.this);
            if (B != null) {
                String str2 = Build.MODEL;
                ckf.f(str2, "model");
                if (!wsq.O(str2, "G750", false, 2, null) && (parameters = B.getParameters()) != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !supportedFlashModes.isEmpty()) {
                    if (this.b) {
                        str = "torch";
                    } else {
                        str = "off";
                    }
                    if (supportedFlashModes.contains(str)) {
                        parameters.setFlashMode(str);
                        B.setParameters(parameters);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ SurfaceHolder c;

        public e(boolean z, SurfaceHolder surfaceHolder) {
            this.b = z;
            this.c = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Object k = Camera1Holder.this.k();
            boolean z = this.b;
            Camera1Holder camera1Holder = Camera1Holder.this;
            SurfaceHolder surfaceHolder = this.c;
            synchronized (k) {
                if (z) {
                    if (!camera1Holder.m()) {
                        if (surfaceHolder != null) {
                            Camera B = Camera1Holder.B(camera1Holder);
                            if (B != null) {
                                try {
                                    System.currentTimeMillis();
                                    B.setPreviewDisplay(surfaceHolder);
                                    B.startPreview();
                                    camera1Holder.v(true);
                                    n73.q();
                                } catch (Exception unused) {
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (camera1Holder.m()) {
                    Camera B2 = Camera1Holder.B(camera1Holder);
                    if (B2 != null) {
                        B2.stopPreview();
                    }
                    camera1Holder.v(false);
                } else {
                    return;
                }
                xhv xhvVar = xhv.INSTANCE;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ w1a<Bitmap, Boolean, Boolean, xhv> b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(w1a<? super Bitmap, ? super Boolean, ? super Boolean, xhv> w1aVar) {
            this.b = w1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmap;
            Boolean bool;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Pair z2 = Camera1Holder.z(Camera1Holder.this);
            w1a<Bitmap, Boolean, Boolean, xhv> w1aVar = this.b;
            if (z2 == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) z2.getSecond();
            }
            if (!(z2 == null || (bool = (Boolean) z2.getFirst()) == null)) {
                z = bool.booleanValue();
            }
            w1aVar.invoke(bitmap, Boolean.valueOf(z), Boolean.valueOf(Camera1Holder.this.n()));
        }
    }

    static {
        t2o.a(481296808);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera1Holder(Activity activity, elb elbVar, c2a<? super byte[], ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super Integer, xhv> c2aVar) {
        super(activity, elbVar, c2aVar);
        ckf.g(activity, "activity");
    }

    public static final /* synthetic */ int A(Camera1Holder camera1Holder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6e2c960", new Object[]{camera1Holder})).intValue();
        }
        return camera1Holder.p;
    }

    public static final /* synthetic */ Camera B(Camera1Holder camera1Holder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Camera) ipChange.ipc$dispatch("d1aeeeb6", new Object[]{camera1Holder});
        }
        return camera1Holder.l;
    }

    public static final /* synthetic */ j03 C(Camera1Holder camera1Holder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j03) ipChange.ipc$dispatch("a166d497", new Object[]{camera1Holder});
        }
        return camera1Holder.M();
    }

    public static final /* synthetic */ Point D(Camera1Holder camera1Holder, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("e369996", new Object[]{camera1Holder, camera});
        }
        return camera1Holder.N(camera);
    }

    public static final /* synthetic */ void E(Camera1Holder camera1Holder, Activity activity, boolean z, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f9e331", new Object[]{camera1Holder, activity, new Boolean(z), camera});
        } else {
            camera1Holder.O(activity, z, camera);
        }
    }

    public static final /* synthetic */ void F(Camera1Holder camera1Holder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b617242", new Object[]{camera1Holder, new Integer(i)});
        } else {
            camera1Holder.p = i;
        }
    }

    public static final /* synthetic */ void G(Camera1Holder camera1Holder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d249ae", new Object[]{camera1Holder, new Boolean(z)});
        } else {
            camera1Holder.o = z;
        }
    }

    public static final /* synthetic */ void H(Camera1Holder camera1Holder, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45507610", new Object[]{camera1Holder, camera});
        } else {
            camera1Holder.l = camera;
        }
    }

    public static final /* synthetic */ void I(Camera1Holder camera1Holder, Camera.PreviewCallback previewCallback, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be12aea9", new Object[]{camera1Holder, previewCallback, new Integer(i)});
        } else {
            camera1Holder.P(previewCallback, i);
        }
    }

    public static /* synthetic */ Object ipc$super(Camera1Holder camera1Holder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/camera/Camera1Holder");
    }

    public static final /* synthetic */ Pair z(Camera1Holder camera1Holder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ecc71d5e", new Object[]{camera1Holder});
        }
        return camera1Holder.J();
    }

    public final Point K(Camera.Parameters parameters) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("1cc6319", new Object[]{this, parameters});
        }
        int i2 = 1280;
        int i3 = 720;
        if (parameters == null) {
            return new Point(1280, 720);
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null || supportedPreviewSizes.isEmpty()) {
            return new Point(1280, 720);
        }
        c04.u(supportedPreviewSizes, a.INSTANCE);
        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 720;
                break;
            }
            Camera.Size next = it.next();
            int i4 = next.width;
            if (i4 >= 1280) {
                i = next.height;
                i2 = i4;
                break;
            }
        }
        if (i <= 720) {
            i3 = i;
        }
        return new Point(i2, i3);
    }

    public final Handler L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cfabd19e", new Object[]{this});
        }
        return (Handler) this.q.getValue();
    }

    public final j03 M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j03) ipChange.ipc$dispatch("f68064b9", new Object[]{this});
        }
        return (j03) this.m.getValue();
    }

    public final void O(Activity activity, boolean z, Camera camera) {
        int i;
        int i2 = 0;
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
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            i = (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        } else {
            i = ((cameraInfo.orientation - i2) + 360) % 360;
        }
        camera.setDisplayOrientation(i);
    }

    public final void P(Camera.PreviewCallback previewCallback, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3d8747", new Object[]{this, previewCallback, new Integer(i)});
            return;
        }
        Camera camera = this.l;
        if (camera != null) {
            if (previewCallback != null) {
                camera.addCallbackBuffer(new byte[i]);
                camera.addCallbackBuffer(new byte[i]);
                camera.addCallbackBuffer(new byte[i]);
            }
            camera.setPreviewCallbackWithBuffer(previewCallback);
        }
    }

    @Override // com.etao.feimagesearch.capture.tool.camera.BaseCameraHolder
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c43c7b", new Object[]{this, new Boolean(z)});
        } else if (z && n()) {
        } else {
            if (z || n()) {
                L().post(new b());
            }
        }
    }

    @Override // com.etao.feimagesearch.capture.tool.camera.BaseCameraHolder
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a36f04", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            if (l()) {
                Camera camera = this.l;
                if (camera != null) {
                    camera.setPreviewCallbackWithBuffer(null);
                    camera.release();
                }
                elb f2 = f();
                if (f2 != null) {
                    f2.b();
                }
                this.l = null;
                u(false);
            }
        } else if (!l()) {
            d().post(new c());
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    @Deprecated(message = "Deprecated in Java")
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a13143", new Object[]{this, bArr, camera});
            return;
        }
        if (l() && bArr != null && camera != null && this.p > 0) {
            try {
                int i = this.p;
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.n = bArr2;
                this.o = true;
                camera.addCallbackBuffer(bArr);
                c2a<byte[], Integer, Integer, Integer, Boolean, Integer, xhv> i2 = i();
                if (i2 != null) {
                    i2.invoke(bArr2, Integer.valueOf(c().getWidth()), Integer.valueOf(c().getHeight()), Integer.valueOf(camera.getParameters().getPreviewFormat()), Boolean.valueOf(n()), Integer.valueOf(h()));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.etao.feimagesearch.capture.tool.camera.BaseCameraHolder
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae5ddc3", new Object[]{this, new Boolean(z)});
            return;
        }
        t(z);
        L().post(new d(z));
    }

    @Override // com.etao.feimagesearch.capture.tool.camera.BaseCameraHolder
    public void q(boolean z, SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ff6e09", new Object[]{this, new Boolean(z), surfaceHolder});
        } else {
            r(new e(z, surfaceHolder));
        }
    }

    @Override // com.etao.feimagesearch.capture.tool.camera.BaseCameraHolder
    public void x(w1a<? super Bitmap, ? super Boolean, ? super Boolean, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d9db76", new Object[]{this, w1aVar});
        } else if (w1aVar != null) {
            L().post(new f(w1aVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (tb.ipe.d(r2, c().getWidth(), c().getHeight(), 40) == 1) goto L_0x003b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair<java.lang.Boolean, android.graphics.Bitmap> J() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.etao.feimagesearch.capture.tool.camera.Camera1Holder.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "6aa6a83c"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            kotlin.Pair r0 = (kotlin.Pair) r0
            return r0
        L_0x0015:
            boolean r2 = r7.o
            r3 = 0
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            byte[] r2 = r7.n
            if (r2 != 0) goto L_0x0020
            return r3
        L_0x0020:
            android.util.Size r3 = r7.c()     // Catch: all -> 0x0039
            int r3 = r3.getWidth()     // Catch: all -> 0x0039
            android.util.Size r4 = r7.c()     // Catch: all -> 0x0039
            int r4 = r4.getHeight()     // Catch: all -> 0x0039
            r5 = 40
            int r3 = tb.ipe.d(r2, r3, r4, r5)     // Catch: all -> 0x0039
            if (r3 != r1) goto L_0x003a
            goto L_0x003b
        L_0x0039:
        L_0x003a:
            r1 = 0
        L_0x003b:
            android.util.Size r3 = r7.c()
            int r3 = r3.getWidth()
            android.util.Size r4 = r7.c()
            int r4 = r4.getHeight()
            int r5 = r7.h()
            boolean r6 = r7.n()
            tb.bs6$c r2 = tb.bs6.a(r2, r3, r4, r5, r6)
            if (r2 == 0) goto L_0x0084
            tb.bs6$b r2 = (tb.bs6.b) r2
            android.util.Size r3 = r7.j()
            if (r3 != 0) goto L_0x0063
            r3 = 0
            goto L_0x0067
        L_0x0063:
            int r3 = r3.getWidth()
        L_0x0067:
            android.util.Size r4 = r7.j()
            if (r4 != 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            int r0 = r4.getHeight()
        L_0x0072:
            tb.bs6$d r0 = r2.b(r3, r0)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            android.graphics.Bitmap r0 = r0.a()
            r2.<init>(r1, r0)
            return r2
        L_0x0084:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type com.etao.feimagesearch.util.DataProjector.CamDataInput"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.capture.tool.camera.Camera1Holder.J():kotlin.Pair");
    }

    public final Point N(Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("cb21534", new Object[]{this, camera});
        }
        Camera.Parameters parameters = camera.getParameters();
        caa.m(b());
        caa.k(b());
        Point K = K(parameters);
        String str = Build.MODEL;
        ckf.f(str, "model");
        if (wsq.O(str, "HTC", false, 2, null) && wsq.O(str, "One", false, 2, null)) {
            return new Point(1280, 720);
        }
        if (wsq.O(str, "GT-N7100", false, 2, null)) {
            return new Point(1280, 720);
        }
        if (wsq.O(str, "M2-A01L", false, 2, null)) {
            return new Point(1280, 720);
        }
        if (wsq.O(str, "JGS", false, 2, null)) {
            return new Point(1280, 720);
        }
        if (wsq.O(str, "T1-A21L", false, 2, null)) {
            return new Point(1280, 720);
        }
        if (wsq.O(str, "GT-I9300", false, 2, null)) {
            return new Point(1280, 720);
        }
        return ckf.b(str, "u8800") ? new Point(720, 480) : K;
    }
}
