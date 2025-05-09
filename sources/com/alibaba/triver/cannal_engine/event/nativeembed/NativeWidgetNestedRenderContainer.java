package com.alibaba.triver.cannal_engine.event.nativeembed;

import android.content.Context;
import android.view.MotionEvent;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NativeWidgetNestedRenderContainer extends WidgetRenderContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float startX;
    private float startY;

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

    public NativeWidgetNestedRenderContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(NativeWidgetNestedRenderContainer nativeWidgetNestedRenderContainer, String str, Object... objArr) {
        if (str.hashCode() == 877943481) {
            return new Boolean(super.dispatchWidgetTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/event/nativeembed/NativeWidgetNestedRenderContainer");
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
            return super.dispatchWidgetTouchEvent(motionEvent);
        } else if (action != 2) {
            return super.dispatchWidgetTouchEvent(motionEvent);
        } else {
            if (!needDispatchTouchEvent(motionEvent.getX() - this.startX, motionEvent.getY() - this.startY).booleanValue()) {
                return false;
            }
            interceptTouchEvent();
            return super.dispatchWidgetTouchEvent(motionEvent);
        }
    }

    public void interceptTouchEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcf8304", new Object[]{this});
        } else if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    public NativeWidgetNestedRenderContainer(Context context, WidgetRenderContainer.GestureMode gestureMode) {
        super(context, gestureMode);
    }
}
