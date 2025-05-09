package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class p59 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f25889a;
    public boolean b;
    public JSONObject c;

    static {
        t2o.a(815792352);
    }

    public p59(JSONObject jSONObject, boolean z, JSONObject jSONObject2) {
        ckf.g(jSONObject, "data");
        this.f25889a = jSONObject;
        this.b = z;
        this.c = jSONObject2;
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("578e8276", new Object[]{this});
        }
        return this.c;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.f25889a;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a29f5a54", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cc8666", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442308f8", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p59)) {
            return false;
        }
        p59 p59Var = (p59) obj;
        if (ckf.b(this.f25889a, p59Var.f25889a) && this.b == p59Var.b && ckf.b(this.c, p59Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = ((this.f25889a.hashCode() * 31) + bbz.a(this.b)) * 31;
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FeedbackInfo(data=" + this.f25889a + ", reported=" + this.b + ", coverInfo=" + this.c + ')';
    }
}
