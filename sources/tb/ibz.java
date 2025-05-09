package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.homepage.LocationShopInfo;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ibz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SWITCH_AREA_ICON = "switchAreaIcon";
    public static final String KEY_SWITCH_AREA_POP = "switchAreaPop";

    /* renamed from: a  reason: collision with root package name */
    public volatile gbz f21221a = new gbz();
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    public final h9z e;
    public final r1c f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f21222a;

        public a(JSONObject jSONObject) {
            this.f21222a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f21222a == null) {
                sfh.d("LocationMergeDataProcessor", "refreshData data is null ");
            } else {
                ibz.a(ibz.this).e = ibz.this.j(this.f21222a);
                try {
                    ibz ibzVar = ibz.this;
                    ibz.b(ibzVar, ibz.a(ibzVar).e);
                } catch (Throwable th) {
                    th.printStackTrace();
                    sfh.d("LocationMergeDataProcessor", "processData error " + Log.getStackTraceString(th));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f21223a;

        public b(JSONObject jSONObject) {
            this.f21223a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ibz.c(ibz.this).p(h9z.EVENT_ON_REFRESH_LOCATION, this.f21223a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ibz.d(ibz.this);
            }
        }
    }

    static {
        t2o.a(729809545);
    }

    public ibz(h9z h9zVar) {
        d dVar = new d();
        this.e = h9zVar;
        IHomeEditionSwitchService iHomeEditionSwitchService = (IHomeEditionSwitchService) c4b.i().h(IHomeEditionSwitchService.class);
        if (iHomeEditionSwitchService != null) {
            iHomeEditionSwitchService.addEditionSwitchListener(dVar);
        } else {
            sfh.d("LocationMergeDataProcessor", "editionSwitchService is null ");
        }
    }

    public static /* synthetic */ gbz a(ibz ibzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbz) ipChange.ipc$dispatch("bc2d9527", new Object[]{ibzVar});
        }
        return ibzVar.f21221a;
    }

    public static /* synthetic */ void b(ibz ibzVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9ceebd", new Object[]{ibzVar, jSONObject});
        } else {
            ibzVar.k(jSONObject);
        }
    }

    public static /* synthetic */ h9z c(ibz ibzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9z) ipChange.ipc$dispatch("b0efc1ed", new Object[]{ibzVar});
        }
        return ibzVar.e;
    }

    public static /* synthetic */ void d(ibz ibzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7315ab51", new Object[]{ibzVar});
        } else {
            ibzVar.F();
        }
    }

    public static /* synthetic */ boolean e(ibz ibzVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86202caa", new Object[]{ibzVar, new Boolean(z)})).booleanValue();
        }
        ibzVar.d = z;
        return z;
    }

    public static /* synthetic */ boolean f(ibz ibzVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16f10cc5", new Object[]{ibzVar, jSONObject})).booleanValue();
        }
        return ibzVar.v(jSONObject);
    }

    public static /* synthetic */ void g(ibz ibzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbec6e", new Object[]{ibzVar});
        } else {
            ibzVar.E();
        }
    }

    public static /* synthetic */ void h(ibz ibzVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9b1bc3", new Object[]{ibzVar, jSONObject});
        } else {
            ibzVar.z(jSONObject);
        }
    }

    public final void A(JSONObject jSONObject, gbz gbzVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d21686", new Object[]{this, jSONObject, gbzVar});
            return;
        }
        PositionInfo f = o78.f(Globals.getApplication());
        PositionInfo i = o78.i(Globals.getApplication());
        if (f != null && i != null) {
            LocationShopInfo f2 = x78.f(f.countryCode);
            JSONObject jSONObject3 = new JSONObject();
            if (f2 != null) {
                jSONObject3.put("countryName", (Object) f2.countryName);
                jSONObject3.put("countryCode", (Object) f.countryCode);
                jSONObject3.put("shoppingInfo", (Object) f2.shopInfo);
                jSONObject3.put("shoppingInfoTextColor", (Object) f2.shopInfoTextColor);
            } else {
                jSONObject3.put("countryName", (Object) "全球站");
                jSONObject3.put("countryCode", (Object) "GLOBAL");
                jSONObject3.put("shoppingInfo", (Object) "享直邮到家");
            }
            gbzVar.getClass();
            JSONObject p = p(jSONObject);
            if (p != null && (jSONObject2 = p.getJSONObject("item")) != null) {
                jSONObject2.put("content", (Object) jSONObject3);
                gbzVar.g = p;
            }
        }
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53a955f9", new Object[]{this})).booleanValue();
        }
        return this.f21221a.f19884a & this.f21221a.b;
    }

    public final void C(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5835da", new Object[]{this, jSONObject});
            return;
        }
        sfh.d("LocationMergeDataProcessor", "refreshUi  show left icon ");
        y(new b(jSONObject));
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab4bb59", new Object[]{this});
            return;
        }
        this.d = true;
        this.f21221a.c = false;
        y(new c());
    }

    public final void G(JSONObject jSONObject, jbz jbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f194da", new Object[]{this, jSONObject, jbzVar});
        } else {
            kbz.d(q(jSONObject), jbzVar);
        }
    }

    public JSONObject j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ea311088", new Object[]{this, jSONObject});
        }
        return JSON.parseObject(jSONObject.toJSONString());
    }

    public final List<String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d0729f88", new Object[]{this});
        }
        return x78.e();
    }

    public final JSONObject m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c78b4102", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject(KEY_SWITCH_AREA_ICON);
    }

    public gbz n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbz) ipChange.ipc$dispatch("1b9f63d", new Object[]{this});
        }
        return this.f21221a;
    }

    public final jbz o(JSONObject jSONObject) {
        int i;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jbz) ipChange.ipc$dispatch("1710fe40", new Object[]{this, jSONObject});
        }
        jbz jbzVar = new jbz();
        String c2 = kbz.c();
        if (TextUtils.isEmpty(c2)) {
            s(jbzVar);
        } else {
            JSONObject parseObject = JSON.parseObject(c2);
            long longValue = parseObject.getLong("lastShowTime").longValue();
            int intValue = parseObject.getIntValue("count");
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
                int intValue2 = jSONObject2.getIntValue("fatigueCount");
                if (System.currentTimeMillis() - longValue < jSONObject2.getIntValue("fatigueDay") * wu2.DAY) {
                    if (intValue < intValue2) {
                        z2 = true;
                    }
                    i = 1 + intValue;
                    z = z2;
                } else {
                    longValue = System.currentTimeMillis();
                    i = 1;
                }
                jbzVar.c = z;
                jbzVar.b = i;
                jbzVar.f21908a = longValue;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (!jbzVar.c) {
            sfh.d("LocationMergeDataProcessor", "icon 疲劳度过滤 ");
        }
        return jbzVar;
    }

    public final JSONObject p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b061125", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject(KEY_SWITCH_AREA_POP);
    }

    public final long q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("875ed4ae", new Object[]{this, jSONObject})).longValue();
        }
        try {
            return p(jSONObject).getJSONObject("ext").getIntValue("fatigueDay") * wu2.DAY;
        } catch (Throwable th) {
            th.printStackTrace();
            return Long.MAX_VALUE;
        }
    }

    public final List<String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b4995132", new Object[]{this});
        }
        return x78.g();
    }

    public final void s(jbz jbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb91f5ee", new Object[]{this, jbzVar});
            return;
        }
        jbzVar.f21908a = System.currentTimeMillis();
        jbzVar.b = 1;
        jbzVar.c = true;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4af4f133", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8adfea2", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void w(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbacffc", new Object[]{this, jSONObject});
            return;
        }
        this.f21221a.b = true;
        this.f21221a.d = new JSONObject(jSONObject);
        z(this.f21221a.d);
    }

    public final void x(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e657dab8", new Object[]{this, runnable});
        } else {
            m5a.a().c().post(runnable);
        }
    }

    public final void y(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92b6643", new Object[]{this, runnable});
        } else {
            m5a.a().i(runnable);
        }
    }

    public final void z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e96030", new Object[]{this, jSONObject});
        } else if (B()) {
            x(new a(jSONObject));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements r1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.r1c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d6c3", new Object[]{this});
                return;
            }
            sfh.d("LocationMergeDataProcessor", " onEditionCodeChange ");
            ibz.e(ibz.this, false);
        }

        @Override // tb.r1c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df1a0e0b", new Object[]{this});
                return;
            }
            sfh.d("LocationMergeDataProcessor", " onLocationChange ");
            if (kbz.e() && kbq.h(Globals.getApplication())) {
                if (ibz.a(ibz.this).b) {
                    ibz ibzVar = ibz.this;
                    if (!ibz.f(ibzVar, ibz.a(ibzVar).d)) {
                        ibz.g(ibz.this);
                        return;
                    }
                }
                ibz.a(ibz.this).c = true;
            }
        }

        @Override // tb.r1c
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1212958d", new Object[]{this, new Boolean(z)});
                return;
            }
            sfh.d("LocationMergeDataProcessor", "onLocationRequestEnd " + z);
            if (z) {
                ibz.a(ibz.this).f19884a = true;
                ibz ibzVar = ibz.this;
                ibz.h(ibzVar, ibz.a(ibzVar).d);
            }
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8150684", new Object[]{this});
            return;
        }
        sfh.d("LocationMergeDataProcessor", "revertIcon ");
        this.b = false;
        this.e.p(h9z.EVENT_ON_REFRESH_LOCATION, null);
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a544aeee", new Object[]{this});
        } else if (Localization.o()) {
            sfh.d("LocationMergeDataProcessor", "海外站点非中文场景不出切站弹窗");
        } else {
            z6d c2 = h2b.a().c();
            if (c2 != null) {
                uza.c(c2, 0, null);
                sfh.d("LocationMergeDataProcessor", "show  old dialog");
            }
        }
    }

    public final boolean v(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2587f8c2", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null) {
            return false;
        }
        if (jSONObject2.containsKey("supportSwitchArea")) {
            return jSONObject2.getBoolean("supportSwitchArea").booleanValue();
        }
        sfh.d("LocationMergeDataProcessor", "isSupportSwitchAreaPop false ");
        return false;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd995af8", new Object[]{this})).booleanValue();
        }
        PositionInfo f = o78.f(Globals.getApplication());
        PositionInfo i = o78.i(Globals.getApplication());
        if (f == null || i == null || TextUtils.equals(f.countryCode, i.countryCode)) {
            sfh.d("LocationMergeDataProcessor", "站点一致 ");
            return false;
        }
        List<String> r = r();
        List<String> l = l();
        if (r == null || r.size() <= 0) {
            if (l == null || !l.contains(f.countryCode)) {
                return true;
            }
            sfh.d("LocationMergeDataProcessor", "黑明单过滤 " + f.countryCode);
            return false;
        } else if (r.contains(f.countryCode)) {
            return true;
        } else {
            sfh.d("LocationMergeDataProcessor", "白名单过滤 " + f.countryCode);
            return false;
        }
    }

    public final void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7383cedb", new Object[]{this, jSONObject});
        } else if (!kbz.e()) {
            sfh.d("LocationMergeDataProcessor", "总开关关闭 ");
        } else if (!Localization.o() || kbq.h(Globals.getApplication())) {
            boolean i = i();
            boolean v = v(jSONObject);
            if (i) {
                JSONObject m = m(jSONObject);
                boolean z = m != null;
                if (v) {
                    this.f21221a.c = false;
                }
                if (z) {
                    jbz o = o(m);
                    if (o.c) {
                        G(jSONObject, o);
                        if (this.d) {
                            o.d = false;
                            this.d = false;
                        }
                        if (!v || !o.d) {
                            this.c = false;
                        } else {
                            A(jSONObject, this.f21221a);
                            this.c = true;
                        }
                        if (!o.d) {
                            sfh.d("LocationMergeDataProcessor", "icon pop 疲劳度过滤 ");
                        }
                        this.f21221a.f = m(jSONObject);
                        this.b = true;
                        C(this.f21221a.f);
                        kbz.b(o);
                    } else {
                        sfh.d("LocationMergeDataProcessor", "icon 疲劳度过滤 ");
                        D();
                    }
                } else {
                    sfh.d("LocationMergeDataProcessor", "switchAreaIcon is null ");
                    D();
                }
            } else if (this.b) {
                sfh.d("LocationMergeDataProcessor", "refreshUi  location is not change  ");
                D();
            }
            if (!v && this.f21221a.c) {
                sfh.d("LocationMergeDataProcessor", "is not SupportNewPop");
                E();
            }
        } else {
            sfh.d("LocationMergeDataProcessor", "多语言环境过滤");
        }
    }
}
