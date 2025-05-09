package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qyh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262193);
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        JSONObject jSONObject8;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a0295b0e", new Object[]{jSONObject});
        }
        try {
            if (jSONObject.getJSONObject("skuV3Data") != null) {
                jSONObject.remove("skuV3Data");
            }
            if (jSONObject.getJSONObject("newBuyData") != null) {
                jSONObject.remove("newBuyData");
            }
            if (jSONObject.getJSONObject("commonDialog") != null) {
                jSONObject.remove("commonDialog");
            }
            if (jSONObject.getJSONObject("skuCore") != null) {
                jSONObject.remove("skuCore");
            }
            if (jSONObject.getJSONObject("componentsVO") != null) {
                jSONObject.remove("componentsVO");
            }
            if (jSONObject.getJSONObject("buyInsideData") != null) {
                jSONObject.remove("buyInsideData");
            }
            if (jSONObject.getJSONObject("services") != null) {
                jSONObject.remove("services");
            }
            if (jSONObject.getJSONObject("skuBase") != null) {
                jSONObject.remove("skuBase");
            }
            JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
            if (!(jSONArray == null || jSONArray.size() <= 0 || (jSONObject2 = jSONArray.getJSONObject(0)) == null || (jSONObject3 = jSONObject2.getJSONObject("value")) == null)) {
                JSONObject jSONObject9 = jSONObject3.getJSONObject("hierarchy");
                ArrayList arrayList = new ArrayList();
                if (!(jSONObject9 == null || (jSONObject8 = jSONObject9.getJSONObject("structure")) == null)) {
                    JSONArray jSONArray2 = jSONObject8.getJSONArray("bottomBar");
                    ArrayList arrayList2 = new ArrayList();
                    if (jSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                            arrayList2.add(jSONArray2.getString(i2));
                        }
                    }
                    if (arrayList2.size() > 0) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            JSONArray jSONArray3 = jSONObject8.getJSONArray((String) it.next());
                            if (jSONArray3 != null) {
                                for (int i3 = 0; i3 < jSONArray3.size(); i3++) {
                                    arrayList.add(jSONArray3.getString(i3));
                                }
                            }
                        }
                    }
                    JSONArray jSONArray4 = jSONObject8.getJSONArray("detailInfoAura");
                    if (jSONArray4 != null) {
                        while (jSONArray4.size() > 12) {
                            jSONArray4.remove(jSONArray4.size() - 1);
                        }
                    }
                }
                JSONObject jSONObject10 = jSONObject3.getJSONObject("data");
                if (jSONObject10 != null) {
                    for (Map.Entry<String, Object> entry : jSONObject10.entrySet()) {
                        if (!(!(entry.getValue() instanceof JSONObject) || (jSONObject7 = (JSONObject) entry.getValue()) == null || jSONObject7.getJSONObject("events") == null)) {
                            jSONObject7.remove("events");
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (!(!entry.getKey().equals((String) it2.next()) || (jSONObject5 = (JSONObject) entry.getValue()) == null || (jSONObject6 = jSONObject5.getJSONObject("fields")) == null)) {
                                JSONArray jSONArray5 = jSONObject6.getJSONArray("rightButtons");
                                JSONArray jSONArray6 = jSONObject6.getJSONArray("leftButtons");
                                if (jSONArray5 != null) {
                                    while (i < jSONArray5.size()) {
                                        JSONObject jSONObject11 = jSONArray5.getJSONObject(i);
                                        if (jSONObject11 != null) {
                                            jSONObject11.put("disabled", (Object) "true");
                                        }
                                        i++;
                                    }
                                }
                                if (jSONArray6 != null) {
                                    for (int i4 = 0; i4 < jSONArray6.size(); i4++) {
                                        JSONObject jSONObject12 = jSONArray6.getJSONObject(i4);
                                        if (jSONObject12 != null) {
                                            jSONObject12.put("disabled", (Object) "true");
                                        }
                                    }
                                }
                            }
                            i = 0;
                        }
                    }
                }
                JSONObject jSONObject13 = jSONObject3.getJSONObject("global");
                if (!(jSONObject13 == null || (jSONObject4 = jSONObject13.getJSONObject("data")) == null)) {
                    if (jSONObject4.getJSONObject("skuV3Data") != null) {
                        jSONObject4.remove("skuV3Data");
                    }
                    if (jSONObject4.getJSONObject("newBuyData") != null) {
                        jSONObject4.remove("newBuyData");
                    }
                }
            }
        } catch (Exception e) {
            tgh.c("MainApiDataCropUtil", "cropMainApiData failed", e);
        }
        return jSONObject;
    }
}
