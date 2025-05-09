package com.alipay.android.msp.drivers.stores.store.events;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WifiInfoStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public WifiInfoStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(WifiInfoStore wifiInfoStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/WifiInfoStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        WifiManager wifiManager;
        List<ScanResult> scanResults;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null || mspUIClient.getCurrentPresenter() == null) {
            return null;
        }
        try {
            if (this.mContext == null || PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(this.mContext) || (wifiManager = PhoneCashierMspEngine.getMspWallet().getWifiManager(this.mContext.getApplicationContext())) == null || (scanResults = wifiManager.getScanResults()) == null || scanResults.isEmpty()) {
                return "";
            }
            if (scanResults.size() >= 2) {
                Collections.sort(scanResults, new Comparator<ScanResult>() { // from class: com.alipay.android.msp.drivers.stores.store.events.WifiInfoStore.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public int compare(ScanResult scanResult, ScanResult scanResult2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3f57943f", new Object[]{this, scanResult, scanResult2})).intValue() : scanResult2.level - scanResult.level;
                    }
                });
            }
            int i = 10;
            if (scanResults.size() <= 10) {
                i = scanResults.size();
            }
            StringBuilder sb = new StringBuilder();
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                sb.append(Base64.encodeToString(connectionInfo.getSSID().getBytes(), 2));
                sb.append("#");
                sb.append(connectionInfo.getBSSID());
                sb.append("#");
                sb.append(connectionInfo.getRssi());
                sb.append("#true");
            }
            for (int i2 = 0; i2 < i; i2++) {
                ScanResult scanResult = scanResults.get(i2);
                if (connectionInfo == null || TextUtils.isEmpty(connectionInfo.getBSSID()) || !connectionInfo.getBSSID().equals(scanResult.BSSID)) {
                    sb.append("|");
                    sb.append(Base64.encodeToString(scanResult.SSID.getBytes(), 2));
                    sb.append("#");
                    sb.append(scanResult.BSSID);
                    sb.append("#");
                    sb.append(scanResult.level);
                    sb.append("#");
                    sb.append("false");
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MspEventTypes.ACTION_INVOKE_WIFI_INFO, (Object) sb.toString());
            return jSONObject.toJSONString();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
