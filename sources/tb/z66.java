package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z66 extends wa6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final w66 m = new w66();
    public final x66 n = new x66(new a76());

    static {
        t2o.a(444596516);
    }

    public static /* synthetic */ Object ipc$super(z66 z66Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXOptRenderPipelineSimpleFlow");
    }

    @Override // tb.wa6, com.taobao.android.dinamicx.DXRenderPipelineFlow
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

    @Override // tb.wa6, com.taobao.android.dinamicx.DXRenderPipelineFlow
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
        return this.m.c(this.d, this.f, z);
    }

    @Override // tb.wa6, com.taobao.android.dinamicx.DXRenderPipelineFlow
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
        return this.n.a(dXWidgetNode, svbVar, h(), this.f, 1, dXRenderOptions);
    }
}
