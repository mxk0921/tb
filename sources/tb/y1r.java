package tb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y1r extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COL_DATA = "data";
    public static final String COL_MSG_TIME = "msg_time";
    public static final String COL_SEQ = "seq";
    public static final String COL_SERVICE = "service_id";
    public static final String COL_STREAM = "stream_id";
    public static final String TABLE_PRE_QUEUE = "t_queue_msg";

    static {
        t2o.a(343933192);
    }

    public y1r(Context context) {
        super(context, "accs_sync_sdk.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static /* synthetic */ Object ipc$super(y1r y1rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/sync/ps/SyncDBHelper");
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d1a7579", new Object[]{this});
        }
        return "create table t_queue_msg(service_id text,stream_id text,seq integer,msg_time long,data text);";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else if (sQLiteDatabase == null) {
            pmo.c("SyncDBHelper", "onCreate() db = NULL", new Object[0]);
        } else {
            try {
                sQLiteDatabase.execSQL(e());
            } catch (Throwable th) {
                pmo.b("SyncDBHelper", "onCreate err", th, new Object[0]);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        }
    }
}
