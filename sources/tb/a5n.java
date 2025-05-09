package tb;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a5n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f15554a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public int g = -1;
    public final int h = ViewConfiguration.get(p91.a()).getScaledTouchSlop();
    public final float i = pr9.c(p91.a(), 40);
    public final View j;

    static {
        t2o.a(468714168);
    }

    public a5n(View view) {
        this.j = view;
    }

    public final boolean a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt != null && (i5 = i2 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() * childAt.getScaleX() && (i6 = i3 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom()) {
                    i4 = childCount;
                    if (a(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                        return true;
                    }
                } else {
                    i4 = childCount;
                }
                childCount = i4 - 1;
            }
        } else if (view instanceof SeekBar) {
            return true;
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public final void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3cc5d3", new Object[]{this, new Float(f)});
        } else if ((-f) > this.i) {
            c();
        }
    }

    public void c() {
        throw null;
    }

    public boolean d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            e(motionEvent);
                        }
                    }
                } else if (g(this.j) || this.f) {
                    return false;
                } else {
                    if (this.e) {
                        return true;
                    }
                    int i = this.g;
                    if (i == -1) {
                        ir9.b("PullLeftHelper", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    float f = x - this.f15554a;
                    if (f == 0.0f || !a(this.j, false, (int) f, (int) x, (int) y)) {
                        h(rawX, rawY);
                    } else {
                        this.f15554a = x;
                        this.f = true;
                        return false;
                    }
                }
            }
            this.e = false;
            this.f = false;
            this.g = -1;
        } else if (g(this.j)) {
            return false;
        } else {
            View view = this.j;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).requestDisallowInterceptTouchEvent(false);
            }
            int pointerId = motionEvent.getPointerId(0);
            this.g = pointerId;
            this.e = false;
            this.f = false;
            if (motionEvent.findPointerIndex(pointerId) < 0) {
                return false;
            }
            this.c = motionEvent.getRawX();
            this.d = motionEvent.getRawY();
            this.f15554a = motionEvent.getX();
            motionEvent.getY();
        }
        return this.e;
    }

    public final void e(MotionEvent motionEvent) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24b537f", new Object[]{this, motionEvent});
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.g) {
            if (actionIndex != 0) {
                i = 0;
            }
            this.g = motionEvent.getPointerId(i);
        }
    }

    public boolean f(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = motionEvent.getPointerId(0);
            this.e = false;
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        ir9.b("PullLeftHelper", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.g = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    e(motionEvent);
                }
            } else if (motionEvent.findPointerIndex(this.g) < 0) {
                ir9.b("PullLeftHelper", "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            } else {
                h(motionEvent.getRawX(), motionEvent.getRawY());
            }
        } else if (motionEvent.findPointerIndex(this.g) < 0) {
            ir9.b("PullLeftHelper", "Got ACTION_UP event but don't have an active pointer id.");
            return false;
        } else {
            if (this.e) {
                this.e = false;
                b((motionEvent.getRawX() - this.b) * 1.0f);
            }
            this.g = -1;
            return false;
        }
        return true;
    }

    public final boolean g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
        }
        if ((view instanceof ied) && ((ied) view).canPullIntercept(ied.PULL_HORIZONTAL_DRAG)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (g(childAt)) {
                        return true;
                    }
                    if (childAt instanceof ied) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final void h(float f, float f2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcd19d8", new Object[]{this, new Float(f), new Float(f2)});
        } else if (!this.e) {
            float f3 = f - this.c;
            if (Math.abs(f3) * 0.5f > Math.abs(f2 - this.d)) {
                z = true;
            }
            int i = this.h;
            if ((-f3) > i && z) {
                this.b = this.c + i;
                this.e = true;
            }
        }
    }
}
