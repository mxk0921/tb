package tb;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.alibaba.security.realidentity.v2;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class fy1 implements lzc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long CLEAN_DB_SIZE = 52428800;
    public static final String COL_CONTENT = "content";
    public static final String COL_EXT1 = "ext1";
    public static final String COL_EXT2 = "ext2";
    public static final String COL_ID = "id";
    public static final String COL_KEY = "key";
    public static final String COL_TYPE_ID = "type_id";
    public static final String TABLE = "MonitorManager";
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: a  reason: collision with root package name */
    public final Map<Long, svc> f19621a = new HashMap();

    static {
        t2o.a(628097085);
        t2o.a(628097084);
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575982d1", new Object[]{sQLiteDatabase, new Integer(i)});
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + h(i) + "(id VARCHAR(128) not null,key INTEGER not null,type_id INTEGER,content TEXT,ext1 TEXT,ext2 TEXT);");
    }

    public static void f(SQLiteDatabase sQLiteDatabase, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0530e04", new Object[]{sQLiteDatabase, new Integer(i)});
            return;
        }
        MsgLog.g("MonitorManager", Integer.valueOf(i), "dropTable !!!!!!");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + h(i) + ";");
        MsgMonitor.a("MKT", "c_mdb", 1.0d);
    }

    public static String h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4acf48", new Object[]{new Integer(i)});
        }
        return "MonitorManager" + i + v2.d;
    }

    public static long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97a22a0c", new Object[0])).longValue();
        }
        File databasePath = p2j.h.getDatabasePath("message_kit");
        if (databasePath.exists()) {
            return databasePath.length();
        }
        return 0L;
    }

    public void c(List<svc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d80199", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            o(list.get(i));
        }
    }

    public boolean e(List<svc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f366c23", new Object[]{this, list})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(x());
        sb.append(" WHERE ");
        StringBuilder sb2 = new StringBuilder("key IN ( ");
        StringBuilder sb3 = new StringBuilder("id IN ( ");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb2.append(",");
                sb3.append(",");
            }
            sb2.append(list.get(i).key());
            sb3.append("\"");
            sb3.append(list.get(i).a());
            sb3.append("\"");
        }
        sb2.append(" )");
        sb3.append(" )");
        sb.append((CharSequence) sb2);
        sb.append(" AND ");
        sb.append((CharSequence) sb3);
        m2j.a(sb.toString(), null);
        return true;
    }

    public abstract svc g(long j, String str, String str2);

    public List<svc> i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("640eb7c1", new Object[]{this, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        Map<Long, svc> map = this.f19621a;
        if (map != null && ((HashMap) map).size() > 0) {
            int i2 = 0;
            for (svc svcVar : ((HashMap) this.f19621a).values()) {
                if (i >= 0 && i2 >= i) {
                    break;
                } else if (svcVar != null) {
                    i2++;
                    arrayList.add(svcVar);
                }
            }
            t(arrayList, false);
            MsgLog.i("MonitorManager", Integer.valueOf(sysCode()), "dump count >> ", Integer.valueOf(i2));
        }
        return arrayList;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        s();
        d(m2j.b().getWritableDatabase(), sysCode());
    }

    public abstract int m();

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c7df93b", new Object[]{this});
        }
        return "content";
    }

    public final void o(svc svcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea8899", new Object[]{this, svcVar});
        } else if (((HashMap) this.f19621a).size() >= m()) {
            MsgLog.g("MonitorManager", Integer.valueOf(sysCode()), "!!! ReportInfoList reach MAX ");
        } else {
            ((HashMap) this.f19621a).put(Long.valueOf(svcVar.key()), svcVar);
        }
    }

    public List<svc> q(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c2dc3c41", new Object[]{this, cursor});
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex("id"));
            long j = cursor.getLong(cursor.getColumnIndex("key"));
            if (0 == j) {
                break;
            }
            svc g = g(j, string, cursor.getString(cursor.getColumnIndex("content")));
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7586bdc1", new Object[]{this});
        } else if (j() >= 52428800) {
            f(m2j.b().getWritableDatabase(), sysCode());
        }
    }

    public void t(List<svc> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a94058", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                u(list.get(i));
            }
            if (z) {
                e(list);
            }
        }
    }

    public final void u(svc svcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245874c4", new Object[]{this, svcVar});
        } else {
            ((HashMap) this.f19621a).remove(Long.valueOf(svcVar.key()));
        }
    }

    public abstract void v(String str, List<svc> list, lkd lkdVar);

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return ((HashMap) this.f19621a).size();
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32f3b120", new Object[]{this});
        }
        return h(sysCode());
    }

    public long l(String str, String str2, Map<String, Object> map, int i) {
        Object[] objArr;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aac8777d", new Object[]{this, str, str2, map, new Integer(i)})).longValue();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(b[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            int size = (map == null || map.size() <= 0) ? 0 : map.size();
            if (size > 0) {
                objArr = new Object[size];
                int i2 = 0;
                for (String str5 : map.keySet()) {
                    if (i2 > 0) {
                        str4 = ",";
                    } else {
                        str4 = "";
                    }
                    sb.append(str4);
                    sb.append(str5);
                    i2++;
                    objArr[i2] = map.get(str5);
                }
                sb.append(')');
                sb.append(" VALUES (");
                for (int i3 = 0; i3 < size; i3++) {
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
            MsgLog.i("MonitorManager", "sql = " + sb.toString());
            m2j.a(sb.toString(), objArr);
            return 1L;
        } catch (Exception e) {
            MsgLog.g("MonitorManager", Log.getStackTraceString(e));
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r5 == null) goto L_0x0069;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
        com.taobao.tao.messagekit.core.utils.MsgLog.i("MonitorManager", java.lang.Integer.valueOf(sysCode()), "query from db >", java.lang.Integer.valueOf(((java.util.HashMap) r8.f19621a).size()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p() {
        /*
            r8 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.String r3 = "MonitorManager"
            java.lang.String r4 = "SELECT * FROM "
            com.android.alibaba.ip.runtime.IpChange r5 = tb.fy1.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0017
            java.lang.String r0 = "943af94f"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            r5.ipc$dispatch(r0, r2)
            return
        L_0x0017:
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x004b, Exception -> 0x004d
            r6.<init>(r4)     // Catch: all -> 0x004b, Exception -> 0x004d
            java.lang.String r4 = r8.x()     // Catch: all -> 0x004b, Exception -> 0x004d
            r6.append(r4)     // Catch: all -> 0x004b, Exception -> 0x004d
            java.lang.String r4 = " LIMIT 5000"
            r6.append(r4)     // Catch: all -> 0x004b, Exception -> 0x004d
            java.lang.String r4 = r6.toString()     // Catch: all -> 0x004b, Exception -> 0x004d
            android.database.Cursor r5 = tb.m2j.c(r4, r5)     // Catch: all -> 0x004b, Exception -> 0x004d
            if (r5 == 0) goto L_0x004f
            java.util.List r4 = r8.q(r5)     // Catch: all -> 0x004b, Exception -> 0x004d
            java.util.Iterator r4 = r4.iterator()     // Catch: all -> 0x004b, Exception -> 0x004d
        L_0x003b:
            boolean r6 = r4.hasNext()     // Catch: all -> 0x004b, Exception -> 0x004d
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r4.next()     // Catch: all -> 0x004b, Exception -> 0x004d
            tb.svc r6 = (tb.svc) r6     // Catch: all -> 0x004b, Exception -> 0x004d
            r8.o(r6)     // Catch: all -> 0x004b, Exception -> 0x004d
            goto L_0x003b
        L_0x004b:
            r0 = move-exception
            goto L_0x008d
        L_0x004d:
            r4 = move-exception
            goto L_0x0055
        L_0x004f:
            if (r5 == 0) goto L_0x0069
        L_0x0051:
            r5.close()
            goto L_0x0069
        L_0x0055:
            int r6 = r8.sysCode()     // Catch: all -> 0x004b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: all -> 0x004b
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: all -> 0x004b
            r7[r1] = r6     // Catch: all -> 0x004b
            r7[r2] = r4     // Catch: all -> 0x004b
            com.taobao.tao.messagekit.core.utils.MsgLog.g(r3, r7)     // Catch: all -> 0x004b
            if (r5 == 0) goto L_0x0069
            goto L_0x0051
        L_0x0069:
            int r4 = r8.sysCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.Map<java.lang.Long, tb.svc> r5 = r8.f19621a
            java.util.HashMap r5 = (java.util.HashMap) r5
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r4
            java.lang.String r1 = "query from db >"
            r6[r2] = r1
            r6[r0] = r5
            com.taobao.tao.messagekit.core.utils.MsgLog.i(r3, r6)
            return
        L_0x008d:
            if (r5 == 0) goto L_0x0092
            r5.close()
        L_0x0092:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fy1.p():void");
    }

    public void r(svc svcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbe597", new Object[]{this, svcVar});
            return;
        }
        try {
            o(svcVar);
            HashMap hashMap = new HashMap();
            hashMap.put("id", svcVar.a());
            hashMap.put(COL_TYPE_ID, Integer.valueOf(svcVar.b()));
            hashMap.put("key", Long.valueOf(svcVar.key()));
            hashMap.put("content", svcVar.toJson().toJSONString());
            if (l(x(), n(), hashMap, 4) < 1) {
                MsgLog.g("MonitorManager", Integer.valueOf(sysCode()), "insert error ", Long.valueOf(svcVar.key()));
                MsgMonitor.a("MKT", ErrorType.IO, 1.0d);
            }
        } catch (Exception e) {
            MsgLog.g("MonitorManager", Log.getStackTraceString(e));
        }
    }

    public static void y(SQLiteDatabase sQLiteDatabase, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e11c11", new Object[]{sQLiteDatabase, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i2 < 4) {
            Integer valueOf = Integer.valueOf(i);
            MsgLog.g("MonitorManager", valueOf, i2 + "upgradeTable >>" + i3);
            StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
            sb.append(h(i));
            sb.append(";");
            sQLiteDatabase.execSQL(sb.toString());
            d(sQLiteDatabase, i);
        }
    }
}
