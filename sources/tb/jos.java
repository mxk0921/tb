package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.container.MainScreenCore;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3;
import com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchInfoController;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jos extends oa4 implements TTDetailScrollerLayout.c, MainScreenCore.c, MainScreenCore.b, ntc, ktc<a8n, Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public e f22123a;
    public NavBarHolderV3 b;
    public de7 c;
    public final Context d;
    public final ze7 e;
    public SearchInfoController f;
    public String g;
    public ITBPublicMenu h;
    public int i;
    public float j;
    public float k;
    public ViewGroup l;
    public final bvk m = new a();
    public final bvk n = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
            } else if ((obj2 instanceof Integer) && jos.u(jos.this) != null) {
                if (((Integer) obj2).intValue() != 1) {
                    i = 0;
                }
                jos.u(jos.this).b0(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
            } else if (obj2 instanceof SimpleEntry) {
                SimpleEntry simpleEntry = (SimpleEntry) obj2;
                if (jos.u(jos.this) != null && (simpleEntry.getKey() instanceof Integer) && (simpleEntry.getValue() instanceof Float)) {
                    jos.u(jos.this).m0(((Integer) simpleEntry.getKey()).intValue(), ((Float) simpleEntry.getValue()).floatValue());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements NavBarHolderV3.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6eaaa96", new Object[]{this, new Integer(i)});
            } else {
                jos.v(jos.this).i().f("pageType", Integer.valueOf(i));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f22127a;
        public String b;

        static {
            t2o.a(912262241);
        }
    }

    static {
        t2o.a(912262237);
        t2o.a(912263095);
        t2o.a(912261516);
        t2o.a(912261515);
        t2o.a(912261514);
        t2o.a(912261362);
        t2o.a(912261361);
    }

    public jos(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        this.d = context;
        this.e = ze7Var;
        L(context);
    }

    public static /* synthetic */ Object ipc$super(jos josVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/TTNavBarComponent");
    }

    public static /* synthetic */ NavBarHolderV3 u(jos josVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavBarHolderV3) ipChange.ipc$dispatch("1d275874", new Object[]{josVar});
        }
        return josVar.b;
    }

    public static /* synthetic */ ze7 v(jos josVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("d879812f", new Object[]{josVar});
        }
        return josVar.e;
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        de7 de7Var = this.c;
        if (de7Var == null) {
            return 0;
        }
        return de7Var.getActionBarHeight() + this.c.getElevatorContainerHeight();
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84056082", new Object[]{this});
        }
        jns jnsVar = (jns) this.e.e().e(kns.PARSER_ID);
        if (ywk.g(jnsVar)) {
            return ywk.d(jnsVar);
        }
        return null;
    }

    public final JSONObject C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cd123f75", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        e.d dVar = this.f22123a.f22128a;
        if (dVar != null) {
            jSONObject.put("isReviewPageShow", (Object) Boolean.valueOf(dVar.k));
            jSONObject.put("rateText", (Object) this.f22123a.f22128a.f);
            jSONObject.put("leftBlackPic", (Object) this.f22123a.f22128a.i);
            jSONObject.put("rightBlackPic", (Object) this.f22123a.f22128a.j);
            jSONObject.put("leftPic", (Object) this.f22123a.f22128a.g);
            jSONObject.put("rightPic", (Object) this.f22123a.f22128a.h);
        }
        return jSONObject;
    }

    public Map<String, String> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3a58ff0c", new Object[]{this});
        }
        Resource resource = (Resource) this.e.e().f(Resource.class);
        if (resource == null) {
            return null;
        }
        return resource.getRsExtParams();
    }

    public List<String> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("344fda23", new Object[]{this});
        }
        if (this.f22123a == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<e.c> it = this.f22123a.d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b);
        }
        return arrayList;
    }

    public final JSONObject F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("14b427c8", new Object[]{this});
        }
        Resource resource = (Resource) this.e.e().f(Resource.class);
        if (resource == null) {
            return null;
        }
        return resource.getTopAtmosphere();
    }

    public void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c6b212", new Object[]{this, str});
            return;
        }
        de7 de7Var = this.c;
        if (de7Var != null) {
            de7Var.highlightTab(str);
        }
    }

    public final void H(Context context, e eVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c9577c", new Object[]{this, context, eVar, viewGroup});
            return;
        }
        NavBarHolderV3 navBarHolderV3 = new NavBarHolderV3(context, this.g);
        navBarHolderV3.e0(this.h);
        navBarHolderV3.h0(D());
        navBarHolderV3.d0(B());
        navBarHolderV3.Z(true);
        navBarHolderV3.j0(eVar.b.c);
        navBarHolderV3.c0(new c());
        this.b = navBarHolderV3;
        this.c = (de7) navBarHolderV3.z(context, null);
        I(eVar.b.b);
        this.b.q(viewGroup, false);
        this.b.Y(w(eVar));
        this.b.u(eVar, F());
    }

    public void I(boolean z) {
        ze7 ze7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07751c0", new Object[]{this, new Boolean(z)});
        } else if (this.b != null && (ze7Var = this.e) != null && !ze7Var.e().o() && !TextUtils.isEmpty(this.g)) {
            if (this.f == null) {
                this.f = new SearchInfoController(this.d, Boolean.valueOf(z));
            }
            this.f.e(this.g);
            this.f.g(this.b);
            this.f.h();
        }
    }

    public void J(float f) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22ad3b1", new Object[]{this, new Float(f)});
        } else if (this.l != null) {
            float pow = (float) Math.pow(1.0f - f, 5.0d);
            this.l.setAlpha(pow);
            if (pow < 0.2f) {
                z = false;
            }
            this.l.setClickable(z);
        }
    }

    /* renamed from: K */
    public Integer i(a8n a8nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("88298c59", new Object[]{this, a8nVar});
        }
        return Integer.valueOf(this.c.getActionBarHeight());
    }

    public final void L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712fdbbd", new Object[]{this, context});
            return;
        }
        q84.i(context, o4l.class, this);
        q84.i(context, jw3.class, this);
        q84.h(context, a8n.class, this);
        this.e.i().e("pageType", this.m);
        this.e.i().e("scrollOffset", this.n);
    }

    public final void M(float f) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde5c946", new Object[]{this, new Float(f)});
        } else if (this.c != null) {
            if (nj7.i(this.d)) {
                f = 1.0f;
            }
            this.c.setTransparency(f);
            if (f < 0.2f) {
                z = false;
            }
            a(z);
        }
    }

    public void N(ITBPublicMenu iTBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c9a053", new Object[]{this, iTBPublicMenu});
        } else {
            this.h = iTBPublicMenu;
        }
    }

    public final void P(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4859fcf6", new Object[]{this, context});
            return;
        }
        q84.l(context, o4l.class);
        q84.l(context, jw3.class);
        q84.j(context, a8n.class);
        this.e.i().g("pageType", this.m);
        this.e.i().g("scrollOffset", this.n);
    }

    public void Q(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7cc4b2", new Object[]{this, nb4Var});
            return;
        }
        JSONObject d2 = nb4Var.d();
        if (d2 != null) {
            this.f22123a = e.a(d2);
        }
        this.g = (String) this.e.i().c("requestItemId");
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3afc2314", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.detail.ttdetail.container.MainScreenCore.c
    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10077d90", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        de7 de7Var = this.c;
        if (de7Var != null) {
            this.i = (i - de7Var.getActionBarHeight()) - this.c.getElevatorContainerHeight();
            float f = 1.0f;
            float abs = (Math.abs(i2) * 1.0f) / this.i;
            if (abs <= 0.0f) {
                f = 0.0f;
            } else if (abs < 1.0f) {
                f = abs;
            }
            this.j = f;
            M(f);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.container.MainScreenCore.b
    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebf5d3e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout.c
    public void m(View view, int i, int i2, int i3) {
        int scrollY;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f709b34", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (view instanceof TTDetailScrollerLayout) {
            tgh.b("TTNavBarComponent", "newY:" + i);
            TTDetailScrollerLayout tTDetailScrollerLayout = (TTDetailScrollerLayout) view;
            if (this.c != null && (scrollY = tTDetailScrollerLayout.getScrollY()) > 0) {
                float f = this.j;
                if (f < 1.0f) {
                    float f2 = f + ((scrollY * 1.0f) / this.i);
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (y() < 1.0f || f2 < 1.0f) {
                        M(f2);
                    }
                }
            }
        }
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Context context = this.d;
        if (context != null) {
            P(context);
        }
        NavBarHolderV3 navBarHolderV3 = this.b;
        if (navBarHolderV3 != null) {
            navBarHolderV3.U();
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return null;
    }

    public final List<d> w(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("df2ea626", new Object[]{this, eVar});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<e.c> arrayList2 = eVar.d;
        if (arrayList2 == null) {
            return arrayList;
        }
        Iterator<e.c> it = arrayList2.iterator();
        while (it.hasNext()) {
            e.c next = it.next();
            d dVar = new d();
            dVar.f22127a = next.b;
            dVar.b = next.f22131a;
            arrayList.add(dVar);
        }
        return arrayList;
    }

    public void x(ViewGroup viewGroup) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cd4ec4", new Object[]{this, viewGroup});
            return;
        }
        de7 de7Var = this.c;
        if (de7Var != null) {
            f = de7Var.getTransparency();
        } else {
            f = 0.0f;
        }
        this.l = viewGroup;
        H(this.d, this.f22123a, viewGroup);
        M(f);
    }

    public final float y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40f8fd36", new Object[]{this})).floatValue();
        }
        de7 de7Var = this.c;
        if (de7Var == null) {
            return 0.0f;
        }
        return de7Var.getTransparency();
    }

    public View z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9da9ba24", new Object[]{this});
        }
        NavBarHolderV3 navBarHolderV3 = this.b;
        if (navBarHolderV3 != null) {
            return navBarHolderV3.w();
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public d f22128a;
        public b b;
        public final ArrayList<a> c = new ArrayList<>();
        public final ArrayList<c> d = new ArrayList<>();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f22129a;
            public String b;
            public String c;
            public String d;
            public boolean e;
            public int f;
            public String g;
            public String h;

            static {
                t2o.a(912262243);
            }

            public static a a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("a3c977fd", new Object[]{jSONObject});
                }
                a aVar = new a();
                aVar.f22129a = jSONObject.getString("key");
                aVar.b = jSONObject.getString(TaoliveSearchHotWords.TYPE_HINT);
                aVar.c = jSONObject.getString("icon");
                aVar.d = jSONObject.getString("action");
                aVar.e = jSONObject.getBooleanValue("showBadge");
                aVar.f = jSONObject.getIntValue("badge");
                jSONObject.getString("args");
                aVar.g = jSONObject.getString("url");
                aVar.h = jSONObject.getString("componentId4Fatigue");
                return aVar;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f22130a;
            public boolean b;
            public String c;

            static {
                t2o.a(912262244);
            }

            public static b a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (b) ipChange.ipc$dispatch("dc1cf402", new Object[]{jSONObject});
                }
                b bVar = new b();
                bVar.f22130a = jSONObject.getString("icon");
                jSONObject.getString(TaoliveSearchHotWords.TYPE_HINT);
                bVar.b = jSONObject.getBooleanValue("asyncText");
                bVar.c = jSONObject.getString("action");
                jSONObject.getString("args");
                return bVar;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f22131a;
            public String b;

            static {
                t2o.a(912262245);
            }

            public static c a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (c) ipChange.ipc$dispatch("79c87d37", new Object[]{jSONObject});
                }
                c cVar = new c();
                cVar.f22131a = jSONObject.getString("name");
                cVar.b = jSONObject.getString("targetBizId");
                return cVar;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f22132a;
            public String b;
            public String c;
            public String d;
            public String e;
            public String f;
            public String g;
            public String h;
            public String i;
            public String j;
            public boolean k;

            static {
                t2o.a(912262246);
            }

            public static d a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (d) ipChange.ipc$dispatch("2a17ba94", new Object[]{jSONObject});
                }
                d dVar = new d();
                dVar.f22132a = jSONObject.getString("detail");
                dVar.b = jSONObject.getString("detailColor");
                dVar.c = jSONObject.getString("content");
                dVar.d = jSONObject.getString("shop");
                dVar.e = jSONObject.getString(mop.KEY_APM_SHOP_URL);
                jSONObject.getString("gradientColor");
                dVar.f = jSONObject.getString("rateText");
                dVar.g = jSONObject.getString("leftPic");
                dVar.h = jSONObject.getString("rightPic");
                dVar.i = jSONObject.getString("leftBlackPic");
                dVar.j = jSONObject.getString("rightBlackPic");
                dVar.k = jSONObject.getBooleanValue("isReviewPageShow");
                return dVar;
            }
        }

        static {
            t2o.a(912262242);
        }

        public static e a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("eece6668", new Object[]{jSONObject});
            }
            e eVar = new e();
            JSONObject jSONObject2 = jSONObject.getJSONObject("title");
            if (jSONObject2 != null) {
                eVar.f22128a = d.a(jSONObject2);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("search");
            if (jSONObject3 != null) {
                eVar.b = b.a(jSONObject3);
            }
            JSONArray jSONArray = jSONObject.getJSONArray("right");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    eVar.c.add(a.a(jSONArray.getJSONObject(i)));
                }
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("tabs");
            if (jSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                    eVar.d.add(c.a(jSONArray2.getJSONObject(i2)));
                }
            }
            return eVar;
        }
    }

    @Override // tb.ntc
    public boolean y1(dtc dtcVar) {
        de7 de7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7cc73d0", new Object[]{this, dtcVar})).booleanValue();
        }
        if ((dtcVar instanceof o4l) && (de7Var = this.c) != null) {
            this.k = de7Var.getTransparency();
            this.c.setNavTabsBarVisibility(8);
            this.c.setTransparency(1.0f);
            if (this.b != null) {
                JSONObject C = C();
                o4l o4lVar = (o4l) dtcVar;
                boolean booleanValue = o4lVar.c().booleanValue();
                C.put("pageTitle", (Object) o4lVar.b());
                this.b.k0(C, booleanValue);
            }
            return true;
        } else if (!(dtcVar instanceof jw3) || this.c == null) {
            return false;
        } else {
            NavBarHolderV3 navBarHolderV3 = this.b;
            if (navBarHolderV3 != null) {
                navBarHolderV3.W();
            }
            this.c.setNavTabsBarVisibility(0);
            this.c.setTransparency(this.k);
            return true;
        }
    }
}
