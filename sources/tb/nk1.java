package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.android.protodb.LSDB;
import com.taobao.message.disk.IStorageClearService;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nk1 implements mk1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(737148957);
        t2o.a(737148956);
    }

    @Override // tb.mk1
    public void a(int i, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75f4c7d", new Object[]{this, new Integer(i), cacheOverviewInfo});
            return;
        }
        long clearWaitTime = hg4.j().i().getClearWaitTime();
        HandlerThread handlerThread = new HandlerThread("AutoClearImplThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        yr2.b().c(hg4.j().h());
        handler.postDelayed(new a(cacheOverviewInfo, i, handlerThread), clearWaitTime);
    }

    public void b(int i, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2e1047", new Object[]{this, new Integer(i), cacheOverviewInfo});
        } else {
            d();
        }
    }

    public void c(int i, CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7ea61c", new Object[]{this, new Integer(i), cacheOverviewInfo});
        } else {
            d();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CacheOverviewInfo f24785a;
        public final /* synthetic */ int b;
        public final /* synthetic */ HandlerThread c;

        public a(CacheOverviewInfo cacheOverviewInfo, int i, HandlerThread handlerThread) {
            this.f24785a = cacheOverviewInfo;
            this.b = i;
            this.c = handlerThread;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    s71.a(this.f24785a, this.b, yr2.b().a() / 1024, -1L, System.currentTimeMillis() - currentTimeMillis, "clean_type_back_OLD");
                } catch (Exception e) {
                    TLog.loge(yr2.MODULE, "AutoClearImpl", "run: clear cache with exception " + e);
                }
            } finally {
                this.c.quitSafely();
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb1432d", new Object[]{this});
            return;
        }
        if (hg4.j().i().getEnableZcacheClear() && !hg4.j().p(hg4.BIZ_Z_CACHE)) {
            yox.a();
            hg4.j().q(hg4.BIZ_Z_CACHE);
        }
        if (hg4.j().i().getEnableVFSClear() && !hg4.j().p(hg4.BIZ_AVFS_CACHE)) {
            LSDB.compactAll();
            hg4.j().q(hg4.BIZ_AVFS_CACHE);
        }
        if (hg4.j().i().getEnableMsgClear() && !hg4.j().p(hg4.BIZ_MSG)) {
            try {
                IStorageClearService iStorageClearService = (IStorageClearService) GlobalContainer.getInstance().get(IStorageClearService.class);
                if (iStorageClearService != null) {
                    IStorageClearService.Options options = new IStorageClearService.Options();
                    options.daysAgo = 7;
                    options.mode = 1;
                    IStorageClearService.DeleteResult delete = iStorageClearService.delete(IStorageClearService.Keys.OUTER, options);
                    s71.h("msg_clear", delete.isSuccess, delete.size);
                }
                hg4.j().q(hg4.BIZ_MSG);
            } catch (Throwable th) {
                TLog.loge(yr2.MODULE, "AutoClearImpl", "backgroundClear: clear msg cache with " + th);
            }
        }
    }
}
