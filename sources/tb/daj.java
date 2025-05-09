package tb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class daj extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATABASE_NAME = "network_analysis_flow_monitor.db";
    public static final int DATABASE_VERSION = 2;
    public static final String MULTI_PATH_FLOW_TASK_TABLE_NAME = "multi_path_flow_task";
    public static final String SQL_CREATE_MULTI_PATH_FLOW_TASK_ENTRIES = "CREATE TABLE multi_path_flow_task (_id INTEGER PRIMARY KEY AUTOINCREMENT,flowType REAL,date TEXT,host TEXT,useFlowSize REAL,flag INTEGER)";

    public daj(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    public static /* synthetic */ Object ipc$super(daj dajVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/monitor/MultiPathFlowSQLiteOpenHelper");
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492dd0e9", new Object[]{this, sQLiteDatabase, str});
        } else if (!TextUtils.isEmpty(str)) {
            sQLiteDatabase.execSQL("drop table " + str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else {
            sQLiteDatabase.execSQL(SQL_CREATE_MULTI_PATH_FLOW_TASK_ENTRIES);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1967076", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        a(sQLiteDatabase, MULTI_PATH_FLOW_TASK_TABLE_NAME);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        a(sQLiteDatabase, MULTI_PATH_FLOW_TASK_TABLE_NAME);
        onCreate(sQLiteDatabase);
    }
}
