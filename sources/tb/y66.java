package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.m;
import com.taobao.android.dinamicx.p;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y66 extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final w66 l = new w66();
    public final x66 m = new x66(new v66());

    static {
        t2o.a(444596515);
    }

    public y66(av5 av5Var, p pVar) {
        super(av5Var, pVar);
    }

    public static /* synthetic */ Object ipc$super(y66 y66Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXOptRenderPipeline");
    }

    @Override // com.taobao.android.dinamicx.m
    public svb s(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svb) ipChange.ipc$dispatch("9f141fae", new Object[]{this, dXWidgetNode, dXRuntimeContext, new Boolean(z)});
        }
        return this.l.c(dXWidgetNode, dXRuntimeContext, z);
    }

    @Override // com.taobao.android.dinamicx.m
    public View t(DXWidgetNode dXWidgetNode, svb svbVar, View view, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("815fc38f", new Object[]{this, dXWidgetNode, svbVar, view, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        return this.m.a(dXWidgetNode, svbVar, view, dXRuntimeContext, i, dXRenderOptions);
    }
}
