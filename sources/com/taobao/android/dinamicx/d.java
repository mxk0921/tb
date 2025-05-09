package com.taobao.android.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.f;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.dinamicx.widget.r;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import tb.ad5;
import tb.av5;
import tb.bwb;
import tb.dh5;
import tb.eb5;
import tb.fe5;
import tb.gwb;
import tb.h36;
import tb.he5;
import tb.ic5;
import tb.j66;
import tb.je5;
import tb.jyc;
import tb.kd5;
import tb.la6;
import tb.lxb;
import tb.m76;
import tb.p38;
import tb.pb6;
import tb.qub;
import tb.rl6;
import tb.s4z;
import tb.sn6;
import tb.t2o;
import tb.wd5;
import tb.xd5;
import tb.xk9;
import tb.xv5;
import tb.zh6;
import tb.zm6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d extends ad5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final q c;
    public final p d;
    public final fe5 e = new fe5();

    static {
        t2o.a(444596476);
    }

    public d(av5 av5Var, p pVar) {
        super(av5Var);
        q qVar = new q();
        this.c = qVar;
        new l();
        this.d = pVar;
        new m76((gwb) null, qVar);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXButterV35RenderPipeline");
    }

    public DXLongSparseArray<qub> A(DXLongSparseArray<qub> dXLongSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLongSparseArray) ipChange.ipc$dispatch("11e89985", new Object[]{this, dXLongSparseArray});
        }
        if (dXLongSparseArray == null) {
            return null;
        }
        DXLongSparseArray<qub> dXLongSparseArray2 = new DXLongSparseArray<>(50);
        for (int i = 0; i < dXLongSparseArray.size(); i++) {
            long keyAt = dXLongSparseArray.keyAt(i);
            qub valueAt = dXLongSparseArray.valueAt(i);
            if (keyAt == p38.DXTEXTVIEW_TEXTVIEW) {
                dXLongSparseArray2.put(keyAt, new sn6(new je5.a(), this.e.b(keyAt)));
            } else if (keyAt == 6637736565700605658L) {
                dXLongSparseArray2.put(keyAt, new sn6(new xd5.a(), this.e.b(keyAt)));
            } else if (keyAt == -7675176749284896753L) {
                dXLongSparseArray2.put(keyAt, new sn6(new wd5.a(), this.e.b(keyAt)));
            } else if (keyAt == 7821310614898040L) {
                dXLongSparseArray2.put(keyAt, new sn6(new he5.a(), this.e.b(keyAt)));
            } else if (keyAt == 7700670404894374791L) {
                dXLongSparseArray2.put(keyAt, new sn6(new f.d(), this.e.b(keyAt)));
            } else if (keyAt == 8840950490744612256L) {
                dXLongSparseArray2.put(keyAt, new sn6(new f.d(), this.e.b(keyAt)));
            } else if (this.e.b(keyAt) != null) {
                dXLongSparseArray2.put(keyAt, new sn6(valueAt, this.e.b(keyAt)));
            }
        }
        if (g.j() != null) {
            DXLongSparseArray<qub> j = g.j();
            for (int i2 = 0; i2 < j.size(); i2++) {
                long keyAt2 = j.keyAt(i2);
                qub valueAt2 = j.valueAt(i2);
                if ((valueAt2 instanceof rl6.a) || (valueAt2 instanceof r.a) || (valueAt2 instanceof s4z.a)) {
                    dXLongSparseArray2.put(keyAt2, valueAt2);
                } else {
                    dXLongSparseArray2.put(keyAt2, new sn6(valueAt2, this.e.b(keyAt2)));
                }
            }
        }
        return dXLongSparseArray2;
    }

    public qub B(long j, qub qubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qub) ipChange.ipc$dispatch("64014dcd", new Object[]{this, new Long(j), qubVar});
        }
        if (qubVar == null) {
            return null;
        }
        lxb b = this.e.b(j);
        if (b != null) {
            return new sn6(qubVar, b);
        }
        return new sn6(qubVar, this.e.a());
    }

    public final void g(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb8f747", new Object[]{this, viewGroup, view});
            return;
        }
        xk9 j = j(viewGroup);
        if (viewGroup instanceof jyc) {
            if (view.getParent() == null) {
                viewGroup.addView(view, j.a());
            }
            j.b();
        } else if (viewGroup.getTag(DXWidgetNode.TAG_WIDGET_NODE) instanceof r) {
            if (view.getParent() == null) {
                viewGroup.addView(view, j.a());
            }
            j.b();
        } else {
            throw new RuntimeException("ViewGroup is incompatible");
        }
    }

    public DXResult<DXRootView> h(Context context, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("bd8754da", new Object[]{this, context, dXTemplateItem});
        }
        DXButterRootView dXButterRootView = new DXButterRootView(context);
        dXButterRootView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        dXButterRootView.setDxTemplateItem(dXTemplateItem);
        dXButterRootView.setBindingXManagerWeakReference(this.b.f().p);
        return new DXResult<>(dXButterRootView);
    }

    public final void i(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8b5c38", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            try {
                DXTemplateItem p = dXRuntimeContext.p();
                DXEngineConfig d = d();
                if (d != null && !d.y() && m() != null && p != null) {
                    m().k(p);
                    q(dXRuntimeContext, 1000);
                }
            } catch (Exception e) {
                if (DinamicXEngine.j0()) {
                    e.printStackTrace();
                }
            }
        }
    }

    public xk9 j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xk9) ipChange.ipc$dispatch("6726f9e5", new Object[]{this, view});
        }
        if (view instanceof jyc) {
            return ((jyc) view).getFlattenHolder();
        }
        Object tag = view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
        if (tag instanceof r) {
            return ((r) tag).v();
        }
        throw new RuntimeException("getFlattenHolder error ViewGroup is incompatible");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[Catch: Exception -> 0x0094, TryCatch #1 {Exception -> 0x0094, blocks: (B:19:0x0070, B:21:0x0079, B:23:0x008f, B:26:0x0096, B:28:0x009c), top: B:36:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[Catch: Exception -> 0x0094, TRY_LEAVE, TryCatch #1 {Exception -> 0x0094, blocks: (B:19:0x0070, B:21:0x0079, B:23:0x008f, B:26:0x0096, B:28:0x009c), top: B:36:0x0070 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(com.taobao.android.dinamicx.widget.DXWidgetNode r8, boolean r9, com.taobao.android.dinamicx.DXRuntimeContext r10) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "Pipeline_Stage_Load_Binary"
            java.lang.String r2 = "Pipeline"
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.dinamicx.d.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x002b
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r9)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r0] = r7
            r0 = 1
            r9[r0] = r8
            r8 = 2
            r9[r8] = r1
            r8 = 3
            r9[r8] = r10
            java.lang.String r8 = "7d213be7"
            java.lang.Object r8 = r3.ipc$dispatch(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            return r8
        L_0x002b:
            if (r9 == 0) goto L_0x00bd
            boolean r9 = r8.isViewStub()
            if (r9 == 0) goto L_0x00bd
            tb.fw5 r9 = r8.getViewStubExprNode()
            r3 = 0
            tb.o4c r4 = tb.gw5.e()     // Catch: Exception -> 0x0052
            r4.d(r9, r3, r10)     // Catch: Exception -> 0x0052
            com.taobao.android.dinamicx.DXRuntimeContext r4 = r8.getDXRuntimeContext()     // Catch: Exception -> 0x0052
            java.lang.Object r4 = r9.b(r3, r4)     // Catch: Exception -> 0x0052
            tb.o4c r5 = tb.gw5.e()     // Catch: Exception -> 0x004f
            r5.b(r9, r3, r10)     // Catch: Exception -> 0x004f
            goto L_0x0070
        L_0x004f:
            r9 = move-exception
            r3 = r4
            goto L_0x0053
        L_0x0052:
            r9 = move-exception
        L_0x0053:
            boolean r4 = com.taobao.android.dinamicx.DinamicXEngine.j0()
            if (r4 == 0) goto L_0x005c
            r9.printStackTrace()
        L_0x005c:
            com.taobao.android.dinamicx.f r9 = r10.m()
            java.util.List<com.taobao.android.dinamicx.f$a> r9 = r9.c
            com.taobao.android.dinamicx.f$a r4 = new com.taobao.android.dinamicx.f$a
            r5 = 71002(0x1155a, float:9.9495E-41)
            r4.<init>(r2, r1, r5)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r4)
            r4 = r3
        L_0x0070:
            boolean r9 = r4 instanceof java.lang.String     // Catch: Exception -> 0x0094
            r5 = 5802348655878590802(0x5086155c409bd152, double:8.182680092428053E79)
            if (r9 == 0) goto L_0x009c
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch: Exception -> 0x0094
            com.taobao.android.dinamicx.model.DXLongSparseArray r3 = r8.getEnumMap()     // Catch: Exception -> 0x0094
            java.lang.Object r3 = r3.get(r5)     // Catch: Exception -> 0x0094
            java.util.Map r3 = (java.util.Map) r3     // Catch: Exception -> 0x0094
            java.lang.Object r9 = r3.get(r9)     // Catch: Exception -> 0x0094
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: Exception -> 0x0094
            if (r9 != 0) goto L_0x0096
            int r8 = r8.getDefaultValueForIntAttr(r5)     // Catch: Exception -> 0x0094
            goto L_0x009a
        L_0x0094:
            r8 = move-exception
            goto L_0x00a1
        L_0x0096:
            int r8 = r9.intValue()     // Catch: Exception -> 0x0094
        L_0x009a:
            r0 = r8
            goto L_0x00bd
        L_0x009c:
            int r8 = r8.getDefaultValueForIntAttr(r5)     // Catch: Exception -> 0x0094
            goto L_0x009a
        L_0x00a1:
            boolean r9 = com.taobao.android.dinamicx.DinamicXEngine.j0()
            if (r9 == 0) goto L_0x00aa
            r8.printStackTrace()
        L_0x00aa:
            com.taobao.android.dinamicx.f r8 = r10.m()
            java.util.List<com.taobao.android.dinamicx.f$a> r8 = r8.c
            com.taobao.android.dinamicx.f$a r9 = new com.taobao.android.dinamicx.f$a
            r10 = 71003(0x1155b, float:9.9496E-41)
            r9.<init>(r2, r1, r10)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.add(r9)
        L_0x00bd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.d.k(com.taobao.android.dinamicx.widget.DXWidgetNode, boolean, com.taobao.android.dinamicx.DXRuntimeContext):int");
    }

    public DXResult<DXRootView> l(DXButterRootView dXButterRootView, DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("abeb9cc4", new Object[]{this, dXButterRootView, dXRuntimeContext, new Integer(i)});
        }
        DXRootView f = zm6.g().f(dXRuntimeContext.h(), dXRuntimeContext.c(), dXRuntimeContext.A());
        if (f == null || f.getWidgetNode() == null) {
            return null;
        }
        dXButterRootView.cloneWithCacheView(f);
        DXRuntimeContext dXRuntimeContext2 = f.getWidgetNode().getDXRuntimeContext();
        dXRuntimeContext2.o.q = new WeakReference<>(dXButterRootView);
        dXRuntimeContext2.o.k = new WeakReference<>(this);
        dXRuntimeContext2.p.f7293a = dXRuntimeContext.p();
        dXRuntimeContext2.p.c = dXRuntimeContext.m();
        dXRuntimeContext2.p.b = dXRuntimeContext.i();
        dXRuntimeContext2.o.m = dXRuntimeContext.q();
        dXRuntimeContext2.o.n = dXRuntimeContext.S();
        dXRuntimeContext2.o.c = dXRuntimeContext.J();
        dXRuntimeContext2.o.f22533a = dXRuntimeContext.M();
        dXRuntimeContext2.o.b = dXRuntimeContext.K();
        return new DXResult<>(dXButterRootView);
    }

    public p m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("97fdb6a9", new Object[]{this});
        }
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (r10 != 2) goto L_0x0092;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(com.taobao.android.dinamicx.widget.DXWidgetNode r7, android.view.ViewGroup r8, boolean r9, com.taobao.android.dinamicx.DXRuntimeContext r10, com.taobao.android.dinamicx.DXRenderOptions r11, boolean r12, boolean r13) {
        /*
            r6 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.dinamicx.d.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x003e
            java.lang.Boolean r5 = new java.lang.Boolean
            r5.<init>(r9)
            java.lang.Boolean r9 = new java.lang.Boolean
            r9.<init>(r12)
            java.lang.Boolean r12 = new java.lang.Boolean
            r12.<init>(r13)
            r13 = 8
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r3] = r6
            r13[r2] = r7
            r13[r1] = r8
            r13[r0] = r5
            r7 = 4
            r13[r7] = r10
            r7 = 5
            r13[r7] = r11
            r7 = 6
            r13[r7] = r9
            r7 = 7
            r13[r7] = r12
            java.lang.String r7 = "432944aa"
            java.lang.Object r7 = r4.ipc$dispatch(r7, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x003e:
            int r11 = r11.f()
            if (r11 == r1) goto L_0x0049
            int r9 = r6.k(r7, r9, r10)
            goto L_0x004a
        L_0x0049:
            r9 = 0
        L_0x004a:
            int r10 = r7.getStatus()
            r4 = 5802348655878590802(0x5086155c409bd152, double:8.182680092428053E79)
            r11 = -1
            if (r10 == r11) goto L_0x005b
            if (r10 == r2) goto L_0x0086
            if (r10 == r1) goto L_0x0086
            goto L_0x0092
        L_0x005b:
            if (r9 != r1) goto L_0x0061
            r7.setIntAttribute(r4, r9)
            return r2
        L_0x0061:
            android.content.Context r10 = r8.getContext()
            r7.beginSetConstAttribute(r10)
            r6.v(r7)
            android.content.Context r8 = r8.getContext()
            r7.endSetConstAttribute(r8)
            if (r12 == 0) goto L_0x0078
            r7.setAccessibility(r1)
            goto L_0x0083
        L_0x0078:
            if (r13 == 0) goto L_0x0083
            int r8 = r7.getAccessibility()
            if (r8 != r11) goto L_0x0083
            r7.setAccessibility(r0)
        L_0x0083:
            r7.updateStatus(r2)
        L_0x0086:
            boolean r8 = r7.isViewStub()
            if (r8 == 0) goto L_0x008f
            r7.setIntAttribute(r4, r9)
        L_0x008f:
            if (r9 != r1) goto L_0x0092
            return r2
        L_0x0092:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.d.n(com.taobao.android.dinamicx.widget.DXWidgetNode, android.view.ViewGroup, boolean, com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.DXRenderOptions, boolean, boolean):boolean");
    }

    public final boolean o(DXRuntimeContext dXRuntimeContext) {
        f m;
        List<f.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc0afc04", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        if (dXRuntimeContext.Y() && (m = dXRuntimeContext.m()) != null && (list = m.c) != null && list.size() > 0) {
            for (f.a aVar : m.c) {
                if (aVar.d == 70044) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(DXRuntimeContext dXRuntimeContext, int i) {
        j66 j66Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2aa3a2", new Object[]{this, dXRuntimeContext, new Integer(i)});
        } else if (f().f() != null && (j66Var = f().f().n) != null && dXRuntimeContext != null) {
            zh6 zh6Var = new zh6();
            zh6Var.f32770a = dXRuntimeContext.p();
            zh6Var.d = dXRuntimeContext.q();
            zh6Var.b = dXRuntimeContext.i();
            zh6Var.c = i;
            j66Var.i(zh6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fc, code lost:
        if (r24.Y() != false) goto L_0x01fe;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fe, code lost:
        tb.ic5.p(r24.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02b9, code lost:
        if (r24.Y() == false) goto L_0x02bd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02bd, code lost:
        return r23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View t(com.taobao.android.dinamicx.DXButterRootView r23, com.taobao.android.dinamicx.DXRuntimeContext r24, com.taobao.android.dinamicx.DXRenderOptions r25) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.d.t(com.taobao.android.dinamicx.DXButterRootView, com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.DXRenderOptions):android.view.View");
    }

    public final void u(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995a80ca", new Object[]{this, dXRootView});
            return;
        }
        try {
            kd5 bindingXManager = dXRootView.getBindingXManager();
            if (bindingXManager != null) {
                bindingXManager.y(dXRootView);
            }
        } catch (Exception e) {
            xv5.b(e);
            f fVar = new f(c());
            fVar.d = true;
            fVar.c.add(new f.a("Pipeline", "Pipeline_Stage_Reset_Bindingx", f.RESET_ANIMATION_CRASH, xv5.a(e)));
            ic5.p(fVar);
        }
    }

    public void v(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a63c8ed", new Object[]{this, dXWidgetNode});
            return;
        }
        LongSparseArray<dh5> constAttributeMap = dXWidgetNode.getConstAttributeMap();
        if (constAttributeMap != null) {
            int size = constAttributeMap.size();
            for (int i = 0; i < size; i++) {
                dh5 valueAt = constAttributeMap.valueAt(i);
                short s = valueAt.b;
                if (s != 1) {
                    if (s == 2) {
                        dXWidgetNode.setLongAttribute(valueAt.f17811a, valueAt.d);
                    } else if (s == 4) {
                        dXWidgetNode.setDoubleAttribute(valueAt.f17811a, Double.longBitsToDouble(valueAt.d));
                    } else if (s == 8) {
                        String str = valueAt.e;
                        if (TextUtils.isEmpty(str)) {
                            List<f.a> list = dXWidgetNode.getDXRuntimeContext().m().c;
                            list.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_CREATE_WT_CREATE_NODE_STRING_ERROR, "className" + dXWidgetNode.getClass().getName() + " key " + valueAt.f17811a + " value " + valueAt.d));
                            la6.b(" DXBinaryLoader createWidgetTree error 70018");
                            return;
                        }
                        dXWidgetNode.setStringAttribute(valueAt.f17811a, str);
                    } else if (s != 16) {
                        if (s == 32) {
                            double longBitsToDouble = Double.longBitsToDouble(valueAt.d);
                            dXWidgetNode.setIntAttribute(valueAt.f17811a, pb6.d(dXWidgetNode.getDXRuntimeContext().r(), dXWidgetNode.getDXRuntimeContext().h(), (float) longBitsToDouble));
                            dXWidgetNode.initScreenAttrNodeArray(size);
                            if (dXWidgetNode.getScreenAttrNodeArray() != null) {
                                dXWidgetNode.getScreenAttrNodeArray().put(valueAt.f17811a, Double.valueOf(longBitsToDouble));
                            }
                        } else if (s != 64) {
                            JSONObject jSONObject = null;
                            r13 = null;
                            JSONArray jSONArray = null;
                            jSONObject = null;
                            if (s == 128) {
                                try {
                                    jSONArray = JSON.parseArray(valueAt.e);
                                } catch (Exception e) {
                                    if (DinamicXEngine.j0()) {
                                        e.printStackTrace();
                                    }
                                }
                                if (jSONArray == null) {
                                    dXWidgetNode.getDXRuntimeContext().m().c.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_CREATE_WT_CREATE_NODE_LIST_ERROR, "className".concat(dXWidgetNode.getClass().getName())));
                                    la6.b(" DXBinaryLoader createWidgetTree error 70019");
                                    return;
                                }
                                dXWidgetNode.setListAttribute(valueAt.f17811a, jSONArray);
                            } else if (s == 256) {
                                try {
                                    jSONObject = JSON.parseObject(valueAt.e);
                                } catch (Exception e2) {
                                    if (DinamicXEngine.j0()) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (jSONObject == null) {
                                    List<f.a> list2 = dXWidgetNode.getDXRuntimeContext().m().c;
                                    list2.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", 70020, "className" + dXWidgetNode.getClass().getName() + " key " + valueAt.f17811a + " value " + valueAt.d));
                                    la6.b(" DXBinaryLoader createWidgetTree error 70020");
                                    return;
                                }
                                dXWidgetNode.setMapAttribute(valueAt.f17811a, jSONObject);
                            } else if (s != 512) {
                                if (s != 2048) {
                                    continue;
                                } else {
                                    String str2 = valueAt.e;
                                    if (TextUtils.isEmpty(str2)) {
                                        List<f.a> list3 = dXWidgetNode.getDXRuntimeContext().m().c;
                                        list3.add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_CREATE_WT_CREATE_NODE_WIDGET_ERROR_70043, "className" + dXWidgetNode.getClass().getName() + " key " + valueAt.f17811a + " value " + valueAt.d));
                                        la6.b(" DXBinaryLoader createWidgetTree error 70043");
                                        return;
                                    }
                                    dXWidgetNode.setStringAttribute(valueAt.f17811a, str2);
                                }
                            }
                        } else {
                            dXWidgetNode.setIntAttribute(valueAt.f17811a, pb6.f(dXWidgetNode.getDXRuntimeContext().h(), (float) Double.longBitsToDouble(valueAt.d)));
                        }
                    }
                }
                dXWidgetNode.setIntAttribute(valueAt.f17811a, valueAt.c);
            }
            if (dXWidgetNode.getScreenAttrNodeArray() != null) {
                dXWidgetNode.setStatFlag(2097152);
            }
        }
    }

    public void w(DXWidgetNode dXWidgetNode, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c1642f", new Object[]{this, dXWidgetNode, viewGroup});
            return;
        }
        if (DXTraceUtil.f()) {
            DXTraceUtil.b("DX-Choreographer-PROGRESSIVE-RENDER name=" + dXWidgetNode.getDXRuntimeContext().p().f7343a);
        }
        j(viewGroup).c();
        r(dXWidgetNode, viewGroup, DXRenderOptions.DEFAULT_RENDER_OPTIONS, false, false);
        if (DXTraceUtil.f()) {
            DXTraceUtil.c();
        }
    }

    public void x(DXWidgetNode dXWidgetNode, ViewGroup viewGroup, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59bc4711", new Object[]{this, dXWidgetNode, viewGroup, dXRenderOptions});
            return;
        }
        if (DXTraceUtil.f()) {
            DXTraceUtil.b("DX-Choreographer-PROGRESSIVE-RENDER name=" + dXWidgetNode.getDXRuntimeContext().p().f7343a);
        }
        if (viewGroup instanceof jyc) {
            ((jyc) viewGroup).getFlattenHolder().c();
        }
        r(dXWidgetNode, viewGroup, dXRenderOptions, false, false);
        if (DXTraceUtil.f()) {
            DXTraceUtil.c();
        }
    }

    public final void y(f fVar, String str, int i, String str2, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55426869", new Object[]{this, fVar, str, new Integer(i), str2, map, new Boolean(z)});
        } else if (fVar != null && fVar.c != null) {
            f.a aVar = new f.a("Pipeline", str, i);
            aVar.e = str2;
            aVar.f = map;
            fVar.c.add(aVar);
            if (z) {
                ic5.p(fVar);
            }
        }
    }

    public final void z(DXButterRootView dXButterRootView, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3caea887", new Object[]{this, dXButterRootView, dXWidgetNode});
            return;
        }
        ViewGroup.LayoutParams layoutParams = dXButterRootView.getLayoutParams();
        if (layoutParams == null) {
            dXButterRootView.setLayoutParams(new ViewGroup.LayoutParams(dXWidgetNode.getLayoutWidth(), dXWidgetNode.getLayoutHeight()));
            return;
        }
        if (!dXButterRootView.skipSetWidthLayoutParams) {
            layoutParams.width = dXWidgetNode.getLayoutWidth();
        } else {
            dXButterRootView.setSkipSetWidthLayoutParams(false);
        }
        if (!dXButterRootView.skipSetHeightLayoutParams) {
            layoutParams.height = dXWidgetNode.getLayoutHeight();
        } else {
            dXButterRootView.setSkipSetHeightLayoutParams(false);
        }
    }

    public final DXWidgetNode p(DXRuntimeContext dXRuntimeContext, DXButterRootView dXButterRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5fe6f040", new Object[]{this, dXRuntimeContext, dXButterRootView});
        }
        DXWidgetNode expandWidgetNode = dXButterRootView.getExpandWidgetNode();
        if (expandWidgetNode != null) {
            return expandWidgetNode;
        }
        DXTraceUtil.b("DX-Choreographer-BinaryLoader");
        DXWidgetNode r = this.d.r(dXRuntimeContext);
        if (o(dXRuntimeContext)) {
            dXButterRootView.setV3(true);
            la6.b("降级到V3");
            return null;
        } else if (r == null) {
            y(dXRuntimeContext.m(), "Pipeline_Render", 40002, "获取原型树失败", null, false);
            la6.b("40002获取原型树失败");
            return null;
        } else {
            DXWidgetNode shallowButterClone = r.shallowButterClone(dXRuntimeContext);
            dXButterRootView.setWidgetNode(shallowButterClone);
            DXTraceUtil.c();
            return shallowButterClone;
        }
    }

    public DXResult<DXRootView> s(DXButterRootView dXButterRootView, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        DXResult<DXRootView> l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("278e5b29", new Object[]{this, dXButterRootView, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        if (dXButterRootView == null) {
            return null;
        }
        la6.b("butter 开始渲染 tpl: " + dXRuntimeContext.R() + " renderType: " + dXRenderOptions.f() + " isControlEvent: " + dXRenderOptions.k());
        u(dXButterRootView);
        dXButterRootView.data = dXRuntimeContext.i();
        dXButterRootView.setPosition(i);
        dXButterRootView.parentWidthSpec = dXRenderOptions.i();
        dXButterRootView.parentHeightSpec = dXRenderOptions.b();
        dXButterRootView.useSysMeasureSpec = dXRuntimeContext.f().I();
        dXButterRootView.dxTemplateItem = dXRuntimeContext.p();
        if (!dXRenderOptions.n() || dXButterRootView.getChildCount() != 0 || dXRenderOptions.f() != 0 || (l = l(dXButterRootView, dXRuntimeContext, i)) == null) {
            View t = t(dXButterRootView, dXRuntimeContext, dXRenderOptions);
            DXResult<DXRootView> dXResult = new DXResult<>();
            if (t instanceof DXRootView) {
                dXResult.i((DXRootView) t);
            }
            dXResult.e(dXRuntimeContext.m());
            return dXResult;
        }
        if (DinamicXEngine.j0() || eb5.C()) {
            Log.e(h36.TAG, "命中 preRenderX" + dXRuntimeContext.p());
        }
        l.g(2);
        return l;
    }

    public void r(DXWidgetNode dXWidgetNode, ViewGroup viewGroup, DXRenderOptions dXRenderOptions, boolean z, boolean z2) {
        boolean z3;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b66cdc", new Object[]{this, dXWidgetNode, viewGroup, dXRenderOptions, new Boolean(z), new Boolean(z2)});
            return;
        }
        boolean z4 = dXWidgetNode.getDataParsersExprNode() != null;
        DXRuntimeContext dXRuntimeContext = dXWidgetNode.getDXRuntimeContext();
        if (DXTraceUtil.f()) {
            DXTraceUtil.b(dXWidgetNode.getClass().getSimpleName().concat("handleNodeStatus"));
        }
        if (n(dXWidgetNode, viewGroup, z4, dXRuntimeContext, dXRenderOptions, z, z2)) {
            xk9 j = j(viewGroup);
            if (!(dXWidgetNode.getNativeView() == null || dXWidgetNode.getNativeView().getParent() == null)) {
                j.b();
            }
            if (DXTraceUtil.f()) {
                DXTraceUtil.c();
                return;
            }
            return;
        }
        if (DXTraceUtil.f()) {
            DXTraceUtil.c();
        }
        if (DXTraceUtil.f()) {
            DXTraceUtil.b(dXWidgetNode.getClass().getSimpleName().concat("parser"));
        }
        dXWidgetNode.beginParser(z4);
        if (z4) {
            this.c.d(dXWidgetNode, dXRuntimeContext);
        }
        if (dXWidgetNode.needParseAP()) {
            dXWidgetNode.parseAp();
        }
        dXWidgetNode.beforeBindChildData();
        dXWidgetNode.endParser(z4);
        if (DXTraceUtil.f()) {
            DXTraceUtil.c();
        }
        if (DXTraceUtil.f()) {
            DXTraceUtil.b(dXWidgetNode.getClass().getSimpleName().concat("render"));
        }
        dXWidgetNode.setViewContainer(viewGroup);
        dXWidgetNode.setRealViewLayoutParamWithButter(viewGroup);
        dXWidgetNode.bindEventWithButter(viewGroup.getContext());
        int accessibility = dXWidgetNode.getAccessibility();
        boolean hasAccessibilityOn = dXWidgetNode.hasAccessibilityOn();
        if (accessibility == 2 || hasAccessibilityOn || z) {
            i = 3;
            z3 = true;
        } else {
            i = 3;
            z3 = false;
        }
        boolean z5 = accessibility == i || z2;
        if (z5) {
            dXWidgetNode.queryRootWidgetNode().setAccessibility(i);
        }
        dXWidgetNode.renderViewWithButter(viewGroup.getContext());
        if (DXTraceUtil.f()) {
            DXTraceUtil.c();
        }
        if (DXTraceUtil.f()) {
            DXTraceUtil.b(dXWidgetNode.getClass().getSimpleName().concat("addView + recursiveChild"));
        }
        if (dXWidgetNode instanceof bwb) {
            bwb bwbVar = (bwb) dXWidgetNode;
            if (bwbVar.isLayoutFlat()) {
                if (dXWidgetNode.getChildrenCount() == 0 && !bwbVar.isHandleListData()) {
                    bwbVar.cloneChildNode(dXRuntimeContext);
                }
                List<DXWidgetNode> children = dXWidgetNode.getChildren();
                boolean isDisableDarkMode = dXWidgetNode.isDisableDarkMode();
                if (children != null) {
                    int size = children.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        DXWidgetNode dXWidgetNode2 = children.get(i2);
                        if (isDisableDarkMode) {
                            dXWidgetNode2.setDisableDarkMode(true);
                        }
                        r(dXWidgetNode2, viewGroup, dXRenderOptions, z3, z5);
                    }
                }
            } else {
                View nativeView = dXWidgetNode.getNativeView();
                g(viewGroup, nativeView);
                if (nativeView instanceof jyc) {
                    ((jyc) nativeView).setWidgetNode(dXWidgetNode);
                }
                if (dXWidgetNode.getChildrenCount() == 0 && !bwbVar.isHandleListData()) {
                    bwbVar.cloneChildNode(dXRuntimeContext);
                }
                j(nativeView).c();
                List<DXWidgetNode> children2 = dXWidgetNode.getChildren();
                boolean isDisableDarkMode2 = dXWidgetNode.isDisableDarkMode();
                boolean z6 = dXWidgetNode instanceof r;
                if (children2 != null) {
                    int size2 = children2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        DXWidgetNode dXWidgetNode3 = children2.get(i3);
                        if (isDisableDarkMode2) {
                            dXWidgetNode3.setDisableDarkMode(true);
                        }
                        if (z6 && (dXWidgetNode3 instanceof j)) {
                            ((j) dXWidgetNode3).setDisableFlatten(true);
                        }
                        r(dXWidgetNode3, (ViewGroup) nativeView, dXRenderOptions, z3, z5);
                    }
                }
            }
        } else {
            View nativeView2 = dXWidgetNode.getNativeView();
            if (nativeView2 != null) {
                g(viewGroup, nativeView2);
            }
        }
        if (DXTraceUtil.f()) {
            DXTraceUtil.c();
        }
    }
}
