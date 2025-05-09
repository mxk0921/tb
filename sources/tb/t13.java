package tb;

import android.app.Activity;
import android.os.Build;
import android.util.Size;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.camera.AutoFitSurfaceView;
import com.etao.feimagesearch.cip.camera2.Camera2Wrapper;
import com.etao.feimagesearch.structure.capture.CaptureManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class t13 implements m7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f28399a;
    public final AutoFitSurfaceView b;
    public final CaptureManager c;
    public final x9d d;
    public boolean e = false;
    public final boolean f = lg4.q1();
    public final SurfaceHolder.Callback g;
    public int h;
    public int i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements SurfaceHolder.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            agh.h("AutoSize_CameraViewHolder", "surfaceChanged: width=" + i2 + ", height=" + i3 + ", format=" + i);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
            } else {
                t13.b(t13.this, false);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
                return;
            }
            agh.r("PltCamera", "AutoSize_CameraViewHolder", "surfaceCreated");
            t13.b(t13.this, true);
            t13.c(t13.this).c(surfaceHolder);
            t13.d(t13.this).W();
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraViewHolder$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            t13.e(t13.this).setLayoutParams(layoutParams);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                agh.h("AutoSize_CameraViewHolder", "onLayoutChange: unchanged");
            } else {
                t13.f(t13.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/camera/CameraViewHolder$4");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                t13.f(t13.this);
            }
        }
    }

    static {
        t2o.a(481296843);
        t2o.a(481296836);
    }

    public t13(Activity activity, FrameLayout frameLayout, AutoFitSurfaceView autoFitSurfaceView, CaptureManager captureManager) {
        a aVar = new a();
        this.b = autoFitSurfaceView;
        if (lg4.n1()) {
            vpt.g("setSurfaceView", new b());
        }
        this.c = captureManager;
        this.f28399a = frameLayout;
        frameLayout.addOnLayoutChangeListener(new c());
        x9d g = g(activity);
        this.d = g;
        captureManager.p0(g);
        g.k(this);
        SurfaceHolder holder = autoFitSurfaceView.getHolder();
        autoFitSurfaceView.registerCallback(aVar);
        holder.setType(3);
    }

    public static /* synthetic */ boolean b(t13 t13Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69be7adc", new Object[]{t13Var, new Boolean(z)})).booleanValue();
        }
        t13Var.e = z;
        return z;
    }

    public static /* synthetic */ x9d c(t13 t13Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x9d) ipChange.ipc$dispatch("f2fd27e4", new Object[]{t13Var});
        }
        return t13Var.d;
    }

    public static /* synthetic */ CaptureManager d(t13 t13Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("2315ef32", new Object[]{t13Var});
        }
        return t13Var.c;
    }

    public static /* synthetic */ AutoFitSurfaceView e(t13 t13Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AutoFitSurfaceView) ipChange.ipc$dispatch("e4f8fc82", new Object[]{t13Var});
        }
        return t13Var.b;
    }

    public static /* synthetic */ void f(t13 t13Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d6487e", new Object[]{t13Var});
        } else {
            t13Var.o();
        }
    }

    @Override // tb.m7m
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f93f7c", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.h = i;
        this.i = i2;
        vpt.g("onCameraSizeChange", new d());
    }

    public final x9d g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x9d) ipChange.ipc$dispatch("4b65b563", new Object[]{this, activity});
        }
        if (Build.VERSION.SDK_INT < 24 || !lg4.K() || by2.Companion.a(activity)) {
            return new d23(activity, this.f);
        }
        try {
            return new Camera2Wrapper(activity);
        } catch (Exception unused) {
            return new d23(activity, this.f);
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed8ac39c", new Object[]{this})).intValue();
        }
        return this.f28399a.getHeight();
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("964d2a65", new Object[]{this})).intValue();
        }
        return this.f28399a.getWidth();
    }

    public x9d j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x9d) ipChange.ipc$dispatch("6c59ad4d", new Object[]{this});
        }
        return this.d;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.d.release();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.d.closeCamera();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        agh.h("AutoSize_CameraViewHolder", "onResume");
        this.d.d();
        agh.r("PltCamera", "AutoSize_CameraViewHolder", "onResume mSurfaceReady = " + this.e);
        SurfaceHolder holder = this.b.getHolder();
        if (!this.f) {
            this.d.c(holder);
        } else if (this.e) {
            this.d.c(holder);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa49079", new Object[]{this});
        } else {
            this.d.stopPreview();
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20383cc", new Object[]{this});
            return;
        }
        AutoFitSurfaceView autoFitSurfaceView = this.b;
        if (autoFitSurfaceView != null && this.f28399a != null && autoFitSurfaceView.getLayoutParams() != null && this.i != 0 && this.h != 0 && this.f28399a.getHeight() != 0 && this.f28399a.getWidth() != 0) {
            this.c.q0(new Size(this.h, this.i));
            this.c.r0(new Size(this.f28399a.getWidth(), this.f28399a.getHeight()));
            agh.h("AutoSize_CameraViewHolder", "updateSurfaceSize mCameraWidth:" + this.h + ", mCameraHeight:" + this.i + " rootWidth " + this.f28399a.getWidth() + ", rootHeight " + this.f28399a.getHeight());
            this.b.setAspectRatio(this.h, this.i, this.d.m());
            this.b.requestLayout();
        }
    }
}
