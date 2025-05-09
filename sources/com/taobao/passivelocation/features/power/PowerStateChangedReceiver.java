package com.taobao.passivelocation.features.power;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.dmm;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PowerStateChangedReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(789577847);
    }

    public static /* synthetic */ Object ipc$super(PowerStateChangedReceiver powerStateChangedReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/passivelocation/features/power/PowerStateChangedReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            AppMonitor.Counter.commit("passivelocation", "PowerStateChangedReceiver", 1.0d);
            if (!"off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "passivelocationoption", "off"))) {
                String action = intent.getAction();
                if ("android.intent.action.BATTERY_LOW".equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                    new dmm().a(action);
                }
            }
        } catch (Exception unused) {
        }
    }
}
