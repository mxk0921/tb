package tb;

import android.view.MotionEvent;
import android.view.View;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.config.model.style.StyleModel;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DRAG_MODE_X = "x";
    public static final String DRAG_MODE_Y = "y";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23610a;
    public final String b;
    public int f;
    public int g;
    public final PopRequest m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public boolean c = false;
    public float d = 0.0f;
    public float e = 0.0f;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;

    static {
        t2o.a(625999910);
    }

    public lw7(PopRequest popRequest, boolean z, String str) {
        StyleModel.DragArea dragArea;
        int i;
        int i2;
        int i3;
        StyleModel styleModel;
        int i4 = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.m = popRequest;
        this.f23610a = z;
        this.b = str;
        BaseConfigItem J = a.J(popRequest);
        if (J == null || (styleModel = J.styleConfigs) == null) {
            dragArea = null;
        } else {
            dragArea = styleModel.dragArea;
        }
        if (dragArea != null) {
            i = (int) lyv.d(PopLayer.getReference().getApp(), Float.parseFloat(dragArea.offsetLeft));
        } else {
            i = 0;
        }
        this.n = i;
        if (dragArea != null) {
            i2 = (int) lyv.d(PopLayer.getReference().getApp(), Float.parseFloat(dragArea.offsetRight));
        } else {
            i2 = 0;
        }
        this.o = i2;
        if (dragArea != null) {
            i3 = (int) lyv.d(PopLayer.getReference().getApp(), Float.parseFloat(dragArea.offsetTop));
        } else {
            i3 = 0;
        }
        this.p = i3;
        this.p = i3 + popRequest.g();
        this.q = dragArea != null ? (int) lyv.d(PopLayer.getReference().getApp(), Float.parseFloat(dragArea.offsetBottom)) : i4;
    }

    public void b(View view, boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beecb5f2", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.m != null && this.f23610a && this.l) {
            if ("x".equals(this.b)) {
                view.offsetLeftAndRight(this.f);
            } else if ("y".equals(this.b)) {
                view.offsetTopAndBottom(this.g);
            } else {
                view.offsetLeftAndRight(this.f);
                view.offsetTopAndBottom(this.g);
            }
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce4fdfc", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean a(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2118666", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.m == null || !this.f23610a) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d = motionEvent.getX();
            this.e = motionEvent.getY();
            this.c = false;
            wdm.d("DragHelper.onInterceptTouchEvent.ACTION_DOWN.mLastTouchX=%s.mLastTouchY=%s.", Float.valueOf(this.d), Float.valueOf(this.e));
            return false;
        } else if (actionMasked != 2) {
            return false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = !"x".equals(this.b) ? !(!"y".equals(this.b) ? Math.abs(x - this.d) < 5.0f || Math.abs(y - this.e) < 5.0f : Math.abs(y - this.e) < 5.0f) : Math.abs(x - this.d) >= 5.0f;
            if (z) {
                this.l = true;
            }
            this.c = z;
            wdm.d("DragHelper.onInterceptTouchEvent.ACTION_MOVE.moveX=%s.moveY=%s.moved=%s", Float.valueOf(x), Float.valueOf(y), Boolean.valueOf(z));
            return z;
        }
    }

    public boolean c(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b24580aa", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.m == null || !this.f23610a || !this.c) {
            return false;
        }
        View view2 = (View) view.getParent();
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (motionEvent.getActionMasked() == 2) {
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int i = (int) (x - this.d);
            int i2 = (int) (y - this.e);
            float left = view.getLeft() + i;
            float top = view.getTop() + i2;
            float right = view.getRight() + i;
            float bottom = view.getBottom() + i2;
            wdm.d("DragHelper.onTouchEvent.ACTION_MOVE.dx=%s.dy=%s.mLeft=%s.mTop=%s.mRight=%s.mBottom=%s", Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(left), Float.valueOf(top), Float.valueOf(right), Float.valueOf(bottom));
            if (left < this.n) {
                this.i = true;
            }
            if (right > width - this.o) {
                this.h = true;
            }
            if (top < this.p) {
                this.j = true;
            }
            if (bottom > height - this.q) {
                this.k = true;
            }
            if (!"y".equals(this.b) && !this.i && !this.h) {
                view.offsetLeftAndRight(i);
                this.f += i;
            }
            if (!"x".equals(this.b) && !this.j && !this.k) {
                view.offsetTopAndBottom(i2);
                this.g += i2;
            }
            wdm.d("DragHelper.onTouchEvent.ACTION_MOVE.dx=%s.dy=%s.mDx=%s.mDy=%s.mLeft=%s.mTop=%s.mRight=%s.mBottom=%s.moveLeft=%s,moveLeft=%s.parentWidth=%s.parentHeight=%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(left), Float.valueOf(top), Float.valueOf(right), Float.valueOf(bottom), Boolean.valueOf(this.i), Boolean.valueOf(this.h), Integer.valueOf(width), Integer.valueOf(height));
        }
        return true;
    }
}
