package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile mol e = null;
    public final ThreadPoolExecutor c;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f24183a = false;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final List<i7d> d = Collections.synchronizedList(new ArrayList());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24184a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f24184a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (mol.a(mol.this) != null && !mol.a(mol.this).isEmpty()) {
                for (i7d i7dVar : mol.a(mol.this)) {
                    if (i7dVar != null) {
                        try {
                            i7dVar.e(this.f24184a, this.b);
                        } catch (Throwable unused) {
                            k7r.a("PageTouchManager", "notifyOnOpenUrl.error.url=" + this.b);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24185a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f24185a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (mol.a(mol.this) != null && !mol.a(mol.this).isEmpty()) {
                for (i7d i7dVar : mol.a(mol.this)) {
                    if (i7dVar != null) {
                        try {
                            i7dVar.c(this.f24185a, this.b);
                        } catch (Throwable unused) {
                            k7r.a("PageTouchManager", "notifyOnResumeUrl.error.url=" + this.b);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24186a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.f24186a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (mol.a(mol.this) != null && !mol.a(mol.this).isEmpty()) {
                for (i7d i7dVar : mol.a(mol.this)) {
                    if (i7dVar != null) {
                        try {
                            i7dVar.d(this.f24186a, this.b);
                        } catch (Throwable unused) {
                            k7r.a("PageTouchManager", "notifyOnTouch.error.url=" + this.b);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24187a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public d(String str, String str2, String str3) {
            this.f24187a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (mol.a(mol.this) != null && !mol.a(mol.this).isEmpty()) {
                for (i7d i7dVar : mol.a(mol.this)) {
                    if (i7dVar != null) {
                        try {
                            i7dVar.a(this.f24187a, this.b, this.c);
                        } catch (Throwable unused) {
                            String str = this.b;
                            String str2 = this.c;
                            k7r.a("PageTouchManager", "notifyOnRedirectUrl.error.originUrl=" + str + ".url=" + str2);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24188a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        public e(String str, String str2, boolean z) {
            this.f24188a = str;
            this.b = str2;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (mol.a(mol.this) != null && !mol.a(mol.this).isEmpty()) {
                for (i7d i7dVar : mol.a(mol.this)) {
                    if (i7dVar != null) {
                        try {
                            i7dVar.b(this.f24188a, this.b, this.c);
                        } catch (Throwable unused) {
                            k7r.a("PageTouchManager", "notifyOnPause.error.url=" + this.b);
                        }
                    }
                }
            }
        }
    }

    static {
        t2o.a(619708614);
    }

    public mol() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new usw("PageTouchManager"));
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ List a(mol molVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("838e2aaf", new Object[]{molVar});
        }
        return molVar.d;
    }

    public static mol b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mol) ipChange.ipc$dispatch("6f79d825", new Object[0]);
        }
        if (e == null) {
            synchronized (mol.class) {
                try {
                    if (e == null) {
                        mol molVar = new mol();
                        e = molVar;
                        return molVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a620864", new Object[]{this, str, str2});
        } else if (!this.f24183a) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.c.execute(new b(str, str2));
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c276e5", new Object[]{this, str, str2});
        } else if (!this.f24183a) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.c.execute(new a(str, str2));
        }
    }

    public void e(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a256c0b", new Object[]{this, str, str2, new Boolean(z)});
        } else if (!this.f24183a) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.c.execute(new e(str, str2, z));
        }
    }

    public void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d511cf30", new Object[]{this, str, str2, str3});
        } else if (!this.f24183a) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.c.execute(new d(str, str2, str3));
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f351c032", new Object[]{this, str, str2});
        } else if (!this.f24183a) {
            TLog.logd("BrowserPageTouchManager", "useTouchMonitor is false");
        } else {
            this.c.execute(new c(str, str2));
        }
    }

    public void h(i7d i7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48e730b", new Object[]{this, i7dVar});
        } else if (i7dVar != null) {
            this.d.add(i7dVar);
        }
    }

    public synchronized void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb6ef64", new Object[]{this});
            return;
        }
        if (this.b.compareAndSet(false, true)) {
            this.f24183a = TextUtils.equals("true", OrangeConfig.getInstance().getConfig("group_common_browser", "useTouchMonitor", "false"));
        }
    }
}
