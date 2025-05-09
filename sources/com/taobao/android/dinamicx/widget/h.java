package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import tb.q26;
import tb.qub;
import tb.t2o;
import tb.wq2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int DEFAULT_CHILD_GRAVITY = 0;
    private final ArrayList<DXWidgetNode> matchParentChildren = new ArrayList<>(1);
    public boolean measureAllChildren = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597301);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new h();
        }
    }

    static {
        t2o.a(444597300);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -857616453) {
            super.setBackground((View) objArr[0]);
            return null;
        } else if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXFrameLayoutWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new h();
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return super.clone();
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public ViewGroup.LayoutParams generateLayoutParams(q26 q26Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("193cd1a2", new Object[]{this, q26Var});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q26Var.f26456a, q26Var.b);
        layoutParams.gravity = q26Var.c;
        return layoutParams;
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public ViewGroup.LayoutParams generateLayoutParamsWithButter(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("2bbcb3ca", new Object[]{this, dXWidgetNode});
        }
        return new FrameLayout.LayoutParams(dXWidgetNode.getLayoutWidth(), dXWidgetNode.getLayoutHeight());
    }

    public int getPaddingBottomForMeasure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d45dadd5", new Object[]{this})).intValue();
        }
        if (getPaddingBottom() > 0) {
            return getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingLeftForMeasure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745d2571", new Object[]{this})).intValue();
        }
        int paddingLeftWithDirection = getPaddingLeftWithDirection();
        if (paddingLeftWithDirection > 0) {
            return paddingLeftWithDirection;
        }
        return 0;
    }

    public int getPaddingRightForMeasure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a7abfb0", new Object[]{this})).intValue();
        }
        int paddingRightWithDirection = getPaddingRightWithDirection();
        if (paddingRightWithDirection > 0) {
            return paddingRightWithDirection;
        }
        return 0;
    }

    public int getPaddingTopForMeasure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a495ec69", new Object[]{this})).intValue();
        }
        if (getPaddingTop() > 0) {
            return getPaddingTop();
        }
        return 0;
    }

    public void layoutChildren(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int marginTop;
        int marginTop2;
        int marginBottom;
        int leftMarginWithDirection;
        int rightMarginWithDirection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623e88c4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        int virtualChildCount = getVirtualChildCount();
        int direction = getDirection();
        if (this.isEnableButter) {
            i5 = getPaddingLeftForMeasure() + i;
        } else {
            i5 = getPaddingLeftForMeasure();
        }
        if (this.isEnableButter) {
            i6 = i3 - getPaddingRightForMeasure();
        } else {
            i6 = (i3 - i) - getPaddingRightForMeasure();
        }
        if (this.isEnableButter) {
            i7 = getPaddingTopForMeasure() + i2;
        } else {
            i7 = getPaddingTopForMeasure();
        }
        if (this.isEnableButter) {
            i8 = i4 - getPaddingBottomForMeasure();
        } else {
            i8 = (i4 - i2) - getPaddingBottomForMeasure();
        }
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            DXWidgetNode childAt = getChildAt(i11);
            if (childAt.getVisibility() != 2) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int layoutGravity = childAt.getLayoutGravity();
                if (layoutGravity == 0 && (childAt.propertyInitFlag & 1) == 0) {
                    layoutGravity = 0;
                }
                int absoluteGravity = DXWidgetNode.getAbsoluteGravity(layoutGravity, direction);
                switch (absoluteGravity) {
                    case 3:
                    case 4:
                    case 5:
                        leftMarginWithDirection = (((i6 - i5) - measuredWidth) / 2) + i5 + childAt.getLeftMarginWithDirection();
                        rightMarginWithDirection = childAt.getRightMarginWithDirection();
                        i9 = leftMarginWithDirection - rightMarginWithDirection;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        if (!z) {
                            leftMarginWithDirection = i6 - measuredWidth;
                            rightMarginWithDirection = childAt.getRightMarginWithDirection();
                            i9 = leftMarginWithDirection - rightMarginWithDirection;
                            break;
                        }
                    default:
                        i9 = childAt.getLeftMarginWithDirection() + i5;
                        break;
                }
                switch (absoluteGravity) {
                    case 0:
                    case 3:
                    case 6:
                        marginTop = childAt.getMarginTop();
                        i10 = marginTop + i7;
                        childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
                        break;
                    case 1:
                    case 4:
                    case 7:
                        marginTop2 = (((i8 - i7) - measuredHeight) / 2) + i7 + childAt.getMarginTop();
                        marginBottom = childAt.getMarginBottom();
                        i10 = marginTop2 - marginBottom;
                        childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
                        break;
                    case 2:
                    case 5:
                    case 8:
                        marginTop2 = i8 - measuredHeight;
                        marginBottom = childAt.getMarginBottom();
                        i10 = marginTop2 - marginBottom;
                        childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
                        break;
                    default:
                        marginTop = childAt.getMarginTop();
                        i10 = marginTop + i7;
                        childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
                        break;
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeFrameLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            layoutChildren(i, i2, i3, i4, false);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int virtualChildCount = getVirtualChildCount();
        if (DXWidgetNode.DXMeasureSpec.a(i) == 1073741824 && DXWidgetNode.DXMeasureSpec.a(i2) == 1073741824) {
            z = false;
        } else {
            z = true;
        }
        this.matchParentChildren.clear();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i9 < virtualChildCount) {
            DXWidgetNode childAt = getChildAt(i9);
            if (this.measureAllChildren || childAt.getVisibility() != i5) {
                if (this.isEnableButter && z && (childAt.layoutWidth == -1 || childAt.layoutHeight == -1)) {
                    this.matchParentChildren.add(childAt);
                    if (childAt.getNativeView() != null) {
                        childAt.getNativeView().forceLayout();
                    }
                }
                measureChildWithMargins(childAt, i, 0, i2, 0);
                i8 = Math.max(i8, childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight());
                i7 = Math.max(i7, childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom());
                i6 = DXWidgetNode.combineMeasuredStates(i6, childAt.getMeasuredState());
                if (!this.isEnableButter && z && (childAt.layoutWidth == -1 || childAt.layoutHeight == -1)) {
                    this.matchParentChildren.add(childAt);
                }
            }
            i9++;
            i5 = 2;
        }
        setMeasuredDimension(DXWidgetNode.resolveSizeAndState(Math.max(i8 + getPaddingLeftForMeasure() + getPaddingRightForMeasure(), getSuggestedMinimumWidth()), i, i6), DXWidgetNode.resolveSizeAndState(Math.max(i7 + getPaddingTopForMeasure() + getPaddingBottomForMeasure(), getSuggestedMinimumHeight()), i2, i6 << 16));
        int size = this.matchParentChildren.size();
        if (size > 1) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            for (int i10 = 0; i10 < size; i10++) {
                DXWidgetNode dXWidgetNode = this.matchParentChildren.get(i10);
                if (dXWidgetNode.layoutWidth == -1) {
                    i3 = DXWidgetNode.DXMeasureSpec.c(Math.max(0, (((getMeasuredWidth() - paddingLeft) - paddingRight) - dXWidgetNode.getMarginLeft()) - dXWidgetNode.getMarginRight()), 1073741824);
                } else {
                    i3 = j.getChildMeasureSpec(i, paddingLeft + paddingRight + dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight(), dXWidgetNode.layoutWidth);
                }
                if (dXWidgetNode.layoutHeight == -1) {
                    i4 = DXWidgetNode.DXMeasureSpec.c(Math.max(0, (((getMeasuredHeight() - paddingTop) - paddingBottom) - dXWidgetNode.getMarginTop()) - dXWidgetNode.getMarginBottom()), 1073741824);
                } else {
                    i4 = j.getChildMeasureSpec(i2, paddingTop + paddingBottom + dXWidgetNode.getMarginTop() + dXWidgetNode.getMarginBottom(), dXWidgetNode.layoutHeight);
                }
                dXWidgetNode.measure(i3, i4);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (9346582897824575L == j) {
            setLayoutHeight(i);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 10;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        if (hasCornerRadius()) {
            DXNativeFrameLayout dXNativeFrameLayout = (DXNativeFrameLayout) view;
            wq2 wq2Var = new wq2();
            if (getCornerRadius() > 0) {
                wq2Var.j(view, getCornerRadius());
            } else {
                wq2Var.k(view, getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom());
            }
            dXNativeFrameLayout.setClipRadiusHandler(wq2Var);
        } else {
            wq2 cLipRadiusHandler = ((DXNativeFrameLayout) view).getCLipRadiusHandler();
            if (cLipRadiusHandler != null) {
                cLipRadiusHandler.j(view, 0.0f);
            }
        }
        super.setBackground(view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == h.class) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public ViewGroup.LayoutParams generateLayoutParams(q26 q26Var, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("3d0366b5", new Object[]{this, q26Var, layoutParams});
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = q26Var.c;
        }
        layoutParams.width = q26Var.f26456a;
        layoutParams.height = q26Var.b;
        return layoutParams;
    }
}
