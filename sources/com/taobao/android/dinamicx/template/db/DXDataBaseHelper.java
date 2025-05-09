package com.taobao.android.dinamicx.template.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.ic5;
import tb.t2o;
import tb.wh6;
import tb.xh6;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXDataBaseHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DELETE_SQL = "delete from template_info where biz_type=? AND name=? AND version=?";
    private static final String INSERT_PRE_DOWNLOAD_SQL = "insert or replace into template_info(biz_type,name,version,main_path,style_files,url,extra_2) values(?,?,?,?,?,?,?)";
    private static final String INSERT_SQL = "insert or replace into template_info(biz_type,name,version,main_path,style_files,url) values(?,?,?,?,?,?)";
    private static final String ORDER_BY = "version desc";
    private static final String PRE_DOWNLOAD = "1";
    private static final String[] QUERY_COLUMNS = {"biz_type", "name", "version", "main_path", "style_files", "url", "extra_2"};
    private static final String[] QUERY_COLUMNS_WITH_DIRTY = {"biz_type", "name", "version", "main_path", "style_files", "url", "extra_1", "extra_2"};
    private static final String QUERY_WHERE = "biz_type=? AND name=?";
    private static final String QUERY_WHERE_DEL = "biz_type=? AND name=? AND version=?";
    private static final String TABLE_NAME = "template_info";
    private static final String TAG = "DXDataBaseHelper";
    private static final String UPDATE_DIRTY_SQL = "update template_info set extra_1='true' where biz_type=? AND name=? AND version=?";
    private a mDbHelper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f7341a;
        public SQLiteDatabase b;
        public final String c;

        static {
            t2o.a(444596984);
        }

        public a(Context context, String str, String str2) {
            this.b = null;
            b bVar = new b(context, str);
            this.f7341a = bVar;
            this.c = str2;
            try {
                this.b = bVar.getWritableDatabase();
            } catch (Throwable th) {
                DXDataBaseHelper.access$000(DXDataBaseHelper.this, this.c, "DB_Open60025", f.DX_DB_OPEN_ERROR, th);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d00f5e9a", new Object[]{this});
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baf70d38", new Object[]{this});
                return;
            }
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    this.b.close();
                }
            } catch (Throwable th) {
                try {
                    DXDataBaseHelper.access$000(DXDataBaseHelper.this, this.c, "DB_Close", f.DX_DB_CLOSE_ERROR, th);
                } finally {
                    this.b = null;
                }
            }
        }

        public SQLiteDatabase c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SQLiteDatabase) ipChange.ipc$dispatch("5691b007", new Object[]{this});
            }
            if (this.b == null) {
                try {
                    this.b = this.f7341a.getReadableDatabase();
                } catch (Throwable th) {
                    DXDataBaseHelper.access$000(DXDataBaseHelper.this, this.c, "DB_Open60027", f.DX_DB_OPEN_ERROR, th);
                }
            }
            return this.b;
        }

        public SQLiteDatabase d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SQLiteDatabase) ipChange.ipc$dispatch("122e5257", new Object[]{this});
            }
            if (this.b == null) {
                try {
                    this.b = this.f7341a.getWritableDatabase();
                } catch (Throwable th) {
                    DXDataBaseHelper.access$000(DXDataBaseHelper.this, this.c, "DB_Open60026", f.DX_DB_OPEN_ERROR, th);
                }
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public final class b extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DATABASE_VERSION = 1;

        static {
            t2o.a(444596985);
        }

        public b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/template/db/DXDataBaseHelper$DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
                return;
            }
            long nanoTime = System.nanoTime();
            DXFileDataBaseEntry.SCHEMA.createTables(sQLiteDatabase);
            DXDataBaseHelper.access$100(DXDataBaseHelper.this, "DB_Create", System.nanoTime() - nanoTime);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
                return;
            }
            DXFileDataBaseEntry.SCHEMA.dropTables(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }

    public DXDataBaseHelper(Context context, String str, String str2) {
        this.mDbHelper = new a(context, str, str2);
    }

    public static /* synthetic */ void access$000(DXDataBaseHelper dXDataBaseHelper, String str, String str2, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea34700", new Object[]{dXDataBaseHelper, str, str2, new Integer(i), th});
        } else {
            dXDataBaseHelper.trackError(str, str2, i, th);
        }
    }

    public static /* synthetic */ void access$100(DXDataBaseHelper dXDataBaseHelper, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99083dbf", new Object[]{dXDataBaseHelper, str, new Long(j)});
        } else {
            dXDataBaseHelper.trackerPerform(str, j);
        }
    }

    private void bindString(SQLiteStatement sQLiteStatement, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b9eb75", new Object[]{this, sQLiteStatement, new Integer(i), str});
        } else if (str == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindString(i, str);
        }
    }

    private String changeMap2String(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35ae8a99", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(',');
                sb.append(entry.getValue());
                sb.append(',');
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }
        }
        return null;
    }

    private boolean insertOrReplaceItem(SQLiteStatement sQLiteStatement, String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab576792", new Object[]{this, sQLiteStatement, str, dXTemplateItem})).booleanValue();
        }
        bindString(sQLiteStatement, 1, str);
        bindString(sQLiteStatement, 2, dXTemplateItem.f7343a);
        sQLiteStatement.bindLong(3, dXTemplateItem.b);
        bindString(sQLiteStatement, 4, dXTemplateItem.k.f31396a);
        bindString(sQLiteStatement, 5, changeMap2String(dXTemplateItem.k.b));
        bindString(sQLiteStatement, 6, dXTemplateItem.c);
        if (dXTemplateItem.j) {
            bindString(sQLiteStatement, 7, "1");
        }
        if (sQLiteStatement.executeInsert() > 0) {
            return true;
        }
        return false;
    }

    private void trackError(String str, String str2, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9348d76a", new Object[]{this, str, str2, new Integer(i), th});
        } else {
            trackError(str, str2, (DXTemplateItem) null, i, th);
        }
    }

    private void trackerPerform(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4adb2a", new Object[]{this, str, new Long(j)});
        } else {
            ic5.u(2, "DinamicX_db", "DB", str, null, null, j, true);
        }
    }

    public boolean batchExecuteUpdateOrDelete(String str, List<DXTemplateItem> list, String str2, String str3, int i) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae5c53df", new Object[]{this, str, list, str2, str3, new Integer(i)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && list != null && !list.isEmpty()) {
            SQLiteDatabase d = this.mDbHelper.d();
            if (d == null || !d.isOpen()) {
                trackError(str, str3, (DXTemplateItem) null, i, "SQLiteDatabase = null");
            } else {
                try {
                    SQLiteStatement compileStatement = d.compileStatement(str2);
                    d.beginTransaction();
                    loop0: while (true) {
                        z = true;
                        for (DXTemplateItem dXTemplateItem : list) {
                            bindString(compileStatement, 1, str);
                            bindString(compileStatement, 2, dXTemplateItem.f7343a);
                            compileStatement.bindLong(3, dXTemplateItem.b);
                            if (compileStatement.executeUpdateDelete() > 0) {
                                break;
                            }
                            z = false;
                        }
                    }
                    if (z) {
                        d.setTransactionSuccessful();
                    }
                    d.endTransaction();
                    z2 = z;
                } catch (Throwable th) {
                    trackError(str, str3, (DXTemplateItem) null, i, th);
                }
            }
            this.mDbHelper.a();
        }
        return z2;
    }

    public void closeDatabase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00f5e9a", new Object[]{this});
        } else {
            this.mDbHelper.b();
        }
    }

    public void delete(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e91cca5", new Object[]{this, str, dXTemplateItem});
        } else if (!TextUtils.isEmpty(str) && wh6.b(dXTemplateItem)) {
            try {
                String[] strArr = {str, dXTemplateItem.f7343a, String.valueOf(dXTemplateItem.b)};
                SQLiteDatabase d = this.mDbHelper.d();
                if (d != null) {
                    d.delete(TABLE_NAME, QUERY_WHERE_DEL, strArr);
                    this.mDbHelper.a();
                }
            } catch (Throwable th) {
                trackError(str, "DB_Delete", dXTemplateItem, f.DX_DB_DELETE_ERROR, th);
            }
        }
    }

    public void deleteAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5ab17d", new Object[]{this});
            return;
        }
        SQLiteDatabase d = this.mDbHelper.d();
        if (d != null) {
            try {
                d.execSQL("delete from template_info");
            } catch (Throwable th) {
                trackError("DinamicX_db", "DB_Delete_All", f.DX_DB_DELETE_ALL_ERROR, th);
            }
        }
        this.mDbHelper.a();
    }

    public void dropTable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e7726", new Object[]{this});
            return;
        }
        SQLiteDatabase d = this.mDbHelper.d();
        if (d != null) {
            DXFileDataBaseEntry.SCHEMA.dropTables(d);
        }
        this.mDbHelper.a();
    }

    public void store(String str, List<DXTemplateItem> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cda3", new Object[]{this, str, list});
        } else if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            SQLiteDatabase d = this.mDbHelper.d();
            if (d == null || !d.isOpen()) {
                trackError(str, "DB_Store", (DXTemplateItem) null, f.DX_DB_STORE_ERROR, "SQLiteDatabase = null");
            } else {
                try {
                    SQLiteStatement compileStatement = d.compileStatement(INSERT_SQL);
                    d.beginTransaction();
                    for (DXTemplateItem dXTemplateItem : list) {
                        xh6 xh6Var = dXTemplateItem.k;
                        if (xh6Var != null && !TextUtils.isEmpty(xh6Var.f31396a) && insertOrReplaceItem(compileStatement, str, dXTemplateItem)) {
                        }
                        z = false;
                    }
                    if (z) {
                        d.setTransactionSuccessful();
                    }
                    d.endTransaction();
                } catch (Throwable th) {
                    trackError(str, "DB_Store", (DXTemplateItem) null, f.DX_DB_STORE_ERROR, th);
                }
            }
            this.mDbHelper.a();
        }
    }

    public boolean updateTemplatesDirty(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b690148", new Object[]{this, str, list})).booleanValue();
        }
        return batchExecuteUpdateOrDelete(str, list, UPDATE_DIRTY_SQL, "DB_Update", f.DX_DB_UPDATE_ERROR);
    }

    private void trackError(String str, String str2, DXTemplateItem dXTemplateItem, int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8cc853", new Object[]{this, str, str2, dXTemplateItem, new Integer(i), th});
        } else {
            trackError(str, str2, dXTemplateItem, i, xv5.a(th));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDbSize() {
        /*
            r6 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.dinamicx.template.db.DXDataBaseHelper.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0019
            java.lang.String r2 = "5367468f"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            java.lang.Object r0 = r1.ipc$dispatch(r2, r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L_0x0019:
            com.taobao.android.dinamicx.template.db.DXDataBaseHelper$a r1 = r6.mDbHelper
            android.database.sqlite.SQLiteDatabase r1 = r1.c()
            r2 = 0
            java.lang.String r3 = "select * from template_info"
            android.database.Cursor r2 = r1.rawQuery(r3, r2)     // Catch: all -> 0x0037
            r2.moveToFirst()     // Catch: all -> 0x0037
            int r0 = r2.getCount()     // Catch: all -> 0x0037
        L_0x002e:
            r2.close()
        L_0x0031:
            com.taobao.android.dinamicx.template.db.DXDataBaseHelper$a r1 = r6.mDbHelper
            r1.a()
            goto L_0x0045
        L_0x0037:
            r1 = move-exception
            java.lang.String r3 = "DinamicX_Db"
            java.lang.String r4 = "DB_Query"
            r5 = 60015(0xea6f, float:8.4099E-41)
            r6.trackError(r3, r4, r5, r1)     // Catch: all -> 0x0046
            if (r2 == 0) goto L_0x0031
            goto L_0x002e
        L_0x0045:
            return r0
        L_0x0046:
            r0 = move-exception
            if (r2 == 0) goto L_0x004c
            r2.close()
        L_0x004c:
            com.taobao.android.dinamicx.template.db.DXDataBaseHelper$a r1 = r6.mDbHelper
            r1.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.template.db.DXDataBaseHelper.getDbSize():int");
    }

    private void trackError(String str, String str2, DXTemplateItem dXTemplateItem, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8501e22c", new Object[]{this, str, str2, dXTemplateItem, new Integer(i), str3});
            return;
        }
        f fVar = new f(str);
        fVar.b = dXTemplateItem;
        f.a aVar = new f.a("DB", str2, i);
        aVar.e = str3;
        ArrayList arrayList = new ArrayList();
        fVar.c = arrayList;
        arrayList.add(aVar);
        ic5.p(fVar);
    }

    static {
        t2o.a(444596983);
    }

    public boolean delete(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("904c72f1", new Object[]{this, str, list})).booleanValue() : batchExecuteUpdateOrDelete(str, list, DELETE_SQL, "DB_Delete", f.DX_DB_DELETE_ERROR);
    }

    public boolean queryTemplateExist(String str, DXTemplateItem dXTemplateItem) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f72a14b3", new Object[]{this, str, dXTemplateItem})).booleanValue();
        }
        String[] strArr = {str, dXTemplateItem.f7343a, String.valueOf(dXTemplateItem.b)};
        Cursor cursor = null;
        try {
            SQLiteDatabase c = this.mDbHelper.c();
            if (c == null) {
                trackError(str, "DB_Query", dXTemplateItem, f.DX_DB_QUERY_ERROR, "SQLiteDatabase = null");
                this.mDbHelper.a();
                return false;
            }
            Cursor query = c.query(TABLE_NAME, QUERY_COLUMNS, QUERY_WHERE_DEL, strArr, null, null, ORDER_BY);
            if (query == null || query.getCount() <= 0) {
                z = false;
            }
            if (query != null) {
                query.close();
            }
            this.mDbHelper.a();
            return z;
        } catch (Throwable th) {
            try {
                trackError(str, "DB_Query", dXTemplateItem, f.DX_DB_QUERY_ERROR, th);
                return false;
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
                this.mDbHelper.a();
            }
        }
    }

    public LinkedList<DXTemplateItem> query(String str, DXTemplateItem dXTemplateItem) {
        Throwable th;
        SQLiteDatabase c;
        String[] split;
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("a59e022c", new Object[]{this, str, dXTemplateItem});
        }
        LinkedList<DXTemplateItem> linkedList = new LinkedList<>();
        String[] strArr = {str, dXTemplateItem.f7343a};
        Cursor cursor = null;
        try {
            c = this.mDbHelper.c();
        } catch (Throwable th2) {
            th = th2;
        }
        if (c == null) {
            trackError(str, "DB_Query", dXTemplateItem, f.DX_DB_QUERY_ERROR, "SQLiteDatabase = null");
            this.mDbHelper.a();
            return linkedList;
        }
        cursor = c.query(TABLE_NAME, QUERY_COLUMNS, QUERY_WHERE, strArr, null, null, ORDER_BY);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
                    dXTemplateItem2.k = new xh6();
                    dXTemplateItem2.f7343a = dXTemplateItem.f7343a;
                    dXTemplateItem2.b = cursor.getLong(2);
                    dXTemplateItem2.k.f31396a = cursor.getString(3);
                    String string = cursor.getString(4);
                    if (!TextUtils.isEmpty(string) && (length = (split = string.split(",")).length) > 1 && length % 2 == 0) {
                        dXTemplateItem2.k.b();
                        for (int i = 0; i < length; i += 2) {
                            dXTemplateItem2.k.b.put(split[i], split[i + 1]);
                        }
                    }
                    dXTemplateItem2.c = cursor.getString(5);
                    dXTemplateItem2.j = "true".equals(cursor.getString(6));
                    linkedList.addFirst(dXTemplateItem2);
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursor;
                    try {
                        trackError(str, "DB_Query", dXTemplateItem, f.DX_DB_QUERY_ERROR, th);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return linkedList;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                        this.mDbHelper.a();
                    }
                }
            }
        }
        return linkedList;
    }

    public LinkedList<DXTemplateItem> queryWithDirtyColumn(String str, DXTemplateItem dXTemplateItem) {
        Throwable th;
        SQLiteDatabase c;
        String[] split;
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("28ddfffa", new Object[]{this, str, dXTemplateItem});
        }
        LinkedList<DXTemplateItem> linkedList = new LinkedList<>();
        String[] strArr = {str, dXTemplateItem.f7343a};
        Cursor cursor = null;
        try {
            c = this.mDbHelper.c();
        } catch (Throwable th2) {
            th = th2;
        }
        if (c == null) {
            trackError(str, "DB_Query", dXTemplateItem, f.DX_DB_QUERY_ERROR, "SQLiteDatabase = null");
            this.mDbHelper.a();
            return linkedList;
        }
        cursor = c.query(TABLE_NAME, QUERY_COLUMNS_WITH_DIRTY, QUERY_WHERE, strArr, null, null, ORDER_BY);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
                    dXTemplateItem2.k = new xh6();
                    dXTemplateItem2.f7343a = dXTemplateItem.f7343a;
                    dXTemplateItem2.b = cursor.getLong(2);
                    dXTemplateItem2.k.f31396a = cursor.getString(3);
                    String string = cursor.getString(4);
                    if (!TextUtils.isEmpty(string) && (length = (split = string.split(",")).length) > 1 && length % 2 == 0) {
                        dXTemplateItem2.k.b();
                        for (int i = 0; i < length; i += 2) {
                            dXTemplateItem2.k.b.put(split[i], split[i + 1]);
                        }
                    }
                    dXTemplateItem2.c = cursor.getString(5);
                    dXTemplateItem2.i = "true".equals(cursor.getString(6));
                    dXTemplateItem2.j = "true".equals(cursor.getString(7));
                    linkedList.addFirst(dXTemplateItem2);
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursor;
                    try {
                        trackError(str, "DB_Query", dXTemplateItem, f.DX_DB_QUERY_ERROR, th);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return linkedList;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                        this.mDbHelper.a();
                    }
                }
            }
        }
        return linkedList;
    }

    public void store(String str, DXTemplateItem dXTemplateItem) {
        xh6 xh6Var;
        SQLiteStatement sQLiteStatement;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc5d8db", new Object[]{this, str, dXTemplateItem});
        } else if (!TextUtils.isEmpty(str) && dXTemplateItem != null && (xh6Var = dXTemplateItem.k) != null && !TextUtils.isEmpty(xh6Var.f31396a)) {
            SQLiteDatabase d = this.mDbHelper.d();
            if (d == null || !d.isOpen()) {
                trackError(str, "DB_Store", dXTemplateItem, f.DX_DB_STORE_ERROR, "SQLiteDatabase = null");
            } else {
                try {
                    if (dXTemplateItem.j) {
                        sQLiteStatement = d.compileStatement(INSERT_PRE_DOWNLOAD_SQL);
                    } else {
                        sQLiteStatement = d.compileStatement(INSERT_SQL);
                    }
                    insertOrReplaceItem(sQLiteStatement, str, dXTemplateItem);
                } catch (Throwable th) {
                    trackError(str, "DB_Store", dXTemplateItem, f.DX_DB_STORE_ERROR, th);
                }
            }
            this.mDbHelper.a();
        }
    }
}
