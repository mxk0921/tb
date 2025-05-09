package com.alipay.mobile.common.logging.util.config;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GrayScaleUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f4000a;
    public static JSONObject b;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        JSONObject b2 = b();
        if (b2 == null) {
            return "";
        }
        return b2.optString(str);
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("69129956", new Object[0]);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (b != null && currentTimeMillis - f4000a < TimeUnit.MINUTES.toMillis(3L)) {
            return b;
        }
        f4000a = currentTimeMillis;
        String string = LoggerFactory.getLogContext().getApplicationContext().getSharedPreferences("LOG_SWITCH_MDAP_CORE", 4).getString(LogContext.LOG_SWITCH_MDAP_CORE, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            b = new JSONObject(string);
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info("GrayScaleUtils", "getMdapCoreSwitchJson,jsonObj= " + b.toString());
        } catch (Throwable th) {
            b = null;
            if (LoggingUtil.isDebuggable(LoggerFactory.getLogContext().getApplicationContext())) {
                th.toString();
            }
        }
        return b;
    }

    public static boolean getGrayScaleSwitch(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdbc5442", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        String a2 = a(str);
        if (!TextUtils.isEmpty(a2)) {
            return grayscaleUtdid(LoggerFactory.getLogContext().getDeviceId(), a2);
        }
        return z;
    }

    public static int getIntSwitch(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d72c2698", new Object[]{str, new Integer(i)})).intValue();
        }
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return i;
        }
        return Integer.valueOf(a2).intValue();
    }

    public static String getStringSwitch(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b69c572a", new Object[]{str, str2});
        }
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return str2;
        }
        return a2;
    }

    public static final boolean grayscaleUtdid(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73978218", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.equals(str2, "0") && !TextUtils.equals(str2, "-1")) {
            try {
                String[] split = str2.split(",");
                int length = split.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = Integer.parseInt(split[i]);
                }
                return grayscaleUtdid(str, iArr);
            } catch (Throwable unused) {
                LoggerFactory.getTraceLogger().error("GrayScaleUtils", "grayscaleUtdid exception");
            }
        }
        return false;
    }

    public static final boolean grayscaleUtdid(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8da6bb5c", new Object[]{str, iArr})).booleanValue();
        }
        if (str == null || str.length() < 2 || iArr == null || iArr.length == 0 || iArr[iArr.length - 1] == 0) {
            return false;
        }
        int length = iArr.length;
        if (iArr.length > str.length()) {
            length = str.length();
        }
        int i = 0;
        int i2 = 1;
        while (i < length) {
            if ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+/".indexOf(str.charAt(str.length() - i2)) > iArr[length - i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }
}
