package com.taobao.android.tcrash.utils;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ehh;
import tb.m4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StackUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "StackUtils";
    public static boolean degrade = true;

    public static StackTraceElement[] getStackTrace(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement[]) ipChange.ipc$dispatch("4745236c", new Object[]{thread});
        }
        if (!Thread.currentThread().getName().startsWith("jsi-worker-jsap") && !Build.MODEL.equalsIgnoreCase("PDBM00")) {
            return thread.getStackTrace();
        }
        dumpCrashInfo(thread);
        return new StackTraceElement[]{new StackTraceElement("com.taobao.android.tcrash.utils.StackUtils", "getStackTrace", TAG, -1)};
    }

    private static void dumpCrashInfo(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f1d899", new Object[]{thread});
            return;
        }
        ehh.b(TAG, "jsi-thread-name", thread.getName());
        m4s.b(TAG, "jsi-thread-name", thread.getName());
    }
}
