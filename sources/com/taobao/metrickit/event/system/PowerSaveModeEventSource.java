package com.taobao.metrickit.event.system;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.PowerManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import tb.ol8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PowerSaveModeEventSource extends ol8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MetricKit.PowerSaveModeEventSource";
    public Application g;
    public final BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.metrickit.event.system.PowerSaveModeEventSource.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/system/PowerSaveModeEventSource$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            PowerSaveModeEventSource powerSaveModeEventSource = PowerSaveModeEventSource.this;
            PowerSaveModeEventSource.v(powerSaveModeEventSource, PowerSaveModeEventSource.u(powerSaveModeEventSource));
        }
    };

    public PowerSaveModeEventSource(Handler handler) {
        super(handler);
    }

    public static /* synthetic */ Object ipc$super(PowerSaveModeEventSource powerSaveModeEventSource, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/system/PowerSaveModeEventSource");
    }

    public static /* synthetic */ Application u(PowerSaveModeEventSource powerSaveModeEventSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("c64d9c96", new Object[]{powerSaveModeEventSource});
        }
        return powerSaveModeEventSource.g;
    }

    public static /* synthetic */ void v(PowerSaveModeEventSource powerSaveModeEventSource, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d34e657", new Object[]{powerSaveModeEventSource, application});
        } else {
            powerSaveModeEventSource.w(application);
        }
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{92, 93};
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
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            metricContext.getApplication().registerReceiver(this.h, intentFilter, null, metricContext.getDefaultInnerHandler());
            this.g = metricContext.getApplication();
            w(metricContext.getApplication());
        } catch (Exception e) {
            TLog.loge(TAG, "register error", e);
        }
    }

    public final void w(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186eb4b0", new Object[]{this, application});
            return;
        }
        try {
            if (((PowerManager) application.getSystemService("power")).isPowerSaveMode()) {
                k(92, Collections.emptyMap());
            } else {
                k(93, Collections.emptyMap());
            }
        } catch (Exception e) {
            e.printStackTrace();
            TLog.loge(TAG, "makeDispatch error", e);
        }
    }
}
