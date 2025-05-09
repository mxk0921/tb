package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class jht {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String actionGoTo = "goTo";
    public static final String actionShopLoftCollection = "shopLoftCollection";
    public static final String actionShopLoftLike = "shopLoftLike";
    public static final String actionShopLoftShare = "shopLoftShare";
    public static final String actionShowWindVanePop = "showWindVanePop";
    public static final String shopLoft2023StyleBottomNavArea = "shopLoft2023StyleBottomNavArea";

    /* renamed from: a  reason: collision with root package name */
    public String f22002a;
    public Object b;
    public String c;
    public JSONObject d;
    public String e;
    public final HashMap<String, ArrayList<b>> f = new HashMap<>();
    public final HashMap<DXRootView, b> g = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766509291);
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
            t2o.a(766509292);
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5b1d67bd", new Object[]{this});
            }
            return null;
        }

        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4f205c6", new Object[]{this, obj});
            }
        }

        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68cd1688", new Object[]{this, obj});
            }
        }

        public void d(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b87ec801", new Object[]{this, obj});
            }
        }

        public void e(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5eefd1b", new Object[]{this, obj});
            }
        }

        public void f(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdd6020d", new Object[]{this, obj});
            }
        }
    }

    static {
        t2o.a(766509290);
    }

    public final void a(DXRootView dXRootView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c624f37", new Object[]{this, dXRootView, bVar});
            return;
        }
        ckf.g(dXRootView, "dxRootView");
        if (bVar != null) {
            this.g.put(dXRootView, bVar);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599678e0", new Object[]{this});
            return;
        }
        this.f22002a = null;
        this.b = null;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcbc5cae", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.f22002a, "goTo");
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41dcd5d0", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.f22002a, actionShopLoftCollection);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a16bb89", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.f22002a, actionShopLoftLike);
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76f8fee3", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.f22002a, actionShopLoftShare);
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d323b2eb", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.f22002a, actionShowWindVanePop);
    }

    public final void i(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        Map<String, String> T;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ca3511", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(dXRuntimeContext, sj8.PARSER_KEY_DX_RUNTIMECONTEXT);
        b();
        h(objArr);
        b bVar = this.g.get(dXRuntimeContext.L());
        if (bVar != null) {
            ArrayList g = yz3.g(bVar);
            if (this.c != null) {
                try {
                    JSONObject a2 = bVar.a();
                    if (!(a2 == null || (jSONObject = this.d) == null)) {
                        jSONObject.putAll(a2);
                    }
                    String str = this.e;
                    String str2 = this.c;
                    JSONObject jSONObject2 = this.d;
                    Map map = null;
                    if (!(jSONObject2 == null || (T = r54.T(jSONObject2)) == null)) {
                        map = kotlin.collections.a.t(T);
                    }
                    a1v.m(str, str2, map);
                    obj = Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(kotlin.b.a(th));
                }
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                if (th2 != null) {
                    npp.Companion.c("catching block has error", th2);
                }
            }
            if (e()) {
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).d(this.b);
                }
            } else if (f()) {
                Iterator it2 = g.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).e(this.b);
                }
            } else if (d()) {
                Iterator it3 = g.iterator();
                while (it3.hasNext()) {
                    ((b) it3.next()).c(this.b);
                }
            } else if (g()) {
                Iterator it4 = g.iterator();
                while (it4.hasNext()) {
                    ((b) it4.next()).f(this.b);
                }
            } else if (c()) {
                Iterator it5 = g.iterator();
                while (it5.hasNext()) {
                    ((b) it5.next()).b(this.b);
                }
            }
        }
    }

    public final void j(String str, b bVar) {
        ArrayList<b> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5d86ad", new Object[]{this, str, bVar});
            return;
        }
        ckf.g(str, "touchArea");
        if (bVar != null && (arrayList = this.f.get(str)) != null) {
            arrayList.remove(bVar);
        }
    }

    public final void h(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da84f1a", new Object[]{this, objArr});
        } else if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            if (obj != null) {
                String str = (String) obj;
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    this.f22002a = (String) obj2;
                    if (objArr.length >= 3) {
                        this.b = objArr[2];
                    }
                    Object L = ic1.L(objArr, 3);
                    this.c = L == null ? null : L.toString();
                    Object L2 = ic1.L(objArr, 4);
                    if (L2 != null && (L2 instanceof JSONObject)) {
                        this.d = (JSONObject) L2;
                    }
                    Object L3 = ic1.L(objArr, 5);
                    if (L3 != null && (L3 instanceof String)) {
                        this.e = (String) L3;
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
