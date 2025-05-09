package com.etao.feimagesearch.cip.camera2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.core.content.ContextCompat;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import tb.a07;
import tb.agh;
import tb.ast;
import tb.by2;
import tb.ckf;
import tb.cy2;
import tb.d23;
import tb.i04;
import tb.ic1;
import tb.ipe;
import tb.ivm;
import tb.l7m;
import tb.lg4;
import tb.m7m;
import tb.mzu;
import tb.p73;
import tb.rv8;
import tb.s13;
import tb.t2o;
import tb.t4p;
import tb.wsa;
import tb.x9d;
import tb.xhv;
import tb.yz3;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Camera2Wrapper implements x9d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IMAGE_BUFFER_SIZE = 1;
    public static final String TAG = "Camera2_Camera2Wrapper";
    public static final String TAG_PREFIX = "Camera2_";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4715a;
    public final Context b;
    public m7m c;
    public l7m d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public ivm h;
    public final CameraManager i;
    public final Handler j;
    public final HandlerThread k;
    public final Handler l;
    public volatile CameraOpenState m;
    public CameraDevice n;
    public CameraCharacteristics o;
    public String p;
    public CameraCaptureSession q;
    public SurfaceHolder r;
    public ImageReader s;
    public Size t;
    public final AtomicBoolean u;
    public CaptureRequest.Builder v;
    public cy2 w;
    public int x;
    public static final a Companion = new a(null);
    public static final Size y = new Size(1280, 720);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class CameraOpenState extends Enum<CameraOpenState> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final CameraOpenState IDLE = new CameraOpenState(Configuration.IDLE, 0);
        public static final CameraOpenState OPENING = new CameraOpenState("OPENING", 1);
        public static final CameraOpenState OPENED = new CameraOpenState("OPENED", 2);
        public static final CameraOpenState SESSION_CREATING = new CameraOpenState("SESSION_CREATING", 3);
        public static final CameraOpenState SESSION_CREATED = new CameraOpenState("SESSION_CREATED", 4);
        private static final /* synthetic */ CameraOpenState[] $VALUES = $values();

        private static final /* synthetic */ CameraOpenState[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CameraOpenState[]) ipChange.ipc$dispatch("4fcf6fb", new Object[0]) : new CameraOpenState[]{IDLE, OPENING, OPENED, SESSION_CREATING, SESSION_CREATED};
        }

        private CameraOpenState(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(CameraOpenState cameraOpenState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$CameraOpenState");
        }

        public static CameraOpenState valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("f277beb0", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(CameraOpenState.class, str);
            }
            return (CameraOpenState) valueOf;
        }

        public static CameraOpenState[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("80cd7c9f", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (CameraOpenState[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296877);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class b extends CameraCaptureSession.StateCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final CameraDevice f4716a;
        public final List<Surface> b;
        public final CameraCharacteristics c;
        public final /* synthetic */ Camera2Wrapper d;

        static {
            t2o.a(481296878);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Camera2Wrapper camera2Wrapper, CameraDevice cameraDevice, List<? extends Surface> list, CameraCharacteristics cameraCharacteristics) {
            ckf.g(camera2Wrapper, "this$0");
            ckf.g(cameraDevice, "camera");
            ckf.g(list, "surfaceList");
            ckf.g(cameraCharacteristics, "characteristics");
            this.d = camera2Wrapper;
            this.f4716a = cameraDevice;
            this.b = list;
            this.c = cameraCharacteristics;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$PltCameraSessionStateCallback");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e939a918", new Object[]{this, cameraCaptureSession});
                return;
            }
            ckf.g(cameraCaptureSession, MspGlobalDefine.SESSION);
            agh.r("PltCamera", Camera2Wrapper.TAG, ckf.p("onConfigureFailed ", Camera2Wrapper.v(this.d)));
            mzu.n(p73.f25916a, "onConfigureFailedCamera2", 19999, new String[0]);
            by2.a aVar = by2.Companion;
            Context s = Camera2Wrapper.s(this.d);
            ckf.f(s, "context");
            aVar.c(s, "onConfigureFailed");
            Camera2Wrapper.D(this.d);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f41541df", new Object[]{this, cameraCaptureSession});
                return;
            }
            ckf.g(cameraCaptureSession, MspGlobalDefine.SESSION);
            try {
                agh.r("PltCamera", Camera2Wrapper.TAG, ckf.p("onConfigured: ", Camera2Wrapper.v(this.d)));
                mzu.n(p73.f25916a, "onConfiguredCamera2", 19999, new String[0]);
                if (Camera2Wrapper.v(this.d) == CameraOpenState.SESSION_CREATING) {
                    Camera2Wrapper.I(this.d, CameraOpenState.SESSION_CREATED);
                    Camera2Wrapper.G(this.d, cameraCaptureSession);
                    Camera2Wrapper camera2Wrapper = this.d;
                    CaptureRequest.Builder createCaptureRequest = this.f4716a.createCaptureRequest(1);
                    Camera2Wrapper camera2Wrapper2 = this.d;
                    for (Surface surface : this.b) {
                        createCaptureRequest.addTarget(surface);
                    }
                    createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    if (((Boolean) this.c.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)) != null) {
                        agh.r("PltCamera", Camera2Wrapper.TAG, "setAutoFlash");
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    }
                    cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), null, Camera2Wrapper.A(camera2Wrapper2));
                    Camera2Wrapper.J(camera2Wrapper, createCaptureRequest);
                    return;
                }
                agh.r("PltCamera", Camera2Wrapper.TAG, ckf.p("onConfigured: openState ", Camera2Wrapper.v(this.d)));
            } catch (Exception e) {
                agh.r("PltCamera", Camera2Wrapper.TAG, agh.f("onConfigured:", e));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class c extends CameraDevice.StateCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final CameraCharacteristics f4717a;
        public final boolean b;
        public final /* synthetic */ Camera2Wrapper c;

        static {
            t2o.a(481296879);
        }

        public c(Camera2Wrapper camera2Wrapper, CameraCharacteristics cameraCharacteristics, boolean z) {
            ckf.g(camera2Wrapper, "this$0");
            ckf.g(cameraCharacteristics, "cameraCharacteristics");
            this.c = camera2Wrapper;
            this.f4717a = cameraCharacteristics;
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$PltCameraStateCallback");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18d0fcdc", new Object[]{this, cameraDevice});
                return;
            }
            ckf.g(cameraDevice, "camera");
            mzu.n(p73.f25916a, "onDisconnectedCamera2", 19999, new String[0]);
            agh.r("PltCamera", Camera2Wrapper.TAG, "onDisconnected");
            Camera2Wrapper.o(this.c);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfa2f4d6", new Object[]{this, cameraDevice, new Integer(i)});
                return;
            }
            ckf.g(cameraDevice, "camera");
            mzu.n(p73.f25916a, "onOpenErrorCamera2", 19999, new String[0]);
            agh.r("PltCamera", Camera2Wrapper.TAG, ckf.p("PltCameraStateCallback: onError ", Integer.valueOf(i)));
            Camera2Wrapper.I(this.c, CameraOpenState.IDLE);
            by2.a aVar = by2.Companion;
            Context s = Camera2Wrapper.s(this.c);
            ckf.f(s, "context");
            aVar.c(s, ckf.p("PltCameraStateCallback onError: ", Integer.valueOf(i)));
            Camera2Wrapper.D(this.c);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88acbeae", new Object[]{this, cameraDevice});
                return;
            }
            ckf.g(cameraDevice, "camera");
            mzu.n(p73.f25916a, "onOpenedCamera2", 19999, new String[0]);
            agh.r("PltCamera", Camera2Wrapper.TAG, "onOpened");
            Camera2Wrapper.I(this.c, CameraOpenState.OPENED);
            Camera2Wrapper.H(this.c, cameraDevice);
            Camera2Wrapper.E(this.c, cameraDevice, this.f4717a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class d implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Camera2Wrapper f4718a;

        static {
            t2o.a(481296880);
        }

        public d(Camera2Wrapper camera2Wrapper) {
            ckf.g(camera2Wrapper, "this$0");
            this.f4718a = camera2Wrapper;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
            } else if (imageReader != null) {
                Camera2Wrapper camera2Wrapper = this.f4718a;
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    byte[] f = ipe.f(acquireLatestImage);
                    ivm y = Camera2Wrapper.y(camera2Wrapper);
                    if (y != null) {
                        y.h(f, acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), 17, Camera2Wrapper.z(camera2Wrapper), Camera2Wrapper.t(camera2Wrapper));
                    }
                    acquireLatestImage.close();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class e implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayBlockingQueue<Pair<byte[], Size>> f4719a;

        static {
            t2o.a(481296881);
        }

        public e(Camera2Wrapper camera2Wrapper, ArrayBlockingQueue<Pair<byte[], Size>> arrayBlockingQueue) {
            ckf.g(camera2Wrapper, "this$0");
            ckf.g(arrayBlockingQueue, "imageQueue");
            this.f4719a = arrayBlockingQueue;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image acquireLatestImage;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
            } else if (imageReader != null && (acquireLatestImage = imageReader.acquireLatestImage()) != null) {
                agh.r("PltCamera", Camera2Wrapper.TAG, "take photo success");
                if (this.f4719a.size() <= 1) {
                    byte[] f = ipe.f(acquireLatestImage);
                    ckf.f(f, "data");
                    this.f4719a.add(new Pair<>(f, new Size(acquireLatestImage.getWidth(), acquireLatestImage.getHeight())));
                }
                acquireLatestImage.close();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$closeCamera$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Camera2Wrapper.p(Camera2Wrapper.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g<T> implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final g<T> INSTANCE = new g<>();

        /* renamed from: a */
        public final int compare(Size size, Size size2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5972f6ff", new Object[]{this, size, size2})).intValue();
            }
            return size.getWidth() - size2.getWidth();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Size b;

        public h(Size size) {
            this.b = size;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            m7m x = Camera2Wrapper.x(Camera2Wrapper.this);
            if (x != null) {
                x.a(this.b.getWidth(), this.b.getHeight());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d23.q c;
        public final /* synthetic */ byte[] d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;
        public final /* synthetic */ boolean h;

        public i(d23.q qVar, byte[] bArr, int i, int i2, int i3, boolean z) {
            this.c = qVar;
            this.d = bArr;
            this.e = i;
            this.f = i2;
            this.g = i3;
            this.h = z;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$notifyTakePictureResult$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                ((rv8) this.c).g(this.d, this.e, this.f, this.g, this.h);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$onCameraOpenFailed$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            mzu.n(p73.f25916a, "callbackOnOpenFailedCamera2", 19999, new String[0]);
            l7m w = Camera2Wrapper.w(Camera2Wrapper.this);
            if (w != null) {
                w.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class k extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$onCameraOpenSuccess$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            l7m w = Camera2Wrapper.w(Camera2Wrapper.this);
            if (w != null) {
                w.a();
            }
            mzu.n(p73.f25916a, "callbackOpenSuccessCamera2", 19999, new String[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class l extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
            if (str.hashCode() == -816534907) {
                super.b((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$openCamera$1");
        }

        @Override // tb.zio
        public void b(Throwable th) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            super.b(th);
            if (th == null) {
                str = "throwable is null";
            } else {
                str = th.getMessage();
                if (str == null) {
                    str = "e.message is null";
                }
            }
            agh.r("PltCamera", Camera2Wrapper.TAG, ckf.p("openCamera error ", str));
            by2.a aVar = by2.Companion;
            Context s = Camera2Wrapper.s(Camera2Wrapper.this);
            ckf.f(s, "context");
            aVar.c(s, str);
            Camera2Wrapper.D(Camera2Wrapper.this);
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Camera2Wrapper.F(Camera2Wrapper.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class m extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$release$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Camera2Wrapper.B(Camera2Wrapper.this).quitSafely();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class n extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ SurfaceHolder d;

        public n(SurfaceHolder surfaceHolder) {
            this.d = surfaceHolder;
        }

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            if (str.hashCode() == -816534907) {
                super.b((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$startPreview$4");
        }

        @Override // tb.zio
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            super.b(th);
            String str = "startPreview onError: ";
            if (th instanceof Exception) {
                str = agh.f(str, th);
            }
            agh.r("PltCamera", Camera2Wrapper.TAG, str);
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            Camera2Wrapper.K(Camera2Wrapper.this, this.d);
            if (Camera2Wrapper.r(Camera2Wrapper.this) == null || this.d == null || Camera2Wrapper.q(Camera2Wrapper.this) == null) {
                agh.r("PltCamera", Camera2Wrapper.TAG, "cameraDevice: " + Camera2Wrapper.r(Camera2Wrapper.this) + ", holder: " + this.d + ", cameraCharacteristics: " + Camera2Wrapper.q(Camera2Wrapper.this));
                return;
            }
            agh.r("PltCamera", Camera2Wrapper.TAG, "startPreview call startPreviewInBackground");
            Camera2Wrapper camera2Wrapper = Camera2Wrapper.this;
            CameraDevice r = Camera2Wrapper.r(camera2Wrapper);
            ckf.d(r);
            SurfaceHolder surfaceHolder = this.d;
            CameraCharacteristics q = Camera2Wrapper.q(Camera2Wrapper.this);
            ckf.d(q);
            Camera2Wrapper.L(camera2Wrapper, r, surfaceHolder, q);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class o extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$stopPreview$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            agh.r("PltCamera", Camera2Wrapper.TAG, "call clearEnvironment");
            Camera2Wrapper.o(Camera2Wrapper.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class p extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d23.q d;

        public p(d23.q qVar) {
            this.d = qVar;
        }

        public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$takePicture$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Camera2Wrapper.M(Camera2Wrapper.this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class q extends CameraCaptureSession.CaptureCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d23.q b;
        public final /* synthetic */ ArrayBlockingQueue<Pair<byte[], Size>> c;

        public q(d23.q qVar, ArrayBlockingQueue<Pair<byte[], Size>> arrayBlockingQueue) {
            this.b = qVar;
            this.c = arrayBlockingQueue;
        }

        public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
            if (str.hashCode() == -2108141758) {
                super.onCaptureCompleted((CameraCaptureSession) objArr[0], (CaptureRequest) objArr[1], (TotalCaptureResult) objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$takePictureInBackground$captureCallback$1");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("775f1a7d", new Object[]{this, cameraCaptureSession, captureRequest, captureFailure});
                return;
            }
            ckf.g(cameraCaptureSession, MspGlobalDefine.SESSION);
            ckf.g(captureRequest, "request");
            ckf.g(captureFailure, "failure");
            Camera2Wrapper camera2Wrapper = Camera2Wrapper.this;
            Camera2Wrapper.C(camera2Wrapper, this.b, null, 0, 0, 0, Camera2Wrapper.z(camera2Wrapper));
            ImageReader u = Camera2Wrapper.u(Camera2Wrapper.this);
            if (u != null) {
                u.setOnImageAvailableListener(new d(Camera2Wrapper.this), Camera2Wrapper.A(Camera2Wrapper.this));
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82584f42", new Object[]{this, cameraCaptureSession, captureRequest, totalCaptureResult});
                return;
            }
            ckf.g(cameraCaptureSession, MspGlobalDefine.SESSION);
            ckf.g(captureRequest, "request");
            ckf.g(totalCaptureResult, "result");
            agh.r("PltCamera", Camera2Wrapper.TAG, "onCaptureCompleted");
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            int t = Camera2Wrapper.q(Camera2Wrapper.this) == null ? 0 : Camera2Wrapper.t(Camera2Wrapper.this);
            Pair<byte[], Size> peek = this.c.peek();
            if (peek != null) {
                Camera2Wrapper camera2Wrapper = Camera2Wrapper.this;
                d23.q qVar = this.b;
                agh.r("PltCamera", Camera2Wrapper.TAG, "take photo success realCameraFront = " + Camera2Wrapper.z(camera2Wrapper) + ", orientation = " + t);
                Camera2Wrapper.C(camera2Wrapper, qVar, peek.getFirst(), peek.getSecond().getWidth(), peek.getSecond().getHeight(), t, Camera2Wrapper.z(camera2Wrapper));
            }
            this.c.clear();
            ImageReader u = Camera2Wrapper.u(Camera2Wrapper.this);
            if (u != null) {
                u.setOnImageAvailableListener(new d(Camera2Wrapper.this), Camera2Wrapper.A(Camera2Wrapper.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class r extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$toggleCamera$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Camera2Wrapper.N(Camera2Wrapper.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class s extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean d;

        public s(boolean z) {
            this.d = z;
        }

        public static /* synthetic */ Object ipc$super(s sVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$toggleFlashLight$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Camera2Wrapper.O(Camera2Wrapper.this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class t extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float d;

        public t(float f) {
            this.d = f;
        }

        public static /* synthetic */ Object ipc$super(t tVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$zoomIn$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Camera2Wrapper.P(Camera2Wrapper.this, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class u extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public u(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera2/Camera2Wrapper$zoomWithAssignLevel$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                Camera2Wrapper.Q(Camera2Wrapper.this, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(481296875);
        t2o.a(481296833);
    }

    public Camera2Wrapper(Activity activity) {
        ckf.g(activity, "outContext");
        this.f4715a = activity;
        Context applicationContext = activity.getApplicationContext();
        this.b = applicationContext;
        CameraManager cameraManager = (CameraManager) applicationContext.getSystemService("camera");
        if (cameraManager != null) {
            this.i = cameraManager;
            this.j = new Handler(Looper.getMainLooper());
            HandlerThread a2 = wsa.a(ckf.p("Camera2Wrapper_", Integer.valueOf(hashCode())));
            a2.start();
            this.k = a2;
            this.l = new Handler(a2.getLooper());
            this.m = CameraOpenState.IDLE;
            this.p = "";
            this.u = new AtomicBoolean(false);
            this.x = -1;
            if (!by2.Companion.d()) {
                throw new RuntimeException("camera2 not supported");
            } else if (TextUtils.isEmpty(W(cameraManager, false))) {
                throw new RuntimeException("cannot get prop cameraId");
            }
        } else {
            throw new RuntimeException("cannot get cameraManager");
        }
    }

    public static final /* synthetic */ Handler A(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3dc214ea", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.l;
    }

    public static final /* synthetic */ HandlerThread B(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("67ee1ba8", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.k;
    }

    public static final /* synthetic */ void C(Camera2Wrapper camera2Wrapper, d23.q qVar, byte[] bArr, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbfaaf", new Object[]{camera2Wrapper, qVar, bArr, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else {
            camera2Wrapper.a0(qVar, bArr, i2, i3, i4, z);
        }
    }

    public static final /* synthetic */ void D(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb34793", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.b0();
        }
    }

    public static final /* synthetic */ void E(Camera2Wrapper camera2Wrapper, CameraDevice cameraDevice, CameraCharacteristics cameraCharacteristics, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f9a89b", new Object[]{camera2Wrapper, cameraDevice, cameraCharacteristics, new Boolean(z)});
        } else {
            camera2Wrapper.c0(cameraDevice, cameraCharacteristics, z);
        }
    }

    public static final /* synthetic */ void F(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2932f5fc", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.d0();
        }
    }

    public static final /* synthetic */ void G(Camera2Wrapper camera2Wrapper, CameraCaptureSession cameraCaptureSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dde96c8", new Object[]{camera2Wrapper, cameraCaptureSession});
        } else {
            camera2Wrapper.q = cameraCaptureSession;
        }
    }

    public static final /* synthetic */ void H(Camera2Wrapper camera2Wrapper, CameraDevice cameraDevice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c5e408", new Object[]{camera2Wrapper, cameraDevice});
        } else {
            camera2Wrapper.n = cameraDevice;
        }
    }

    public static final /* synthetic */ void I(Camera2Wrapper camera2Wrapper, CameraOpenState cameraOpenState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d0641a", new Object[]{camera2Wrapper, cameraOpenState});
        } else {
            camera2Wrapper.m = cameraOpenState;
        }
    }

    public static final /* synthetic */ void J(Camera2Wrapper camera2Wrapper, CaptureRequest.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3ca61b", new Object[]{camera2Wrapper, builder});
        } else {
            camera2Wrapper.v = builder;
        }
    }

    public static final /* synthetic */ void K(Camera2Wrapper camera2Wrapper, SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80abd3b", new Object[]{camera2Wrapper, surfaceHolder});
        } else {
            camera2Wrapper.r = surfaceHolder;
        }
    }

    public static final /* synthetic */ void L(Camera2Wrapper camera2Wrapper, CameraDevice cameraDevice, SurfaceHolder surfaceHolder, CameraCharacteristics cameraCharacteristics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b0f8dd", new Object[]{camera2Wrapper, cameraDevice, surfaceHolder, cameraCharacteristics});
        } else {
            camera2Wrapper.e0(cameraDevice, surfaceHolder, cameraCharacteristics);
        }
    }

    public static final /* synthetic */ void M(Camera2Wrapper camera2Wrapper, d23.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07a1036", new Object[]{camera2Wrapper, qVar});
        } else {
            camera2Wrapper.f0(qVar);
        }
    }

    public static final /* synthetic */ void N(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb608c32", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.g0();
        }
    }

    public static final /* synthetic */ void O(Camera2Wrapper camera2Wrapper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c25a43", new Object[]{camera2Wrapper, new Boolean(z)});
        } else {
            camera2Wrapper.h0(z);
        }
    }

    public static final /* synthetic */ void P(Camera2Wrapper camera2Wrapper, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a0cb0d", new Object[]{camera2Wrapper, new Float(f2)});
        } else {
            camera2Wrapper.i0(f2);
        }
    }

    public static final /* synthetic */ void Q(Camera2Wrapper camera2Wrapper, float f2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d577fc12", new Object[]{camera2Wrapper, new Float(f2), new Integer(i2)});
        } else {
            camera2Wrapper.j0(f2, i2);
        }
    }

    public static final /* synthetic */ void o(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d35bd8", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.R();
        }
    }

    public static final /* synthetic */ void p(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08ce88e", new Object[]{camera2Wrapper});
        } else {
            camera2Wrapper.S();
        }
    }

    public static final /* synthetic */ CameraCharacteristics q(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraCharacteristics) ipChange.ipc$dispatch("52372946", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.o;
    }

    public static final /* synthetic */ CameraDevice r(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraDevice) ipChange.ipc$dispatch("b0e97b4e", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.n;
    }

    public static final /* synthetic */ Context s(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ba68271", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.b;
    }

    public static final /* synthetic */ int t(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b46fbdb", new Object[]{camera2Wrapper})).intValue();
        }
        return camera2Wrapper.U();
    }

    public static final /* synthetic */ ImageReader u(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageReader) ipChange.ipc$dispatch("c072c808", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.s;
    }

    public static final /* synthetic */ CameraOpenState v(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CameraOpenState) ipChange.ipc$dispatch("349a5e38", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.m;
    }

    public static final /* synthetic */ l7m w(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l7m) ipChange.ipc$dispatch("78d4e3f1", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.d;
    }

    public static final /* synthetic */ m7m x(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m7m) ipChange.ipc$dispatch("882550f1", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.c;
    }

    public static final /* synthetic */ ivm y(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ivm) ipChange.ipc$dispatch("ee793705", new Object[]{camera2Wrapper});
        }
        return camera2Wrapper.h;
    }

    public static final /* synthetic */ boolean z(Camera2Wrapper camera2Wrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33b01086", new Object[]{camera2Wrapper})).booleanValue();
        }
        return camera2Wrapper.f;
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1103730d", new Object[]{this});
            return;
        }
        ImageReader imageReader = this.s;
        if (imageReader != null) {
            try {
                imageReader.close();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.s = null;
                throw th;
            }
            this.s = null;
        }
        CameraCaptureSession cameraCaptureSession = this.q;
        if (cameraCaptureSession != null) {
            try {
                cameraCaptureSession.close();
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                this.q = null;
                throw th2;
            }
            this.q = null;
        }
        CameraDevice cameraDevice = this.n;
        if (cameraDevice != null) {
            try {
                cameraDevice.close();
            } catch (Exception unused3) {
            } catch (Throwable th3) {
                this.n = null;
                throw th3;
            }
            this.n = null;
        }
        this.m = CameraOpenState.IDLE;
        this.p = "";
        this.o = null;
        this.r = null;
        this.g = false;
        this.v = null;
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd26497", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, "closeCameraInBackground call clearEnvironment");
        R();
    }

    public final List<String> T(String[] strArr, CameraManager cameraManager, int i2, int i3) {
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("57e1b54", new Object[]{this, strArr, cameraManager, new Integer(i2), new Integer(i3)});
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            while (i4 < length) {
                String str = strArr[i4];
                i4++;
                try {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    ckf.f(cameraCharacteristics, "cameraManager.getCameraCharacteristics(it)");
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num != null && num.intValue() == i2 && by2.Companion.b(i3, cameraCharacteristics)) {
                        arrayList.add(str);
                    }
                } catch (Exception unused) {
                }
            }
            return arrayList;
        } catch (AssertionError unused2) {
            return new ArrayList(1);
        }
    }

    public final int U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b891370", new Object[]{this})).intValue();
        }
        if (this.x < 0) {
            this.x = s13.a(this.f4715a);
        }
        return this.x;
    }

    public final String W(CameraManager cameraManager, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f8c86ae", new Object[]{this, cameraManager, new Boolean(z)});
        }
        String[] cameraIdList = cameraManager.getCameraIdList();
        ckf.f(cameraIdList, "cameraManager.cameraIdList");
        if (cameraIdList.length == 0) {
            agh.r("PltCamera", TAG, "cameraIdList is empty");
            return "";
        }
        int i2 = !z ? 1 : 0;
        String[] cameraIdList2 = cameraManager.getCameraIdList();
        ckf.f(cameraIdList2, "cameraManager.cameraIdList");
        List<String> T = T(cameraIdList2, cameraManager, i2, 0);
        String[] cameraIdList3 = cameraManager.getCameraIdList();
        ckf.f(cameraIdList3, "cameraManager.cameraIdList");
        List<String> T2 = T(cameraIdList3, cameraManager, z ? 1 : 0, 0);
        AtomicBoolean atomicBoolean = this.u;
        List<String> list = T;
        if (!list.isEmpty() && !T2.isEmpty()) {
            z2 = true;
        }
        atomicBoolean.set(z2);
        if (!list.isEmpty()) {
            agh.r("PltCamera", TAG, ckf.p("firstChoiceCameraList size ", Integer.valueOf(T.size())));
            return (String) i04.a0(T);
        } else if (T2.isEmpty()) {
            return "";
        } else {
            agh.r("PltCamera", TAG, ckf.p("backupCameraList size ", Integer.valueOf(T2.size())));
            return (String) i04.a0(T2);
        }
    }

    public final boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9549414", new Object[]{this})).booleanValue();
        }
        if (ContextCompat.checkSelfPermission(this.b, t4p.CAMERA) == 0) {
            return true;
        }
        return false;
    }

    public final Size Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("f5d376c3", new Object[]{this});
        }
        agh.r("PltCamera", TAG, "initPreviewSize");
        CameraCharacteristics cameraCharacteristics = this.o;
        Size V = cameraCharacteristics == null ? null : V(cameraCharacteristics, SurfaceHolder.class);
        if (V != null) {
            return V;
        }
        String W = W(this.i, this.e);
        this.p = W;
        if (TextUtils.isEmpty(W)) {
            return null;
        }
        agh.r("PltCamera", TAG, ckf.p("realCameraId ", this.p));
        CameraCharacteristics cameraCharacteristics2 = this.i.getCameraCharacteristics(this.p);
        ckf.f(cameraCharacteristics2, "cameraManager.getCameraCharacteristics(cameraId)");
        this.o = cameraCharacteristics2;
        return V(cameraCharacteristics2, SurfaceHolder.class);
    }

    public final void Z(Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42c9e0d", new Object[]{this, size});
        } else if (ast.INSTANCE.a()) {
            m7m m7mVar = this.c;
            if (m7mVar != null) {
                m7mVar.a(size.getWidth(), size.getHeight());
            }
        } else {
            this.j.post(new h(size));
        }
    }

    @Override // tb.x9d
    public void a(ivm ivmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3459ca90", new Object[]{this, ivmVar});
            return;
        }
        ckf.g(ivmVar, "callback");
        agh.r("PltCamera", TAG, "setPreviewFrameCallback");
        this.h = ivmVar;
    }

    public final void a0(d23.q qVar, byte[] bArr, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f959eb0", new Object[]{this, qVar, bArr, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else {
            this.l.post(new i(qVar, bArr, i2, i3, i4, z));
        }
    }

    @Override // tb.x9d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2caba0", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, "toggleCamera");
        this.l.post(new r());
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7682732", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, "onCameraOpenFailed");
        R();
        this.j.post(new j());
    }

    @Override // tb.x9d
    public void c(SurfaceHolder surfaceHolder) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d763068d", new Object[]{this, surfaceHolder});
            return;
        }
        agh.r("PltCamera", TAG, "startPreview-- openState: " + this.m + " holder: " + surfaceHolder);
        if (this.t == null) {
            this.t = Y();
        }
        Size size = this.t;
        if (size == null) {
            xhvVar = null;
        } else {
            Z(size);
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            agh.r("PltCamera", TAG, "startPreview: cannot get preview size");
            b0();
            by2.a aVar = by2.Companion;
            Context context = this.b;
            ckf.f(context, "context");
            aVar.c(context, "startPreview: cannot get preview size");
            return;
        }
        this.l.post(new n(surfaceHolder));
    }

    @Override // tb.x9d
    public void closeCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a613d144", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, "closeCamera");
        this.l.post(new f());
    }

    @Override // tb.x9d
    public void e(d23.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bed910c", new Object[]{this, qVar});
            return;
        }
        ckf.g(qVar, "callback");
        agh.r("PltCamera", TAG, ckf.p("takePicture ", qVar));
        this.l.post(new p(qVar));
    }

    @Override // tb.x9d
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f09005da", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final void f0(d23.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa92719", new Object[]{this, qVar});
        } else if (this.n == null || this.t == null || this.q == null || this.s == null) {
            a0(qVar, null, 0, 0, 0, this.f);
        } else {
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(2);
            CameraDevice cameraDevice = this.n;
            ckf.d(cameraDevice);
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(2);
            ckf.f(createCaptureRequest, "cameraDevice!!.createCap…e.TEMPLATE_STILL_CAPTURE)");
            SurfaceHolder surfaceHolder = this.r;
            if (surfaceHolder != null) {
                createCaptureRequest.addTarget(surfaceHolder.getSurface());
            }
            ImageReader imageReader = this.s;
            if (imageReader != null) {
                createCaptureRequest.addTarget(imageReader.getSurface());
                imageReader.setOnImageAvailableListener(new e(this, arrayBlockingQueue), this.l);
            }
            q qVar2 = new q(qVar, arrayBlockingQueue);
            CameraCaptureSession cameraCaptureSession = this.q;
            ckf.d(cameraCaptureSession);
            cameraCaptureSession.capture(createCaptureRequest.build(), qVar2, this.l);
        }
    }

    @Override // tb.x9d
    public boolean g(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac6ba507", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        this.l.post(new u(i2, i3));
        return true;
    }

    @Override // tb.x9d
    public void h(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3958e6c1", new Object[]{this, new Float(f2)});
            return;
        }
        agh.r("PltCamera", TAG, ckf.p("zoomIn ", Float.valueOf(f2)));
        this.l.post(new t(f2));
    }

    public final void h0(boolean z) {
        CaptureRequest.Builder builder;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfa6c80", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            i2 = 2;
        }
        CameraCharacteristics cameraCharacteristics = this.o;
        if (cameraCharacteristics != null && ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)) != null && (builder = this.v) != null) {
            agh.r("PltCamera", TAG, ckf.p("CaptureRequest.FLASH_MODE ", Integer.valueOf(i2)));
            builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(i2));
            CameraCaptureSession cameraCaptureSession = this.q;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.setRepeatingRequest(builder.build(), null, this.l);
            }
        }
    }

    @Override // tb.x9d
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c43c7b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            if (!this.e) {
                g0();
            }
        } else if (this.e) {
            g0();
        }
    }

    public final void i0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3e3e4e", new Object[]{this, new Float(f2)});
            return;
        }
        CaptureRequest.Builder builder = this.v;
        if (builder == null) {
            agh.r("PltCamera", TAG, ckf.p("previewBuilder is ", builder));
            return;
        }
        cy2 cy2Var = this.w;
        if (cy2Var != null) {
            agh.r("PltCamera", TAG, ckf.p("zoomInInBackground ", Boolean.valueOf(cy2Var.d)));
            CaptureRequest.Builder builder2 = this.v;
            ckf.d(builder2);
            cy2Var.a(builder2, f2);
            CameraCaptureSession cameraCaptureSession = this.q;
            if (cameraCaptureSession != null) {
                agh.r("PltCamera", TAG, "setRepeatingRequest");
                CaptureRequest.Builder builder3 = this.v;
                ckf.d(builder3);
                cameraCaptureSession.setRepeatingRequest(builder3.build(), null, this.l);
            }
        }
    }

    @Override // tb.x9d
    public boolean isOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e7ed3e", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    @Override // tb.x9d
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956a51f3", new Object[]{this, new Boolean(z)});
            return;
        }
        agh.r("PltCamera", TAG, ckf.p("toggleFlashLight ", Boolean.valueOf(z)));
        this.l.post(new s(z));
    }

    public final void j0(float f2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e02bbf9", new Object[]{this, new Float(f2), new Integer(i2)});
            return;
        }
        CaptureRequest.Builder builder = this.v;
        if (builder == null) {
            agh.r("PltCamera", TAG, ckf.p("previewBuilder is ", builder));
            return;
        }
        cy2 cy2Var = this.w;
        if (cy2Var != null) {
            agh.r("PltCamera", TAG, ckf.p("zoomInInBackground ", Boolean.valueOf(cy2Var.d)));
            cy2Var.b(builder, f2, i2);
            CameraCaptureSession cameraCaptureSession = this.q;
            if (cameraCaptureSession != null) {
                agh.r("PltCamera", TAG, "setRepeatingRequest");
                cameraCaptureSession.setRepeatingRequest(builder.build(), null, this.l);
            }
        }
    }

    @Override // tb.x9d
    public void k(m7m m7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8ed454", new Object[]{this, m7mVar});
            return;
        }
        ckf.g(m7mVar, DataReceiveMonitor.CB_LISTENER);
        agh.r("PltCamera", TAG, "setCameraSizeListener");
        this.c = m7mVar;
    }

    @Override // tb.x9d
    public void l(l7m l7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb1c654", new Object[]{this, l7mVar});
            return;
        }
        ckf.g(l7mVar, "cameraCallback");
        agh.r("PltCamera", TAG, "setCameraCallback");
        this.d = l7mVar;
    }

    @Override // tb.x9d
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e185dba4", new Object[]{this})).intValue();
        }
        if (!lg4.g4()) {
            agh.h(TAG, "getDisplayRotation 0");
            return 0;
        }
        if (this.x < 0) {
            int a2 = s13.a(this.f4715a);
            this.x = a2;
            agh.h(TAG, ckf.p("getDisplayRotation displayRotation=", Integer.valueOf(a2)));
        }
        return this.x;
    }

    @Override // tb.x9d
    public void n(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cdc2edc", new Object[]{this, point});
            return;
        }
        ckf.g(point, "point");
        agh.r("PltCamera", TAG, "manualFocus");
    }

    @Override // tb.x9d
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, "release");
        closeCamera();
        this.l.post(new m());
    }

    @Override // tb.x9d
    public void stopPreview() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, "stopPreview");
        this.l.post(new o());
    }

    public final Size V(CameraCharacteristics cameraCharacteristics, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("9a280687", new Object[]{this, cameraCharacteristics, cls});
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Size size = null;
        Size[] outputSizes = streamConfigurationMap == null ? null : streamConfigurationMap.getOutputSizes(cls);
        if (outputSizes == null) {
            mzu.n(p73.f25916a, "supportedSizesIsNullCamera2", 19999, new String[0]);
            return null;
        }
        List<Size> i0 = ic1.i0(outputSizes);
        Collections.sort(i0, g.INSTANCE);
        Size size2 = null;
        for (Size size3 : i0) {
            Size size4 = y;
            if (ckf.b(size3, size4)) {
                return size3;
            }
            if (size3.getWidth() >= size4.getWidth()) {
                size = size3;
            } else if (size2 == null) {
                size2 = size3;
            }
        }
        if (size == null) {
            String str = p73.f25916a;
            mzu.n(str, "noBigPreviewSizeCamera2", 19999, new String[0]);
            if (size2 == null) {
                mzu.n(str, "previewSizeIsEmptyCamera2", 19999, new String[0]);
            }
        }
        return size == null ? size2 : size;
    }

    public final void c0(CameraDevice cameraDevice, CameraCharacteristics cameraCharacteristics, boolean z) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fb6a64e", new Object[]{this, cameraDevice, cameraCharacteristics, new Boolean(z)});
            return;
        }
        agh.r("PltCamera", TAG, ckf.p("onCameraOpenSuccess ", Boolean.valueOf(z)));
        this.g = true;
        this.j.post(new k());
        SurfaceHolder surfaceHolder = this.r;
        if (surfaceHolder == null) {
            xhvVar = null;
        } else {
            try {
                this.f = z;
                e0(cameraDevice, surfaceHolder, cameraCharacteristics);
            } catch (Exception e2) {
                agh.r("PltCamera", TAG, String.valueOf(e2.getMessage()));
            }
            xhvVar = xhv.INSTANCE;
        }
        if (xhvVar == null) {
            agh.r("PltCamera", TAG, "surfaceHolder is null");
        }
    }

    @Override // tb.x9d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa95b16", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, "openCamera: cameraNum " + this.i.getCameraIdList().length + " openState: " + this.m + ", threadName " + ((Object) Thread.currentThread().getName()));
        mzu.n(p73.f25916a, "callOpenCamera2", 19999, new String[0]);
        this.l.post(new l());
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8a94f3", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, "toggleCameraInBackground: call closeCameraInBackground");
        S();
        this.e = true ^ this.e;
        agh.r("PltCamera", TAG, "toggleCameraInBackground: call openCameraInBackground");
        d0();
    }

    public final void d0() {
        xhv xhvVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ddc369", new Object[]{this});
            return;
        }
        if (TextUtils.isEmpty(this.p)) {
            Size Y = Y();
            if (Y == null) {
                agh.r("PltCamera", TAG, "openCameraInBackground: cannot get preview size");
                b0();
                by2.a aVar = by2.Companion;
                Context context = this.b;
                ckf.f(context, "context");
                aVar.c(context, "openCameraInBackground: cannot get preview size");
                return;
            }
            this.t = Y;
        }
        CameraCharacteristics cameraCharacteristics = this.o;
        if (cameraCharacteristics == null) {
            xhvVar = null;
        } else {
            this.w = new cy2(cameraCharacteristics);
            if (!X()) {
                b0();
                return;
            } else if (this.m == CameraOpenState.IDLE) {
                this.m = CameraOpenState.OPENING;
                if (TextUtils.isEmpty(this.p)) {
                    by2.a aVar2 = by2.Companion;
                    Context context2 = this.b;
                    ckf.f(context2, "context");
                    aVar2.c(context2, "cameraId is empty");
                    b0();
                    return;
                }
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 0) {
                    z = true;
                }
                this.f = z;
                c cVar = new c(this, cameraCharacteristics, this.f);
                agh.r("PltCamera", TAG, "try open camera");
                this.i.openCamera(this.p, cVar, this.l);
                xhvVar = xhv.INSTANCE;
            } else {
                return;
            }
        }
        if (xhvVar == null) {
            agh.r("PltCamera", TAG, "cannot get cameraCharacteristics");
            by2.a aVar3 = by2.Companion;
            Context context3 = this.b;
            ckf.f(context3, "context");
            aVar3.c(context3, "cameraCharacteristics is null");
            b0();
        }
    }

    public final void e0(CameraDevice cameraDevice, SurfaceHolder surfaceHolder, CameraCharacteristics cameraCharacteristics) {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f74842", new Object[]{this, cameraDevice, surfaceHolder, cameraCharacteristics});
            return;
        }
        agh.r("PltCamera", TAG, "startPreviewInBackground: " + this.m + ' ' + this.t);
        if (this.m == CameraOpenState.OPENED) {
            if (!surfaceHolder.getSurface().isValid()) {
                agh.r("PltCamera", TAG, "surface is not valid");
                return;
            }
            Size size = this.t;
            if (size == null) {
                xhvVar = null;
            } else {
                ImageReader newInstance = ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, 2);
                newInstance.setOnImageAvailableListener(new d(this), this.l);
                List<Surface> l2 = yz3.l(surfaceHolder.getSurface(), newInstance.getSurface());
                b bVar = new b(this, cameraDevice, l2, cameraCharacteristics);
                try {
                    this.m = CameraOpenState.SESSION_CREATING;
                    cameraDevice.createCaptureSession(l2, bVar, this.l);
                } catch (CameraAccessException e2) {
                    String p2 = ckf.p("exception when createCaptureSession ", e2.getMessage());
                    agh.r("PltCamera", TAG, p2);
                    by2.a aVar = by2.Companion;
                    Context context = this.b;
                    ckf.f(context, "context");
                    aVar.c(context, p2);
                    b0();
                }
                this.s = newInstance;
                xhvVar = xhv.INSTANCE;
            }
            if (xhvVar == null) {
                b0();
            }
        }
    }
}
