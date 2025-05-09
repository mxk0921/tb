package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.task.Coordinator;
import com.taobao.appbundle.scheduler.Priority;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.guo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e49 extends z30 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AUTO_FEATURE_DOWNLOAD = "auto_feature_download";
    public static final String DEFFERED_DOWNLOAD_FEATURES_ENABLED = "deffered_download_feature_enabled";
    public static final String DYNAMIC_FEATURES_CONFIG = "dynamic_features_config";
    public final Context f;
    public final List<String> k;
    public final List<String> l;
    public final List<String> m;
    public final List<String> n;
    public final ucq o;
    public final Set<String> q;
    public final ScheduledThreadPoolExecutor p = new ScheduledThreadPoolExecutor(1, new h(null));
    public boolean r = false;
    public final guo.a g = g49.a(Priority.HIGH).a();
    public final guo.a h = g49.a(Priority.IMMEDIATE).a();
    public final guo.a i = g49.a(Priority.MEDIUM).a();
    public final guo.a j = g49.a(Priority.LOW).a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18258a;

        public a(String str) {
            this.f18258a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (BundleInfoManager.instance().getDynamicFeatureInfo(this.f18258a) != null && BundleInfoManager.instance().getDynamicFeatureInfo(this.f18258a).dependencies.size() == 0) {
                    bcq.a().g(com.taobao.appbundle.a.Companion.a().d(), false, this.f18258a);
                }
                e49.d(e49.this).c(xcq.c().l(this.f18258a).o(true).n());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18259a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (BundleInfoManager.instance().getDynamicFeatureInfo(b.this.f18259a) != null && BundleInfoManager.instance().getDynamicFeatureInfo(b.this.f18259a).dependencies.size() == 0) {
                        bcq.a().g(com.taobao.appbundle.a.Companion.a().d(), false, b.this.f18259a);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(b.this.f18259a);
                    e49.d(e49.this).d(arrayList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public b(String str) {
            this.f18259a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e49.e(e49.this).a(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f18261a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str = (String) e49.f(e49.this).get(c.this.f18261a);
                try {
                    if (BundleInfoManager.instance().getDynamicFeatureInfo(str) != null && BundleInfoManager.instance().getDynamicFeatureInfo(str).dependencies.size() == 0) {
                        bcq.a().g(com.taobao.appbundle.a.Companion.a().d(), false, str);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    e49.d(e49.this).d(arrayList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public c(int i) {
            this.f18261a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e49.g(e49.this).a(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f18263a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str = (String) e49.h(e49.this).get(d.this.f18263a);
                try {
                    if (BundleInfoManager.instance().getDynamicFeatureInfo(str) != null && BundleInfoManager.instance().getDynamicFeatureInfo(str).dependencies.size() == 0) {
                        bcq.a().g(com.taobao.appbundle.a.Companion.a().d(), false, str);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    e49.d(e49.this).d(arrayList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public d(int i) {
            this.f18263a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e49.i(e49.this).a(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18265a;

        public e(String str) {
            this.f18265a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (BundleInfoManager.instance().getDynamicFeatureInfo(this.f18265a) != null && BundleInfoManager.instance().getDynamicFeatureInfo(this.f18265a).dependencies.size() == 0) {
                    bcq.a().g(com.taobao.appbundle.a.Companion.a().d(), false, this.f18265a);
                }
                e49.d(e49.this).c(xcq.c().l(this.f18265a).o(true).n());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            } else if (Localization.n()) {
                e49.this.l();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (com.taobao.appbundle.a.Companion.a().h() != null) {
                for (String str : e49.j(e49.this)) {
                    com.taobao.appbundle.b.f(str);
                }
                for (String str2 : e49.k(e49.this)) {
                    com.taobao.appbundle.b.f(str2);
                }
                for (String str3 : e49.f(e49.this)) {
                    com.taobao.appbundle.b.f(str3);
                }
                for (String str4 : e49.h(e49.this)) {
                    com.taobao.appbundle.b.f(str4);
                }
            }
        }
    }

    static {
        t2o.a(377487381);
        t2o.a(676331532);
        t2o.a(676331533);
    }

    public e49(Context context) {
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.q = new HashSet();
        this.f = context;
        this.o = vcq.a(context);
        this.k = (List) BundleInfoManager.instance().getImmediatelyInstallFeatures();
        this.l = (List) BundleInfoManager.instance().getHighInstallFeatures();
        this.m = (List) BundleInfoManager.instance().getMediumInstallFeatures();
        this.n = (List) BundleInfoManager.instance().getLowInstallFeatures();
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("dynamic_features_config", 0);
            this.q = sharedPreferences.getStringSet("auto_feature_download_" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName, new HashSet());
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        this.p.setKeepAliveTime(1L, TimeUnit.SECONDS);
        this.p.allowCoreThreadTimeOut(true);
    }

    public static /* synthetic */ ucq d(e49 e49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ucq) ipChange.ipc$dispatch("216fde8b", new Object[]{e49Var});
        }
        return e49Var.o;
    }

    public static /* synthetic */ guo.a e(e49 e49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (guo.a) ipChange.ipc$dispatch("198a428c", new Object[]{e49Var});
        }
        return e49Var.g;
    }

    public static /* synthetic */ List f(e49 e49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("aff00433", new Object[]{e49Var});
        }
        return e49Var.m;
    }

    public static /* synthetic */ guo.a g(e49 e49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (guo.a) ipChange.ipc$dispatch("9f5380ca", new Object[]{e49Var});
        }
        return e49Var.i;
    }

    public static /* synthetic */ List h(e49 e49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bd6cff1", new Object[]{e49Var});
        }
        return e49Var.n;
    }

    public static /* synthetic */ guo.a i(e49 e49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (guo.a) ipChange.ipc$dispatch("251cbf08", new Object[]{e49Var});
        }
        return e49Var.j;
    }

    public static /* synthetic */ Object ipc$super(e49 e49Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/controller/FeatureInstallController");
    }

    public static /* synthetic */ List j(e49 e49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("27bd9baf", new Object[]{e49Var});
        }
        return e49Var.k;
    }

    public static /* synthetic */ List k(e49 e49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5b1018e", new Object[]{e49Var});
        }
        return e49Var.l;
    }

    @Override // tb.z30
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cd2c69", new Object[]{this});
        } else {
            Coordinator.execute(new g());
        }
    }

    @Override // tb.z30
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd860793", new Object[]{this});
        } else if (Localization.n()) {
            l();
        } else {
            Localization.a(new f());
        }
    }

    @Override // tb.z30
    public void c(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de39e3ee", new Object[]{this, list});
            return;
        }
        for (String str : list) {
            this.h.a(new e(str));
        }
    }

    public void l() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69a2e54", new Object[]{this});
        } else if (!this.r) {
            this.r = true;
            try {
                if (!this.f.getSharedPreferences("dynamic_features_config", 0).getBoolean("deffered_download_feature_enabled", true)) {
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            for (String str : this.k) {
                this.h.a(new a(str));
            }
            this.l.addAll(this.q);
            for (String str2 : this.l) {
                this.p.schedule(new b(str2), 1, TimeUnit.SECONDS);
            }
            int i2 = 0;
            while (i2 < this.m.size()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.p;
                c cVar = new c(i2);
                i2++;
                scheduledThreadPoolExecutor.schedule(cVar, i2 * 2, TimeUnit.SECONDS);
            }
            while (i < this.n.size()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.p;
                d dVar = new d(i);
                i++;
                scheduledThreadPoolExecutor2.schedule(dVar, i * 5, TimeUnit.SECONDS);
            }
        }
    }

    @Override // tb.al9.c
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
        }
    }

    @Override // tb.al9.c
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f18268a;

        static {
            t2o.a(377487392);
        }

        public h() {
            this.f18268a = new AtomicInteger();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "#FeatureInstall-" + this.f18268a.incrementAndGet());
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }
}
