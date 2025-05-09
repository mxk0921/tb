package tb;

import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.msoa.MSOAWeexModule;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import tb.odp;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class trh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static trh i;

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<urh> f28905a = new LinkedBlockingQueue();
    public final Map<String, BlockingQueue<urh>> b = new ConcurrentHashMap();
    public final Map<String, xrh> c = new ConcurrentHashMap();
    public final Map<String, Object> d = new ConcurrentHashMap();
    public boolean e = false;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final Map<String, Runnable> h = new ConcurrentHashMap();
    public final idp f = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements odp.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            trh.a(trh.this, true);
            trh.b(trh.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements idp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de96efb5", new Object[]{this, str, obj});
            } else if (obj != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" server bind service success");
                trh.c(trh.this).put(str, obj);
                trh.b(trh.this, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(trh trhVar) {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else {
                bzl.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ldp f28910a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Intent c;
        public final /* synthetic */ xrh d;
        public final /* synthetic */ String e;

        public e(ldp ldpVar, String str, Intent intent, xrh xrhVar, String str2) {
            this.f28910a = ldpVar;
            this.b = str;
            this.c = intent;
            this.d = xrhVar;
            this.e = str2;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            y7t.a(MSOAWeexModule.MSOA_WEEX_MODULE_NAME, this.f28910a.c + " onClassLoaded ----" + this.b);
            Globals.getApplication().bindService(this.c, this.d, 1);
            trh.this.j(this.e);
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            trh.this.j(this.e);
            rrh e = rrh.e();
            String str = this.e;
            e.g(str, "onClassNotFound", this.f28910a.c + " :onClassNotFound", null);
            y7t.a(MSOAWeexModule.MSOA_WEEX_MODULE_NAME, this.f28910a.c + " onClassNotFound ----" + this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28911a;

        public f(String str) {
            this.f28911a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                rrh.e().g(this.f28911a, "msoa_error_timeout", "timeout", null);
            }
        }
    }

    public trh() {
        odp.i(new a());
        bzl.b();
        OrangeConfig.getInstance().registerListener(new String[]{bzl.ORANGE_GROUP_MSOA_PERMISSION}, new c(this));
    }

    public static /* synthetic */ boolean a(trh trhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bdafcc1", new Object[]{trhVar, new Boolean(z)})).booleanValue();
        }
        trhVar.e = z;
        return z;
    }

    public static /* synthetic */ void b(trh trhVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a3a7e2", new Object[]{trhVar, str});
        } else {
            trhVar.l(str);
        }
    }

    public static /* synthetic */ Map c(trh trhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84e0736c", new Object[]{trhVar});
        }
        return trhVar.d;
    }

    public static /* synthetic */ BlockingQueue d(trh trhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueue) ipChange.ipc$dispatch("4bf9b8cb", new Object[]{trhVar});
        }
        return trhVar.f28905a;
    }

    public static /* synthetic */ Map e(trh trhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9ebaa1aa", new Object[]{trhVar});
        }
        return trhVar.b;
    }

    public static /* synthetic */ Handler f(trh trhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("10304b2", new Object[]{trhVar});
        }
        return trhVar.g;
    }

    public static /* synthetic */ Map g(trh trhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b894cfe8", new Object[]{trhVar});
        }
        return trhVar.h;
    }

    public static /* synthetic */ void h(trh trhVar, ldp ldpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d131b0", new Object[]{trhVar, ldpVar});
        } else {
            trhVar.i(ldpVar);
        }
    }

    public static trh k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (trh) ipChange.ipc$dispatch("84d9fd92", new Object[0]);
        }
        if (i == null) {
            synchronized (trh.class) {
                try {
                    if (i == null) {
                        i = new trh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public final void i(ldp ldpVar) {
        String str;
        Object peek;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35309e3", new Object[]{this, ldpVar});
            return;
        }
        y7t.a(MSOAWeexModule.MSOA_WEEX_MODULE_NAME, ldpVar.c + " server bind service");
        Intent intent = new Intent(ldpVar.d);
        intent.setComponent(new ComponentName("com.taobao.taobao", ldpVar.c));
        if (((xrh) ((ConcurrentHashMap) this.c).get(ldpVar.c)) == null) {
            String str2 = ldpVar.c;
            xrh xrhVar = new xrh(str2, this.f);
            ((ConcurrentHashMap) this.c).put(str2, xrhVar);
            if (BundleInfoManager.instance().isDynamicService(ldpVar.c)) {
                String str3 = BundleInfoManager.instance().getBundleInfoFromService(ldpVar.c).c;
                if (mcq.a().a().contains(str3)) {
                    y7t.a(MSOAWeexModule.MSOA_WEEX_MODULE_NAME, ldpVar.c + " feature installed----" + str3);
                    Globals.getApplication().bindService(intent, xrhVar, 1);
                    return;
                }
                y7t.a(MSOAWeexModule.MSOA_WEEX_MODULE_NAME, ldpVar.c + " feature not installed----" + str3);
                BlockingQueue blockingQueue = (BlockingQueue) ((ConcurrentHashMap) this.b).get(ldpVar.c);
                if (blockingQueue == null || (peek = blockingQueue.peek()) == null || !(peek instanceof urh)) {
                    str = "";
                } else {
                    str = ((urh) peek).f29570a;
                }
                zk9.b(ldpVar.c, new e(ldpVar, str3, intent, xrhVar, str));
                f fVar = new f(str);
                this.g.postDelayed(fVar, 5000L);
                ((ConcurrentHashMap) this.h).put(str, fVar);
                return;
            }
            Globals.getApplication().bindService(intent, xrhVar, 1);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c5d93d", new Object[]{this, str});
            return;
        }
        Runnable runnable = (Runnable) ((ConcurrentHashMap) this.h).remove(str);
        if (runnable != null) {
            this.g.removeCallbacks(runnable);
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("887fbd44", new Object[]{this, str});
        } else {
            AsyncTask.execute(new d(str));
        }
    }

    public <T> T m(srh srhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f1d8be45", new Object[]{this, srhVar});
        }
        return null;
    }

    public void n(urh urhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d53721", new Object[]{this, urhVar});
        } else if (urhVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(urhVar.f29570a);
            sb.append(" server request service");
            if (!((LinkedBlockingQueue) this.f28905a).offer(urhVar)) {
                rrh.e().g(urhVar.f29570a, "msoa_error_queue_full", "queue full", null);
            } else if (this.e) {
                l(null);
            }
        }
    }

    public void o(urh urhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42fac83", new Object[]{this, urhVar});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28908a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ urh f28909a;

            public a(urh urhVar) {
                this.f28909a = urhVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    rrh.e().g(this.f28909a.f29570a, "msoa_error_timeout", "timeout", null);
                }
            }
        }

        public d(String str) {
            this.f28908a = str;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0152, code lost:
            if (r8.equals("bundleInterface") == false) goto L_0x013f;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 590
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.trh.d.run():void");
        }
    }
}
