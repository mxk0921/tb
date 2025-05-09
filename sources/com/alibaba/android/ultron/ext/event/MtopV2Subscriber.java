package com.alibaba.android.ultron.ext.event;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b8v;
import tb.fsb;
import tb.m6v;
import tb.o5e;
import tb.qcv;
import tb.rb;
import tb.t2o;
import tb.tj8;
import tb.u55;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MtopV2Subscriber extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DBG = false;
    public static final String FILE_KEY_MTOP_CONFIG = "mtopConfig";
    public static final String NEXT_TAG_FAIL = "fail";
    public static final String NEXT_TAG_SUCESS = "success";
    public static final String TAG = "MtopV2Subscriber";

    static {
        t2o.a(156237840);
    }

    public static /* synthetic */ void G(MtopV2Subscriber mtopV2Subscriber, b8v b8vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f2f13", new Object[]{mtopV2Subscriber, b8vVar, str});
        } else {
            mtopV2Subscriber.L(b8vVar, str);
        }
    }

    public static /* synthetic */ Context H(MtopV2Subscriber mtopV2Subscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("52ce9bb8", new Object[]{mtopV2Subscriber});
        }
        return mtopV2Subscriber.b;
    }

    public static /* synthetic */ Object ipc$super(MtopV2Subscriber mtopV2Subscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/MtopV2Subscriber");
    }

    @Override // tb.m6v
    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef72cad3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final String J(fsb fsbVar, IDMComponent iDMComponent) {
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

    public final String K(fsb fsbVar) {
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

    public final void L(b8v b8vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d5c0d", new Object[]{this, b8vVar, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "服务竟然崩溃了";
        }
        jSONObject.put("message", (Object) str);
        z(b8vVar, "toastV3", jSONObject);
    }

    public boolean M(MtopRequest mtopRequest, JSONObject jSONObject) {
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

    public void I(b8v b8vVar, String str, MtopResponse mtopResponse) {
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
                tj8.b(MtopV2Subscriber.class.getSimpleName(), "getAndDoNextByTag", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", "JSON PARSE ERROR:" + tj8.c(e));
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
            C(b8vVar, str, jSONObject);
        } else {
            B(b8vVar, str);
        }
        if ("success".equals(str)) {
            str2 = "toastSucceed";
        } else {
            str2 = "toastError";
        }
        if (D(b8vVar).get(str2) instanceof String) {
            String string = D(b8vVar).getString(str2);
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
            Toast.makeText(this.b, str3, 0).show();
        }
    }

    @Override // tb.m6v
    public void F(final b8v b8vVar) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        JSONObject D = D(b8vVar);
        if (D == null) {
            tj8.a(MtopV2Subscriber.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: eventFields is null");
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject jSONObject = D.getJSONObject("mtopConfig");
        final String string = D.getString("subfilter");
        if (jSONObject == null) {
            tj8.a(MtopV2Subscriber.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: mtopConfig is null");
            return;
        }
        String string2 = jSONObject.getString("apiMethod");
        String string3 = jSONObject.getString("apiVersion");
        String string4 = jSONObject.getString("unitStrategy");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        boolean equals = "true".equals(jSONObject.getString("isNeedWua"));
        boolean equals2 = "true".equals(jSONObject.getString("usePost"));
        o5e n = b8vVar.n();
        String string5 = jSONObject.getString("requestType");
        HashMap hashMap = new HashMap();
        if (TextUtils.equals(string5, "async")) {
            hashMap.put("params", J(n.b(), b8vVar.d()));
        } else if (TextUtils.equals(string5, "submit")) {
            hashMap.put("params", K(n.b()));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.putAll(hashMap);
        if (jSONObject2 != null) {
            jSONObject3.putAll(jSONObject2);
        }
        M(mtopRequest, jSONObject3);
        if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            tj8.a(MtopV2Subscriber.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: apiMethod or apiVersion is null");
            return;
        }
        JSONObject jSONObject4 = D.getJSONObject("loadingConfig");
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
        if (!TextUtils.isEmpty(string4)) {
            build.setUnitStrategy(string4);
        }
        build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.ext.event.MtopV2Subscriber.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                tj8.e("MtopV2Subscriber", "onError", mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg());
                b8vVar.n().hideLoading();
                MtopV2Subscriber.this.I(b8vVar, "fail", mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                tj8.e("MtopV2Subscriber", "onSuccess", mtopResponse.getApi() + " onSuccess: " + mtopResponse.getRetMsg());
                b8vVar.n().hideLoading();
                if (TextUtils.isEmpty(string) || !qcv.c(MtopV2Subscriber.H(MtopV2Subscriber.this), string, mtopResponse.getDataJsonObject())) {
                    MtopV2Subscriber.this.I(b8vVar, "success", mtopResponse);
                    return;
                }
                tj8.e("MtopV2Subscriber", "onSuccess", "subfilter执行失败，请求判断为fail: " + string);
                MtopV2Subscriber.this.I(b8vVar, "fail", mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                tj8.e("MtopV2Subscriber", "onSystemError", mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg());
                b8vVar.n().hideLoading();
                MtopV2Subscriber.this.I(b8vVar, "fail", mtopResponse);
                MtopV2Subscriber.G(MtopV2Subscriber.this, b8vVar, mtopResponse.getRetMsg());
            }
        });
        String simpleName = MtopV2Subscriber.class.getSimpleName();
        tj8.e(simpleName, "onHandleEventChain", "start execute: " + string2);
        build.startRequest();
    }
}
