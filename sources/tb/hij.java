package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hij implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_AUTO_SIZE = "enableAutoSize";
    public static final String KEY_BACKGROUND_COLOR = "backgroundColor";
    public static final String KEY_CLOSE_BUTTON_V3 = "closeButtonStyleV3";
    public static final String KEY_CORNER_RADIUS = "cornerRadius";
    public static final String KEY_HEIGHT_RATIO = "heightRatio";
    public static final String KEY_NEED_CLOSE_BUTTON = "showCloseButton";
    public static final String KEY_STYLE = "style";

    /* renamed from: a  reason: collision with root package name */
    public iij f20668a;
    public String d;
    public Boolean e;
    public Boolean f;
    public String b = "slideDown";
    public Float c = null;
    public float g = 0.5f;
    public float h = 0.8f;
    public boolean i = true;
    public boolean j = true;
    public boolean k = true;

    static {
        t2o.a(81789351);
    }

    /* renamed from: a */
    public hij clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hij) ipChange.ipc$dispatch("27fde9eb", new Object[]{this});
        }
        hij hijVar = new hij();
        hijVar.b = this.b;
        hijVar.d = this.d;
        hijVar.g = this.g;
        hijVar.e = this.e;
        hijVar.f = this.f;
        hijVar.h = this.h;
        hijVar.i = this.i;
        hijVar.c = this.c;
        hijVar.j = this.j;
        hijVar.f20668a = this.f20668a.clone();
        return hijVar;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9e9ebfe", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db947ed1", new Object[]{this});
        }
        return this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66ad4fba", new Object[]{this});
        }
        return this.d;
    }

    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bda37d8", new Object[]{this})).floatValue();
        }
        return this.g;
    }

    public iij f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iij) ipChange.ipc$dispatch("ba70c916", new Object[]{this});
        }
        return this.f20668a;
    }

    public float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94f0fcb", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public Float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("7d1f92d6", new Object[]{this});
        }
        return this.c;
    }

    public Boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("639e8d87", new Object[]{this});
        }
        return this.e;
    }

    public Boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f1b3382", new Object[]{this});
        }
        return this.f;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57db5dd5", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8b78feb", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9b3d2d", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29be119b", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29247c64", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void p(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef39f5e4", new Object[]{this, new Float(f)});
        } else {
            this.g = Math.max(0.0f, Math.min(f, 1.0f));
        }
    }

    public void q(iij iijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b53958", new Object[]{this, iijVar});
        } else {
            this.f20668a = iijVar;
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a166c2", new Object[]{this, new Boolean(z)});
        } else {
            this.e = Boolean.valueOf(z);
        }
    }

    public void s(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d6ef51", new Object[]{this, new Float(f)});
        } else {
            this.h = Math.max(0.0f, Math.min(f, 1.0f));
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5af25b", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a191505", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void v(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e88fdf", new Object[]{this, new Float(f)});
        } else {
            this.c = Float.valueOf(f);
        }
    }
}
