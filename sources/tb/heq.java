package tb;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class heq extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean e = false;
    public static final DatabaseErrorHandler f = new a();
    public SQLiteDatabase b;
    public Future<?> d;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f20585a = new AtomicInteger();
    public final b c = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements DatabaseErrorHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d4cd45a", new Object[]{this, sQLiteDatabase});
                return;
            }
            nhh.v("SqliteHelper", "DatabaseErrorHandler onCorruption");
            heq.a(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592866);
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (heq.this) {
                try {
                    if (heq.b(heq.this).get() == 0 && heq.c(heq.this) != null) {
                        heq.c(heq.this).close();
                        heq.e(heq.this, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        t2o.a(962592864);
    }

    public heq(Context context, String str) {
        super(context, str, null, 2, f);
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        e = z;
        return z;
    }

    public static /* synthetic */ AtomicInteger b(heq heqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("8e387a6c", new Object[]{heqVar});
        }
        return heqVar.f20585a;
    }

    public static /* synthetic */ SQLiteDatabase c(heq heqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("c2e668ec", new Object[]{heqVar});
        }
        return heqVar.b;
    }

    public static /* synthetic */ SQLiteDatabase e(heq heqVar, SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("830029d1", new Object[]{heqVar, sQLiteDatabase});
        }
        heqVar.b = sQLiteDatabase;
        return sQLiteDatabase;
    }

    public static /* synthetic */ Object ipc$super(heq heqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2000015223) {
            super.onOpen((SQLiteDatabase) objArr[0]);
            return null;
        } else if (hashCode == 305025623) {
            return super.getWritableDatabase();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/analytics/core/db/SqliteHelper");
        }
    }

    public void g(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b899da42", new Object[]{this, cursor});
        } else if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("122e5257", new Object[]{this});
        }
        if (this.b == null) {
            if (e) {
                return null;
            }
            this.b = super.getWritableDatabase();
        }
        this.f20585a.incrementAndGet();
        return this.b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ca3089", new Object[]{this, sQLiteDatabase});
            return;
        }
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("PRAGMA journal_mode=DELETE", null);
        } catch (Throwable unused) {
        }
        g(cursor);
        super.onOpen(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        }
    }

    public synchronized void w(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fac413", new Object[]{this, sQLiteDatabase});
        } else if (sQLiteDatabase != null) {
            try {
                if (this.f20585a.decrementAndGet() == 0) {
                    Future<?> future = this.d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.d = zdt.c().d(null, this.c, 30000L);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
