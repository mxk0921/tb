package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.content.business.ContentBusinessModel;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ao2 implements ikb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(919601265);
        t2o.a(919601266);
    }

    @Override // tb.ikb
    public void E0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2ffab5", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "params");
        gat gatVar = new gat();
        ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
        contentBusinessModel.adUserId = jSONObject.getString(gat.ACCOUNT_ID);
        contentBusinessModel.itemId = jSONObject.getString("itemId");
        contentBusinessModel.contentId = jSONObject.getString("contentId");
        contentBusinessModel.ct = jSONObject.getString(gat.CT);
        contentBusinessModel.sId = jSONObject.getString(gat.SID);
        contentBusinessModel.scenceId = jSONObject.getString(gat.BIZ_TYPE);
        contentBusinessModel.pageName = jSONObject.getString("pageName");
        contentBusinessModel.tcpBid = jSONObject.getString(gat.TCP_BID);
        contentBusinessModel.sourceType = jSONObject.getString("sourceType");
        String json = jSONObject.getJSONObject("extObject").toString();
        ckf.f(json, "params.getJSONObject(\"extObject\").toString()");
        try {
            contentBusinessModel.context = new org.json.JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        gatVar.e(contentBusinessModel, null);
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }
}
