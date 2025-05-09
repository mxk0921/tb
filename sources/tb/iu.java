package tb;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.WindowManager;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.DisplayUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.camera.widget.CameraSurfaceView;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class iu implements alb, Camera.AutoFocusMoveCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f21581a;
    public Camera b;
    public Camera.Parameters c;
    public zkb d;
    public int f;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Handler r;
    public final HandlerThread s;
    public int e = 90;
    public aj7 g = new aj7();
    public final Object h = new Object();
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public boolean p = true;
    public boolean q = false;
    public final Runnable t = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Camera camera = iu.this.b;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                if (maxNumFocusAreas > 0) {
                    parameters.setFocusAreas(null);
                }
                if (maxNumMeteringAreas > 0) {
                    parameters.setMeteringAreas(null);
                }
                iu.c(iu.this, parameters);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Camera.PreviewCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83a13143", new Object[]{this, bArr, camera});
            } else if (bArr != null && iu.this.d != null) {
                oz2 oz2Var = new oz2(ByteBuffer.wrap(bArr), iu.d(iu.this), iu.e(iu.this), 0, null, 0, 0, iu.f(iu.this), iu.g(iu.this));
                oz2Var.d(iu.h(iu.this));
                iu.this.d.onPreviewFrame(oz2Var);
            }
        }
    }

    static {
        t2o.a(245366894);
        t2o.a(245366903);
    }

    public iu(Context context) {
        if (context != null) {
            this.f21581a = context;
            this.m = false;
            this.n = false;
            this.o = false;
            HandlerThread handlerThread = new HandlerThread("Camera-work");
            this.s = handlerThread;
            handlerThread.start();
            this.r = new Handler(handlerThread.getLooper());
            return;
        }
        throw new IllegalArgumentException("Context can't be null");
    }

    public static /* synthetic */ void c(iu iuVar, Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83f8b15", new Object[]{iuVar, parameters});
        } else {
            iuVar.j(parameters);
        }
    }

    public static /* synthetic */ int d(iu iuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4037c23a", new Object[]{iuVar})).intValue();
        }
        return iuVar.i;
    }

    public static /* synthetic */ int e(iu iuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd24d959", new Object[]{iuVar})).intValue();
        }
        return iuVar.j;
    }

    public static /* synthetic */ int f(iu iuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a11f078", new Object[]{iuVar})).intValue();
        }
        return iuVar.k;
    }

    public static /* synthetic */ int g(iu iuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6ff0797", new Object[]{iuVar})).intValue();
        }
        return iuVar.l;
    }

    public static /* synthetic */ boolean h(iu iuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ec1ec7", new Object[]{iuVar})).booleanValue();
        }
        return iuVar.q;
    }

    @Override // tb.alb
    public void a(aj7 aj7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7300eb20", new Object[]{this, aj7Var});
        } else if (!this.m) {
            q(upx.ZTECH_ENTER);
            if (aj7Var != null) {
                this.g = aj7Var;
            }
            this.m = true;
        }
    }

    @Override // tb.alb
    public void b(zkb zkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684dad95", new Object[]{this, zkbVar});
        } else {
            this.d = zkbVar;
        }
    }

    @Override // tb.alb
    public int getCameraViewRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1da0f878", new Object[]{this})).intValue();
        }
        return this.e;
    }

    @Override // tb.alb
    public int getColorHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a62067ae", new Object[]{this})).intValue();
        }
        return this.j;
    }

    @Override // tb.alb
    public int getColorWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd49bc13", new Object[]{this})).intValue();
        }
        return this.i;
    }

    @Override // tb.alb
    public int getPreviewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82fe5753", new Object[]{this})).intValue();
        }
        return this.l;
    }

    @Override // tb.alb
    public int getPreviewWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50ccc3ce", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e09da948", new Object[]{this});
        } else if (this.c != null) {
            Camera.Size e = sv0.f().e(this.c.getSupportedPreviewSizes(), DisplayUtil.getScreenRate(this.f21581a), this.g.c(), this.g.b());
            if (e != null) {
                int i = e.width;
                this.k = i;
                int i2 = e.height;
                this.l = i2;
                this.i = i;
                this.j = i2;
                this.c.setPreviewSize(i, i2);
            }
            aj7 aj7Var = this.g;
            if (aj7Var != null) {
                this.e = o(aj7Var);
            }
            j(this.c);
        }
    }

    public final void j(Camera.Parameters parameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4d32bc", new Object[]{this, parameters});
            return;
        }
        String m = m(parameters, this.p);
        if (!TextUtils.isEmpty(m)) {
            parameters.setFocusMode(m);
        }
        this.b.setParameters(parameters);
        this.b.setAutoFocusMoveCallback(this);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd07dc1", new Object[]{this});
            return;
        }
        if (this.c != null) {
            if (this.f == sv0.d()) {
                this.p = false;
                i();
            } else {
                this.p = true;
            }
        }
        l();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d44ab540", new Object[]{this});
        }
    }

    public final String m(Camera.Parameters parameters, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d49a261", new Object[]{this, parameters, new Boolean(z)});
        }
        if (this.b == null) {
            return null;
        }
        if (z) {
            str = "continuous-video";
        } else {
            str = "continuous-picture";
        }
        if (parameters.getSupportedFocusModes().contains(str)) {
            return str;
        }
        if (parameters.getSupportedFocusModes().contains("auto")) {
            return "auto";
        }
        if (parameters.getSupportedFocusModes().contains("macro")) {
            return "macro";
        }
        if (parameters.getSupportedFocusModes().contains("fixed")) {
            return "fixed";
        }
        if (parameters.getSupportedFocusModes().size() == 1) {
            return parameters.getSupportedFocusModes().get(0);
        }
        return null;
    }

    public final int n(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21c1a466", new Object[]{this, new Integer(i)})).intValue();
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) this.f21581a.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getRotation();
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
            return (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i2) + 360) % 360;
    }

    public final int o(aj7 aj7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2967005f", new Object[]{this, aj7Var})).intValue();
        }
        if (aj7Var == null) {
            throw new IllegalArgumentException("deviceSetting can't be null");
        } else if (aj7Var.f()) {
            return n(this.f);
        } else {
            return aj7Var.d();
        }
    }

    @Override // android.hardware.Camera.AutoFocusMoveCallback
    public void onAutoFocusMoving(boolean z, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5289e140", new Object[]{this, new Boolean(z), camera});
        } else {
            this.q = !z;
        }
    }

    public final boolean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca233f57", new Object[]{this, new Integer(i)})).booleanValue();
        }
        BioLog.i("realStartCamera");
        try {
            Camera open = Camera.open(i);
            this.b = open;
            if (open == null) {
                zkb zkbVar = this.d;
                if (zkbVar != null) {
                    zkbVar.onError(-1);
                }
                return false;
            }
            this.f = i;
            this.c = open.getParameters();
            k();
            if (this.d != null) {
                this.b.setPreviewCallback(new b());
            }
            return true;
        } catch (Exception unused) {
            zkb zkbVar2 = this.d;
            if (zkbVar2 != null) {
                zkbVar2.onError(-1);
            }
            return false;
        } catch (Throwable unused2) {
            zkb zkbVar3 = this.d;
            if (zkbVar3 != null) {
                zkbVar3.onError(-1);
            }
            return false;
        }
    }

    public final void q(String str) {
        ZimRecordService zimRecordService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b221384", new Object[]{this, str});
            return;
        }
        try {
            if (BioServiceManager.getCurrentInstance() != null && (zimRecordService = (ZimRecordService) BioServiceManager.getCurrentInstance().getBioService(ZimRecordService.class)) != null) {
                MetaRecord metaRecord = new MetaRecord("UC-YWRLSB-161114-21", "event", "20000189", str, 1);
                HashMap hashMap = new HashMap();
                hashMap.put("module", com.taobao.downgrade.a.HARDWARE);
                zimRecordService.write(metaRecord, hashMap);
            }
        } catch (Exception e) {
            BioLog.e(e);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f92eed", new Object[]{this});
        } else if (this.o && this.b != null) {
            synchronized (this.h) {
                try {
                    this.b.setOneShotPreviewCallback(null);
                    this.b.setPreviewCallback(null);
                    this.b.stopPreview();
                } catch (Exception e) {
                    BioLog.e(e.toString());
                }
            }
            this.d = null;
            this.o = false;
        }
    }

    @Override // tb.alb
    public void releaseCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c11493", new Object[]{this});
            return;
        }
        Handler handler = this.r;
        if (handler != null) {
            handler.removeCallbacks(this.t);
            this.s.quitSafely();
        }
        stopCamera();
        if (this.m) {
            this.m = false;
            this.f21581a = null;
            CameraSurfaceView.release();
        }
    }

    @Override // tb.alb
    public void startCamera() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9433b2e", new Object[]{this});
        } else if (!this.n) {
            aj7 aj7Var = this.g;
            if (aj7Var == null || aj7Var.e()) {
                i = 1;
            } else {
                i = this.g.a();
            }
            if (p(sv0.a(this.f21581a, i, Camera.getNumberOfCameras()))) {
                this.n = true;
            }
        }
    }

    @Override // tb.alb
    public void stopCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e676ce", new Object[]{this});
            return;
        }
        r();
        if (this.n) {
            Handler handler = this.r;
            if (handler != null) {
                handler.removeCallbacks(this.t);
            }
            if (this.b != null) {
                synchronized (this.h) {
                    try {
                        this.b.release();
                        this.b = null;
                        this.n = false;
                    } catch (Exception e) {
                        BioLog.e(e.toString());
                    }
                }
                return;
            }
            this.n = false;
        }
    }
}
