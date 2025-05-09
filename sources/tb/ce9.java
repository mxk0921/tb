package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.cachecleaner.monitor.info.node.FileNodeNew;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ce9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_BASE_DIR_NAME = "databases";
    public static final String EVENT_LABEL = "storage_monitor";
    public static final String EVENT_PAGE_PREFIX = "cache_monitor_";
    public static final String SHARED_PREFERENCE_DIR_NAME = "shared_prefs";

    /* renamed from: a  reason: collision with root package name */
    public int f17015a = 0;
    public int b = 0;
    public int c = 0;
    public long d = 0;
    public int e = 0;
    public final Map<String, Long> f = new HashMap();
    public final Map<String, Long> g = new HashMap();
    public final Map<String, Long> h = new HashMap();
    public final u9q<FileNodeNew> i = new u9q<>();
    public final u9q<FileNodeNew> j = new u9q<>();
    public final u9q<FileNodeNew> k = new u9q<>();
    public final u9q<FileNodeNew> l = new u9q<>();
    public final u9q<FileNodeNew> m = new u9q<>();
    public final u9q<FileNodeNew> n = new u9q<>();
    public final u9q<FileNodeNew> o = new u9q<>();
    public final FileNodeNew p;

    static {
        t2o.a(737149069);
    }

    public ce9() {
        Path path;
        path = new File("other").toPath();
        this.p = new FileNodeNew(path, null, 0L);
    }

    public Map<String, Long> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ba770548", new Object[]{this});
        }
        return this.g;
    }

    public void b(Path path, BasicFileAttributes basicFileAttributes, long j) {
        Path parent;
        boolean equals;
        String path2;
        boolean equals2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25c111b4", new Object[]{this, path, basicFileAttributes, new Long(j)});
            return;
        }
        parent = path.getParent();
        wul a2 = wul.a();
        if (parent != null) {
            equals = parent.equals(a2.b());
            if (!equals) {
                equals2 = parent.equals(a2.c());
                if (!equals2) {
                    return;
                }
            }
            Path g = a2.g(path);
            if (g != null) {
                Map<String, Long> map = this.g;
                path2 = g.toString();
                ((HashMap) map).put(path2, Long.valueOf(j >> 10));
            }
            this.i.a(new FileNodeNew(path, basicFileAttributes, j));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r2 != false) goto L_0x0048;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.nio.file.Path r6, java.nio.file.attribute.BasicFileAttributes r7, long r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ce9.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0020
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r8)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r5
            r8[r0] = r6
            r6 = 2
            r8[r6] = r7
            r6 = 3
            r8[r6] = r3
            java.lang.String r6 = "ace723e1"
            r2.ipc$dispatch(r6, r8)
            return
        L_0x0020:
            java.nio.file.Path r2 = tb.bd9.a(r6)
            tb.wul r3 = tb.wul.a()
            if (r2 == 0) goto L_0x0049
            java.nio.file.Path r4 = r3.e()
            boolean r4 = tb.be9.a(r2, r4)
            if (r4 != 0) goto L_0x0048
            java.nio.file.Path r4 = r3.d()
            boolean r4 = tb.be9.a(r2, r4)
            if (r4 != 0) goto L_0x0048
            java.nio.file.Path r4 = r3.f()
            boolean r2 = tb.be9.a(r2, r4)
            if (r2 == 0) goto L_0x0049
        L_0x0048:
            r1 = 1
        L_0x0049:
            tb.hg4 r2 = tb.hg4.j()
            com.taobao.android.cachecleaner.monitor.config.RuleConfig r2 = r2.i()
            if (r1 == 0) goto L_0x0094
            int r1 = r5.e
            int r1 = r1 + r0
            r5.e = r1
            java.nio.file.Path r0 = r3.g(r6)
            if (r0 == 0) goto L_0x0071
            java.util.Map<java.lang.String, java.lang.Long> r1 = r5.g
            java.lang.String r0 = tb.ue9.a(r0)
            r3 = 10
            long r3 = r8 >> r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r0, r3)
        L_0x0071:
            long r0 = r2.getMaxReportSize()
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x008a
            com.taobao.android.cachecleaner.monitor.info.node.FileNodeNew r0 = new com.taobao.android.cachecleaner.monitor.info.node.FileNodeNew
            r0.<init>(r6, r7, r8)
            java.lang.String r7 = r0.getName()
            if (r7 == 0) goto L_0x0094
            tb.u9q<com.taobao.android.cachecleaner.monitor.info.node.FileNodeNew> r7 = r5.m
            r7.a(r0)
            goto L_0x0094
        L_0x008a:
            com.taobao.android.cachecleaner.monitor.info.node.FileNodeNew r7 = r5.p
            long r0 = r7.getSize()
            long r0 = r0 + r8
            r7.setSize(r0)
        L_0x0094:
            long r0 = r2.getHugeBizDirSizeThreshold()
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a1
            java.util.Map<java.lang.String, java.lang.Long> r7 = r5.h
            r5.e(r7, r6, r8)
        L_0x00a1:
            java.nio.file.Path r6 = tb.xc9.a(r6)
            java.lang.String r6 = tb.ue9.a(r6)
            java.lang.String r7 = "DAI"
            boolean r6 = android.text.TextUtils.equals(r7, r6)
            if (r6 == 0) goto L_0x00b6
            r6 = 1024(0x400, double:5.06E-321)
            long r8 = r8 / r6
            r5.d = r8
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ce9.d(java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, long):void");
    }

    public final void e(Map<String, Long> map, Path path, long j) {
        Path g;
        Path parent;
        String path2;
        String path3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ce8af0", new Object[]{this, map, path, new Long(j)});
            return;
        }
        List<String> bizWhiteList = hg4.j().i().getBizWhiteList();
        if (bizWhiteList != null && (g = wul.a().g(path)) != null) {
            parent = g.getParent();
            path2 = parent.toString();
            if (!bizWhiteList.contains(path2)) {
                return;
            }
            if (map.size() <= hg4.j().i().getMaxFilesSize()) {
                TLog.logd(yr2.MODULE, "CacheCleanerNew", "put2Map: map is too full, drop node " + path2 + ", differ size " + j);
                return;
            }
            path3 = g.toString();
            map.put(path3, Long.valueOf(j));
        }
    }

    public void f(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69dff9c", new Object[]{this, cacheOverviewInfo});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_monitor_file_status");
        HashMap hashMap = new HashMap();
        hashMap.put("is_new_install", String.valueOf(cacheOverviewInfo.getIsNewInstall()));
        hashMap.put("file_num", String.valueOf(this.f17015a));
        hashMap.put("biz_dir_num", String.valueOf(this.e));
        this.m.a(this.p);
        hashMap.put("biz_dir_list", this.m.c());
        uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
        new StringBuilder("Tracker.Page=cache_monitor_file_status.params=").append(hashMap);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder2 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder2.setEventPage("cache_monitor_sp_files");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sp_file_num", String.valueOf(this.b));
        hashMap2.put("large_sp_file_list", this.k.c());
        uTHitBuilders$UTCustomHitBuilder2.setProperties(hashMap2);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder2.build());
        new StringBuilder("Tracker.Page=cache_monitor_sp_files.params=").append(hashMap2);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder3 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder3.setEventPage("cache_monitor_large_files");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("large_file_num", String.valueOf(this.j.b()));
        hashMap3.put("large_file_list", this.j.c());
        uTHitBuilders$UTCustomHitBuilder3.setProperties(hashMap3);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder3.build());
        new StringBuilder("Tracker.Page=cache_monitor_large_files.params=").append(hashMap3);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder4 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder4.setEventPage("cache_monitor_database_files");
        HashMap hashMap4 = new HashMap();
        hashMap4.put("data_base_num", String.valueOf(this.c));
        hashMap4.put("database_file_list", this.l.c());
        uTHitBuilders$UTCustomHitBuilder4.setProperties(hashMap4);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder4.build());
        new StringBuilder("Tracker.Page=cache_monitor_database_files.params=").append(hashMap4);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder5 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder5.setEventPage("cache_monitor_no_modified_files");
        HashMap hashMap5 = new HashMap();
        hashMap5.put("long_time_no_modified_file_list", this.o.c());
        uTHitBuilders$UTCustomHitBuilder5.setProperties(hashMap5);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder5.build());
        new StringBuilder("Tracker.Page=cache_monitor_no_modified_files.params=").append(hashMap5);
        if (!((HashMap) this.f).isEmpty() || !((HashMap) this.h).isEmpty()) {
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder6 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
            uTHitBuilders$UTCustomHitBuilder6.setEventPage("cache_monitor_huge_file_status");
            HashMap hashMap6 = new HashMap();
            hashMap6.put("huge_file_list", JSON.toJSONString(this.f));
            hashMap6.put("biz_sub_file_list", JSON.toJSONString(this.h));
            uTHitBuilders$UTCustomHitBuilder6.setProperties(hashMap6);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder6.build());
            new StringBuilder("Tracker.Page=cache_monitor_huge_file_status.params=").append(hashMap6);
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder7 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder7.setEventPage("cache_monitor_mnn_file");
        HashMap hashMap7 = new HashMap();
        hashMap7.put("total_used_size", cacheOverviewInfo.getTotalUsedSize() + "");
        hashMap7.put("dir_DAI_size", this.d + "");
        uTHitBuilders$UTCustomHitBuilder7.setProperties(hashMap7);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder7.build());
        new StringBuilder("Tracker.Page=cache_monitor_mnn_file.params=").append(hashMap7);
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder8 = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
        uTHitBuilders$UTCustomHitBuilder8.setEventPage("cache_monitor_ext_cache");
        HashMap hashMap8 = new HashMap();
        hashMap8.put("is_new_install", String.valueOf(cacheOverviewInfo.getIsNewInstall()));
        hashMap8.put("ex_biz_dir_info_list", this.i.c());
        uTHitBuilders$UTCustomHitBuilder8.setProperties(hashMap8);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder8.build());
        new StringBuilder("Tracker.Page=cache_monitor_ext_cache.params=").append(hashMap8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (r0 != false) goto L_0x00dc;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.nio.file.Path r13, java.nio.file.attribute.BasicFileAttributes r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ce9.c(java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes):void");
    }
}
