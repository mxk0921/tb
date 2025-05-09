package com.taobao.avplayer;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.ctb;
import tb.rtb;
import tb.t2o;
import tb.t75;
import tb.wsb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWVideoContainer extends FrameLayout implements ctb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DWContext mDWContext;
    private t75 mDWGestureController;
    private DWLifecycleType mDWLifecycleType;
    private boolean mFirst = true;
    private GestureDetector mGestureDetector;
    private wsb mGestureTouchListener;
    private boolean mInit;
    private rtb mRootViewTouchListener;

    static {
        t2o.a(452984952);
        t2o.a(452985037);
    }

    public DWVideoContainer(DWContext dWContext) {
        super(dWContext.getActivity());
        this.mDWContext = dWContext;
        setBackgroundColor(getResources().getColor(17170444));
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWVideoContainer);
    }

    public static /* synthetic */ Object ipc$super(DWVideoContainer dWVideoContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/avplayer/DWVideoContainer");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        DWContext dWContext = this.mDWContext;
        if (dWContext != null && dWContext.mNeedSmallWindow) {
            if (dWContext.isFloating()) {
                setClickable(false);
            } else {
                setClickable(true);
            }
        }
        DWContext dWContext2 = this.mDWContext;
        if (dWContext2 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (dWContext2.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.mDWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
            if (this.mDWContext.getWindow() == null) {
                window = this.mDWContext.getActivity().getWindow();
            } else {
                window = this.mDWContext.getWindow();
            }
            if (4102 != DWViewUtil.hideNavigationBar(window)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void initGesture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871b8e20", new Object[]{this});
        } else if (!this.mInit) {
            this.mInit = true;
            this.mDWGestureController = new t75(this.mDWContext, this);
            this.mGestureDetector = new GestureDetector(this.mDWContext.getActivity(), this.mDWGestureController);
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
        if (this.mDWContext.getInitScreenType() != DWVideoScreenType.NORMAL && this.mFirst) {
            this.mFirst = false;
            this.mDWContext.getVideo().n();
        }
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        t75 t75Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.mDWLifecycleType = dWLifecycleType;
        if (dWLifecycleType != DWLifecycleType.MID && (t75Var = this.mDWGestureController) != null) {
            t75Var.d();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        MediaPlayControlContext mediaPlayControlContext;
        MediaPlayControlContext mediaPlayControlContext2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        rtb rtbVar = this.mRootViewTouchListener;
        if (rtbVar != null && rtbVar.onTouch(motionEvent)) {
            return false;
        }
        if ((!this.mDWContext.getNeedGesture() && this.mDWContext.screenType() == DWVideoScreenType.NORMAL) || this.mDWLifecycleType != DWLifecycleType.MID || ((!this.mDWContext.getNeedGesture() && (mediaPlayControlContext2 = this.mDWContext.mPlayContext) != null && mediaPlayControlContext2.mEmbed) || (this.mDWContext.screenType() == DWVideoScreenType.NORMAL && (mediaPlayControlContext = this.mDWContext.mPlayContext) != null && mediaPlayControlContext.mEmbed))) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.mInit) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            z = this.mDWGestureController.h();
            this.mDWGestureController.f();
        } else {
            if (motionEvent.getAction() == 3) {
                this.mDWGestureController.a();
                this.mDWGestureController.f();
            }
            z = false;
        }
        if (z || this.mGestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setHookRootViewTouchListener(rtb rtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c33a5", new Object[]{this, rtbVar});
        } else {
            this.mRootViewTouchListener = rtbVar;
        }
    }
}
