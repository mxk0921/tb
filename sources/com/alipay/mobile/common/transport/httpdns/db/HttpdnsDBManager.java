package com.alipay.mobile.common.transport.httpdns.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpdnsDBManager extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile HttpdnsDBManager f4110a;

    public HttpdnsDBManager(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    public static synchronized HttpdnsDBManager getInstance(Context context) {
        synchronized (HttpdnsDBManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpdnsDBManager) ipChange.ipc$dispatch("baa59b32", new Object[]{context});
            }
            if (f4110a == null) {
                f4110a = new HttpdnsDBManager(context, "httpdns.db", null, 7);
            }
            return f4110a;
        }
    }

    public static /* synthetic */ Object ipc$super(HttpdnsDBManager httpdnsDBManager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/httpdns/db/HttpdnsDBManager");
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cd8c21", new Object[]{this, sQLiteDatabase});
            return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS httpdns");
        sQLiteDatabase.execSQL(HttpdnsDBSql.CREATE_HTTPDNS);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        LogCatUtil.debug("HDNS_DBManager", "onCreate.");
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        LogCatUtil.debug("HDNS_DBManager", "onUpgrade from " + i + " to " + i2);
        if (i2 != i) {
            try {
                sQLiteDatabase.execSQL(HttpdnsDBSql.dropOldTable);
                sQLiteDatabase.execSQL(HttpdnsDBSql.dropTable);
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
                LogCatUtil.error("HDNS_DBManager", "onUpgrade exception:" + th.toString());
            }
        }
    }
}
