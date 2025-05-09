package com.taobao.tao.flexbox.layoutmanager.actionservice.core;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kpw;
import tb.t2o;
import tb.zca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ActionServiceJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ActionService.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f12000a;

        public a(ActionServiceJsBridge actionServiceJsBridge, WVCallBackContext wVCallBackContext) {
            this.f12000a = wVCallBackContext;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.g
        public void a(ActionService.h hVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2cfc144", new Object[]{this, hVar, obj});
                return;
            }
            WVCallBackContext wVCallBackContext = this.f12000a;
            if (wVCallBackContext == null) {
                return;
            }
            if (obj != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", obj);
                this.f12000a.success(jSONObject.toJSONString());
                return;
            }
            wVCallBackContext.success();
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService.g
        public void b(ActionService.h hVar, ActionService.i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea7f270b", new Object[]{this, hVar, iVar});
                return;
            }
            WVCallBackContext wVCallBackContext = this.f12000a;
            if (wVCallBackContext == null) {
                return;
            }
            if (iVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) iVar.f11986a);
                jSONObject.put("errorMsg", (Object) ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
                jSONObject.put("result", iVar.c);
                Object obj = iVar.c;
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!TextUtils.isEmpty(jSONObject2.getString("errorCode"))) {
                        jSONObject.put("errorCode", (Object) jSONObject2.getString("errorCode"));
                    }
                    if (!TextUtils.isEmpty(jSONObject2.getString("errorMsg"))) {
                        jSONObject.put("errorMsg", (Object) jSONObject2.getString("errorMsg"));
                    }
                    if (jSONObject2.containsKey("result")) {
                        jSONObject.put("result", jSONObject2.get("result"));
                    }
                }
                this.f12000a.error(jSONObject.toJSONString());
                return;
            }
            wVCallBackContext.error();
        }
    }

    static {
        t2o.a(347078687);
    }

    public static /* synthetic */ Object ipc$super(ActionServiceJsBridge actionServiceJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/actionservice/core/ActionServiceJsBridge");
    }

    public void dispatch(JSONObject jSONObject, WVCallBackContext wVCallBackContext) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106dd0cc", new Object[]{this, jSONObject, wVCallBackContext});
            return;
        }
        Object obj = jSONObject.get("args");
        JSONObject jSONObject2 = jSONObject.getJSONObject("context");
        if (obj instanceof JSON) {
            jSONArray = (JSON) obj;
        } else {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.add(obj);
            jSONArray = jSONArray2;
        }
        ActionService l = ActionService.l(wVCallBackContext.getWebview());
        if (l == null) {
            zca.b(wVCallBackContext.getWebview().getContext());
            l = ActionService.o();
        }
        l.r(jSONObject.getString("actionName"), new ActionService.h(wVCallBackContext.getWebview() == null ? null : wVCallBackContext.getWebview().getContext(), jSONObject2.getString("source")), jSONArray, false, new a(this, wVCallBackContext));
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!str.equals("dispatch")) {
            return false;
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject.getString("actionName").equals("$.init") && !(wVCallBackContext.getWebview() instanceof BackgroundWebview) && !(wVCallBackContext.getWebview() instanceof BackgroundUCWebview)) {
            return true;
        }
        dispatch(parseObject, wVCallBackContext);
        return true;
    }
}
