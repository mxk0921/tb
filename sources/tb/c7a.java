package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.CartMegaManager;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class c7a extends mw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150946);
    }

    public static /* synthetic */ Object ipc$super(c7a c7aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/GetCloseDateNativeHandler");
    }

    @Override // tb.mw
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3046a606", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.mw
    public boolean a(String str, String str2, JSONObject jSONObject, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18e260f", new Object[]{this, str, str2, jSONObject, str3})).booleanValue();
        }
        ckf.g(str, "instanceID");
        ckf.g(str2, "method");
        ckf.g(jSONObject, "params");
        ckf.g(str3, "callbackID");
        String string = jSONObject.getString("key");
        if (string == null) {
            return false;
        }
        Long d = nb3.INSTANCE.d(string);
        if (d == null) {
            g1a<Map<String, ? extends Object>, xhv> f = CartMegaManager.INSTANCE.f(str3);
            if (f != null) {
                f.invoke(new JSONObject());
            }
            return true;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "hideFutureTime", (String) d);
        g1a<Map<String, ? extends Object>, xhv> f2 = CartMegaManager.INSTANCE.f(str3);
        if (f2 != null) {
            f2.invoke(jSONObject2);
        }
        return true;
    }
}
