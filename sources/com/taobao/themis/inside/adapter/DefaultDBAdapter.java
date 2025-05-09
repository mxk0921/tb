package com.taobao.themis.inside.adapter;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao;
import com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao;
import com.taobao.themis.kernel.plugininfo.storage.PluginInfoDao;
import java.util.ArrayList;
import java.util.List;
import tb.f7l;
import tb.gcn;
import tb.p8s;
import tb.q9s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DefaultDBAdapter implements TMSDBAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f13520a = new a(((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext());

    static {
        t2o.a(837812255);
        t2o.a(839909529);
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public synchronized boolean execSQL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8434252", new Object[]{this, str})).booleanValue();
        }
        if (this.f13520a.getWritableDatabase() != null) {
            try {
                this.f13520a.getWritableDatabase().execSQL(str);
                this.f13520a.close();
                return true;
            } catch (Exception e) {
                TMSLogger.c(":DefaultDBAdapter", "DefDBProxy execSQL error", e);
                this.f13520a.close();
            }
        }
        return false;
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertAppInfo(AppInfoDao appInfoDao) {
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("407e8ab9", new Object[]{this, appInfoDao})).booleanValue();
        }
        String jSONString = JSON.toJSONString(appInfoDao.appInfo);
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(((IEnvironmentService) p8s.b(IEnvironmentService.class)).getApplicationContext());
            if (!(instance == null || (dynamicDataEncryptComp = instance.getDynamicDataEncryptComp()) == null)) {
                jSONString = dynamicDataEncryptComp.dynamicEncryptDDp(jSONString);
            }
        } catch (Exception e) {
            TMSLogger.c("CacheUtils", "put security cache exception", e);
        }
        String str = appInfoDao.version;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = appInfoDao.templateId;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = appInfoDao.type;
        if (str4 == null) {
            str4 = str2;
        }
        String str5 = appInfoDao.extra;
        if (str5 != null) {
            str2 = str5;
        }
        return execSQL("REPLACE INTO " + q9s.Y2() + "(appId, lastUsedTimeStamp, lastRequestTimeStamp, version, templateId, appInfo, type, extra) VALUES('" + appInfoDao.appId + "', " + appInfoDao.lastUsedTimeStamp + ", " + appInfoDao.lastRequestTimeStamp + ", '" + str + "', '" + str3 + "', '" + jSONString + "', '" + str4 + "', '" + str2 + "')");
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertAppManifest(AppManifestDao appManifestDao) {
        String str;
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe7682f1", new Object[]{this, appManifestDao})).booleanValue();
        }
        String jSONString = JSON.toJSONString(appManifestDao.getAppManifest());
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(((IEnvironmentService) p8s.b(IEnvironmentService.class)).getApplicationContext());
            if (!(instance == null || (dynamicDataEncryptComp = instance.getDynamicDataEncryptComp()) == null)) {
                jSONString = dynamicDataEncryptComp.dynamicEncryptDDp(jSONString);
            }
        } catch (Exception e) {
            TMSLogger.c("CacheUtils", "put security cache exception", e);
        }
        if (appManifestDao.getVersion() == null) {
            str = "";
        } else {
            str = appManifestDao.getVersion();
        }
        return execSQL("REPLACE INTO cached_app_manifest2(appId, lastUsedTimeStamp, lastRequestTimeStamp, version, appManifest) VALUES('" + appManifestDao.getAppId() + "', " + appManifestDao.getLastUsedTimeStamp() + ", " + appManifestDao.getLastRequestTimeStamp() + ", '" + str + "', " + jSONString + f7l.BRACKET_END_STR);
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public boolean insertPluginInfo(PluginInfoDao pluginInfoDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df4b5539", new Object[]{this, pluginInfoDao})).booleanValue();
        }
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
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public synchronized boolean isReady() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[]{this})).booleanValue();
            }
            if (this.f13520a.getWritableDatabase() != null) {
                z = true;
            }
            return z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(837812256);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/inside/adapter/DefaultDBAdapter$AppInfoDBHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
                return;
            }
            if (q9s.l1()) {
                sQLiteDatabase.execSQL(TMSDBAdapter.CREATE_APP_INFO_TABLE_SQL);
            } else {
                sQLiteDatabase.execSQL(TMSDBAdapter.CREATE_APP_INFO_TABLE_SQL_OLD);
            }
            sQLiteDatabase.execSQL(TMSDBAdapter.CREATE_PLUGIN_INFO_TABLE_SQL);
            sQLiteDatabase.execSQL(TMSDBAdapter.CREATE_APP_MANIFEST_TABLE_SQL);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            }
        }

        public a(Context context) {
            super(context, "tms_cache_center", (SQLiteDatabase.CursorFactory) null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.taobao.themis.kernel.metaInfo.appinfo.storage.AppInfoDao> selectAppInfo(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.inside.adapter.DefaultDBAdapter.selectAppInfo(java.lang.String):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.taobao.themis.kernel.metaInfo.manifest.storage.AppManifestDao> selectAppManifest(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.inside.adapter.DefaultDBAdapter.selectAppManifest(java.lang.String):java.util.List");
    }

    @Override // com.taobao.themis.kernel.db.TMSDBAdapter
    public List<PluginInfoDao> selectPluginInfo(String str) {
        Throwable th;
        Cursor cursor;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bcec1519", new Object[]{this, str});
        }
        Cursor cursor2 = null;
        if (this.f13520a.getReadableDatabase() != null) {
            try {
                cursor = this.f13520a.getReadableDatabase().rawQuery(str, null);
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (cursor.moveToNext()) {
                            PluginInfoDao pluginInfoDao = new PluginInfoDao();
                            cursor.move(0);
                            pluginInfoDao.id = cursor.getLong(cursor.getColumnIndex("id"));
                            pluginInfoDao.pluginId = cursor.getString(cursor.getColumnIndex(gcn.PLUGIN_ID));
                            pluginInfoDao.lastUsedTimeStamp = cursor.getLong(cursor.getColumnIndex("lastUsedTimeStamp"));
                            pluginInfoDao.lastRequestTimeStamp = cursor.getLong(cursor.getColumnIndex("lastRequestTimeStamp"));
                            pluginInfoDao.version = cursor.getString(cursor.getColumnIndex("version"));
                            String string = cursor.getString(cursor.getColumnIndex("pluginInfo"));
                            if (!TextUtils.isEmpty(string)) {
                                pluginInfoDao.pluginInfo = (PluginModel) JSON.parseObject(string, PluginModel.class);
                            }
                            pluginInfoDao.type = cursor.getString(cursor.getColumnIndex("type"));
                            pluginInfoDao.extra = cursor.getString(cursor.getColumnIndex("extra"));
                            arrayList.add(pluginInfoDao);
                        }
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                        this.f13520a.close();
                        return arrayList;
                    } catch (Exception e2) {
                        e = e2;
                        TMSLogger.c(":DefaultDBAdapter", "DefDBProxy querySQL error", e);
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        this.f13520a.close();
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null && !cursor2.isClosed()) {
                        cursor2.close();
                    }
                    this.f13520a.close();
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor2 != null) {
                    cursor2.close();
                }
                this.f13520a.close();
                throw th;
            }
        }
        return null;
    }
}
