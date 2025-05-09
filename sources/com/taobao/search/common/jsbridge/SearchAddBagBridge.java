package com.taobao.search.common.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.b4p;
import tb.kpw;
import tb.t2o;
import tb.to8;
import tb.xzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchAddBagBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "TBSearchSKUBridge";
    private static final String LOG_TAG = "SearchAddBagBridge";

    static {
        t2o.a(815792177);
    }

    public static /* synthetic */ Object ipc$super(SearchAddBagBridge searchAddBagBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/jsbridge/SearchAddBagBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!to8.ADD_CART.equals(str) || TextUtils.isEmpty(str2)) {
            b4p.o(LOG_TAG, "no action :" + str);
            return false;
        }
        b4p.g(LOG_TAG, "params str is ok");
        try {
            jSONObject = new JSONObject(str2);
            b4p.g(LOG_TAG, "json is ok");
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return xzo.c().a(jSONObject.optString("itemid"));
    }
}
