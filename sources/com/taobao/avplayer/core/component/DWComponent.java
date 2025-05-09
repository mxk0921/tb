package com.taobao.avplayer.core.component;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.IDWObject;
import com.taobao.avplayer.core.animation.data.AnimatorObject;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.List;
import tb.ab5;
import tb.ew0;
import tb.osb;
import tb.t2o;
import tb.tfb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class DWComponent implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup mComView;
    public Context mContext;
    public osb mDWComponentInstance;
    public DWContext mDWContext;
    public DWInteractiveObject mDWInteractiveObject;
    private int mDuration;
    public Animator mEndAnimator;
    private boolean mIsForceHidden;
    public boolean mRenderFinished;
    public DWVideoScreenType mScreenType;
    public Animator mStartAnimator;
    public boolean isUrlMode = false;
    private boolean mShowing = false;
    public String mJsUrl = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (!DWComponent.access$000(DWComponent.this)) {
                DWComponent.this.hideComponentView();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    static {
        t2o.a(452985058);
        t2o.a(452985054);
        t2o.a(452985056);
    }

    public DWComponent(DWContext dWContext, DWInteractiveObject dWInteractiveObject, DWVideoScreenType dWVideoScreenType) {
        this.mDWContext = dWContext;
        this.mContext = dWContext.getActivity();
        this.mDWInteractiveObject = dWInteractiveObject;
        this.mScreenType = dWVideoScreenType;
        init();
        initView();
    }

    public static /* synthetic */ boolean access$000(DWComponent dWComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d8d1efc", new Object[]{dWComponent})).booleanValue();
        }
        return dWComponent.mShowing;
    }

    private View getAnimationTargetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("60d94d4d", new Object[]{this});
        }
        ViewGroup viewGroup = this.mComView;
        if (viewGroup == null || viewGroup.getChildAt(0) == null) {
            return null;
        }
        return this.mComView.getChildAt(0);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void endAnimation() {
        Animator animator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        } else if (this.mComView != null && (animator = this.mEndAnimator) != null) {
            animator.addListener(new a());
            this.mEndAnimator.start();
        }
    }

    public osb getDWComponentInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osb) ipChange.ipc$dispatch("abc75e8f", new Object[]{this});
        }
        return this.mDWComponentInstance;
    }

    public DWContext getDWContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("8525c6a8", new Object[]{this});
        }
        return this.mDWContext;
    }

    public DWInteractiveObject getInteractiveObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveObject) ipChange.ipc$dispatch("370ca082", new Object[]{this});
        }
        return this.mDWInteractiveObject;
    }

    public String getSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
        }
        return this.mDWInteractiveObject.mSource;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mComView;
    }

    public void hideComponentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac967a7", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.mComView;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public void initAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11101a17", new Object[]{this, view});
            return;
        }
        try {
            initStartAnimation(view);
            initEndAnimation(view);
        } catch (Exception e) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, ew0.k(e));
        }
    }

    public void initEndAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dee5ab2", new Object[]{this, view});
        } else if (this.mEndAnimator == null) {
            List parseArray = JSON.parseArray(this.mDWInteractiveObject.getEndAnimations(), AnimatorObject.class);
            if (parseArray == null || parseArray.isEmpty()) {
                this.mEndAnimator = null;
            }
        }
    }

    public void initStartAnimation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0c639", new Object[]{this, view});
        } else if (this.mStartAnimator == null) {
            List parseArray = JSON.parseArray(this.mDWInteractiveObject.getStartAnimations(), AnimatorObject.class);
            if (parseArray == null || parseArray.isEmpty()) {
                this.mStartAnimator = null;
            }
        }
    }

    public abstract void initView();

    public boolean isForceHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ebdabf6", new Object[]{this})).booleanValue();
        }
        return this.mIsForceHidden;
    }

    public abstract boolean isHandleForceShowOrHideForView();

    public abstract /* synthetic */ void onCreate();

    public abstract /* synthetic */ void onDestroy();

    public abstract /* synthetic */ void onPause();

    public abstract /* synthetic */ void onResume();

    public abstract /* synthetic */ void onStop();

    public void prefetchWeexTemplateUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b132d3ae", new Object[]{this, str});
        }
    }

    public void refreshComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9a9573", new Object[]{this, str});
        }
    }

    public boolean renderFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82d7a0b3", new Object[]{this})).booleanValue();
        }
        return this.mRenderFinished;
    }

    public abstract void renderView();

    public DWVideoScreenType screenType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoScreenType) ipChange.ipc$dispatch("f79d40b6", new Object[]{this});
        }
        return this.mScreenType;
    }

    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.mDuration = i;
        }
    }

    public void setJsUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5fd7b5", new Object[]{this, str});
            return;
        }
        this.mJsUrl = str;
        prefetchWeexTemplateUrl(str);
    }

    public void showComponentView(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdf31ad", new Object[]{this, dWVideoScreenType});
            return;
        }
        if (dWVideoScreenType == this.mScreenType) {
            this.mComView.setVisibility(0);
        } else {
            this.mComView.setVisibility(8);
        }
        this.mComView.bringToFront();
    }

    public void startAnimation() {
        Animator animator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        } else if (this.mComView != null && (animator = this.mStartAnimator) != null) {
            animator.start();
        }
    }

    public void updateFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684668ab", new Object[]{this});
        }
    }

    public final void hide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300cdb2b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mShowing = false;
        if (isHandleForceShowOrHideForView() && z) {
            this.mIsForceHidden = true;
        }
        if (this.mEndAnimator != null) {
            endAnimation();
        } else {
            hideComponentView();
        }
        DWContext dWContext = this.mDWContext;
        if (!(dWContext == null || dWContext.getWXCmpUtilsCallback2() == null)) {
            this.mDWContext.getWXCmpUtilsCallback2().a(getSource());
        }
        osb osbVar = this.mDWComponentInstance;
        if (osbVar != null && (osbVar instanceof WXSDKInstance)) {
            ((WXSDKInstance) this.mDWComponentInstance).B("onInteractHidden", new HashMap());
        }
    }

    public final void show(boolean z, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7f9229", new Object[]{this, new Boolean(z), dWVideoScreenType});
            return;
        }
        if (getAnimationTargetView() != null) {
            initAnimation(getAnimationTargetView());
        }
        if (!isHandleForceShowOrHideForView() || !z) {
            this.mShowing = true;
        } else {
            this.mIsForceHidden = false;
        }
        if (!this.mIsForceHidden && this.mShowing) {
            showComponentView(dWVideoScreenType);
            if (dWVideoScreenType == this.mScreenType) {
                startAnimation();
            }
        }
        osb osbVar = this.mDWComponentInstance;
        if (osbVar != null && (osbVar instanceof WXSDKInstance)) {
            ((ab5) this.mDWComponentInstance).B("onInteractShow", new HashMap());
        }
    }
}
