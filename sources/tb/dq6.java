package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class dq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18009a;
    public final String b;
    public final JSONObject c;

    static {
        t2o.a(803209231);
    }

    public dq6(String str, String str2, JSONObject jSONObject) {
        ckf.g(str, "code");
        ckf.g(str2, "message");
        this.f18009a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof dq6) {
                dq6 dq6Var = (dq6) obj;
                if (!ckf.b(this.f18009a, dq6Var.f18009a) || !ckf.b(this.b, dq6Var.b) || !ckf.b(this.c, dq6Var.c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f18009a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            i3 = jSONObject.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DataError(code=" + this.f18009a + ", message=" + this.b + ", extra=" + this.c + f7l.BRACKET_END_STR;
    }
}
