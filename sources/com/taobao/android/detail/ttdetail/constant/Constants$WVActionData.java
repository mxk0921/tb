package com.taobao.android.detail.ttdetail.constant;

import com.alibaba.fastjson.JSONObject;
import tb.bia;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Constants$WVActionData {
    public static final String INTENT_ACTION_99_CART_UPDATE = "com.taobao.detail.inside.intent.action.cartUpdate";
    public static final String INTENT_ACTION_CLOSE_99_TM_ACTIVITY = "com.taobao.detail.inside.intent.action.closePage";
    public static final String INTENT_EXTRA_DATA = "multiDataFromWV";
    public static final String WV_ACTION_REQUEST_99_CART_UPDATE = "99tmCartUpdate";
    public static final String WV_DATA_REQUEST_99_CART_UPDATE = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.constant.Constants$WVActionData.1
        {
            put("action", "requestUpdate99tmCart");
            put("bizName", bia.UNDER_TAKE_INSIDE_DETAIL);
            put("data", (Object) null);
        }
    }.toJSONString();

    static {
        t2o.a(912261485);
    }
}
