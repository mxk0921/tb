package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yxn implements oid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MtopRequest b(qzo qzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8a2084c1", new Object[]{this, qzoVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        String a2 = rzo.a(qzoVar.e());
        mtopRequest.setApiName(qzoVar.a());
        mtopRequest.setData(a2);
        mtopRequest.setNeedEcode(qzoVar.c());
        mtopRequest.setVersion(qzoVar.b());
        return mtopRequest;
    }

    @Override // tb.oid
    public tzo a(MtopResponse mtopResponse, Class cls) {
        Object parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("9bc257f0", new Object[]{this, mtopResponse, cls});
        }
        tzo tzoVar = new tzo();
        if (mtopResponse == null) {
            tzoVar.c = false;
            tzoVar.f29047a = "unknow error";
            tzoVar.b = "unknow error";
        } else {
            tzoVar.c = mtopResponse.isApiSuccess();
            tzoVar.f29047a = mtopResponse.getRetCode();
            tzoVar.b = mtopResponse.getRetMsg();
            if (tzoVar.c) {
                JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                if (dataJsonObject != null) {
                    try {
                        parseObject = JSON.parseObject(dataJsonObject.toString(), cls);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    tzoVar.e = parseObject;
                }
                parseObject = null;
                tzoVar.e = parseObject;
            } else if (mtopResponse.isSystemError() || mtopResponse.isExpiredRequest() || mtopResponse.is41XResult() || mtopResponse.isApiLockedResult() || mtopResponse.isNetworkError() || mtopResponse.isMtopSdkError()) {
                tzoVar.d = true;
            }
        }
        return tzoVar;
    }
}
