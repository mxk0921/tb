package com.taobao.android.trade.template.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.template.db.Entry;
import java.io.File;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.t2o;
import tb.txv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FileCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = FileEntry.SCHEMA.e();
    public static final String[] g = {"sum(size)"};
    public static final String[] h = {"_id", UploadConstants.FILE_NAME, "tag", "size"};
    public static final String i = "last_access ASC";

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, Object> f9688a;
    public final File b;
    public boolean c;
    public long d;
    public final b e;

    /* compiled from: Taobao */
    @Entry.Table("file_cache")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class FileEntry extends Entry {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final com.taobao.android.trade.template.db.a SCHEMA = new com.taobao.android.trade.template.db.a(FileEntry.class);
        @Entry.Column(UploadConstants.FILE_NAME)
        public String filename;
        @Entry.Column(indexed = true, value = "hash_code")
        public long hashCode;
        @Entry.Column(indexed = true, value = "last_access")
        public long lastAccess;
        @Entry.Column("size")
        public long size;
        @Entry.Column("tag")
        public String tag;

        static {
            t2o.a(723517491);
        }

        private FileEntry() {
        }

        public static /* synthetic */ Object ipc$super(FileEntry fileEntry, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/template/db/FileCache$FileEntry");
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FileEntry{hashCode=" + this.hashCode + ", tag='" + this.tag + "', filename='" + this.filename + "', size=" + this.size + ", lastAccess=" + this.lastAccess + '}';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class b extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DATABASE_VERSION = 1;

        static {
            t2o.a(723517490);
        }

        public b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/template/db/FileCache$DatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
                return;
            }
            FileEntry.SCHEMA.a(sQLiteDatabase);
            File[] listFiles = FileCache.a(FileCache.this).listFiles();
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
            FileEntry.SCHEMA.c(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }

    public FileCache(Context context, File file, String str, long j) {
        this(context, file, str, j, 4);
    }

    public static /* synthetic */ File a(FileCache fileCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e14a3310", new Object[]{fileCache});
        }
        return fileCache.b;
    }

    public final boolean b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bba3924", new Object[]{this, file})).booleanValue();
        }
        if (file != null) {
            return file.delete();
        }
        return true;
    }

    public final void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a00ca3", new Object[]{this, new Integer(i2)});
            return;
        }
        Cursor query = this.e.getReadableDatabase().query(f, h, null, null, null, null, i);
        while (i2 > 0) {
            try {
                if (this.d <= 20971520 || !query.moveToNext()) {
                    break;
                }
                long j = query.getLong(0);
                String string = query.getString(1);
                String string2 = query.getString(2);
                long j2 = query.getLong(3);
                synchronized (this.f9688a) {
                    if (this.f9688a.get(string2) == null) {
                        i2--;
                        if (b(new File(this.b, string))) {
                            this.d -= j2;
                            this.e.getWritableDatabase().delete(f, "_id=?", new String[]{String.valueOf(j)});
                        }
                    }
                }
            } finally {
                query.close();
            }
        }
    }

    public final FileEntry e(String str) {
        Cursor cursor;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileEntry) ipChange.ipc$dispatch("28f98bb3", new Object[]{this, str});
        }
        String[] strArr = {String.valueOf(txv.b(str)), str};
        try {
            SQLiteDatabase readableDatabase = this.e.getReadableDatabase();
            String str2 = f;
            com.taobao.android.trade.template.db.a aVar = FileEntry.SCHEMA;
            cursor = readableDatabase.query(str2, aVar.d(), "hash_code=? AND tag=?", strArr, null, null, null);
            try {
                if (!cursor.moveToNext()) {
                    cursor.close();
                    return null;
                }
                FileEntry fileEntry = new FileEntry();
                aVar.b(cursor, fileEntry);
                g(fileEntry.id);
                cursor.close();
                return fileEntry;
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

    public void f(String str, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c19cea9", new Object[]{this, str, file});
            return;
        }
        if (!this.c) {
            try {
                d();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return;
            }
        }
        txv.a(file.getParentFile().equals(this.b));
        FileEntry fileEntry = new FileEntry();
        fileEntry.hashCode = txv.b(str);
        fileEntry.tag = str;
        fileEntry.filename = file.getName();
        fileEntry.size = file.length();
        fileEntry.lastAccess = System.currentTimeMillis();
        if (fileEntry.size < 20971520) {
            synchronized (this) {
                try {
                    FileEntry e2 = e(str);
                    if (e2 != null) {
                        fileEntry.filename = e2.filename;
                        fileEntry.size = e2.size;
                    } else {
                        this.d += fileEntry.size;
                    }
                    FileEntry.SCHEMA.f(this.e.getWritableDatabase(), fileEntry);
                    if (this.d > 20971520) {
                        c(16);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        file.delete();
        throw new IllegalArgumentException("file too large: " + fileEntry.size);
    }

    public final void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca2fbba", new Object[]{this, new Long(j)});
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_access", Long.valueOf(System.currentTimeMillis()));
        try {
            this.e.getWritableDatabase().update(f, contentValues, "_id=?", new String[]{String.valueOf(j)});
        } catch (Exception e) {
            Log.e("FileCache", "update db exception", e);
        }
    }

    public FileCache(Context context, File file, String str, long j, int i2) {
        this.c = false;
        this.b = file;
        this.f9688a = new LruCache<>(i2);
        this.e = new b(context, str);
    }

    public synchronized void d() {
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
            Cursor query = this.e.getReadableDatabase().query(f, g, null, null, null, null, null);
            if (query.moveToNext()) {
                this.d = query.getLong(0);
            }
            query.close();
            if (this.d > 20971520) {
                c(16);
            }
        }
    }

    static {
        t2o.a(723517487);
    }
}
