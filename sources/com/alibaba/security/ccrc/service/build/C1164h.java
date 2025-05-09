package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.util.Log;
import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.common.http.model.BaseResponse;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.h  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1164h implements AbstractC1167i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2594a = "MTopHttpHelper";
    public static final String b = "1.0";
    public final Mtop c;

    public C1164h(Context context) {
        this.c = Mtop.instance((String) null, context);
    }

    public static /* synthetic */ void a(C1164h hVar, BaseRequest baseRequest, MtopResponse mtopResponse, AbstractC1170j jVar, AbstractC1173k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82886da4", new Object[]{hVar, baseRequest, mtopResponse, jVar, kVar});
        } else {
            hVar.a(baseRequest, mtopResponse, jVar, kVar);
        }
    }

    private void b(BaseRequest baseRequest, AbstractC1170j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5322b0f", new Object[]{this, baseRequest, jVar});
            return;
        }
        AbstractC1173k kVar = (AbstractC1173k) baseRequest.getClass().getAnnotation(AbstractC1173k.class);
        if (kVar == null) {
            Logging.e(f2594a, "request is not annotated by api");
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(kVar.apiName());
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(baseRequest.body());
        MtopBusiness build = MtopBusiness.build(this.c, mtopRequest);
        build.useWua();
        if (!kVar.isAsync()) {
            a(baseRequest, build.reqMethod(MethodEnum.POST).syncRequest(), jVar, kVar);
            return;
        }
        build.registerListener((IRemoteListener) new C1161g(this, baseRequest, jVar, kVar));
        build.reqMethod(MethodEnum.POST).startRequest();
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1167i
    public void a(BaseRequest baseRequest, AbstractC1170j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa880e", new Object[]{this, baseRequest, jVar});
        } else {
            b(baseRequest, jVar);
        }
    }

    private void a(BaseRequest baseRequest, MtopResponse mtopResponse, AbstractC1170j jVar, AbstractC1173k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47eea698", new Object[]{this, baseRequest, mtopResponse, jVar, kVar});
        } else if (mtopResponse == null) {
            if (jVar != null) {
                jVar.a(baseRequest, "DATA_ERROR", "response is null");
            }
        } else if (!mtopResponse.isApiSuccess()) {
            String retCode = mtopResponse.getRetCode();
            String mtopResponse2 = mtopResponse.toString();
            if (jVar != null) {
                jVar.a(baseRequest, retCode, mtopResponse2);
            }
        } else {
            try {
                Object a2 = a(mtopResponse.getDataJsonObject().toString(), kVar.responseType());
                if (jVar != null) {
                    jVar.a(baseRequest, a2);
                }
            } catch (Throwable th) {
                String retCode2 = mtopResponse.getRetCode();
                StringBuilder a3 = Kb.a("MTop error:");
                a3.append(Log.getStackTraceString(th));
                String sb = a3.toString();
                if (jVar != null) {
                    jVar.a(baseRequest, retCode2, sb);
                }
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            Mtop instance = Mtop.getInstance(null);
            if (instance != null) {
                return instance.getMtopConfig().envMode == EnvModeEnum.ONLINE;
            }
        } catch (Throwable th) {
            Logging.e(f2594a, "mtop env", th);
        }
        return true;
    }

    private Object a(String str, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls});
        }
        BaseResponse baseResponse = (BaseResponse) JsonUtils.parseObject(str, (Class<Object>) BaseResponse.class);
        if (baseResponse != null) {
            return JsonUtils.parseObject(JsonUtils.toJSONString(baseResponse.data), (Class<Object>) cls);
        }
        throw new Exception("数据为空");
    }
}
