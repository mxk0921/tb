package com.taobao.uikit.gesture.processor;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.GestureLog;
import com.taobao.uikit.gesture.controller.MotionEventsManager;
import com.taobao.uikit.gesture.model.GestureEvent;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DoubleFingerDoubleTapProcessor implements IGestureProcessor, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
    private static final float MAX_TAP_OFFSET = 50.0f;
    private static final String TAG = "uikit_gesture.DoubleFingerDoubleTapProcessor";
    private float mFirstDownX;
    private float mFirstDownY;
    private MotionEventsManager mMotionEventsManager;
    private float mSecondDownX;
    private float mSecondDownY;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private boolean mIsFirstTapTapped = false;
    private boolean mIsSecondTapTapped = false;
    private boolean mShouldConsumeEvents = false;
    private boolean mIsTapUp = false;
    private long mFirstDownTime = 0;

    static {
        t2o.a(933232675);
        t2o.a(933232676);
    }

    private boolean isDoubleFingerTap(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c75483bf", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getPointerCount() != 2 || motionEvent.getEventTime() - this.mFirstDownTime > DOUBLE_TAP_TIMEOUT) {
            return false;
        }
        float abs = Math.abs(motionEvent.getX(0) - this.mFirstDownX);
        float abs2 = Math.abs(motionEvent.getY(0) - this.mFirstDownY);
        float abs3 = Math.abs(motionEvent.getX(1) - this.mSecondDownX);
        float abs4 = Math.abs(motionEvent.getY(1) - this.mSecondDownY);
        if (abs >= 50.0f || abs2 >= 50.0f || abs3 >= 50.0f || abs4 >= 50.0f) {
            return false;
        }
        return true;
    }

    private void resetAllState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463f76e6", new Object[]{this});
            return;
        }
        resetOnceTapState();
        this.mIsFirstTapTapped = false;
        this.mShouldConsumeEvents = false;
        this.mIsTapUp = false;
        this.mMainHandler.removeCallbacks(this);
    }

    private void resetOnceTapState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e87cc5", new Object[]{this});
            return;
        }
        this.mFirstDownTime = 0L;
        this.mFirstDownX = 0.0f;
        this.mFirstDownY = 0.0f;
        this.mSecondDownX = 0.0f;
        this.mSecondDownY = 0.0f;
    }

    private void stopMotionEventsManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c685363", new Object[]{this});
        } else if (this.mIsTapUp) {
            this.mMotionEventsManager.stop();
        }
    }

    @Override // com.taobao.uikit.gesture.processor.IGestureProcessor
    public void onIntercept(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92156f6a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            this.mMotionEventsManager.dispatchEvents();
            this.mShouldConsumeEvents = false;
        }
        this.mMotionEventsManager.stop();
    }

    @Override // com.taobao.uikit.gesture.processor.IGestureProcessor
    public GestureEvent onProcess(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GestureEvent) ipChange.ipc$dispatch("6b66500", new Object[]{this, motionEvent});
        }
        return handleDoubleFingerGesture(motionEvent);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.mMotionEventsManager.dispatchEvents();
        this.mMotionEventsManager.stop();
        resetAllState();
    }

    @Override // com.taobao.uikit.gesture.processor.IGestureProcessor
    public void setMotionEventsManager(MotionEventsManager motionEventsManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266c2a2d", new Object[]{this, motionEventsManager});
        } else {
            this.mMotionEventsManager = motionEventsManager;
        }
    }

    @Override // com.taobao.uikit.gesture.processor.IGestureProcessor
    public boolean shouldBlock(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e9420fa", new Object[]{this, motionEvent})).booleanValue();
        }
        return this.mShouldConsumeEvents;
    }

    private GestureEvent handleDoubleFingerGesture(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GestureEvent) ipChange.ipc$dispatch("69ff66b7", new Object[]{this, motionEvent});
        }
        int actionMasked = motionEvent.getActionMasked();
        int pointerCount = motionEvent.getPointerCount();
        stopMotionEventsManager();
        this.mShouldConsumeEvents = false;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        if (isDoubleFingerTap(motionEvent)) {
                            if (this.mIsFirstTapTapped) {
                                GestureLog.loge(TAG, "onDoubleFingerDoubleTap: ");
                                resetAllState();
                                this.mShouldConsumeEvents = true;
                                this.mIsSecondTapTapped = true;
                                GestureEvent gestureEvent = new GestureEvent();
                                gestureEvent.gestureType = 32;
                                gestureEvent.event = motionEvent;
                                gestureEvent.gestureState = 8;
                                return gestureEvent;
                            } else if (!this.mIsSecondTapTapped) {
                                GestureLog.loge(TAG, "onDoubleFingerTap: ");
                                this.mIsFirstTapTapped = true;
                                this.mShouldConsumeEvents = true;
                                this.mMainHandler.removeCallbacks(this);
                                this.mMainHandler.postDelayed(this, DOUBLE_TAP_TIMEOUT);
                            }
                        }
                    }
                } else if (pointerCount == 2) {
                    this.mSecondDownX = motionEvent.getX(1);
                    this.mSecondDownY = motionEvent.getY(1);
                }
            }
            this.mIsTapUp = true;
            if (this.mIsSecondTapTapped) {
                this.mIsSecondTapTapped = false;
            }
            resetOnceTapState();
        } else {
            resetOnceTapState();
            this.mIsTapUp = false;
            this.mMotionEventsManager.start();
            this.mFirstDownTime = motionEvent.getDownTime();
            this.mFirstDownX = motionEvent.getX();
            this.mFirstDownY = motionEvent.getY();
        }
        this.mMotionEventsManager.onTouchEvent(motionEvent);
        return null;
    }
}
