package com.taobao.android.order.bundle.ultron.view;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;
import tb.gsb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DetailBundleLineComponent extends DMComponent {
    public static final String COMPONENT_TAG = "orderBundleLine";
    private static final JSONObject JSON_DATA = JSON.parseObject("{\n        \"tag\" : \"orderBundleLine\",\n        \"type\" : \"orderBundleLine\",\n        \"fields\" : {}\n      }");

    public DetailBundleLineComponent() {
        this(JSON_DATA, "native", null, null);
    }

    public DetailBundleLineComponent(JSONObject jSONObject, String str, JSONObject jSONObject2, Map<String, List<gsb>> map) {
        super(jSONObject, str, jSONObject2, map);
    }

    static {
        t2o.a(713031913);
    }
}
