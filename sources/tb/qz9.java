package tb;

import android.app.Activity;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.fastjson.JSON;
import com.alibaba.wireless.security.SecExceptionCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.acennr.downloader.TaskCallBack;
import com.taobao.android.tb3dspace.arskindetect.SkinDetectJni;
import com.taobao.android.tb3dspace.arskindetect.SkinDetectSurfaceView;
import com.taobao.android.tb3dspace.arskindetect.adapter.IJsEventSender;
import com.taobao.android.tb3dspace.util.CameraUtil;
import com.taobao.android.xr_resource.downloader.XRAceDownloader;
import com.taobao.android.xrappos.data.XRImage;
import com.taobao.cameralink.manager.Utils;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qz9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, String> c;
    public SkinDetectSurfaceView d;
    public XRImage e;
    public XRImage f;
    public volatile SkinDetectJni g;
    public final Activity i;
    public final IJsEventSender j;
    public final c2x k;
    public IEmbedView l;
    public boolean m;

    /* renamed from: a  reason: collision with root package name */
    public String f27012a = "";
    public String b = "";
    public final Handler h = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements SkinDetectSurfaceView.OnPreviewDataCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.qz9$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC1044a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1044a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    qz9.r(qz9.this);
                }
            }
        }

        public a() {
        }

        public void onPreviewData(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("514371a1", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            } else if (!TextUtils.isEmpty(qz9.b(qz9.this)) && !TextUtils.isEmpty(qz9.d(qz9.this)) && qz9.i(qz9.this) != null) {
                if (qz9.k(qz9.this) == null) {
                    qz9.i(qz9.this).init(qz9.b(qz9.this), qz9.d(qz9.this));
                    qz9.l(qz9.this, new XRImage(i, i2, XRImage.Config.YUV_NV21));
                }
                if (qz9.m(qz9.this) == null) {
                    qz9.n(qz9.this, new XRImage(i2, i, XRImage.Config.RGB));
                }
                qz9.k(qz9.this).updateImage(bArr);
                XRImage.convertYuvToRGBAndRotateClockWise90(qz9.k(qz9.this), qz9.m(qz9.this), true);
                boolean process = qz9.i(qz9.this).process(qz9.m(qz9.this));
                String resultJsonString = qz9.i(qz9.this).getResultJsonString(qz9.o(qz9.this));
                if (qz9.p(qz9.this) != null) {
                    qz9.p(qz9.this).sendEvent("ARSkinAnalysis.frameDetected", JSON.parseObject(resultJsonString));
                }
                if (qz9.q(qz9.this) != null) {
                    qz9.q(qz9.this).g("ARSkinAnalysis.frameDetected", JSON.parseObject(resultJsonString));
                }
                if (process) {
                    qz9.s(qz9.this).postDelayed(new RunnableC1044a(), 1000L);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements TaskCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                return;
            }
            StringBuilder sb = new StringBuilder("onFailed: i ");
            sb.append(i);
            sb.append(" s ");
            sb.append(str);
        }

        public void onProgress(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a562810", new Object[]{this, new Integer(i), new Float(f)});
            }
        }

        public void onSuccess(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                return;
            }
            qz9 qz9Var = qz9.this;
            qz9.c(qz9Var, qz9.e(qz9Var, str, str.substring(0, str.lastIndexOf(".")) + "_detection"));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements TaskCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void onFailed(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
            }
        }

        public void onProgress(int i, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a562810", new Object[]{this, new Integer(i), new Float(f)});
            }
        }

        public void onSuccess(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                return;
            }
            qz9 qz9Var = qz9.this;
            qz9.f(qz9Var, qz9.e(qz9Var, str, str.substring(0, str.lastIndexOf(".")) + "_points"));
            "onSuccess: points_bin_path ".concat(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Camera.Size bestPreviewSize = CameraUtil.getBestPreviewSize(qz9.g(qz9.this).getCameraSession().getCamera(), (int) SecExceptionCode.SEC_ERROR_MALDETECT, 600);
            float f = (bestPreviewSize.height * 1.0f) / bestPreviewSize.width;
            qz9 qz9Var = qz9.this;
            qz9.g(qz9.this).setLayoutParams(qz9Var.w(qz9.h(qz9Var), f));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (qz9.i(qz9.this) != null) {
                qz9.i(qz9.this).destroy();
                qz9.j(qz9.this, null);
            }
            if (qz9.k(qz9.this) != null) {
                qz9.k(qz9.this).destroy();
                qz9.l(qz9.this, null);
            }
            if (qz9.m(qz9.this) != null) {
                qz9.m(qz9.this).destroy();
                qz9.n(qz9.this, null);
            }
        }
    }

    static {
        t2o.a(394264612);
    }

    public qz9(ViewGroup viewGroup, Activity activity, IJsEventSender iJsEventSender, c2x c2xVar) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put("hasFace", "has_face");
        hashMap.put("facePercent", "face_percent_state");
        hashMap.put("pitch", "face_pitch_state");
        hashMap.put("yaw", "face_yaw_state");
        hashMap.put("roll", "face_roll_state");
        hashMap.put("light", "face_light_state");
        hashMap.put("left", "face_left_state");
        hashMap.put("right", "face_right_state");
        this.i = activity;
        this.d = new SkinDetectSurfaceView(activity);
        y(viewGroup, activity);
        this.j = iJsEventSender;
        this.k = c2xVar;
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("ARTry", 19999, "FrontSkinDetectImpl", "", null, null).build());
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ String b(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f1e7f18", new Object[]{qz9Var});
        }
        return qz9Var.f27012a;
    }

    public static /* synthetic */ String c(qz9 qz9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67987dcc", new Object[]{qz9Var, str});
        }
        qz9Var.f27012a = str;
        return str;
    }

    public static /* synthetic */ String d(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4bfc1b7", new Object[]{qz9Var});
        }
        return qz9Var.b;
    }

    public static /* synthetic */ String e(qz9 qz9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f4dfaf5", new Object[]{qz9Var, str, str2});
        }
        return qz9Var.D(str, str2);
    }

    public static /* synthetic */ String f(qz9 qz9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90fff6ab", new Object[]{qz9Var, str});
        }
        qz9Var.b = str;
        return str;
    }

    public static /* synthetic */ SkinDetectSurfaceView g(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinDetectSurfaceView) ipChange.ipc$dispatch("72f7aa9a", new Object[]{qz9Var});
        }
        return qz9Var.d;
    }

    public static /* synthetic */ Activity h(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d5f865cf", new Object[]{qz9Var});
        }
        return qz9Var.i;
    }

    public static /* synthetic */ SkinDetectJni i(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinDetectJni) ipChange.ipc$dispatch("a3463fd9", new Object[]{qz9Var});
        }
        return qz9Var.g;
    }

    public static /* synthetic */ SkinDetectJni j(qz9 qz9Var, SkinDetectJni skinDetectJni) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinDetectJni) ipChange.ipc$dispatch("f3b9fb22", new Object[]{qz9Var, skinDetectJni});
        }
        qz9Var.g = skinDetectJni;
        return skinDetectJni;
    }

    public static /* synthetic */ XRImage k(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRImage) ipChange.ipc$dispatch("92ba17a9", new Object[]{qz9Var});
        }
        return qz9Var.e;
    }

    public static /* synthetic */ XRImage l(qz9 qz9Var, XRImage xRImage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRImage) ipChange.ipc$dispatch("fe34199f", new Object[]{qz9Var, xRImage});
        }
        qz9Var.e = xRImage;
        return xRImage;
    }

    public static /* synthetic */ XRImage m(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRImage) ipChange.ipc$dispatch("73c6522a", new Object[]{qz9Var});
        }
        return qz9Var.f;
    }

    public static /* synthetic */ XRImage n(qz9 qz9Var, XRImage xRImage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRImage) ipChange.ipc$dispatch("62b0e43e", new Object[]{qz9Var, xRImage});
        }
        qz9Var.f = xRImage;
        return xRImage;
    }

    public static /* synthetic */ Map o(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9db19b82", new Object[]{qz9Var});
        }
        return qz9Var.c;
    }

    public static /* synthetic */ IJsEventSender p(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IJsEventSender) ipChange.ipc$dispatch("42575877", new Object[]{qz9Var});
        }
        return qz9Var.j;
    }

    public static /* synthetic */ c2x q(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c2x) ipChange.ipc$dispatch("e2a1f8df", new Object[]{qz9Var});
        }
        return qz9Var.k;
    }

    public static /* synthetic */ void r(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("125ed290", new Object[]{qz9Var});
        } else {
            qz9Var.C();
        }
    }

    public static /* synthetic */ Handler s(qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("d8f34915", new Object[]{qz9Var});
        }
        return qz9Var.h;
    }

    public static /* synthetic */ void z(byte[] bArr, Camera camera) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549739f1", new Object[]{bArr, camera});
        } else {
            Utils.getDefaultUploadFileName();
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        SkinDetectSurfaceView skinDetectSurfaceView = this.d;
        if (skinDetectSurfaceView != null) {
            skinDetectSurfaceView.pauseSkinDetect();
        }
    }

    public void B(IEmbedView iEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ac6fcd", new Object[]{this, iEmbedView});
        } else {
            this.l = iEmbedView;
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60b6f14", new Object[]{this});
        } else if (this.d.getCameraSession() != null && this.d.getCameraSession().getCamera() != null && !this.m) {
            this.m = true;
            this.d.getCameraSession().takePhoto(new Camera.PictureCallback() { // from class: tb.pz9
                @Override // android.hardware.Camera.PictureCallback
                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    qz9.z(bArr, camera);
                }
            });
        }
    }

    public final String D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49b9e795", new Object[]{this, str, str2});
        }
        File file = new File(str2);
        if (!file.exists() && !file.mkdirs()) {
            return "";
        }
        new StringBuilder("destDir is ").append(str2);
        try {
            com.taobao.android.xrappos.utils.Utils.unzipToFolder(str, str2);
            return str2 + "/model.mnn";
        } catch (Throwable unused) {
            return "";
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        SkinDetectSurfaceView skinDetectSurfaceView = this.d;
        if (skinDetectSurfaceView != null) {
            skinDetectSurfaceView.onPreviewDataCallBack((SkinDetectSurfaceView.OnPreviewDataCallBack) null);
            this.d.getCameraSession().postOnCameraHandler(new e());
            this.d.onDestroy();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc25c10", new Object[]{this});
        } else {
            this.h.post(new d());
        }
    }

    public SkinDetectSurfaceView v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinDetectSurfaceView) ipChange.ipc$dispatch("7002c7e0", new Object[]{this});
        }
        return this.d;
    }

    public FrameLayout.LayoutParams w(Activity activity, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("a42c6aed", new Object[]{this, activity, new Float(f)});
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        int[] screenSize = com.taobao.android.xrappos.utils.Utils.getScreenSize(activity);
        int i = screenSize[0];
        int i2 = screenSize[1];
        float f2 = ((i * 1.0f) / i2) - f;
        if (f2 > 0.01f) {
            i2 = (int) (i / f);
        } else if (f2 < -0.01f) {
            i = (int) (i2 * f);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        layoutParams.leftMargin = (-(i - screenSize[0])) / 2;
        layoutParams.topMargin = (-(i2 - screenSize[1])) / 2;
        return layoutParams;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3c57f3", new Object[]{this});
            return;
        }
        XRAceDownloader xRAceDownloader = XRAceDownloader.INSTANCE;
        xRAceDownloader.addTask("https://gw.alicdn.com/bao/uploaded/TB1.24GsRr0gK0jSZFnXXbRRXXa.zip", new b());
        xRAceDownloader.addTask("https://gw.alicdn.com/bao/uploaded/TB17JtDsNv1gK0jSZFFXXb0sXXa.zip", new c());
    }

    public final void y(ViewGroup viewGroup, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad74dcd", new Object[]{this, viewGroup, activity});
            return;
        }
        this.d = new SkinDetectSurfaceView(activity);
        viewGroup.addView((View) this.d, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        x();
        this.g = new SkinDetectJni();
        this.g.updateCameraState(true);
        this.d.onPreviewDataCallBack(new a());
    }
}
