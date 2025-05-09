package com.taobao.android.weex_uikit.widget.scroller;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.scroller.BaseScroller;
import com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode;
import java.util.List;
import tb.t2o;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Scroller extends BaseScroller implements ScrollerRootNode.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends BaseScroller.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(986710226);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/scroller/Scroller$NodeHolder");
        }

        /* renamed from: e */
        public BaseScroller d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseScroller) ipChange.ipc$dispatch("410f5e0c", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Scroller scroller = new Scroller(i);
            scroller.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                scroller.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                scroller.updateAttrs(mUSProps2);
            }
            return scroller;
        }
    }

    static {
        t2o.a(986710225);
        t2o.a(986710229);
    }

    public Scroller(int i) {
        super(i);
        ScrollerRootNode scrollerRootNode = getScrollerRootNode(i);
        this.rootNode = scrollerRootNode;
        scrollerRootNode.setParentNode(this);
        this.rootNode.setChildrenStateListener(this);
        ywh ywhVar = new ywh();
        this.nodeTree = ywhVar;
        ywhVar.e(this.rootNode);
    }

    public static /* synthetic */ Object ipc$super(Scroller scroller, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2062288793:
                return super.findNodeById(((Number) objArr[0]).intValue());
            case -1705119336:
                super.setInstance((MUSDKInstance) objArr[0]);
                return null;
            case -1680040905:
                return new Integer(super.poolSize());
            case -1460428041:
                return super.getNodeType();
            case -1300470387:
                super.postCollectBatchTask((List) objArr[0]);
                return null;
            case -379972208:
                return new Boolean(super.isGenerated());
            case 1023482609:
                super.onDispatchMethod((UINode) objArr[0], (String) objArr[1], (MUSValue[]) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/scroller/Scroller");
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
        } else {
            this.rootNode.addChild(uINode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        if (findNodeById == null) {
            return this.rootNode.findNodeById(i);
        }
        return findNodeById;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        return this.rootNode.getChildAt(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        return this.rootNode.getChildCount();
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, tb.hvu
    public /* bridge */ /* synthetic */ UINodeType getNodeType() {
        return super.getNodeType();
    }

    public ScrollerRootNode getScrollerRootNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollerRootNode) ipChange.ipc$dispatch("229d20dd", new Object[]{this, new Integer(i)});
        }
        return new ScrollerRootNode(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue();
        }
        return this.rootNode.indexOf(uINode);
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ boolean isGenerated() {
        return super.isGenerated();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.rootNode.moveNode(i, i2);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode.a
    public void onChildrenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fa95d", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        super.onDispatchMethod(uINode, str, mUSValueArr);
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, tb.hvu
    public /* bridge */ /* synthetic */ int poolSize() {
        return super.poolSize();
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ void postCollectBatchTask(List list) {
        super.postCollectBatchTask(list);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else {
            this.rootNode.removeChildAt(i);
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
        if (mUSDKInstance != null) {
            this.nodeTree.j(mUSDKInstance.isIncremental());
            this.nodeTree.d(mUSDKInstance.isPreciseExpose());
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

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
        } else {
            this.rootNode.addChild(i, uINode);
        }
    }
}
