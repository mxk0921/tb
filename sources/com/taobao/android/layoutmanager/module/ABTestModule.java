package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.util.ArrayList;
import java.util.List;
import tb.ku0;
import tb.od0;
import tb.t2o;
import tb.t9b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ABTestModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268096);
        t2o.a(503316559);
    }

    public static void activateServer(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf55d736", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            UTABTest.activateServer(jSONObject.getString("data"), jSONObject.getBooleanValue("needPageObject") ? jVar.f11976a.M() : null);
        }
    }

    public static void get(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a005df6", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            Object obj = ((JSONObject) json).get("keypath");
            t9b c = od0.D().c();
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    arrayList.add(c.a(String.valueOf(obj2), ""));
                }
                jVar.c.a(jVar, arrayList);
            } else if (obj instanceof String) {
                jVar.c.a(jVar, c.a((String) obj, ""));
            }
        }
    }

    public static void getABConfig(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b256293", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("component");
            String string2 = jSONObject.getString("module");
            JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
            boolean booleanValue = jSONObject.getBooleanValue("needPageObject");
            String string3 = jSONObject.getString(ku0.EXPERIMENT_ACTIVATE_STAT_TYPE_VARIATION);
            VariationSet activate = UTABTest.activate(string, string2, jSONObject2, booleanValue ? jVar.f11976a.M() : null);
            if (activate != null) {
                Variation variation = activate.getVariation(string3);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("config", (Object) variation.getValueAsString(""));
                jVar.c.a(jVar, jSONObject3);
                return;
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("config", (Object) "");
            jVar.c.a(jVar, jSONObject4);
        }
    }
}
