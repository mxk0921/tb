package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.VibrateHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaVibrateStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaVibrateStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaVibrateStore metaVibrateStore, String str, Object... objArr) {
        if (str.hashCode() == -610354464) {
            super.initWithContext();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/MetaVibrateStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public void initWithContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9ebae0", new Object[]{this});
            return;
        }
        super.initWithContext();
        try {
            VibrateHelper.getInstance().init(this.mContext);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        boolean z;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            if (actionParamsJson == null) {
                return null;
            }
            if (VibrateHelper.getInstance().checkoutInvalid()) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "noVibrate", "vibrate can't work");
                return null;
            } else if (actionParamsJson.containsKey("type")) {
                if (DrmManager.getInstance(this.mContext).isDegrade(DrmKey.DEGRADE_VIBRATE_WITH_TYPE, false, this.mContext)) {
                    return "";
                }
                String string = actionParamsJson.getString("type");
                if (TextUtils.equals(string, "error")) {
                    VibrateHelper.getInstance().vibrate(new long[]{100, 200, 100, 200, 100, 200});
                    return "";
                } else if (TextUtils.equals(string, BaseFBPlugin.PWD_TIPS_TYPE.typeWarning)) {
                    long[] jArr = {100, 200, 100, 200};
                    int[] iArr = new int[4];
                    while (i < 2) {
                        iArr[(i * 2) + 1] = 100;
                        i++;
                    }
                    VibrateHelper.getInstance().vibrate(jArr, iArr);
                    return "";
                } else {
                    long[] jArr2 = {100, 200, 100, 200};
                    int[] iArr2 = new int[4];
                    while (i < 2) {
                        iArr2[(i * 2) + 1] = 40;
                        i++;
                    }
                    VibrateHelper.getInstance().vibrate(jArr2, iArr2);
                    return "";
                }
            } else if (!actionParamsJson.containsKey("status")) {
                return "";
            } else {
                String string2 = actionParamsJson.getString("status");
                int hashCode = string2.hashCode();
                if (hashCode == -1367724422) {
                    string2.equals("cancel");
                } else if (hashCode == 109757538 && string2.equals("start")) {
                    if (actionParamsJson.containsKey("params")) {
                        JSONObject jSONObject = actionParamsJson.getJSONObject("params");
                        if (jSONObject == null) {
                            z = false;
                        } else {
                            z = jSONObject.containsKey("milliseconds");
                            if (jSONObject.containsKey("amplitude")) {
                                z |= true;
                            }
                            if (jSONObject.containsKey("patterns")) {
                                z |= true;
                            }
                            if (jSONObject.containsKey("amplitudes")) {
                                z |= true;
                            }
                        }
                        if (!z) {
                            VibrateHelper.getInstance().vibrate();
                            return "";
                        } else if (z) {
                            VibrateHelper.getInstance().vibrate(jSONObject.getLong("milliseconds").longValue());
                            return "";
                        } else if (z) {
                            VibrateHelper.getInstance().vibrate(jSONObject.getLong("milliseconds").longValue(), jSONObject.getIntValue("amplitude"));
                            return "";
                        } else if (z) {
                            JSONArray jSONArray = jSONObject.getJSONArray("patterns");
                            long[] jArr3 = new long[jSONArray.size()];
                            while (i < jSONArray.size()) {
                                jArr3[i] = jSONArray.getLongValue(i);
                                i++;
                            }
                            VibrateHelper.getInstance().vibrate(jArr3);
                            return "";
                        } else if (!z) {
                            return "";
                        } else {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("patterns");
                            long[] jArr4 = new long[jSONArray2.size()];
                            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                                jArr4[i2] = jSONArray2.getLongValue(i2);
                            }
                            JSONArray jSONArray3 = jSONObject.getJSONArray("amplitudes");
                            int[] iArr3 = new int[jSONArray2.size()];
                            while (i < jSONArray3.size()) {
                                iArr3[i] = jSONArray3.getIntValue(i);
                                i++;
                            }
                            VibrateHelper.getInstance().vibrate(jArr4, iArr3);
                            return "";
                        }
                    } else {
                        VibrateHelper.getInstance().vibrate();
                        return "";
                    }
                }
                VibrateHelper.getInstance().cancel();
                return "";
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }
}
