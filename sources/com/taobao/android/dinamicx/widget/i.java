package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.view.DXNativeGridLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bsn;
import tb.bwb;
import tb.eb5;
import tb.my5;
import tb.nb6;
import tb.pb6;
import tb.ql6;
import tb.qub;
import tb.r26;
import tb.t2o;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXGRIDLAYOUT_MAXCOLCOUNT = -7092152831124183944L;
    public static final long DXGRIDLAYOUT_MAXROWCOUNT = -8743048525866445678L;
    public static final long DXGRIDLAYOUT_MINCOLCOUNT = -787266499800216458L;
    public static final long DXGRIDLAYOUT_MINROWCOUNT = -2438162194542478192L;
    public static final long DXGRIDLAYOUT_ORIENTATION = -7199229155167727177L;
    public static final int DXGRIDLAYOUT_ORIENTATION_HORIZONTAL = 0;
    public static final int DXGRIDLAYOUT_ORIENTATION_VERTICAL = 1;
    public static final long DX_GRID_LAYOUT = 7789579202915247118L;
    public static final long DX_GRID_LAYOUT_COLUMN_COUNT = 4480460401770252962L;
    public static final long DX_GRID_LAYOUT_COLUMN_SPACING = -7076735627431451296L;
    public static final long DX_GRID_LAYOUT_ITEM_HEIGHT = -889779179579457774L;
    public static final long DX_GRID_LAYOUT_ITEM_WIDTH = -5480582194049152328L;
    public static final long DX_GRID_LAYOUT_LINE_COLOR = -1442755333969665872L;
    public static final long DX_GRID_LAYOUT_LINE_WIDTH = -1442710627541559887L;
    public static final long DX_GRID_LAYOUT_NEED_SEPARATOR = -7975214338005072550L;
    public static final long DX_GRID_LAYOUT_ROW_COUNT = 6173497815537313897L;
    public static final long DX_GRID_LAYOUT_ROW_SPACING = -5965488911581852121L;
    public int b;
    public int c;
    public int d;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* renamed from: a  reason: collision with root package name */
    public int f7437a = 0;
    public int e = -8421505;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597305);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new i();
        }
    }

    static {
        t2o.a(444597304);
    }

    public i() {
        int i;
        if (DinamicXEngine.x() == null) {
            i = 1;
        } else {
            i = pb6.p(getEngine(), DinamicXEngine.x(), "0.5np", 0);
        }
        this.f = i;
        this.g = false;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.m = 0;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -634587146:
                return new Boolean(super.checkLayoutFlat());
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXGridLayoutWidgetNode");
        }
    }

    public void A() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9dcbe0a", new Object[]{this});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (this.g) {
            int i2 = this.i;
            int i3 = (this.f7437a - 1) + (i2 - 1);
            int i4 = this.m;
            if (i4 == 1) {
                i3 = (this.h - 1) + (this.j - 1);
            }
            float[] fArr = new float[i3 * 4];
            int i5 = i2 - 1;
            if (i4 == 1) {
                i5 = this.h - 1;
            }
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                fArr[i7] = paddingLeft;
                int i8 = i6 + 1;
                int i9 = this.k;
                fArr[i7 + 1] = (this.c * i8) + (i6 * i9) + (i9 / 2) + paddingTop;
                int i10 = i7 + 3;
                fArr[i7 + 2] = getMeasuredWidth() - paddingRight;
                i7 += 4;
                int i11 = this.k;
                fArr[i10] = (this.c * i8) + (i6 * i11) + (i11 / 2) + paddingTop;
                i6 = i8;
            }
            int i12 = this.f7437a - 1;
            if (this.m == 1) {
                i12 = this.j - 1;
            }
            while (i < i12) {
                int i13 = i + 1;
                int i14 = this.d;
                int i15 = this.b;
                fArr[i7] = (i13 * i14) + (i * i15) + (i15 / 2) + paddingLeft;
                fArr[i7 + 1] = paddingTop;
                int i16 = i7 + 3;
                fArr[i7 + 2] = (i14 * i13) + (i * i15) + (i15 / 2) + paddingLeft;
                i7 += 4;
                fArr[i16] = getMeasuredHeight() - paddingBottom;
                i = i13;
            }
            this.l = fArr;
            int min = Math.min(this.b, this.k);
            if (this.f > min) {
                this.f = min;
            }
            setDisableFlatten(true);
            return;
        }
        this.l = null;
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new i();
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public boolean checkLayoutFlat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2cf7f6", new Object[]{this})).booleanValue();
        }
        if (this.g || super.checkLayoutFlat()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 4480460401770252962L) {
            return 0;
        }
        if (j == DX_GRID_LAYOUT_LINE_COLOR) {
            return -8421505;
        }
        if (j == DX_GRID_LAYOUT_NEED_SEPARATOR || j == DX_GRID_LAYOUT_ROW_COUNT) {
            return 0;
        }
        if (j == DXGRIDLAYOUT_MAXCOLCOUNT || j == DXGRIDLAYOUT_MAXROWCOUNT || j == DXGRIDLAYOUT_MINCOLCOUNT || j == DXGRIDLAYOUT_MINROWCOUNT) {
            return -1;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public void measureChildWithMargins(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c425c7", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            dXWidgetNode.measure(j.getChildMeasureSpec(i, dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight() + i2, dXWidgetNode.layoutWidth), j.getChildMeasureSpec(i3, dXWidgetNode.getMarginTop() + dXWidgetNode.getMarginBottom() + i4, dXWidgetNode.layoutHeight));
        }
    }

    public void measureHorizontal(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b92dc9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int virtualChildCount = getVirtualChildCount();
        DXWidgetNode.DXMeasureSpec.c(this.d, 1073741824);
        int c = DXWidgetNode.DXMeasureSpec.c(this.c, 1073741824);
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            DXWidgetNode childAt = getChildAt(i7);
            int v = v(childAt);
            measureChildWithMargins(childAt, DXWidgetNode.DXMeasureSpec.c((this.d * v) + ((v - 1) * this.b), 1073741824), 0, c, 0);
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        if (a2 != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 != 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f7437a > 0 && (i6 = this.h) <= 0) {
            int u = u();
            int i8 = this.f7437a;
            if (u % i8 == 0) {
                i6 = u / i8;
            } else {
                i6 = (u / i8) + 1;
            }
            int i9 = this.o;
            int i10 = this.q;
            if (i10 > 0 && ((i9 < 0 || i9 > i10) && i6 < i10)) {
                i6 = i10;
            }
        }
        this.i = i6;
        if (z || z2) {
            if (z) {
                int i11 = this.f7437a;
                if (i11 > 0) {
                    i5 = (this.d * i11) + (this.b * (i11 - 1)) + getPaddingLeft() + getPaddingRight();
                } else {
                    i5 = getPaddingLeft() + getPaddingRight();
                }
            } else {
                i5 = DXWidgetNode.DXMeasureSpec.b(i);
            }
            if (!z2) {
                i3 = DXWidgetNode.DXMeasureSpec.b(i2);
            } else if (i6 > 0) {
                i3 = (this.c * i6) + (this.k * (i6 - 1)) + getPaddingTop() + getPaddingBottom();
            } else {
                i3 = getPaddingBottom() + getPaddingTop();
            }
            i4 = i5;
        } else {
            i4 = DXWidgetNode.DXMeasureSpec.b(i);
            i3 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(DXWidgetNode.resolveSize(i4, i), DXWidgetNode.resolveSize(i3, i2));
    }

    public void measureVertical(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25080b1b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int virtualChildCount = getVirtualChildCount();
        int c = DXWidgetNode.DXMeasureSpec.c(this.d, 1073741824);
        DXWidgetNode.DXMeasureSpec.c(this.c, 1073741824);
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            DXWidgetNode childAt = getChildAt(i6);
            int w = w(childAt);
            measureChildWithMargins(childAt, c, 0, DXWidgetNode.DXMeasureSpec.c((this.c * w) + ((w - 1) * this.k), 1073741824), 0);
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        if (a2 != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (a3 != 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.h > 0 && (i5 = this.f7437a) <= 0) {
            int t = t();
            int i7 = this.h;
            if (t % i7 == 0) {
                i5 = t / i7;
            } else {
                i5 = (t / i7) + 1;
            }
            int i8 = this.n;
            if (i8 <= 0 || i8 <= this.p || i5 <= i8) {
                int i9 = this.p;
                if (i9 > 0 && ((i8 < 0 || i8 > i9) && i5 < i9)) {
                    i5 = i9;
                }
            } else {
                i5 = i8;
            }
        }
        this.j = i5;
        if (z || z2) {
            if (!z) {
                i4 = DXWidgetNode.DXMeasureSpec.b(i);
            } else if (i5 > 0) {
                i4 = (this.d * i5) + (this.b * (i5 - 1)) + getPaddingLeft() + getPaddingRight();
            } else {
                i4 = getPaddingLeft() + getPaddingRight();
            }
            if (z2) {
                int i10 = this.h;
                if (i10 > 0) {
                    i3 = getPaddingTop() + getPaddingBottom() + (this.c * i10) + (this.k * (i10 - 1));
                } else {
                    i3 = getPaddingTop() + getPaddingBottom();
                }
            } else {
                i3 = DXWidgetNode.DXMeasureSpec.b(i2);
            }
        } else {
            i4 = DXWidgetNode.DXMeasureSpec.b(i);
            i3 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(DXWidgetNode.resolveSize(i4, i), DXWidgetNode.resolveSize(i3, i2));
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        boolean z;
        ql6 ql6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
        } else if ((this.propertyInitFlag & 2) != 0) {
            if (eb5.y()) {
                z();
                return;
            }
            if (getChildren() != null && this.originItems == null) {
                this.originItems = new ArrayList();
                for (DXWidgetNode dXWidgetNode : getChildren()) {
                    this.originItems.add(dXWidgetNode.deepClone(getDXRuntimeContext()));
                }
            }
            JSONArray listData = getListData();
            if (listData == null || listData.isEmpty() || getChildren() == null) {
                removeAllChild();
                return;
            }
            if (this.originItems == null || getChildrenCount() == this.originItems.size() || nb6.i()) {
                z = true;
            } else {
                removeAllChild();
                for (DXWidgetNode dXWidgetNode2 : this.originItems) {
                    addChild(dXWidgetNode2.deepClone(getDXRuntimeContext()));
                }
                z = false;
            }
            if (zg5.E2()) {
                if (getDXRuntimeContext().b0() && z) {
                    removeAllChild();
                    for (DXWidgetNode dXWidgetNode3 : this.originItems) {
                        addChild(dXWidgetNode3.deepClone(getDXRuntimeContext()));
                    }
                }
            } else if (z) {
                removeAllChild();
                for (DXWidgetNode dXWidgetNode4 : this.originItems) {
                    addChild(dXWidgetNode4.deepClone(getDXRuntimeContext()));
                }
            }
            ArrayList arrayList = (ArrayList) getChildren();
            ArrayList arrayList2 = new ArrayList();
            int size = listData.size();
            int i = this.h * this.f7437a;
            if (i > 0) {
                size = Math.min(i, size);
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (getDxv3VariableInfo() != null) {
                    ql6Var = getDxv3VariableInfo().b();
                } else {
                    ql6Var = null;
                }
                Object obj = listData.get(i2);
                if (i2 == 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bindContext((DXWidgetNode) it.next(), obj, i2, ql6Var);
                    }
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        DXWidgetNode dXWidgetNode5 = (DXWidgetNode) it2.next();
                        DXRuntimeContext b = dXWidgetNode5.getDXRuntimeContext().b(dXWidgetNode5);
                        b.q0(obj);
                        b.r0(i2);
                        if (getDxv3VariableInfo() != null) {
                            b.s0(ql6Var);
                        }
                        arrayList2.add(r26.b(dXWidgetNode5, b));
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                addChild((DXWidgetNode) arrayList2.get(i3), false);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildDataWithButter() {
        DXWidgetNode originNode;
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355dbe58", new Object[]{this});
        } else if (isHandleListData() && (originNode = getOriginNode()) != null && (children = originNode.getChildren()) != null) {
            if (this.recycledPool == null) {
                this.recycledPool = new bsn();
                this.templateSize = originNode.getChildrenCount();
            }
            int childrenCount = getChildrenCount();
            JSONArray listData = getListData();
            if (listData == null || listData.isEmpty()) {
                for (int i = childrenCount - 1; i >= 0; i--) {
                    recycleView(i);
                }
                return;
            }
            int size = listData.size();
            int i2 = this.h * this.f7437a;
            if (i2 > 0) {
                size = Math.min(i2, size);
            }
            int i3 = this.templateSize * size;
            if (childrenCount > i3) {
                for (int i4 = childrenCount - 1; i4 >= i3; i4--) {
                    recycleView(i4);
                }
            }
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listData.get(i5);
                int i6 = 0;
                while (true) {
                    int i7 = this.templateSize;
                    if (i6 < i7) {
                        int i8 = (i7 * i5) + i6;
                        ql6 ql6Var = null;
                        if (i8 < getChildrenCount()) {
                            DXWidgetNode childAt = getChildAt(i8);
                            if (getDxv3VariableInfo() != null) {
                                ql6Var = getDxv3VariableInfo().b();
                            }
                            if (childAt.getVisibility() == 2) {
                                if (!(childAt instanceof bwb) || !((bwb) childAt).isLayoutFlat()) {
                                    childAt.setRealVisibility(0);
                                } else {
                                    childAt.setVisibility(0);
                                }
                            }
                            bindContextWithButter(childAt, obj, i5, ql6Var);
                        } else {
                            DXWidgetNode cacheView = getCacheView(i6);
                            if (cacheView == null) {
                                DXWidgetNode dXWidgetNode = children.get(i6);
                                DXRuntimeContext b = getDXRuntimeContext().b(dXWidgetNode);
                                b.q0(obj);
                                b.r0(i5);
                                if (getDxv3VariableInfo() != null) {
                                    b.s0(getDxv3VariableInfo().b());
                                }
                                cacheView = dXWidgetNode.shallowButterClone(b);
                            } else {
                                if (getDxv3VariableInfo() != null) {
                                    ql6Var = getDxv3VariableInfo().b();
                                }
                                if (cacheView.getVisibility() == 2) {
                                    if (!(cacheView instanceof bwb) || !((bwb) cacheView).isLayoutFlat()) {
                                        cacheView.setRealVisibility(0);
                                    } else {
                                        cacheView.setVisibility(0);
                                    }
                                }
                                bindContextWithButter(cacheView, obj, i5, ql6Var);
                            }
                            addChild(cacheView, false);
                        }
                        i6++;
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof i)) {
            super.onClone(dXWidgetNode, z);
            i iVar = (i) dXWidgetNode;
            this.f7437a = iVar.f7437a;
            this.b = iVar.b;
            this.c = iVar.c;
            this.d = iVar.d;
            this.e = iVar.e;
            this.f = iVar.f;
            this.g = iVar.g;
            this.h = iVar.h;
            this.k = iVar.k;
            this.l = iVar.l;
            this.i = iVar.i;
            this.m = iVar.m;
            this.n = iVar.n;
            this.p = iVar.p;
            this.o = iVar.o;
            this.q = iVar.q;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeGridLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.m == 1) {
            y(z, i, i2, i3, i4);
        } else {
            x(z, i, i2, i3, i4);
        }
        A();
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.m == 1) {
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
        super.onRenderView(context, view);
        ((DXNativeGridLayout) view).setLines(this.g, this.e, this.f, this.l);
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 4480460401770252962L) {
            this.f7437a = i;
        } else if (j == DX_GRID_LAYOUT_COLUMN_SPACING) {
            this.b = i;
        } else if (j == -889779179579457774L) {
            this.c = i;
        } else if (j == -5480582194049152328L) {
            this.d = i;
        } else if (j == DX_GRID_LAYOUT_LINE_COLOR) {
            this.e = i;
        } else if (j == DX_GRID_LAYOUT_LINE_WIDTH) {
            this.f = i;
        } else if (j == DX_GRID_LAYOUT_NEED_SEPARATOR) {
            if (i == 0) {
                z = false;
            }
            this.g = z;
        } else if (j == DX_GRID_LAYOUT_ROW_COUNT) {
            this.h = i;
        } else if (j == DX_GRID_LAYOUT_ROW_SPACING) {
            this.k = i;
        } else if (j == -7199229155167727177L) {
            this.m = i;
        } else if (j == DXGRIDLAYOUT_MAXCOLCOUNT) {
            this.n = i;
        } else if (j == DXGRIDLAYOUT_MAXROWCOUNT) {
            this.o = i;
        } else if (j == DXGRIDLAYOUT_MINCOLCOUNT) {
            this.p = i;
        } else if (j == DXGRIDLAYOUT_MINROWCOUNT) {
            this.q = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue();
        }
        if (getClass() == i.class) {
            return true;
        }
        return false;
    }

    public final int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("948a1f0d", new Object[]{this})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < getVirtualChildCount(); i2++) {
            i += w(getVirtualChildAt(i2));
        }
        return i;
    }

    public final int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d6affd5", new Object[]{this})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < getVirtualChildCount(); i2++) {
            i += v(getVirtualChildAt(i2));
        }
        return i;
    }

    public final int v(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52dd9947", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (dXWidgetNode instanceof my5) {
            return ((my5) dXWidgetNode).t();
        }
        return 1;
    }

    public final int w(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb46822d", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (dXWidgetNode instanceof my5) {
            return ((my5) dXWidgetNode).u();
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.i.x(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.i.y(boolean, int, int, int, int):void");
    }

    public final void z() {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d9fc82", new Object[]{this});
            return;
        }
        JSONArray listData = getListData();
        JSONArray jSONArray = this.listData;
        if (jSONArray == null || jSONArray.isEmpty() || getOriginNode() == null || getOriginNode().getChildren() == null) {
            removeAllChild();
            return;
        }
        List<DXWidgetNode> children = getOriginNode().getChildren();
        new ArrayList();
        int size = listData.size();
        int i = this.h * this.f7437a;
        if (i > 0) {
            int min = Math.min(i, size);
            if (min != size) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < min; i2++) {
                    jSONArray2.add(listData.get(i2));
                }
                arrayList = generateWidgetNodeByDataNew(0, jSONArray2, children);
            } else {
                arrayList = generateWidgetNodeByDataNew(0, listData, children);
            }
        } else {
            arrayList = generateWidgetNodeByDataNew(0, listData, children);
        }
        if (arrayList != null) {
            removeAllChild();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                addChild(arrayList.get(i3), false);
            }
        }
    }
}
