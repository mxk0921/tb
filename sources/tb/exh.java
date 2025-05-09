package tb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class exh extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLUMN_KEY = "key";
    public static final String COLUMN_PERSISTENT = "persistent";
    public static final String COLUMN_TIMESTAMP = "timestamp";
    public static final String COLUMN_VALUE = "value";
    public static final String TABLE_STORAGE = "default_wx_storage";
    public static final String TAG_STORAGE = "mus_storage";
    public static final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());

    /* renamed from: a  reason: collision with root package name */
    public final long f18867a = 52428800;
    public final Context b;
    public SQLiteDatabase c;

    public exh(Context context) {
        super(context, "MUSStorage", (SQLiteDatabase.CursorFactory) null, 2);
        this.b = context;
    }

    public static /* synthetic */ Object ipc$super(exh exhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/storage/MUSSQLiteOpenHelper");
    }

    public synchronized void A() {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("392de3e0", new Object[]{this});
                return;
            }
            SQLiteDatabase sQLiteDatabase = this.c;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                for (int i = 0; i < 2; i++) {
                    if (i > 0) {
                        try {
                            w();
                        } catch (SQLiteException e) {
                            e.printStackTrace();
                            try {
                                Thread.sleep(30L);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                    this.c = getWritableDatabase();
                }
                SQLiteDatabase sQLiteDatabase2 = this.c;
                if (sQLiteDatabase2 != null) {
                    g(sQLiteDatabase2);
                    this.c.setMaximumSize(this.f18867a);
                }
            }
        }
    }

    public SQLiteDatabase C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("69e82c17", new Object[]{this});
        }
        A();
        return this.c;
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00f5e9a", new Object[]{this});
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.c;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.c.close();
            this.c = null;
        }
    }

    public final void g(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1a7a20", new Object[]{this, sQLiteDatabase});
            return;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT DISTINCT tbl_name FROM sqlite_master WHERE tbl_name = 'default_wx_storage'", null);
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor == null) {
                    return;
                }
            }
            if (cursor == null || cursor.getCount() <= 0) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS default_wx_storage (key TEXT PRIMARY KEY,value TEXT NOT NULL,timestamp TEXT NOT NULL,persistent INTEGER DEFAULT 0)");
                if (cursor == null) {
                    return;
                }
                cursor.close();
                return;
            }
            cursor.close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS default_wx_storage (key TEXT PRIMARY KEY,value TEXT NOT NULL,timestamp TEXT NOT NULL,persistent INTEGER DEFAULT 0)");
        }
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6397774", new Object[]{this})).booleanValue();
        }
        e();
        return this.b.deleteDatabase("MUSStorage");
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        } else if (i == i2) {
        } else {
            if (i2 == 2 && i == 1) {
                try {
                    try {
                        System.currentTimeMillis();
                        sQLiteDatabase.beginTransaction();
                        sQLiteDatabase.execSQL("ALTER TABLE default_wx_storage ADD COLUMN timestamp TEXT;");
                        sQLiteDatabase.execSQL("ALTER TABLE default_wx_storage ADD COLUMN persistent INTEGER;");
                        sQLiteDatabase.execSQL("UPDATE default_wx_storage SET timestamp = '" + d.format(new Date()) + "' , persistent = 0");
                        sQLiteDatabase.setTransactionSuccessful();
                        System.currentTimeMillis();
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e) {
                        dwh.b(TAG_STORAGE, "storage updated failed from version " + i + " to version " + i2 + "," + e.getMessage());
                        sQLiteDatabase.endTransaction();
                        w();
                        onCreate(sQLiteDatabase);
                    }
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } else {
                w();
                onCreate(sQLiteDatabase);
            }
        }
    }

    static {
        t2o.a(982516176);
    }
}
