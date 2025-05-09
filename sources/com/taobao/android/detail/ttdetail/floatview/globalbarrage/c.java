package com.taobao.android.detail.ttdetail.floatview.globalbarrage;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.b;
import java.util.ArrayList;
import tb.hl6;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_ALL = "all";
    public static final String LOCATION_FIRST = "first";
    public static final String LOCATION_INSIDE = "inside";
    public static final String LOCATION_SECOND = "second";

    static {
        t2o.a(912261803);
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d30c24d", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject.get("globalBarrage") != null) {
            return true;
        }
        return false;
    }

    public static b.a c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.a) ipChange.ipc$dispatch("7f4e6bb0", new Object[]{jSONObject});
        }
        b.a aVar = new b.a();
        jSONObject.getString("type");
        aVar.f6789a = jSONObject.getString("location");
        aVar.b = jSONObject.getJSONObject("exposureArgs");
        jSONObject.put("_enableChain", (Object) Boolean.TRUE);
        return aVar;
    }

    public static b b(JSONObject jSONObject, BarrageFloatingView.BARRAGE_TYPE barrage_type) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f3ff858", new Object[]{jSONObject, barrage_type});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("globalBarrage");
        b bVar = new b();
        bVar.b = jSONObject2.getIntValue("maxShowCount");
        bVar.f6788a = jSONObject2.getFloatValue("scrollTimeInterval");
        JSONArray jSONArray = jSONObject2.getJSONArray("data");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("template");
        if (jSONArray == null) {
            tgh.b("BarrageFloatingDataParser", "receive barrageArray is null");
            return bVar;
        } else if (barrage_type == null) {
            tgh.b("BarrageFloatingDataParser", "transfer barrageType is null");
            return bVar;
        } else {
            int i = 0;
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                Object obj = jSONArray.get(i2);
                b.a c = c((JSONObject) obj);
                if (barrage_type.equals(barrage_type.convert(c.f6789a))) {
                    bVar.e.add(obj);
                    ((ArrayList) bVar.d).add(c);
                    bVar.f = "all".equals(c.f6789a) || LOCATION_INSIDE.equals(c.f6789a);
                    if ("first".equals(c.f6789a)) {
                        i++;
                    }
                }
            }
            if (!bVar.f) {
                if (bVar.e.size() == i || i == 0) {
                    z = true;
                }
                bVar.f = z;
            }
            if (jSONObject3 != null) {
                bVar.c = hl6.g(jSONObject3);
            }
            return bVar;
        }
    }
}
