package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Result;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kht {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String actionFollow = "follow";
    public static final String actionGoBack = "goBack";
    public static final String actionGoTo = "goTo";
    public static final String actionJumpToShopNavi = "jumpToShopNavi";
    public static final String actionOpenBrandZone = "openBrandZone";
    public static final String actionOpenTab3 = "openTab3";
    public static final String actionShare = "more";
    public static final String actionSwitchTabTo = "switchTabTo";
    public static final String bottomBarArea = "bottom_bar";
    public static final String fourTabArea = "four_tab";
    public static final String headerBangDan = "header_bangdan";
    public static final String headerGoodsNavArea = "header_goods_nav";
    public static final String headerIndexNavArea = "header_index_nav";
    public static final String headerIndexVideoShop = "header_tab_index";
    public static final String headerInfoArea = "header_info";
    public static final String headerLoftEntrance = "header_loft_entrance";
    public static final String headerSearchGoodsArea = "header_search_goods";
    public static final String videoShopInfoArea = "video_shop_info";

    /* renamed from: a  reason: collision with root package name */
    public String f22676a;
    public String b;
    public Object c;
    public String d;
    public JSONObject e;
    public String f;
    public b i;
    public boolean j;
    public final HashMap<String, ArrayList<b>> g = new HashMap<>();
    public final HashSet<String> h = new HashSet<>();
    public final HashMap<DXRootView, b> k = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766509470);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509471);
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a493f194", new Object[]{this, obj});
            }
        }

        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f442552", new Object[]{this, obj});
            }
        }

        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74c029e6", new Object[]{this, obj});
            }
        }

        public void d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e61bd08", new Object[]{this, obj});
            }
        }

        public void e(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c552608c", new Object[]{this, obj});
            }
        }

        public void f(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c902b4b", new Object[]{this, obj});
            }
        }

        public void g(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d9e8f42", new Object[]{this, obj});
            }
        }

        public void h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ad35bf", new Object[]{this, obj});
            }
        }
    }

    static {
        t2o.a(766509469);
    }

    public final void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c767c8", new Object[]{this, str, bVar});
            return;
        }
        ckf.g(str, "touchArea");
        if (bVar != null) {
            ArrayList<b> arrayList = this.g.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(bVar);
            this.g.put(str, arrayList);
        }
    }

    public final void b(DXRootView dXRootView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7461aa21", new Object[]{this, dXRootView, bVar});
            return;
        }
        ckf.g(dXRootView, "dxRootView");
        if (bVar != null) {
            this.k.put(dXRootView, bVar);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599678e0", new Object[]{this});
            return;
        }
        this.b = null;
        this.f22676a = null;
        this.c = null;
        this.f = null;
        this.d = null;
        this.e = null;
    }

    public final HashSet<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("1ba52a07", new Object[]{this});
        }
        return this.h;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c7dcbdc", new Object[]{this})).booleanValue();
        }
        return ckf.b("follow", this.b);
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eace131a", new Object[]{this})).booleanValue();
        }
        return ckf.b("goBack", this.b);
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcbc5cae", new Object[]{this})).booleanValue();
        }
        return ckf.b("goTo", this.b);
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6eb57cca", new Object[]{this})).booleanValue();
        }
        return ckf.b("more", this.b);
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75675087", new Object[]{this})).booleanValue();
        }
        return ckf.b(actionSwitchTabTo, this.b);
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dc392fa", new Object[]{this})).booleanValue();
        }
        return ckf.b(actionJumpToShopNavi, this.b);
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bb128aa", new Object[]{this})).booleanValue();
        }
        return ckf.b(actionOpenBrandZone, this.b);
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e537b7d", new Object[]{this})).booleanValue();
        }
        return ckf.b(actionOpenTab3, this.b);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            this.g.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
        c();
    }

    public final void o(ShopDataParser shopDataParser, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        ArrayList<b> arrayList;
        Object obj;
        b bVar;
        DXTemplateItem p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b774925", new Object[]{this, shopDataParser, objArr, dXRuntimeContext});
            return;
        }
        c();
        n(objArr);
        HashSet<String> hashSet = this.h;
        Map map = null;
        if (dXRuntimeContext == null || (p = dXRuntimeContext.p()) == null) {
            str = null;
        } else {
            str = p.f7343a;
        }
        boolean R = i04.R(hashSet, str);
        if (!this.j && !R) {
            arrayList = this.g.get(this.f22676a);
            if (arrayList == null) {
                arrayList = yz3.g(this.i);
            }
        } else if (dXRuntimeContext != null && (bVar = this.k.get(dXRuntimeContext.L())) != null) {
            arrayList = yz3.g(bVar);
        } else {
            return;
        }
        String str2 = this.d;
        JSONObject jSONObject = this.e;
        if (!(str2 == null || shopDataParser == null)) {
            if (jSONObject != null) {
                try {
                    Map<String, String> T = r54.T(jSONObject);
                    if (T != null) {
                        map = kotlin.collections.a.t(T);
                    }
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(kotlin.b.a(th));
                }
            }
            a1v.b(shopDataParser, str2, map, this.f);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
        }
        if (f()) {
            for (b bVar2 : arrayList) {
                if (bVar2 != null) {
                    bVar2.b(this.c);
                }
            }
        } else if (g()) {
            for (b bVar3 : arrayList) {
                if (bVar3 != null) {
                    bVar3.c(this.c);
                }
            }
        } else if (i()) {
            for (b bVar4 : arrayList) {
                if (bVar4 != null) {
                    bVar4.h(this.c);
                }
            }
        } else if (e()) {
            for (b bVar5 : arrayList) {
                if (bVar5 != null) {
                    bVar5.a(this.c);
                }
            }
        } else if (h()) {
            for (b bVar6 : arrayList) {
                if (bVar6 != null) {
                    bVar6.g(this.c);
                }
            }
        } else if (k()) {
            for (b bVar7 : arrayList) {
                if (bVar7 != null) {
                    bVar7.e(this.c);
                }
            }
        } else if (j()) {
            for (b bVar8 : arrayList) {
                if (bVar8 != null) {
                    bVar8.d(this.c);
                }
            }
        } else if (l()) {
            for (b bVar9 : arrayList) {
                if (bVar9 != null) {
                    bVar9.f(this.c);
                }
            }
        }
    }

    public final void p(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f7803e", new Object[]{this, bVar});
        } else {
            this.i = bVar;
        }
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96191359", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void n(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da84f1a", new Object[]{this, objArr});
        } else if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            if (obj != null) {
                this.f22676a = (String) obj;
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    this.b = (String) obj2;
                    if (objArr.length >= 3) {
                        this.c = objArr[2];
                    }
                    Object L = ic1.L(objArr, 3);
                    this.d = L == null ? null : L.toString();
                    Object L2 = ic1.L(objArr, 4);
                    if (L2 != null && (L2 instanceof JSONObject)) {
                        this.e = (JSONObject) L2;
                    }
                    Object L3 = ic1.L(objArr, 5);
                    if (L3 != null && (L3 instanceof String)) {
                        this.f = (String) L3;
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }
}
