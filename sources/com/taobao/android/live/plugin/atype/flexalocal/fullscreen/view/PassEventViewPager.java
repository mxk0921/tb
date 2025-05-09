package com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import tb.azd;
import tb.czd;
import tb.gu3;
import tb.hw0;
import tb.ibt;
import tb.nh4;
import tb.o3s;
import tb.qoc;
import tb.qvs;
import tb.rbt;
import tb.s4g;
import tb.sjr;
import tb.t2o;
import tb.up6;
import tb.ux9;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PassEventViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean enableClose;
    private boolean enableLongClick;
    private boolean interceptUpAction;
    private View mBackView;
    private boolean mCanScroll;
    private gu3 mClickUtil;
    private ux9 mFrameContext;
    private final Handler mHandler;
    private boolean mHasLongClick;
    private boolean mIsScreenEdge;
    private View.OnLongClickListener mOnLongClickListener;
    private final Runnable mOnLongClickRunnable;
    private qoc mOnViewPagerLongClickListener;
    private final int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private boolean revertClickPadding;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            PassEventViewPager.access$002(PassEventViewPager.this, true);
            if (PassEventViewPager.access$100(PassEventViewPager.this) != null) {
                PassEventViewPager.this.requestDisallowInterceptTouchEvent(true);
                PassEventViewPager.access$100(PassEventViewPager.this).onLongClick(PassEventViewPager.this);
            }
            if (PassEventViewPager.access$200(PassEventViewPager.this) != null) {
                PassEventViewPager.this.requestDisallowInterceptTouchEvent(true);
                qoc access$200 = PassEventViewPager.access$200(PassEventViewPager.this);
                PassEventViewPager passEventViewPager = PassEventViewPager.this;
                access$200.a(passEventViewPager, PassEventViewPager.access$300(passEventViewPager));
            }
        }
    }

    static {
        t2o.a(295698830);
    }

    public PassEventViewPager(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean access$002(PassEventViewPager passEventViewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f78ff767", new Object[]{passEventViewPager, new Boolean(z)})).booleanValue();
        }
        passEventViewPager.mHasLongClick = z;
        return z;
    }

    public static /* synthetic */ View.OnLongClickListener access$100(PassEventViewPager passEventViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLongClickListener) ipChange.ipc$dispatch("a45cd855", new Object[]{passEventViewPager});
        }
        return passEventViewPager.mOnLongClickListener;
    }

    public static /* synthetic */ qoc access$200(PassEventViewPager passEventViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoc) ipChange.ipc$dispatch("b06d482b", new Object[]{passEventViewPager});
        }
        return passEventViewPager.mOnViewPagerLongClickListener;
    }

    public static /* synthetic */ boolean access$300(PassEventViewPager passEventViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90ae7dd6", new Object[]{passEventViewPager})).booleanValue();
        }
        return passEventViewPager.mIsScreenEdge;
    }

    private void checkCleanScreenOptimize(boolean z) {
        ATaoLiveOpenEntity A;
        czd czdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65691183", new Object[]{this, new Boolean(z)});
            return;
        }
        gu3 gu3Var = this.mClickUtil;
        if (gu3Var != null && !z && !this.revertClickPadding) {
            int b = hw0.b(getContext(), 211.0f);
            int b2 = hw0.b(getContext(), 100.0f);
            ux9 ux9Var = this.mFrameContext;
            if (!(ux9Var == null || (A = ux9Var.A()) == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null)) {
                b2 = (int) (((rbt) A.uiCompontent).b().l().floatValue() + hw0.b(getContext(), 100.0f));
            }
            this.mClickUtil.i(b);
            this.mClickUtil.h(b2);
        } else if (gu3Var != null) {
            gu3Var.i(0);
            this.mClickUtil.h(0);
        }
    }

    private void interceptUpAction(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78280c2f", new Object[]{this, motionEvent});
        } else if (!nh4.f0()) {
        } else {
            if (motionEvent.getAction() == 0) {
                this.interceptUpAction = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.interceptUpAction = false;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(PassEventViewPager passEventViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/view/PassEventViewPager");
        }
    }

    private void longClickOnTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0f1dc2", new Object[]{this, motionEvent});
            return;
        }
        int x = (int) motionEvent.getX();
        int i = hw0.i();
        if (x >= 188 && x <= i - 188) {
            z = false;
        }
        this.mIsScreenEdge = z;
        postDelayedLongPressCallback();
    }

    private void onLongPressCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4423029", new Object[]{this});
            return;
        }
        removeLongPressCallback();
        if (this.mOnViewPagerLongClickListener != null) {
            requestDisallowInterceptTouchEvent(false);
            if (this.mHasLongClick) {
                this.mOnViewPagerLongClickListener.c();
            }
        }
        this.mHasLongClick = false;
    }

    private void postDelayedLongPressCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec6d391", new Object[]{this});
        } else if (this.enableLongClick) {
            this.mHandler.postDelayed(this.mOnLongClickRunnable, 800L);
        }
    }

    private void procSlidingClosePage(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec1ad76", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.enableClose && Math.abs(i) - Math.abs(i2) > this.mTouchSlop) {
            int F0 = qvs.F0();
            if (F0 < 200) {
                F0 = 200;
            }
            if ((getContext() instanceof Activity) && i > F0 && getCurrentItem() == 0) {
                sjr.g().c("com.taobao.taolive.room.sliding_close_page", null, this.mFrameContext.C());
            }
        }
    }

    private void removeLongPressCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a2f8ef", new Object[]{this});
            return;
        }
        Runnable runnable = this.mOnLongClickRunnable;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mCanScroll && !up6.l0(this.mFrameContext) && !s4g.f27790a && v2s.o().I("horizontalScroll")) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                o3s.b("PassEventViewPager", e.getMessage());
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        gu3 gu3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mCanScroll && !s4g.f27790a && v2s.o().I("horizontalScroll")) {
            int action = motionEvent.getAction();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (action == 0) {
                removeLongPressCallback();
                this.mTouchX = motionEvent.getX();
                float y2 = motionEvent.getY();
                this.mTouchY = y2;
                gu3 gu3Var2 = this.mClickUtil;
                if (gu3Var2 != null) {
                    gu3Var2.j(this.mTouchX, y2);
                }
                longClickOnTouchEvent(motionEvent);
            } else if (action == 1 || action == 3) {
                if (!nh4.f0() || !this.interceptUpAction) {
                    procSlidingClosePage((int) (x - this.mTouchX), (int) (y - this.mTouchY));
                    removeLongPressCallback();
                }
                onLongPressCancel();
            }
            try {
                View view = this.mBackView;
                if (view == null || view.getVisibility() != 0) {
                    return super.onTouchEvent(motionEvent);
                }
                View view2 = this.mBackView;
                if (view2 instanceof ViewGroup) {
                    if (!view2.dispatchTouchEvent(motionEvent)) {
                        if (motionEvent.getAction() == 1 && (gu3Var = this.mClickUtil) != null) {
                            gu3Var.k(motionEvent.getX(), motionEvent.getY());
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                    interceptUpAction(motionEvent);
                    return true;
                } else if (!view2.onTouchEvent(motionEvent)) {
                    return super.onTouchEvent(motionEvent);
                } else {
                    interceptUpAction(motionEvent);
                    return true;
                }
            } catch (IllegalArgumentException e) {
                o3s.b("PassEventViewPager", e.getMessage());
            }
        }
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mCanScroll) {
            super.scrollTo(i, i2);
        }
    }

    public void setBackView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84967d", new Object[]{this, view});
        } else {
            this.mBackView = view;
        }
    }

    public void setCanScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fe6b92", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanScroll = z;
        }
    }

    public void setFrameContext(ux9 ux9Var) {
        azd azdVar;
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
            return;
        }
        this.mFrameContext = ux9Var;
        if (ux9Var != null) {
            ATaoLiveOpenEntity A = ux9Var.A();
            if (!(A == null || (str = A.bizCode) == null || (!str.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString()) && !A.bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.toString())))) {
                z = true;
            }
            if (!(A == null || (azdVar = A.abilityCompontent) == null || !((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap))) {
                this.revertClickPadding = true;
            }
        }
        this.enableLongClick = !z;
        this.enableClose = !z;
    }

    public void setOnClearClickListener(gu3.c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6f274a", new Object[]{this, cVar, new Boolean(z)});
            return;
        }
        this.mClickUtil = new gu3(getContext(), cVar);
        checkCleanScreenOptimize(z);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.mOnLongClickListener = onLongClickListener;
        }
    }

    public void setOnViewPagerLongClickListener(qoc qocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb795550", new Object[]{this, qocVar});
        } else {
            this.mOnViewPagerLongClickListener = qocVar;
        }
    }

    public PassEventViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCanScroll = true;
        this.enableLongClick = true;
        this.enableClose = true;
        this.interceptUpAction = false;
        this.revertClickPadding = false;
        this.mHasLongClick = false;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mOnLongClickRunnable = new a();
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void setOnClearClickListener(gu3.d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59d9c8d", new Object[]{this, dVar, new Boolean(z)});
            return;
        }
        this.mClickUtil = new gu3(getContext(), dVar);
        checkCleanScreenOptimize(z);
    }
}
