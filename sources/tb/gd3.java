package tb;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gd3 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FROM = "from";
    public static final String KEY_RESULT = "stringifyAddCartResult";
    public static final String REFRESH_ACTION = "cartRefreshData";
    public static final String TAG = "cartRefreshV2";

    static {
        t2o.a(614465751);
    }

    public static /* synthetic */ Object ipc$super(gd3 gd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/CartRefreshSubscriberV2");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-2755057536428783720";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        JSONObject jSONObject = b8vVar.j().f().get(m6v.KEY_EVENT_CHAIN_DATA);
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 != null) {
                jSONObject2.put("from", (Object) "orderList");
                str = jSONObject2.toJSONString();
            } else {
                str = "";
            }
            LocalBroadcastManager.getInstance(b8vVar.e()).sendBroadcast(new Intent("cartRefreshData").putExtra("stringifyAddCartResult", str));
        }
    }
}
