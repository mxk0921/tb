package com.alipay.android.phone.mobilesdk.socketcraft.integrated.monitor;

import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorModel;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.DefaultMonitorPrinter;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.DataflowID;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.common.logging.api.monitor.Performance;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.monitor.api.MonitorFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MPaaSMonitorPrinter extends DefaultMonitorPrinter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MPaaSMonitorPrinter mPaaSMonitorPrinter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/integrated/monitor/MPaaSMonitorPrinter");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.DefaultMonitorPrinter, com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.MonitorPrinter
    public void print(MonitorModel monitorModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691c2b8", new Object[]{this, monitorModel});
            return;
        }
        try {
            if (monitorModel.itemMap.isEmpty()) {
                SCLogCatUtil.info("MonitorPrinter", "itemMap is empty!");
                return;
            }
            Performance performance = new Performance();
            performance.setSubType(MonitorItemConstants.MONITOR_SUB_TYPE);
            performance.setParam1(MonitorItemConstants.PARTITION_NAME);
            performance.setParam2("INFO");
            performance.setParam3(monitorModel.logTitle);
            monitorModel.itemMap.entrySet();
            for (Map.Entry<String, String> entry : monitorModel.itemMap.entrySet()) {
                performance.getExtPramas().put(entry.getKey(), entry.getValue());
            }
            LoggerFactory.getMonitorLogger().performance(LogCategory.CATEGORY_NETWORK, performance);
            SCLogCatUtil.debug(performance.getSubType() + "_PERF", toPerformanceString(performance) + "\n");
        } catch (Throwable th) {
            SCLogCatUtil.error("MonitorPrinter", "monitorLog exception. ", th);
        }
    }

    public String toPerformanceString(Performance performance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b60d8d2c", new Object[]{this, performance});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(performance.getSubType());
        stringBuffer.append(",");
        stringBuffer.append(performance.getParam1());
        stringBuffer.append(",");
        stringBuffer.append(performance.getParam2());
        stringBuffer.append(",");
        stringBuffer.append(performance.getParam3());
        stringBuffer.append(",");
        for (String str : performance.getExtPramas().keySet()) {
            stringBuffer.append(str + "=" + performance.getExtPramas().get(str) + "^");
        }
        return stringBuffer.toString();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.DefaultMonitorPrinter, com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.MonitorPrinter
    public void noteTraficConsume(DataflowMonitorModel dataflowMonitorModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c77c80", new Object[]{this, dataflowMonitorModel});
            return;
        }
        try {
            if (dataflowMonitorModel == null) {
                SCLogCatUtil.warn("MonitorPrinter", "[noteTraficConsume] dataflowMonitorModel is null");
                return;
            }
            String str = dataflowMonitorModel.methodName;
            if (str != null && str.trim().length() > 0) {
                DataflowModel obtain = DataflowModel.obtain(DataflowID.WEB_SOCKET, dataflowMonitorModel.url, dataflowMonitorModel.sendSize, dataflowMonitorModel.receiveSize, dataflowMonitorModel.methodName);
                obtain.appId = dataflowMonitorModel.ownerId;
                if ("send".equals(dataflowMonitorModel.methodName)) {
                    obtain.isUpload = true;
                }
                MonitorFactory.getMonitorContext().noteTraficConsume(obtain);
                if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                    SCLogCatUtil.info("MonitorPrinter", "[noteTraficConsume]  dataflowMonitorModel: " + dataflowMonitorModel.toString());
                    return;
                }
                return;
            }
            SCLogCatUtil.warn("MonitorPrinter", "[noteTraficConsume] methodName is empty.");
        } catch (Throwable th) {
            SCLogCatUtil.error("MonitorPrinter", "[noteTraficConsume] exception. ", th);
        }
    }
}
