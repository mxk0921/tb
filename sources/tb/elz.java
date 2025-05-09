package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.pipeline.render.FlattenedNodeMutation;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class elz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final elz INSTANCE = new elz();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(598737472);
            int[] iArr = new int[FlattenedNodeMutation.Type.values().length];
            iArr[FlattenedNodeMutation.Type.CREATE.ordinal()] = 1;
            iArr[FlattenedNodeMutation.Type.UPDATE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(598737471);
    }

    public final void a(RenderContext renderContext, waz wazVar, e7z e7zVar, flz flzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b9a548", new Object[]{this, renderContext, wazVar, e7zVar, flzVar});
            return;
        }
        ckf.g(renderContext, "renderContext");
        if (wazVar != null) {
            ArrayList arrayList = new ArrayList();
            e7z a2 = d5z.INSTANCE.a(e7zVar, wazVar, arrayList);
            if (flzVar != null) {
                flzVar.a(arrayList);
            } else {
                c(renderContext, arrayList);
            }
            renderContext.q(a2);
        }
    }

    public final void b(RenderContext renderContext, FlattenedNodeMutation flattenedNodeMutation) {
        xhz a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf84437", new Object[]{this, renderContext, flattenedNodeMutation});
            return;
        }
        e7z c = flattenedNodeMutation.c();
        waz b = c == null ? null : c.b();
        e7z a3 = flattenedNodeMutation.a();
        waz b2 = a3 == null ? null : a3.b();
        ckf.d(b2);
        NCComponentViewHandler v = b2.v();
        if (v != null) {
            v.createView$nanocompose_slimRelease(renderContext.d());
            biz bizVar = new biz();
            i2z d = b2.d();
            if (!(d == null || (a2 = d.a(renderContext.a().c(), b2)) == null)) {
                v.updateEventEmitter(bizVar, a2);
            }
            NCComponentViewHandler v2 = b == null ? null : b.v();
            if (v2 != null) {
                b.W(v2);
            }
            NCComponentViewHandler.Companion.b(v, v2);
            v.updateViewWithContext((jkz) null, b2.s());
            return;
        }
        throw new RuntimeException("创建平台viewHandler失败");
    }

    public final void c(RenderContext renderContext, List<FlattenedNodeMutation> list) {
        NCComponentViewHandler v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b8dcba6", new Object[]{this, renderContext, list});
            return;
        }
        for (FlattenedNodeMutation flattenedNodeMutation : list) {
            if (iiz.c()) {
                iiz.Companion.j(ckf.p("scheduleRenderMutations", flattenedNodeMutation.d()));
            }
            int i = a.$EnumSwitchMapping$0[flattenedNodeMutation.d().ordinal()];
            if (i == 1) {
                b(renderContext, flattenedNodeMutation);
            } else if (i == 2) {
                e7z a2 = flattenedNodeMutation.a();
                if (!(a2 == null || (v = a2.b().v()) == null)) {
                    e7z b = flattenedNodeMutation.b();
                    v.updateViewWithContext(b == null ? null : b.c(), a2.c());
                }
            } else {
                throw new IllegalArgumentException(ckf.p("scheduleRenderMutations 不支持的变更类型: ", flattenedNodeMutation.d()));
            }
        }
    }
}
