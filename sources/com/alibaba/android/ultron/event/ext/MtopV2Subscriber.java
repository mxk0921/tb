package com.alibaba.android.ultron.event.ext;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b8v;
import tb.fsb;
import tb.n6v;
import tb.o5e;
import tb.qcv;
import tb.rb;
import tb.t2o;
import tb.u55;
import tb.uj8;
import tb.z4v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MtopV2Subscriber extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DBG = false;
    public static final String NEXT_TAG_FAIL = "fail";
    public static final String NEXT_TAG_SUCESS = "success";
    public static final String TAG = "MtopV2Subscriber";
    public String j = null;
    public Map<String, String> k = null;

    static {
        t2o.a(614465547);
    }

    public static /* synthetic */ Context J(MtopV2Subscriber mtopV2Subscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("659df119", new Object[]{mtopV2Subscriber});
        }
        return mtopV2Subscriber.b;
    }

    public static /* synthetic */ Object ipc$super(MtopV2Subscriber mtopV2Subscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/MtopV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "2110943770285271256";
    }

    @Override // tb.n6v
    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef72cad3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final String L(fsb fsbVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f82af61d", new Object[]{this, fsbVar, iDMComponent});
        }
        if (!(fsbVar instanceof u55)) {
            return "";
        }
        u55 u55Var = (u55) fsbVar;
        return u55Var.v().a(u55Var, iDMComponent);
    }

    public final String M(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("548b4467", new Object[]{this, fsbVar});
        }
        if (!(fsbVar instanceof u55)) {
            return "";
        }
        u55 u55Var = (u55) fsbVar;
        return u55Var.v().t(u55Var);
    }

    public boolean N(MtopRequest mtopRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95dce3b7", new Object[]{this, mtopRequest, jSONObject})).booleanValue();
        }
        if (mtopRequest == null || jSONObject == null) {
            return false;
        }
        mtopRequest.setData(jSONObject.toJSONString());
        return true;
    }

    public MtopV2Subscriber O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopV2Subscriber) ipChange.ipc$dispatch("ab5d25d2", new Object[]{this, str});
        }
        this.j = str;
        return this;
    }

    public MtopV2Subscriber P(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopV2Subscriber) ipChange.ipc$dispatch("ea2b5819", new Object[]{this, map});
        }
        this.k = map;
        return this;
    }

    public void K(b8v b8vVar, String str, MtopResponse mtopResponse) {
        JSONObject jSONObject;
        Object obj;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f172c68e", new Object[]{this, b8vVar, str, mtopResponse});
            return;
        }
        String str3 = null;
        if (mtopResponse != null) {
            try {
                jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            } catch (Exception e) {
                uj8.b(MtopV2Subscriber.class.getSimpleName(), "getAndDoNextByTag", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", "JSON PARSE ERROR:" + uj8.d(e));
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                jSONObject.put("api", (Object) mtopResponse.getApi());
                jSONObject.put("data", (Object) new JSONObject());
                JSONArray jSONArray = new JSONArray();
                jSONObject.put(rb.RESULT_KEY, (Object) jSONArray);
                if (TextUtils.isEmpty(mtopResponse.getRetCode())) {
                    obj = Integer.valueOf(mtopResponse.getResponseCode());
                } else {
                    obj = mtopResponse.getRetCode();
                }
                jSONArray.add(String.format("%s::%s", obj, mtopResponse.getRetMsg()));
                jSONObject.put("v", (Object) mtopResponse.getV());
            }
            D(b8vVar, str, jSONObject);
        } else {
            C(b8vVar, str);
        }
        if ("success".equals(str)) {
            str2 = "toastSucceed";
        } else {
            str2 = "toastError";
        }
        if (E(b8vVar).get(str2) instanceof String) {
            String string = E(b8vVar).getString(str2);
            if ("response_msg".equals(string)) {
                if (!(mtopResponse == null || mtopResponse.getDataJsonObject() == null)) {
                    str3 = mtopResponse.getDataJsonObject().optString("msg");
                }
                if (TextUtils.isEmpty(str3) && mtopResponse != null && str == "fail") {
                    str3 = mtopResponse.getRetMsg();
                }
            } else {
                str3 = string;
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            z4v.a(this.b, str3);
        }
    }

    @Override // tb.n6v
    public void I(final b8v b8vVar) {
        JSONObject jSONObject;
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        JSONObject E = E(b8vVar);
        if (E == null) {
            uj8.a(MtopV2Subscriber.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: eventFields is null");
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject jSONObject2 = E.getJSONObject("mtopConfig");
        final String string = E.getString("subfilter");
        if (jSONObject2 == null) {
            uj8.a(MtopV2Subscriber.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: mtopConfig is null");
            return;
        }
        String string2 = jSONObject2.getString("apiMethod");
        String string3 = jSONObject2.getString("apiVersion");
        if (jSONObject2.get("data") instanceof JSONObject) {
            jSONObject = jSONObject2.getJSONObject("data");
        } else {
            if (jSONObject2.get("data") instanceof String) {
                try {
                    jSONObject = JSON.parseObject(jSONObject2.getString("data"));
                } catch (Throwable th) {
                    uj8.a(MtopV2Subscriber.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", th.toString());
                }
            }
            jSONObject = null;
        }
        boolean equals = "true".equals(jSONObject2.getString("isNeedWua"));
        boolean equals2 = "true".equals(jSONObject2.getString("usePost"));
        o5e n = b8vVar.n();
        String string4 = jSONObject2.getString("requestType");
        HashMap hashMap = new HashMap();
        if (TextUtils.equals(string4, "async")) {
            hashMap.put("params", L(n.b(), b8vVar.d()));
        } else if (TextUtils.equals(string4, "submit")) {
            hashMap.put("params", M(n.b()));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.putAll(hashMap);
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                Object obj = jSONObject.get(str);
                if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                    jSONObject3.put(str, (Object) JSON.toJSONString(obj));
                } else {
                    jSONObject3.put(str, obj);
                }
            }
        }
        Map<String, String> map = this.k;
        if (map != null) {
            jSONObject3.putAll(map);
        }
        N(mtopRequest, jSONObject3);
        if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            uj8.a(MtopV2Subscriber.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: apiMethod or apiVersion is null");
            return;
        }
        JSONObject jSONObject4 = E.getJSONObject("loadingConfig");
        if (jSONObject4 != null) {
            b8vVar.n().c(jSONObject4.getString("message"));
        }
        mtopRequest.setApiName(string2);
        mtopRequest.setVersion(string3);
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        if (equals2) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        build.reqMethod(methodEnum);
        if (equals) {
            build.useWua();
        }
        String str2 = this.j;
        if (str2 != null) {
            build.setUnitStrategy(str2);
        }
        build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.event.ext.MtopV2Subscriber.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    return;
                }
                uj8.f("MtopV2Subscriber", "onError", mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg());
                b8vVar.n().hideLoading();
                MtopV2Subscriber.this.K(b8vVar, "fail", mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj2});
                    return;
                }
                uj8.f("MtopV2Subscriber", "onSuccess", mtopResponse.getApi() + " onSuccess: " + mtopResponse.getRetMsg());
                b8vVar.n().hideLoading();
                if (TextUtils.isEmpty(string) || !qcv.c(MtopV2Subscriber.J(MtopV2Subscriber.this), string, mtopResponse.getDataJsonObject())) {
                    MtopV2Subscriber.this.K(b8vVar, "success", mtopResponse);
                    return;
                }
                uj8.f("MtopV2Subscriber", "onSuccess", "subfilter执行失败，请求判断为fail: " + string);
                MtopV2Subscriber.this.K(b8vVar, "fail", mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    return;
                }
                uj8.f("MtopV2Subscriber", "onSystemError", mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg());
                b8vVar.n().hideLoading();
                MtopV2Subscriber.this.K(b8vVar, "fail", mtopResponse);
            }
        });
        String simpleName = MtopV2Subscriber.class.getSimpleName();
        uj8.f(simpleName, "onHandleEventChain", "start execute: " + string2);
        build.startRequest();
    }
}
