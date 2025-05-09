package com.alipay.mobile.verifyidentity.alipay.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.mobile.verifyidentity.log.LoggerFactory;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class H5Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("75941360", new Object[0]);
        }
        try {
            Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.engine.MicroModuleContext", "getInstance", new Class[0], new Object[0]);
            if (invokeStaticMethod != null) {
                return (Context) ReflectUtils.invokeMethod(invokeStaticMethod, "getContext", new Class[0], new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("H5Utils", th);
            return null;
        }
    }

    public static boolean b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, intent})).booleanValue();
        }
        ResolveInfo resolveInfo = null;
        if (context != null) {
            try {
                resolveInfo = context.getPackageManager().resolveActivity(intent, 0);
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().warn("H5Utils", th);
            }
        }
        if (resolveInfo != null) {
            return true;
        }
        return false;
    }

    public static void startH5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318c6220", new Object[]{str});
        } else {
            startH5(a(), str);
        }
    }

    public static void startH5(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6d07fc", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.alipay.android.msp.ui.views.MspWebActivity");
        if (b(context, intent)) {
            intent.putExtra("url", str);
            intent.putExtra("title", "");
            intent.putExtra("type", MspEventTypes.ACTION_STRING_OPENWEB);
            try {
                Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.engine.MicroModuleContext", "getInstance", new Class[0], new Object[0]);
                if (invokeStaticMethod != null) {
                    ReflectUtils.invokeMethod(invokeStaticMethod, "startActivityByContext", new Class[]{Intent.class}, new Object[]{intent});
                }
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("H5Utils", th);
            }
        } else {
            LoggerFactory.getTraceLogger().info("H5Utils", "收银台H5承载页不可用");
        }
    }
}
