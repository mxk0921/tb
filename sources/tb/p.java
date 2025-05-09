package tb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class p extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544350);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/database/ABDatabaseHelper");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        ogh.e("ABDatabaseHelper", "onCreate, db=" + sQLiteDatabase);
        try {
            jo8.m(sQLiteDatabase, true);
            j92.m(sQLiteDatabase, true);
        } catch (Throwable th) {
            ku0.j("ABDatabaseHelper.onCreate", th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        ogh.e("ABDatabaseHelper", "onUpgrade, db=" + sQLiteDatabase + ", oldVersion=" + i + ", newVersion=" + i2);
        try {
            onCreate(sQLiteDatabase);
            switch (i + 1) {
                case 4:
                    jo8.l(sQLiteDatabase, ExperimentDO.COLUMN_PRIORITY_LEVEL, "INTEGER");
                    j92.l(sQLiteDatabase, ExperimentDO.COLUMN_PRIORITY_LEVEL, "INTEGER");
                case 5:
                    jo8.l(sQLiteDatabase, ExperimentDO.COLUMN_EXP_INDEX_TYPE, "INTEGER");
                    j92.l(sQLiteDatabase, ExperimentDO.COLUMN_EXP_INDEX_TYPE, "INTEGER");
                case 6:
                    j92.l(sQLiteDatabase, ExperimentDO.COLUMN_PUBLISH_TYPE, "INTEGER");
                case 7:
                    jo8.l(sQLiteDatabase, ExperimentDO.COLUMN_VARIATION_CONFIG, "TEXT");
                    j92.l(sQLiteDatabase, ExperimentDO.COLUMN_VARIATION_CONFIG, "TEXT");
                    break;
                case 8:
                    break;
                default:
                    return;
            }
            jo8.l(sQLiteDatabase, ExperimentDO.COLUMN_PUBLISH_TYPE, "INTEGER");
        } catch (Exception e) {
            ku0.j("ABDatabaseHelper.onUpgrade", e);
        }
    }

    public p(Context context) {
        super(context, "ut-abtest-v2.db", (SQLiteDatabase.CursorFactory) null, 8);
    }
}
