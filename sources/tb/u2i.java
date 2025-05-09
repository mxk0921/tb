package tb;

import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u2i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u2i INSTANCE = new u2i();

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, AppManifestDao> f29088a = new LruCache<>(10);

    static {
        t2o.a(839909837);
    }

    public final void a(List<String> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb8de5b", new Object[]{this, list});
            return;
        }
        f29088a.evictAll();
        StringBuilder sb = new StringBuilder("DELETE FROM cached_app_manifest2 WHERE appId NOT IN (");
        if (list == null) {
            str = null;
        } else {
            str = i04.j0(list, ",", null, null, 0, null, null, 62, null);
        }
        sb.append((Object) str);
        sb.append(')');
        String sb2 = sb.toString();
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) p8s.b(TMSDBAdapter.class);
        if (tMSDBAdapter != null) {
            tMSDBAdapter.execSQL(sb2);
        }
    }

    public final List<AppManifestDao> b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9ba7e759", new Object[]{this, new Long(j)});
        }
        String p = ckf.p("SELECT * FROM cached_app_manifest2 WHERE lastUsedTimeStamp>", Long.valueOf(j));
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) p8s.b(TMSDBAdapter.class);
        if (tMSDBAdapter == null) {
            return null;
        }
        return tMSDBAdapter.selectAppManifest(p);
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4dbe16", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        f29088a.remove(str);
        String str2 = "DELETE FROM cached_app_manifest2 WHERE appId='" + str + '\'';
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) p8s.b(TMSDBAdapter.class);
        if (tMSDBAdapter != null) {
            tMSDBAdapter.execSQL(str2);
        }
    }

    public final void d(AppManifestDao appManifestDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b49d78", new Object[]{this, appManifestDao});
            return;
        }
        ckf.g(appManifestDao, "manifestDao");
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) p8s.b(TMSDBAdapter.class);
        if (ckf.b(tMSDBAdapter == null ? null : Boolean.valueOf(tMSDBAdapter.insertAppManifest(appManifestDao)), Boolean.TRUE)) {
            f29088a.put(appManifestDao.getAppId(), appManifestDao);
        } else {
            TMSLogger.b("ManifestStorage", "saveManifest failed");
        }
    }

    public final AppManifestDao e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifestDao) ipChange.ipc$dispatch("e2762469", new Object[]{this, str});
        }
        ckf.g(str, "id");
        LruCache<String, AppManifestDao> lruCache = f29088a;
        AppManifestDao appManifestDao = lruCache.get(str);
        if (appManifestDao != null) {
            return (AppManifestDao) JSON.parseObject(JSON.toJSONString(appManifestDao), AppManifestDao.class);
        }
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) p8s.b(TMSDBAdapter.class);
        AppManifestDao appManifestDao2 = null;
        if (tMSDBAdapter == null) {
            return null;
        }
        if (!tMSDBAdapter.isReady()) {
            TMSLogger.b("ManifestStorage", "dbAdapter has not Ready");
            return null;
        }
        List<AppManifestDao> selectAppManifest = tMSDBAdapter.selectAppManifest(ckf.p("SELECT * FROM cached_app_manifest2 WHERE appId=", str));
        if (selectAppManifest != null) {
            appManifestDao2 = (AppManifestDao) i04.d0(selectAppManifest, 0);
        }
        if (appManifestDao2 != null) {
            lruCache.put(str, appManifestDao2);
        }
        return appManifestDao2;
    }
}
