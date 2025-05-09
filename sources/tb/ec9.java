package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ec9 extends g22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f18469a = 0;
    public long b = 0;
    public final Map<String, Long> c = new HashMap();
    public final Map<String, Long> d = new HashMap();

    static {
        t2o.a(737149065);
    }

    public static /* synthetic */ Object ipc$super(ec9 ec9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cachecleaner/monitor/tracker/FileDifferTracker");
    }

    @Override // tb.st2.b
    public void a(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d1c4db", new Object[]{this, yveVar});
            return;
        }
        TLog.loge(yr2.MODULE, "FileDifferTracker", "onFileDeleted: deleted file " + yveVar.toString());
        this.b = this.b + yveVar.getSize();
        if (f(yveVar)) {
            i(this.c, yveVar, -yveVar.getSize());
        }
    }

    @Override // tb.st2.b
    public void b(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6edb02", new Object[]{this, yveVar});
            return;
        }
        TLog.loge(yr2.MODULE, "FileDifferTracker", "onFileAdded: added file " + yveVar.toString());
        this.f18469a = this.f18469a + yveVar.getSize();
        if (f(yveVar) && yveVar.getName() != null && !yveVar.getName().startsWith(".") && yveVar.getSize() > 3) {
            i(this.c, yveVar, yveVar.getSize());
        }
        if (yveVar.type() == 1 && yveVar.getSize() > hg4.j().i().getSizeIncreaseThreshold()) {
            i(this.d, yveVar, yveVar.getSize());
        }
    }

    @Override // tb.ot2.a
    public void d(File file, yve yveVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43775f3", new Object[]{this, file, yveVar, new Long(j)});
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
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_monitor_file_differ");
        uTHitBuilders$UTCustomHitBuilder.setProperty("is_new_install", String.valueOf(cacheOverviewInfo.getIsNewInstall()));
        uTHitBuilders$UTCustomHitBuilder.setProperty("increased_size", String.valueOf(this.f18469a));
        uTHitBuilders$UTCustomHitBuilder.setProperty("reduced_size", String.valueOf(this.b));
        uTHitBuilders$UTCustomHitBuilder.setProperty("biz_dir_differ_result", JSON.toJSONString(this.c));
        uTHitBuilders$UTCustomHitBuilder.setProperty("increase_file_list", JSON.toJSONString(this.d));
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    @Override // tb.st2.b
    public void c(yve yveVar, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d372155", new Object[]{this, yveVar, new Long(j)});
            return;
        }
        StringBuilder sb = new StringBuilder("onSizeDiffer: the size of ");
        if (yveVar.isDirectory()) {
            str = "directory";
        } else {
            str = "file";
        }
        sb.append(str);
        sb.append(yveVar.getName());
        sb.append(" has changed by ");
        sb.append(j);
        TLog.loge(yr2.MODULE, "FileDifferTracker", sb.toString());
        if (f(yveVar) && yveVar.getName() != null && !yveVar.getName().startsWith(".") && yveVar.getSize() > 3) {
            i(this.c, yveVar, j);
        }
        if (yveVar.type() == 1) {
            if (j < 0) {
                this.b -= j;
            } else {
                this.f18469a += j;
            }
        }
        if (yveVar.type() == 1 && j > hg4.j().i().getSizeIncreaseThreshold()) {
            i(this.d, yveVar, j);
        }
    }
}
