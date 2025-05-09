package tb;

import android.text.TextUtils;
import com.alibaba.analytics.core.config.UTDBConfigEntity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class xzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] ORANGE_CONFIGS = {"ut_sample", "ut_bussiness", "utap_system", "ap_alarm", "ap_counter", "ap_stat", "ut_realtime"};
    public static final String c = "{\"utap_system\":{\"content\":{\"fu\":30,\"sw_plugin\":0,\"bu\":300}},\"ut_sample\":{\"content\":{\"1\":{\"cp\":10000},\"1000\":{\"cp\":10000},\"2000\":{\"cp\":10000},\"2100\":{\"cp\":10000},\"3002\":{\"cp\":10000},\"3003\":{\"cp\":10000},\"3004\":{\"cp\":10000},\"4007\":{\"cp\":10000},\"5002\":{\"cp\":10000},\"5004\":{\"cp\":10000},\"5005\":{\"cp\":10000},\"6004\":{\"cp\":10000},\"9001\":{\"cp\":10000},\"9002\":{\"cp\":10000},\"9003\":{\"cp\":10000},\"9101\":{\"cp\":10000},\"9199\":{\"cp\":10000},\"12000\":{\"cp\":10000},\"15301\":{\"cp\":10000},\"15302\":{\"cp\":1},\"15303\":{\"cp\":10000},\"15304\":{\"cp\":10000},\"15305\":{\"cp\":10000},\"15306\":{\"cp\":100},\"15307\":{\"cp\":10000},\"15391\":{\"cp\":100},\"15392\":{\"cp\":10000},\"15393\":{\"cp\":1200},\"15394\":{\"cp\":10000},\"19990\":{\"cp\":10000},\"19997\":{\"cp\":10000},\"19998\":{\"cp\":10000},\"19999\":{\"cp\":10000},\"21032\":{\"cp\":10000},\"21034\":{\"cp\":1},\"21064\":{\"cp\":10000},\"22064\":{\"cp\":1},\"61001\":{\"cp\":10000},\"61006\":{\"cp\":10000},\"61007\":{\"cp\":10000},\"65001\":{\"cp\":1},\"65100\":{\"cp\":1},\"65101\":{\"cp\":4},\"65104\":{\"cp\":10000},\"65105\":{\"cp\":10000},\"65111\":{\"cp\":100},\"65113\":{\"cp\":10000},\"65114\":{\"cp\":10000},\"65125\":{\"cp\":10000},\"65132\":{\"cp\":10000},\"65171\":{\"cp\":100},\"65172\":{\"cp\":100},\"65173\":{\"cp\":100},\"65174\":{\"cp\":100},\"65175\":{\"cp\":100},\"65176\":{\"cp\":100},\"65177\":{\"cp\":100},\"65178\":{\"cp\":100},\"65180\":{\"cp\":900},\"65183\":{\"cp\":10000},\"65200\":{\"cp\":10000},\"65501\":{\"cp\":10000},\"65502\":{\"cp\":10000},\"65503\":{\"cp\":10000},\"66001\":{\"cp\":100},\"66003\":{\"cp\":10000},\"66101\":{\"cp\":10000},\"66404\":{\"cp\":10000},\"66602\":{\"cp\":10000}}},\"ut_bussiness\":{\"content\":{\"tpk\":[{\"kn\":\"adid\",\"ty\":\"nearby\"},{\"kn\":\"ucm\",\"ty\":\"nearby\"},{\"kn\":\"bdid\",\"ty\":\"far\"},{\"kn\":\"ref_pid\",\"ty\":\"far\"},{\"kn\":\"pid\",\"ty\":\"far\"},{\"kn\":\"tpa\",\"ty\":\"far\"},{\"kn\":\"point\",\"ty\":\"far\"},{\"kn\":\"ali_trackid\",\"ty\":\"far\"},{\"kn\":\"xncode\",\"ty\":\"nearby\"},{\"kn\":\"ybhpss\",\"ty\":\"nearby\"},{\"kn\":\"a_n\",\"ty\":\"far\"},{\"kn\":\"i_d\",\"ty\":\"far\"},{\"kn\":\"h_d\",\"ty\":\"far\"},{\"kn\":\"r_n\",\"ty\":\"far\"},{\"kn\":\"uplusRankId\",\"ty\":\"nearby\"}]}}}";
    public static final String d = "timestamp";

    /* renamed from: a  reason: collision with root package name */
    public final Vector<y1v> f31748a = new Vector<>();
    public List<UTDBConfigEntity> b = new LinkedList();

    public final synchronized void a(List<UTDBConfigEntity> list) {
        String[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8da13a2", new Object[]{this, list});
            return;
        }
        if (list != null && list.size() > 0) {
            HashMap hashMap = new HashMap();
            for (UTDBConfigEntity uTDBConfigEntity : list) {
                if (!hsq.f(uTDBConfigEntity.getGroupname())) {
                    hashMap.put(uTDBConfigEntity.getGroupname(), uTDBConfigEntity);
                }
            }
            Iterator<y1v> it = this.f31748a.iterator();
            while (it.hasNext()) {
                y1v next = it.next();
                for (String str : next.a()) {
                    if (hashMap.containsKey(str)) {
                        UTDBConfigEntity uTDBConfigEntity2 = (UTDBConfigEntity) hashMap.get(str);
                        if (nhh.n()) {
                            nhh.f("", "Groupname", str, "DBConfEntity", hsq.j(uTDBConfigEntity2.getConfContent()));
                        }
                        next.c(str, hsq.j(uTDBConfigEntity2.getConfContent()));
                    } else {
                        next.b(str);
                    }
                }
            }
        }
    }

    public final synchronized List<UTDBConfigEntity> b(List<UTDBConfigEntity> list) {
        UTDBConfigEntity uTDBConfigEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("713e4112", new Object[]{this, list});
        }
        HashMap hashMap = new HashMap();
        for (UTDBConfigEntity uTDBConfigEntity2 : this.b) {
            if (uTDBConfigEntity2.getGroupname() != null) {
                hashMap.put(uTDBConfigEntity2.getGroupname(), uTDBConfigEntity2);
            }
        }
        LinkedList linkedList = new LinkedList();
        for (UTDBConfigEntity uTDBConfigEntity3 : list) {
            String groupname = uTDBConfigEntity3.getGroupname();
            long confTimestamp = uTDBConfigEntity3.getConfTimestamp();
            if (!hsq.f(groupname) && confTimestamp > 0 && ((uTDBConfigEntity = (UTDBConfigEntity) hashMap.get(groupname)) == null || confTimestamp > uTDBConfigEntity.getConfTimestamp())) {
                if (uTDBConfigEntity != null && confTimestamp > uTDBConfigEntity.getConfTimestamp()) {
                    this.b.remove(uTDBConfigEntity);
                    uTDBConfigEntity.delete();
                }
                this.b.add(uTDBConfigEntity3);
                uTDBConfigEntity3.store();
                zg4.b().d(groupname, String.valueOf(confTimestamp));
                linkedList.add(uTDBConfigEntity3);
            }
        }
        c();
        return linkedList;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81334f25", new Object[]{this});
        } else if (nhh.n()) {
            nhh.f("UTBaseConfMgr", "++++++++++_printLocalDBConfigEntities++++++++++");
            nhh.f("UTBaseConfMgr", "LocalDBConfigEntities.size", Integer.valueOf(this.b.size()));
            for (UTDBConfigEntity uTDBConfigEntity : this.b) {
                nhh.f("UTBaseConfMgr", "Groupname", uTDBConfigEntity.getGroupname(), "ConfTimestamp", Long.valueOf(uTDBConfigEntity.getConfTimestamp()), "ContentLength", Integer.valueOf(uTDBConfigEntity.getConfContent().length()), "_id", Long.valueOf(uTDBConfigEntity._id));
            }
        }
    }

    public final synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e897e96", new Object[]{this});
            return;
        }
        List<UTDBConfigEntity> list = this.b;
        if (!(list == null || list.size() == 0)) {
            HashMap hashMap = new HashMap();
            boolean z = false;
            for (UTDBConfigEntity uTDBConfigEntity : this.b) {
                long j = 0;
                if (uTDBConfigEntity.getConfTimestamp() > 0) {
                    String groupname = uTDBConfigEntity.getGroupname();
                    if (hashMap.containsKey(groupname)) {
                        long confTimestamp = uTDBConfigEntity.getConfTimestamp();
                        try {
                            j = ((UTDBConfigEntity) hashMap.get(groupname)).getConfTimestamp();
                        } catch (Exception unused) {
                        }
                        if (confTimestamp > j) {
                            hashMap.put(groupname, uTDBConfigEntity);
                        }
                    } else {
                        hashMap.put(groupname, uTDBConfigEntity);
                    }
                }
                z = true;
            }
            nhh.f("UTBaseConfMgr", "LocalDBConfig needClearDatabase", Boolean.valueOf(z));
            if (z) {
                this.b.clear();
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.b.add((UTDBConfigEntity) entry.getValue());
                }
                o2w.k().h().b(UTDBConfigEntity.class);
                for (UTDBConfigEntity uTDBConfigEntity2 : this.b) {
                    uTDBConfigEntity2.store();
                }
            }
        }
    }

    public synchronized void f(y1v y1vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439a6591", new Object[]{this, y1vVar});
            return;
        }
        if (y1vVar != null) {
            this.f31748a.add(y1vVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:10|(9:15|36|16|26|(2:29|27)|41|30|31|32)|19|38|20|(2:23|21)|40|26|(1:27)|41|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
        tb.nhh.h("UTBaseConfMgr", r0, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[Catch: all -> 0x0015, LOOP:1: B:27:0x00ad->B:29:0x00b3, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x0018, B:12:0x004f, B:15:0x0056, B:16:0x0062, B:18:0x0067, B:19:0x006f, B:20:0x007b, B:21:0x008c, B:23:0x0092, B:25:0x009d, B:26:0x00a4, B:27:0x00ad, B:29:0x00b3, B:30:0x00cd), top: B:35:0x0003, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            monitor-enter(r6)
            com.android.alibaba.ip.runtime.IpChange r2 = tb.xzu.$ipChange     // Catch: all -> 0x0015
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x0015
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "fede197"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0015
            r0[r1] = r6     // Catch: all -> 0x0015
            r2.ipc$dispatch(r3, r0)     // Catch: all -> 0x0015
            monitor-exit(r6)
            return
        L_0x0015:
            r0 = move-exception
            goto L_0x00d4
        L_0x0018:
            tb.o2w r2 = tb.o2w.k()     // Catch: all -> 0x0015
            tb.c55 r2 = r2.h()     // Catch: all -> 0x0015
            java.lang.Class<com.alibaba.analytics.core.config.UTDBConfigEntity> r3 = com.alibaba.analytics.core.config.UTDBConfigEntity.class
            r4 = -1
            r5 = 0
            java.util.List r2 = r2.i(r3, r5, r5, r4)     // Catch: all -> 0x0015
            r6.b = r2     // Catch: all -> 0x0015
            java.lang.String r2 = "UTBaseConfMgr"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: all -> 0x0015
            java.lang.String r4 = "init UTDBConfig"
            r3[r1] = r4     // Catch: all -> 0x0015
            tb.nhh.f(r2, r3)     // Catch: all -> 0x0015
            r6.c()     // Catch: all -> 0x0015
            r6.e()     // Catch: all -> 0x0015
            java.lang.String r2 = "UTBaseConfMgr"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: all -> 0x0015
            java.lang.String r4 = "init refreshLocalDBConfig"
            r3[r1] = r4     // Catch: all -> 0x0015
            tb.nhh.f(r2, r3)     // Catch: all -> 0x0015
            r6.c()     // Catch: all -> 0x0015
            java.util.List<com.alibaba.analytics.core.config.UTDBConfigEntity> r2 = r6.b     // Catch: all -> 0x0015
            if (r2 == 0) goto L_0x006f
            int r2 = r2.size()     // Catch: all -> 0x0015
            if (r2 != 0) goto L_0x0056
            goto L_0x006f
        L_0x0056:
            java.lang.String r2 = "UTBaseConfMgr"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0015
            java.lang.String r3 = "init refreshDefaultWhiteConfigs"
            r0[r1] = r3     // Catch: all -> 0x0015
            tb.nhh.v(r2, r0)     // Catch: all -> 0x0015
            r6.d()     // Catch: all -> 0x0015, Exception -> 0x0066
            goto L_0x00a4
        L_0x0066:
            r0 = move-exception
            java.lang.String r2 = "UTBaseConfMgr"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x0015
            tb.nhh.h(r2, r0, r1)     // Catch: all -> 0x0015
            goto L_0x00a4
        L_0x006f:
            java.lang.String r2 = "UTBaseConfMgr"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0015
            java.lang.String r3 = "init LocalDBConfigEntities is null"
            r0[r1] = r3     // Catch: all -> 0x0015
            tb.nhh.f(r2, r0)     // Catch: all -> 0x0015
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: all -> 0x0015, JSONException -> 0x009c
            java.lang.String r2 = tb.xzu.c     // Catch: all -> 0x0015, JSONException -> 0x009c
            r0.<init>(r2)     // Catch: all -> 0x0015, JSONException -> 0x009c
            java.util.List r0 = tb.n0v.c(r0)     // Catch: all -> 0x0015, JSONException -> 0x009c
            r6.b = r0     // Catch: all -> 0x0015, JSONException -> 0x009c
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x0015, JSONException -> 0x009c
        L_0x008c:
            boolean r2 = r0.hasNext()     // Catch: all -> 0x0015, JSONException -> 0x009c
            if (r2 == 0) goto L_0x00a4
            java.lang.Object r2 = r0.next()     // Catch: all -> 0x0015, JSONException -> 0x009c
            com.alibaba.analytics.core.config.UTDBConfigEntity r2 = (com.alibaba.analytics.core.config.UTDBConfigEntity) r2     // Catch: all -> 0x0015, JSONException -> 0x009c
            r2.store()     // Catch: all -> 0x0015, JSONException -> 0x009c
            goto L_0x008c
        L_0x009c:
            r0 = move-exception
            java.lang.String r2 = "UTBaseConfMgr"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x0015
            tb.nhh.h(r2, r0, r1)     // Catch: all -> 0x0015
        L_0x00a4:
            r6.c()     // Catch: all -> 0x0015
            java.util.List<com.alibaba.analytics.core.config.UTDBConfigEntity> r0 = r6.b     // Catch: all -> 0x0015
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x0015
        L_0x00ad:
            boolean r1 = r0.hasNext()     // Catch: all -> 0x0015
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r0.next()     // Catch: all -> 0x0015
            com.alibaba.analytics.core.config.UTDBConfigEntity r1 = (com.alibaba.analytics.core.config.UTDBConfigEntity) r1     // Catch: all -> 0x0015
            tb.zg4 r2 = tb.zg4.b()     // Catch: all -> 0x0015
            java.lang.String r3 = r1.getGroupname()     // Catch: all -> 0x0015
            long r4 = r1.getConfTimestamp()     // Catch: all -> 0x0015
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch: all -> 0x0015
            r2.d(r3, r1)     // Catch: all -> 0x0015
            goto L_0x00ad
        L_0x00cd:
            java.util.List<com.alibaba.analytics.core.config.UTDBConfigEntity> r0 = r6.b     // Catch: all -> 0x0015
            r6.a(r0)     // Catch: all -> 0x0015
            monitor-exit(r6)
            return
        L_0x00d4:
            monitor-exit(r6)     // Catch: all -> 0x0015
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xzu.g():void");
    }

    public abstract void h();

    public final synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6728b4", new Object[]{this});
            return;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (UTDBConfigEntity uTDBConfigEntity : this.b) {
            String groupname = uTDBConfigEntity.getGroupname();
            if ("utap_system".equalsIgnoreCase(groupname)) {
                z = true;
            } else if ("ut_sample".equalsIgnoreCase(groupname)) {
                z2 = true;
            } else if ("ut_bussiness".equalsIgnoreCase(groupname)) {
                z3 = true;
            }
        }
        if (!z || !z2 || !z3) {
            List<UTDBConfigEntity> linkedList = new LinkedList();
            UTDBConfigEntity uTDBConfigEntity2 = null;
            try {
                linkedList = n0v.c(new JSONObject(c));
            } catch (JSONException e) {
                nhh.h(null, e, new Object[0]);
            }
            if (linkedList != null) {
                UTDBConfigEntity uTDBConfigEntity3 = null;
                UTDBConfigEntity uTDBConfigEntity4 = null;
                for (UTDBConfigEntity uTDBConfigEntity5 : linkedList) {
                    String groupname2 = uTDBConfigEntity5.getGroupname();
                    if ("utap_system".equalsIgnoreCase(groupname2)) {
                        uTDBConfigEntity2 = uTDBConfigEntity5;
                    } else if ("ut_sample".equalsIgnoreCase(groupname2)) {
                        uTDBConfigEntity3 = uTDBConfigEntity5;
                    } else if ("ut_bussiness".equalsIgnoreCase(groupname2)) {
                        uTDBConfigEntity4 = uTDBConfigEntity5;
                    }
                }
                if (!z && uTDBConfigEntity2 != null) {
                    this.b.add(uTDBConfigEntity2);
                    uTDBConfigEntity2.store();
                }
                if (!z2 && uTDBConfigEntity3 != null) {
                    this.b.add(uTDBConfigEntity3);
                }
                if (!z3 && uTDBConfigEntity4 != null) {
                    this.b.add(uTDBConfigEntity4);
                }
            }
        }
    }

    static {
        t2o.a(962592827);
    }

    public final synchronized void i(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9de9aec", new Object[]{this, str, map});
            return;
        }
        if (map != null && map.size() > 0) {
            String remove = map.remove(d);
            if (!TextUtils.isEmpty(remove)) {
                long longValue = Long.valueOf(remove).longValue();
                long c2 = zg4.b().c(str);
                nhh.f("UTBaseConfMgr", "updateAndDispatch namespace", str, "inputTimestampLong", String.valueOf(longValue), "configTimeStamp", String.valueOf(c2));
                if (longValue > c2) {
                    UTDBConfigEntity b = n0v.b(str, map, longValue);
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(b);
                    List<UTDBConfigEntity> b2 = b(linkedList);
                    if (b2 != null && b2.size() > 0) {
                        a(b2);
                    }
                }
            } else {
                nhh.i("UTBaseConfMgr", "updateAndDispatch", "timestamp is empty");
            }
        }
    }
}
