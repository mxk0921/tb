package com.xiaomi.push;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.cg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class ci implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14804a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ cg.a f801a;

    public ci(cg.a aVar, Context context) {
        this.f801a = aVar;
        this.f14804a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.f801a.a();
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.beginTransaction();
                    this.f801a.a(this.f14804a, sQLiteDatabase);
                    sQLiteDatabase.setTransactionSuccessful();
                }
            } catch (Exception e) {
                b.a(e);
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e2) {
                        Exception e3 = e2;
                    }
                }
                ce ceVar = this.f801a.f792a;
                if (ceVar != null) {
                    ceVar.close();
                }
            }
        } finally {
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e4) {
                    b.a(e4);
                    this.f801a.a(this.f14804a);
                }
            }
            ce ceVar2 = this.f801a.f792a;
            if (ceVar2 != null) {
                ceVar2.close();
            }
            this.f801a.a(this.f14804a);
        }
    }
}
