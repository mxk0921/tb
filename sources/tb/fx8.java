package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.acennr.downloader.TaskCallBack;
import com.taobao.android.tb3dspace.arskindetect.FaceDetect2DGlSurfaceView;
import com.taobao.android.tb3dspace.arskindetect.FaceDetect2DJNI;
import com.taobao.android.tb3dspace.util.FileUtil;
import com.taobao.android.xr_resource.downloader.XRAceDownloader;
import com.taobao.android.xrappos.data.XRImage;
import com.taobao.android.xrappos.threads.SequenceExecutor;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fx8 implements IEmbedCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile HandlerThread z = null;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f19602a;
    public final Condition b;
    public final Condition c;
    public volatile e[] d;
    public volatile Queue<e> e;
    public final Handler r;
    public Activity s;
    public IEmbedView t;
    public volatile boolean x;
    public int f = 0;
    public boolean g = false;
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public volatile FaceDetect2DGlSurfaceView m = null;
    public volatile XRImage n = null;
    public volatile XRImage o = null;
    public volatile XRImage p = null;
    public final Object q = new Object();
    public volatile boolean u = false;
    public volatile byte[] v = null;
    public volatile byte[] w = null;
    public volatile boolean y = false;
    public volatile FaceDetect2DJNI l = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements TaskCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
                return;
            }
            StringBuilder sb = new StringBuilder("onProgress: i ");
            sb.append(i);
            sb.append(" s ");
            sb.append(f);
        }

        public void onSuccess(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
                return;
            }
            String substring = str.substring(0, str.lastIndexOf("."));
            fx8.n(fx8.this, FileUtil.unzipMnnFolderToDest(str, substring + "_detection"));
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
            String substring = str.substring(0, str.lastIndexOf("."));
            fx8.m(fx8.this, FileUtil.unzipMnnFolderToDest(str, substring + "_points"));
            "onSuccess: points_bin_path ".concat(str);
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
            String substring = str.substring(0, str.lastIndexOf("."));
            fx8.l(fx8.this, FileUtil.unzipMnnFolderToDest(str, substring + "_face_attribute"));
            "onSuccess: face_attribute_path ".concat(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements TaskCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
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
            String substring = str.substring(0, str.lastIndexOf("."));
            fx8.k(fx8.this, FileUtil.unzipMnnFolderToDest(str, substring + "_eyeball"));
            "onSuccess: face_attribute_path ".concat(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f19607a;

        static {
            t2o.a(394264597);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        public static /* synthetic */ byte[] a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("cd7be1e", new Object[]{eVar});
            }
            return eVar.f19607a;
        }

        public static /* synthetic */ byte[] b(e eVar, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("d41485f9", new Object[]{eVar, bArr});
            }
            eVar.f19607a = bArr;
            return bArr;
        }

        public e() {
            this.f19607a = null;
        }
    }

    static {
        t2o.a(394264592);
    }

    public fx8() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f19602a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.c = reentrantLock.newCondition();
        this.d = null;
        this.e = null;
        this.x = true;
        if (z == null) {
            synchronized (fx8.class) {
                try {
                    if (z == null) {
                        z = new HandlerThread("FaceDetect2DImpl");
                        z.start();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.r = new Handler(z.getLooper());
        if (this.d == null) {
            this.d = new e[5];
            for (int i = 0; i < 5; i++) {
                this.d[i] = new e(null);
            }
        }
        if (this.e == null) {
            this.e = new LinkedList();
        }
        this.x = true;
    }

    public static /* synthetic */ void C(boolean z2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571db933", new Object[]{new Boolean(z2), jSONObject});
        }
    }

    public static /* synthetic */ String k(fx8 fx8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57aa767", new Object[]{fx8Var, str});
        }
        fx8Var.k = str;
        return str;
    }

    public static /* synthetic */ String l(fx8 fx8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee826c68", new Object[]{fx8Var, str});
        }
        fx8Var.j = str;
        return str;
    }

    public static /* synthetic */ String m(fx8 fx8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d78a3169", new Object[]{fx8Var, str});
        }
        fx8Var.i = str;
        return str;
    }

    public static /* synthetic */ String n(fx8 fx8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c091f66a", new Object[]{fx8Var, str});
        }
        fx8Var.h = str;
        return str;
    }

    public final /* synthetic */ void A(byte[] bArr, XRImage xRImage, FaceDetect2DJNI faceDetect2DJNI) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a49cf30", new Object[]{this, bArr, xRImage, faceDetect2DJNI});
            return;
        }
        synchronized (this.q) {
            try {
                byte[] bArr2 = this.w;
                if (bArr2 != null) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    if (this.x && xRImage != null) {
                        xRImage.updateImage(bArr2);
                        faceDetect2DJNI.process(xRImage);
                    }
                    G(bArr2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void B(FaceDetect2DJNI faceDetect2DJNI) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e89ea2a", new Object[]{this, faceDetect2DJNI});
            return;
        }
        byte[] q = q();
        if (q != null && q.length > 0) {
            faceDetect2DJNI.updateBufferWithBytes(q);
            J();
        }
    }

    public final /* synthetic */ void D(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea7db906", new Object[]{this, jSONObject});
        } else {
            this.u = false;
        }
    }

    public final void E(byte[] bArr, byte[] bArr2, int i, int i2, boolean z2) {
        byte[] I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4db3e79", new Object[]{this, bArr, bArr2, new Integer(i), new Integer(i2), new Boolean(z2)});
        } else if (bArr != null && bArr2 != null && (I = I(bArr, i, i2, z2)) != null) {
            System.arraycopy(I, 0, bArr2, 0, I.length);
        }
    }

    public final void F(Handler handler, final byte[] bArr, final FaceDetect2DJNI faceDetect2DJNI, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31304c4", new Object[]{this, handler, bArr, faceDetect2DJNI, new Integer(i), new Integer(i2)});
        } else if (!t() && handler != null && bArr != null && bArr.length != 0 && faceDetect2DJNI != null) {
            final XRImage xRImage = this.p;
            handler.post(new Runnable() { // from class: tb.xw8
                @Override // java.lang.Runnable
                public final void run() {
                    fx8.this.A(bArr, xRImage, faceDetect2DJNI);
                }
            });
            SequenceExecutor.getInstance().post(new Runnable() { // from class: tb.yw8
                @Override // java.lang.Runnable
                public final void run() {
                    fx8.this.B(faceDetect2DJNI);
                }
            });
        }
    }

    public void G(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3354c1", new Object[]{this, bArr});
        } else if (!t() && bArr != null && this.d != null) {
            this.f19602a.lock();
            while (((LinkedList) this.e).size() >= 5) {
                try {
                    this.b.await();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            int p = p();
            e eVar = this.d[p];
            if (eVar == null) {
                eVar = new e(null);
                this.d[p] = eVar;
            }
            byte[] a2 = e.a(eVar);
            if (a2 == null || a2.length != bArr.length) {
                e.b(eVar, new byte[bArr.length]);
                a2 = e.a(eVar);
            }
            System.arraycopy(bArr, 0, a2, 0, bArr.length);
            ((LinkedList) this.e).add(eVar);
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e3e5d6", new Object[]{this});
            return;
        }
        this.m.resumeCameraRenderView(this.g ? 1 : 0, new vbq() { // from class: tb.vw8
            @Override // tb.vbq
            public final void onComplete(boolean z2, JSONObject jSONObject) {
                fx8.C(z2, jSONObject);
            }
        });
    }

    public final byte[] I(byte[] bArr, int i, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("65acfa37", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z2)});
        }
        if (this.n == null) {
            if (this.l != null) {
                this.l.initFaceDetect2DMnnPath(this.j, this.h, this.i, this.k);
            }
            this.n = new XRImage(i, i2, XRImage.Config.YUV_NV21);
        }
        if (this.o == null) {
            this.o = new XRImage(i2, i, XRImage.Config.RGBA);
        }
        if (this.p == null) {
            this.p = new XRImage(i2, i, XRImage.Config.RGBA);
        }
        XRImage xRImage = this.n;
        XRImage xRImage2 = this.o;
        if (xRImage == null || xRImage2 == null) {
            return null;
        }
        xRImage.updateImage(bArr);
        XRImage.convertYuvToRGBAAndRotateClockWise90(this.n, this.o, z2);
        return xRImage2.getData(this.v);
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c8f1e", new Object[]{this});
            return;
        }
        FaceDetect2DJNI faceDetect2DJNI = this.l;
        if (faceDetect2DJNI != null && !this.u) {
            com.alibaba.fastjson.JSONObject cameraDataJsonConfig = faceDetect2DJNI.getCameraDataJsonConfig();
            if (this.y) {
                try {
                    ByteBuffer buffer = faceDetect2DJNI.getBuffer();
                    if (buffer != null) {
                        cameraDataJsonConfig.put("capturedImage", (Object) buffer);
                    }
                } catch (Throwable th) {
                    Log.getStackTraceString(th);
                }
            }
            if (this.t != null) {
                if (!this.u) {
                    this.u = true;
                }
                try {
                    this.t.sendEvent("aRFrame", cameraDataJsonConfig, new IEmbedCallback() { // from class: tb.ex8
                        @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
                        public final void onResponse(com.alibaba.fastjson.JSONObject jSONObject) {
                            fx8.this.D(jSONObject);
                        }
                    });
                } catch (Throwable th2) {
                    Log.getStackTraceString(th2);
                }
            }
        }
    }

    public void K(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2efadc1", new Object[]{this, new Boolean(z2)});
        } else {
            this.g = z2;
        }
    }

    public void L(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7ac9d5", new Object[]{this, new Boolean(z2)});
        } else {
            this.y = z2;
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2682ce47", new Object[]{this});
        } else if (this.x) {
            synchronized (this.q) {
                try {
                    if (this.x) {
                        this.x = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        M();
        if (this.m != null) {
            this.m.getCameraSession().postOnCameraHandler(new Runnable() { // from class: tb.dx8
                @Override // java.lang.Runnable
                public final void run() {
                    fx8.this.u();
                }
            });
        }
        if (this.l != null) {
            this.l.destroy();
            this.l = null;
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
    public void onResponse(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435f409", new Object[]{this, jSONObject});
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3c735fa", new Object[]{this})).intValue();
        }
        int i = this.f;
        int i2 = 1 + i;
        this.f = i2;
        if (i2 >= 5) {
            this.f = 0;
        }
        return i;
    }

    public byte[] q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ca706e86", new Object[]{this});
        }
        if (t()) {
            return null;
        }
        this.f19602a.lock();
        while (((LinkedList) this.e).size() == 0) {
            try {
                this.c.await();
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    this.b.signalAll();
                    this.f19602a.unlock();
                }
            }
        }
        e eVar = (e) ((LinkedList) this.e).poll();
        if (eVar == null) {
            return null;
        }
        return e.a(eVar);
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a3c57f3", new Object[]{this});
            return;
        }
        SequenceExecutor.getInstance().post(new Runnable() { // from class: tb.zw8
            @Override // java.lang.Runnable
            public final void run() {
                fx8.this.v();
            }
        });
        SequenceExecutor.getInstance().post(new Runnable() { // from class: tb.ax8
            @Override // java.lang.Runnable
            public final void run() {
                fx8.this.w();
            }
        });
        SequenceExecutor.getInstance().post(new Runnable() { // from class: tb.bx8
            @Override // java.lang.Runnable
            public final void run() {
                fx8.this.x();
            }
        });
        SequenceExecutor.getInstance().post(new Runnable() { // from class: tb.cx8
            @Override // java.lang.Runnable
            public final void run() {
                fx8.this.y();
            }
        });
    }

    public void s(ViewGroup viewGroup, Activity activity, IEmbedView iEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6f6b37", new Object[]{this, viewGroup, activity, iEmbedView});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("ARTry", 19999, "FaceDetct2DImpl", "", null, null).build());
        } catch (Throwable unused) {
        }
        if (this.l == null) {
            this.l = new FaceDetect2DJNI();
        }
        this.s = activity;
        this.m = new FaceDetect2DGlSurfaceView(this.s, this.y);
        viewGroup.addView((View) this.m, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        r();
        this.t = iEmbedView;
        this.m.onPreviewDataCallBack(new FaceDetect2DGlSurfaceView.OnPreviewDataCallBack() { // from class: tb.ww8
            public final void onPreviewData(byte[] bArr, int i, int i2, boolean z2) {
                fx8.this.z(bArr, i, i2, z2);
            }
        });
    }

    public final boolean t() {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d65bd1a", new Object[]{this})).booleanValue();
        }
        synchronized (this.q) {
            z2 = true ^ this.x;
        }
        return z2;
    }

    public final /* synthetic */ void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402578f9", new Object[]{this});
            return;
        }
        this.m.onPreviewDataCallBack((FaceDetect2DGlSurfaceView.OnPreviewDataCallBack) null);
        if (this.n != null) {
            this.n.destroy();
            this.n = null;
        }
        if (this.o != null) {
            this.o.destroy();
            this.o = null;
        }
        if (this.p != null) {
            this.p.destroy();
            this.p = null;
        }
        this.m.onDestroy();
        if (this.v != null) {
            this.v = null;
        }
        synchronized (this.q) {
            try {
                if (this.w != null) {
                    this.w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7db101", new Object[]{this});
        } else {
            XRAceDownloader.INSTANCE.addTask("https://gw.alicdn.com/bao/uploaded/TB1.24GsRr0gK0jSZFnXXbRRXXa.zip", new a());
        }
    }

    public final /* synthetic */ void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8bc882", new Object[]{this});
        } else {
            XRAceDownloader.INSTANCE.addTask("https://gw.alicdn.com/bao/uploaded/TB17JtDsNv1gK0jSZFFXXb0sXXa.zip", new b());
        }
    }

    public final /* synthetic */ void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f99e003", new Object[]{this});
        } else {
            XRAceDownloader.INSTANCE.addTask("https://dtmall-tel.alicdn.com/edgeComputingConfig/upload_models/1583239399098/model.zip", new c());
        }
    }

    public final /* synthetic */ void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa7f784", new Object[]{this});
        } else {
            XRAceDownloader.INSTANCE.addTask("https://dtmall-tel.alicdn.com/edgeComputingConfig/upload_models/1583223320699/model.mnn.zip", new d());
        }
    }

    public final /* synthetic */ void z(byte[] bArr, int i, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0abfb68", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z2)});
        } else if (!t() && !TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.i) && !TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.k) && this.l != null) {
            this.l.updateImagePreviewSize(i2, i);
            int i3 = (i * i2) << 2;
            if (this.v == null || this.v.length != i3) {
                this.v = new byte[i3];
            }
            synchronized (this.q) {
                try {
                    if (this.w != null) {
                        if (this.w.length != i3) {
                        }
                    }
                    this.w = new byte[i3];
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                E(bArr, this.v, i, i2, z2);
                F(this.r, this.v, this.l, i2, i);
            } catch (Throwable th2) {
                th2.toString();
            }
        }
    }
}
