package com.alipay.birdnest.platform;

import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.AppContextHolder;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.tbelder.TBElder;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.pgh;
import tb.vxq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Platform {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3819a = BirdNestEngine.getVersion();
    public static final pgh.a b = new pgh.a() { // from class: com.alipay.birdnest.platform.Platform.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3823a = AppContextHolder.a();

        @Override // tb.pgh.a
        public void d(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80ec3ad6", new Object[]{this, str, str2, th});
            } else if (th == null) {
                LoggerFactory.getTraceLogger().debug(str, str2);
            } else {
                LoggerFactory.getTraceLogger().error(str, str2, th);
            }
        }

        @Override // tb.pgh.a
        public void e(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
                return;
            }
            LoggerFactory.getTraceLogger().error(str, str2, th);
            if (this.f3823a) {
                Log.e(str, str2, th);
            }
        }

        @Override // tb.pgh.a
        public void i(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("662468f1", new Object[]{this, str, str2, th});
            } else if (th == null) {
                LoggerFactory.getTraceLogger().info(str, str2);
            } else {
                LoggerFactory.getTraceLogger().error(str, str2, th);
            }
        }
    };
    public static final double[] c = {0.875d, 1.0d, 1.125d, 1.25d, 1.375d};
    public static boolean d = false;
    public static boolean e = false;
    public static int f = 1;
    public static int g = 1;

    static {
        i();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) AppContextHolder.f5004a.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                return accessibilityManager.isTouchExplorationEnabled();
            }
            return false;
        } catch (Exception e2) {
            pgh.f("Platform", "error on isTalkBackEnabled", e2);
            return false;
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        return "zh-Hans";
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        return null;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        return UTDevice.getUtdid(AppContextHolder.f5004a);
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
        }
        return "";
    }

    public static String[] f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3a68f47c", new Object[0]);
        }
        return new String[]{"", "", "", ""};
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        if (e) {
            return true;
        }
        if (d) {
            return TBElder.b();
        }
        return false;
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
        } else {
            pgh.n(b);
        }
    }

    public static ExecutorService makeComputeExecutorService(int i, int i2, int i3, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("72d2164e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), str});
        }
        return new ThreadPoolExecutor(i, i2, i3, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.birdnest.platform.Platform.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f3821a = 0;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                this.f3821a = (this.f3821a + 1) % 100;
                return new Thread(runnable, str + "-" + this.f3821a);
            }
        });
    }

    public static ExecutorService makeIOExecutorService(int i, int i2, int i3, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("137f5303", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), str});
        }
        return new ThreadPoolExecutor(i, i2, i3, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.birdnest.platform.Platform.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f3820a = 0;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                this.f3820a = (this.f3820a + 1) % 100;
                return new Thread(runnable, str + "-" + this.f3820a);
            }
        });
    }

    public static ScheduledExecutorService makeScheduledExecutorService(int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("68b05a7", new Object[]{new Integer(i), str});
        }
        return new ScheduledThreadPoolExecutor(i, new ThreadFactory() { // from class: com.alipay.birdnest.platform.Platform.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f3822a = 0;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                this.f3822a = (this.f3822a + 1) % 100;
                return new Thread(runnable, str + "-" + this.f3822a);
            }
        });
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        try {
            AntEvent.Builder builder = new AntEvent.Builder();
            builder.setEventID(str);
            builder.setBizType("birdnest");
            builder.setLoggerLevel(1);
            for (String str2 : map.keySet()) {
                builder.addExtParam(str2, map.get(str2));
            }
            builder.addExtParam("fb_version", f3819a);
            AntEvent build = builder.build();
            if (BirdNestEngine.useLogBatch) {
                BirdNestEngine.eventBatchRunner.c(build);
            } else {
                build.send();
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void i() {
        synchronized (Platform.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[0]);
                return;
            }
            try {
                ConcurrentHashMap<String, Method> concurrentHashMap = vxq.f30318a;
                if (!concurrentHashMap.containsKey("makeComputeExecutorService")) {
                    Class cls = Integer.TYPE;
                    vxq.a("makeComputeExecutorService", Platform.class.getMethod("makeComputeExecutorService", cls, cls, cls, String.class));
                }
                if (!concurrentHashMap.containsKey("makeIOExecutorService")) {
                    Class cls2 = Integer.TYPE;
                    vxq.a("makeIOExecutorService", Platform.class.getMethod("makeIOExecutorService", cls2, cls2, cls2, String.class));
                }
                if (!concurrentHashMap.containsKey("makeScheduledExecutorService")) {
                    vxq.a("makeScheduledExecutorService", Platform.class.getMethod("makeScheduledExecutorService", Integer.TYPE, String.class));
                }
                if (!concurrentHashMap.containsKey("makeNormalExecutorService")) {
                    Class cls3 = Integer.TYPE;
                    vxq.a("makeNormalExecutorService", Platform.class.getMethod("makeIOExecutorService", cls3, cls3, cls3, String.class));
                }
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(int i, long j, long j2, String str, String str2, Map map) {
        String str3;
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea7caab6", new Object[]{new Integer(i), new Long(j), new Long(j2), str, str2, map});
            return;
        }
        if (i != 1) {
            if (i == 2) {
                str3 = "10101028";
            } else if (i == 3) {
                str3 = "10101027";
            } else {
                return;
            }
            i2 = 1;
        } else {
            str3 = "10101026";
        }
        AntEvent.Builder loggerLevel = new AntEvent.Builder().setEventID(str3).setBizType("birdnest").setLoggerLevel(i2);
        if (map != null) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    loggerLevel.addExtParam((String) entry.getKey(), (String) entry.getValue());
                }
            } catch (Throwable th) {
                pgh.f("Platform", "error on sampleLog", th);
            }
        }
        loggerLevel.addExtParam("type", String.valueOf(i)).addExtParam("subCode", String.valueOf(j)).addExtParam("value", String.valueOf(j2)).addExtParam("tpl_id", str).addExtParam("info", str2).addExtParam("fb_version", f3819a).addExtParam("a_opt_flag", String.valueOf(BirdNestEngine.optimizationFlag));
        AntEvent build = loggerLevel.build();
        if (BirdNestEngine.useLogBatch) {
            BirdNestEngine.eventBatchRunner.c(build);
        } else {
            build.send();
        }
    }
}
