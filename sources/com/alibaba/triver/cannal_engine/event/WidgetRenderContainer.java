package com.alibaba.triver.cannal_engine.event;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.api.App;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.bdx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WidgetRenderContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean gestureModeInner;
    public WeakReference<App> mAppRef;
    public GestureMode mGestureMode;
    public bdx mWidgetTouchEventBridge;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum GestureMode {
        DEFAULT,
        NONE,
        VERTICAL,
        HORIZONTAL,
        ALL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(GestureMode gestureMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/event/WidgetRenderContainer$GestureMode");
        }

        public static GestureMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GestureMode) ipChange.ipc$dispatch("13302d9f", new Object[]{str});
            }
            return (GestureMode) Enum.valueOf(GestureMode.class, str);
        }
    }

    public WidgetRenderContainer(Context context) {
        super(context);
        this.mGestureMode = GestureMode.DEFAULT;
        this.gestureModeInner = false;
        this.mWidgetTouchEventBridge = new bdx();
    }

    public static /* synthetic */ Object ipc$super(WidgetRenderContainer widgetRenderContainer, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/event/WidgetRenderContainer");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        WeakReference<App> weakReference = this.mAppRef;
        if (!(weakReference == null || weakReference.get() == null || this.mGestureMode != GestureMode.DEFAULT)) {
            this.gestureModeInner = TextUtils.equals(this.mAppRef.get().getStringValue("gestureMode"), "inner");
        }
        bdx bdxVar = this.mWidgetTouchEventBridge;
        if (bdxVar != null) {
            bdxVar.b(motionEvent);
        }
        return dispatchWidgetTouchEvent(motionEvent);
    }

    public boolean dispatchWidgetTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34545ab9", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setApp(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa27c87a", new Object[]{this, app});
            return;
        }
        bdx bdxVar = this.mWidgetTouchEventBridge;
        if (bdxVar != null) {
            bdxVar.c(app);
        }
        this.mAppRef = new WeakReference<>(app);
    }

    public void setGestureMode(GestureMode gestureMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5122f873", new Object[]{this, gestureMode});
        } else {
            this.mGestureMode = gestureMode;
        }
    }

    public WidgetRenderContainer(Context context, GestureMode gestureMode) {
        super(context);
        IpChange ipChange = GestureMode.$ipChange;
        this.gestureModeInner = false;
        this.mGestureMode = gestureMode;
        this.mWidgetTouchEventBridge = new bdx();
    }
}
