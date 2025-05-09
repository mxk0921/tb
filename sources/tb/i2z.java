package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.nanocompose.foundation.layout.DefaultMeasurePolicy;
import com.taobao.android.nanocompose.runtime.component_descriptor.ComponentDescriptorParameters;
import com.taobao.android.nanocompose.runtime.node.origin_node.OriginNode;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class i2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f21063a;
    public final Object b;
    public final g1a<ndz, mdz> c;
    public final d1a<jkz> d;
    public final d1a<NCComponentViewHandler> e;
    public final boolean f;
    public final g1a<OriginNode, ejz> g;
    public final g1a<waz, xaz> h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737241);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final jkz a(jkz jkzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jkz) ipChange.ipc$dispatch("4da432dc", new Object[]{this, jkzVar});
            }
            ckf.g(jkzVar, "oldProps");
            return jkzVar.b();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737240);
    }

    public i2z(ComponentDescriptorParameters componentDescriptorParameters) {
        ckf.g(componentDescriptorParameters, PushConstants.PARAMS);
        this.f21063a = componentDescriptorParameters.b();
        componentDescriptorParameters.a();
        this.b = componentDescriptorParameters.d();
        this.c = componentDescriptorParameters.f();
        this.d = componentDescriptorParameters.h();
        this.e = componentDescriptorParameters.c();
        this.f = componentDescriptorParameters.i();
        this.g = componentDescriptorParameters.g();
        this.h = componentDescriptorParameters.e();
    }

    public abstract xhz a(qgz qgzVar, vgz vgzVar);

    public final xaz b(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xaz) ipChange.ipc$dispatch("1c6fb0bf", new Object[]{this, wazVar});
        }
        ckf.g(wazVar, "layoutNode");
        g1a<waz, xaz> g1aVar = this.h;
        xaz invoke = g1aVar == null ? null : g1aVar.invoke(wazVar);
        return invoke == null ? new xaz(wazVar) : invoke;
    }

    public final mdz c(ndz ndzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdz) ipChange.ipc$dispatch("7fd5c9dd", new Object[]{this, ndzVar});
        }
        ckf.g(ndzVar, "params");
        if (ndzVar.a() != null) {
            return new DefaultMeasurePolicy(ndzVar, null, null, 6, null);
        }
        return this.c.invoke(ndzVar);
    }

    public abstract jkz d();

    public final void e(waz wazVar) {
        NCComponentViewHandler invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519a0341", new Object[]{this, wazVar});
            return;
        }
        ckf.g(wazVar, "layoutNode");
        if (wazVar.v() == null) {
            d1a<NCComponentViewHandler> d1aVar = this.e;
            NCComponentViewHandler nCComponentViewHandler = null;
            if (!(d1aVar == null || (invoke = d1aVar.invoke()) == null)) {
                invoke.updateLayoutNode$nanocompose_slimRelease(wazVar);
                xhv xhvVar = xhv.INSTANCE;
                nCComponentViewHandler = invoke;
            }
            if (nCComponentViewHandler == null) {
                nCComponentViewHandler = new hgz();
                nCComponentViewHandler.updateLayoutNode$nanocompose_slimRelease(wazVar);
                xhv xhvVar2 = xhv.INSTANCE;
            }
            wazVar.L(nCComponentViewHandler);
        }
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47cc1ee2", new Object[]{this});
        }
        return this.f21063a;
    }

    public final g1a<OriginNode, ejz> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("2b040bd6", new Object[]{this});
        }
        return this.g;
    }

    public final d1a<jkz> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("ab28fc84", new Object[]{this});
        }
        return this.d;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14c18a11", new Object[]{this})).booleanValue();
        }
        return this.f;
    }
}
