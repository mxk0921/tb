package com.taobao.taolive.movehighlight.view;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.cba;
import tb.cv1;
import tb.dxa;
import tb.gu3;
import tb.iw0;
import tb.qoc;
import tb.qvs;
import tb.t2o;
import tb.up6;
import tb.uwa;
import tb.ux9;
import tb.v2s;
import tb.vx9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PassEventViewPagerHighlight extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean clearClick;
    private float lastX;
    private View mBackView;
    private boolean mCanScroll;
    private gu3 mClickUtil;
    private ux9 mFrameContext;
    private final Handler mHandler;
    private boolean mHasLongClick;
    private boolean mIsScreenEdge;
    private final Runnable mOnLongClickRunnable;
    private qoc mOnViewPagerLongClickListener;
    private float mTouchX;
    private float mTouchY;
    public double screenHeight;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            PassEventViewPagerHighlight.access$002(PassEventViewPagerHighlight.this, true);
            if (PassEventViewPagerHighlight.access$100(PassEventViewPagerHighlight.this) != null) {
                PassEventViewPagerHighlight.this.requestDisallowInterceptTouchEvent(true);
                qoc access$100 = PassEventViewPagerHighlight.access$100(PassEventViewPagerHighlight.this);
                PassEventViewPagerHighlight passEventViewPagerHighlight = PassEventViewPagerHighlight.this;
                access$100.a(passEventViewPagerHighlight, PassEventViewPagerHighlight.access$200(passEventViewPagerHighlight));
            }
        }
    }

    static {
        t2o.a(779092730);
    }

    public PassEventViewPagerHighlight(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean access$002(PassEventViewPagerHighlight passEventViewPagerHighlight, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3587ea5", new Object[]{passEventViewPagerHighlight, new Boolean(z)})).booleanValue();
        }
        passEventViewPagerHighlight.mHasLongClick = z;
        return z;
    }

    public static /* synthetic */ qoc access$100(PassEventViewPagerHighlight passEventViewPagerHighlight) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoc) ipChange.ipc$dispatch("42d98a68", new Object[]{passEventViewPagerHighlight});
        }
        return passEventViewPagerHighlight.mOnViewPagerLongClickListener;
    }

    public static /* synthetic */ boolean access$200(PassEventViewPagerHighlight passEventViewPagerHighlight) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158f17", new Object[]{passEventViewPagerHighlight})).booleanValue();
        }
        return passEventViewPagerHighlight.mIsScreenEdge;
    }

    private void checkCleanScreenOptimize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65691183", new Object[]{this, new Boolean(z)});
            return;
        }
        gu3 gu3Var = this.mClickUtil;
        if (gu3Var == null || z) {
            gu3Var.i(0);
            this.mClickUtil.h(0);
            return;
        }
        int a2 = iw0.a(getContext(), 211.0f);
        int a3 = iw0.a(getContext(), 100.0f);
        this.mClickUtil.i(a2);
        this.mClickUtil.h(a3);
    }

    public static /* synthetic */ Object ipc$super(PassEventViewPagerHighlight passEventViewPagerHighlight, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1577577649) {
            super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        } else {
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/movehighlight/view/PassEventViewPagerHighlight");
        }
    }

    private void longClickOnTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0f1dc2", new Object[]{this, motionEvent});
        } else if (motionEvent != null) {
            int x = (int) motionEvent.getX();
            int g = iw0.g();
            if (x >= 188 && x <= g - 188) {
                z = false;
            }
            this.mIsScreenEdge = z;
            this.mHandler.postDelayed(this.mOnLongClickRunnable, 800L);
        }
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

    private void procSlidingClosePage(int i, int i2) {
        cba cbaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec1ad76", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Math.abs(i) - Math.abs(i2) > 5) {
            int F0 = qvs.F0();
            if (F0 < 50) {
                F0 = 50;
            }
            if ((getContext() instanceof Activity) && i > F0 && getCurrentItem() == 0) {
                VideoInfo c0 = up6.c0(this.mFrameContext);
                dxa b = dxa.b(this.mFrameContext);
                if (c0 == null || c0.status != 0 || !uwa.D() || up6.Y(this.mFrameContext) != 0) {
                    if (b.f() != null) {
                        b.f().d(this.mFrameContext, null);
                    }
                } else if (b.f() != null) {
                    cv1 f = vx9.f(this.mFrameContext);
                    String str = "timemoveReturn";
                    if ((f instanceof cba) && uwa.p()) {
                        if (!TextUtils.isEmpty(((cba) f).F)) {
                            str = "timemoveReturn." + cbaVar.F;
                        }
                    }
                    b.f().j(this.mFrameContext, str);
                }
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
        if (this.mCanScroll && !up6.l0(this.mFrameContext) && v2s.o().I("horizontalScroll")) {
            try {
                this.clearClick = false;
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        gu3 gu3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!v2s.o().I("horizontalScroll")) {
            return false;
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.lastX = motionEvent.getX();
            this.mTouchX = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.mTouchY = y2;
            gu3 gu3Var2 = this.mClickUtil;
            if (gu3Var2 != null) {
                gu3Var2.j(this.mTouchX, y2);
            }
            longClickOnTouchEvent(motionEvent);
        } else if (action == 1 || action == 3) {
            if (y < this.screenHeight && uwa.o()) {
                procSlidingClosePage((int) (x - this.mTouchX), (int) (y - this.mTouchY));
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
                if (view2.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && (gu3Var = this.mClickUtil) != null) {
                    if (this.clearClick) {
                        this.clearClick = false;
                    } else {
                        gu3Var.k(motionEvent.getX(), motionEvent.getY());
                    }
                }
                return super.onTouchEvent(motionEvent);
            } else if (!view2.onTouchEvent(motionEvent)) {
                return super.onTouchEvent(motionEvent);
            } else {
                return true;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
        } else {
            this.mFrameContext = ux9Var;
        }
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

    public void setOnViewPagerLongClickListener(qoc qocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb795550", new Object[]{this, qocVar});
        } else {
            this.mOnViewPagerLongClickListener = qocVar;
        }
    }

    public PassEventViewPagerHighlight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCanScroll = true;
        this.lastX = -1.0f;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mHasLongClick = false;
        this.mOnLongClickRunnable = new a();
        this.clearClick = false;
        this.screenHeight = iw0.e(getContext()) * uwa.I();
    }
}
