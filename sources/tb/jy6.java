package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvas;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.adapter.OnCanvasErrorListener;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import com.taobao.android.riverlogger.RVLLevel;
import tb.gjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jy6 implements gjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FCanvas f22281a;
    public FCanvasInstance b;
    public final Context c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements hih {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(jy6 jy6Var) {
        }

        @Override // tb.hih
        public void a(int i, String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f68329c", new Object[]{this, new Integer(i), str, str2, th});
                return;
            }
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "themis:renderer", str + " | " + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements spk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gjd.b f22282a;

        public b(jy6 jy6Var, gjd.b bVar) {
            this.f22282a = bVar;
        }

        @Override // tb.spk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adb8aece", new Object[]{this});
                return;
            }
            gjd.a aVar = this.f22282a.e;
            if (aVar != null) {
                aVar.onFirstFrame();
            }
            lcn.f(RVLLevel.Error, "themis:renderer", "notify that first frame called");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements OnCanvasErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(jy6 jy6Var) {
        }

        @Override // com.taobao.android.fcanvas.integration.adapter.OnCanvasErrorListener
        public void onCanvasError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6935094c", new Object[]{this, str, str2});
                return;
            }
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "themis:renderer", str + " | " + str2);
        }
    }

    public jy6(String str, Context context, ExternalAdapterImageProvider externalAdapterImageProvider) {
        this.c = context;
        this.d = str;
        this.f22281a = new FCanvas.b().f(externalAdapterImageProvider).g(new a(this)).e();
    }

    @Override // tb.gjd
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e37ba7b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance != null) {
            fCanvasInstance.s(i, i2, i3, i4);
        }
    }

    @Override // tb.gjd
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3c7432", new Object[]{this, new Boolean(z)});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance != null) {
            fCanvasInstance.setFixedFrameRate(z);
            lcn.f(RVLLevel.Error, "themis:renderer", "themis canvas renderer set fixed frame rate success");
        }
    }

    @Override // tb.gjd
    public Bitmap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8d66d137", new Object[]{this});
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance == null) {
            lcn.f(RVLLevel.Error, "themis:renderer", "make snapshot failed because of invalid state");
            return null;
        }
        try {
            return fCanvasInstance.n();
        } catch (Throwable th) {
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "themis:renderer", "make snapshot failed because of " + th.getMessage());
            return null;
        }
    }

    public void d(int i, int i2, float f, FCanvasInstance.RenderMode renderMode, gjd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebba070", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), renderMode, aVar});
            return;
        }
        gjd.b bVar = new gjd.b();
        bVar.f20041a = i;
        bVar.b = i2;
        bVar.c = f;
        bVar.d = renderMode;
        bVar.e = aVar;
        bVar.g = false;
        e(bVar);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance != null) {
            fCanvasInstance.l();
        }
        lcn.f(RVLLevel.Error, "themis:renderer", "themis canvas renderer destroyed success");
    }

    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("260878dc", new Object[]{this});
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance != null) {
            return fCanvasInstance.m();
        }
        return null;
    }

    public void h(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d7c21", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.b != null) {
            FCanvasInstance.e eVar = new FCanvasInstance.e();
            eVar.f7651a = z;
            eVar.b = z2;
            this.b.u(eVar);
        }
    }

    @Override // tb.gjd
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance != null) {
            fCanvasInstance.q();
        }
    }

    @Override // tb.gjd
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        FCanvasInstance fCanvasInstance = this.b;
        if (fCanvasInstance != null) {
            fCanvasInstance.t();
        }
    }

    public void e(gjd.b bVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cae3b2", new Object[]{this, bVar});
        } else if (bVar == null) {
            lcn.f(RVLLevel.Error, "themis:renderer", "invalid params");
        } else {
            FCanvasInstance.d a2 = new FCanvasInstance.d(bVar.f20041a, bVar.b, bVar.c).q(true).r(false).p(FCanvasInstance.ContainerType.MiniGame).a(false);
            FCanvasInstance.RenderMode renderMode = bVar.d;
            if (renderMode == null) {
                renderMode = FCanvasInstance.RenderMode.surface;
            }
            FCanvasInstance.d w = a2.v(renderMode).s(false).t(new c(this)).u(new b(this, bVar)).w(bVar.g);
            if (TextUtils.isEmpty(this.d)) {
                str = "default";
            } else {
                str = this.d + "_default";
            }
            this.b = this.f22281a.createInstance(this.c, str, bVar.f, w.o());
            lcn.f(RVLLevel.Error, "themis:renderer", "themis canvas renderer (" + str + ") create success, is fixed frame rate:" + bVar.g);
        }
    }
}
