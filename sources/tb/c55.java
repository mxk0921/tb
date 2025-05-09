package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final heq b;
    public final String c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Boolean> f16866a = new HashMap<>();
    public final HashMap<Class<?>, List<Field>> d = new HashMap<>();
    public final HashMap<Field, String> e = new HashMap<>();
    public final HashMap<Class<?>, String> f = new HashMap<>();

    static {
        t2o.a(962592858);
    }

    public c55(Context context, String str) {
        this.b = new heq(context, str);
        this.c = str;
    }

    public final SQLiteDatabase a(Class<? extends rf8> cls, String str) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("b2ba98b2", new Object[]{this, cls, str});
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        Boolean bool = Boolean.TRUE;
        if (this.f16866a.get(str) == null || !this.f16866a.get(str).booleanValue()) {
            bool = Boolean.FALSE;
        }
        if (!(cls == null || bool.booleanValue() || writableDatabase == null)) {
            List<Field> j = j(cls);
            ArrayList<Field> arrayList = new ArrayList<>();
            String str2 = " SELECT * FROM " + str + " LIMIT 0";
            if (j != null) {
                Cursor cursor = null;
                try {
                    cursor = writableDatabase.rawQuery(str2, null);
                } catch (Exception unused) {
                    nhh.f("DBMgr", "has not create table", str);
                }
                if (cursor == null) {
                    i = 1;
                } else {
                    i = 0;
                }
                while (i2 < j.size()) {
                    Field field = j.get(i2);
                    if (!"_id".equalsIgnoreCase(k(field)) && (i != 0 || (cursor != null && cursor.getColumnIndex(k(field)) == -1))) {
                        arrayList.add(field);
                    }
                    i2++;
                }
                this.b.g(cursor);
                i2 = i;
            }
            if (i2 != 0) {
                e(writableDatabase, str, arrayList);
            } else if (arrayList.size() > 0) {
                r(writableDatabase, str, arrayList);
            }
            this.f16866a.put(str, Boolean.TRUE);
        }
        return writableDatabase;
    }

    public synchronized void b(Class<? extends rf8> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14afbd69", new Object[]{this, cls});
        } else if (cls != null) {
            c(n(cls));
        }
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{this, str});
        } else if (str != null) {
            try {
                SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                if (writableDatabase != null) {
                    writableDatabase.delete(str, null, null);
                    this.b.w(writableDatabase);
                }
            } catch (Exception e) {
                nhh.h("delete db data", e, new Object[0]);
            }
        }
    }

    public synchronized int d(Class<? extends rf8> cls) {
        int i = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32e9cfda", new Object[]{this, cls})).intValue();
            } else if (cls == null) {
                return 0;
            } else {
                String n = n(cls);
                SQLiteDatabase a2 = a(cls, n);
                if (a2 != null) {
                    Cursor rawQuery = a2.rawQuery("SELECT count(*) FROM " + n, null);
                    if (rawQuery != null) {
                        rawQuery.moveToFirst();
                        i = rawQuery.getInt(0);
                    }
                    this.b.g(rawQuery);
                    this.b.w(a2);
                } else {
                    nhh.f("DBMgr", "[count] db is null. tableName", n);
                }
                return i;
            }
        }
    }

    public final void e(SQLiteDatabase sQLiteDatabase, String str, ArrayList<Field> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2d176e", new Object[]{this, sQLiteDatabase, str, arrayList});
            return;
        }
        StringBuilder c = iqq.a().c();
        c.append("CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT ,");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i != 0) {
                    c.append(",");
                }
                Class<?> type = arrayList.get(i).getType();
                c.append(" ");
                c.append(k(arrayList.get(i)));
                c.append(" ");
                c.append(m(type));
                c.append(" ");
                c.append(l(type));
            }
        }
        c.append(" );");
        String sb = c.toString();
        iqq.a().b(c);
        nhh.f("DBMgr", "excute sql:", sb);
        try {
            sQLiteDatabase.execSQL(sb);
        } catch (Exception e) {
            nhh.v("DBMgr", "create db error", e);
        }
    }

    public synchronized int f(Class<? extends rf8> cls, String str, String[] strArr) {
        int i = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("81d8811d", new Object[]{this, cls, str, strArr})).intValue();
            }
            if (cls != null) {
                SQLiteDatabase a2 = a(cls, n(cls));
                if (a2 == null) {
                    return 0;
                }
                i = a2.delete(n(cls), str, strArr);
                this.b.w(a2);
            }
            return i;
        }
    }

    public int h(rf8 rf8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("869c4dc6", new Object[]{this, rf8Var})).intValue();
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(rf8Var);
        return g(arrayList);
    }

    public final List<Field> j(Class cls) {
        Field[] declaredFields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("de7c8f5", new Object[]{this, cls});
        }
        if (this.d.containsKey(cls)) {
            return this.d.get(cls);
        }
        ArrayList arrayList = Collections.emptyList();
        if (cls != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Field field : cls.getDeclaredFields()) {
                if (field.getAnnotation(Ingore.class) == null && !field.isSynthetic()) {
                    field.setAccessible(true);
                    arrayList2.add(field);
                }
            }
            if (!(cls.getSuperclass() == null || cls.getSuperclass() == Object.class)) {
                arrayList2.addAll(j(cls.getSuperclass()));
            }
            this.d.put(cls, arrayList2);
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final String k(Field field) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31952831", new Object[]{this, field});
        }
        if (this.e.containsKey(field)) {
            return this.e.get(field);
        }
        Column column = (Column) field.getAnnotation(Column.class);
        if (column == null || TextUtils.isEmpty(column.value())) {
            str = field.getName();
        } else {
            str = column.value();
        }
        this.e.put(field, str);
        return str;
    }

    public final String l(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b415370", new Object[]{this, cls});
        }
        if (cls == Long.TYPE || cls == Integer.TYPE || cls == Long.class) {
            return "default 0";
        }
        return "default \"\"";
    }

    public final String m(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6dc5e3c", new Object[]{this, cls});
        }
        if (cls == Long.TYPE || cls == Integer.TYPE || cls == Long.class) {
            return "INTEGER";
        }
        return "TEXT";
    }

    public String n(Class<?> cls) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f5e002d", new Object[]{this, cls});
        }
        if (cls == null) {
            nhh.i("DBMgr", "cls is null");
            return null;
        } else if (this.f.containsKey(cls)) {
            return this.f.get(cls);
        } else {
            TableName tableName = (TableName) cls.getAnnotation(TableName.class);
            if (tableName == null || TextUtils.isEmpty(tableName.value())) {
                str = cls.getName().replace(".", "_");
            } else {
                str = tableName.value();
            }
            this.f.put(cls, str);
            return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void o(List<? extends rf8> list) {
        heq heqVar;
        if (list != null) {
            if (list.size() != 0) {
                String n = n(((rf8) list.get(0)).getClass());
                SQLiteDatabase a2 = a(((rf8) list.get(0)).getClass(), n);
                if (a2 == null) {
                    nhh.v("DBMgr", "[insert]can not get available db. tableName", n);
                    return;
                }
                nhh.f("DBMgr", "entities.size", Integer.valueOf(list.size()));
                try {
                    try {
                        List<Field> j = j(((rf8) list.get(0)).getClass());
                        ContentValues contentValues = new ContentValues();
                        a2.beginTransaction();
                        for (int i = 0; i < list.size(); i++) {
                            rf8 rf8Var = (rf8) list.get(i);
                            for (int i2 = 0; i2 < j.size(); i2++) {
                                Field field = j.get(i2);
                                String k = k(field);
                                try {
                                    Object obj = field.get(rf8Var);
                                    if (obj != null) {
                                        contentValues.put(k, String.valueOf(obj));
                                    } else {
                                        contentValues.put(k, "");
                                    }
                                } catch (Exception e) {
                                    nhh.v("DBMgr", "get field failed", e);
                                }
                            }
                            long j2 = rf8Var._id;
                            if (j2 == -1) {
                                contentValues.remove("_id");
                                long insert = a2.insert(n, null, contentValues);
                                if (insert != -1) {
                                    rf8Var._id = insert;
                                }
                            } else {
                                a2.update(n, contentValues, "_id=?", new String[]{String.valueOf(j2)});
                            }
                            contentValues.clear();
                        }
                        try {
                            a2.setTransactionSuccessful();
                        } catch (Exception unused) {
                        }
                        try {
                            a2.endTransaction();
                        } catch (Exception unused2) {
                        }
                        heqVar = this.b;
                    } catch (Throwable unused3) {
                        a2.setTransactionSuccessful();
                        try {
                            a2.endTransaction();
                        } catch (Exception unused4) {
                        }
                        heqVar = this.b;
                        heqVar.w(a2);
                    }
                } catch (Exception unused5) {
                    a2.endTransaction();
                    heqVar = this.b;
                    heqVar.w(a2);
                }
                heqVar.w(a2);
            }
        }
    }

    public void p(rf8 rf8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c41e5961", new Object[]{this, rf8Var});
        } else if (rf8Var != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(rf8Var);
            o(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void q(List<? extends rf8> list) {
        heq heqVar;
        if (list != null) {
            if (list.size() != 0) {
                String n = n(((rf8) list.get(0)).getClass());
                SQLiteDatabase a2 = a(((rf8) list.get(0)).getClass(), n);
                if (a2 == null) {
                    nhh.f("DBMgr", "[update] db is null. tableName", n);
                    return;
                }
                try {
                    try {
                        a2.beginTransaction();
                        List<Field> j = j(((rf8) list.get(0)).getClass());
                        for (int i = 0; i < list.size(); i++) {
                            ContentValues contentValues = new ContentValues();
                            for (int i2 = 0; i2 < j.size(); i2++) {
                                Field field = j.get(i2);
                                try {
                                    field.setAccessible(true);
                                    String k = k(field);
                                    contentValues.put(k, field.get(list.get(i)) + "");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            a2.update(n, contentValues, "_id=?", new String[]{((rf8) list.get(i))._id + ""});
                        }
                        try {
                            a2.setTransactionSuccessful();
                        } catch (Exception unused) {
                        }
                        try {
                            a2.endTransaction();
                        } catch (Exception unused2) {
                        }
                        heqVar = this.b;
                    } catch (Exception unused3) {
                        try {
                            a2.endTransaction();
                        } catch (Exception unused4) {
                        }
                        heqVar = this.b;
                        heqVar.w(a2);
                    }
                } catch (Exception unused5) {
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    heqVar = this.b;
                    heqVar.w(a2);
                }
                heqVar.w(a2);
            }
        }
    }

    public synchronized List<? extends rf8> i(Class<? extends rf8> cls, String str, String str2, int i) {
        String str3;
        String str4;
        String str5;
        ArrayList arrayList;
        Object th;
        Object obj;
        List<? extends rf8> list = Collections.EMPTY_LIST;
        if (cls == null) {
            return list;
        }
        String n = n(cls);
        SQLiteDatabase a2 = a(cls, n);
        if (a2 == null) {
            nhh.f("DBMgr", "[find] db is null. tableName", n);
            return list;
        }
        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(n);
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str;
        }
        sb.append(str3);
        if (TextUtils.isEmpty(str2)) {
            str4 = "";
        } else {
            str4 = " ORDER BY " + str2;
        }
        sb.append(str4);
        if (i <= 0) {
            str5 = "";
        } else {
            str5 = " LIMIT " + i;
        }
        sb.append(str5);
        String sb2 = sb.toString();
        nhh.r("DBMgr", azi.CACHE_SQL, sb2);
        Cursor cursor = null;
        try {
            cursor = a2.rawQuery(sb2, null);
            ArrayList arrayList2 = new ArrayList();
            try {
                List<Field> j = j(cls);
                while (cursor != null) {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    rf8 rf8Var = (rf8) cls.newInstance();
                    for (int i2 = 0; i2 < j.size(); i2++) {
                        Field field = j.get(i2);
                        Class<?> type = field.getType();
                        String k = k(field);
                        int columnIndex = cursor.getColumnIndex(k);
                        if (columnIndex != -1) {
                            try {
                                if (!(type == Long.class || type == Long.TYPE)) {
                                    if (!(type == Integer.class || type == Integer.TYPE)) {
                                        if (!(type == Double.TYPE || type == Double.class)) {
                                            obj = cursor.getString(columnIndex);
                                            field.set(rf8Var, obj);
                                        }
                                        obj = Double.valueOf(cursor.getDouble(columnIndex));
                                        field.set(rf8Var, obj);
                                    }
                                    obj = Integer.valueOf(cursor.getInt(columnIndex));
                                    field.set(rf8Var, obj);
                                }
                                field.set(rf8Var, obj);
                            } catch (Exception e) {
                                try {
                                    if ((e instanceof IllegalArgumentException) && (obj instanceof String)) {
                                        field.set(rf8Var, Boolean.valueOf((String) obj));
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            obj = Long.valueOf(cursor.getLong(columnIndex));
                        } else {
                            nhh.v("DBMgr", "can not get field", k);
                        }
                    }
                    arrayList2.add(rf8Var);
                }
                this.b.g(cursor);
                this.b.w(a2);
                arrayList = arrayList2;
            } catch (Throwable th2) {
                th = th2;
                list = arrayList2;
                nhh.v("DBMgr", "[get]", th);
                this.b.g(cursor);
                this.b.w(a2);
                arrayList = list;
                return arrayList;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return arrayList;
    }

    public final void r(SQLiteDatabase sQLiteDatabase, String str, ArrayList<Field> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e33703b", new Object[]{this, sQLiteDatabase, str, arrayList});
            return;
        }
        String str2 = "ALTER TABLE " + str + " ADD COLUMN ";
        StringBuilder c = iqq.a().c();
        for (int i = 0; i < arrayList.size(); i++) {
            c.append(str2);
            c.append(k(arrayList.get(i)));
            c.append(" ");
            c.append(m(arrayList.get(i).getType()));
            String sb = c.toString();
            try {
                sQLiteDatabase.execSQL(sb);
            } catch (Exception e) {
                nhh.v("DBMgr", "update db error...", e);
            }
            c.delete(0, sb.length());
            nhh.f("DBMgr", null, "excute sql:", sb);
        }
        iqq.a().b(c);
    }

    public synchronized int g(List<? extends rf8> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("642e2596", new Object[]{this, list})).intValue();
        }
        if (!(list == null || list.size() == 0)) {
            String n = n(((rf8) list.get(0)).getClass());
            SQLiteDatabase a2 = a(((rf8) list.get(0)).getClass(), n);
            if (a2 == null) {
                nhh.f("DBMgr", "[delete] db is null. tableName", n);
                return 0;
            }
            a2.beginTransaction();
            StringBuilder c = iqq.a().c();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                if (arrayList.size() > 0) {
                    c.append(" OR ");
                }
                c.append("_id=?");
                arrayList.add(String.valueOf(((rf8) list.get(i))._id));
                if (arrayList.size() == 20) {
                    String[] strArr = new String[arrayList.size()];
                    arrayList.toArray(strArr);
                    long delete = a2.delete(n, c.toString(), strArr);
                    if (delete == arrayList.size()) {
                        nhh.f("DBMgr", "delete success. DbName", this.c, "tableName", n, "whereArgs size", Integer.valueOf(arrayList.size()), "ret size", Long.valueOf(delete));
                    } else {
                        nhh.f("DBMgr", "delete fail. DbName", this.c, "tableName", n, "whereArgs size", Integer.valueOf(arrayList.size()), "ret size", Long.valueOf(delete));
                    }
                    c.delete(0, c.length());
                    arrayList.clear();
                }
            }
            if (arrayList.size() > 0) {
                String[] strArr2 = new String[arrayList.size()];
                arrayList.toArray(strArr2);
                long delete2 = a2.delete(n, c.toString(), strArr2);
                if (delete2 == arrayList.size()) {
                    nhh.f("DBMgr", "delete success. DbName", this.c, "tableName", n, "whereArgs size", Integer.valueOf(arrayList.size()), "ret size", Long.valueOf(delete2));
                } else {
                    nhh.f("DBMgr", "delete fail. DbName", this.c, "tableName", n, "whereArgs size", Integer.valueOf(arrayList.size()), "ret size", Long.valueOf(delete2));
                }
            }
            iqq.a().b(c);
            try {
                a2.setTransactionSuccessful();
            } catch (Throwable unused) {
            }
            try {
                a2.endTransaction();
            } catch (Throwable unused2) {
            }
            this.b.w(a2);
            return list.size();
        }
        return 0;
    }
}
