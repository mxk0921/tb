package com.taobao.search.musie.pager;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import java.util.ArrayList;
import java.util.List;
import tb.ckf;
import tb.t2o;
import tb.tjc;
import tb.vqd;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TbSlideDelegateNode extends UINodeGroup implements tjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final vqd autoScrollListener;
    private TbSlideFooter footerNode;
    private final a listener;
    private final List<ywh> nodeTreeList = new ArrayList(5);
    private final List<TbSlideItem> nodeList = new ArrayList(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onChildrenChange();
    }

    static {
        t2o.a(815792762);
        t2o.a(986710038);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TbSlideDelegateNode(int i, a aVar, vqd vqdVar) {
        super(i);
        ckf.g(vqdVar, "autoScrollListener");
        this.listener = aVar;
        this.autoScrollListener = vqdVar;
    }

    public static /* synthetic */ Object ipc$super(TbSlideDelegateNode tbSlideDelegateNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1652314895:
                super.removeChildAt(((Number) objArr[0]).intValue());
                return null;
            case -1487412538:
                super.addChild((UINode) objArr[0]);
                return null;
            case -828468633:
                super.addChild(((Number) objArr[0]).intValue(), (UINode) objArr[1]);
                return null;
            case 1544014426:
                super.moveNode(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/pager/TbSlideDelegateNode");
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        ckf.g(uINode, "child");
        super.addChild(uINode);
        if (uINode instanceof TbSlideItem) {
            uINode.setLayoutProcessor(this);
            ywh ywhVar = new ywh();
            ywhVar.e(uINode);
            this.nodeTreeList.add(ywhVar);
            this.nodeList.add(uINode);
            if (getInstance() != null) {
                ywhVar.d(getInstance().isPreciseExpose());
            }
        } else if (uINode instanceof TbSlideFooter) {
            this.footerNode = (TbSlideFooter) uINode;
        }
    }

    public final TbSlideItem getChildNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbSlideItem) ipChange.ipc$dispatch("b214077", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.nodeList.size()) {
            return null;
        }
        return this.nodeList.get(i);
    }

    public final TbSlideFooter getFooterNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbSlideFooter) ipChange.ipc$dispatch("40371995", new Object[]{this});
        }
        return this.footerNode;
    }

    public final List<TbSlideItem> getNodeList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("73e167ea", new Object[]{this});
        }
        return this.nodeList;
    }

    public final List<ywh> getNodeTreeList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6809266c", new Object[]{this});
        }
        return this.nodeTreeList;
    }

    @Override // tb.tjc
    public void modifyFrame(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373d757f", new Object[]{this, rect});
            return;
        }
        ckf.g(rect, "frame");
        rect.offset(-rect.left, -rect.top);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.moveNode(i, i2);
        if (i != i2 && i >= 0 && i < this.nodeList.size()) {
            TbSlideItem remove = this.nodeList.remove(i);
            ywh remove2 = this.nodeTreeList.remove(i);
            if (i < i2) {
                int i3 = i2 - 1;
                this.nodeList.add(i3, remove);
                this.nodeTreeList.add(i3, remove2);
                return;
            }
            this.nodeList.add(i2, remove);
            this.nodeTreeList.add(i2, remove2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void onChildrenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fa95d", new Object[]{this});
            return;
        }
        a aVar = this.listener;
        if (aVar != null) {
            aVar.onChildrenChange();
        }
    }

    public final void playNextVideo(TbSlideItem tbSlideItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6bb8118", new Object[]{this, tbSlideItem});
            return;
        }
        ckf.g(tbSlideItem, "current");
        int indexOf = this.nodeList.indexOf(tbSlideItem);
        if (indexOf >= 0) {
            int size = this.nodeList.size();
            for (int i = indexOf + 1; i < size; i++) {
                if (this.nodeList.get(i).hasVideoChild()) {
                    this.autoScrollListener.onVideoPlayFinish(i);
                    return;
                }
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
            return;
        }
        super.removeChildAt(i);
        if (getChildAt(i) instanceof TbSlideFooter) {
            this.footerNode = null;
        }
        if (i >= 0 && i < this.nodeList.size() && (this.nodeList.get(i) instanceof TbSlideItem)) {
            this.nodeList.remove(i);
            this.nodeTreeList.remove(i).q().setLayoutProcessor(null);
        }
    }

    public final void setFooterNode(TbSlideFooter tbSlideFooter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be23c065", new Object[]{this, tbSlideFooter});
        } else {
            this.footerNode = tbSlideFooter;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        ckf.g(uINode, "child");
        super.addChild(i, uINode);
        if (uINode instanceof TbSlideItem) {
            uINode.setLayoutProcessor(this);
            ywh ywhVar = new ywh();
            ywhVar.e(uINode);
            this.nodeTreeList.add(i, ywhVar);
            this.nodeList.add(i, uINode);
            if (getInstance() != null) {
                ywhVar.d(getInstance().isPreciseExpose());
            }
        } else if (uINode instanceof TbSlideFooter) {
            this.footerNode = (TbSlideFooter) uINode;
        }
    }
}
