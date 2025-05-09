package com.taobao.android.behavir.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.orange.OConstant;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bnv;
import tb.f82;
import tb.kq4;
import tb.om8;
import tb.t2o;
import tb.w80;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RequestAction implements w80 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "RequestAction";

    static {
        t2o.a(404750354);
        t2o.a(404750351);
    }

    public String b(kq4 kq4Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d823c63e", new Object[]{this, kq4Var, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                jSONObject2.put(str, (Object) JSON.toJSONString(obj));
            } else {
                jSONObject2.put(str, obj);
            }
        }
        return jSONObject2.toJSONString();
    }

    public void d(kq4 kq4Var, JSONObject jSONObject, int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d0e855", new Object[]{this, kq4Var, jSONObject, new Integer(i), mtopResponse, obj});
        } else {
            LogUtils.f(LogUtils.BR_BIZ_NAME, NAME, mtopResponse.toString());
        }
    }

    public void e(kq4 kq4Var, JSONObject jSONObject, int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7a9b58", new Object[]{this, kq4Var, jSONObject, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            LogUtils.f(LogUtils.BR_BIZ_NAME, NAME, mtopResponse.toString());
        }
    }

    @Override // tb.w80
    public void a(final kq4 kq4Var, final JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef6cfb6", new Object[]{this, kq4Var, jSONObject});
            return;
        }
        RemoteBusiness build = RemoteBusiness.build(c(kq4Var, jSONObject), f82.g());
        try {
            HashMap hashMap = new HashMap(2);
            hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "upp-hub");
            if (jSONObject == null) {
                str = "";
            } else {
                str = "schemeId=" + jSONObject.getString("schemeId");
            }
            hashMap.put(MtopModule.KEY_MTOP_HEADER_XBIZINFO, str);
            build.headers((Map<String, String>) hashMap);
        } catch (Throwable th) {
            om8.e(NAME, th);
        }
        if (bnv.d(kq4Var)) {
            build.useWua();
        }
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.behavir.action.RequestAction.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    RequestAction.this.d(kq4Var, jSONObject, i, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    RequestAction.this.e(kq4Var, jSONObject, i, mtopResponse, baseOutDo, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    RequestAction.this.d(kq4Var, jSONObject, i, mtopResponse, obj);
                }
            }
        });
        build.asyncRequest();
    }

    public MtopRequest c(kq4 kq4Var, JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("6db88552", new Object[]{this, kq4Var, jSONObject});
        }
        BHRTaskConfigBase c = kq4Var.c();
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject taskInfo = c.getTaskInfo();
        if (taskInfo != null) {
            str2 = taskInfo.getString("apiName");
            str = taskInfo.getString("apiVersion");
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("uppParams");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject(2);
                }
                jSONObject2.put(OConstant.DIMEN_CONFIG_NAME, (Object) taskInfo.getString(OConstant.DIMEN_CONFIG_NAME));
                jSONObject.put("uppParams", (Object) jSONObject2);
                if (taskInfo.getBooleanValue("uploadEvent")) {
                    jSONObject.put("data", (Object) kq4Var.d().toJsonObject().toJSONString());
                }
                jSONObject.put("subscribeIdList", taskInfo.get("subscribeIdList"));
                jSONObject.put("intentionId", taskInfo.get("intentionId"));
            }
        } else {
            str2 = "";
            str = str2;
        }
        mtopRequest.setApiName(str2);
        mtopRequest.setVersion(str);
        mtopRequest.setNeedEcode(false);
        mtopRequest.setData(b(kq4Var, jSONObject));
        return mtopRequest;
    }
}
