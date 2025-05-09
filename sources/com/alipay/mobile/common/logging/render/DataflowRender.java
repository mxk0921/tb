package com.alipay.mobile.common.logging.render;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.DataflowID;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.common.logging.process.VariableStoreInToolsProcess;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DataflowRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DataflowRender(LogContext logContext) {
        super(logContext);
    }

    public static /* synthetic */ Object ipc$super(DataflowRender dataflowRender, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/render/DataflowRender");
    }

    public final String a(DataflowModel dataflowModel) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e153c3d2", new Object[]{this, dataflowModel});
        }
        if (dataflowModel.isInUse()) {
            StringBuilder sb = new StringBuilder();
            String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
            DataflowID dataflowID = dataflowModel.type;
            DataflowID dataflowID2 = DataflowID.MDAP_LOG;
            if (dataflowID == dataflowID2 && !TextUtils.isEmpty(VariableStoreInToolsProcess.d)) {
                processAlias = VariableStoreInToolsProcess.d;
            }
            boolean isMonitorBackground = TianyanLoggingStatus.isMonitorBackground();
            if (dataflowModel.type == dataflowID2 && !TextUtils.isEmpty(VariableStoreInToolsProcess.d)) {
                isMonitorBackground = VariableStoreInToolsProcess.f3979a;
            }
            boolean isStrictBackground = TianyanLoggingStatus.isStrictBackground();
            if (dataflowModel.type == dataflowID2 && !TextUtils.isEmpty(VariableStoreInToolsProcess.d)) {
                isStrictBackground = VariableStoreInToolsProcess.b;
            }
            boolean isRelaxedBackground = TianyanLoggingStatus.isRelaxedBackground();
            if (dataflowModel.type == dataflowID2 && !TextUtils.isEmpty(VariableStoreInToolsProcess.d)) {
                isRelaxedBackground = VariableStoreInToolsProcess.c;
            }
            sb.append("DF");
            LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
            LoggingUtil.appendParam(sb, this.b.getProductId());
            LoggingUtil.appendParam(sb, this.b.getProductVersion());
            LoggingUtil.appendParam(sb, this.b.getUserId());
            LoggingUtil.appendParam(sb, this.b.getDeviceId());
            Context applicationContext = this.b.getApplicationContext();
            if (isStrictBackground) {
                str = NetUtil.getNetworkTypeOptimizedStrict(applicationContext);
            } else {
                str = NetUtil.getNetworkTypeOptimized(applicationContext);
            }
            LoggingUtil.appendParam(sb, str);
            if (dataflowModel.type == null) {
                dataflowModel.type = DataflowID.UNKNOWN;
            }
            LoggingUtil.appendParam(sb, dataflowModel.type.getDes());
            LoggingUtil.appendParam(sb, dataflowModel.url);
            LoggingUtil.appendParam(sb, String.valueOf(dataflowModel.reqSize + dataflowModel.respSize));
            LoggingUtil.appendParam(sb, dataflowModel.bundle);
            LoggingUtil.appendExtParam(sb, dataflowModel.params);
            LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
            LoggingUtil.appendParam(sb, Build.MODEL);
            LoggingUtil.appendParam(sb, dataflowModel.diagnose);
            LoggingUtil.appendParam(sb, processAlias);
            String str4 = "0";
            if (isMonitorBackground) {
                str2 = "1";
            } else {
                str2 = str4;
            }
            LoggingUtil.appendParam(sb, str2);
            if (isStrictBackground) {
                str3 = "1";
            } else {
                str3 = str4;
            }
            LoggingUtil.appendParam(sb, str3);
            if (isRelaxedBackground) {
                str4 = "1";
            }
            LoggingUtil.appendParam(sb, str4);
            LoggingUtil.appendParam(sb, BaseRender.a());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dataflowModel.getLoggerLevel());
            LoggingUtil.appendParam(sb, sb2.toString());
            LoggingUtil.appendParam(sb, LogStrategyManager.getInstance().getHitTestRate(LogCategory.CATEGORY_DATAFLOW, dataflowModel.getLoggerLevel()));
            dataflowModel.recycle();
            sb.append("$$");
            return sb.toString();
        }
        throw new IllegalStateException("dataflowModel has been recycled");
    }
}
