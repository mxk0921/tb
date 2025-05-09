package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fr8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19478a;
    public final String b;
    public final JSONObject c;

    static {
        t2o.a(87031858);
    }

    public fr8(String str, String str2, JSONObject jSONObject) {
        this.f19478a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    public static fr8 a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fr8) ipChange.ipc$dispatch("d185e339", new Object[]{str, str2});
        }
        return new fr8(str, str2, null);
    }

    public static fr8 b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fr8) ipChange.ipc$dispatch("6c86d2e2", new Object[]{str, jSONObject});
        }
        return new fr8(str, null, jSONObject);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || fr8.class != obj.getClass()) {
            return false;
        }
        fr8 fr8Var = (fr8) obj;
        String str = this.f19478a;
        if (str == null ? fr8Var.f19478a != null : !str.equals(fr8Var.f19478a)) {
            return false;
        }
        String str2 = this.b;
        String str3 = fr8Var.b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
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
        String str = this.f19478a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public static boolean c(fr8 fr8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d20de85d", new Object[]{fr8Var})).booleanValue();
        }
        if (fr8Var != null) {
            return (!TextUtils.isEmpty(fr8Var.b) && !"{}".equals(fr8Var.b)) || fr8Var.c != null;
        }
        return false;
    }
}
