package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TAB_BAR_ITEM_STATE_CHANGED = "TBTabBarItemStateChanged";
    public static final String ACTION_UCP_TAB_CONFIG_CHANGE = "UCPTabBarChanged";
    public static final String ACTION_UCP_TAB_INTRODUCTORY_REMOVE = "UCPTabBarShouldRemove";

    public static void b(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303f8c58", new Object[]{context, broadcastReceiver});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("UCPTabBarShouldRemove");
        LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void c(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc15f16", new Object[]{context, broadcastReceiver});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_UCP_TAB_CONFIG_CHANGE);
        LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afaf6981", new Object[]{str, jSONObject});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(y9a.b()).sendBroadcast(new Intent(str).putExtra("data", jSONObject.toJSONString()));
        } catch (Exception e) {
            TLog.loge(y9a.c(), "BroadcastUtils", "sendLocalBroadcast error", e);
        }
    }

    public static void a(int i, JSONObject jSONObject) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37621fed", new Object[]{new Integer(i), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("trackInfo", (Object) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        switch (i) {
            case 13:
                i2 = 2;
                break;
            case 14:
                break;
            case 15:
                i2 = 3;
                break;
            default:
                i2 = 0;
                break;
        }
        jSONObject3.put("state", (Object) Integer.valueOf(i2));
        jSONObject3.put("value", (Object) jSONObject2);
        d(ACTION_TAB_BAR_ITEM_STATE_CHANGED, jSONObject3);
    }
}
