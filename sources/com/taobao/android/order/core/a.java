package com.taobao.android.order.core;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.container.UltronListProxy;
import com.taobao.android.order.core.performance.OrderUltronInstanceFactory;
import tb.f4d;
import tb.nb5;
import tb.ocl;
import tb.pqb;
import tb.rtd;
import tb.t2o;
import tb.u3o;
import tb.uel;
import tb.w8;
import tb.wqb;
import tb.z9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wqb f9139a;
    public final OrderConfigs b;

    static {
        t2o.a(614465614);
    }

    public a(OrderConfigs orderConfigs) {
        this.b = orderConfigs;
        if (orderConfigs.c() == OrderConfigs.BizNameType.ORDER_LIST) {
            this.f9139a = OrderUltronInstanceFactory.getUltronListProxy();
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar == null || !((UltronListProxy) wqbVar).C()) {
            this.f9139a = ocl.a(orderConfigs);
        } else {
            ((UltronListProxy) this.f9139a).u0(orderConfigs);
        }
    }

    public static a a(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f97cd4d6", new Object[]{orderConfigs});
        }
        return new a(orderConfigs);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.destroy();
        }
    }

    public wqb c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wqb) ipChange.ipc$dispatch("ac386ccf", new Object[]{this});
        }
        return this.f9139a;
    }

    public f4d d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f4d) ipChange.ipc$dispatch("3bd00e4c", new Object[]{this});
        }
        OrderConfigs orderConfigs = this.b;
        if (orderConfigs == null) {
            return null;
        }
        return orderConfigs.c;
    }

    public void f(JSONObject jSONObject, pqb pqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5def80", new Object[]{this, jSONObject, pqbVar});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.i(jSONObject, pqbVar);
        }
    }

    public void g(pqb pqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7450129e", new Object[]{this, pqbVar});
            return;
        }
        OrderConfigs orderConfigs = this.b;
        if (orderConfigs != null) {
            h(orderConfigs.f9137a, pqbVar);
        }
    }

    public void h(u3o u3oVar, pqb pqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107667dc", new Object[]{this, u3oVar, pqbVar});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.g(u3oVar, pqbVar);
        }
    }

    public void i(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa46f6", new Object[]{this, dXRootView, jSONObject});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.m(dXRootView, jSONObject);
        }
    }

    public void j(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e4c18", new Object[]{this, str, jSONObject});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.d(str, jSONObject);
        }
    }

    public void k(String str, w8 w8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492d64eb", new Object[]{this, str, w8Var});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.h(str, w8Var);
        }
    }

    public void l(Long l, nb5 nb5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90b5405", new Object[]{this, l, nb5Var});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.p(l, nb5Var);
        }
    }

    public void m(Long l, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3d54cd", new Object[]{this, l, dXWidgetNode});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.a(l, dXWidgetNode);
        }
    }

    public void n(String str, rtd rtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e963b7", new Object[]{this, str, rtdVar});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.b(str, rtdVar);
        }
    }

    public void o(String str, z9e z9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d965d39d", new Object[]{this, str, z9eVar});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.f(str, z9eVar);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116c1b7e", new Object[]{this});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.e();
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53b4ce8", new Object[]{this, str});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.n(str);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        wqb wqbVar = this.f9139a;
        if (wqbVar != null) {
            wqbVar.k(this.b.d);
            if (!uel.l("OLRemoveRepeatBindView", true) || !this.b.b().containsKey(OrderConfigs.VIEWPAGER)) {
                this.f9139a.j(this.b.b());
            }
        }
    }
}
