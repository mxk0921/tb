package com.alibaba.security.ccrc.common.log;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Logging {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String TAG = "CcrcService";
    public static boolean enable = true;

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (enable) {
            StringBuilder sb = new StringBuilder();
            sb.append(TAG);
            sb.append("#");
            sb.append(str);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else if (enable) {
            Log.e(TAG + "#" + str, str2, th);
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else if (enable) {
            StringBuilder sb = new StringBuilder();
            sb.append(TAG);
            sb.append("#");
            sb.append(str);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else if (enable) {
            Log.e(TAG + "#" + str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
        } else if (enable) {
            StringBuilder sb = new StringBuilder();
            sb.append(TAG);
            sb.append("#");
            sb.append(str);
        }
    }
}
