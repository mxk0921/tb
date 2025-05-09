package com.taobao.android.trade.template.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.template.db.Entry;
import java.lang.reflect.Field;
import java.util.ArrayList;
import tb.t2o;
import tb.txv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
    public final String f9690a;
    public final C0500a[] b;
    public final String[] c;
    public final boolean d;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.trade.template.db.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class C0500a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f9691a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final Field f;
        public final int g;

        static {
            t2o.a(723517486);
        }

        public C0500a(String str, int i, boolean z, boolean z2, String str2, Field field, int i2) {
            this.f9691a = str.toLowerCase();
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
            return "_id".equals(this.f9691a);
        }
    }

    static {
        t2o.a(723517485);
    }

    public a(Class<? extends Entry> cls) {
        C0500a[] j = j(cls);
        this.f9690a = k(cls);
        this.b = j;
        boolean z = false;
        String[] strArr = new String[0];
        if (j != null) {
            strArr = new String[j.length];
            boolean z2 = false;
            for (int i = 0; i != j.length; i++) {
                C0500a aVar = j[i];
                strArr[i] = aVar.f9691a;
                if (aVar.d) {
                    z2 = true;
                }
            }
            z = z2;
        }
        this.c = strArr;
        this.d = z;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        C0500a[] aVarArr;
        C0500a[] aVarArr2;
        C0500a[] aVarArr3;
        C0500a[] aVarArr4;
        C0500a[] aVarArr5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dcfa41", new Object[]{this, sQLiteDatabase});
            return;
        }
        String str = this.f9690a;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        txv.a(z);
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        sb.append(str);
        sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT");
        for (C0500a aVar : this.b) {
            if (!aVar.a()) {
                sb.append(',');
                sb.append(aVar.f9691a);
                sb.append(' ');
                sb.append(e[aVar.b]);
                if (!TextUtils.isEmpty(aVar.e)) {
                    sb.append(" DEFAULT ");
                    sb.append(aVar.e);
                }
            }
        }
        sb.append(");");
        g(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        for (C0500a aVar2 : this.b) {
            if (aVar2.c) {
                sb.append("CREATE INDEX ");
                sb.append(str);
                sb.append("_index_");
                sb.append(aVar2.f9691a);
                sb.append(" ON ");
                sb.append(str);
                sb.append(" (");
                sb.append(aVar2.f9691a);
                sb.append(");");
                g(sQLiteDatabase, sb.toString());
                sb.setLength(0);
            }
        }
        if (this.d) {
            String str2 = str + "_fulltext";
            sb.append("CREATE VIRTUAL TABLE ");
            sb.append(str2);
            sb.append(" USING FTS3 (_id INTEGER PRIMARY KEY");
            for (C0500a aVar3 : this.b) {
                if (aVar3.d) {
                    String str3 = aVar3.f9691a;
                    sb.append(',');
                    sb.append(str3);
                    sb.append(" TEXT");
                }
            }
            sb.append(");");
            g(sQLiteDatabase, sb.toString());
            sb.setLength(0);
            StringBuilder sb2 = new StringBuilder("INSERT OR REPLACE INTO ");
            sb2.append(str2);
            sb2.append(" (_id");
            for (C0500a aVar4 : this.b) {
                if (aVar4.d) {
                    sb2.append(',');
                    sb2.append(aVar4.f9691a);
                }
            }
            sb2.append(") VALUES (new._id");
            for (C0500a aVar5 : this.b) {
                if (aVar5.d) {
                    sb2.append(",new.");
                    sb2.append(aVar5.f9691a);
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
            g(sQLiteDatabase, sb.toString());
            sb.setLength(0);
            sb.append("CREATE TRIGGER ");
            sb.append(str);
            sb.append("_update_trigger AFTER UPDATE ON ");
            sb.append(str);
            sb.append(" FOR EACH ROW BEGIN ");
            sb.append(sb3);
            sb.append("END;");
            g(sQLiteDatabase, sb.toString());
            sb.setLength(0);
            sb.append("CREATE TRIGGER ");
            sb.append(str);
            sb.append("_delete_trigger AFTER DELETE ON ");
            sb.append(str);
            sb.append(" FOR EACH ROW BEGIN DELETE FROM ");
            sb.append(str2);
            sb.append(" WHERE _id = old._id; END;");
            g(sQLiteDatabase, sb.toString());
            sb.setLength(0);
        }
    }

    public <T extends Entry> T b(Cursor cursor, T t) {
        C0500a[] aVarArr;
        try {
            for (C0500a aVar : this.b) {
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
        String str = this.f9690a;
        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
        sb.append(str);
        sb.append(';');
        g(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        if (this.d) {
            sb.append("DROP TABLE IF EXISTS ");
            sb.append(str);
            sb.append("_fulltext");
            sb.append(';');
            g(sQLiteDatabase, sb.toString());
        }
    }

    public String[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d4ec351b", new Object[]{this});
        }
        return this.c;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3aed216", new Object[]{this});
        }
        return this.f9690a;
    }

    public long f(SQLiteDatabase sQLiteDatabase, Entry entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d100da3", new Object[]{this, sQLiteDatabase, entry})).longValue();
        }
        ContentValues contentValues = new ContentValues();
        h(entry, contentValues);
        if (entry.id == 0) {
            contentValues.remove("_id");
        }
        long replace = sQLiteDatabase.replace(this.f9690a, "_id", contentValues);
        entry.id = replace;
        return replace;
    }

    public final void g(SQLiteDatabase sQLiteDatabase, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccef4e3", new Object[]{this, sQLiteDatabase, str});
        } else {
            sQLiteDatabase.execSQL(str);
        }
    }

    public void h(Entry entry, ContentValues contentValues) {
        C0500a[] aVarArr;
        try {
            for (C0500a aVar : this.b) {
                String str = aVar.f9691a;
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

    public final void i(Class<?> cls, ArrayList<C0500a> arrayList) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806e514b", new Object[]{this, cls, arrayList});
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        for (int i2 = 0; i2 != declaredFields.length; i2++) {
            Field field = declaredFields[i2];
            Entry.Column column = (Entry.Column) field.getAnnotation(Entry.Column.class);
            if (column != null) {
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
                    throw new IllegalArgumentException("Unsupported field type for column: ".concat(type.getName()));
                }
                arrayList.add(new C0500a(column.value(), i, column.indexed(), column.fullText(), column.defaultValue(), field, arrayList.size()));
            }
        }
    }

    public final C0500a[] j(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0500a[]) ipChange.ipc$dispatch("ef5c6774", new Object[]{this, cls});
        }
        ArrayList<C0500a> arrayList = new ArrayList<>();
        while (cls != null) {
            i(cls, arrayList);
            cls = cls.getSuperclass();
        }
        C0500a[] aVarArr = new C0500a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    public final String k(Class<?> cls) {
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
}
