package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqp;
import tb.kew;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class EnhancedViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean canScroll = true;
    private boolean canDispatchToChild = true;
    private boolean enableViewPagerAllowDoNotDispatchToChild = aqp.Companion.x0();

    static {
        t2o.a(766510088);
    }

    public EnhancedViewPager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(EnhancedViewPager enhancedViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/view/extend/EnhancedViewPager");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.enableViewPagerAllowDoNotDispatchToChild || this.canDispatchToChild) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent != null && kew.E(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean getCanDispatchToChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e44bf798", new Object[]{this})).booleanValue();
        }
        return this.canDispatchToChild;
    }

    public final boolean getCanScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5952d112", new Object[]{this})).booleanValue();
        }
        return this.canScroll;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.canScroll) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setCanDispatchToChild(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb639334", new Object[]{this, new Boolean(z)});
        } else {
            this.canDispatchToChild = z;
        }
    }

    public final void setCanScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fe6b92", new Object[]{this, new Boolean(z)});
        } else {
            this.canScroll = z;
        }
    }

    public EnhancedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
