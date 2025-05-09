package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v19 extends ry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782797);
    }

    public v19(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(v19 v19Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/dataservice/impl/requestparams/bizparms/FatigueBizParamsGenerator");
    }

    @Override // tb.ry
    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6bfefe96", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        f(jSONObject2);
        return jSONObject2;
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30e09dc", new Object[]{this, jSONObject});
        }
    }
}
