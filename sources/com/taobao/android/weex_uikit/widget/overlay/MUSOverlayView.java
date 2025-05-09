package com.taobao.android.weex_uikit.widget.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import org.android.agoo.common.AgooConstants;
import tb.dwh;
import tb.lpc;
import tb.nxh;
import tb.pg1;
import tb.t2o;
import tb.vvh;
import tb.yio;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSOverlayView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAnimation;
    private String mDisplayMode;
    private boolean mExitAnimation;
    private MUSView mMUSView;
    private boolean mMask;
    private boolean mMaskAnimation;
    private int mMaskColor;
    private MUSOverlay mMusOverlay;
    private int mNodeRef;
    private String mPosition;
    private String mRole;
    private boolean mShow;
    private MUSOverlaySlice mSliceView;
    private String mType;
    private Integer mZIndex;
    private boolean mMount = false;
    private String mAnimationType = "opacity";
    private int mRequestExit = 0;
    private int mRequestShow = 0;
    private boolean mPendingDisplayTask = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ lpc d;
        public final /* synthetic */ MUSOverlayContainer e;

        public a(lpc lpcVar, MUSOverlayContainer mUSOverlayContainer) {
            this.d = lpcVar;
            this.e = mUSOverlayContainer;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/overlay/MUSOverlayView$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            MUSOverlayView.access$010(MUSOverlayView.this);
            lpc lpcVar = this.d;
            if (lpcVar != null) {
                lpcVar.C1(MUSOverlayView.access$100(MUSOverlayView.this));
            }
            MUSOverlayView.access$200(MUSOverlayView.this, this.e);
            MUSOverlayView.access$300(MUSOverlayView.this, this.e);
            if (MUSOverlayView.access$400(MUSOverlayView.this)) {
                MUSOverlayView.access$402(MUSOverlayView.this, false);
                MUSOverlayView mUSOverlayView = MUSOverlayView.this;
                mUSOverlayView.setShow(MUSOverlayView.access$500(mUSOverlayView));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ lpc d;
        public final /* synthetic */ MUSOverlayContainer e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/overlay/MUSOverlayView$2$1");
            }

            @Override // tb.yio
            public void e() throws Exception {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                MUSOverlayView.access$710(MUSOverlayView.this);
                b bVar = b.this;
                bVar.e.removeOverlay(MUSOverlayView.access$800(MUSOverlayView.this));
                if (MUSOverlayView.access$400(MUSOverlayView.this)) {
                    MUSOverlayView.access$402(MUSOverlayView.this, false);
                    MUSOverlayView mUSOverlayView = MUSOverlayView.this;
                    mUSOverlayView.setShow(MUSOverlayView.access$500(mUSOverlayView));
                }
            }
        }

        public b(lpc lpcVar, MUSOverlayContainer mUSOverlayContainer) {
            this.d = lpcVar;
            this.e = mUSOverlayContainer;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/overlay/MUSOverlayView$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            lpc lpcVar = this.d;
            if (lpcVar != null) {
                lpcVar.s2(MUSOverlayView.access$100(MUSOverlayView.this));
            }
            MUSOverlayView.access$600(MUSOverlayView.this, this.e);
            MUSOverlayView.access$800(MUSOverlayView.this).playExitAnim(new a());
        }
    }

    static {
        t2o.a(986710197);
    }

    public MUSOverlayView(Context context) {
        super(context);
    }

    public static /* synthetic */ int access$010(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0c7b722", new Object[]{mUSOverlayView})).intValue();
        }
        int i = mUSOverlayView.mRequestShow;
        mUSOverlayView.mRequestShow = i - 1;
        return i;
    }

    public static /* synthetic */ MUSOverlay access$100(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlay) ipChange.ipc$dispatch("ad160de7", new Object[]{mUSOverlayView});
        }
        return mUSOverlayView.mMusOverlay;
    }

    public static /* synthetic */ void access$200(MUSOverlayView mUSOverlayView, MUSOverlayContainer mUSOverlayContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e021bf91", new Object[]{mUSOverlayView, mUSOverlayContainer});
        } else {
            mUSOverlayView.showSliceToContainer(mUSOverlayContainer);
        }
    }

    public static /* synthetic */ void access$300(MUSOverlayView mUSOverlayView, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38aabca", new Object[]{mUSOverlayView, viewGroup});
        } else {
            mUSOverlayView.blockSiblingAccessibility(viewGroup);
        }
    }

    public static /* synthetic */ boolean access$400(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56be2cee", new Object[]{mUSOverlayView})).booleanValue();
        }
        return mUSOverlayView.mPendingDisplayTask;
    }

    public static /* synthetic */ boolean access$402(MUSOverlayView mUSOverlayView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("388b1ab0", new Object[]{mUSOverlayView, new Boolean(z)})).booleanValue();
        }
        mUSOverlayView.mPendingDisplayTask = z;
        return z;
    }

    public static /* synthetic */ boolean access$500(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f32c294d", new Object[]{mUSOverlayView})).booleanValue();
        }
        return mUSOverlayView.mShow;
    }

    public static /* synthetic */ void access$600(MUSOverlayView mUSOverlayView, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fe59e7", new Object[]{mUSOverlayView, viewGroup});
        } else {
            mUSOverlayView.recoverSiblingAccessibility(viewGroup);
        }
    }

    public static /* synthetic */ int access$710(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c99dbb", new Object[]{mUSOverlayView})).intValue();
        }
        int i = mUSOverlayView.mRequestExit;
        mUSOverlayView.mRequestExit = i - 1;
        return i;
    }

    public static /* synthetic */ MUSOverlaySlice access$800(MUSOverlayView mUSOverlayView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlaySlice) ipChange.ipc$dispatch("33298ee4", new Object[]{mUSOverlayView});
        }
        return mUSOverlayView.mSliceView;
    }

    private void blockOtherSlice(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa9b729d", new Object[]{this, viewGroup, view});
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != view) {
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
    }

    private void blockSiblingAccessibility(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fae821f", new Object[]{this, viewGroup});
        } else if (shouldBlock()) {
            ViewParent parent = viewGroup.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                    View childAt = viewGroup2.getChildAt(i);
                    if (childAt == viewGroup) {
                        blockOtherSlice(viewGroup, this.mSliceView);
                    } else {
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
        }
    }

    private lpc getOverlayHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpc) ipChange.ipc$dispatch("ec9e0a9c", new Object[]{this});
        }
        MUSOverlay mUSOverlay = this.mMusOverlay;
        if (mUSOverlay == null || !(mUSOverlay.getInstance().getUIContext() instanceof Activity)) {
            return null;
        }
        Activity activity = (Activity) this.mMusOverlay.getInstance().getUIContext();
        if (activity instanceof lpc) {
            return (lpc) activity;
        }
        return null;
    }

    private Rect getSizeOfOverlayContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("749778af", new Object[]{this});
        }
        MUSOverlay mUSOverlay = this.mMusOverlay;
        if (mUSOverlay == null) {
            return new Rect(0, 0, nxh.e(vvh.c()), nxh.c(vvh.c()));
        }
        View findViewById = ((Activity) mUSOverlay.getInstance().getUIContext()).findViewById(16908290);
        int[] iArr = new int[2];
        findViewById.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], findViewById.getWidth() + i, iArr[1] + findViewById.getHeight());
    }

    public static /* synthetic */ Object ipc$super(MUSOverlayView mUSOverlayView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/overlay/MUSOverlayView");
    }

    private void recoverOtherSlice(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30f75a6", new Object[]{this, viewGroup, view});
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != view) {
                    childAt.setImportantForAccessibility(0);
                }
            }
        }
    }

    private void recoverSiblingAccessibility(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3be40f6", new Object[]{this, viewGroup});
        } else if (shouldBlock()) {
            ViewParent parent = viewGroup.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                for (int i = 0; i < viewGroup2.getChildCount(); i++) {
                    View childAt = viewGroup2.getChildAt(i);
                    if (childAt == viewGroup) {
                        recoverOtherSlice(viewGroup, this.mSliceView);
                    } else {
                        childAt.setImportantForAccessibility(0);
                    }
                }
            }
        }
    }

    private boolean shouldBlock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f736fe25", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(this.mRole, "dialog");
    }

    private void showSliceToContainer(MUSOverlayContainer mUSOverlayContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08dc4dd", new Object[]{this, mUSOverlayContainer});
            return;
        }
        mUSOverlayContainer.addOverlay(this.mSliceView, this.mZIndex);
        ywh childNodeTree = this.mMusOverlay.getChildNodeTree();
        int[] iArr = new int[2];
        Rect rect = new Rect();
        Rect displayLoc = getDisplayLoc(iArr, rect);
        if (displayLoc == null) {
            displayLoc = new Rect(0, 0, childNodeTree.r(), childNodeTree.o());
        }
        this.mSliceView.setUpAndShow(iArr[0], iArr[1], displayLoc.width(), displayLoc.height(), rect, displayLoc, this.mAnimation, this.mExitAnimation, this.mAnimationType, this.mMaskAnimation, this.mMask, this.mMaskColor);
    }

    public void mount(MUSOverlay mUSOverlay, String str, int i, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, int i2, boolean z5, Integer num, String str4, boolean z6, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14699171", new Object[]{this, mUSOverlay, str, new Integer(i), str2, new Boolean(z), new Boolean(z2), str3, new Boolean(z3), new Boolean(z4), new Integer(i2), new Boolean(z5), num, str4, new Boolean(z6), str5});
            return;
        }
        this.mRole = str4;
        this.mMusOverlay = mUSOverlay;
        MUSOverlayContainer ensureContainer = ensureContainer();
        if (ensureContainer != null) {
            this.mMount = true;
            this.mType = str;
            this.mNodeRef = i;
            this.mPosition = str2;
            this.mExitAnimation = z2;
            this.mAnimation = z;
            this.mAnimationType = str3;
            this.mMaskAnimation = z3;
            this.mMask = z4;
            this.mMaskColor = i2;
            this.mShow = z5;
            this.mZIndex = num;
            this.mDisplayMode = str5;
            ywh childNodeTree = mUSOverlay.getChildNodeTree();
            if (this.mMUSView == null) {
                MUSView mUSView = new MUSView(mUSOverlay.getInstance());
                this.mMUSView = mUSView;
                mUSView.setRoot(false);
                this.mMUSView.setDisableClip(true);
            }
            this.mMUSView.setUiNodeTree(childNodeTree);
            lpc overlayHolder = getOverlayHolder();
            MUSOverlaySlice C2 = (overlayHolder == null || !z6) ? null : overlayHolder.C2(getContext(), this.mMUSView, this.mMusOverlay, this);
            this.mSliceView = C2;
            if (C2 == null) {
                this.mSliceView = new MUSOverlaySlice(getContext(), this.mMUSView, this.mMusOverlay, this);
            }
            if (z5) {
                showSliceToContainer(ensureContainer);
                blockSiblingAccessibility(ensureContainer);
            }
        }
    }

    public void setAnimationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9b3d2d", new Object[]{this, str});
        } else {
            this.mAnimationType = str;
        }
    }

    public void setMask(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d55d7f", new Object[]{this, new Boolean(z)});
        } else {
            this.mMask = z;
        }
    }

    public void setMaskAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6e6037", new Object[]{this, new Boolean(z)});
        } else {
            this.mMaskAnimation = z;
        }
    }

    public void setMaskColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e1d6e7", new Object[]{this, new Integer(i)});
        } else {
            this.mMaskColor = i;
        }
    }

    public void setMusAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67893e92", new Object[]{this, new Boolean(z)});
        } else {
            this.mAnimation = z;
        }
    }

    public void setMusExitAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc21ad0", new Object[]{this, new Boolean(z)});
        } else {
            this.mExitAnimation = z;
        }
    }

    public void setNodeRef(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e1d141", new Object[]{this, num});
        } else {
            this.mNodeRef = num.intValue();
        }
    }

    public void setPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974e8ffc", new Object[]{this, str});
        } else {
            this.mPosition = str;
        }
    }

    public void setShow(boolean z) {
        int i;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7796c0e", new Object[]{this, new Boolean(z)});
            return;
        }
        MUSOverlayContainer ensureContainer = ensureContainer();
        if (ensureContainer != null) {
            this.mShow = z;
            if (ensureContainer.indexOfChild(this.mSliceView) >= 0) {
                z2 = true;
            }
            lpc overlayHolder = getOverlayHolder();
            int i2 = this.mRequestShow;
            if (i2 > 0 || (i = this.mRequestExit) > 0) {
                this.mPendingDisplayTask = true;
                return;
            }
            boolean z3 = this.mShow;
            if (z2 == z3) {
                return;
            }
            if (z3) {
                this.mRequestShow = i2 + 1;
                this.mMusOverlay.getInstance().postTaskToMain(new a(overlayHolder, ensureContainer));
                return;
            }
            this.mRequestExit = i + 1;
            this.mMusOverlay.getInstance().postTaskToMain(new b(overlayHolder, ensureContainer));
        }
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.mType = str;
        }
    }

    public void setZIndex(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3d8dd6", new Object[]{this, num});
        } else {
            this.mZIndex = num;
        }
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.mMount = false;
        if (this.mSliceView != null) {
            MUSOverlayContainer ensureContainer = ensureContainer();
            recoverSiblingAccessibility(ensureContainer);
            if (ensureContainer != null) {
                ensureContainer.removeOverlay(this.mSliceView);
            }
        }
        MUSView mUSView = this.mMUSView;
        if (mUSView != null) {
            mUSView.release(true);
            this.mMUSView = null;
        }
        this.mMusOverlay = null;
    }

    public void updateLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28be925", new Object[]{this});
        } else if (ensureContainer() != null) {
            ywh childNodeTree = this.mMusOverlay.getChildNodeTree();
            int[] iArr = new int[2];
            Rect rect = new Rect();
            Rect displayLoc = getDisplayLoc(iArr, rect);
            if (displayLoc == null) {
                displayLoc = new Rect(0, 0, childNodeTree.r(), childNodeTree.o());
            }
            this.mSliceView.updateLocation(iArr[0], iArr[1], displayLoc.width(), displayLoc.height(), rect, displayLoc);
        }
    }

    private MUSOverlayContainer ensureContainer() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlayContainer) ipChange.ipc$dispatch("1003e651", new Object[]{this});
        }
        MUSOverlay mUSOverlay = this.mMusOverlay;
        if (mUSOverlay == null || !(mUSOverlay.getInstance().getUIContext() instanceof Activity)) {
            return null;
        }
        Activity activity = (Activity) this.mMusOverlay.getInstance().getUIContext();
        if (TextUtils.isEmpty(this.mDisplayMode) || !pg1.ATOM_EXT_window.equals(this.mDisplayMode)) {
            viewGroup = (ViewGroup) this.mMusOverlay.getInstance().getTag("MUSOverlayContainerHolder");
        } else {
            viewGroup = (ViewGroup) activity.findViewById(16908290);
        }
        if (viewGroup == null) {
            View findViewById = activity.findViewById(16908290);
            if (!(findViewById instanceof ViewGroup)) {
                return null;
            }
            viewGroup = (ViewGroup) findViewById;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof MUSOverlayContainer) {
                return (MUSOverlayContainer) childAt;
            }
        }
        MUSOverlayContainer mUSOverlayContainer = new MUSOverlayContainer(activity);
        viewGroup.addView(mUSOverlayContainer, -1, -1);
        return mUSOverlayContainer;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Rect getDisplayLoc(int[] iArr, Rect rect) {
        ywh attachedTree;
        MUSView n;
        char c;
        char c2;
        char c3;
        char c4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("363037d9", new Object[]{this, iArr, rect});
        }
        MUSOverlay mUSOverlay = this.mMusOverlay;
        if (mUSOverlay == null) {
            return null;
        }
        ywh childNodeTree = mUSOverlay.getChildNodeTree();
        UINodeGroup uINodeGroup = (UINodeGroup) childNodeTree.q();
        if (uINodeGroup.getChildCount() == 0) {
            return new Rect(0, 0, 0, 0);
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        while (i3 < uINodeGroup.getChildCount()) {
            UINode childAt = uINodeGroup.getChildAt(i3);
            int left = childAt.getLeft();
            int top = childAt.getTop();
            int right = childAt.getRight();
            int bottom = childAt.getBottom();
            if (left < i5) {
                i5 = left;
            }
            if (top < i2) {
                i2 = top;
            }
            if (right > i) {
                i = right;
            }
            if (bottom > i4) {
                i4 = bottom;
            }
            i3++;
            uINodeGroup = uINodeGroup;
        }
        Rect sizeOfOverlayContainer = getSizeOfOverlayContainer();
        Rect rect2 = new Rect(i5, i2, i, i4);
        if (AgooConstants.MESSAGE_POPUP.equals(this.mType)) {
            String str = this.mPosition;
            str.hashCode();
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    iArr[0] = 0;
                    iArr[1] = sizeOfOverlayContainer.height() - rect2.height();
                    break;
                case 1:
                    iArr[0] = 0;
                    iArr[1] = 0;
                    break;
                case 2:
                    iArr[0] = 0;
                    iArr[1] = 0;
                    break;
                case 3:
                    iArr[0] = sizeOfOverlayContainer.width() - rect2.width();
                    iArr[1] = 0;
                    break;
                default:
                    String str2 = this.mPosition;
                    dwh.f(MUSOverlay.LOG_TAG, "value [\"" + str2 + "\"] not support for property \"position\"");
                    iArr[0] = 0;
                    iArr[1] = 0;
                    break;
            }
            return rect2;
        } else if ("popover".equals(this.mType)) {
            iArr[0] = 0;
            iArr[1] = 0;
            UINode uINode = (UINode) this.mMusOverlay.getInstance().findNodeById(this.mNodeRef);
            if (uINode == null) {
                dwh.f(MUSOverlay.LOG_TAG, "nodeRef not found");
                return rect2;
            }
            Rect globalVisibleRect = uINode.getGlobalVisibleRect();
            if (globalVisibleRect == null || (attachedTree = uINode.getAttachedTree()) == null || (n = attachedTree.n()) == null) {
                return rect2;
            }
            int[] iArr2 = new int[2];
            n.getLocationOnScreen(iArr2);
            int drawTranslateX = iArr2[0] + globalVisibleRect.left + n.getDrawTranslateX();
            int drawTranslateY = iArr2[1] + globalVisibleRect.top + n.getDrawTranslateY();
            int right2 = drawTranslateX + (uINode.getRight() - uINode.getLeft());
            int bottom2 = (uINode.getBottom() - uINode.getTop()) + drawTranslateY;
            rect.left = drawTranslateX - sizeOfOverlayContainer.left;
            rect.top = drawTranslateY - sizeOfOverlayContainer.top;
            rect.right = right2 - sizeOfOverlayContainer.left;
            rect.bottom = bottom2 - sizeOfOverlayContainer.top;
            String str3 = this.mPosition;
            str3.hashCode();
            switch (str3.hashCode()) {
                case -1683001720:
                    if (str3.equals("bottomEdge")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1682792238:
                    if (str3.equals("bottomLeft")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1569573383:
                    if (str3.equals("rightEdge")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383228885:
                    if (str3.equals("bottom")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1140330318:
                    if (str3.equals("topEdge")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1140120836:
                    if (str3.equals("topLeft")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -978346553:
                    if (str3.equals("topRight")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -621290831:
                    if (str3.equals("bottomRight")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str3.equals("top")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str3.equals("left")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str3.equals("right")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1717970532:
                    if (str3.equals("leftEdge")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = sizeOfOverlayContainer.left;
                    iArr[1] = bottom2;
                    break;
                case 1:
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = drawTranslateX;
                    iArr[1] = bottom2;
                    break;
                case 2:
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = right2;
                    iArr[1] = sizeOfOverlayContainer.top;
                    break;
                case 3:
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = (drawTranslateX + right2) / 2;
                    iArr[1] = bottom2;
                    break;
                case 4:
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = sizeOfOverlayContainer.left;
                    iArr[1] = drawTranslateY;
                    break;
                case 5:
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = drawTranslateX;
                    iArr[1] = drawTranslateY;
                    break;
                case 6:
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = right2;
                    iArr[1] = drawTranslateY;
                    break;
                case 7:
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = right2;
                    iArr[1] = bottom2;
                    break;
                case '\b':
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = (drawTranslateX + right2) / 2;
                    iArr[1] = drawTranslateY;
                    break;
                case '\t':
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = drawTranslateX;
                    iArr[1] = (drawTranslateY + bottom2) / 2;
                    break;
                case '\n':
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = right2;
                    iArr[1] = (drawTranslateY + bottom2) / 2;
                    break;
                case 11:
                    c3 = 0;
                    iArr[0] = drawTranslateX;
                    c2 = 1;
                    iArr[1] = sizeOfOverlayContainer.top;
                    break;
                default:
                    String str4 = this.mPosition;
                    dwh.f(MUSOverlay.LOG_TAG, "value [\"" + str4 + "\"] not support for property \"position\"");
                    c3 = 0;
                    c2 = 1;
                    iArr[0] = drawTranslateX;
                    iArr[1] = drawTranslateY;
                    break;
            }
            iArr[c3] = iArr[c3] - sizeOfOverlayContainer.left;
            iArr[c2] = iArr[c2] - sizeOfOverlayContainer.top;
            return rect2;
        } else {
            iArr[0] = 0;
            if (childNodeTree.o() > sizeOfOverlayContainer.height()) {
                iArr[1] = sizeOfOverlayContainer.height() - childNodeTree.o();
            } else {
                iArr[1] = 0;
            }
            return sizeOfOverlayContainer;
        }
    }
}
