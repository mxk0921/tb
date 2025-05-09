package com.taobao.android.nanocompose.base.hostingview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.base.hostingview.NCHostingView;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.android.nanocompose.runtime.context.NCBusinessContext;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.runtime.node.MeasureAndLayoutDelegate;
import com.taobao.android.nanocompose.runtime.pipeline.parser.Parsing;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import kotlin.NotImplementedError;
import kotlin.a;
import tb.abz;
import tb.ckf;
import tb.e7z;
import tb.iiz;
import tb.mlz;
import tb.njg;
import tb.nlz;
import tb.qhz;
import tb.t2o;
import tb.u2z;
import tb.vhz;
import tb.waz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCHostingView extends ViewGroup implements abz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private NCHostingViewCoordinator hostingViewCoordinator;
    private boolean isAttached;
    private waz mRootLayoutNode;
    private boolean measuring;
    private boolean parseRequested;
    private e7z rootFlattenedNode;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate = new MeasureAndLayoutDelegate();
    private final njg mReForceLayoutNodes$delegate = a.b(NCHostingView$mReForceLayoutNodes$2.INSTANCE);
    private final njg reParsingSet$delegate = a.b(NCHostingView$reParsingSet$2.INSTANCE);

    static {
        t2o.a(598736933);
        t2o.a(598737389);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NCHostingView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    private final Set<waz> getMReForceLayoutNodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c9fa6cdc", new Object[]{this});
        }
        return (Set) this.mReForceLayoutNodes$delegate.getValue();
    }

    private final RenderContext getRenderContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContext) ipChange.ipc$dispatch("cc4f291d", new Object[]{this});
        }
        NCHostingViewCoordinator nCHostingViewCoordinator = this.hostingViewCoordinator;
        if (nCHostingViewCoordinator == null) {
            return null;
        }
        return nCHostingViewCoordinator.getRenderContext();
    }

    public static /* synthetic */ Object ipc$super(NCHostingView nCHostingView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/nanocompose/base/hostingview/NCHostingView");
        }
    }

    private final RenderContext makeRenderContext(TemplateItem templateItem, Map<String, ? extends Object> map, NCBusinessContext nCBusinessContext, qhz qhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContext) ipChange.ipc$dispatch("67210962", new Object[]{this, templateItem, map, nCBusinessContext, qhzVar});
        }
        Context context = getContext();
        ckf.f(context, "context");
        RenderContext renderContext = new RenderContext(nCBusinessContext, context, templateItem, 0L, qhzVar, 8, null);
        renderContext.n(map);
        renderContext.o(this);
        return renderContext;
    }

    @Override // tb.abz
    public void forceMeasureTheSubtree(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73a470f8", new Object[]{this, wazVar});
            return;
        }
        ckf.g(wazVar, "layoutNode");
        if (getMReForceLayoutNodes().remove(wazVar)) {
            if (wazVar.v() != null) {
                NCComponentViewHandler v = wazVar.v();
                if (v != null) {
                    v.m322measureW2SWlxA(wazVar.h().w());
                }
                if (wazVar.y()) {
                    wazVar.D(null);
                    return;
                }
                return;
            }
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }
    }

    @Override // tb.abz
    public MeasureAndLayoutDelegate getMeasureAndLayoutDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureAndLayoutDelegate) ipChange.ipc$dispatch("c50f63a6", new Object[]{this});
        }
        return this.measureAndLayoutDelegate;
    }

    @Override // tb.abz
    public Set<Parsing> getReParsingSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("41976011", new Object[]{this});
        }
        return (Set) this.reParsingSet$delegate.getValue();
    }

    @Override // tb.abz
    public e7z getRootFlattenedNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7z) ipChange.ipc$dispatch("b6c05d13", new Object[]{this});
        }
        return this.rootFlattenedNode;
    }

    @Override // tb.abz
    public waz getRootLayoutNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (waz) ipChange.ipc$dispatch("40e3049c", new Object[]{this});
        }
        return this.mRootLayoutNode;
    }

    @Override // tb.abz
    public void measureAndLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a2c32a", new Object[]{this});
        } else {
            abz.a.a(this);
        }
    }

    @Override // tb.abz
    public void measureOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100db9b1", new Object[]{this});
        } else {
            abz.a.b(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.isAttached = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.isAttached = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        waz wazVar = this.mRootLayoutNode;
        if (wazVar != null) {
            wazVar.C(0, 0);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (iiz.c()) {
            iiz.Companion.j("NCHostingView onMeasure width: " + View.MeasureSpec.getSize(i) + ", height: " + View.MeasureSpec.getSize(i2));
        }
        waz wazVar = this.mRootLayoutNode;
        if (wazVar == null || getChildCount() <= 0) {
            wazVar = null;
        }
        if (wazVar == null) {
            setMeasuredDimension(0, 0);
            if (iiz.c()) {
                iiz.Companion.j("NCHostingView onMeasure mRootLayoutNode is null");
                return;
            }
            return;
        }
        long d = u2z.Companion.d(i, i2);
        mo320updateRootConstraintsW2SWlxA(d);
        this.measuring = true;
        onRequestForceMeasureTheSubtree(wazVar);
        wazVar.D(u2z.b(d));
        View childAt = getChildAt(0);
        setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        this.measuring = false;
    }

    @Override // tb.abz
    public void onRequestForceMeasureTheSubtree(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4314c8", new Object[]{this, wazVar});
            return;
        }
        ckf.g(wazVar, "layoutNode");
        if (!wazVar.y()) {
            getMReForceLayoutNodes().add(wazVar);
        }
    }

    @Override // tb.abz
    public void onRequestMeasure(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5775706", new Object[]{this, wazVar});
        } else if (wazVar != null && this.isAttached) {
            wazVar.A();
            NCComponentViewHandler v = wazVar.v();
            if (v != null && v.checkViewInitialized()) {
                v.getView().requestLayout();
                iiz.a aVar = iiz.Companion;
                aVar.j("NCHostingView onRequestMeasure view: " + v.getView() + " requestLayout");
            }
        }
    }

    @Override // tb.abz
    public void onRequestParse(Parsing parsing) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cb7947", new Object[]{this, parsing});
        } else {
            abz.a.c(this, parsing);
        }
    }

    public final void renderHostingView$nanocompose_slimRelease(qhz qhzVar, NCBusinessContext nCBusinessContext, mlz mlzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3bc0e9", new Object[]{this, qhzVar, nCBusinessContext, mlzVar});
            return;
        }
        ckf.g(qhzVar, "renderParams");
        ckf.g(nCBusinessContext, "businessContext");
        ckf.g(mlzVar, "scheduler");
        RenderContext makeRenderContext = makeRenderContext(qhzVar.e(), qhzVar.a(), nCBusinessContext, qhzVar);
        makeRenderContext.p(qhzVar.c());
        NCHostingViewCoordinator nCHostingViewCoordinator = this.hostingViewCoordinator;
        if (nCHostingViewCoordinator == null) {
            nCHostingViewCoordinator = new NCHostingViewCoordinator(makeRenderContext, new WeakReference(this));
            this.hostingViewCoordinator = nCHostingViewCoordinator;
        }
        nCHostingViewCoordinator.updateRenderContext(makeRenderContext);
        nCHostingViewCoordinator.renderHostingView$nanocompose_slimRelease(makeRenderContext, mlzVar, qhzVar);
    }

    @Override // tb.abz
    public void requestParse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284abeb", new Object[]{this});
        } else if (!this.parseRequested) {
            this.parseRequested = true;
            final WeakReference weakReference = new WeakReference(this);
            vhz.c(vhz.INSTANCE, new Runnable() { // from class: tb.nhz
                @Override // java.lang.Runnable
                public final void run() {
                    NCHostingView.m319requestParse$lambda9(weakReference, this);
                }
            }, 0L, 2, null);
        }
    }

    public final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        }
    }

    public void scheduleRemeasureAndRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2f0dc0", new Object[]{this});
            return;
        }
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // tb.abz
    /* renamed from: updateRootConstraints-W2SWlxA  reason: not valid java name */
    public void mo320updateRootConstraintsW2SWlxA(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7cd609", new Object[]{this, new Long(j)});
        } else {
            abz.a.d(this, j);
        }
    }

    @Override // tb.abz
    public void updateRootFlattenedNode(e7z e7zVar) {
        waz wazVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec566d2", new Object[]{this, e7zVar});
            return;
        }
        waz wazVar2 = null;
        if (e7zVar == null && this.rootFlattenedNode != null) {
            e7z e7zVar2 = this.rootFlattenedNode;
            if (e7zVar2 != null) {
                e7zVar = new e7z(e7zVar2.b(), 0, 0, null, 14, null);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (e7zVar == null && this.rootFlattenedNode == null) {
            e7zVar = null;
        }
        this.rootFlattenedNode = e7zVar;
        if (e7zVar == null) {
            wazVar = null;
        } else {
            wazVar = e7zVar.b();
        }
        if (!ckf.b(wazVar, this.mRootLayoutNode)) {
            StringBuilder sb = new StringBuilder("Layout node mismatch. Expected: ");
            sb.append(this.mRootLayoutNode);
            sb.append(", Actual: ");
            e7z e7zVar3 = this.rootFlattenedNode;
            if (e7zVar3 != null) {
                wazVar2 = e7zVar3.b();
            }
            sb.append(wazVar2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    @Override // tb.abz
    public void updateRootLayoutNode(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf87bef", new Object[]{this, wazVar});
            return;
        }
        this.mRootLayoutNode = wazVar;
        if (wazVar != null) {
            MeasureAndLayoutDelegate measureAndLayoutDelegate = getMeasureAndLayoutDelegate();
            waz wazVar2 = this.mRootLayoutNode;
            ckf.d(wazVar2);
            measureAndLayoutDelegate.o(wazVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestParse$lambda-9  reason: not valid java name */
    public static final void m319requestParse$lambda9(WeakReference weakReference, NCHostingView nCHostingView) {
        e7z e7zVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26dc369d", new Object[]{weakReference, nCHostingView});
            return;
        }
        ckf.g(weakReference, "$ownerWeak");
        ckf.g(nCHostingView, "this$0");
        NCHostingView nCHostingView2 = (NCHostingView) weakReference.get();
        if (nCHostingView2 != null) {
            for (Parsing parsing : nCHostingView2.getReParsingSet()) {
                parsing.f();
            }
            nCHostingView2.getReParsingSet().clear();
            e7z e7zVar2 = nCHostingView2.rootFlattenedNode;
            e7z e7zVar3 = null;
            if ((e7zVar2 == null ? null : e7zVar2.b()) != null) {
                RenderContext renderContext = nCHostingView.getRenderContext();
                ckf.d(renderContext);
                NCHostingView nCHostingView3 = (NCHostingView) weakReference.get();
                waz b = (nCHostingView3 == null || (e7zVar = nCHostingView3.rootFlattenedNode) == null) ? null : e7zVar.b();
                ckf.d(b);
                NCHostingView nCHostingView4 = (NCHostingView) weakReference.get();
                if (nCHostingView4 != null) {
                    e7zVar3 = nCHostingView4.rootFlattenedNode;
                }
                new nlz(renderContext, b, null, null, e7zVar3).d();
            }
            nCHostingView.parseRequested = false;
        }
    }
}
