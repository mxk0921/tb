package com.taobao.themis.inside.adapter;

import android.app.Application;
import android.text.TextUtils;
import com.ali.alidatabasees.CallableStatement;
import com.ali.alidatabasees.DBConfig;
import com.ali.alidatabasees.Database;
import com.ali.alidatabasees.PreparedStatement;
import com.ali.alidatabasees.Property;
import com.ali.alidatabasees.ResultSet;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.plugininfo.storage.PluginInfoDao;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;
import tb.gcn;
import tb.p8s;
import tb.q9s;
import tb.t2o;
import tb.vbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBDBProxyImpl implements TMSDBAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBDBProxyImpl";
    public static final TBDBProxyImpl d = new TBDBProxyImpl();

    /* renamed from: a  reason: collision with root package name */
    public DBConfig f13524a;
    public Database b;
    public TMSDBAdapter c;

    static {
        t2o.a(837812267);
        t2o.a(839909529);
    }

    public TBDBProxyImpl() {
        init();
    }

    public static TBDBProxyImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBDBProxyImpl) ipChange.ipc$dispatch("5e6f51ae", new Object[0]);
        }
        return d;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean execSQL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8434252", new Object[]{this, str})).booleanValue();
        }
        TMSDBAdapter tMSDBAdapter = this.c;
        if (tMSDBAdapter != null) {
            return tMSDBAdapter.execSQL(str);
        }
        Database database = this.b;
        if (database == null) {
            vbs.d("ThemisDbError", "execSQL when init fail", null);
            TMSLogger.b(TAG, "execSQL but Db is null");
            return false;
        }
        CallableStatement c = database.c(str);
        if (c == null || c.d() == null) {
            return false;
        }
        return true;
    }

    public synchronized void init() {
        Database database;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        TMSLogger.b(TAG, "start init");
        Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(applicationContext.getFilesDir());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(TMSCalendarBridge.namespace);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        DBConfig dBConfig = new DBConfig(file.getAbsolutePath() + str2 + "appinfodatabase.db");
        this.f13524a = dBConfig;
        dBConfig.setProperty(Property.Key, "themis666");
        Database d2 = Database.d(this.f13524a);
        this.b = d2;
        if (d2 != null) {
            if (q9s.l1()) {
                database = this.b;
                str = TMSDBAdapter.CREATE_APP_INFO_TABLE_SQL;
            } else {
                database = this.b;
                str = TMSDBAdapter.CREATE_APP_INFO_TABLE_SQL_OLD;
            }
            CallableStatement c = database.c(str);
            if (c != null) {
                c.d();
            }
            CallableStatement c2 = this.b.c(TMSDBAdapter.CREATE_PLUGIN_INFO_TABLE_SQL);
            if (c2 != null) {
                c2.d();
            }
            CallableStatement c3 = this.b.c(TMSDBAdapter.CREATE_APP_MANIFEST_TABLE_SQL);
            if (c3 != null) {
                c3.d();
            }
            TMSLogger.b(TAG, "finish init");
        }
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertAppInfo(AppInfoDao appInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("407e8ab9", new Object[]{this, appInfoDao})).booleanValue();
        }
        try {
            TMSLogger.a(TAG, "before insertAppInfo");
            String str = "'" + JSON.toJSONString(appInfoDao.appInfo) + "'";
            String str2 = appInfoDao.templateId;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            String str4 = appInfoDao.version;
            if (str4 == null) {
                str4 = str3;
            }
            String str5 = appInfoDao.type;
            if (str5 == null) {
                str5 = str3;
            }
            String str6 = appInfoDao.extra;
            if (str6 != null) {
                str3 = str6;
            }
            return execSQL("REPLACE INTO " + q9s.Y2() + "(appId, lastUsedTimeStamp, lastRequestTimeStamp, version, templateId, appInfo, type, extra) VALUES('" + appInfoDao.appId + "', " + appInfoDao.lastUsedTimeStamp + ", " + appInfoDao.lastRequestTimeStamp + ", '" + str4 + "', '" + str2 + "', " + str + ", '" + str5 + "', '" + str3 + "')");
        } catch (Throwable th) {
            TMSLogger.c(TAG, "insert error", th);
            return false;
        }
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertAppManifest(AppManifestDao appManifestDao) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe7682f1", new Object[]{this, appManifestDao})).booleanValue();
        }
        try {
            TMSLogger.a(TAG, "insertAppManifest");
            String str2 = "'" + JSON.toJSONString(appManifestDao.getAppManifest()) + "'";
            if (appManifestDao.getVersion() == null) {
                str = "";
            } else {
                str = appManifestDao.getVersion();
            }
            return execSQL("REPLACE INTO cached_app_manifest2(appId, lastUsedTimeStamp, lastRequestTimeStamp, version, appManifest) VALUES('" + appManifestDao.getAppId() + "', " + appManifestDao.getLastUsedTimeStamp() + ", " + appManifestDao.getLastRequestTimeStamp() + ", '" + str + "'," + str2 + f7l.BRACKET_END_STR);
        } catch (Throwable th) {
            TMSLogger.c(TAG, "insert error", th);
            return false;
        }
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertPluginInfo(PluginInfoDao pluginInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df4b5539", new Object[]{this, pluginInfoDao})).booleanValue();
        }
        try {
            String str = "'" + JSON.toJSONString(pluginInfoDao.pluginInfo) + "'";
            String str2 = pluginInfoDao.version;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            String str4 = pluginInfoDao.type;
            if (str4 == null) {
                str4 = str3;
            }
            String str5 = pluginInfoDao.extra;
            if (str5 != null) {
                str3 = str5;
            }
            return execSQL("REPLACE INTO cached_plugin_info(pluginId, lastUsedTimeStamp, lastRequestTimeStamp, version, pluginInfo, type, extra) VALUES('" + pluginInfoDao.pluginId + "', " + pluginInfoDao.lastUsedTimeStamp + ", " + pluginInfoDao.lastRequestTimeStamp + ", '" + str2 + "', " + str + ", '" + str4 + "', '" + str3 + "')");
        } catch (Throwable th) {
            TMSLogger.c(TAG, "insert error", th);
            return false;
        }
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public List<AppInfoDao> selectAppInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("61b51a3", new Object[]{this, str});
        }
        TMSDBAdapter tMSDBAdapter = this.c;
        if (tMSDBAdapter != null) {
            return tMSDBAdapter.selectAppInfo(str);
        }
        Database database = this.b;
        if (database == null) {
            TMSLogger.b(TAG, "selectAppInfo but Db is null");
            vbs.d("ThemisDbError", "selectAppInfo when init fail", null);
            return null;
        }
        PreparedStatement e = database.e(str);
        TMSLogger.a(TAG, "before selectAppInfo");
        if (e == null) {
            return null;
        }
        ResultSet c = e.c();
        TMSLogger.a(TAG, "finish selectAppInfo");
        if (c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (c.i()) {
            AppInfoDao appInfoDao = new AppInfoDao();
            String h = c.h("appId");
            long f = c.f("lastUsedTimeStamp");
            long f2 = c.f("lastRequestTimeStamp");
            String h2 = c.h("version");
            String h3 = c.h(RVConstants.EXTRA_APPINFO);
            String h4 = c.h("templateId");
            String h5 = c.h("type");
            String h6 = c.h("extra");
            appInfoDao.appId = h;
            appInfoDao.templateId = h4;
            appInfoDao.version = h2;
            appInfoDao.lastRequestTimeStamp = f2;
            appInfoDao.lastUsedTimeStamp = f;
            appInfoDao.extra = h6;
            appInfoDao.type = h5;
            if (!TextUtils.isEmpty(h3)) {
                appInfoDao.appInfo = (AppModel) JSON.parseObject(h3, AppModel.class);
            }
            arrayList.add(appInfoDao);
        }
        return arrayList;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public List<AppManifestDao> selectAppManifest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e1289f42", new Object[]{this, str});
        }
        TMSDBAdapter tMSDBAdapter = this.c;
        if (tMSDBAdapter != null) {
            return tMSDBAdapter.selectAppManifest(str);
        }
        if (this.b == null) {
            TMSLogger.b(TAG, "selectAppManifest but Db is null");
            vbs.d("ThemisDbError", "selectAppManifest when init fail", null);
            return null;
        }
        TMSLogger.a(TAG, "before selectAppManifest");
        PreparedStatement e = this.b.e(str);
        if (e == null) {
            return null;
        }
        ResultSet c = e.c();
        TMSLogger.a(TAG, "after selectAppManifest");
        if (c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (c.i()) {
            AppManifestDao appManifestDao = new AppManifestDao();
            String h = c.h("appId");
            long f = c.f("lastUsedTimeStamp");
            long f2 = c.f("lastRequestTimeStamp");
            String h2 = c.h("version");
            String h3 = c.h("appManifest");
            appManifestDao.setAppId(h);
            appManifestDao.setVersion(h2);
            appManifestDao.setLastRequestTimeStamp(f2);
            appManifestDao.setLastUsedTimeStamp(f);
            if (!TextUtils.isEmpty(h3)) {
                appManifestDao.setAppManifest((AppManifest) JSON.parseObject(h3, AppManifest.class));
            }
            arrayList.add(appManifestDao);
        }
        return arrayList;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public List<PluginInfoDao> selectPluginInfo(String str) {
        PreparedStatement e;
        ResultSet c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bcec1519", new Object[]{this, str});
        }
        TMSDBAdapter tMSDBAdapter = this.c;
        if (tMSDBAdapter != null) {
            return tMSDBAdapter.selectPluginInfo(str);
        }
        Database database = this.b;
        if (database == null || (e = database.e(str)) == null || (c = e.c()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (c.i()) {
            PluginInfoDao pluginInfoDao = new PluginInfoDao();
            long f = c.f("id");
            String h = c.h(gcn.PLUGIN_ID);
            long f2 = c.f("lastUsedTimeStamp");
            long f3 = c.f("lastRequestTimeStamp");
            String h2 = c.h("version");
            String h3 = c.h("pluginInfo");
            String h4 = c.h("type");
            String h5 = c.h("extra");
            pluginInfoDao.id = f;
            pluginInfoDao.pluginId = h;
            pluginInfoDao.version = h2;
            pluginInfoDao.lastRequestTimeStamp = f3;
            pluginInfoDao.lastUsedTimeStamp = f2;
            pluginInfoDao.extra = h5;
            pluginInfoDao.type = h4;
            if (!TextUtils.isEmpty(h3)) {
                pluginInfoDao.pluginInfo = (PluginModel) JSON.parseObject(h3, PluginModel.class);
            }
            arrayList.add(pluginInfoDao);
        }
        return arrayList;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public synchronized boolean isReady() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
            }
            TMSDBAdapter tMSDBAdapter = this.c;
            if (tMSDBAdapter != null) {
                return tMSDBAdapter.isReady();
            } else if (this.b != null) {
                return true;
            } else {
                TMSLogger.b(TAG, "init when check is Ready");
                Database d2 = Database.d(this.f13524a);
                this.b = d2;
                if (d2 == null) {
                    vbs.d("ThemisDbError", "isReady check fail", null);
                }
                if (this.b != null) {
                    z = true;
                }
                return z;
            }
        }
    }
}
