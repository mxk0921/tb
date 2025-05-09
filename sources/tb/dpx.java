package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.zcache.Environment;
import com.taobao.zcache.Error;
import com.taobao.zcache.core.IZCacheCore;
import com.taobao.zcache.core.ZCacheCoreProxy;
import com.taobao.zcache.core.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AssetManager e;
    public static String f;
    public static ZCacheCoreProxy g;
    public static final cfe l;
    public static final yee m;

    /* renamed from: a  reason: collision with root package name */
    public static final Lock f18005a = new ReentrantLock();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static boolean c = false;
    public static boolean d = false;
    public static final ConcurrentLinkedQueue<i40> h = new ConcurrentLinkedQueue<>();
    public static Error i = new Error(9994, "context is null");
    public static int j = 0;
    public static afe k = new b27();
    public static final AtomicBoolean n = new AtomicBoolean();

    static {
        t2o.a(996147267);
        try {
            l = new ial();
        } catch (NoClassDefFoundError unused) {
        }
        try {
            m = new ly6();
        } catch (NoClassDefFoundError unused2) {
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63cc17c5", new Object[0]);
        } else if (n.compareAndSet(false, true)) {
            cfe cfeVar = l;
            if (cfeVar != null) {
                g.registerPushService(cfeVar);
            }
            yee yeeVar = m;
            if (yeeVar != null) {
                ((ly6) yeeVar).a(g);
            }
        }
    }

    public static IZCacheCore b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (IZCacheCore) ipChange.ipc$dispatch("3380e2ab", new Object[0]);
        }
        if (g == null && c && j <= 5) {
            if (f()) {
                Lock lock = f18005a;
                if (((ReentrantLock) lock).tryLock()) {
                    Error error = null;
                    if (g == null) {
                        ZCacheCoreProxy zCacheCoreProxy = new ZCacheCoreProxy(e);
                        if (ZCacheCoreProxy.setProxyNative(zCacheCoreProxy, e, f, xyi.f31696a, a.f14188a)) {
                            g = zCacheCoreProxy;
                            z = true;
                        } else {
                            error = new Error(9995, "JNI failed: proxy is null");
                            i = error;
                        }
                    }
                    ((ReentrantLock) lock).unlock();
                    j++;
                    if (error != null) {
                        k(error);
                    }
                }
            }
            if (z && g != null) {
                Iterator<i40> it = h.iterator();
                while (it.hasNext()) {
                    i40 next = it.next();
                    g.registerAccept(next.f21087a, next.b, next.c);
                }
            }
        }
        return g;
    }

    public static String c(Context context) {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        return d;
    }

    public static Error e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("9f645436", new Object[0]);
        }
        return i;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2bcf16d", new Object[0])).booleanValue();
        }
        AtomicBoolean atomicBoolean = b;
        if (atomicBoolean.get()) {
            return true;
        }
        ReentrantLock reentrantLock = (ReentrantLock) f18005a;
        if (reentrantLock.tryLock()) {
            if (!atomicBoolean.get()) {
                String load = k.load("zcachecore");
                if (load == null) {
                    z = true;
                }
                if (!z) {
                    i = new Error(9993, load);
                }
            }
            Error error = i;
            reentrantLock.unlock();
            if (!z) {
                k(error);
            }
        }
        return z;
    }

    public static icn g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("38b1bb77", new Object[]{str});
        }
        return lcn.a(RVLLevel.Error, str).g(i.getCode(), i.getMessage());
    }

    public static void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc730f0", new Object[]{str, str2, str3});
            return;
        }
        ZCacheCoreProxy zCacheCoreProxy = g;
        if (zCacheCoreProxy == null) {
            h.add(new i40(str, str2, str3));
        } else {
            zCacheCoreProxy.registerAccept(str, str2, str3);
        }
    }

    public static void i(afe afeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e17b030", new Object[]{afeVar});
        } else if (afeVar != null) {
            k = afeVar;
            lcn.a(RVLLevel.Info, "ZCache/Setup").j("registerLibraryLoader").a("type", afeVar.getClass().getName()).f();
        }
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821c8cb1", new Object[]{str});
        } else if (f()) {
            ZCacheCoreProxy.registerUpdateListenerNative(str);
        }
    }

    public static void k(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37918207", new Object[]{error});
            return;
        }
        lcn.a(RVLLevel.Error, "ZCache/Setup").j("loadSO").g(error.getCode(), error.getMessage()).f();
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.toString(error.getCode()));
        hashMap.put("errorMsg", error.getMessage());
        xyi.a("ZCache.Init", hashMap, new HashMap());
    }

    public static void m(Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b177a10", new Object[]{environment});
        } else if (environment != null && f()) {
            ZCacheCoreProxy.setEnvNative(environment.value);
        }
    }

    public static synchronized void l(Context context) {
        synchronized (dpx.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a164154", new Object[]{context});
                return;
            }
            if (context != null && !c) {
                String c2 = c(context);
                String packageName = context.getPackageName();
                boolean equals = TextUtils.equals(c2, packageName);
                d = equals;
                if (!equals) {
                    lcn.a(RVLLevel.Warn, "ZCache/Setup").j("setContext").h(-1, "Current process name \"%s\" is not equal to packageName \"%s\"", c2, packageName).f();
                }
                e = context.getAssets();
                String absolutePath = context.getDir("zcache", 0).getAbsolutePath();
                f = absolutePath;
                if (!absolutePath.endsWith("/")) {
                    f += "/";
                }
                c = true;
                i = new Error(9994, "ZCache is initializing");
                b();
            }
        }
    }
}
