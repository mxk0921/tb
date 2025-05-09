package com.alipay.mobile.common.logging;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.appender.AppenderManager;
import com.alipay.mobile.common.logging.appender.ApplogFileAppender;
import com.alipay.mobile.common.logging.event.ClientEventHelper;
import com.alipay.mobile.common.logging.impl.BehavorloggerImpl;
import com.alipay.mobile.common.logging.impl.EventLoggerImpl;
import com.alipay.mobile.common.logging.impl.MonitorLoggerImpl;
import com.alipay.mobile.common.logging.impl.TraceLoggerImpl;
import com.alipay.mobile.common.logging.util.DeviceUtil;
import com.alipay.mobile.common.logging.util.HybridEncryption;
import com.alipay.mobile.common.logging.util.LoggingAsyncTaskExecutor;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.ReflectUtil;
import com.alipay.mobile.common.logging.util.perf.Judge;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmMonitorBinder;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import tb.pg1;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LoggerFactoryBinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f3938a;

    public static native int nativeFree();

    public static native int nativeInit();

    public static synchronized void bind(Context context) {
        synchronized (LoggerFactoryBinder.class) {
            try {
                if (!f3938a) {
                    f3938a = true;
                    final Context applicationContext = context != null ? context.getApplicationContext() : context;
                    ProcessInfoImpl processInfoImpl = new ProcessInfoImpl(applicationContext);
                    LoggerFactory.attachProcessInfo(processInfoImpl);
                    LoggerFactory.bindImpls(new DevicePropertyImpl(applicationContext));
                    LoggingSPCache.createInstance(applicationContext);
                    CrashBridge.a();
                    HybridEncryption.createInstance(applicationContext);
                    final LogContextImpl logContextImpl = new LogContextImpl(applicationContext);
                    LoggerFactory.attachLogContext(logContextImpl);
                    AppenderManager appenderManager = logContextImpl.f3936a;
                    if (!appenderManager.c) {
                        appenderManager.c = true;
                        if (LoggingUtil.isOfflineForExternalFile()) {
                            appenderManager.f3959a.put(LogCategory.CATEGORY_APPLOG, new ApplogFileAppender(appenderManager.b, TimeUnit.HOURS.toMillis(1L), TimeUnit.DAYS.toMillis(7L), 1073741824L, 32768));
                        }
                    }
                    try {
                        Method declaredMethod = SpmMonitorBinder.class.getDeclaredMethod(pg1.ATOM_EXT_bind, Context.class);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(null, applicationContext);
                    } catch (Throwable unused) {
                    }
                    TraceLoggerImpl traceLoggerImpl = new TraceLoggerImpl(logContextImpl);
                    LoggerFactory.bind(traceLoggerImpl, new BehavorloggerImpl(logContextImpl), new MonitorLoggerImpl(logContextImpl), new EventLoggerImpl(logContextImpl));
                    traceLoggerImpl.info(LoggerFactory.TAG, LoggingUtil.concatArray(",", Build.BRAND, Build.MANUFACTURER, Build.DISPLAY, Build.MODEL, Build.VERSION.RELEASE, "uid", Integer.valueOf(processInfoImpl.getUserId()), MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(processInfoImpl.getProcessId()), processInfoImpl.getProcessAlias(), logContextImpl.getReleaseType(), logContextImpl.getProductVersion(), logContextImpl.getUserId(), "patchVer", logContextImpl.getHotpatchVersion(), logContextImpl.getApkUniqueId(), "bundleVer", logContextImpl.getBundleVersion(), "birdNest", logContextImpl.getBirdNestVersion()));
                    CrashBridge.b();
                    String.valueOf(ClientEventHelper.a().f3962a);
                    CrashBridge.d();
                    String brandName = LoggerFactory.getDeviceProperty().getBrandName();
                    if (!TextUtils.isEmpty(brandName)) {
                        LoggerFactory.getLogContext().putBizExternParams("brand", brandName);
                    }
                    String romVersion = LoggerFactory.getDeviceProperty().getRomVersion();
                    if (!TextUtils.isEmpty(romVersion)) {
                        LoggerFactory.getLogContext().putBizExternParams("romVersion", romVersion);
                    }
                    Judge.getInstance(applicationContext);
                    if (processInfoImpl.isPushProcess()) {
                        Judge.getInstance(applicationContext).judgeForNoneUIProcess();
                    }
                    if (processInfoImpl.isMainProcess() || processInfoImpl.isLiteProcess()) {
                        try {
                            if (applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 128).applicationInfo.metaData.getBoolean("perf_test")) {
                                ReflectUtil.invokeMethod("com.alipay.loginterceptor.LogInterceptManager", "init", new Class[]{Context.class}, null, new Object[]{applicationContext});
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    if (processInfoImpl.isMainProcess()) {
                        LoggingAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.logging.LoggerFactoryBinder.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public final void run() {
                                IpChange ipChange = $ipChange;
                                if (ipChange instanceof IpChange) {
                                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    LogContextImpl.this.refreshSessionId();
                                }
                            }
                        });
                    }
                    new Thread(new Runnable() { // from class: com.alipay.mobile.common.logging.LoggerFactoryBinder.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LoggerFactory.getLogContext().notifyClientEvent(LogContext.CLIENT_ENVENT_CLIENTLAUNCH, null);
                            if (TextUtils.isEmpty(LoggerFactory.getLogContext().getDeviceId())) {
                                LoggerFactory.getLogContext().setDeviceId(DeviceUtil.getUtdid(applicationContext));
                            }
                        }
                    }, "LoggerFactoryBinder-notifyLaunch").start();
                    if (LoggingUtil.isDebuggable(applicationContext)) {
                        try {
                            Class<?> cls = Class.forName("com.alipay.stamper.Stamper");
                            cls.getMethod("launch", Context.class).invoke(cls.getField("INSTANCE").get(null), applicationContext);
                        } catch (Exception unused3) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
