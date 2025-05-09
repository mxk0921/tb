package com.taobao.android.dinamic_v35.view;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic_v35.view.DXScrollableViewImpl;
import tb.k56;
import tb.knd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends DXScrollableViewImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int B = 0;

    static {
        t2o.a(444596452);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/view/DXVerticalScrollableViewImpl");
    }

    @Override // com.taobao.android.dinamic_v35.view.DXScrollableViewImpl
    public void F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684e10b8", new Object[]{this, new Integer(i)});
        } else if (this.m) {
            ((knd) this.r).smoothScrollTo(0, i);
        } else {
            this.r.scrollTo(0, i);
        }
    }

    @Override // com.taobao.android.dinamic_v35.view.DXScrollableViewImpl
    public void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.k) {
            this.r.scrollTo(0, this.q.get(i).intValue());
            this.p = i;
            DXScrollableViewImpl.f fVar = this.g;
            if (fVar != null) {
                ((k56.a.c) fVar).a(i);
            }
        }
    }

    @Override // com.taobao.android.dinamic_v35.view.DXScrollableViewImpl
    public void i() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27151c1", new Object[]{this});
        } else if (this.f != null) {
            int scrollY = this.r.getScrollY();
            int height = this.r.getHeight();
            for (int i = 0; i < this.j.getChildCount(); i++) {
                View childAt = this.j.getChildAt(i);
                int top = childAt.getTop() - scrollY;
                int bottom = childAt.getBottom() - scrollY;
                if (top >= height || bottom <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                boolean[] zArr = this.t;
                if (z != zArr[i]) {
                    zArr[i] = z;
                    if (z) {
                        ((k56.a.b) this.f).b(childAt, i);
                    } else {
                        ((k56.a.b) this.f).a(childAt, i);
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.dinamic_v35.view.DXScrollableViewImpl
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341e1bbb", new Object[]{this});
            return;
        }
        DXNanoScrollViewContainer dXNanoScrollViewContainer = this.j;
        if (dXNanoScrollViewContainer != null) {
            this.k = dXNanoScrollViewContainer.getChildCount();
            this.q.clear();
            for (int i = 0; i < this.k; i++) {
                if (this.j.getChildAt(i).getMeasuredHeight() > 0) {
                    this.q.add(Integer.valueOf(this.j.getChildAt(i).getTop()));
                }
            }
        }
    }

    @Override // com.taobao.android.dinamic_v35.view.DXScrollableViewImpl
    public boolean t(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e07fef83", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.w) {
            return true;
        }
        if (this.b == null) {
            this.b = VelocityTracker.obtain();
        }
        this.b.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.B = (int) motionEvent.getY();
        } else if (action == 1 || action == 3) {
            this.b.computeCurrentVelocity(1000);
            int yVelocity = (int) this.b.getYVelocity();
            if (Math.abs(yVelocity) > 400) {
                if (yVelocity < 0) {
                    V(true);
                } else {
                    W(true);
                }
            } else if (Math.abs(motionEvent.getY() - this.B) <= this.r.getHeight() / 3.0f) {
                U(true);
            } else if (motionEvent.getY() - this.B > 0.0f) {
                W(true);
            } else {
                V(true);
            }
            this.b.clear();
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.dinamic_v35.view.DXScrollableViewImpl
    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d064334b", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
