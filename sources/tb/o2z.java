package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import com.taobao.android.nanocompose.runtime.pipeline.parser.NodeParser;
import java.util.List;
import tb.hhz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class o2z extends xaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public boolean m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598736981);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final waz a(waz wazVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (waz) ipChange.ipc$dispatch("3c8f788e", new Object[]{this, wazVar});
            }
            ckf.g(wazVar, "layoutNode");
            waz r = wazVar.r();
            return (r == null || !r.z()) ? r : a(r);
        }

        public a() {
        }
    }

    static {
        t2o.a(598736980);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2z(waz wazVar) {
        super(wazVar);
        ckf.g(wazVar, "layoutNode");
    }

    public static /* synthetic */ Object ipc$super(o2z o2zVar, String str, Object... objArr) {
        if (str.hashCode() == 1515909069) {
            super.D((RenderContext) objArr[0], (njz) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/condtion/ConditionLayoutNodeCoordinator");
    }

    @Override // tb.viz
    public boolean F(RenderContext renderContext, njz njzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404797c3", new Object[]{this, renderContext, njzVar})).booleanValue();
        }
        ckf.g(renderContext, "renderContext");
        return true;
    }

    @Override // tb.viz
    public void D(RenderContext renderContext, njz njzVar) {
        OriginNode originNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5aefcd", new Object[]{this, renderContext, njzVar});
            return;
        }
        ckf.g(renderContext, "renderContext");
        ckf.g(njzVar, "parsingContext");
        super.D(renderContext, njzVar);
        if (!y().p().g().isEmpty()) {
            Object n = y().p().n();
            p2z p2zVar = n instanceof p2z ? (p2z) n : null;
            if (p2zVar != null) {
                NodeParser nodeParser = NodeParser.INSTANCE;
                jhz g = NodeParser.g(nodeParser, y().p(), renderContext.a().d(), njzVar, false, renderContext, 8, null);
                njzVar.b().push(nodeParser.h(njzVar.d(), y(), renderContext));
                hhz b = mhz.INSTANCE.b(p2zVar.a(), g);
                njzVar.b().pop();
                if (b instanceof hhz.b) {
                    boolean M = ((hhz.b) b).M();
                    if (M && this.m && !y().c().isEmpty()) {
                        nodeParser.k(y().c().get(0), renderContext);
                    }
                    if (!M && !this.m && y().c().size() > 1) {
                        nodeParser.k(y().c().get(1), renderContext);
                    }
                    this.m = M;
                    List<OriginNode> g2 = y().p().g();
                    if (!M) {
                        originNode = g2.size() == 2 ? g2.get(1) : null;
                    } else if (g2.size() > 0) {
                        originNode = g2.get(0);
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!y().c().isEmpty()) {
                        y().E(y().c().get(0));
                    }
                    if (originNode != null) {
                        nodeParser.d(y(), originNode, renderContext, njzVar);
                    }
                    y().l().onRequestMeasure(Companion.a(y()));
                } else if (iiz.c()) {
                    iiz.Companion.j("condition expr 返回值不是 bool");
                }
            }
        }
    }
}
