package com.taobao.android.weex_uikit.widget.slide;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;
import tb.tjc;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SlideDelegateNode extends UINodeGroup implements tjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a listener;
    private List<ywh> nodeTreeList = new ArrayList(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
    }

    static {
        t2o.a(986710244);
        t2o.a(986710038);
    }

    public SlideDelegateNode(int i, a aVar) {
        super(i);
        this.listener = aVar;
    }

    public static /* synthetic */ Object ipc$super(SlideDelegateNode slideDelegateNode, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/SlideDelegateNode");
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        super.addChild(uINode);
        uINode.setLayoutProcessor(this);
        ywh ywhVar = new ywh();
        ywhVar.e(uINode);
        this.nodeTreeList.add(ywhVar);
        if (getInstance() != null) {
            ywhVar.d(getInstance().isPreciseExpose());
        }
    }

    public List<ywh> getNodeTreeList() {
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
        } else {
            rect.offset(-rect.left, 0);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.moveNode(i, i2);
        if (i != i2) {
            ywh remove = this.nodeTreeList.remove(i);
            if (i < i2) {
                this.nodeTreeList.add(i2 - 1, remove);
            } else {
                this.nodeTreeList.add(i2, remove);
            }
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
            ((b) aVar).a();
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
        this.nodeTreeList.remove(i).q().setLayoutProcessor(null);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        super.addChild(i, uINode);
        uINode.setLayoutProcessor(this);
        ywh ywhVar = new ywh();
        ywhVar.e(uINode);
        this.nodeTreeList.add(i, ywhVar);
        if (getInstance() != null) {
            ywhVar.d(getInstance().isPreciseExpose());
        }
    }
}
