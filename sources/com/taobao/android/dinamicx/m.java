package com.taobao.android.dinamicx;

import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.av5;
import tb.avb;
import tb.gwb;
import tb.ic5;
import tb.j66;
import tb.jb6;
import tb.kd5;
import tb.la6;
import tb.m76;
import tb.oh5;
import tb.ph5;
import tb.svb;
import tb.t2o;
import tb.xv5;
import tb.y76;
import tb.zh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m extends DXRenderPipelineBase implements avb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_PARSE_TIME = "dataParseTime";
    public static final String END_STAGE = "endStage";
    public static final String FLATTEN_TIME = "flattenTime";
    public static final String FROM_STAGE = "fromStage";
    public static final String IS_CONTROL_EVENT = "isControlEvent";
    public static final String LAYOUT_TIME = "layoutTime";
    public static final String LOAD_BINARY_TIME = "loadBinaryTime";
    public static final String MEASURE_TIME = "measureTime";
    public static final String PIPELINE_TYPE = "pipelineType";
    public static final String REFRESH_TYPE = "renderType";
    public static final String RENDER_TIME = "renderTime";
    public static final String RENDER_TYPE = "renderType";
    public static final String THREAD_NAME = "threadName";
    public final j66 d;
    public final i e = new i();
    public final l f = new l();
    public final p g;
    public final WeakReference<ph5> h;
    public final WeakReference<k> i;
    public gwb j;
    public final m76 k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ oh5 f7321a;

        public a(oh5 oh5Var) {
            this.f7321a = oh5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m.i(m.this, this.f7321a);
            }
        }
    }

    static {
        t2o.a(444596541);
        t2o.a(444597505);
    }

    public m(av5 av5Var, p pVar) {
        super(av5Var);
        q qVar = new q();
        DinamicXEngine f = av5Var.f();
        if (f != null) {
            this.d = f.n;
            this.g = pVar;
            this.h = new WeakReference<>(f.m);
            this.i = new WeakReference<>(f.o);
            v();
            p();
            this.k = new m76(this.j, qVar);
        }
    }

    public static /* synthetic */ void i(m mVar, oh5 oh5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e152e93c", new Object[]{mVar, oh5Var});
        } else {
            mVar.w(oh5Var);
        }
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXRenderPipeline");
    }

    public final void A(DXRuntimeContext dXRuntimeContext, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf00238", new Object[]{this, dXRuntimeContext, str, new Long(j)});
        } else if (dXRuntimeContext != null) {
            try {
                if (dXRuntimeContext.E() != null) {
                    dXRuntimeContext.E().f(str, Float.valueOf(((float) (System.nanoTime() - j)) / 1000000.0f));
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public final void B(f fVar, String str, int i, String str2, Map<String, String> map, boolean z) {
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

    public void C(DXRuntimeContext dXRuntimeContext, String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3626e4c", new Object[]{this, dXRuntimeContext, str, new Long(j), map});
            return;
        }
        try {
            ic5.u(1, dXRuntimeContext.c(), "Pipeline", str, dXRuntimeContext.p(), map, j, true);
        } catch (Exception e) {
            if (DinamicXEngine.j0()) {
                e.printStackTrace();
            }
        }
    }

    public final void D(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b873092a", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            try {
                if (dXRuntimeContext.E() != null) {
                    dXRuntimeContext.E().b(Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public final void E(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbad31", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            try {
                if (dXRuntimeContext.E() != null) {
                    dXRuntimeContext.E().d(Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    @Override // tb.avb
    public void a(oh5 oh5Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2be1d1e", new Object[]{this, oh5Var});
            return;
        }
        if (oh5Var instanceof y76) {
            z = ((y76) oh5Var).f;
        }
        if (!z || Thread.currentThread() != Looper.getMainLooper().getThread()) {
            jb6.d();
            jb6.n(new a(oh5Var));
            return;
        }
        w(oh5Var);
    }

    public final boolean j(DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ab8aee5", new Object[]{this, dXRenderOptions})).booleanValue();
        }
        if (dXRenderOptions.f() != 1 || !dXRenderOptions.j()) {
            return false;
        }
        return true;
    }

    public final void k(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13accde3", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            try {
                if (dXRuntimeContext.E() != null) {
                    dXRuntimeContext.E().e(Long.valueOf(System.currentTimeMillis()));
                }
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public final void l(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8b5c38", new Object[]{this, dXRuntimeContext});
        } else if (dXRuntimeContext != null) {
            try {
                DXTemplateItem p = dXRuntimeContext.p();
                DXEngineConfig d = d();
                if (d != null && !d.e && o() != null && p != null) {
                    o().k(p);
                    u(dXRuntimeContext, 1000);
                }
            } catch (Exception e) {
                if (DinamicXEngine.j0()) {
                    e.printStackTrace();
                }
            }
        }
    }

    public ph5 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ph5) ipChange.ipc$dispatch("e7e8690d", new Object[]{this});
        }
        return this.h.get();
    }

    public k n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("c88b99e7", new Object[]{this});
        }
        return this.i.get();
    }

    public p o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("97fdb6a9", new Object[]{this});
        }
        return this.g;
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e86935", new Object[]{this});
        } else if (g.s() != null && g.s().d() != null) {
            this.j = g.s().d().a();
        }
    }

    public DXWidgetNode q(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("91fdcfd", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions});
        }
        return this.k.a(dXWidgetNode, dXRuntimeContext, dXRenderOptions);
    }

    public DXWidgetNode r(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("3da57ccf", new Object[]{this, dXWidgetNode, dXRuntimeContext, dXRenderOptions});
        }
        return this.k.b(dXWidgetNode, dXRuntimeContext, dXRenderOptions);
    }

    public svb s(DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svb) ipChange.ipc$dispatch("9f141fae", new Object[]{this, dXWidgetNode, dXRuntimeContext, new Boolean(z)});
        }
        return this.e.c(dXWidgetNode, dXRuntimeContext, z);
    }

    public View t(DXWidgetNode dXWidgetNode, svb svbVar, View view, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("815fc38f", new Object[]{this, dXWidgetNode, svbVar, view, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        return this.f.d(dXWidgetNode, (DXWidgetNode) svbVar, view, dXRuntimeContext, 0, dXRenderOptions);
    }

    public final void u(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2aa3a2", new Object[]{this, dXRuntimeContext, new Integer(i)});
        } else if (this.d != null && dXRuntimeContext != null) {
            zh6 zh6Var = new zh6();
            zh6Var.f32770a = dXRuntimeContext.p();
            zh6Var.d = dXRuntimeContext.q();
            zh6Var.b = dXRuntimeContext.i();
            zh6Var.c = i;
            this.d.i(zh6Var);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af5edfa", new Object[]{this});
            return;
        }
        ph5 m = m();
        if (m != null) {
            m.g(this, y76.DX_EVENT_PIPELINE_SCHEDULE);
        }
    }

    public DXResult<DXRootView> x(DXRootView dXRootView, DXRuntimeContext dXRuntimeContext, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("156b0649", new Object[]{this, dXRootView, dXRuntimeContext, new Integer(i), dXRenderOptions});
        }
        if (dXRootView == null) {
            return null;
        }
        la6.b("开始渲染 tpl: " + dXRuntimeContext.R() + " renderType: " + dXRenderOptions.f() + " isControlEvent: " + dXRenderOptions.k());
        z(dXRootView);
        dXRootView.data = dXRuntimeContext.i();
        dXRootView.setPosition(i);
        dXRootView.parentWidthSpec = dXRenderOptions.i();
        dXRootView.parentHeightSpec = dXRenderOptions.b();
        dXRootView.dxTemplateItem = dXRuntimeContext.p();
        View y = y(null, dXRootView.getFlattenWidgetNode(), dXRootView, dXRuntimeContext, dXRenderOptions);
        DXResult<DXRootView> dXResult = new DXResult<>();
        if (y != null && (y instanceof DXRootView)) {
            dXResult.i((DXRootView) y);
        }
        dXResult.e(dXRuntimeContext.m());
        return dXResult;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(23:326|9|10|(6:353|11|12|340|13|14)|(2:357|15)|(3:350|17|(2:19|(18:21|(2:(1:24)|28)(2:29|(2:(1:32)|33)(1:(1:35)(2:36|37)))|39|40|(3:361|42|(3:44|45|219)(12:375|220|344|223|(1:239)(2:232|(6:236|254|(1:259)|260|(1:271)(2:264|(1:270))|272))|(1:253)|254|(2:256|259)|260|(1:262)|271|272))|374|220|344|223|(0)|239|(5:244|246|248|251|253)|254|(0)|260|(0)|271|272)))|38|39|40|(0)|374|220|344|223|(0)|239|(0)|254|(0)|260|(0)|271|272) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:181|(2:336|182)|(7:(3:351|184|(15:186|342|187|188|334|189|328|197|198|365|199|(1:201)(1:205)|206|207|380))|365|199|(0)(0)|206|207|380)|194|328|197|198) */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x09a3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x09a4, code lost:
        r54 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0a6c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0b2c, code lost:
        if (r65.Y() == false) goto L_0x0b35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0b2e, code lost:
        tb.ic5.p(r65.m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0c13, code lost:
        if (r65.Y() == false) goto L_0x0b35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0c17, code lost:
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0977 A[Catch: all -> 0x097d, TryCatch #21 {all -> 0x097d, blocks: (B:199:0x095e, B:201:0x0977, B:206:0x098d), top: B:365:0x095e }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0a4f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a73 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a97 A[Catch: all -> 0x0a6c, TryCatch #10 {all -> 0x0a6c, blocks: (B:223:0x0a49, B:228:0x0a55, B:234:0x0a62, B:236:0x0a68, B:244:0x0a79, B:251:0x0a88, B:253:0x0a8e, B:254:0x0a91, B:256:0x0a97, B:259:0x0a9f), top: B:344:0x0a49 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View y(com.taobao.android.dinamicx.widget.DXWidgetNode r62, com.taobao.android.dinamicx.widget.DXWidgetNode r63, android.view.View r64, com.taobao.android.dinamicx.DXRuntimeContext r65, com.taobao.android.dinamicx.DXRenderOptions r66) {
        /*
            Method dump skipped, instructions count: 3260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.m.y(com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, android.view.View, com.taobao.android.dinamicx.DXRuntimeContext, com.taobao.android.dinamicx.DXRenderOptions):android.view.View");
    }

    public final void z(DXRootView dXRootView) {
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
            fVar.c.add(new f.a("Pipeline", "Pipeline_Stage_Reset_Bindingx", f.RESET_ANIMATION_CRASH, xv5.a(e)));
            ic5.p(fVar);
        }
    }

    public final void w(oh5 oh5Var) {
        DXWidgetNode dXWidgetNode;
        DXRuntimeContext dXRuntimeContext;
        DXRootView L;
        int intValue;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7abe8e46", new Object[]{this, oh5Var});
        } else if (oh5Var != null && (oh5Var instanceof y76)) {
            y76 y76Var = (y76) oh5Var;
            Object obj = oh5Var.f25390a;
            if ((obj instanceof DXWidgetNode) && (dXWidgetNode = (DXWidgetNode) obj) != null && (dXRuntimeContext = dXWidgetNode.getDXRuntimeContext()) != null && dXRuntimeContext.o.c == 0 && (L = dXRuntimeContext.L()) != null && dXRuntimeContext.p().equals(L.dxTemplateItem) && dXRuntimeContext.i() == L.data && dXWidgetNode.getDXRuntimeContext().s().f() != null) {
                DXRuntimeContext b = dXWidgetNode.getDXRuntimeContext().b(dXWidgetNode);
                Object obj2 = ((HashMap) oh5Var.c).get("width");
                Object obj3 = ((HashMap) oh5Var.c).get("height");
                int M = dXRuntimeContext.M();
                int K = dXRuntimeContext.K();
                if (obj2 == null) {
                    intValue = 0;
                } else {
                    try {
                        intValue = ((Integer) obj2).intValue();
                    } catch (Exception e) {
                        xv5.b(e);
                    }
                }
                int intValue2 = obj3 == null ? 0 : ((Integer) obj3).intValue();
                if (intValue > 0) {
                    M = DXWidgetNode.DXMeasureSpec.c(intValue, 1073741824);
                    b.y0(M);
                    dXWidgetNode.setLayoutWidth(intValue);
                    z = true;
                }
                if (intValue2 > 0) {
                    K = DXWidgetNode.DXMeasureSpec.c(intValue2, 1073741824);
                    b.x0(K);
                    dXWidgetNode.setLayoutHeight(intValue2);
                    z = true;
                }
                if (z) {
                    dXWidgetNode.setStatFlag(4);
                    dXWidgetNode.measure(M, K);
                }
                b.l = y76Var.e;
                DXRenderOptions q = new DXRenderOptions.b().v(true).s(y76Var.d).G(M).t(K).B(9).q();
                if (b.b0()) {
                    dXWidgetNode.updateRefreshType(b.I());
                }
                y(dXWidgetNode, L.getFlattenWidgetNode(), L, b, q);
            }
        }
    }
}
