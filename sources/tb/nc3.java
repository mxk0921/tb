package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f24632a;
    public String b;
    public String d;
    public Map<String, ? extends Object> e;
    public boolean f;
    public Integer g;
    public boolean h;
    public boolean i;
    public View j;
    public Float l;
    public float c = 0.8f;
    public boolean k = true;
    public final Map<String, Object> m = new LinkedHashMap();

    static {
        t2o.a(479199634);
    }

    public final void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bce4f0", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fb2baf", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final void C(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1732083", new Object[]{this, num});
        } else {
            this.g = num;
        }
    }

    public final void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            ckf.g(str, "<set-?>");
        }
    }

    public final void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.f24632a = str;
        }
    }

    public final void F(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebcc2f8", new Object[]{this, f});
        } else {
            this.l = f;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f79ad15", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66ad4fba", new Object[]{this});
        }
        return null;
    }

    public final float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b54e726", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f9efe27", new Object[]{this});
        }
        return this.d;
    }

    public final View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.j;
    }

    public final Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("23b8ea0e", new Object[]{this});
        }
        return this.e;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac4c663e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final <T> T h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8180330e", new Object[]{this, str});
        }
        ckf.g(str, "key");
        try {
            return (T) ((LinkedHashMap) this.m).get(str);
        } catch (Throwable th) {
            hav.a("UltronCatchException", th.getMessage());
            return null;
        }
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1f1c0ca", new Object[]{this});
        }
        return this.b;
    }

    public final float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("285b9365", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a2a855c", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2df1955", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public final Integer m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("844f908f", new Object[]{this});
        }
        return this.g;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f24632a;
    }

    public final Float o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("cdba5f3e", new Object[]{this});
        }
        return this.l;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8306474b", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b24996", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final void r(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff832f9", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "key");
        ckf.g(obj, "value");
        this.m.put(str, obj);
    }

    public final void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7faf93a5", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7683daba", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public final void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb1c2f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void v(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.j = view;
        }
    }

    public final void w(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4efbd8", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1723b2ec", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd3cb90", new Object[]{this, new Boolean(z)});
        }
    }

    public final void z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8713d7f7", new Object[]{this, new Float(f)});
        } else {
            this.c = f;
        }
    }
}
