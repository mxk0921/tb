package tb;

import android.os.SystemClock;
import com.alibaba.poplayer.info.misc.PopMiscInfoFileHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class t4f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAUNCH_STEP_CONFIG_FETCH = 2;
    public static final int LAUNCH_STEP_CONFIG_PARSE = 3;
    public static final int LAUNCH_STEP_FIRST_PAGE = 4;
    public static final int LAUNCH_STEP_INIT_TASK = 1;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f28482a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public String e = "";
    public final Map<Integer, Long[]> f = new ConcurrentHashMap();
    public a g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final t4f f28483a = new t4f();

        static {
            t2o.a(626000042);
        }

        public static /* synthetic */ t4f a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t4f) ipChange.ipc$dispatch("b509dac0", new Object[0]);
            }
            return f28483a;
        }
    }

    static {
        t2o.a(626000040);
    }

    public static t4f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t4f) ipChange.ipc$dispatch("e119a0fb", new Object[0]);
        }
        return b.a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5620d0d9", new Object[]{this})).booleanValue();
        }
        if (!this.f28482a.get() || !this.c.get()) {
            return false;
        }
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac1e93b", new Object[]{this})).booleanValue();
        }
        return this.d.get();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
        }
        if (!this.f28482a.get() || !this.b.get()) {
            return false;
        }
        return true;
    }

    public void g(int i) {
        Long[] lArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb36ca67", new Object[]{this, new Integer(i)});
        } else if (((ConcurrentHashMap) this.f).containsKey(Integer.valueOf(i)) && (lArr = (Long[]) ((ConcurrentHashMap) this.f).get(Integer.valueOf(i))) != null && lArr.length == 2 && lArr[0] != null && lArr[1] == null) {
            lArr[1] = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e584c4bc", new Object[]{this, new Integer(i)});
        } else if (!((ConcurrentHashMap) this.f).containsKey(Integer.valueOf(i))) {
            Long[] lArr = new Long[2];
            lArr[0] = Long.valueOf(SystemClock.elapsedRealtime());
            ((ConcurrentHashMap) this.f).put(Integer.valueOf(i), lArr);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561212dd", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3270f3", new Object[]{this, aVar});
        } else {
            this.g = aVar;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f219ad9", new Object[]{this});
        } else if (!this.d.get()) {
            synchronized (t4f.class) {
                try {
                    wdm.g(wdm.CATEGORY_TRIGGER_EVENT, "", "PopMiscInfoFileHelper.loadLocalFiles.");
                    PopMiscInfoFileHelper.g().i();
                    com.alibaba.poplayer.info.frequency.a.t().m();
                    this.d.set(true);
                }
            }
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c9fa44", new Object[]{this});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("useNewConfig", String.valueOf(jd0.c().a().isConfigFetchOptEnable()));
            hashMap.put("newConfigFetchLocal", String.valueOf(jd0.c().a().isConfigFetchLocalEnable()));
            hashMap.put("launchType", this.e);
            hashMap.put("enableOpt", "true");
            n(1, "InitTaskCostTime", hashMap);
            n(2, "ConfigFetchCostTime", hashMap);
            n(3, "ConfigParseCostTime", hashMap);
            n(4, "FirstPageReadyCostTime", hashMap);
            qtv.i("PopReady", hashMap);
            wdm.f(wdm.CATEGORY_LIFE_CYCLE, "", "InitReadyDispatcher.trackPopReady.trackMap=" + hashMap);
        } catch (Throwable th) {
            wdm.h("FirstTimeConfigReadyDispatcher.trackPopReady.error.", th);
        }
    }

    public void f() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d21dd5", new Object[]{this});
            return;
        }
        try {
            if (this.b.compareAndSet(false, true)) {
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "FirstTimeConfigReadyDispatcher.onActivityReady.mIsFirstActivityReady=" + this.b + ".mIsObserverConfigInited=" + this.f28482a);
                if (d() && (aVar = this.g) != null) {
                    ((mj9) aVar).b();
                }
            }
        } catch (Throwable th) {
            wdm.h("FirstTimeConfigReadyDispatcher.onActivityReady.error.", th);
        }
    }

    public void i(String str) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bdd994", new Object[]{this, str});
            return;
        }
        try {
            if (this.c.compareAndSet(false, true)) {
                g(4);
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "FirstTimeConfigReadyDispatcher.eventUri=" + str + ".onFirstPageReady.mIsFirstPageReady=" + this.c + ".mIsObserverConfigInited=" + this.f28482a);
                if (b() && (aVar = this.g) != null) {
                    ((mj9) aVar).c();
                }
            }
        } catch (Throwable th) {
            wdm.h("FirstTimeConfigReadyDispatcher.onFirstPageReady.error.", th);
        }
    }

    public void j() {
        a aVar;
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584959fc", new Object[]{this});
            return;
        }
        try {
            if (this.f28482a.compareAndSet(false, true)) {
                g(3);
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "FirstTimeConfigReadyDispatcher.onFirstTimePageObserverConfigInit.mIsFirstPageReady=" + this.c + ".mIsFirstActivityReady=" + this.b + ".mIsObserverConfigInited=" + this.f28482a);
                if (d() && (aVar2 = this.g) != null) {
                    ((mj9) aVar2).b();
                }
                if (b() && (aVar = this.g) != null) {
                    ((mj9) aVar).c();
                }
            }
        } catch (Throwable th) {
            wdm.h("FirstTimeConfigReadyDispatcher.onFirstTimePageObserverConfigInit.error.", th);
        }
    }

    public final void n(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd47efb", new Object[]{this, new Integer(i), str, map});
            return;
        }
        try {
            Long[] lArr = (Long[]) ((ConcurrentHashMap) this.f).get(Integer.valueOf(i));
            if (lArr != null && lArr.length == 2) {
                Long l = lArr[0];
                Long l2 = lArr[1];
                if (l == null || l2 == null || l2.longValue() < l.longValue()) {
                    wdm.d("trackPopReadyStepItem.error.stepName=%s.stepFinishTime=%s.stepStartTime=%s.", str, l2, l);
                } else {
                    map.put(str, String.valueOf(l2.longValue() - l.longValue()));
                }
            }
        } catch (Throwable th) {
            wdm.h("trackPopReadyStepItem.error.", th);
        }
    }
}
