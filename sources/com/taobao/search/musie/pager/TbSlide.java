package com.taobao.search.musie.pager;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.musie.pager.TbSlideDelegateNode;
import java.util.List;
import tb.ckf;
import tb.fxh;
import tb.t2o;
import tb.vqd;
import tb.xqd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TbSlide extends UINode implements xqd, TbSlideDelegateNode.a, a.b, vqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TbSlideItem currentSelectedNode;
    private final TbSlideDelegateNode delegateNode = new TbSlideDelegateNode(getNodeId(), this, this);
    private int lastIndex = -1;

    static {
        t2o.a(815792760);
        t2o.a(815792755);
        t2o.a(815792763);
        t2o.a(815792754);
        t2o.a(982516018);
        t2o.a(815792753);
    }

    public TbSlide(int i) {
        super(i);
    }

    private final String getState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e63d9ae", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            return "1";
        }
        return "0";
    }

    public static /* synthetic */ Object ipc$super(TbSlide tbSlide, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2062288793:
                return super.findNodeById(((Number) objArr[0]).intValue());
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 908957670:
                super.onBindInstance((UINode) objArr[0], (MUSDKInstance) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/pager/TbSlide");
        }
    }

    private final boolean isAutoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("382b6ad8", new Object[]{this})).booleanValue();
        }
        return ckf.b(getAttribute("autoplay"), Boolean.TRUE);
    }

    private final boolean isAutoScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f26fb1", new Object[]{this})).booleanValue();
        }
        return ckf.b(getAttribute("autoscroll"), Boolean.TRUE);
    }

    private final int sizeToPixel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca1da48e", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            str = "0";
        }
        return (int) fxh.e(str);
    }

    private final void updateInvokeDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac81bc7", new Object[]{this, str});
        } else {
            ((TbSlideLayout) getMountContent()).updateInvokeDistance(sizeToPixel(str));
        }
    }

    private final void updateItemMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357f075b", new Object[]{this, str});
        } else {
            ((TbSlideLayout) getMountContent()).updateItemMargin(sizeToPixel(str));
        }
    }

    private final void updateItemSpacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fd1078", new Object[]{this, str});
        } else {
            ((TbSlideLayout) getMountContent()).updateItemSpacing(sizeToPixel(str));
        }
    }

    private final void updateMaxDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b861f81", new Object[]{this, str});
        } else {
            ((TbSlideLayout) getMountContent()).updateMaxDistance(sizeToPixel(str));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        TbSlideDelegateNode tbSlideDelegateNode = this.delegateNode;
        ckf.d(uINode);
        tbSlideDelegateNode.addChild(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        if (findNodeById != null) {
            return findNodeById;
        }
        UINode findNodeById2 = this.delegateNode.findNodeById(i);
        ckf.f(findNodeById2, "findNodeById(...)");
        return findNodeById2;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        UINode childAt = this.delegateNode.getChildAt(i);
        ckf.f(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        return this.delegateNode.getChildCount();
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue();
        }
        return this.delegateNode.indexOf(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.delegateNode.moveNode(i, i2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onBindInstance(UINode uINode, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362d97e6", new Object[]{this, uINode, mUSDKInstance});
            return;
        }
        super.onBindInstance(uINode, mUSDKInstance);
        this.delegateNode.setInstance(mUSDKInstance);
    }

    public void onBounceBack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4051f", new Object[]{this, new Boolean(z)});
        } else if (hasEvent("bounceback")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "state", getState(z));
            fireEvent("bounceback", jSONObject);
        }
    }

    @Override // com.taobao.search.musie.pager.TbSlideDelegateNode.a
    public void onChildrenChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defaf7d5", new Object[]{this});
            return;
        }
        this.lastIndex = -1;
        TbSlideLayout tbSlideLayout = (TbSlideLayout) getMountContent();
        if (tbSlideLayout != null) {
            tbSlideLayout.refreshItems(this.delegateNode.getNodeTreeList());
        }
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return new TbSlideLayout(context);
    }

    @Override // tb.xqd
    public void onItemSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb34d2f", new Object[]{this, new Integer(i)});
            return;
        }
        if (hasEvent("itemselected") && this.lastIndex != i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "index", String.valueOf(i));
            fireEvent("itemselected", jSONObject);
            this.lastIndex = i;
        }
        TbSlideItem childNode = this.delegateNode.getChildNode(i);
        if (!ckf.b(this.currentSelectedNode, childNode)) {
            TbSlideItem tbSlideItem = this.currentSelectedNode;
            if (tbSlideItem != null) {
                tbSlideItem.setCanPlay(false);
            }
            this.currentSelectedNode = childNode;
            updateCurrentPlayState();
        }
    }

    @Override // com.taobao.android.weex_framework.a.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        } else if (TextUtils.equals(str, "videostatus")) {
            updateCurrentPlayState();
        }
    }

    public void onStateChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6b3c2b", new Object[]{this, new Boolean(z)});
        } else if (hasEvent("statechange")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "state", getState(z));
            fireEvent("statechange", jSONObject);
        }
    }

    @Override // tb.vqd
    public void onVideoPlayFinish(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e00559", new Object[]{this, new Integer(i)});
            return;
        }
        TbSlideLayout tbSlideLayout = (TbSlideLayout) getMountContent();
        if (tbSlideLayout != null && !tbSlideLayout.isTouching() && isAutoScroll()) {
            onItemSelected(i);
            tbSlideLayout.scrollToPosition(i);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
            return;
        }
        ckf.g(list, "runnableList");
        this.delegateNode.collectBatchTasks(list);
    }

    @MUSNodeProp(name = "autoplay", refresh = true)
    public final void refreshAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e8a46f", new Object[]{this, new Boolean(z)});
        } else {
            updateCurrentPlayState();
        }
    }

    @MUSNodeProp(name = "invokeDistance", refresh = true)
    public final void refreshInvokeDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea254d9", new Object[]{this, str});
        } else {
            updateInvokeDistance(str);
        }
    }

    @MUSNodeProp(name = "itemMargin", refresh = true)
    public final void refreshItemMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1174996d", new Object[]{this, str});
        } else {
            updateItemMargin(str);
        }
    }

    @MUSNodeProp(name = HorizontalXslComponent.ATTR_ITEM_SPACING, refresh = true)
    public final void refreshItemSpacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9c0a6", new Object[]{this, str});
        } else {
            updateItemSpacing(str);
        }
    }

    @MUSNodeProp(name = "maxDistance", refresh = true)
    public final void refreshMaxDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e42cfaf", new Object[]{this, str});
        } else {
            updateMaxDistance(str);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else {
            this.delegateNode.removeChildAt(i);
        }
    }

    @MUSMethod
    public final void scrollTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f85320", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        TbSlideLayout tbSlideLayout = (TbSlideLayout) getMountContent();
        if (tbSlideLayout != null) {
            tbSlideLayout.scrollToPosition(i, z);
        }
    }

    @MUSNodeProp(name = "autoplay")
    public final void setAutoPlay(Boolean bool) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f415c1", new Object[]{this, bool});
            return;
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        setAttribute("autoplay", Boolean.valueOf(z));
    }

    @MUSNodeProp(name = "autoscroll")
    public final void setAutoScroll(Boolean bool) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a061f648", new Object[]{this, bool});
            return;
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        setAttribute("autoscroll", Boolean.valueOf(z));
    }

    @MUSNodeProp(name = "invokeDistance")
    public final void setInvokeDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d186e0", new Object[]{this, str});
        } else {
            setAttribute("invokeDistance", str);
        }
    }

    @MUSNodeProp(name = "itemMargin")
    public final void setItemMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea3e6f4", new Object[]{this, str});
        } else {
            setAttribute("itemMargin", str);
        }
    }

    @MUSNodeProp(name = HorizontalXslComponent.ATTR_ITEM_SPACING)
    public final void setItemSpacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423ff", new Object[]{this, str});
        } else {
            setAttribute(HorizontalXslComponent.ATTR_ITEM_SPACING, str);
        }
    }

    @MUSNodeProp(name = "maxDistance")
    public final void setMaxDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fd3308", new Object[]{this, str});
        } else {
            setAttribute("maxDistance", str);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean viewSupportRenderNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c229a54d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    private final void updateCurrentPlayState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2439534", new Object[]{this});
        } else if (isAutoPlay()) {
            TbSlideItem tbSlideItem = this.currentSelectedNode;
            if (tbSlideItem != null) {
                tbSlideItem.setCanPlay(true);
            }
        } else {
            TbSlideItem tbSlideItem2 = this.currentSelectedNode;
            if (tbSlideItem2 != null) {
                tbSlideItem2.setCanPlay(TextUtils.equals(getNativeState("videostatus"), "play"));
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        TbSlideDelegateNode tbSlideDelegateNode = this.delegateNode;
        ckf.d(uINode);
        tbSlideDelegateNode.addChild(i, uINode);
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        this.lastIndex = -1;
        ckf.e(obj, "null cannot be cast to non-null type com.taobao.search.musie.pager.TbSlideLayout");
        TbSlideLayout tbSlideLayout = (TbSlideLayout) obj;
        tbSlideLayout.mount(this);
        tbSlideLayout.refresh(this.delegateNode.getNodeTreeList(), this.delegateNode.getFooterNode());
        updateMaxDistance((String) getAttribute("maxDistance"));
        updateInvokeDistance((String) getAttribute("invokeDistance"));
        updateItemMargin((String) getAttribute("itemMargin"));
        updateItemSpacing((String) getAttribute(HorizontalXslComponent.ATTR_ITEM_SPACING));
        registerNativeStateListener("videostatus", this);
        this.currentSelectedNode = this.delegateNode.getChildNode(0);
        updateCurrentPlayState();
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        ckf.e(obj, "null cannot be cast to non-null type com.taobao.search.musie.pager.TbSlideLayout");
        ((TbSlideLayout) obj).unmount();
        TbSlideItem tbSlideItem = this.currentSelectedNode;
        if (tbSlideItem != null) {
            tbSlideItem.setCanPlay(false);
        }
        this.currentSelectedNode = null;
        unregisterNativeStateListener("videostatus", this);
    }
}
