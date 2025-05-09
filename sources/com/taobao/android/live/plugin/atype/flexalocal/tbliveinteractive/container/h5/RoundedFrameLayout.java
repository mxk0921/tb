package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.customview.widget.ViewDragHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.giv;
import tb.jbu;
import tb.qvs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RoundedFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float[] mCornerRadii;
    private float mLastEvY;
    private Boolean needScroll;
    public Path path;
    private boolean supportScroll;

    static {
        t2o.a(295699882);
    }

    public RoundedFrameLayout(Context context) {
        super(context);
        this.mCornerRadii = new float[8];
        this.mLastEvY = 0.0f;
        this.needScroll = null;
        this.supportScroll = false;
    }

    private boolean canScrollVertically(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a89699c", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (viewGroup.getChildAt(i2).canScrollVertically(i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(RoundedFrameLayout roundedFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/RoundedFrameLayout");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            canvas.save();
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } catch (Throwable unused) {
            jbu.a("RoundedFrameLayout", "dispatchDraw.error");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View findViewById;
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        ViewGroup viewGroup = (ViewGroup) getParent();
        BottomSheetBehavior from = BottomSheetBehavior.from((FrameLayout) viewGroup);
        if (actionMasked == 0) {
            if (!qvs.C() || !this.supportScroll || 4 != from.getState()) {
                viewGroup.requestDisallowInterceptTouchEvent(true);
                if (giv.c().b() || isAndroidX()) {
                    saveInitialMotion(from, motionEvent);
                }
            } else {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            }
            this.mLastEvY = motionEvent.getY();
        } else if (1 == actionMasked || 3 == actionMasked) {
            this.mLastEvY = 0.0f;
            viewGroup.requestDisallowInterceptTouchEvent(false);
        } else if (2 == actionMasked) {
            float y = motionEvent.getY();
            if (y > this.mLastEvY) {
                z = true;
            } else {
                z = false;
            }
            this.mLastEvY = y;
            if (3 == from.getState() && (findViewById = findViewById(R.id.web)) != null) {
                if (qvs.C() && (bool = this.needScroll) != null) {
                    viewGroup.requestDisallowInterceptTouchEvent(true ^ bool.booleanValue());
                    return super.dispatchTouchEvent(motionEvent);
                } else if ((z && canScrollVertically(findViewById, -1)) || (!z && canScrollVertically(findViewById, 1))) {
                    viewGroup.requestDisallowInterceptTouchEvent(true);
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isAndroidX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9700021e", new Object[]{this})).booleanValue();
        }
        try {
            IpChange ipChange2 = ViewDragHelper.$ipChange;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        Path path = new Path();
        this.path = path;
        path.addRoundRect(new RectF(0.0f, 0.0f, i, i2), this.mCornerRadii, Path.Direction.CW);
    }

    public void setCornerRadii(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9100fcf0", new Object[]{this, fArr});
        } else {
            this.mCornerRadii = fArr;
        }
    }

    public void setNeedScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac78148", new Object[]{this, new Boolean(z)});
            return;
        }
        Log.e("RoundedFrameLayout", "needScroll:" + z);
        this.needScroll = Boolean.valueOf(z);
    }

    public void setSupportScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53357533", new Object[]{this, new Boolean(z)});
        } else {
            this.supportScroll = z;
        }
    }

    private void saveInitialMotion(BottomSheetBehavior bottomSheetBehavior, MotionEvent motionEvent) {
        try {
            Field declaredField = BottomSheetBehavior.class.getDeclaredField("viewDragHelper");
            declaredField.setAccessible(true);
            Class cls = Float.TYPE;
            Method declaredMethod = ViewDragHelper.class.getDeclaredMethod("saveInitialMotion", cls, cls, Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke((ViewDragHelper) declaredField.get(bottomSheetBehavior), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), Integer.valueOf(motionEvent.getPointerId(0)));
        } catch (Throwable unused) {
            jbu.a("RoundedFrameLayout", "saveInitialMotion.error");
        }
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCornerRadii = new float[8];
        this.mLastEvY = 0.0f;
        this.needScroll = null;
        this.supportScroll = false;
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCornerRadii = new float[8];
        this.mLastEvY = 0.0f;
        this.needScroll = null;
        this.supportScroll = false;
    }
}
