package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class izj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xs6 f21662a;

    static {
        t2o.a(487587914);
        t2o.a(475004944);
    }

    public izj(xs6 xs6Var) {
        this.f21662a = xs6Var;
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        i65.c("RecmdPrefetchDataProcessAction", "executeActionWithParam");
        AwesomeGetData awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel");
        vqb d = this.f21662a.d(jSONObject.getString("containerId"));
        if (d != null) {
            d.g(awesomeGetData);
        }
    }
}
