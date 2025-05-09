package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TransportEnvUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f4158a;

    public static final Context getContext() {
        Context context;
        Context context2 = f4158a;
        if (context2 != null) {
            return context2;
        }
        try {
            context = (Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            f4158a = context;
        } catch (Throwable th) {
            LogCatUtil.error("TransportEnvUtil", "context from ActivityThread exception", th);
        }
        if (context != null) {
            return context;
        }
        LogCatUtil.warn("TransportEnvUtil", "context from ActivityThread is null");
        try {
            Context context3 = (Context) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
            f4158a = context3;
            return context3;
        } catch (Throwable th2) {
            LogCatUtil.error("TransportEnvUtil", "[getContext] getInitialApplication failed, context is null. Exception: " + th2.toString());
            try {
                Context context4 = (Context) Class.forName("com.alipay.mobile.quinox.LauncherApplication").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                f4158a = context4;
                if (context4 == null) {
                    LogCatUtil.warn("TransportEnvUtil", "context from LauncherApplication is null");
                }
            } catch (Throwable th3) {
                LogCatUtil.error("TransportEnvUtil", "context from LauncherApplication exception", th3);
            }
            return f4158a;
        }
    }

    public static final boolean isRunningJunitEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("883c93ff", new Object[0])).booleanValue();
        }
        return TextUtils.equals(System.getProperty("OS_ENV"), "OS_ENV_JUNIT");
    }

    public static final boolean isRunningWalletEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94f7098a", new Object[0])).booleanValue();
        }
        String property = System.getProperty("OS_ENV");
        if (TextUtils.isEmpty(property)) {
            return true;
        }
        return TextUtils.equals(property, "OS_ENV_WALLET");
    }

    public static final void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else {
            f4158a = context;
        }
    }
}
