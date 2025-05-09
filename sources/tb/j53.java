package tb;

import android.content.DialogInterface;
import androidx.core.app.ActivityCompat;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.view.CameraZoomView;
import com.taobao.taobao.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class j53 extends mz1<k53> implements ivm, CameraZoomView.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int PERMISSION_CODE = 100;
    public static final String TAG = "CaptureCameraPresenterV2";
    public boolean c;
    public boolean d;
    public boolean e;
    public final boolean f = lg4.P0();
    public final AtomicBoolean g = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296483);
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

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureCameraPresenterV2$openCameraImpl$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            agh.r("PltCamera", j53.TAG, "OnPermissionGranted");
            j53.C(j53.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/CaptureCameraPresenterV2$openCameraImpl$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            agh.r("PltCamera", j53.TAG, "OnPermissionDenied");
            j53.D(j53.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            nmj.d(((k53) j53.y(j53.this)).I(), 0);
            agh.r("PltCamera", j53.TAG, "jump to permission guide page");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else if (dialogInterface != null) {
                dialogInterface.cancel();
            }
        }
    }

    static {
        t2o.a(481296482);
        t2o.a(481296837);
        t2o.a(481297526);
    }

    public static final /* synthetic */ void C(j53 j53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacb680a", new Object[]{j53Var});
        } else {
            j53Var.F();
        }
    }

    public static final /* synthetic */ void D(j53 j53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff33baf2", new Object[]{j53Var});
        } else {
            j53Var.I();
        }
    }

    public static /* synthetic */ Object ipc$super(j53 j53Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.v();
            return null;
        } else if (hashCode == 267248023) {
            super.n();
            return null;
        } else if (hashCode == 797441118) {
            super.s();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/dynamic/CaptureCameraPresenterV2");
        }
    }

    public static final /* synthetic */ d32 y(j53 j53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d32) ipChange.ipc$dispatch("99e2328f", new Object[]{j53Var});
        }
        return j53Var.f24401a;
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88367510", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa95b16", new Object[]{this});
            return;
        }
        this.d = true;
        K();
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6091ae", new Object[]{this});
        } else {
            kl7.a(((k53) this.f24401a).I(), Localization.q(R.string.taobao_app_1007_title), lg4.M1(Localization.q(R.string.taobao_app_1007_1_content)), Localization.q(R.string.taobao_app_1007_1_18965), new d(), Localization.q(R.string.irp_error_message_cancel_text), e.INSTANCE);
        }
    }

    @Override // tb.ivm
    public void h(byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11a0636", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
            return;
        }
        try {
            if (!this.g.get()) {
                this.g.set(true);
            }
            if (((k53) this.f24401a).m().L() && ((k53) this.f24401a).m().D() && ((k53) this.f24401a).m().N()) {
                boolean M4 = lg4.M4();
                if (!this.b || !M4) {
                    for (hdd hddVar : ((k53) this.f24401a).m().A()) {
                        hddVar.d(bArr, i, i2, ((k53) this.f24401a).T(), ((k53) this.f24401a).S(), i3, z, i4);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.view.CameraZoomView.c
    public void i(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1eea957", new Object[]{this, new Float(f)});
        } else {
            ((k53) this.f24401a).e0(f);
        }
    }

    @Override // tb.mz1
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.n();
        if (this.f) {
            agh.r("PltCamera", TAG, "try openCameraImpl onCreate");
            G();
        }
    }

    @Override // tb.mz1
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.d) {
            ((k53) this.f24401a).W();
        }
    }

    @Override // tb.mz1
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.s();
        if (this.d) {
            H();
        }
    }

    @Override // tb.mz1
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.v();
        G();
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82fb31d6", new Object[]{this});
        } else if (u7m.e(((k53) this.f24401a).I())) {
            F();
        } else if (!this.c) {
            this.c = true;
            boolean w4 = lg4.w4();
            agh.r("PltCamera", TAG, ckf.p("request camera permission isPermissionReqOptEnable=", Boolean.valueOf(w4)));
            if (w4) {
                com.taobao.runtimepermission.a.c(caa.c(), new String[]{t4p.CAMERA}).t("biz_imgsearch").A(new b()).z(new c()).x(true).w(Localization.q(R.string.feis_request_camera_explain)).y(lg4.t3()).m();
            } else {
                ActivityCompat.requestPermissions(((k53) this.f24401a).I(), new String[]{t4p.CAMERA}, 100);
            }
        }
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c2b3c2", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, ckf.p("pauseCamera cameraRunning=", Boolean.valueOf(this.e)));
        if (this.e) {
            ((k53) this.f24401a).b0();
            this.e = false;
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b83d39", new Object[]{this});
            return;
        }
        agh.r("PltCamera", TAG, ckf.p("resumeCamera cameraRunning=", Boolean.valueOf(this.e)));
        if (!this.e) {
            this.e = true;
            ((k53) this.f24401a).X();
        }
    }
}
