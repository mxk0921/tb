package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class va3 extends jz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199340);
    }

    public static /* synthetic */ Object ipc$super(va3 va3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/delta/CartDeltaMergePreProcessor");
    }

    @Override // tb.jz
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b850f77b", new Object[]{this});
        }
        return c9x.CART_BIZ_NAME;
    }

    @Override // tb.jz
    public void b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfff930", new Object[]{this, str, jSONObject, jSONObject2, jSONObject3});
        } else if ("submit_1".equals(str) && (jSONObject4 = jSONObject2.getJSONObject("fields")) != null) {
            Iterator<String> it = jSONObject4.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.startsWith("_")) {
                    it.remove();
                } else if ("isHideCalculateBtn".equalsIgnoreCase(next)) {
                    it.remove();
                } else if ("pay".equals(next) && (jSONObject5 = jSONObject4.getJSONObject("pay")) != null) {
                    jSONObject5.remove(cb4.KEY_DISCOUNT_TIPS);
                }
            }
        }
    }
}
