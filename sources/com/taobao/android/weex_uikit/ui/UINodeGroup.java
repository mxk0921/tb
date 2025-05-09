package com.taobao.android.weex_uikit.ui;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.j5k;
import tb.ouu;
import tb.t2o;
import tb.vvh;
import tb.xuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UINodeGroup extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Camera camera;
    private Boolean hasViewChild;
    public Matrix mtx;
    private int viewChildCount;
    private Rect childBounds = new Rect();
    private boolean shouldClipChildren = false;
    public ouu children = new ouu(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends j5k<UINodeGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public UINode n;

        static {
            t2o.a(986710088);
        }

        public a(UINodeGroup uINodeGroup) {
            super(uINodeGroup);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/UINodeGroup$GroupTouchHelper");
        }

        @Override // tb.j5k
        public boolean d(MotionEvent motionEvent, View view) {
            boolean z;
            int t;
            int u;
            int t2;
            int u2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f0ce5165", new Object[]{this, motionEvent, view})).booleanValue();
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                s();
                B(true);
            }
            UINode uINode = this.n;
            if (uINode != null) {
                if (uINode != this.i) {
                    Rect y = uINode.getNodeInfo().y();
                    motionEvent.offsetLocation((-y.left) - this.n.getAnimNodeInfo().t(), (-y.top) - this.n.getAnimNodeInfo().u());
                    z = this.n.dispatchTouchEvent(motionEvent, view);
                    motionEvent.offsetLocation(-t2, -u2);
                    if (!z) {
                        z = o(motionEvent, view);
                    }
                } else {
                    z = o(motionEvent, view);
                }
                if (!z) {
                    this.n = null;
                }
            } else {
                int childCount = ((UINodeGroup) this.i).getChildCount() - 1;
                boolean z2 = false;
                while (true) {
                    if (childCount < 0) {
                        z = z2;
                        break;
                    }
                    UINode childAt = ((UINodeGroup) this.i).getChildAt(childCount);
                    if (childAt.getNodeInfo().y().contains(((int) motionEvent.getX()) - childAt.getAnimNodeInfo().t(), ((int) motionEvent.getY()) - childAt.getAnimNodeInfo().u())) {
                        Rect y2 = childAt.getNodeInfo().y();
                        motionEvent.offsetLocation((-y2.left) - childAt.getAnimNodeInfo().t(), (-y2.top) - childAt.getAnimNodeInfo().u());
                        boolean dispatchTouchEvent = childAt.dispatchTouchEvent(motionEvent, view);
                        motionEvent.offsetLocation(-t, -u);
                        if (dispatchTouchEvent) {
                            this.n = childAt;
                            z = dispatchTouchEvent;
                            break;
                        }
                        z2 = dispatchTouchEvent;
                    }
                    childCount--;
                }
                if (!z) {
                    z = o(motionEvent, view);
                    if (z) {
                        this.n = this.i;
                    } else {
                        s();
                    }
                }
            }
            if (action == 1 || action == 3) {
                this.n = null;
                B(false);
            }
            return z;
        }
    }

    static {
        t2o.a(986710087);
    }

    public UINodeGroup(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(UINodeGroup uINodeGroup, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2062288793:
                return super.findNodeById(((Number) objArr[0]).intValue());
            case -1476055420:
                super.updateLayoutState((xuu) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -695014098:
                super.activityPause();
                return null;
            case -534120797:
                super.activityResume();
                return null;
            case -370110026:
                super.collectBatchTasks((List) objArr[0]);
                return null;
            case 786484219:
                super.removedFromParent();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/UINodeGroup");
        }
    }

    @Override // tb.hvu
    public void activityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d692ed2e", new Object[]{this});
            return;
        }
        super.activityPause();
        ouu ouuVar = this.children;
        if (ouuVar != null) {
            int j = ouuVar.j();
            for (int i = 0; i < j; i++) {
                this.children.f(i).activityPause();
            }
        }
    }

    @Override // tb.hvu
    public void activityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029f6a3", new Object[]{this});
            return;
        }
        super.activityResume();
        ouu ouuVar = this.children;
        if (ouuVar != null) {
            int j = ouuVar.j();
            for (int i = 0; i < j; i++) {
                this.children.f(i).activityResume();
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        this.children.c(uINode);
        uINode.setParentNode(this);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addViewNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf16e8f", new Object[]{this});
            return;
        }
        if (this.viewChildCount == 0) {
            this.hasViewChild = Boolean.TRUE;
            notifyAddViewNode(false);
        }
        this.viewChildCount++;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void collectBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f091b6", new Object[]{this, list});
            return;
        }
        super.collectBatchTasks(list);
        this.children.d(list);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchAccessibleChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edca74b", new Object[]{this});
            return;
        }
        boolean shouldBlock = shouldBlock();
        int j = this.children.j();
        for (int i = 0; i < j; i++) {
            this.children.f(i).onParentAccessibleChange(shouldBlock);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e1c906", new Object[]{this, list});
            return;
        }
        int j = this.children.j();
        for (int i = 0; i < j; i++) {
            UINode f = this.children.f(i);
            if (f != null) {
                f.collectBatchTasks(list);
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f)});
            return;
        }
        ouu ouuVar = this.children;
        if (!(ouuVar == null || ouuVar.j() == 0)) {
            if (!isRenderNodeEnabled()) {
                f *= getOpacity();
            }
            int j = this.children.j();
            for (int i = 0; i < j; i++) {
                UINode f2 = this.children.f(i);
                int left = f2.getLeft();
                int top = f2.getTop();
                int translateX = left + f2.getTranslateX();
                int translateY = top + f2.getTranslateY();
                int save = canvas.save();
                if (!(translateX == 0 && translateY == 0)) {
                    canvas.translate(translateX, translateY);
                }
                float rotate = f2.getRotate();
                if (rotate != 0.0f) {
                    canvas.rotate(rotate, f2.getLayoutWidth() / 2.0f, f2.getLayoutHeight() / 2.0f);
                }
                float rotateX = f2.getRotateX();
                float rotateY = f2.getRotateY();
                if (!(rotateX == 0.0f && rotateY == 0.0f)) {
                    if (this.camera == null) {
                        this.camera = new Camera();
                        this.mtx = new Matrix();
                    }
                    this.mtx.reset();
                    this.camera.save();
                    this.camera.rotateX(rotateX);
                    this.camera.rotateY(rotateY);
                    this.camera.getMatrix(this.mtx);
                    canvas.translate(f2.getLayoutWidth() / 2.0f, f2.getLayoutHeight() / 2.0f);
                    canvas.concat(this.mtx);
                    canvas.translate((-f2.getLayoutWidth()) / 2.0f, (-f2.getLayoutHeight()) / 2.0f);
                    this.camera.restore();
                }
                float scaleX = f2.getScaleX();
                float scaleY = f2.getScaleY();
                if (!(Float.compare(1.0f, scaleX) == 0 && Float.compare(1.0f, scaleY) == 0)) {
                    canvas.scale(scaleX, scaleY, f2.getLayoutWidth() / 2.0f, f2.getLayoutHeight() / 2.0f);
                }
                float skewX = f2.getSkewX();
                float skewY = f2.getSkewY();
                if (Float.compare(0.0f, skewX) != 0 || Float.compare(0.0f, skewY) != 0) {
                    float layoutWidth = f2.getLayoutWidth() / 2.0f;
                    float layoutHeight = f2.getLayoutHeight() / 2.0f;
                    canvas.translate(layoutWidth, layoutHeight);
                    canvas.skew(skewX, skewY);
                    canvas.translate(-layoutWidth, -layoutHeight);
                }
                f2.draw(mUSNodeHost, canvas, 0, 0, false, f);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // tb.hvu
    public void dispatchPreallocate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559580db", new Object[]{this, context});
            return;
        }
        int j = this.children.j();
        for (int i = 0; i < j; i++) {
            UINode f = this.children.f(i);
            if (f != null) {
                f.preallocate(context);
            }
        }
    }

    public void dispatchUpdateLayoutState(xuu xuuVar, int i, int i2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b34aa", new Object[]{this, xuuVar, new Integer(i), new Integer(i2)});
            return;
        }
        this.childBounds.set(0, 0, getRight() - getTop(), getBottom() - getTop());
        int j = this.children.j();
        for (int i3 = 0; i3 < j; i3++) {
            UINode f = this.children.f(i3);
            if (f != null) {
                Rect rect = this.childBounds;
                rect.left = Math.min(rect.left, f.getLeft());
                Rect rect2 = this.childBounds;
                rect2.top = Math.min(rect2.top, f.getTop());
                Rect rect3 = this.childBounds;
                rect3.right = Math.max(rect3.right, f.getRight());
                Rect rect4 = this.childBounds;
                rect4.bottom = Math.max(rect4.bottom, f.getBottom());
                f.updateLayoutState(xuuVar, i, i2);
            }
        }
        Rect rect5 = this.childBounds;
        if (rect5.left < 0 || rect5.top < 0 || rect5.right > getRight() - getTop() || this.childBounds.bottom > getBottom() - getTop()) {
            z = true;
        }
        this.shouldClipChildren = z;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        if (findNodeById == null) {
            int j = this.children.j();
            for (int i2 = 0; i2 < j; i2++) {
                findNodeById = this.children.f(i2).findNodeById(i);
                if (findNodeById != null) {
                    break;
                }
            }
        }
        return findNodeById;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.children.j()) {
            return this.children.f(i);
        }
        throw new IllegalStateException("GetChildAt parent index out of bounds, parent: " + toString() + ", index: " + i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        ouu ouuVar = this.children;
        if (ouuVar == null) {
            return 0;
        }
        return ouuVar.j();
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.LAYOUT;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean hasViewChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf9c208", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.hasViewChild;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue();
        }
        return this.children.g(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i != i2) {
            if (i >= this.children.j() || i < 0) {
                throw new IllegalStateException("moveChild from parent index out of bounds, parent: " + toString() + ", fromIndex: " + i);
            }
            this.children.h(i, i2);
        }
    }

    public void notifyChildrenChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241ebabf", new Object[]{this});
        } else {
            onChildrenChanged();
        }
    }

    public void onChildrenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fa95d", new Object[]{this});
        } else {
            requestLayout();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public j5k onCreateTouchHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5k) ipChange.ipc$dispatch("bd2f39c4", new Object[]{this});
        }
        return new a(this);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else if (i >= this.children.j() || i < 0) {
            throw new IllegalStateException("RemoveChild from parent index out of bounds, parent: " + toString() + ", index: " + i);
        } else {
            this.children.i(i);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeViewNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2331f2", new Object[]{this});
            return;
        }
        if (this.viewChildCount == 1) {
            notifyRemoveViewNode(false);
            this.hasViewChild = Boolean.FALSE;
        }
        this.viewChildCount--;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removedFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee0cbfb", new Object[]{this});
            return;
        }
        int j = this.children.j();
        for (int i = 0; i < j; i++) {
            UINode f = this.children.f(i);
            if (f != null) {
                f.removedFromParent();
            }
        }
        super.removedFromParent();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean shouldClip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f29c16ae", new Object[]{this})).booleanValue();
        }
        if (!vvh.f30279a || this.shouldClipChildren) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void updateLayoutState(xuu xuuVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8052e84", new Object[]{this, xuuVar, new Integer(i), new Integer(i2)});
            return;
        }
        super.updateLayoutState(xuuVar, i, i2);
        dispatchUpdateLayoutState(xuuVar, getGlobalVisibleRect().left, getGlobalVisibleRect().top);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
        } else if (i > this.children.j() || i < 0) {
            throw new IllegalStateException("AddChild parent index out of bounds, parent: " + toString() + ", index: " + i);
        } else {
            this.children.b(i, uINode);
            uINode.setParentNode(this);
        }
    }
}
