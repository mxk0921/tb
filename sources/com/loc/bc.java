package com.loc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bc extends SQLiteOpenHelper {
    private static boolean b = true;
    private static boolean c;

    /* renamed from: a  reason: collision with root package name */
    private ay f5583a;

    public bc(Context context, String str, ay ayVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f5583a = ayVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f5583a.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
