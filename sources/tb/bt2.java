package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import tb.ey1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bt2 extends ey1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final st2 l = new st2();
    public yve m;
    public yve n;

    static {
        t2o.a(737149032);
    }

    public bt2(Context context) {
        super(context);
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            this.l.a((g22) it.next());
        }
    }

    public static /* synthetic */ Object ipc$super(bt2 bt2Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1554832987:
                super.finalize();
                return null;
            case -1501561693:
                return super.b((CacheOverviewInfo) objArr[0]);
            case 580216876:
                super.d((ey1.a) objArr[0]);
                return null;
            case 1061610115:
                super.a();
                return null;
            case 1930667963:
                super.h((CacheOverviewInfo) objArr[0], (CacheOverviewInfo) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cachecleaner/monitor/CacheMonitor");
        }
    }

    @Override // tb.ey1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f46e283", new Object[]{this});
            return;
        }
        super.a();
        ((ArrayList) this.e).add(new qd9());
        ((ArrayList) this.e).add(new c9b());
        ((ArrayList) this.e).add(new ec9());
        ((ArrayList) this.e).add(new fph());
        ((ArrayList) this.f).add(new cs8());
    }

    @Override // tb.ey1
    public CacheOverviewInfo b(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheOverviewInfo) ipChange.ipc$dispatch("a67ffca3", new Object[]{this, cacheOverviewInfo});
        }
        RuleConfig i = hg4.j().i();
        if (i.getApkFileEnable()) {
            this.m = this.c.d(new File(this.b.getPackageResourcePath()), "");
        } else {
            TLog.loge(yr2.MODULE, ey1.k, "monitor: apk file monitor is disable.");
        }
        if (i.getLibsFileEnable()) {
            try {
                this.n = this.c.d(new File(new File(this.b.getPackageResourcePath()).getParentFile(), "lib"), "");
            } catch (Throwable th) {
                String str = ey1.k;
                TLog.loge(yr2.MODULE, str, "monitor: libs file is captured with " + th);
            }
        } else {
            TLog.loge(yr2.MODULE, ey1.k, "monitor: libs file monitor is disable. ");
        }
        return super.b(cacheOverviewInfo);
    }

    @Override // tb.ey1
    public void d(ey1.a aVar) {
        yve yveVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2295682c", new Object[]{this, aVar});
            return;
        }
        RuleConfig i = hg4.j().i();
        if (i.getEnable() || new File(ey1.SWITCH_FILE_DIR, ey1.SWITCH_FILE_NAME).exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            long a2 = jaq.a(this.b, 0L);
            if (a2 <= 0 || currentTimeMillis - a2 >= i.getAllSilenceTime() || new File(ey1.SWITCH_FILE_DIR, ey1.SWITCH_ALL_SILENCE_FILE_NAME).exists()) {
                super.d(aVar);
                if (!hg4.j().d()) {
                    yve c = ks2.c(this.b, vs3.INNER_ROOT_NAME);
                    if (!i.getInnerCacheDifferEnable() || c == null || (yveVar = this.h) == null) {
                        String str = ey1.k;
                        TLog.loge(yr2.MODULE, str, "monitor: differ inner cache info failed, differ Config is " + i.getInnerCacheDifferEnable() + ", inner root node is " + c);
                    } else {
                        this.l.b(c, yveVar);
                    }
                    ks2.f(this.b, this.h, vs3.INNER_ROOT_NAME);
                    ks2.f(this.b, this.i, vs3.EXTERNAL_CACHE_NAME);
                    ks2.f(this.b, this.f18879a, vs3.EXTERNAL_FILES_NAME);
                }
                jaq.d(this.b, System.currentTimeMillis());
                return;
            }
            String str2 = ey1.k;
            TLog.loge(yr2.MODULE, str2, "monitor: cache monitor in allSilenceTime." + i.getAllSilenceTime());
            return;
        }
        TLog.loge(yr2.MODULE, ey1.k, "monitor: cache monitor is disable.");
    }

    @Override // tb.ey1
    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        this.m = null;
        this.n = null;
        super.finalize();
    }

    @Override // tb.ey1
    public void h(CacheOverviewInfo cacheOverviewInfo, CacheOverviewInfo cacheOverviewInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313a7bb", new Object[]{this, cacheOverviewInfo, cacheOverviewInfo2});
            return;
        }
        super.h(cacheOverviewInfo, cacheOverviewInfo2);
        yve yveVar = this.m;
        if (yveVar != null) {
            cacheOverviewInfo.setApkSize(yveVar.getSize() / 1024);
        }
        yve yveVar2 = this.n;
        if (yveVar2 != null) {
            cacheOverviewInfo.setLibsSize(yveVar2.getSize() / 1024);
        }
        RuleConfig i = hg4.j().i();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i.getEnableApkSizeMonitor()) {
            cacheOverviewInfo.setApkInstallSize(d91.a(this.b, hg4.j().l()) / 1024);
        }
        if (i2 >= 26 && i.getEnableAppDataMonitor()) {
            cacheOverviewInfo.setAppDataSize(d91.b(this.b, hg4.j().l()) / 1024);
        }
        if (i.getEnableOatMonitor() && !hg4.j().e()) {
            long currentTimeMillis = System.currentTimeMillis();
            cacheOverviewInfo.setOatSize(d91.c(this.b) / 1024);
            String str = ey1.k;
            TLog.loge(yr2.MODULE, str, "oatSizeFromMaps.end.costTime=" + (System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
