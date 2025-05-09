package com.alipay.mobile.common.transportext.biz.appevent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetScreenOnOffReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SecreenBroadcastReceiver f4176a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class SecreenBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SecreenBroadcastReceiver secreenBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/appevent/AmnetScreenOnOffReceiver$SecreenBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                NetworkAsyncTaskExecutor.executeHighSerial(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.appevent.AmnetScreenOnOffReceiver.SecreenBroadcastReceiver.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        LogCatUtil.info("amnet_AmnetScreenOnOffReceiver", "onReceive: [ AmnetScreenOnOffReceiver ] [ Action=" + intent.getAction() + " ]");
                        String action = intent.getAction();
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            AppEventManager.getListener().onSeceenOffEvent();
                        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                            AppEventManager.getListener().onSeceenOnEvent();
                        }
                    }
                });
            }
        }

        public void register() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            } else if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
                Context appContext = AmnetEnvHelper.getAppContext();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                appContext.registerReceiver(this, intentFilter);
            }
        }

        public void unregister() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            } else {
                AmnetEnvHelper.getAppContext().unregisterReceiver(this);
            }
        }
    }

    public static SecreenBroadcastReceiver a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecreenBroadcastReceiver) ipChange.ipc$dispatch("20695ef1", new Object[0]);
        }
        SecreenBroadcastReceiver secreenBroadcastReceiver = f4176a;
        if (secreenBroadcastReceiver != null) {
            return secreenBroadcastReceiver;
        }
        synchronized (AmnetScreenOnOffReceiver.class) {
            try {
                SecreenBroadcastReceiver secreenBroadcastReceiver2 = f4176a;
                if (secreenBroadcastReceiver2 != null) {
                    return secreenBroadcastReceiver2;
                }
                SecreenBroadcastReceiver secreenBroadcastReceiver3 = new SecreenBroadcastReceiver();
                f4176a = secreenBroadcastReceiver3;
                return secreenBroadcastReceiver3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[0]);
            return;
        }
        LogCatUtil.info("amnet_AmnetScreenOnOffReceiver", "onCreate: [ AmnetScreenOnOffReceiver ] ");
        a().register();
    }

    public static void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[0]);
            return;
        }
        LogCatUtil.info("amnet_AmnetScreenOnOffReceiver", "stop: [ AmnetScreenOnOffReceiver ]  ");
        SecreenBroadcastReceiver secreenBroadcastReceiver = f4176a;
        if (secreenBroadcastReceiver != null) {
            secreenBroadcastReceiver.unregister();
        }
    }
}
