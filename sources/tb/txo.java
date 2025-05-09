package tb;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.FlowLayout.MegaFlowLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class txo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final OverScroller f29021a;
    public VelocityTracker b = VelocityTracker.obtain();
    public int c;
    public boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final ViewGroup h;

    public txo(Context context, MegaFlowLayout megaFlowLayout) {
        this.h = megaFlowLayout;
        this.f29021a = new OverScroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.e = viewConfiguration.getScaledTouchSlop();
        this.f = viewConfiguration.getScaledMaximumFlingVelocity();
        this.g = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.f29021a.computeScrollOffset()) {
            int scrollY = this.h.getScrollY();
            int currY = this.f29021a.getCurrY();
            if (scrollY != currY) {
                ViewGroup viewGroup = this.h;
                viewGroup.scrollTo(viewGroup.getScrollX(), currY);
            }
            ViewCompat.postInvalidateOnAnimation(this.h);
        }
    }

    public boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            this.d = false;
            return false;
        }
        if (actionMasked == 0) {
            this.c = (int) motionEvent.getY();
            this.d = true ^ this.f29021a.isFinished();
            this.b.clear();
            this.b.addMovement(motionEvent);
        } else if (actionMasked == 2) {
            int y = (int) motionEvent.getY();
            if (Math.abs(y - this.c) > this.e) {
                this.d = true;
                this.c = y;
                this.b.addMovement(motionEvent);
                return true;
            }
        }
        return this.d;
    }

    public boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        this.b.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (!this.f29021a.isFinished()) {
                this.f29021a.abortAnimation();
            }
            this.c = (int) motionEvent.getY();
        } else if (actionMasked == 1) {
            if (this.d) {
                this.b.computeCurrentVelocity(1000, this.f);
                float yVelocity = this.b.getYVelocity();
                if (Math.abs(yVelocity) > this.g) {
                    this.f29021a.fling(this.h.getScrollX(), this.h.getScrollY(), 0, (int) (-yVelocity), 0, 0, 0, 0);
                    ViewCompat.postInvalidateOnAnimation(this.h);
                } else if (this.f29021a.springBack(this.h.getScrollX(), this.h.getScrollY(), 0, 0, 0, 0)) {
                    ViewCompat.postInvalidateOnAnimation(this.h);
                }
                this.d = false;
            }
            this.b.clear();
        } else if (actionMasked == 2) {
            int y = (int) motionEvent.getY();
            int i = this.c - y;
            if (!this.d && Math.abs(i) > this.e) {
                this.d = true;
            }
            if (this.d) {
                this.h.scrollBy(0, i);
                int scrollY = this.h.getScrollY();
                if (scrollY < 0) {
                    ViewGroup viewGroup = this.h;
                    viewGroup.scrollTo(viewGroup.getScrollX(), 0);
                } else if (scrollY > 0) {
                    ViewGroup viewGroup2 = this.h;
                    viewGroup2.scrollTo(viewGroup2.getScrollX(), 0);
                }
            }
            this.c = y;
        } else if (actionMasked == 3) {
            if (this.d) {
                if (this.f29021a.springBack(this.h.getScrollX(), this.h.getScrollY(), 0, 0, 0, 0)) {
                    ViewCompat.postInvalidateOnAnimation(this.h);
                }
                this.d = false;
            }
            this.b.clear();
        }
        return true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.b;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.b = null;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f7d235", new Object[]{this});
        }
    }
}
