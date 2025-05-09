package com.taobao.message.uikit.util;

import android.app.Application;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ApplicationUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Application sApp = null;
    private static Boolean DEBUG = null;
    private static int sEnvType = -1;
    private static String sUTDID = null;
    private static String sAppKey = null;
    private static String sTTID = null;

    static {
        t2o.a(529531092);
    }

    public static String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[0]);
        }
        return sAppKey;
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        if (sApp == null) {
            sApp = getSystemApp();
        }
        return sApp;
    }

    public static int getEnvType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2a2dd8b", new Object[0])).intValue();
        }
        return sEnvType;
    }

    public static String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        return sTTID;
    }

    public static String getUTDID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b9b56f", new Object[0]);
        }
        return sUTDID;
    }

    public static boolean isDebug() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        if (DEBUG == null) {
            try {
                if ((getApplication().getApplicationInfo().flags & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                DEBUG = Boolean.valueOf(z);
            } catch (Exception unused) {
            }
        }
        Boolean bool = DEBUG;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{str});
        } else {
            sAppKey = str;
        }
    }

    public static void setApplication(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bac3b6a", new Object[]{application});
        } else if (application != null) {
            sApp = application;
        }
    }

    public static void setDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{new Boolean(z)});
        } else {
            DEBUG = Boolean.valueOf(z);
        }
    }

    public static void setEnvType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8024377", new Object[]{new Integer(i)});
        } else {
            sEnvType = i;
        }
    }

    public static void setTTID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb95dce", new Object[]{str});
        } else {
            sTTID = str;
        }
    }

    public static void setUTDID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1558e4f", new Object[]{str});
        } else {
            sUTDID = str;
        }
    }

    private static Application getSystemApp() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
