package com.taobao.android.dinamicx.template.db;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.db.DXDataBaseEntry;
import java.lang.reflect.Field;
import java.util.ArrayList;
import tb.f7l;
import tb.h36;
import tb.la6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DXDataBaseEntrySchema {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String[] SQLITE_TYPES = {"TEXT", "INTEGER", "INTEGER", "INTEGER", "INTEGER", "REAL", "REAL", "NONE"};
    private static final String TAG = "DXDataBaseEntrySchema";
    public static final int TYPE_BLOB = 7;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 3;
    public static final int TYPE_LONG = 4;
    public static final int TYPE_SHORT = 2;
    public static final int TYPE_STRING = 0;
    private final a[] mColumnInfo;
    private final String[] mProjection;
    private final String mTableName;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7340a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final boolean f;

        static {
            t2o.a(444596982);
        }

        public a(String str, int i, boolean z, boolean z2, String str2, boolean z3, Field field, int i2) {
            this.f7340a = str.toLowerCase();
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = str2;
            this.f = z3;
            field.setAccessible(true);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e0f07df0", new Object[]{this})).booleanValue();
            }
            return "_id".equals(this.f7340a);
        }
    }

    static {
        t2o.a(444596981);
    }

    public DXDataBaseEntrySchema(Class<? extends DXDataBaseEntry> cls) {
        a[] parseColumnInfo = parseColumnInfo(cls);
        this.mTableName = parseTableName(cls);
        this.mColumnInfo = parseColumnInfo;
        String[] strArr = new String[0];
        if (parseColumnInfo != null) {
            strArr = new String[parseColumnInfo.length];
            for (int i = 0; i != parseColumnInfo.length; i++) {
                strArr[i] = parseColumnInfo[i].f7340a;
            }
        }
        this.mProjection = strArr;
    }

    private void logExecSql(SQLiteDatabase sQLiteDatabase, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccef4e3", new Object[]{this, sQLiteDatabase, str});
        } else {
            sQLiteDatabase.execSQL(str);
        }
    }

    private a[] parseColumnInfo(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a[]) ipChange.ipc$dispatch("b7586de0", new Object[]{this, cls});
        }
        ArrayList<a> arrayList = new ArrayList<>();
        while (cls != null) {
            parseColumnInfo(cls, arrayList);
            cls = cls.getSuperclass();
        }
        a[] aVarArr = new a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    private String parseTableName(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52223f50", new Object[]{this, cls});
        }
        DXDataBaseEntry.Table table = (DXDataBaseEntry.Table) cls.getAnnotation(DXDataBaseEntry.Table.class);
        if (table == null) {
            return null;
        }
        return table.value();
    }

    public String[] getProjection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d4ec351b", new Object[]{this});
        }
        return this.mProjection;
    }

    public String getTableName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3aed216", new Object[]{this});
        }
        return this.mTableName;
    }

    public void dropTables(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd68574", new Object[]{this, sQLiteDatabase});
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
        sb.append(this.mTableName);
        sb.append(';');
        logExecSql(sQLiteDatabase, sb.toString());
        sb.setLength(0);
    }

    public void createTables(SQLiteDatabase sQLiteDatabase) {
        a[] aVarArr;
        a[] aVarArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dcfa41", new Object[]{this, sQLiteDatabase});
            return;
        }
        String str = this.mTableName;
        if (TextUtils.isEmpty(str)) {
            la6.d(h36.TAG, "DataBase", "没有用注解定义表名");
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(str);
        sb2.append(" (_id INTEGER");
        for (a aVar : this.mColumnInfo) {
            if (!aVar.a()) {
                sb2.append(',');
                sb2.append(aVar.f7340a);
                sb2.append(' ');
                sb2.append(SQLITE_TYPES[aVar.b]);
                if (!TextUtils.isEmpty(aVar.e)) {
                    sb2.append(" DEFAULT ");
                    sb2.append(aVar.e);
                } else if (aVar.f) {
                    sb2.append(" NOT NULL");
                }
                if (aVar.d) {
                    sb.append(aVar.f7340a);
                    sb.append(",");
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb2.append(", PRIMARY KEY(");
            sb2.append(sb.toString());
            sb2.append(f7l.BRACKET_END_STR);
        }
        sb2.append(");");
        logExecSql(sQLiteDatabase, sb2.toString());
        sb2.setLength(0);
        sb2.append("CREATE INDEX index_template ON ");
        sb2.append(str);
        sb2.append(f7l.BRACKET_START_STR);
        for (a aVar2 : this.mColumnInfo) {
            if (aVar2.c) {
                sb2.append(aVar2.f7340a);
                sb2.append(",");
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(");");
        logExecSql(sQLiteDatabase, sb2.toString());
        sb2.setLength(0);
    }

    private void parseColumnInfo(Class<?> cls, ArrayList<a> arrayList) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806e514b", new Object[]{this, cls, arrayList});
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        for (int i2 = 0; i2 != declaredFields.length; i2++) {
            Field field = declaredFields[i2];
            DXDataBaseEntry.Column column = (DXDataBaseEntry.Column) field.getAnnotation(DXDataBaseEntry.Column.class);
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
                arrayList.add(new a(column.value(), i, column.indexed(), column.primaryKey(), column.defaultValue(), column.notNull(), field, arrayList.size()));
            }
        }
    }
}
