package tb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.utils.Global;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xhe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAST_SUCCEED_URLS = "mama_ad_succeed_exposure_urls";
    public static final Queue<String> c = new ConcurrentLinkedQueue();
    public static boolean d = false;
    public static int e = 50;
    public static final Set<String> f = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f31398a;
    public Application.ActivityLifecycleCallbacks b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(xhe xheVar) {
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
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            try {
                if (xhe.a()) {
                    SharedPreferencesUtils.putStringSet(xhe.LAST_SUCCEED_URLS, new HashSet(xhe.c()));
                    xhe.b(false);
                }
            } catch (Exception e) {
                i4g.a("ifs_disk_thr", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(xhe xheVar) {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                int a2 = tbl.a("disk_max_filter", 50);
                Set<String> b = tbl.b("disk_filter_namespace");
                SharedPreferencesUtils.putInt("disk_max_filter", a2);
                if (b.isEmpty()) {
                    SharedPreferencesUtils.removeKey("disk_filter_namespace");
                } else {
                    SharedPreferencesUtils.putStringSet("disk_filter_namespace", b);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static volatile xhe f31399a = new xhe(null);

        static {
            t2o.a(1017118790);
        }
    }

    static {
        t2o.a(1017118787);
    }

    public /* synthetic */ xhe(a aVar) {
        this();
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return d;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ Queue c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("e2a0e399", new Object[0]);
        }
        return c;
    }

    public static xhe f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhe) ipChange.ipc$dispatch("ebe7608f", new Object[0]);
        }
        return c.f31399a;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a30df518", new Object[]{this})).intValue();
        }
        Queue<String> queue = c;
        if (queue == null) {
            return 0;
        }
        return ((ConcurrentLinkedQueue) queue).size();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            if (!this.f31398a) {
                if (!vm2.r()) {
                    i4g.a("ifs_disk_not_in_bucket", "BucketTools.isFilterDiskIfs is false");
                    return;
                }
                this.f31398a = true;
                Set<String> stringSet = SharedPreferencesUtils.getStringSet(LAST_SUCCEED_URLS);
                if (stringSet != null) {
                    ((ConcurrentLinkedQueue) c).addAll(stringSet);
                }
                e = SharedPreferencesUtils.getInt("disk_max_filter", 50);
                Set<String> stringSet2 = SharedPreferencesUtils.getStringSet("disk_filter_namespace");
                if (stringSet2 != null) {
                    f.addAll(stringSet2);
                }
                OrangeConfig.getInstance().registerListener(new String[]{"alimama_ad"}, new b(this), false);
                i();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            i4g.a("ifs_disk_thr", e2.getMessage());
        }
    }

    public boolean g(String str, String str2) {
        Queue<String> queue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdec94a2", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            if (!vm2.r() || TextUtils.isEmpty(str2)) {
                return false;
            }
            e();
            if (h(str) && (queue = c) != null) {
                if (((ConcurrentLinkedQueue) queue).contains(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            i4g.a("ifs_disk_thr", th.getMessage());
            return false;
        }
    }

    public final boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82701bc3", new Object[]{this, str})).booleanValue();
        }
        Set<String> set = f;
        if (((HashSet) set).contains("all")) {
            return true;
        }
        if (TextUtils.isEmpty(str) || !((HashSet) set).contains(str)) {
            return false;
        }
        return true;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e41e8ee", new Object[]{this});
            return;
        }
        Application application = Global.getApplication();
        if (application != null && this.b == null) {
            a aVar = new a(this);
            this.b = aVar;
            application.registerActivityLifecycleCallbacks(aVar);
        }
    }

    public xhe() {
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dca9383", new Object[]{this, str, str2});
            return;
        }
        try {
            if (vm2.r() && h(str) && !TextUtils.isEmpty(str2)) {
                Queue<String> queue = c;
                if (((ConcurrentLinkedQueue) queue).size() > e) {
                    i4g.a("IfsDiskCacheManager", "succeedUrlExceed");
                    ((ConcurrentLinkedQueue) queue).poll();
                }
                ((ConcurrentLinkedQueue) queue).add(str2);
                d = true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            i4g.a("ifs_disk_thr", e2.getMessage());
        }
    }
}
