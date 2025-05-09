package com.taobao.android.sku.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.cjz;
import tb.mb3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AliXSkuDataContext implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mJavaScriptMd5;
    private String mJavaScriptUrl;
    private JSONObject mOriginData;
    private String mUltronTemplateMd5;
    private String mUltronTemplateUrl;
    private JSONObject mStaticExtInput = new JSONObject();
    private JSONObject mStoredState = new JSONObject();
    private JSONObject mOpState = new JSONObject();
    private JSONObject mBizState = new JSONObject();
    private JSONObject mExtInput = new JSONObject();
    private JSONObject mTimeExtInput = new JSONObject();
    private Map<String, JSONObject> mGlobalStorage = new HashMap();

    static {
        t2o.a(442499165);
    }

    public void cleanBizData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a92075b", new Object[]{this});
        } else {
            this.mBizState.clear();
        }
    }

    public void cleanExtInputData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc520ce3", new Object[]{this});
            return;
        }
        this.mExtInput.clear();
        this.mExtInput.putAll(this.mStaticExtInput);
    }

    public void cleanOperationData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b784366f", new Object[]{this});
        } else {
            this.mOpState.clear();
        }
    }

    public void cleanStoredData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46129d", new Object[]{this});
        } else {
            this.mStoredState.clear();
        }
    }

    public void cleanTimeExtInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70607606", new Object[]{this});
        } else {
            this.mTimeExtInput.clear();
        }
    }

    public JSONObject getBizData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f2bc674e", new Object[]{this});
        }
        return this.mBizState;
    }

    public String getDegradeSkuH5Url() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c473df4", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("skuCore");
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("skuItem")) == null) {
            return "";
        }
        return jSONObject.getString("degradeSkuH5Url");
    }

    public JSONObject getExtInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b53477c6", new Object[]{this});
        }
        return this.mExtInput;
    }

    public JSONObject getGlobalData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92cf54", new Object[]{this, str});
        }
        return this.mGlobalStorage.get(str);
    }

    public String getH5Url(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a65c6d03", new Object[]{this, str});
        }
        if (!mb3.a(str)) {
            return getH5Url();
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("skuCore");
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("skuItem")) == null) {
            return "";
        }
        String string = jSONObject.getString("optionalSkuH5Url");
        return TextUtils.isEmpty(string) ? getH5Url() : string;
    }

    public String getItemId() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("item")) == null) {
            return null;
        }
        return jSONObject.getString("itemId");
    }

    public String getJavaScriptMd5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b0c8cde", new Object[]{this});
        }
        return this.mJavaScriptMd5;
    }

    public String getJavaScriptUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("408a7d8d", new Object[]{this});
        }
        return this.mJavaScriptUrl;
    }

    public JSONObject getJsH5SkuInfo() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8bec4586", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mBizState;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("id_biz_first_exe_holder")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("h5_sku");
    }

    public JSONObject getOperationData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("18681c22", new Object[]{this});
        }
        return this.mOpState;
    }

    public JSONObject getOriginalData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b45ceb8", new Object[]{this});
        }
        return this.mOriginData;
    }

    public String getSellerId() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("822c6289", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("seller")) == null) {
            return null;
        }
        return jSONObject.getString("userId");
    }

    public String getSkuParams() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("157c86cc", new Object[]{this});
        }
        JSONObject jSONObject3 = this.mOriginData;
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("skuCore")) == null || (jSONObject2 = jSONObject.getJSONObject("skuItem")) == null) {
            return null;
        }
        return jSONObject2.getString("skuParams");
    }

    public String getSkuV3WeexUrl() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b7c26ef", new Object[]{this});
        }
        JSONObject jSONObject3 = this.mOriginData;
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("skuCore")) == null || (jSONObject2 = jSONObject.getJSONObject("skuItem")) == null) {
            return null;
        }
        return jSONObject2.getString("skuV3WeexUrl");
    }

    public JSONObject getStoredData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("57c7140a", new Object[]{this});
        }
        return this.mStoredState;
    }

    public JSONObject getTimeExtInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a2383433", new Object[]{this});
        }
        return this.mTimeExtInput;
    }

    public String getUltronTemplateMd5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1f685df", new Object[]{this});
        }
        return this.mUltronTemplateMd5;
    }

    public String getUltronTemplateUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7774768e", new Object[]{this});
        }
        return this.mUltronTemplateUrl;
    }

    public String getWeexUrl() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        JSONObject jSONObject3 = this.mOriginData;
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("skuCore")) == null || (jSONObject2 = jSONObject.getJSONObject("skuItem")) == null) {
            return null;
        }
        return jSONObject2.getString("skuWeexUrl");
    }

    public void initOriginalData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b707de", new Object[]{this, jSONObject});
        } else {
            this.mOriginData = jSONObject;
        }
    }

    public void saveGlobalData(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfe67f5", new Object[]{this, str, jSONObject});
        } else {
            this.mGlobalStorage.put(str, jSONObject);
        }
    }

    public void setBizData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a1cf8e", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            this.mBizState.putAll(jSONObject);
        }
    }

    public void setExtInput(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1997e", new Object[]{this, jSONObject});
            return;
        }
        this.mExtInput = jSONObject;
        if (jSONObject == null) {
            this.mExtInput = new JSONObject();
        }
        this.mExtInput.putAll(this.mStaticExtInput);
    }

    public void setOperationData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2733c3a", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            this.mOpState.putAll(jSONObject);
        }
    }

    public void setStaticExtInput(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37798f30", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null) {
            this.mStaticExtInput.putAll(jSONObject);
        }
        this.mExtInput.putAll(this.mStaticExtInput);
    }

    public void setStoredData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5426b8ba", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            this.mStoredState.putAll(jSONObject);
        }
    }

    public boolean getNewbuyShowSkuFeature() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbc8547d", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("feature")) == null) {
            return true;
        }
        return "true".equals(jSONObject.getString("newbuyShowSku"));
    }

    public boolean getShowSkuFeature() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75e0a577", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("feature")) == null) {
            return true;
        }
        return "true".equals(jSONObject.getString("showSku"));
    }

    public boolean getSkuSilentActionFeature() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1846d6af", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("feature")) == null) {
            return false;
        }
        return "true".equals(jSONObject.getString("skuSilentAction"));
    }

    public void initOriginalData(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ec137a", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("AliXSkuDataContext.initOriginalData");
        }
        this.mUltronTemplateUrl = str;
        this.mUltronTemplateMd5 = str2;
        this.mJavaScriptUrl = str3;
        this.mJavaScriptMd5 = str4;
    }

    public boolean isTradeCartOrBuyEnable(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90d7d1a1", new Object[]{this, str})).booleanValue();
        }
        JSONObject jSONObject = this.mOriginData;
        if (jSONObject == null) {
            return true;
        }
        try {
            str2 = jSONObject.getJSONObject(DnsPreference.KEY_TRADE).getString(str);
        } catch (Exception e) {
            e.printStackTrace();
            str2 = "true";
        }
        return "true".equals(str2);
    }

    public String getH5Url() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abc85acd", new Object[]{this});
        }
        JSONObject jSONObject2 = this.mOriginData;
        if (jSONObject2 == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("skuCore");
        if (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("skuItem")) == null) {
            return "";
        }
        return jSONObject.getString("skuH5Url");
    }
}
