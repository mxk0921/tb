package com.taobao.android.ultron.datamodel.cache.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.cache.db.Entry;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.hav;
import tb.pav;
import tb.t2o;
import tb.uxv;
import tb.v9v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = d.SCHEMA.e();

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, C0510b> f9846a;
    public final File b;
    public boolean c;
    public final long d;
    public final c e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ContentValues f9847a;
        public final /* synthetic */ long b;

        public a(ContentValues contentValues, long j) {
            this.f9847a = contentValues;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                b.b(b.this).getWritableDatabase().update(b.a(), this.f9847a, "_id=?", new String[]{String.valueOf(this.b)});
            } catch (Exception e) {
                hav.b("ultron", "updateLastAccessError", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.ultron.datamodel.cache.db.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class C0510b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f9848a;
        public final String b;
        public final File c;

        static {
            t2o.a(83886147);
        }

        public /* synthetic */ C0510b(long j, String str, File file, a aVar) {
            this(j, str, file);
        }

        public static /* synthetic */ long a(C0510b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("14167a84", new Object[]{bVar})).longValue();
            }
            return bVar.f9848a;
        }

        public C0510b(long j, String str, File file) {
            this.f9848a = j;
            this.b = str;
            this.c = file;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class c extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DATABASE_VERSION = 1;

        static {
            t2o.a(83886148);
        }

        public c(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/cache/db/FileCache$DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
                return;
            }
            d.SCHEMA.a(sQLiteDatabase);
            File[] listFiles = b.c(b.this).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (!file.delete()) {
                        file.getAbsolutePath();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
                return;
            }
            d.SCHEMA.c(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }

    /* compiled from: Taobao */
    @Entry.Table("file_cache")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d extends Entry {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final com.taobao.android.ultron.datamodel.cache.db.a SCHEMA = new com.taobao.android.ultron.datamodel.cache.db.a(d.class);
        @Entry.Column(indexed = true, value = "hash_code")
        public long b;
        @Entry.Column("tag")
        public String c;
        @Entry.Column(UploadConstants.FILE_NAME)
        public String d;
        @Entry.Column("size")
        public long e;
        @Entry.Column(indexed = true, value = "last_access")
        public long f;

        static {
            t2o.a(83886149);
        }

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/cache/db/FileCache$FileEntry");
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FileEntry{hashCode=" + this.b + ", tag='" + this.c + "', filename='" + this.d + "', size=" + this.e + ", lastAccess=" + this.f + '}';
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        t2o.a(83886145);
    }

    public b(Context context, File file, String str, long j) {
        this(context, file, str, j, 4);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("642796a6", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ c b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("4d5259ee", new Object[]{bVar});
        }
        return bVar.e;
    }

    public static /* synthetic */ File c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2aa364bc", new Object[]{bVar});
        }
        return bVar.b;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3343545c", new Object[]{this, str});
            return;
        }
        synchronized (this) {
            d i = i(str);
            if (i != null) {
                C0510b bVar = new C0510b(i.f9843a, str, new File(this.b, i.d), null);
                try {
                    this.e.getWritableDatabase().delete(f, "_id=?", new String[]{String.valueOf(i.f9843a)});
                } catch (Throwable unused) {
                }
                try {
                    bVar.c.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<C0510b> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96bfe95", new Object[]{this});
        }
        if (!this.c) {
            try {
                g();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return null;
            }
        }
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                List<d> f2 = f();
                if (f2 == null) {
                    return null;
                }
                for (d dVar : f2) {
                    long j = dVar.f9843a;
                    String str = dVar.c;
                    File file = new File(this.b, dVar.d);
                    C0510b bVar = new C0510b(j, str, file, null);
                    if (!file.isFile()) {
                        try {
                            this.e.getWritableDatabase().delete(f, "_id=?", new String[]{String.valueOf(dVar.f9843a)});
                        } catch (Throwable unused) {
                        }
                    } else {
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r2 == null) goto L_0x0060;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.taobao.android.ultron.datamodel.cache.db.b.d> f() {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.ultron.datamodel.cache.db.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "85b9f894"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r12
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0015:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            com.taobao.android.ultron.datamodel.cache.db.b$c r2 = r12.e     // Catch: all -> 0x0051
            android.database.sqlite.SQLiteDatabase r3 = r2.getReadableDatabase()     // Catch: all -> 0x0051
            java.lang.String r4 = com.taobao.android.ultron.datamodel.cache.db.b.f     // Catch: all -> 0x0051
            com.taobao.android.ultron.datamodel.cache.db.a r2 = com.taobao.android.ultron.datamodel.cache.db.b.d.SCHEMA     // Catch: all -> 0x0051
            java.lang.String[] r5 = r2.d()     // Catch: all -> 0x0051
            r9 = 0
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: all -> 0x0051
        L_0x0032:
            boolean r3 = r2.moveToNext()     // Catch: all -> 0x004b
            if (r3 == 0) goto L_0x004d
            com.taobao.android.ultron.datamodel.cache.db.b$d r3 = new com.taobao.android.ultron.datamodel.cache.db.b$d     // Catch: all -> 0x004b
            r3.<init>(r1)     // Catch: all -> 0x004b
            com.taobao.android.ultron.datamodel.cache.db.a r4 = com.taobao.android.ultron.datamodel.cache.db.b.d.SCHEMA     // Catch: all -> 0x004b
            r4.b(r2, r3)     // Catch: all -> 0x004b
            long r4 = r3.f9843a     // Catch: all -> 0x004b
            r12.k(r4)     // Catch: all -> 0x004b
            r0.add(r3)     // Catch: all -> 0x004b
            goto L_0x0032
        L_0x004b:
            r1 = move-exception
            goto L_0x0055
        L_0x004d:
            r2.close()
            goto L_0x0060
        L_0x0051:
            r2 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x0055:
            java.lang.String r3 = "FileCache"
            java.lang.String r4 = "query database exception"
            android.util.Log.e(r3, r4, r1)     // Catch: all -> 0x0061
            if (r2 == 0) goto L_0x0060
            goto L_0x004d
        L_0x0060:
            return r0
        L_0x0061:
            r0 = move-exception
            if (r2 == 0) goto L_0x0067
            r2.close()
        L_0x0067:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.ultron.datamodel.cache.db.b.f():java.util.List");
    }

    public synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        } else if (!this.c) {
            this.c = true;
            if (!this.b.isDirectory()) {
                this.b.mkdirs();
                if (!this.b.isDirectory()) {
                    throw new RuntimeException("cannot create: " + this.b.getAbsolutePath());
                }
            }
        }
    }

    public C0510b h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0510b) ipChange.ipc$dispatch("a5fb21e2", new Object[]{this, str});
        }
        if (!this.c) {
            try {
                g();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return null;
            }
        }
        C0510b bVar = this.f9846a.get(str);
        if (bVar != null) {
            if (bVar.c.isFile()) {
                synchronized (this) {
                    k(C0510b.a(bVar));
                }
                return bVar;
            }
            this.f9846a.remove(str);
        }
        synchronized (this) {
            try {
                d i = i(str);
                if (i == null) {
                    return null;
                }
                long j = i.f9843a;
                File file = new File(this.b, i.d);
                C0510b bVar2 = new C0510b(j, str, file, null);
                if (!file.isFile()) {
                    try {
                        this.e.getWritableDatabase().delete(f, "_id=?", new String[]{String.valueOf(i.f9843a)});
                    } catch (Throwable unused) {
                    }
                    return null;
                }
                this.f9846a.put(str, bVar2);
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final d i(String str) {
        Cursor cursor;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("13ba5305", new Object[]{this, str});
        }
        String[] strArr = {String.valueOf(uxv.b(str)), str};
        try {
            SQLiteDatabase readableDatabase = this.e.getReadableDatabase();
            String str2 = f;
            com.taobao.android.ultron.datamodel.cache.db.a aVar = d.SCHEMA;
            cursor = readableDatabase.query(str2, aVar.d(), "hash_code=? AND tag=?", strArr, null, null, null);
            try {
                if (!cursor.moveToNext()) {
                    cursor.close();
                    return null;
                }
                d dVar = new d(null);
                aVar.b(cursor, dVar);
                k(dVar.f9843a);
                cursor.close();
                return dVar;
            } catch (Throwable th2) {
                th = th2;
                try {
                    Log.e("FileCache", "query database exception", th);
                    return null;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public void j(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c19cea9", new Object[]{this, str, file});
            return;
        }
        if (!this.c) {
            try {
                g();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return;
            }
        }
        uxv.a(file.getParentFile().equals(this.b));
        d dVar = new d(null);
        dVar.b = uxv.b(str);
        dVar.c = str;
        dVar.d = file.getName();
        dVar.e = file.length();
        dVar.f = System.currentTimeMillis();
        if (dVar.e < this.d) {
            synchronized (this) {
                try {
                    d i = i(str);
                    if (i != null) {
                        dVar.d = i.d;
                        dVar.e = i.e;
                    }
                    d.SCHEMA.f(this.e.getWritableDatabase(), dVar);
                    Log.e("detail_FileCache", "insertOrReplace entry:" + dVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        file.delete();
        throw new IllegalArgumentException("file too large: " + dVar.e);
    }

    public b(Context context, File file, String str, long j, int i) {
        this.c = false;
        this.b = file;
        this.d = j;
        this.f9846a = new LruCache<>(i);
        c cVar = new c(context, str);
        this.e = cVar;
        cVar.setWriteAheadLoggingEnabled(false);
    }

    public final void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca2fbba", new Object[]{this, new Long(j)});
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_access", Long.valueOf(System.currentTimeMillis()));
        try {
            if (v9v.i("newUltron_container", "asyncUpdateLastAccess", true)) {
                pav.k(new a(contentValues, j));
            } else {
                this.e.getWritableDatabase().update(f, contentValues, "_id=?", new String[]{String.valueOf(j)});
            }
        } catch (Exception e) {
            Log.e("FileCache", "update db exception", e);
        }
    }
}
