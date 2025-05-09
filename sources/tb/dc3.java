package tb;

import androidx.collection.ArrayMap;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.LinkedHashMap;
import tb.p9b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dc3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String l = "CartMtopPreRequestAbility";
    public final String m = "pricetrend";

    static {
        t2o.a(479199258);
    }

    public static /* synthetic */ Object ipc$super(dc3 dc3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/ability/event/CartMtopPreRequestAbility");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        JSONObject jSONObject;
        ArrayMap<String, Object> extMap;
        CartGlobal w;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (lcuVar != null) {
            String str = this.l;
            try {
                JSONObject c = c();
                if (c != null && (jSONObject = c.getJSONObject("mtopConfig")) != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("data", (Object) jSONObject2);
                    }
                    Boolean bool = Boolean.TRUE;
                    jSONObject.put("allowSwitchToPOST", (Object) bool);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(q1x.IS_CAN_PRE_REQUEST, (Object) bool);
                    jSONObject2.put("exParam", (Object) jSONObject3);
                    zxb zxbVar = this.k;
                    JSONObject p = rc3.p(c, (zxbVar == null || (w = zxbVar.w()) == null) ? null : w.getOriginGlobal(), rc3.mFieldsKeyGlobalTransparent);
                    if (p != null) {
                        jSONObject2.putAll(p);
                    }
                    p9b.a aVar = p9b.Companion;
                    String a2 = aVar.a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("preRequestUniqueKey", a2);
                    Boolean bool2 = c.getBoolean(oe3.keyNeedPVUUID);
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    }
                    if (z) {
                        jSONObject2.put(oe3.keyPVUUID, (Object) a2);
                        linkedHashMap.put(oe3.keyPVUUID, a2);
                    }
                    linkedHashMap.put("didPreRequest", "true");
                    IDMComponent a3 = lcuVar.a();
                    if (!(a3 == null || (extMap = a3.getExtMap()) == null)) {
                        extMap.put(oe3.keyUrlExParam, linkedHashMap);
                    }
                    if (tsq.x(this.m, c.getString("bizName"), true)) {
                        jSONObject2.put("exParam", (Object) jSONObject2.toJSONString());
                    }
                    p9b.a.r(aVar, "tabCart", dbv.BIZ_CART_POP, a2, jSONObject, null, false, 48, null);
                }
            } catch (Throwable th) {
                xh8 c2 = xh8.a("Ultron").c(str);
                String message = th.getMessage();
                if (message == null) {
                    message = "出错了";
                }
                f9v.q(c2.message(message));
            }
        }
    }
}
