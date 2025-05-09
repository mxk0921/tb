package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class z5x extends rv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150929);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5x(t6x t6xVar) {
        super(t6xVar);
        ckf.g(t6xVar, "instanceWrapper");
    }

    public static /* synthetic */ Object ipc$super(z5x z5xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/WeexInstanceCall");
    }

    @Override // tb.rv
    public boolean a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b53abe03", new Object[]{this, str, str2, str3, jSONObject})).booleanValue();
        }
        ckf.g(str, "instanceId");
        ckf.g(str2, "callbackID");
        ckf.g(str3, "method");
        ckf.g(jSONObject, "params");
        c().c(str, str2, str3, jSONObject);
        return true;
    }
}
