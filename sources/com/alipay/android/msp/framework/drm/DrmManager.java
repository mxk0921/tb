package com.alipay.android.msp.framework.drm;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.NumUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.android.ultron.datamodel.imp.DMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DrmManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile DrmManager ge;
    private String gb;
    private final EnvStatus gc;
    private int gd;
    private volatile JSONObject gf = null;
    private JSONObject mMspSwitch;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class ConfigServiceBridge {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("812c333b", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_".concat(String.valueOf(str)));
        }

        public static /* synthetic */ void access$000(DrmManager drmManager) {
            JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44bde7df", new Object[]{drmManager});
                return;
            }
            String a2 = a(DrmKey.DEGRADE_DRM_CONFIG_DEGRADE);
            LogUtil.d("DrmManager", "ConfigServiceBridge.syncToDrm", "configFirstStr=".concat(String.valueOf(a2)));
            if (a2 != null) {
                try {
                    parseObject = JSON.parseObject(a2);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace("DrmManager", "ConfigServiceBridge.syncToDrm 解析失败", th);
                }
                if (parseObject != null && "true".equals(parseObject.getString("needDegrade"))) {
                    DrmManager.access$202(drmManager, parseObject);
                    return;
                }
            }
            parseObject = null;
            if (parseObject != null) {
            }
        }

        public static /* synthetic */ String access$100(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("30255a5e", new Object[]{str});
            }
            return a(str);
        }
    }

    private DrmManager(Context context) {
        this.gc = new EnvStatus(context);
        try {
            this.mMspSwitch = JSON.parseObject(PrefUtils.getString("cashier_drm_switch", "msp_switch_content", "{}"));
            this.gb = PrefUtils.getString("cashier_drm_switch", "msp_switch_version", "");
            this.gd = PrefUtils.getInt("cashier_drm_switch", "utdid_factor", -1).intValue();
            ConfigServiceBridge.access$000(this);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private boolean a(String str, boolean z, Context context) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7967812a", new Object[]{this, str, new Boolean(z), context})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                String s = s(str);
                if (s != null) {
                    z = procGraySwitchWithRate(context, Integer.parseInt(s.trim()));
                }
            } catch (Throwable th) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.DRM_PARSE_EX, "");
                LogUtil.printExceptionStackTrace(th);
            }
            ConfigChangeMonitor.getInstance().hitKey(str, Boolean.valueOf(z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" -> ");
        if (z) {
            str2 = "命中";
        } else {
            str2 = "未命中";
        }
        sb.append(str2);
        LogUtil.i("DrmManager", "innerIsDegrade", sb.toString());
        return z;
    }

    public static /* synthetic */ JSONObject access$202(DrmManager drmManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f88e4e95", new Object[]{drmManager, jSONObject});
        }
        drmManager.gf = jSONObject;
        return jSONObject;
    }

    public static DrmManager getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DrmManager) ipChange.ipc$dispatch("3e57d1c", new Object[]{context});
        }
        if (ge == null) {
            synchronized (DrmManager.class) {
                try {
                    if (ge == null) {
                        ge = new DrmManager(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ge;
    }

    private synchronized String s(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a0e425c", new Object[]{this, str});
        }
        if (this.gf != null) {
            str2 = ConfigServiceBridge.access$100(str);
            if (str2 == null) {
                str2 = this.gf.getString(str);
                LogUtil.i("DrmManager", "innerGetValueForKey", "from configFirst " + str + "=" + str2);
            }
        } else {
            JSONObject jSONObject = this.mMspSwitch;
            if (jSONObject == null || !jSONObject.containsKey(str)) {
                str2 = ConfigServiceBridge.access$100(str);
            } else {
                str2 = this.mMspSwitch.getString(str);
                LogUtil.i("DrmManager", "innerGetValueForKey", "from mspSwitch " + str + "=" + str2);
            }
        }
        return str2;
    }

    public JSONObject getDrmValueFromKey(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1fd7de9e", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String s = s(str);
        ConfigChangeMonitor.getInstance().hitKey(str, s);
        try {
            return JSON.parseObject(s);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public String getRawDrmValueFromKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4daa017e", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String s = s(str);
        ConfigChangeMonitor.getInstance().hitKey(str, s);
        return s;
    }

    public synchronized boolean isDegrade(String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef9c235", new Object[]{this, str, new Boolean(z), context})).booleanValue();
        }
        return a(str, z, context);
    }

    public synchronized boolean isGray(String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1409f76", new Object[]{this, str, new Boolean(z), context})).booleanValue();
        }
        return a(str, z, context);
    }

    public synchronized void onUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b55528c1", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("msp_switch");
            if (!TextUtils.isEmpty(string)) {
                JSONObject parseObject = JSON.parseObject(string);
                JSONObject jSONObject2 = parseObject.getJSONObject("content");
                String string2 = parseObject.getString(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION);
                if (!TextUtils.isEmpty(string2)) {
                    onUpdate(jSONObject2, string2);
                }
            }
        }
    }

    public synchronized String getVersion() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        if (this.gc.isChanged()) {
            this.gc.update();
            this.mMspSwitch = new JSONObject();
            this.gb = "";
            PrefUtils.remove("cashier_drm_switch", "msp_switch_content");
            PrefUtils.remove("cashier_drm_switch", "msp_switch_version");
            LogUtil.record(1, "Drm", "DrmManager", DMComponent.RESET);
            str = FactoryType.TYPE_INVALID;
        } else if (TextUtils.isEmpty(this.gb)) {
            str = FactoryType.TYPE_INVALID;
        } else {
            str = this.gb;
        }
        LogUtil.record(1, "Drm", "DrmManager", "getVersion:".concat(String.valueOf(str)));
        return str;
    }

    public boolean procGraySwitchWithRate(Context context, int i) {
        int i2 = -1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59139019", new Object[]{this, context, new Integer(i)})).booleanValue();
        }
        if (this.gd == -1) {
            if (GlobalHelper.getInstance().getContext() == null) {
                GlobalHelper.getInstance().init(context);
            }
            String utdid = GlobalHelper.getInstance().getUtdid(context);
            if (!TextUtils.isEmpty(utdid)) {
                String replaceAll = utdid.replaceAll("=", "");
                if (replaceAll.length() >= 5) {
                    replaceAll = replaceAll.substring(0, 5);
                }
                int c64to10 = (int) (NumUtil.c64to10(replaceAll) % 10000);
                i2 = c64to10 < 0 ? c64to10 * (-1) : c64to10;
            } else {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.DRM_CALC_EX, "");
            }
            this.gd = i2;
            PrefUtils.putInt("cashier_drm_switch", "utdid_factor", Integer.valueOf(i2));
        }
        return this.gd < i;
    }

    public synchronized void onUpdate(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1994044b", new Object[]{this, jSONObject, str});
            return;
        }
        this.mMspSwitch = jSONObject;
        if (jSONObject == null) {
            this.mMspSwitch = new JSONObject();
        }
        this.gb = str;
        PrefUtils.putString("cashier_drm_switch", "msp_switch_content", this.mMspSwitch.toString());
        PrefUtils.putString("cashier_drm_switch", "msp_switch_version", str);
        LogUtil.record(1, "Drm", "DrmManager", "onUpdate content" + this.mMspSwitch.toString());
        this.gc.update();
        ConfigServiceBridge.access$000(this);
    }
}
