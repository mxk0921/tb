package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.q;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m76 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_FROM_MAIN = 1;
    public static final int TYPE_FROM_SIMPLE = 2;

    /* renamed from: a  reason: collision with root package name */
    public final q f23816a;
    public gwb b;
    public final r c;

    static {
        t2o.a(444597938);
    }

    public m76(gwb gwbVar, q qVar) {
        this.f23816a = qVar;
        this.b = gwbVar;
        if (qVar == null) {
            this.f23816a = new q();
        }
        this.c = new r();
        if (this.b == null && g.s() != null && g.s().d() != null) {
            this.b = g.s().d().a();
        }
    }

    public DXWidgetNode a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("897a7876", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions});
        }
        if (!dXWidgetNode.isV4Node()) {
            return this.f23816a.c(dXWidgetNode, dXRuntimeContext, dXRenderOptions);
        }
        if (this.b == null && eb5.E()) {
            rn7.a();
            DinamicXEngine r = dXRuntimeContext.r();
            if (r != null) {
                r.k0();
            }
            this.b = g.s().d().a();
        }
        return this.b.b(dXWidgetNode, 1, dXRenderOptions);
    }

    public DXWidgetNode b(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("acbe270a", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions});
        }
        if (!dXWidgetNode.isV4Node()) {
            return this.c.e(dXWidgetNode, dXRenderOptions);
        }
        if (this.b == null && eb5.E()) {
            rn7.a();
            DinamicXEngine r = dXRuntimeContext.r();
            if (r != null) {
                r.k0();
            }
            this.b = g.s().d().a();
        }
        return this.b.b(dXWidgetNode, 2, dXRenderOptions);
    }

    public m76(gwb gwbVar, r rVar) {
        this.b = gwbVar;
        this.c = rVar;
        if (rVar == null) {
            this.c = new r();
        }
        this.f23816a = new q();
        if (this.b == null && g.s() != null && g.s().d() != null) {
            this.b = g.s().d().a();
        }
    }
}
