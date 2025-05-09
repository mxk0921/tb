package com.taobao.android.trade.boost.request.mtop;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;
import tb.b7j;
import tb.g6j;
import tb.n6j;
import tb.trj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AbsMtopRequestClient<T1, T2> implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isRequesting = false;
    public RemoteBusiness mRemoteBusiness;
    public WeakReference<g6j<T2>> mRequestListenerRef;
    public T1 mRequestParams;
    public String mTTID;

    public boolean allowCollectRuntimeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c03a1e50", new Object[]{this})).booleanValue();
        }
        return b7j.b();
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
            this.isRequesting = false;
        }
    }

    public void execute(T1 t1, g6j<T2> g6jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e498e855", new Object[]{this, t1, g6jVar, str});
            return;
        }
        this.mRequestParams = t1;
        this.mRequestListenerRef = new WeakReference<>(g6jVar);
        this.mTTID = str;
        MtopRequest mtopRequest = new MtopRequest();
        setupMtopRequest(mtopRequest);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, str);
        this.mRemoteBusiness = build;
        build.registeListener((MtopListener) this);
        String unitStrategy = getUnitStrategy();
        if (unitStrategy != null && !unitStrategy.equals(MtopParams.UnitStrategy.UNIT_NULL.toString())) {
            this.mRemoteBusiness.setUnitStrategy(unitStrategy);
        }
        setupRemoteBusiness(this.mRemoteBusiness);
        this.isRequesting = true;
        sendRequest(this.mRemoteBusiness);
        if (allowCollectRuntimeInfo()) {
            b7j.a(mtopRequest);
        }
    }

    public abstract String getApiName();

    public abstract String getApiVersion();

    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return null;
    }

    public boolean isRequesting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48b4c1c8", new Object[]{this})).booleanValue();
        }
        return this.isRequesting;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        throw new UnsupportedOperationException();
    }

    public abstract void sendRequest(RemoteBusiness remoteBusiness);

    public void setupMtopRequest(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528576ea", new Object[]{this, mtopRequest});
            return;
        }
        T1 t1 = this.mRequestParams;
        if (t1 instanceof n6j) {
            mtopRequest.setData(JSON.toJSONString(((n6j) t1).toMap()));
        } else {
            mtopRequest.setData(JSON.toJSONString(t1));
        }
        mtopRequest.setApiName(getApiName());
        mtopRequest.setVersion(getApiVersion());
    }

    public abstract void setupRemoteBusiness(RemoteBusiness remoteBusiness);

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        this.isRequesting = false;
        g6j<T2> g6jVar = this.mRequestListenerRef.get();
        if (g6jVar != null) {
            g6jVar.a(mtopResponse);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        this.isRequesting = false;
        g6j<T2> g6jVar = this.mRequestListenerRef.get();
        if (g6jVar != null) {
            g6jVar.b(mtopResponse);
        }
    }

    public void execute(T1 t1, g6j<T2> g6jVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238686df", new Object[]{this, t1, g6jVar, str, str2});
        } else if (trj.b().a(str2)) {
            execute(t1, g6jVar, str);
        } else {
            g6jVar.b(new MtopResponse(getApiName(), getApiVersion(), "ANDROID_SYS_API_FLOW_LIMIT_LOCKED", ErrorConstant.ERRMSG_API_FLOW_LIMIT_LOCKED));
        }
    }
}
