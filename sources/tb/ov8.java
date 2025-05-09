package tb;

import android.app.Activity;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.camera.AutoFitSurfaceView;
import com.etao.feimagesearch.structure.capture.CaptureManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ov8 implements l7m, ivm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f25679a;
    public final t13 b;
    public volatile int c;
    public volatile int d;
    public boolean e = false;
    public volatile ivm f = null;

    static {
        t2o.a(481296867);
        t2o.a(481296835);
        t2o.a(481296837);
    }

    public ov8(Activity activity, FrameLayout frameLayout, AutoFitSurfaceView autoFitSurfaceView, CaptureManager captureManager) {
        this.f25679a = activity;
        t13 t13Var = new t13(activity, frameLayout, autoFitSurfaceView, captureManager);
        this.b = t13Var;
        t13Var.j().l(this);
        t13Var.j().a(this);
    }

    @Override // tb.l7m
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ceaf48", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    @Override // tb.l7m
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7682732", new Object[]{this});
        } else {
            agh.r("AutoDetect", "FEISCameraRenderer", "onCameraOpenFailed");
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c43c7b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b.j().i(z);
        this.b.m();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a674406d", new Object[]{this})).intValue();
        }
        return this.b.h();
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acc84f74", new Object[]{this})).intValue();
        }
        return this.b.i();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e96c99", new Object[]{this})).booleanValue();
        }
        return this.b.j().isOpened();
    }

    @Override // tb.ivm
    public void h(byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11a0636", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
        } else if (i2 != 0 && i != 0) {
            try {
                if (this.f != null) {
                    this.f.h(bArr, i, i2, i3, z, i4);
                }
            } catch (Exception e) {
                agh.d("FEISCameraRenderer", "onFrame frameCallback error", e);
            }
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12f522da", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82b3135f", new Object[]{this})).booleanValue();
        }
        return this.b.j().f();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.b.k();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.b.l();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        agh.h("FEISCameraRenderer", "onResume");
        this.b.m();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa49079", new Object[]{this});
            return;
        }
        agh.h("FEISCameraRenderer", "pausePreview");
        this.b.n();
    }

    public void o(ivm ivmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9284450", new Object[]{this, ivmVar});
        } else {
            this.f = ivmVar;
        }
    }

    public void p(qv8 qv8Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e42af37", new Object[]{this, qv8Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.c = this.b.i();
        this.d = this.b.h();
        this.b.j().e(new rv8(qv8Var, z, this.c, this.d, z2, this.f25679a.hashCode()));
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2caba0", new Object[]{this});
            return;
        }
        this.b.j().b();
        this.b.m();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35f0b", new Object[]{this});
            return;
        }
        this.e = false;
        this.b.j().j(false);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d762c1", new Object[]{this});
            return;
        }
        this.e = true;
        this.b.j().j(true);
    }

    public void t(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3958e6c1", new Object[]{this, new Float(f)});
        } else {
            this.b.j().h(f);
        }
    }

    @Override // tb.l7m
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc15974", new Object[]{this});
            return;
        }
        this.e = false;
        agh.r("AutoDetect", "FEISCameraRenderer", "onCameraOpened");
    }
}
