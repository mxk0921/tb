package tb;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vx3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ux3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f29654a;
    public final vx3 b;
    public final vx3 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792992);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final ux3 a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ux3) ipChange.ipc$dispatch("1fb4b0be", new Object[]{this, jSONObject});
            }
            ckf.g(jSONObject, "item");
            JSONObject jSONObject2 = jSONObject.getJSONObject("clueTag");
            if (jSONObject2 == null || TextUtils.isEmpty(jSONObject2.getString("text"))) {
                return null;
            }
            String string = jSONObject2.getString("text");
            ckf.f(string, "getString(...)");
            vx3.a aVar = vx3.Companion;
            return new ux3(string, aVar.a(jSONObject2.getJSONObject("light")), aVar.a(jSONObject2.getJSONObject(ThemeUtils.COLOR_SCHEME_DARK)));
        }

        public a() {
        }
    }

    static {
        t2o.a(815792991);
    }

    public ux3(String str, vx3 vx3Var, vx3 vx3Var2) {
        ckf.g(str, "text");
        this.f29654a = str;
        this.b = vx3Var;
        this.c = vx3Var2;
    }

    public final vx3 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vx3) ipChange.ipc$dispatch("ab9338b2", new Object[]{this});
        }
        return this.c;
    }

    public final vx3 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vx3) ipChange.ipc$dispatch("b9394226", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.f29654a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux3)) {
            return false;
        }
        ux3 ux3Var = (ux3) obj;
        if (ckf.b(this.f29654a, ux3Var.f29654a) && ckf.b(this.b, ux3Var.b) && ckf.b(this.c, ux3Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = this.f29654a.hashCode() * 31;
        vx3 vx3Var = this.b;
        if (vx3Var == null) {
            i = 0;
        } else {
            i = vx3Var.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        vx3 vx3Var2 = this.c;
        if (vx3Var2 != null) {
            i2 = vx3Var2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ClueTag(text=" + this.f29654a + ", lightStyle=" + this.b + ", darkStyle=" + this.c + ')';
    }
}
