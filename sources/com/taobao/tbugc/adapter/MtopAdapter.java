package com.taobao.tbugc.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import org.json.JSONException;
import org.json.JSONObject;
import tb.e3o;
import tb.m9o;
import tb.qid;
import tb.t2o;
import tb.xzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MtopAdapter implements xzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120543);
        t2o.a(758120483);
    }

    public static /* synthetic */ m9o b(MtopAdapter mtopAdapter, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9o) ipChange.ipc$dispatch("f7159781", new Object[]{mtopAdapter, mtopResponse});
        }
        return mtopAdapter.d(mtopResponse);
    }

    @Override // tb.xzc
    public void a(e3o e3oVar, final qid qidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0384efe", new Object[]{this, e3oVar, qidVar});
            return;
        }
        RemoteBusiness registeListener = RemoteBusiness.build(c(e3oVar)).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tbugc.adapter.MtopAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    qidVar.H1(MtopAdapter.b(MtopAdapter.this, mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    qidVar.w1(MtopAdapter.b(MtopAdapter.this, mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    qidVar.H1(MtopAdapter.b(MtopAdapter.this, mtopResponse));
                }
            }
        });
        registeListener.protocol(ProtocolEnum.HTTPSECURE);
        registeListener.reqMethod(MethodEnum.POST);
        if (e3oVar.f()) {
            registeListener.useWua();
        }
        registeListener.setBizId(82);
        registeListener.startRequest();
    }

    public final MtopRequest c(e3o e3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("419e9e18", new Object[]{this, e3oVar});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(e3oVar.a());
        mtopRequest.setVersion(e3oVar.c());
        mtopRequest.setNeedEcode(e3oVar.d());
        mtopRequest.setNeedSession(e3oVar.e());
        Map<String, Serializable> b = e3oVar.b();
        if (b != null && !b.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(mtopRequest.getData());
                for (Map.Entry<String, Serializable> entry : b.entrySet()) {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                }
                mtopRequest.setData(jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return mtopRequest;
    }

    public final m9o d(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9o) ipChange.ipc$dispatch("5cdd52be", new Object[]{this, mtopResponse});
        }
        m9o m9oVar = new m9o();
        m9oVar.i(mtopResponse.getResponseCode());
        m9oVar.f(mtopResponse.getRetCode());
        m9oVar.g(mtopResponse.getRetMsg());
        m9oVar.h(mtopResponse);
        if (mtopResponse.getBytedata() != null) {
            try {
                m9oVar.e(new String(mtopResponse.getBytedata(), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return m9oVar;
    }
}
