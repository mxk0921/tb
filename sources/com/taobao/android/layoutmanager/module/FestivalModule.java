package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import tb.ecr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FestivalModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268099);
        t2o.a(503316559);
    }

    public static void festivalMode(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594065b1", new Object[]{jVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mode", (Object) Integer.valueOf(ecr.e()));
        jVar.c.a(jVar, jSONObject);
    }

    public static void getColor(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de24f7f", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            jSONObject.getString("module");
            jSONObject.getString("key");
            jSONObject.getString(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("color", (Object) ecr.a());
            jVar.c.a(jVar, jSONObject2);
        }
    }

    public static void getFestival(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d4f15e", new Object[]{jVar});
        } else {
            jVar.c.a(jVar, ecr.b());
        }
    }

    public static void getText(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781be849", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            jSONObject.getString("module");
            jSONObject.getString("key");
            String g = ecr.g();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", (Object) g);
            jVar.c.a(jVar, jSONObject2);
        }
    }

    public static void isFestivalOn(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f56116b", new Object[]{jVar});
        } else if (jVar.b instanceof JSONObject) {
            boolean i = ecr.i();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFestivalOn", (Object) Boolean.valueOf(i));
            jVar.c.a(jVar, jSONObject);
        }
    }

    public static void setFestivalStyle(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805bd695", new Object[]{jVar});
        }
    }
}
