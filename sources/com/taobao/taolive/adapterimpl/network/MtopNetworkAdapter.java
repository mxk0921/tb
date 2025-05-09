package com.taobao.taolive.adapterimpl.network;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b0d;
import tb.t2o;
import tb.wzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MtopNetworkAdapter implements wzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092366);
        t2o.a(806355931);
    }

    public static /* synthetic */ NetResponse c(MtopNetworkAdapter mtopNetworkAdapter, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetResponse) ipChange.ipc$dispatch("d30bc4e0", new Object[]{mtopNetworkAdapter, mtopResponse});
        }
        return mtopNetworkAdapter.g(mtopResponse);
    }

    public static /* synthetic */ NetBaseOutDo d(MtopNetworkAdapter mtopNetworkAdapter, BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetBaseOutDo) ipChange.ipc$dispatch("c448ee8b", new Object[]{mtopNetworkAdapter, baseOutDo});
        }
        return mtopNetworkAdapter.e(baseOutDo);
    }

    @Override // tb.wzc
    public NetResponse a(NetRequest netRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetResponse) ipChange.ipc$dispatch("f7b345c2", new Object[]{this, netRequest});
        }
        RemoteBusiness build = RemoteBusiness.build(f(netRequest));
        h(netRequest, build);
        MtopResponse syncRequest = build.syncRequest();
        if (syncRequest != null) {
            return g(syncRequest);
        }
        return null;
    }

    @Override // tb.wzc
    public void b(NetRequest netRequest, final b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423b5a6f", new Object[]{this, netRequest, b0dVar});
            return;
        }
        MtopBusiness registerListener = RemoteBusiness.build(f(netRequest)).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.taolive.adapterimpl.network.MtopNetworkAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                b0d b0dVar2 = b0dVar;
                if (b0dVar2 != null) {
                    b0dVar2.onError(i, MtopNetworkAdapter.c(MtopNetworkAdapter.this, mtopResponse), obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (b0dVar != null) {
                    b0dVar.onSuccess(i, MtopNetworkAdapter.c(MtopNetworkAdapter.this, mtopResponse), MtopNetworkAdapter.d(MtopNetworkAdapter.this, baseOutDo), obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                b0d b0dVar2 = b0dVar;
                if (b0dVar2 != null) {
                    b0dVar2.onSystemError(i, MtopNetworkAdapter.c(MtopNetworkAdapter.this, mtopResponse), null);
                }
            }
        });
        h(netRequest, registerListener);
        registerListener.startRequest();
    }

    public final NetBaseOutDo e(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetBaseOutDo) ipChange.ipc$dispatch("87ea0085", new Object[]{this, baseOutDo});
        }
        if (baseOutDo != null) {
            String jSONString = JSON.toJSONString(baseOutDo);
            if (!TextUtils.isEmpty(jSONString)) {
                return (NetBaseOutDo) JSON.parseObject(jSONString, NetBaseOutDo.class);
            }
        }
        return null;
    }

    public final MtopRequest f(NetRequest netRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("69edacb0", new Object[]{this, netRequest});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(netRequest.getApiName());
        mtopRequest.setNeedEcode(netRequest.isNeedEcode());
        mtopRequest.setNeedSession(netRequest.isNeedSession());
        mtopRequest.setVersion(netRequest.getVersion());
        mtopRequest.setData(netRequest.getData());
        mtopRequest.dataParams = netRequest.getDataParams();
        return mtopRequest;
    }

    public final NetResponse g(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetResponse) ipChange.ipc$dispatch("551117b6", new Object[]{this, mtopResponse});
        }
        NetResponse netResponse = new NetResponse();
        netResponse.setApi(mtopResponse.getApi());
        netResponse.setV(mtopResponse.getV());
        netResponse.setRetCode(mtopResponse.getRetCode());
        netResponse.setRetMsg(mtopResponse.getRetMsg());
        netResponse.setDataJsonObject(mtopResponse.getDataJsonObject());
        netResponse.setHeaderFields(mtopResponse.getHeaderFields());
        netResponse.setBytedata(mtopResponse.getBytedata());
        netResponse.setResponseCode(String.valueOf(mtopResponse.getResponseCode()));
        return netResponse;
    }

    public final void h(NetRequest netRequest, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94793ed7", new Object[]{this, netRequest, mtopBusiness});
            return;
        }
        if (netRequest.isUseWua()) {
            mtopBusiness.useWua();
        }
        if (netRequest.isPost()) {
            mtopBusiness.reqMethod(MethodEnum.POST);
        }
        if (!TextUtils.equals("-1", netRequest.getBizId())) {
            String bizId = netRequest.getBizId();
            if (!TextUtils.isEmpty(bizId) && TextUtils.isDigitsOnly(bizId)) {
                mtopBusiness.setBizId(bizId);
            }
        } else {
            mtopBusiness.setBizId("59");
        }
        if (TextUtils.isEmpty(netRequest.getTtid())) {
            mtopBusiness.ttid(netRequest.getTtid());
        }
        if (netRequest.getRequestHeaders() != null) {
            mtopBusiness.headers(netRequest.getRequestHeaders());
        }
        if (netRequest.getRequestContext() != null) {
            mtopBusiness.reqContext(netRequest.getRequestContext());
        }
        if (netRequest.getRequestHeaders() != null) {
            mtopBusiness.headers(netRequest.getRequestHeaders());
        }
        if (netRequest.getRequestNotifyHandler() != null) {
            mtopBusiness.handler(netRequest.getRequestNotifyHandler());
        }
    }
}
