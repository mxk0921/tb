package com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ActionServiceMgrModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(347078696);
        t2o.a(347078670);
    }

    public static void cb(JSONObject jSONObject, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa2763b", new Object[]{jSONObject, hVar, gVar, actionService});
            return;
        }
        int intValue = jSONObject.getInteger("methodId").intValue();
        Object obj = jSONObject.get("data");
        Object obj2 = jSONObject.get("error");
        if (obj != null) {
            actionService.g(intValue, true, hVar, jSONObject.getJSONObject("actionServiceContext"), obj);
        } else if (obj2 != null) {
            actionService.g(intValue, false, hVar, jSONObject.getJSONObject("actionServiceContext"), obj2);
        }
    }

    public static void fail(JSONObject jSONObject, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd237ba", new Object[]{jSONObject, hVar, gVar, actionService});
        } else {
            actionService.g(jSONObject.getInteger("methodId").intValue(), false, hVar, jSONObject.getJSONObject("actionServiceContext"), jSONObject.get("data"));
        }
    }

    public static void init(JSONObject jSONObject, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3eca42c", new Object[]{jSONObject, hVar, gVar, actionService});
        } else {
            actionService.y();
        }
    }

    public static void success(JSONObject jSONObject, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8916df", new Object[]{jSONObject, hVar, gVar, actionService});
        } else {
            actionService.g(jSONObject.getInteger("methodId").intValue(), true, hVar, jSONObject.getJSONObject("actionServiceContext"), jSONObject.get("data"));
        }
    }
}
