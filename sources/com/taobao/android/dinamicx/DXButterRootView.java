package com.taobao.android.dinamicx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import java.util.ArrayList;
import tb.h36;
import tb.ic5;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXButterRootView extends DXRootView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isV3;
    public boolean skipSetHeightLayoutParams = false;
    public boolean skipSetWidthLayoutParams = false;
    public boolean useSysMeasureSpec;

    static {
        t2o.a(444596475);
    }

    public DXButterRootView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXButterRootView dXButterRootView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -789472068:
                return super.getExpandWidgetNode();
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 95174778:
                return super.getFlattenWidgetNode();
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXButterRootView");
        }
    }

    public void cloneWithCacheView(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2969bdcc", new Object[]{this, dXRootView});
        } else if (dXRootView != null) {
            setWidgetNode(dXRootView.getWidgetNode());
            while (dXRootView.getChildCount() > 0) {
                View childAt = dXRootView.getChildAt(0);
                dXRootView.removeViewAt(0);
                addView(childAt);
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = dXRootView.getLayoutParams();
            if (layoutParams == null) {
                setLayoutParams(new ViewGroup.LayoutParams(layoutParams2.width, layoutParams2.height));
            } else {
                layoutParams.width = layoutParams2.width;
                layoutParams.height = layoutParams2.height;
            }
            this.animationWidgets = dXRootView.animationWidgets;
            dXRootView.animationWidgets = null;
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeFrameLayout, tb.jyc
    public ViewGroup.LayoutParams generateLayoutParams(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("d55d0150", new Object[]{this, dXWidgetNode});
        }
        return new FrameLayout.LayoutParams(dXWidgetNode.getLayoutWidth(), dXWidgetNode.getLayoutHeight());
    }

    @Override // com.taobao.android.dinamicx.DXRootView
    public DXWidgetNode getExpandWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("d0f19cbc", new Object[]{this});
        }
        if (this.isV3) {
            return super.getExpandWidgetNode();
        }
        return this.layoutNode;
    }

    @Override // com.taobao.android.dinamicx.DXRootView
    public DXWidgetNode getFlattenWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5ac407a", new Object[]{this});
        }
        if (this.isV3) {
            return super.getFlattenWidgetNode();
        }
        return this.layoutNode;
    }

    public int getParentHeightSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93a624bc", new Object[]{this})).intValue();
        }
        return this.parentHeightSpec;
    }

    public int getParentWidthSpec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e657adb", new Object[]{this})).intValue();
        }
        return this.parentWidthSpec;
    }

    public boolean isV3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f46cfe52", new Object[]{this})).booleanValue();
        }
        return this.isV3;
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.isV3) {
            super.onLayout(z, i, i2, i3, i4);
        } else {
            DXTraceUtil.b("RootView#onLayout");
            j jVar = this.layoutNode;
            if (jVar != null && jVar.getVisibility() != 2) {
                if (this.layoutNode.getNativeView() != null) {
                    this.layoutNode.getNativeView().layout(0, 0, i3 - i, i4 - i2);
                } else {
                    super.onLayout(z, i, i2, i3, i4);
                }
                DXTraceUtil.c();
            }
        }
    }

    public void setSkipSetHeightLayoutParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806c895", new Object[]{this, new Boolean(z)});
        } else {
            this.skipSetHeightLayoutParams = z;
        }
    }

    public void setSkipSetWidthLayoutParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e49fb8", new Object[]{this, new Boolean(z)});
        } else {
            this.skipSetWidthLayoutParams = z;
        }
    }

    public void setV3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d00c00e", new Object[]{this, new Boolean(z)});
        } else {
            this.isV3 = z;
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            if (this.isV3) {
                super.onMeasure(i, i2);
                return;
            }
            DXTraceUtil.b("RootView#onMeasure");
            j jVar = this.layoutNode;
            if (!(jVar == null || jVar.getVisibility() == 2)) {
                if (!this.useSysMeasureSpec) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    int childMeasureSpec = j.getChildMeasureSpec(this.parentWidthSpec, 0, this.layoutNode.getLayoutWidth());
                    int childMeasureSpec2 = j.getChildMeasureSpec(this.parentHeightSpec, 0, this.layoutNode.getLayoutHeight());
                    int i3 = layoutParams.width;
                    if (!(i3 == -2 || i3 == -1)) {
                        childMeasureSpec = j.getChildMeasureSpec(DXWidgetNode.DXMeasureSpec.c(i3, 1073741824), 0, layoutParams.width);
                    }
                    int i4 = layoutParams.height;
                    if (i4 == -2 || i4 == -1) {
                        i = childMeasureSpec;
                        i2 = childMeasureSpec2;
                    } else {
                        i2 = j.getChildMeasureSpec(DXWidgetNode.DXMeasureSpec.c(i4, 1073741824), 0, layoutParams.height);
                        i = childMeasureSpec;
                    }
                }
                if (this.layoutNode.getNativeView() != null) {
                    this.layoutNode.getNativeView().measure(i, i2);
                    setMeasuredDimension(this.layoutNode.getMeasuredWidth(), this.layoutNode.getMeasuredHeight());
                } else {
                    super.onMeasure(i, i2);
                }
                DXTraceUtil.c();
                return;
            }
            setMeasuredDimension(0, 0);
        } catch (Throwable th) {
            if (this.layoutNode != null) {
                setMeasuredDimension(0, 0);
                DXRuntimeContext dXRuntimeContext = this.layoutNode.getDXRuntimeContext();
                if (dXRuntimeContext != null) {
                    f fVar = new f(dXRuntimeContext.c());
                    fVar.d = true;
                    f.a aVar = new f.a("native", "native_crash", f.DX_NATIVE_ONMEASURE_CRASH);
                    if (fVar.c == null) {
                        fVar.c = new ArrayList();
                    }
                    fVar.c.add(aVar);
                    aVar.e = xv5.a(th);
                    fVar.b = dXRuntimeContext.p();
                    if (dXRuntimeContext.m() != null) {
                        fVar.b(dXRuntimeContext.m().a());
                    }
                    ic5.p(fVar);
                    return;
                }
            }
            f fVar2 = new f(h36.TAG);
            fVar2.d = true;
            f.a aVar2 = new f.a("native", "native_crash", f.DX_NATIVE_ONMEASURE_CRASH_2);
            aVar2.e = xv5.a(th);
            if (fVar2.c == null) {
                fVar2.c = new ArrayList();
            }
            fVar2.c.add(aVar2);
            ic5.p(fVar2);
        }
    }
}
