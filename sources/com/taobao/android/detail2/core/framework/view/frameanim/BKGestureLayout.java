package com.taobao.android.detail2.core.framework.view.frameanim;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iap;
import tb.k0z;
import tb.t2o;
import tb.xfb;
import tb.zpz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BKGestureLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "无极缩放BKGestureLayout";
    private zpz animLogHandler;
    private ViewGroup gestureView;
    private iap mAnimLayoutInterface;
    private xfb mAnimPageContainer;

    static {
        t2o.a(352321985);
    }

    public BKGestureLayout(Context context) {
        super(context);
    }

    private void eWithTlog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86c38ad6", new Object[]{this, str, str2});
            return;
        }
        zpz animLogHandler = getAnimLogHandler();
        String b = getAnimLogHandler().b();
        animLogHandler.a(b, str + ": " + str2, null);
    }

    public static /* synthetic */ Object ipc$super(BKGestureLayout bKGestureLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/BKGestureLayout");
    }

    public zpz getAnimLogHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpz) ipChange.ipc$dispatch("6c41a345", new Object[]{this});
        }
        return k0z.d(this.animLogHandler);
    }

    public boolean performCloseAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd3f038", new Object[]{this})).booleanValue();
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup instanceof BKDragLayout) {
            return ((BKDragLayout) viewGroup).performCloseAnimation();
        }
        return false;
    }

    public void setAnimLayoutInterface(iap iapVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c755d8", new Object[]{this, iapVar});
        } else {
            this.mAnimLayoutInterface = iapVar;
        }
    }

    public void setAnimLogHandler(zpz zpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67977d23", new Object[]{this, zpzVar});
        } else {
            this.animLogHandler = zpzVar;
        }
    }

    public void setAnimPageContainer(xfb xfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aaa65a8", new Object[]{this, xfbVar});
        } else {
            this.mAnimPageContainer = xfbVar;
        }
    }

    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup != null) {
            viewGroup.addView(view);
        } else {
            addView(view);
        }
    }

    public void setGestureLayoutBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22d8e1d", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup viewGroup = this.gestureView;
        if (viewGroup instanceof BKDragLayout) {
            ((BKDragLayout) viewGroup).setShadowViewBackgroundColor(i);
        } else {
            eWithTlog(TAG, "Error:setGestureLayoutBackground:gestureView未初始化。");
        }
    }

    public void setGestureSupportType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e29e29", new Object[]{this});
        } else if (this.gestureView == null) {
            BKDragLayout bKDragLayout = new BKDragLayout(getContext());
            bKDragLayout.setAnimPageContainer(this.mAnimPageContainer);
            bKDragLayout.setAnimLayoutInterface(this.mAnimLayoutInterface);
            bKDragLayout.setAnimLogHandler(this.animLogHandler);
            addView(bKDragLayout);
            this.gestureView = bKDragLayout;
        } else {
            eWithTlog(TAG, "禁止反复初始化 gestureView.");
        }
    }

    public BKGestureLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BKGestureLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
