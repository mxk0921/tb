package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.bootimage.data.BootImageInfo;
import tb.di2;
import tb.jgw;
import tb.t2o;
import tb.tm1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BootImageInteractSlideView extends BootImageInteractBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLOSE_SPLASH_DELAY_TIME = 500;
    public static final String CLOSE_TYPE_REDIRECT = "redirect";
    public static final String COMMERCIAL_INTERACT_TYPE_REDIRECT = "3";
    private static final String TAG = "BootImageInteractSlideView";
    public LinearLayout mInteractClickContainer;
    private int mNeedSlideDistance;
    private double mSlideAngle;
    private float mSlideDistance;
    private float mSx;
    private float mSy;
    public int mTouchSlop;
    public JSONObject splashObject;
    public float mMinSlideDistance = 75.0f;
    public boolean mDisableInteract = true;
    private boolean mClickOutSide = false;
    public boolean mSlideSuccess = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (BootImageInteractSlideView.this.getBootImageContentListener() != null) {
                    tm1.a(BootImageInteractSlideView.TAG, "getBootImageContentListener().onClose ");
                    BootImageInteractSlideView.this.getBootImageContentListener().a("redirect");
                }
            } catch (Throwable th) {
                tm1.b(BootImageInteractSlideView.TAG, "getBootImageContentListener().onClose error", th);
            }
        }
    }

    static {
        t2o.a(573571119);
    }

    public BootImageInteractSlideView(Context context, BootImageInfo bootImageInfo) {
        super(context, bootImageInfo);
        try {
            this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean calculateDistance(float f, float f2, float f3, float f4) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d05c5b86", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        this.mNeedSlideDistance = di2.d(getContext(), this.mMinSlideDistance);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        if (f5 == 0.0f) {
            d = 90.0d;
        } else {
            d = (Math.atan(Math.abs(f6) / Math.abs(f5)) / 3.141592653589793d) * 180.0d;
        }
        this.mSlideAngle = d;
        this.mSlideDistance = f6;
        if (d < 15.0d || f6 >= 0.0f || Math.abs(f6) < this.mNeedSlideDistance) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractSlideView bootImageInteractSlideView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1383171873:
                super.stopInteract();
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2144052543:
                super.startInteract();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/biz/interact/controller/interact/view/BootImageInteractSlideView");
        }
    }

    public void onAdClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f625d9cd", new Object[]{this});
        } else {
            tm1.a(TAG, "onAdClick");
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        tm1.a(TAG, "onInterceptTouchEvent");
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9ebe99", new Object[]{this});
        } else {
            tm1.a(TAG, "onSlide");
        }
    }

    public void processClick(Context context) {
        BootImageInfo bootImageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c02368", new Object[]{this, context});
            return;
        }
        try {
            String string = this.splashObject.getJSONObject("item").getJSONObject("0").getString("targetUrl");
            tm1.a(TAG, "processClick targetUrl = " + string);
            if (context != null && !TextUtils.isEmpty(string) && (bootImageInfo = this.mBootImageInfo) != null && "3".equals(bootImageInfo.actionResponse)) {
                Nav.from(context).toUri(string);
                postDelayed(new a(), 500L);
            }
        } catch (Throwable th) {
            tm1.b(TAG, "processClick error", th);
        }
    }

    public abstract void renderDefaultCard();

    public void setDisableInteract(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b58c31", new Object[]{this, new Boolean(z)});
        } else {
            this.mDisableInteract = z;
        }
    }

    public void setSlideDistance(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61f7715", new Object[]{this, new Float(f)});
            return;
        }
        tm1.a(TAG, "setSlideDistance=" + f);
        this.mMinSlideDistance = f;
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
            return;
        }
        super.startInteract();
        try {
            this.mDisableInteract = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
            return;
        }
        super.stopInteract();
        try {
            this.mDisableInteract = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        tm1.a(TAG, "onTouchEvent");
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        tm1.a(TAG, "dispatchTouchEvent");
        try {
        } catch (Throwable th) {
            tm1.b(TAG, "dispatchTouchEvent Error ", th);
        }
        if (this.mDisableInteract) {
            tm1.a(TAG, "dispatchTouchEvent disableInteract");
            return super.dispatchTouchEvent(motionEvent);
        } else if (this.mBootImageInfo == null) {
            tm1.a(TAG, "dispatchTouchEvent mBootImageInfo == null");
            return super.dispatchTouchEvent(motionEvent);
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                tm1.a(TAG, "dispatchTouchEvent ACTION_DOWN");
                this.mSx = x;
                this.mSy = y;
                this.mSlideSuccess = false;
                this.mClickOutSide = true ^ jgw.a(this.mInteractClickContainer, x, y, this.mTouchSlop);
            } else if (actionMasked == 1) {
                tm1.a(TAG, "dispatchTouchEvent ACTION_UP " + this.mClickOutSide);
                if (calculateDistance(this.mSx, this.mSy, x, y)) {
                    tm1.a(TAG, "滑动成功: angle=" + this.mSlideAngle + ";distance=" + this.mSlideDistance + ";configDistance=" + this.mNeedSlideDistance);
                    this.mSlideSuccess = true;
                    onSlide();
                } else if (!this.mClickOutSide) {
                    tm1.a(TAG, "点击成功");
                    onAdClick();
                } else {
                    tm1.a(TAG, "滑动失败: angle=" + this.mSlideAngle + ";distance=" + this.mSlideDistance + ";configDistance=" + this.mNeedSlideDistance);
                }
            } else if (actionMasked == 2) {
                tm1.a(TAG, "dispatchTouchEvent ACTION_MOVE");
                if (!jgw.a(this.mInteractClickContainer, x, y, this.mTouchSlop)) {
                    this.mClickOutSide = true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }
}
