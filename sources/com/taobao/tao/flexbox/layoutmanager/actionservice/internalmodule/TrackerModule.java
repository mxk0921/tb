package com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.actionservice.ActionService;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TrackerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(347078699);
        t2o.a(347078670);
    }

    public static void click(JSON json, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07e6ac5", new Object[]{json, hVar, gVar, actionService});
        } else if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("pageName");
            String string2 = jSONObject.getString("controlName");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    arrayList.add(entry.getKey() + "=" + entry.getValue());
                }
            }
            TBS.Adv.ctrlClicked(string, CT.Button, string2, arrayList.toString());
        }
    }

    public static void commit(JSON json, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7cb074", new Object[]{json, hVar, gVar, actionService});
        } else if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("pageName");
            int intValue = jSONObject.getIntValue(PopConst.POP_EVENT_ID_KEY);
            String string2 = jSONObject.getString("arg1");
            String string3 = jSONObject.getString("arg2");
            String string4 = jSONObject.getString("arg3");
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            ArrayList arrayList = new ArrayList();
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    arrayList.add(entry.getKey() + "=" + entry.getValue());
                }
            }
            TBS.Ext.commitEvent(string, intValue, string2, string3, string4, arrayList.toString());
        }
    }

    public static void updatePageName(JSON json, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfee4e0", new Object[]{json, hVar, gVar, actionService});
        } else if (json instanceof JSONObject) {
            String string = ((JSONObject) json).getString("pageName");
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(actionService.m(), string);
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(actionService.m(), string);
        }
    }

    public static void updateProperties(JSON json, ActionService.h hVar, ActionService.g gVar, ActionService actionService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef82f819", new Object[]{json, hVar, gVar, actionService});
        } else if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(actionService.m(), hashMap);
        }
    }
}
