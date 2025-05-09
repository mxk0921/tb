package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.node.FileNode;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qd9 extends g22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f26682a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public final u9q e = new u9q();
    public final u9q f = new u9q();
    public final u9q g = new u9q();
    public final u9q h = new u9q();
    public final u9q i = new u9q();
    public final u9q j = new u9q();
    public final yve k = new FileNode("", new File("other"));

    static {
        t2o.a(737149066);
    }

    public static /* synthetic */ Object ipc$super(qd9 qd9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cachecleaner/monitor/tracker/FileStatusTracker");
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
        } else if (f(yveVar)) {
            if (yveVar.getName() != null) {
                if (yveVar.getSize() > hg4.j().i().getMaxReportSize()) {
                    this.h.a(yveVar);
                } else {
                    yve yveVar2 = this.k;
                    yveVar2.setSize(yveVar2.getSize() + yveVar.getSize());
                }
            }
            TLog.loge(yr2.MODULE, yr2.MODULE, "onDirVisit: biz dir info: " + yveVar);
            this.d = this.d + 1;
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
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_monitor_file_status");
        HashMap hashMap = new HashMap();
        hashMap.put("is_new_install", String.valueOf(cacheOverviewInfo.getIsNewInstall()));
        hashMap.put("file_num", String.valueOf(this.f26682a));
        hashMap.put("biz_dir_num", String.valueOf(this.d));
        this.h.a(this.k);
        hashMap.put("biz_dir_list", this.h.c());
        uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        new StringBuilder("Tracker.Page=cache_monitor_file_status.params=").append(hashMap);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder2 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder2.setEventPage("cache_monitor_sp_files");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sp_file_num", String.valueOf(this.b));
        hashMap2.put("large_sp_file_list", this.f.c());
        uTHitBuilders$UTCustomHitBuilder2.setProperties(hashMap2);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder2.build());
        new StringBuilder("Tracker.Page=cache_monitor_sp_files.params=").append(hashMap2);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder3 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder3.setEventPage("cache_monitor_large_files");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("large_file_num", String.valueOf(this.e.b()));
        hashMap3.put("large_file_list", this.e.c());
        uTHitBuilders$UTCustomHitBuilder3.setProperties(hashMap3);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder3.build());
        new StringBuilder("Tracker.Page=cache_monitor_large_files.params=").append(hashMap3);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder4 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder4.setEventPage("cache_monitor_database_files");
        HashMap hashMap4 = new HashMap();
        hashMap4.put("data_base_num", String.valueOf(this.c));
        hashMap4.put("database_file_list", this.g.c());
        uTHitBuilders$UTCustomHitBuilder4.setProperties(hashMap4);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder4.build());
        new StringBuilder("Tracker.Page=cache_monitor_database_files.params=").append(hashMap4);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder5 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder5.setEventPage("cache_monitor_no_modified_files");
        HashMap hashMap5 = new HashMap();
        hashMap5.put("long_time_no_modified_file_list", this.j.c());
        uTHitBuilders$UTCustomHitBuilder5.setProperties(hashMap5);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder5.build());
        new StringBuilder("Tracker.Page=cache_monitor_no_modified_files.params=").append(hashMap5);
        Map<String, String> d = this.i.d();
        d.putAll(this.h.d());
        String obj = d.toString();
        s71.j(obj);
        new StringBuilder("Tracker.AppMonitor.inner.mapString=").append(obj);
    }

    @Override // tb.ot2.b
    public void e(File file, yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb69a004", new Object[]{this, file, yveVar});
            return;
        }
        this.f26682a++;
        if (file.length() > hg4.j().i().getLargeFileSizeThreshold()) {
            this.e.a(yveVar);
        }
        yve parent = yveVar.parent();
        if (parent != null && TextUtils.equals(parent.getName(), "shared_prefs")) {
            this.b++;
            if (yveVar.getSize() > hg4.j().i().getSpFileSizeThreshold()) {
                this.f.a(yveVar);
            }
        }
        if (parent != null && TextUtils.equals(parent.getName(), "databases")) {
            this.c++;
            if (yveVar.getSize() > hg4.j().i().getDataBaseSizeThreshold()) {
                this.g.a(yveVar);
            }
        }
        if (System.currentTimeMillis() - file.lastModified() > hg4.j().i().getFileLastModifiedThreshold()) {
            this.j.a(yveVar);
        }
        if (g(yveVar)) {
            this.i.a(yveVar);
            TLog.loge(yr2.MODULE, yr2.MODULE, "onFileVisit: file info: " + yveVar);
        }
    }
}
