package com.etao.feimagesearch.result;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.agh;
import tb.d1a;
import tb.g1a;
import tb.hnd;
import tb.hpk;
import tb.l1k;
import tb.mzu;
import tb.p73;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ScrollInterceptView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ANIM = 2;
    public static final int STATE_DOWN = 0;
    public static final int STATE_DRAG = 1;
    public static final int STATE_FULL_DOWN = -1;
    public static final int STATE_HALF = 4;
    public static final int STATE_UP = 3;
    private boolean dropTouch = false;
    private hnd mScrollLogic;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        boolean a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a();

        void l(int i, int i2);

        void s(int i, int i2, int i3, int i4);
    }

    static {
        t2o.a(481297433);
    }

    public ScrollInterceptView(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        l1k l1kVar = new l1k();
        this.mScrollLogic = l1kVar;
        l1kVar.B(this);
    }

    public static /* synthetic */ Object ipc$super(ScrollInterceptView scrollInterceptView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/result/ScrollInterceptView");
        }
    }

    public void disappearAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b816db", new Object[]{this});
        } else {
            ((l1k) this.mScrollLogic).j(getHeight());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.dropTouch) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.dropTouch = false;
            }
            return true;
        }
        ((l1k) this.mScrollLogic).g(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void flyChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d6fd18", new Object[]{this, new Integer(i)});
        } else {
            ((l1k) this.mScrollLogic).j(i);
        }
    }

    public int getChildState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cab8fc5", new Object[]{this})).intValue();
        }
        return ((l1k) this.mScrollLogic).o();
    }

    public int getDownStateOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba889ec6", new Object[]{this})).intValue();
        }
        return ((l1k) this.mScrollLogic).m();
    }

    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        return ((l1k) this.mScrollLogic).q();
    }

    public void moveChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26168f76", new Object[]{this, new Integer(i)});
        } else {
            ((l1k) this.mScrollLogic).s(i, true);
        }
    }

    public void movePageToAssignPageLocationRatioWithAnim(float f, long j, hpk hpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69163639", new Object[]{this, new Float(f), new Long(j), hpkVar});
        } else {
            ((l1k) this.mScrollLogic).t(f, j, hpkVar);
        }
    }

    public void notifyScrollChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3cd04d", new Object[]{this});
        } else {
            onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return ((l1k) this.mScrollLogic).w(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return ((l1k) this.mScrollLogic).x(motionEvent);
    }

    public void setAutoScrollInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f6eef9", new Object[]{this, new Integer(i)});
        } else {
            ((l1k) this.mScrollLogic).z(i);
        }
    }

    public void setContentUpStateOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc47e42a", new Object[]{this, new Integer(i)});
        } else {
            ((l1k) this.mScrollLogic).L(i);
        }
    }

    public void setDispatchEventListener(g1a<MotionEvent, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54edd1f", new Object[]{this, g1aVar});
        } else {
            ((l1k) this.mScrollLogic).K(g1aVar);
        }
    }

    public void setDownContentHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2597ba0", new Object[]{this, new Integer(i)});
        } else {
            ((l1k) this.mScrollLogic).C(i);
        }
    }

    public void setHeaderHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8bd86", new Object[]{this, new Integer(i)});
        } else {
            ((l1k) this.mScrollLogic).D(i);
        }
    }

    public void setOffsetCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7034b", new Object[]{this, bVar});
        } else {
            ((l1k) this.mScrollLogic).G(bVar);
        }
    }

    public void setOutOfChildAreaTouchUpListener(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e8e5d96", new Object[]{this, d1aVar});
        } else {
            ((l1k) this.mScrollLogic).H(d1aVar);
        }
    }

    public void setRollingThresholdOptionCallback(u1a<Boolean, Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833403ce", new Object[]{this, u1aVar});
        } else {
            ((l1k) this.mScrollLogic).I(u1aVar);
        }
    }

    public void setScrollTriggerListener(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b978b02b", new Object[]{this, d1aVar});
        } else {
            ((l1k) this.mScrollLogic).J(d1aVar);
        }
    }

    public void setStateProvider(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1505430", new Object[]{this, aVar});
        } else {
            ((l1k) this.mScrollLogic).A(aVar);
        }
    }

    public void setViewLockUp(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ba2699", new Object[]{this, bool});
        } else {
            ((l1k) this.mScrollLogic).E(bool.booleanValue());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            mzu.n(p73.f25916a, "onLayoutCrash", 19999, "exceptionType", e.getClass().getCanonicalName(), "triggerType", "onLayout");
            agh.d("ScrollInterceptView", "onLayoutCrash", e);
        }
        super.onLayout(z, i, i2, i3, i4);
        if (((l1k) this.mScrollLogic).o() == -1) {
            int i5 = i4 - i2;
            ViewCompat.offsetTopAndBottom(getChildAt(0), i5);
            onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
            ((l1k) this.mScrollLogic).F(i5);
            return;
        }
        ViewCompat.offsetTopAndBottom(getChildAt(0), ((l1k) this.mScrollLogic).n());
        onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
    }

    public ScrollInterceptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ScrollInterceptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
