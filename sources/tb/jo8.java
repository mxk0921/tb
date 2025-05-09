package tb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jo8 extends l<ExperimentDO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TABLE_NAME = "experiments_v1";

    static {
        t2o.a(961544226);
    }

    public static /* synthetic */ Object ipc$super(jo8 jo8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/evo/internal/database/ExperimentDao");
    }

    public static void l(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787a926a", new Object[]{sQLiteDatabase, str, str2});
            return;
        }
        sQLiteDatabase.execSQL("alter table experiments_v1 add " + str + " " + str2);
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
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "\"experiments_v1\" (id INTEGER, key VARCHAR(2048) NOT NULL, release_id INTEGER NOT NULL, type INTEGER NOT NULL, begin_time INTEGER NOT NULL, end_time INTEGER NOT NULL, tracks VARCHAR(2048), condition VARCHAR(4096), cognation VARCHAR(4096) NOT NULL, groups TEXT, variation_config TEXT, hit_count INTEGER NOT NULL DEFAULT 0, hit_latest_time INTEGER NOT NULL DEFAULT 0, create_time INTEGER, modified_time INTEGER, owner_id VARCHAR(64) NOT NULL DEFAULT '0', ext_int INTEGER, priority_level_int INTEGER, exp_index_type INTEGER, exp_publish_type INTEGER, ext_string TEXT, PRIMARY KEY(id))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS experiments_v1_key_idx ON experiments_v1(key)");
    }

    public static void n(SQLiteDatabase sQLiteDatabase, boolean z) throws Exception {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0534dd5", new Object[]{sQLiteDatabase, new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        if (z) {
            str = "IF EXISTS ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("\"experiments_v1\"");
        sQLiteDatabase.execSQL(sb.toString());
    }

    @Override // tb.bt1
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3aed216", new Object[]{this});
        }
        return TABLE_NAME;
    }

    public Map<Long, ExperimentDO> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("45d23a0", new Object[]{this});
        }
        max maxVar = new max();
        maxVar.f(new lax("hit_count>?", 0), new lax[0]);
        lax b = maxVar.b();
        ArrayList<T> h = h(new String[]{"id", ExperimentDO.COLUMN_HIT_COUNT, ExperimentDO.COLUMN_HIT_LATEST_TIME}, null, 0, 0, b.c(), b.d());
        if (h == 0 || h.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = h.iterator();
        while (it.hasNext()) {
            ExperimentDO experimentDO = (ExperimentDO) it.next();
            hashMap.put(Long.valueOf(experimentDO.getId()), experimentDO);
        }
        return hashMap;
    }

    /* renamed from: p */
    public ExperimentDO i(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentDO) ipChange.ipc$dispatch("e2c3e8d2", new Object[]{this, cursor});
        }
        return new ExperimentDO(cursor);
    }

    public void q(Map<Long, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9694ded9", new Object[]{this, map});
            return;
        }
        Iterator<Map.Entry<Long, Long>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, Long> next = it.next();
            b().c("UPDATE experiments_v1 SET hit_count = hit_count + " + next.getValue() + ", hit_latest_time = " + System.currentTimeMillis() + " WHERE id = " + next.getKey());
            it.remove();
        }
    }
}
