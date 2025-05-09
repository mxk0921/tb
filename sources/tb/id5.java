package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.dinamicx_v4.loader.DXExtensionSectionLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class id5 implements oub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public m06 f21250a;
    public l06 b;
    public a16 c;
    public iw5 d;
    public uk6 e;
    public hh5 f;
    public em6 g;
    public pg5 h;
    public gg5 i;
    public DXExtensionSectionLoader j;
    public bc5 k;
    public lg5 l;

    static {
        t2o.a(444597855);
        t2o.a(444598016);
    }

    @Override // tb.oub
    public DXWidgetNode b(byte[] bArr, DXRuntimeContext dXRuntimeContext, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5dc142fa", new Object[]{this, bArr, dXRuntimeContext, context, new Boolean(z)});
        }
        boolean d = d(bArr, dXRuntimeContext);
        this.i.b(dXRuntimeContext, context);
        if (!d) {
            return null;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        DXWidgetNode b = this.e.b(this.l, dXRuntimeContext, true, atomicBoolean);
        if (atomicBoolean.get()) {
            e(b);
        }
        if (b == null) {
            la6.b("loadFromBufferV4 null1 ");
        }
        la6.b("loadFromBufferV4 null2 ");
        return b;
    }

    /* renamed from: c */
    public oub<id5> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oub) ipChange.ipc$dispatch("dc6382b", new Object[]{this});
        }
        return new id5();
    }

    public final boolean d(byte[] bArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e881548e", new Object[]{this, bArr, dXRuntimeContext})).booleanValue();
        }
        g();
        this.l.m(bArr);
        this.f21250a.d(0);
        boolean b = this.f21250a.b(this.l, dXRuntimeContext) & this.b.b(this.l, dXRuntimeContext);
        this.f21250a.c(this.l.c());
        this.c.l(this.l.c());
        boolean j = b & this.c.j(this.l, dXRuntimeContext);
        this.c.k(this.l.c());
        return j & this.e.c(this.l, dXRuntimeContext) & this.d.d(this.l, dXRuntimeContext) & this.f.c(this.l, dXRuntimeContext) & this.g.b(this.l, dXRuntimeContext) & this.h.b(this.l, dXRuntimeContext) & this.j.b(this.l, dXRuntimeContext) & this.i.c(this.l, dXRuntimeContext);
    }

    public void e(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e31a38b", new Object[]{this, dXWidgetNode});
        } else {
            f(dXWidgetNode, dXWidgetNode);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.f21250a = new m06();
        this.b = new l06(this.f21250a);
        this.c = new a16();
        this.f = new hh5(this.c);
        this.d = new iw5(this.c);
        this.g = new em6(this.c, this.f);
        this.h = new pg5(this.c);
        this.i = new gg5(this.c, this.f);
        this.k = new bc5(this.f);
        this.j = new DXExtensionSectionLoader(this.f21250a, this.c, this.f, this.k, this.b);
        this.e = new uk6(this.c, this.f, this.d, this.g, this.h, this.j, this.k, this.b);
        this.l = new lg5();
    }

    public void f(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb68bcee", new Object[]{this, dXWidgetNode, dXWidgetNode2});
        } else if (dXWidgetNode2 != null) {
            if (dXWidgetNode2 instanceof bi6) {
                bi6 bi6Var = (bi6) dXWidgetNode2;
                if (bi6Var.H() == 2) {
                    String str = bi6Var.getName() + ":" + bi6Var.getVersion();
                    Map<String, DXWidgetNode> map = this.i.d;
                    if (map != null && ((HashMap) map).size() > 0) {
                        dXWidgetNode = (DXWidgetNode) ((HashMap) this.i.d).get(str);
                        if (dXWidgetNode != null) {
                            if (DinamicXEngine.j0()) {
                                h36.a("取到childTemplate:" + str);
                            }
                            if (!zg5.u2()) {
                                bi6Var.addChild(dXWidgetNode, false);
                            } else if (eb5.y()) {
                                bi6Var.addChild(dXWidgetNode.deepCloneForEmbed(dXWidgetNode.getDXRuntimeContext()), false);
                            } else {
                                bi6Var.addChild(dXWidgetNode.deepClone(dXWidgetNode.getDXRuntimeContext()), false);
                            }
                        }
                    } else if (!DinamicXEngine.j0()) {
                        la6.b("取不到childTemplate " + str);
                        return;
                    } else {
                        throw new RuntimeException("取不到childTemplate " + str);
                    }
                } else if (bi6Var.H() != 1) {
                    bi6Var.isRemote();
                } else if (bi6Var.getChildrenCount() != 1) {
                    la6.b("内联的子模版有问题，其getChildrenCount() != 1");
                } else {
                    dXWidgetNode = bi6Var.getChildAt(0);
                    dXWidgetNode.setDxEventChains(dXWidgetNode.getDxEventChains());
                    dXWidgetNode.setAnimation(dXWidgetNode.getAnimation());
                    dXWidgetNode.setDxExprBytes(dXWidgetNode.getDxExprBytes());
                    if (dXWidgetNode.isV4Node() && dXWidgetNode.isV4Node()) {
                        dXWidgetNode.getDxv4Properties().L(dXWidgetNode.getDxv4Properties().t());
                        dXWidgetNode.getDxv4Properties().C(dXWidgetNode.getDxv4Properties().k());
                        dXWidgetNode.getDxv4Properties().x(dXWidgetNode.getDxv4Properties().f());
                    }
                }
            }
            if ((dXWidgetNode2 instanceof j) || dXWidgetNode2.getChildrenCount() > 0) {
                for (int i = 0; i < dXWidgetNode2.getChildrenCount(); i++) {
                    f(dXWidgetNode, dXWidgetNode2.getChildAt(i));
                }
            }
        }
    }
}
