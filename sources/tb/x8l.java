package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x8l implements obk, r1r, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String j = "OrangeConfigImpl";
    private static final String k = "ab_watcher_indices";
    private static final String l = "status";
    private static final String m = "ab_config_json";
    private static final String n = "ab_config_cdn";
    private static final String o = "ab_condition_ver";
    private final SharedPreferences b;
    private final Map<String, tij> c = new ConcurrentHashMap();
    private final AtomicReference<e> d = new AtomicReference<>(null);
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final AtomicReference<e> g = new AtomicReference<>(null);
    private final AtomicReference<wxn> h = new AtomicReference<>(null);
    private volatile String i = null;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f31208a = kva.a("ab-o-puller", 1, 1, 3000, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
            kva.d("OrangeConfigImpl", "environment check failed, clear the ab data");
            x8l.g(x8l.this).edit().clear().commit();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f31210a;

        public b(e eVar) {
            this.f31210a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            x8l.g(x8l.this).edit().putBoolean("status", this.f31210a.f31213a).commit();
            kva.d("OrangeConfigImpl", "saved switch status into local");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements ven {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31212a;

        public d(x8l x8lVar, String str) {
            this.f31212a = str;
        }

        public String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
            }
            kva.d("OrangeConfigImpl", "RemoteConfigPuller#get type=" + str + ", currently support utdid only");
            return this.f31212a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f31213a;
        public final String b;

        public e(boolean z, String str) {
            this.f31213a = z;
            this.b = str;
        }
    }

    public x8l(Context context) {
        this.b = context.getSharedPreferences(k, 0);
    }

    public static /* synthetic */ SharedPreferences g(x8l x8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("ba85edd4", new Object[]{x8lVar});
        }
        return x8lVar.b;
    }

    private boolean h(Context context, SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3beb9fd7", new Object[]{this, context, sharedPreferences})).booleanValue();
        }
        String string = sharedPreferences.getString(o, "");
        kva.d("OrangeConfigImpl", "checkEnvironment, local version=" + string);
        String b2 = kva.b(context);
        kva.d("OrangeConfigImpl", "checkEnvironment, runtime version=" + b2);
        this.i = b2;
        if (TextUtils.isEmpty(b2) || TextUtils.equals(string, b2)) {
            return true;
        }
        return false;
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("567722a5", new Object[]{this})).booleanValue();
        }
        e eVar = this.d.get();
        if (eVar == null || !eVar.f31213a) {
            return false;
        }
        return true;
    }

    private void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a48b34d", new Object[]{this, context});
            return;
        }
        d(context);
        if (i() && this.c.size() > 0) {
            kva.d("OrangeConfigImpl", "tracking ab data off");
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625248fc", new Object[]{this});
            return;
        }
        kva.d("OrangeConfigImpl", "environment check failed, clearing the ab data");
        this.f31208a.submit(new a());
    }

    private void n(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38eda7b6", new Object[]{this, str, map});
        } else if (map == null || Boolean.parseBoolean(map.get("fromCache"))) {
            kva.d("OrangeConfigImpl", "discard this update because of it is from cache");
        } else {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs == null) {
                kva.d("OrangeConfigImpl", "no config found for " + str + " in orange");
                return;
            }
            String str2 = (String) kva.g(configs, n, "");
            boolean equals = "1".equals((String) kva.g(configs, "status", "0"));
            e eVar = new e(equals, str2);
            e andSet = this.g.getAndSet(eVar);
            if (andSet != null) {
                kva.d("OrangeConfigImpl", "readConfig, oldIndex {status:" + andSet.f31213a + ", cdnURL:" + andSet.b + "}");
            }
            kva.d("OrangeConfigImpl", "readConfig, newIndex {status:" + equals + ", cdnURL:" + str2 + "}");
            if (andSet == null || !str2.equals(andSet.b)) {
                kva.d("OrangeConfigImpl", "local cdnURL used an older version comparing with remote, sync it");
                this.f31208a.submit(this);
            } else if (equals != andSet.f31213a) {
                kva.d("OrangeConfigImpl", "switch status updated, saving it into local");
                this.f31208a.submit(new b(eVar));
            } else {
                kva.d("OrangeConfigImpl", "local cdnURL is up to date with remote, discard");
            }
            this.f31208a.submit(new c());
        }
    }

    @Override // tb.r1r
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb13d969", new Object[]{this, context, str, new Boolean(z)});
        } else {
            kva.d("OrangeConfigImpl", "unsupported operation");
        }
    }

    @Override // tb.r1r
    public Map<String, tij> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d448ddf", new Object[]{this, context});
        }
        d(context);
        if (i()) {
            return Collections.unmodifiableMap(this.c);
        }
        return Collections.emptyMap();
    }

    @Override // tb.r1r
    public Boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ed4b7600", new Object[]{this, context, str});
        }
        d(context);
        if (!i()) {
            return null;
        }
        for (p2w p2wVar : f(context)) {
            if (p2wVar.getName().equals(str)) {
                return Boolean.valueOf(p2wVar.a(false));
            }
        }
        return null;
    }

    @Override // tb.r1r
    public r2w f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2w) ipChange.ipc$dispatch("3cb9ab1b", new Object[]{this, context});
        }
        d(context);
        if (!i()) {
            return tij.EMPTY;
        }
        tij tijVar = this.c.get(r1r.KEY_AGE_VARIATIONS);
        if (tijVar == null) {
            return tij.EMPTY;
        }
        return tijVar;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "Orange";
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        kva.d("OrangeConfigImpl", "onConfigUpdate");
        n(str, map);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        wxn wxnVar = this.h.get();
        if (wxnVar == null) {
            kva.d("OrangeConfigImpl", "something went wrong when get puller instance");
            return;
        }
        e eVar = this.g.get();
        Map<String, tij> b2 = wxnVar.b(eVar.b);
        if (b2 == null) {
            kva.d("OrangeConfigImpl", "sync pull from remote failed");
            this.b.edit().putBoolean("status", eVar.f31213a).putString(o, this.i).commit();
            kva.d("OrangeConfigImpl", "warning, update switch only");
            return;
        }
        String g = t2w.g(b2);
        if (TextUtils.isEmpty(g)) {
            g = "{}";
        }
        this.b.edit().putBoolean("status", eVar.f31213a).putString(n, eVar.b).putString(o, this.i).putString(m, g).commit();
        kva.d("OrangeConfigImpl", "saved new experiment configs into local");
    }

    private void l(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940d13bb", new Object[]{this, context});
            return;
        }
        String string = this.b.getString(n, "");
        boolean z2 = this.b.getBoolean("status", false);
        String string2 = this.b.getString(m, "");
        if (!h(context, this.b)) {
            m();
        } else {
            z = z2;
        }
        e eVar = new e(z, string);
        if (sng.a(this.d, null, eVar)) {
            kva.d("OrangeConfigImpl", "index updated");
        }
        if (z) {
            Map<String, tij> f = t2w.f(string2);
            this.c.clear();
            this.c.putAll(f);
        }
        if (!sng.a(this.g, null, eVar)) {
            kva.d("OrangeConfigImpl", "::init, something went wrong");
        }
    }

    @Override // tb.r1r
    public void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ec839", new Object[]{this, context, map});
            return;
        }
        d(context);
        if (this.f.compareAndSet(false, true)) {
            j(context);
        }
        String str = (String) map.get("appVersion");
        this.i = str;
        if (!sng.a(this.h, null, new wxn(context, str, new d(this, (String) map.get("deviceId"))))) {
            kva.d("OrangeConfigImpl", "watchForRevision, something went wrong");
        }
        OrangeConfig.getInstance().getConfigs(k);
        OrangeConfig.getInstance().registerListener(new String[]{k}, this, true);
    }

    @Override // tb.r1r
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cf9289", new Object[]{this, context});
        } else if (this.e.compareAndSet(false, true)) {
            l(context);
        } else {
            this.b.getBoolean("status", false);
        }
    }
}
