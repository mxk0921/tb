package com.loc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class az {
    private static Map<Class<? extends ay>, ay> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private bc f5581a;
    private SQLiteDatabase b;
    private ay c;

    public az(Context context, ay ayVar) {
        try {
            this.f5581a = new bc(context.getApplicationContext(), ayVar.a(), ayVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.c = ayVar;
    }

    private static ContentValues a(Object obj, ba baVar) {
        Field[] a2;
        ContentValues contentValues = new ContentValues();
        for (Field field : a(obj.getClass(), baVar.b())) {
            field.setAccessible(true);
            a(obj, field, contentValues);
        }
        return contentValues;
    }

    private SQLiteDatabase b() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.b;
        } catch (Throwable th) {
            as.a(th, "dbs", "gwd");
        }
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isReadOnly()) {
            }
            return this.b;
        }
        SQLiteDatabase sQLiteDatabase2 = this.b;
        if (sQLiteDatabase2 != null) {
            sQLiteDatabase2.close();
        }
        this.b = this.f5581a.getWritableDatabase();
        return this.b;
    }

    private SQLiteDatabase a() {
        try {
            if (this.b == null) {
                this.b = this.f5581a.getReadableDatabase();
            }
        } catch (Throwable th) {
            as.a(th, "dbs", "grd");
        }
        return this.b;
    }

    private static <T> ba b(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(ba.class);
        if (annotation != null) {
            return (ba) annotation;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized ay a(Class<? extends ay> cls) throws IllegalAccessException, InstantiationException {
        ay ayVar;
        synchronized (az.class) {
            try {
                if (d.get(cls) == null) {
                    d.put(cls, cls.newInstance());
                }
                ayVar = d.get(cls);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ayVar;
    }

    private <T> List<T> b(String str, Class<T> cls) {
        Throwable th;
        Cursor cursor;
        String str2;
        String str3;
        synchronized (this.c) {
            try {
                ArrayList arrayList = new ArrayList();
                ba b = b((Class) cls);
                String a2 = a(b);
                if (this.b == null) {
                    this.b = a();
                }
                if (this.b == null || TextUtils.isEmpty(a2) || str == null) {
                    return arrayList;
                }
                try {
                    cursor = this.b.query(a2, null, str, null, null, null, null);
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        as.a(th, "dbs", "sld");
                        if (cursor != null) {
                            cursor.close();
                        }
                        try {
                            SQLiteDatabase sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                                this.b = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str2 = "dbs";
                            str3 = "sld";
                            as.a(th, str2, str3);
                            return arrayList;
                        }
                        return arrayList;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                }
                if (cursor == null) {
                    this.b.close();
                    this.b = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                        this.b = null;
                    }
                    return arrayList;
                }
                while (cursor.moveToNext()) {
                    arrayList.add(a(cursor, cls, b));
                }
                cursor.close();
                try {
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.b = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str2 = "dbs";
                    str3 = "sld";
                    as.a(th, str2, str3);
                    return arrayList;
                }
                return arrayList;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    private static <T> T a(Cursor cursor, Class<T> cls, ba baVar) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Field[] a2 = a((Class<?>) cls, baVar.b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : a2) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(bb.class);
            if (annotation != null) {
                bb bbVar = (bb) annotation;
                int b = bbVar.b();
                int columnIndex = cursor.getColumnIndex(bbVar.a());
                switch (b) {
                    case 1:
                        field.set(newInstance, Short.valueOf(cursor.getShort(columnIndex)));
                        continue;
                    case 2:
                        field.set(newInstance, Integer.valueOf(cursor.getInt(columnIndex)));
                        continue;
                    case 3:
                        field.set(newInstance, Float.valueOf(cursor.getFloat(columnIndex)));
                        continue;
                    case 4:
                        field.set(newInstance, Double.valueOf(cursor.getDouble(columnIndex)));
                        continue;
                    case 5:
                        field.set(newInstance, Long.valueOf(cursor.getLong(columnIndex)));
                        continue;
                    case 6:
                        field.set(newInstance, cursor.getString(columnIndex));
                        continue;
                    case 7:
                        field.set(newInstance, cursor.getBlob(columnIndex));
                        continue;
                }
            }
        }
        return newInstance;
    }

    private <T> void b(T t) {
        synchronized (this.c) {
            SQLiteDatabase b = b();
            this.b = b;
            if (b != null) {
                a(b, t);
                SQLiteDatabase sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    this.b = null;
                }
            }
        }
    }

    private static <T> String a(ba baVar) {
        if (baVar == null) {
            return null;
        }
        return baVar.a();
    }

    private <T> void b(String str, Object obj) {
        a(str, obj);
    }

    public final <T> List<T> a(String str, Class<T> cls) {
        return b(str, (Class) cls);
    }

    private static <T> void a(SQLiteDatabase sQLiteDatabase, T t) {
        ba b = b((Class) t.getClass());
        String a2 = a(b);
        if (!TextUtils.isEmpty(a2) && sQLiteDatabase != null) {
            sQLiteDatabase.insert(a2, null, a(t, b));
        }
    }

    private <T> void a(T t) {
        b((az) t);
    }

    public final void a(Object obj, String str) {
        synchronized (this.c) {
            try {
                List a2 = a(str, (Class) obj.getClass());
                if (!(a2 == null || a2.size() == 0)) {
                    b(str, obj);
                }
                a((az) obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void a(Object obj, Field field, ContentValues contentValues) {
        Annotation annotation = field.getAnnotation(bb.class);
        if (annotation != null) {
            bb bbVar = (bb) annotation;
            try {
                switch (bbVar.b()) {
                    case 1:
                        contentValues.put(bbVar.a(), Short.valueOf(field.getShort(obj)));
                        return;
                    case 2:
                        contentValues.put(bbVar.a(), Integer.valueOf(field.getInt(obj)));
                        return;
                    case 3:
                        contentValues.put(bbVar.a(), Float.valueOf(field.getFloat(obj)));
                        return;
                    case 4:
                        contentValues.put(bbVar.a(), Double.valueOf(field.getDouble(obj)));
                        return;
                    case 5:
                        contentValues.put(bbVar.a(), Long.valueOf(field.getLong(obj)));
                        return;
                    case 6:
                        contentValues.put(bbVar.a(), (String) field.get(obj));
                        return;
                    case 7:
                        contentValues.put(bbVar.a(), (byte[]) field.get(obj));
                        return;
                    default:
                        return;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    private <T> void a(String str, Object obj) {
        synchronized (this.c) {
            try {
                if (obj != null) {
                    ba b = b((Class) obj.getClass());
                    String a2 = a(b);
                    if (!TextUtils.isEmpty(a2)) {
                        ContentValues a3 = a(obj, b);
                        SQLiteDatabase b2 = b();
                        this.b = b2;
                        if (b2 != null) {
                            b2.update(a2, a3, str, null);
                            SQLiteDatabase sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                                this.b = null;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Field[] a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        return z ? cls.getSuperclass().getDeclaredFields() : cls.getDeclaredFields();
    }
}
