package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.ConfigCenter;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ey1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_INFO_SP_NAME = "cache_cleaner_cache_info";
    public static final String SWITCH_ALL_SILENCE_FILE_NAME = "cache_cleaner_auto_clear_all_silence_on";
    public static final String SWITCH_FILE_DIR = "/data/local/tmp/";
    public static final String SWITCH_FILE_NAME = "cache_cleaner_auto_clear_background_on";
    public static final String k = ey1.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public yve f18879a;
    public final Context b;
    public final List<g22> e;
    public yve h;
    public yve i;
    public final CacheOverviewInfo j;
    public final List<g22> f = new ArrayList();
    public final rd2 g = new rd2();
    public final ot2 c = new ot2();
    public final rt2 d = new rt2();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(CacheOverviewInfo cacheOverviewInfo, Map<String, Long> map);
    }

    static {
        t2o.a(737149030);
    }

    public ey1(Context context) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.b = context;
        a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g22 g22Var = (g22) it.next();
            this.c.a(g22Var);
            this.c.b(g22Var);
        }
        this.j = ks2.a(this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f46e283", new Object[]{this});
            return;
        }
        this.e.add(this.g);
        this.f.add(this.g);
    }

    public CacheOverviewInfo b(CacheOverviewInfo cacheOverviewInfo) {
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("a67ffca3", new Object[]{this, cacheOverviewInfo});
        }
        RuleConfig i = hg4.j().i();
        long j3 = 0;
        if (i.getInnerCacheEnable()) {
            long currentTimeMillis = System.currentTimeMillis();
            this.h = this.c.d(this.b.getCacheDir().getParentFile(), vs3.INNER_ROOT_DIR);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Iterator it = ((ArrayList) this.e).iterator();
            while (it.hasNext()) {
                g22 g22Var = (g22) it.next();
                this.c.f(g22Var);
                this.c.e(g22Var);
            }
            j = currentTimeMillis2;
        } else {
            TLog.loge(yr2.MODULE, k, "monitor: inner monitor is disable.");
            j = 0;
        }
        if (i.getExternalCacheEnable()) {
            Iterator it2 = ((ArrayList) this.f).iterator();
            while (it2.hasNext()) {
                g22 g22Var2 = (g22) it2.next();
                this.c.b(g22Var2);
                this.c.a(g22Var2);
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            this.i = this.c.d(this.b.getExternalCacheDir(), vs3.EXTERNAL_CACHE_ROOT_DIR);
            long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
            Iterator it3 = ((ArrayList) this.f).iterator();
            while (it3.hasNext()) {
                g22 g22Var3 = (g22) it3.next();
                this.c.e(g22Var3);
                this.c.f(g22Var3);
            }
            j2 = currentTimeMillis4;
        } else {
            TLog.loge(yr2.MODULE, k, "monitor: external cache monitor is disable.");
            j2 = 0;
        }
        if (i.getExternalFileEnable()) {
            Iterator it4 = ((ArrayList) this.f).iterator();
            while (it4.hasNext()) {
                g22 g22Var4 = (g22) it4.next();
                this.c.b(g22Var4);
                this.c.a(g22Var4);
            }
            long currentTimeMillis5 = System.currentTimeMillis();
            this.f18879a = this.c.d(this.b.getExternalFilesDir(null), vs3.EXTERNAL_FILES_ROOT_DIR);
            j3 = System.currentTimeMillis() - currentTimeMillis5;
            Iterator it5 = ((ArrayList) this.f).iterator();
            while (it5.hasNext()) {
                g22 g22Var5 = (g22) it5.next();
                this.c.e(g22Var5);
                this.c.f(g22Var5);
            }
        } else {
            TLog.loge(yr2.MODULE, k, "monitor: external files monitor is disable.");
        }
        CacheOverviewInfo cacheOverviewInfo2 = new CacheOverviewInfo();
        h(cacheOverviewInfo2, cacheOverviewInfo);
        s71.k(j, j2, j3);
        return cacheOverviewInfo2;
    }

    public CacheOverviewInfo c(CacheOverviewInfo cacheOverviewInfo) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("c9a6bb3b", new Object[]{this, cacheOverviewInfo});
        }
        RuleConfig i = hg4.j().i();
        if (i.getInnerCacheEnable()) {
            long currentTimeMillis = System.currentTimeMillis();
            j2 = this.d.b(this.b.getCacheDir().getParentFile(), true);
            j = System.currentTimeMillis() - currentTimeMillis;
        } else {
            TLog.loge(yr2.MODULE, k, "monitor: inner monitor is disable.");
            j2 = 0;
            j = 0;
        }
        if (i.getExternalCacheEnable()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            j4 = this.d.b(this.b.getExternalCacheDir(), false);
            j3 = System.currentTimeMillis() - currentTimeMillis2;
        } else {
            TLog.loge(yr2.MODULE, k, "monitor: external cache monitor is disable.");
            j4 = 0;
            j3 = 0;
        }
        if (i.getExternalFileEnable()) {
            long currentTimeMillis3 = System.currentTimeMillis();
            j6 = this.d.b(this.b.getExternalFilesDir(null), false);
            j5 = System.currentTimeMillis() - currentTimeMillis3;
        } else {
            TLog.loge(yr2.MODULE, k, "monitor: external files monitor is disable.");
            j6 = 0;
            j5 = 0;
        }
        CacheOverviewInfo cacheOverviewInfo2 = new CacheOverviewInfo();
        i(cacheOverviewInfo2, cacheOverviewInfo, j2, j4, j6);
        s71.k(j, j3, j5);
        return cacheOverviewInfo2;
    }

    public void d(a aVar) {
        CacheOverviewInfo cacheOverviewInfo;
        Map<String, Long> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2295682c", new Object[]{this, aVar});
            return;
        }
        g();
        boolean v = hg4.j().v();
        if (v) {
            cacheOverviewInfo = c(this.j);
        } else {
            cacheOverviewInfo = b(this.j);
        }
        String str = k;
        TLog.loge(yr2.MODULE, str, "monitor: basic cache info is " + cacheOverviewInfo);
        e(cacheOverviewInfo);
        ks2.e(this.b, cacheOverviewInfo);
        if (hg4.j().i().getTrackEnable()) {
            f(cacheOverviewInfo);
        } else {
            TLog.loge(yr2.MODULE, str, "monitor: cache monitor track is disable.");
        }
        if (aVar != null) {
            if (v) {
                map = this.d.c();
            } else {
                map = this.g.k();
            }
            aVar.a(cacheOverviewInfo, map);
        }
        if (v) {
            this.d.a();
        }
    }

    public final void f(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69dff9c", new Object[]{this, cacheOverviewInfo});
            return;
        }
        try {
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
            uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_monitor_basic_info").setProperty("basic_info", JSON.toJSONString(cacheOverviewInfo));
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
            if (hg4.j().v()) {
                rt2 rt2Var = this.d;
                if (rt2Var != null) {
                    rt2Var.d(cacheOverviewInfo);
                    return;
                }
                return;
            }
            Iterator it = ((ArrayList) this.e).iterator();
            while (it.hasNext()) {
                ((g22) it.next()).j(cacheOverviewInfo);
            }
            if (hg4.j().i().getExternalCacheEnable()) {
                Iterator it2 = ((ArrayList) this.f).iterator();
                while (it2.hasNext()) {
                    ((g22) it2.next()).j(cacheOverviewInfo);
                }
            }
        } catch (Throwable th) {
            String str = k;
            TLog.loge(yr2.MODULE, str, "track: monitor track with exception " + th);
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        this.h = null;
        this.i = null;
        this.f18879a = null;
        super.finalize();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676ff68a", new Object[]{this});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("start_monitor");
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public void h(CacheOverviewInfo cacheOverviewInfo, CacheOverviewInfo cacheOverviewInfo2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313a7bb", new Object[]{this, cacheOverviewInfo, cacheOverviewInfo2});
            return;
        }
        RuleConfig i = hg4.j().i();
        cacheOverviewInfo.setEnableCacheClean(EVO.isSwitchOpened(this.b, "cache_cleaner_auto_clear_ab_key"));
        cacheOverviewInfo.setEnableQuota(ConfigCenter.isBizClearEnable(this.b));
        cacheOverviewInfo.setTotalSize(vs3.f(this.b));
        cacheOverviewInfo.setAvailableSize(vs3.e(this.b));
        if (c21.g().getBoolean("isFullNewInstall", false)) {
            cacheOverviewInfo.setIsNewInstall(true);
            cacheOverviewInfo.setInstallTime(System.currentTimeMillis());
        } else if (cacheOverviewInfo2 == null || !cacheOverviewInfo2.getIsNewInstall()) {
            cacheOverviewInfo.setIsNewInstall(false);
            if (cacheOverviewInfo2 != null) {
                cacheOverviewInfo.setInstallTime(cacheOverviewInfo2.getInstallTime());
            }
        } else {
            if (System.currentTimeMillis() - cacheOverviewInfo2.getInstallTime() >= i.getNewInstallThreshold()) {
                z = false;
            }
            cacheOverviewInfo.setIsNewInstall(z);
            cacheOverviewInfo.setInstallTime(cacheOverviewInfo2.getInstallTime());
        }
        cacheOverviewInfo.setUpdateTime(System.currentTimeMillis());
        yve yveVar = this.h;
        if (yveVar != null) {
            cacheOverviewInfo.setInnerCacheSize(yveVar.getSize() / 1024);
        }
        yve yveVar2 = this.i;
        if (yveVar2 != null) {
            cacheOverviewInfo.setExternalCacheSize(yveVar2.getSize() / 1024);
        }
        yve yveVar3 = this.f18879a;
        if (yveVar3 != null) {
            cacheOverviewInfo.setExternalFilesSize(yveVar3.getSize() / 1024);
        }
        yve yveVar4 = this.h;
        if (yveVar4 != null && this.f18879a != null && this.i != null) {
            cacheOverviewInfo.setTotalUsedSize(((yveVar4.getSize() + this.i.getSize()) + this.f18879a.getSize()) / 1024);
        }
    }

    public void i(CacheOverviewInfo cacheOverviewInfo, CacheOverviewInfo cacheOverviewInfo2, long j, long j2, long j3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f417c69", new Object[]{this, cacheOverviewInfo, cacheOverviewInfo2, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        RuleConfig i = hg4.j().i();
        cacheOverviewInfo.setEnableCacheClean(EVO.isSwitchOpened(this.b, "cache_cleaner_auto_clear_ab_key"));
        cacheOverviewInfo.setEnableQuota(ConfigCenter.isBizClearEnable(this.b));
        cacheOverviewInfo.setTotalSize(vs3.f(this.b));
        cacheOverviewInfo.setAvailableSize(vs3.e(this.b));
        if (c21.g().getBoolean("isFullNewInstall", false)) {
            cacheOverviewInfo.setIsNewInstall(true);
            cacheOverviewInfo.setInstallTime(System.currentTimeMillis());
        } else if (cacheOverviewInfo2 == null || !cacheOverviewInfo2.getIsNewInstall()) {
            cacheOverviewInfo.setIsNewInstall(false);
            if (cacheOverviewInfo2 != null) {
                cacheOverviewInfo.setInstallTime(cacheOverviewInfo2.getInstallTime());
            }
        } else {
            if (System.currentTimeMillis() - cacheOverviewInfo2.getInstallTime() >= i.getNewInstallThreshold()) {
                z = false;
            }
            cacheOverviewInfo.setIsNewInstall(z);
            cacheOverviewInfo.setInstallTime(cacheOverviewInfo2.getInstallTime());
        }
        cacheOverviewInfo.setUpdateTime(System.currentTimeMillis());
        cacheOverviewInfo.setInnerCacheSize(j / 1024);
        cacheOverviewInfo.setExternalCacheSize(j2 / 1024);
        cacheOverviewInfo.setExternalFilesSize(j3 / 1024);
        cacheOverviewInfo.setTotalUsedSize(((j + j2) + j3) / 1024);
    }

    public final void e(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b63723", new Object[]{this, cacheOverviewInfo});
            return;
        }
        SharedPreferences.Editor edit = this.b.getSharedPreferences(CACHE_INFO_SP_NAME, 0).edit();
        edit.putLong("total_used_size", cacheOverviewInfo.getTotalUsedSize());
        edit.putLong("total_size", cacheOverviewInfo.getTotalSize());
        edit.putLong("available_size", cacheOverviewInfo.getAvailableSize());
        edit.apply();
    }
}
