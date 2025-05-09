package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jcy extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(283115549);
    }

    public static /* synthetic */ Object ipc$super(jcy jcyVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tanx/exposer/achieve/retry/tanxc_do");
    }

    public synchronized List<tcy> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9b6812f8", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = getReadableDatabase().query("retry_monitor_info", null, "date = ?", new String[]{str}, null, null, null, null);
        while (query != null) {
            try {
                if (!query.moveToNext()) {
                    break;
                }
                tcy tcyVar = new tcy(query);
                arrayList.add(tcyVar);
                if (qgh.f26737a) {
                    qgh.a("RetryMonitorDbHelper", "query: add retryMonitorInfo = " + tcyVar);
                }
            } catch (Exception e) {
                qgh.b("RetryMonitorDbHelper", "query exception, date = " + str, e);
            }
        }
        if (query != null) {
            query.close();
        }
        if (qgh.f26737a) {
            qgh.a("RetryMonitorDbHelper", "query: exposeDate = " + str + ", retryMonitorInfoList = " + arrayList);
        }
        return arrayList;
    }

    public synchronized void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75b9a7f", new Object[]{this, new Long(j)});
        } else if (j >= 0) {
            long delete = getWritableDatabase().delete("retry_monitor_info", "id = ?", new String[]{String.valueOf(j)});
            if (qgh.f26737a) {
                qgh.a("RetryMonitorDbHelper", "delete: id = " + j + ", deleteRows = " + delete);
            }
        }
    }

    public synchronized void g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234e4d74", new Object[]{this, str, new Integer(i)});
            return;
        }
        long delete = getWritableDatabase().delete("retry_monitor_info", "date != ? or retry_times >= ?", new String[]{str, String.valueOf(i)});
        if (qgh.f26737a) {
            qgh.a("RetryMonitorDbHelper", "delete: deletedRows = " + delete + ", date = " + str + ", maxRetryTimes = " + i);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        if (qgh.f26737a) {
            qgh.a("RetryMonitorDbHelper", "onCreate: createRetryTableSql = CREATE TABLE IF NOT EXISTS retry_monitor_info ( id INTEGER PRIMARY KEY AUTOINCREMENT, monitor_type VARCHAR(10), monitor_url TEXT, monitor_original_url TEXT, monitor_url_hash TEXT, monitor_url_host TEXT, monitor_extra_params TEXT, retry_times INTEGER, max_retry_times INTEGER, date VARCHAR(12),expire_time INTEGER)");
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS retry_monitor_info ( id INTEGER PRIMARY KEY AUTOINCREMENT, monitor_type VARCHAR(10), monitor_url TEXT, monitor_original_url TEXT, monitor_url_hash TEXT, monitor_url_host TEXT, monitor_extra_params TEXT, retry_times INTEGER, max_retry_times INTEGER, date VARCHAR(12),expire_time INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        if (qgh.f26737a) {
            qgh.a("RetryMonitorDbHelper", "onUpgrade: oldVer = " + i + ", newVer = " + i2);
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS retry_monitor_info");
        onCreate(sQLiteDatabase);
    }

    public synchronized void w(tcy tcyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc790923", new Object[]{this, tcyVar});
            return;
        }
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("monitor_type", tcyVar.l().name());
        contentValues.put("monitor_url", tcyVar.k());
        contentValues.put("monitor_original_url", tcyVar.i());
        contentValues.put("monitor_url_host", tcyVar.o());
        contentValues.put("monitor_url_hash", tcyVar.n());
        if (tcyVar.j() != null) {
            contentValues.put("monitor_extra_params", tcyVar.j().toString());
        }
        contentValues.put("retry_times", Integer.valueOf(tcyVar.h().intValue()));
        contentValues.put("max_retry_times", Integer.valueOf(tcyVar.c()));
        contentValues.put("date", tcyVar.b());
        contentValues.put(PushConstants.REGISTER_STATUS_EXPIRE_TIME, Long.valueOf(tcyVar.a()));
        long insert = writableDatabase.insert("retry_monitor_info", null, contentValues);
        tcyVar.e(insert);
        if (qgh.f26737a) {
            qgh.a("RetryMonitorDbHelper", "insert: index = " + insert + ", exposeDate = " + tcyVar.b());
        }
    }

    public jcy(Context context) {
        super(context, "tanx_ad_expose_sdk.db", (SQLiteDatabase.CursorFactory) null, 1);
    }
}
