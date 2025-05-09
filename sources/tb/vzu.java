package tb;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vzu g = new vzu();

    /* renamed from: a  reason: collision with root package name */
    public int f30375a = 0;
    public boolean b = false;
    public ScheduledFuture<?> c = null;
    public final List<tzu> d = new LinkedList();
    public final Object e = new Object();
    public int f = 50;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements UTClientConfigMgr.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public String getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
            }
            return "switch_background_delay";
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public void onChange(String str) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                return;
            }
            try {
                i = Integer.parseInt(str);
            } catch (Exception unused) {
                i = 50;
            }
            if (i < 0 || i > 500) {
                vzu.access$002(vzu.this, 50);
            } else {
                vzu.access$002(vzu.this, i);
            }
            nhh.f("", "SwitchBackgroundDelay", Integer.valueOf(vzu.access$000(vzu.this)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593309);
        }

        public /* synthetic */ b(vzu vzuVar, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (vzu.access$200(vzu.this)) {
                for (int i = 0; i < vzu.access$300(vzu.this).size(); i++) {
                    try {
                        tzu tzuVar = (tzu) vzu.access$300(vzu.this).get(i);
                        if (tzuVar instanceof uzu) {
                            ((uzu) tzuVar).onSwitchBackgroundDelay();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private b() {
        }
    }

    static {
        t2o.a(962593307);
    }

    public vzu() {
        UTClientConfigMgr.c().e(new a());
    }

    public static /* synthetic */ int access$000(vzu vzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f796406e", new Object[]{vzuVar})).intValue();
        }
        return vzuVar.f;
    }

    public static /* synthetic */ int access$002(vzu vzuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ddaec5d", new Object[]{vzuVar, new Integer(i)})).intValue();
        }
        vzuVar.f = i;
        return i;
    }

    public static /* synthetic */ Object access$200(vzu vzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("36584a19", new Object[]{vzuVar});
        }
        return vzuVar.e;
    }

    public static /* synthetic */ List access$300(vzu vzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ec40462f", new Object[]{vzuVar});
        }
        return vzuVar.d;
    }

    public static vzu getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vzu) ipChange.ipc$dispatch("1aa052d4", new Object[0]);
        }
        return g;
    }

    public final synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e594ce", new Object[]{this});
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public boolean isInForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cfcc61d", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < ((LinkedList) this.d).size(); i++) {
                try {
                    ((tzu) ((LinkedList) this.d).get(i)).onActivityCreated(activity, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < ((LinkedList) this.d).size(); i++) {
                try {
                    ((tzu) ((LinkedList) this.d).get(i)).onActivityDestroyed(activity);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < ((LinkedList) this.d).size(); i++) {
                try {
                    ((tzu) ((LinkedList) this.d).get(i)).onActivityPaused(activity);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < ((LinkedList) this.d).size(); i++) {
                try {
                    ((tzu) ((LinkedList) this.d).get(i)).onActivityResumed(activity);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < ((LinkedList) this.d).size(); i++) {
                try {
                    ((tzu) ((LinkedList) this.d).get(i)).onActivitySaveInstanceState(activity, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void registerAppStatusCallbacks(tzu tzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd7b7d9", new Object[]{this, tzuVar});
        } else if (tzuVar != null) {
            synchronized (this.e) {
                ((LinkedList) this.d).add(tzuVar);
            }
        }
    }

    public void unregisterAppStatusCallbacks(tzu tzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7add660", new Object[]{this, tzuVar});
        } else if (tzuVar != null) {
            synchronized (this.e) {
                ((LinkedList) this.d).remove(tzuVar);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < ((LinkedList) this.d).size(); i++) {
                try {
                    ((tzu) ((LinkedList) this.d).get(i)).onActivityStarted(activity);
                } finally {
                }
            }
        }
        a();
        this.f30375a++;
        if (!this.b) {
            nhh.f("UTAppStatusMonitor", "onSwitchForeground");
            synchronized (this.e) {
                for (int i2 = 0; i2 < ((LinkedList) this.d).size(); i2++) {
                    try {
                        ((tzu) ((LinkedList) this.d).get(i2)).onSwitchForeground();
                    } finally {
                    }
                }
                this.b = true;
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        synchronized (this.e) {
            for (int i = 0; i < ((LinkedList) this.d).size(); i++) {
                try {
                    ((tzu) ((LinkedList) this.d).get(i)).onActivityStopped(activity);
                } finally {
                }
            }
        }
        int i2 = this.f30375a - 1;
        this.f30375a = i2;
        if (i2 == 0) {
            nhh.f("UTAppStatusMonitor", "onSwitchBackground");
            synchronized (this.e) {
                for (int i3 = 0; i3 < ((LinkedList) this.d).size(); i3++) {
                    try {
                        ((tzu) ((LinkedList) this.d).get(i3)).onSwitchBackground();
                    } finally {
                    }
                }
                this.b = false;
            }
            a();
            this.c = zdt.c().d(null, new b(this, null), this.f);
        }
    }
}
