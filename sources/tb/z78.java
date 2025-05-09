package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class z78 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32586a;
    public String b;
    public String c;
    public String d;
    public JSONObject e;

    static {
        t2o.a(919601270);
    }

    public z78() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3781dbf1", new Object[]{this})).booleanValue();
        }
        return ckf.b("children_version", this.c);
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5183ba73", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779e4f72", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37cd59d", new Object[]{this, str});
        } else {
            this.f32586a = str;
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("513199db", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof z78) {
                z78 z78Var = (z78) obj;
                if (!ckf.b(this.f32586a, z78Var.f32586a) || !ckf.b(this.b, z78Var.b) || !ckf.b(this.c, z78Var.c) || !ckf.b(this.d, z78Var.d) || !ckf.b(this.e, z78Var.e)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74223b74", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f32586a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            i5 = jSONObject.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "EditionVersionInfo(dataVersion=" + this.f32586a + ", groupCode=" + this.b + ", versionCode=" + this.c + ", activeType=" + this.d + ", bizParams=" + this.e + f7l.BRACKET_END_STR;
    }

    public z78(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        this.f32586a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = jSONObject;
    }

    public /* synthetic */ z78(String str, String str2, String str3, String str4, JSONObject jSONObject, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : jSONObject);
    }
}
