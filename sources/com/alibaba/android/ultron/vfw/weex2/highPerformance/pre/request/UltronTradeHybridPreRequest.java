package com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request;

import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.lbv;
import tb.obv;
import tb.pbv;
import tb.s5e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronTradeHybridPreRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MtopBusiness f2372a;
    public final s5e b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements MessageQueue.IdleHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2373a;

        public a(String str) {
            this.f2373a = str;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            UltronTradeHybridPreRequest.this.b(this.f2373a);
            return false;
        }
    }

    static {
        t2o.a(157286886);
    }

    public UltronTradeHybridPreRequest(pbv pbvVar, final JSONObject jSONObject, s5e s5eVar) {
        MethodEnum methodEnum;
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(pbvVar.f26004a);
        mtopRequest.setVersion(pbvVar.b);
        mtopRequest.setNeedEcode(pbvVar.e);
        mtopRequest.setNeedSession(pbvVar.f);
        Object obj = pbvVar.i;
        if (obj instanceof String) {
            String str = (String) obj;
            if (lbv.m(str)) {
                Object n = lbv.n(str, jSONObject);
                if (n instanceof JSONObject) {
                    mtopRequest.setData(((JSONObject) n).toJSONString());
                }
            }
        } else if (obj instanceof JSONObject) {
            JSONObject parseObject = JSON.parseObject(((JSONObject) obj).toJSONString());
            a(parseObject, jSONObject);
            mtopRequest.setData(parseObject.toJSONString());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        this.f2372a = build;
        if (pbvVar.c) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        build.reqMethod(methodEnum);
        if (pbvVar.d) {
            build.useWua();
        }
        if (pbvVar.g) {
            build.allowSwitchToPOST(true);
        }
        String str2 = pbvVar.h;
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, "UNIT_DEFAULT")) {
            build.setUnitStrategy(str2);
        }
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.UltronTradeHybridPreRequest.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    return;
                }
                s5e s5eVar2 = UltronTradeHybridPreRequest.this.b;
                if (s5eVar2 != null) {
                    s5eVar2.b(false, jSONObject, mtopResponse);
                }
                if (mtopResponse == null) {
                    s5e s5eVar3 = UltronTradeHybridPreRequest.this.b;
                    if (s5eVar3 != null) {
                        s5eVar3.a("responseError", "mtopResponse is null");
                    }
                    obv.k(false, mtopResponse, "onError: mtopResponse is null");
                    return;
                }
                String str3 = "unknown";
                String retCode = TextUtils.isEmpty(mtopResponse.getRetCode()) ? str3 : mtopResponse.getRetCode();
                if (!TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                    str3 = mtopResponse.getRetMsg();
                }
                s5e s5eVar4 = UltronTradeHybridPreRequest.this.b;
                if (s5eVar4 != null) {
                    s5eVar4.a(retCode, str3);
                }
                obv.k(false, mtopResponse, "onError: errCode - " + retCode + ", errorMsg - " + str3);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    return;
                }
                s5e s5eVar2 = UltronTradeHybridPreRequest.this.b;
                if (s5eVar2 != null) {
                    s5eVar2.b(false, jSONObject, mtopResponse);
                }
                if (mtopResponse == null) {
                    s5e s5eVar3 = UltronTradeHybridPreRequest.this.b;
                    if (s5eVar3 != null) {
                        s5eVar3.a("responseError", "mtopResponse is null");
                    }
                    obv.k(false, mtopResponse, "onSystemError: mtopResponse is null");
                    return;
                }
                String str3 = "unknown";
                String retCode = TextUtils.isEmpty(mtopResponse.getRetCode()) ? str3 : mtopResponse.getRetCode();
                if (!TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                    str3 = mtopResponse.getRetMsg();
                }
                s5e s5eVar4 = UltronTradeHybridPreRequest.this.b;
                if (s5eVar4 != null) {
                    s5eVar4.a(retCode, str3);
                }
                obv.k(false, mtopResponse, "onSystemError: errCode - " + retCode + ", errorMsg - " + str3);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj2});
                    return;
                }
                s5e s5eVar2 = UltronTradeHybridPreRequest.this.b;
                if (s5eVar2 != null) {
                    s5eVar2.b(true, jSONObject, mtopResponse);
                }
                if (mtopResponse == null) {
                    s5e s5eVar3 = UltronTradeHybridPreRequest.this.b;
                    if (s5eVar3 != null) {
                        s5eVar3.a("responseError", "mtopResponse is null");
                    }
                    obv.k(false, mtopResponse, "onSuccess: mtopResponse is null");
                    return;
                }
                try {
                    byte[] bytedata = mtopResponse.getBytedata();
                    if (bytedata == null) {
                        s5e s5eVar4 = UltronTradeHybridPreRequest.this.b;
                        if (s5eVar4 != null) {
                            s5eVar4.a("responseError", "byteData is null");
                        }
                        obv.k(false, mtopResponse, "onSuccess: byteData is null");
                        return;
                    }
                    JSONObject parseObject2 = JSON.parseObject(new String(bytedata));
                    s5e s5eVar5 = UltronTradeHybridPreRequest.this.b;
                    if (s5eVar5 != null) {
                        s5eVar5.onSuccess(parseObject2);
                    }
                    obv.k(true, mtopResponse, "onSuccess!");
                } catch (Exception e) {
                    s5e s5eVar6 = UltronTradeHybridPreRequest.this.b;
                    if (s5eVar6 != null) {
                        s5eVar6.a("responseError", e.toString());
                    }
                    String obj3 = e.toString();
                    obv.k(false, mtopResponse, "onSuccess: " + obj3);
                }
            }
        });
        this.b = s5eVar;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c492caa1", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str) && (obj = jSONObject.get(str)) != null) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (lbv.m(str2)) {
                            Object n = lbv.n(str2, jSONObject2);
                            if (n != null) {
                                jSONObject.put(str, n);
                            }
                        }
                    }
                    if (obj instanceof JSONObject) {
                        a((JSONObject) obj, jSONObject2);
                    }
                }
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3d47e0", new Object[]{this, str});
            return;
        }
        if (str != null) {
            this.f2372a.setBizTopic(str);
        }
        this.f2372a.startRequest();
    }

    public void c(String str) {
        MessageQueue messageQueue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d88d54", new Object[]{this, str});
            return;
        }
        try {
            messageQueue = Looper.myQueue();
        } catch (Exception e) {
            UnifyLog.e("UltronTradeHybridPreRequest.requestIdle", e.toString());
            messageQueue = null;
        }
        if (messageQueue == null) {
            UnifyLog.e("UltronTradeHybridPreRequest.requestIdle", "messageQueue is null");
        } else {
            messageQueue.addIdleHandler(new a(str));
        }
    }
}
