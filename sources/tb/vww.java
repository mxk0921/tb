package tb;

import android.content.ContentValues;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vww extends w00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static vww f30306a = null;
    public static tno b = null;

    static {
        t2o.a(962593209);
    }

    public vww() {
        b = pow.c().b();
    }

    public static synchronized vww getInstance() {
        synchronized (vww.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vww) ipChange.ipc$dispatch("2afb3b6b", new Object[0]);
            }
            if (f30306a == null) {
                f30306a = new vww();
            }
            return f30306a;
        }
    }

    public static /* synthetic */ Object ipc$super(vww vwwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/edgecomputing/adapter/WalleDataCollectorAdapter");
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a2ebd1", new Object[]{this, str});
            return;
        }
        try {
            nhh.f("WalleDataCollectorAdapter", "clearLegacyData table", str);
            tno d = d();
            d.a("DELETE FROM " + str + " WHERE id < (SELECT MAX(id) FROM " + str + ") - 5000;");
        } catch (Exception e) {
            nhh.v("WalleDataCollectorAdapter", "clearLegacyData db error", e);
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb78b46", new Object[]{this, str});
            return;
        }
        try {
            nhh.f("WalleDataCollectorAdapter", "create edge table", str);
            tno d = d();
            d.a("CREATE TABLE IF NOT EXISTS " + str + "(id INTEGER PRIMARY KEY AUTOINCREMENT, left_node_id INTEGER, right_node_id INTEGER, left_table  VARCHAR,right_table VARCHAR,left_event_id VARCHAR,right_event_id VARCHAR,left_event_name VARCHAR,right_event_name VARCHAR,left_scene VARCHAR,right_scene VARCHAR,create_time VARCHAR)");
        } catch (Exception e) {
            nhh.v("WalleDataCollectorAdapter", "create db error", e);
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346247e1", new Object[]{this, str});
            return;
        }
        try {
            nhh.f("WalleDataCollectorAdapter", "create node table", str);
            tno d = d();
            d.a("CREATE TABLE IF NOT EXISTS " + str + "(id INTEGER PRIMARY KEY AUTOINCREMENT, cold_start_id  VARCHAR, session_id  VARCHAR, pv_key  VARCHAR, pv_id VARCHAR, scene  VARCHAR, from_scene  VARCHAR, event_id VARCHAR, create_time  VARCHAR, user_id  VARCHAR, update_time  VARCHAR, page VARCHAR, arg1 VARCHAR,arg2 VARCHAR,arg3 VARCHAR,args VARCHAR,spm_cnt VARCHAR,spm_url VARCHAR,spm_pre VARCHAR,scm VARCHAR,scm_pre VARCHAR,utparam_cnt VARCHAR,utparam_url VARCHAR,utparam_pre VARCHAR,utlogmap VARCHAR,utlogmapedge VARCHAR,object_id  VARCHAR,object_type  VARCHAR,biz_arg1  VARCHAR, biz_arg2  VARCHAR, biz_arg3  VARCHAR, biz_arg4  VARCHAR, biz_arg5  VARCHAR, biz_arg6  VARCHAR, biz_arg7  VARCHAR, biz_arg8  VARCHAR, biz_arg9  VARCHAR, biz_arg10  VARCHAR, biz_args  VARCHAR, sys_arg1  VARCHAR, sys_arg2  VARCHAR, sys_arg3  VARCHAR, sys_arg4  VARCHAR, sys_arg5  VARCHAR,sys_args  VARCHAR )");
        } catch (Exception e) {
            nhh.v("WalleDataCollectorAdapter", "create db error", e);
        }
    }

    @Override // tb.w00
    public long commit(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("519dce5d", new Object[]{this, str, str2, str3, map})).longValue();
        }
        return f(str, str2, map);
    }

    @Override // tb.w00
    public void createTable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155e1143", new Object[]{this, str});
            return;
        }
        if (str.endsWith("node")) {
            c(str);
        } else if (str.endsWith("edge")) {
            b(str);
        }
        a(str);
    }

    public final tno d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tno) ipChange.ipc$dispatch("e6e7bda9", new Object[]{this});
        }
        return b;
    }

    public final String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bd2e482", new Object[]{this, str, str2});
        }
        return "dc_" + str + "_" + str2;
    }

    public final String g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0e1ae7d", new Object[]{this, obj});
        }
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // tb.w00
    public long update(String str, String str2, String str3, String str4, String[] strArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d351e772", new Object[]{this, str, str2, str3, str4, strArr, map})).longValue();
        }
        return h(str, str2, str4, strArr, map);
    }

    public final long f(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2ac55e1", new Object[]{this, str, str2, map})).longValue();
        }
        if (map == null) {
            return -2L;
        }
        if (d() == null) {
            return -3L;
        }
        ContentValues contentValues = new ContentValues();
        for (String str3 : map.keySet()) {
            contentValues.put(str3, g(map.get(str3)));
        }
        String e = e(str, str2);
        nhh.f("WalleDataCollectorAdapter", "save table", e);
        return d().c(e, "", contentValues, 0);
    }

    public final int h(String str, String str2, String str3, String[] strArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f47edfa7", new Object[]{this, str, str2, str3, strArr, map})).intValue();
        }
        if (map == null || d() == null || str3 == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        for (String str4 : map.keySet()) {
            contentValues.put(str4, g(map.get(str4)));
        }
        String e = e(str, str2);
        nhh.f("WalleDataCollectorAdapter", "update table", e);
        return d().e(e, contentValues, str3, strArr, 0);
    }
}
