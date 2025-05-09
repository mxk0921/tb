package com.taobao.android.weex_uikit.widget.overlay;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.schedule.ViewProxy;
import tb.dwh;
import tb.nxh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSOverlaySlice extends FrameLayout implements Animation.AnimationListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAnimation;
    private String mAnimationType;
    private View mBg;
    private int mChildHeight;
    private final MUSView mChildView;
    private final FrameLayout mChildViewContainer;
    private int mChildWidth;
    private int mChildX = 0;
    private int mChildY = 0;
    private Rect mDisplayLoc;
    private boolean mExitAnimation;
    private final MUSOverlayView mMUSOverlayView;
    private boolean mMask;
    private boolean mMaskAnimation;
    private int mMaskColor;
    private final MUSOverlay mMusOverlay;
    private Rect mRefRect;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f10020a;

        public a(Runnable runnable) {
            this.f10020a = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                this.f10020a.run();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                MUSOverlaySlice.access$000(MUSOverlaySlice.this).onClose();
            }
        }
    }

    static {
        t2o.a(986710194);
    }

    public MUSOverlaySlice(Context context, MUSView mUSView, MUSOverlay mUSOverlay, MUSOverlayView mUSOverlayView) {
        super(context);
        this.mChildView = mUSView;
        this.mMusOverlay = mUSOverlay;
        this.mMUSOverlayView = mUSOverlayView;
        FrameLayout frameLayout = new FrameLayout(context);
        this.mChildViewContainer = frameLayout;
        frameLayout.addView(mUSView);
        addView(frameLayout, -1, -1);
    }

    public static /* synthetic */ MUSOverlay access$000(MUSOverlaySlice mUSOverlaySlice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSOverlay) ipChange.ipc$dispatch("cce02405", new Object[]{mUSOverlaySlice});
        }
        return mUSOverlaySlice.mMusOverlay;
    }

    public static /* synthetic */ Object ipc$super(MUSOverlaySlice mUSOverlaySlice, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/overlay/MUSOverlaySlice");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
        } else {
            onScrollChanged(0, 0, 0, 0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
        } else {
            onScrollChanged(0, 0, 0, 0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
        } else {
            onScrollChanged(0, 0, 0, 0);
        }
    }

    public void onContainerLayoutChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6975c26f", new Object[]{this});
        } else {
            this.mMUSOverlayView.updateLocation();
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        View view = this.mBg;
        if (view != null) {
            removeView(view);
            this.mBg = null;
        }
        this.mChildView.clearAnimation();
    }

    public void setUpAndShow(int i, int i2, int i3, int i4, Rect rect, Rect rect2, boolean z, boolean z2, String str, boolean z3, boolean z4, int i5) {
        long j;
        String str2;
        Animation animation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48577bfb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), rect, rect2, new Boolean(z), new Boolean(z2), str, new Boolean(z3), new Boolean(z4), new Integer(i5)});
            return;
        }
        this.mChildX = i;
        this.mChildY = i2;
        this.mChildWidth = i3;
        this.mChildHeight = i4;
        this.mRefRect = rect;
        this.mDisplayLoc = rect2;
        this.mAnimation = z;
        this.mExitAnimation = z2;
        this.mAnimationType = str;
        this.mMaskAnimation = z3;
        this.mMask = z4;
        this.mMaskColor = i5;
        int e = nxh.e(getContext());
        int c = nxh.c(getContext());
        if (z4) {
            View view = new View(getContext());
            this.mBg = view;
            view.setBackgroundColor(i5);
            addView(this.mBg, 0, new FrameLayout.LayoutParams(-1, -1));
            if (z3) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                this.mBg.startAnimation(alphaAnimation);
            }
            ViewProxy.setOnClickListener(this.mBg, new b());
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mChildView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mChildViewContainer.getLayoutParams();
        char c2 = 65535;
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.setMargins(0, 0, 0, 0);
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.mChildView.setDrawTranslateX(this.mChildX);
        this.mChildView.setDrawTranslateY(this.mChildY);
        if (z) {
            str.hashCode();
            switch (str.hashCode()) {
                case -1984709971:
                    j = 300;
                    str2 = str;
                    if (str2.equals("topClipTopEdge")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1554921213:
                    j = 300;
                    str2 = str;
                    if (str2.equals("bottomClipBottomEdge")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1383228885:
                    j = 300;
                    str2 = str;
                    if (str2.equals("bottom")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1267206133:
                    j = 300;
                    str2 = str;
                    if (str2.equals("opacity")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1148999152:
                    j = 300;
                    str2 = str;
                    if (str2.equals("rightClipLeftEdge")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -973791571:
                    j = 300;
                    str2 = str;
                    if (str2.equals("topClipBottomEdge")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -648994793:
                    j = 300;
                    str2 = str;
                    if (str2.equals("bottomClipTopEdge")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -483295294:
                    j = 300;
                    str2 = str;
                    if (str2.equals("leftClipRightEdge")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -251320371:
                    j = 300;
                    str2 = str;
                    if (str2.equals("rightClipRightEdge")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case -48103557:
                    j = 300;
                    str2 = str;
                    if (str2.equals("leftClipLeftEdge")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 115029:
                    j = 300;
                    str2 = str;
                    if (str2.equals("top")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 3317767:
                    j = 300;
                    str2 = str;
                    if (str2.equals("left")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 108511772:
                    j = 300;
                    str2 = str;
                    if (str2.equals("right")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                default:
                    j = 300;
                    str2 = str;
                    break;
            }
            switch (c2) {
                case 0:
                    layoutParams2.height = c;
                    int i6 = rect.top;
                    layoutParams2.topMargin = i6;
                    this.mChildView.setDrawTranslateY(this.mChildY - i6);
                    animation = new TranslateAnimation(0.0f, 0.0f, -((this.mChildY + rect2.bottom) - rect.top), 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case 1:
                    layoutParams2.height = rect.bottom;
                    animation = new TranslateAnimation(0.0f, 0.0f, rect.bottom - (this.mChildY + rect2.top), 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case 2:
                    animation = new TranslateAnimation(0.0f, 0.0f, i4, 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case 3:
                    animation = new AlphaAnimation(0.0f, 1.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case 4:
                    layoutParams2.width = rect.left;
                    layoutParams2.leftMargin = 0;
                    animation = new TranslateAnimation(rect.left - (this.mChildX + rect2.left), 0.0f, 0.0f, 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case 5:
                    layoutParams2.height = c;
                    int i7 = rect.bottom;
                    layoutParams2.topMargin = i7;
                    this.mChildView.setDrawTranslateY(this.mChildY - i7);
                    animation = new TranslateAnimation(0.0f, 0.0f, -((this.mChildY + rect2.bottom) - rect.bottom), 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case 6:
                    layoutParams2.height = rect.top;
                    animation = new TranslateAnimation(0.0f, 0.0f, rect.top - (this.mChildY + rect2.top), 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case 7:
                    layoutParams2.width = e;
                    int i8 = rect.right;
                    layoutParams2.leftMargin = i8;
                    this.mChildView.setDrawTranslateX(this.mChildX - i8);
                    animation = new TranslateAnimation(-((this.mChildX + rect2.right) - rect.right), 0.0f, 0.0f, 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case '\b':
                    layoutParams2.width = rect.right;
                    layoutParams2.leftMargin = 0;
                    animation = new TranslateAnimation(rect.right - (this.mChildX + rect2.left), 0.0f, 0.0f, 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case '\t':
                    layoutParams2.width = e;
                    int i9 = rect.left;
                    layoutParams2.leftMargin = i9;
                    this.mChildView.setDrawTranslateX(this.mChildX - i9);
                    animation = new TranslateAnimation(-((this.mChildX + rect2.right) - rect.left), 0.0f, 0.0f, 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case '\n':
                    animation = new TranslateAnimation(0.0f, 0.0f, -i4, 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case 11:
                    animation = new TranslateAnimation(-i3, 0.0f, 0.0f, 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                case '\f':
                    animation = new TranslateAnimation(i3, 0.0f, 0.0f, 0.0f);
                    animation.setDuration(j);
                    this.mChildView.startAnimation(animation);
                    break;
                default:
                    dwh.f(MUSOverlay.LOG_TAG, "value [\"" + str2 + "\"] not support for property \"animationType\"");
                    animation = null;
                    break;
            }
            if (animation != null) {
                animation.setAnimationListener(this);
            }
        }
        this.mChildView.forceLayout();
        this.mChildViewContainer.requestLayout();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
        if (r8.equals("bottom") == false) goto L_0x0055;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean playExitAnim(java.lang.Runnable r12) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.overlay.MUSOverlaySlice.playExitAnim(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void updateLocation(int i, int i2, int i3, int i4, Rect rect, Rect rect2) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0df285", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), rect, rect2});
            return;
        }
        this.mChildX = i;
        this.mChildY = i2;
        this.mChildWidth = i3;
        this.mChildHeight = i4;
        this.mRefRect = rect;
        this.mDisplayLoc = rect2;
        int e = nxh.e(getContext());
        int c2 = nxh.c(getContext());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mChildView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mChildViewContainer.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.setMargins(0, 0, 0, 0);
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.mChildView.setDrawTranslateX(this.mChildX);
        this.mChildView.setDrawTranslateY(this.mChildY);
        if (this.mAnimation) {
            String str = this.mAnimationType;
            str.hashCode();
            switch (str.hashCode()) {
                case -1984709971:
                    if (str.equals("topClipTopEdge")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1554921213:
                    if (str.equals("bottomClipBottomEdge")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1148999152:
                    if (str.equals("rightClipLeftEdge")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -973791571:
                    if (str.equals("topClipBottomEdge")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -648994793:
                    if (str.equals("bottomClipTopEdge")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -483295294:
                    if (str.equals("leftClipRightEdge")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -251320371:
                    if (str.equals("rightClipRightEdge")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -48103557:
                    if (str.equals("leftClipLeftEdge")) {
                        c = 7;
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
                    layoutParams2.height = c2;
                    int i5 = rect.top;
                    layoutParams2.topMargin = i5;
                    this.mChildView.setDrawTranslateY(this.mChildY - i5);
                    break;
                case 1:
                    layoutParams2.height = rect.bottom;
                    break;
                case 2:
                    layoutParams2.width = rect.left;
                    layoutParams2.leftMargin = 0;
                    break;
                case 3:
                    layoutParams2.height = c2;
                    int i6 = rect.bottom;
                    layoutParams2.topMargin = i6;
                    this.mChildView.setDrawTranslateY(this.mChildY - i6);
                    break;
                case 4:
                    layoutParams2.height = rect.top;
                    break;
                case 5:
                    layoutParams2.width = e;
                    int i7 = rect.right;
                    layoutParams2.leftMargin = i7;
                    this.mChildView.setDrawTranslateX(this.mChildX - i7);
                    break;
                case 6:
                    layoutParams2.width = rect.right;
                    layoutParams2.leftMargin = 0;
                    break;
                case 7:
                    layoutParams2.width = e;
                    int i8 = rect.left;
                    layoutParams2.leftMargin = i8;
                    this.mChildView.setDrawTranslateX(this.mChildX - i8);
                    break;
                default:
                    String str2 = this.mAnimationType;
                    dwh.f(MUSOverlay.LOG_TAG, "value [\"" + str2 + "\"] not support for property \"animationType\"");
                    break;
            }
        }
        this.mChildView.invalidate();
        this.mChildView.forceLayout();
        this.mChildViewContainer.requestLayout();
    }
}
