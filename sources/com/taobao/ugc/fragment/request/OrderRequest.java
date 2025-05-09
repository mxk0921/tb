package com.taobao.ugc.fragment.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.rate.ui.commit.MainRateLoadingActivity;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ckf;
import tb.qrf;
import tb.rbl;
import tb.t2o;
import tb.xel;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class OrderRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120555);
    }

    public final void a(String str, String str2, JSONObject jSONObject, final xel xelVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdb551d", new Object[]{this, str, str2, jSONObject, xelVar});
            return;
        }
        String f = rbl.Companion.f("rate_asac_code", "2A23A16I9YC7QUVMJ8EH2I");
        HashMap hashMap = new HashMap();
        hashMap.put("orderId", str);
        hashMap.put("channel", str2);
        if (jSONObject != null) {
            Map<String, String> o = qrf.o(jSONObject);
            if (o != null) {
                hashMap.putAll(o);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, (Object) jSONObject.toJSONString());
            xhv xhvVar = xhv.INSTANCE;
            String str3 = (String) hashMap.put("supportFeatureMapStr", jSONObject2.toJSONString());
        }
        hashMap.put("asac", f);
        GetOrderRateInfoRequest getOrderRateInfoRequest = new GetOrderRateInfoRequest();
        getOrderRateInfoRequest.setData(JSON.toJSONString(hashMap));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asac", f);
        RemoteBusiness build = RemoteBusiness.build((MtopRequest) getOrderRateInfoRequest);
        ckf.f(build, "RemoteBusiness.build(request)");
        build.setBizId(17);
        build.reqMethod(MethodEnum.POST);
        build.retryTime(1);
        build.headers((Map<String, String>) hashMap2);
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.ugc.fragment.request.OrderRequest$doRequest$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str4;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                xel xelVar2 = xel.this;
                if (xelVar2 != null) {
                    String str5 = null;
                    if (mtopResponse != null) {
                        str4 = mtopResponse.getRetCode();
                    } else {
                        str4 = null;
                    }
                    if (mtopResponse != null) {
                        str5 = mtopResponse.getRetMsg();
                    }
                    ((MainRateLoadingActivity) xelVar2).q3(mtopResponse, str4, str5);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                xel xelVar2 = xel.this;
                if (xelVar2 == null) {
                    return;
                }
                if (baseOutDo != null) {
                    ((MainRateLoadingActivity) xelVar2).r3((GetOrderRateInfoResponse) baseOutDo);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.ugc.fragment.request.GetOrderRateInfoResponse");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str4;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                xel xelVar2 = xel.this;
                if (xelVar2 != null) {
                    String str5 = null;
                    if (mtopResponse != null) {
                        str4 = mtopResponse.getRetCode();
                    } else {
                        str4 = null;
                    }
                    if (mtopResponse != null) {
                        str5 = mtopResponse.getRetMsg();
                    }
                    ((MainRateLoadingActivity) xelVar2).q3(mtopResponse, str4, str5);
                }
            }
        });
        build.startRequest(20, GetOrderRateInfoResponse.class);
    }
}
