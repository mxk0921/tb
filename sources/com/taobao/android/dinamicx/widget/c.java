package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.view.DXNativeAdaptiveLinearLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bwb;
import tb.dh5;
import tb.mw5;
import tb.qub;
import tb.t2o;
import tb.uch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXADAPTIVELINEARLAYOUT_ALWAYSSHOWINDICATOR = 2031908517150824674L;
    public static final long DXADAPTIVELINEARLAYOUT_IGNOREPARENTMEASURE = 7254937418530680787L;
    public static final long DXADAPTIVELINEARLAYOUT_MOREINDICATORUSERID = -205834946367932241L;
    public static final long DXADAPTIVELINEARLAYOUT_USENEWMEASURESPEC_ANDROID = 3254316919567709453L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7422a = false;
    public boolean b = false;
    public String c;
    public boolean d;
    public int e;
    public DXWidgetNode f;
    public DXWidgetNode g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597257);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new c();
        }
    }

    static {
        t2o.a(444597256);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 895336024:
                super.onBeforeBindChildDataWithButter();
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXAdaptiveLinearLayoutWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new c();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXADAPTIVELINEARLAYOUT_ALWAYSSHOWINDICATOR) {
            return 0;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.android.dinamicx.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void measureHorizontal(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.c.measureHorizontal(int, int):void");
    }

    @Override // com.taobao.android.dinamicx.widget.k
    public void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int i5;
        DXWidgetNode dXWidgetNode;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9 = 2;
        int i10 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25080b1b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        this.mTotalLength = 0;
        this.e = 0;
        int virtualChildCount = getVirtualChildCount();
        int c = DXWidgetNode.DXMeasureSpec.c(uch.MAX_CAPACITY_MASK, Integer.MIN_VALUE);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (i13 < virtualChildCount) {
            DXWidgetNode virtualChildAt = getVirtualChildAt(i13);
            if (virtualChildAt != null) {
                if (this.isEnableButter && !virtualChildAt.isViewStub && virtualChildAt.getVisibility() == i9) {
                    if (!(virtualChildAt instanceof bwb) || !((bwb) virtualChildAt).isLayoutFlat()) {
                        virtualChildAt.setRealVisibility(i10);
                    } else {
                        virtualChildAt.setVisibility(i10);
                    }
                }
                if (virtualChildAt.getVisibility() != i9) {
                    if (this.f7422a) {
                        dXWidgetNode = virtualChildAt;
                        i7 = 1073741824;
                        i8 = i11;
                        i6 = i12;
                        i5 = i13;
                        i4 = virtualChildCount;
                        measureChildWithMargins(dXWidgetNode, i, 0, c, 0);
                    } else {
                        dXWidgetNode = virtualChildAt;
                        i8 = i11;
                        i6 = i12;
                        i5 = i13;
                        i4 = virtualChildCount;
                        i7 = 1073741824;
                        measureChildWithMargins(dXWidgetNode, i, 0, i2, 0);
                    }
                    int measuredHeight = dXWidgetNode.getMeasuredHeight();
                    int i14 = this.mTotalLength;
                    this.mTotalLength = Math.max(i14, i14 + measuredHeight + dXWidgetNode.getMarginTop() + dXWidgetNode.getMarginBottom());
                    if (mode == i7 || dXWidgetNode.layoutWidth != -1) {
                        z = false;
                    } else {
                        z = true;
                        z3 = true;
                    }
                    int marginLeft = dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight();
                    int max = Math.max(i6, dXWidgetNode.getMeasuredWidth() + marginLeft);
                    if (!z2 || dXWidgetNode.layoutHeight != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z) {
                        measuredHeight = marginLeft;
                    }
                    i11 = Math.max(i8, measuredHeight);
                    this.e++;
                    i12 = max;
                    i13 = i5 + 1;
                    virtualChildCount = i4;
                    i9 = 2;
                    i10 = 0;
                }
            }
            i5 = i13;
            i4 = virtualChildCount;
            i13 = i5 + 1;
            virtualChildCount = i4;
            i9 = 2;
            i10 = 0;
        }
        int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
        this.mTotalLength = paddingTop;
        int max2 = Math.max(paddingTop, getSuggestedMinimumHeight());
        if (max2 > size) {
            for (int i15 = virtualChildCount - 1; i15 >= 0; i15--) {
                DXWidgetNode virtualChildAt2 = getVirtualChildAt(i15);
                max2 = ((max2 - virtualChildAt2.getMeasuredHeight()) - virtualChildAt2.getMarginTop()) - virtualChildAt2.getMarginBottom();
                virtualChildAt2.setVisibility(2);
                this.e--;
                if (max2 <= size) {
                    break;
                }
            }
        }
        if (z2 || mode2 == 1073741824) {
            i3 = i12;
        } else {
            i3 = i11;
        }
        int max3 = Math.max(i3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth());
        if (this.d) {
            setMeasuredDimension(DXWidgetNode.resolveSize(max3, i), max2);
        } else {
            setMeasuredDimension(DXWidgetNode.resolveSize(max3, i), DXWidgetNode.resolveSize(max2, i2));
        }
        this.mTotalLength = max2;
        if (z3) {
            forceUniformWidth(virtualChildCount, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb A[LOOP:3: B:53:0x00e5->B:55:0x00eb, LOOP_END] */
    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBeforeBindChildData() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.widget.c.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "92a35092"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r14
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            int r2 = r14.propertyInitFlag
            r2 = r2 & 2
            if (r2 != 0) goto L_0x0019
            return
        L_0x0019:
            com.alibaba.fastjson.JSONArray r2 = r14.getListData()
            if (r2 == 0) goto L_0x00f7
            com.alibaba.fastjson.JSONArray r2 = r14.getListData()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00f7
            java.util.List r2 = r14.getChildren()
            if (r2 != 0) goto L_0x0031
            goto L_0x00f7
        L_0x0031:
            java.lang.String r2 = r14.c
            r3 = 0
            if (r2 == 0) goto L_0x0047
            com.taobao.android.dinamicx.widget.DXWidgetNode r2 = r14.queryWTByUserId(r2)
            if (r2 == 0) goto L_0x0045
            int r4 = r2.getAutoId()
            r14.removeChildWithAutoId(r4)
            r4 = 1
            goto L_0x0049
        L_0x0045:
            r4 = 0
            goto L_0x0049
        L_0x0047:
            r2 = r3
            goto L_0x0045
        L_0x0049:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = tb.eb5.y()
            if (r6 != 0) goto L_0x00c4
            java.util.List r6 = r14.getChildren()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r7 = 0
        L_0x005b:
            com.alibaba.fastjson.JSONArray r8 = r14.getListData()
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x00df
            com.alibaba.fastjson.JSONArray r8 = r14.getListData()
            java.lang.Object r8 = r8.get(r7)
            tb.ql6 r9 = r14.getDxv3VariableInfo()
            if (r9 == 0) goto L_0x007c
            tb.ql6 r9 = r14.getDxv3VariableInfo()
            tb.ql6 r9 = r9.b()
            goto L_0x007d
        L_0x007c:
            r9 = r3
        L_0x007d:
            if (r7 != 0) goto L_0x0093
            java.util.Iterator r10 = r6.iterator()
        L_0x0083:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c2
            java.lang.Object r11 = r10.next()
            com.taobao.android.dinamicx.widget.DXWidgetNode r11 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r11
            r14.bindContext(r11, r8, r7, r9)
            goto L_0x0083
        L_0x0093:
            java.util.Iterator r10 = r6.iterator()
        L_0x0097:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c2
            java.lang.Object r11 = r10.next()
            com.taobao.android.dinamicx.widget.DXWidgetNode r11 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r11
            com.taobao.android.dinamicx.DXRuntimeContext r12 = r11.getDXRuntimeContext()
            com.taobao.android.dinamicx.DXRuntimeContext r12 = r12.b(r11)
            r12.q0(r8)
            r12.r0(r7)
            tb.ql6 r13 = r14.getDxv3VariableInfo()
            if (r13 == 0) goto L_0x00ba
            r12.s0(r9)
        L_0x00ba:
            com.taobao.android.dinamicx.widget.DXWidgetNode r11 = tb.r26.b(r11, r12)
            r5.add(r11)
            goto L_0x0097
        L_0x00c2:
            int r7 = r7 + r1
            goto L_0x005b
        L_0x00c4:
            com.taobao.android.dinamicx.widget.DXWidgetNode r6 = r14.getOriginNode()
            if (r6 == 0) goto L_0x00d2
            com.taobao.android.dinamicx.widget.DXWidgetNode r3 = r14.getOriginNode()
            java.util.List r3 = r3.getChildren()
        L_0x00d2:
            if (r3 == 0) goto L_0x00dc
            com.alibaba.fastjson.JSONArray r5 = r14.getListData()
            java.util.ArrayList r5 = r14.generateWidgetNodeByDataNew(r0, r5, r3)
        L_0x00dc:
            r14.removeAllChild()
        L_0x00df:
            if (r4 == 0) goto L_0x00e4
            r5.add(r2)
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            int r3 = r5.size()
            if (r2 >= r3) goto L_0x00f6
            java.lang.Object r3 = r5.get(r2)
            com.taobao.android.dinamicx.widget.DXWidgetNode r3 = (com.taobao.android.dinamicx.widget.DXWidgetNode) r3
            r14.addChild(r3, r0)
            int r2 = r2 + r1
            goto L_0x00e5
        L_0x00f6:
            return
        L_0x00f7:
            r14.removeAllChild()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.c.onBeforeBindChildData():void");
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildDataWithButter() {
        DXWidgetNode dXWidgetNode;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355dbe58", new Object[]{this});
        } else if ((this.propertyInitFlag & 2) != 0) {
            if (this.c != null) {
                c cVar = (c) getOriginNode();
                dXWidgetNode = cVar.g;
                if (dXWidgetNode == null) {
                    dXWidgetNode = cVar.t(this.c);
                    if (dXWidgetNode != null) {
                        cVar.g = dXWidgetNode;
                        cVar.removeChildWithAutoId(dXWidgetNode.getAutoId());
                    } else {
                        z = false;
                    }
                }
                int indexOf = indexOf(queryWTByUserId(this.c));
                if (indexOf > 0) {
                    u(indexOf);
                }
            } else {
                dXWidgetNode = null;
                z = false;
            }
            super.onBeforeBindChildDataWithButter();
            if (z) {
                DXWidgetNode dXWidgetNode2 = this.f;
                if (dXWidgetNode2 == null) {
                    dXWidgetNode2 = dXWidgetNode.shallowButterClone(getDXRuntimeContext());
                }
                dXWidgetNode2.setVisibility(0);
                addChild(dXWidgetNode2, false);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof c)) {
            super.onClone(dXWidgetNode, z);
            c cVar = (c) dXWidgetNode;
            this.b = cVar.b;
            this.c = cVar.c;
            this.f7422a = cVar.f7422a;
            this.d = cVar.d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeAdaptiveLinearLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        Map<String, mw5> args = dXEvent.getArgs();
        if (args == null) {
            args = new HashMap<>();
        }
        args.put("showChildrenCount", mw5.K(this.e));
        dXEvent.setArgs(args);
        return super.onEvent(dXEvent);
    }

    @Override // com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXADAPTIVELINEARLAYOUT_ALWAYSSHOWINDICATOR) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else if (j == DXADAPTIVELINEARLAYOUT_USENEWMEASURESPEC_ANDROID) {
            if (i != 1) {
                z = false;
            }
            this.f7422a = z;
        } else if (j == DXADAPTIVELINEARLAYOUT_IGNOREPARENTMEASURE) {
            if (i != 1) {
                z = false;
            }
            this.d = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXADAPTIVELINEARLAYOUT_MOREINDICATORUSERID) {
            this.c = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final DXWidgetNode t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("a177a738", new Object[]{this, str});
        }
        List<DXWidgetNode> children = getOriginNode().getChildren();
        if (children == null) {
            return null;
        }
        for (int i = 0; i < children.size(); i++) {
            DXWidgetNode dXWidgetNode = children.get(i);
            dh5 dh5Var = dXWidgetNode.getConstAttributeMap().get(10297924263834610L);
            if (dh5Var != null && str.equals(dh5Var.e)) {
                return dXWidgetNode;
            }
        }
        return null;
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc4e18a", new Object[]{this, new Integer(i)});
            return;
        }
        DXWidgetNode childAt = getChildAt(i);
        removeChildAt(i);
        ViewGroup viewContainer = childAt.getViewContainer();
        View nativeView = childAt.getNativeView();
        if (!(viewContainer == null || nativeView == null)) {
            viewContainer.removeView(nativeView);
        }
        this.f = childAt;
    }
}
