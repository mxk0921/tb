package com.taobao.android.layoutmanager.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import tb.t2o;
import tb.vfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class OrangeModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268123);
        t2o.a(503316559);
    }

    public static void getConfig(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc17954", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("groupName");
            String string2 = jSONObject.getString("key");
            String string3 = jSONObject.getString("defaultConfig");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                vfs g = vfs.g();
                if (TextUtils.isEmpty(string3)) {
                    string3 = "";
                }
                String e = g.e(string, string2, string3);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("config", (Object) e);
                jVar.c.a(jVar, jSONObject2);
            }
        }
    }

    public static void getConfigs(d.j jVar) {
        JSONArray jSONArray;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed94efb1", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            jSONArray = ((JSONObject) json).getJSONArray("configs");
        } else if (json instanceof JSONArray) {
            jSONArray = (JSONArray) json;
        } else {
            jSONArray = null;
        }
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("groupName");
                String string2 = jSONObject.getString("key");
                String string3 = jSONObject.getString("defaultConfig");
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    str = null;
                } else {
                    vfs g = vfs.g();
                    if (TextUtils.isEmpty(string3)) {
                        string3 = "";
                    }
                    str = g.e(string, string2, string3);
                }
                jSONArray2.add(str);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs", (Object) jSONArray2);
        jVar.c.a(jVar, jSONObject2);
    }
}
