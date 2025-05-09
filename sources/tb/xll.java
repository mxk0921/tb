package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.IPager;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.datasource.CommonLocalManager;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class xll {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public g65 f31458a;
    public JSONArray b;
    public String d;
    public String e;
    public c11 f;
    public JSONObject g;
    public Map<String, String> h;
    public CommonLocalManager j;
    public SearchParamImpl k;
    public CommonSearchResult l;
    public CommonSearchResult m;
    public IPager n;
    public Map<String, ? extends TemplateBean> o;
    public ConcurrentHashMap<String, rpc.c> p;
    public ListStyle q;
    public int r;
    public y5p s;
    public int c = -1;
    public boolean i = true;
    public String t = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792555);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final xll a(g1i g1iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xll) ipChange.ipc$dispatch("81ff6cc6", new Object[]{this, g1iVar});
            }
            ckf.g(g1iVar, "curDatasource");
            xll xllVar = new xll();
            xllVar.y(g1iVar.g0());
            xllVar.w(g1iVar.c0());
            xllVar.N(g1iVar.d0());
            xllVar.x(g1iVar.h());
            xllVar.F(g1iVar.o());
            xllVar.u(g1iVar.i());
            xllVar.z(g1iVar.getExtraStatus());
            xllVar.A(g1iVar.getFallbackTypeMap());
            xllVar.C(g1iVar.isDynamicFallback());
            xllVar.E(g1iVar.m());
            xllVar.I(g1iVar.getCurrentParam());
            xllVar.L((CommonSearchResult) g1iVar.getTotalSearchResult());
            xllVar.D((CommonSearchResult) g1iVar.getLastSearchResult());
            xllVar.G(g1iVar.getPager());
            xllVar.K(g1iVar.getAllTemplates());
            xllVar.J(g1iVar.getTemplateFiles());
            xllVar.M(g1iVar.getUserListStyle());
            xllVar.H(g1iVar.getRequestCount());
            xllVar.B(g1iVar.getFirstRequestPerf());
            xllVar.v(g1iVar.getBundleUrl());
            return xllVar;
        }

        public a() {
        }
    }

    static {
        t2o.a(815792554);
    }

    public final void A(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c672f66", new Object[]{this, map});
        } else {
            this.h = map;
        }
    }

    public final void B(y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28145374", new Object[]{this, y5pVar});
        } else {
            this.s = y5pVar;
        }
    }

    public final void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9b4b79", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final void D(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ca6f3f", new Object[]{this, commonSearchResult});
        } else {
            this.m = commonSearchResult;
        }
    }

    public final void E(CommonLocalManager commonLocalManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e19d27", new Object[]{this, commonLocalManager});
            return;
        }
        ckf.g(commonLocalManager, "<set-?>");
        this.j = commonLocalManager;
    }

    public final void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb87036d", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void G(IPager iPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a0755b", new Object[]{this, iPager});
            return;
        }
        ckf.g(iPager, "<set-?>");
        this.n = iPager;
    }

    public final void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c2ecd4", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public final void I(SearchParamImpl searchParamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca364d6", new Object[]{this, searchParamImpl});
            return;
        }
        ckf.g(searchParamImpl, "<set-?>");
        this.k = searchParamImpl;
    }

    public final void J(ConcurrentHashMap<String, rpc.c> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240e192c", new Object[]{this, concurrentHashMap});
        } else {
            this.p = concurrentHashMap;
        }
    }

    public final void K(Map<String, ? extends TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42b80d", new Object[]{this, map});
        } else {
            this.o = map;
        }
    }

    public final void L(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ff70dd", new Object[]{this, commonSearchResult});
        } else {
            this.l = commonSearchResult;
        }
    }

    public final void M(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da201d86", new Object[]{this, listStyle});
        } else {
            this.q = listStyle;
        }
    }

    public final void N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee1c874", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final c11 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c11) ipChange.ipc$dispatch("af9b1cc6", new Object[]{this});
        }
        return this.f;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7af35be0", new Object[]{this});
        }
        return this.t;
    }

    public final JSONArray c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("e8ec0729", new Object[]{this});
        }
        return this.b;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8818c3f9", new Object[]{this});
        }
        return this.d;
    }

    public final g65 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g65) ipChange.ipc$dispatch("8ae576e8", new Object[]{this});
        }
        g65 g65Var = this.f31458a;
        if (g65Var != null) {
            return g65Var;
        }
        ckf.y("rebuildDSExposureFilterRecord");
        throw null;
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be1028f5", new Object[]{this});
        }
        return this.g;
    }

    public final Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30192028", new Object[]{this});
        }
        return this.h;
    }

    public final y5p h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y5p) ipChange.ipc$dispatch("a81e2dfe", new Object[]{this});
        }
        return this.s;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ff84e4b", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final CommonSearchResult j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonSearchResult) ipChange.ipc$dispatch("2345cb85", new Object[]{this});
        }
        return this.m;
    }

    public final CommonLocalManager k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonLocalManager) ipChange.ipc$dispatch("5355dcc3", new Object[]{this});
        }
        CommonLocalManager commonLocalManager = this.j;
        if (commonLocalManager != null) {
            return commonLocalManager;
        }
        ckf.y("rebuildDSLocalDataManager");
        throw null;
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5148891", new Object[]{this});
        }
        return this.e;
    }

    public final IPager m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPager) ipChange.ipc$dispatch("cf04b7b9", new Object[]{this});
        }
        IPager iPager = this.n;
        if (iPager != null) {
            return iPager;
        }
        ckf.y("rebuildDSPager");
        throw null;
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63422f8e", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public final SearchParamImpl o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchParamImpl) ipChange.ipc$dispatch("1fc05782", new Object[]{this});
        }
        SearchParamImpl searchParamImpl = this.k;
        if (searchParamImpl != null) {
            return searchParamImpl;
        }
        ckf.y("rebuildDSSearchParam");
        throw null;
    }

    public final ConcurrentHashMap<String, rpc.c> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("703dde96", new Object[]{this});
        }
        return this.p;
    }

    public final Map<String, TemplateBean> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b63eda1", new Object[]{this});
        }
        return this.o;
    }

    public final CommonSearchResult r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonSearchResult) ipChange.ipc$dispatch("f75938bf", new Object[]{this});
        }
        return this.l;
    }

    public final ListStyle s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("41bb818", new Object[]{this});
        }
        return this.q;
    }

    public final int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8df13ee", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final void u(c11 c11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fa6574", new Object[]{this, c11Var});
        } else {
            this.f = c11Var;
        }
    }

    public final void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4749db96", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public final void w(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f422a9", new Object[]{this, jSONArray});
        } else {
            this.b = jSONArray;
        }
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a45aa9d", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void y(g65 g65Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46736bfc", new Object[]{this, g65Var});
            return;
        }
        ckf.g(g65Var, "<set-?>");
        this.f31458a = g65Var;
    }

    public final void z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3a002f", new Object[]{this, jSONObject});
        } else {
            this.g = jSONObject;
        }
    }
}
