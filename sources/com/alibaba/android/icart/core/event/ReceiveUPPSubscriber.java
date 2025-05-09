package com.alibaba.android.icart.core.event;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Iterator;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import tb.be3;
import tb.blq;
import tb.fdv;
import tb.kmb;
import tb.lcu;
import tb.lmb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ReceiveUPPSubscriber extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199453);
    }

    public static /* synthetic */ Object ipc$super(ReceiveUPPSubscriber receiveUPPSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/ReceiveUPPSubscriber");
    }

    public static /* synthetic */ IDMComponent p(ReceiveUPPSubscriber receiveUPPSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("bf47ac96", new Object[]{receiveUPPSubscriber});
        }
        return receiveUPPSubscriber.e;
    }

    public static /* synthetic */ kmb q(ReceiveUPPSubscriber receiveUPPSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("bbfdd13a", new Object[]{receiveUPPSubscriber});
        }
        return receiveUPPSubscriber.j;
    }

    public static /* synthetic */ lcu r(ReceiveUPPSubscriber receiveUPPSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("b6a09d3b", new Object[]{receiveUPPSubscriber});
        }
        return receiveUPPSubscriber.f23048a;
    }

    public static /* synthetic */ IDMComponent s(ReceiveUPPSubscriber receiveUPPSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("9a8cc073", new Object[]{receiveUPPSubscriber});
        }
        return receiveUPPSubscriber.e;
    }

    public static /* synthetic */ lcu t(ReceiveUPPSubscriber receiveUPPSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("d3b79f3d", new Object[]{receiveUPPSubscriber});
        }
        return receiveUPPSubscriber.f23048a;
    }

    public static /* synthetic */ kmb u(ReceiveUPPSubscriber receiveUPPSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("f42e78b6", new Object[]{receiveUPPSubscriber});
        }
        return receiveUPPSubscriber.j;
    }

    public static /* synthetic */ Context v(ReceiveUPPSubscriber receiveUPPSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f2820144", new Object[]{receiveUPPSubscriber});
        }
        return receiveUPPSubscriber.b;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        DMEvent dMEvent = (DMEvent) lcuVar.c();
        JSONObject fields = dMEvent != null ? dMEvent.getFields() : null;
        if (fields != null) {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(fields.getString("mtopApi"));
            mtopRequest.setVersion(fields.getString("mtopVersion"));
            mtopRequest.setData(fields.getString("mtopParams"));
            RemoteBusiness build = RemoteBusiness.build(mtopRequest);
            build.reqMethod(MethodEnum.POST);
            build.setUnitStrategy("UNIT_TRADE");
            final blq Y = this.j.Y();
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.event.ReceiveUPPSubscriber.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    Y.a(2);
                    if (mtopResponse != null) {
                        be3.c(ReceiveUPPSubscriber.v(ReceiveUPPSubscriber.this), mtopResponse.getRetMsg());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        onError(i, mtopResponse, obj);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    if (mtopResponse != null) {
                        org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        JSONObject fields2 = ReceiveUPPSubscriber.p(ReceiveUPPSubscriber.this).getFields();
                        if (dataJsonObject != null && fields2 != null) {
                            Iterator<String> keys = dataJsonObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                try {
                                    fields2.put(next, dataJsonObject.get(next));
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                            fields2.put("linkDisable", (Object) "true");
                        } else {
                            return;
                        }
                    }
                    ReceiveUPPSubscriber.q(ReceiveUPPSubscriber.this).e().E(4);
                    ReceiveUPPSubscriber.r(ReceiveUPPSubscriber.this).m("_isSupportChangeIDMEvent", Boolean.TRUE);
                    ReceiveUPPSubscriber.u(ReceiveUPPSubscriber.this).k0(ReceiveUPPSubscriber.s(ReceiveUPPSubscriber.this), ReceiveUPPSubscriber.t(ReceiveUPPSubscriber.this), true, null, null);
                }
            });
            Y.i(2);
            build.startRequest();
        }
    }
}
