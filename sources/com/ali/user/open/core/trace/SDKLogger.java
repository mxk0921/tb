package com.ali.user.open.core.trace;

import android.content.Context;
import android.util.Log;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.context.KernelContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SDKLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG_PREFIX = "AliMemberSDK_";
    private static boolean isTlogValid;

    static {
        t2o.a(71303232);
        isTlogValid = false;
        try {
            IpChange ipChange = AdapterForTLog.$ipChange;
            isTlogValid = true;
        } catch (ClassNotFoundException unused) {
            isTlogValid = false;
        }
    }

    private static String appendCurrentTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1be060d", new Object[0]);
        }
        return "\ntime =" + getDateStringByMill();
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        try {
            if (isDebugEnabled()) {
                if (isTlogValid) {
                    TLogAdapter.d(TAG_PREFIX + str, str2 + appendCurrentTime());
                } else {
                    new StringBuilder(TAG_PREFIX).append(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(appendCurrentTime());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        try {
            if (isTlogValid) {
                TLogAdapter.e(TAG_PREFIX + str, str2 + appendCurrentTime(), th);
            } else {
                Log.e(TAG_PREFIX + str, str2 + appendCurrentTime(), th);
            }
        } catch (Throwable unused) {
        }
    }

    private static String getDateStringByMill() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b848c931", new Object[0]);
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date(System.currentTimeMillis()));
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        try {
            if (isDebugEnabled()) {
                if (isTlogValid) {
                    TLogAdapter.i(TAG_PREFIX + str, str2 + appendCurrentTime());
                } else {
                    new StringBuilder(TAG_PREFIX).append(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(appendCurrentTime());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean isApkDebugable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27e7594a", new Object[]{context})).booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isDebugEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da1c3443", new Object[0])).booleanValue();
        }
        if (ConfigManager.DEBUG || isApkDebugable(KernelContext.getApplicationContext())) {
            return true;
        }
        return false;
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        try {
            if (isDebugEnabled()) {
                if (isTlogValid) {
                    TLogAdapter.w(TAG_PREFIX + str, str2 + appendCurrentTime());
                } else {
                    new StringBuilder(TAG_PREFIX).append(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(appendCurrentTime());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        try {
            if (isTlogValid) {
                TLogAdapter.e(TAG_PREFIX + str, str2 + appendCurrentTime());
            } else {
                Log.e(TAG_PREFIX + str, str2 + appendCurrentTime());
            }
        } catch (Throwable unused) {
        }
    }
}
