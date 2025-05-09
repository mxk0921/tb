package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.weex.common.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a66;
import tb.an6;
import tb.bsn;
import tb.bwb;
import tb.fae;
import tb.hwb;
import tb.nu;
import tb.ql6;
import tb.qub;
import tb.rl6;
import tb.t26;
import tb.t2o;
import tb.xk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r<K extends View, T extends fae> extends rl6<K, T> implements hwb, bwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONArray e;
    public Map<String, WeakReference<DXWidgetNode>> f;
    public bsn h;
    public xk9 g = null;
    public int i = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a<K extends View, T extends an6> implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final nu<K, T> f7460a;

        static {
            t2o.a(444597424);
            t2o.a(444597451);
        }

        public a(nu<K, T> nuVar) {
            this.f7460a = nuVar;
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new r(this.f7460a);
        }
    }

    static {
        t2o.a(444597423);
        t2o.a(444597457);
        t2o.a(444597454);
    }

    public r(nu<K, T> nuVar) {
        super(nuVar);
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -879570230) {
            super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
            return null;
        } else if (hashCode == -428783541) {
            super.onSetUserDefinedListAttribute(((Number) objArr[0]).longValue(), (List) objArr[1]);
            return null;
        } else if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXV3WrapperLayout");
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
        if (!(children == null || children.isEmpty())) {
            for (DXWidgetNode dXWidgetNode2 : children) {
                bindContextWithButter(dXWidgetNode2, obj, i, ql6Var);
            }
        }
    }

    @Override // tb.rl6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new r(this.f27455a);
    }

    public DXRuntimeContext c(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("274536e7", new Object[]{this, dXWidgetNode});
        }
        return getDXRuntimeContext().b(dXWidgetNode);
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
                DXWidgetNode shallowButterClone = children.get(i).shallowButterClone(dXRuntimeContext);
                if (shallowButterClone instanceof j) {
                    ((j) shallowButterClone).setDisableFlatten(true);
                }
                addChild(shallowButterClone, false);
            }
        }
    }

    public DXWidgetNode getCacheView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("924ece8a", new Object[]{this, new Integer(i)});
        }
        return this.h.a(i);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Map<String, WeakReference<DXWidgetNode>> getDxUserIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("60c39548", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new HashMap();
        }
        return this.f;
    }

    public JSONArray getListData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b9d49539", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.hwb
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (Constants.Name.Recycler.LIST_DATA.equals(str)) {
            return this.e;
        }
        return null;
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
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildDataWithButter() {
        DXWidgetNode originNode;
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355dbe58", new Object[]{this});
        } else if (isHandleListData() && (originNode = getOriginNode()) != null && (children = originNode.getChildren()) != null) {
            if (this.h == null) {
                this.h = new bsn();
                this.i = originNode.getChildrenCount();
            }
            int childrenCount = getChildrenCount();
            JSONArray listData = getListData();
            if (listData == null || listData.isEmpty()) {
                for (int i = childrenCount - 1; i >= 0; i--) {
                    recycleView(i);
                }
                return;
            }
            int size = listData.size() * this.i;
            if (childrenCount > size) {
                for (int i2 = childrenCount - 1; i2 >= size; i2--) {
                    recycleView(i2);
                }
            }
            for (int i3 = 0; i3 < listData.size(); i3++) {
                Object obj = listData.get(i3);
                int i4 = 0;
                while (true) {
                    int i5 = this.i;
                    if (i4 < i5) {
                        int i6 = (i5 * i3) + i4;
                        ql6 ql6Var = null;
                        if (i6 < getChildrenCount()) {
                            DXWidgetNode childAt = getChildAt(i6);
                            if (getDxv3VariableInfo() != null) {
                                ql6Var = getDxv3VariableInfo().b();
                            }
                            if (childAt.getVisibility() == 2) {
                                childAt.setVisibility(0);
                            }
                            bindContextWithButter(childAt, obj, i3, ql6Var);
                        } else {
                            DXWidgetNode cacheView = getCacheView(i4);
                            if (cacheView == null) {
                                DXWidgetNode dXWidgetNode = children.get(i4);
                                DXRuntimeContext c = c(dXWidgetNode);
                                c.q0(obj);
                                c.r0(i3);
                                if (getDxv3VariableInfo() != null) {
                                    c.s0(getDxv3VariableInfo().b());
                                }
                                cacheView = dXWidgetNode.shallowButterClone(c);
                            } else {
                                if (getDxv3VariableInfo() != null) {
                                    ql6Var = getDxv3VariableInfo().b();
                                }
                                if (cacheView.getVisibility() == 2) {
                                    cacheView.setVisibility(0);
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

    @Override // tb.rl6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getClipChildren() != isClipChildren()) {
                viewGroup.setClipChildren(isClipChildren());
            }
        }
    }

    @Override // tb.rl6, com.taobao.android.dinamicx.widget.DXWidgetNode
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
        this.h.c(i % this.i, childAt);
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

    public void setListData(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8518899", new Object[]{this, jSONArray});
        } else {
            this.e = jSONArray;
        }
    }

    public ViewGroup.LayoutParams u(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("d55d0150", new Object[]{this, dXWidgetNode});
        }
        return this.f27455a.a(dXWidgetNode);
    }

    public xk9 v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xk9) ipChange.ipc$dispatch("756eb3f5", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new xk9();
        }
        return this.g;
    }

    public boolean w(ViewGroup.LayoutParams layoutParams, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56e832f6", new Object[]{this, layoutParams, dXWidgetNode})).booleanValue();
        }
        return this.f27455a.k(layoutParams, dXWidgetNode);
    }
}
