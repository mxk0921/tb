package tb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class j92 extends l<ExperimentDO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TABLE_NAME = "beta_experiments_v1";

    static {
        t2o.a(961544224);
    }

    public static /* synthetic */ Object ipc$super(j92 j92Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/evo/internal/database/BetaExperimentDao");
    }

    public static void l(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787a926a", new Object[]{sQLiteDatabase, str, str2});
            return;
        }
        sQLiteDatabase.execSQL("alter table beta_experiments_v1 add " + str + " " + str2);
    }

    public static void m(SQLiteDatabase sQLiteDatabase, boolean z) throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5759c2a2", new Object[]{sQLiteDatabase, new Boolean(z)});
            return;
        }
        if (z) {
            str = "IF NOT EXISTS ";
        } else {
            str = "";
        }
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "\"beta_experiments_v1\" (id INTEGER, key VARCHAR(2048) NOT NULL, release_id INTEGER NOT NULL, type INTEGER NOT NULL, begin_time INTEGER NOT NULL, end_time INTEGER NOT NULL, tracks VARCHAR(2048), condition VARCHAR(4096), cognation VARCHAR(4096) NOT NULL, groups TEXT, variation_config TEXT, hit_count INTEGER NOT NULL DEFAULT 0, hit_latest_time INTEGER NOT NULL DEFAULT 0, create_time INTEGER, modified_time INTEGER, owner_id VARCHAR(64) NOT NULL DEFAULT '0', ext_int INTEGER, priority_level_int INTEGER, exp_index_type INTEGER, exp_publish_type INTEGER, ext_string TEXT, PRIMARY KEY(id))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS beta_experiments_v1_key_idx ON beta_experiments_v1(key)");
    }

    @Override // tb.bt1
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3aed216", new Object[]{this});
        }
        return TABLE_NAME;
    }

    /* renamed from: n */
    public ExperimentDO i(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentDO) ipChange.ipc$dispatch("e2c3e8d2", new Object[]{this, cursor});
        }
        return new ExperimentDO(cursor);
    }
}
