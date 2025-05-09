package com.taobao.taopai2.material.request;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai2.material.exception.ResponseDataException;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.azp;
import tb.dai;
import tb.erc;
import tb.mzp;
import tb.o23;
import tb.t2o;
import tb.yyp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RequestBuilder<A extends erc, R> implements mzp<Response<R>>, IRemoteBaseListener, o23 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RequestBuilder";
    private RemoteBusiness business;
    private azp<Response<R>> emitter;
    private erc mMaterialRequest;
    private final MtopRequest mRequest;
    private final Class<? extends Response<R>> mResponseType;
    private MethodEnum method;

    static {
        t2o.a(782237934);
        t2o.a(589299719);
    }

    public RequestBuilder(A a2, Class<? extends Response<R>> cls) {
        MtopRequest mtopRequest = new MtopRequest();
        this.mRequest = mtopRequest;
        this.mMaterialRequest = a2;
        this.mResponseType = cls;
        mtopRequest.setData(JSON.toJSONString(a2));
    }

    public void cancel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.business.cancelRequest();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        this.emitter.onError(new ResponseDataException(mtopResponse, "error_response_null"));
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("api", this.mMaterialRequest.getAPI());
            hashMap.put("ret_code", mtopResponse.getRetCode());
            hashMap.put("ret_msg", mtopResponse.getRetMsg());
            dai.a("api", "error", hashMap);
            TLog.loge("RequestBuilder onError", mtopResponse.toString());
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        this.emitter.onSuccess((Response) baseOutDo);
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("api", this.mMaterialRequest.getAPI());
            dai.a("api", "success", hashMap);
            TLog.logd("RequestBuilder onSuccess", mtopResponse.toString());
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        this.emitter.onError(new ResponseDataException(mtopResponse, "system_error_response_null"));
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("api", this.mMaterialRequest.getAPI());
            hashMap.put("ret_code", mtopResponse.getRetCode());
            hashMap.put("ret_msg", mtopResponse.getRetMsg());
            dai.a("api", "system_error", hashMap);
            TLog.loge("RequestBuilder onSystemError", mtopResponse.toString());
        } catch (Throwable unused) {
        }
    }

    public RequestBuilder<A, R> setTarget(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("8c9ee6a9", new Object[]{this, str, str2});
        }
        this.mRequest.setApiName(str);
        this.mRequest.setVersion(str2);
        return this;
    }

    public void subscribe(azp<Response<R>> azpVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0f4dd3", new Object[]{this, azpVar});
            return;
        }
        this.emitter = azpVar;
        azpVar.setCancellable(this);
        RemoteBusiness build = RemoteBusiness.build(this.mRequest);
        this.business = build;
        MethodEnum methodEnum = this.method;
        if (methodEnum != null) {
            build.mtopProp.method = methodEnum;
        }
        build.registeListener((IRemoteListener) this);
        this.business.startRequest(this.mResponseType);
    }

    public yyp<Response<R>> toSingle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyp) ipChange.ipc$dispatch("d5d3045a", new Object[]{this});
        }
        return yyp.create(this);
    }

    public RequestBuilder<A, R> useMethod(MethodEnum methodEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("1143d01c", new Object[]{this, methodEnum});
        }
        this.method = methodEnum;
        return this;
    }

    public RequestBuilder<A, R> withECode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("9f1570e4", new Object[]{this});
        }
        this.mRequest.setNeedEcode(true);
        return this;
    }

    public RequestBuilder<A, R> withSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("b611cc40", new Object[]{this});
        }
        this.mRequest.setNeedSession(true);
        return this;
    }

    public RequestBuilder<A, R> withoutECode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("2db701e6", new Object[]{this});
        }
        this.mRequest.setNeedEcode(false);
        return this;
    }

    public RequestBuilder<A, R> withoutSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestBuilder) ipChange.ipc$dispatch("229324c2", new Object[]{this});
        }
        this.mRequest.setNeedSession(false);
        return this;
    }
}
