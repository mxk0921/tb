package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class zi9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f32788a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float i = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;

    static {
        t2o.a(481297400);
    }

    public zi9(MotionEvent motionEvent, int i) {
        ckf.g(motionEvent, "event");
        a(motionEvent, i);
        float f = this.f32788a;
        this.e = f;
        float f2 = this.b;
        this.f = f2;
        this.c = f;
        this.d = f2;
    }

    public final void a(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf6a979", new Object[]{this, motionEvent, new Integer(i)});
            return;
        }
        ckf.g(motionEvent, "event");
        float x = motionEvent.getX(i) - this.f32788a;
        float y = motionEvent.getY(i) - this.b;
        this.g = x;
        this.h = y;
        Math.sqrt(f22.b(x) + f22.b(y));
        this.c = this.f32788a;
        this.d = this.b;
        this.f32788a = motionEvent.getX(i);
        float y2 = motionEvent.getY(i);
        this.b = y2;
        this.i = (float) Math.sqrt(f22.b(this.e - this.f32788a) + f22.b(this.f - y2));
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25ca5327", new Object[]{this})).floatValue();
        }
        return this.f32788a;
    }

    public final float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25d86aa8", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76eaa543", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public final float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76f8bcc4", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public final float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ff8f9a3", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90071124", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public final float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68f9fe9a", new Object[]{this})).floatValue();
        }
        return this.i;
    }

    public final float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("599c2ace", new Object[]{this})).floatValue();
        }
        return this.g;
    }

    public final float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("481f314f", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        this.e = this.f32788a;
        this.f = this.b;
    }
}
