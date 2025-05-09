package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ac4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199577);
    }

    public static void a(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c55783", new Object[]{kmbVar});
            return;
        }
        zxb P = kmbVar.d();
        boolean K = P.K();
        for (IDMComponent iDMComponent : P.c().getComponents()) {
            JSONObject fields = iDMComponent.getFields();
            if (fields != null && (fields.containsKey("hideInManage") || fields.containsKey("hideInNotManage"))) {
                iDMComponent.getData().put("status", (Object) b(K, fields));
            }
        }
        if (!K) {
            nb3.g(P.u("cartTimePromotion"));
        }
        if (K) {
            nb3.g(P.u("manageFooterBar"));
        }
    }

    public static String b(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fb19b5", new Object[]{new Boolean(z), jSONObject});
        }
        if (z) {
            if (!jSONObject.getBooleanValue("hideInManage")) {
                return "normal";
            }
        } else if (!jSONObject.getBooleanValue("hideInNotManage")) {
            return "normal";
        }
        return "hidden";
    }
}
