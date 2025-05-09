package com.taobao.android.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.expression.event.DXViewAppearEvent;
import com.taobao.android.dinamicx.expression.event.DXViewDisappearEvent;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import tb.eb5;
import tb.ic5;
import tb.kd5;
import tb.kl6;
import tb.r76;
import tb.t2o;
import tb.u86;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXRootView extends DXNativeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<DXWidgetNode> animationWidgets;
    public WeakReference<kd5> bindingXManagerWeakReference;
    public JSONObject data;
    public DXNestedScrollerView dxNestedScrollerView;
    public Map<Integer, DXNestedScrollerView> dxNestedScrollerViewMap;
    public DXTemplateItem dxTemplateItem;
    public boolean isRendering;
    public int parentHeightSpec;
    public int parentWidthSpec;
    private Stack<r76> pendingRenderInfoStack;
    private Map<String, String> perfromTrackData;
    private int position;
    public a rootViewLifeCycle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444596552);
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("138c8b04", new Object[]{this, new Integer(i)});
            }
        }

        public void b(DXRootView dXRootView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c9730a3", new Object[]{this, dXRootView, new Integer(i)});
            } else {
                a(i);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            }
        }

        public void d(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0378a16", new Object[]{this, dXRootView});
            } else {
                c();
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
            }
        }

        public void f(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ba36c13", new Object[]{this, dXRootView});
            } else {
                e();
            }
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efe03319", new Object[]{this});
            }
        }

        public void h(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4399b9a", new Object[]{this, dXRootView});
            } else {
                g();
            }
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            }
        }

        public void j(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("103a6a89", new Object[]{this, dXRootView});
            } else {
                i();
            }
        }

        public void k(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            }
        }

        public void l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            }
        }

        public void m(DXRootView dXRootView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67771788", new Object[]{this, dXRootView, new Integer(i)});
            } else {
                l(i);
            }
        }
    }

    static {
        t2o.a(444596551);
        t2o.a(444596879);
    }

    public DXRootView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXRootView dXRootView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case 327977732:
                super.dispatchWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXRootView");
        }
    }

    private void trackError(int i, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1f5b56", new Object[]{this, new Integer(i), th});
            return;
        }
        xv5.b(th);
        String str = getBindingXManager() != null ? getBindingXManager().f15675a : null;
        if (TextUtils.isEmpty(str)) {
            str = "dinamicx";
        }
        ic5.s(str, getDxTemplateItem(), "native", "native_crash", i, xv5.a(th));
    }

    public void _addAnimationWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772916a2", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            if (this.animationWidgets == null) {
                this.animationWidgets = new ArrayList();
            }
            if (!this.animationWidgets.contains(dXWidgetNode)) {
                this.animationWidgets.add(dXWidgetNode);
            }
        }
    }

    public void _clearAnimationWidgets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf91000", new Object[]{this});
        } else {
            this.animationWidgets = new ArrayList();
        }
    }

    public boolean _containAnimationWidget(DXWidgetNode dXWidgetNode) {
        List<DXWidgetNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31e910d9", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode == null || (list = this.animationWidgets) == null || list.size() == 0) {
            return false;
        }
        return this.animationWidgets.contains(dXWidgetNode);
    }

    public List<DXWidgetNode> _getAnimationWidgets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6fd105e", new Object[]{this});
        }
        return this.animationWidgets;
    }

    public void _removeAnimationWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705e13e3", new Object[]{this, dXWidgetNode});
            return;
        }
        List<DXWidgetNode> list = this.animationWidgets;
        if (list != null) {
            list.remove(dXWidgetNode);
        }
    }

    public void addPendingInfo(r76 r76Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8079f22", new Object[]{this, r76Var});
        } else if (r76Var != null) {
            if (this.pendingRenderInfoStack == null) {
                this.pendingRenderInfoStack = new Stack<>();
            }
            this.pendingRenderInfoStack.push(r76Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138c8b04", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.dispatchWindowVisibilityChanged(i);
            a aVar = this.rootViewLifeCycle;
            if (aVar != null) {
                aVar.b(this, i);
            }
        } catch (Throwable th) {
            trackError(f.DX_NATIVE_CRASH_7, th);
        }
    }

    public kd5 getBindingXManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kd5) ipChange.ipc$dispatch("e197789d", new Object[]{this});
        }
        WeakReference<kd5> weakReference = this.bindingXManagerWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.data;
    }

    public DXNestedScrollerView getDxNestedScrollerView(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXNestedScrollerView) ipChange.ipc$dispatch("e117d81f", new Object[]{this, dXRuntimeContext});
        }
        if (this.dxNestedScrollerViewMap == null || dXRuntimeContext == null || dXRuntimeContext.T() < 0) {
            if (this.dxNestedScrollerView == null) {
                this.dxNestedScrollerView = new DXNestedScrollerView(getContext());
            }
            return this.dxNestedScrollerView;
        }
        DXNestedScrollerView dXNestedScrollerView = this.dxNestedScrollerViewMap.get(Integer.valueOf(dXRuntimeContext.T()));
        if (dXNestedScrollerView != null) {
            return dXNestedScrollerView;
        }
        DXNestedScrollerView dXNestedScrollerView2 = new DXNestedScrollerView(getContext());
        this.dxNestedScrollerViewMap.put(Integer.valueOf(dXRuntimeContext.T()), dXNestedScrollerView2);
        return dXNestedScrollerView2;
    }

    public Map<Integer, DXNestedScrollerView> getDxNestedScrollerViewMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("58fdf3f8", new Object[]{this});
        }
        return this.dxNestedScrollerViewMap;
    }

    public DXTemplateItem getDxTemplateItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("e3552b21", new Object[]{this});
        }
        return this.dxTemplateItem;
    }

    public DXWidgetNode getExpandWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("d0f19cbc", new Object[]{this});
        }
        Object tag = getTag(u86.f29223a);
        if (tag instanceof DXWidgetNode) {
            return (DXWidgetNode) tag;
        }
        return null;
    }

    public DXWidgetNode getFlattenWidgetNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5ac407a", new Object[]{this});
        }
        if (!eb5.w()) {
            return kl6.b(this);
        }
        return kl6.b(this);
    }

    public Object getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("24024602", new Object[]{this});
        }
        return this.data;
    }

    public Map<String, String> getPerfromTrackData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1f64f200", new Object[]{this});
        }
        return this.perfromTrackData;
    }

    public int getPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
        }
        return this.position;
    }

    public boolean hasDXRootViewLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a4e9b60", new Object[]{this})).booleanValue();
        }
        if (this.rootViewLifeCycle != null) {
            return true;
        }
        return false;
    }

    public void initDxNestedScrollerViewMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f754909", new Object[]{this});
        } else if (this.dxNestedScrollerViewMap == null) {
            this.dxNestedScrollerViewMap = new HashMap();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        try {
            super.onAttachedToWindow();
            a aVar = this.rootViewLifeCycle;
            if (aVar != null) {
                aVar.d(this);
            }
        } catch (Throwable th) {
            trackError(f.DX_NATIVE_CRASH_11, th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
            a aVar = this.rootViewLifeCycle;
            if (aVar != null) {
                aVar.f(this);
            }
        } catch (Throwable th) {
            trackError(f.DX_NATIVE_CRASH_10, th);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        try {
            super.onFinishTemporaryDetach();
            a aVar = this.rootViewLifeCycle;
            if (aVar != null) {
                aVar.h(this);
            }
        } catch (Throwable th) {
            trackError(f.DX_NATIVE_CRASH_13, th);
        }
    }

    public void onRootViewAppear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22be1961", new Object[]{this, new Integer(i)});
            return;
        }
        DXTraceUtil.b("RootView#onRootViewAppear");
        DXViewAppearEvent dXViewAppearEvent = new DXViewAppearEvent(5288671110273408574L);
        dXViewAppearEvent.setItemIndex(i);
        DXWidgetNode expandWidgetNode = getExpandWidgetNode();
        if (expandWidgetNode != null) {
            expandWidgetNode.sendBroadcastEvent(dXViewAppearEvent);
            DXTraceUtil.c();
        }
    }

    public void onRootViewDisappear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7223a0df", new Object[]{this, new Integer(i)});
            return;
        }
        DXTraceUtil.b("RootView#onRootViewDisappear");
        DXViewDisappearEvent dXViewDisappearEvent = new DXViewDisappearEvent(5388973340095122049L);
        dXViewDisappearEvent.setItemIndex(i);
        DXWidgetNode expandWidgetNode = getExpandWidgetNode();
        if (expandWidgetNode != null) {
            expandWidgetNode.sendBroadcastEvent(dXViewDisappearEvent);
            DXTraceUtil.c();
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        try {
            super.onStartTemporaryDetach();
            a aVar = this.rootViewLifeCycle;
            if (aVar != null) {
                aVar.j(this);
            }
        } catch (Throwable th) {
            trackError(f.DX_NATIVE_CRASH_12, th);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        try {
            super.onVisibilityChanged(view, i);
            a aVar = this.rootViewLifeCycle;
            if (aVar != null) {
                aVar.k(view, i);
            }
        } catch (Throwable th) {
            trackError(f.DX_NATIVE_CRASH_9, th);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.onWindowVisibilityChanged(i);
            a aVar = this.rootViewLifeCycle;
            if (aVar != null) {
                aVar.m(this, i);
            }
        } catch (Throwable th) {
            trackError(f.DX_NATIVE_CRASH_8, th);
        }
    }

    public r76 popPendingInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r76) ipChange.ipc$dispatch("3da4b798", new Object[]{this});
        }
        Stack<r76> stack = this.pendingRenderInfoStack;
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return this.pendingRenderInfoStack.pop();
    }

    public void postMessage(Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b814caa", new Object[]{this, obj});
            return;
        }
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                String string = jSONObject2.getString("type");
                if (!"BNDX".equalsIgnoreCase(string) || getBindingXManager() == null) {
                    DXWidgetNode expandWidgetNode = getExpandWidgetNode();
                    if (expandWidgetNode != null && (jSONObject = jSONObject2.getJSONObject("params")) != null) {
                        String string2 = jSONObject.getString("targetId");
                        DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
                        dXMsgCenterEvent.setParams(jSONObject);
                        dXMsgCenterEvent.setTargetId(string2);
                        dXMsgCenterEvent.setType(string);
                        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(string2);
                        if (queryWidgetNodeByUserId == null || queryWidgetNodeByUserId.getReferenceNode() == null) {
                            expandWidgetNode.sendBroadcastEvent(dXMsgCenterEvent);
                        } else {
                            queryWidgetNodeByUserId.postEvent(dXMsgCenterEvent);
                        }
                    }
                } else {
                    getBindingXManager().q(this, jSONObject2);
                }
            }
        } catch (Throwable th) {
            xv5.b(th);
            String str = getBindingXManager() != null ? getBindingXManager().f15675a : null;
            if (TextUtils.isEmpty(str)) {
                str = "dinamicx";
            }
            ic5.s(str, null, "DX_BindingX", "DX_BindingX_Crash", f.BINDINGX_POST_MSG_CRASH, xv5.a(th));
        }
    }

    public void registerDXRootViewLifeCycle(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fe2249", new Object[]{this, aVar});
        } else {
            this.rootViewLifeCycle = aVar;
        }
    }

    public void removeDxNestedScrollerViewMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45af2d15", new Object[]{this});
        } else {
            this.dxNestedScrollerViewMap = null;
        }
    }

    public void setBindingXManagerWeakReference(kd5 kd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f738ba14", new Object[]{this, kd5Var});
        } else {
            this.bindingXManagerWeakReference = new WeakReference<>(kd5Var);
        }
    }

    public void setDxTemplateItem(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213e393", new Object[]{this, dXTemplateItem});
        } else {
            this.dxTemplateItem = dXTemplateItem;
        }
    }

    public void setExpandWidgetNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31df1a6", new Object[]{this, dXWidgetNode});
        } else {
            setTag(u86.f29223a, dXWidgetNode);
        }
    }

    public void setFlattenWidgetNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec61f40", new Object[]{this, dXWidgetNode});
        } else {
            kl6.e(this, dXWidgetNode);
        }
    }

    public void setMeasureDimension(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aee25d1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            setMeasuredDimension(i, i2);
        }
    }

    public void setPerfromTrackData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54da4c8e", new Object[]{this, map});
        } else {
            this.perfromTrackData = map;
        }
    }

    public void setPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
        } else {
            this.position = i;
        }
    }

    public DXRootView(Context context, DXWidgetNode dXWidgetNode) {
        super(context);
        setExpandWidgetNode(dXWidgetNode);
    }

    public DXNestedScrollerView getDxNestedScrollerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXNestedScrollerView) ipChange.ipc$dispatch("366fe5ee", new Object[]{this}) : getDxNestedScrollerView(null);
    }
}
