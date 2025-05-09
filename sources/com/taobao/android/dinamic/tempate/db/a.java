package com.taobao.android.dinamic.tempate.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.db.Entry;
import com.taobao.android.dinamicx.f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import tb.ic5;
import tb.ixv;
import tb.rh5;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BLOB = 7;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 3;
    public static final int TYPE_LONG = 4;
    public static final int TYPE_SHORT = 2;
    public static final int TYPE_STRING = 0;
    public static final String[] e = {"TEXT", "INTEGER", "INTEGER", "INTEGER", "INTEGER", "REAL", "REAL", "NONE"};

    /* renamed from: a  reason: collision with root package name */
    public String f7272a;
    public C0399a[] b;
    public String[] c;
    public boolean d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.dinamic.tempate.db.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class C0399a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7273a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final Field f;
        public final int g;

        static {
            t2o.a(444596387);
        }

        public C0399a(String str, int i, boolean z, boolean z2, String str2, Field field, int i2) {
            this.f7273a = str.toLowerCase();
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = str2;
            this.f = field;
            this.g = i2;
            field.setAccessible(true);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e0f07df0", new Object[]{this})).booleanValue();
            }
            return "_id".equals(this.f7273a);
        }
    }

    static {
        t2o.a(444596386);
    }

    public a(Class<? extends Entry> cls) {
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        C0399a[] aVarArr;
        C0399a[] aVarArr2;
        C0399a[] aVarArr3;
        C0399a[] aVarArr4;
        C0399a[] aVarArr5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dcfa41", new Object[]{this, sQLiteDatabase});
            return;
        }
        String str = this.f7272a;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        ixv.a(z);
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        sb.append(str);
        sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT");
        for (C0399a aVar : this.b) {
            if (!aVar.a()) {
                sb.append(',');
                sb.append(aVar.f7273a);
                sb.append(' ');
                sb.append(e[aVar.b]);
                if (!TextUtils.isEmpty(aVar.e)) {
                    sb.append(" DEFAULT ");
                    sb.append(aVar.e);
                }
            }
        }
        sb.append(");");
        h(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        for (C0399a aVar2 : this.b) {
            if (aVar2.c) {
                sb.append("CREATE INDEX ");
                sb.append(str);
                sb.append("_index_");
                sb.append(aVar2.f7273a);
                sb.append(" ON ");
                sb.append(str);
                sb.append(" (");
                sb.append(aVar2.f7273a);
                sb.append(");");
                h(sQLiteDatabase, sb.toString());
                sb.setLength(0);
            }
        }
        if (this.d) {
            String str2 = str + "_fulltext";
            sb.append("CREATE VIRTUAL TABLE ");
            sb.append(str2);
            sb.append(" USING FTS3 (_id INTEGER PRIMARY KEY");
            for (C0399a aVar3 : this.b) {
                if (aVar3.d) {
                    String str3 = aVar3.f7273a;
                    sb.append(',');
                    sb.append(str3);
                    sb.append(" TEXT");
                }
            }
            sb.append(");");
            h(sQLiteDatabase, sb.toString());
            sb.setLength(0);
            StringBuilder sb2 = new StringBuilder("INSERT OR REPLACE INTO ");
            sb2.append(str2);
            sb2.append(" (_id");
            for (C0399a aVar4 : this.b) {
                if (aVar4.d) {
                    sb2.append(',');
                    sb2.append(aVar4.f7273a);
                }
            }
            sb2.append(") VALUES (new._id");
            for (C0399a aVar5 : this.b) {
                if (aVar5.d) {
                    sb2.append(",new.");
                    sb2.append(aVar5.f7273a);
                }
            }
            sb2.append(");");
            String sb3 = sb2.toString();
            sb.append("CREATE TRIGGER ");
            sb.append(str);
            sb.append("_insert_trigger AFTER INSERT ON ");
            sb.append(str);
            sb.append(" FOR EACH ROW BEGIN ");
            sb.append(sb3);
            sb.append("END;");
            h(sQLiteDatabase, sb.toString());
            sb.setLength(0);
            sb.append("CREATE TRIGGER ");
            sb.append(str);
            sb.append("_update_trigger AFTER UPDATE ON ");
            sb.append(str);
            sb.append(" FOR EACH ROW BEGIN ");
            sb.append(sb3);
            sb.append("END;");
            h(sQLiteDatabase, sb.toString());
            sb.setLength(0);
            sb.append("CREATE TRIGGER ");
            sb.append(str);
            sb.append("_delete_trigger AFTER DELETE ON ");
            sb.append(str);
            sb.append(" FOR EACH ROW BEGIN DELETE FROM ");
            sb.append(str2);
            sb.append(" WHERE _id = old._id; END;");
            h(sQLiteDatabase, sb.toString());
            sb.setLength(0);
        }
    }

    public <T extends Entry> T b(Cursor cursor, T t) {
        C0399a[] aVarArr;
        try {
            for (C0399a aVar : this.b) {
                int i = aVar.g;
                Field field = aVar.f;
                Object obj = null;
                switch (aVar.b) {
                    case 0:
                        if (!cursor.isNull(i)) {
                            obj = cursor.getString(i);
                        }
                        field.set(t, obj);
                        break;
                    case 1:
                        short s = cursor.getShort(i);
                        boolean z = true;
                        if (s != 1) {
                            z = false;
                        }
                        field.setBoolean(t, z);
                        break;
                    case 2:
                        field.setShort(t, cursor.getShort(i));
                        break;
                    case 3:
                        field.setInt(t, cursor.getInt(i));
                        break;
                    case 4:
                        field.setLong(t, cursor.getLong(i));
                        break;
                    case 5:
                        field.setFloat(t, cursor.getFloat(i));
                        break;
                    case 6:
                        field.setDouble(t, cursor.getDouble(i));
                        break;
                    case 7:
                        if (!cursor.isNull(i)) {
                            obj = cursor.getBlob(i);
                        }
                        field.set(t, obj);
                        break;
                }
            }
            return t;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void c(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd68574", new Object[]{this, sQLiteDatabase});
            return;
        }
        String str = this.f7272a;
        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
        sb.append(str);
        sb.append(';');
        h(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        if (this.d) {
            sb.append("DROP TABLE IF EXISTS ");
            sb.append(str);
            sb.append("_fulltext");
            sb.append(';');
            h(sQLiteDatabase, sb.toString());
        }
    }

    public String[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d4ec351b", new Object[]{this});
        }
        return this.c;
    }

    public void e(Class<? extends Entry> cls) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9f686", new Object[]{this, cls});
            return;
        }
        C0399a[] k = k(cls);
        this.f7272a = l(cls);
        this.b = k;
        String[] strArr = new String[0];
        if (k != null) {
            strArr = new String[k.length];
            boolean z2 = false;
            for (int i = 0; i != k.length; i++) {
                C0399a aVar = k[i];
                strArr[i] = aVar.f7273a;
                if (aVar.d) {
                    z2 = true;
                }
            }
            z = z2;
        }
        this.c = strArr;
        this.d = z;
    }

    public long f(SQLiteDatabase sQLiteDatabase, Entry entry) {
        C0399a[] aVarArr;
        if (Build.VERSION.SDK_INT == 29) {
            try {
                HashMap<String, Object> hashMap = new HashMap<>();
                for (C0399a aVar : this.b) {
                    hashMap.put(aVar.f7273a, aVar.f.get(entry));
                }
                if (entry.id == 0) {
                    hashMap.remove("_id");
                }
                long g = g(sQLiteDatabase, this.f7272a, "_id", hashMap);
                entry.id = g;
                return g;
            } catch (Throwable th) {
                Log.e("EntrySchema", "sdk int 29 insertOrReplace db exception", th);
                return -1L;
            }
        } else {
            ContentValues contentValues = new ContentValues();
            i(entry, contentValues);
            if (entry.id == 0) {
                contentValues.remove("_id");
            }
            long replace = sQLiteDatabase.replace(this.f7272a, "_id", contentValues);
            entry.id = replace;
            return replace;
        }
    }

    public final long g(SQLiteDatabase sQLiteDatabase, String str, String str2, HashMap<String, Object> hashMap) {
        int i;
        Object[] objArr;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d710583", new Object[]{this, sQLiteDatabase, str, str2, hashMap})).longValue();
        }
        sQLiteDatabase.acquireReference();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(" OR REPLACE ");
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            if (hashMap == null || hashMap.isEmpty()) {
                i = 0;
            } else {
                i = hashMap.size();
            }
            if (i > 0) {
                objArr = new Object[i];
                int i2 = 0;
                for (String str5 : hashMap.keySet()) {
                    if (i2 > 0) {
                        str4 = ",";
                    } else {
                        str4 = "";
                    }
                    sb.append(str4);
                    sb.append(str5);
                    objArr[i2] = hashMap.get(str5);
                    i2++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                for (int i3 = 0; i3 < i; i3++) {
                    if (i3 > 0) {
                        str3 = ",?";
                    } else {
                        str3 = "?";
                    }
                    sb.append(str3);
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
                objArr = null;
            }
            sb.append(')');
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(sb.toString());
            if (i > 0) {
                int length = objArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    Object obj = objArr[i4];
                    if (obj instanceof Long) {
                        compileStatement.bindLong(i4 + 1, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        compileStatement.bindString(i4 + 1, (String) obj);
                    }
                }
            }
            long executeInsert = compileStatement.executeInsert();
            compileStatement.close();
            sQLiteDatabase.releaseReference();
            return executeInsert;
        } catch (Throwable th) {
            sQLiteDatabase.releaseReference();
            throw th;
        }
    }

    public final void h(SQLiteDatabase sQLiteDatabase, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccef4e3", new Object[]{this, sQLiteDatabase, str});
        } else {
            sQLiteDatabase.execSQL(str);
        }
    }

    public void i(Entry entry, ContentValues contentValues) {
        C0399a[] aVarArr;
        try {
            for (C0399a aVar : this.b) {
                String str = aVar.f7273a;
                Field field = aVar.f;
                switch (aVar.b) {
                    case 0:
                        contentValues.put(str, (String) field.get(entry));
                        break;
                    case 1:
                        contentValues.put(str, Boolean.valueOf(field.getBoolean(entry)));
                        break;
                    case 2:
                        contentValues.put(str, Short.valueOf(field.getShort(entry)));
                        break;
                    case 3:
                        contentValues.put(str, Integer.valueOf(field.getInt(entry)));
                        break;
                    case 4:
                        contentValues.put(str, Long.valueOf(field.getLong(entry)));
                        break;
                    case 5:
                        contentValues.put(str, Float.valueOf(field.getFloat(entry)));
                        break;
                    case 6:
                        contentValues.put(str, Double.valueOf(field.getDouble(entry)));
                        break;
                    case 7:
                        contentValues.put(str, (byte[]) field.get(entry));
                        break;
                }
            }
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final C0399a[] k(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0399a[]) ipChange.ipc$dispatch("cd1f1d91", new Object[]{this, cls});
        }
        ArrayList<C0399a> arrayList = new ArrayList<>();
        while (cls != null) {
            j(cls, arrayList);
            cls = cls.getSuperclass();
        }
        C0399a[] aVarArr = new C0399a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    public final String l(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52223f50", new Object[]{this, cls});
        }
        Entry.Table table = (Entry.Table) cls.getAnnotation(Entry.Table.class);
        if (table == null) {
            return null;
        }
        return table.value();
    }

    public final void j(Class<?> cls, ArrayList<C0399a> arrayList) {
        Entry.Column column;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806e514b", new Object[]{this, cls, arrayList});
        } else if (cls != null) {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                if (declaredFields != null) {
                    for (int i2 = 0; i2 != declaredFields.length; i2++) {
                        Field field = declaredFields[i2];
                        if (!(field == null || (column = (Entry.Column) field.getAnnotation(Entry.Column.class)) == null)) {
                            Class<?> type = field.getType();
                            if (type == String.class) {
                                i = 0;
                            } else if (type == Boolean.TYPE) {
                                i = 1;
                            } else if (type == Short.TYPE) {
                                i = 2;
                            } else if (type == Integer.TYPE) {
                                i = 3;
                            } else if (type == Long.TYPE) {
                                i = 4;
                            } else if (type == Float.TYPE) {
                                i = 5;
                            } else if (type == Double.TYPE) {
                                i = 6;
                            } else if (type == byte[].class) {
                                i = 7;
                            } else {
                                throw new IllegalArgumentException("Unsupported field type for column: " + type.getName());
                            }
                            arrayList.add(new C0399a(column.value(), i, column.indexed(), column.fullText(), column.defaultValue(), field, arrayList.size()));
                        }
                    }
                }
            } catch (Throwable th) {
                f fVar = new f(rh5.c);
                f.a aVar = new f.a("native", "native_crash", f.DX_NATIVE_CRASH_16);
                aVar.e = rh5.a() + "_trace: " + xv5.a(th);
                ((ArrayList) fVar.c).add(aVar);
                ic5.p(fVar);
            }
        }
    }
}
