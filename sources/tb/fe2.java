package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fe2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<ry> f19226a = new ArrayList();

    static {
        t2o.a(491782788);
    }

    public fe2(cfc cfcVar) {
        b(cfcVar);
    }

    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6bfefe96", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = ((ArrayList) this.f19226a).iterator();
        while (it.hasNext()) {
            ry ryVar = (ry) it.next();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject a2 = ryVar.a(awesomeGetContainerData, jSONObject);
            fve.e("BizParamsGenerator", ryVar.getClass().getSimpleName() + ", createBizParams 耗时: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            if (a2 != null && !a2.isEmpty()) {
                jSONObject2.putAll(a2);
            }
        }
        return jSONObject2;
    }

    public final void b(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fa5d9c", new Object[]{this, cfcVar});
            return;
        }
        ((ArrayList) this.f19226a).add(new nr1(cfcVar));
        ((ArrayList) this.f19226a).add(new i1o(cfcVar));
        ((ArrayList) this.f19226a).add(new xba(cfcVar));
        ((ArrayList) this.f19226a).add(new wh7(cfcVar));
        ((ArrayList) this.f19226a).add(new nui(cfcVar));
        ((ArrayList) this.f19226a).add(new oca(cfcVar));
        ((ArrayList) this.f19226a).add(new f6v(cfcVar));
        ((ArrayList) this.f19226a).add(new b6b(cfcVar));
        ((ArrayList) this.f19226a).add(new v19(cfcVar));
    }
}
