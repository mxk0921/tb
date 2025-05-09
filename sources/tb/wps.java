package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.adapter.IStorageAdapter;
import com.taobao.android.turbo.model.RedpointModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import tb.f2e;
import tb.mqu;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wps {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f30844a;
    public String b;
    public boolean c;
    public final qpu d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455655);
        }

        public a() {
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("93d21060", new Object[]{this});
            }
            Object a2 = ud0.Companion.f().a("guangguang.bottomtabicon");
            if (a2 instanceof Map) {
                return mqu.Companion.i(((Map) a2).get("serverBottomTabType"), "guangguang");
            }
            return null;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3107eb49", new Object[]{this})).booleanValue();
            }
            String a2 = a();
            return ckf.b(a2, "video") || ckf.b(a2, "minivideo");
        }
    }

    static {
        t2o.a(916455654);
    }

    public wps(qpu qpuVar) {
        ckf.g(qpuVar, "context");
        this.d = qpuVar;
        f();
    }

    public static /* synthetic */ void j(wps wpsVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d034be3d", new Object[]{wpsVar, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        wpsVar.i(z);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937f2e53", new Object[]{this});
            return;
        }
        IStorageAdapter f = ud0.Companion.f();
        HashMap hashMap = new HashMap();
        String str = this.f30844a;
        if (str != null) {
            hashMap.put("clientBottomTabType", str);
            String str2 = this.b;
            if (str2 != null) {
                hashMap.put("serverBottomTabType", str2);
                f.b("guangguang.bottomtabicon", hashMap);
                return;
            }
            ckf.y("serverBottomTabType");
            throw null;
        }
        ckf.y("clientBottomTabType");
        throw null;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12188aa8", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "TabBarItemManager", "clearTabIcon", null, 4, null);
        this.f30844a = "guangguang";
        ((tjb) this.d.getService(tjb.class)).e0(1);
        a();
        j(this, false, 1, null);
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4558dc56", new Object[]{this});
        }
        String str = this.f30844a;
        if (str != null) {
            return str;
        }
        ckf.y("clientBottomTabType");
        throw null;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5339ce", new Object[]{this});
        }
        String str = this.b;
        if (str != null) {
            return str;
        }
        ckf.y("serverBottomTabType");
        throw null;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1a78c0", new Object[]{this});
            return;
        }
        t2c t2cVar = (t2c) this.d.getService(t2c.class);
        if (!t2cVar.J1() && !t2cVar.B1()) {
            String str = this.b;
            if (str == null) {
                ckf.y("serverBottomTabType");
                throw null;
            } else if (!ckf.b("guangguang", str)) {
                if (!t2cVar.t().a()) {
                    g();
                    return;
                } else if (t2cVar.t().d()) {
                    g();
                    return;
                } else {
                    b();
                    return;
                }
            }
        }
        b();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Object a2 = ud0.Companion.f().a("guangguang.bottomtabicon");
        if (a2 instanceof Map) {
            mqu.a aVar = mqu.Companion;
            Map map = (Map) a2;
            String i = aVar.i(map.get("clientBottomTabType"), "guangguang");
            ckf.d(i);
            this.f30844a = i;
            String i2 = aVar.i(map.get("serverBottomTabType"), "guangguang");
            ckf.d(i2);
            this.b = i2;
        } else {
            this.f30844a = "guangguang";
            this.b = "guangguang";
        }
        tpu.a aVar2 = tpu.Companion;
        StringBuilder sb = new StringBuilder("init, clientBottomTabType: ");
        String str = this.f30844a;
        if (str != null) {
            sb.append(str);
            sb.append(", serverBottomTabType: ");
            String str2 = this.b;
            if (str2 != null) {
                sb.append(str2);
                tpu.a.b(aVar2, "TabBarItemManager", sb.toString(), null, 4, null);
                return;
            }
            ckf.y("serverBottomTabType");
            throw null;
        }
        ckf.y("clientBottomTabType");
        throw null;
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ede49", new Object[]{this, str});
            return;
        }
        ckf.g(str, "bottomTabType");
        this.b = str;
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.wps.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "11af5573"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r9
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            java.lang.String r2 = r9.b
            java.lang.String r3 = "serverBottomTabType"
            r4 = 0
            if (r2 == 0) goto L_0x008d
            int r5 = r2.hashCode()
            r6 = -298860649(0xffffffffee2fbf97, float:-1.3597874E28)
            if (r5 == r6) goto L_0x0054
            r6 = 3322092(0x32b0ec, float:4.655242E-39)
            if (r5 == r6) goto L_0x0041
            r6 = 826871428(0x31490e84, float:2.92576E-9)
            if (r5 == r6) goto L_0x002e
            goto L_0x0066
        L_0x002e:
            java.lang.String r5 = "minivideo"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = "uik_nav_minivideo_normal.png"
            java.lang.String r5 = "uik_nav_minivideo_selected.png"
            java.lang.String r6 = "小视频"
            goto L_0x006f
        L_0x0041:
            java.lang.String r5 = "live"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = "uik_nav_live_normal.png"
            java.lang.String r5 = "uik_nav_live_selected.png"
            java.lang.String r6 = "直播"
            goto L_0x006f
        L_0x0054:
            java.lang.String r5 = "guangDoll"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = "uik_nav_guangicon_normal.png"
            java.lang.String r5 = "uik_nav_guangicon_selected.png"
            java.lang.String r6 = "逛逛"
            goto L_0x006f
        L_0x0066:
            java.lang.String r2 = "uik_nav_video_normal.png"
            java.lang.String r5 = "uik_nav_video_selected.png"
            java.lang.String r6 = "视频"
        L_0x006f:
            tb.qpu r7 = r9.d
            java.lang.Class<tb.tjb> r8 = tb.tjb.class
            tb.sod r7 = r7.getService(r8)
            tb.tjb r7 = (tb.tjb) r7
            r7.m1(r1, r5, r2, r6)
            java.lang.String r2 = r9.b
            if (r2 == 0) goto L_0x0089
            r9.f30844a = r2
            r9.a()
            j(r9, r0, r1, r4)
            return
        L_0x0089:
            tb.ckf.y(r3)
            throw r4
        L_0x008d:
            tb.ckf.y(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wps.g():void");
    }

    public final void i(boolean z) {
        Map<String, String> utParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb5aaa5", new Object[]{this, new Boolean(z)});
        } else if (!z || !this.c) {
            this.c = true;
            f2e f2eVar = (f2e) this.d.getService(f2e.class);
            Pair a2 = jpu.a("repairiconexpose", Integer.valueOf(z ? 1 : 0));
            String str = this.f30844a;
            if (str != null) {
                Map t = kotlin.collections.a.t(kotlin.collections.a.j(a2, jpu.a("x_name", str)));
                RedpointModel t1 = ((did) this.d.getService(did.class)).t1();
                if (!(t1 == null || (utParams = t1.getUtParams()) == null)) {
                    t.putAll(utParams);
                }
                String str2 = this.b;
                if (str2 != null) {
                    f2e.a.c(f2eVar, "Page_GuangGuang", "TabIcon", kotlin.collections.a.j(jpu.a("continuation", v3i.f(jpu.a("iconId", str2))), jpu.a("utLogMap", t)), "a2141.1", "tabbar.TabIcon", false, 32, null);
                } else {
                    ckf.y("serverBottomTabType");
                    throw null;
                }
            } else {
                ckf.y("clientBottomTabType");
                throw null;
            }
        }
    }
}
