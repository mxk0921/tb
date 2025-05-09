package com.alipay.mobile.common.logging.uploader;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.logging.MdapLogUploadManager;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient;
import com.alipay.mobile.common.logging.api.http.BaseHttpClient;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.http.LoggingHttpClientFactory;
import com.alipay.mobile.common.logging.http.MdapTrafficController;
import com.alipay.mobile.common.logging.strategy.LogStrategyInfo;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.FileUtil;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.upx;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BaseUploader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f3986a = "MdapLogUploadManager";
    public File b;
    public Context c;

    public BaseUploader(File file, Context context) {
        this.b = file;
        this.c = context;
    }

    public static void b(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
        } else if (!LogCategory.CATEGORY_LOGMONITOR.equals(str)) {
            Behavor behavor = new Behavor();
            behavor.setBehaviourPro(LogCategory.CATEGORY_LOGMONITOR);
            behavor.setSeedID("LogUploadCost");
            behavor.setParam1(str);
            behavor.setParam2(str2);
            behavor.setParam3(String.valueOf(j));
            behavor.setLoggerLevel(3);
            LoggerFactory.getBehavorLogger().event(null, behavor);
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        LogEncryptClient logEncryptClient = LoggerFactory.getLogContext().getLogEncryptClient();
        if (logEncryptClient == null) {
            return str;
        }
        String[] split = str.split("\\$\\$");
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                if (str2.startsWith("1_")) {
                    try {
                        String decrypt = logEncryptClient.decrypt(str2.substring(2));
                        if (!TextUtils.isEmpty(decrypt)) {
                            stringBuffer.append(decrypt);
                            stringBuffer.append("$$");
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    stringBuffer.append(str2);
                    stringBuffer.append("$$");
                }
            }
        }
        return stringBuffer.toString();
    }

    public final void a() {
        File[] fileArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (FileUtil.getFolderSize(this.b) >= MdapLogUploadManager.f3941a) {
            try {
                fileArr = this.b.listFiles();
            } catch (Throwable unused) {
                fileArr = null;
            }
            if (fileArr != null && fileArr.length >= 4) {
                Arrays.sort(fileArr, MdapLogUploadManager.c);
                int length = fileArr.length / 4;
                for (int i = 0; i < length; i++) {
                    File file = fileArr[i];
                    if (file != null && file.exists() && file.isFile()) {
                        try {
                            file.delete();
                            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                            String str = f3986a;
                            traceLogger.error(str, "cleanExpiresFile: " + file.getName() + " is too large or too old, total: " + fileArr.length);
                        } catch (Throwable th) {
                            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                            String str2 = f3986a;
                            traceLogger2.warn(str2, file.getName() + " cleanExpiresFile", th);
                        }
                    }
                }
            }
        }
    }

    public static void c(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
        } else if (!LogCategory.CATEGORY_LOGMONITOR.equals(str)) {
            Behavor behavor = new Behavor();
            behavor.setBehaviourPro(LogCategory.CATEGORY_LOGMONITOR);
            behavor.setSeedID("LogUpload");
            behavor.setParam1(str);
            behavor.setParam2(str2);
            behavor.setParam3(str3);
            behavor.addExtParam("errorMsg", str4);
            behavor.addExtParam("zipLength", str5);
            behavor.setLoggerLevel(3);
            LoggerFactory.getBehavorLogger().event(null, behavor);
        }
    }

    public final Pair<Long, Long> a(File file, String str, String str2, String str3) {
        LogStrategyInfo logStrategyInfo;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("30441187", new Object[]{this, file, str, str2, str3});
        }
        if (file != null) {
            try {
                String readFile = FileUtil.readFile(file);
                if (!TextUtils.isEmpty(readFile)) {
                    String d = d(readFile);
                    if (!TextUtils.isEmpty(d)) {
                        String logHost = LoggerFactory.getLogContext().getLogHost();
                        if (!TextUtils.isEmpty(logHost)) {
                            if (LoggingUtil.isOfflineMode()) {
                                Context context = this.c;
                                try {
                                    context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.alipay.mobile.logmonitor.ClientMonitorExtReceiver"), 1, 1);
                                } catch (Throwable th) {
                                    LoggerFactory.getTraceLogger().error(f3986a, "setComponentEnabled: ".concat(String.valueOf(th)));
                                }
                                Intent intent = new Intent(this.c.getPackageName() + ".monitor.action.UPLOAD_MDAP_LOG");
                                intent.setPackage(this.c.getPackageName());
                                intent.putExtra("file", file.getName());
                                try {
                                    this.c.sendBroadcast(intent);
                                } catch (Throwable unused) {
                                }
                            }
                            byte[] gzipDataByString = LoggingUtil.gzipDataByString(d);
                            MdapTrafficController.a(this.c, str, gzipDataByString.length);
                            HashMap hashMap = new HashMap();
                            hashMap.put("Content-type", "text/xml");
                            hashMap.put(HttpConstant.CONTENT_ENCODING, "gzip");
                            hashMap.put("ProcessName", LoggerFactory.getProcessInfo().getProcessAlias());
                            hashMap.put("bizCode", str);
                            hashMap.put("userId", LoggerFactory.getLogContext().getUserId());
                            hashMap.put(upx.PRODUCT_ID, LoggerFactory.getLogContext().getProductId());
                            hashMap.put("event", str3);
                            hashMap.put(LoggingSPCache.STORAGE_PRODUCTVERSION, LoggerFactory.getLogContext().getProductVersion());
                            hashMap.put("utdId", LoggerFactory.getLogContext().getDeviceId());
                            if (!(str == null || (logStrategyInfo = LogStrategyManager.getInstance().getLogStrategyInfo(str)) == null)) {
                                z = logStrategyInfo.isUsemetds();
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                LoggerFactory.getTraceLogger().info(f3986a, "uploadUrl = " + str2 + " logCategory = " + str);
                            } else if (!z) {
                                str2 = logHost + "/loggw/logUpload.do";
                            } else {
                                str2 = LoggerFactory.getLogContext().getMetDsLogHost() + "/loggw/logUpload.do";
                            }
                            BaseHttpClient a2 = LoggingHttpClientFactory.a(str, str2, this.c);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            try {
                                if (a2.synchronousRequestByPOST(gzipDataByString, hashMap) != null) {
                                    int responseCode = a2.getResponseCode();
                                    String responseContent = a2.getResponseContent();
                                    long requestLength = a2.getRequestLength();
                                    long responseLength = a2.getResponseLength();
                                    a2.closeStreamForNextExecute();
                                    if (responseCode == 200) {
                                        try {
                                            int i = new JSONObject(responseContent).getInt("code");
                                            if (i == 200) {
                                                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                if (elapsedRealtime2 > 0) {
                                                    b(str, String.valueOf(gzipDataByString.length), elapsedRealtime2);
                                                }
                                                try {
                                                    file.delete();
                                                    if (LoggingUtil.isDebuggable(this.c) && !TextUtils.isEmpty(responseContent)) {
                                                        try {
                                                            int indexOf = responseContent.indexOf("logSwitch=");
                                                            if (indexOf > 0) {
                                                                responseContent.substring(indexOf + 10);
                                                            }
                                                        } catch (Throwable th2) {
                                                            LoggerFactory.getTraceLogger().warn(f3986a, th2);
                                                        }
                                                    }
                                                    return Pair.create(Long.valueOf(requestLength), Long.valueOf(responseLength));
                                                } catch (Throwable th3) {
                                                    throw new IllegalStateException("delete file error: ".concat(String.valueOf(th3)), th3);
                                                }
                                            } else {
                                                c(str, String.valueOf(responseCode), String.valueOf(i), "mdap response code error", String.valueOf(gzipDataByString.length));
                                                throw new IllegalStateException("responseContent code is ".concat(String.valueOf(i)));
                                            }
                                        } catch (JSONException unused2) {
                                            c(str, String.valueOf(responseCode), "unknown", "get responseContent code error,JSONException", String.valueOf(gzipDataByString.length));
                                            throw new IllegalStateException("get responseContent code error,JSONException");
                                        }
                                    } else {
                                        c(str, String.valueOf(responseCode), "unknown", "http response code error", String.valueOf(gzipDataByString.length));
                                        throw new IllegalStateException("response code is ".concat(String.valueOf(responseCode)));
                                    }
                                } else {
                                    a2.closeStreamForNextExecute();
                                    throw new IllegalStateException("http response is NULL");
                                }
                            } catch (Throwable th4) {
                                throw new IllegalStateException("POST request error: ".concat(String.valueOf(th4)), th4);
                            }
                        } else {
                            throw new IllegalStateException("log host is empty");
                        }
                    } else {
                        throw new IllegalStateException("decode file content is empty");
                    }
                } else {
                    file.delete();
                    throw new IllegalStateException("file content is empty");
                }
            } catch (Throwable th5) {
                throw new IllegalStateException("read file error: ".concat(String.valueOf(th5)), th5);
            }
        } else {
            throw new IllegalStateException("file object is NULL");
        }
    }

    public final Pair<Long, Long> a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c362a2da", new Object[]{this, str, str2, str3, str4});
        }
        if (!TextUtils.isEmpty(str)) {
            String d = d(str);
            if (!TextUtils.isEmpty(d)) {
                String logHost = LoggerFactory.getLogContext().getLogHost();
                if (!TextUtils.isEmpty(logHost)) {
                    byte[] gzipDataByString = LoggingUtil.gzipDataByString(d);
                    MdapTrafficController.a(this.c, str2, gzipDataByString.length);
                    HashMap hashMap = new HashMap();
                    hashMap.put("Content-type", "text/xml");
                    hashMap.put("ProcessName", LoggerFactory.getProcessInfo().getProcessAlias());
                    hashMap.put("bizCode", str2);
                    hashMap.put("userId", LoggerFactory.getLogContext().getUserId());
                    hashMap.put(upx.PRODUCT_ID, LoggerFactory.getLogContext().getProductId());
                    hashMap.put("event", str4);
                    hashMap.put(LoggingSPCache.STORAGE_PRODUCTVERSION, LoggerFactory.getLogContext().getProductVersion());
                    hashMap.put("utdId", LoggerFactory.getLogContext().getDeviceId());
                    if (!TextUtils.isEmpty(str3)) {
                        LoggerFactory.getTraceLogger().info(f3986a, "uploadUrl = " + str3 + " logCategory = " + str2);
                    } else {
                        str3 = logHost + "/loggw/logUpload.do";
                    }
                    BaseHttpClient a2 = LoggingHttpClientFactory.a(str2, str3, this.c);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        if (a2.synchronousRequestByPOST(gzipDataByString, hashMap) != null) {
                            int responseCode = a2.getResponseCode();
                            String responseContent = a2.getResponseContent();
                            long requestLength = a2.getRequestLength();
                            long responseLength = a2.getResponseLength();
                            a2.closeStreamForNextExecute();
                            if (responseCode == 200) {
                                try {
                                    int i = new JSONObject(responseContent).getInt("code");
                                    if (i == 200) {
                                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        if (elapsedRealtime2 > 0) {
                                            b(str2, String.valueOf(gzipDataByString.length), elapsedRealtime2);
                                        }
                                        return Pair.create(Long.valueOf(requestLength), Long.valueOf(responseLength));
                                    }
                                    c(str2, String.valueOf(responseCode), String.valueOf(i), "mdap response code error", String.valueOf(gzipDataByString.length));
                                    throw new IllegalStateException("responseContent code is ".concat(String.valueOf(i)));
                                } catch (JSONException unused) {
                                    c(str2, String.valueOf(responseCode), "unknown", "get responseContent code error,JSONException", String.valueOf(gzipDataByString.length));
                                    throw new IllegalStateException("get responseContent code error,JSONException");
                                }
                            } else {
                                c(str2, String.valueOf(responseCode), "unknown", "http response code error", String.valueOf(gzipDataByString.length));
                                throw new IllegalStateException("response code is ".concat(String.valueOf(responseCode)));
                            }
                        } else {
                            a2.closeStreamForNextExecute();
                            throw new IllegalStateException("http response is NULL");
                        }
                    } catch (Throwable th) {
                        throw new IllegalStateException("POST request error: ".concat(String.valueOf(th)), th);
                    }
                } else {
                    throw new IllegalStateException("log host is empty");
                }
            } else {
                throw new IllegalStateException("decode file content is empty");
            }
        } else {
            throw new IllegalStateException("logContent is empty");
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("_");
        if (split.length < 3) {
            return null;
        }
        return split[2];
    }
}
