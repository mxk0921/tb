package com.alibaba.security.ccrc.service.build;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.da  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1153da extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2586a = "EasyDbHelper";
    public static final int b = 1;
    public static final String c = "wk_risk_ext.db";
    public static final String d = "easy_log";
    public static final String e = "id";
    public static final String f = "log";

    public static /* synthetic */ Object ipc$super(C1153da daVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/da");
    }

    public boolean a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4926226", new Object[]{this, trackLog})).booleanValue();
        }
        try {
            String jSONString = JsonUtils.toJSONString(trackLog);
            ContentValues contentValues = new ContentValues();
            contentValues.put("log", jSONString);
            contentValues.put("id", trackLog.logId);
            return getWritableDatabase().replace(d, null, contentValues) != -1;
        } catch (Throwable th) {
            Logging.w(f2586a, "write db error", th);
            return false;
        }
    }

    public List<TrackLog> b() {
        Throwable th;
        Cursor cursor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        try {
            cursor = getWritableDatabase().query(d, null, null, null, null, null, null, null);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                TrackLog trackLog = (TrackLog) JsonUtils.parseObject(cursor.getString(cursor.getColumnIndex("log")), (Class<Object>) TrackLog.class);
                if (trackLog != null) {
                    arrayList.add(trackLog);
                }
            }
            if (!cursor.isClosed()) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            try {
                Logging.w(f2586a, "", th);
                return Collections.emptyList();
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS easy_log ( id TEXT  PRIMARY KEY ,log TEXT)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1967076", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        } else {
            onUpgrade(sQLiteDatabase, i, i2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS easy_log");
        onCreate(sQLiteDatabase);
    }

    public C1153da(Context context) {
        super(context, c, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void a(List<TrackLog> list) {
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        try {
            sQLiteDatabase = getWritableDatabase();
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        sQLiteDatabase.beginTransaction();
                        for (TrackLog trackLog : list) {
                            sQLiteDatabase.delete(d, "id=?", new String[]{trackLog.logId});
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Logging.w(f2586a, "", th);
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                            return;
                        }
                        return;
                    } finally {
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = null;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            getWritableDatabase().delete(d, null, null);
        } catch (Throwable th) {
            Logging.w(f2586a, "", th);
        }
    }
}
