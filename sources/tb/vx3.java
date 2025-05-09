package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class vx3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Integer f30310a;
    public final Integer b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792994);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final vx3 a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vx3) ipChange.ipc$dispatch("5981ae27", new Object[]{this, jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new vx3(nnh.a(jSONObject.getString("textColor")), nnh.a(jSONObject.getString("tagColor")));
        }

        public a() {
        }
    }

    static {
        t2o.a(815792993);
    }

    public vx3(Integer num, Integer num2) {
        this.f30310a = num;
        this.b = num2;
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("64063c0d", new Object[]{this});
        }
        return this.b;
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.f30310a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx3)) {
            return false;
        }
        vx3 vx3Var = (vx3) obj;
        if (ckf.b(this.f30310a, vx3Var.f30310a) && ckf.b(this.b, vx3Var.b)) {
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
        Integer num = this.f30310a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i3 = i * 31;
        Integer num2 = this.b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ClueTagStyle(textColor=" + this.f30310a + ", tagColor=" + this.b + ')';
    }
}
