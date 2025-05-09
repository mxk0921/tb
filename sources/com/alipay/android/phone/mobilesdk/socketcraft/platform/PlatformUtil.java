package com.alipay.android.phone.mobilesdk.socketcraft.platform;

import com.alipay.android.phone.mobilesdk.socketcraft.integrated.logcat.AndroidSCLogCatImpl;
import com.alipay.android.phone.mobilesdk.socketcraft.integrated.logcat.MPaaSSCLogCatImpl;
import com.alipay.android.phone.mobilesdk.socketcraft.integrated.monitor.MPaaSMonitorPrinter;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.JavaSCLogCatImpl;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.MonitorPrinter;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PlatformUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f3759a = Logger.getLogger(PlatformUtil.class.getName());
    public static Class b = null;

    static {
        Logger.getLogger("com.alipay.android.phone.mobilesdk.socketcraft").setLevel(Level.ALL);
    }

    public static final SCLogCatInterface createAndroidLogImpl() {
        try {
            f3759a.info("enter SCLogCatInterface");
            return (SCLogCatInterface) AndroidSCLogCatImpl.class.newInstance();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static final SCLogCatInterface createAndroidMPaaSLogImpl() {
        try {
            f3759a.info("enter createAndroidMPaaSLogImpl");
            return (SCLogCatInterface) MPaaSSCLogCatImpl.class.newInstance();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static final SCLogCatInterface createJavaLogImpl() {
        try {
            f3759a.info("enter createJavaLogImpl");
            return (SCLogCatInterface) JavaSCLogCatImpl.class.newInstance();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static final MonitorPrinter createMPaaSMonitorPrinter() {
        try {
            f3759a.info("enter createMPaaSMonitorPrinter");
            return (MonitorPrinter) MPaaSMonitorPrinter.class.newInstance();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static final boolean isAndroidMPaaSPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86431809", new Object[0])).booleanValue();
        }
        if (!isAndroidPlatform()) {
            return false;
        }
        if (b != null) {
            return true;
        }
        f3759a.info("enter isAndroidMPaaSPlatform");
        try {
            b = LogCatUtil.class;
            return true;
        } catch (Throwable th) {
            f3759a.log(Level.SEVERE, "isAndroidMPaaSPlatform err", th);
            return false;
        }
    }

    public static final boolean isAndroidPlatform() {
        Logger logger = f3759a;
        logger.info("enter isAndroidPlatform");
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            return ((Integer) cls.getField("SDK_INT").get(cls)).intValue() > 0;
        } catch (Throwable th) {
            Level level = Level.INFO;
            String message = th.getMessage();
            logger.log(level, "isAndroidPlatform err: " + message);
            return false;
        }
    }
}
