package com.alipay.mobile.common.amnet.biz.inner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.biz.OutEventNotifyManagerImpl;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetNetInfoReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static NetworkReceiver f3900a;
    public static boolean started;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class NetworkReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Boolean lastNetAvailable;
        public int lastMainNetType = -1;
        public String lastSubNetType = null;

        public static /* synthetic */ Object ipc$super(NetworkReceiver networkReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/inner/AmnetNetInfoReceiver$NetworkReceiver");
        }

        public final boolean b(Context context, boolean z, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7ee929d9", new Object[]{this, context, new Boolean(z), new Integer(i), new Integer(i2)})).booleanValue();
            }
            Boolean bool = this.lastNetAvailable;
            if (bool == null) {
                LogCatUtil.info("AmnetNetInfoReceiver", "1 new radio. ");
                return false;
            } else if (bool.booleanValue() != z) {
                LogCatUtil.info("AmnetNetInfoReceiver", "2 new radio. ");
                return false;
            } else if (this.lastMainNetType != i) {
                LogCatUtil.info("AmnetNetInfoReceiver", "3 new radio. ");
                return false;
            } else if (i == 3) {
                LogCatUtil.info("AmnetNetInfoReceiver", "4 new radio. ");
                return false;
            } else if (TextUtils.isEmpty(this.lastSubNetType)) {
                LogCatUtil.info("AmnetNetInfoReceiver", "5 new radio. ");
                return false;
            } else if (!this.lastSubNetType.equals(Integer.toString(i2))) {
                LogCatUtil.info("AmnetNetInfoReceiver", "6 new radio. ");
                return false;
            } else {
                LogCatUtil.info("AmnetNetInfoReceiver", " repeat radio, mobile subtype the same.");
                return true;
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                LogCatUtil.info("AmnetNetInfoReceiver", "onReceive: [ AmnetNetInfoReceiver ] action: [ " + intent.getAction() + " ]");
                LogCatUtil.printInfo("AmnetNetInfoReceiver", "AmnetNetInfoReceiver hashcode=[" + hashCode() + "]");
                boolean isNetAvailable = AmnetNetInfoReceiver.isNetAvailable(context);
                int networkType = NetworkUtils.getNetworkType(context);
                int connType = ConnectionUtil.getConnType(context);
                try {
                    if (b(context, isNetAvailable, networkType, connType)) {
                        return;
                    }
                } catch (Exception e) {
                    LogCatUtil.error("AmnetNetInfoReceiver", "checkRepeatBroadcast exception: " + e.toString());
                }
                a(context, isNetAvailable, networkType, connType);
                ((OutEventNotifyManagerImpl) NetBeanFactory.getBean(OutEventNotifyManagerImpl.class)).notifyNetWorkEvent(isNetAvailable, networkType, connType);
                LogCatUtil.info("AmnetNetInfoReceiver", "onReceive: [ AmnetNetInfoReceiver ] [ isNetAvailable=" + isNetAvailable + " ] mainType=[" + networkType + "] subType=[" + connType + "]");
            }
        }

        public final void a(Context context, boolean z, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1116dd4", new Object[]{this, context, new Boolean(z), new Integer(i), new Integer(i2)});
                return;
            }
            try {
                this.lastNetAvailable = Boolean.valueOf(z);
                this.lastMainNetType = i;
                if (i != 3) {
                    this.lastSubNetType = Integer.toString(i2);
                } else if (!MiscUtils.isAtFrontDesk(context)) {
                    this.lastSubNetType = AmnetConstant.DEFAULT_BSSID;
                    LogCatUtil.info("AmnetNetInfoReceiver", "1 wifi info: SSID=[" + AmnetConstant.DEFAULT_SSID + "] BSSID=[" + this.lastSubNetType + "]");
                }
            } catch (Throwable th) {
                LogCatUtil.warn("AmnetNetInfoReceiver", "setLastInfos " + th.toString());
            }
        }
    }

    public static NetworkReceiver getNetworkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkReceiver) ipChange.ipc$dispatch("6766a33c", new Object[0]);
        }
        if (f3900a == null) {
            f3900a = new NetworkReceiver();
        }
        return f3900a;
    }

    public static void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[0]);
            return;
        }
        LogCatUtil.info("AmnetNetInfoReceiver", "start: [ AmnetNetInfoReceiver ] ");
        if (!started) {
            synchronized (AmnetNetInfoReceiver.class) {
                try {
                    if (!started) {
                        started = true;
                        Context appContext = AmnetEnvHelper.getAppContext();
                        try {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                            appContext.registerReceiver(getNetworkReceiver(), intentFilter);
                        } catch (Throwable th) {
                            started = false;
                            LogCatUtil.error("AmnetNetInfoReceiver", "start: AmnetNetInfoReceiver: [ Exception=" + th + " ]");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[0]);
            return;
        }
        LogCatUtil.info("AmnetNetInfoReceiver", "stop: [ AmnetNetInfoReceiver ] ");
        try {
            AmnetEnvHelper.getAppContext().unregisterReceiver(getNetworkReceiver());
        } catch (Exception e) {
            LogCatUtil.error("AmnetNetInfoReceiver", e);
        }
    }

    public static boolean isNetAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b42cb4ef", new Object[]{context})).booleanValue();
        }
        try {
            return NetworkUtils.isNetworkAvailable(context);
        } catch (Exception e) {
            LogCatUtil.error("AmnetNetInfoReceiver", "isNetAvailable: [ Exception " + e + " ]");
            return false;
        }
    }
}
