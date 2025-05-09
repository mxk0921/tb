package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s51 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, AppInfoDao> f27803a = new LruCache<>(10);
    public static s51 b;

    static {
        t2o.a(839909801);
    }

    public static boolean a(String str, String str2, AppInfoDao appInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2e15095", new Object[]{str, str2, appInfoDao})).booleanValue();
        }
        if (appInfoDao == null) {
            return false;
        }
        if (!TextUtils.isEmpty(str) && !"*".equals(str) && !TextUtils.equals(str, appInfoDao.version)) {
            return false;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, appInfoDao.templateId)) {
            return true;
        }
        return false;
    }

    public static synchronized s51 c() {
        synchronized (s51.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s51) ipChange.ipc$dispatch("ffd67333", new Object[0]);
            }
            if (b == null) {
                b = new s51();
            }
            return b;
        }
    }

    public synchronized void b(List<String> list) {
        TMSDBAdapter tMSDBAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35d1945", new Object[]{this, list});
            return;
        }
        try {
            LruCache<String, AppInfoDao> lruCache = f27803a;
            if (lruCache != null) {
                lruCache.evictAll();
            }
            tMSDBAdapter = (TMSDBAdapter) p8s.g(TMSDBAdapter.class);
        } catch (Exception e) {
            TMSLogger.c("AppInfoStorage", "clearUnusedExcept error", e);
        }
        if (tMSDBAdapter.isReady()) {
            StringBuilder sb = new StringBuilder();
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    sb.append("'");
                    sb.append(it.next());
                    sb.append("'");
                    if (it.hasNext()) {
                        sb.append(",");
                    }
                }
            }
            tMSDBAdapter.execSQL("DELETE FROM " + q9s.Y2() + " WHERE appId NOT IN (" + ((Object) sb) + f7l.BRACKET_END_STR);
        }
    }

    public synchronized void d(AppInfoDao appInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1b62b2", new Object[]{this, appInfoDao});
            return;
        }
        f27803a.put(appInfoDao.appId, appInfoDao);
        try {
            TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) p8s.g(TMSDBAdapter.class);
            if (tMSDBAdapter.isReady()) {
                tMSDBAdapter.insertAppInfo(appInfoDao);
            }
        } catch (Exception e) {
            TMSLogger.c("AppInfoStorage", "deleteById error", e);
        }
    }

    public synchronized AppInfoDao e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoDao) ipChange.ipc$dispatch("30281089", new Object[]{this, str, str2});
        }
        return f(str, str2, "");
    }

    public synchronized AppInfoDao f(String str, String str2, String str3) {
        LruCache<String, AppInfoDao> lruCache;
        AppInfoDao appInfoDao;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoDao) ipChange.ipc$dispatch("5629a23f", new Object[]{this, str, str2, str3});
        }
        try {
            TMSLogger.a("AppInfoStorage", "enter selectInfo [" + str + "]");
            lruCache = f27803a;
            appInfoDao = lruCache.get(str);
        } catch (Exception e) {
            TMSLogger.c("AppInfoStorage", "selectInfoById error", e);
        }
        if (a(str2, str3, appInfoDao)) {
            AppInfoDao appInfoDao2 = (AppInfoDao) JSON.parseObject(JSON.toJSONString(appInfoDao), AppInfoDao.class);
            TMSLogger.a("AppInfoStorage", "get ram cache[" + str + "]");
            return appInfoDao2;
        }
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) p8s.g(TMSDBAdapter.class);
        if (!tMSDBAdapter.isReady()) {
            return null;
        }
        String str4 = "SELECT * FROM " + q9s.Y2() + " WHERE appId='" + str + "'";
        if (!TextUtils.isEmpty(str2) && !"*".equals(str2)) {
            str4 = str4 + " AND version='" + str2 + "'";
        }
        if (!TextUtils.isEmpty(str3)) {
            str4 = str4 + " AND templateId='" + str3 + "'";
        }
        List<AppInfoDao> selectAppInfo = tMSDBAdapter.selectAppInfo(str4 + " ORDER BY lastRequestTimeStamp DESC");
        if (selectAppInfo != null && !selectAppInfo.isEmpty()) {
            appInfoDao = selectAppInfo.get(0);
            TMSLogger.a("AppInfoStorage", "get appInfo [" + str + "]");
        }
        if (appInfoDao != null) {
            lruCache.put(str, appInfoDao);
            if (a(str2, str3, appInfoDao)) {
                return appInfoDao;
            }
            TMSLogger.a("AppInfoStorage", str + " don't hit DBCache, version or templateid is different!");
            return null;
        }
        return null;
    }
}
