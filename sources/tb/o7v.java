package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o7v extends k5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886239);
    }

    public static /* synthetic */ Object ipc$super(o7v o7vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/delta/parser/impl/UltronDeltaDeleteParser");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c481d0a", new Object[]{this});
        }
        return "delete";
    }

    @Override // tb.k5e
    public void a(u55 u55Var, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd83afa", new Object[]{this, u55Var, jSONObject, jSONObject2, str, str2, str3});
            return;
        }
        if (vav.b("ultron", "recursionRemoveComponentFromProtocolV2", false, true)) {
            u55Var.g0(str);
        }
        u55Var.k0(str, str2);
        u55Var.j0(str, str2);
    }
}
