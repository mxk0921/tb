package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.model.DWRequest;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ktb;
import tb.ltb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWNetworkAdapter implements ktb, IMTOPDataObject {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f10096a = 0;

    static {
        t2o.a(451936279);
        t2o.a(452985041);
        t2o.a(589299906);
    }

    private MtopRequest buildRequest(DWRequest dWRequest) {
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(dWRequest.apiName);
        mtopRequest.setVersion(dWRequest.apiVersion);
        mtopRequest.setNeedEcode(dWRequest.needLogin);
        Map<String, String> map = dWRequest.paramMap;
        mtopRequest.dataParams = map;
        mtopRequest.setData(ReflectUtil.converMapToDataStr(map));
        return mtopRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DWResponse buildResponse(MtopResponse mtopResponse) {
        if (mtopResponse == null) {
            return null;
        }
        DWResponse dWResponse = new DWResponse();
        dWResponse.httpCode = mtopResponse.getResponseCode();
        if (mtopResponse.getBytedata() != null) {
            try {
                dWResponse.data = new JSONObject(new String(mtopResponse.getBytedata())).optJSONObject("data");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        dWResponse.errorCode = mtopResponse.getRetCode();
        dWResponse.errorMsg = mtopResponse.getRetMsg();
        dWResponse.mappingCode = mtopResponse.getMappingCode();
        return dWResponse;
    }

    @Override // tb.ktb
    public boolean sendRequest(final ltb ltbVar, DWRequest dWRequest) {
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWNetworkAdapter);
        if (dWRequest == null) {
            return false;
        }
        RemoteBusiness registeListener = RemoteBusiness.build(buildRequest(dWRequest)).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.avplayer.DWNetworkAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ltb ltbVar2 = ltbVar;
                if (ltbVar2 != null) {
                    ltbVar2.onError(DWNetworkAdapter.this.buildResponse(mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null) {
                    ltb ltbVar2 = ltbVar;
                    if (ltbVar2 != null) {
                        ltbVar2.onError(null);
                    }
                } else {
                    ltb ltbVar3 = ltbVar;
                    if (ltbVar3 != null) {
                        ltbVar3.onSuccess(DWNetworkAdapter.this.buildResponse(mtopResponse));
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                ltb ltbVar2 = ltbVar;
                if (ltbVar2 != null) {
                    ltbVar2.onError(DWNetworkAdapter.this.buildResponse(mtopResponse));
                }
            }
        });
        registeListener.setJsonType(JsonTypeEnum.ORIGINALJSON);
        if (dWRequest.useWua) {
            registeListener.useWua();
        }
        registeListener.setConnectionTimeoutMilliSecond(3000);
        registeListener.setSocketTimeoutMilliSecond(3000);
        registeListener.startRequest(0, dWRequest.responseClass);
        return true;
    }
}
