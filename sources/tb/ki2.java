package tb;

import android.graphics.Path;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ki2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public mt4 f22686a;
    public mt4 b;
    public mt4 c;
    public mt4 d;
    public mt4 e;
    public mt4 f;

    static {
        t2o.a(986710128);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9433cf12", new Object[]{this});
        } else if (this.f22686a == null || this.b == null || this.c == null || this.d == null || this.e == null || this.f == null) {
            throw new IllegalArgumentException("BorderClip coordinates are not enough");
        }
    }

    public void b(Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba60709", new Object[]{this, path});
            return;
        }
        a();
        path.reset();
        path.moveTo(this.f22686a.a(), this.f22686a.b());
        path.lineTo(this.b.a(), this.b.b());
        path.lineTo(this.c.a(), this.c.b());
        path.lineTo(this.f.a(), this.f.b());
        path.lineTo(this.e.a(), this.e.b());
        path.lineTo(this.d.a(), this.d.b());
        path.close();
    }

    public void c(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599e9d62", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.c = new mt4(f, f2);
        }
    }

    public void d(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d741e71", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.b = new mt4(f, f2);
        }
    }

    public void e(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7557a9", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.f22686a = new mt4(f, f2);
        }
    }

    public void f(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26d74f2", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.f = new mt4(f, f2);
        }
    }

    public void g(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8038e1", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.e = new mt4(f, f2);
        }
    }

    public void h(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec8b39", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.d = new mt4(f, f2);
        }
    }
}
