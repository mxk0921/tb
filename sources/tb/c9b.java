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
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c9b extends g22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Long> f16924a = new HashMap();
    public final Map<String, Long> b = new HashMap();

    static {
        t2o.a(737149067);
    }

    public static /* synthetic */ Object ipc$super(c9b c9bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/cachecleaner/monitor/tracker/HugeFileTracker");
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
        } else if (yveVar.getSize() > hg4.j().i().getHugeBizDirSizeThreshold() && k(yveVar)) {
            i(this.b, yveVar, yveVar.getSize());
        }
    }

    @Override // tb.ot2.b
    public void e(File file, yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb69a004", new Object[]{this, file, yveVar});
            return;
        }
        if (file.length() > hg4.j().i().getHugeFileSizeThreshold()) {
            i(this.f16924a, yveVar, yveVar.getSize());
            TLog.loge(yr2.MODULE, yr2.MODULE, "onFileVisit: found a huge file " + yveVar);
        }
        if (k(yveVar)) {
            i(this.b, yveVar, yveVar.getSize());
        }
    }

    @Override // tb.g22
    public void j(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69dff9c", new Object[]{this, cacheOverviewInfo});
        } else if (!((HashMap) this.f16924a).isEmpty() || !((HashMap) this.b).isEmpty()) {
            UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("storage_monitor");
            uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_monitor_huge_file_status");
            HashMap hashMap = new HashMap();
            hashMap.put("huge_file_list", JSON.toJSONString(this.f16924a));
            hashMap.put("biz_sub_file_list", JSON.toJSONString(this.b));
            uTHitBuilders$UTCustomHitBuilder.setProperties(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
            new StringBuilder("Tracker.Page=cache_monitor_huge_file_status.params=").append(hashMap);
        }
    }

    public final boolean k(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f82b90", new Object[]{this, yveVar})).booleanValue();
        }
        List<String> bizWhiteList = hg4.j().i().getBizWhiteList();
        yve parent = yveVar.parent();
        if (parent == null || parent.getName() == null || bizWhiteList == null) {
            return false;
        }
        return bizWhiteList.contains(parent.path());
    }
}
