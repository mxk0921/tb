package com.taobao.android.layoutmanager.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.WeexFrameLayout;
import tb.sj4;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WeexFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String WEEX_STATE_CONSUME = sj4.WEEX_STATE_CONSUME;
    public static String WEEX_STATE_NOT_CONSUME = sj4.WEEX_STATE_NOT_CONSUME;
    public static String WEEX_STATE_NOT_EXIST = sj4.WEEX_STATE_NOT_EXIST;
    private boolean hasUpOrCancel;
    private String mWeexConsumeState = WEEX_STATE_NOT_EXIST;
    private ViewParent viewParent;

    public WeexFrameLayout(Context context) {
        super(context);
    }

    private ViewParent findViewParentIfNeeds(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("307f684b", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewPager) {
            return parent;
        }
        if (parent instanceof View) {
            return findViewParentIfNeeds((View) parent);
        }
        return parent;
    }

    public static /* synthetic */ Object ipc$super(WeexFrameLayout weexFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/WeexFrameLayout");
    }

    public boolean beenConsume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa5a2bb", new Object[]{this})).booleanValue();
        }
        return WEEX_STATE_CONSUME.equals(this.mWeexConsumeState);
    }

    public void setWeexConsume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119aa4ca", new Object[]{this, str});
        } else if (!this.hasUpOrCancel) {
            this.mWeexConsumeState = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onInterceptTouchEvent$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c58dd4", new Object[]{this});
        } else if ((this.viewParent instanceof ViewPager) && !beenConsume()) {
            tfs.c("WeexComponent", "onInterceptTouchEvent allowIntercept");
            this.viewParent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public WeexFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        this.viewParent = findViewParentIfNeeds(this);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hasUpOrCancel = false;
            tfs.c("WeexComponent", "onInterceptTouchEvent ACTION_DOWN");
            if (this.viewParent instanceof ViewPager) {
                tfs.c("WeexComponent", "onInterceptTouchEvent disallowIntercept");
                this.viewParent.requestDisallowInterceptTouchEvent(true);
            }
            if (this.viewParent instanceof ViewPager) {
                postDelayed(new Runnable() { // from class: tb.n5x
                    @Override // java.lang.Runnable
                    public final void run() {
                        WeexFrameLayout.this.lambda$onInterceptTouchEvent$0();
                    }
                }, 120L);
            }
        } else if (action == 1) {
            tfs.c("WeexComponent", "onInterceptTouchEvent event: " + motionEvent.getAction());
            setWeexConsume(WEEX_STATE_NOT_EXIST);
            this.hasUpOrCancel = true;
        } else if (action == 3) {
            tfs.c("WeexComponent", "onInterceptTouchEvent event: " + motionEvent.getAction());
            this.hasUpOrCancel = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    static {
        t2o.a(502268025);
    }

    public WeexFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
