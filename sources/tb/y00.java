package tb;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.taobao.windvane.jsbridge.api.WVFile;
import android.util.Log;
import com.nirvana.tools.logger.cache.db.DbException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import tb.o1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class y00<T extends o1> {
    public static final int DEFAULT_LIMIT = 5242880;

    /* renamed from: a  reason: collision with root package name */
    public final b55 f31751a;
    public SQLiteDatabase b;
    public final String c;
    public final Semaphore d = new Semaphore(1);

    public y00(String str, b55 b55Var) {
        this.c = str;
        this.f31751a = b55Var;
        r(WVFile.FILE_MAX_SIZE);
    }

    public void a() {
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.b = null;
        }
    }

    public String b(long j) {
        if (j <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(f7l.BRACKET_START_STR);
        do {
            sb.append("?,");
            j--;
        } while (j > 0);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public synchronized boolean c(SQLiteDatabase sQLiteDatabase, int i) throws DbException {
        try {
            try {
                System.currentTimeMillis();
                Cursor query = sQLiteDatabase.query(this.c, new String[]{"_id"}, null, null, null, null, "timestamp ASC", i > 0 ? String.valueOf(i) : null);
                ArrayList arrayList = new ArrayList();
                while (query.moveToNext()) {
                    long n = n(query);
                    Long valueOf = Long.valueOf(n);
                    if (n != -1) {
                        arrayList.add(valueOf);
                    }
                }
                query.close();
                System.currentTimeMillis();
                if (!arrayList.isEmpty()) {
                    return e(sQLiteDatabase, arrayList);
                }
            } catch (Exception e) {
                new DbException("Delete oldest exception!", e);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean d(List<T> list) throws DbException {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        arrayList.add(Long.valueOf(t.b()));
                    }
                    boolean e = e(j(), arrayList);
                    a();
                    return e;
                }
            } catch (DbException e2) {
                throw e2;
            }
        }
        a();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized boolean e(SQLiteDatabase sQLiteDatabase, List<Long> list) throws DbException {
        if (list != 0) {
            try {
                if (!list.isEmpty()) {
                    list.size();
                    String[] strArr = new String[list.size()];
                    l(list, strArr);
                    if (sQLiteDatabase.delete(this.c, "_id in " + b(list.size()), strArr) == list.size()) {
                        return true;
                    }
                    return false;
                }
            } catch (Exception e) {
                throw new DbException("Delete records failed!", e);
            }
        }
        return true;
    }

    public abstract ContentValues f(T t);

    public int g(SQLiteDatabase sQLiteDatabase) {
        return (int) DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT COUNT(_id) FROM " + this.c, null);
    }

    public synchronized long h() {
        long pageSize;
        pageSize = i().getPageSize() * DatabaseUtils.longForQuery(this.b, "PRAGMA page_count;", null);
        a();
        return pageSize;
    }

    public SQLiteDatabase i() {
        if (this.b == null) {
            this.b = this.f31751a.getReadableDatabase();
        }
        return this.b;
    }

    public synchronized SQLiteDatabase j() {
        try {
            if (this.b == null) {
                this.b = this.f31751a.getWritableDatabase();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public synchronized boolean k(List<T> list) throws DbException {
        if (list != null) {
            long j = -1;
            try {
                if (list.size() != 0) {
                    if (h() >= WVFile.FILE_MAX_SIZE) {
                        c(j(), g(j()) / 2);
                    }
                    this.d.acquire();
                    j().beginTransaction();
                    for (T t : list) {
                        ContentValues f = f(t);
                        j = j().insert(this.c, null, f);
                        if (j < 0 && g(j()) > 0) {
                            c(j(), g(j()) / 2);
                            j = j().insert(this.c, null, f);
                        }
                    }
                    j().setTransactionSuccessful();
                    j();
                    this.b.endTransaction();
                    this.d.release();
                    a();
                    if (j >= 0) {
                        return true;
                    }
                    return false;
                }
            } catch (Exception e) {
                throw new DbException("Insert record failed!", e);
            }
        }
        j();
        this.b.endTransaction();
        this.d.release();
        a();
        return false;
    }

    public final <G> void l(List<G> list, String[] strArr) {
        if (list.size() != strArr.length) {
            Log.e("tb.y00", "NumberList size(" + list.size() + ") not equals results length[" + strArr.length + "]");
            return;
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = String.valueOf(list.get(i));
        }
    }

    public abstract T m(Cursor cursor);

    public final long n(Cursor cursor) {
        if (cursor == null) {
            return -1L;
        }
        return cursor.getLong(cursor.getColumnIndex("_id"));
    }

    public synchronized List<T> o(int i, int i2, String str) {
        String[] strArr;
        ArrayList arrayList;
        String str2 = null;
        String str3 = "";
        if (i2 >= 0) {
            strArr = new String[]{String.valueOf(i2)};
            str2 = "upload_flag = ?";
        } else {
            strArr = null;
        }
        if (i > 0) {
            str3 = String.valueOf(i);
        }
        arrayList = new ArrayList();
        Cursor query = i().query(this.c, null, str2, strArr, null, null, str, str3);
        while (query.moveToNext()) {
            T m = m(query);
            if (m != null) {
                arrayList.add(m);
            }
        }
        query.close();
        arrayList.toString();
        arrayList.size();
        a();
        return arrayList;
    }

    public synchronized long q() {
        long j;
        Cursor query = i().query(true, this.c, new String[]{"_id"}, "upload_flag=?", new String[]{"1"}, null, null, "_id desc", null);
        query.moveToFirst();
        j = query.getLong(0);
        query.close();
        a();
        return j;
    }

    public synchronized void r(long j) {
        try {
            j().setMaximumSize(j);
            a();
        } catch (Exception e) {
            e.printStackTrace();
            a();
        }
    }

    public synchronized void s(List<T> list, long j, int i) throws DbException {
        if (list != null) {
            if (list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    arrayList.add(Long.valueOf(t.b()));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(String.valueOf(j));
                arrayList2.add(String.valueOf(i));
                arrayList2.add("1");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(String.valueOf((Long) it.next()));
                }
                String[] strArr = new String[arrayList2.size()];
                arrayList2.toArray(strArr);
                j().execSQL("Update " + this.c + " SET timestamp=?, upload_flag=?, upload_count= upload_count+? where _id in " + b(arrayList.size()), strArr);
                a();
                return;
            }
        }
        a();
    }

    public synchronized List<T> p(long j, long j2, int i) {
        ArrayList arrayList;
        String str = "";
        StringBuilder sb = new StringBuilder("upload_flag = ?");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("1");
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 >= 0 && j2 >= 0 && j2 >= j) {
            arrayList2.add(String.valueOf(j));
            arrayList2.add(String.valueOf(j2));
            sb.append(" and _id between ? and ?");
        } else if (i2 >= 0) {
            arrayList2.add(String.valueOf(j));
            sb.append(" and _id >= ?");
        } else if (j2 >= 0) {
            arrayList2.add(String.valueOf(j2));
            sb.append(" and _id <= ?");
        }
        if (i > 0) {
            str = String.valueOf(i);
        }
        String[] strArr = new String[arrayList2.size()];
        arrayList2.toArray(strArr);
        arrayList = new ArrayList();
        Cursor query = i().query(this.c, null, sb.toString(), strArr, null, null, "_id ASC", str);
        while (query.moveToNext()) {
            T m = m(query);
            if (m != null) {
                arrayList.add(m);
            }
        }
        query.close();
        arrayList.toString();
        arrayList.size();
        a();
        return arrayList;
    }
}
