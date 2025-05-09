package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.UTEventId;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ckl b;
    public static ckl c;
    public static myo e;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, ckl> f18019a = Collections.synchronizedMap(new HashMap());
    public static final Map<String, mto> d = Collections.synchronizedMap(new HashMap());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map val$logMap;
        public final /* synthetic */ String val$startTime;

        public a(String str, Map map) {
            this.val$startTime = str;
            this.val$logMap = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dqv.access$000(this.val$startTime, this.val$logMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$endTime;
        public final /* synthetic */ Map val$logMap;

        public b(String str, Map map) {
            this.val$endTime = str;
            this.val$logMap = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dqv.access$100(this.val$endTime, this.val$logMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map val$properties;
        public final /* synthetic */ String val$scene;
        public final /* synthetic */ String val$startTime;

        public c(String str, Map map, String str2) {
            this.val$scene = str;
            this.val$properties = map;
            this.val$startTime = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dqv.access$200(this.val$scene, this.val$properties, this.val$startTime);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$endTime;
        public final /* synthetic */ boolean val$leave;
        public final /* synthetic */ Map val$logMap;
        public final /* synthetic */ String val$scene;

        public d(String str, String str2, Map map, boolean z) {
            this.val$scene = str;
            this.val$endTime = str2;
            this.val$logMap = map;
            this.val$leave = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dqv.access$300(this.val$scene, this.val$endTime, this.val$logMap, this.val$leave);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$contextHashCode;
        public final /* synthetic */ String val$pageName;
        public final /* synthetic */ String val$startTime;

        public e(String str, String str2, String str3) {
            this.val$contextHashCode = str;
            this.val$pageName = str2;
            this.val$startTime = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nhh.f(eqv.TAG, "commitEnter contextHashCode", this.val$contextHashCode);
            dqv.access$400(this.val$contextHashCode, this.val$pageName, this.val$startTime);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$contextHashCode;
        public final /* synthetic */ String val$endTime;
        public final /* synthetic */ boolean val$leave;
        public final /* synthetic */ Map val$logMap;

        public f(String str, String str2, Map map, boolean z) {
            this.val$contextHashCode = str;
            this.val$endTime = str2;
            this.val$logMap = map;
            this.val$leave = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dqv.access$500(this.val$contextHashCode, this.val$endTime, this.val$logMap, this.val$leave);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map val$logMap;
        public final /* synthetic */ String val$startTime;

        public h(String str, Map map) {
            this.val$startTime = str;
            this.val$logMap = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dqv.access$700(this.val$startTime, this.val$logMap);
            }
        }
    }

    static {
        t2o.a(962593217);
    }

    public static synchronized long a(ky1 ky1Var, ky1 ky1Var2, boolean z) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("48fd6fb1", new Object[]{ky1Var, ky1Var2, new Boolean(z)})).longValue();
            } else if (ky1Var == null || ky1Var2 == null) {
                return -1L;
            } else {
                y68 y68Var = new y68();
                y68Var.left_node_id = ky1Var.id;
                y68Var.left_table = ky1Var.getTableName();
                y68Var.left_event_id = ky1Var.event_id;
                y68Var.left_event_name = ky1Var.page;
                y68Var.left_scene = ky1Var.scene;
                y68Var.right_node_id = ky1Var2.id;
                y68Var.right_table = ky1Var2.getTableName();
                y68Var.right_event_id = ky1Var2.event_id;
                if (z) {
                    y68Var.right_event_name = ky1Var2.page;
                } else {
                    try {
                        Map<String, String> map = ky1Var2.bizMap;
                        if (map != null) {
                            y68Var.right_event_name = map.get(oeh.ARG1);
                        }
                    } catch (Exception unused) {
                    }
                }
                y68Var.right_scene = ky1Var2.scene;
                y68Var.create_time = ky1Var2.updateTime;
                return y68Var.save();
            }
        }
    }

    public static /* synthetic */ void access$000(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a99a7e4", new Object[]{str, map});
        } else {
            g(str, map);
        }
    }

    public static /* synthetic */ void access$100(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b798c3", new Object[]{str, map});
        } else {
            d(str, map);
        }
    }

    public static /* synthetic */ void access$200(String str, Map map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c4eec", new Object[]{str, map, str2});
        } else {
            f(str, map, str2);
        }
    }

    public static /* synthetic */ void access$300(String str, String str2, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a3453d", new Object[]{str, str2, map, new Boolean(z)});
        } else {
            k(str, str2, map, z);
        }
    }

    public static /* synthetic */ void access$400(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a9ac19", new Object[]{str, str2, str3});
        } else {
            e(str, str2, str3);
        }
    }

    public static /* synthetic */ void access$500(String str, String str2, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270edebf", new Object[]{str, str2, map, new Boolean(z)});
        } else {
            i(str, str2, map, z);
        }
    }

    public static /* synthetic */ void access$600(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38da591", new Object[]{str, str2});
        } else {
            q(str, str2);
        }
    }

    public static /* synthetic */ void access$700(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b3dfd", new Object[]{str, map});
        } else {
            l(str, map);
        }
    }

    public static synchronized void b(ky1 ky1Var) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6325bb4", new Object[]{ky1Var});
            } else {
                nhh.f(eqv.TAG, "commitEdgeInPv seqId", Long.valueOf(a(b, ky1Var, false)));
            }
        }
    }

    public static synchronized void c(ky1 ky1Var) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6154bb", new Object[]{ky1Var});
            } else {
                nhh.f(eqv.TAG, "commitEdgeInScroll seqId", Long.valueOf(a(e, ky1Var, false)));
            }
        }
    }

    public static synchronized void commitBeginScroll(Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74ec9e9f", new Object[]{map});
            } else if (map != null) {
                s0v.postRunnable(new a(String.valueOf(System.currentTimeMillis()), map));
            }
        }
    }

    public static synchronized void commitEndScroll(Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5a5a46d", new Object[]{map});
            } else if (map != null) {
                s0v.postRunnable(new b(String.valueOf(System.currentTimeMillis()), map));
            }
        }
    }

    public static synchronized void commitLog(Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36454871", new Object[]{map});
            } else if (map != null) {
                s0v.postRunnable(new h(String.valueOf(System.currentTimeMillis()), map));
            }
        }
    }

    public static synchronized void e(String str, String str2, String str3) {
        String str4;
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0e622e8", new Object[]{str, str2, str3});
                return;
            }
            if (!hsq.f(str2)) {
                str4 = str + "_" + str2.hashCode();
            } else {
                str4 = str;
            }
            ckl cklVar = new ckl();
            cklVar.cold_start_id = gba.cold_start_id;
            cklVar.session_id = gba.session_id;
            cklVar.pv_key = str4;
            cklVar.event_id = "2001";
            cklVar.createTime = str3;
            cklVar.user_id = gba.getUserid();
            cklVar.page = str2;
            cklVar.scene = str2;
            long save = cklVar.save();
            nhh.f(eqv.TAG, "commitEnterNode seqId", Long.valueOf(save));
            if (save > 0) {
                cklVar.id = save;
                b = cklVar;
                f18019a.put(str, cklVar);
            }
        }
    }

    public static synchronized void f(String str, Map<String, String> map, String str2) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ebefd31", new Object[]{str, map, str2});
            } else if (!hsq.f(str)) {
                mto mtoVar = new mto();
                mtoVar.cold_start_id = gba.cold_start_id;
                mtoVar.session_id = gba.session_id;
                mtoVar.event_id = "2701";
                mtoVar.createTime = str2;
                mtoVar.user_id = gba.getUserid();
                mtoVar.page = str;
                mtoVar.scene = str;
                mtoVar.updateBizMap(map);
                long save = mtoVar.save();
                nhh.f(eqv.TAG, "commitEnterSceneNode seqId", Long.valueOf(save));
                if (save > 0) {
                    mtoVar.id = save;
                    d.put(str, mtoVar);
                }
            }
        }
    }

    public static synchronized void h(Object obj, Map<String, String> map, boolean z) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18b23252", new Object[]{obj, map, new Boolean(z)});
            } else if (obj != null && map != null) {
                s0v.postRunnable(new f(String.valueOf(obj.hashCode()), String.valueOf(System.currentTimeMillis()), map, z));
            }
        }
    }

    public static synchronized void j(String str, Map<String, String> map, boolean z) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a191002c", new Object[]{str, map, new Boolean(z)});
            } else if (!TextUtils.isEmpty(str)) {
                s0v.postRunnable(new d(str, String.valueOf(System.currentTimeMillis()), map, z));
            }
        }
    }

    public static synchronized void m(ckl cklVar) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d96a187a", new Object[]{cklVar});
                return;
            }
            n(cklVar);
            o(cklVar);
        }
    }

    public static synchronized void n(ckl cklVar) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5de33225", new Object[]{cklVar});
            } else {
                nhh.f(eqv.TAG, "commitPvEdgeInPv seqId", Long.valueOf(a(c, cklVar, true)));
            }
        }
    }

    public static synchronized void o(ckl cklVar) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97fd200d", new Object[]{cklVar});
                return;
            }
            Map<String, mto> map = d;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, mto> entry : map.entrySet()) {
                    nhh.f(eqv.TAG, "commitPvEdgeInScene seqId", Long.valueOf(a(entry.getValue(), cklVar, true)));
                }
            }
        }
    }

    public static synchronized void p(String str, String str2, Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b7b85c1", new Object[]{str, str2, map});
                return;
            }
            nhh.f(eqv.TAG, "commitPvNodeWindVane");
            ckl cklVar = new ckl();
            cklVar.cold_start_id = gba.cold_start_id;
            cklVar.session_id = gba.session_id;
            cklVar.event_id = str;
            cklVar.createTime = str2;
            cklVar.updateTime = str2;
            cklVar.user_id = gba.getUserid();
            cklVar.page = map.get("PAGE");
            cklVar.updateBizMap(map);
            cklVar.save();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$contextHashCode;
        public final /* synthetic */ String val$pageName;

        public g(String str, String str2) {
            this.val$contextHashCode = str;
            this.val$pageName = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nhh.f(eqv.TAG, "updatePvName contextHashCode", this.val$contextHashCode);
            dqv.access$600(this.val$contextHashCode, this.val$pageName);
        }
    }

    public static synchronized void commitEnter(Object obj, String str) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("816b4a8e", new Object[]{obj, str});
                return;
            }
            nhh.f(eqv.TAG, "commitEnter context", obj, "pageName", str);
            if (obj != null) {
                s0v.postRunnable(new e(String.valueOf(obj.hashCode()), str, String.valueOf(System.currentTimeMillis())));
            }
        }
    }

    public static synchronized void commitEnterScene(String str, Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba6fa689", new Object[]{str, map});
                return;
            }
            nhh.f(eqv.TAG, "commitSceneEnter scene", str, wua.KEY_PROPERTIES, map);
            if (!TextUtils.isEmpty(str)) {
                s0v.postRunnable(new c(str, map, String.valueOf(System.currentTimeMillis())));
            }
        }
    }

    public static synchronized void commitLeave(Object obj, Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d78198c2", new Object[]{obj, map});
                return;
            }
            nhh.f(eqv.TAG, "commitLeave context", obj, "logMap", map);
            h(obj, map, true);
        }
    }

    public static synchronized void commitLeaveScene(String str, Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f04a7a8", new Object[]{str, map});
                return;
            }
            nhh.f(eqv.TAG, "commitLeaveScene scene", str, "logMap", map);
            j(str, map, true);
        }
    }

    public static synchronized void commitUpdateProperties(Object obj, Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62db7a2f", new Object[]{obj, map});
                return;
            }
            nhh.f(eqv.TAG, "commitUpdateProperties context", obj, "logMap", map);
            h(obj, map, false);
        }
    }

    public static synchronized void commitUpdateSceneProperties(String str, Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f767c655", new Object[]{str, map});
                return;
            }
            nhh.f(eqv.TAG, "commitUpdateSceneProperties scene", str, "logMap", map);
            j(str, map, false);
        }
    }

    public static synchronized void d(String str, Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e1e0f01", new Object[]{str, map});
                return;
            }
            if (!(e == null || map == null)) {
                String str2 = map.get("PAGE");
                if (str2 != null && str2.equals(e.page)) {
                    e.updateBizMap(map);
                    myo myoVar = e;
                    myoVar.updateTime = str;
                    nhh.f(eqv.TAG, "update count", Long.valueOf(myoVar.update()));
                    e = null;
                }
            }
        }
    }

    public static synchronized void g(String str, Map<String, String> map) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da4ce1a4", new Object[]{str, map});
                return;
            }
            myo myoVar = new myo();
            myoVar.cold_start_id = gba.cold_start_id;
            myoVar.session_id = gba.session_id;
            myoVar.event_id = String.valueOf(UTEventId.SCROLL.getEventId());
            myoVar.createTime = str;
            myoVar.user_id = gba.getUserid();
            myoVar.page = map.get("PAGE");
            myoVar.updateBizMap(map);
            long save = myoVar.save();
            nhh.f(eqv.TAG, "commitEnterScrollNode seqId", Long.valueOf(save), "tyoe", myoVar.getTableName());
            if (save > 0) {
                myoVar.id = save;
                b(myoVar);
                e = myoVar;
            }
        }
    }

    public static synchronized void i(String str, String str2, Map<String, String> map, boolean z) {
        String str3;
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2eb87ec", new Object[]{str, str2, map, new Boolean(z)});
                return;
            }
            Map<String, ckl> map2 = f18019a;
            ckl cklVar = map2.get(str);
            if (cklVar != null) {
                cklVar.updateBizMap(map);
                if (z) {
                    String str4 = map.get("PAGE");
                    cklVar.page = str4;
                    if (!hsq.f(str4)) {
                        str3 = str + "_" + cklVar.page.hashCode();
                    } else {
                        str3 = str + "_";
                    }
                    cklVar.pv_key = str3;
                    cklVar.updateTime = str2;
                    cklVar.scene = cklVar.page;
                    cklVar.from_scene = map.get(oeh.ARG1);
                }
                nhh.f(eqv.TAG, "update count", Long.valueOf(cklVar.update()));
                if (z) {
                    map2.remove(str);
                    m(cklVar);
                    c = cklVar;
                }
            }
        }
    }

    public static synchronized void k(String str, String str2, Map<String, String> map, boolean z) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8abed8", new Object[]{str, str2, map, new Boolean(z)});
                return;
            }
            Map<String, mto> map2 = d;
            mto mtoVar = map2.get(str);
            if (mtoVar != null) {
                mtoVar.updateBizMap(map);
                if (z) {
                    mtoVar.updateTime = str2;
                }
                nhh.f(eqv.TAG, "update count", Long.valueOf(mtoVar.update()));
                if (z) {
                    map2.remove(str);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7 A[Catch: all -> 0x0019, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x000c, B:10:0x001c, B:14:0x002c, B:16:0x0034, B:18:0x0044, B:23:0x004d, B:25:0x0055, B:27:0x005d, B:29:0x0065, B:32:0x006e, B:33:0x0075, B:34:0x007c, B:39:0x00c7, B:41:0x00cb, B:43:0x00d0), top: B:48:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void l(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dqv.l(java.lang.String, java.util.Map):void");
    }

    public static synchronized void q(String str, String str2) {
        String str3;
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86a45b97", new Object[]{str, str2});
                return;
            }
            if (!hsq.f(str2)) {
                str3 = str + "_" + str2.hashCode();
            } else {
                str3 = str;
            }
            ckl cklVar = f18019a.get(str);
            if (cklVar != null) {
                cklVar.pv_key = str3;
                cklVar.page = str2;
                cklVar.scene = str2;
                nhh.f(eqv.TAG, "updatePvNodeName count", Long.valueOf(cklVar.updatePageName()));
            }
        }
    }

    public static synchronized void updatePvName(Object obj, String str) {
        synchronized (dqv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef33987", new Object[]{obj, str});
                return;
            }
            nhh.f(eqv.TAG, "updatePvName context", obj, "pageName", str);
            if (obj != null && !hsq.f(str)) {
                s0v.postRunnable(new g(String.valueOf(obj.hashCode()), str));
            }
        }
    }
}
