package com.alipay.mobile.verifyidentity.log.behavior;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.alipay.mobile.verifyidentity.info.DeviceInfo;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.utils.EncryptFileUtils;
import com.alipay.mobile.verifyidentity.log.utils.LogReportHelper;
import com.alipay.mobile.verifyidentity.utils.CipherHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerifyLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Dispersed_Type = "event";
    public static final String SENTRY_TYPE = "sentry";
    public static final String Verify_Type = "verify";
    public static volatile VerifyLogger h;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f4303a = new ArrayList();
    public final List<String> b = new ArrayList();
    public int c = 1;
    public final StringBuffer d = new StringBuffer();
    public final BlockingQueue<VerifyLogTask> e = new ArrayBlockingQueue(100);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public static final Map<String, StringBuffer> g = new HashMap();
    public static long i = SystemClock.elapsedRealtime();
    public static String j = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class VerifyLogTask {
        public Map<String, String> extParams;
        public String param1;
        public String param2;
        public String param3;
        public String sentryLog;
        public String type;
        public String userCaseID;
        public String verifyId;

        public VerifyLogTask(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
            this.type = str;
            this.userCaseID = str2;
            this.param1 = str3;
            this.param2 = str4;
            this.param3 = str5;
            this.extParams = map;
            this.verifyId = VerifyLogger.access$000(VerifyLogger.this);
        }
    }

    public static /* synthetic */ String access$000(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("caa65ed3", new Object[]{verifyLogger});
        }
        return verifyLogger.a();
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "VerifyLogger";
    }

    public static /* synthetic */ boolean access$1000(VerifyLogger verifyLogger, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be53b934", new Object[]{verifyLogger, str, str2})).booleanValue();
        }
        return verifyLogger.j(str, str2);
    }

    public static /* synthetic */ void access$1100(VerifyLogger verifyLogger, String str, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880aa951", new Object[]{verifyLogger, str, stringBuffer});
        } else {
            verifyLogger.g(str, stringBuffer);
        }
    }

    public static /* synthetic */ void access$1200(VerifyLogger verifyLogger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eca97e8", new Object[]{verifyLogger, str});
        } else {
            verifyLogger.l(str);
        }
    }

    public static /* synthetic */ String access$1300(VerifyLogger verifyLogger, String str, String str2, String str3, String str4, String str5, Map map) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ceda44c", new Object[]{verifyLogger, str, str2, str3, str4, str5, map});
        }
        if ("endSymbol".equalsIgnoreCase(str)) {
            str6 = ")]";
        } else {
            str6 = f7l.BRACKET_END_STR;
        }
        return ",(" + o(str2) + ";" + k() + ";" + c(str3, str4, str5, map) + str6;
    }

    public static /* synthetic */ void access$1400(VerifyLogger verifyLogger, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbed7634", new Object[]{verifyLogger, str, str2});
        } else {
            verifyLogger.f(str, str2);
        }
    }

    public static /* synthetic */ StringBuffer access$1500(VerifyLogger verifyLogger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("d4d2b7b5", new Object[]{verifyLogger, str});
        }
        return verifyLogger.h(str);
    }

    public static /* synthetic */ String access$1600(VerifyLogger verifyLogger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89bdbc34", new Object[]{verifyLogger, str});
        }
        return m("-") + "," + str + "]";
    }

    public static /* synthetic */ BlockingQueue access$200(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueue) ipChange.ipc$dispatch("6d612c12", new Object[]{verifyLogger});
        }
        return verifyLogger.e;
    }

    public static /* synthetic */ String access$300(VerifyLogger verifyLogger, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73b11da7", new Object[]{verifyLogger, str, str2, str3, str4, str5, str6, map});
        }
        if (str.equalsIgnoreCase("event")) {
            str7 = ")]";
        } else {
            str7 = f7l.BRACKET_END_STR;
        }
        return m(str2) + ",(" + o(str3) + ";" + k() + ";" + c(str4, str5, str6, map) + str7;
    }

    public static /* synthetic */ void access$400(VerifyLogger verifyLogger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97bbfb", new Object[]{verifyLogger, str});
        } else {
            verifyLogger.q(str);
        }
    }

    public static /* synthetic */ int access$500(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9621e825", new Object[]{verifyLogger})).intValue();
        }
        return verifyLogger.c;
    }

    public static /* synthetic */ int access$502(VerifyLogger verifyLogger, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27aa142", new Object[]{verifyLogger, new Integer(i2)})).intValue();
        }
        verifyLogger.c = i2;
        return i2;
    }

    public static /* synthetic */ List access$600(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f285a9f4", new Object[]{verifyLogger});
        }
        return verifyLogger.b;
    }

    public static /* synthetic */ String access$700(VerifyLogger verifyLogger, Object[] objArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4773c7f9", new Object[]{verifyLogger, objArr, str});
        }
        return e(objArr, str);
    }

    public static /* synthetic */ void access$800(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29665b75", new Object[]{verifyLogger});
        } else {
            verifyLogger.n();
        }
    }

    public static /* synthetic */ void access$900(VerifyLogger verifyLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527d736", new Object[]{verifyLogger});
        } else {
            verifyLogger.i();
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "-";
        }
        return str;
    }

    public static String c(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e59c2c01", new Object[]{str, str2, str3, map});
        }
        return handleValue(handleSymbol(str)) + ";" + handleValue(handleSymbol(str2)) + ";" + handleValue(handleSymbol(str3)) + ";" + d(map);
    }

    public static String d(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return "-";
        }
        ArrayList arrayList = new ArrayList(map.keySet());
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str2 = (String) arrayList.get(i2);
            String str3 = map.get(str2);
            if (i2 == arrayList.size() - 1 && !TextUtils.isEmpty(str3)) {
                sb.append(str2);
                sb.append("=");
                sb.append(handleValue(str3));
            } else if (!TextUtils.isEmpty(str3)) {
                sb.append(str2);
                sb.append("=");
                sb.append(handleValue(str3));
                sb.append("&");
            }
        }
        if (sb.toString().endsWith("&")) {
            str = sb.toString().substring(0, sb.toString().length() - 1);
        } else {
            str = sb.toString();
        }
        return handleSymbol(str);
    }

    public static String e(Object[] objArr, String str) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e645ad", new Object[]{objArr, str});
        }
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        if (length == 0) {
            i2 = 0;
        } else {
            Object obj = objArr[0];
            if (obj == null) {
                i3 = 16;
            } else {
                i3 = obj.toString().length();
            }
            i2 = (i3 + 1) * length;
        }
        StringBuffer stringBuffer = new StringBuffer(i2);
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(str);
            }
            Object obj2 = objArr[i4];
            if (obj2 != null) {
                stringBuffer.append(obj2);
            }
        }
        return stringBuffer.toString();
    }

    public static VerifyLogger getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyLogger) ipChange.ipc$dispatch("9de0e83a", new Object[0]);
        }
        if (h == null) {
            synchronized (VerifyLogger.class) {
                try {
                    if (h == null) {
                        h = new VerifyLogger();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public static String handleSymbol(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94ed204f", new Object[]{str});
        }
        if (str != null) {
            return str.replaceAll("\\r", "#").replaceAll("\\n", "#").replaceAll(",", "，").replaceAll("\\[", "【").replaceAll("\\]", "】").replaceAll("\\(", "（").replaceAll("\\)", "）").replaceAll(";", "；");
        }
        return "-";
    }

    public static String handleValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c3b55e6", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.replaceAll("&", "^");
        }
        return "-";
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        return new SimpleDateFormat("HH:mm:ss:SSS").format(new Date());
    }

    public static String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        String[] split = str.split("-");
        return split[2] + "-" + split[3];
    }

    public static String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{str});
        }
        if (str != null) {
            return str.replaceAll("\\(|\\)", "");
        }
        return "-";
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            StringBuffer stringBuffer = this.d;
            if (stringBuffer != null) {
                return stringBuffer.toString();
            }
            return "";
        } catch (Exception e) {
            VerifyLogCat.w("VerifyLogger", e);
            return "";
        }
    }

    public void eventBehavior(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54662b6a", new Object[]{this, str, str2, str3, str4, map});
        } else {
            logBehavior("event", str, str2, str3, str4, map);
        }
    }

    public final synchronized void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            h(str).append(str2);
        }
    }

    public final synchronized void g(String str, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290cda1c", new Object[]{this, str, stringBuffer});
            return;
        }
        if (str != null) {
            ((HashMap) g).put(str, stringBuffer);
        }
    }

    public final synchronized StringBuffer h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("346189ad", new Object[]{this, str});
        } else if (str != null) {
            StringBuffer stringBuffer = (StringBuffer) ((HashMap) g).get(str);
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer("");
                g(str, stringBuffer);
            }
            return stringBuffer;
        } else {
            return new StringBuffer("");
        }
    }

    public final synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            ((ArrayList) this.f4303a).clear();
        }
    }

    public final synchronized boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        } else if (!TextUtils.isEmpty(str)) {
            return false;
        } else {
            ((ArrayList) this.f4303a).add(str2);
            VerifyLogCat.i("VerifyLogger", "cacheOnNoVerifyId");
            return true;
        }
    }

    public final synchronized void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        Iterator it = ((ArrayList) this.f4303a).iterator();
        while (it.hasNext()) {
            f(str, ((String) it.next()).replace("NULL_VID_TOBE_REPLACED", b(str)));
            VerifyLogCat.i("VerifyLogger", "appendNoVerifyIdLogCache");
        }
        i();
    }

    public void logBehavior(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8063dab6", new Object[]{this, str, str2, str3, str4, str5, map});
        } else if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeLogging))) {
            startLogger();
            if (map != null) {
                map.remove("userCaseID");
            }
            ((ArrayBlockingQueue) this.e).add(new VerifyLogTask(str, str2, str3, str4, str5, map));
            VerifyLogCat.i("VerifyLogger", "userCaseID: " + str2);
        }
    }

    public final synchronized void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            ((ArrayList) this.b).clear();
        }
    }

    public final synchronized void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ((ArrayList) this.b).add(str);
        }
    }

    public synchronized void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        if (str != null) {
            ((HashMap) g).remove(str);
        }
    }

    public void sentryBehavior(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1a9722", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            startLogger();
            VerifyLogTask verifyLogTask = new VerifyLogTask(SENTRY_TYPE, "", "", "", "", null);
            verifyLogTask.sentryLog = str;
            ((ArrayBlockingQueue) this.e).add(verifyLogTask);
        }
    }

    public void setVerifyId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e861b407", new Object[]{this, str});
        } else if (str != null && !TextUtils.isEmpty(str)) {
            if (this.d.length() > 0) {
                this.d.setLength(0);
            }
            this.d.append(str);
        }
    }

    public synchronized void startLogger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90dc4019", new Object[]{this});
        } else if (!this.f.getAndSet(true)) {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    int parseInt;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    VerifyLogCat.i(VerifyLogger.access$100(), "核身埋点器启动");
                    while (true) {
                        try {
                            synchronized (this) {
                                VerifyLogTask verifyLogTask = (VerifyLogTask) VerifyLogger.access$200(VerifyLogger.this).take();
                                if (verifyLogTask.type.equalsIgnoreCase("event")) {
                                    VerifyLogger.access$400(VerifyLogger.this, VerifyLogger.access$300(VerifyLogger.this, verifyLogTask.type, verifyLogTask.verifyId, verifyLogTask.userCaseID, "-", "-", verifyLogTask.param3, verifyLogTask.extParams));
                                    String reportFlag = ReportHelper.getReportFlag(ReportHelper.maxLogNum);
                                    if (!TextUtils.isEmpty(reportFlag) && (parseInt = Integer.parseInt(reportFlag)) > 0) {
                                        VerifyLogger.access$502(VerifyLogger.this, parseInt);
                                    }
                                    if (VerifyLogger.access$600(VerifyLogger.this).size() >= VerifyLogger.access$500(VerifyLogger.this)) {
                                        VerifyLogger verifyLogger = VerifyLogger.this;
                                        String access$700 = VerifyLogger.access$700(verifyLogger, VerifyLogger.access$600(verifyLogger).toArray(), ",");
                                        String access$100 = VerifyLogger.access$100();
                                        VerifyLogCat.i(access$100, "event" + access$700);
                                        VerifyLogger.access$800(VerifyLogger.this);
                                        LogReportHelper.getInstance().reportDispersedLog(access$700);
                                    }
                                } else if (verifyLogTask.type.equalsIgnoreCase("verify")) {
                                    if (verifyLogTask.userCaseID.equals("UC-MobileIC-150810-1")) {
                                        VerifyLogger.access$900(VerifyLogger.this);
                                        LogReportHelper.getInstance().getAndReportData();
                                        String access$300 = VerifyLogger.access$300(VerifyLogger.this, verifyLogTask.type, verifyLogTask.verifyId, verifyLogTask.userCaseID, "-", "-", verifyLogTask.param3, verifyLogTask.extParams);
                                        if (!VerifyLogger.access$1000(VerifyLogger.this, verifyLogTask.verifyId, access$300)) {
                                            StringBuffer stringBuffer = new StringBuffer();
                                            stringBuffer.append(access$300);
                                            VerifyLogger.access$1100(VerifyLogger.this, verifyLogTask.verifyId, stringBuffer);
                                        }
                                    } else if (!verifyLogTask.userCaseID.equals("UC-MobileIC-170823-1")) {
                                        if (verifyLogTask.userCaseID.equals("UC-MobileIC-150810-4")) {
                                            String str = verifyLogTask.param2;
                                            VerifyLogger.access$1200(VerifyLogger.this, str);
                                            VerifyLogger verifyLogger2 = VerifyLogger.this;
                                            VerifyLogger.access$1400(verifyLogger2, str, VerifyLogger.access$1300(verifyLogger2, "endSymbol", verifyLogTask.userCaseID, "-", "-", verifyLogTask.param3, verifyLogTask.extParams));
                                            String stringBuffer2 = VerifyLogger.access$1500(VerifyLogger.this, str).toString();
                                            String access$1002 = VerifyLogger.access$100();
                                            VerifyLogCat.i(access$1002, "结束后：" + stringBuffer2);
                                            VerifyLogCat.i(VerifyLogger.access$100(), "删除对应暂留日志");
                                            VerifyLogger.getInstance().remove(str);
                                            Map<String, String> map = verifyLogTask.extParams;
                                            if (map == null || !map.containsKey("cancel_scene") || !"fp_plugin".equalsIgnoreCase(verifyLogTask.extParams.get("cancel_scene"))) {
                                                LogReportHelper.getInstance().reportBehaviorLog(stringBuffer2, str);
                                            }
                                        } else {
                                            String access$1300 = VerifyLogger.access$1300(VerifyLogger.this, null, verifyLogTask.userCaseID, "-", "-", verifyLogTask.param3, verifyLogTask.extParams);
                                            if (!VerifyLogger.access$1000(VerifyLogger.this, verifyLogTask.verifyId, access$1300)) {
                                                VerifyLogger.access$1200(VerifyLogger.this, verifyLogTask.verifyId);
                                                VerifyLogger.access$1400(VerifyLogger.this, verifyLogTask.verifyId, access$1300);
                                            }
                                        }
                                    }
                                } else if (verifyLogTask.type.equalsIgnoreCase(VerifyLogger.SENTRY_TYPE) && !TextUtils.isEmpty(verifyLogTask.sentryLog)) {
                                    LogReportHelper.getInstance().reportSentryLog(VerifyLogger.access$1600(VerifyLogger.this, verifyLogTask.sentryLog));
                                }
                            }
                        } catch (Throwable th) {
                            VerifyLogCat.w(VerifyLogger.access$100(), th);
                        }
                    }
                }
            }, "VI-logBehavior");
        }
    }

    public void verifyBehavior(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2f892b", new Object[]{this, str, str2, str3, str4, map});
        } else {
            logBehavior("verify", str, str2, str3, str4, map);
        }
    }

    public synchronized void writeCrashLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f96fcad", new Object[]{this, str});
            return;
        }
        VerifyLogCat.i("VerifyLogger", "writeCrashLog");
        String a2 = a();
        l(a2);
        String str2 = h(a2).toString() + "]";
        VerifyLogCat.i("VerifyLogger", "异常后 | verify埋点内容:" + str2);
        EncryptFileUtils.write(LogReportHelper.getLogFileName(), str2);
        q(m(a2) + ",(" + str);
        List<String> list = this.b;
        if (list != null && !((ArrayList) list).isEmpty()) {
            String e = e(((ArrayList) this.b).toArray(), ",");
            VerifyLogCat.i("VerifyLogger", "异常后 | event埋点内容:" + e);
            EncryptFileUtils.write(LogReportHelper.getDispersedLogFileName(), e);
        }
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder("[(");
        sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()));
        sb.append(";");
        sb.append(AppInfo.getInstance().getAppVersion());
        sb.append(";");
        sb.append(AppInfo.getInstance().getAppName());
        sb.append(";");
        sb.append(AppInfo.getInstance().getViSdkVersion());
        sb.append(";");
        sb.append(DeviceInfo.getMobileBrand());
        sb.append("|");
        sb.append(DeviceInfo.getMobileModel());
        sb.append(";");
        sb.append(DeviceInfo.getOsVersion());
        sb.append(";");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) MicroModuleContext.getInstance().getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        String str2 = "-";
        if (activeNetworkInfo.isAvailable()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                str2 = "WIFI";
            } else if (type == 0) {
                str2 = "4G/3G";
            }
        }
        sb.append(str2);
        sb.append(";");
        sb.append(b(VIUtils.getUserId()));
        sb.append(";");
        sb.append(p(AppInfo.getInstance().getApdid()));
        sb.append(";");
        sb.append(p(EnvInfoUtil.getBirdNestInfo()));
        sb.append(";");
        if (TextUtils.isEmpty(str)) {
            str = "NULL_VID_TOBE_REPLACED";
        }
        sb.append(str);
        sb.append(";");
        sb.append(p(DeviceInfo.getUtdid(MicroModuleContext.getInstance().getContext())));
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public void logException(String str, Throwable th) {
        Throwable th2;
        String str2;
        String bytes2Hex;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64705fb9", new Object[]{this, str, th});
            return;
        }
        String str3 = "-";
        try {
            str2 = new String(Base64.encode(VerifyLogCat.getExceptionMsg(th).getBytes("UTF-8"), 2));
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            bytes2Hex = CipherHelper.bytes2Hex(CipherHelper.encrypt_SHA(str2, "md5"));
        } catch (Throwable th4) {
            th2 = th4;
            str3 = str2;
            VerifyLogCat.w("VerifyLogger", "fail to build encodedExceptionMsg：", th2);
            eventBehavior(str, "", "", str3, null);
            return;
        }
        if (SystemClock.elapsedRealtime() - i >= 10000 || !TextUtils.equals(j, bytes2Hex)) {
            j = bytes2Hex;
            i = SystemClock.elapsedRealtime();
            str3 = str2;
            eventBehavior(str, "", "", str3, null);
            return;
        }
        VerifyLogCat.i("VerifyLogger", "短时间内相同ExceptionMsg，忽略");
    }

    public void logBehavior(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675b996c", new Object[]{this, str, str2, str3, str4, str5, str6, map});
        } else if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeLogging))) {
            startLogger();
            if (map != null) {
                map.remove("userCaseID");
            }
            VerifyLogTask verifyLogTask = new VerifyLogTask(str, str3, str4, str5, str6, map);
            verifyLogTask.verifyId = str2;
            VerifyLogCat.i("DST", "task verifyid:" + verifyLogTask.verifyId);
            ((ArrayBlockingQueue) this.e).add(verifyLogTask);
            VerifyLogCat.i("VerifyLogger", "userCaseID: " + str3);
        }
    }
}
