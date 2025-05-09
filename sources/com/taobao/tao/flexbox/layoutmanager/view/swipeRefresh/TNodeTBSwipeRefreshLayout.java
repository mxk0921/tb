package com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.akt;
import tb.grj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodeTBSwipeRefreshLayout extends TBSwipeRefreshLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private grj scrollHelper = new grj(this);

    static {
        t2o.a(503317529);
    }

    public TNodeTBSwipeRefreshLayout(Context context) {
        super(context);
        int D2 = akt.D2();
        if (D2 >= 0) {
            this.mTouchSlop = D2;
        }
    }

    public static /* synthetic */ Object ipc$super(TNodeTBSwipeRefreshLayout tNodeTBSwipeRefreshLayout, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/swipeRefresh/TNodeTBSwipeRefreshLayout");
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollHelper.b(motionEvent)) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public TNodeTBSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
