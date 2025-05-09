package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.ot2;
import tb.st2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class g22 implements ot2.b, ot2.a, st2.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_BASE_DIR_NAME = "databases";
    public static final String EVENT_LABEL = "storage_monitor";
    public static final String EVENT_PAGE_PREFIX = "cache_monitor_";
    public static final String SHARED_PREFERENCE_DIR_NAME = "shared_prefs";

    static {
        t2o.a(737149062);
        t2o.a(737149052);
        t2o.a(737149051);
        t2o.a(737149057);
    }

    public boolean f(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2dc2185", new Object[]{this, yveVar})).booleanValue();
        }
        if (yveVar.isDirectory()) {
            return h(yveVar.parent());
        }
        return false;
    }

    public boolean g(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb5a01e6", new Object[]{this, yveVar})).booleanValue();
        }
        if (!yveVar.isDirectory()) {
            return h(yveVar.parent());
        }
        return false;
    }

    public boolean h(yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e26d8f43", new Object[]{this, yveVar})).booleanValue();
        }
        if (yveVar == null) {
            return false;
        }
        if (TextUtils.equals(yveVar.getName(), vs3.h()) || TextUtils.equals(yveVar.path(), vs3.g()) || TextUtils.equals(yveVar.path(), vs3.i())) {
            return true;
        }
        return false;
    }

    public void i(Map<String, Long> map, yve yveVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b395b339", new Object[]{this, map, yveVar, new Long(j)});
            return;
        }
        String path = yveVar.path();
        if (map.size() > hg4.j().i().getMaxFilesSize()) {
            TLog.logd(yr2.MODULE, "BaseTracker", "put2Map: map is too full, drop node " + yveVar + ", differ size " + j);
            return;
        }
        if (path == null) {
            path = "UNKNOWN";
        }
        map.put(path, Long.valueOf(j));
    }

    public abstract void j(CacheOverviewInfo cacheOverviewInfo);
}
