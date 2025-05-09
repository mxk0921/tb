package com.uc.webview.export.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.uc.webview.export.multiprocess.b;
import com.uc.webview.export.multiprocess.helper.e;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreStartup implements com.uc.webview.export.multiprocess.b {
    private static final String TAG = "PreStartup";
    private static a[] sChildSvcConnections;
    private static b[] sLauncherThreads;
    private static c sServiceConfig;
    private static boolean sU4CoreIsRunning;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements ServiceConnection {
        private static Handler m;

        /* renamed from: a  reason: collision with root package name */
        Context f14318a;
        d b;
        Handler c;
        boolean d;
        ComponentName f;
        IBinder g;
        ServiceConnection h;
        long i;
        long j;
        final String k;
        int e = 0;
        final Executor l = new Executor() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                a.this.c.post(runnable);
            }
        };

        public a(Context context, d dVar) {
            this.k = "PreStartup." + b.a.a(dVar.f14328a);
            this.f14318a = context;
            this.b = dVar;
            this.c = PreStartup.getLauncherHandlerImpl(dVar.f14328a);
        }

        private static String a(int i) {
            if (i == 0) {
                return Configuration.IDLE;
            }
            if (i == 1) {
                return "BIND";
            }
            if (i == 2) {
                return "BINDING";
            }
            if (i == 3) {
                return "BIND_FAILED";
            }
            if (i == 4) {
                return "CONNECTED";
            }
            if (i != 5) {
                return "UnknownState_".concat(String.valueOf(i));
            }
            return "DIS_CONNECTED";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            if (this.d) {
                com.uc.webview.export.multiprocess.helper.c.b(this.k, "unbindService %s", this.f);
                this.f14318a.unbindService(this);
                this.d = false;
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            com.uc.webview.export.multiprocess.helper.c.a(this.k, "onServiceConnected");
            this.j = System.currentTimeMillis();
            this.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.5
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this, iBinder);
                }
            });
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            com.uc.webview.export.multiprocess.helper.c.a(this.k, "onServiceDisconnected");
            this.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.6
                @Override // java.lang.Runnable
                public final void run() {
                    a.c(a.this);
                }
            });
        }

        public final String toString() {
            return "[" + this.b + ", " + a(this.e) + ", " + a() + "]";
        }

        private void b(int i) {
            com.uc.webview.export.multiprocess.helper.c.b(this.k, "state changed: %s -> %s", a(this.e), a(i));
            this.e = i;
        }

        public final void b() {
            if (Looper.myLooper() != this.c.getLooper()) {
                this.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.c();
                    }
                });
            } else {
                c();
            }
        }

        public static /* synthetic */ void c(a aVar) {
            com.uc.webview.export.multiprocess.helper.c.a(aVar.k, "onServiceDisconnectedOnLauncherThread");
            aVar.b(5);
            ServiceConnection serviceConnection = aVar.h;
            if (serviceConnection != null) {
                serviceConnection.onServiceDisconnected(aVar.f);
            }
            aVar.b();
        }

        public final boolean a() {
            int i = this.e;
            return (i == 3 || i == 5) ? false : true;
        }

        public static /* synthetic */ void a(a aVar) {
            if (aVar.e != 0) {
                com.uc.webview.export.multiprocess.helper.c.b(aVar.k, "startOnLauncherThread: call ChildServiceConnection.start() again!");
                return;
            }
            aVar.f = new ComponentName(aVar.f14318a.getPackageName(), aVar.b.b);
            Intent intent = new Intent();
            intent.setComponent(aVar.f);
            aVar.b(1);
            com.uc.webview.export.multiprocess.helper.c.b(aVar.k, "startOnLauncherThread: %s...", aVar.f);
            aVar.i = System.currentTimeMillis();
            Context context = aVar.f14318a;
            Handler handler = aVar.c;
            if (Build.VERSION.SDK_INT >= 24) {
                if (m == null) {
                    HandlerThread handlerThread = new HandlerThread("U4SvcBindHandler");
                    handlerThread.start();
                    m = new Handler(handlerThread.getLooper());
                }
                handler = m;
            }
            boolean a2 = com.uc.webview.export.multiprocess.helper.a.a(context, intent, aVar, handler);
            aVar.d = a2;
            if (a2) {
                aVar.b(2);
            } else {
                aVar.b(3);
            }
        }

        public static /* synthetic */ void a(a aVar, IBinder iBinder) {
            com.uc.webview.export.multiprocess.helper.c.a(aVar.k, "onServiceConnectedOnLauncherThread");
            aVar.g = iBinder;
            aVar.b(4);
            ServiceConnection serviceConnection = aVar.h;
            if (serviceConnection != null) {
                serviceConnection.onServiceConnected(aVar.f, aVar.g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f14325a;
        final HandlerThread b;
        final Handler c;

        public b(String str) {
            Object obj = new Object();
            this.f14325a = obj;
            HandlerThread handlerThread = new HandlerThread(str) { // from class: com.uc.webview.export.multiprocess.PreStartup.b.1
                @Override // android.os.HandlerThread
                public final void onLooperPrepared() {
                    synchronized (b.this.f14325a) {
                        b.this.f14325a.notify();
                    }
                }
            };
            this.b = handlerThread;
            handlerThread.start();
            if (handlerThread.getLooper() == null) {
                try {
                    synchronized (obj) {
                        if (handlerThread.getLooper() == null) {
                            obj.wait(10000L);
                        }
                    }
                } catch (Throwable th) {
                    com.uc.webview.export.multiprocess.helper.c.b(PreStartup.TAG, "mThread.getLooper() failed", th);
                }
            }
            this.c = new Handler(this.b.getLooper());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int f14328a;
        String b;

        public d(int i, String str) {
            this.f14328a = i;
            this.b = str;
        }

        public final String toString() {
            return "[" + b.a.a(this.f14328a) + ", " + this.b + "]";
        }
    }

    public static int bind(int i, ServiceConnection serviceConnection) {
        final a aVar;
        int i2 = 0;
        synchronized (PreStartup.class) {
            try {
                a[] aVarArr = sChildSvcConnections;
                if (aVarArr == null || i < 0 || i >= aVarArr.length || (aVar = aVarArr[i]) == null || !aVar.a()) {
                    return -1;
                }
                if (Looper.myLooper() == aVar.c.getLooper()) {
                    com.uc.webview.export.multiprocess.helper.c.b(aVar.k, "bindService %s...", aVar.f);
                    aVar.h = serviceConnection;
                    int i3 = aVar.e;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            aVar.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    a aVar2 = a.this;
                                    ServiceConnection serviceConnection2 = aVar2.h;
                                    if (serviceConnection2 != null) {
                                        serviceConnection2.onServiceConnected(aVar2.f, aVar2.g);
                                    }
                                }
                            });
                        }
                        i2 = 1;
                    }
                    return i2;
                }
                throw new RuntimeException("bindService must be called in the launcher thread");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean connectionValid(int i) {
        synchronized (PreStartup.class) {
            try {
                sU4CoreIsRunning = true;
                a[] aVarArr = sChildSvcConnections;
                if (aVarArr != null && i >= 0 && i < aVarArr.length) {
                    a aVar = aVarArr[i];
                    if (aVar == null) {
                        com.uc.webview.export.multiprocess.helper.c.b(TAG, "Can't find connection for proc id %d", Integer.valueOf(i));
                    } else {
                        com.uc.webview.export.multiprocess.helper.c.b(TAG, "check connection: %s", aVar);
                        return aVar.a();
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long getBindTime(int i) {
        a aVar;
        synchronized (PreStartup.class) {
            try {
                a[] aVarArr = sChildSvcConnections;
                if (aVarArr == null || i < 0 || i >= aVarArr.length || (aVar = aVarArr[i]) == null) {
                    return 0L;
                }
                return aVar.j - aVar.i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler getLauncherHandlerImpl(int i) {
        b orCreateLauncherThreadImpl = getOrCreateLauncherThreadImpl(i);
        if (orCreateLauncherThreadImpl == null) {
            return null;
        }
        return orCreateLauncherThreadImpl.c;
    }

    public static HandlerThread getLauncherHandlerThread(int i) {
        HandlerThread handlerThread;
        synchronized (PreStartup.class) {
            sU4CoreIsRunning = true;
            b orCreateLauncherThreadImpl = getOrCreateLauncherThreadImpl(i);
            if (orCreateLauncherThreadImpl == null) {
                handlerThread = null;
            } else {
                handlerThread = orCreateLauncherThreadImpl.b;
            }
        }
        return handlerThread;
    }

    private static b getOrCreateLauncherThreadImpl(int i) {
        String str;
        b[] bVarArr = sLauncherThreads;
        if (bVarArr == null) {
            return null;
        }
        boolean z = sServiceConfig.f14327a;
        if (!z) {
            i = 0;
        }
        if (bVarArr[i] == null) {
            if (!z) {
                str = "U4_ProLauncherThread";
            } else if (i == 0) {
                str = "U4_NRProcLauncherThread";
            } else if (i == 1) {
                str = "U4_IRProcLauncherThread";
            } else {
                str = "U4_GProcLauncherThread";
            }
            bVarArr[i] = new b(str);
        }
        return sLauncherThreads[i];
    }

    public static void setContext(Context context) {
        e.a(context);
    }

    public static void setEnable(boolean z) {
        if (e.a() != null) {
            com.uc.webview.export.multiprocess.helper.c.b(TAG, "setEnable(%b)", Boolean.valueOf(z));
            e.a("enable", z);
        }
    }

    public static void startup() {
        startup(e.a());
    }

    public static void unbind(int i) {
        a aVar;
        synchronized (PreStartup.class) {
            try {
                a[] aVarArr = sChildSvcConnections;
                if (aVarArr != null && i >= 0 && i < aVarArr.length && (aVar = aVarArr[i]) != null) {
                    aVar.b();
                    sChildSvcConnections[i] = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void updateSettingAndStopUnwantedService(int i, int[] iArr, String[] strArr, boolean z) {
        if (e.a() != null) {
            updateSetting(i, iArr, strArr, z);
            stopUnwantedService(i, iArr, strArr);
        }
    }

    public static void startup(Context context) {
        if (context != null) {
            String b2 = e.b(context);
            if (!TextUtils.isEmpty(b2) && !b2.contains(":")) {
                synchronized (PreStartup.class) {
                    startupSync(context);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f14327a = e.a("ALT");

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
            com.uc.webview.export.multiprocess.helper.c.c(com.uc.webview.export.multiprocess.PreStartup.TAG, "No. %d svc cls name is empty", java.lang.Integer.valueOf(r9));
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
            com.uc.webview.export.multiprocess.helper.c.c(com.uc.webview.export.multiprocess.PreStartup.TAG, "No. %d proc id(%d) is invalid", java.lang.Integer.valueOf(r9), java.lang.Integer.valueOf(r10));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.uc.webview.export.multiprocess.PreStartup.d[] a() {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.export.multiprocess.PreStartup.c.a():com.uc.webview.export.multiprocess.PreStartup$d[]");
        }
    }

    private static void startupSync(Context context) {
        if (sU4CoreIsRunning) {
            com.uc.webview.export.multiprocess.helper.c.b(TAG, "U4 core is running, ignore startup");
        } else if (sServiceConfig == null) {
            e.a(context);
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            } catch (Throwable unused) {
            }
            c cVar = new c();
            sServiceConfig = cVar;
            d[] a2 = cVar.a();
            if (a2 != null) {
                sLauncherThreads = new b[3];
                sChildSvcConnections = new a[3];
                int[] iArr = {1, 0, 2};
                for (int i = 0; i < 3; i++) {
                    int i2 = iArr[i];
                    int length = a2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        d dVar = a2[i3];
                        if (dVar != null && dVar.f14328a == i2) {
                            final a aVar = new a(context, dVar);
                            sChildSvcConnections[dVar.f14328a] = aVar;
                            com.uc.webview.export.multiprocess.helper.c.a(aVar.k, "start(launcher: %s)...", aVar.c);
                            aVar.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    a.a(a.this);
                                }
                            });
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
    }

    private static void stopUnwantedService(int i, int[] iArr, String[] strArr) {
        int i2 = 0;
        if (e.a() != null) {
            com.uc.webview.export.multiprocess.helper.c.a(TAG, "stopUnwantedService");
            synchronized (PreStartup.class) {
                try {
                    if (i <= 0) {
                        if (sChildSvcConnections != null) {
                            while (true) {
                                a[] aVarArr = sChildSvcConnections;
                                if (i2 >= aVarArr.length) {
                                    break;
                                }
                                a aVar = aVarArr[i2];
                                if (aVar != null) {
                                    aVar.b();
                                    sChildSvcConnections[i2] = null;
                                }
                                i2++;
                            }
                            sChildSvcConnections = null;
                        }
                    } else if (sChildSvcConnections != null) {
                        int i3 = 0;
                        while (true) {
                            a[] aVarArr2 = sChildSvcConnections;
                            if (i3 >= aVarArr2.length) {
                                break;
                            }
                            a aVar2 = aVarArr2[i3];
                            if (aVar2 != null) {
                                int length = iArr.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        com.uc.webview.export.multiprocess.helper.c.b(aVar2.k, "no need anymore - %s", aVar2.b);
                                        aVar2.b();
                                        sChildSvcConnections[i3] = null;
                                        break;
                                    } else if (iArr[i4] == aVar2.b.f14328a) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            i3++;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void updateSetting(int i, int[] iArr, String[] strArr, boolean z) {
        if (e.a() != null) {
            e.a("enable", i > 0);
            synchronized (PreStartup.class) {
                try {
                    e.a("ALT", z);
                    if (i <= 0) {
                        com.uc.webview.export.multiprocess.helper.c.b(TAG, "updateSetting: disable");
                        e.b("proc_ids", "");
                        e.b("svc_names", "");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < i; i2++) {
                            sb.append(iArr[i2]);
                            sb.append(',');
                        }
                        sb.setLength(sb.length() - 1);
                        String sb2 = sb.toString();
                        e.b("proc_ids", sb2);
                        sb.setLength(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            sb.append(strArr[i3]);
                            sb.append(',');
                        }
                        sb.setLength(sb.length() - 1);
                        String sb3 = sb.toString();
                        e.b("svc_names", sb3);
                        com.uc.webview.export.multiprocess.helper.c.b(TAG, "updateSetting: [%s] [%s]", sb2, sb3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
