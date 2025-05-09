package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.performance.monitor.weex2.render")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wo implements ddb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yi f30806a;

    static {
        t2o.a(81789240);
        t2o.a(81789241);
    }

    @Override // tb.ddb
    public void F(d3x d3xVar, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8abeb5b", new Object[]{this, d3xVar, frameLayout});
        }
    }

    @Override // tb.ddb
    public void b0(d3x d3xVar, AURARenderComponent aURARenderComponent, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2345ae3b", new Object[]{this, d3xVar, aURARenderComponent, viewGroup, new Integer(i)});
            return;
        }
        for (gcb gcbVar : this.f30806a.f(gcb.class)) {
            gcbVar.f0("aura_weex2_render", "Weex2渲染耗时", pm.RENDER_SERVICE_CODE);
        }
    }

    @Override // tb.ddb
    public void e(d3x d3xVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fade8813", new Object[]{this, d3xVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (d3xVar.g() == null) {
            str = "";
        } else {
            str = d3xVar.g();
        }
        hashMap.put("componentKey", str);
        uo k = d3xVar.k();
        if (k != null) {
            hashMap.put("loadUrl", k.d());
        }
        for (gcb gcbVar : this.f30806a.f(gcb.class)) {
            gcbVar.U("aura_weex2_render", pm.RENDER_SERVICE_CODE, false, hashMap);
        }
    }

    @Override // tb.ddb
    public void h(d3x d3xVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1348afe", new Object[]{this, d3xVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // tb.ddb
    public void h0(d3x d3xVar, ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25eb96b", new Object[]{this, d3xVar, viewGroup, view});
        }
    }

    @Override // tb.ddb
    public uo j(AURARenderComponent aURARenderComponent, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uo) ipChange.ipc$dispatch("e7f1a858", new Object[]{this, aURARenderComponent, viewGroup, new Integer(i)});
        }
        return null;
    }

    @Override // tb.ddb
    public boolean k0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cacfa6f9", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        return false;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f30806a = yiVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
