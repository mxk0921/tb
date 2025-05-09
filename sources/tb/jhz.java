package tb;

import android.content.Context;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.NCBusinessContext;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.func_vm.expr.NCExprException;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import com.taobao.weex.common.Constants;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import tb.hhz;
import tb.iiz;
import tb.jhz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<n7z> f22003a;
    public final List<d0z> b;
    public final List<String> c;
    public final AbilityHubAdapter d;
    public final zgz e;
    public final ctz f;
    public final g1a<bgz<hhz>, xhv> g;
    public final g1a<bgz<hhz>, xhv> h;
    public final Map<String, Object> i;
    public final WeakReference<Context> j;
    public final o9z k;
    public final dhz l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737315);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static /* synthetic */ jhz b(a aVar, List list, List list2, List list3, AbilityHubAdapter abilityHubAdapter, zgz zgzVar, ctz ctzVar, g1a g1aVar, g1a g1aVar2, Map map, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jhz) ipChange.ipc$dispatch("b16a90b", new Object[]{aVar, list, list2, list3, abilityHubAdapter, zgzVar, ctzVar, g1aVar, g1aVar2, map, new Integer(i), obj});
            }
            return aVar.a(list, list2, list3, abilityHubAdapter, zgzVar, ctzVar, (i & 64) != 0 ? null : g1aVar, (i & 128) != 0 ? null : g1aVar2, map);
        }

        public final jhz c(waz wazVar) {
            NCBusinessContext a2;
            NCBusinessContext a3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jhz) ipChange.ipc$dispatch("4bc10c31", new Object[]{this, wazVar});
            }
            ckf.g(wazVar, "layoutNode");
            OriginNode p = wazVar.p();
            List<n7z> o = p.o();
            List<String> j = p.j();
            List<d0z> m = p.m();
            RenderContext t = wazVar.t();
            AbilityHubAdapter e = (t == null || (a3 = t.a()) == null) ? null : a3.e();
            RenderContext t2 = wazVar.t();
            zgz d = (t2 == null || (a2 = t2.a()) == null) ? null : a2.d();
            if (d != null) {
                ctz a4 = ctz.Companion.a();
                a4.b(wazVar.u().d());
                return b(this, o, m, j, e, d, a4, null, null, wazVar.t().e(), tck.DETECT_WIDTH, null);
            }
            throw new NCExprException("获取不到对应的exprFuncOwner");
        }

        public a() {
        }

        public final jhz d(OriginNode originNode, ctz ctzVar, RenderContext renderContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jhz) ipChange.ipc$dispatch("dcfdc36d", new Object[]{this, originNode, ctzVar, renderContext});
            }
            ckf.g(originNode, "originNode");
            ckf.g(ctzVar, "variableRegion");
            ckf.g(renderContext, "renderContext");
            return b(this, originNode.o(), originNode.m(), originNode.j(), null, renderContext.a().d(), ctzVar, null, null, renderContext.e(), tck.DETECT_WIDTH, null);
        }

        public final jhz a(List<n7z> list, List<d0z> list2, List<String> list3, AbilityHubAdapter abilityHubAdapter, zgz zgzVar, ctz ctzVar, g1a<? super bgz<hhz>, xhv> g1aVar, g1a<? super bgz<hhz>, xhv> g1aVar2, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jhz) ipChange.ipc$dispatch("3822176a", new Object[]{this, list, list2, list3, abilityHubAdapter, zgzVar, ctzVar, g1aVar, g1aVar2, map});
            }
            ckf.g(list2, "exprGroupList");
            ckf.g(zgzVar, "exprFuncOwner");
            ckf.g(ctzVar, "variableRegion");
            return new jhz(list, list2, list3, abilityHubAdapter, zgzVar, ctzVar, null, g1aVar, g1aVar2, map, 64, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements o9z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static final hhz d(bhz bhzVar, hhz[] hhzVarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("29901107", new Object[]{bhzVar, hhzVarArr});
            }
            ckf.g(bhzVar, Constants.Name.SCOPE);
            ckf.g(hhzVarArr, "params");
            return hhz.Companion.d(50);
        }

        public static final hhz e(bhz bhzVar, hhz[] hhzVarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz) ipChange.ipc$dispatch("6e191d66", new Object[]{bhzVar, hhzVarArr});
            }
            ckf.g(bhzVar, Constants.Name.SCOPE);
            ckf.g(hhzVarArr, "params");
            return hhz.Companion.d(50);
        }

        @Override // tb.o9z
        public hhz.e a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hhz.e) ipChange.ipc$dispatch("87d9b8b9", new Object[]{this, str});
            }
            iiz.a aVar = iiz.Companion;
            aVar.j(ckf.p("getFuncByName ", str));
            if ("getEngineStorage".equals(str)) {
                return new hhz.e(new xgz() { // from class: tb.khz
                    @Override // tb.xgz
                    public final hhz a(bhz bhzVar, hhz[] hhzVarArr) {
                        hhz d;
                        d = jhz.b.d(bhzVar, hhzVarArr);
                        return d;
                    }
                });
            }
            if ("tsShowLog".equals(str)) {
                aVar.j("tsShowLog的事件触发");
                return new hhz.e(new xgz() { // from class: tb.lhz
                    @Override // tb.xgz
                    public final hhz a(bhz bhzVar, hhz[] hhzVarArr) {
                        hhz e;
                        e = jhz.b.e(bhzVar, hhzVarArr);
                        return e;
                    }
                });
            }
            throw new NotImplementedError("An operation is not implemented: getFuncByName 待实现");
        }
    }

    static {
        t2o.a(598737314);
        t2o.a(598737310);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jhz(List<n7z> list, List<d0z> list2, List<String> list3, AbilityHubAdapter abilityHubAdapter, zgz zgzVar, ctz ctzVar, Context context, g1a<? super bgz<hhz>, xhv> g1aVar, g1a<? super bgz<hhz>, xhv> g1aVar2, Map<String, ? extends Object> map) {
        ckf.g(list2, "exprGroupList");
        ckf.g(zgzVar, "exprFuncOwner");
        ckf.g(ctzVar, "variableRegion");
        this.f22003a = list;
        this.b = list2;
        this.c = list3;
        this.d = abilityHubAdapter;
        this.e = zgzVar;
        this.f = ctzVar;
        this.g = g1aVar;
        this.h = g1aVar2;
        this.i = map;
        this.j = new WeakReference<>(context);
        this.k = new b();
        this.l = new dhz();
    }

    public final Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5abef59", new Object[]{this});
        }
        return this.j.get();
    }

    public String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4adcb34", new Object[]{this, new Integer(i)});
        }
        List<String> list = this.c;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    public final Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.i;
    }

    public xgz d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xgz) ipChange.ipc$dispatch("5110b116", new Object[]{this, new Integer(i)});
        }
        return this.e.c(i);
    }

    public d0z e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d0z) ipChange.ipc$dispatch("b72507a0", new Object[]{this, new Integer(i)});
        }
        return this.b.get(i);
    }

    public final List<d0z> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef8e280e", new Object[]{this});
        }
        return this.b;
    }

    public n7z g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n7z) ipChange.ipc$dispatch("3487ff95", new Object[]{this, new Integer(i)});
        }
        List<n7z> list = this.f22003a;
        n7z n7zVar = list == null ? null : list.get(i);
        if (n7zVar != null) {
            return n7zVar;
        }
        throw new NCExprException(ckf.p("获取不到对应的内部函数 ", Integer.valueOf(i)));
    }

    public final AbilityHubAdapter h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("5cd61ff8", new Object[]{this});
        }
        return this.d;
    }

    public final dhz i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhz) ipChange.ipc$dispatch("1360b6a5", new Object[]{this});
        }
        return this.l;
    }

    public final o9z j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o9z) ipChange.ipc$dispatch("f846a4b7", new Object[]{this});
        }
        return this.k;
    }

    public final g1a<bgz<hhz>, xhv> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("ba4ba939", new Object[]{this});
        }
        return this.g;
    }

    public final g1a<bgz<hhz>, xhv> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("a9224416", new Object[]{this});
        }
        return this.h;
    }

    public void m(List<? extends hhz> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b33c5d", new Object[]{this, list});
            return;
        }
        ckf.g(list, "list");
        this.f.b(list);
    }

    public final hhz n(n7z n7zVar, hhz[] hhzVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("3460e1b0", new Object[]{this, n7zVar, hhzVarArr});
        }
        ckf.g(n7zVar, "funcInfo");
        return mhz.INSTANCE.c(n7zVar, hhzVarArr, Companion.a(this.f22003a, this.b, this.c, this.d, this.e, ctz.Companion.a(), this.g, this.h, this.i));
    }

    public hhz o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("5ca98191", new Object[]{this, new Integer(i)});
        }
        hhz c = this.f.c(i);
        if (c == null) {
            throw new NCExprException(ckf.p("获取不到对应的变量 ", Integer.valueOf(i)));
        } else if (!c.v()) {
            return c;
        } else {
            bgz<hhz> o = c.o();
            ckf.d(o);
            return o.a();
        }
    }

    public void p(int i, hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("453fdf70", new Object[]{this, new Integer(i), hhzVar});
            return;
        }
        ckf.g(hhzVar, "value");
        if (i >= this.f.e()) {
            this.f.a(hhzVar);
            return;
        }
        hhz c = this.f.c(i);
        if (c != null) {
            c.G(hhzVar);
        }
    }

    public /* synthetic */ jhz(List list, List list2, List list3, AbilityHubAdapter abilityHubAdapter, zgz zgzVar, ctz ctzVar, Context context, g1a g1aVar, g1a g1aVar2, Map map, int i, a07 a07Var) {
        this(list, list2, (i & 4) != 0 ? null : list3, abilityHubAdapter, zgzVar, ctzVar, (i & 64) != 0 ? null : context, (i & 128) != 0 ? null : g1aVar, (i & 256) != 0 ? null : g1aVar2, map);
    }
}
