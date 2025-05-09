package com.taobao.avplayer.component.h5;

import android.content.Context;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.core.view.DWPenetrateFrameLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWWVUCWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DWComponent mDWComponent;
    private DWContext mDWContext;
    private DWPenetrateFrameLayout mDWPenetrateFrameLayout;

    static {
        t2o.a(451936316);
    }

    public DWWVUCWebView(Context context, DWComponent dWComponent, DWPenetrateFrameLayout dWPenetrateFrameLayout) {
        super(context);
        this.mDWComponent = dWComponent;
        this.mDWPenetrateFrameLayout = dWPenetrateFrameLayout;
    }

    public static /* synthetic */ Object ipc$super(DWWVUCWebView dWWVUCWebView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/component/h5/DWWVUCWebView");
    }

    public DWComponent getDWComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWComponent) ipChange.ipc$dispatch("3b1d2e5c", new Object[]{this});
        }
        return this.mDWComponent;
    }

    public DWContext getDWContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("8525c6a8", new Object[]{this});
        }
        return this.mDWContext;
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        DWPenetrateFrameLayout dWPenetrateFrameLayout = this.mDWPenetrateFrameLayout;
        if (dWPenetrateFrameLayout != null) {
            ViewParent parent = dWPenetrateFrameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mDWPenetrateFrameLayout);
                this.mDWPenetrateFrameLayout.destroy();
                this.mDWPenetrateFrameLayout = null;
                removeAllViews();
                destroy();
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setDWContext(DWContext dWContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9efb6d8a", new Object[]{this, dWContext});
        } else {
            this.mDWContext = dWContext;
        }
    }

    public void setPenetrateAlpha(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea685b69", new Object[]{this, str});
            return;
        }
        try {
            this.mDWPenetrateFrameLayout.setPenetrateAlpha((int) (Float.parseFloat(str) * 255.0f));
        } catch (Exception unused) {
        }
    }
}
