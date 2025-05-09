package com.taobao.android.detail.ttdetail.transfer.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXLinearLayoutManager;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.jb6;
import tb.k06;
import tb.mop;
import tb.qub;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliDetailScrollerLayoutWidgetNode extends DXScrollerLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_WIDGET_ID = k06.a("DetailHeaderSKU");
    public static final long b = k06.a(mop.KEY_SELECTED_INDEX);

    /* renamed from: a  reason: collision with root package name */
    public int f6952a = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class AliDetailLinearLayoutManager extends DXLinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262670);
        }

        public AliDetailLinearLayoutManager(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(AliDetailLinearLayoutManager aliDetailLinearLayoutManager, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/AliDetailScrollerLayoutWidgetNode$AliDetailLinearLayoutManager");
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
                return;
            }
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(tq4.d(recyclerView)) { // from class: com.taobao.android.detail.ttdetail.transfer.widget.AliDetailScrollerLayoutWidgetNode.AliDetailLinearLayoutManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/AliDetailScrollerLayoutWidgetNode$AliDetailLinearLayoutManager$1");
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                    }
                    return 120.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public PointF computeScrollVectorForPosition(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (PointF) ipChange2.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i2)});
                    }
                    return AliDetailLinearLayoutManager.this.computeScrollVectorForPosition(i2);
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public int calculateDtToFit(int i2, int i3, int i4, int i5, int i6) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).intValue();
                    }
                    int i7 = ((i5 - i4) / 2) - ((i3 - i2) / 2);
                    if (i6 == -1) {
                        return (i4 + i7) - i2;
                    }
                    if (i6 == 0) {
                        int i8 = i4 - i2;
                        int abs = Math.abs(i8);
                        int i9 = i5 - i3;
                        int abs2 = Math.abs(i9);
                        if (abs < abs2) {
                            return i8 + i7;
                        }
                        if (abs > abs2) {
                            return i9 - i7;
                        }
                        return 0;
                    } else if (i6 == 1) {
                        return (i5 - i7) - i3;
                    } else {
                        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                    }
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            startSmoothScroll(linearSmoothScroller);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f6954a;

        public a(View view) {
            this.f6954a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((RecyclerView) this.f6954a).smoothScrollToPosition(AliDetailScrollerLayoutWidgetNode.t(AliDetailScrollerLayoutWidgetNode.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262672);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new AliDetailScrollerLayoutWidgetNode();
        }
    }

    public static /* synthetic */ Object ipc$super(AliDetailScrollerLayoutWidgetNode aliDetailScrollerLayoutWidgetNode, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/transfer/widget/AliDetailScrollerLayoutWidgetNode");
        }
    }

    public static /* synthetic */ int t(AliDetailScrollerLayoutWidgetNode aliDetailScrollerLayoutWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d185e3a", new Object[]{aliDetailScrollerLayoutWidgetNode})).intValue();
        }
        return aliDetailScrollerLayoutWidgetNode.f6952a;
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new AliDetailScrollerLayoutWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout
    public DXLinearLayoutManager newLinearLayoutManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXLinearLayoutManager) ipChange.ipc$dispatch("ab4f4def", new Object[]{this, context});
        }
        return new AliDetailLinearLayoutManager(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof AliDetailScrollerLayoutWidgetNode) {
            this.f6952a = ((AliDetailScrollerLayoutWidgetNode) dXWidgetNode).f6952a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof RecyclerView) {
            jb6.n(new a(view));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (b == j) {
            this.f6952a = i;
        }
    }

    static {
        t2o.a(912262668);
    }
}
