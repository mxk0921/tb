package com.alipay.mobile.common.logging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.android.phone.wallet.spmtracker.ISpmMonitor;
import com.alipay.mobile.common.logging.api.LogAppenderistener;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogCustomerControl;
import com.alipay.mobile.common.logging.api.LogDAUTracker;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.alipay.mobile.common.logging.api.UncaughtExceptionCallback;
import com.alipay.mobile.common.logging.api.abtest.AbtestInfoGetter;
import com.alipay.mobile.common.logging.api.behavor.BehavorLogListener;
import com.alipay.mobile.common.logging.api.encrypt.LogEncryptClient;
import com.alipay.mobile.common.logging.api.interceptor.ToolsUploadInterceptor;
import com.alipay.mobile.common.logging.api.interceptor.TraceLoggerInterceptor;
import com.alipay.mobile.common.logging.api.network.NetworkInfoGetter;
import com.alipay.mobile.common.logging.api.rpc.RpcClient;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.appender.AppenderManager;
import com.alipay.mobile.common.logging.event.ClientEvent;
import com.alipay.mobile.common.logging.event.ClientEventHelper;
import com.alipay.mobile.common.logging.event.ClientEventManager;
import com.alipay.mobile.common.logging.helper.DevicePerformanceScoreHelper;
import com.alipay.mobile.common.logging.helper.YearClass;
import com.alipay.mobile.common.logging.strategy.LogStrategyInfo;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.LoggingAsyncTaskExecutor;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.LowEndDeviceUtil;
import com.alipay.mobile.common.logging.util.ToolThreadUtils;
import com.alipay.mobile.common.logging.util.network.NetWorkProvider;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogContextImpl implements LogContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TraceLoggerInterceptor B;
    public ToolsUploadInterceptor C;

    /* renamed from: a  reason: collision with root package name */
    public AppenderManager f3936a;
    public final Context e;
    public String f;
    public final Queue<LogEvent> o;
    public final ContextInfo p;
    public volatile AppendWorker q;
    public final MdapLogUploadManager r;
    public AbtestInfoGetter s;
    public final ClientEventManager t;
    public BehavorLogListener u;
    public ISpmMonitor v;
    public LogDAUTracker z;
    public LogAppenderistener c = null;
    public LogCustomerControl d = null;
    public String g = null;
    public String h = null;
    public String i = null;
    public String j = null;
    public final ThreadLocal<Integer> k = new ThreadLocal<>();
    public final Map<String, String> l = new ConcurrentHashMap();
    public final Map<String, String> m = new ConcurrentHashMap();
    public final InheritableThreadLocal<Map<String, String>> n = new InheritableThreadLocal<>();
    public boolean b = true;
    public LogEncryptClient w = null;
    public RpcClient x = null;
    public String y = null;
    public NetworkInfoGetter A = null;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AppendWorker extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AppendWorker() {
        }

        public static /* synthetic */ Object ipc$super(AppendWorker appendWorker, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/LogContextImpl$AppendWorker");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Queue, com.alipay.mobile.common.logging.LogContextImpl$AppendWorker] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.LogContextImpl.AppendWorker.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0012
                java.lang.String r1 = "5c510192"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
                r0.ipc$dispatch(r1, r2)
                return
            L_0x0012:
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                java.lang.Thread r0 = r0.getThread()
                int r0 = r0.getPriority()
                int r0 = r0 + (-2)
                r1 = 5
                if (r0 >= r1) goto L_0x0024
                r0 = 5
            L_0x0024:
                r5.setPriority(r0)
            L_0x0027:
                r0 = 0
                com.alipay.mobile.common.logging.LogContextImpl r1 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0036
                boolean r2 = r1.b     // Catch: all -> 0x0036
                if (r2 == 0) goto L_0x0038
                java.util.Queue r2 = com.alipay.mobile.common.logging.LogContextImpl.a(r1)     // Catch: all -> 0x0036
                r1.a(r2)     // Catch: all -> 0x0036
                goto L_0x0027
            L_0x0036:
                r1 = move-exception
                goto L_0x006c
            L_0x0038:
                r1.a(r0)     // Catch: all -> 0x0060
                com.alipay.mobile.common.logging.LogContextImpl r1 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0060
                java.util.Queue r1 = com.alipay.mobile.common.logging.LogContextImpl.a(r1)     // Catch: all -> 0x0060
                java.util.Iterator r1 = r1.iterator()     // Catch: all -> 0x0060
            L_0x0045:
                boolean r2 = r1.hasNext()     // Catch: all -> 0x0060
                if (r2 == 0) goto L_0x0062
                java.lang.Object r2 = r1.next()     // Catch: all -> 0x0060
                com.alipay.mobile.common.logging.api.LogEvent r2 = (com.alipay.mobile.common.logging.api.LogEvent) r2     // Catch: all -> 0x0060
                com.alipay.mobile.common.logging.LogContextImpl r3 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0060
                r3.syncAppendLogEvent(r2)     // Catch: all -> 0x0060
                com.alipay.mobile.common.logging.LogContextImpl r3 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0060
                java.util.Queue r3 = com.alipay.mobile.common.logging.LogContextImpl.a(r3)     // Catch: all -> 0x0060
                r3.remove(r2)     // Catch: all -> 0x0060
                goto L_0x0045
            L_0x0060:
                r0 = move-exception
                goto L_0x0068
            L_0x0062:
                com.alipay.mobile.common.logging.LogContextImpl r1 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0060
                r1.a(r0)     // Catch: all -> 0x0060
                return
            L_0x0068:
                r0.toString()
                return
            L_0x006c:
                r1.toString()     // Catch: all -> 0x00a5
                com.alipay.mobile.common.logging.LogContextImpl r1 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0099
                r1.a(r0)     // Catch: all -> 0x0099
                com.alipay.mobile.common.logging.LogContextImpl r1 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0099
                java.util.Queue r1 = com.alipay.mobile.common.logging.LogContextImpl.a(r1)     // Catch: all -> 0x0099
                java.util.Iterator r1 = r1.iterator()     // Catch: all -> 0x0099
            L_0x007e:
                boolean r2 = r1.hasNext()     // Catch: all -> 0x0099
                if (r2 == 0) goto L_0x009b
                java.lang.Object r2 = r1.next()     // Catch: all -> 0x0099
                com.alipay.mobile.common.logging.api.LogEvent r2 = (com.alipay.mobile.common.logging.api.LogEvent) r2     // Catch: all -> 0x0099
                com.alipay.mobile.common.logging.LogContextImpl r3 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0099
                r3.syncAppendLogEvent(r2)     // Catch: all -> 0x0099
                com.alipay.mobile.common.logging.LogContextImpl r3 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0099
                java.util.Queue r3 = com.alipay.mobile.common.logging.LogContextImpl.a(r3)     // Catch: all -> 0x0099
                r3.remove(r2)     // Catch: all -> 0x0099
                goto L_0x007e
            L_0x0099:
                r0 = move-exception
                goto L_0x00a1
            L_0x009b:
                com.alipay.mobile.common.logging.LogContextImpl r1 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x0099
                r1.a(r0)     // Catch: all -> 0x0099
                return
            L_0x00a1:
                r0.toString()
                return
            L_0x00a5:
                r1 = move-exception
                com.alipay.mobile.common.logging.LogContextImpl r2 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x00d0
                r2.a(r0)     // Catch: all -> 0x00d0
                com.alipay.mobile.common.logging.LogContextImpl r2 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x00d0
                java.util.Queue r2 = com.alipay.mobile.common.logging.LogContextImpl.a(r2)     // Catch: all -> 0x00d0
                java.util.Iterator r2 = r2.iterator()     // Catch: all -> 0x00d0
            L_0x00b5:
                boolean r3 = r2.hasNext()     // Catch: all -> 0x00d0
                if (r3 == 0) goto L_0x00d2
                java.lang.Object r3 = r2.next()     // Catch: all -> 0x00d0
                com.alipay.mobile.common.logging.api.LogEvent r3 = (com.alipay.mobile.common.logging.api.LogEvent) r3     // Catch: all -> 0x00d0
                com.alipay.mobile.common.logging.LogContextImpl r4 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x00d0
                r4.syncAppendLogEvent(r3)     // Catch: all -> 0x00d0
                com.alipay.mobile.common.logging.LogContextImpl r4 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x00d0
                java.util.Queue r4 = com.alipay.mobile.common.logging.LogContextImpl.a(r4)     // Catch: all -> 0x00d0
                r4.remove(r3)     // Catch: all -> 0x00d0
                goto L_0x00b5
            L_0x00d0:
                r0 = move-exception
                goto L_0x00d8
            L_0x00d2:
                com.alipay.mobile.common.logging.LogContextImpl r2 = com.alipay.mobile.common.logging.LogContextImpl.this     // Catch: all -> 0x00d0
                r2.a(r0)     // Catch: all -> 0x00d0
                goto L_0x00db
            L_0x00d8:
                r0.toString()
            L_0x00db:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.LogContextImpl.AppendWorker.run():void");
        }
    }

    public LogContextImpl(Context context) {
        this.e = context;
        ContextInfo contextInfo = new ContextInfo(context);
        this.p = contextInfo;
        String str = contextInfo.n;
        if (!TextUtils.isEmpty(str)) {
            putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHDESC, str);
        }
        String str2 = contextInfo.o;
        if (!TextUtils.isEmpty(str2)) {
            putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str2);
        }
        LogStrategyManager.createInstance(context, contextInfo);
        NetWorkProvider.createInstance(context);
        ClientEventHelper.a();
        this.f3936a = new AppenderManager(this);
        this.r = MdapLogUploadManager.a(context);
        this.t = ClientEventManager.a();
        this.o = new ArrayBlockingQueue(2048);
    }

    public static /* synthetic */ Queue a(LogContextImpl logContextImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("621308f0", new Object[]{logContextImpl}) : logContextImpl.o;
    }

    public static String b(String str, String str2, boolean z) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91186ac8", new Object[]{str, str2, new Boolean(z)});
        }
        if (z) {
            return str2;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                sb = new StringBuilder();
                sb.append("file path is empty");
            } else {
                File file = new File(str);
                if (file.exists() && file.isFile()) {
                    sb = null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" is not exist");
                sb = sb2;
            }
            if (sb == null) {
                return str2;
            }
            sb.append(", logType: ");
            sb.append(str2);
            sb.append('\n');
            f(sb);
            return sb.toString();
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogContext", th);
            return str2;
        }
    }

    public static void f(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5279f0c3", new Object[]{sb});
            return;
        }
        sb.append("[native crash on main thread but NONE returned, java stack traces are used instead]\n");
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace != null) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append('\t');
                    sb.append(stackTraceElement);
                    sb.append('\n');
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean i(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cdec513", new Object[]{num})).booleanValue();
        }
        if (num == null || num.intValue() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustRequestSpanByNetNotMatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f984c4d5", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().adjustRequestSpanByNetNotMatch();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustRequestSpanByReceived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13baa5e9", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().adjustRequestSpanByNetNotMatch();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustRequestSpanByUploadFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316c9187", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().adjustRequestSpanByUploadFail();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustRequestSpanByZipFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ca92c5", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().adjustRequestSpanByZipFail();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void adjustUploadCoreByCategoryDirectly(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc65e13f", new Object[]{this, str, str2, bundle});
        } else if ("main".equalsIgnoreCase(Thread.currentThread().getName())) {
            e(str, str2, bundle);
        } else {
            j(str, str2, bundle);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void appendLogEvent(LogEvent logEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ae8ba1", new Object[]{this, logEvent});
        } else if (logEvent != null && !logEvent.isIllegal()) {
            if (this.q == null) {
                synchronized (this) {
                    try {
                        if (this.q == null) {
                            AppendWorker appendWorker = new AppendWorker();
                            appendWorker.setDaemon(true);
                            appendWorker.setName("LogAppendWorker");
                            appendWorker.start();
                            a(appendWorker);
                        }
                    } finally {
                    }
                }
            }
            try {
                if (!((ArrayBlockingQueue) this.o).add(logEvent)) {
                    throw new RuntimeException("add log event to queue fail, current size: " + ((ArrayBlockingQueue) this.o).size());
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void backupCurrentFile(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb6f190", new Object[]{this, str, new Boolean(z)});
        } else {
            this.f3936a.a(str, z);
        }
    }

    public final Map<String, String> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap());
        if (map != null) {
            synchronized (map) {
                synchronizedMap.putAll(map);
            }
        }
        this.n.set(synchronizedMap);
        return synchronizedMap;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void commitExtrasToUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff6e945", new Object[]{this});
            return;
        }
        ContextInfo contextInfo = this.p;
        contextInfo.a(contextInfo.f3934a, null, null);
        contextInfo.e();
    }

    public final void e(final String str, final String str2, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b028dd8", new Object[]{this, str, str2, bundle});
        } else {
            LoggingAsyncTaskExecutor.executeHttpUpload(new Runnable() { // from class: com.alipay.mobile.common.logging.LogContextImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ToolThreadUtils.getInstance(LoggerFactory.getLogContext().getApplicationContext()).start(true);
                    LogContextImpl.a(LogContextImpl.this, str, str2, bundle);
                    ToolThreadUtils.getInstance(LoggerFactory.getLogContext().getApplicationContext()).end();
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void flush(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38bc6a9", new Object[]{this, new Boolean(z)});
        } else {
            flush(null, z);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public AbtestInfoGetter getAbtestInfoGetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbtestInfoGetter) ipChange.ipc$dispatch("ffff3fe7", new Object[]{this});
        }
        return this.s;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getApkUniqueId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4da53867", new Object[]{this});
        }
        return this.p.q;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public Context getApplicationContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public BehavorLogListener getBehavorLogListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BehavorLogListener) ipChange.ipc$dispatch("e55c12c9", new Object[]{this});
        }
        return this.u;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getBirdNestVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d8848e8", new Object[]{this});
        }
        return this.p.s;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public Map<String, String> getBizExternParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("77aa5f7f", new Object[]{this});
        }
        return this.m;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getBundleVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af130cb9", new Object[]{this});
        }
        return this.p.r;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getChannelId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
        }
        return this.p.b;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getClientId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b6a8bd", new Object[]{this});
        }
        ContextInfo contextInfo = this.p;
        if (LoggerFactory.getProcessInfo().isExtProcess() && contextInfo.h == null) {
            contextInfo.h = contextInfo.b(LoggingSPCache.STORAGE_CLIENTID, "");
        }
        return contextInfo.h;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getClientStatus(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("901bb2e6", new Object[]{this, new Boolean(z)}) : getClientStatus(false, z, null);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getContextParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4723551b", new Object[]{this, str});
        }
        return (String) ((ConcurrentHashMap) this.l).get(str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getCurrentPageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f4f31ec", new Object[]{this});
        }
        return this.p.j;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        return this.p.b();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public int getDevicePerformanceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ebf4728", new Object[]{this})).intValue();
        }
        try {
            return YearClass.a(this.e);
        } catch (Throwable unused) {
            return Integer.MAX_VALUE;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogContext.DevicePerformanceScore getDevicePerformanceScoreNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogContext.DevicePerformanceScore) ipChange.ipc$dispatch("68ac510e", new Object[]{this});
        }
        try {
            DevicePerformanceScoreHelper a2 = DevicePerformanceScoreHelper.a(this.e);
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info("DevicePerformanceScoreHelper", "performance score: " + a2.f3970a);
            return a2.f3970a;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("LogContext", th);
            return LogContext.DevicePerformanceScore.LOW;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getHotpatchBundleVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bbfa034", new Object[]{this});
        }
        return this.p.o;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getHotpatchDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d52c877", new Object[]{this});
        }
        return this.p.n;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getHotpatchVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b237b52", new Object[]{this});
        }
        return this.p.m;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c65c8aeb", new Object[]{this});
        }
        return this.p.k;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getLocalParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efc1ff57", new Object[]{this, str});
        }
        this.k.set(2);
        Map<String, String> map = this.n.get();
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogAppenderistener getLogAppenderistener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogAppenderistener) ipChange.ipc$dispatch("ac52403b", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogCustomerControl getLogCustomerControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogCustomerControl) ipChange.ipc$dispatch("192197fb", new Object[]{this});
        }
        return this.d;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogDAUTracker getLogDAUTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogDAUTracker) ipChange.ipc$dispatch("3247f6bf", new Object[]{this});
        }
        return this.z;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public LogEncryptClient getLogEncryptClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogEncryptClient) ipChange.ipc$dispatch("7cc8a1f1", new Object[]{this});
        }
        return this.w;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public Map<String, LogStrategyInfo> getLogStrategyInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1afbfde0", new Object[]{this});
        }
        return LogStrategyManager.getInstance().getLogStrategyInfos();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public RpcClient getLogUploadRpcClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcClient) ipChange.ipc$dispatch("d8da3a2a", new Object[]{this});
        }
        return this.x;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getMetDsLogHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f9403e2", new Object[]{this});
        }
        String str = null;
        if (this.j == null) {
            String zhizhiSetting = LoggingUtil.getZhizhiSetting(this.e, "content://com.alipay.setting/MetdsStatisticsServerUrl", null);
            this.j = zhizhiSetting;
            if (zhizhiSetting == null) {
                this.j = "";
            }
        }
        if (LoggingUtil.isDebuggable(this.e) && TextUtils.isEmpty(null)) {
            str = this.j;
        }
        if (TextUtils.isEmpty(str)) {
            if (!l()) {
                str = LogContext.LOG_HOST_HTTPS_RELEASE_METDS_EX;
            } else {
                str = LogContext.LOG_HOST_HTTPS_RELEASE_METDS;
            }
        }
        this.i = str;
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info("LogContext", "getMetDsLogHost: " + this.i);
        return this.i;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public NetworkInfoGetter getNetworkInfoGetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfoGetter) ipChange.ipc$dispatch("c06ef83a", new Object[]{this});
        }
        return this.A;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getPackageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8455468e", new Object[]{this});
        }
        return this.p.p;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getProductId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d388ffc5", new Object[]{this});
        }
        return this.p.e;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getProductVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34f467a", new Object[]{this});
        }
        return this.p.f;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getReleaseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5542a05b", new Object[]{this});
        }
        return this.p.d;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getReleaseType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eda812e", new Object[]{this});
        }
        return this.p.c;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this});
        }
        return this.p.c();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getSourceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24d35a6d", new Object[]{this});
        }
        return this.p.l;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public ISpmMonitor getSpmMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISpmMonitor) ipChange.ipc$dispatch("7ddb5ed4", new Object[]{this});
        }
        return this.v;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getStorageParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8dd55fe7", new Object[]{this, str});
        }
        String localParam = getLocalParam(str);
        if (localParam == null) {
            return getContextParam(str);
        }
        return localParam;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public ToolsUploadInterceptor getToolsUploadInterceptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ToolsUploadInterceptor) ipChange.ipc$dispatch("5eb255d1", new Object[]{this});
        }
        return this.C;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public TraceLoggerInterceptor getTraceLoggerInterceptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TraceLoggerInterceptor) ipChange.ipc$dispatch("d5a9d831", new Object[]{this});
        }
        return this.B;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.p.a();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getUserSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("771475e9", new Object[]{this});
        }
        return this.p.t;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isDisableToolsProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a402bd1d", new Object[]{this})).booleanValue();
        }
        return LogStrategyManager.getInstance().isDisableToolsProcess();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isEnableTrafficLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbf086b6", new Object[]{this})).booleanValue();
        }
        return LogStrategyManager.getInstance().isEnableTrafficLimit();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isLowEndDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2df92972", new Object[]{this})).booleanValue();
        }
        return LowEndDeviceUtil.isLowEndDevice(this.e);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isPositiveDiagnose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c00c4c2c", new Object[]{this})).booleanValue();
        }
        return LogStrategyManager.getInstance().isPositiveDiagnose();
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean isZipAndSevenZip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ae733f", new Object[]{this})).booleanValue();
        }
        return LogStrategyManager.getInstance().isZipAndSevenZip();
    }

    public final void j(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91065937", new Object[]{this, str, str2, bundle});
            return;
        }
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info("LogContext", LoggerFactory.getProcessInfo().getProcessAlias() + " syncUploadCoreByCategoryDirectly: " + str);
        if ((!LoggerFactory.getProcessInfo().isMainProcess() && str == null) || (bundle != null && bundle.getBoolean(LogContext.SYNC_ALL_LOG))) {
            try {
                LoggerFactory.getTraceLogger().info("LogContext", "sync all log to upload dir...");
                this.r.b();
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("LogContext", "syncUploadCoreByCategoryDirectly, syncLog: ".concat(String.valueOf(th)));
            }
        }
        try {
            this.r.a(str, str2, bundle);
        } catch (Throwable th2) {
            LoggerFactory.getTraceLogger().error("LogContext", "syncUploadCoreByCategoryDirectly, uploadLog: ".concat(String.valueOf(th2)), th2);
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        ToolsUploadInterceptor toolsUploadInterceptor = this.C;
        if (toolsUploadInterceptor == null || toolsUploadInterceptor.isUplaod() != 2) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void notifyClientEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a498b3", new Object[]{this, str, obj});
            return;
        }
        ClientEvent clientEvent = this.t.f3963a.get(str);
        ClientEventManager clientEventManager = this.t;
        clientEventManager.a(str);
        if (clientEvent != null) {
            clientEvent.a(obj);
        }
        clientEventManager.a(str);
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void putBizExternParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3606f05", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            ((ConcurrentHashMap) this.m).put(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void putContextParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b6c1e8", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            ((ConcurrentHashMap) this.l).put(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void putLocalParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d8596c", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            Map<String, String> map = this.n.get();
            if (i(a()) || map == null) {
                c(map).put(str, str2);
            } else {
                map.put(str, str2);
            }
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void refreshSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5b8b3d", new Object[]{this});
        } else {
            this.p.d();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void removeContextParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6babd3", new Object[]{this, str});
        } else if (str != null) {
            ((ConcurrentHashMap) this.l).remove(str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void removeLocalParam(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e56597", new Object[]{this, str});
        } else if (str != null && (map = this.n.get()) != null) {
            if (i(a())) {
                c(map).remove(str);
            } else {
                map.remove(str);
            }
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void resetExtrasToSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb7bc7c", new Object[]{this});
        } else {
            this.p.e();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void resetLogHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7b5cc4", new Object[]{this});
        } else {
            this.f = null;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void revertRequestSpanToNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a333b55e", new Object[]{this});
        } else {
            LogStrategyManager.getInstance().revertRequestSpanToNormal();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setAbtestInfoGetter(AbtestInfoGetter abtestInfoGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdd570f", new Object[]{this, abtestInfoGetter});
        } else {
            this.s = abtestInfoGetter;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setApkUniqueId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb90357", new Object[]{this, str});
        } else {
            this.p.q = str;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBehavorLogListener(BehavorLogListener behavorLogListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15c44dd", new Object[]{this, behavorLogListener});
        } else {
            this.u = behavorLogListener;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBirdNestVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da8a8f6", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.s = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_BIRDNESTVERSION + contextInfo.f, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_BIRDNESTVERSION, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBirdNestVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac3c6e", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.s = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_BIRDNESTVERSION + contextInfo.f, str);
            contextInfo.a(LoggingSPCache.STORAGE_BIRDNESTVERSION, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBundleVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ee6c45", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.r = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_BUNDLEVERSION + contextInfo.f, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_BUNDLEVERSION, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setBundleVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d40bd", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.r = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_BUNDLEVERSION + contextInfo.f, str);
            contextInfo.a(LoggingSPCache.STORAGE_BUNDLEVERSION, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setChannelId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800868cd", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.b = str;
            LoggingSPCache.getInstance().putStringApply("channelId", str);
            contextInfo.a(null, "channelId", str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setChannelIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b563545", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.b = str;
            LoggingSPCache.getInstance().putStringApply("channelId", str);
            contextInfo.a("channelId", str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setClientId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19fbc959", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.h = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_CLIENTID, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_CLIENTID, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setClientIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d15649d1", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.h = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_CLIENTID, str);
            contextInfo.a(LoggingSPCache.STORAGE_CLIENTID, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fc2e4", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.i = str;
            LoggingSPCache.getInstance().putStringApply("utdid", str);
            contextInfo.a(null, "utdid", str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setDeviceIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba9885c", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.i = str;
            LoggingSPCache.getInstance().putStringApply("utdid", str);
            contextInfo.a("utdid", str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchBundleVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828f942a", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.o = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION + contextInfo.f, str);
            LoggerFactory.getLogContext().putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchBundleVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb3a2", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.o = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION + contextInfo.f, str);
            LoggerFactory.getLogContext().putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str);
            contextInfo.a(LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchDesc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada4badf", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.n = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_HOTPATCHDESC + contextInfo.f, str);
            LoggerFactory.getLogContext().putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHDESC, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_HOTPATCHDESC, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchDescNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45505557", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.n = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_HOTPATCHDESC + contextInfo.f, str);
            LoggerFactory.getLogContext().putBizExternParams(LoggingSPCache.STORAGE_HOTPATCHDESC, str);
            contextInfo.a(LoggingSPCache.STORAGE_HOTPATCHDESC, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373c3cc", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.m = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_HOTPATCHVERSION + contextInfo.f, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_HOTPATCHVERSION, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setHotpatchVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f22144", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.m = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_HOTPATCHVERSION + contextInfo.f, str);
            contextInfo.a(LoggingSPCache.STORAGE_HOTPATCHVERSION, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLanguage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90122ceb", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.k = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_LANGUAGE, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_LANGUAGE, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLanguageNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d760fb63", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.k = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_LANGUAGE, str);
            contextInfo.a(LoggingSPCache.STORAGE_LANGUAGE, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogAppenderistener(LogAppenderistener logAppenderistener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d82cf5b", new Object[]{this, logAppenderistener});
        } else {
            this.c = logAppenderistener;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogCustomerControl(LogCustomerControl logCustomerControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7075ef0f", new Object[]{this, logCustomerControl});
        } else {
            this.d = logCustomerControl;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogDAUTracker(LogDAUTracker logDAUTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66f2d27", new Object[]{this, logDAUTracker});
        } else {
            this.z = logDAUTracker;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogEncryptClient(LogEncryptClient logEncryptClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83733f43", new Object[]{this, logEncryptClient});
        } else {
            this.w = logEncryptClient;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    @Deprecated
    public void setLogHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d1db5b", new Object[]{this, str});
            return;
        }
        this.f = str;
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.u = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_LOGHOST, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_LOGHOST, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogHostNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738339d3", new Object[]{this, str});
            return;
        }
        this.f = str;
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.u = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_LOGHOST, str);
            contextInfo.a(LoggingSPCache.STORAGE_LOGHOST, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setLogUploadRpcClient(RpcClient rpcClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155f5cf0", new Object[]{this, rpcClient});
        } else {
            this.x = rpcClient;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setMaxLogSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c4cfd9", new Object[]{this, new Integer(i)});
        } else {
            MdapLogUploadManager.a(i);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setNetworkInfoGetter(NetworkInfoGetter networkInfoGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb609688", new Object[]{this, networkInfoGetter});
        } else {
            this.A = networkInfoGetter;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setPackageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88914710", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.p = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_PACKAGEID + contextInfo.f, str);
            contextInfo.f();
            contextInfo.a(null, LoggingSPCache.STORAGE_PACKAGEID, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setPackageIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a2088", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.p = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_PACKAGEID + contextInfo.f, str);
            contextInfo.f();
            contextInfo.a(LoggingSPCache.STORAGE_PACKAGEID, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setProductId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd4b4b9", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.e = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_PRODUCTID, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_PRODUCTID, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setProductIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eabdd531", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.e = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_PRODUCTID, str);
            contextInfo.a(LoggingSPCache.STORAGE_PRODUCTID, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setProductVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7765aa3c", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.f = str;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setProductVersionNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e97b4", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.f = str;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setReleaseCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac899e3", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.d = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_RELEASECODE + contextInfo.f, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_RELEASECODE, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setReleaseCodeNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d36f05b", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.d = str;
            LoggingSPCache instance = LoggingSPCache.getInstance();
            instance.putStringApply(LoggingSPCache.STORAGE_RELEASECODE + contextInfo.f, str);
            contextInfo.a(LoggingSPCache.STORAGE_RELEASECODE, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setReleaseType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842cd370", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.c = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_RELEASETYPE, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_RELEASETYPE, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setReleaseTypeNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79034ce8", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.c = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_RELEASETYPE, str);
            contextInfo.a(LoggingSPCache.STORAGE_RELEASETYPE, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setSourceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754da9", new Object[]{this, str});
        } else {
            this.p.l = str;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setSpmMonitor(ISpmMonitor iSpmMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afd5678", new Object[]{this, iSpmMonitor});
        } else {
            this.v = iSpmMonitor;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setToolsUploadInterceptor(ToolsUploadInterceptor toolsUploadInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c03289", new Object[]{this, toolsUploadInterceptor});
        } else {
            this.C = toolsUploadInterceptor;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setTraceLoggerInterceptor(TraceLoggerInterceptor traceLoggerInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb90f6bb", new Object[]{this, traceLoggerInterceptor});
        } else {
            this.B = traceLoggerInterceptor;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.g = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_USERID, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_USERID, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setUserIdNoCommit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e61a51", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.g = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_USERID, str);
            contextInfo.a(LoggingSPCache.STORAGE_USERID, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setUserSessionId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01a2915", new Object[]{this, str});
            return;
        }
        ContextInfo contextInfo = this.p;
        if (!TextUtils.isEmpty(str)) {
            contextInfo.t = str;
            LoggingSPCache.getInstance().putStringApply(LoggingSPCache.STORAGE_USERSESSIONID, str);
            contextInfo.a(null, LoggingSPCache.STORAGE_USERSESSIONID, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void setupExceptionHandler(UncaughtExceptionCallback uncaughtExceptionCallback, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0df5781", new Object[]{this, uncaughtExceptionCallback, new Integer(i)});
        } else {
            CrashBridge.c();
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void syncAppendLogEvent(LogEvent logEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e41c46", new Object[]{this, logEvent});
        } else {
            this.f3936a.a(logEvent);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void syncLogConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cb339c", new Object[]{this, str});
        } else {
            LogStrategyManager.getInstance().syncLogConfig(str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    @Deprecated
    public void takedownExceptionHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f28a4b", new Object[]{this});
        } else {
            LoggerFactory.getTraceLogger().error("LogContext", new Exception("illegal to invoke 'takedownExceptionHandler' function"));
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void updateLogStrategyCfg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158a9d47", new Object[]{this, str});
        } else {
            LogStrategyManager.getInstance().updateLogStrategy(str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void upload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7261d2", new Object[]{this, str});
        } else {
            upload(str, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void uploadAfterSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d5cfa7", new Object[]{this, str});
        } else {
            appendLogEvent(new LogEvent("uploadByType", null, LogEvent.Level.ERROR, str));
        }
    }

    public static /* synthetic */ void a(LogContextImpl logContextImpl, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39d63f0", new Object[]{logContextImpl, str, str2, bundle});
        } else {
            logContextImpl.j(str, str2, bundle);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void flush(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b06adf", new Object[]{this, str, new Boolean(z)});
        } else {
            flush(str, z, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public String getClientStatus(boolean z, boolean z2, String str) {
        String str2;
        String str3;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91cf34bc", new Object[]{this, new Boolean(z), new Boolean(z2), str});
        }
        long currentTimeMillis = System.currentTimeMillis();
        LoggerFactory.getTraceLogger().info("LogContext", "getClientStatus: , now: " + currentTimeMillis + ", gotoBackgroundTimestamp: " + ClientEventHelper.a().c + ", clientLaunchTimestamp: " + ClientEventHelper.a().b + ", processSetupTimestamp: " + ClientEventHelper.a().f3962a);
        if (z2) {
            String g = CrashBridge.g();
            if (!TextUtils.isEmpty(g)) {
                return g;
            }
            if (z) {
                long backgroundTime = LogStrategyManager.getInstance().getBackgroundTime();
                long h = CrashBridge.h();
                if (h <= 0 || backgroundTime <= 0 || h >= currentTimeMillis || h <= backgroundTime + TimeUnit.MINUTES.toMillis(1L)) {
                    return "unknown";
                }
                return "background";
            }
        }
        if (ClientEventHelper.a().c > 0 && currentTimeMillis - ClientEventHelper.a().c > TimeUnit.MINUTES.toMillis(1L)) {
            return "background";
        }
        if (ClientEventHelper.a().b > 0 || ClientEventHelper.a().f3962a <= 0) {
            return "foreground";
        }
        if (currentTimeMillis - ClientEventHelper.a().f3962a > TimeUnit.MINUTES.toMillis(1L)) {
            return "background";
        }
        try {
            Map<String, String> startupReason = LoggerFactory.getProcessInfo().getStartupReason();
            if (startupReason != null) {
                str2 = startupReason.get(ProcessInfo.SR_ACTION_NAME);
                str3 = startupReason.get(ProcessInfo.SR_COMPONENT_NAME);
            } else {
                str2 = null;
                str3 = null;
            }
            boolean i = CrashBridge.i();
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                z3 = CrashBridge.j();
            }
            if (i || z3) {
                return "background";
            }
            return "foreground";
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("LogContext", th);
            return "foreground";
        }
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            if (this.y == null) {
                this.y = this.e.getPackageName();
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogContext", "isAlipayPackageName", th);
        }
        String str = this.y;
        if (str != null) {
            return str.contains("com.eg.android.AlipayGphone");
        }
        return true;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public boolean traceNativeCrash(String str, String str2, boolean z) {
        File file;
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6f86132", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.error("LogContext", "traceNativeCrash, filePath:" + str + ", isBoot:" + z + ", process: " + processAlias);
        if (LoggerFactory.getProcessInfo().isMainProcess() || LoggerFactory.getProcessInfo().isExtProcess() || LoggerFactory.getProcessInfo().isLiteProcess() || LoggerFactory.getProcessInfo().isSandboxProcess()) {
            String b = b(str, str2, z);
            if (LoggerFactory.getProcessInfo().isMainProcess() && z && TextUtils.isEmpty(b)) {
                try {
                    file = new File(this.e.getApplicationInfo().dataDir + File.separator + "app_crash");
                } catch (Exception unused) {
                    file = null;
                }
                if (file == null || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
                    return false;
                }
            }
            Intent intent = new Intent();
            if (LogStrategyManager.getInstance().isDisableToolsProcess()) {
                intent.setClassName(this.e, LogContext.PUSH_RECEIVER_CLASS_NAME);
            } else {
                intent.setClassName(this.e, LogContext.TOOLS_RECEIVER_CLASS_NAME);
            }
            return h(intent, str, b, z);
        } else if (LoggerFactory.getProcessInfo().isPushProcess()) {
            if (LogStrategyManager.getInstance().isDisableToolsProcess()) {
                g(z);
                return false;
            }
            Intent intent2 = new Intent();
            intent2.setClassName(this.e, LogContext.TOOLS_RECEIVER_CLASS_NAME);
            return h(intent2, str, str2, z);
        } else if (LoggerFactory.getProcessInfo().isToolsProcess()) {
            g(z);
            return false;
        } else {
            LoggerFactory.getTraceLogger().error("LogContext", "traceNativeCrash, error: unknown process ".concat(String.valueOf(processAlias)));
            g(z);
            return false;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void upload(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59857b1c", new Object[]{this, str, str2});
        } else {
            upload(str, str2, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void uploadAfterSync(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d8afdb1", new Object[]{this, str, str2});
            return;
        }
        LogEvent logEvent = new LogEvent("uploadByType", null, LogEvent.Level.ERROR, str);
        logEvent.setUploadUrl(str2);
        appendLogEvent(logEvent);
    }

    public final void a(Queue<LogEvent> queue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840e3e08", new Object[]{this, queue});
        } else if (queue != null) {
            syncAppendLogEvent((LogEvent) ((BlockingQueue) queue).take());
            this.b = true;
        }
    }

    public final void d(Intent intent, String str, String str2, Bundle bundle) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ca0d7b", new Object[]{this, intent, str, str2, bundle});
            return;
        }
        try {
            intent.setPackage(this.e.getPackageName());
        } catch (Throwable unused) {
        }
        intent.setAction(this.e.getPackageName() + LogContext.ACTION_UPLOAD_MDAPLOG);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("logCategory", str);
        intent.putExtra("uploadUrl", str2);
        intent.putExtra("isMonitorBackground", TianyanLoggingStatus.isMonitorBackground());
        intent.putExtra("isStrictBackground", TianyanLoggingStatus.isStrictBackground());
        intent.putExtra("isRelaxedBackground", TianyanLoggingStatus.isRelaxedBackground());
        intent.putExtra("invokerProcessAlias", LoggerFactory.getProcessInfo().getProcessAlias());
        try {
            if (this.e.startService(intent) == null) {
                z = false;
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogContext", "uploadCoreByStartService", th);
        }
        boolean isDisableToolsProcess = LogStrategyManager.getInstance().isDisableToolsProcess();
        LoggerFactory.getTraceLogger().info("LogContext", "uploadCoreByStartService: start upload service, logCategory: " + str + ", success: " + z + ", process: " + LoggerFactory.getProcessInfo().getProcessAlias() + ", disableTools: " + isDisableToolsProcess);
        if (!z) {
            e(str, str2, bundle);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void flush(String str, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a307795", new Object[]{this, str, new Boolean(z), bundle});
            return;
        }
        LogEvent logEvent = new LogEvent("flush", null, LogEvent.Level.ERROR, str);
        logEvent.setBundle(bundle);
        if (z) {
            syncAppendLogEvent(logEvent);
        } else {
            appendLogEvent(logEvent);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|(1:78)|(5:8|(1:10)|82|11|(1:(11:27|28|(3:30|(2:32|33)|84)|34|(1:36)(2:38|(3:40|(1:45)|46)(4:47|(2:58|(2:60|(1:85))(1:64))|65|(1:87)))|37|75|68|69|71|72)(1:24))(1:20))(2:15|16)|77|82|11|(0)|(1:22)|27|28|(0)|34|(0)(0)|37|75|68|69|71|72) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0120, code lost:
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:17:0x0044, B:22:0x0053, B:27:0x005f, B:34:0x009d, B:36:0x00a7, B:38:0x00ac, B:40:0x00b9, B:45:0x00c5, B:46:0x00c8, B:47:0x00cb, B:49:0x00d4, B:51:0x00dd, B:53:0x00e5, B:55:0x00ee, B:58:0x00f8, B:60:0x0101, B:64:0x010c, B:65:0x010f, B:71:0x0121, B:28:0x0074, B:30:0x0082, B:32:0x008c), top: B:80:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: all -> 0x0095, TryCatch #3 {all -> 0x005c, blocks: (B:17:0x0044, B:22:0x0053, B:27:0x005f, B:34:0x009d, B:36:0x00a7, B:38:0x00ac, B:40:0x00b9, B:45:0x00c5, B:46:0x00c8, B:47:0x00cb, B:49:0x00d4, B:51:0x00dd, B:53:0x00e5, B:55:0x00ee, B:58:0x00f8, B:60:0x0101, B:64:0x010c, B:65:0x010f, B:71:0x0121, B:28:0x0074, B:30:0x0082, B:32:0x008c), top: B:80:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7 A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:17:0x0044, B:22:0x0053, B:27:0x005f, B:34:0x009d, B:36:0x00a7, B:38:0x00ac, B:40:0x00b9, B:45:0x00c5, B:46:0x00c8, B:47:0x00cb, B:49:0x00d4, B:51:0x00dd, B:53:0x00e5, B:55:0x00ee, B:58:0x00f8, B:60:0x0101, B:64:0x010c, B:65:0x010f, B:71:0x0121, B:28:0x0074, B:30:0x0082, B:32:0x008c), top: B:80:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac A[Catch: all -> 0x005c, TryCatch #3 {all -> 0x005c, blocks: (B:17:0x0044, B:22:0x0053, B:27:0x005f, B:34:0x009d, B:36:0x00a7, B:38:0x00ac, B:40:0x00b9, B:45:0x00c5, B:46:0x00c8, B:47:0x00cb, B:49:0x00d4, B:51:0x00dd, B:53:0x00e5, B:55:0x00ee, B:58:0x00f8, B:60:0x0101, B:64:0x010c, B:65:0x010f, B:71:0x0121, B:28:0x0074, B:30:0x0082, B:32:0x008c), top: B:80:0x0044 }] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(boolean r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.LogContextImpl.g(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    @Override // com.alipay.mobile.common.logging.api.LogContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getLogHost() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.LogContextImpl.getLogHost():java.lang.String");
    }

    public final boolean h(Intent intent, String str, String str2, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2787073f", new Object[]{this, intent, str, str2, new Boolean(z)})).booleanValue();
        }
        try {
            intent.setPackage(this.e.getPackageName());
        } catch (Throwable unused) {
        }
        intent.setAction(this.e.getPackageName() + LogContext.ACTION_MONITOR_COMMAND);
        intent.putExtra("action", this.e.getPackageName() + LogContext.ACTION_TRACE_NATIVECRASH);
        intent.putExtra("filePath", str);
        intent.putExtra("callStack", str2);
        intent.putExtra("isBoot", z);
        try {
            this.e.sendBroadcast(intent);
            z2 = true;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogContext", "handleNativeCrashBySendBroadcast", th);
            z2 = false;
        }
        boolean isDisableToolsProcess = LogStrategyManager.getInstance().isDisableToolsProcess();
        LoggerFactory.getTraceLogger().info("LogContext", "handleNativeCrashBySendBroadcast: send native crash broadcast, filePath: " + str + ", isBoot: " + z + ", success: " + z2 + ", process: " + LoggerFactory.getProcessInfo().getProcessAlias() + ", disableTools: " + isDisableToolsProcess);
        if (z2) {
            return true;
        }
        g(z);
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void upload(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e317c38", new Object[]{this, str, str2, bundle});
            return;
        }
        if (LoggerFactory.getProcessInfo().isMainProcess() || LoggerFactory.getProcessInfo().isExtProcess() || LoggerFactory.getProcessInfo().isLiteProcess()) {
            Intent intent = new Intent();
            if (LogStrategyManager.getInstance().isRealTimeLogCategory(str)) {
                intent.setClassName(this.e, LogContext.MAIN_SERVICE_CLASS_NAME);
            } else if (LogStrategyManager.getInstance().isDisableToolsProcess()) {
                intent.setClassName(this.e, LogContext.PUSH_LOG_SERVICE_CLASS_NAME);
            } else {
                MdapLogUploadManager.a();
                if (MdapLogUploadManager.a(str) || !l()) {
                    intent.setClassName(this.e, LogContext.TOOLS_SERVICE_CLASS_NAME);
                    if (!"crash".equals(str) && !k()) {
                        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                        traceLogger.info("LogContext", str + " do not upload by tools, hold on...");
                    }
                } else {
                    intent.setClassName(this.e, LogContext.PUSH_LOG_SERVICE_CLASS_NAME);
                }
            }
            d(intent, str, str2, bundle);
        } else if (LoggerFactory.getProcessInfo().isPushProcess()) {
            if (LogStrategyManager.getInstance().isRealTimeLogCategory(str)) {
                Intent intent2 = new Intent();
                intent2.setClassName(this.e, LogContext.MAIN_SERVICE_CLASS_NAME);
                d(intent2, str, str2, bundle);
            } else if (LogStrategyManager.getInstance().isDisableToolsProcess()) {
                adjustUploadCoreByCategoryDirectly(str, str2, bundle);
            } else {
                MdapLogUploadManager.a();
                if (!MdapLogUploadManager.a(str) && l()) {
                    adjustUploadCoreByCategoryDirectly(str, str2, bundle);
                } else if ("crash".equals(str) || k()) {
                    Intent intent3 = new Intent();
                    intent3.setClassName(this.e, LogContext.TOOLS_SERVICE_CLASS_NAME);
                    d(intent3, str, str2, bundle);
                } else {
                    TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                    traceLogger2.info("LogContext", str + " do not upload by tools, hold on...");
                }
            }
        } else if (LoggerFactory.getProcessInfo().isToolsProcess()) {
            adjustUploadCoreByCategoryDirectly(str, str2, bundle);
        } else {
            TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
            traceLogger3.error("LogContext", "upload, error: unknown process " + LoggerFactory.getProcessInfo().getProcessAlias());
            adjustUploadCoreByCategoryDirectly(str, str2, bundle);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ClientEventHelper.a().d >= LogStrategyManager.MINIMUM_REQUEST_TIME_SPAN) {
            ClientEventHelper.a().d = currentTimeMillis;
            LogStrategyManager.getInstance().queryStrategy(LogStrategyManager.ACTION_TYPE_MDAPUPLOAD, false);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.LogContext
    public void uploadAfterSync(String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1a7f83", new Object[]{this, str, str2, bundle});
            return;
        }
        LogEvent logEvent = new LogEvent("uploadByType", null, LogEvent.Level.ERROR, str);
        logEvent.setUploadUrl(str2);
        logEvent.setBundle(bundle);
        appendLogEvent(logEvent);
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5e2c18f", new Object[]{this});
        }
        Integer num = this.k.get();
        this.k.set(1);
        return num;
    }

    public final synchronized void a(AppendWorker appendWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e71e44", new Object[]{this, appendWorker});
        } else {
            this.q = appendWorker;
        }
    }
}
