package com.taobao.linkmanager.afc.request;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONObject;
import tb.i6j;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBMtopRequest extends TBLinkRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489028);
    }

    public static /* synthetic */ Object ipc$super(TBMtopRequest tBMtopRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/request/TBMtopRequest");
    }

    @Override // com.taobao.linkmanager.afc.request.TBLinkRequest
    public void sendRequest(String str, String str2, Map<String, String> map, boolean z, final i6j i6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2466b351", new Object[]{this, str, str2, map, new Boolean(z), i6jVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && map != null) {
            addCheckParams(map);
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion(str2);
            mtopRequest.setNeedEcode(z);
            mtopRequest.setData(ReflectUtil.converMapToDataStr(map));
            MtopBusiness.build(Mtop.instance(AfcCustomSdk.h().d, AfcCustomSdk.h().f10563a), mtopRequest).setConnectionTimeoutMilliSecond(5000).setSocketTimeoutMilliSecond(5000).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.linkmanager.afc.request.TBMtopRequest.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    i6j i6jVar2 = i6jVar;
                    if (i6jVar2 != null && mtopResponse != null) {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        i6jVar2.b(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    i6j i6jVar2 = i6jVar;
                    if (i6jVar2 != null && mtopResponse != null) {
                        i6jVar2.c(mtopResponse, mtopResponse.getDataJsonObject());
                        i6jVar.a(mtopResponse.getDataJsonObject());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    i6j i6jVar2 = i6jVar;
                    if (i6jVar2 != null && mtopResponse != null) {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        i6jVar2.b(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                    }
                }
            }).startRequest();
            vp9.a("linkx", "TBMtopRequest === sendRequest: 开始进行接口请求：" + str);
        }
    }
}
