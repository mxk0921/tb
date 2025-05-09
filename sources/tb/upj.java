package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class upj implements a.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(tpj tpjVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d73dcb2", new Object[]{this, tpjVar});
            return;
        }
        String str3 = tpjVar.d;
        if (str3 == null) {
            TLog.loge(y9a.c(), "NavigationStatusDispatcher", "notify error trackInfo is null");
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) JSON.parse(str3);
            yl2.a(tpjVar.f28858a, jSONObject);
            if (jSONObject != null) {
                str = jSONObject.getString("materialSubType");
                str2 = jSONObject.getString("augeTrackInfo");
            } else {
                str = null;
                str2 = null;
            }
            ekf.a().c(tpjVar.b, tpjVar.c, tpjVar.f28858a);
            if (tpjVar.f28858a == 13) {
                w4v.a(tpjVar.b, tpjVar.c, str, str2);
            }
            TLog.loge(y9a.c(), "NavigationStatusDispatcher", "notifyUcp status:" + tpjVar.f28858a + " trackInfo:" + tpjVar.d);
        } catch (Throwable th) {
            rpj.a("NavigationStatusDispatcher", th + "onStatusChanged error");
            TLog.loge(y9a.c(), "NavigationStatusDispatcher", "notifyUcp error:" + th + " trackInfo:" + tpjVar.d);
        }
    }
}
