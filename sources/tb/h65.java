package tb;

import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.nativerender.dsl.DSLData;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.jlj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
    }

    static {
        t2o.a(790626376);
    }

    public void a(jlj jljVar, a aVar) {
        JSONArray jSONArray;
        DSLModel dSLModel;
        DSLModel dSLModel2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e35a6f", new Object[]{this, jljVar, aVar});
        } else if (aVar != null && jljVar != null) {
            try {
                if (jljVar.T()) {
                    Response syncSend = new DegradableNetwork(jljVar.M().c()).syncSend(new RequestImpl(jljVar.H()), null);
                    if (syncSend == null) {
                        ((jlj.a) aVar).a("fetchDSL.responseIsNull");
                        return;
                    }
                    wdm.d("DSLFetcher.fetchDSL.%s", syncSend);
                    if (syncSend.getStatusCode() < 0) {
                        ((jlj.a) aVar).a("fetchDSL.responseIsNull");
                        return;
                    }
                    String str = new String(syncSend.getBytedata(), "UTF-8");
                    wdm.d("DSLFetcher.fetchDSL.dsl=%s", str);
                    DSLData dSLData = (DSLData) JSON.parseObject(str, DSLData.class);
                    if (dSLData == null || !dSLData.enable || (dSLModel2 = dSLData.configData) == null) {
                        ((jlj.a) aVar).a("DSLFetcher.fetchDSL.isUnable.");
                    } else {
                        ((jlj.a) aVar).b(dSLModel2);
                    }
                } else if (!TextUtils.isEmpty(jljVar.K())) {
                    MtopRequest mtopRequest = new MtopRequest();
                    mtopRequest.setApiName("mtop.taobao.poplayer.xdsl");
                    mtopRequest.setVersion("1.0");
                    mtopRequest.setNeedEcode(false);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", (Object) Long.valueOf(Long.parseLong(jljVar.K())));
                    jSONObject.put("mock", (Object) "true");
                    mtopRequest.setData(jSONObject.toJSONString());
                    MtopResponse syncRequest = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()), mtopRequest, TaoPackageInfo.getTTID()).showLoginUI(false).reqMethod(MethodEnum.GET).syncRequest();
                    if (!(syncRequest == null || !syncRequest.isApiSuccess() || syncRequest.getBytedata() == null)) {
                        String str2 = new String(syncRequest.getBytedata(), "UTF-8");
                        if (!TextUtils.isEmpty(str2)) {
                            wdm.d("DSLFetcher.fetchDSL.Mtop.dsl=%s", str2);
                            JSONObject jSONObject2 = JSON.parseObject(str2).getJSONObject("data");
                            if (!(jSONObject2 == null || !jSONObject2.getBooleanValue("success") || (jSONArray = jSONObject2.getJSONArray("data")) == null || jSONArray.isEmpty() || (dSLModel = (DSLModel) jSONArray.getJSONObject(0).getObject(upx.PAGE_CONTENT, DSLModel.class)) == null)) {
                                ((jlj.a) aVar).b(dSLModel);
                                return;
                            }
                        }
                    }
                    ((jlj.a) aVar).a("DSLFetcher.fetchDSL.MTOP.getDSLModelFailed.");
                }
            } catch (Throwable th) {
                wdm.h("DSLFetcher.fetchDSL.error.", th);
                ((jlj.a) aVar).a("DSLFetcher.fetchDSL.error.");
            }
        }
    }
}
