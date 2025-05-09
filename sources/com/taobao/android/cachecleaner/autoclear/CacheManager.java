package com.taobao.android.cachecleaner.autoclear;

import android.content.Context;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.config.RuleConfig;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.c21;
import tb.ey1;
import tb.hg4;
import tb.jaq;
import tb.mk1;
import tb.nk1;
import tb.s71;
import tb.t2o;
import tb.u11;
import tb.yr2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6493a;
    public final mk1 b = new nk1();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface TriggerState {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6494a;
        public final /* synthetic */ CacheOverviewInfo b;

        public a(int i, CacheOverviewInfo cacheOverviewInfo) {
            this.f6494a = i;
            this.b = cacheOverviewInfo;
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                c21.k(this);
                try {
                    CacheManager.a(CacheManager.this).a(this.f6494a, this.b);
                } catch (Throwable th) {
                    TLog.loge(yr2.MODULE, "CacheManager", "onEvent: background cache clear witch exception " + th);
                }
            }
        }
    }

    static {
        t2o.a(737148960);
    }

    public CacheManager(Context context) {
        this.f6493a = context;
    }

    public static /* synthetic */ mk1 a(CacheManager cacheManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mk1) ipChange.ipc$dispatch("b898cc2e", new Object[]{cacheManager});
        }
        return cacheManager.b;
    }

    public final void b(CacheOverviewInfo cacheOverviewInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("851932d4", new Object[]{this, cacheOverviewInfo, new Integer(i)});
            return;
        }
        c21.c(new a(i, cacheOverviewInfo));
        TLog.loge(yr2.MODULE, "CacheManager", "autoClear: register switch background listener success.");
        jaq.c(this.f6493a, System.currentTimeMillis());
    }

    public final void c(CacheOverviewInfo cacheOverviewInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4769c8a9", new Object[]{this, cacheOverviewInfo, new Integer(i)});
            return;
        }
        try {
            ((nk1) this.b).b(i, cacheOverviewInfo);
        } catch (Throwable th) {
            TLog.loge(yr2.MODULE, "CacheManager", "autoClear: clear implement with exception " + th);
        }
        jaq.c(this.f6493a, System.currentTimeMillis());
        e(i, cacheOverviewInfo, "clean_type_front_OLD");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo r18, java.util.Map<java.lang.String, java.lang.Long> r19) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.cachecleaner.autoclear.CacheManager.d(com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo, java.util.Map):void");
    }

    public final void e(int i, CacheOverviewInfo cacheOverviewInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb8d36d", new Object[]{this, new Integer(i), cacheOverviewInfo, str});
        } else if (cacheOverviewInfo == null) {
            TLog.loge(yr2.MODULE, "CacheManager", "commitMonitor: basic info is empty, exit!");
        } else {
            try {
                StatFs statFs = new StatFs(this.f6493a.getCacheDir().getParentFile().getAbsolutePath());
                long blockSize = statFs.getBlockSize() * (statFs.getAvailableBlocks() / 1024);
                long availableSize = blockSize - cacheOverviewInfo.getAvailableSize();
                s71.b(cacheOverviewInfo, i, availableSize, blockSize, str);
                TLog.loge(yr2.MODULE, "CacheManager", "commitMonitor: clear cache complete, clear cache size " + availableSize + "KB");
            } catch (Throwable th) {
                TLog.loge(yr2.MODULE, "CacheManager", "commitMonitor: commit app monitor with exception " + th);
            }
        }
    }

    public final long f(File file, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("240472d7", new Object[]{this, file, new Integer(i)})).longValue();
        }
        long j = 0;
        if (i > hg4.j().i().getMaxDeepLevel()) {
            TLog.loge(yr2.MODULE, "CacheManager", "deleteDir: level too deep, exit!");
            return 0L;
        } else if (!file.exists() || !file.isDirectory()) {
            TLog.loge(yr2.MODULE, "CacheManager", "deleteDir: targetDir is not exist.");
            return 0L;
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        j += f(file2, i + 1);
                    } else {
                        long length = file2.length();
                        if (file2.delete()) {
                            j += length;
                        }
                    }
                }
            }
            if (!file.delete()) {
                TLog.loge(yr2.MODULE, "CacheManager", "deleteDir: failed to delete directory " + file.getName());
            }
            return j;
        }
    }

    public long g(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99dfb689", new Object[]{this, list})).longValue();
        }
        long j = 0;
        if (list != null && !list.isEmpty()) {
            String absolutePath = this.f6493a.getCacheDir().getParentFile().getAbsolutePath();
            for (String str : list) {
                File file = new File(absolutePath, str);
                if (file.exists() && System.currentTimeMillis() - file.lastModified() >= hg4.j().i().getFileLastModifiedThreshold()) {
                    if (file.isDirectory()) {
                        j += f(file, 0);
                    } else {
                        long length = file.length();
                        if (file.delete()) {
                            j += length;
                        }
                    }
                }
            }
        }
        return j;
    }

    public int h(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f217d7c", new Object[]{this, cacheOverviewInfo})).intValue();
        }
        RuleConfig i = hg4.j().i();
        if (cacheOverviewInfo == null) {
            TLog.loge(yr2.MODULE, "CacheManager", "trigger: basicInfo is empty, return false!");
            return 0;
        }
        long availableSize = cacheOverviewInfo.getAvailableSize();
        if (!cacheOverviewInfo.getIsNewInstall() && availableSize > 0 && availableSize < i.getAvailableSizeThreshold()) {
            return 1;
        }
        long totalSize = cacheOverviewInfo.getTotalSize();
        if (!cacheOverviewInfo.getIsNewInstall() && availableSize > 0 && totalSize > 0 && availableSize / totalSize < i.getAvailableSizeRateThreshold()) {
            return 3;
        }
        long totalUsedSize = cacheOverviewInfo.getTotalUsedSize();
        long appDataSize = cacheOverviewInfo.getAppDataSize();
        if (totalUsedSize > i.getOccupationSizeThreshold() || appDataSize > i.getOccupationSizeThreshold()) {
            return 2;
        }
        return new File(ey1.SWITCH_FILE_DIR, ey1.SWITCH_FILE_NAME).exists() ? 1 : 0;
    }
}
