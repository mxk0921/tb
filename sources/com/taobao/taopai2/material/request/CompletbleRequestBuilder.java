package com.taobao.taopai2.material.request;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai2.material.exception.ResponseDataException;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.n94;
import tb.o23;
import tb.p94;
import tb.t2o;
import tb.v94;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CompletbleRequestBuilder<A> implements v94, IRemoteBaseListener, o23 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RemoteBusiness business;
    private p94 emitter;
    private MethodEnum method;
    private final MtopRequest request;

    static {
        t2o.a(782237931);
        t2o.a(589299719);
    }

    public CompletbleRequestBuilder(A a2) {
        MtopRequest mtopRequest = new MtopRequest();
        this.request = mtopRequest;
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
        } else {
            this.emitter.onError(new ResponseDataException(mtopResponse, "error_response_null"));
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            this.emitter.onComplete();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.emitter.onError(new ResponseDataException(mtopResponse, "system_error_response_null"));
        }
    }

    public CompletbleRequestBuilder<A> setTarget(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("e4c280fa", new Object[]{this, str, str2});
        }
        this.request.setApiName(str);
        this.request.setVersion(str2);
        return this;
    }

    public void subscribe(p94 p94Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ee550f", new Object[]{this, p94Var});
            return;
        }
        this.emitter = p94Var;
        p94Var.setCancellable(this);
        RemoteBusiness build = RemoteBusiness.build(this.request);
        this.business = build;
        MethodEnum methodEnum = this.method;
        if (methodEnum != null) {
            build.mtopProp.method = methodEnum;
        }
        build.registeListener((IRemoteListener) this);
        this.business.startRequest(Response.class);
    }

    public n94 toCompletable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n94) ipChange.ipc$dispatch("c9421306", new Object[]{this});
        }
        return n94.create(this);
    }

    public CompletbleRequestBuilder<A> useMethod(MethodEnum methodEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("f5d476ad", new Object[]{this, methodEnum});
        }
        this.method = methodEnum;
        return this;
    }

    public CompletbleRequestBuilder<A> withECode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("74c9bd75", new Object[]{this});
        }
        this.request.setNeedEcode(true);
        return this;
    }

    public CompletbleRequestBuilder<A> withSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("ce8095d1", new Object[]{this});
        }
        this.request.setNeedSession(true);
        return this;
    }

    public CompletbleRequestBuilder<A> withoutECode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("a13373f7", new Object[]{this});
        }
        this.request.setNeedEcode(false);
        return this;
    }

    public CompletbleRequestBuilder<A> withoutSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompletbleRequestBuilder) ipChange.ipc$dispatch("8756b3d3", new Object[]{this});
        }
        this.request.setNeedSession(false);
        return this;
    }
}
