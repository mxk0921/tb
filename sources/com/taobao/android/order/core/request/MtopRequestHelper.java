package com.taobao.android.order.core.request;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kor;
import tb.pqb;
import tb.t2o;
import tb.u3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopRequestHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.order.core.request.MtopRequestHelper$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class AnonymousClass2 implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ pqb val$iContainerListener;

        public AnonymousClass2(pqb pqbVar) {
            this.val$iContainerListener = pqbVar;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            UnifyLog.e("MtopRequestHelper", mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg());
            pqb pqbVar = this.val$iContainerListener;
            if (pqbVar != null) {
                pqbVar.X(mtopResponse.getRetMsg(), mtopResponse, null, null);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            UnifyLog.e("MtopRequestHelper", mtopResponse.getApi() + " onSuccess: " + mtopResponse.getRetMsg());
            pqb pqbVar = this.val$iContainerListener;
            if (pqbVar != null) {
                pqbVar.h2(mtopResponse, null, null);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            pqb pqbVar = this.val$iContainerListener;
            if (pqbVar != null) {
                pqbVar.X(mtopResponse.getRetMsg(), mtopResponse, null, null);
            }
            UnifyLog.e("MtopRequestHelper", mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg());
        }
    }

    static {
        t2o.a(614465742);
    }

    public static void a(u3o u3oVar, final pqb pqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2f3c76", new Object[]{u3oVar, pqbVar});
        } else if (u3oVar != null) {
            MtopRequest mtopRequest = new MtopRequest();
            String c = u3oVar.c();
            String n = u3oVar.n();
            if (TextUtils.isEmpty(c)) {
                kor.a("MtopRequestHelper", "EVENT_CHAIN_PARAMS_VALID_ERROR", "error:  apiVersion is null");
                return;
            }
            mtopRequest.setApiName(c);
            mtopRequest.setVersion(n);
            mtopRequest.setData(JSON.toJSONString(u3oVar.i()));
            MtopBusiness build = MtopBusiness.build(mtopRequest);
            build.reqMethod(MethodEnum.GET);
            build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.order.core.request.MtopRequestHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    UnifyLog.e("MtopRequestHelper", mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg());
                    pqb pqbVar2 = pqb.this;
                    if (pqbVar2 != null) {
                        pqbVar2.X(mtopResponse.getRetMsg(), mtopResponse, null, null);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    UnifyLog.e("MtopRequestHelper", mtopResponse.getApi() + " onSuccess: " + mtopResponse.getRetMsg());
                    pqb pqbVar2 = pqb.this;
                    if (pqbVar2 != null) {
                        pqbVar2.h2(mtopResponse, null, null);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    pqb pqbVar2 = pqb.this;
                    if (pqbVar2 != null) {
                        pqbVar2.X(mtopResponse.getRetMsg(), mtopResponse, null, null);
                    }
                    UnifyLog.e("MtopRequestHelper", mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg());
                }
            });
            kor.a("MtopRequestHelper", "onHandleEventChain", "start execute: " + c);
            build.startRequest();
        }
    }
}
