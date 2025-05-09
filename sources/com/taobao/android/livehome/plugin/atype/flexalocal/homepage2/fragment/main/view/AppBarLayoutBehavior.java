package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.appbar.AppBarLayout;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AppBarLayoutBehavior extends AppBarLayout.Behavior {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean r;
    public boolean s;

    static {
        t2o.a(310378780);
    }

    public AppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ Object ipc$super(AppBarLayoutBehavior appBarLayoutBehavior, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -678463218:
                super.onStopNestedScroll((CoordinatorLayout) objArr[0], (AppBarLayout) objArr[1], (View) objArr[2], ((Number) objArr[3]).intValue());
                return null;
            case -613486315:
                super.onNestedPreScroll((CoordinatorLayout) objArr[0], (AppBarLayout) objArr[1], (View) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (int[]) objArr[5], ((Number) objArr[6]).intValue());
                return null;
            case -157739261:
                return new Boolean(super.onStartNestedScroll((CoordinatorLayout) objArr[0], (AppBarLayout) objArr[1], (View) objArr[2], (View) objArr[3], ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue()));
            case 42759693:
                super.onNestedScroll((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue());
                return null;
            case 564010233:
                return new Boolean(super.onInterceptTouchEvent((CoordinatorLayout) objArr[0], (View) objArr[1], (MotionEvent) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/AppBarLayoutBehavior");
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: E */
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6ef115", new Object[]{this, coordinatorLayout, appBarLayout, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        if (i3 == 1) {
            this.r = true;
        }
        if (!this.s) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: I */
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6991703", new Object[]{this, coordinatorLayout, appBarLayout, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        V(appBarLayout);
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: J */
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78f790e", new Object[]{this, coordinatorLayout, appBarLayout, view, new Integer(i)});
            return;
        }
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        this.r = false;
        this.s = false;
    }

    public final Field Q() throws NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("e86c73db", new Object[]{this});
        }
        try {
            return getClass().getSuperclass().getSuperclass().getDeclaredField("mFlingRunnable");
        } catch (NoSuchFieldException unused) {
            return getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("flingRunnable");
        }
    }

    public final Field R() throws NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("877934ae", new Object[]{this});
        }
        try {
            return getClass().getSuperclass().getSuperclass().getDeclaredField("mScroller");
        } catch (NoSuchFieldException unused) {
            return getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField(WXBasicComponentType.SCROLLER);
        }
    }

    /* renamed from: T */
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dad714f", new Object[]{this, coordinatorLayout, appBarLayout, motionEvent})).booleanValue();
        }
        this.s = this.r;
        if (motionEvent.getActionMasked() == 0) {
            V(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    /* renamed from: U */
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa7a037", new Object[]{this, coordinatorLayout, appBarLayout, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (!this.s) {
            S(coordinatorLayout, appBarLayout, view, i, i2, i3, i4);
        }
    }

    public final void V(AppBarLayout appBarLayout) {
        Throwable e;
        try {
            Field Q = Q();
            Field R = R();
            Q.setAccessible(true);
            R.setAccessible(true);
            Runnable runnable = (Runnable) Q.get(this);
            OverScroller overScroller = (OverScroller) R.get(this);
            if (runnable != null) {
                appBarLayout.removeCallbacks(runnable);
                Q.set(this, null);
            }
            if (overScroller != null && !overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            e.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e = e3;
            e.printStackTrace();
        }
    }

    public final void S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4) {
        Exception e;
        Method declaredMethod;
        try {
            Class<? super Object> superclass = getClass().getSuperclass();
            Class<?> cls = Integer.TYPE;
            declaredMethod = superclass.getDeclaredMethod("onNestedScroll", CoordinatorLayout.class, AppBarLayout.class, View.class, cls, cls, cls, cls, cls, int[].class);
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            declaredMethod.invoke(this, coordinatorLayout, appBarLayout, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 0, new int[2]);
        } catch (NoSuchMethodException unused2) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4);
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
        }
    }
}
