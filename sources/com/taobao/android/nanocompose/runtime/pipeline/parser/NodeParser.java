package com.taobao.android.nanocompose.runtime.pipeline.parser;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bgz;
import tb.ciz;
import tb.ckf;
import tb.ctz;
import tb.d0z;
import tb.dun;
import tb.fjz;
import tb.gjz;
import tb.hhz;
import tb.i04;
import tb.i2z;
import tb.iiz;
import tb.j6z;
import tb.jhz;
import tb.l2z;
import tb.lfz;
import tb.mhz;
import tb.n7z;
import tb.njz;
import tb.ns3;
import tb.olz;
import tb.qfz;
import tb.t2o;
import tb.waz;
import tb.y5z;
import tb.z5z;
import tb.zgz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NodeParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final NodeParser INSTANCE = new NodeParser();

    static {
        t2o.a(598737450);
    }

    public static final /* synthetic */ void a(NodeParser nodeParser, WeakReference weakReference, bgz bgzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe8e751", new Object[]{nodeParser, weakReference, bgzVar});
        } else {
            nodeParser.m(weakReference, bgzVar);
        }
    }

    public static final /* synthetic */ void b(NodeParser nodeParser, Parsing parsing, waz wazVar, RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c61a4ee", new Object[]{nodeParser, parsing, wazVar, renderContext});
        } else {
            nodeParser.n(parsing, wazVar, renderContext);
        }
    }

    public static /* synthetic */ jhz g(NodeParser nodeParser, OriginNode originNode, zgz zgzVar, njz njzVar, boolean z, RenderContext renderContext, int i, Object obj) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhz) ipChange.ipc$dispatch("ee7d3dc8", new Object[]{nodeParser, originNode, zgzVar, njzVar, new Boolean(z), renderContext, new Integer(i), obj});
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        return nodeParser.f(originNode, zgzVar, njzVar, z2, renderContext);
    }

    public final waz c(OriginNode originNode, RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waz) ipChange.ipc$dispatch("5116ce7c", new Object[]{this, originNode, renderContext});
        }
        ckf.g(originNode, "rootOriginNode");
        ckf.g(renderContext, "renderContext");
        return d(null, originNode, renderContext, null);
    }

    public final jhz e(OriginNode originNode, ctz ctzVar, RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhz) ipChange.ipc$dispatch("dcfdc36d", new Object[]{this, originNode, ctzVar, renderContext});
        }
        return jhz.Companion.d(originNode, ctzVar, renderContext);
    }

    public final olz h(Parsing parsing, waz wazVar, RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (olz) ipChange.ipc$dispatch("7b47915a", new Object[]{this, parsing, wazVar, renderContext});
        }
        ckf.g(parsing, "parsing");
        ckf.g(wazVar, "layoutNode");
        ckf.g(renderContext, "renderContext");
        olz a2 = olz.Companion.a(parsing);
        a2.c(new NodeParser$createReparseScope$1(parsing, wazVar, renderContext));
        return a2;
    }

    public final void i(waz wazVar, RenderContext renderContext, njz njzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75bb4d3c", new Object[]{this, wazVar, renderContext, njzVar});
            return;
        }
        OriginNode p = wazVar.p();
        if (p != null) {
            jhz g = g(this, p, renderContext.a().d(), njzVar, false, renderContext, 8, null);
            if (gjz.e(p.u(), gjz.Companion.c())) {
                iiz.Companion.j("根节点，计算一次变量区");
                mhz.INSTANCE.b(p.h(), g);
            }
            njzVar.b().push(INSTANCE.h(njzVar.d(), wazVar, renderContext));
            j(wazVar, renderContext, g);
            Stack<olz> b = njzVar.b();
            if (b != null) {
                b.pop();
            }
            wazVar.h().D(renderContext, njzVar);
        }
    }

    public final void j(waz wazVar, RenderContext renderContext, jhz jhzVar) {
        i2z i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a825bd3", new Object[]{this, wazVar, renderContext, jhzVar});
            return;
        }
        OriginNode p = wazVar.p();
        if (p != null) {
            if (!p.l().isEmpty()) {
                for (z5z z5zVar : p.l()) {
                    hhz b = mhz.INSTANCE.b(z5zVar.a(), jhzVar);
                    if (b instanceof hhz.g) {
                        wazVar.Q(z5zVar.b(), ((hhz.g) b).J());
                    } else if (b instanceof hhz.i) {
                        wazVar.R(z5zVar.b(), ((hhz.i) b).J());
                    } else if (b instanceof hhz.d) {
                        wazVar.O(z5zVar.b(), ((hhz.d) b).J());
                    } else if (b instanceof hhz.f) {
                        wazVar.P(z5zVar.b(), ((hhz.f) b).J());
                    } else if (b instanceof hhz.b) {
                        wazVar.U(z5zVar.b(), ((hhz.b) b).M());
                    } else if (b instanceof hhz.m) {
                        wazVar.T(z5zVar.b(), ((hhz.m) b).J());
                    } else if (b instanceof hhz.a) {
                        wazVar.S(z5zVar.b(), b);
                    } else {
                        ckf.d(b);
                        throw new RuntimeException(ckf.p("Unsupported dynamic property type: ", ((ns3) dun.b(b.getClass())).getSimpleName()));
                    }
                }
            }
            List<lfz> E0 = i04.E0(p.t());
            Integer p2 = p.p();
            if (p2 != null) {
                hhz b2 = mhz.INSTANCE.b(p2.intValue(), jhzVar);
                if (b2 instanceof hhz.k) {
                    ((ArrayList) E0).addAll(((hhz.k) b2).M());
                } else {
                    ckf.d(b2);
                    throw new RuntimeException(ckf.p("Modifier expr return value is not Modifier: ", ((ns3) dun.b(b2.getClass())).getSimpleName()));
                }
            }
            if (!p.k().isEmpty()) {
                for (y5z y5zVar : p.k()) {
                    int a2 = y5zVar.a();
                    List<Object> b3 = y5zVar.b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : b3) {
                        if (obj instanceof j6z) {
                            arrayList.addAll(mhz.INSTANCE.b(((j6z) obj).a(), jhzVar).g());
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    lfz a3 = qfz.INSTANCE.a(a2, arrayList);
                    if (a3 != null) {
                        ((ArrayList) E0).add(0, a3);
                    }
                }
            }
            wazVar.J(E0);
            if (!p.v() && (i = p.i()) != null) {
                i.e(wazVar);
            }
            wazVar.N();
        }
    }

    public final void k(waz wazVar, RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b907211", new Object[]{this, wazVar, renderContext});
            return;
        }
        ckf.g(wazVar, "rootLayoutNode");
        ckf.g(renderContext, "renderContext");
        l(null, wazVar, renderContext, null);
    }

    public final boolean l(waz wazVar, waz wazVar2, RenderContext renderContext, njz njzVar) {
        ctz ctzVar;
        i2z i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81b0ae4", new Object[]{this, wazVar, wazVar2, renderContext, njzVar})).booleanValue();
        }
        wazVar2.V(renderContext);
        if (!wazVar2.z() && (i = wazVar2.p().i()) != null) {
            i.e(wazVar2);
        }
        wazVar2.B();
        gjz.a aVar = gjz.Companion;
        if (gjz.e(aVar.c(), wazVar2.p().u())) {
            ctz.a aVar2 = ctz.Companion;
            ctz a2 = aVar2.a();
            l2z l2zVar = null;
            if (njzVar == null) {
                ctzVar = null;
            } else {
                ctzVar = njzVar.e();
            }
            if (ctzVar == null) {
                ctzVar = aVar2.a();
            }
            njz njzVar2 = new njz(a2, new Parsing(), renderContext.j(), null, null, 24, null);
            Object g = wazVar2.g();
            if (g != null) {
                if (g instanceof OriginNode) {
                    OriginNode originNode = (OriginNode) g;
                    if (gjz.e(originNode.u(), aVar.a())) {
                        Object n = originNode.n();
                        if (n instanceof l2z) {
                            l2zVar = (l2z) n;
                        }
                        if (l2zVar == null) {
                            throw new IllegalArgumentException("COMPOSE_FUNCTION 节点必须包含 ComposeFuncInfo");
                        } else if (!l2zVar.a().isEmpty()) {
                            jhz e = INSTANCE.e(originNode, ctzVar, renderContext);
                            for (Object obj : l2zVar.a()) {
                                if (obj instanceof j6z) {
                                    njzVar2.e().a(mhz.INSTANCE.b(((j6z) obj).a(), e));
                                } else {
                                    njzVar2.e().a(hhz.Companion.f(obj));
                                }
                            }
                            if (njzVar2.e().e() == l2zVar.a().size()) {
                                wazVar2.H(g);
                            } else {
                                throw new IllegalStateException("compose func args 数量不匹配");
                            }
                        }
                    } else {
                        throw new RuntimeException("compose func origin node is not compose func");
                    }
                } else {
                    throw new RuntimeException("compose func origin node is not origin node");
                }
            }
            njzVar = njzVar2;
        }
        if (njzVar != null) {
            wazVar2.K(njzVar.e());
            INSTANCE.i(wazVar2, renderContext, njzVar);
        }
        if (!wazVar2.h().F(renderContext, njzVar)) {
            for (waz wazVar3 : wazVar2.c()) {
                l(wazVar2, wazVar3, renderContext, njzVar);
            }
        }
        return true;
    }

    public final void m(WeakReference<njz> weakReference, bgz<hhz> bgzVar) {
        olz a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16637e39", new Object[]{this, weakReference, bgzVar});
            return;
        }
        njz njzVar = weakReference.get();
        if (njzVar != null && njzVar.f().get() && (a2 = njzVar.a()) != null) {
            njzVar.d().e(a2, bgzVar);
        }
    }

    public final void n(Parsing parsing, waz wazVar, RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d90932", new Object[]{this, parsing, wazVar, renderContext});
            return;
        }
        OriginNode p = wazVar.p();
        if (p != null) {
            ctz u = wazVar.u();
            if (u != null) {
                njz njzVar = new njz(u, parsing, renderContext.j(), null, null, 24, null);
                jhz f = f(p, renderContext.a().d(), njzVar, false, renderContext);
                njzVar.b().push(h(parsing, wazVar, renderContext));
                wazVar.G();
                j(wazVar, renderContext, f);
                njzVar.b().pop();
                wazVar.h().D(renderContext, njzVar);
                return;
            }
            throw new IllegalStateException("VariableRegion 不可为空");
        }
    }

    public final jhz f(OriginNode originNode, zgz zgzVar, njz njzVar, boolean z, RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jhz) ipChange.ipc$dispatch("12839e70", new Object[]{this, originNode, zgzVar, njzVar, new Boolean(z), renderContext});
        }
        ckf.g(originNode, "originNode");
        ckf.g(zgzVar, "exprFuncOwner");
        ckf.g(njzVar, "parsingContext");
        ckf.g(renderContext, "renderContext");
        NodeParser$createFuncContextWithParsing$readObserver$1 nodeParser$createFuncContextWithParsing$readObserver$1 = new NodeParser$createFuncContextWithParsing$readObserver$1(new WeakReference(njzVar));
        NodeParser$createFuncContextWithParsing$writeObserver$1 nodeParser$createFuncContextWithParsing$writeObserver$1 = z ? new NodeParser$createFuncContextWithParsing$writeObserver$1(new WeakReference(njzVar.c()), njzVar.d()) : null;
        List<n7z> o = originNode.o();
        List<String> j = originNode.j();
        List<d0z> m = originNode.m();
        ctz e = njzVar.e();
        ckf.d(e);
        return jhz.Companion.a(o, m, j, null, zgzVar, e, nodeParser$createFuncContextWithParsing$readObserver$1, nodeParser$createFuncContextWithParsing$writeObserver$1, renderContext.e());
    }

    public final waz d(waz wazVar, OriginNode originNode, RenderContext renderContext, njz njzVar) {
        OriginNode originNode2;
        njz njzVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waz) ipChange.ipc$dispatch("4e0dddb2", new Object[]{this, wazVar, originNode, renderContext, njzVar});
        }
        ckf.g(renderContext, "renderContext");
        l2z l2zVar = null;
        if (originNode == null) {
            return null;
        }
        if (ciz.Companion.c()) {
            iiz.a aVar = iiz.Companion;
            i2z i = originNode.i();
            aVar.j(ckf.p(" node parser nodeName ", i == null ? null : i.f()));
        }
        byte u = originNode.u();
        gjz.a aVar2 = gjz.Companion;
        if (gjz.e(u, aVar2.a())) {
            Object n = originNode.n();
            l2z l2zVar2 = n instanceof l2z ? (l2z) n : null;
            if (l2zVar2 != null) {
                fjz b = originNode.r().b();
                int size = b.a().size() - 1;
                int b2 = l2zVar2.b();
                if (b2 < 0 || b2 > size) {
                    throw new IndexOutOfBoundsException("funcIndex 超出范围");
                }
                originNode2 = b.a().get(l2zVar2.b());
            } else {
                throw new IllegalArgumentException("COMPOSE_FUNCTION 节点必须包含 ComposeFuncInfo");
            }
        } else {
            originNode2 = originNode;
        }
        waz wazVar2 = new waz(originNode2, renderContext);
        if (wazVar != null) {
            wazVar.a(wazVar2);
        }
        if (gjz.e(originNode2.u(), aVar2.c())) {
            ctz e = njzVar == null ? null : njzVar.e();
            if (e == null) {
                e = ctz.Companion.a();
            }
            njz njzVar3 = new njz(ctz.Companion.a(), new Parsing(), renderContext.j(), null, null, 24, null);
            if (gjz.e(originNode.u(), aVar2.a())) {
                Object n2 = originNode.n();
                if (n2 instanceof l2z) {
                    l2zVar = (l2z) n2;
                }
                if (l2zVar == null) {
                    throw new IllegalArgumentException("COMPOSE_FUNCTION 节点必须包含 ComposeFuncInfo");
                } else if (!l2zVar.a().isEmpty()) {
                    jhz e2 = e(originNode, e, renderContext);
                    for (Object obj : l2zVar.a()) {
                        if (obj instanceof j6z) {
                            njzVar3.e().a(mhz.INSTANCE.b(((j6z) obj).a(), e2));
                        } else {
                            njzVar3.e().a(hhz.Companion.f(obj));
                        }
                    }
                    if (njzVar3.e().e() == l2zVar.a().size()) {
                        wazVar2.H(originNode);
                    } else {
                        throw new IllegalStateException("compose func args 数量不匹配");
                    }
                }
            }
            njzVar2 = njzVar3;
        } else {
            njzVar2 = njzVar;
        }
        if (njzVar2 != null) {
            wazVar2.K(njzVar2.e());
        }
        ckf.d(njzVar2);
        i(wazVar2, renderContext, njzVar2);
        if (!wazVar2.h().F(renderContext, njzVar2)) {
            for (OriginNode originNode3 : originNode2.g()) {
                d(wazVar2, originNode3, renderContext, njzVar2);
            }
        }
        AtomicBoolean f = njzVar2.f();
        if (f != null) {
            f.set(false);
        }
        return wazVar2;
    }
}
