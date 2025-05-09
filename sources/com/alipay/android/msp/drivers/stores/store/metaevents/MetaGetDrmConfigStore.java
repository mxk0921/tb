package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaGetDrmConfigStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaGetDrmConfigStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaGetDrmConfigStore metaGetDrmConfigStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaGetDrmConfigStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constant.API_PARAMS_KEY_ENABLE, (Object) Boolean.FALSE);
        if (this.mMspContext == null || this.mContext == null) {
            return "";
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        String string = actionParamsJson.getString("key");
        String string2 = actionParamsJson.getString("subkey");
        try {
            if (!TextUtils.isEmpty(string2)) {
                JSONObject drmValueFromKey = DrmManager.getInstance(this.mContext).getDrmValueFromKey(string);
                if (drmValueFromKey != null) {
                    String string3 = drmValueFromKey.getString(string2);
                    if (!TextUtils.isEmpty(string3)) {
                        try {
                            z = DrmManager.getInstance(this.mContext).procGraySwitchWithRate(this.mContext, Integer.parseInt(string3));
                            LogUtil.record(2, "PreRendManager:needPreloadTpl", "isEnable=".concat(String.valueOf(z)));
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                        }
                    }
                }
            } else {
                z = DrmManager.getInstance(this.mContext).isDegrade(string, false, this.mContext);
            }
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        jSONObject.put(Constant.API_PARAMS_KEY_ENABLE, (Object) Boolean.valueOf(z));
        return jSONObject.toJSONString();
    }
}
