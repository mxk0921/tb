package tb;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class bu6 implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteOpenHelper f16636a;

    static {
        t2o.a(961544353);
    }

    public bu6(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f16636a = sQLiteOpenHelper;
    }

    public long[] A(String str, int i, List<ContentValues> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("e9c248a4", new Object[]{this, str, new Integer(i), list});
        }
        return e(str, i, list);
    }

    public Cursor F(String str, String[] strArr, String str2, String str3, String str4, String... strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("80c70da2", new Object[]{this, str, strArr, str2, str3, str4, strArr2});
        }
        return C(str, strArr, null, null, str2, str3, str4, strArr2);
    }

    public int b(String str, String str2, String... strArr) {
        int i;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50e9928c", new Object[]{this, str, str2, strArr})).intValue();
        }
        ogh.e("Database", "DELETE table: " + str + " whereClause: " + str2 + "  whereArgs: " + Arrays.toString(strArr));
        SQLiteDatabase w = w();
        if (w.isDbLockedByCurrentThread()) {
            i = w.delete(str, str2, strArr);
        } else {
            w.beginTransaction();
            try {
                i = w.delete(str, str2, strArr);
                w.setTransactionSuccessful();
            } finally {
                w.endTransaction();
            }
        }
        StringBuilder sb = new StringBuilder("DELETE affected ");
        sb.append(i);
        if (i != 1) {
            str3 = " rows";
        } else {
            str3 = " row";
        }
        sb.append(str3);
        ogh.e("Database", sb.toString());
        return i;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bbfc46", new Object[]{this, str});
            return;
        }
        ogh.e("Database", "EXECUTE  sql: " + str);
        w().execSQL(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f16636a.close();
        }
    }

    public final long[] e(String str, int i, List<ContentValues> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("782f54f9", new Object[]{this, str, new Integer(i), list});
        }
        ogh.e("Database", "INSERT in transaction. table: " + str + ", values: " + list + ", conflictAlgorithm: " + a(i));
        long[] jArr = new long[list.size()];
        Arrays.fill(jArr, -1L);
        SQLiteDatabase w = w();
        w.beginTransaction();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                jArr[i2] = w.insertWithOnConflict(str, null, list.get(i2), i);
            } catch (Throwable th) {
                w.endTransaction();
                throw th;
            }
        }
        w.setTransactionSuccessful();
        w.endTransaction();
        ogh.e("Database", "INSERT ids: " + Arrays.toString(jArr));
        return jArr;
    }

    public SQLiteDatabase g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("5691b007", new Object[]{this});
        }
        return this.f16636a.getReadableDatabase();
    }

    public SQLiteDatabase w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("122e5257", new Object[]{this});
        }
        return this.f16636a.getWritableDatabase();
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4295707", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return "none";
        }
        if (i == 1) {
            return "rollback";
        }
        if (i == 2) {
            return BaseFBPlugin.VERIFY_STATUS.abort;
        }
        if (i == 3) {
            return "fail";
        }
        if (i == 4) {
            return jwi.MATCH_IGNORE;
        }
        if (i == 5) {
            return "replace";
        }
        return "unknown (" + i + ')';
    }

    public Cursor C(String str, String[] strArr, String str2, String str3, String str4, String str5, String str6, String... strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("aa2b260e", new Object[]{this, str, strArr, str2, str3, str4, str5, str6, strArr2});
        }
        long nanoTime = System.nanoTime();
        Cursor query = g().query(str, strArr, str6, strArr2, str2, str3, str4, str5);
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
        ogh.e("Database", "QUERY (" + millis + "ms) table: " + str + ", columns: " + Arrays.toString(strArr) + ", orderBy: " + str4 + ", limit: " + str5 + ", groupBy: " + str2 + ", having: " + str3 + ", whereClause: " + str6 + ", whereArgs: " + Arrays.toString(strArr2));
        return query;
    }
}
