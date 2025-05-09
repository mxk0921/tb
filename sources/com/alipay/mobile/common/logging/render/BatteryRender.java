package com.alipay.mobile.common.logging.render;

import android.os.Build;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.BatteryID;
import com.alipay.mobile.common.logging.api.monitor.BatteryModel;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BatteryRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BatteryRender(LogContext logContext) {
        super(logContext);
    }

    public static /* synthetic */ Object ipc$super(BatteryRender batteryRender, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/render/BatteryRender");
    }

    public final String a(BatteryModel batteryModel) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("218aff8b", new Object[]{this, batteryModel});
        }
        BatteryID batteryID = batteryModel.type;
        BatteryID batteryID2 = BatteryID.UNKNOWN;
        if (batteryID != batteryID2) {
            StringBuilder sb = new StringBuilder();
            sb.append("BTR");
            LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
            LoggingUtil.appendParam(sb, this.b.getProductId());
            LoggingUtil.appendParam(sb, this.b.getProductVersion());
            LoggingUtil.appendParam(sb, this.b.getUserId());
            LoggingUtil.appendParam(sb, this.b.getDeviceId());
            if (batteryModel.type == null) {
                batteryModel.type = batteryID2;
            }
            LoggingUtil.appendParam(sb, batteryModel.type.getDes());
            LoggingUtil.appendParam(sb, String.valueOf(batteryModel.power));
            LoggingUtil.appendParam(sb, batteryModel.bundle);
            LoggingUtil.appendExtParam(sb, batteryModel.params);
            LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
            LoggingUtil.appendParam(sb, Build.MODEL);
            LoggingUtil.appendParam(sb, batteryModel.diagnose);
            LoggingUtil.appendParam(sb, LoggerFactory.getProcessInfo().getProcessAlias());
            String str3 = "0";
            if (TianyanLoggingStatus.isMonitorBackground()) {
                str = "1";
            } else {
                str = str3;
            }
            LoggingUtil.appendParam(sb, str);
            if (TianyanLoggingStatus.isStrictBackground()) {
                str2 = "1";
            } else {
                str2 = str3;
            }
            LoggingUtil.appendParam(sb, str2);
            if (TianyanLoggingStatus.isRelaxedBackground()) {
                str3 = "1";
            }
            LoggingUtil.appendParam(sb, str3);
            LoggingUtil.appendParam(sb, BaseRender.a());
            batteryModel.recycle();
            sb.append("$$");
            return sb.toString();
        }
        throw new IllegalStateException("batteryModel has been recycled");
    }
}
