package com.taobao.search.musie.component.tbscroll;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode;
import com.taobao.search.musie.component.tbscroll.BounceScrollView;
import com.taobao.weex.common.Constants;
import java.util.List;
import tb.dwh;
import tb.eme;
import tb.fxh;
import tb.pxh;
import tb.pyo;
import tb.t2o;
import tb.yio;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TbScroller extends UINode implements BounceScrollView.a, pxh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_BOUNCE_BACK = "bounceback";
    private static final String EVENT_STATE_CHANGE = "statechanged";
    private static final String LOG_TAG = "EleScroller";
    private static final String PROP_HEAD_INVOKE_DISTANCE = "headInvokeDistance";
    private static final String PROP_HEAD_MAX_DISTANCE = "headMaxDistance";
    private static final String PROP_INVOKE_DISTANCE = "invokeDistance";
    private static final String PROP_MAX_DISTANCE = "maxDistance";
    private static final String PROP_SHOW_SCROLLBAR = "showScrollbar";
    private static final String PROP_SYNC_KEY = "syncKey";
    private ScrollerRootNode contentNode;
    private ywh contentNodeTree;
    private ScrollerRootNode footNode;
    private ywh footNodeTree;
    private int lastScrollDistance;
    private String lastSyncKey;
    private final pyo scrollOffsetManager = new pyo();
    private Runnable scrollToDelayTask;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int d;
        public final /* synthetic */ float e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ int g;

        public a(int i, float f, boolean z, int i2) {
            this.d = i;
            this.e = f;
            this.f = z;
            this.g = i2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/component/tbscroll/TbScroller$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                TbScroller.this.scrollTo(this.d, this.e, this.f, this.g);
            }
        }
    }

    static {
        t2o.a(815792712);
        t2o.a(986710040);
        t2o.a(815792709);
        t2o.a(986710222);
    }

    public TbScroller(int i) {
        super(i);
        ScrollerRootNode scrollerRootNode = new ScrollerRootNode(i);
        this.contentNode = scrollerRootNode;
        scrollerRootNode.setParentNode(this);
        this.contentNode.setVertical(false);
        ywh ywhVar = new ywh();
        this.contentNodeTree = ywhVar;
        ywhVar.e(this.contentNode);
        this.contentNodeTree.j(false);
        ScrollerRootNode scrollerRootNode2 = new ScrollerRootNode(i);
        this.footNode = scrollerRootNode2;
        scrollerRootNode2.setParentNode(this);
        this.footNode.setVertical(false);
        ywh ywhVar2 = new ywh();
        this.footNodeTree = ywhVar2;
        ywhVar2.e(this.footNode);
        this.footNodeTree.j(false);
    }

    private int getHeadInvokeDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1987fb7d", new Object[]{this})).intValue();
        }
        return getValue(PROP_HEAD_INVOKE_DISTANCE);
    }

    private int getHeadMaxDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58925c3d", new Object[]{this})).intValue();
        }
        return getValue(PROP_HEAD_MAX_DISTANCE);
    }

    private int getInvokeDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bc5147d", new Object[]{this})).intValue();
        }
        return getValue(PROP_INVOKE_DISTANCE);
    }

    private int getMaxDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5813e33d", new Object[]{this})).intValue();
        }
        return getValue(PROP_MAX_DISTANCE);
    }

    private int getValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2cd23ff", new Object[]{this, str})).intValue();
        }
        Integer num = (Integer) getAttribute(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static /* synthetic */ Object ipc$super(TbScroller tbScroller, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2062288793) {
            return super.findNodeById(((Number) objArr[0]).intValue());
        }
        if (hashCode == -2024255335) {
            super.onUpdateLayout(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode == -1705119336) {
            super.setInstance((MUSDKInstance) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/component/tbscroll/TbScroller");
        }
    }

    private void registerSyncKey(String str, BounceScrollView bounceScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d8c14f", new Object[]{this, str, bounceScrollView});
        } else if (!TextUtils.isEmpty(str)) {
            this.lastSyncKey = str;
            this.scrollOffsetManager.b(str, bounceScrollView);
        }
    }

    private void unregisterSyncKey(String str, BounceScrollView bounceScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e630a1a8", new Object[]{this, str, bounceScrollView});
        } else if (!TextUtils.isEmpty(str)) {
            this.lastSyncKey = null;
            this.scrollOffsetManager.c(str, bounceScrollView);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
        } else if (!(uINode instanceof TbScrollerFoot)) {
            this.contentNode.addChild(uINode);
        } else if (this.footNode.getChildCount() == 0) {
            this.footNode.addChild(uINode);
        } else {
            throw new RuntimeException("only one scroller-foot is supported");
        }
    }

    @Override // tb.hvu
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e1c906", new Object[]{this, list});
            return;
        }
        this.contentNode.collectBatchTasks(list);
        this.footNode.collectBatchTasks(list);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        if (findNodeById == null) {
            findNodeById = this.contentNode.findNodeById(i);
        }
        if (findNodeById == null) {
            return this.footNode.findNodeById(i);
        }
        return findNodeById;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        if (i == this.contentNode.getChildCount()) {
            return this.footNode.getChildAt(0);
        }
        return this.contentNode.getChildAt(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        return this.contentNode.getChildCount() + this.footNode.getChildCount();
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
        if (uINode instanceof TbScrollerFoot) {
            return this.contentNode.getChildCount();
        }
        return this.contentNode.indexOf(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i >= this.contentNode.getChildCount() || i2 >= this.contentNode.getChildCount()) {
            throw new RuntimeException("scroller-foot must be the last child");
        } else {
            this.contentNode.moveNode(i, i2);
        }
    }

    @Override // com.taobao.search.musie.component.tbscroll.BounceScrollView.a
    public void onBounceBack(int i, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32959746", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (getInstance() != null && !getInstance().isDestroyed() && hasEvent(EVENT_BOUNCE_BACK)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", (Object) String.valueOf(i));
            if (z) {
                str = eme.IMAGE_TYPE_HEAD;
            } else {
                str = "foot";
            }
            jSONObject.put("position", (Object) str);
            getInstance().fireEventOnNode(getNodeId(), EVENT_BOUNCE_BACK, jSONObject);
        }
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return new BounceScrollView(context);
    }

    @Override // tb.pxh
    public void onRealTimeScroll(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931d4", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        String str = (String) getAttribute(PROP_SYNC_KEY);
        if (!TextUtils.isEmpty(str)) {
            this.scrollOffsetManager.a(str, (BounceScrollView) view, i);
        }
    }

    @Override // tb.pxh
    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea33e4f", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getInstance() != null && !getInstance().isDestroyed() && hasEvent("scroll")) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", (Object) Integer.valueOf((int) fxh.m(getInstance().getUIContext(), i)));
            jSONObject2.put("y", (Object) Integer.valueOf((int) fxh.m(getInstance().getUIContext(), i2)));
            jSONObject.put(Constants.Name.CONTENT_OFFSET, (Object) jSONObject2);
            getInstance().fireEventOnNode(getNodeId(), "scroll", jSONObject);
        }
    }

    @Override // tb.pxh
    public void onScrollEnd(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a368b45c", new Object[]{this, view});
        } else if (getInstance() != null && !getInstance().isDestroyed() && hasEvent("scrollend")) {
            getInstance().fireEventOnNode(getNodeId(), "scrollend", null);
        }
    }

    @Override // tb.pxh
    public void onScrollStart(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b975f5", new Object[]{this, view});
        } else if (getInstance() != null && !getInstance().isDestroyed() && hasEvent("scrollstart")) {
            getInstance().fireEventOnNode(getNodeId(), "scrollstart", null);
        }
    }

    @Override // com.taobao.search.musie.component.tbscroll.BounceScrollView.a
    public void onStateChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6afc5a", new Object[]{this, new Integer(i)});
        } else if (getInstance() != null && !getInstance().isDestroyed() && hasEvent(EVENT_STATE_CHANGE)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", (Object) String.valueOf(i));
            getInstance().fireEventOnNode(getNodeId(), EVENT_STATE_CHANGE, jSONObject);
        }
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) obj;
        this.lastScrollDistance = bounceScrollView.getScrollX();
        bounceScrollView.unmount();
        unregisterSyncKey((String) getAttribute(PROP_SYNC_KEY), bounceScrollView);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onUpdateLayout(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.contentNode.updateLayout(0, 0, i5, i6);
        this.footNode.updateLayout(0, 0, i5, i6);
    }

    @MUSNodeProp(name = PROP_HEAD_INVOKE_DISTANCE, refresh = true)
    public void refreshHeadInvokeDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9122bf94", new Object[]{this, new Integer(i)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView != null) {
            bounceScrollView.setHeadInvokeDistance(i);
        }
    }

    @MUSNodeProp(name = PROP_HEAD_MAX_DISTANCE, refresh = true)
    public void refreshHeadMaxDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42aefe", new Object[]{this, new Integer(i)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView != null) {
            bounceScrollView.setHeadMaxDistance(i);
        }
    }

    @MUSNodeProp(name = PROP_INVOKE_DISTANCE, refresh = true)
    public void refreshInvokeDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11246c14", new Object[]{this, new Integer(i)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView != null) {
            bounceScrollView.setInvokeDistance(i);
        }
    }

    @MUSNodeProp(name = PROP_MAX_DISTANCE, refresh = true)
    public void refreshMaxDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef4527e", new Object[]{this, new Integer(i)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView != null) {
            bounceScrollView.setMaxDistance(i);
        }
    }

    @MUSNodeProp(name = "showScrollbar", refresh = true)
    public void refreshShowScrollBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10619b7f", new Object[]{this, new Boolean(z)});
        } else {
            ((BounceScrollView) getMountContent()).setShowScrollBar(z);
        }
    }

    @MUSNodeProp(name = PROP_SYNC_KEY, refresh = true)
    public void refreshSyncKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ca003a", new Object[]{this, str});
        } else if (!TextUtils.equals(str, this.lastSyncKey)) {
            BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
            unregisterSyncKey(this.lastSyncKey, bounceScrollView);
            registerSyncKey(str, bounceScrollView);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else if (i == this.contentNode.getChildCount()) {
            this.footNode.removeChildAt(0);
        } else {
            this.contentNode.removeChildAt(i);
        }
    }

    @MUSMethod(uiThread = true)
    public void scrollTo(int i, float f, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c4fbb", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Integer(i2)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView == null) {
            this.scrollToDelayTask = new a(i, f, z, i2);
        } else if (i < 0 || i >= this.contentNode.getChildCount()) {
            dwh.f(LOG_TAG, "position is beyond the bounds;child count is " + this.contentNode.getChildCount() + " but position is " + i);
        } else {
            float round = Math.round(fxh.a(f));
            UINode childAt = this.contentNode.getChildAt(i);
            if (childAt != null) {
                Rect y = childAt.getNodeInfo().y();
                int scrollX = bounceScrollView.getScrollX();
                int i3 = (int) (y.left + round);
                if (scrollX != i3) {
                    bounceScrollView.scrollTo(false, scrollX, i3, z, i2);
                }
            }
        }
    }

    @MUSNodeProp(name = PROP_HEAD_INVOKE_DISTANCE)
    public void setHeadInvokeDistance(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805d6943", new Object[]{this, mUSValue});
        } else {
            setAttribute(PROP_HEAD_INVOKE_DISTANCE, Integer.valueOf((int) fxh.c(mUSValue)));
        }
    }

    @MUSNodeProp(name = PROP_HEAD_MAX_DISTANCE)
    public void setHeadMaxDistance(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c451516b", new Object[]{this, mUSValue});
        } else {
            setAttribute(PROP_HEAD_MAX_DISTANCE, Integer.valueOf((int) fxh.c(mUSValue)));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, com.taobao.android.weex_framework.ui.INode
    public void setInstance(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5df198", new Object[]{this, mUSDKInstance});
            return;
        }
        super.setInstance(mUSDKInstance);
        this.contentNode.setInstance(mUSDKInstance);
        this.footNode.setInstance(mUSDKInstance);
    }

    @MUSNodeProp(name = PROP_INVOKE_DISTANCE)
    public void setInvokeDistance(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633fe843", new Object[]{this, mUSValue});
        } else {
            setAttribute(PROP_INVOKE_DISTANCE, Integer.valueOf((int) fxh.c(mUSValue)));
        }
    }

    @MUSNodeProp(name = PROP_MAX_DISTANCE)
    public void setMaxDistance(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597326b", new Object[]{this, mUSValue});
        } else {
            setAttribute(PROP_MAX_DISTANCE, Integer.valueOf((int) fxh.c(mUSValue)));
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "showScrollbar")
    public void setShowScrollBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8721146", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("showScrollbar", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = PROP_SYNC_KEY)
    public void setSyncKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a65f813", new Object[]{this, str});
        } else {
            setAttribute(PROP_SYNC_KEY, str);
        }
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) obj;
        bounceScrollView.setInitScrollX(this.lastScrollDistance);
        bounceScrollView.setInstance(mUSDKInstance);
        bounceScrollView.setContent(this.contentNodeTree);
        bounceScrollView.setFoot(this.footNodeTree);
        bounceScrollView.setStateChangeListener(this);
        bounceScrollView.setMaxDistance(getMaxDistance());
        bounceScrollView.setInvokeDistance(getInvokeDistance());
        bounceScrollView.setScrollChangeListener(this);
        bounceScrollView.setShowScrollBar(isShowScrollBar());
        bounceScrollView.setHeadMaxDistance(getHeadMaxDistance());
        bounceScrollView.setHeadInvokeDistance(getHeadInvokeDistance());
        Runnable runnable = this.scrollToDelayTask;
        if (runnable != null) {
            runnable.run();
            this.scrollToDelayTask = null;
        }
        bounceScrollView.scrollTo(0, 0);
        registerSyncKey((String) getAttribute(PROP_SYNC_KEY), bounceScrollView);
    }

    private boolean isShowScrollBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9df4638a", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute("showScrollbar");
        return bool == null || bool.booleanValue();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
        } else if (!(uINode instanceof TbScrollerFoot)) {
            this.contentNode.addChild(i, uINode);
        } else if (this.footNode.getChildCount() == 0) {
            this.footNode.addChild(uINode);
        } else {
            throw new RuntimeException("only one scroller-foot is supported");
        }
    }
}
