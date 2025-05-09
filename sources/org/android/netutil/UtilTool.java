package org.android.netutil;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.spdy.spduLog;
import tb.pg8;
import tb.ru1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UtilTool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HARMONY_OS = "harmony";
    public static final String TAG = "tnetsdk.UtilTool";
    private static String harmonyVersion = null;
    private static boolean initContext = false;
    private static int isHarmonyOs = -1;
    private static AtomicBoolean isValidEnv;
    private static Context mContext;

    public static boolean checkHostValidAndNotIp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9abe2c44", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0 || charArray.length > 255) {
            return false;
        }
        boolean z = false;
        for (char c : charArray) {
            if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || c == '*')) {
                z = true;
            } else if (!((c >= '0' && c <= '9') || c == '.' || c == '-')) {
                return false;
            }
        }
        return z;
    }

    public static boolean isHarmonyOS() {
        boolean z;
        if (isHarmonyOs == -1) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                z = HARMONY_OS.equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
            } catch (Exception unused) {
                z = false;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            isHarmonyOs = i;
        }
        return isHarmonyOs == 1;
    }

    public static String getProcessName() {
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD, false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Context getDefaultAppContext() {
        if (initContext) {
            return mContext;
        }
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
            mContext = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Throwable th) {
            spduLog.Tloge(TAG, null, "invoke currentApplication failed:", th);
            try {
                Class<?> cls2 = Class.forName("android.app.AppGlobals");
                mContext = (Context) cls2.getMethod("getInitialApplication", new Class[0]).invoke(cls2, new Object[0]);
            } catch (Throwable th2) {
                spduLog.Tloge(TAG, null, "invoke getInitialApplication failed:", th2);
            }
        }
        initContext = true;
        return mContext;
    }

    public static String getHarmonyVersion() {
        String str;
        String str2 = harmonyVersion;
        if (str2 != null) {
            return str2;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "hw_sc.build.platform.version");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        harmonyVersion = str;
        return str;
    }

    public static boolean isValidPathEnv(Context context) {
        if (isValidEnv == null) {
            isValidEnv = new AtomicBoolean(false);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                boolean booleanValue = ((Boolean) pg8.class.getDeclaredMethod("checkValidInstrumentation", Context.class).invoke(pg8.class, context)).booleanValue();
                isValidEnv.set(booleanValue);
                spduLog.Tloge(TAG, null, "isValidPathEnv=" + booleanValue, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                spduLog.Tloge(TAG, null, "[isValidPathEnv]", th);
            }
        }
        return isValidEnv.get();
    }

    public static Boolean isABGlobalFeatureOpened(Context context, String str) {
        try {
            Boolean bool = (Boolean) ABGlobal.class.getDeclaredMethod("isFeatureOpened", Context.class, String.class).invoke(ABGlobal.class, context, str);
            bool.booleanValue();
            spduLog.Tloge(TAG, null, "[isABGlobalFeatureOpened]", ru1.FEATURE_NAME, str, "status", bool);
            return bool;
        } catch (Throwable th) {
            spduLog.Tloge(TAG, null, "[isABGlobalFeatureOpened]", th);
            return null;
        }
    }
}
