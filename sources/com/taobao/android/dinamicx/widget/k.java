package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeLinearLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.q26;
import tb.qub;
import tb.t2o;
import tb.vu3;
import tb.wq2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k extends j implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int mOrientation;
    public int mTotalLength;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597323);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new k();
        }
    }

    static {
        t2o.a(444597322);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -857616453:
                super.setBackground((View) objArr[0]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXLinearLayoutWidgetNode");
        }
    }

    private void setChildFrame(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4d0df5", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            dXWidgetNode.layout(i, i2, i3 + i, i4 + i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new k();
    }

    public void forceUniformHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae5bdf7", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int c = DXWidgetNode.DXMeasureSpec.c(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            DXWidgetNode virtualChildAt = getVirtualChildAt(i3);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 2 || virtualChildAt.layoutHeight != -1)) {
                int i4 = virtualChildAt.layoutWidth;
                virtualChildAt.layoutWidth = virtualChildAt.getMeasuredWidth();
                measureChildWithMargins(virtualChildAt, i2, 0, c, 0);
                virtualChildAt.layoutWidth = i4;
            }
        }
    }

    public void forceUniformWidth(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a781864", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int c = DXWidgetNode.DXMeasureSpec.c(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            DXWidgetNode virtualChildAt = getVirtualChildAt(i3);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 2 || virtualChildAt.layoutWidth != -1)) {
                int i4 = virtualChildAt.layoutHeight;
                virtualChildAt.layoutHeight = virtualChildAt.getMeasuredHeight();
                measureChildWithMargins(virtualChildAt, c, 0, i2, 0);
                virtualChildAt.layoutHeight = i4;
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public ViewGroup.LayoutParams generateLayoutParams(q26 q26Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("193cd1a2", new Object[]{this, q26Var});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q26Var.f26456a, q26Var.b);
        layoutParams.gravity = q26Var.c;
        return layoutParams;
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public ViewGroup.LayoutParams generateLayoutParamsWithButter(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("2bbcb3ca", new Object[]{this, dXWidgetNode});
        }
        return new LinearLayout.LayoutParams(dXWidgetNode.getLayoutWidth(), dXWidgetNode.getLayoutHeight());
    }

    public int getChildrenSkipCount(DXWidgetNode dXWidgetNode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5d9c309", new Object[]{this, dXWidgetNode, new Integer(i)})).intValue();
        }
        return 0;
    }

    public int getLocationOffset(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40eb5e9d", new Object[]{this, dXWidgetNode})).intValue();
        }
        return 0;
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        return this.mOrientation;
    }

    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int marginTop;
        int marginBottom;
        int i9 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781b3ab5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        boolean isLayoutRtl = isLayoutRtl();
        int paddingTop = getPaddingTop();
        int i10 = i4 - i2;
        int paddingBottom = i10 - getPaddingBottom();
        int paddingBottom2 = (i10 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        switch (DXWidgetNode.getAbsoluteGravity(getChildGravity(), getDirection())) {
            case 3:
            case 4:
            case 5:
                i5 = (((i3 - i) - this.mTotalLength) / 2) + getPaddingLeftWithDirection();
                break;
            case 6:
            case 7:
            case 8:
                i5 = ((getPaddingLeftWithDirection() + i3) - i) - this.mTotalLength;
                break;
            default:
                i5 = getPaddingLeftWithDirection();
                break;
        }
        if (this.isEnableButter) {
            i5 += i;
        }
        if (isLayoutRtl) {
            i7 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i7 = 0;
            i6 = 1;
        }
        int i11 = 0;
        while (i11 < virtualChildCount) {
            int i12 = i7 + (i6 * i11);
            DXWidgetNode virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt == null) {
                i5 += measureNullChild(i12);
            } else if (virtualChildAt.getVisibility() != i9) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                int layoutGravity = virtualChildAt.getLayoutGravity();
                if ((virtualChildAt.propertyInitFlag & 1) == 0 && layoutGravity == 0) {
                    layoutGravity = getChildGravity();
                }
                switch (layoutGravity) {
                    case 0:
                    case 3:
                    case 6:
                        i8 = virtualChildAt.getMarginTop() + paddingTop;
                        break;
                    case 1:
                    case 4:
                    case 7:
                        marginTop = ((paddingBottom2 - measuredHeight) / i9) + paddingTop + virtualChildAt.getMarginTop();
                        marginBottom = virtualChildAt.getMarginBottom();
                        i8 = marginTop - marginBottom;
                        break;
                    case 2:
                    case 5:
                    case 8:
                        marginTop = paddingBottom - measuredHeight;
                        marginBottom = virtualChildAt.getMarginBottom();
                        i8 = marginTop - marginBottom;
                        break;
                    default:
                        i8 = paddingTop;
                        break;
                }
                if (this.isEnableButter) {
                    i8 += i2;
                }
                int leftMarginWithDirection = i5 + virtualChildAt.getLeftMarginWithDirection();
                setChildFrame(virtualChildAt, leftMarginWithDirection + getLocationOffset(virtualChildAt), i8, measuredWidth, measuredHeight);
                i11 += getChildrenSkipCount(virtualChildAt, i12);
                i5 = leftMarginWithDirection + measuredWidth + virtualChildAt.getRightMarginWithDirection() + getNextLocationOffset(virtualChildAt);
            }
            i11++;
            i9 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void layoutVertical(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.k.layoutVertical(int, int, int, int):void");
    }

    public void measureChildBeforeLayout(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169c8402", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            measureChildWithMargins(dXWidgetNode, i2, i3, i4, i5);
        }
    }

    public void measureHorizontal(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        float f;
        int i12;
        boolean z5;
        int i13;
        int i14;
        int i15;
        int i16 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b92dc9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        int i17 = 1073741824;
        if (a2 == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        float f2 = 0.0f;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = false;
        while (i21 < virtualChildCount) {
            DXWidgetNode virtualChildAt = getVirtualChildAt(i21);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i21);
            } else if (virtualChildAt.getVisibility() == i16) {
                i21 += getChildrenSkipCount(virtualChildAt, i21);
            } else {
                float weight = (float) (f2 + virtualChildAt.getWeight());
                if (virtualChildAt.getWeight() > vu3.b.GEO_NOT_SUPPORT) {
                    virtualChildAt.layoutWidth = 0;
                }
                if (virtualChildAt.layoutWidth != 0 || virtualChildAt.getWeight() <= vu3.b.GEO_NOT_SUPPORT) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (a2 != i17 || !z4) {
                    if (z4) {
                        virtualChildAt.layoutWidth = -2;
                    }
                    if (weight == 0.0f) {
                        i15 = this.mTotalLength;
                    } else {
                        i15 = 0;
                    }
                    f = weight;
                    i11 = i18;
                    i10 = i19;
                    i9 = i20;
                    i8 = i21;
                    i12 = 1073741824;
                    measureChildBeforeLayout(virtualChildAt, i21, i, i15, i2, 0);
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    if (z4) {
                        virtualChildAt.layoutWidth = 0;
                        i22 += measuredWidth;
                    }
                    if (z) {
                        this.mTotalLength += measuredWidth + virtualChildAt.getMarginLeft() + virtualChildAt.getMarginRight() + getNextLocationOffset(virtualChildAt);
                    } else {
                        int i23 = this.mTotalLength;
                        this.mTotalLength = Math.max(i23, measuredWidth + i23 + virtualChildAt.getMarginLeft() + virtualChildAt.getMarginRight() + getNextLocationOffset(virtualChildAt));
                    }
                } else {
                    if (z) {
                        this.mTotalLength += virtualChildAt.getMarginLeft() + virtualChildAt.getMarginRight();
                    } else {
                        int i24 = this.mTotalLength;
                        this.mTotalLength = Math.max(i24, i24 + virtualChildAt.getMarginLeft() + virtualChildAt.getMarginRight());
                    }
                    if (this.isEnableButter) {
                        virtualChildAt.setMeasuredDimension(0, 0);
                        if (virtualChildAt.getNativeView() != null) {
                            virtualChildAt.getNativeView().forceLayout();
                        }
                    }
                    f = weight;
                    i11 = i18;
                    i10 = i19;
                    i9 = i20;
                    i8 = i21;
                    i12 = 1073741824;
                    z6 = true;
                }
                if (a3 == i12 || virtualChildAt.layoutHeight != -1) {
                    z5 = false;
                } else {
                    z5 = true;
                    z8 = true;
                }
                int marginTop = virtualChildAt.getMarginTop() + virtualChildAt.getMarginBottom();
                int measuredHeight = virtualChildAt.getMeasuredHeight() + marginTop;
                int max = Math.max(i11, measuredHeight);
                if (!z7 || virtualChildAt.layoutHeight != -1) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (virtualChildAt.layoutWidth > 0) {
                    if (!z5) {
                        marginTop = measuredHeight;
                    }
                    i14 = Math.max(i10, marginTop);
                    i20 = i9;
                    i13 = i8;
                } else {
                    if (!z5) {
                        marginTop = measuredHeight;
                    }
                    int max2 = Math.max(i9, marginTop);
                    i13 = i8;
                    i20 = max2;
                    i14 = i10;
                }
                i21 = i13 + getChildrenSkipCount(virtualChildAt, i13);
                i18 = max;
                i7 = 1;
                i19 = i14;
                f2 = f;
                i21 += i7;
                i17 = 1073741824;
                i16 = 2;
            }
            i7 = 1;
            i21 += i7;
            i17 = 1073741824;
            i16 = 2;
        }
        int i25 = paddingLeft + paddingRight;
        int i26 = this.mTotalLength + i25;
        this.mTotalLength = i26;
        int resolveSizeAndState = DXWidgetNode.resolveSizeAndState(Math.max(i26, getSuggestedMinimumWidth()), i, 0);
        int i27 = ((16777215 & resolveSizeAndState) - this.mTotalLength) + i22;
        if (z6 || (i27 != 0 && f2 > 0.0f)) {
            this.mTotalLength = 0;
            int i28 = i20;
            i4 = -1;
            int i29 = 0;
            while (i29 < virtualChildCount) {
                DXWidgetNode virtualChildAt2 = getVirtualChildAt(i29);
                if (virtualChildAt2 == null || virtualChildAt2.getVisibility() == 2) {
                    i6 = a3;
                } else {
                    double weight2 = virtualChildAt2.getWeight();
                    if (weight2 > vu3.b.GEO_NOT_SUPPORT) {
                        i6 = a3;
                        double d = f2;
                        int i30 = (int) ((i27 * weight2) / d);
                        i27 -= i30;
                        virtualChildAt2.measure(DXWidgetNode.DXMeasureSpec.c(Math.max(0, i30), 1073741824), j.getChildMeasureSpec(i2, paddingTop + paddingBottom + virtualChildAt2.getMarginTop() + virtualChildAt2.getMarginBottom(), virtualChildAt2.layoutHeight));
                        f2 = (float) (d - weight2);
                    } else {
                        i6 = a3;
                    }
                    if (z) {
                        this.mTotalLength += virtualChildAt2.getMeasuredWidth() + virtualChildAt2.getMarginLeft() + virtualChildAt2.getMarginRight() + getNextLocationOffset(virtualChildAt2);
                    } else {
                        int i31 = this.mTotalLength;
                        this.mTotalLength = Math.max(i31, virtualChildAt2.getMeasuredWidth() + i31 + virtualChildAt2.getMarginLeft() + virtualChildAt2.getMarginRight() + getNextLocationOffset(virtualChildAt2));
                    }
                    if (i6 == 1073741824 || virtualChildAt2.layoutHeight != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    int marginTop2 = virtualChildAt2.getMarginTop() + virtualChildAt2.getMarginBottom();
                    int measuredHeight2 = virtualChildAt2.getMeasuredHeight() + marginTop2;
                    i4 = Math.max(i4, measuredHeight2);
                    if (!z2) {
                        marginTop2 = measuredHeight2;
                    }
                    i28 = Math.max(i28, marginTop2);
                    if (z7 && virtualChildAt2.layoutHeight == -1) {
                        z3 = true;
                        z7 = z3;
                    }
                    z3 = false;
                    z7 = z3;
                }
                i29++;
                a3 = i6;
            }
            i3 = a3;
            this.mTotalLength += i25;
            i5 = i28;
        } else {
            i5 = Math.max(i20, i19);
            i4 = i18;
            i3 = a3;
        }
        if (z7 || i3 == 1073741824) {
            i5 = i4;
        }
        setMeasuredDimension(resolveSizeAndState, DXWidgetNode.resolveSizeAndState(Math.max(i5 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, 0));
        if (z8) {
            forceUniformHeight(virtualChildCount, i);
        }
    }

    public int measureNullChild(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66deb598", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0214, code lost:
        if (r12.layoutWidth == (-1)) goto L_0x0219;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureVertical(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.k.measureVertical(int, int):void");
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof k) {
            this.mOrientation = ((k) dXWidgetNode).mOrientation;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeLinearLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (view != null && (view instanceof LinearLayout)) {
            ((LinearLayout) view).setOrientation(this.mOrientation);
        }
        super.onRenderView(context, view);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (-7199229155167727177L == j) {
            this.mOrientation = i;
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
        if (view instanceof DXNativeLinearLayout) {
            if (hasCornerRadius()) {
                DXNativeLinearLayout dXNativeLinearLayout = (DXNativeLinearLayout) view;
                wq2 wq2Var = new wq2();
                int cornerRadius = getCornerRadius();
                if (cornerRadius > 0) {
                    wq2Var.j(view, cornerRadius);
                } else {
                    wq2Var.k(view, getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom());
                }
                dXNativeLinearLayout.setClipRadiusHandler(wq2Var);
            } else {
                wq2 cLipRadiusHandler = ((DXNativeLinearLayout) view).getCLipRadiusHandler();
                if (cLipRadiusHandler != null) {
                    cLipRadiusHandler.j(view, 0.0f);
                }
            }
        }
        super.setBackground(view);
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.mOrientation = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == k.class) {
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
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = q26Var.c;
        }
        layoutParams.width = q26Var.f26456a;
        layoutParams.height = q26Var.b;
        return layoutParams;
    }
}
