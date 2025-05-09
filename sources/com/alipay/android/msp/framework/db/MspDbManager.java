package com.alipay.android.msp.framework.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alipay.android.msp.core.model.MQPBehaviorActionSeqModel;
import com.alipay.android.msp.core.model.MQPBehaviorExperienceModel;
import com.alipay.android.msp.core.model.MQPBehaviorRecordModel;
import com.alipay.android.msp.core.model.MQPBizInfoModel;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspDbManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile MspDbManager g;
    public static boolean h;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f3594a;
    public SQLiteDatabase b;
    public MspDBHelper c;
    public boolean d;
    public boolean e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface MspDBQueryActionCallback {
        void onDataLoaded(List<MQPBehaviorActionSeqModel> list);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface MspDBQueryBehaviorExperienceCallback {
        void onDataLoaded(List<MQPBehaviorExperienceModel> list);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface MspDBQueryBizInfoCallback {
        void onDataLoaded(List<MQPBizInfoModel> list);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface MspDBQueryRecordCallback {
        void onDataLoaded(List<MQPBehaviorRecordModel> list);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface MspDBSaveCallback {
        void onDataSaveError(Throwable th);

        void onDataSaveSuccess();
    }

    public static MspDbManager getDbManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspDbManager) ipChange.ipc$dispatch("22213cbc", new Object[0]);
        }
        if (g == null) {
            synchronized (MspDbManager.class) {
                try {
                    if (g == null) {
                        g = new MspDbManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public synchronized void init(Context context, boolean z) {
        boolean z2 = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b35b22e3", new Object[]{this, context, new Boolean(z)});
                return;
            }
            setEnableBehaviorActionUpload(DrmManager.getInstance(context).isGray(DrmKey.enable_behavior_action_upload, false, context));
            setEnableBehaviorRecordUpload(DrmManager.getInstance(context).isGray(DrmKey.enable_behavior_record_upload, false, context));
            if (DrmManager.getInstance(context).isGray(DrmKey.enable_behavior_manager, false, context) || a(context, z)) {
                z2 = true;
            }
            setEnableBehaviorManager(z2);
            if (isEnableBehaviorManager() && !h) {
                MspDBHelper mspDBHelper = new MspDBHelper(context.getApplicationContext());
                this.c = mspDBHelper;
                this.b = mspDBHelper.getReadableDatabase();
                this.f3594a = this.c.getWritableDatabase();
                h = true;
            }
        }
    }

    @Deprecated
    public boolean isEnableBehaviorActionUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2984afc1", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean isEnableBehaviorManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad656f79", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    @Deprecated
    public boolean isEnableBehaviorRecordUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b568f81c", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public Cursor query(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("cf19bae0", new Object[]{this, str});
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        Cursor cursor = null;
        if (sQLiteDatabase == null) {
            return null;
        }
        if (!sQLiteDatabase.isOpen()) {
            LogUtil.record(8, "query", "db is closed");
            return null;
        }
        try {
            sQLiteDatabase.beginTransaction();
            cursor = sQLiteDatabase.rawQuery(str, null);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return cursor;
    }

    public synchronized void save(String str, MspDBSaveCallback mspDBSaveCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3658f2ce", new Object[]{this, str, mspDBSaveCallback});
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.f3594a;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.beginTransaction();
            this.f3594a.execSQL(str);
            this.f3594a.setTransactionSuccessful();
        }
        if (mspDBSaveCallback != null) {
            mspDBSaveCallback.onDataSaveSuccess();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f3594a;
        if (sQLiteDatabase2 != null) {
            sQLiteDatabase2.endTransaction();
        }
    }

    public synchronized void saveAction(MQPBehaviorActionSeqModel mQPBehaviorActionSeqModel, MspDBSaveCallback mspDBSaveCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103b5b83", new Object[]{this, mQPBehaviorActionSeqModel, mspDBSaveCallback});
        } else if (mQPBehaviorActionSeqModel != null) {
            SQLiteDatabase sQLiteDatabase = this.f3594a;
            if (sQLiteDatabase != null) {
                if (!sQLiteDatabase.isOpen()) {
                    LogUtil.record(8, "saveAction", "db is closed");
                    return;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("trace", mQPBehaviorActionSeqModel.getTrace());
                    contentValues.put("uid", mQPBehaviorActionSeqModel.getUid());
                    contentValues.put("scene_name", mQPBehaviorActionSeqModel.getScene_name());
                    contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_ACTION_TYPE, mQPBehaviorActionSeqModel.getAct_type());
                    contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_ACTION_NAME, mQPBehaviorActionSeqModel.getAct_name());
                    contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_ACTION_PARAMS, mQPBehaviorActionSeqModel.getAct_params());
                    contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID, mQPBehaviorActionSeqModel.getPage_id());
                    contentValues.put("page_name", mQPBehaviorActionSeqModel.getPage_name());
                    contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_SERVICE_STACK, mQPBehaviorActionSeqModel.getService_stack());
                    contentValues.put("hh", mQPBehaviorActionSeqModel.getHh());
                    contentValues.put("time", mQPBehaviorActionSeqModel.getTime());
                    contentValues.put("ds", mQPBehaviorActionSeqModel.getDs());
                    contentValues.put("ext", mQPBehaviorActionSeqModel.getExt());
                    sQLiteDatabase.insert(MspDBHelper.ActionEntry.TABLE_NAME, null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    if (mspDBSaveCallback != null) {
                        mspDBSaveCallback.onDataSaveSuccess();
                    }
                    sQLiteDatabase.endTransaction();
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    if (mspDBSaveCallback != null) {
                        mspDBSaveCallback.onDataSaveError(e);
                    }
                    sQLiteDatabase.endTransaction();
                }
            }
        }
    }

    public synchronized void saveRecord(MQPBehaviorRecordModel mQPBehaviorRecordModel, MspDBSaveCallback mspDBSaveCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be66f90", new Object[]{this, mQPBehaviorRecordModel, mspDBSaveCallback});
        } else if (mQPBehaviorRecordModel != null) {
            SQLiteDatabase sQLiteDatabase = this.f3594a;
            if (sQLiteDatabase != null) {
                if (!sQLiteDatabase.isOpen()) {
                    LogUtil.record(8, "saveRecord", "db is closed");
                    return;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("trace", mQPBehaviorRecordModel.getTrace());
                    contentValues.put("uid", mQPBehaviorRecordModel.getUid());
                    contentValues.put("utdid", mQPBehaviorRecordModel.getUtdid());
                    contentValues.put("trade_no", mQPBehaviorRecordModel.getTrade_no());
                    contentValues.put("scene_name", mQPBehaviorRecordModel.getScene_name());
                    contentValues.put("features", mQPBehaviorRecordModel.getFeatures());
                    contentValues.put(MspDBHelper.RecordEntry.COLUMN_NAME_RULE_ID, mQPBehaviorRecordModel.getRule_id());
                    contentValues.put("result", mQPBehaviorRecordModel.getResult());
                    contentValues.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, mQPBehaviorRecordModel.getVer());
                    contentValues.put("time", mQPBehaviorRecordModel.getTime());
                    contentValues.put("ds", mQPBehaviorRecordModel.getDs());
                    contentValues.put("hh", mQPBehaviorRecordModel.getHh());
                    contentValues.put("ext", mQPBehaviorRecordModel.getExt());
                    sQLiteDatabase.insert(MspDBHelper.RecordEntry.TABLE_NAME, null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    if (mspDBSaveCallback != null) {
                        mspDBSaveCallback.onDataSaveSuccess();
                    }
                    sQLiteDatabase.endTransaction();
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    if (mspDBSaveCallback != null) {
                        mspDBSaveCallback.onDataSaveError(e);
                    }
                    sQLiteDatabase.endTransaction();
                }
            }
        }
    }

    @Deprecated
    public void setEnableBehaviorActionUpload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28647f", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void setEnableBehaviorManager(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439cb37", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Deprecated
    public void setEnableBehaviorRecordUpload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdcd2784", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void closeDBHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dec964b", new Object[]{this});
        } else if (this.c != null) {
            try {
                h = false;
                b(MspDBHelper.BizEntry.TABLE_NAME, "time", 3);
                b(MspDBHelper.ActionEntry.TABLE_NAME, "time", 3);
                b(MspDBHelper.RecordEntry.TABLE_NAME, "time", 3);
                b(MspDBHelper.BehaviorExperienceEntry.TABLE_NAME, "date", 3);
                LogUtil.record(2, "MspDBManager:delete DB", "delete end");
                this.c.close();
                LogUtil.record(2, "MspDBManager:closeDBHelper", "mDBHelper=" + this.c);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public static boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        try {
            if (DrmManager.getInstance(context).isGray(DrmKey.gray_behavior_manager_force_open, false, context) && z) {
                LogUtil.record(8, "needForceEnableBehaviorManager", "true");
                return true;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }

    public final synchronized void b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fca26", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.f3594a;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                LogUtil.record(8, "deleteExpiredTableData", "db is closed");
                return;
            }
            sQLiteDatabase.beginTransaction();
            Date date = new Date();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            gregorianCalendar.add(5, 0 - i);
            String format = ThreadSafeDateFormat.format(gregorianCalendar.getTime(), "yyyy-MM-dd HH:mm:ss:SSS");
            int delete = sQLiteDatabase.delete(str, str2 + "<?", new String[]{format});
            LogUtil.record(2, "deleteExpiredTableData", "delete " + str + " " + delete + " row, when valid time is " + format);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0119 A[Catch: all -> 0x001c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001f, B:25:0x0103, B:35:0x0119, B:29:0x010b), top: B:44:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void queryActionModel(java.lang.String r17, com.alipay.android.msp.framework.db.MspDbManager.MspDBQueryActionCallback r18) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.db.MspDbManager.queryActionModel(java.lang.String, com.alipay.android.msp.framework.db.MspDbManager$MspDBQueryActionCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0116 A[Catch: all -> 0x001c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001f, B:25:0x0100, B:35:0x0116, B:29:0x0108), top: B:46:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void queryBehaviorExperienceModel(java.lang.String r17, com.alipay.android.msp.framework.db.MspDbManager.MspDBQueryBehaviorExperienceCallback r18) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.db.MspDbManager.queryBehaviorExperienceModel(java.lang.String, com.alipay.android.msp.framework.db.MspDbManager$MspDBQueryBehaviorExperienceCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0213 A[Catch: all -> 0x001c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001f, B:39:0x01fc, B:49:0x0213, B:43:0x0205), top: B:64:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void queryBizInfoModel(java.lang.String r29, com.alipay.android.msp.framework.db.MspDbManager.MspDBQueryBizInfoCallback r30) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.db.MspDbManager.queryBizInfoModel(java.lang.String, com.alipay.android.msp.framework.db.MspDbManager$MspDBQueryBizInfoCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011b A[Catch: all -> 0x001c, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x001f, B:25:0x0105, B:35:0x011b, B:29:0x010d), top: B:48:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void queryRecordModel(java.lang.String r17, com.alipay.android.msp.framework.db.MspDbManager.MspDBQueryRecordCallback r18) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.db.MspDbManager.queryRecordModel(java.lang.String, com.alipay.android.msp.framework.db.MspDbManager$MspDBQueryRecordCallback):void");
    }

    public synchronized void saveBiz(Map<String, String> map, MspDBSaveCallback mspDBSaveCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0c4b88", new Object[]{this, map, mspDBSaveCallback});
            return;
        }
        if (map != null && map.containsKey("trace")) {
            SQLiteDatabase sQLiteDatabase = this.f3594a;
            if (sQLiteDatabase != null) {
                if (!sQLiteDatabase.isOpen()) {
                    LogUtil.record(8, "saveBiz", "db is closed");
                    return;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (String str : map.keySet()) {
                        contentValues.put(str, map.get(str));
                    }
                    StringBuilder sb = new StringBuilder();
                    String str2 = map.get("trace");
                    if (!TextUtils.isEmpty(str2)) {
                        str2 = str2.split("_")[0];
                    }
                    sb.append(str2);
                    sb.append(f7l.MOD);
                    int update = sQLiteDatabase.update(MspDBHelper.BizEntry.TABLE_NAME, contentValues, "trace LIKE ?", new String[]{sb.toString()});
                    if (update == 0) {
                        sQLiteDatabase.insert(MspDBHelper.BizEntry.TABLE_NAME, null, contentValues);
                    } else if (update > 1) {
                        LogUtil.record(8, "saveBiz", "multiTrace ".concat(String.valueOf(update)));
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    if (mspDBSaveCallback != null) {
                        mspDBSaveCallback.onDataSaveSuccess();
                    }
                    sQLiteDatabase.endTransaction();
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    if (mspDBSaveCallback != null) {
                        mspDBSaveCallback.onDataSaveError(e);
                    }
                    sQLiteDatabase.endTransaction();
                }
            }
        }
    }
}
