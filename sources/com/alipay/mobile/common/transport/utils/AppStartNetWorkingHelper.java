package com.alipay.mobile.common.transport.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppStartNetWorkingHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ClientStartedReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f4139a;
        public final Runnable b;

        public ClientStartedReceiver(Context context, Runnable runnable) {
            this.f4139a = context;
            this.b = runnable;
        }

        public static /* synthetic */ Object ipc$super(ClientStartedReceiver clientStartedReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/utils/AppStartNetWorkingHelper$ClientStartedReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StringBuilder sb;
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    this.b.run();
                    try {
                        LocalBroadcastManager.getInstance(this.f4139a).unregisterReceiver(this);
                    } catch (Exception e) {
                        e = e;
                        sb = new StringBuilder("ClientStartedReceiver#onReceive exception : ");
                        sb.append(e.toString());
                        LogCatUtil.warn("ClientStartedReceiver", sb.toString());
                    }
                } catch (Exception e2) {
                    LogCatUtil.error("AlipayHttpDnsInitHelper", "", e2);
                    try {
                        LocalBroadcastManager.getInstance(this.f4139a).unregisterReceiver(this);
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder("ClientStartedReceiver#onReceive exception : ");
                        sb.append(e.toString());
                        LogCatUtil.warn("ClientStartedReceiver", sb.toString());
                    }
                }
            } catch (Throwable th) {
                try {
                    LocalBroadcastManager.getInstance(this.f4139a).unregisterReceiver(this);
                } catch (Exception e4) {
                    LogCatUtil.warn("ClientStartedReceiver", "ClientStartedReceiver#onReceive exception : " + e4.toString());
                }
                throw th;
            }
        }
    }

    public static final void runOnAppStart(Runnable runnable, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be15e98", new Object[]{runnable, context});
        } else if (MiscUtils.isShowUserTip(context)) {
            try {
                LocalBroadcastManager.getInstance(context).registerReceiver(new ClientStartedReceiver(context, runnable), new IntentFilter("com.alipay.mobile.client.STARTED"));
            } catch (Exception e) {
                LogCatUtil.warn("AppStartNetWorkingHelper", e);
            }
        } else {
            runnable.run();
        }
    }
}
