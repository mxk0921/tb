package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.parse.stateTree.async.component")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ng extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public nbb c;
    public zt d;
    public HandlerThread e;
    public Handler f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f24710a;

        public a(Iterator it) {
            this.f24710a = it;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (this.f24710a.hasNext()) {
                TreeNode treeNode = (TreeNode) this.f24710a.next();
                if (!(treeNode == null || treeNode.data() == null)) {
                    ng.x(ng.this).c((RenderComponent) treeNode.data());
                }
            }
        }
    }

    static {
        t2o.a(81788967);
    }

    public static /* synthetic */ Object ipc$super(ng ngVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/asyncModule/ext/AURAAsyncModuleParseExtension");
    }

    public static /* synthetic */ zt x(ng ngVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zt) ipChange.ipc$dispatch("938cf3e9", new Object[]{ngVar});
        }
        return ngVar.d;
    }

    public final void B(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30cef88b", new Object[]{this, multiTreeNode});
            return;
        }
        a aVar = new a(multiTreeNode.preOrdered().iterator());
        if (this.g) {
            dn.h(aVar);
            return;
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.post(aVar);
        }
    }

    @Override // tb.gt, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        this.c = loVar.c();
        boolean d = fj.d("enableThreadPerf", true);
        this.g = d;
        if (!d) {
            HandlerThread handlerThread = new HandlerThread("asyncModuleParser");
            this.e = handlerThread;
            handlerThread.start();
            this.f = new Handler(this.e.getLooper());
        }
    }

    @Override // tb.gt, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        zt ztVar = (zt) aURAGlobalData.get("asyncModuleDispatcher", zt.class);
        if (ztVar == null) {
            ztVar = new jg(this.c);
            aURAGlobalData.update("asyncModuleDispatcher", ztVar);
        }
        this.d = ztVar;
    }

    @Override // tb.gt, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        HandlerThread handlerThread = this.e;
        if (handlerThread != null) {
            try {
                handlerThread.quitSafely();
            } catch (Exception unused) {
            }
        }
    }

    @Override // tb.gt, tb.dcb
    public void p(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900fdd7", new Object[]{this, multiTreeNode, ultronProtocol});
        } else if (this.c == null || this.d == null) {
            ck.g().b("AURAAsyncModuleParseExtension", "onFinishParseWithRoot", "mAuraInstance or mAsyncModuleDispatcher is null");
        } else {
            B(multiTreeNode);
        }
    }
}
