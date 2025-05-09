package com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.WeexFrameLayout;
import tb.ied;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WeexContainer extends FrameLayout implements ied {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WeexContainer";
    private String mWeexConsumeState = WeexFrameLayout.WEEX_STATE_NOT_EXIST;

    static {
        t2o.a(502268080);
        t2o.a(503317462);
    }

    public WeexContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(WeexContainer weexContainer, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/secondpage/biz/weexadapter/WeexContainer");
    }

    @Override // tb.ied
    public boolean canPullIntercept(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcc734e2", new Object[]{this, str})).booleanValue();
        }
        return WeexFrameLayout.WEEX_STATE_CONSUME.equals(this.mWeexConsumeState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mWeexConsumeState = WeexFrameLayout.WEEX_STATE_CONSUME;
        } else if (action == 1 || action == 3) {
            this.mWeexConsumeState = WeexFrameLayout.WEEX_STATE_NOT_EXIST;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setWeexConsume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119aa4ca", new Object[]{this, str});
            return;
        }
        this.mWeexConsumeState = str;
        tfs.e(TAG, "setWeexConsume:" + str);
    }

    public WeexContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeexContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
