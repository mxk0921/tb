package com.taobao.android.dinamicx.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import tb.bew;
import tb.la6;
import tb.qub;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXHorizontalAutoScrollLayoutWidgetNode extends DXScrollerLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHORIZONTALAUTOSCROLLLAYOUT_AUTOSCROLLAFTERMANUAL = -831304460897885043L;
    public static final long DXHORIZONTALAUTOSCROLLLAYOUT_AUTOSCROLLONREAPPEAR = 6684776581426363689L;
    public static final long DXHORIZONTALAUTOSCROLLLAYOUT_ENABLEMANUALSCROLL = -4474873398134391738L;
    public static final long DXHORIZONTALAUTOSCROLLLAYOUT_HORIZONTALAUTOSCROLLLAYOUT = -5197949290532568118L;
    public static final long DXHORIZONTALAUTOSCROLLLAYOUT_PAUSEONSCROLL = 8820284211268372055L;
    public static final long DXHORIZONTALAUTOSCROLLLAYOUT_SPEED = 19481003436246L;
    public static final long DXHORIZONTALAUTOSCROLLLAYOUT_TRIGGERBYPLAYCONTROL_ANDROID = -2201584159554498174L;
    private static final String TAG = "HorizontalAutoScrollLayoutWidgetNode";
    private boolean enableManualScroll = false;
    private boolean triggerByPlayControl_android = false;
    private double speed = 30.0d;
    private boolean isDetached = false;
    private boolean autoScrollAfterManual = false;
    private boolean autoScrollOnReappear = true;
    private boolean finishedPlaying = false;
    private boolean pauseOnScroll = false;
    private boolean animationStop = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Animation {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f7365a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ RecyclerView d;

        public a(int i, int i2, RecyclerView recyclerView) {
            this.b = i;
            this.c = i2;
            this.d = recyclerView;
            this.f7365a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXHorizontalAutoScrollLayoutWidgetNode$2");
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("882d4c01", new Object[]{this, new Float(f), transformation});
                return;
            }
            int i = ((int) (this.c * f)) + this.b;
            int max = Math.max(i - this.f7365a, 0);
            if (max > 0 && !DXHorizontalAutoScrollLayoutWidgetNode.access$200(DXHorizontalAutoScrollLayoutWidgetNode.this)) {
                DXHorizontalAutoScrollLayoutWidgetNode.access$600(DXHorizontalAutoScrollLayoutWidgetNode.this, this.d, i, this.f7365a, max);
                this.d.scrollBy(max, 0);
                this.f7365a = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXHorizontalAutoScrollLayoutWidgetNode();
        }
    }

    public static /* synthetic */ boolean access$000(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f54bd52", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode})).booleanValue();
        }
        return dXHorizontalAutoScrollLayoutWidgetNode.enableManualScroll;
    }

    public static /* synthetic */ boolean access$100(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae062771", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode})).booleanValue();
        }
        return dXHorizontalAutoScrollLayoutWidgetNode.animationStop;
    }

    public static /* synthetic */ boolean access$102(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3b2250d", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode, new Boolean(z)})).booleanValue();
        }
        dXHorizontalAutoScrollLayoutWidgetNode.animationStop = z;
        return z;
    }

    public static /* synthetic */ boolean access$200(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcb79190", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode})).booleanValue();
        }
        return dXHorizontalAutoScrollLayoutWidgetNode.finishedPlaying;
    }

    public static /* synthetic */ boolean access$202(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b2dfece", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode, new Boolean(z)})).booleanValue();
        }
        dXHorizontalAutoScrollLayoutWidgetNode.finishedPlaying = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b68fbaf", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode})).booleanValue();
        }
        return dXHorizontalAutoScrollLayoutWidgetNode.autoScrollAfterManual;
    }

    public static /* synthetic */ void access$400(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode, RecyclerView recyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c57dc07", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode, recyclerView, new Boolean(z)});
        } else {
            dXHorizontalAutoScrollLayoutWidgetNode.doAutoScrollAnimation(recyclerView, z);
        }
    }

    public static /* synthetic */ boolean access$500(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68cbcfed", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode})).booleanValue();
        }
        return dXHorizontalAutoScrollLayoutWidgetNode.isDetached;
    }

    public static /* synthetic */ boolean access$502(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71a18c11", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode, new Boolean(z)})).booleanValue();
        }
        dXHorizontalAutoScrollLayoutWidgetNode.isDetached = z;
        return z;
    }

    public static /* synthetic */ void access$600(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode, RecyclerView recyclerView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4214ded4", new Object[]{dXHorizontalAutoScrollLayoutWidgetNode, recyclerView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            dXHorizontalAutoScrollLayoutWidgetNode.logAnimationProcess(recyclerView, i, i2, i3);
        }
    }

    private void doAutoScrollAnimation(RecyclerView recyclerView, boolean z) {
        int i;
        DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4df841", new Object[]{this, recyclerView, new Boolean(z)});
        } else if (!this.triggerByPlayControl_android || z) {
            DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode2 = (DXHorizontalAutoScrollLayoutWidgetNode) getDXRuntimeContext().W();
            Object tag = recyclerView.getTag(DXWidgetNode.TAG_WIDGET_NODE);
            if ((tag instanceof DXHorizontalAutoScrollLayoutWidgetNode) && (dXHorizontalAutoScrollLayoutWidgetNode = (DXHorizontalAutoScrollLayoutWidgetNode) tag) != dXHorizontalAutoScrollLayoutWidgetNode2) {
                la6.b(recyclerView.hashCode() + " onAttachedToWindow scrollerLayout not match");
                dXHorizontalAutoScrollLayoutWidgetNode2 = dXHorizontalAutoScrollLayoutWidgetNode;
            }
            if (dXHorizontalAutoScrollLayoutWidgetNode2 != null) {
                if (dXHorizontalAutoScrollLayoutWidgetNode2.contentHorizontalLength - dXHorizontalAutoScrollLayoutWidgetNode2.getMeasuredWidth() <= 0 || dXHorizontalAutoScrollLayoutWidgetNode2.getContentOffset() <= 0) {
                    i = 0;
                } else {
                    i = dXHorizontalAutoScrollLayoutWidgetNode2.getContentOffset();
                }
                int max = Math.max(dXHorizontalAutoScrollLayoutWidgetNode2.contentHorizontalLength - dXHorizontalAutoScrollLayoutWidgetNode2.getMeasuredWidth(), 0);
                long j = (long) ((max / this.speed) * 1000.0d);
                la6.b("HorizontalAutoScrollLayoutWidgetNode , animationDistance: " + max);
                if (max > 0 && max != dXHorizontalAutoScrollLayoutWidgetNode2.getContentOffset()) {
                    a aVar = new a(i, max, recyclerView);
                    aVar.setInterpolator(new LinearInterpolator());
                    aVar.setDuration(j);
                    recyclerView.clearAnimation();
                    recyclerView.startAnimation(aVar);
                    this.animationStop = false;
                }
            }
        }
    }

    private int getNodeContentOffset(RecyclerView recyclerView) {
        int contentOffset;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a15e3c2f", new Object[]{this, recyclerView})).intValue();
        }
        try {
            Object tag = recyclerView.getTag(DXWidgetNode.TAG_WIDGET_NODE);
            if (tag instanceof DXHorizontalAutoScrollLayoutWidgetNode) {
                contentOffset = ((DXHorizontalAutoScrollLayoutWidgetNode) tag).getContentOffset();
            } else {
                contentOffset = getContentOffset();
            }
            return contentOffset;
        } catch (Throwable th) {
            la6.b("HorizontalAutoScrollLayoutWidgetNode getNodeContentOffset error: " + th.getLocalizedMessage());
            return 0;
        }
    }

    public static /* synthetic */ Object ipc$super(DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXHorizontalAutoScrollLayoutWidgetNode");
        }
    }

    private void logAnimationProcess(RecyclerView recyclerView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce54f702", new Object[]{this, recyclerView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (DinamicXEngine.j0()) {
            la6.b("HorizontalAutoScrollLayoutWidgetNode " + recyclerView.hashCode() + " targetOffset:" + i + ", appliedOffset: " + i2 + ", nodeContentOffset: " + getNodeContentOffset(recyclerView) + ", deltaOffset: " + i3);
        }
    }

    private void resetCallBack(Context context, final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c77f8a", new Object[]{this, context, recyclerView});
            return;
        }
        Window window = ((Activity) context).getWindow();
        Window.Callback callback = window.getCallback();
        if (callback != null && Looper.myLooper() == Looper.getMainLooper()) {
            window.setCallback(new WindowCallbackWrapper(callback) { // from class: com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    if (str.hashCode() == 2075560917) {
                        return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXHorizontalAutoScrollLayoutWidgetNode$3");
                }

                /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
                    if (r3 != 2) goto L_0x0074;
                 */
                @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
                    /*
                        r5 = this;
                        r0 = 1
                        r1 = 0
                        r2 = 2
                        com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.AnonymousClass3.$ipChange
                        boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                        if (r4 == 0) goto L_0x001c
                        java.lang.String r4 = "7bb68bd5"
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        r2[r1] = r5
                        r2[r0] = r6
                        java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        return r6
                    L_0x001c:
                        int r3 = r6.getAction()
                        if (r3 == 0) goto L_0x003f
                        if (r3 == r0) goto L_0x0027
                        if (r3 == r2) goto L_0x003f
                        goto L_0x0074
                    L_0x0027:
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                        boolean r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$300(r0)
                        if (r0 == 0) goto L_0x0074
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                        boolean r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$200(r0)
                        if (r0 != 0) goto L_0x0074
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                        androidx.recyclerview.widget.RecyclerView r2 = r3
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$400(r0, r2, r1)
                        goto L_0x0074
                    L_0x003f:
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                        boolean r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$100(r1)
                        if (r1 != 0) goto L_0x0051
                        androidx.recyclerview.widget.RecyclerView r1 = r3
                        r1.clearAnimation()
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$102(r1, r0)
                    L_0x0051:
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                        int r1 = r1.contentHorizontalLength
                        androidx.recyclerview.widget.RecyclerView r2 = r3
                        int r2 = r2.getMeasuredWidth()
                        int r1 = r1 - r2
                        if (r1 <= 0) goto L_0x006d
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r2 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                        int r2 = r2.getContentOffset()
                        if (r2 <= 0) goto L_0x006d
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r2 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                        int r2 = r2.getContentOffset()
                        int r1 = r1 - r2
                    L_0x006d:
                        if (r1 > 0) goto L_0x0074
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                        com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$202(r1, r0)
                    L_0x0074:
                        boolean r6 = super.dispatchTouchEvent(r6)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.AnonymousClass3.dispatchTouchEvent(android.view.MotionEvent):boolean");
                }
            });
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXHorizontalAutoScrollLayoutWidgetNode();
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
        if (j == DXHORIZONTALAUTOSCROLLLAYOUT_ENABLEMANUALSCROLL || j == DXHORIZONTALAUTOSCROLLLAYOUT_TRIGGERBYPLAYCONTROL_ANDROID || j == DXHORIZONTALAUTOSCROLLLAYOUT_AUTOSCROLLAFTERMANUAL) {
            return 0;
        }
        if (j == DXHORIZONTALAUTOSCROLLLAYOUT_AUTOSCROLLONREAPPEAR) {
            return 1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof DXHorizontalAutoScrollLayoutWidgetNode) {
            super.onClone(dXWidgetNode, z);
            DXHorizontalAutoScrollLayoutWidgetNode dXHorizontalAutoScrollLayoutWidgetNode = (DXHorizontalAutoScrollLayoutWidgetNode) dXWidgetNode;
            this.enableManualScroll = dXHorizontalAutoScrollLayoutWidgetNode.enableManualScroll;
            this.triggerByPlayControl_android = dXHorizontalAutoScrollLayoutWidgetNode.triggerByPlayControl_android;
            this.speed = dXHorizontalAutoScrollLayoutWidgetNode.speed;
            this.autoScrollAfterManual = dXHorizontalAutoScrollLayoutWidgetNode.autoScrollAfterManual;
            this.autoScrollOnReappear = dXHorizontalAutoScrollLayoutWidgetNode.autoScrollOnReappear;
            this.finishedPlaying = dXHorizontalAutoScrollLayoutWidgetNode.finishedPlaying;
            this.pauseOnScroll = dXHorizontalAutoScrollLayoutWidgetNode.pauseOnScroll;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        int contentOffset;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeRecyclerView dXNativeRecyclerView = new DXNativeRecyclerView(context) { // from class: com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1447998406) {
                    return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
                }
                if (hashCode == 949399698) {
                    super.onDetachedFromWindow();
                    return null;
                } else if (hashCode == 1626033557) {
                    super.onAttachedToWindow();
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXHorizontalAutoScrollLayoutWidgetNode$1");
                }
            }

            @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("60eb4d95", new Object[]{this});
                    return;
                }
                super.onAttachedToWindow();
                if (DXHorizontalAutoScrollLayoutWidgetNode.access$500(DXHorizontalAutoScrollLayoutWidgetNode.this)) {
                    DXHorizontalAutoScrollLayoutWidgetNode.access$502(DXHorizontalAutoScrollLayoutWidgetNode.this, false);
                    la6.b("HorizontalAutoScrollLayoutWidgetNode onAttachedToWindow after onDetachedFromWindow");
                    if (!DXHorizontalAutoScrollLayoutWidgetNode.access$200(DXHorizontalAutoScrollLayoutWidgetNode.this)) {
                        DXHorizontalAutoScrollLayoutWidgetNode.access$400(DXHorizontalAutoScrollLayoutWidgetNode.this, this, false);
                    }
                }
            }

            @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public void onDetachedFromWindow() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3896b092", new Object[]{this});
                    return;
                }
                super.onDetachedFromWindow();
                la6.b("HorizontalAutoScrollLayoutWidgetNode onDetachedFromWindow");
                DXHorizontalAutoScrollLayoutWidgetNode.access$502(DXHorizontalAutoScrollLayoutWidgetNode.this, true);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
                if (r3 != 2) goto L_0x0076;
             */
            @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onTouchEvent(android.view.MotionEvent r6) {
                /*
                    r5 = this;
                    r0 = 1
                    r1 = 0
                    r2 = 2
                    com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.AnonymousClass1.$ipChange
                    boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r4 == 0) goto L_0x001c
                    java.lang.String r4 = "a9b14c3a"
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r2[r1] = r5
                    r2[r0] = r6
                    java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    return r6
                L_0x001c:
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r3 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    boolean r3 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$000(r3)
                    if (r3 == 0) goto L_0x007b
                    int r3 = r6.getAction()
                    if (r3 == 0) goto L_0x0045
                    if (r3 == r0) goto L_0x002f
                    if (r3 == r2) goto L_0x0045
                    goto L_0x0076
                L_0x002f:
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    boolean r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$300(r0)
                    if (r0 == 0) goto L_0x0076
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    boolean r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$200(r0)
                    if (r0 != 0) goto L_0x0076
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r0 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$400(r0, r5, r1)
                    goto L_0x0076
                L_0x0045:
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    boolean r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$100(r1)
                    if (r1 != 0) goto L_0x0055
                    r5.clearAnimation()
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$102(r1, r0)
                L_0x0055:
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    int r1 = r1.contentHorizontalLength
                    int r2 = r5.getMeasuredWidth()
                    int r1 = r1 - r2
                    if (r1 <= 0) goto L_0x006f
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r2 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    int r2 = r2.getContentOffset()
                    if (r2 <= 0) goto L_0x006f
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r2 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    int r2 = r2.getContentOffset()
                    int r1 = r1 - r2
                L_0x006f:
                    if (r1 > 0) goto L_0x0076
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode r1 = com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.this
                    com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.access$202(r1, r0)
                L_0x0076:
                    boolean r6 = super.onTouchEvent(r6)
                    return r6
                L_0x007b:
                    int r3 = r6.getAction()
                    if (r3 == r2) goto L_0x0089
                    boolean r6 = super.onTouchEvent(r6)
                    if (r6 == 0) goto L_0x0088
                    goto L_0x0089
                L_0x0088:
                    r0 = 0
                L_0x0089:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXHorizontalAutoScrollLayoutWidgetNode.AnonymousClass1.onTouchEvent(android.view.MotionEvent):boolean");
            }
        };
        closeDefaultAnimator(dXNativeRecyclerView);
        if (getOrientation() == 0 && (contentOffset = getContentOffset()) > 0) {
            la6.b("HorizontalAutoScrollLayoutWidgetNode " + dXNativeRecyclerView.hashCode() + ", createView contentOffset: " + contentOffset);
            dXNativeRecyclerView.scrollBy(contentOffset, 0);
        }
        if (this.pauseOnScroll) {
            if (context instanceof bew) {
                Context b2 = ((bew) context).b();
                if (b2 != null) {
                    resetCallBack(b2, dXNativeRecyclerView);
                }
            } else if (context instanceof Activity) {
                resetCallBack(context, dXNativeRecyclerView);
            }
        }
        return dXNativeRecyclerView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (getOrientation() == 0 && (view instanceof RecyclerView)) {
            doAutoScrollAnimation((RecyclerView) view, false);
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
        } else if (j == DXHORIZONTALAUTOSCROLLLAYOUT_ENABLEMANUALSCROLL) {
            if (i == 0) {
                z = false;
            }
            this.enableManualScroll = z;
        } else if (j == DXHORIZONTALAUTOSCROLLLAYOUT_TRIGGERBYPLAYCONTROL_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.triggerByPlayControl_android = z;
        } else if (j == DXHORIZONTALAUTOSCROLLLAYOUT_AUTOSCROLLAFTERMANUAL) {
            if (i == 0) {
                z = false;
            }
            this.autoScrollAfterManual = z;
        } else if (j == DXHORIZONTALAUTOSCROLLLAYOUT_AUTOSCROLLONREAPPEAR) {
            if (i == 0) {
                z = false;
            }
            this.autoScrollOnReappear = z;
        } else if (j == DXHORIZONTALAUTOSCROLLLAYOUT_PAUSEONSCROLL) {
            if (i == 0) {
                z = false;
            }
            this.pauseOnScroll = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, tb.t8e
    public void stopVideoPlayControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6dacb7", new Object[]{this});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D != null) {
            D.clearAnimation();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, tb.t8e
    public void triggerVideoPlayControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421036d", new Object[]{this});
            return;
        }
        View D = getDXRuntimeContext().D();
        if (D instanceof DXNativeRecyclerView) {
            doAutoScrollAnimation((RecyclerView) D, true);
        }
    }
}
