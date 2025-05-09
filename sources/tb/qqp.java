package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qqp extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f26886a;
    public final String b;
    public final String c;

    static {
        t2o.a(815793293);
    }

    public /* synthetic */ qqp(Context context, String str, int i, int i2, a07 a07Var) {
        this(context, str, (i2 & 4) != 0 ? 1 : i);
    }

    public static /* synthetic */ Object ipc$super(qqp qqpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/shop/db/ShopSearchHistorySQLiteHelper");
    }

    public final void a(pqp... pqpVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0491daf", new Object[]{this, pqpVarArr});
            return;
        }
        ckf.g(pqpVarArr, "historyEntities");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            for (pqp pqpVar : pqpVarArr) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(this.b, pqpVar.b());
                contentValues.put(this.c, pqpVar.a());
                writableDatabase.insertWithOnConflict(this.f26886a, null, contentValues, 5);
            }
            writableDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3297a04", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            String str2 = this.f26886a;
            writableDatabase.delete(str2, this.b + " = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r10.isClosed() == false) goto L_0x0068;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r10.isClosed() != false) goto L_0x007d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(java.lang.String r10) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.qqp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "5a0eec07"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            r3 = 1
            r2[r3] = r10
            java.lang.Object r10 = r0.ipc$dispatch(r1, r2)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x0018:
            java.lang.String r0 = "id"
            tb.ckf.g(r10, r0)
            android.database.sqlite.SQLiteDatabase r1 = r9.getReadableDatabase()
            java.lang.String r2 = r9.f26886a
            java.lang.String r0 = r9.b
            java.lang.String r3 = r9.c
            java.lang.String[] r3 = new java.lang.String[]{r0, r3}
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r9.b
            r0.append(r4)
            java.lang.String r4 = " = ?"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String[] r5 = new java.lang.String[]{r10}
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            if (r10 != 0) goto L_0x004d
            return r0
        L_0x004d:
            boolean r1 = r10.moveToFirst()     // Catch: all -> 0x005e, Exception -> 0x0060
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = r9.c     // Catch: all -> 0x005e, Exception -> 0x0060
            int r1 = r10.getColumnIndex(r1)     // Catch: all -> 0x005e, Exception -> 0x0060
            java.lang.String r0 = r10.getString(r1)     // Catch: all -> 0x005e, Exception -> 0x0060
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            goto L_0x006c
        L_0x0060:
            goto L_0x0076
        L_0x0062:
            boolean r1 = r10.isClosed()
            if (r1 != 0) goto L_0x007d
        L_0x0068:
            r10.close()
            goto L_0x007d
        L_0x006c:
            boolean r1 = r10.isClosed()
            if (r1 != 0) goto L_0x0075
            r10.close()
        L_0x0075:
            throw r0
        L_0x0076:
            boolean r1 = r10.isClosed()
            if (r1 != 0) goto L_0x007d
            goto L_0x0068
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qqp.c(java.lang.String):java.lang.String");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f26886a + " (" + this.b + " TEXT PRIMARY KEY, " + this.c + " TEXT)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        } else if (i != i2 && sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f26886a);
            onCreate(sQLiteDatabase);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqp(Context context, String str, int i) {
        super(context, r4p.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i);
        ckf.g(context, "context");
        ckf.g(str, "tableName");
        this.f26886a = str;
        this.b = "id";
        this.c = "content";
    }
}
