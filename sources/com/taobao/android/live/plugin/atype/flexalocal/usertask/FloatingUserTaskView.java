package com.taobao.android.live.plugin.atype.flexalocal.usertask;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.BounceInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame;
import tb.nh4;
import tb.p7e;
import tb.r7e;
import tb.t2o;
import tb.t7e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FloatingUserTaskView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isDrug;
    private p7e mIUserTaskEntryClickListener;
    private r7e mIUserTaskEventListener;
    private t7e mIUserTaskPosChanged;
    private float mLastRawX;
    private float mLastRawY;
    private int mRootMeasuredHeight;
    private int mRootMeasuredWidth;
    private int mRootTopY;
    public static float sY = 0.0f;
    public static float sX = -1.0f;

    static {
        t2o.a(295700084);
    }

    public FloatingUserTaskView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(FloatingUserTaskView floatingUserTaskView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/FloatingUserTaskView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    public void initView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
            return;
        }
        removeAllViews();
        addView(view);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int i;
        ViewParent parent2;
        r7e r7eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action != 0) {
            float f = 0.0f;
            if (action == 1) {
                if (this.isDrug) {
                    int i2 = this.mRootMeasuredWidth;
                    if (this.mLastRawX <= i2 / 2) {
                        sX = 0.0f;
                        animate().setInterpolator(new BounceInterpolator()).setDuration(500L).x(0.0f).start();
                    } else {
                        sX = i2 - getWidth();
                        animate().setInterpolator(new BounceInterpolator()).setDuration(500L).x(sX).start();
                    }
                } else {
                    p7e p7eVar = this.mIUserTaskEntryClickListener;
                    if (p7eVar != null) {
                        ((FloatingUserTaskFrame.a) p7eVar).a();
                    }
                }
                r7e r7eVar2 = this.mIUserTaskEventListener;
                if (r7eVar2 != null) {
                    r7eVar2.a("com.taobao.taolive.room.enable_updown_switch", "");
                    this.mIUserTaskEventListener.a(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, "");
                }
                t7e t7eVar = this.mIUserTaskPosChanged;
                if (t7eVar != null) {
                    ((FloatingUserTaskFrame.b) t7eVar).a(sX, sY);
                }
                if (nh4.K() && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            } else if (action != 2) {
                if (action == 3 && (r7eVar = this.mIUserTaskEventListener) != null) {
                    r7eVar.a("com.taobao.taolive.room.enable_updown_switch", "");
                    this.mIUserTaskEventListener.a(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, "");
                }
            } else if (rawX >= 0.0f && rawX <= this.mRootMeasuredWidth) {
                if (rawY >= this.mRootTopY && rawY <= this.mRootMeasuredHeight + i) {
                    float f2 = rawX - this.mLastRawX;
                    float f3 = rawY - this.mLastRawY;
                    if (!this.isDrug) {
                        if (Math.sqrt((f2 * f2) + (f3 * f3)) < 2.0d) {
                            this.isDrug = false;
                        } else {
                            this.isDrug = true;
                            if (nh4.K() && (parent2 = getParent()) != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                    float x = getX() + f2;
                    float y = getY() + f3;
                    float width = this.mRootMeasuredWidth - getWidth();
                    float height = this.mRootMeasuredHeight - getHeight();
                    if (x < 0.0f) {
                        x = 0.0f;
                    } else if (x > width) {
                        x = width;
                    }
                    if (y >= 0.0f) {
                        if (y > height) {
                            f = height;
                        } else {
                            f = y;
                        }
                    }
                    sY = f;
                    setX(x);
                    setY(f);
                    this.mLastRawX = rawX;
                    this.mLastRawY = rawY;
                }
            }
        } else {
            r7e r7eVar3 = this.mIUserTaskEventListener;
            if (r7eVar3 != null) {
                r7eVar3.a("com.taobao.taolive.room.disable_updown_switch", "");
                this.mIUserTaskEventListener.a(FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH, "");
            }
            this.isDrug = false;
            this.mLastRawX = rawX;
            this.mLastRawY = rawY;
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                int[] iArr = new int[2];
                viewGroup.getLocationInWindow(iArr);
                this.mRootMeasuredHeight = viewGroup.getMeasuredHeight();
                this.mRootMeasuredWidth = viewGroup.getMeasuredWidth();
                this.mRootTopY = iArr[1];
            }
        }
        if (this.isDrug || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setIUserTaskEntryClickListener(p7e p7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f1c4e7", new Object[]{this, p7eVar});
        } else {
            this.mIUserTaskEntryClickListener = p7eVar;
        }
    }

    public void setIUserTaskEventListener(r7e r7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9e047b", new Object[]{this, r7eVar});
        } else {
            this.mIUserTaskEventListener = r7eVar;
        }
    }

    public void setIUserTaskPosChanged(t7e t7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955dcfa7", new Object[]{this, t7eVar});
        } else {
            this.mIUserTaskPosChanged = t7eVar;
        }
    }

    public FloatingUserTaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingUserTaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isDrug = false;
        this.mRootMeasuredWidth = 0;
        this.mRootMeasuredHeight = 0;
        this.mRootTopY = 0;
        setClickable(true);
    }
}
