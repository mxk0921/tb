package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cfx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f17036a;
    public Drawable c;
    public float d;
    public View e;
    public boolean f;
    public boolean g;
    public String h;
    public int b = 0;
    public boolean i = false;
    public g1a<oc3, xhv> j = null;

    static {
        t2o.a(479199281);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1061a262", new Object[]{this})).intValue();
        }
        return 0;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbc40046", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    public Drawable c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("4a9bf8d3", new Object[]{this});
        }
        return this.c;
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4d62fd5", new Object[]{this});
        }
        return this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78836c1d", new Object[]{this});
        }
        return this.h;
    }

    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6fd2708", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5c8ce17", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f20b1da4", new Object[]{this})).floatValue();
        }
        return this.f17036a;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5943006d", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed3f5755", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void k(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebda370", new Object[]{this, drawable});
        } else {
            this.c = drawable;
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadc4449", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98688b6b", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44ad488", new Object[]{this, new Integer(i)});
        }
    }

    public void o(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb50b813", new Object[]{this, view});
        } else {
            this.e = view;
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c771f9", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void q(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8bad61c", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258dffb9", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874dfe6b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void t(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aef0d00", new Object[]{this, new Float(f)});
        } else {
            this.f17036a = f;
        }
    }

    public g1a<oc3, xhv> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("ec0e8370", new Object[]{this});
        }
        return this.j;
    }

    public void v(g1a<oc3, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13b1243e", new Object[]{this, g1aVar});
        } else {
            this.j = g1aVar;
        }
    }
}
