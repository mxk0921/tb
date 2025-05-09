package com.taobao.themis.widget.event;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import kotlin.Metadata;
import tb.bbs;
import tb.cfs;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/taobao/themis/widget/event/NativeWidgetNestedRenderContainer;", "Lcom/taobao/themis/external/embed/TMSEmbed$EmbedRootView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/taobao/themis/widget/event/GestureMode;", "gestureMode", "(Landroid/content/Context;Lcom/taobao/themis/widget/event/GestureMode;)V", "", "x", "y", "", "needDispatchTouchEvent", "(FF)Z", "isGestureModeInner", "()Z", "Ltb/xhv;", "interceptTouchEvent", "()V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "startX", UTConstant.Args.UT_SUCCESS_F, "startY", "mGestureMode", "Lcom/taobao/themis/widget/event/GestureMode;", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class NativeWidgetNestedRenderContainer extends TMSEmbed.EmbedRootView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GestureMode mGestureMode;
    private float startX;
    private float startY;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(852492327);
            int[] iArr = new int[GestureMode.values().length];
            iArr[GestureMode.ALL.ordinal()] = 1;
            iArr[GestureMode.HORIZONTAL.ordinal()] = 2;
            iArr[GestureMode.VERTICAL.ordinal()] = 3;
            iArr[GestureMode.DEFAULT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(852492326);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeWidgetNestedRenderContainer(Context context) {
        super(context);
        ckf.g(context, "context");
        this.mGestureMode = GestureMode.DEFAULT;
    }

    private final void interceptTouchEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcf8304", new Object[]{this});
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public static /* synthetic */ Object ipc$super(NativeWidgetNestedRenderContainer nativeWidgetNestedRenderContainer, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/event/NativeWidgetNestedRenderContainer");
    }

    private final boolean isGestureModeInner() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fb33eff", new Object[]{this})).booleanValue();
        }
        if (getInstance() == null || this.mGestureMode != GestureMode.DEFAULT) {
            return false;
        }
        bbs instance = getInstance();
        if (instance == null) {
            str = null;
        } else {
            str = cfs.a(instance);
        }
        return ckf.b(str, "inner");
    }

    private final boolean needDispatchTouchEvent(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ab54876", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        int i = a.$EnumSwitchMapping$0[this.mGestureMode.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                if (i == 4 && (Math.abs(f) > Math.abs(f2) || isGestureModeInner())) {
                    return true;
                }
            } else if (Math.abs(f) < Math.abs(f2)) {
                return true;
            }
        } else if (Math.abs(f) > Math.abs(f2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            return super.dispatchTouchEvent(motionEvent);
        } else if (action != 2) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            if (!needDispatchTouchEvent(motionEvent.getX() - this.startX, motionEvent.getY() - this.startY)) {
                return false;
            }
            interceptTouchEvent();
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeWidgetNestedRenderContainer(Context context, GestureMode gestureMode) {
        this(context);
        ckf.g(context, "context");
        ckf.g(gestureMode, "gestureMode");
        this.mGestureMode = gestureMode;
    }
}
