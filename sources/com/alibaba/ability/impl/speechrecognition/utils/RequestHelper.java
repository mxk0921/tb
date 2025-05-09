package com.alibaba.ability.impl.speechrecognition.utils;

import com.alibaba.ability.impl.speechrecognition.utils.RequestHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ckf;
import tb.iih;
import tb.sm8;
import tb.t2o;
import tb.uj3;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class RequestHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RequestHelper INSTANCE = new RequestHelper();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void onFail(String str, String str2);

        void onSuccess(JSONObject jSONObject);
    }

    static {
        t2o.a(133169193);
    }

    public static /* synthetic */ void b(RequestHelper requestHelper, String str, String str2, MethodEnum methodEnum, Map map, Map map2, a aVar, int i, Object obj) {
        Map map3;
        Map map4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19344345", new Object[]{requestHelper, str, str2, methodEnum, map, map2, aVar, new Integer(i), obj});
            return;
        }
        if ((8 & i) != 0) {
            map3 = null;
        } else {
            map3 = map;
        }
        if ((i & 16) != 0) {
            map4 = null;
        } else {
            map4 = map2;
        }
        requestHelper.a(str, str2, methodEnum, map3, map4, aVar);
    }

    public final void a(String str, String str2, final MethodEnum methodEnum, Map<String, String> map, final Map<String, String> map2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62679c2a", new Object[]{this, str, str2, methodEnum, map, map2, aVar});
            return;
        }
        ckf.g(str, "api");
        ckf.g(str2, "version");
        ckf.g(methodEnum, "method");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(false);
        if (map != null) {
            mtopRequest.setData(JSON.toJSONString(map));
            mtopRequest.dataParams = map;
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.reqMethod(methodEnum);
        if (map2 != null) {
            build.headers(map2);
        }
        build.showLoginUI(false);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.ability.impl.speechrecognition.utils.RequestHelper$request$$inlined$apply$lambda$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                iih iihVar = iih.INSTANCE;
                StringBuilder sb = new StringBuilder("onError error: ");
                String str3 = null;
                sb.append(mtopResponse != null ? mtopResponse.toString() : null);
                iihVar.a("RequestHelper", sb.toString());
                RequestHelper.a aVar2 = aVar;
                String retCode = mtopResponse != null ? mtopResponse.getRetCode() : null;
                if (mtopResponse != null) {
                    str3 = mtopResponse.getRetMsg();
                }
                aVar2.onFail(retCode, str3);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                xhv xhvVar;
                Object obj2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (mtopResponse != null) {
                    try {
                        RequestHelper.a aVar2 = aVar;
                        byte[] bytedata = mtopResponse.getBytedata();
                        ckf.f(bytedata, "it.bytedata");
                        aVar2.onSuccess(JSON.parseObject(new String(bytedata, uj3.UTF_8)));
                        xhvVar = xhv.INSTANCE;
                    } catch (Throwable th) {
                        obj2 = Result.m1108constructorimpl(b.a(th));
                    }
                } else {
                    xhvVar = null;
                }
                obj2 = Result.m1108constructorimpl(xhvVar);
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj2);
                if (th2 != null) {
                    iih.INSTANCE.a("RequestHelper", "onSuccess error: ".concat(sm8.b(th2)));
                    aVar.onFail("PARSE_DATE_ERROR", th2.getMessage());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                iih iihVar = iih.INSTANCE;
                StringBuilder sb = new StringBuilder("onSystemError error: ");
                String str3 = null;
                sb.append(mtopResponse != null ? mtopResponse.toString() : null);
                iihVar.a("RequestHelper", sb.toString());
                RequestHelper.a aVar2 = aVar;
                String retCode = mtopResponse != null ? mtopResponse.getRetCode() : null;
                if (mtopResponse != null) {
                    str3 = mtopResponse.getRetMsg();
                }
                aVar2.onFail(retCode, str3);
            }
        });
        build.startRequest();
    }
}
