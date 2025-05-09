package com.taobao.themis.widget.event;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import kotlin.Metadata;
import tb.bbs;
import tb.cfs;
import tb.ckf;
import tb.d2x;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0016\u0010!\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/taobao/themis/widget/event/WebWidgetNestedRenderContainer;", "Lcom/taobao/themis/external/embed/TMSEmbed$EmbedRootView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/taobao/themis/widget/event/GestureMode;", "gestureMode", "(Landroid/content/Context;Lcom/taobao/themis/widget/event/GestureMode;)V", "", "x", "y", "", "needDispatchTouchEvent", "(FF)Z", "isGestureModeInner", "()Z", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "touchEditText", "(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/view/View;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ltb/xhv;", "setGestureMode", "(Lcom/taobao/themis/widget/event/GestureMode;)V", "startX", UTConstant.Args.UT_SUCCESS_F, "startY", "Z", "touchMoveDispatched", "mGestureMode", "Lcom/taobao/themis/widget/event/GestureMode;", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WebWidgetNestedRenderContainer extends TMSEmbed.EmbedRootView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GestureMode mGestureMode;
    private boolean needDispatchTouchEvent;
    private float startX;
    private float startY;
    private boolean touchMoveDispatched;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(852492329);
            int[] iArr = new int[GestureMode.values().length];
            iArr[GestureMode.ALL.ordinal()] = 1;
            iArr[GestureMode.HORIZONTAL.ordinal()] = 2;
            iArr[GestureMode.VERTICAL.ordinal()] = 3;
            iArr[GestureMode.DEFAULT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(852492328);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebWidgetNestedRenderContainer(Context context) {
        super(context);
        ckf.g(context, "context");
        this.mGestureMode = GestureMode.DEFAULT;
    }

    public static /* synthetic */ Object ipc$super(WebWidgetNestedRenderContainer webWidgetNestedRenderContainer, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/event/WebWidgetNestedRenderContainer");
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

    private final View touchEditText(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9d97e90c", new Object[]{this, view, motionEvent});
        }
        if (view instanceof EditText) {
            if (d2x.a(view, motionEvent.getRawX(), motionEvent.getRawY())) {
                return view;
            }
            return null;
        } else if (!(view instanceof ViewGroup)) {
            return null;
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount() - 1;
            if (childCount >= 0) {
                while (true) {
                    int i = childCount - 1;
                    View childAt = viewGroup.getChildAt(childCount);
                    if ((childAt instanceof EditText) && d2x.a(childAt, motionEvent.getRawX(), motionEvent.getRawY())) {
                        return childAt;
                    }
                    ckf.f(childAt, "childAt");
                    View view2 = touchEditText(childAt, motionEvent);
                    if (view2 != null) {
                        return view2;
                    }
                    if (i < 0) {
                        break;
                    }
                    childCount = i;
                }
            }
            return null;
        }
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
            this.needDispatchTouchEvent = false;
            if (touchEditText(this, motionEvent) != null) {
                return super.dispatchTouchEvent(motionEvent);
            }
            super.dispatchTouchEvent(motionEvent);
            return false;
        } else if (action != 1) {
            if (action == 2) {
                boolean needDispatchTouchEvent = needDispatchTouchEvent(motionEvent.getX() - this.startX, motionEvent.getY() - this.startY);
                this.needDispatchTouchEvent = needDispatchTouchEvent;
                if (needDispatchTouchEvent) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            } else if (action == 3) {
                return super.dispatchTouchEvent(motionEvent);
            } else {
                super.dispatchTouchEvent(motionEvent);
                return false;
            }
        } else if (this.needDispatchTouchEvent) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            super.dispatchTouchEvent(motionEvent);
            return false;
        }
    }

    public final void setGestureMode(GestureMode gestureMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c185f3e", new Object[]{this, gestureMode});
            return;
        }
        ckf.g(gestureMode, "gestureMode");
        this.mGestureMode = gestureMode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebWidgetNestedRenderContainer(Context context, GestureMode gestureMode) {
        this(context);
        ckf.g(context, "context");
        ckf.g(gestureMode, "gestureMode");
        this.mGestureMode = gestureMode;
    }
}
