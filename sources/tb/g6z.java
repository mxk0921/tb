package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import com.taobao.android.nanocompose.runtime.pipeline.parser.NodeParser;
import com.taobao.android.nanocompose.runtime.pipeline.render_stage.RenderPipelineTaskResultType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class g6z extends klz<llz<waz>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737474);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6z(RenderContext renderContext, glz glzVar) {
        super("ExpandTreeStage", renderContext, glzVar);
        ckf.g(renderContext, "renderContext");
        ckf.g(glzVar, DataReceiveMonitor.CB_LISTENER);
    }

    public static /* synthetic */ Object ipc$super(g6z g6zVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/render_stage/ExpandTreeStage");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[Catch: Exception -> 0x0048, TryCatch #1 {Exception -> 0x0048, blocks: (B:7:0x001d, B:9:0x0027, B:12:0x002f, B:14:0x0035, B:17:0x004b, B:19:0x0073, B:21:0x0078, B:24:0x0084, B:28:0x008c, B:31:0x0094, B:32:0x0098, B:34:0x00a5, B:37:0x00c5, B:40:0x00cc, B:42:0x00d2, B:44:0x00db, B:46:0x00eb, B:48:0x00f8, B:50:0x00fe, B:51:0x0106, B:18:0x0065), top: B:67:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[Catch: Exception -> 0x0048, TryCatch #1 {Exception -> 0x0048, blocks: (B:7:0x001d, B:9:0x0027, B:12:0x002f, B:14:0x0035, B:17:0x004b, B:19:0x0073, B:21:0x0078, B:24:0x0084, B:28:0x008c, B:31:0x0094, B:32:0x0098, B:34:0x00a5, B:37:0x00c5, B:40:0x00cc, B:42:0x00d2, B:44:0x00db, B:46:0x00eb, B:48:0x00f8, B:50:0x00fe, B:51:0x0106, B:18:0x0065), top: B:67:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode d(tb.irz r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g6z.d(tb.irz):com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode");
    }

    public llz<waz> e() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llz) ipChange.ipc$dispatch("6d292ef3", new Object[]{this});
        }
        glz a2 = a();
        if (a2 != null) {
            a2.a(b());
        }
        waz rootLayoutNode = c().j().getRootLayoutNode();
        if (rootLayoutNode == null) {
            nrz nrzVar = nrz.INSTANCE;
            irz c = nrz.c(nrzVar, c().b(), c().m(), c().h(), false, 8, null);
            OriginNode d = d(c);
            if (d == null) {
                if (!hrz.d(c().h(), hrz.b((byte) 0)) || c.b() == null || c.b().f()) {
                    iiz.Companion.f(c().b(), c().m().c(), c().m().e(), b.Companion.a(), "fetch template is null");
                    d = null;
                } else {
                    if (iiz.c()) {
                        iiz.Companion.j(" 缓存中不存在，或者缓存中的渲染失败 尝试使用内置模版再次进行渲染");
                    }
                    d = d(nrzVar.b(c().b(), c().m(), hrz.b((byte) 1), true));
                }
            }
            if (c.c()) {
                if (iiz.c()) {
                    iiz.Companion.j("触发了降级，根据业务配置的下载策略，进行下载处理");
                }
                drz g = c().g();
                byte b = drz.b((byte) 0);
                if (g != null) {
                    z = drz.d(g.g(), b);
                }
                if (z) {
                    i5z i5zVar = i5z.INSTANCE;
                    String b2 = c().b();
                    TemplateItem m = c().m();
                    shz d2 = c().l().d();
                    i5zVar.c(b2, m, d2 == null ? null : d2.a());
                }
            }
            if (d == null) {
                iiz.Companion.f(c().b(), c().m().c(), c().m().e(), b.Companion.a(), "originRoot still is null");
                return null;
            }
            try {
                waz c2 = NodeParser.INSTANCE.c(d, c());
                if (c2 == null) {
                    iiz.Companion.f(c().b(), c().m().c(), c().m().e(), b.Companion.b(), "layoutNodeRoot is null");
                    return null;
                }
                c().r(c2);
                llz<waz> llzVar = new llz<>(RenderPipelineTaskResultType.SUCCESS, c2);
                glz a3 = a();
                if (a3 != null) {
                    a3.b(b(), c2);
                }
                return llzVar;
            } catch (Exception e) {
                iiz.Companion.f(c().b(), c().m().c(), c().m().e(), b.Companion.b(), ckf.p("parse layout tree exp:", sm8.b(e)));
                return null;
            }
        } else {
            NodeParser.INSTANCE.k(rootLayoutNode, c());
            llz<waz> llzVar2 = new llz<>(RenderPipelineTaskResultType.SUCCESS, rootLayoutNode);
            glz a4 = a();
            if (a4 != null) {
                a4.b(b(), rootLayoutNode);
            }
            return llzVar2;
        }
    }
}
