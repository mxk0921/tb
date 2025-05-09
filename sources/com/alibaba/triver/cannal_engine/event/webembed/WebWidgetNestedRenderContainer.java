package com.alibaba.triver.cannal_engine.event.webembed;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mew;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WebWidgetNestedRenderContainer extends WidgetRenderContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TRWidgetInstance mInstance;
    private float startX;
    private float startY;
    private boolean needDispatchTouchEvent = false;
    private boolean touchMoveDispatched = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$alibaba$triver$cannal_engine$event$WidgetRenderContainer$GestureMode;

        static {
            int[] iArr = new int[WidgetRenderContainer.GestureMode.values().length];
            $SwitchMap$com$alibaba$triver$cannal_engine$event$WidgetRenderContainer$GestureMode = iArr;
            try {
                iArr[WidgetRenderContainer.GestureMode.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$triver$cannal_engine$event$WidgetRenderContainer$GestureMode[WidgetRenderContainer.GestureMode.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$triver$cannal_engine$event$WidgetRenderContainer$GestureMode[WidgetRenderContainer.GestureMode.VERTICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$triver$cannal_engine$event$WidgetRenderContainer$GestureMode[WidgetRenderContainer.GestureMode.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public WebWidgetNestedRenderContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(WebWidgetNestedRenderContainer webWidgetNestedRenderContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 877943481) {
            return new Boolean(super.dispatchWidgetTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/cannal_engine/event/webembed/WebWidgetNestedRenderContainer");
        }
    }

    private Boolean needDispatchTouchEvent(float f, float f2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("436be16f", new Object[]{this, new Float(f), new Float(f2)});
        }
        int i = a.$SwitchMap$com$alibaba$triver$cannal_engine$event$WidgetRenderContainer$GestureMode[this.mGestureMode.ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i == 2) {
            if (Math.abs(f) <= Math.abs(f2)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i == 3) {
            if (Math.abs(f) >= Math.abs(f2)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (i != 4) {
            return Boolean.FALSE;
        } else {
            if (Math.abs(f) <= Math.abs(f2) && !this.gestureModeInner) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    private View touchEditText(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9d97e90c", new Object[]{this, view, motionEvent});
        }
        if (view instanceof EditText) {
            if (mew.a(view, motionEvent.getRawX(), motionEvent.getRawY())) {
                return view;
            }
            return null;
        } else if (!(view instanceof ViewGroup)) {
            return null;
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if ((childAt instanceof EditText) && mew.a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                    return childAt;
                }
                View view2 = touchEditText(childAt, motionEvent);
                if (view2 != null) {
                    return view2;
                }
            }
            return null;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.event.WidgetRenderContainer
    public boolean dispatchWidgetTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34545ab9", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            this.touchMoveDispatched = false;
            this.needDispatchTouchEvent = false;
            if (touchEditText(this, motionEvent) != null) {
                return super.dispatchWidgetTouchEvent(motionEvent);
            }
            super.dispatchWidgetTouchEvent(motionEvent);
            return false;
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f = x - this.startX;
                float f2 = y - this.startY;
                if (!this.touchMoveDispatched) {
                    this.touchMoveDispatched = true;
                    this.needDispatchTouchEvent = needDispatchTouchEvent(f, f2).booleanValue();
                }
                if (this.needDispatchTouchEvent) {
                    return super.dispatchWidgetTouchEvent(motionEvent);
                }
                return false;
            } else if (action == 3) {
                return super.dispatchWidgetTouchEvent(motionEvent);
            } else {
                super.dispatchWidgetTouchEvent(motionEvent);
                return false;
            }
        } else if (this.needDispatchTouchEvent) {
            return super.dispatchWidgetTouchEvent(motionEvent);
        } else {
            super.dispatchWidgetTouchEvent(motionEvent);
            return false;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if (this.mInstance != null && view.getParent() != null && (view.getContext() instanceof Activity) && ((Activity) view.getContext()).getWindow().getDecorView() != view) {
            this.mInstance.onVisibilityChanged(i);
        }
    }

    public void setWidget(TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189bbc70", new Object[]{this, tRWidgetInstance});
        } else {
            this.mInstance = tRWidgetInstance;
        }
    }

    public WebWidgetNestedRenderContainer(Context context, WidgetRenderContainer.GestureMode gestureMode) {
        super(context, gestureMode);
    }
}
