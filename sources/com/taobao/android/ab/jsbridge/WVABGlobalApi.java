package com.taobao.android.ab.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.kva;
import tb.nsw;
import tb.p2w;
import tb.pij;
import tb.r1r;
import tb.r2w;
import tb.s1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVABGlobalApi extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_VARIATIONS = "getVariations";
    private static final String ACTION_IS_FEATURE_OPENED = "isFeatureOpened";
    private static final String ACTION_MOCK_VALUES = "mockValues";
    private static final String JSON_KEY_VARIATION_NAME = "variationName";
    public static final String PLUGIN_NAME = "WVABGlobalApi";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements pij {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70a99c0d", new Object[]{this, str})).booleanValue();
            }
            return false;
        }
    }

    private static JSONObject createComposedData(Context context, boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d3cf3c39", new Object[]{context, new Boolean(z)});
        }
        return kva.e(com.taobao.android.ab.api.a.a(context), new a(), z);
    }

    private static JSONObject createSingleData(Context context) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1fe99721", new Object[]{context});
        }
        r2w a2 = ABGlobal.a(context);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        for (p2w p2wVar : a2) {
            jSONObject3.put(p2wVar.getName(), p2wVar.getValue());
        }
        jSONObject2.put(kva.SERIALIZE_EXP_VARIATIONS, jSONObject3);
        jSONObject.put("variationSet", jSONObject2);
        return jSONObject;
    }

    public static /* synthetic */ Object ipc$super(WVABGlobalApi wVABGlobalApi, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ab/jsbridge/WVABGlobalApi");
    }

    private static boolean isFeatureOpened(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe9ccb07", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            String string = new JSONObject(str).getString(JSON_KEY_VARIATION_NAME);
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(wVCallBackContext.getWebview().getContext(), string);
            nsw nswVar = new nsw();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(string, isFeatureOpened);
            nswVar.d("data", jSONObject);
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
        return true;
    }

    private static boolean mockValues(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd140f9e", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject(kva.SERIALIZE_EXP_VARIATIONS);
            r1r a2 = s1r.a();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a2.a(wVCallBackContext.getWebview().getContext(), next, jSONObject2.getBoolean(next));
            }
            nsw nswVar = new nsw();
            nswVar.d("data", jSONObject);
            nswVar.b("msg", "mock success, please restart app");
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION_MOCK_VALUES.equals(str)) {
            return mockValues(str2, wVCallBackContext);
        }
        if (ACTION_GET_VARIATIONS.equals(str)) {
            return getVariations(str2, wVCallBackContext);
        }
        if (ACTION_IS_FEATURE_OPENED.equals(str)) {
            return isFeatureOpened(str2, wVCallBackContext);
        }
        return false;
    }

    private static boolean getVariations(String str, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("945be888", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            boolean optBoolean = new JSONObject(str).optBoolean("debugging", false);
            nsw nswVar = new nsw();
            if (optBoolean) {
                jSONObject = createComposedData(wVCallBackContext.getWebview().getContext(), true);
            } else {
                jSONObject = createSingleData(wVCallBackContext.getWebview().getContext());
            }
            nswVar.d("data", jSONObject);
            wVCallBackContext.success(nswVar);
        } catch (Throwable th) {
            wVCallBackContext.error(th.toString());
        }
        return true;
    }
}
