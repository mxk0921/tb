package tb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sno extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f28164a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28165a;

        public a(String str) {
            this.f28165a = str;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue();
            }
            return file.getName().startsWith(this.f28165a);
        }
    }

    static {
        t2o.a(962592862);
    }

    public sno(Context context, String str) {
        super(context, str, null, 2, null);
    }

    public static boolean A(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9627088", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        boolean delete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            File[] listFiles = parentFile.listFiles(new a(file.getName() + "-mj"));
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    delete |= file2.delete();
                }
            }
        }
        return delete;
    }

    public static /* synthetic */ Object ipc$super(sno snoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2000015223) {
            super.onOpen((SQLiteDatabase) objArr[0]);
            return null;
        } else if (hashCode == 305025623) {
            return super.getWritableDatabase();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/analytics/core/db/SQLiteCheckHelper");
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c0cd2c", new Object[]{this});
            return;
        }
        getWritableDatabase();
        w();
    }

    public final void g(Cursor cursor) {
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
        if (this.f28164a == null) {
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            this.f28164a = writableDatabase;
            boolean isDatabaseIntegrityOk = writableDatabase.isDatabaseIntegrityOk();
            nhh.f("SQLiteCheckHelper", "isDatabaseIntegrityOk", Boolean.valueOf(isDatabaseIntegrityOk));
            if (!isDatabaseIntegrityOk) {
                nhh.i("SQLiteCheckHelper", "delete Database", Boolean.valueOf(A(new File(this.f28164a.getPath()))));
            }
            nhh.f("SQLiteCheckHelper", "WritableDatabase", this.f28164a);
        }
        return this.f28164a;
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

    public final synchronized void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd5fe5a", new Object[]{this});
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.f28164a;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
            this.f28164a = null;
        }
    }
}
