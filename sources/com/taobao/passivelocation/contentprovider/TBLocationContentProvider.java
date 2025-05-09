package com.taobao.passivelocation.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLocationContentProvider extends ContentProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Uri CONTENT_URI;
    public static final String KEY_CONTENT = "name";
    public static final String KEY_ID = "_id";
    public static final UriMatcher b;

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f11444a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(789577840);
        }

        public a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/passivelocation/contentprovider/TBLocationContentProvider$PlacesDatabaseHelper");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            } else {
                sQLiteDatabase.execSQL("create table locations (_id integer primary key autoincrement, name TEXT); ");
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
                return;
            }
            StringBuilder sb = new StringBuilder("Upgrading database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            sb.append(", which will destroy all old data");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS locations");
            onCreate(sQLiteDatabase);
        }
    }

    public static /* synthetic */ Object ipc$super(TBLocationContentProvider tBLocationContentProvider, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/passivelocation/contentprovider/TBLocationContentProvider");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
        if (r13 != null) goto L_0x007d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        if (r13 == null) goto L_0x0095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
        if (r5 <= 0) goto L_0x00af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
        r13 = android.content.ContentUris.withAppendedId(com.taobao.passivelocation.contentprovider.TBLocationContentProvider.CONTENT_URI, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
        getContext().getContentResolver().notifyChange(r13, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
        throw new android.database.SQLException("Failed to insert row into " + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
        new java.lang.StringBuilder("Failed to insert row into ").append(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3 A[Catch: Exception -> 0x00c7, TryCatch #4 {Exception -> 0x00c7, blocks: (B:7:0x0025, B:18:0x007d, B:27:0x009b, B:31:0x00af, B:32:0x00c0, B:34:0x00c3, B:35:0x00c6), top: B:44:0x0025 }] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.net.Uri insert(android.net.Uri r12, android.content.ContentValues r13) {
        /*
            r11 = this;
            java.lang.String r0 = "locations"
            java.lang.String r1 = "Failed to insert row into "
            java.lang.String r2 = "addMessage exception 2"
            java.lang.String r3 = "_id ="
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.passivelocation.contentprovider.TBLocationContentProvider.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0024
            java.lang.String r0 = "77bd6b8c"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r11
            r2 = 1
            r1[r2] = r12
            r12 = 2
            r1[r12] = r13
            java.lang.Object r12 = r4.ipc$dispatch(r0, r1)
            android.net.Uri r12 = (android.net.Uri) r12
            return r12
        L_0x0024:
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r11.f11444a     // Catch: Exception -> 0x00c7
            java.lang.String r6 = "nullhack"
            long r5 = r5.insert(r0, r6, r13)     // Catch: Exception -> 0x00c7
            java.lang.String r13 = "select count(*) NUM from locations"
            android.database.sqlite.SQLiteDatabase r7 = r11.f11444a     // Catch: all -> 0x0081, Exception -> 0x0084
            android.database.Cursor r13 = r7.rawQuery(r13, r4)     // Catch: all -> 0x0081, Exception -> 0x0084
            if (r13 == 0) goto L_0x007b
            r13.moveToFirst()     // Catch: all -> 0x0077, Exception -> 0x0079
            java.lang.String r7 = "NUM"
            int r7 = r13.getColumnIndex(r7)     // Catch: all -> 0x0077, Exception -> 0x0079
            int r7 = r13.getInt(r7)     // Catch: all -> 0x0077, Exception -> 0x0079
            r8 = 11
            if (r7 < r8) goto L_0x007b
            java.lang.String r7 = "select _id from locations order by _id limit 1"
            android.database.sqlite.SQLiteDatabase r8 = r11.f11444a     // Catch: all -> 0x0077, Exception -> 0x0079
            android.database.Cursor r7 = r8.rawQuery(r7, r4)     // Catch: all -> 0x0077, Exception -> 0x0079
            if (r7 == 0) goto L_0x007b
            r7.moveToFirst()     // Catch: all -> 0x0077, Exception -> 0x0079
            java.lang.String r8 = "_id"
            int r8 = r7.getColumnIndex(r8)     // Catch: all -> 0x0077, Exception -> 0x0079
            int r8 = r7.getInt(r8)     // Catch: all -> 0x0077, Exception -> 0x0079
            android.database.sqlite.SQLiteDatabase r9 = r11.f11444a     // Catch: all -> 0x0077, Exception -> 0x0079
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: all -> 0x0077, Exception -> 0x0079
            r10.<init>(r3)     // Catch: all -> 0x0077, Exception -> 0x0079
            r10.append(r8)     // Catch: all -> 0x0077, Exception -> 0x0079
            java.lang.String r3 = r10.toString()     // Catch: all -> 0x0077, Exception -> 0x0079
            r9.delete(r0, r3, r4)     // Catch: all -> 0x0077, Exception -> 0x0079
            r7.close()     // Catch: all -> 0x0077, Exception -> 0x0079
            goto L_0x007b
        L_0x0077:
            r0 = move-exception
            goto L_0x00c1
        L_0x0079:
            r0 = move-exception
            goto L_0x0086
        L_0x007b:
            if (r13 == 0) goto L_0x0095
        L_0x007d:
            r13.close()     // Catch: Exception -> 0x00c7
            goto L_0x0095
        L_0x0081:
            r0 = move-exception
            r13 = r4
            goto L_0x00c1
        L_0x0084:
            r0 = move-exception
            r13 = r4
        L_0x0086:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0077
            r3.<init>(r2)     // Catch: all -> 0x0077
            java.lang.String r0 = r0.getMessage()     // Catch: all -> 0x0077
            r3.append(r0)     // Catch: all -> 0x0077
            if (r13 == 0) goto L_0x0095
            goto L_0x007d
        L_0x0095:
            r2 = 0
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x00af
            android.net.Uri r13 = com.taobao.passivelocation.contentprovider.TBLocationContentProvider.CONTENT_URI     // Catch: Exception -> 0x00c7
            android.net.Uri r13 = android.content.ContentUris.withAppendedId(r13, r5)     // Catch: Exception -> 0x00c7
            android.content.Context r0 = r11.getContext()     // Catch: Exception -> 0x00ad
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: Exception -> 0x00ad
            r0.notifyChange(r13, r4)     // Catch: Exception -> 0x00ad
            return r13
        L_0x00ad:
            r4 = r13
            goto L_0x00c7
        L_0x00af:
            android.database.SQLException r13 = new android.database.SQLException     // Catch: Exception -> 0x00c7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: Exception -> 0x00c7
            r0.<init>(r1)     // Catch: Exception -> 0x00c7
            r0.append(r12)     // Catch: Exception -> 0x00c7
            java.lang.String r0 = r0.toString()     // Catch: Exception -> 0x00c7
            r13.<init>(r0)     // Catch: Exception -> 0x00c7
            throw r13     // Catch: Exception -> 0x00c7
        L_0x00c1:
            if (r13 == 0) goto L_0x00c6
            r13.close()     // Catch: Exception -> 0x00c7
        L_0x00c6:
            throw r0     // Catch: Exception -> 0x00c7
        L_0x00c7:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            r13.append(r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.passivelocation.contentprovider.TBLocationContentProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb070cb0", new Object[]{this, uri});
        }
        int match = b.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/vnd.passivelocation.location";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/vnd.passivelocation.location";
        }
        throw new IllegalArgumentException("Unsupported URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a7a6c6", new Object[]{this})).booleanValue();
        }
        AppMonitor.Counter.commit("passivelocation", "TBLocationContentProvider", 1.0d);
        try {
            this.f11444a = new a(getContext(), "location.db", null, 1).getWritableDatabase();
        } catch (SQLiteException e) {
            this.f11444a = null;
            e.getMessage();
            e.printStackTrace();
        }
        return this.f11444a != null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("ad900bff", new Object[]{this, uri, strArr, str, strArr2, str2});
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("locations");
        if (b.match(uri) == 2) {
            sQLiteQueryBuilder.appendWhere("_id=" + uri.getPathSegments().get(1));
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "_id ASC";
        }
        Cursor cursor = null;
        try {
            cursor = sQLiteQueryBuilder.query(this.f11444a, strArr, str, strArr2, null, null, str2);
            cursor.setNotificationUri(getContext().getContentResolver(), uri);
            return cursor;
        } catch (Exception e) {
            y7t.a("PlacesContentProvider", "query data error: " + e.getMessage());
            return cursor;
        }
    }

    static {
        String str;
        t2o.a(789577839);
        StringBuilder sb = new StringBuilder("content://");
        if ("com.taobao.taobao".equals(Globals.getApplication().getPackageName())) {
            str = "com.taobao.passivelocation.provider.locations";
        } else {
            str = "com.taobao.passivelocation.provider.locations".replace("com.taobao", Globals.getApplication().getPackageName());
        }
        sb.append(str);
        sb.append("/locations");
        CONTENT_URI = Uri.parse(sb.toString());
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        String packageName = Globals.getApplication().getPackageName();
        if ("com.taobao.taobao".equals(packageName)) {
            uriMatcher.addURI("com.taobao.passivelocation.provider.locations", "locations", 1);
            uriMatcher.addURI("com.taobao.passivelocation.provider.locations", "locations/*", 2);
            return;
        }
        String replace = "com.taobao.passivelocation.provider.locations".replace("com.taobao", packageName);
        uriMatcher.addURI(replace, "locations", 1);
        uriMatcher.addURI(replace, "locations/*", 2);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int delete;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89592153", new Object[]{this, uri, str, strArr})).intValue();
        }
        try {
            int match = b.match(uri);
            if (match == 1) {
                delete = this.f11444a.delete("locations", str, strArr);
            } else if (match == 2) {
                SQLiteDatabase sQLiteDatabase = this.f11444a;
                StringBuilder sb = new StringBuilder("_id=");
                sb.append(uri.getPathSegments().get(1));
                if (!TextUtils.isEmpty(str)) {
                    str2 = " AND (" + str + ')';
                } else {
                    str2 = "";
                }
                sb.append(str2);
                delete = sQLiteDatabase.delete("locations", sb.toString(), strArr);
            } else {
                throw new IllegalArgumentException("Unsupported URI: " + uri);
            }
            getContext().getContentResolver().notifyChange(uri, null);
            return delete;
        } catch (Exception e) {
            y7t.a("PlacesContentProvider", "delete data error: " + e.getMessage());
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68d633c3", new Object[]{this, uri, contentValues, str, strArr})).intValue();
        }
        try {
            int match = b.match(uri);
            if (match == 1) {
                update = this.f11444a.update("locations", contentValues, str, strArr);
            } else if (match == 2) {
                SQLiteDatabase sQLiteDatabase = this.f11444a;
                StringBuilder sb = new StringBuilder("_id=");
                sb.append(uri.getPathSegments().get(1));
                if (!TextUtils.isEmpty(str)) {
                    str2 = " AND (" + str + ')';
                } else {
                    str2 = "";
                }
                sb.append(str2);
                update = sQLiteDatabase.update("locations", contentValues, sb.toString(), strArr);
            } else {
                throw new IllegalArgumentException("Unknown URI " + uri);
            }
            getContext().getContentResolver().notifyChange(uri, null);
            return update;
        } catch (Exception e) {
            y7t.a("PlacesContentProvider", "update data error: " + e.getMessage());
            return 0;
        }
    }
}
