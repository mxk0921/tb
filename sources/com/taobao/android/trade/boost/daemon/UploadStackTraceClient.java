package com.taobao.android.trade.boost.daemon;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.cmv;
import tb.g6j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UploadStackTraceClient extends AbsMtopRequestClient<cmv, MtopResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UploadStackTraceClient uploadStackTraceClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/boost/daemon/UploadStackTraceClient");
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public boolean allowCollectRuntimeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c03a1e50", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getApiName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
        }
        return "mtop.shop.mc.stacktrace";
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
        }
        return "1.0";
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return MtopParams.UnitStrategy.UNIT_NULL.toString();
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        g6j g6jVar = (g6j) this.mRequestListenerRef.get();
        if (g6jVar != null) {
            g6jVar.onSuccess(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public void sendRequest(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21b8a8e", new Object[]{this, remoteBusiness});
        } else {
            remoteBusiness.startRequest();
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.AbsMtopRequestClient
    public void setupRemoteBusiness(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35df7aa", new Object[]{this, remoteBusiness});
        } else {
            remoteBusiness.reqMethod(MethodEnum.POST);
        }
    }
}
