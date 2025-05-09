package com.etao.feimagesearch.capture.tool.camera;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.a;
import tb.c2a;
import tb.ckf;
import tb.elb;
import tb.lg4;
import tb.njg;
import tb.pg1;
import tb.t2o;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseCameraHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4705a;
    public volatile elb b;
    public volatile c2a<? super byte[], ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super Integer, xhv> c;
    public volatile boolean f;
    public volatile Size h;
    public volatile boolean i;
    public volatile boolean j;
    public final njg d = a.b(BaseCameraHolder$cameraProcessThread$2.INSTANCE);
    public final njg e = a.b(new BaseCameraHolder$cameraProcessHandler$2(this));
    public volatile Size g = new Size(1280, 720);
    public final Object k = new Object();

    static {
        t2o.a(481296805);
    }

    public BaseCameraHolder(Activity activity, elb elbVar, c2a<? super byte[], ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super Integer, xhv> c2aVar) {
        ckf.g(activity, "activity");
        this.f4705a = activity;
        this.b = elbVar;
        this.c = c2aVar;
    }

    public abstract void a(boolean z);

    public final Activity b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f4705a;
    }

    public final Size c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("ac858318", new Object[]{this});
        }
        return this.g;
    }

    public final Handler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cf56b949", new Object[]{this});
        }
        return (Handler) this.e.getValue();
    }

    public final HandlerThread e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("ffc7e8b7", new Object[]{this});
        }
        return (HandlerThread) this.d.getValue();
    }

    public final elb f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (elb) ipChange.ipc$dispatch("70938ac0", new Object[]{this});
        }
        return this.b;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e185dba4", new Object[]{this})).intValue();
        }
        if (!lg4.g4()) {
            return 0;
        }
        return g(this.f4705a);
    }

    public final c2a<byte[], Integer, Integer, Integer, Boolean, Integer, xhv> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c2a) ipChange.ipc$dispatch("d0c764dc", new Object[]{this});
        }
        return this.c;
    }

    public final Size j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("3fbe3166", new Object[]{this});
        }
        return this.h;
    }

    public final Object k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("93224059", new Object[]{this});
        }
        return this.k;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e7ed3e", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3f7a26f", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f09005da", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public abstract void o(boolean z);

    public abstract void p(boolean z);

    public abstract void q(boolean z, SurfaceHolder surfaceHolder);

    public final void r(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b82c6a", new Object[]{this, runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        d().post(runnable);
    }

    public final void s(Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d7b8ea", new Object[]{this, size});
            return;
        }
        ckf.g(size, "<set-?>");
        this.g = size;
    }

    public final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74b9286", new Object[]{this, new Boolean(z)});
        }
    }

    public final void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5d8aa2", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d6af01", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de46186", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public abstract void x(w1a<? super Bitmap, ? super Boolean, ? super Boolean, xhv> w1aVar);

    public final void y(Size size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68dc5398", new Object[]{this, size});
            return;
        }
        ckf.g(size, "size");
        this.h = size;
    }

    public final int g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0b11f02", new Object[]{this, activity})).intValue();
        }
        Object systemService = activity.getSystemService(pg1.ATOM_EXT_window);
        if (systemService != null) {
            int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
            if (rotation == 0) {
                return 0;
            }
            if (rotation == 1) {
                return 90;
            }
            if (rotation != 2) {
                return rotation != 3 ? 90 : 270;
            }
            return 180;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
