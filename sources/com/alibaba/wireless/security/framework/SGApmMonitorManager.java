package com.alibaba.wireless.security.framework;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0139;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.ut.device.UTDevice;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ku0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SGApmMonitorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile SGApmMonitorManager q = null;
    private static boolean r = false;
    private static int s = 5000;
    private static ScheduledExecutorService t;
    private static ScheduledExecutorService u;
    private static JSONObject v = new JSONObject();
    private static long w;
    private com.alibaba.wireless.security.framework.d e;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Number> f3402a = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Number> b = new ConcurrentHashMap<>();
    private volatile int c = 0;
    private Context d = null;
    private String f = null;
    private volatile boolean g = false;
    private boolean h = false;
    private int i = 0;
    private boolean j = true;
    private long k = 0;
    private long l = 0;
    private long m = 0;
    private long n = 0;
    private boolean o = false;
    private String p = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554314);
        }

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            SGApmMonitorManager.b(SGApmMonitorManager.this);
            if (SGApmMonitorManager.a(SGApmMonitorManager.this) == 1) {
                SGApmMonitorManager.a(SGApmMonitorManager.this, true);
                if (SGApmMonitorManager.j(SGApmMonitorManager.this) > 0) {
                    SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.this;
                    SGApmMonitorManager.b(sGApmMonitorManager, SGApmMonitorManager.m(sGApmMonitorManager) + (System.currentTimeMillis() - SGApmMonitorManager.j(SGApmMonitorManager.this)));
                }
                SGApmMonitorManager.c(SGApmMonitorManager.this, System.currentTimeMillis());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            SGApmMonitorManager.c(SGApmMonitorManager.this);
            if (SGApmMonitorManager.a(SGApmMonitorManager.this) == 0) {
                SGApmMonitorManager.a(SGApmMonitorManager.this, false);
                if (SGApmMonitorManager.n(SGApmMonitorManager.this) == 0) {
                    SGApmMonitorManager.c(SGApmMonitorManager.this, SGApmMonitorManager.e());
                }
                SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.this;
                SGApmMonitorManager.d(sGApmMonitorManager, SGApmMonitorManager.o(sGApmMonitorManager) + (System.currentTimeMillis() - SGApmMonitorManager.n(SGApmMonitorManager.this)));
                SGApmMonitorManager.a(SGApmMonitorManager.this, System.currentTimeMillis());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554315);
        }

        public b(SGApmMonitorManager sGApmMonitorManager) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "SGApmMonitor-1");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554316);
        }

        public c(SGApmMonitorManager sGApmMonitorManager) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "SGApmMonitor-2");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554317);
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SGApmMonitorManager.p(SGApmMonitorManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(659554318);
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SGApmMonitorManager.q(SGApmMonitorManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f3406a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        static {
            t2o.a(659554319);
        }

        public f(boolean z, String str, String str2) {
            this.f3406a = z;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String r = SGApmMonitorManager.r(SGApmMonitorManager.this);
            String d = SGApmMonitorManager.d(SGApmMonitorManager.this);
            UserTrackMethodJniBridge.addUtRecord("100171", 0, 1, r, 0L, null, d, "" + this.f3406a, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f3407a;

        static {
            t2o.a(659554320);
        }

        public g(String str, int i) {
            this.f3407a = Base64.encodeToString(SGApmMonitorManager.a(SGApmMonitorManager.this, str, i).getBytes(), 2);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.f3407a;
            if (str != null) {
                SGApmMonitorManager.a(SGApmMonitorManager.this, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(659554322);
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SGApmMonitorManager.b(SGApmMonitorManager.this, false);
                SGApmMonitorManager.a((JSONObject) null);
                SGApmMonitorManager.d().shutdown();
                SGApmMonitorManager.c().shutdown();
            }
        }

        static {
            t2o.a(659554321);
        }

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (SGApmMonitorManager.k(SGApmMonitorManager.this) || SGApmMonitorManager.f(SGApmMonitorManager.this).contains("1000")) {
                SGApmMonitorManager.c().submit(new g(RVStartParams.TRANSPARENT_TITLE_ALWAYS, 1));
            }
            if (SGApmMonitorManager.h(SGApmMonitorManager.this) == 0 && SGApmMonitorManager.this.isAllPluginLoaded()) {
                SGApmMonitorManager.l(SGApmMonitorManager.this);
            }
            SGApmMonitorManager.c().schedule(new a(), 20L, TimeUnit.SECONDS);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f3410a;
        private int b;
        private int c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(659554324);
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SGApmMonitorManager.g(SGApmMonitorManager.this);
                }
            }
        }

        static {
            t2o.a(659554323);
        }

        public i(String str, int i, int i2) {
            this.f3410a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f3410a != null && SGApmMonitorManager.e(SGApmMonitorManager.this) && SGApmMonitorManager.b() != null && this.b <= 5 && !TextUtils.equals("1004", this.f3410a)) {
                if (!TextUtils.equals(ku0.TRACK_PAGE_COUNTER_TYPE_PLUGIN, this.f3410a) || this.b != 1) {
                    try {
                        if (((Number) SGApmMonitorManager.f(SGApmMonitorManager.this).get(this.f3410a)) == null) {
                            SGApmMonitorManager.c().submit(new a());
                            ScheduledExecutorService c = SGApmMonitorManager.c();
                            SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.this;
                            c.submit(new g(this.f3410a + "_f", this.b));
                            synchronized (SGApmMonitorManager.class) {
                                SGApmMonitorManager.i(SGApmMonitorManager.this);
                            }
                            SGApmMonitorManager.d().schedule(new i(this.f3410a, this.b + 1, this.c), this.c, TimeUnit.MILLISECONDS);
                        } else if (this.b > 1) {
                            ScheduledExecutorService c2 = SGApmMonitorManager.c();
                            SGApmMonitorManager sGApmMonitorManager2 = SGApmMonitorManager.this;
                            c2.submit(new g(this.f3410a + "_s", this.b));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    static {
        t2o.a(659554313);
    }

    public static /* synthetic */ int a(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5b24abf", new Object[]{sGApmMonitorManager})).intValue() : sGApmMonitorManager.i;
    }

    public static /* synthetic */ int b(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fe1d2de", new Object[]{sGApmMonitorManager})).intValue();
        }
        int i2 = sGApmMonitorManager.i;
        sGApmMonitorManager.i = 1 + i2;
        return i2;
    }

    public static /* synthetic */ int c(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba115afd", new Object[]{sGApmMonitorManager})).intValue();
        }
        int i2 = sGApmMonitorManager.i;
        sGApmMonitorManager.i = i2 - 1;
        return i2;
    }

    public static /* synthetic */ long d(SGApmMonitorManager sGApmMonitorManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63dbf8af", new Object[]{sGApmMonitorManager, new Long(j)})).longValue();
        }
        sGApmMonitorManager.k = j;
        return j;
    }

    public static /* synthetic */ long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue() : w;
    }

    public static /* synthetic */ ConcurrentHashMap f(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("13ce869f", new Object[]{sGApmMonitorManager}) : sGApmMonitorManager.b;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Context context = this.d;
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("sgloadfailed", 0);
                int i2 = sharedPreferences.getInt(Constants.KEY_TIMES, 0);
                if (i2 > 5) {
                    File file = new File(this.d.getDir("SGLib", 0), ".nt");
                    if (file.exists()) {
                        file.delete();
                    }
                } else {
                    sharedPreferences.edit().putInt(Constants.KEY_TIMES, i2 + 1).commit();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static SGApmMonitorManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SGApmMonitorManager) ipChange.ipc$dispatch("5a5c23f6", new Object[0]);
        }
        if (q == null) {
            synchronized (SGApmMonitorManager.class) {
                try {
                    if (q == null) {
                        q = new SGApmMonitorManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return q;
    }

    public static /* synthetic */ int h(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccff0398", new Object[]{sGApmMonitorManager})).intValue() : sGApmMonitorManager.c;
    }

    public static /* synthetic */ int i(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("372e8bb7", new Object[]{sGApmMonitorManager})).intValue();
        }
        int i2 = sGApmMonitorManager.c;
        sGApmMonitorManager.c = 1 + i2;
        return i2;
    }

    public static /* synthetic */ long j(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a15e13d7", new Object[]{sGApmMonitorManager})).longValue() : sGApmMonitorManager.n;
    }

    private String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        if (this.p == null) {
            try {
                com.alibaba.wireless.security.framework.b a2 = com.alibaba.wireless.security.framework.b.a(new File(b(this.d), "init.config"));
                if (a2 != null) {
                    this.p = "" + a2.b();
                }
            } catch (Exception unused) {
            }
        }
        return this.p;
    }

    public static /* synthetic */ void l(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75bd2421", new Object[]{sGApmMonitorManager});
        } else {
            sGApmMonitorManager.g();
        }
    }

    public static /* synthetic */ long m(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dfecac34", new Object[]{sGApmMonitorManager})).longValue() : sGApmMonitorManager.m;
    }

    public static /* synthetic */ long n(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a1c3453", new Object[]{sGApmMonitorManager})).longValue() : sGApmMonitorManager.l;
    }

    public static /* synthetic */ long o(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b44bbc72", new Object[]{sGApmMonitorManager})).longValue() : sGApmMonitorManager.k;
    }

    public static /* synthetic */ void p(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7b449d", new Object[]{sGApmMonitorManager});
        } else {
            sGApmMonitorManager.f();
        }
    }

    private void q() {
        String str;
        HttpURLConnection httpURLConnection;
        Throwable th;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        Context context = this.d;
        if (context != null) {
            String packageName = context.getPackageName();
            try {
                str = this.d.getPackageManager().getPackageInfo(packageName, 0).versionName;
                try {
                    str2 = URLDecoder.decode(new String(Base64.decode("aHR0cCUzQS8vY2RuLW11bS5hbGliYWJhY2hlbmdkdW4uY29tL3NnN3NYMS9yWXhVL3BERHcv", 0)), "utf-8");
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str = str2;
            }
            String k = k();
            if (k != null) {
                String str3 = str2 + k + "?pn=" + packageName + "&pv=" + str;
                BufferedReader bufferedReader = null;
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
                    try {
                        httpURLConnection.setConnectTimeout(20000);
                        httpURLConnection.setReadTimeout(20000);
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setRequestProperty("Content-Type", "text/plain;charset=UTF-8");
                        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
                        if (httpURLConnection.getResponseCode() == 200) {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            try {
                                char[] cArr = new char[1100];
                                StringBuffer stringBuffer = new StringBuffer();
                                int read = bufferedReader2.read(cArr);
                                if (read < 1024) {
                                    stringBuffer.append(cArr, 0, read);
                                }
                                a(str3, stringBuffer.toString());
                                bufferedReader = bufferedReader2;
                            } catch (Exception unused3) {
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (httpURLConnection == null) {
                                    return;
                                }
                                httpURLConnection.disconnect();
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                    } catch (Exception unused4) {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception unused5) {
                    httpURLConnection = null;
                } catch (Throwable th4) {
                    th = th4;
                    httpURLConnection = null;
                }
                httpURLConnection.disconnect();
            }
        }
    }

    public static /* synthetic */ String r(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c9e9125", new Object[]{sGApmMonitorManager});
        }
        return sGApmMonitorManager.f;
    }

    public synchronized void addTrackInfo(String str) {
        String str2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2920a989", new Object[]{this, str});
            return;
        }
        if (str != null && this.g) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("@");
            if (this.j) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            String str3 = "" + Process.myPid() + "_" + Process.myTid();
            try {
                jSONArray = (JSONArray) v.get(str3);
            } catch (Exception unused) {
                jSONArray = new JSONArray();
                try {
                    v.put(str3, jSONArray);
                } catch (Exception unused2) {
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", sb2);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONArray.put(jSONObject);
            } catch (Exception unused3) {
            }
        }
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        synchronized (SGApmMonitorManager.class) {
            try {
                if (!r) {
                    r = true;
                    this.d = context;
                    w = System.currentTimeMillis();
                    Context context2 = this.d;
                    if (context2 != null && com.alibaba.wireless.security.framework.utils.e.b(context2)) {
                        t = Executors.newSingleThreadScheduledExecutor(new b(this));
                        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new c(this));
                        u = newSingleThreadScheduledExecutor;
                        if (t != null && newSingleThreadScheduledExecutor != null) {
                            newSingleThreadScheduledExecutor.schedule(new d(), 5L, TimeUnit.SECONDS);
                            boolean l = l();
                            this.h = a();
                            if (l) {
                                this.g = true;
                                this.o = isEnableFullTrackRecord();
                                c(this.d);
                                t.schedule(new h(), s * 5, TimeUnit.MILLISECONDS);
                                u.submit(new e());
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isEnableFullTrackRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ca35ceb", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        if (o()) {
            return true;
        }
        return new File(this.d.getDir("SGLib", 0), ".nt").exists();
    }

    public boolean isForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("845d1c18", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public void monitorEnd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10058f2", new Object[]{this, str});
        } else if (str != null && this.g) {
            addTrackInfo("j_" + str + "_e");
            Number number = this.f3402a.get(str);
            if (number != null && this.b.get(str) == null) {
                if (new File("/sdcard/CSV/gubed").exists()) {
                    Log.e("SGApmMonitor", "monitorEnd key = " + str + ", " + (System.currentTimeMillis() - number.longValue()));
                }
                this.b.put(str, Long.valueOf(System.currentTimeMillis() - number.longValue()));
            }
        }
    }

    public void monitorStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54534bb9", new Object[]{this, str});
        } else {
            monitorStartWithTimeout(str, s);
        }
    }

    public void setMainPluginVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c51e7bb", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void setSGPluginManager(com.alibaba.wireless.security.framework.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138b09a2", new Object[]{this, dVar});
        } else {
            this.e = dVar;
        }
    }

    public static /* synthetic */ long a(SGApmMonitorManager sGApmMonitorManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d097856c", new Object[]{sGApmMonitorManager, new Long(j)})).longValue();
        }
        sGApmMonitorManager.n = j;
        return j;
    }

    public static /* synthetic */ long b(SGApmMonitorManager sGApmMonitorManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac59012d", new Object[]{sGApmMonitorManager, new Long(j)})).longValue();
        }
        sGApmMonitorManager.m = j;
        return j;
    }

    public static /* synthetic */ long c(SGApmMonitorManager sGApmMonitorManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("881a7cee", new Object[]{sGApmMonitorManager, new Long(j)})).longValue();
        }
        sGApmMonitorManager.l = j;
        return j;
    }

    public static /* synthetic */ String d(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d8a897", new Object[]{sGApmMonitorManager}) : sGApmMonitorManager.p;
    }

    public static /* synthetic */ boolean e(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e706b4c", new Object[]{sGApmMonitorManager})).booleanValue() : sGApmMonitorManager.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r14 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            java.lang.String r4 = "securityguard_orange_namespace"
            java.lang.String r5 = ".istbg_"
            java.lang.String r6 = ".pma_"
            boolean r7 = r14.n()
            java.lang.String r8 = "1"
            if (r7 == 0) goto L_0x0015
            r7 = r8
            goto L_0x0017
        L_0x0015:
            java.lang.String r7 = "0"
        L_0x0017:
            r9 = 0
            java.lang.Class<com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeListener> r10 = com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeListener.class
            com.android.alibaba.ip.runtime.IpChange r11 = com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeListener.$ipChange     // Catch: all -> 0x0053
            java.lang.String r11 = "getOrangeConfig"
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch: all -> 0x0053
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r12[r2] = r13     // Catch: all -> 0x0053
            r12[r1] = r13     // Catch: all -> 0x0053
            r12[r0] = r13     // Catch: all -> 0x0053
            java.lang.reflect.Method r11 = r10.getMethod(r11, r12)     // Catch: all -> 0x0053
            if (r11 == 0) goto L_0x0051
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch: all -> 0x0053
            r12[r2] = r4     // Catch: all -> 0x0053
            java.lang.String r13 = "128"
            r12[r1] = r13     // Catch: all -> 0x0053
            r12[r0] = r7     // Catch: all -> 0x0053
            java.lang.Object r7 = r11.invoke(r10, r12)     // Catch: all -> 0x0053
            java.lang.String r7 = (java.lang.String) r7     // Catch: all -> 0x0053
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: all -> 0x0054
            r3[r2] = r4     // Catch: all -> 0x0054
            java.lang.String r2 = "129"
            r3[r1] = r2     // Catch: all -> 0x0054
            r3[r0] = r8     // Catch: all -> 0x0054
            java.lang.Object r0 = r11.invoke(r10, r3)     // Catch: all -> 0x0054
            java.lang.String r0 = (java.lang.String) r0     // Catch: all -> 0x0054
        L_0x004f:
            r9 = r7
            goto L_0x0056
        L_0x0051:
            r0 = r9
            goto L_0x0056
        L_0x0053:
            r7 = r9
        L_0x0054:
            r0 = r9
            goto L_0x004f
        L_0x0056:
            java.io.File r1 = new java.io.File     // Catch: Exception -> 0x00b6
            android.content.Context r2 = r14.d     // Catch: Exception -> 0x00b6
            java.io.File r2 = r14.b(r2)     // Catch: Exception -> 0x00b6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: Exception -> 0x00b6
            r3.<init>(r6)     // Catch: Exception -> 0x00b6
            java.lang.String r4 = r14.i()     // Catch: Exception -> 0x00b6
            r3.append(r4)     // Catch: Exception -> 0x00b6
            java.lang.String r3 = r3.toString()     // Catch: Exception -> 0x00b6
            r1.<init>(r2, r3)     // Catch: Exception -> 0x00b6
            boolean r2 = r1.exists()     // Catch: Exception -> 0x00b6
            boolean r3 = r8.equals(r9)     // Catch: Exception -> 0x00b6
            if (r3 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0086
            r1.createNewFile()     // Catch: Exception -> 0x00b6
            goto L_0x0086
        L_0x0081:
            if (r2 == 0) goto L_0x0086
            r1.delete()     // Catch: Exception -> 0x00b6
        L_0x0086:
            java.io.File r1 = new java.io.File     // Catch: Exception -> 0x00b6
            android.content.Context r2 = r14.d     // Catch: Exception -> 0x00b6
            java.io.File r2 = r14.b(r2)     // Catch: Exception -> 0x00b6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: Exception -> 0x00b6
            r3.<init>(r5)     // Catch: Exception -> 0x00b6
            java.lang.String r4 = r14.i()     // Catch: Exception -> 0x00b6
            r3.append(r4)     // Catch: Exception -> 0x00b6
            java.lang.String r3 = r3.toString()     // Catch: Exception -> 0x00b6
            r1.<init>(r2, r3)     // Catch: Exception -> 0x00b6
            boolean r2 = r1.exists()     // Catch: Exception -> 0x00b6
            boolean r0 = r8.equals(r0)     // Catch: Exception -> 0x00b6
            if (r0 == 0) goto L_0x00b1
            if (r2 != 0) goto L_0x00b6
            r1.createNewFile()     // Catch: Exception -> 0x00b6
            goto L_0x00b6
        L_0x00b1:
            if (r2 == 0) goto L_0x00b6
            r1.delete()     // Catch: Exception -> 0x00b6
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.SGApmMonitorManager.f():void");
    }

    public static /* synthetic */ void g(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62cf7b86", new Object[]{sGApmMonitorManager});
        } else {
            sGApmMonitorManager.h();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.d != null) {
            File file = new File(this.d.getDir("SGLib", 0), ".nt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                SharedPreferences sharedPreferences = this.d.getSharedPreferences("sgloadfailed", 0);
                if (sharedPreferences.getInt(Constants.KEY_TIMES, 0) != 0) {
                    sharedPreferences.edit().putInt(Constants.KEY_TIMES, 0).commit();
                }
            } catch (Exception unused) {
            }
        }
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        try {
            return this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    private String j() {
        Context context = this.d;
        try {
            IpChange ipChange = UTDevice.$ipChange;
            String str = (String) UTDevice.class.getMethod("getUtdid", Context.class).invoke(null, context);
            if (str != null) {
                if (!str.isEmpty()) {
                    if (str.contains("?")) {
                    }
                    return str;
                }
            }
            IpChange ipChange2 = com.ta.utdid2.device.UTDevice.$ipChange;
            String str2 = (String) com.ta.utdid2.device.UTDevice.class.getMethod("getUtdid", Context.class).invoke(null, context);
            try {
                if (str2.contains("?")) {
                    return "";
                }
            } catch (Exception unused) {
            }
            return str2;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static /* synthetic */ boolean k(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8d9c06", new Object[]{sGApmMonitorManager})).booleanValue() : sGApmMonitorManager.h;
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (m()) {
            return true;
        }
        File b2 = b(this.d);
        StringBuilder sb = new StringBuilder(".pma_");
        sb.append(i());
        return new File(b2, sb.toString()).exists();
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        Context context = this.d;
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        return "com.alibaba.wireless.securityguard".equals(packageName) || "com.taobao.securityguardlib.gradle".equals(packageName);
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        String a2 = a("ttid");
        if (TextUtils.equals(a2, "10004868") || TextUtils.equals(a2, "212200")) {
            return false;
        }
        String packageName = this.d.getPackageName();
        return "com.taobao.taobao".equals(packageName) || "com.alibaba.wireless.securityguard".equals(packageName);
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        try {
            if (n() && p()) {
                return i().split("\\.").length == 4;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        File b2 = b(this.d);
        StringBuilder sb = new StringBuilder(".istbg_");
        sb.append(i());
        return new File(b2, sb.toString()).exists();
    }

    public static /* synthetic */ void q(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88aaccbc", new Object[]{sGApmMonitorManager});
        } else {
            sGApmMonitorManager.q();
        }
    }

    public void monitorStartWithTimeout(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560defbf", new Object[]{this, str, new Integer(i2)});
        } else if (str != null && this.g) {
            addTrackInfo("j_" + str + "_s");
            if (this.f3402a.get(str) == null) {
                this.f3402a.put(str, Long.valueOf(System.currentTimeMillis()));
                t.schedule(new i(str, 1, i2), i2, TimeUnit.MILLISECONDS);
            }
        }
    }

    private String a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    private File b(Context context) {
        String str;
        File dir;
        String str2;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5755eb6e", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        try {
            str2 = context.getApplicationInfo().sourceDir;
        } catch (Throwable unused) {
        }
        if (str2 != null) {
            if (new File(str2).exists()) {
                str = (file.lastModified() / 1000) + "";
                if (str == null && (dir = context.getDir("SGLib", 0)) != null) {
                    return new File(dir, "app_".concat(str));
                }
                return null;
            }
        }
        str = null;
        if (str == null) {
            return null;
        }
        return new File(dir, "app_".concat(str));
    }

    public static /* synthetic */ ScheduledExecutorService c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("161a80e", new Object[0]) : u;
    }

    public static /* synthetic */ ScheduledExecutorService d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("44ecc5cf", new Object[0]) : t;
    }

    public boolean isAllPluginLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6ef73da", new Object[]{this})).booleanValue();
        }
        return this.b.containsKey("getInstance") && this.b.containsKey("securitybody") && this.b.containsKey("middletier");
    }

    public static /* synthetic */ String a(SGApmMonitorManager sGApmMonitorManager, String str, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8eb36813", new Object[]{sGApmMonitorManager, str, new Integer(i2)}) : sGApmMonitorManager.a(str, i2);
    }

    public static /* synthetic */ JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ed42e657", new Object[0]) : v;
    }

    private JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9db8da2", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            return jSONObject;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Context context = this.d;
        if (context == null) {
            return null;
        }
        try {
            return this.d.getResources().getString(context.getResources().getIdentifier(str, "string", this.d.getPackageName()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.SGApmMonitorManager.b(java.lang.String):void");
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        ((Application) context).registerActivityLifecycleCallbacks(new a());
    }

    private String a(String str, int i2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i2)});
        }
        String packageName = this.d.getPackageName();
        try {
            str2 = this.d.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("SGApmMonitor", "", e2);
            str2 = "";
        }
        long j = this.k;
        long j2 = this.m;
        if (this.l == 0) {
            this.l = w;
        }
        if (this.j) {
            j += System.currentTimeMillis() - this.l;
        } else if (this.n > 0) {
            j2 += System.currentTimeMillis() - this.n;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("utdid", j());
            jSONObject.put("sysver", Build.VERSION.RELEASE);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("reason", str);
            jSONObject.put("wsv", this.f);
            jSONObject.put("wsd", k());
            jSONObject.put("foreground", this.j);
            jSONObject.put("foregroundtime", j);
            jSONObject.put("backgroundtime", j2);
            jSONObject.put("fulltrack", this.o);
            jSONObject.put(C0139.f207, this.h);
            jSONObject.put("tryround", i2);
            jSONObject.put("initts", w);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("appver", str2);
            jSONObject.put("pkgname", packageName);
            jSONObject.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, Process.myPid());
            jSONObject.put("process", a(this.d));
            jSONObject.put("tracklog", v);
            jSONObject.put("avgcostlog", c((String) this.e.getRouter().doCommand(11155, new Object[0])));
            jSONObject.put("costlog", a(this.b));
            jSONObject.put("nt", this.e.getRouter().doCommand(11154, new Object[0]));
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public static /* synthetic */ boolean b(SGApmMonitorManager sGApmMonitorManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac593d4d", new Object[]{sGApmMonitorManager, new Boolean(z)})).booleanValue();
        }
        sGApmMonitorManager.g = z;
        return z;
    }

    private JSONObject a(ConcurrentHashMap<String, Number> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("649f8126", new Object[]{this, concurrentHashMap});
        }
        try {
            ArrayList arrayList = new ArrayList(concurrentHashMap.keySet());
            Collections.sort(arrayList);
            JSONObject jSONObject = new JSONObject();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                jSONObject.put(str, concurrentHashMap.get(str));
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static /* synthetic */ JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bff20044", new Object[]{jSONObject});
        }
        v = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void a(SGApmMonitorManager sGApmMonitorManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43fed996", new Object[]{sGApmMonitorManager, str});
        } else {
            sGApmMonitorManager.b(str);
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            if (TextUtils.equals(str2, "7L2OvtRdxzOJAe7ImU+4I2bAxvq1oDLyTCzRgSPGufNIb7ZY5FsHDFaEzD98Mn7K")) {
                boolean delete = new File(b(this.d), "init.config").delete();
                this.e.a(k());
                u.schedule(new f(delete, str, str2), 5L, TimeUnit.SECONDS);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.wireless.security.framework.SGApmMonitorManager.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "56c6c6c"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            boolean r2 = r7.o()
            if (r2 == 0) goto L_0x0020
            return r1
        L_0x0020:
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r7.d
            java.io.File r3 = r7.b(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "."
            r4.<init>(r5)
            java.lang.String r5 = r7.i()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r3, r4)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L_0x0052
            java.lang.String r2 = com.alibaba.wireless.security.framework.utils.a.a(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: Exception -> 0x0052
            if (r3 != 0) goto L_0x0052
            double r2 = java.lang.Double.parseDouble(r2)     // Catch: Exception -> 0x0052
            goto L_0x0057
        L_0x0052:
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
        L_0x0057:
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            double r4 = r4.nextDouble()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0065
            r0 = 1
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.SGApmMonitorManager.a():boolean");
    }

    public static /* synthetic */ boolean a(SGApmMonitorManager sGApmMonitorManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d097c18c", new Object[]{sGApmMonitorManager, new Boolean(z)})).booleanValue();
        }
        sGApmMonitorManager.j = z;
        return z;
    }
}
