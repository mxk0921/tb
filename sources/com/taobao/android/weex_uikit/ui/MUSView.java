package com.taobao.android.weex_uikit.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import tb.oyo;
import tb.t2o;
import tb.vvh;
import tb.xuu;
import tb.ywh;
import tb.zuu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSView extends MUSNodeHost {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MUSDKInstance instance;
    public boolean isAttach;
    private zuu mountState;
    private boolean needRecover;
    private int oldHeight;
    private int oldWidth;
    private oyo scrollObserver;
    private View subView;
    private boolean isRoot = true;
    private final Rect previousMountVisibleRectBounds = new Rect();

    static {
        t2o.a(986710058);
    }

    public MUSView(MUSDKInstance mUSDKInstance) {
        super(mUSDKInstance.getUIContext());
        init(mUSDKInstance);
    }

    private void init(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed0893f", new Object[]{this, mUSDKInstance});
            return;
        }
        this.mountState = new zuu(this);
        this.instance = mUSDKInstance;
        this.scrollObserver = new oyo(this);
    }

    public static /* synthetic */ Object ipc$super(MUSView mUSView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1729863019:
                super.setUiNodeTree((ywh) objArr[0]);
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case -65110090:
                super.addSubView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/MUSView");
        }
    }

    private void onAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
            return;
        }
        this.isAttach = true;
        this.scrollObserver.a();
        if (this.uiNodeTree == null) {
            return;
        }
        if (this.needRecover) {
            recoverMountState();
        } else {
            requestLayout();
        }
    }

    private void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        this.isAttach = false;
        this.scrollObserver.b();
    }

    private static void performLayoutOnChildrenIfNecessary(MUSNodeHost mUSNodeHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c63ea4d", new Object[]{mUSNodeHost});
            return;
        }
        for (int childCount = mUSNodeHost.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = mUSNodeHost.getChildAt(childCount);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                childAt.setTranslationX(mUSNodeHost.getDrawTranslateX());
                childAt.setTranslationY(mUSNodeHost.getDrawTranslateY());
            }
        }
    }

    private void performMount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1c01bf", new Object[]{this});
            return;
        }
        ywh ywhVar = this.uiNodeTree;
        if (ywhVar != null && this.isAttach && ywhVar.u()) {
            this.uiNodeTree.C();
            if (!this.uiNodeTree.w()) {
                ywh ywhVar2 = this.uiNodeTree;
                ywhVar2.s(ywhVar2.t());
            }
            performLayoutOnChildrenIfNecessary(this);
        }
    }

    private void recoverMountState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f7c303", new Object[]{this});
            return;
        }
        this.needRecover = false;
        if (this.uiNodeTree != null) {
            performLayout(false, 0, 0, this.oldWidth, this.oldHeight);
        }
    }

    private static void updateChildTranslate(MUSNodeHost mUSNodeHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c0b8df", new Object[]{mUSNodeHost});
            return;
        }
        int childCount = mUSNodeHost.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mUSNodeHost.getChildAt(i);
            childAt.setTranslationX(mUSNodeHost.getDrawTranslateX());
            childAt.setTranslationY(mUSNodeHost.getDrawTranslateY());
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost
    public void addSubView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1e7fb6", new Object[]{this, view, layoutParams});
        } else {
            super.addSubView(view, layoutParams);
        }
    }

    public MUSDKInstance getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("ab68dab8", new Object[]{this});
        }
        return this.instance;
    }

    public zuu getMountState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zuu) ipChange.ipc$dispatch("cc134bf7", new Object[]{this});
        }
        return this.mountState;
    }

    public Rect getPreviousMountVisibleRectBounds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("2a9b5b4f", new Object[]{this});
        }
        return this.previousMountVisibleRectBounds;
    }

    public ywh getUiNodeTree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywh) ipChange.ipc$dispatch("1ee1d4d3", new Object[]{this});
        }
        return this.uiNodeTree;
    }

    public boolean isMountStateDirty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b9e0cbb", new Object[]{this})).booleanValue();
        }
        return this.mountState.d();
    }

    public void mount(xuu xuuVar, Rect rect, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee25efa", new Object[]{this, xuuVar, rect, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (rect == null) {
            this.previousMountVisibleRectBounds.setEmpty();
        } else {
            this.previousMountVisibleRectBounds.set(rect);
        }
        ywh ywhVar = this.uiNodeTree;
        if (ywhVar != null) {
            this.mountState.g(xuuVar, rect, z, z2, ywhVar.v());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        onAttach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        onAttach();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isAddFlutterView) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ywh ywhVar = this.uiNodeTree;
        if (ywhVar == null) {
            i3 = 0;
        } else {
            i3 = ywhVar.r();
        }
        ywh ywhVar2 = this.uiNodeTree;
        if (ywhVar2 == null) {
            i4 = 0;
        } else {
            i4 = ywhVar2.o();
        }
        if (mode == Integer.MIN_VALUE ? i3 < size : mode == 0) {
            size = i3;
        }
        if (mode2 == Integer.MIN_VALUE ? i4 < size2 : mode2 == 0) {
            size2 = i4;
        }
        setMeasuredDimension(size, size2);
        if (this.isAddFlutterView && getChildCount() > 0) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    childAt.measure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        super.onStartTemporaryDetach();
        onDetach();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = -getDrawTranslateX();
        int i2 = -getDrawTranslateY();
        motionEvent.offsetLocation(i, i2);
        ywh ywhVar = this.uiNodeTree;
        if (ywhVar == null || !ywhVar.z(motionEvent, this)) {
            z = false;
        }
        motionEvent.offsetLocation(-i, -i2);
        return z;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    public void performIncrementalMount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43778a67", new Object[]{this});
        } else if (this.uiNodeTree != null && !this.inLayout) {
            suppressInvalidate(true);
            ywh ywhVar = this.uiNodeTree;
            ywhVar.s(ywhVar.t());
            suppressInvalidate(false);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost
    public void performLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        MUSDKInstance mUSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e37fe2", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.uiNodeTree != null && this.isAttach) {
            if (this.isRoot && !(((i5 = i3 - i) == this.oldWidth && i4 - i2 == this.oldHeight) || (mUSDKInstance = this.instance) == null)) {
                this.oldWidth = i5;
                int i6 = i4 - i2;
                this.oldHeight = i6;
                mUSDKInstance.updateContainerSize(i5, i6, vvh.n());
            }
            performMount();
            updateChildTranslate(this);
            updateAPMState();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost, tb.vpc
    public void release(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88058386", new Object[]{this, new Boolean(z)});
        } else if (this.uiNodeTree != null) {
            this.mountState.i();
            this.previousMountVisibleRectBounds.setEmpty();
            if (z) {
                setContentDescription("");
                this.uiNodeTree.B(null);
                this.uiNodeTree = null;
            }
        }
    }

    public void setInstance(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5df198", new Object[]{this, mUSDKInstance});
        } else {
            this.instance = mUSDKInstance;
        }
    }

    public void setMountContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87082b49", new Object[]{this, context});
        } else {
            this.mountState.k(context);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost
    public void setRecycleWhenDetach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5927fcf", new Object[]{this, new Boolean(z)});
        }
    }

    public void setRoot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253ead49", new Object[]{this, new Boolean(z)});
        } else {
            this.isRoot = z;
        }
    }

    public void setScrollObserverEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4a9ef1", new Object[]{this, new Boolean(z)});
            return;
        }
        oyo oyoVar = this.scrollObserver;
        if (oyoVar != null) {
            oyoVar.c(z);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost
    public void setUiNodeTree(ywh ywhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e46295", new Object[]{this, ywhVar});
            return;
        }
        setScrollObserverEnabled(ywhVar.v());
        this.needRecover = false;
        ywh ywhVar2 = this.uiNodeTree;
        if (!(ywhVar2 == null || ywhVar2 == ywhVar)) {
            release(true);
        }
        super.setUiNodeTree(ywhVar);
        ywhVar.B(this);
        requestLayout();
    }

    @Override // android.view.View
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (getTag() != null) {
            return getTag().toString();
        }
        return super.toString();
    }

    public void updateTranslateOnLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b29915", new Object[]{this});
        } else {
            updateChildTranslate(this);
        }
    }

    public MUSView(Context context) {
        super(context);
        init(null);
    }
}
