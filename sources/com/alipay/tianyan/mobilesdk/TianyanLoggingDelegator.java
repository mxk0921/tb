package com.alipay.tianyan.mobilesdk;

import com.alipay.mobile.common.logging.api.http.BaseHttpClient;
import com.alipay.mobile.common.logging.api.monitor.BatteryID;
import com.alipay.mobile.common.logging.api.monitor.BatteryModel;
import com.alipay.mobile.common.logging.api.monitor.DataflowID;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TianyanLoggingDelegator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface CommonSimpleDelegate {
        void acceptTimeTicksMadly();

        String getBundleByClass(String str);
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ConfigServiceDelegate {
        String getConfigValueByKey(String str, String str2);
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface LoggingHttpClientGetter {
        BaseHttpClient getHttpClient();
    }

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface MonitorContextDelegate {
        boolean isPowerConsumeAccept(BatteryID batteryID, String str);

        boolean isTraficConsumeAccept(DataflowID dataflowID, String str);

        void notePowerConsume(BatteryModel batteryModel);

        void noteTraficConsume(DataflowModel dataflowModel);
    }

    public static boolean putCommonSimpleDelegate(CommonSimpleDelegate commonSimpleDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eca7376", new Object[]{commonSimpleDelegate})).booleanValue();
        }
        return TianyanLoggingDispatcher.putCommonSimpleDelegate(commonSimpleDelegate);
    }

    public static boolean putConfigServiceDelegate(ConfigServiceDelegate configServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("175cffa0", new Object[]{configServiceDelegate})).booleanValue();
        }
        return TianyanLoggingDispatcher.putConfigServiceDelegate(configServiceDelegate);
    }

    public static boolean putMonitorContextDelegate(MonitorContextDelegate monitorContextDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daccfd46", new Object[]{monitorContextDelegate})).booleanValue();
        }
        return TianyanLoggingDispatcher.putMonitorContextDelegate(monitorContextDelegate);
    }

    public static boolean removeCommonSimpleDelegate(CommonSimpleDelegate commonSimpleDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a0ef9e1", new Object[]{commonSimpleDelegate})).booleanValue();
        }
        return TianyanLoggingDispatcher.removeCommonSimpleDelegate(commonSimpleDelegate);
    }

    public static boolean removeConfigServiceDelegate(ConfigServiceDelegate configServiceDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b399974b", new Object[]{configServiceDelegate})).booleanValue();
        }
        return TianyanLoggingDispatcher.removeConfigServiceDelegate(configServiceDelegate);
    }

    public static boolean removeMonitorContextDelegate(MonitorContextDelegate monitorContextDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a425631", new Object[]{monitorContextDelegate})).booleanValue();
        }
        return TianyanLoggingDispatcher.removeMonitorContextDelegate(monitorContextDelegate);
    }

    public static void setFrameworkBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24479b63", new Object[]{new Boolean(z)});
        } else {
            TianyanLoggingDispatcher.sIsFrameworkBackground = z;
        }
    }

    public static void setMonitorBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca79e507", new Object[]{new Boolean(z)});
        } else {
            TianyanLoggingDispatcher.sIsMonitorBackground = z;
        }
    }

    public static void setRelaxedBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4630f292", new Object[]{new Boolean(z)});
        } else {
            TianyanLoggingDispatcher.sIsRelaxedBackground = z;
        }
    }

    public static void setStrictBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274ac974", new Object[]{new Boolean(z)});
        } else {
            TianyanLoggingDispatcher.sIsStrictBackground = z;
        }
    }
}
