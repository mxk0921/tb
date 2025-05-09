package com.taobao.desktop.common.request;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopSetting;
import mtopsdk.mtop.util.ReflectUtil;
import tb.ggh;
import tb.nwc;
import tb.qym;
import tb.sd7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CommonMtopRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(String str, String str2, Map<String, String> map, boolean z, final nwc nwcVar, Handler handler) {
        Mtop mtop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe37dc0", new Object[]{this, str, str2, map, new Boolean(z), nwcVar, handler});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setData(ReflectUtil.convertMapToDataStr(map));
        if (z) {
            MtopSetting.setAppKey(Mtop.Id.CUTE, "21646297");
            mtop = Mtop.instance(Mtop.Id.CUTE, sd7.d().b());
        } else {
            mtop = Mtop.instance(Mtop.Id.INNER, sd7.d().b());
        }
        b(mtop);
        MtopBusiness build = MtopBusiness.build(mtop, mtopRequest);
        build.useWua();
        if (handler != null) {
            build.handler(handler);
        }
        build.setConnectionTimeoutMilliSecond(5000).setSocketTimeoutMilliSecond(5000).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.desktop.common.request.CommonMtopRequest.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (nwcVar != null && mtopResponse != null) {
                    if (mtopResponse.getDataJsonObject() != null) {
                        str3 = mtopResponse.getDataJsonObject().toString();
                    } else {
                        str3 = "";
                    }
                    nwc nwcVar2 = nwcVar;
                    nwcVar2.onError(str3, "retMsg：" + mtopResponse.getRetMsg() + " === mappingCode：" + mtopResponse.getMappingCode() + " === responseCode：" + mtopResponse.getResponseCode());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (nwcVar != null && mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
                    nwcVar.onSuccess(mtopResponse.getDataJsonObject().toString());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (nwcVar != null && mtopResponse != null) {
                    if (mtopResponse.getDataJsonObject() != null) {
                        str3 = mtopResponse.getDataJsonObject().toString();
                    } else {
                        str3 = "";
                    }
                    nwc nwcVar2 = nwcVar;
                    nwcVar2.onError(str3, "retMsg：" + mtopResponse.getRetMsg() + " === mappingCode：" + mtopResponse.getMappingCode() + " === responseCode：" + mtopResponse.getResponseCode());
                }
            }
        }).startRequest();
    }

    public static void b(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e87f8ff", new Object[]{mtop});
        } else if (qym.a()) {
            String f = sd7.d().f();
            if (!TextUtils.isEmpty(f)) {
                mtop.registerTtid(f);
            }
            int c = sd7.d().c();
            ggh.d("setWidgetProcessMtopSetting envIndex: " + c + ", ttid: " + f);
            if (c == 0) {
                EnvModeEnum envModeEnum = EnvModeEnum.ONLINE;
                if (envModeEnum.getEnvMode() != c) {
                    mtop.switchEnvMode(envModeEnum);
                }
            } else if (c == 1) {
                mtop.switchEnvMode(EnvModeEnum.PREPARE);
            }
        }
    }
}
