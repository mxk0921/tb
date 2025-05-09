package com.alipay.mobile.common.logging.api.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum ExceptionID {
    MONITORPOINT_CRASH("MonitorPoint_Crash"),
    MONITORPOINT_IGNORE_CRASH("MonitorPoint_Ignore_Crash"),
    MONITORPOINT_INVALID_CRASH("MonitorPoint_Invalid_Crash"),
    MONITORPOINT_SUB_THREAD_CRASH("MonitorPoint_Sub_Thread_Crash"),
    MONITORPOINT_CLIENTSERR("MonitorPoint_ClientsErr"),
    MONITORPOINT_CONNECTERR("MonitorPoint_ConnectErr"),
    MONITORPOINT_BIZ_EXCEPTION("MonitorPoint_Biz_Exception");
    
    public static final String UNKNOWN_THREAD = "unknown";
    private static final Map<String, ExceptionID> sStringToEnum = new HashMap();
    private String desc;

    static {
        ExceptionID[] values;
        for (ExceptionID exceptionID : values()) {
            sStringToEnum.put(exceptionID.desc, exceptionID);
        }
    }

    ExceptionID(String str) {
        this.desc = str;
    }

    public static ExceptionID fromString(String str) {
        return sStringToEnum.get(str);
    }

    public final String getDes() {
        return this.desc;
    }
}
