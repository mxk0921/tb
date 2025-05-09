package com.alipay.mobile.common.amnet.biz.inner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alipay.mobile.common.amnet.biz.OutEventNotifyManagerImpl;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.d0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PermissionBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3902a;

    public PermissionBroadcastReceiver(Context context) {
        if (context == null) {
            LogCatUtil.warn("PermissionBroadcastReceiver", "[PermissionBroadcastReceiver] mContext is null.");
        }
    }

    public static /* synthetic */ Object ipc$super(PermissionBroadcastReceiver permissionBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/inner/PermissionBroadcastReceiver");
    }

    public static final void registerBroadcast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66186083", new Object[]{context});
        } else if (context == null) {
            throw new IllegalArgumentException("context maybe null.");
        } else if (!f3902a) {
            synchronized (PermissionBroadcastReceiver.class) {
                try {
                    if (!f3902a) {
                        context.registerReceiver(new PermissionBroadcastReceiver(context), new IntentFilter("com.eg.android.AlipayGphone.permission.storage.ACTION"));
                        f3902a = true;
                        LogCatUtil.info("PermissionBroadcastReceiver", "registerReceiver finish.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LoggerManagerFactory.getInstance().getDefaultBean().info(d0j.tlogTag, "onReceive:".concat(getClass().getSimpleName()));
        try {
            if (!intent.getBooleanExtra("READ_PHONE_STATE", false)) {
                LogCatUtil.info("PermissionBroadcastReceiver", "Not 'READ_PHONE_STATE' broadcast.");
                return;
            }
            DeviceInfoUtil.reInitDeviceInfo();
            ((OutEventNotifyManagerImpl) NetBeanFactory.getBean(OutEventNotifyManagerImpl.class)).notifyResendInitInfos();
            LogCatUtil.info("PermissionBroadcastReceiver", "notifyResendInitInfos finish.");
        } catch (Throwable th) {
            LogCatUtil.error("PermissionBroadcastReceiver", "Handle Permission broadcast error.", th);
        }
    }
}
