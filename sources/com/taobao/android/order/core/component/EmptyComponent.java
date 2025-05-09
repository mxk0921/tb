package com.taobao.android.order.core.component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.List;
import java.util.Map;
import tb.gsb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class EmptyComponent extends DMComponent {
    public static final String COMPONENT_TAG = "empty_holder";
    private static final JSONObject JSON_DATA = JSON.parseObject("{\n        \"tag\" : \"empty_holder\",\n        \"type\" : \"empty_holder\",\n        \"fields\" : {}\n      }");

    public EmptyComponent() {
        this(JSON_DATA, "native", null, null);
    }

    public EmptyComponent(JSONObject jSONObject, String str, JSONObject jSONObject2, Map<String, List<gsb>> map) {
        super(jSONObject, str, jSONObject2, map);
    }

    static {
        t2o.a(614465615);
    }
}
