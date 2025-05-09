package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.io.File;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cs8 extends g22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final u9q f17285a = new u9q();

    static {
        t2o.a(737149064);
    }

    public static /* synthetic */ Object ipc$super(cs8 cs8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cachecleaner/monitor/tracker/ExtCacheTracker");
    }

    @Override // tb.st2.b
    public void a(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d1c4db", new Object[]{this, yveVar});
        }
    }

    @Override // tb.st2.b
    public void b(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6edb02", new Object[]{this, yveVar});
        }
    }

    @Override // tb.st2.b
    public void c(yve yveVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d372155", new Object[]{this, yveVar, new Long(j)});
        }
    }

    @Override // tb.ot2.a
    public void d(File file, yve yveVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43775f3", new Object[]{this, file, yveVar, new Long(j)});
            return;
        }
        yve parent = yveVar.parent();
        if (parent == null) {
            return;
        }
        if (TextUtils.equals(parent.getName(), "/ExternalCache/cache") || TextUtils.equals(parent.getName(), "/ExternalFiles/files")) {
            this.f17285a.a(yveVar);
        }
    }

    @Override // tb.ot2.b
    public void e(File file, yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb69a004", new Object[]{this, file, yveVar});
        }
    }

    @Override // tb.g22
    public void j(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69dff9c", new Object[]{this, cacheOverviewInfo});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_monitor_ext_cache");
        HashMap hashMap = new HashMap();
        hashMap.put("is_new_install", String.valueOf(cacheOverviewInfo.getIsNewInstall()));
        hashMap.put("ex_biz_dir_info_list", this.f17285a.c());
        uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        new StringBuilder("Tracker.Page=cache_monitor_ext_cache.params=").append(hashMap);
        String obj = this.f17285a.d().toString();
        s71.j(obj);
        new StringBuilder("Tracker.AppMonitor.ext.mapString=").append(obj);
    }
}
