package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AppMonitorModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268097);
        t2o.a(503316559);
    }

    public static void commitFail(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c82537", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("module");
            if (string == null) {
                string = jSONObject.getString("pageName");
            }
            String string2 = jSONObject.getString("monitorPoint");
            String string3 = jSONObject.getString("errorCode");
            String string4 = jSONObject.getString("errorMsg");
            String string5 = jSONObject.getString("arg");
            if (string5 == null) {
                AppMonitor.Alarm.commitFail(string, string2, string3, string4);
            } else {
                AppMonitor.Alarm.commitFail(string, string2, string5, string3, string4);
            }
        }
    }

    public static void commitSuccess(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cd1b40", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("module");
            if (string == null) {
                string = jSONObject.getString("pageName");
            }
            String string2 = jSONObject.getString("monitorPoint");
            String string3 = jSONObject.getString("arg");
            if (string3 == null) {
                AppMonitor.Alarm.commitSuccess(string, string2);
            } else {
                AppMonitor.Alarm.commitSuccess(string, string2, string3);
            }
        }
    }
}
