package com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.util.ReflectUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(347078697);
        t2o.a(347078670);
    }

    public static void request(JSON json, final ActionService.h hVar, final ActionService.g gVar, ActionService actionService) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8063c9cc", new Object[]{json, hVar, gVar, actionService});
        } else if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("v");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            int intValue = jSONObject.getIntValue(SessionConstants.ECODE);
            int intValue2 = jSONObject.getIntValue(MspGlobalDefine.SESSION);
            String string3 = jSONObject.getString("type");
            int intValue3 = jSONObject.getIntValue("timeout");
            MtopRequest mtopRequest = new MtopRequest();
            if (string != null) {
                mtopRequest.setApiName(string);
            }
            if (string2 != null) {
                mtopRequest.setVersion(string2);
            }
            mtopRequest.setNeedEcode(intValue > 0);
            if (intValue2 > 0) {
                z = true;
            }
            mtopRequest.setNeedSession(z);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
            mtopRequest.dataParams = hashMap;
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
            RemoteBusiness registeListener = RemoteBusiness.build(mtopRequest).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule.MtopModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    ActionService.g gVar2 = ActionService.g.this;
                    if (gVar2 != null) {
                        gVar2.b(hVar, new ActionService.i(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("data", (Object) parseObject);
                    ActionService.g gVar2 = ActionService.g.this;
                    if (gVar2 != null) {
                        gVar2.a(hVar, jSONObject3);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    ActionService.g gVar2 = ActionService.g.this;
                    if (gVar2 != null) {
                        gVar2.b(hVar, new ActionService.i(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null));
                    }
                }
            });
            registeListener.protocol(ProtocolEnum.HTTPSECURE);
            registeListener.setConnectionTimeoutMilliSecond(intValue3);
            registeListener.setSocketTimeoutMilliSecond(intValue3);
            registeListener.setBizId(82);
            if ("POST".equalsIgnoreCase(string3)) {
                registeListener.reqMethod(MethodEnum.POST);
            }
            registeListener.useCache();
            registeListener.setErrorNotifyAfterCache(true);
            registeListener.startRequest();
        }
    }
}
