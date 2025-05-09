package com.alipay.sdk.data;

import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.sdk.util.LogUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DynamicConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_OPTIMISE_TRANS_ACTIVITY_GRAY = "optimize_trans_activity_gray";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class LaunchAppSwitchItem {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String pk;
        public final String pn;
        public final int v;

        public LaunchAppSwitchItem(String str, int i, String str2) {
            this.pn = str;
            this.v = i;
            this.pk = str2;
        }

        public static List<LaunchAppSwitchItem> fromJsonArray(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6eb60df", new Object[]{jSONArray});
            }
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                LaunchAppSwitchItem fromJsonObject = fromJsonObject(jSONArray.optJSONObject(i));
                if (fromJsonObject != null) {
                    arrayList.add(fromJsonObject);
                }
            }
            return arrayList;
        }

        public static JSONArray toJsonArray(List<LaunchAppSwitchItem> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("6c9bd62", new Object[]{list});
            }
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (LaunchAppSwitchItem launchAppSwitchItem : list) {
                jSONArray.put(toJsonObject(launchAppSwitchItem));
            }
            return jSONArray;
        }

        public static JSONObject toJsonObject(LaunchAppSwitchItem launchAppSwitchItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("549cd96d", new Object[]{launchAppSwitchItem});
            }
            if (launchAppSwitchItem == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", launchAppSwitchItem.pn).put("v", launchAppSwitchItem.v).put(PushConstants.URI_PACKAGE_NAME, launchAppSwitchItem.pk);
            } catch (JSONException e) {
                LogUtils.printExceptionStackTrace(e);
                return null;
            }
        }

        public final String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return String.valueOf(toJsonObject(this));
        }

        public static LaunchAppSwitchItem fromJsonObject(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LaunchAppSwitchItem) ipChange.ipc$dispatch("f1554fde", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new LaunchAppSwitchItem(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString(PushConstants.URI_PACKAGE_NAME));
        }
    }

    public static boolean isFalse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94ae77ee", new Object[]{str})).booleanValue();
        }
        if (!isTrue(str)) {
            return true;
        }
        return false;
    }

    public static boolean isTrue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471b1a6d", new Object[]{str})).booleanValue();
        }
        return "true".equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig(str));
    }
}
