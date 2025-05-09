package com.taobao.login4android.log;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.SessionManager;
import com.taobao.tao.log.TLog;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginTLogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG_PREFIX = "LoginSDK_";
    private static boolean isTlogValid;

    static {
        t2o.a(516947981);
        try {
            IpChange ipChange = TLog.$ipChange;
            isTlogValid = true;
        } catch (ClassNotFoundException unused) {
            isTlogValid = false;
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else if (isTlogValid) {
            AdapterForTLog.loge(TAG_PREFIX + str, str2, th);
        } else {
            Log.e(TAG_PREFIX + str, str2, th);
        }
    }

    public static void trace(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c5ca60", new Object[]{str, str2});
            return;
        }
        if (isTlogValid) {
            AdapterForTLog.loge(TAG_PREFIX + str, str2);
        }
        Log.e(str, str2);
    }

    public static void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
        } else if (isTlogValid) {
            AdapterForTLog.logw(TAG_PREFIX + str, str2, th);
        } else {
            new StringBuilder(TAG_PREFIX).append(str);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (!isTlogValid) {
            Log.e(TAG_PREFIX + str, str2);
        } else if (SessionManager.GET_TAG.equals(str)) {
            AdapterForTLog.loge(str, str2);
        } else {
            AdapterForTLog.loge(TAG_PREFIX + str, str2);
        }
    }

    public static void trace(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e53a6595", new Object[]{str, str2, th});
            return;
        }
        if (isTlogValid) {
            AdapterForTLog.loge(TAG_PREFIX + str, str2 + " dump:", th);
        }
        Log.e(str, str2, th);
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else if (isTlogValid) {
            AdapterForTLog.logw(TAG_PREFIX + str, str2);
        } else {
            new StringBuilder(TAG_PREFIX).append(str);
        }
    }

    public static void w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be68a92d", new Object[]{str, th});
        } else {
            w(str, "", th);
        }
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
        } else {
            e(str, "", th);
        }
    }
}
