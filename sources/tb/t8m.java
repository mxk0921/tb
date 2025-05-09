package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.plugininfo.storage.PluginInfoDao;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, PluginInfoDao> f28568a = new LruCache<>(10);
    public static t8m b;

    static {
        t2o.a(839909907);
    }

    public static synchronized t8m b() {
        synchronized (t8m.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t8m) ipChange.ipc$dispatch("591ac2f", new Object[0]);
            }
            if (b == null) {
                b = new t8m();
            }
            return b;
        }
    }

    public synchronized void a(String str, String str2) {
        TMSDBAdapter tMSDBAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e05b19", new Object[]{this, str, str2});
            return;
        }
        f28568a.remove(str);
        try {
            tMSDBAdapter = (TMSDBAdapter) p8s.b(TMSDBAdapter.class);
        } catch (Exception e) {
            TMSLogger.c("PluginInfoCenter", "deleteByIdAndVersion error", e);
        }
        if (tMSDBAdapter != null && tMSDBAdapter.isReady()) {
            tMSDBAdapter.execSQL("DELETE FROM cached_plugin_info WHERE pluginId='" + str + "' AND version='" + str2 + "'");
        }
    }

    public synchronized void c(PluginInfoDao pluginInfoDao) {
        TMSDBAdapter tMSDBAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeee2f7c", new Object[]{this, pluginInfoDao});
            return;
        }
        try {
            tMSDBAdapter = (TMSDBAdapter) p8s.b(TMSDBAdapter.class);
        } catch (Exception e) {
            TMSLogger.c("PluginInfoCenter", "insertOrUpdateInfo error", e);
        }
        if (tMSDBAdapter != null && tMSDBAdapter.isReady()) {
            List<PluginInfoDao> selectPluginInfo = tMSDBAdapter.selectPluginInfo("SELECT * FROM cached_plugin_info WHERE pluginId='" + pluginInfoDao.pluginId + "'");
            if (selectPluginInfo != null && selectPluginInfo.size() >= 3) {
                PluginInfoDao pluginInfoDao2 = selectPluginInfo.get(0);
                for (PluginInfoDao pluginInfoDao3 : selectPluginInfo) {
                    if (o9s.b(pluginInfoDao2.version, pluginInfoDao3.version) > 0) {
                        pluginInfoDao2 = pluginInfoDao3;
                    }
                }
                a(pluginInfoDao2.pluginId, pluginInfoDao2.version);
            }
            tMSDBAdapter.insertPluginInfo(pluginInfoDao);
        }
    }
}
