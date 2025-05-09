package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.widgetnode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.ArrayList;
import tb.fl6;
import tb.h6d;
import tb.m47;
import tb.qub;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXMarqueeLayoutWidgetNode extends DXScrollerLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMARQUEELAYOUT_AUTOSCROLL = 2581999839571595826L;
    public static final long DXMARQUEELAYOUT_MARQUEELAYOUT = 965271114890070363L;
    public static final long DXMARQUEELAYOUT_SPEED = 19481003436246L;
    private static final String TAG = "MarqueeLayout";
    private AutoScrollTask autoScrollTask;
    private boolean isPageIntercept;
    private h6d pageLifeCycle;
    private boolean autoScroll = false;
    private double speed = 30.0d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AutoScrollTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private MarqueeRecyclerView recyclerView;
        private DXMarqueeLayoutWidgetNode widgetNode;

        static {
            t2o.a(486539472);
        }

        public AutoScrollTask(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode, MarqueeRecyclerView marqueeRecyclerView) {
            this.widgetNode = dXMarqueeLayoutWidgetNode;
            this.recyclerView = marqueeRecyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.widgetNode == MarqueeRecyclerView.access$500(this.recyclerView) && this.recyclerView.getWidth() > 0 && this.recyclerView.getChildCount() > 0 && DXMarqueeLayoutWidgetNode.access$600(this.widgetNode) > this.recyclerView.getWidth()) {
                DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode = this.widgetNode;
                DXMarqueeLayoutWidgetNode.access$700(dXMarqueeLayoutWidgetNode, dXMarqueeLayoutWidgetNode, this.recyclerView);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class MarqueeAdapter extends DXScrollerLayout.ScrollerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean isInfiniteLoop;

        static {
            t2o.a(486539474);
        }

        public MarqueeAdapter(Context context, DXScrollerLayout dXScrollerLayout) {
            super(context, dXScrollerLayout);
        }

        public static /* synthetic */ Object ipc$super(MarqueeAdapter marqueeAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/DXMarqueeLayoutWidgetNode$MarqueeAdapter");
        }

        @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter
        public DXWidgetNode getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("e59e5492", new Object[]{this, new Integer(i)});
            }
            if (!this.isInfiniteLoop) {
                return this.dataSource.get(i);
            }
            ArrayList<DXWidgetNode> arrayList = this.dataSource;
            return arrayList.get(i % arrayList.size());
        }

        @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout.ScrollerAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            if (this.isInfiniteLoop) {
                return Integer.MAX_VALUE;
            }
            return this.dataSource.size();
        }

        public void setInfiniteLoop(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfcddf13", new Object[]{this, new Boolean(z)});
            } else {
                this.isInfiniteLoop = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends Animation {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10642a = 0;
        public final /* synthetic */ int b;
        public final /* synthetic */ RecyclerView c;

        public a(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode, int i, RecyclerView recyclerView) {
            this.b = i;
            this.c = recyclerView;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/DXMarqueeLayoutWidgetNode$1");
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("882d4c01", new Object[]{this, new Float(f), transformation});
                return;
            }
            if (f == 0.0f) {
                this.f10642a = 0;
            }
            int i = (int) (this.b * f);
            int max = Math.max(i - this.f10642a, 0);
            if (max > 0) {
                this.c.scrollBy(max, 0);
                this.f10642a = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/DXMarqueeLayoutWidgetNode$2");
        }

        @Override // tb.m47, tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            DXMarqueeLayoutWidgetNode.access$202(DXMarqueeLayoutWidgetNode.this, true);
            MarqueeRecyclerView access$300 = DXMarqueeLayoutWidgetNode.access$300(DXMarqueeLayoutWidgetNode.this);
            if (access$300 != null) {
                access$300.clearAnimation();
            }
        }

        @Override // tb.m47, tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                return;
            }
            DXMarqueeLayoutWidgetNode.access$202(DXMarqueeLayoutWidgetNode.this, false);
            MarqueeRecyclerView access$300 = DXMarqueeLayoutWidgetNode.access$300(DXMarqueeLayoutWidgetNode.this);
            if (access$300 != null) {
                DXMarqueeLayoutWidgetNode.access$400(DXMarqueeLayoutWidgetNode.this, access$300);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(486539473);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXMarqueeLayoutWidgetNode();
        }
    }

    static {
        t2o.a(486539469);
    }

    public static /* synthetic */ boolean access$202(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb060b5", new Object[]{dXMarqueeLayoutWidgetNode, new Boolean(z)})).booleanValue();
        }
        dXMarqueeLayoutWidgetNode.isPageIntercept = z;
        return z;
    }

    public static /* synthetic */ MarqueeRecyclerView access$300(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MarqueeRecyclerView) ipChange.ipc$dispatch("b5766cda", new Object[]{dXMarqueeLayoutWidgetNode});
        }
        return dXMarqueeLayoutWidgetNode.getView();
    }

    public static /* synthetic */ void access$400(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode, MarqueeRecyclerView marqueeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b2bec9", new Object[]{dXMarqueeLayoutWidgetNode, marqueeRecyclerView});
        } else {
            dXMarqueeLayoutWidgetNode.checkAutoScrollAnimation(marqueeRecyclerView);
        }
    }

    public static /* synthetic */ int access$600(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fe4d578", new Object[]{dXMarqueeLayoutWidgetNode})).intValue();
        }
        return dXMarqueeLayoutWidgetNode.contentHorizontalLength;
    }

    public static /* synthetic */ void access$700(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode, DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode2, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4207db69", new Object[]{dXMarqueeLayoutWidgetNode, dXMarqueeLayoutWidgetNode2, recyclerView});
        } else {
            dXMarqueeLayoutWidgetNode.startScrollAnimation(dXMarqueeLayoutWidgetNode2, recyclerView);
        }
    }

    public static /* synthetic */ void access$800(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2de0107", new Object[]{dXMarqueeLayoutWidgetNode});
        } else {
            dXMarqueeLayoutWidgetNode.unRegisterPageLifeCycle();
        }
    }

    private void checkAutoScrollAnimation(MarqueeRecyclerView marqueeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf19b0ad", new Object[]{this, marqueeRecyclerView});
            return;
        }
        AutoScrollTask autoScrollTask = this.autoScrollTask;
        if (autoScrollTask != null) {
            marqueeRecyclerView.removeCallbacks(autoScrollTask);
        }
        marqueeRecyclerView.clearAnimation();
        if (this.autoScroll && !this.isPageIntercept && !MarqueeRecyclerView.access$100(marqueeRecyclerView)) {
            AutoScrollTask autoScrollTask2 = new AutoScrollTask(this, marqueeRecyclerView);
            this.autoScrollTask = autoScrollTask2;
            marqueeRecyclerView.postDelayed(autoScrollTask2, 100L);
        }
    }

    private h6d createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new b();
    }

    private IMainLifecycleService getMainLifecycleService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainLifecycleService) ipChange.ipc$dispatch("c19a0579", new Object[]{this});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return null;
        }
        fl6 S = dXRuntimeContext.S();
        if (!(S instanceof InfoFlowDxUserContext)) {
            return null;
        }
        InfoFlowDxUserContext infoFlowDxUserContext = (InfoFlowDxUserContext) S;
        if (infoFlowDxUserContext.getInfoFlowContext() == null) {
            return null;
        }
        return (IMainLifecycleService) infoFlowDxUserContext.getInfoFlowContext().a(IMainLifecycleService.class);
    }

    private MarqueeRecyclerView getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MarqueeRecyclerView) ipChange.ipc$dispatch("d32b22fa", new Object[]{this});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext == null) {
            return null;
        }
        View D = dXRuntimeContext.D();
        if (!(D instanceof MarqueeRecyclerView)) {
            return null;
        }
        return (MarqueeRecyclerView) D;
    }

    public static /* synthetic */ Object ipc$super(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/DXMarqueeLayoutWidgetNode");
        }
    }

    private void registerPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5277401f", new Object[]{this});
            return;
        }
        IMainLifecycleService mainLifecycleService = getMainLifecycleService();
        if (mainLifecycleService != null && this.pageLifeCycle == null) {
            this.pageLifeCycle = createPageLifeCycle();
            mainLifecycleService.getPageLifeCycleRegister().a(this.pageLifeCycle);
        }
    }

    private void startScrollAnimation(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e9d973", new Object[]{this, dXMarqueeLayoutWidgetNode, recyclerView});
            return;
        }
        registerPageLifeCycle();
        MarqueeAdapter marqueeAdapter = (MarqueeAdapter) recyclerView.getAdapter();
        marqueeAdapter.setInfiniteLoop(true);
        marqueeAdapter.notifyDataSetChanged();
        int max = Math.max(dXMarqueeLayoutWidgetNode.contentHorizontalLength, 0);
        long j = (max / (((float) this.speed) * 3.0f)) * 1000.0f;
        if (max > 0 && max != dXMarqueeLayoutWidgetNode.getContentOffset()) {
            a aVar = new a(this, max, recyclerView);
            aVar.setInterpolator(new LinearInterpolator());
            aVar.setDuration(j);
            aVar.setRepeatCount(-1);
            aVar.setRepeatMode(1);
            recyclerView.startAnimation(aVar);
        }
    }

    private void unRegisterPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9dbff86", new Object[]{this});
            return;
        }
        IMainLifecycleService mainLifecycleService = getMainLifecycleService();
        if (mainLifecycleService != null && this.pageLifeCycle != null) {
            mainLifecycleService.getPageLifeCycleRegister().b(this.pageLifeCycle);
            this.pageLifeCycle = null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXMarqueeLayoutWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == 19481003436246L) {
            return 30.0d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 2581999839571595826L) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXMarqueeLayoutWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode = (DXMarqueeLayoutWidgetNode) dXWidgetNode;
            this.speed = dXMarqueeLayoutWidgetNode.speed;
            this.autoScroll = dXMarqueeLayoutWidgetNode.autoScroll;
            this.autoScrollTask = dXMarqueeLayoutWidgetNode.autoScrollTask;
            this.isPageIntercept = dXMarqueeLayoutWidgetNode.isPageIntercept;
            this.pageLifeCycle = dXMarqueeLayoutWidgetNode.pageLifeCycle;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        MarqueeRecyclerView marqueeRecyclerView = new MarqueeRecyclerView(context);
        MarqueeRecyclerView.access$000(marqueeRecyclerView, this);
        return marqueeRecyclerView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (getOrientation() == 0 && (view instanceof MarqueeRecyclerView)) {
            MarqueeRecyclerView marqueeRecyclerView = (MarqueeRecyclerView) view;
            MarqueeRecyclerView.access$000(marqueeRecyclerView, this);
            marqueeRecyclerView.scrollToPosition(0);
            unRegisterPageLifeCycle();
            checkAutoScrollAnimation(marqueeRecyclerView);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 19481003436246L) {
            this.speed = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 2581999839571595826L) {
            if (i == 0) {
                z = false;
            }
            this.autoScroll = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public void setAdapter(DXScrollerLayout dXScrollerLayout, RecyclerView recyclerView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c19e8ee", new Object[]{this, dXScrollerLayout, recyclerView, context});
            return;
        }
        MarqueeAdapter marqueeAdapter = (MarqueeAdapter) recyclerView.getAdapter();
        if (marqueeAdapter == null) {
            MarqueeAdapter marqueeAdapter2 = new MarqueeAdapter(context, dXScrollerLayout);
            marqueeAdapter2.setInfiniteLoop(false);
            marqueeAdapter2.setHasStableIds(true);
            marqueeAdapter2.setDataSource(this.itemWidgetNodes);
            recyclerView.setAdapter(marqueeAdapter2);
            return;
        }
        marqueeAdapter.setInfiniteLoop(false);
        marqueeAdapter.setDataSource(this.itemWidgetNodes);
        marqueeAdapter.setScrollerLayout(dXScrollerLayout);
        marqueeAdapter.notifyDataSetChanged();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class MarqueeRecyclerView extends DXNativeRecyclerView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean isDetached = true;
        private DXMarqueeLayoutWidgetNode widgetNode;

        static {
            t2o.a(486539475);
        }

        public MarqueeRecyclerView(Context context) {
            super(context);
        }

        public static /* synthetic */ void access$000(MarqueeRecyclerView marqueeRecyclerView, DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59dc66c5", new Object[]{marqueeRecyclerView, dXMarqueeLayoutWidgetNode});
            } else {
                marqueeRecyclerView.setWidgetNode(dXMarqueeLayoutWidgetNode);
            }
        }

        public static /* synthetic */ boolean access$100(MarqueeRecyclerView marqueeRecyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fe030782", new Object[]{marqueeRecyclerView})).booleanValue();
            }
            return marqueeRecyclerView.isDetached();
        }

        public static /* synthetic */ DXMarqueeLayoutWidgetNode access$500(MarqueeRecyclerView marqueeRecyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXMarqueeLayoutWidgetNode) ipChange.ipc$dispatch("20ecfcdc", new Object[]{marqueeRecyclerView});
            }
            return marqueeRecyclerView.widgetNode;
        }

        public static /* synthetic */ Object ipc$super(MarqueeRecyclerView marqueeRecyclerView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            } else if (hashCode == 1626033557) {
                super.onAttachedToWindow();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/DXMarqueeLayoutWidgetNode$MarqueeRecyclerView");
            }
        }

        private boolean isDetached() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ccfff947", new Object[]{this})).booleanValue();
            }
            return this.isDetached;
        }

        private void setWidgetNode(DXMarqueeLayoutWidgetNode dXMarqueeLayoutWidgetNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcf0877", new Object[]{this, dXMarqueeLayoutWidgetNode});
            } else {
                this.widgetNode = dXMarqueeLayoutWidgetNode;
            }
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
                return;
            }
            super.onAttachedToWindow();
            if (this.isDetached) {
                this.isDetached = false;
                DXMarqueeLayoutWidgetNode.access$400(this.widgetNode, this);
            }
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
                return;
            }
            super.onDetachedFromWindow();
            this.isDetached = true;
            clearAnimation();
            DXMarqueeLayoutWidgetNode.access$800(this.widgetNode);
            DXMarqueeLayoutWidgetNode.access$202(this.widgetNode, false);
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            return false;
        }

        public MarqueeRecyclerView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public MarqueeRecyclerView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }
}
