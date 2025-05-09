package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class u0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29057a;
    public final JSONObject b;
    public int c;
    public boolean d;

    static {
        t2o.a(352322152);
    }

    public u0i(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            this.b = jSONObject2;
            if (jSONObject2 != null) {
                this.f29057a = jSONObject2.getString("dimension");
            }
        }
    }

    public abstract boolean a(u0i u0iVar);

    public abstract boolean b(u0i u0iVar);

    public boolean c(u0i u0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a9dee70", new Object[]{this, u0iVar})).booleanValue();
        }
        if (u0iVar == null || u0iVar.d() == null || d() == null || e() == null || !d().equals(u0iVar.d()) || !e().equals(u0iVar.e())) {
            return false;
        }
        return true;
    }

    public abstract String d();

    public abstract String e();

    public abstract boolean f();
}
