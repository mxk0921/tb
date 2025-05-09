package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.alibaba.evo.EVO;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class am8 implements r1r, obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f15834a;
    public SharedPreferences b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile boolean d = true;
    public final Map<String, Boolean> e = new HashMap();

    @Override // tb.r1r
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb13d969", new Object[]{this, context, str, new Boolean(z)});
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
        OrangeConfig.getInstance().getConfigs("ab_watcher_indices");
        OrangeConfig.getInstance().registerListener(new String[]{"ab_watcher_indices"}, this, true);
        HashSet hashSet = new HashSet();
        if (this.f15834a != null) {
            i(hashSet);
        }
        j(hashSet);
        ArrayList arrayList = new ArrayList(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(g((String) pair.first, (String) pair.second));
        }
        Iterator<Variation>[] itArr = new Iterator[arrayList.size()];
        arrayList.toArray(itArr);
        boolean h = h(itArr);
        kva.d("EvoSwitchesImpl", "batch commit result: " + h);
    }

    @Override // tb.r1r
    public Map<String, tij> c(Context context) throws UnsupportedOperationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d448ddf", new Object[]{this, context});
        }
        throw new UnsupportedOperationException("unsupported operation");
    }

    @Override // tb.r1r
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cf9289", new Object[]{this, context});
        } else if (this.c.compareAndSet(false, true)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ab_watcher_indices_evo", 0);
            this.f15834a = sharedPreferences;
            this.d = sharedPreferences.getBoolean("evo_migration_enable", true);
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("ab_watcher_indices_evo_switches", 0);
            this.b = sharedPreferences2;
            k(sharedPreferences2);
        }
    }

    @Override // tb.r1r
    public Boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ed4b7600", new Object[]{this, context, str});
        }
        if (!this.d) {
            return null;
        }
        Boolean bool = (Boolean) ((HashMap) this.e).get(str);
        if (bool != null) {
            return bool;
        }
        VariationSet activateSync = EVO.activateSync(context, str);
        if (activateSync.size() <= 0 || !activateSync.contains(str)) {
            return null;
        }
        return Boolean.valueOf(activateSync.getVariation(str).getValueAsBoolean(false));
    }

    @Override // tb.r1r
    public r2w f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2w) ipChange.ipc$dispatch("3cb9ab1b", new Object[]{this, context});
        }
        return tij.EMPTY;
    }

    public final Iterator<Variation> g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("2e7ea28e", new Object[]{this, str, str2});
        }
        VariationSet activate = UTABTest.activate(str, str2);
        Iterator<Variation> it = activate.iterator();
        kva.d("EvoSwitchesImpl", "activate with component and module: " + str + ", " + str2);
        kva.d("EvoSwitchesImpl", "received evo data after evo activated, switch count: " + activate.size() + ", id:" + activate.getExperimentId() + ", releaseId:" + activate.getExperimentReleaseId() + ", bucketId:" + activate.getExperimentBucketId());
        AppMonitor.Counter.commit(erj.MODULE, "age", "type=activate,count=" + activate.size() + ",id=" + activate.getExperimentId() + ",releaseId=" + activate.getExperimentReleaseId() + ",bucketId=" + activate.getExperimentBucketId(), 1.0d);
        return it;
    }

    public final boolean h(Iterator<Variation>... itArr) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2367d3a2", new Object[]{this, itArr})).booleanValue();
        }
        if (itArr.length == 0 || (sharedPreferences = this.b) == null) {
            return false;
        }
        SharedPreferences.Editor clear = sharedPreferences.edit().clear();
        for (Iterator<Variation> it : itArr) {
            while (it.hasNext()) {
                Variation next = it.next();
                clear.putBoolean(next.getName(), next.getValueAsBoolean(false));
            }
        }
        return clear.commit();
    }

    public final void i(Set<Pair<String, String>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6f4858", new Object[]{this, set});
            return;
        }
        String string = this.f15834a.getString("evo_prefetch_experiments", "_empty_");
        if (!(string == null || string.length() == 0)) {
            for (String str : string.split(",")) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    set.add(Pair.create(split[0], split[1]));
                }
            }
        }
    }

    public final void j(Set<Pair<String, String>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11761c43", new Object[]{this, set});
            return;
        }
        set.add(Pair.create("AB_STARTUP_FY24", "cold_bootstrap_homepage"));
        set.add(Pair.create("AB_STARTUP_FY24", "cold_bootstrap_homepage_s2_q3"));
        set.add(Pair.create("AB_", "202309121028_4189"));
        set.add(Pair.create("AB_", "202308101133_3951"));
        set.add(Pair.create("AB_", "202308101427_3952"));
        set.add(Pair.create("AB_", "202204021152_2"));
        set.add(Pair.create("AB_", "202204061629_2"));
        set.add(Pair.create("AB_", "202208151043_37"));
        set.add(Pair.create("AB_", "202209201536_487"));
        set.add(Pair.create("AB_", "202312151551_694"));
        set.add(Pair.create("AB_", "202402201036_5679"));
        set.add(Pair.create("AB_", "202402261007_5697"));
        set.add(Pair.create("AB_", "202402261007_5697"));
        set.add(Pair.create("DXPerform", "homeGray"));
    }

    public final void k(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b18af04", new Object[]{this, sharedPreferences});
            return;
        }
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            ((HashMap) this.e).put(entry.getKey(), Boolean.valueOf(entry.getValue().toString()));
        }
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else if (map == null || Boolean.parseBoolean(map.get("fromCache"))) {
            kva.d("EvoSwitchesImpl", "discard this update because of it is from cache");
        } else {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs == null) {
                kva.d("EvoSwitchesImpl", "no config found for " + str + " in orange");
                return;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) kva.g(configs, "evo_migration_enable", "true"));
            String str2 = (String) kva.g(configs, "evo_prefetch_experiments", "");
            SharedPreferences sharedPreferences = this.f15834a;
            if (sharedPreferences == null) {
                kva.d("EvoSwitchesImpl", "sp is null, maybe not it, something went wrong");
            } else if (sharedPreferences.getBoolean("evo_migration_enable", true) != parseBoolean) {
                this.f15834a.edit().putBoolean("evo_migration_enable", parseBoolean).putString("evo_prefetch_experiments", str2).commit();
            } else {
                this.f15834a.edit().putString("evo_prefetch_experiments", str2).commit();
            }
        }
    }
}
