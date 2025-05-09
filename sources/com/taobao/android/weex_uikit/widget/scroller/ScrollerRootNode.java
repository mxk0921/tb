package com.taobao.android.weex_uikit.widget.scroller;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import tb.t2o;
import tb.vvh;
import tb.xuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScrollerRootNode extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a childrenStateListener;
    private boolean vertical;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void onChildrenChanged();
    }

    static {
        t2o.a(986710228);
    }

    public ScrollerRootNode(int i) {
        super(i);
    }

    private int getTotalHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b76e4f", new Object[]{this})).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        return getChildAt(getChildCount() - 1).getNodeInfo().y().bottom;
    }

    private int getTotalWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c56dd52", new Object[]{this})).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        UINode childAt = getChildAt(getChildCount() - 1);
        if (vvh.n()) {
            return Math.max(super.getLayoutWidth() - childAt.getNodeInfo().y().left, super.getLayoutWidth());
        }
        return childAt.getNodeInfo().y().right;
    }

    public static /* synthetic */ Object ipc$super(ScrollerRootNode scrollerRootNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1509210880:
                return new Integer(super.getLayoutWidth());
            case -1476055420:
                super.updateLayoutState((xuu) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -711984031:
                return new Integer(super.getLayoutHeight());
            case -254914203:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0], (View) objArr[1]));
            case -110296387:
                super.dispatchDraw((MUSNodeHost) objArr[0], (Canvas) objArr[1], ((Number) objArr[2]).floatValue());
                return null;
            case 56600925:
                super.onChildrenChanged();
                return null;
            case 253441194:
                super.dispatchUpdateLayoutState((xuu) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/scroller/ScrollerRootNode");
        }
    }

    private boolean needTransform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ef52501", new Object[]{this})).booleanValue();
        }
        if (!vvh.n() || this.vertical) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f)});
            return;
        }
        if (needTransform()) {
            i = getTotalWidth() - super.getLayoutWidth();
        }
        if (i != 0) {
            canvas.translate(i, 0.0f);
        }
        super.dispatchDraw(mUSNodeHost, canvas, f);
        if (i != 0) {
            canvas.translate(-i, 0.0f);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean dispatchTouchEvent(MotionEvent motionEvent, View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0ce5165", new Object[]{this, motionEvent, view})).booleanValue();
        }
        if (needTransform()) {
            i = getTotalWidth() - super.getLayoutWidth();
        }
        if (i != 0) {
            motionEvent.offsetLocation(-i, 0.0f);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent, view);
        if (i != 0) {
            motionEvent.offsetLocation(i, 0.0f);
        }
        return dispatchTouchEvent;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void dispatchUpdateLayoutState(xuu xuuVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b34aa", new Object[]{this, xuuVar, new Integer(i), new Integer(i2)});
            return;
        }
        if (needTransform()) {
            i = getTotalWidth() - super.getLayoutWidth();
        }
        super.dispatchUpdateLayoutState(xuuVar, i, i2);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getLayoutHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58ffc61", new Object[]{this})).intValue();
        }
        if (this.vertical) {
            return getTotalHeight();
        }
        return super.getLayoutHeight();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getLayoutWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60b4500", new Object[]{this})).intValue();
        }
        if (this.vertical) {
            return super.getLayoutWidth();
        }
        return getTotalWidth();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void onChildrenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fa95d", new Object[]{this});
            return;
        }
        super.onChildrenChanged();
        a aVar = this.childrenStateListener;
        if (aVar != null) {
            aVar.onChildrenChanged();
        }
    }

    public void setChildrenStateListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("895e29b5", new Object[]{this, aVar});
        } else {
            this.childrenStateListener = aVar;
        }
    }

    public void setVertical(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19b435", new Object[]{this, new Boolean(z)});
        } else {
            this.vertical = z;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void updateLayoutState(xuu xuuVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8052e84", new Object[]{this, xuuVar, new Integer(i), new Integer(i2)});
            return;
        }
        super.updateLayoutState(xuuVar, i, i2);
        getGlobalVisibleRect().right = getGlobalVisibleRect().left + getLayoutWidth();
        getGlobalVisibleRect().bottom = getGlobalVisibleRect().top + getLayoutHeight();
    }
}
