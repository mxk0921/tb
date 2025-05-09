package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.dxv4common.exception.DXParserException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.qvb;
import tb.yl6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d66 implements gwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597875);
        t2o.a(444598021);
    }

    @Override // tb.gwb
    public gwb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwb) ipChange.ipc$dispatch("bc08e17e", new Object[]{this});
        }
        return new d66();
    }

    @Override // tb.gwb
    public DXWidgetNode b(DXWidgetNode dXWidgetNode, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("42717494", new Object[]{this, dXWidgetNode, new Integer(i), dXRenderOptions});
        }
        j(dXWidgetNode);
        v(dXWidgetNode, i, dXRenderOptions);
        return dXWidgetNode;
    }

    public uw5 d(DXWidgetNode dXWidgetNode, ivb ivbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("4f122291", new Object[]{this, dXWidgetNode, ivbVar});
        }
        qvb.a e = e(dXWidgetNode, ivbVar.b());
        if (e == null || !e.f26952a) {
            return null;
        }
        return e.c;
    }

    public qvb.a e(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qvb.a) ipChange.ipc$dispatch("6002c3ab", new Object[]{this, dXWidgetNode, new Integer(i)});
        }
        return e66.b(dXWidgetNode, i);
    }

    public yl6 f(DXWidgetNode dXWidgetNode, String str) {
        DinamicXEngine f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("9e0dba35", new Object[]{this, dXWidgetNode, str});
        }
        if (dXWidgetNode == null || (f = dXWidgetNode.getDXRuntimeContext().s().f()) == null) {
            return null;
        }
        return f.G().a(str);
    }

    public boolean g(DXWidgetNode dXWidgetNode) {
        ivb ivbVar;
        uw5 uw5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2667cfd", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode.getDxv4Properties() != null && dXWidgetNode.getDxv4Properties().g() != null && (ivbVar = dXWidgetNode.getDxv4Properties().g().get(5802348655878590802L)) != null) {
            qvb M = dXWidgetNode.getDXRuntimeContext().s().f().M();
            if (M != null) {
                qvb.a c = M.c(dXWidgetNode.getDXRuntimeContext(), ivbVar.b(), g.s().e(), null);
                if (c.f26952a && (uw5Var = c.c) != null) {
                    dXWidgetNode.setIntAttribute(5802348655878590802L, uw5Var.s());
                }
            }
            uw5 d = d(dXWidgetNode, ivbVar);
            if (d != null && d.F()) {
                dXWidgetNode.setIntAttribute(5802348655878590802L, d.s());
            }
            if (dXWidgetNode.getVisibility() == 2) {
                return true;
            }
            return false;
        } else if (dXWidgetNode.getVisibility() == 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean h(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55ab45ef", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
        if (dXRuntimeContext == null || !dXRuntimeContext.b0()) {
            if (dXWidgetNode.getDxv4Properties() != null && dXWidgetNode.getDxv4Properties().g() != null) {
                return true;
            }
        } else if (dXWidgetNode.getDxv4Properties() != null && dXWidgetNode.getDxv4Properties().g() != null && dXWidgetNode.getStatInPrivateFlags(1) && !dXWidgetNode.getStatInPrivateFlags(2)) {
            return true;
        }
        return false;
    }

    public fc5 i(DXWidgetNode dXWidgetNode, ac5 ac5Var) {
        fc5 fc5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fc5) ipChange.ipc$dispatch("3284baf3", new Object[]{this, dXWidgetNode, ac5Var});
        }
        if (ac5Var.d() != null) {
            fc5Var = ac5Var.d();
        } else {
            fc5Var = new fc5(ac5Var.c(), ac5Var.f(), ac5Var.b());
        }
        if (fc5Var != null) {
            twb twbVar = dXWidgetNode.getDxv4Properties().q().get(ac5Var.e());
            if (twbVar != null) {
                fc5Var.i(dXWidgetNode, twbVar);
            } else if (DinamicXEngine.j0()) {
                throw new DXParserException("动画不存在绑定的响应式变量");
            }
        }
        return fc5Var;
    }

    public void j(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b982e1", new Object[]{this, dXWidgetNode});
        } else if (!dXWidgetNode.getStatInPrivateFlags(131072)) {
            s(dXWidgetNode);
            r(dXWidgetNode);
            k(dXWidgetNode);
            dXWidgetNode.setStatFlag(131072);
        }
    }

    public void k(DXWidgetNode dXWidgetNode) {
        List<ac5> b;
        List<yl6.a> d;
        ac5 ac5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55470ad3", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            sl6 dxv4Properties = dXWidgetNode.getDxv4Properties();
            Map<String, yl6> variableNameMap = dXWidgetNode.getVariableNameMap();
            if (!(dxv4Properties == null || variableNameMap == null || (b = dxv4Properties.b()) == null)) {
                for (Map.Entry<String, yl6> entry : variableNameMap.entrySet()) {
                    String key = entry.getKey();
                    yl6 value = entry.getValue();
                    if (!(key == null || value == null || (d = value.d()) == null || d.isEmpty())) {
                        for (yl6.a aVar : d) {
                            int a2 = aVar.a();
                            if (a2 >= 0 && a2 < b.size() && (ac5Var = b.get(a2)) != null) {
                                ac5Var.g(i(dXWidgetNode, ac5Var));
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean l(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15ceff3", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (!(dXWidgetNode instanceof yg5) || dXWidgetNode.getChildrenCount() != 2) {
            return false;
        }
        yg5 yg5Var = (yg5) dXWidgetNode;
        if (yg5Var.t()) {
            yg5Var.a(yg5Var.removeChildAt(1));
        } else {
            yg5Var.b(yg5Var.removeChildAt(0));
        }
        return true;
    }

    public void m(DXWidgetNode dXWidgetNode, ivb ivbVar, DXWidgetNode dXWidgetNode2, long j) {
        Map<String, twb> q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f7a9b4", new Object[]{this, dXWidgetNode, ivbVar, dXWidgetNode2, new Long(j)});
        } else if (ivbVar.a() != null && ivbVar.a().size() != 0 && (q = dXWidgetNode2.getDxv4Properties().q()) != null) {
            for (String str : ivbVar.a()) {
                twb twbVar = q.get(str);
                if (twbVar != null) {
                    twbVar.d(dXWidgetNode2, j);
                } else if (DinamicXEngine.j0()) {
                    throw new DXParserException(str + " stateProtocol == null ");
                }
            }
        }
    }

    public void n(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973a2287", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        if (z) {
            dXWidgetNode.setStatFlag(4);
        }
        dXWidgetNode.unsetStatFlag(1);
        dXWidgetNode.setStatFlag(2);
    }

    public void o(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b42525", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode.getDXRuntimeContext() == null || !dXWidgetNode.getDXRuntimeContext().b0()) {
            dXWidgetNode.setStatFlag(4096);
            dXWidgetNode.beforeBindChildData();
        } else if (!z) {
        } else {
            if (dXWidgetNode.getStatInPrivateFlags(524288)) {
                if ((dXWidgetNode instanceof j) && ((j) dXWidgetNode).isDataSizeChange()) {
                    dXWidgetNode.beforeBindChildData();
                }
                dXWidgetNode.setStatFlag(4096);
                dXWidgetNode.unsetStatFlag(524288);
            } else if (!dXWidgetNode.getStatInPrivateFlags(4096)) {
                dXWidgetNode.setStatFlag(4096);
                dXWidgetNode.beforeBindChildData();
            }
        }
    }

    public void q(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab599b9", new Object[]{this, dXWidgetNode});
        } else if (!(dXWidgetNode instanceof bi6)) {
        } else {
            if (zg5.B3()) {
                ((bi6) dXWidgetNode).M(1);
            } else {
                ((bi6) dXWidgetNode).M(0);
            }
        }
    }

    public void s(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c02b45d", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode.getDxv4Properties() != null) {
            DXWidgetNode parentWidget = dXWidgetNode.getParentWidget();
            if (!(parentWidget instanceof bi6) || ((bi6) parentWidget).H() != 1) {
                Map<String, yl6> variableNameMap = dXWidgetNode.getVariableNameMap();
                if (variableNameMap != null) {
                    for (Map.Entry<String, yl6> entry : variableNameMap.entrySet()) {
                        if (entry != null) {
                            yl6 value = entry.getValue();
                            boolean t = t(dXWidgetNode, value);
                            byte g = value.g();
                            if (!t && g == 2) {
                                qvb.a e = e(dXWidgetNode, ((tu5) value).q());
                                if (e == null || !e.f26952a) {
                                    value.o(new bm6(null, value.i()));
                                } else {
                                    dm6 c = c(value, e.c);
                                    if (c != null) {
                                        value.o(c);
                                    } else {
                                        value.o(new bm6(null, value.i()));
                                    }
                                }
                            }
                        }
                    }
                    u(dXWidgetNode, dXWidgetNode.getDxv4Properties().e());
                    return;
                }
                return;
            }
            dXWidgetNode.getDxv4Properties().L(parentWidget.queryRootWidgetNode().getVariableNameMap());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean t(com.taobao.android.dinamicx.widget.DXWidgetNode r7, tb.yl6 r8) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 3
            com.android.alibaba.ip.runtime.IpChange r3 = tb.d66.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "fc9c2e8b"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            r7 = 2
            r2[r7] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001f:
            java.util.List r3 = r8.e()
            if (r3 != 0) goto L_0x0026
            return r1
        L_0x0026:
            java.util.Iterator r3 = r3.iterator()
        L_0x002a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007b
            java.lang.Object r4 = r3.next()
            tb.gc5 r4 = (tb.gc5) r4
            if (r4 != 0) goto L_0x0039
            goto L_0x002a
        L_0x0039:
            short r5 = r4.b()
            if (r5 == r0) goto L_0x004e
            if (r5 == r2) goto L_0x0042
            goto L_0x002a
        L_0x0042:
            java.lang.String r8 = r4.a()
            tb.yl6 r7 = r6.f(r7, r8)
            if (r7 == 0) goto L_0x004d
            return r0
        L_0x004d:
            return r1
        L_0x004e:
            int r2 = r4.c()
            tb.qvb$a r7 = r6.e(r7, r2)
            if (r7 == 0) goto L_0x007b
            boolean r2 = r7.f26952a
            if (r2 == 0) goto L_0x007b
            tb.uw5 r7 = r7.c
            if (r7 == 0) goto L_0x007b
            int r2 = r7.x()
            if (r2 <= r0) goto L_0x007b
            tb.dm6 r7 = r6.c(r8, r7)
            if (r7 == 0) goto L_0x007b
            boolean r2 = r7 instanceof tb.bm6
            if (r2 == 0) goto L_0x0077
            java.lang.Object r2 = r7.f()
            if (r2 != 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            r8.o(r7)
            return r0
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.d66.t(com.taobao.android.dinamicx.widget.DXWidgetNode, tb.yl6):boolean");
    }

    public void v(DXWidgetNode dXWidgetNode, int i, DXRenderOptions dXRenderOptions) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2292747", new Object[]{this, dXWidgetNode, new Integer(i), dXRenderOptions});
        } else if (dXWidgetNode != null && !g(dXWidgetNode)) {
            boolean h = h(dXWidgetNode);
            dXWidgetNode.beginParser(h);
            if (dXWidgetNode.getDXRuntimeContext() != null && dXWidgetNode.needParseAP()) {
                dXWidgetNode.parseAp();
            }
            if (h) {
                p(dXWidgetNode);
            }
            n(dXWidgetNode, h);
            if (!l(dXWidgetNode)) {
                q(dXWidgetNode);
                o(dXWidgetNode, h);
            }
            int direction = dXWidgetNode.getDirection();
            for (int i2 = 0; i2 < dXWidgetNode.getChildrenCount(); i2++) {
                DXWidgetNode childAt = dXWidgetNode.getChildAt(i2);
                childAt.getDXRuntimeContext().n0(direction);
                if (childAt.isV4Node() && (!((z = dXWidgetNode instanceof bi6)) || (z && ((bi6) dXWidgetNode).H() == 1))) {
                    childAt.getDxv4Properties().I(dXWidgetNode.getDxv4Properties().q());
                    childAt.getDxv4Properties().C(dXWidgetNode.getDxv4Properties().k());
                    childAt.getDxv4Properties().x(dXWidgetNode.getDxv4Properties().f());
                }
                if (!childAt.isRootNode()) {
                    v(childAt, i, dXRenderOptions);
                } else if (!(childAt.getDXRuntimeContext() == null || childAt.getDXRuntimeContext().o() == null)) {
                    if (i == 2) {
                        childAt.getDXRuntimeContext().o().r(childAt, childAt.getDXRuntimeContext(), dXRenderOptions);
                    } else {
                        childAt.getDXRuntimeContext().o().q(childAt, childAt.getDXRuntimeContext(), dXRenderOptions);
                    }
                }
            }
            dXWidgetNode.endParser(h);
        }
    }

    public dm6 c(yl6 yl6Var, uw5 uw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dm6) ipChange.ipc$dispatch("25bc336e", new Object[]{this, yl6Var, uw5Var});
        }
        if (uw5Var == null) {
            return null;
        }
        switch (yl6Var.i()) {
            case 0:
                return new bm6(uw5Var.z(), (short) 0);
            case 1:
                return new zl6((int) uw5Var.g());
            case 2:
                return new am6(uw5Var.g());
            case 3:
                return new wl6(uw5Var.e());
            case 4:
                if (uw5Var.I()) {
                    return new bm6(null, (short) 4);
                }
                return new bm6(uw5Var.j(), (short) 4);
            case 5:
                if (uw5Var.I()) {
                    return new bm6(null, (short) 4);
                }
                return new bm6(uw5Var.j(), (short) 4);
            case 6:
            case 7:
            case 14:
            default:
                throw new DXParserException("不认识的 类型" + ((int) yl6Var.i()));
            case 8:
                if (uw5Var.I()) {
                    return new bm6(null, (short) 8);
                }
                return new bm6(uw5Var.h(), (short) 8);
            case 9:
                if (uw5Var.I()) {
                    return new bm6(null, (short) 9);
                }
                return new bm6(uw5Var.i(), (short) 9);
            case 10:
                return new bm6(uw5Var.z(), (short) 10);
            case 11:
                if (uw5Var.I()) {
                    return new bm6(null, (short) 11);
                }
                return new zl6((int) uw5Var.g());
            case 12:
                if (uw5Var.I()) {
                    return new bm6(null, (short) 12);
                }
                return new am6(uw5Var.g());
            case 13:
                if (uw5Var.I()) {
                    return new bm6(null, (short) 13);
                }
                return new wl6(uw5Var.e());
            case 15:
                return new vl6(uw5Var.d());
            case 16:
                if (uw5Var.I()) {
                    return new bm6(null, (short) 16);
                }
                return new vl6(uw5Var.d());
            case 17:
                return new xl6(uw5Var.f());
            case 18:
                if (uw5Var.I()) {
                    return new bm6(null, (short) 18);
                }
                return new xl6(uw5Var.f());
        }
    }

    public void u(DXWidgetNode dXWidgetNode, List<og5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f1d369", new Object[]{this, dXWidgetNode, list});
        } else if (list != null) {
            for (og5 og5Var : list) {
                if (og5Var != null) {
                    if (og5Var.a() == 1) {
                        e(dXWidgetNode, ((yv5) og5Var).b());
                    } else {
                        throw new DXParserException("processVariableInitCommand 不认识的command类型： " + ((int) og5Var.a()));
                    }
                }
            }
        }
    }

    public void r(DXWidgetNode dXWidgetNode) {
        yl6.b f;
        byte c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87743e5", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null && dXWidgetNode.getDxv4Properties() != null && dXWidgetNode.getVariableNameMap() != null) {
            HashMap hashMap = null;
            for (Map.Entry<String, yl6> entry : dXWidgetNode.getVariableNameMap().entrySet()) {
                yl6 value = entry.getValue();
                if (!(value == null || value.f() == null || (c = (f = value.f()).c()) == 1)) {
                    if (c == 2) {
                        n96 n96Var = new n96(value);
                        n96Var.g(dXWidgetNode);
                        n96Var.e(dXWidgetNode);
                        if (n96Var.j()) {
                            short a2 = f.a();
                            if (a2 == 1) {
                                n96Var.i(dXWidgetNode.getDXRuntimeContext().i());
                            } else if (a2 == 3) {
                                n96Var.i(value);
                            }
                            n96Var.k(dXWidgetNode.getDxv4Properties().j());
                        }
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(entry.getKey(), n96Var);
                    } else if (DinamicXEngine.j0()) {
                        throw new DXParserException("不认识的响应式类型" + ((int) f.c()));
                    }
                }
            }
            dXWidgetNode.getDxv4Properties().I(hashMap);
        }
    }

    public void p(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc30dc6", new Object[]{this, dXWidgetNode});
            return;
        }
        DXLongSparseArray<ivb> g = dXWidgetNode.getDxv4Properties().g();
        if (g != null) {
            int size = g.size();
            for (int i = 0; i < size; i++) {
                long keyAt = g.keyAt(i);
                ivb valueAt = g.valueAt(i);
                uw5 d = d(dXWidgetNode, valueAt);
                short c = valueAt.c();
                if (c == 1) {
                    if (d != null) {
                        try {
                            if (!d.J() && d.F()) {
                                dXWidgetNode.setIntAttribute(keyAt, d.s());
                            }
                        } catch (Throwable th) {
                            dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                            xv5.e(th);
                        }
                    }
                    dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                } else if (c == 2) {
                    if (d != null) {
                        try {
                            if (!d.J() && d.F()) {
                                dXWidgetNode.setLongAttribute(keyAt, d.u());
                            }
                        } catch (Throwable th2) {
                            dXWidgetNode.setLongAttribute(keyAt, dXWidgetNode.getDefaultValueForLongAttr(keyAt));
                            xv5.e(th2);
                        }
                    }
                    dXWidgetNode.setLongAttribute(keyAt, dXWidgetNode.getDefaultValueForLongAttr(keyAt));
                } else if (c == 4) {
                    if (d != null) {
                        try {
                            if (!d.J() && d.D()) {
                                dXWidgetNode.setDoubleAttribute(keyAt, d.q());
                            }
                        } catch (Throwable th3) {
                            dXWidgetNode.setDoubleAttribute(keyAt, dXWidgetNode.getDefaultValueForDoubleAttr(keyAt));
                            xv5.e(th3);
                        }
                    }
                    dXWidgetNode.setDoubleAttribute(keyAt, dXWidgetNode.getDefaultValueForDoubleAttr(keyAt));
                } else if (c == 8) {
                    if (d != null) {
                        try {
                            if (!d.J() && d.M()) {
                                if (d.w() != null) {
                                    dXWidgetNode.setStringAttribute(keyAt, d.w());
                                } else {
                                    dXWidgetNode.setStringAttribute(keyAt, dXWidgetNode.getDefaultValueForStringAttr(keyAt));
                                }
                            }
                        } catch (Exception e) {
                            dXWidgetNode.setStringAttribute(keyAt, dXWidgetNode.getDefaultValueForStringAttr(keyAt));
                            xv5.e(e);
                        }
                    }
                    dXWidgetNode.setStringAttribute(keyAt, dXWidgetNode.getDefaultValueForStringAttr(keyAt));
                } else if (c == 16) {
                    if (d != null) {
                        try {
                            if (!d.J() && d.M()) {
                                if (d.w() == null) {
                                    dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                                } else {
                                    String w = d.w();
                                    if (!TextUtils.isEmpty(w)) {
                                        dXWidgetNode.setIntAttribute(keyAt, Color.parseColor(w));
                                    } else {
                                        dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            xv5.e(th4);
                        }
                    }
                    dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                } else if (c != 32) {
                    if (c == 128) {
                        if (d != null) {
                            try {
                                if (!d.J() && d.A()) {
                                    JSONArray n = d.n();
                                    if (n != null) {
                                        dXWidgetNode.setListAttribute(keyAt, n);
                                    }
                                }
                            } catch (Exception e2) {
                                dXWidgetNode.setListAttribute(keyAt, dXWidgetNode.getDefaultValueForListAttr(keyAt));
                                xv5.e(e2);
                            }
                        }
                        dXWidgetNode.setListAttribute(keyAt, dXWidgetNode.getDefaultValueForListAttr(keyAt));
                    } else if (c == 256) {
                        if (d != null) {
                            try {
                                if (!d.J() && d.H()) {
                                    JSONObject v = d.v();
                                    if (v instanceof JSONObject) {
                                        dXWidgetNode.setMapAttribute(keyAt, v);
                                    }
                                }
                            } catch (Exception e3) {
                                dXWidgetNode.setMapAttribute(keyAt, dXWidgetNode.getDefaultValueForMapAttr(keyAt));
                                xv5.e(e3);
                            }
                        }
                        dXWidgetNode.setMapAttribute(keyAt, dXWidgetNode.getDefaultValueForMapAttr(keyAt));
                    } else if (c == 1024) {
                        if (d != null) {
                            try {
                                if (!d.J() && d.G()) {
                                    dXWidgetNode.setObjAttribute(keyAt, d.t());
                                }
                            } catch (Exception e4) {
                                dXWidgetNode.setObjAttribute(keyAt, dXWidgetNode.getDefaultValueForObjectAttr(keyAt));
                                xv5.e(e4);
                            }
                        }
                        dXWidgetNode.setObjAttribute(keyAt, dXWidgetNode.getDefaultValueForObjectAttr(keyAt));
                    } else if (DinamicXEngine.j0()) {
                        throw new DXParserException("不支持的数据类型: " + ((int) valueAt.c()));
                    }
                } else if (d != null) {
                    try {
                        if (!d.J()) {
                            float e5 = (float) d.e();
                            if (!(20052926345925L == keyAt || 9346582897824575L == keyAt)) {
                                dXWidgetNode.setIntAttribute(keyAt, pb6.d(dXWidgetNode.getEngine(), dXWidgetNode.getDXRuntimeContext().h(), e5));
                            }
                            if (e5 < 0.0f) {
                                dXWidgetNode.setIntAttribute(keyAt, (int) e5);
                            } else {
                                dXWidgetNode.setIntAttribute(keyAt, pb6.d(dXWidgetNode.getEngine(), dXWidgetNode.getDXRuntimeContext().h(), e5));
                            }
                        }
                    } catch (Exception e6) {
                        dXWidgetNode.setIntAttribute(keyAt, dXWidgetNode.getDefaultValueForIntAttr(keyAt));
                        xv5.e(e6);
                    }
                }
                m(null, valueAt, dXWidgetNode, keyAt);
            }
        }
    }
}
