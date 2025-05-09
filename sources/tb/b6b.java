package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b6b extends ry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782801);
    }

    public b6b(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(b6b b6bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/dataservice/impl/requestparams/bizparms/HostPassParams2BizParamsGenerator");
    }

    @Override // tb.ry
    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6bfefe96", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        c(jSONObject2);
        return jSONObject2;
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbf7f23", new Object[]{this, jSONObject});
            return;
        }
        IHostService iHostService = (IHostService) b().a(IHostService.class);
        if (iHostService == null) {
            fve.e("HostPassParams2BizParamsGenerator", "bizParamsAddMainContainerParams hostService == null");
            return;
        }
        czc i = iHostService.getInvokeCallback().i();
        if (i == null) {
            fve.e("HostPassParams2BizParamsGenerator", "bizParamsAddMainContainerParams naviBarCallback == null");
            return;
        }
        JSONObject s = i.s();
        if (s != null) {
            jSONObject.putAll(s);
        }
    }
}
