package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.tao.homepage.revision.Revision;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nui extends ry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782802);
    }

    public nui(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(nui nuiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/dataservice/impl/requestparams/bizparms/MiniAppBizParamsGenerator");
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
            ipChange.ipc$dispatch("35677a24", new Object[]{this, jSONObject});
            return;
        }
        String a2 = ns6.a(Revision.MINI_APP_RELATION, "null");
        if (a2 != null) {
            jSONObject.put(Revision.MINI_APP_RELATION, (Object) a2);
        }
    }
}
