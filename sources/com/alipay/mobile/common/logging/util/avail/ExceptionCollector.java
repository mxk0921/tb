package com.alipay.mobile.common.logging.util.avail;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.MTBizReportName;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExceptionCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ExceptionCollector d;

    /* renamed from: a  reason: collision with root package name */
    public List<Long> f3998a;
    public List<ExceptionData> b;
    public final Context c;

    public ExceptionCollector(Context context) {
        if (context != null) {
            this.c = context.getApplicationContext();
        }
        if (this.c == null) {
            this.c = context;
        }
    }

    public static void c(List<ExceptionData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else if (list.isEmpty()) {
            LoggerFactory.getTraceLogger().info("ExceptionCollector", "reportUnAvail but exceptions is empty");
        } else {
            LoggerFactory.getTraceLogger().info("ExceptionCollector", "reportUnAvail");
            HashMap hashMap = new HashMap();
            JSONArray jSONArray = new JSONArray();
            for (ExceptionData exceptionData : list) {
                jSONArray.put(exceptionData.toJsonObject());
            }
            hashMap.put("Exceptions", jSONArray.toString());
            LoggerFactory.getMonitorLogger().mtBizReport(MTBizReportName.MTBIZ_FRAME, "CONT_UNAVAIL", "1000", hashMap);
        }
    }

    public static ExceptionCollector getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExceptionCollector) ipChange.ipc$dispatch("e8dbfb42", new Object[]{context});
        }
        if (d == null) {
            synchronized (ExceptionCollector.class) {
                try {
                    if (d == null) {
                        d = new ExceptionCollector(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final List<ExceptionData> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95ad395b", new Object[]{this, new Boolean(z)});
        }
        List<ExceptionData> list = this.b;
        if (list == null) {
            this.b = Collections.synchronizedList(new ArrayList());
        } else if (!z) {
            return list;
        }
        try {
            SharedPreferences a2 = a(this.c);
            if (a2 != null) {
                String string = a2.getString("exceptions", "");
                LoggerFactory.getTraceLogger().info("ExceptionCollector", "getExceptions: ".concat(String.valueOf(string)));
                if (!TextUtils.isEmpty(string)) {
                    this.b.clear();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        ExceptionData exceptionData = new ExceptionData();
                        exceptionData.parse(jSONObject);
                        this.b.add(exceptionData);
                    }
                }
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionCollector", th);
        }
        return this.b;
    }

    public synchronized void clearException(String str) {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d84b0d93", new Object[]{this, str});
                return;
            }
            LoggerFactory.getTraceLogger().info("ExceptionCollector", "clearException: ".concat(String.valueOf(str)));
            if (ExceptionData.isValidExceptionType(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(b(false));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ExceptionData exceptionData = (ExceptionData) it.next();
                    if (str != null && !str.equals(exceptionData.getExceptionType())) {
                    }
                    it.remove();
                    z = true;
                }
                if (z) {
                    d(arrayList, !ExceptionData.TYPE_START_APP_FAIL.equals(str));
                }
            }
        }
    }

    public final void d(List<ExceptionData> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
            return;
        }
        List<ExceptionData> list2 = this.b;
        if (list2 != list) {
            list2.clear();
            this.b.addAll(list);
        }
        try {
            SharedPreferences a2 = a(this.c);
            if (a2 != null) {
                JSONArray jSONArray = new JSONArray();
                for (ExceptionData exceptionData : this.b) {
                    jSONArray.put(exceptionData.toJsonObject());
                }
                if (z) {
                    a2.edit().putString("exceptions", jSONArray.toString()).commit();
                } else {
                    a2.edit().putString("exceptions", jSONArray.toString()).apply();
                }
                LoggerFactory.getTraceLogger().info("ExceptionCollector", "updateExceptions: ".concat(String.valueOf(jSONArray)));
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionCollector", th);
        }
    }

    public synchronized void recordException(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd4970f", new Object[]{this, str});
            return;
        }
        LoggerFactory.getTraceLogger().info("ExceptionCollector", "recordException: ".concat(String.valueOf(str)));
        if (ExceptionData.isValidExceptionType(str)) {
            List<Long> launchTimes = getLaunchTimes();
            if (launchTimes.size() > 0) {
                recordException(str, launchTimes.get(launchTimes.size() - 1).longValue());
            }
        }
    }

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        try {
            if (LoggerFactory.getProcessInfo().isMainProcess()) {
                return context.getSharedPreferences("logging_avail_analysis", 0);
            }
            return context.getSharedPreferences("logging_avail_analysis", 4);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("ExceptionCollector", "readAndParseStrategy", th);
            return null;
        }
    }

    public synchronized void recordNewLaunchTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a90e6e", new Object[]{this, new Long(j)});
            return;
        }
        LoggerFactory.getTraceLogger().info("ExceptionCollector", "recordNewLaunchTime: ".concat(String.valueOf(j)));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getLaunchTimes());
        arrayList.add(Long.valueOf(j));
        while (arrayList.size() > 3) {
            arrayList.remove(0);
        }
        e(arrayList);
    }

    public final void e(List<Long> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        List<Long> list2 = this.f3998a;
        if (list2 != list) {
            list2.clear();
            this.f3998a.addAll(list);
        }
        try {
            SharedPreferences a2 = a(this.c);
            if (a2 != null) {
                String str = "";
                for (int i = 0; i < this.f3998a.size(); i++) {
                    str = str + String.valueOf(this.f3998a.get(i));
                    if (i < this.f3998a.size() - 1) {
                        str = str + ",";
                    }
                }
                a2.edit().putString("launchTimes", str).apply();
                LoggerFactory.getTraceLogger().info("ExceptionCollector", "updateLaunchTimes: ".concat(String.valueOf(str)));
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionCollector", th);
        }
    }

    public List<Long> getLaunchTimes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d5dc45a3", new Object[]{this});
        }
        if (this.f3998a == null) {
            this.f3998a = Collections.synchronizedList(new ArrayList());
        } else if (LoggerFactory.getProcessInfo().isMainProcess()) {
            return this.f3998a;
        }
        try {
            SharedPreferences a2 = a(this.c);
            if (a2 != null) {
                String string = a2.getString("launchTimes", "");
                LoggerFactory.getTraceLogger().info("ExceptionCollector", "getLaunchTimes: ".concat(String.valueOf(string)));
                String[] split = string.split(",");
                this.f3998a.clear();
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f3998a.add(Long.valueOf(Long.parseLong(str)));
                    }
                }
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("ExceptionCollector", th);
        }
        return this.f3998a;
    }

    public synchronized void recordException(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabec195", new Object[]{this, str, new Long(j)});
            return;
        }
        if (j > 0 && ExceptionData.isValidExceptionType(str)) {
            if (LoggerFactory.getProcessInfo().isMainProcess() || !LoggerFactory.getProcessInfo().isMainProcessExist()) {
                ExceptionData exceptionData = new ExceptionData();
                exceptionData.setExceptionType(str);
                exceptionData.setClientLaunchTime(j);
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.info("ExceptionCollector", "recordException: " + exceptionData.getExceptionType() + " launchTime: " + exceptionData.getClientLaunchTime());
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(b(true));
                arrayList.add(exceptionData);
                Collections.sort(arrayList);
                List<Long> launchTimes = getLaunchTimes();
                ArrayList arrayList2 = new ArrayList();
                int size = launchTimes.size();
                int[] iArr = new int[size];
                int i = 0;
                for (int i2 = 0; i2 < launchTimes.size(); i2++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ExceptionData exceptionData2 = (ExceptionData) it.next();
                        if (exceptionData2.getClientLaunchTime() == launchTimes.get((launchTimes.size() - i2) - 1).longValue()) {
                            arrayList2.add(exceptionData2);
                            iArr[i2] = iArr[i2] + 1;
                        }
                    }
                    int i3 = iArr[i2];
                    if (i3 <= 0) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            i4 += iArr[i5];
                        }
                        if (i4 > 0) {
                            break;
                        }
                    } else {
                        i += i3;
                    }
                }
                if (i >= 3) {
                    c(arrayList2);
                    arrayList.clear();
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ExceptionData exceptionData3 = (ExceptionData) it2.next();
                    for (Long l : launchTimes) {
                        if (exceptionData3.getClientLaunchTime() == l.longValue()) {
                            arrayList3.add(exceptionData3);
                        }
                    }
                }
                d(arrayList3, true);
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(this.c, LogContext.MAIN_SERVICE_CLASS_NAME);
            intent.setPackage(this.c.getPackageName());
            intent.setAction("ExceptionCollector_recordException");
            Bundle bundle = new Bundle();
            bundle.putString("exceptionType", str);
            bundle.putLong("clientLaunchTime", j);
            intent.putExtras(bundle);
            this.c.startService(intent);
        }
    }
}
