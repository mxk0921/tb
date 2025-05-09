package com.taobao.message.notification.openPushAbility;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OpenPushService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_CONFIG_BUSINESS = "mpm_business_switch";
    private static final String TAG = "OpenPushService";
    private HashMap<String, OpenPushProvider> openPushSet;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final OpenPushService INSTANCE = new OpenPushService();

        static {
            t2o.a(610271304);
        }

        private SingletonHolder() {
        }

        public static /* synthetic */ OpenPushService access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OpenPushService) ipChange.ipc$dispatch("7db746ca", new Object[0]);
            }
            return INSTANCE;
        }
    }

    static {
        t2o.a(610271302);
    }

    public static OpenPushService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenPushService) ipChange.ipc$dispatch("2a838d24", new Object[0]);
        }
        return SingletonHolder.access$100();
    }

    public synchronized void addInAppPushInterceptNotify(JSONObject jSONObject, OpenPushProvider openPushProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89c145b", new Object[]{this, jSONObject, openPushProvider});
        } else if (!getOpenPushServiceIsOpen()) {
            TLog.loge(TAG, "enableRegisterIntercept is false");
        } else {
            if (jSONObject != null) {
                String string = jSONObject.getString("interceptBizType");
                String string2 = jSONObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
                if (!(string == null || string2 == null)) {
                    HashMap<String, OpenPushProvider> hashMap = this.openPushSet;
                    hashMap.put(string + "-" + string2, openPushProvider);
                    TLog.loge(TAG, "addInAppPushInterceptNotify done!");
                }
            } else {
                TLog.loge(TAG, "params is null");
            }
        }
    }

    public synchronized OpenPushProvider getOpenPushProvider(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenPushProvider) ipChange.ipc$dispatch("8bbf79a0", new Object[]{this, jSONObject});
        } else if (!getOpenPushServiceIsOpen()) {
            TLog.loge(TAG, "enableRegisterIntercept is false");
            return null;
        } else {
            if (jSONObject != null) {
                String string = jSONObject.getString("interceptBizType");
                String string2 = jSONObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
                if (!(string == null || string2 == null)) {
                    HashMap<String, OpenPushProvider> hashMap = this.openPushSet;
                    if (hashMap.containsKey(string + "-" + string2)) {
                        HashMap<String, OpenPushProvider> hashMap2 = this.openPushSet;
                        return hashMap2.get(string + "-" + string2);
                    }
                    TLog.loge(TAG, "openPushSet don't have provider for interceptBizType " + string + " and taskName " + string2);
                }
            } else {
                TLog.loge(TAG, "params is null");
            }
            return null;
        }
    }

    public synchronized boolean getOpenPushServiceIsOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c5c82da", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "enableRegisterIntercept", "true"), "true");
    }

    public synchronized void removeInAppPushInterceptNotify(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d54e70", new Object[]{this, jSONObject});
        } else if (!getOpenPushServiceIsOpen()) {
            TLog.loge(TAG, "enableRegisterIntercept is false");
        } else {
            if (jSONObject != null) {
                String string = jSONObject.getString("interceptBizType");
                String string2 = jSONObject.getString(BaseMnnRunUnit.KEY_TASK_NAME);
                if (!(string == null || string2 == null)) {
                    HashMap<String, OpenPushProvider> hashMap = this.openPushSet;
                    hashMap.remove(string + "-" + string2);
                    TLog.loge(TAG, "removeInAppPushInterceptNotify done!");
                }
            } else {
                TLog.loge(TAG, "params is null");
            }
        }
    }

    private OpenPushService() {
        this.openPushSet = new HashMap<>();
    }
}
