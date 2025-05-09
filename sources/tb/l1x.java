package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gxp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class l1x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOGTAG = "webviewdatabase";
    public static l1x b;
    public static SQLiteDatabase c;
    public static SQLiteDatabase d;
    public static final String[] e = {"cookies", "password", "formurl", "formdata", "httpauth"};
    public static final String[] f = {"_id"};

    /* renamed from: a  reason: collision with root package name */
    public final Object f23061a = new Object();

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3edd8c56", new Object[0]);
            return;
        }
        SQLiteDatabase sQLiteDatabase = d;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE cache (_id INTEGER PRIMARY KEY, url TEXT, filepath TEXT, lastmodify TEXT, etag TEXT, expires INTEGER, expiresstring TEXT, mimetype TEXT, encoding TEXT,httpstatus INTEGER, location TEXT, contentlength INTEGER, contentdisposition TEXT, crossdomain TEXT, UNIQUE (url) ON CONFLICT REPLACE);");
            d.execSQL("CREATE INDEX cacheUrlIndex ON cache (url)");
        }
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2581d268", new Object[0]);
            return;
        }
        int version = d.getVersion();
        if (version != 0) {
            StringBuilder sb = new StringBuilder("Upgrading cache database from version ");
            sb.append(version);
            sb.append(" to 10, which will destroy all old data");
        }
        d.execSQL("DROP TABLE IF EXISTS cache");
        d.setVersion(4);
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d504be", new Object[0]);
            return;
        }
        int version = c.getVersion();
        if (version != 0) {
            StringBuilder sb = new StringBuilder("Upgrading database from version ");
            sb.append(version);
            sb.append(" to 10, which will destroy old data");
        }
        String[] strArr = e;
        if (9 == version) {
            SQLiteDatabase sQLiteDatabase = c;
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + strArr[4]);
            SQLiteDatabase sQLiteDatabase2 = c;
            sQLiteDatabase2.execSQL("CREATE TABLE " + strArr[4] + " (_id INTEGER PRIMARY KEY, host TEXT, realm TEXT, username TEXT, password TEXT, UNIQUE (host, realm) ON CONFLICT REPLACE);");
            return;
        }
        SQLiteDatabase sQLiteDatabase3 = c;
        sQLiteDatabase3.execSQL("DROP TABLE IF EXISTS " + strArr[0]);
        c.execSQL("DROP TABLE IF EXISTS cache");
        SQLiteDatabase sQLiteDatabase4 = c;
        sQLiteDatabase4.execSQL("DROP TABLE IF EXISTS " + strArr[2]);
        SQLiteDatabase sQLiteDatabase5 = c;
        sQLiteDatabase5.execSQL("DROP TABLE IF EXISTS " + strArr[3]);
        SQLiteDatabase sQLiteDatabase6 = c;
        sQLiteDatabase6.execSQL("DROP TABLE IF EXISTS " + strArr[4]);
        SQLiteDatabase sQLiteDatabase7 = c;
        sQLiteDatabase7.execSQL("DROP TABLE IF EXISTS " + strArr[1]);
        c.setVersion(10);
        SQLiteDatabase sQLiteDatabase8 = c;
        sQLiteDatabase8.execSQL("CREATE TABLE " + strArr[0] + " (_id INTEGER PRIMARY KEY, name TEXT, value TEXT, domain TEXT, path TEXT, expires INTEGER, secure INTEGER);");
        SQLiteDatabase sQLiteDatabase9 = c;
        sQLiteDatabase9.execSQL("CREATE INDEX cookiesIndex ON " + strArr[0] + " (path)");
        SQLiteDatabase sQLiteDatabase10 = c;
        sQLiteDatabase10.execSQL("CREATE TABLE " + strArr[2] + " (_id INTEGER PRIMARY KEY, url TEXT);");
        SQLiteDatabase sQLiteDatabase11 = c;
        sQLiteDatabase11.execSQL("CREATE TABLE " + strArr[3] + " (_id INTEGER PRIMARY KEY, urlid INTEGER, name TEXT, value TEXT, UNIQUE (urlid, name, value) ON CONFLICT IGNORE);");
        SQLiteDatabase sQLiteDatabase12 = c;
        sQLiteDatabase12.execSQL("CREATE TABLE " + strArr[4] + " (_id INTEGER PRIMARY KEY, host TEXT, realm TEXT, username TEXT, password TEXT, UNIQUE (host, realm) ON CONFLICT REPLACE);");
        SQLiteDatabase sQLiteDatabase13 = c;
        sQLiteDatabase13.execSQL("CREATE TABLE " + strArr[1] + " (_id INTEGER PRIMARY KEY, host TEXT, username TEXT, password TEXT, UNIQUE (host, username) ON CONFLICT REPLACE);");
    }

    public boolean i() {
        boolean j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("943b38a0", new Object[]{this})).booleanValue();
        }
        synchronized (this.f23061a) {
            j = j(0);
        }
        return j;
    }

    public static synchronized l1x h(Context context) {
        synchronized (l1x.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l1x) ipChange.ipc$dispatch("ba3f2a0a", new Object[]{context});
            }
            if (b == null) {
                b = new l1x();
                try {
                    c = context.openOrCreateDatabase("simple_webview.db", 0, null);
                } catch (SQLiteException unused) {
                    if (context.deleteDatabase("simple_webview.db")) {
                        c = context.openOrCreateDatabase("simple_webview.db", 0, null);
                    }
                }
                SQLiteDatabase sQLiteDatabase = c;
                if (!(sQLiteDatabase == null || sQLiteDatabase.getVersion() == 10)) {
                    c.beginTransaction();
                    l();
                    c.setTransactionSuccessful();
                    c.endTransaction();
                }
                SQLiteDatabase sQLiteDatabase2 = c;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.setLockingEnabled(false);
                }
                try {
                    d = context.openOrCreateDatabase("simple_webviewCache.db", 0, null);
                } catch (SQLiteException unused2) {
                    if (context.deleteDatabase("simple_webviewCache.db")) {
                        d = context.openOrCreateDatabase("simple_webviewCache.db", 0, null);
                    }
                }
                SQLiteDatabase sQLiteDatabase3 = d;
                if (!(sQLiteDatabase3 == null || sQLiteDatabase3.getVersion() == 4)) {
                    d.beginTransaction();
                    k();
                    b();
                    d.setTransactionSuccessful();
                    d.endTransaction();
                }
                SQLiteDatabase sQLiteDatabase4 = d;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.execSQL("PRAGMA read_uncommitted = true;");
                    d.setLockingEnabled(false);
                }
            }
            return b;
        }
    }

    public void a(gxp.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2283f0d3", new Object[]{this, dVar});
        } else if (dVar.f20301a != null && dVar.b != null && dVar.c != null && c != null) {
            synchronized (this.f23061a) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("domain", dVar.f20301a);
                    contentValues.put("path", dVar.b);
                    contentValues.put("name", dVar.c);
                    contentValues.put("value", dVar.d);
                    long j = dVar.e;
                    if (j != -1) {
                        contentValues.put("expires", Long.valueOf(j));
                    }
                    contentValues.put("secure", Boolean.valueOf(dVar.h));
                    c.insert(e[0], null, contentValues);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9d709", new Object[]{this});
        } else if (c != null) {
            synchronized (this.f23061a) {
                try {
                    c.delete(e[0], null, null);
                }
            }
        }
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264bba26", new Object[]{this, new Long(j)});
        } else if (c != null) {
            synchronized (this.f23061a) {
                try {
                    c.delete(e[0], "expires <= ?", new String[]{Long.toString(j)});
                }
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f570c4d", new Object[]{this});
        } else if (c != null) {
            synchronized (this.f23061a) {
                try {
                    c.delete(e[0], "expires ISNULL", null);
                }
            }
        }
    }

    public void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b736489", new Object[]{this, str, str2, str3});
        } else if (str != null && c != null) {
            synchronized (this.f23061a) {
                try {
                    c.delete(e[0], "(domain == ?) AND (path == ?) AND (name == ?)", new String[]{str, str2, str3});
                }
            }
        }
    }

    public final boolean j(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40f9248a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query(e[i], f, null, null, null, null, null);
                if (!cursor.moveToFirst()) {
                    z = false;
                }
                cursor.close();
                return z;
            } catch (IllegalStateException e2) {
                Log.e(LOGTAG, "hasEntries", e2);
                if (cursor == null) {
                    return false;
                }
                cursor.close();
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
        if (r5 == null) goto L_0x00de;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.ArrayList<tb.gxp.d> g(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.l1x.g(java.lang.String):java.util.ArrayList");
    }
}
