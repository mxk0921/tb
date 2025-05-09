package com.alipay.android.phone.seauthenticator.iotauth.authmanager;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PreDataHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FAILURE = -1;
    public static final int SUCCESS = 0;
    public static Map<String, String> f;
    public static PreDataHelper g;

    /* renamed from: a  reason: collision with root package name */
    public String f3771a;
    public String b;
    public String c;
    public int d;
    public int e = 0;

    public static PreDataHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreDataHelper) ipChange.ipc$dispatch("7e17cee1", new Object[0]);
        }
        if (g == null) {
            g = new PreDataHelper();
        }
        return g;
    }

    public final Map<String, String> a(JSONObject jSONObject, JSONObject jSONObject2) {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3f5e0a6c", new Object[]{this, jSONObject, jSONObject2});
        }
        HashMap<String, String> hashMap2 = null;
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        if (jSONObject2 != null) {
            hashMap = b(jSONObject2.toString());
        } else {
            hashMap = null;
        }
        if (jSONObject != null) {
            hashMap2 = b(jSONObject.toString());
        }
        if (hashMap != null && hashMap2 != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
            return hashMap2;
        } else if (hashMap == null) {
            return hashMap2;
        } else {
            return hashMap;
        }
    }

    public final HashMap<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ec60495f", new Object[]{this, str});
        }
        AuthenticatorLOG.fpInfo("clientTestJsonStr: " + str);
        HashMap<String, String> hashMap = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                hashMap = (HashMap) JSON.parseObject(str, HashMap.class);
            }
        } catch (Exception unused) {
        }
        if (hashMap == null) {
            TrackEvent.getIns().addMonitorKey("predata", "clientTextError");
        }
        return hashMap;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13986015", new Object[]{this});
            return;
        }
        f = null;
        this.c = null;
        this.b = null;
        this.f3771a = null;
        this.d = 0;
    }

    public String getClientText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b8642e1", new Object[]{this, str});
        }
        Map<String, String> map = f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public int getProductType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4bf8a8d", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public String getRenderData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("140b7e63", new Object[]{this});
        }
        return this.f3771a;
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a592a696", new Object[]{this});
        }
        return this.c;
    }

    public int getUiType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f5b3d5e", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public String getVerifyId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8b1b04f", new Object[]{this});
        }
        return this.b;
    }

    public int initClientText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbfff14c", new Object[]{this, str})).intValue();
        }
        d();
        if (!TextUtils.isEmpty(str)) {
            f = b(str);
        }
        return 0;
    }

    public int initData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e007bde", new Object[]{this, str})).intValue();
        }
        d();
        return c(str);
    }

    public void setUiType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4272566c", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("363cbdbe", new Object[]{this, str})).intValue();
        }
        AuthenticatorLOG.fpInfo(str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(DataHelper.FP_CHALLENGE_KEY)) {
                this.f3771a = jSONObject.getString(DataHelper.FP_CHALLENGE_KEY);
            } else if (jSONObject.has("renderData")) {
                this.f3771a = jSONObject.getString("renderData");
            } else {
                TrackEvent.getIns().addMonitorKey("predata", "renderData is null");
                return -1;
            }
            if (jSONObject.has("uiType")) {
                this.e = jSONObject.getInt("uiType");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("bioData");
            if (jSONObject2.has(Constants.VI_ENGINE_VERIFYID)) {
                this.b = jSONObject2.getString(Constants.VI_ENGINE_VERIFYID);
            }
            if (jSONObject2.has("token")) {
                this.c = jSONObject2.getString("token");
            }
            this.d = jSONObject2.getInt(yj4.PARAM_PRODUCT_TYPE);
            JSONObject jSONObject3 = null;
            JSONObject jSONObject4 = jSONObject2.has("clientTexts") ? jSONObject2.getJSONObject("clientTexts") : null;
            if (jSONObject.has("micClientTexts")) {
                jSONObject3 = jSONObject.getJSONObject("micClientTexts");
            }
            f = a(jSONObject4, jSONObject3);
            return 0;
        } catch (JSONException e) {
            TrackEvent.getIns().addMonitorKey("predata", "Failed to parse predata");
            AuthenticatorLOG.fpInfo(e);
            return -1;
        }
    }

    public int initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1ae4854", new Object[]{this})).intValue();
        }
        d();
        return 0;
    }
}
