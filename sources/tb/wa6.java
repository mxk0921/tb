package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRenderPipelineFlow;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.i;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wa6 extends DXRenderPipelineFlow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final i j = new i();
    public final pc6 k = new pc6();
    public final m76 l;

    static {
        t2o.a(444596548);
    }

    public wa6() {
        r rVar = new r();
        this.l = new m76((gwb) null, rVar);
    }

    public static /* synthetic */ Object ipc$super(wa6 wa6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXRenderPipelineSimpleFlow");
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public svb i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svb) ipChange.ipc$dispatch("fa55f69b", new Object[]{this});
        }
        if (this.d == null || this.e == null || h() == null) {
            return null;
        }
        return this.e;
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public svb j() {
        DXRuntimeContext dXRuntimeContext;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svb) ipChange.ipc$dispatch("ac84707c", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.d;
        if (dXWidgetNode == null || (dXRuntimeContext = this.f) == null) {
            return dXWidgetNode;
        }
        if (!(dXRuntimeContext.s() == null || this.f.s().c() == null)) {
            z = this.f.s().c().z();
        }
        return this.j.c(this.d, this.f, z);
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public DXWidgetNode k() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("9d5e570f", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.d;
        if (dXWidgetNode == null || (dXRuntimeContext = this.f) == null) {
            return dXWidgetNode;
        }
        this.j.d(dXWidgetNode, dXRuntimeContext);
        return this.d;
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public DXWidgetNode m() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("68042ca5", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.d;
        if (dXWidgetNode == null || (dXRuntimeContext = this.f) == null) {
            return dXWidgetNode;
        }
        this.j.e(dXWidgetNode, this.g, this.h, dXRuntimeContext);
        return this.d;
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public DXWidgetNode n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("2f5545ba", new Object[]{this});
        }
        DXWidgetNode dXWidgetNode = this.d;
        if (dXWidgetNode == null || this.f == null) {
            return dXWidgetNode;
        }
        this.l.b(dXWidgetNode, dXWidgetNode.getDXRuntimeContext(), null);
        return this.d;
    }

    @Override // com.taobao.android.dinamicx.DXRenderPipelineFlow
    public View o(DXRenderOptions dXRenderOptions) {
        svb svbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce968546", new Object[]{this, dXRenderOptions});
        }
        DXWidgetNode dXWidgetNode = this.d;
        if (dXWidgetNode == null || (svbVar = this.e) == null || this.f == null) {
            return null;
        }
        return this.k.d(dXWidgetNode, (DXWidgetNode) svbVar, h(), this.f, 1, dXRenderOptions);
    }
}
