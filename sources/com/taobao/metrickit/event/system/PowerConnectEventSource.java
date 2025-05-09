package com.taobao.metrickit.event.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.Map;
import tb.ol8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PowerConnectEventSource extends ol8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Handler g;
    public final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.metrickit.event.system.PowerConnectEventSource.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/system/PowerConnectEventSource$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                PowerConnectEventSource.v(PowerConnectEventSource.this, 91, Collections.emptyMap());
            } else if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                PowerConnectEventSource.u(PowerConnectEventSource.this, 90, Collections.emptyMap());
            }
        }
    };

    public PowerConnectEventSource(Handler handler) {
        super(handler);
        this.g = handler;
    }

    public static /* synthetic */ Object ipc$super(PowerConnectEventSource powerConnectEventSource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/system/PowerConnectEventSource");
    }

    public static /* synthetic */ void u(PowerConnectEventSource powerConnectEventSource, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57332eeb", new Object[]{powerConnectEventSource, new Integer(i), map});
        } else {
            powerConnectEventSource.k(i, map);
        }
    }

    public static /* synthetic */ void v(PowerConnectEventSource powerConnectEventSource, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e4990a", new Object[]{powerConnectEventSource, new Integer(i), map});
        } else {
            powerConnectEventSource.k(i, map);
        }
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{90, 91};
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            metricContext.getApplication().registerReceiver(this.h, intentFilter, null, this.g);
            k(metricContext.isCharging() ? 90 : 91, Collections.emptyMap());
            metricContext.getApplication();
        } catch (Exception e) {
            TLog.loge("MetricKit.SysBatteryEventSource", "register error", e);
        }
    }
}
