package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i1o extends ry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Integer b = null;

    static {
        t2o.a(491782803);
    }

    public i1o(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(i1o i1oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/dataservice/impl/requestparams/bizparms/RepeatCardBizParamsGenerator");
    }

    public final String e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b6d27db", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) {
            return "";
        }
        return jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
    }

    public final int f(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6fefcdb", new Object[]{this, list})).intValue();
        }
        return Math.min(8, list.size());
    }

    @Override // tb.ry
    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6bfefe96", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            c(awesomeGetContainerData, jSONObject2, jSONObject);
        } catch (Exception e) {
            if (cw6.b()) {
                e.printStackTrace();
            } else {
                HashMap hashMap = new HashMap(1);
                hashMap.put("errorMsg", e.getMessage());
                ddv.b(fdv.F_NETWORK_REQUEST, "request_add_repeat_params", "1.0", "GUESS_YOU_LIKE", hashMap, "request_add_repeat_params", "");
            }
        }
        return jSONObject2;
    }

    public final String d(List<SectionModel> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77e205bf", new Object[]{this, list, new Integer(i)});
        }
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            JSONObject jSONObject = list.get(i2).getJSONObject("args");
            if (!(jSONObject == null || (str = jSONObject.getString(yj4.PARAM_PVID)) == null)) {
                break;
            }
        }
        return str;
    }

    public final void c(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject, JSONObject jSONObject2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a74f8cf", new Object[]{this, awesomeGetContainerData, jSONObject, jSONObject2});
            return;
        }
        if (b == null) {
            b = Integer.valueOf(f4b.j());
        }
        if (!(b.intValue() <= 0 || awesomeGetContainerData == null || awesomeGetContainerData.getBase() == null)) {
            String string = jSONObject2.getString("requestType");
            List<SectionModel> totalData = awesomeGetContainerData.getTotalData();
            Object obj = "";
            if (totalData == null || totalData.size() <= 0) {
                obj = obj;
            } else {
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                for (int size = totalData.size() - 1; size >= 0 && size >= totalData.size() - b.intValue(); size--) {
                    String e = e(totalData.get(size));
                    if (!TextUtils.isEmpty(e)) {
                        if (!z) {
                            sb.append(",");
                        }
                        sb.append(e);
                        z = false;
                    }
                }
                String sb2 = sb.toString();
                if (totalData.size() > 0) {
                    jSONObject.put("firstPagePVID", (Object) d(totalData, f(totalData)));
                }
                Integer integer = jSONObject2.getInteger("index");
                if (integer != null) {
                    while (TextUtils.isEmpty(obj)) {
                        i++;
                        if (i >= 4 || integer.intValue() <= 0 || integer.intValue() >= totalData.size() - 1) {
                            break;
                        }
                        obj = e(totalData.get(integer.intValue()));
                        integer = Integer.valueOf(integer.intValue() - 1);
                    }
                }
                obj = sb2;
            }
            if (jSONObject != null) {
                jSONObject.put("currentRequestType", (Object) string);
                jSONObject.put("latestHundredItem", (Object) obj);
                jSONObject.put("currentExposureItemID", obj);
            }
        }
    }
}
