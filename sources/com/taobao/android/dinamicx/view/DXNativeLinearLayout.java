package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import java.util.ArrayList;
import tb.eb5;
import tb.h36;
import tb.ic5;
import tb.jyc;
import tb.kl6;
import tb.svb;
import tb.t2o;
import tb.wq2;
import tb.xk9;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXNativeLinearLayout extends LinearLayout implements jyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private wq2 cLipRadiusHandler;
    private xk9 flattenHolder = null;
    public j layoutNode;

    static {
        t2o.a(444597174);
        t2o.a(444597731);
    }

    public DXNativeLinearLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXNativeLinearLayout dXNativeLinearLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/view/DXNativeLinearLayout");
        }
    }

    private void layoutForDX(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713aa8ba", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            svb flattenNode = getFlattenNode(childAt);
            childAt.layout(flattenNode.getLeft(), flattenNode.getTop(), flattenNode.getLeft() + flattenNode.getMeasuredWidth(), flattenNode.getTop() + flattenNode.getMeasuredHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            wq2 wq2Var = this.cLipRadiusHandler;
            if (wq2Var == null) {
                super.dispatchDraw(canvas);
            } else if (wq2Var.h()) {
                super.dispatchDraw(canvas);
            } else {
                this.cLipRadiusHandler.b(this, canvas);
                super.dispatchDraw(canvas);
                this.cLipRadiusHandler.a(this, canvas);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    @Override // tb.jyc
    public ViewGroup.LayoutParams generateLayoutParams(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("d55d0150", new Object[]{this, dXWidgetNode});
        }
        return this.layoutNode.generateLayoutParamsWithButter(dXWidgetNode);
    }

    public wq2 getCLipRadiusHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wq2) ipChange.ipc$dispatch("a6a1a69b", new Object[]{this});
        }
        return this.cLipRadiusHandler;
    }

    @Override // tb.jyc
    public xk9 getFlattenHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xk9) ipChange.ipc$dispatch("756eb3f5", new Object[]{this});
        }
        if (this.flattenHolder == null) {
            this.flattenHolder = new xk9();
        }
        return this.flattenHolder;
    }

    public svb getFlattenNode(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svb) ipChange.ipc$dispatch("cf73b8b", new Object[]{this, view});
        }
        if (eb5.w()) {
            return kl6.a(view);
        }
        return kl6.b(view);
    }

    public DXWidgetNode getWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("99cab402", new Object[]{this});
        }
        return this.layoutNode;
    }

    public void setClipRadiusHandler(wq2 wq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592fcdab", new Object[]{this, wq2Var});
        } else {
            this.cLipRadiusHandler = wq2Var;
        }
    }

    @Override // tb.jyc
    public void setWidgetNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d421aa20", new Object[]{this, dXWidgetNode});
        } else {
            this.layoutNode = (j) dXWidgetNode;
        }
    }

    @Override // tb.jyc
    public boolean updateLayoutParams(ViewGroup.LayoutParams layoutParams, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56e832f6", new Object[]{this, layoutParams, dXWidgetNode})).booleanValue();
        }
        return this.layoutNode.updateLayoutParamsWithButter(layoutParams, dXWidgetNode);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            j jVar = this.layoutNode;
            if (jVar != null) {
                jVar.dispatchLayout(z, 0, 0, i3 - i, i4 - i2);
                return;
            }
        } catch (Throwable th) {
            j jVar2 = this.layoutNode;
            if (!(jVar2 == null || (dXRuntimeContext = jVar2.getDXRuntimeContext()) == null)) {
                f fVar = new f(dXRuntimeContext.c());
                fVar.d = true;
                f.a aVar = new f.a("native", "native_crash", f.DX_NATIVE_CRASH_19);
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
        if (DinamicXEngine.j0()) {
            layoutForDX(z, i, i2, i3, i4);
            return;
        }
        try {
            layoutForDX(z, i, i2, i3, i4);
        } catch (Throwable unused) {
        }
    }

    public DXNativeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            j jVar = this.layoutNode;
            if (jVar != null) {
                jVar.dispatchMeasure(i, i2);
                setMeasuredDimension(this.layoutNode.getMeasuredWidthAndState(), this.layoutNode.getMeasuredHeightAndState());
                return;
            }
            super.onMeasure(i, i2);
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
            f.a aVar2 = new f.a("native", "native_crash", f.DX_NATIVE_ONMEASURE_CRASH_2);
            aVar2.e = xv5.a(th);
            if (fVar2.c == null) {
                fVar2.c = new ArrayList();
            }
            fVar2.c.add(aVar2);
            ic5.p(fVar2);
        }
    }

    public DXNativeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
