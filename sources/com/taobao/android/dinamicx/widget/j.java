package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.LongSparseArray;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.q;
import com.taobao.weex.common.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a66;
import tb.bmv;
import tb.bsn;
import tb.bwb;
import tb.eb5;
import tb.fw5;
import tb.hwb;
import tb.mw5;
import tb.nb6;
import tb.q26;
import tb.ql6;
import tb.r26;
import tb.t26;
import tb.t2o;
import tb.y06;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j extends DXWidgetNode implements hwb, bwb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXLAYOUT_MARKCONTAINER = 8182691489212564827L;
    public boolean disableFlatten;
    public Map<String, WeakReference<DXWidgetNode>> dxUserIdMap;
    public JSONArray listData;
    public List<DXWidgetNode> originItems;
    public bsn recycledPool;
    public boolean markContainer = false;
    public boolean dataSizeChange = false;
    public boolean isLayoutFlat = true;
    public int templateSize = 0;

    static {
        t2o.a(444597320);
        t2o.a(444597457);
        t2o.a(444597729);
        t2o.a(444597454);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r7 == (-2)) goto L_0x0055;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r7 == (-2)) goto L_0x0051;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r7 == (-2)) goto L_0x0055;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getChildMeasureSpec(int r5, int r6, int r7) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.dinamicx.widget.j.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x002e
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r2
            r0 = 1
            r7[r0] = r5
            r5 = 2
            r7[r5] = r6
            java.lang.String r5 = "3ebe8e5c"
            java.lang.Object r5 = r1.ipc$dispatch(r5, r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L_0x002e:
            int r1 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.a(r5)
            int r5 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.b(r5)
            int r5 = r5 - r6
            int r5 = java.lang.Math.max(r0, r5)
            r6 = -2
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L_0x0061
            if (r1 == 0) goto L_0x0058
            if (r1 == r4) goto L_0x0048
            goto L_0x006a
        L_0x0048:
            if (r7 < 0) goto L_0x004d
        L_0x004a:
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x006b
        L_0x004d:
            if (r7 != r2) goto L_0x0053
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0051:
            r7 = r5
            goto L_0x006b
        L_0x0053:
            if (r7 != r6) goto L_0x006a
        L_0x0055:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0051
        L_0x0058:
            if (r7 < 0) goto L_0x005b
            goto L_0x004a
        L_0x005b:
            if (r7 != r2) goto L_0x005e
        L_0x005d:
            goto L_0x0051
        L_0x005e:
            if (r7 != r6) goto L_0x006a
            goto L_0x005d
        L_0x0061:
            if (r7 < 0) goto L_0x0064
            goto L_0x004a
        L_0x0064:
            if (r7 != r2) goto L_0x0067
            goto L_0x0055
        L_0x0067:
            if (r7 != r6) goto L_0x006a
            goto L_0x0055
        L_0x006a:
            r7 = 0
        L_0x006b:
            int r5 = com.taobao.android.dinamicx.widget.DXWidgetNode.DXMeasureSpec.c(r7, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.j.getChildMeasureSpec(int, int, int):int");
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -428783541:
                super.onSetUserDefinedListAttribute(((Number) objArr[0]).longValue(), (List) objArr[1]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 695001847:
                super.layoutWithButter(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1534704233:
                super.changeVisibility();
                return null;
            case 1568407179:
                super.measureWithButter(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXLayout");
        }
    }

    private void onBeforeBindNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1981e20c", new Object[]{this});
        } else if ((this.propertyInitFlag & 2) != 0) {
            JSONArray jSONArray = this.listData;
            if (jSONArray == null || jSONArray.isEmpty() || getOriginNode() == null || getOriginNode().getChildren() == null) {
                removeAllChild();
                return;
            }
            new ArrayList();
            ArrayList<DXWidgetNode> generateWidgetNodeByDataNew = generateWidgetNodeByDataNew(0, getListData(), getOriginNode().getChildren());
            if (generateWidgetNodeByDataNew != null) {
                removeAllChild();
                for (int i = 0; i < generateWidgetNodeByDataNew.size(); i++) {
                    addChild(generateWidgetNodeByDataNew.get(i), false);
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindAccessibilityToView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0dfc7a9", new Object[]{this, view, new Integer(i)});
            return;
        }
        String accessibilityText = getAccessibilityText();
        if (i != -1) {
            if (i == 3) {
                view.setImportantForAccessibility(1);
                view.setContentDescription(null);
                return;
            }
            if (accessibilityText != null) {
                view.setContentDescription(accessibilityText);
            }
            if (i == 1) {
                view.setImportantForAccessibility(1);
                view.setFocusable(true);
            } else if (i == 2) {
                view.setImportantForAccessibility(4);
            } else {
                view.setImportantForAccessibility(2);
            }
        }
    }

    public void bindContext(DXWidgetNode dXWidgetNode, Object obj, int i, ql6 ql6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa42c6dd", new Object[]{this, dXWidgetNode, obj, new Integer(i), ql6Var});
            return;
        }
        dXWidgetNode.getDXRuntimeContext().q0(obj);
        dXWidgetNode.getDXRuntimeContext().r0(i);
        HashMap hashMap = new HashMap();
        dXWidgetNode.getDXRuntimeContext().j0(hashMap);
        hashMap.put(bmv.MSGTYPE_INTERVAL, mw5.K(i));
        hashMap.put(Constants.Name.Recycler.LIST_DATA, mw5.F(getListData()));
        if (ql6Var != null) {
            dXWidgetNode.getDXRuntimeContext().s0(ql6Var);
        }
        if (dXWidgetNode.getSourceWidget() == null) {
            dXWidgetNode.setSourceWidget(dXWidgetNode);
        } else if (zg5.E2() && dXWidgetNode.getDXRuntimeContext().b0()) {
            dXWidgetNode.setSourceWidget(dXWidgetNode);
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (!(children == null || children.size() == 0)) {
            for (DXWidgetNode dXWidgetNode2 : children) {
                bindContext(dXWidgetNode2, obj, i, ql6Var);
            }
        }
    }

    public void bindContextWithButter(DXWidgetNode dXWidgetNode, Object obj, int i, ql6 ql6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9dd897", new Object[]{this, dXWidgetNode, obj, new Integer(i), ql6Var});
            return;
        }
        dXWidgetNode.getDXRuntimeContext().q0(obj);
        dXWidgetNode.getDXRuntimeContext().r0(i);
        if (ql6Var != null) {
            dXWidgetNode.getDXRuntimeContext().s0(ql6Var);
        }
        dXWidgetNode.setSourceWidget(dXWidgetNode);
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (!(children == null || children.size() == 0)) {
            for (DXWidgetNode dXWidgetNode2 : children) {
                bindContextWithButter(dXWidgetNode2, obj, i, ql6Var);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void changeVisibility() {
        int childrenCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b79ba69", new Object[]{this});
            return;
        }
        super.changeVisibility();
        if (getNativeView() == null && (childrenCount = getChildrenCount()) > 0) {
            for (int i = 0; i < childrenCount; i++) {
                getChildAt(i).changeVisibility();
            }
        }
    }

    public boolean checkLayoutFlat() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2cf7f6", new Object[]{this})).booleanValue();
        }
        if (!eb5.v()) {
            return false;
        }
        if (getDXRuntimeContext().f().z() || isDisableFlatten() || hasCornerRadius() || getAccessibility() != -1 || getEnabled() == 0 || getAlpha() != 1.0f || getBackGroundColor() != 0 || ((getBorderWidth() > 0 && getBorderColor() != 0) || hasEvent(this))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        LongSparseArray<fw5> dataParsersExprNode = getDataParsersExprNode();
        if (dataParsersExprNode != null && dataParsersExprNode.size() > 0) {
            if (dataParsersExprNode.indexOfKey(y06.DXIMAGESPAN_CORNERRADIUS) >= 0 || dataParsersExprNode.indexOfKey(-7043958449911898942L) >= 0 || dataParsersExprNode.indexOfKey(8679583519247168310L) >= 0 || dataParsersExprNode.indexOfKey(-3738348576243028217L) >= 0 || dataParsersExprNode.indexOfKey(1691221861925381243L) >= 0 || dataParsersExprNode.indexOfKey(16887479372907L) >= 0 || dataParsersExprNode.indexOfKey(-2819959685970048978L) >= 0 || dataParsersExprNode.indexOfKey(-8019934667170236535L) >= 0 || dataParsersExprNode.indexOfKey(-8020113231441560440L) >= 0 || dataParsersExprNode.indexOfKey(3436950829494956384L) >= 0 || dataParsersExprNode.indexOfKey(5802348655878590802L) >= 0) {
                z2 = true;
            }
            z = z2;
        }
        return !z;
    }

    @Override // tb.bwb
    public void cloneChildNode(DXRuntimeContext dXRuntimeContext) {
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bff9d9", new Object[]{this, dXRuntimeContext});
            return;
        }
        DXWidgetNode originNode = getOriginNode();
        if (!(originNode == null || (children = originNode.getChildren()) == null)) {
            for (int i = 0; i < children.size(); i++) {
                addChild(children.get(i).shallowButterClone(dXRuntimeContext), false);
            }
        }
    }

    public void dispatchLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d2da9", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            onLayout(z, i, i2, i3, i4);
        }
    }

    public void dispatchMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4307ab", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            onMeasure(i, i2);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(q26 q26Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("193cd1a2", new Object[]{this, q26Var}) : new ViewGroup.LayoutParams(q26Var.f26456a, q26Var.b);
    }

    public ViewGroup.LayoutParams generateLayoutParamsWithButter(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("2bbcb3ca", new Object[]{this, dXWidgetNode});
        }
        return new ViewGroup.LayoutParams(dXWidgetNode.getLayoutWidth(), dXWidgetNode.getLayoutHeight());
    }

    public ArrayList<DXWidgetNode> generateWidgetNodeByData(int i, JSONArray jSONArray, List<DXWidgetNode> list) {
        ql6 ql6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8458aa13", new Object[]{this, new Integer(i), jSONArray, list});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            Object obj = jSONArray.get(i2);
            int i3 = i2 + i;
            if (getDxv3VariableInfo() != null) {
                ql6Var = getDxv3VariableInfo().b();
            } else {
                ql6Var = null;
            }
            if (i3 == 0) {
                for (DXWidgetNode dXWidgetNode : list) {
                    bindContext(dXWidgetNode, obj, i3, ql6Var);
                }
            } else {
                for (DXWidgetNode dXWidgetNode2 : list) {
                    DXRuntimeContext b = dXWidgetNode2.getDXRuntimeContext().b(dXWidgetNode2);
                    b.q0(obj);
                    b.r0(i3);
                    if (getDxv3VariableInfo() != null) {
                        b.s0(ql6Var);
                    }
                    HashMap hashMap = new HashMap();
                    b.j0(hashMap);
                    hashMap.put(bmv.MSGTYPE_INTERVAL, mw5.K(i3));
                    hashMap.put(Constants.Name.Recycler.LIST_DATA, mw5.F(jSONArray));
                    DXWidgetNode b2 = r26.b(dXWidgetNode2, b);
                    b2.setParentWidget(this);
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<DXWidgetNode> generateWidgetNodeByDataNew(int i, JSONArray jSONArray, List<DXWidgetNode> list) {
        ql6 ql6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8b4ba78b", new Object[]{this, new Integer(i), jSONArray, list});
        }
        ArrayList<DXWidgetNode> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            Object obj = jSONArray.get(i2);
            int i3 = i2 + i;
            if (getDxv3VariableInfo() != null) {
                ql6Var = getDxv3VariableInfo().b();
            } else {
                ql6Var = null;
            }
            for (DXWidgetNode dXWidgetNode : list) {
                DXRuntimeContext b = getDXRuntimeContext().b(dXWidgetNode);
                b.q0(obj);
                b.r0(i3);
                b.s0(ql6Var);
                HashMap hashMap = new HashMap();
                b.j0(hashMap);
                hashMap.put(bmv.MSGTYPE_INTERVAL, mw5.K(i3));
                hashMap.put(Constants.Name.Recycler.LIST_DATA, mw5.F(jSONArray));
                if (q.a(dXWidgetNode, b) == 0) {
                    DXWidgetNode b2 = r26.b(dXWidgetNode, b);
                    b2.getDXRuntimeContext().s0(ql6Var);
                    b2.setParentWidget(this);
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    public DXWidgetNode getCacheView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("924ece8a", new Object[]{this, new Integer(i)});
        }
        return this.recycledPool.a(i);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Map<String, WeakReference<DXWidgetNode>> getDxUserIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("60c39548", new Object[]{this});
        }
        if (this.dxUserIdMap == null) {
            this.dxUserIdMap = new HashMap();
        }
        return this.dxUserIdMap;
    }

    public JSONArray getListData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b9d49539", new Object[]{this});
        }
        return this.listData;
    }

    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (Constants.Name.Recycler.LIST_DATA.equals(str)) {
            return this.listData;
        }
        return null;
    }

    public List<DXWidgetNode> getOriginItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6c10b15c", new Object[]{this});
        }
        return this.originItems;
    }

    public boolean hasEvent(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64f94d6c", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode == null) {
            return false;
        }
        if (dXWidgetNode.isV4Node()) {
            if (dXWidgetNode.getDxv4Properties().h() == null || dXWidgetNode.getDxv4Properties().h().size() <= 0) {
                return false;
            }
            return true;
        } else if (dXWidgetNode.getEventHandlersExprNode() == null || dXWidgetNode.getEventHandlersExprNode().size() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean isClipChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df8b07c4", new Object[]{this})).booleanValue();
        }
        a66 a66Var = this.dxNodeLowFrequencyProperty;
        if (a66Var == null) {
            return true;
        }
        return a66Var.e;
    }

    public boolean isDataSizeChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd7a4c30", new Object[]{this})).booleanValue();
        }
        return this.dataSizeChange;
    }

    public boolean isDisableFlatten() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e18ffb51", new Object[]{this})).booleanValue();
        }
        return this.disableFlatten;
    }

    @Override // tb.bwb
    public boolean isHandleListData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cea7f05", new Object[]{this})).booleanValue();
        }
        if ((this.propertyInitFlag & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // tb.bwb
    public boolean isLayoutFlat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb473c98", new Object[]{this})).booleanValue();
        }
        return this.isLayoutFlat;
    }

    public boolean isLayoutRtl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9cdea61", new Object[]{this})).booleanValue();
        }
        if (getDirection() == 1) {
            return true;
        }
        return false;
    }

    public boolean isMarkContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73f9f2b5", new Object[]{this})).booleanValue();
        }
        return this.markContainer;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getNativeView() != null) {
            getNativeView().layout(i, i2, i3, i4);
        } else {
            super.layoutWithButter(i, i2, i3, i4);
        }
    }

    public void measureChildWithMargins(DXWidgetNode dXWidgetNode, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c425c7", new Object[]{this, dXWidgetNode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            dXWidgetNode.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight() + i2, dXWidgetNode.layoutWidth), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + dXWidgetNode.getMarginTop() + dXWidgetNode.getMarginBottom() + i4, dXWidgetNode.layoutHeight));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getNativeView() != null) {
            getNativeView().measure(i, i2);
        } else {
            super.measureWithButter(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
        } else if ((this.propertyInitFlag & 2) != 0) {
            if (eb5.y()) {
                onBeforeBindNew();
                return;
            }
            if (getChildren() != null && this.originItems == null) {
                this.originItems = new ArrayList();
                for (DXWidgetNode dXWidgetNode : getChildren()) {
                    this.originItems.add(dXWidgetNode.deepClone(getDXRuntimeContext()));
                }
            }
            JSONArray jSONArray = this.listData;
            if (jSONArray == null || jSONArray.isEmpty() || getChildren() == null) {
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
            new ArrayList();
            if (getDXRuntimeContext().b0() && z) {
                removeAllChild();
                if (zg5.K2()) {
                    for (DXWidgetNode dXWidgetNode3 : this.originItems) {
                        addChild(dXWidgetNode3.deepClone(getDXRuntimeContext()));
                    }
                } else {
                    if (getDXRuntimeContext() == null || !zg5.D2(getDXRuntimeContext().c())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    for (DXWidgetNode dXWidgetNode4 : this.originItems) {
                        DXWidgetNode deepClone = dXWidgetNode4.deepClone(getDXRuntimeContext());
                        if (z2 && getStatInPrivateFlags(1)) {
                            deepClone.setStatFlag(1);
                        }
                        addChild(deepClone);
                    }
                }
            }
            ArrayList<DXWidgetNode> generateWidgetNodeByData = generateWidgetNodeByData(0, getListData(), getChildren());
            for (int i = 0; i < generateWidgetNodeByData.size(); i++) {
                addChild(generateWidgetNodeByData.get(i), false);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
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
            int size = listData.size() * this.templateSize;
            if (childrenCount > size) {
                for (int i2 = childrenCount - 1; i2 >= size; i2--) {
                    recycleView(i2);
                }
            }
            for (int i3 = 0; i3 < listData.size(); i3++) {
                Object obj = listData.get(i3);
                int i4 = 0;
                while (true) {
                    int i5 = this.templateSize;
                    if (i4 < i5) {
                        int i6 = (i5 * i3) + i4;
                        ql6 ql6Var = null;
                        if (i6 < getChildrenCount()) {
                            DXWidgetNode childAt = getChildAt(i6);
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
                            bindContextWithButter(childAt, obj, i3, ql6Var);
                        } else {
                            DXWidgetNode cacheView = getCacheView(i4);
                            if (cacheView == null) {
                                DXWidgetNode dXWidgetNode = children.get(i4);
                                DXRuntimeContext b = getDXRuntimeContext().b(dXWidgetNode);
                                b.q0(obj);
                                b.r0(i3);
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
                                bindContextWithButter(cacheView, obj, i3, ql6Var);
                            }
                            addChild(cacheView, false);
                        }
                        i4++;
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeginSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad746430", new Object[]{this, context});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof j) {
            j jVar = (j) dXWidgetNode;
            this.disableFlatten = jVar.disableFlatten;
            this.listData = jVar.listData;
            this.originItems = jVar.originItems;
            this.markContainer = jVar.markContainer;
            this.dataSizeChange = jVar.dataSizeChange;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6436122", new Object[]{this, context});
            return;
        }
        boolean checkLayoutFlat = checkLayoutFlat();
        this.isLayoutFlat = checkLayoutFlat;
        if (!checkLayoutFlat) {
            createNativeView(context);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getClipChildren() != isClipChildren()) {
                    viewGroup.setClipChildren(isClipChildren());
                }
            }
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -7485666501444237648L) {
            if (i != 1) {
                z = false;
            }
            this.disableFlatten = z;
        } else if (j == DXLAYOUT_MARKCONTAINER) {
            if (i == 0) {
                z = false;
            }
            this.markContainer = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (t26.DX_PARSER_LISTDATA == j) {
            setListData(jSONArray);
            this.propertyInitFlag |= 2;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetUserDefinedListAttribute(long j, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e671484b", new Object[]{this, new Long(j), list});
        } else if (t26.DX_PARSER_LISTDATA == j) {
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : list) {
                    jSONArray.add(obj);
                }
                onSetListAttribute(j, jSONArray);
            }
            this.propertyInitFlag |= 2;
        } else {
            super.onSetUserDefinedListAttribute(j, list);
        }
    }

    public void recycleView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3b0684", new Object[]{this, new Integer(i)});
            return;
        }
        DXWidgetNode childAt = getChildAt(i);
        removeChildAt(i);
        ViewGroup viewContainer = childAt.getViewContainer();
        if (viewContainer != null) {
            removeNativeView(viewContainer, childAt);
        }
        this.recycledPool.c(i % this.templateSize, childAt);
    }

    public void removeNativeView(ViewGroup viewGroup, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a83929", new Object[]{this, viewGroup, dXWidgetNode});
            return;
        }
        View nativeView = dXWidgetNode.getNativeView();
        if (nativeView != null) {
            viewGroup.removeView(nativeView);
        } else if (dXWidgetNode.getChildrenCount() > 0) {
            for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.getChildren()) {
                removeNativeView(viewGroup, dXWidgetNode2);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setClipChildren(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad724adc", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.dxNodeLowFrequencyProperty == null) {
            this.dxNodeLowFrequencyProperty = new a66();
        }
        this.dxNodeLowFrequencyProperty.e = z;
    }

    public void setDisableFlatten(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c0f6ef", new Object[]{this, new Boolean(z)});
        } else {
            this.disableFlatten = z;
        }
    }

    public void setListData(JSONArray jSONArray) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8518899", new Object[]{this, jSONArray});
            return;
        }
        if (jSONArray != null) {
            i = jSONArray.size();
        } else {
            i = 0;
        }
        if (jSONArray != null) {
            i2 = jSONArray.size();
        }
        if (i2 != i) {
            this.dataSizeChange = true;
        }
        this.listData = jSONArray;
        this.propertyInitFlag |= 2;
    }

    public void setMarkContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31e677b", new Object[]{this, new Boolean(z)});
        } else {
            this.markContainer = z;
        }
    }

    public boolean updateLayoutParamsWithButter(ViewGroup.LayoutParams layoutParams, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0dc76bc", new Object[]{this, layoutParams, dXWidgetNode})).booleanValue();
        }
        if (layoutParams.width == dXWidgetNode.getLayoutWidth() && layoutParams.height == dXWidgetNode.getLayoutHeight()) {
            return false;
        }
        layoutParams.width = dXWidgetNode.getLayoutWidth();
        layoutParams.height = dXWidgetNode.getLayoutHeight();
        return true;
    }

    public ViewGroup.LayoutParams generateLayoutParams(q26 q26Var, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("3d0366b5", new Object[]{this, q26Var, layoutParams});
        }
        layoutParams.width = q26Var.f26456a;
        layoutParams.height = q26Var.b;
        return layoutParams;
    }
}
