package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class paw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f25988a;
    public final String b;
    public final JSONObject c;
    public final String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    static {
        t2o.a(986710292);
    }

    public paw(String str, String str2, JSONObject jSONObject, String str3) {
        this(str, str2, jSONObject, str3, null);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6754fa32", new Object[]{this});
        }
        return this.f25988a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this});
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf4e62dd", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6667e5e8", new Object[]{this});
        }
        return this.e;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1fdad89f", new Object[]{this});
        }
        return this.c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("945cbe9b", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c48a2f7", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49ee61a1", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f431825", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55784ac7", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a14ad4c", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46c435a6", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public void m(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8a928e", new Object[]{this, bool});
        } else if (bool != null) {
            this.l = bool.booleanValue();
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7e5e8e", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void o(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118e80b2", new Object[]{this, bool});
        } else if (bool != null) {
            this.h = bool.booleanValue();
        }
    }

    public void p(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d2c27c8", new Object[]{this, bool});
        } else if (bool != null) {
            this.j = bool.booleanValue();
        }
    }

    public void q(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6270c4", new Object[]{this, bool});
        } else if (bool != null) {
            this.f = bool.booleanValue();
        }
    }

    public void r(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b92570e2", new Object[]{this, bool});
        } else if (bool != null) {
            this.i = bool.booleanValue();
        }
    }

    public void s(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22e2e3d", new Object[]{this, bool});
        } else if (bool != null) {
            this.g = bool.booleanValue();
        }
    }

    public void t(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d636833", new Object[]{this, bool});
        } else if (bool != null) {
            this.k = bool.booleanValue();
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0c1645", new Object[]{this, str});
        }
    }

    public paw(String str, String str2, JSONObject jSONObject, String str3, String str4) {
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
        this.j = false;
        this.k = false;
        this.l = false;
        this.f25988a = str;
        this.b = str2;
        this.c = jSONObject;
        this.d = str3;
    }
}
