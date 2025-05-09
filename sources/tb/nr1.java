package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nr1 extends ry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782793);
    }

    public nr1(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(nr1 nr1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/dataservice/impl/requestparams/bizparms/BaseBizParamsGenerator");
    }

    @Override // tb.ry
    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6bfefe96", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("currentRequestType", (Object) e(jSONObject));
        d(jSONObject2, jSONObject);
        c(jSONObject2, awesomeGetContainerData);
        String containerId = awesomeGetContainerData.getContainerId();
        if (TextUtils.isEmpty(containerId)) {
            containerId = jSONObject.getString("containerId");
        }
        if (!TextUtils.isEmpty(containerId)) {
            jSONObject2.put("hundredClickItemId", (Object) von.f(containerId));
        }
        de2.a(jSONObject2);
        return jSONObject2;
    }

    public final void c(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4575ebe9", new Object[]{this, jSONObject, awesomeGetContainerData});
        } else if (awesomeGetContainerData.getBase() != null && !TextUtils.isEmpty(awesomeGetContainerData.getBase().getExpireType())) {
            jSONObject.put("expireAction", (Object) awesomeGetContainerData.getBase().getExpireType());
        }
    }

    public final void d(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aedbb0e", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = (JSONObject) jSONObject2.get("bizParam");
        if (jSONObject3 != null) {
            jSONObject.putAll(jSONObject3);
        }
    }

    public final String e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1bcc56a", new Object[]{this, jSONObject});
        }
        return jSONObject.getString("requestType");
    }
}
