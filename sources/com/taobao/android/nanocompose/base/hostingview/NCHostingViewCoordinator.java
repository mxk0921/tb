package com.taobao.android.nanocompose.base.hostingview;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.android.nanocompose.runtime.context.RenderContext;
import com.taobao.android.nanocompose.viewhandler.NCComponentViewHandler;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.ckf;
import tb.iiz;
import tb.ilz;
import tb.jlz;
import tb.mlz;
import tb.qhz;
import tb.t2o;
import tb.u2z;
import tb.yg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NCHostingViewCoordinator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<NCHostingView> hostingView;
    private RenderContext renderContext;

    static {
        t2o.a(598736936);
    }

    public NCHostingViewCoordinator(RenderContext renderContext, WeakReference<NCHostingView> weakReference) {
        ckf.g(renderContext, "renderContext");
        ckf.g(weakReference, "hostingView");
        this.renderContext = renderContext;
        this.hostingView = weakReference;
    }

    public final WeakReference<NCHostingView> getHostingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("36b3b69e", new Object[]{this});
        }
        return this.hostingView;
    }

    public final RenderContext getRenderContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContext) ipChange.ipc$dispatch("cc4f291d", new Object[]{this});
        }
        return this.renderContext;
    }

    public final void onLayout$nanocompose_slimRelease(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc8a93f", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.renderContext.j().measureAndLayout();
        }
    }

    public final void onMeasure$nanocompose_slimRelease(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6d4aab", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.renderContext.j().mo320updateRootConstraintsW2SWlxA(u2z.Companion.d(i, i2));
        this.renderContext.j().measureOnly();
    }

    public final native NCComponentViewHandler renderHostingView(Context context, NCHostingView nCHostingView, String str, long j, String str2, String str3);

    public final void renderHostingView$nanocompose_slimRelease(RenderContext renderContext, mlz mlzVar, qhz qhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2cb1a84", new Object[]{this, renderContext, mlzVar, qhzVar});
            return;
        }
        ckf.g(renderContext, "renderContext");
        ckf.g(mlzVar, "scheduler");
        ckf.g(qhzVar, "renderParams");
        if (iiz.c()) {
            iiz.Companion.j("hostingViewCoordinator renderHostingView start");
        }
        scheduleRenderTask$nanocompose_slimRelease(renderContext, this.hostingView, mlzVar, qhzVar);
    }

    public final void renderHostingViewCPP$nanocompose_slimRelease(TemplateItem templateItem, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b75e43", new Object[]{this, templateItem, map});
            return;
        }
        ckf.g(templateItem, yg.CACHE_KEY_TEMPLATE_INFO);
        ckf.g(map, "data");
        Trace.beginSection("Nano renderHostingView");
        NCHostingView nCHostingView = this.hostingView.get();
        if (nCHostingView != null) {
            Context context = nCHostingView.getContext();
            ckf.f(context, "hView.context");
            NCComponentViewHandler renderHostingView = renderHostingView(context, nCHostingView, templateItem.c(), templateItem.e(), templateItem.d(), map.toString());
            if (renderHostingView != null) {
                nCHostingView.addView(renderHostingView.getView());
            }
            Trace.endSection();
            if (iiz.c()) {
                iiz.Companion.j("hostingViewCoordinator renderHostingView end");
            }
        }
    }

    public final void scheduleRenderTask$nanocompose_slimRelease(RenderContext renderContext, WeakReference<NCHostingView> weakReference, mlz mlzVar, qhz qhzVar) {
        NCComponentViewHandler v;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3c79db", new Object[]{this, renderContext, weakReference, mlzVar, qhzVar});
            return;
        }
        ckf.g(renderContext, "renderContext");
        ckf.g(weakReference, "hostingViewRef");
        ckf.g(mlzVar, "scheduler");
        ckf.g(qhzVar, "renderParams");
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        ilz ilzVar = new ilz(renderContext, new jlz(renderContext), null, 4, null);
        mlzVar.a(ilzVar);
        if (!(!ilzVar.d() || (v = ilzVar.b().v()) == null || (view = v.getView()) == null)) {
            NCHostingView nCHostingView = weakReference.get();
            if (nCHostingView != null) {
                nCHostingView.removeAllViews();
            }
            NCHostingView nCHostingView2 = weakReference.get();
            if (nCHostingView2 != null) {
                nCHostingView2.addView(view);
            }
        }
        iiz.a aVar = iiz.Companion;
        aVar.d(renderContext.b(), renderContext.l().e().c(), renderContext.l().e().e(), ilzVar.d());
        aVar.h(renderContext.b(), renderContext.l().e().c(), renderContext.l().e().e(), iiz.PERF_STAG_TOTAL, SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos);
    }

    public final void setHostingView(WeakReference<NCHostingView> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ffbdda", new Object[]{this, weakReference});
            return;
        }
        ckf.g(weakReference, "<set-?>");
        this.hostingView = weakReference;
    }

    public final void setRenderContext(RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285905cf", new Object[]{this, renderContext});
            return;
        }
        ckf.g(renderContext, "<set-?>");
        this.renderContext = renderContext;
    }

    public final void updateRenderContext(RenderContext renderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10688", new Object[]{this, renderContext});
            return;
        }
        ckf.g(renderContext, "renderContext");
        this.renderContext = renderContext;
    }
}
