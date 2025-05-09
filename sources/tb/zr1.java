package tb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class zr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f32962a;
    public JSONObject b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;

    static {
        t2o.a(481297571);
    }

    public zr1() {
        this(null, 1, null);
    }

    public abstract void a();

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca3b6765", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.b;
    }

    public abstract int[] d();

    public final float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("113c8206", new Object[]{this})).floatValue();
        }
        return this.j;
    }

    public final float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("114a9987", new Object[]{this})).floatValue();
        }
        return this.i;
    }

    public abstract View g();

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed04d68a", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("81f3f28f", new Object[]{this});
        }
        return this.f32962a;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a04563", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7446ae", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8a11cc0", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff933d6b", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f6a9d1f", new Object[]{this});
            return;
        }
        View g = g();
        ViewParent parent = g.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(g);
        }
    }

    public abstract void o(JSONObject jSONObject);

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2844108d", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d687c532", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed40360", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public final void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public final void t(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c620f176", new Object[]{this, new Float(f)});
        } else {
            this.j = f;
        }
    }

    public final void u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d5ca15", new Object[]{this, new Float(f)});
        } else {
            this.i = f;
        }
    }

    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b01985", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6d4682", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3c84d5", new Object[]{this, jSONObject});
        } else {
            this.f32962a = jSONObject;
        }
    }

    public final void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da255172", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        g().setVisibility(i);
    }

    public final void z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d74536", new Object[]{this, str, str2});
        } else if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            JSONObject jSONObject = this.f32962a;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                this.f32962a = jSONObject;
            }
            jSONObject.put((JSONObject) str, str2);
        }
    }

    public zr1(String str) {
    }

    public /* synthetic */ zr1(String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str);
    }
}
