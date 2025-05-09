package com.flybird;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBScrollView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBHScrollView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FBScrollHelper f4929a;
    public final FrameLayout b;
    public boolean c = true;
    public boolean d = false;
    public FBScrollView.FBScrollViewListener e;

    public FBHScrollView(Context context, FrameLayout frameLayout) {
        super(context);
        this.b = frameLayout;
        setOverScrollMode(2);
        this.f4929a = new FBScrollHelper(this, frameLayout, true);
        super.addView(frameLayout);
    }

    public static /* synthetic */ Object ipc$super(FBHScrollView fBHScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 640003410:
                super.requestChildFocus((View) objArr[0], (View) objArr[1]);
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/FBHScrollView");
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else {
            this.b.addView(view);
        }
    }

    public View getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("507c2c94", new Object[]{this});
        }
        return this.b;
    }

    public int getFbChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d36279f", new Object[]{this})).intValue();
        }
        return this.b.getChildCount();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.c || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.f4929a.a(i, i2, i3, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.c) {
            this.f4929a.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
        } else {
            this.b.removeView(view);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2625ad52", new Object[]{this, view, view2});
        } else if (view2 == null || this.d || (!(view2 instanceof WebView) && !view2.getClass().getName().startsWith("com.uc.webkit"))) {
            super.requestChildFocus(view, view2);
        } else {
            String name = FBHScrollView.class.getName();
            FBLogger.d(name, "scrollview requestChildFocus focused=" + view2.getClass().getName() + " child=" + view.getClass().getName());
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: com.flybird.FBHScrollView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view3, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view3, motionEvent})).booleanValue();
                    }
                    if ((motionEvent.getAction() & 255) == 1) {
                        FBHScrollView.this.requestDisallowInterceptTouchEvent(false);
                    } else {
                        FBHScrollView fBHScrollView = FBHScrollView.this;
                        fBHScrollView.d = true;
                        fBHScrollView.requestDisallowInterceptTouchEvent(true);
                    }
                    return false;
                }
            });
        }
    }

    public void setOverScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47682ef", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f4929a.g = z;
        this.b.setClipChildren(false);
    }

    public void setScrollListened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330c0cb8", new Object[]{this, new Boolean(z)});
        } else {
            this.f4929a.h = z;
        }
    }

    public void setScrollViewListener(FBScrollView.FBScrollViewListener fBScrollViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921ff34b", new Object[]{this, fBScrollViewListener});
            return;
        }
        this.e = fBScrollViewListener;
        this.f4929a.d = fBScrollViewListener;
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
        } else if (i == -1) {
            super.addView(view, i);
        } else {
            this.b.addView(view, i);
        }
    }
}
