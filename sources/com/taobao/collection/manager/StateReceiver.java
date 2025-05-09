package com.taobao.collection.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.b62;
import tb.mdh;
import tb.t2o;
import tb.znb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StateReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f10305a = 0;
    public long b = 0;
    public final znb c;
    public final znb d;

    static {
        t2o.a(789577797);
    }

    public StateReceiver(znb znbVar, znb znbVar2) {
        this.c = znbVar;
        this.d = znbVar2;
    }

    public static /* synthetic */ Object ipc$super(StateReceiver stateReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/collection/manager/StateReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        AppMonitor.Counter.commit("passivelocation", "StateReceiver", 1.0d);
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                        if (this.c.isValid() && intent.getExtras().getInt("wifi_state") == 3 && currentTimeMillis - this.f10305a > 60000) {
                            mdh.d("lbs_sdk.coll_StateRcv", "wifi enabled state scan");
                            WifiManager wifiManager = (WifiManager) Globals.getApplication().getSystemService("wifi");
                            if (wifiManager.isWifiEnabled()) {
                                wifiManager.startScan();
                                this.f10305a = currentTimeMillis;
                            }
                        }
                    } else if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED") && this.d.isValid() && intent.getExtras().getInt("android.bluetooth.adapter.extra.STATE") == 12 && currentTimeMillis - this.b > 60000) {
                        mdh.d("lbs_sdk.coll_StateRcv", "beacon enabled state scan");
                        new b62(Globals.getApplication()).p(2000L);
                        this.b = currentTimeMillis;
                    }
                } catch (Throwable th) {
                    mdh.b("lbs_sdk.coll_StateRcv", "an error occurred in StateReceiver " + th);
                }
            }
        }
    }
}
