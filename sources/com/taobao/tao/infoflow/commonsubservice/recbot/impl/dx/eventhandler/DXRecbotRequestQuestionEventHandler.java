package com.taobao.tao.infoflow.commonsubservice.recbot.impl.dx.eventhandler;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.login4android.api.Login;
import com.taobao.tao.infoflow.commonsubservice.recbot.impl.GetDefaultQuestionsResponse;
import com.taobao.tao.infoflow.commonsubservice.recbot.impl.GetDefaultQuestionsResult;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bqa;
import tb.fve;
import tb.get;
import tb.j18;
import tb.ja6;
import tb.ob5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DXRecbotRequestQuestionEventHandler extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RECBOTREQUESTQUESTION = 5868996299584651477L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f12439a;
        public final /* synthetic */ String b;

        public a(DXRuntimeContext dXRuntimeContext, String str) {
            this.f12439a = dXRuntimeContext;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f12439a.i().getBooleanValue("updateQuestionFinish")) {
                DXRecbotRequestQuestionEventHandler.a(DXRecbotRequestQuestionEventHandler.this, null, this.f12439a, true, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f12440a;
        public final /* synthetic */ String b;

        public b(DXRuntimeContext dXRuntimeContext, String str) {
            this.f12440a = dXRuntimeContext;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRuntimeContext dXRuntimeContext = this.f12440a;
            if (dXRuntimeContext != null && dXRuntimeContext.L() != null && this.f12440a.L().isAttachedToWindow()) {
                ja6.b(this.b, this.f12440a.L());
            }
        }
    }

    static {
        t2o.a(729809426);
    }

    public static /* synthetic */ void a(DXRecbotRequestQuestionEventHandler dXRecbotRequestQuestionEventHandler, JSONObject jSONObject, DXRuntimeContext dXRuntimeContext, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c66cec0", new Object[]{dXRecbotRequestQuestionEventHandler, jSONObject, dXRuntimeContext, new Boolean(z), str});
        } else {
            dXRecbotRequestQuestionEventHandler.f(jSONObject, dXRuntimeContext, z, str);
        }
    }

    public static /* synthetic */ Object ipc$super(DXRecbotRequestQuestionEventHandler dXRecbotRequestQuestionEventHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/commonsubservice/recbot/impl/dx/eventhandler/DXRecbotRequestQuestionEventHandler");
    }

    public JSONObject c(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d6dc2dd0", new Object[]{this, jSONObject, jSONObject2});
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("subSection");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
            jSONObject.put("subSection", (Object) jSONObject3);
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("questions");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
            jSONObject3.put("questions", (Object) jSONObject4);
        }
        JSONObject jSONObject5 = jSONObject4.getJSONObject("item");
        if (jSONObject5 == null) {
            jSONObject5 = new JSONObject();
            jSONObject4.put("item", (Object) jSONObject5);
        }
        if (jSONObject2 != null && jSONObject2.size() > 0) {
            jSONObject5.putAll(jSONObject2);
        }
        return jSONObject5;
    }

    public final void d(String str, final DXRuntimeContext dXRuntimeContext, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113cf621", new Object[]{this, str, dXRuntimeContext, str2});
            return;
        }
        RemoteBusiness build = RemoteBusiness.build(b(str, Login.getUserId()), TaoHelper.getTTID());
        build.reqMethod(MethodEnum.POST);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tao.infoflow.commonsubservice.recbot.impl.dx.eventhandler.DXRecbotRequestQuestionEventHandler.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                fve.e("RecbotRequestQuestion", "getQuestions fail");
                DXRecbotRequestQuestionEventHandler.a(DXRecbotRequestQuestionEventHandler.this, null, dXRuntimeContext, true, str2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject jSONObject;
                GetDefaultQuestionsResult getDefaultQuestionsResult;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (!mtopResponse.isApiSuccess() || !(baseOutDo instanceof GetDefaultQuestionsResponse) || (getDefaultQuestionsResult = (GetDefaultQuestionsResult) baseOutDo.getData()) == null || !getDefaultQuestionsResult.isValid()) {
                    jSONObject = null;
                } else {
                    jSONObject = getDefaultQuestionsResult.questions;
                }
                DXRecbotRequestQuestionEventHandler.a(DXRecbotRequestQuestionEventHandler.this, jSONObject, dXRuntimeContext, true, str2);
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
        }).startRequest(GetDefaultQuestionsResponse.class);
        get.a().f(new a(dXRuntimeContext, str2), 3000L);
    }

    public final void e(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca593e38", new Object[]{this, jSONObject, str, obj});
        } else if (jSONObject == null) {
            bqa.d("RecbotRequestQuestion", "sectionData == null, key=" + str);
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                jSONObject.put("ext", (Object) jSONObject2);
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("clientCache");
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject(16);
                jSONObject2.put("clientCache", (Object) jSONObject3);
            }
            if (obj == null) {
                jSONObject3.remove(str);
            } else {
                jSONObject3.put(str, obj);
            }
        }
    }

    public final void f(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fc6a26", new Object[]{this, jSONObject, dXRuntimeContext, new Boolean(z), str});
            return;
        }
        JSONObject i = dXRuntimeContext.i();
        e(i, "recbotPresetQuestions", c(i, jSONObject));
        i.put("updateQuestionFinish", (Object) Boolean.TRUE);
        fve.f("RecbotRequestQuestion", "updateQuestionsList: " + z);
        if (z) {
            get.a().f(new b(dXRuntimeContext, str), 200L);
        }
    }

    public final MtopRequest b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("9429bc0f", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", (Object) "48834");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("itemId", (Object) str);
        jSONObject2.put("userId", (Object) str2);
        jSONObject.put("params", (Object) JSON.toJSONString(jSONObject2));
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setNeedSession(true);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setData(jSONObject.toJSONString());
        mtopRequest.setVersion("2.0");
        mtopRequest.setApiName("mtop.relationrecommend.WirelessRecommend.recommend");
        return mtopRequest;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext != null && objArr != null && objArr.length > 0) {
            String str = (String) j18.a(objArr, 0, String.class);
            String str2 = (String) j18.a(objArr, 1, String.class);
            JSONObject i = dXRuntimeContext.i();
            if (i.getBooleanValue("sendQuestionsRequest") || TextUtils.isEmpty(str)) {
                f(null, dXRuntimeContext, false, str2);
                return;
            }
            i.put("sendQuestionsRequest", (Object) Boolean.TRUE);
            fve.f("RecbotRequestQuestion", "sendRequest");
            d(str, dXRuntimeContext, str2);
        }
    }
}
