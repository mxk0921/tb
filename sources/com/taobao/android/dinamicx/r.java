package com.taobao.android.dinamicx;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import tb.bi6;
import tb.gwb;
import tb.pb6;
import tb.t2o;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gwb f7338a;

    static {
        t2o.a(444596586);
    }

    public r() {
        this.f7338a = null;
        if (g.s() != null && g.s().d() != null) {
            this.f7338a = g.s().d().a();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:20|(2:54|21)|(2:56|22)|52|30|(2:32|(1:41)(1:38))(1:42)|51) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
        if (com.taobao.android.dinamicx.DinamicXEngine.j0() != false) goto L_0x00f6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
        r6.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
        ((java.util.ArrayList) r13.getDXRuntimeContext().m().c).add(new com.taobao.android.dinamicx.f.a("Pipeline", "Pipeline_Stage_Load_Binary", com.taobao.android.dinamicx.f.DXERROR_PIPELINE_PARSE_WT_EXPR_SET_VALUE));
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[Catch: Exception -> 0x00de, TryCatch #0 {Exception -> 0x00de, blocks: (B:30:0x009e, B:32:0x00a2, B:34:0x00ac, B:36:0x00b6, B:38:0x00c6, B:41:0x00e0, B:42:0x00e8), top: B:52:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8 A[Catch: Exception -> 0x00de, TRY_LEAVE, TryCatch #0 {Exception -> 0x00de, blocks: (B:30:0x009e, B:32:0x00a2, B:34:0x00ac, B:36:0x00b6, B:38:0x00c6, B:41:0x00e0, B:42:0x00e8), top: B:52:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00f9 -> B:52:0x0110). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.taobao.android.dinamicx.widget.DXWidgetNode r13) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.r.a(com.taobao.android.dinamicx.widget.DXWidgetNode):boolean");
    }

    public final boolean c(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a75ceef4", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode.getDXRuntimeContext().b0() && dXWidgetNode.needParseAP()) {
            dXWidgetNode.parseAp();
        }
        if (dXWidgetNode.getStatInPrivateFlags(2) && !dXWidgetNode.getStatInPrivateFlags(1)) {
            return false;
        }
        b(dXWidgetNode);
        dXWidgetNode.setStatFlag(2);
        return true;
    }

    public final void d(Context context, DXWidgetNode dXWidgetNode, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8aaa5", new Object[]{this, context, dXWidgetNode, new Long(j), obj});
        } else {
            dXWidgetNode.setIntAttribute(j, pb6.p(dXWidgetNode.getEngine(), context, String.valueOf(obj), dXWidgetNode.getDefaultValueForIntAttr(j)));
        }
    }

    public DXWidgetNode e(DXWidgetNode dXWidgetNode, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("dab56c47", new Object[]{this, dXWidgetNode, dXRenderOptions});
        }
        try {
            h(dXWidgetNode, dXRenderOptions);
            return dXWidgetNode;
        } catch (Exception e) {
            xv5.b(e);
            if (dXWidgetNode == null || dXWidgetNode.getDXRuntimeContext() == null) {
                return null;
            }
            dXWidgetNode.getDXRuntimeContext().m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_WIDGETNODE_PARSE_WT_EXCEPTION));
            return null;
        }
    }

    public final boolean f(DXWidgetNode dXWidgetNode) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f729c5b3", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode.getStatInPrivateFlags(1024)) {
            if (dXWidgetNode.getLayoutWidth() == 0 || dXWidgetNode.getLayoutHeight() == 0) {
                b(dXWidgetNode);
                dXWidgetNode.setStatFlag(2);
            }
            if (!(dXWidgetNode.getLayoutWidth() == -2 || dXWidgetNode.getLayoutHeight() == -2)) {
                return false;
            }
        }
        if (zg5.K2()) {
            if (dXWidgetNode.getDXRuntimeContext() == null) {
                z = c(dXWidgetNode);
            } else if (!dXWidgetNode.getDXRuntimeContext().b0() || dXWidgetNode.getStatInPrivateFlags(4) || dXWidgetNode.getStatInPrivateFlags(1) || dXWidgetNode.getStatInPrivateFlags(16384)) {
                z = c(dXWidgetNode);
            }
        } else if (dXWidgetNode.getDXRuntimeContext() != null && zg5.D2(dXWidgetNode.getDXRuntimeContext().N().d) && dXWidgetNode.getDXRuntimeContext().b0() && !dXWidgetNode.getStatInPrivateFlags(4) && !dXWidgetNode.getStatInPrivateFlags(1) && !dXWidgetNode.getStatInPrivateFlags(16384)) {
            return false;
        } else {
            c(dXWidgetNode);
            z = true;
        }
        if (dXWidgetNode instanceof bi6) {
            ((bi6) dXWidgetNode).M(1);
        }
        if (dXWidgetNode.getStatInPrivateFlags(524288)) {
            if ((dXWidgetNode instanceof j) && ((j) dXWidgetNode).isDataSizeChange()) {
                dXWidgetNode.beforeBindChildData();
            }
            dXWidgetNode.setStatFlag(4096);
            dXWidgetNode.unsetStatFlag(524288);
        } else if (!dXWidgetNode.getStatInPrivateFlags(4096)) {
            dXWidgetNode.setStatFlag(4096);
            if (zg5.S2()) {
                dXWidgetNode.beforeBindChildData();
            } else if (dXWidgetNode.getChildrenCount() > 0) {
                dXWidgetNode.beforeBindChildData();
            }
        }
        return z;
    }

    public void g(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dad83a2", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && !a(dXWidgetNode)) {
            c(dXWidgetNode);
            if (z) {
                n(dXWidgetNode, true);
            }
        }
    }

    public final void h(DXWidgetNode dXWidgetNode, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        try {
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49104b16", new Object[]{this, dXWidgetNode, dXRenderOptions});
                return;
            }
            try {
                if (DXTraceUtil.e()) {
                    DXTraceUtil.b(dXWidgetNode.getClass().getSimpleName() + " simpleparser id: " + dXWidgetNode.getUserId());
                }
                dXWidgetNode.beginParser(true);
                dXWidgetNode.unsetStatFlag(1024);
                if (!a(dXWidgetNode)) {
                    if (dXWidgetNode.getDXRuntimeContext().b0() && dXWidgetNode.needParseAP()) {
                        dXWidgetNode.setStatFlag(4);
                    }
                    boolean f = f(dXWidgetNode);
                    int direction = dXWidgetNode.getDirection();
                    for (int i = 0; i < dXWidgetNode.getChildrenCount(); i++) {
                        DXWidgetNode childAt = dXWidgetNode.getChildAt(i);
                        childAt.getDXRuntimeContext().n0(direction);
                        if (!childAt.isV4Node() || !childAt.isRootNode()) {
                            h(childAt, dXRenderOptions);
                        } else {
                            this.f7338a.b(childAt, 2, dXRenderOptions);
                        }
                    }
                    n(dXWidgetNode, f);
                    dXWidgetNode.endParser(true);
                    if (DXTraceUtil.e()) {
                        DXTraceUtil.c();
                    }
                } else if (DXTraceUtil.e()) {
                    DXTraceUtil.c();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable th) {
            if (DXTraceUtil.e()) {
                DXTraceUtil.c();
            }
            throw th;
        }
    }

    public final void i(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187814b9", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setDoubleAttribute(j, dXWidgetNode.getDefaultValueForDoubleAttr(j));
        }
    }

    public final void j(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61679a30", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setIntAttribute(j, dXWidgetNode.getDefaultValueForIntAttr(j));
        }
    }

    public final void k(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec4990c", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setListAttribute(j, dXWidgetNode.getDefaultValueForListAttr(j));
        }
    }

    public final void l(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a272eee", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setLongAttribute(j, dXWidgetNode.getDefaultValueForLongAttr(j));
        }
    }

    public final void m(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad17ad2", new Object[]{this, dXWidgetNode, new Long(j)});
        } else {
            dXWidgetNode.setMapAttribute(j, dXWidgetNode.getDefaultValueForMapAttr(j));
        }
    }

    public final void n(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e362c22b", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        dXWidgetNode.unsetStatFlag(1);
        dXWidgetNode.setStatFlag(32768);
        if (z) {
            dXWidgetNode.setStatFlag(4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.taobao.android.dinamicx.widget.DXWidgetNode r17) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.r.b(com.taobao.android.dinamicx.widget.DXWidgetNode):void");
    }
}
