package com.taobao.android.abilitykit.ability.pop.render.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.abl;
import tb.c9c;
import tb.gxv;
import tb.mgo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GestureRoundCornerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isDisAllowParentIntercept;
    private c9c mGestureHandler;

    static {
        t2o.a(336593051);
    }

    public GestureRoundCornerFrameLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(GestureRoundCornerFrameLayout gestureRoundCornerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/abilitykit/ability/pop/render/util/GestureRoundCornerFrameLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isDisAllowParentIntercept) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action == 1 || action == 3) && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        c9c c9cVar = this.mGestureHandler;
        if (c9cVar != null) {
            return ((GestureHandler) c9cVar).h(motionEvent, this);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        c9c c9cVar = this.mGestureHandler;
        if (c9cVar != null) {
            ((GestureHandler) c9cVar).i(motionEvent, this);
        }
        return true;
    }

    public void setGestureHandler(c9c c9cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac01d914", new Object[]{this, c9cVar});
        } else {
            this.mGestureHandler = c9cVar;
        }
    }

    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            setRadius(f, f, f, f);
        }
    }

    public GestureRoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6855c89b", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else if (f != 0.0f || f2 != 0.0f || f3 != 0.0f || f4 != 0.0f || gxv.l(getContext())) {
            mgo.a(this, f, f2, f3, f4);
        }
    }

    public GestureRoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isDisAllowParentIntercept = false;
        this.isDisAllowParentIntercept = abl.J();
    }
}
