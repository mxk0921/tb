package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.OConstant;
import com.taobao.orange.model.ConfigDO;
import com.taobao.orange.model.CustomConfigDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.util.OLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hf4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ConfigDO> f20593a = new ConcurrentHashMap();
    public final AtomicInteger b = new AtomicInteger(0);
    public Set<String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConfigDO f20594a;

        public a(ConfigDO configDO) {
            this.f20594a = configDO;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ConfigDO configDO = this.f20594a;
            com.taobao.orange.util.a.f(configDO, configDO.name);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Set f20596a;

        public c(Set set) {
            this.f20596a = set;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.taobao.orange.util.a.f(this.f20596a, "orange_launch.configs");
            }
        }
    }

    static {
        t2o.a(613417048);
    }

    public static /* synthetic */ AtomicInteger a(hf4 hf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("5e7a2aef", new Object[]{hf4Var});
        }
        return hf4Var.b;
    }

    public static /* synthetic */ Map b(hf4 hf4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("925b1ad9", new Object[]{hf4Var});
        }
        return hf4Var.f20593a;
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865e0a27", new Object[]{this, str});
            return;
        }
        if (this.c == null) {
            this.c = new HashSet();
        }
        this.c.add(str);
    }

    public void d(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8398d7", new Object[]{this, configDO});
            return;
        }
        ((ConcurrentHashMap) this.f20593a).put(configDO.name, configDO);
        r9b.e(configDO.name, configDO.type);
        ConfigCenter.getInstance().notifyListeners(configDO.name, configDO.getCurVersion(), false);
        if (ConfigCenter.getInstance().isAfterIdle.get()) {
            if (ibl.b()) {
                f();
            }
            fck.g(new a(configDO));
            return;
        }
        configDO.persisted = false;
    }

    public void e(ConfigDO configDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70dadd2d", new Object[]{this, configDO});
            return;
        }
        d(configDO);
        o();
    }

    public Map<String, ConfigDO> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d126180", new Object[]{this});
        }
        return this.f20593a;
    }

    public <T> T h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21c12842", new Object[]{this, str});
        }
        ConfigDO configDO = (ConfigDO) ((ConcurrentHashMap) this.f20593a).get(str);
        T t = null;
        if (configDO != null) {
            if (NameSpaceDO.TYPE_STANDARD.equals(configDO.type)) {
                t = (T) configDO.content;
            } else if ("CUSTOM".equals(configDO.type)) {
                t = (T) ((CustomConfigDO) configDO).stringContent;
            } else {
                OLog.e("ConfigCache", "getConfigs fail unsupport type", new Object[0]);
            }
            if (!configDO.monitored) {
                eal.h(configDO.name, configDO.version, configDO.getChangeVersion(), false);
                String str2 = com.taobao.orange.a.TAG;
                configDO.monitored = true;
            }
        }
        return t;
    }

    public Set<NameSpaceDO> i(Set<NameSpaceDO> set) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("683d2d21", new Object[]{this, set});
        }
        HashSet hashSet = new HashSet();
        if (set == null || set.isEmpty()) {
            OLog.w("ConfigCache", "load config cache empty", new Object[0]);
            return null;
        }
        for (NameSpaceDO nameSpaceDO : set) {
            ConfigDO configDO = (ConfigDO) ((ConcurrentHashMap) this.f20593a).get(nameSpaceDO.name);
            if (configDO == null) {
                configDO = l(nameSpaceDO);
                z = false;
            } else {
                OLog.i("ConfigCache", "load config cache exist", "name", nameSpaceDO.name);
                z = true;
            }
            if (configDO != null) {
                configDO.persisted = true;
                if (!z) {
                    ((ConcurrentHashMap) this.f20593a).put(configDO.name, configDO);
                    ConfigCenter.getInstance().removeFail(configDO.name);
                    ConfigCenter.getInstance().notifyListeners(configDO.name, configDO.getCurVersion(), true);
                }
                if (configDO.candidate == null && ibl.k(nameSpaceDO.version) > ibl.k(configDO.version)) {
                    hashSet.add(nameSpaceDO);
                    OLog.d("ConfigCache", "load not match as version", "name", nameSpaceDO.name);
                }
                if (nameSpaceDO.candidates == null && configDO.candidate != null && ibl.k(nameSpaceDO.version) > ibl.k(configDO.getCurVersion())) {
                    hashSet.add(nameSpaceDO);
                    OLog.e("ConfigCache", "load not match as version", "name", nameSpaceDO.name, "local_version", configDO.getCurVersion(), "namespace_version", nameSpaceDO.version);
                    eal.j(OConstant.POINT_EXT_CFG_CHECK, OConstant.POINT_CONFIG_MISS_CHECK_COUNTS, nameSpaceDO.name, 1.0d);
                }
            } else if ("HIGH".equals(nameSpaceDO.loadLevel)) {
                hashSet.add(nameSpaceDO);
            }
        }
        return hashSet;
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            com.taobao.orange.util.a.c(str);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e985b79b", new Object[]{this});
            return;
        }
        this.b.incrementAndGet();
        fck.g(new b());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hf4.a(hf4.this).getAndSet(0) > 0) {
                HashSet hashSet = new HashSet(hf4.b(hf4.this).keySet());
                jno.d(com.taobao.orange.a.g, OConstant.SP_KEY_USED_LIST, hashSet);
                OLog.e("ConfigCache", "save used list success, size", Integer.valueOf(hashSet.size()));
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c593d463", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                if (this.c != null) {
                    HashSet hashSet = new HashSet(this.c);
                    HashSet hashSet2 = new HashSet(hashSet.size());
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ConfigDO configDO = (ConfigDO) ((ConcurrentHashMap) this.f20593a).get((String) it.next());
                        if (configDO != null) {
                            hashSet2.add(configDO);
                        }
                    }
                    OLog.i("ConfigCache", "cacheLaunchConfigs", "size", Integer.valueOf(hashSet2.size()));
                    fck.g(new c(hashSet2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Set<NameSpaceDO> j(Set<NameSpaceDO> set) {
        ConfigDO m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("47c17bed", new Object[]{this, set});
        }
        HashSet hashSet = new HashSet();
        if (set == null || set.isEmpty()) {
            OLog.w("ConfigCache", "load config cache empty", new Object[0]);
            return null;
        }
        Set<String> c2 = jno.c(com.taobao.orange.a.g, OConstant.SP_KEY_USED_LIST, new HashSet());
        c2.add("orange");
        for (NameSpaceDO nameSpaceDO : set) {
            if (c2.contains(nameSpaceDO.name) && (m = m(nameSpaceDO.name)) != null) {
                m.persisted = true;
                ((ConcurrentHashMap) this.f20593a).put(m.name, m);
                r9b.e(m.name, m.type);
                ConfigCenter.getInstance().removeFail(m.name);
                ConfigCenter.getInstance().notifyListeners(m.name, m.getCurVersion(), true);
                if (m.candidate == null && ibl.k(nameSpaceDO.version) > ibl.k(m.version)) {
                    hashSet.add(nameSpaceDO);
                    OLog.d("ConfigCache", "load not match as version", "name", nameSpaceDO.name);
                }
                if (nameSpaceDO.candidates == null && m.candidate != null && ibl.k(nameSpaceDO.version) > ibl.k(m.getCurVersion())) {
                    hashSet.add(nameSpaceDO);
                    OLog.e("ConfigCache", "load not match as version", "name", nameSpaceDO.name, "local_version", m.getCurVersion(), "namespace_version", nameSpaceDO.version);
                    eal.j(OConstant.POINT_EXT_CFG_CHECK, OConstant.POINT_CONFIG_MISS_CHECK_COUNTS, nameSpaceDO.name, 1.0d);
                }
            }
        }
        return hashSet;
    }

    public final ConfigDO l(NameSpaceDO nameSpaceDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigDO) ipChange.ipc$dispatch("95602d0c", new Object[]{this, nameSpaceDO});
        }
        ConfigDO configDO = (ConfigDO) com.taobao.orange.util.a.i(nameSpaceDO.name);
        if (configDO == null) {
            return null;
        }
        if (OLog.isPrintLog(1)) {
            if (configDO.candidate == null) {
                OLog.d("ConfigCache", "restoreConfig", configDO);
            } else {
                OLog.d("ConfigCache", "restoreAbConfig", configDO);
            }
        }
        return configDO;
    }

    public final ConfigDO m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigDO) ipChange.ipc$dispatch("3542a999", new Object[]{this, str});
        }
        ConfigDO configDO = (ConfigDO) com.taobao.orange.util.a.j(str);
        if (configDO == null) {
            return null;
        }
        if (OLog.isPrintLog(1)) {
            if (configDO.candidate == null) {
                OLog.d("ConfigCache", "restoreConfigLocked", configDO);
            } else {
                OLog.d("ConfigCache", "restoreAbConfigLocked", configDO);
            }
        }
        return configDO;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcaaad7", new Object[]{this});
            return;
        }
        Set<ConfigDO> set = (Set) com.taobao.orange.util.a.h("orange_launch.configs");
        if (set != null) {
            for (ConfigDO configDO : set) {
                ((ConcurrentHashMap) this.f20593a).put(configDO.name, configDO);
                ConfigCenter.getInstance().removeFail(configDO.name);
                ConfigCenter.getInstance().notifyListeners(configDO.name, configDO.getCurVersion(), true);
            }
            OLog.e("ConfigCache", "restoreLaunchConfigs", "size", Integer.valueOf(set.size()));
        }
    }
}
