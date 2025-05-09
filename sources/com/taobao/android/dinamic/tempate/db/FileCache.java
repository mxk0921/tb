package com.taobao.android.dinamic.tempate.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.db.Entry;
import java.io.File;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.ixv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FileCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] g = {"sum(size)"};
    public static final String[] h = {"_id", UploadConstants.FILE_NAME, "tag", "size"};
    public static final String i = "last_access ASC";

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, b> f7269a;
    public final File b;
    public boolean c;
    public final long d;
    public long e;
    public final c f;

    /* compiled from: Taobao */
    @Entry.Table("file_cache")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FileEntry extends Entry {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final com.taobao.android.dinamic.tempate.db.a SCHEMA;
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
            t2o.a(444596392);
            com.taobao.android.dinamic.tempate.db.a aVar = new com.taobao.android.dinamic.tempate.db.a(FileEntry.class);
            SCHEMA = aVar;
            aVar.e(FileEntry.class);
        }

        private FileEntry() {
        }

        public static /* synthetic */ Object ipc$super(FileEntry fileEntry, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/tempate/db/FileCache$FileEntry");
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f7270a;
        public final File b;

        static {
            t2o.a(444596390);
        }

        public static /* synthetic */ long a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49d84a80", new Object[]{bVar})).longValue();
            }
            return bVar.f7270a;
        }

        public b(long j, String str, File file) {
            this.f7270a = j;
            this.b = file;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public final class c extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DATABASE_VERSION = 1;

        static {
            t2o.a(444596391);
        }

        public c(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/tempate/db/FileCache$DatabaseHelper");
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
            return (File) ipChange.ipc$dispatch("8f6061df", new Object[]{fileCache});
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

    public b e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2e6c65ff", new Object[]{this, str});
        }
        if (!this.c) {
            try {
                d();
            } catch (Exception e) {
                Log.e("FileCache", "file cache init exception:", e);
                return null;
            }
        }
        b bVar = this.f7269a.get(str);
        if (bVar != null) {
            if (bVar.b.isFile()) {
                synchronized (this) {
                    h(b.a(bVar));
                }
                return bVar;
            }
            this.f7269a.remove(str);
        }
        synchronized (this) {
            try {
                FileEntry f = f(str);
                if (f == null) {
                    return null;
                }
                long j = f.id;
                File file = new File(this.b, f.filename);
                b bVar2 = new b(j, str, file);
                if (!file.isFile()) {
                    try {
                        this.f.getWritableDatabase().delete("file_cache", "_id=?", new String[]{String.valueOf(f.id)});
                        this.e -= f.size;
                    } catch (Throwable unused) {
                    }
                    return null;
                }
                this.f7269a.put(str, bVar2);
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final FileEntry f(String str) {
        Cursor cursor;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileEntry) ipChange.ipc$dispatch("b23bc53a", new Object[]{this, str});
        }
        String[] strArr = {String.valueOf(ixv.b(str)), str};
        try {
            SQLiteDatabase readableDatabase = this.f.getReadableDatabase();
            com.taobao.android.dinamic.tempate.db.a aVar = FileEntry.SCHEMA;
            cursor = readableDatabase.query("file_cache", aVar.d(), "hash_code=? AND tag=?", strArr, null, null, null);
            try {
                if (!cursor.moveToNext()) {
                    cursor.close();
                    return null;
                }
                FileEntry fileEntry = new FileEntry();
                aVar.b(cursor, fileEntry);
                h(fileEntry.id);
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

    public void g(String str, File file) {
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
        ixv.a(file.getParentFile().equals(this.b));
        FileEntry fileEntry = new FileEntry();
        fileEntry.hashCode = ixv.b(str);
        fileEntry.tag = str;
        fileEntry.filename = file.getName();
        fileEntry.size = file.length();
        fileEntry.lastAccess = System.currentTimeMillis();
        if (fileEntry.size < this.d) {
            synchronized (this) {
                try {
                    FileEntry f = f(str);
                    if (f != null) {
                        fileEntry.filename = f.filename;
                        fileEntry.size = f.size;
                    } else {
                        this.e += fileEntry.size;
                    }
                    FileEntry.SCHEMA.f(this.f.getWritableDatabase(), fileEntry);
                    if (this.e > this.d) {
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

    public final void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca2fbba", new Object[]{this, new Long(j)});
        } else if (Build.VERSION.SDK_INT == 29) {
            try {
                i(this.f.getWritableDatabase(), "file_cache", "_id=?", String.valueOf(j));
            } catch (Throwable th) {
                Log.e("FileCache", "sdk int 29 update db exception", th);
            }
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_access", Long.valueOf(System.currentTimeMillis()));
            try {
                this.f.getWritableDatabase().update("file_cache", contentValues, "_id=?", new String[]{String.valueOf(j)});
            } catch (Throwable th2) {
                Log.e("FileCache", "update db exception", th2);
            }
        }
    }

    public FileCache(Context context, File file, String str, long j, int i2) {
        this.c = false;
        this.b = file;
        this.d = j;
        this.f7269a = new LruCache<>(i2);
        this.f = new c(context, str);
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
            Cursor query = this.f.getReadableDatabase().query("file_cache", g, null, null, null, null, null);
            if (query.moveToNext()) {
                this.e = query.getLong(0);
            }
            query.close();
            if (this.e > this.d) {
                c(16);
            }
        }
    }

    public final int i(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5d6071", new Object[]{this, sQLiteDatabase, str, str2, str3})).intValue();
        }
        sQLiteDatabase.acquireReference();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(str);
            sb.append(" SET last_access=?");
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(sb.toString());
            compileStatement.bindLong(1, System.currentTimeMillis());
            compileStatement.bindString(2, str3);
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            compileStatement.close();
            sQLiteDatabase.releaseReference();
            return executeUpdateDelete;
        } catch (Throwable th) {
            sQLiteDatabase.releaseReference();
            throw th;
        }
    }

    static {
        t2o.a(444596388);
    }

    public final void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a00ca3", new Object[]{this, new Integer(i2)});
            return;
        }
        Cursor query = this.f.getReadableDatabase().query("file_cache", h, null, null, null, null, i);
        while (i2 > 0) {
            try {
                if (this.e <= this.d || !query.moveToNext()) {
                    break;
                }
                long j = query.getLong(0);
                String string = query.getString(1);
                String string2 = query.getString(2);
                long j2 = query.getLong(3);
                synchronized (this.f7269a) {
                    if (this.f7269a.get(string2) == null) {
                        i2--;
                        if (b(new File(this.b, string))) {
                            this.e -= j2;
                            this.f.getWritableDatabase().delete("file_cache", "_id=?", new String[]{String.valueOf(j)});
                        }
                    }
                }
            } finally {
                query.close();
            }
        }
    }
}
