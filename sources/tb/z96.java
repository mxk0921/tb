package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.qvb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z96 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static r f32626a;
    public static d66 b;

    static {
        t2o.a(444597561);
    }

    public static bi6 b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bi6) ipChange.ipc$dispatch("d08558d", new Object[]{dXWidgetNode});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        while (dXWidgetNode.getParentWidget() != null) {
            DXWidgetNode parentWidget = dXWidgetNode.getParentWidget();
            if ((dXWidgetNode instanceof bi6) && (parentWidget instanceof DXRecyclerLayout)) {
                return (bi6) dXWidgetNode;
            }
            dXWidgetNode = parentWidget;
        }
        return null;
    }

    public static void c(bi6 bi6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c9c37b", new Object[]{bi6Var});
            return;
        }
        if (f32626a == null) {
            f32626a = new r();
        }
        f32626a.g(bi6Var, true);
        if (!TextUtils.isEmpty(bi6Var.B())) {
            bi6Var.N();
        }
    }

    public static void e(bi6 bi6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9cc410", new Object[]{bi6Var});
        } else if (!TextUtils.isEmpty(bi6Var.B())) {
            bi6Var.N();
        } else if (bi6Var.getDataParsersExprNode() != null) {
            if (bi6Var.getDataParsersExprNode().get(36442092789L) != null) {
                try {
                    Object b2 = bi6Var.getDataParsersExprNode().get(36442092789L).b(null, bi6Var.getDXRuntimeContext());
                    if (b2 instanceof String) {
                        bi6Var.setStringAttribute(36442092789L, String.valueOf(b2));
                    }
                } catch (Exception unused) {
                }
            }
            if (bi6Var.getDataParsersExprNode().get(5435381891761953165L) != null) {
                try {
                    Object b3 = bi6Var.getDataParsersExprNode().get(5435381891761953165L).b(null, bi6Var.getDXRuntimeContext());
                    if (b3 != null) {
                        bi6Var.setStringAttribute(5435381891761953165L, String.valueOf(b3));
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static void f(bi6 bi6Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0a84b1", new Object[]{bi6Var, new Integer(i)});
        } else if (!zg5.B4()) {
            e(bi6Var);
        } else if (bi6Var.isV4Node()) {
            if (!(bi6Var.getDxv4Properties().g() == null || !(bi6Var.getParentWidget() instanceof DXRecyclerLayout) || bi6Var.getDxv4Properties().g().get(10297924263834610L) == null)) {
                try {
                    qvb.a b2 = e66.b(bi6Var, bi6Var.getDxv4Properties().g().get(10297924263834610L).b());
                    if (b2.f26952a) {
                        bi6Var.setStringAttribute(10297924263834610L, b2.c.j());
                        if (!TextUtils.isEmpty(bi6Var.getUserId())) {
                            ((DXRecyclerLayout) bi6Var.getParentWidget()).W().put(bi6Var.getUserId(), Integer.valueOf(i));
                        }
                    }
                } catch (Exception e) {
                    xv5.b(e);
                }
            }
            bi6Var.S(i);
            d(bi6Var);
        } else {
            if (!(bi6Var.getDataParsersExprNode() == null || !(bi6Var.getParentWidget() instanceof DXRecyclerLayout) || bi6Var.getDataParsersExprNode().get(10297924263834610L) == null)) {
                try {
                    Object b3 = bi6Var.getDataParsersExprNode().get(10297924263834610L).b(null, bi6Var.getDXRuntimeContext());
                    if (b3 instanceof String) {
                        bi6Var.setStringAttribute(10297924263834610L, String.valueOf(b3));
                    }
                    if (!TextUtils.isEmpty(bi6Var.getUserId())) {
                        ((DXRecyclerLayout) bi6Var.getParentWidget()).W().put(bi6Var.getUserId(), Integer.valueOf(i));
                    }
                } catch (Exception unused) {
                }
            }
            bi6Var.S(i);
            c(bi6Var);
        }
    }

    public static void d(bi6 bi6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c27e5d", new Object[]{bi6Var});
            return;
        }
        if (b == null) {
            b = new d66();
        }
        b.p(bi6Var);
        b.n(bi6Var, true);
        if (!TextUtils.isEmpty(bi6Var.B())) {
            throw new RuntimeException("slot 相关的还未处理");
        }
    }

    public static boolean a(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb503c1f", new Object[]{dXWidgetNode, dXRuntimeContext})).booleanValue();
        }
        uw5 uw5Var = null;
        Object obj = null;
        uw5Var = null;
        if (dXWidgetNode.isV4Node()) {
            if (dXWidgetNode.getDxv4Properties().g() == null) {
                return ((bi6) dXWidgetNode).v() != 0;
            }
            if (dXWidgetNode.getDxv4Properties().g().get(754805L) == null) {
                return true;
            }
            try {
                qvb.a a2 = e66.a(dXRuntimeContext, dXWidgetNode.getDxv4Properties().g().get(754805L).b());
                if (a2.f26952a) {
                    uw5Var = a2.c;
                }
            } catch (Exception unused) {
            }
            if (uw5Var != null) {
                return uw5Var.d();
            }
            return false;
        } else if (dXWidgetNode.getDataParsersExprNode() == null) {
            return ((bi6) dXWidgetNode).v() != 0;
        } else {
            if (dXWidgetNode.getDataParsersExprNode().get(bi6.DXTEMPLATE_IF) == null) {
                return true;
            }
            try {
                obj = dXWidgetNode.getDataParsersExprNode().get(bi6.DXTEMPLATE_IF).b(null, dXRuntimeContext);
            } catch (Exception unused2) {
            }
            if (obj instanceof String) {
                return "true".equalsIgnoreCase((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return false;
        }
    }
}
