package com.taobao.android.nanocompose.viewhandler;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.base.hostingview.NCHostingView;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;
import com.taobao.schedule.ViewProxy;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.biz;
import tb.ckf;
import tb.eaz;
import tb.fzy;
import tb.haz;
import tb.hoz;
import tb.htz;
import tb.iai;
import tb.iiz;
import tb.jkz;
import tb.odz;
import tb.p9z;
import tb.rhz;
import tb.sjz;
import tb.t2o;
import tb.taz;
import tb.v2z;
import tb.vzy;
import tb.waz;
import tb.xhz;
import tb.y2z;
import tb.ylz;
import tb.z2z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NCComponentViewHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private waz layoutNode;
    public View view;
    private xhz viewEventEmitter;
    private int width = -2;
    private int height = -2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737532);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void a(NCHostingView nCHostingView, NCComponentViewHandler nCComponentViewHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62fa3d9e", new Object[]{this, nCHostingView, nCComponentViewHandler});
                return;
            }
            ckf.g(nCHostingView, "hostingView");
            ckf.g(nCComponentViewHandler, "viewHandler");
            long nanoTime = System.nanoTime();
            if (iiz.c()) {
                iiz.a aVar = iiz.Companion;
                aVar.j("bindHostingView hostingView:" + nCHostingView + " viewHandler:" + nCComponentViewHandler);
            }
            if (nCHostingView.getChildCount() > 0) {
                nCHostingView.removeAllViews();
            }
            nCHostingView.addView(nCComponentViewHandler.getView());
            if (iiz.c()) {
                iiz.a aVar2 = iiz.Companion;
                aVar2.r("NCComponentViewHandler bindHostingView cost: " + (System.nanoTime() - nanoTime) + " ns");
            }
        }

        @JvmStatic
        public final void b(NCComponentViewHandler nCComponentViewHandler, NCComponentViewHandler nCComponentViewHandler2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1549abe4", new Object[]{this, nCComponentViewHandler, nCComponentViewHandler2});
                return;
            }
            ckf.g(nCComponentViewHandler, "currentViewHandler");
            if (iiz.c()) {
                iiz.a aVar = iiz.Companion;
                aVar.j("mountFromSuperView currentViewHandler:" + nCComponentViewHandler + " parentViewHandler:" + nCComponentViewHandler2);
            }
            long nanoTime = System.nanoTime();
            if (nCComponentViewHandler2 != null) {
                if (nCComponentViewHandler2.getView() instanceof ViewGroup) {
                    ((ViewGroup) nCComponentViewHandler2.getView()).addView(nCComponentViewHandler.getView());
                    nCComponentViewHandler.getView().getLayoutParams().width = -2;
                    nCComponentViewHandler.getView().getLayoutParams().height = -2;
                }
                if (iiz.c()) {
                    iiz.a aVar2 = iiz.Companion;
                    aVar2.r("NCComponentViewHandler mountFromSuperView cost: " + (System.nanoTime() - nanoTime) + " ns");
                }
            } else if (iiz.c()) {
                iiz.a aVar3 = iiz.Companion;
                aVar3.r("NCComponentViewHandler mountFromSuperView cost: " + (System.nanoTime() - nanoTime) + " ns");
            }
        }

        @JvmStatic
        public final void c(NCComponentViewHandler nCComponentViewHandler, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2547ffc", new Object[]{this, nCComponentViewHandler, str, str2});
                return;
            }
            ckf.g(nCComponentViewHandler, "ncComponentViewHandler");
            ckf.g(str, "newProps");
            ckf.g(str2, "oldProps");
            long nanoTime = System.nanoTime();
            nCComponentViewHandler.updateViewWithContext(str, str2);
            if (iiz.c()) {
                iiz.a aVar = iiz.Companion;
                aVar.r("NCComponentViewHandler updateView cost: " + (System.nanoTime() - nanoTime) + " ns");
            }
        }

        public a() {
        }
    }

    static {
        t2o.a(598737531);
    }

    @JvmStatic
    public static final void bindHostingView(NCHostingView nCHostingView, NCComponentViewHandler nCComponentViewHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62fa3d9e", new Object[]{nCHostingView, nCComponentViewHandler});
        } else {
            Companion.a(nCHostingView, nCComponentViewHandler);
        }
    }

    @JvmStatic
    public static final void mountFromSuperView(NCComponentViewHandler nCComponentViewHandler, NCComponentViewHandler nCComponentViewHandler2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1549abe4", new Object[]{nCComponentViewHandler, nCComponentViewHandler2});
        } else {
            Companion.b(nCComponentViewHandler, nCComponentViewHandler2);
        }
    }

    private final void processGesture(jkz jkzVar, jkz jkzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98751f13", new Object[]{this, jkzVar, jkzVar2});
        } else if ((jkzVar2 instanceof fzy) && (((fzy) jkzVar2).s() & sjz.a(1)) != 0) {
            ViewProxy.setOnClickListener(getView(), new View.OnClickListener() { // from class: tb.pgz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NCComponentViewHandler.m321processGesture$lambda2(NCComponentViewHandler.this, view);
                }
            });
        }
    }

    @JvmStatic
    public static final void updatePropsToView(NCComponentViewHandler nCComponentViewHandler, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2547ffc", new Object[]{nCComponentViewHandler, str, str2});
        } else {
            Companion.c(nCComponentViewHandler, str, str2);
        }
    }

    public final boolean checkViewInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ed255d2", new Object[]{this})).booleanValue();
        }
        if (this.view != null) {
            return true;
        }
        return false;
    }

    public final hoz createSizable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hoz) ipChange.ipc$dispatch("a7aaf5d2", new Object[]{this});
        }
        if (this instanceof hoz) {
            return (hoz) this;
        }
        return null;
    }

    public final void createView$nanocompose_slimRelease(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb2f71b", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        if (iiz.c()) {
            iiz.Companion.j(ckf.p(" NCComponentViewHandler createView name ", getClass().getSimpleName()));
        }
        setView(onCreateView(context));
    }

    public final int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.height;
    }

    public final View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        View view = this.view;
        if (view != null) {
            return view;
        }
        ckf.y("view");
        throw null;
    }

    public final xhz getViewEventEmitter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhz) ipChange.ipc$dispatch("4ca17ec9", new Object[]{this});
        }
        return this.viewEventEmitter;
    }

    public final int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.width;
    }

    /* renamed from: measure-W2SWlxA  reason: not valid java name */
    public final odz m322measureW2SWlxA(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (odz) ipChange.ipc$dispatch("4fb14ac1", new Object[]{this, new Long(j)});
        }
        if (iiz.c()) {
            iiz.a aVar = iiz.Companion;
            StringBuilder sb = new StringBuilder("测量>>>开始 ");
            waz wazVar = this.layoutNode;
            if (wazVar != null) {
                sb.append(wazVar.e());
                sb.append(" node hash ");
                waz wazVar2 = this.layoutNode;
                if (wazVar2 != null) {
                    sb.append(wazVar2.hashCode());
                    sb.append(" view hash ");
                    sb.append(getView().hashCode());
                    sb.append(" width  ");
                    sb.append(View.MeasureSpec.getSize(v2z.h(j).getFirst().intValue()));
                    sb.append(" height ");
                    sb.append(View.MeasureSpec.getSize(v2z.h(j).getSecond().intValue()));
                    aVar.j(sb.toString());
                } else {
                    ckf.y("layoutNode");
                    throw null;
                }
            } else {
                ckf.y("layoutNode");
                throw null;
            }
        }
        Pair<Integer, Integer> h = v2z.h(j);
        int intValue = h.component1().intValue();
        int intValue2 = h.component2().intValue();
        if (getView() instanceof p9z) {
            p9z p9zVar = (p9z) getView();
            waz wazVar3 = this.layoutNode;
            if (wazVar3 != null) {
                p9zVar.bindMeasureLayoutScope(wazVar3);
                getView().measure(intValue, intValue2);
                if (iiz.c()) {
                    iiz.a aVar2 = iiz.Companion;
                    StringBuilder sb2 = new StringBuilder("测量>>>结束 ");
                    waz wazVar4 = this.layoutNode;
                    if (wazVar4 != null) {
                        sb2.append(wazVar4.e());
                        sb2.append(" node hash ");
                        waz wazVar5 = this.layoutNode;
                        if (wazVar5 != null) {
                            sb2.append(wazVar5.hashCode());
                            sb2.append(" view hash ");
                            sb2.append(getView().hashCode());
                            sb2.append(" measureWidth  ");
                            sb2.append(View.MeasureSpec.getSize(getView().getMeasuredWidth()));
                            sb2.append(" measureHeight ");
                            sb2.append(View.MeasureSpec.getSize(getView().getMeasuredHeight()));
                            aVar2.j(sb2.toString());
                        } else {
                            ckf.y("layoutNode");
                            throw null;
                        }
                    } else {
                        ckf.y("layoutNode");
                        throw null;
                    }
                }
                waz wazVar6 = this.layoutNode;
                if (wazVar6 != null) {
                    return wazVar6.h().z();
                }
                ckf.y("layoutNode");
                throw null;
            }
            ckf.y("layoutNode");
            throw null;
        }
        getView().measure(intValue, intValue2);
        if (iiz.c()) {
            iiz.a aVar3 = iiz.Companion;
            StringBuilder sb3 = new StringBuilder("测量>>>结束 ");
            waz wazVar7 = this.layoutNode;
            if (wazVar7 != null) {
                sb3.append(wazVar7.e());
                sb3.append(" node hash ");
                waz wazVar8 = this.layoutNode;
                if (wazVar8 != null) {
                    sb3.append(wazVar8.hashCode());
                    sb3.append(" view hash ");
                    sb3.append(getView().hashCode());
                    sb3.append(" measureWidth  ");
                    sb3.append(View.MeasureSpec.getSize(getView().getMeasuredWidth()));
                    sb3.append(" measureHeight ");
                    sb3.append(View.MeasureSpec.getSize(getView().getMeasuredHeight()));
                    aVar3.j(sb3.toString());
                } else {
                    ckf.y("layoutNode");
                    throw null;
                }
            } else {
                ckf.y("layoutNode");
                throw null;
            }
        }
        return new htz(getView().getMeasuredWidth(), getView().getMeasuredHeight());
    }

    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new View(context);
    }

    public void onUpdateViewWithContext(biz bizVar, jkz jkzVar, jkz jkzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7843a4", new Object[]{this, bizVar, jkzVar, jkzVar2});
        } else {
            ckf.g(bizVar, "nanoContext");
        }
    }

    /* renamed from: placeAt-F3EFqNI  reason: not valid java name */
    public final void m323placeAtF3EFqNI(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acd6412", new Object[]{this, new Long(j)});
            return;
        }
        if (iiz.c()) {
            iiz.a aVar = iiz.Companion;
            StringBuilder sb = new StringBuilder("准备>>>布局 ");
            waz wazVar = this.layoutNode;
            if (wazVar != null) {
                sb.append(wazVar.e());
                sb.append(" node hash ");
                waz wazVar2 = this.layoutNode;
                if (wazVar2 != null) {
                    sb.append(wazVar2.hashCode());
                    sb.append(" view hash ");
                    sb.append(getView().hashCode());
                    sb.append(" left ");
                    sb.append(eaz.d(j));
                    sb.append(" top ");
                    sb.append(eaz.e(j));
                    sb.append(" right ");
                    sb.append(eaz.d(j) + getView().getMeasuredWidth());
                    sb.append("  bottom ");
                    sb.append(eaz.e(j) + getView().getMeasuredHeight());
                    aVar.j(sb.toString());
                } else {
                    ckf.y("layoutNode");
                    throw null;
                }
            } else {
                ckf.y("layoutNode");
                throw null;
            }
        }
        if (getView() instanceof p9z) {
            p9z p9zVar = (p9z) getView();
            waz wazVar3 = this.layoutNode;
            if (wazVar3 != null) {
                p9zVar.bindMeasureLayoutScope(wazVar3);
            } else {
                ckf.y("layoutNode");
                throw null;
            }
        }
        getView().layout(eaz.d(j), eaz.e(j), eaz.d(j) + getView().getMeasuredWidth(), eaz.e(j) + getView().getMeasuredHeight());
    }

    public final int roundToPx(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f323921b", new Object[]{this, new Float(f)})).intValue();
        }
        waz wazVar = this.layoutNode;
        if (wazVar != null) {
            return iai.d(f * wazVar.f().b());
        }
        ckf.y("layoutNode");
        throw null;
    }

    public final void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else {
            this.height = i;
        }
    }

    public final void setView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.view = view;
    }

    public final void setViewEventEmitter(xhz xhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775494a1", new Object[]{this, xhzVar});
        } else {
            this.viewEventEmitter = xhzVar;
        }
    }

    public final void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.width = i;
        }
    }

    public final void updateEventEmitter(biz bizVar, xhz xhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aac02b0", new Object[]{this, bizVar, xhzVar});
            return;
        }
        ckf.g(bizVar, "nanoContext");
        ckf.g(xhzVar, "eventEmitter");
        this.viewEventEmitter = xhzVar;
    }

    public final void updateLayoutMetrics(taz tazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12907d03", new Object[]{this, tazVar});
            return;
        }
        ckf.g(tazVar, "layoutMetrics");
        getView().getLayoutParams().width = haz.f(tazVar.a().b());
        getView().getLayoutParams().height = haz.e(tazVar.a().b());
        if (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = eaz.d(tazVar.a().a());
                ViewGroup.LayoutParams layoutParams2 = getView().getLayoutParams();
                if (layoutParams2 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = eaz.e(tazVar.a().a());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void updateLayoutNode$nanocompose_slimRelease(waz wazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5446572", new Object[]{this, wazVar});
            return;
        }
        ckf.g(wazVar, "layoutNode");
        this.layoutNode = wazVar;
    }

    public void updateViewWithContext(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60211536", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "newProps");
        ckf.g(str2, "oldProps");
    }

    public final void updateViewWithContext(jkz jkzVar, jkz jkzVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cbb7d4", new Object[]{this, jkzVar, jkzVar2});
            return;
        }
        if (iiz.c()) {
            iiz.a aVar = iiz.Companion;
            aVar.j(getClass().getSimpleName() + "  updatePropsToView oldProps:" + ((Object) JSON.toJSONString(jkzVar, SerializerFeature.DisableCircularReferenceDetect)) + " newProps: " + ((Object) JSON.toJSONString(jkzVar2)));
        }
        if (jkzVar2 != null) {
            fzy fzyVar = (fzy) jkzVar2;
            fzy fzyVar2 = jkzVar instanceof fzy ? (fzy) jkzVar : null;
            processGesture(jkzVar, jkzVar2);
            processBackground(fzyVar2, fzyVar);
            onUpdateViewWithContext(new biz(), jkzVar, jkzVar2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.nanocompose.foundation.view.BaseViewProps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processGesture$lambda-2  reason: not valid java name */
    public static final void m321processGesture$lambda2(NCComponentViewHandler nCComponentViewHandler, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198e0499", new Object[]{nCComponentViewHandler, view});
            return;
        }
        ckf.g(nCComponentViewHandler, "this$0");
        xhz viewEventEmitter = nCComponentViewHandler.getViewEventEmitter();
        if (viewEventEmitter != null) {
            viewEventEmitter.b(0, new rhz(0L, 1, null));
        }
    }

    private final void processBackground(fzy fzyVar, fzy fzyVar2) {
        GradientDrawable gradientDrawable;
        z2z t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11fd6d2", new Object[]{this, fzyVar, fzyVar2});
            return;
        }
        vzy vzyVar = null;
        y2z b = (ckf.b(fzyVar2.t(), fzyVar == null ? null : fzyVar.t()) || (t = fzyVar2.t()) == null) ? null : z2z.b(t, 0L, 1, null);
        if (b != null) {
            ylz.INSTANCE.a(getView(), roundToPx(b.d()), roundToPx(b.c()), roundToPx(b.b()), roundToPx(b.a()));
        }
        vzy q = fzyVar2.q();
        if (fzyVar != null) {
            vzyVar = fzyVar.q();
        }
        if (!ckf.b(q, vzyVar)) {
            vzy q2 = fzyVar2.q();
            if (q2 != null) {
                if (getView().getBackground() instanceof GradientDrawable) {
                    Drawable background = getView().getBackground();
                    if (background != null) {
                        gradientDrawable = (GradientDrawable) background;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    }
                } else {
                    gradientDrawable = new GradientDrawable();
                }
                gradientDrawable.setColor(fzyVar2.p());
                gradientDrawable.setStroke(roundToPx(q2.b()), q2.a());
                if (b != null) {
                    gradientDrawable.setCornerRadii(new float[]{roundToPx(b.d()), roundToPx(b.d()), roundToPx(b.c()), roundToPx(b.c()), roundToPx(b.b()), roundToPx(b.b()), roundToPx(b.a()), roundToPx(b.a())});
                }
                getView().setBackground(gradientDrawable);
                return;
            }
            return;
        }
        int p = fzyVar2.p();
        if (fzyVar == null || p != fzyVar.p()) {
            getView().setBackgroundColor(fzyVar2.p());
        }
    }
}
