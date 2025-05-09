package com.alipay.mobile.common.logging.util.network;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetWorkProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static NetWorkProvider INSTANCE = null;
    public static final String NETWORK_UNKNOWN = "unknown";
    public static long b = 0;
    public static int c = -1;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4003a;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class LogNetworkConnReceiver extends RigorousNetworkConnReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public LogNetworkConnReceiver(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(LogNetworkConnReceiver logNetworkConnReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/util/network/NetWorkProvider$LogNetworkConnReceiver");
        }

        @Override // com.alipay.mobile.common.logging.util.network.RigorousNetworkConnReceiver
        public void onReceivee(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30528f9d", new Object[]{this, context, intent});
            } else {
                NetWorkProvider.access$000(NetWorkProvider.this, context);
            }
        }
    }

    public NetWorkProvider(Context context) {
        this.f4003a = context;
        registerLogNetworkConnReceiver(context);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - b > 2000) {
            c = NetworkUtils.getNetworkType(context);
            b = uptimeMillis;
        }
        return c;
    }

    public static /* synthetic */ int access$000(NetWorkProvider netWorkProvider, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44314160", new Object[]{netWorkProvider, context})).intValue();
        }
        return a(context);
    }

    public static synchronized NetWorkProvider createInstance(Context context) {
        synchronized (NetWorkProvider.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetWorkProvider) ipChange.ipc$dispatch("ed709212", new Object[]{context});
            }
            if (INSTANCE == null) {
                INSTANCE = new NetWorkProvider(context);
            }
            return INSTANCE;
        }
    }

    public static synchronized NetWorkProvider getInstance() {
        synchronized (NetWorkProvider.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetWorkProvider) ipChange.ipc$dispatch("30b3aa94", new Object[0]);
            }
            NetWorkProvider netWorkProvider = INSTANCE;
            if (netWorkProvider != null) {
                return netWorkProvider;
            }
            throw new IllegalStateException("need createInstance before use");
        }
    }

    public int getCurrentNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa41473f", new Object[]{this})).intValue();
        }
        int i = c;
        if (i == -1 || i == 0) {
            a(this.f4003a);
        }
        return c;
    }

    public void registerLogNetworkConnReceiver(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864e7ef9", new Object[]{this, context});
        } else {
            new LogNetworkConnReceiver(context).register();
        }
    }

    public String getCurrentNetworkType2Str() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e4c3215", new Object[]{this});
        }
        int currentNetworkType = getCurrentNetworkType();
        if (currentNetworkType == 1) {
            return "2g";
        }
        if (currentNetworkType == 2) {
            return "3g";
        }
        if (currentNetworkType == 3) {
            return "wifi";
        }
        if (currentNetworkType != 4) {
            return "unknown";
        }
        return "4g";
    }
}
