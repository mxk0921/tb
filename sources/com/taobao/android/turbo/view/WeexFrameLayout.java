package com.taobao.android.turbo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.sj4;
import tb.t2o;
import tb.tpu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 #2\u00020\u0001:\u0001$B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/taobao/android/turbo/view/WeexFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewParent;", "findViewParentIfNeeds", "(Landroid/view/View;)Landroid/view/ViewParent;", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "weexConsumeState", "Ltb/xhv;", "setWeexConsume", "(Ljava/lang/String;)V", "beenConsume", "()Z", "mWeexConsumeState", "Ljava/lang/String;", "viewParent", "Landroid/view/ViewParent;", "hasUpOrCancel", "Z", "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WeexFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WeexFrameLayout";
    private boolean hasUpOrCancel;
    private String mWeexConsumeState = WEEX_STATE_NOT_EXIST;
    private ViewParent viewParent;
    public static final a Companion = new a(null);
    private static String WEEX_STATE_CONSUME = sj4.WEEX_STATE_CONSUME;
    private static String WEEX_STATE_NOT_CONSUME = sj4.WEEX_STATE_NOT_CONSUME;
    private static String WEEX_STATE_NOT_EXIST = sj4.WEEX_STATE_NOT_EXIST;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455786);
        }

        public a() {
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ec0ee93", new Object[]{this});
            }
            return WeexFrameLayout.access$getWEEX_STATE_CONSUME$cp();
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("55d8619f", new Object[]{this});
            }
            return WeexFrameLayout.access$getWEEX_STATE_NOT_CONSUME$cp();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ((WeexFrameLayout.access$getViewParent$p(WeexFrameLayout.this) instanceof ViewPager) && !WeexFrameLayout.this.beenConsume()) {
                tpu.a.b(tpu.Companion, WeexFrameLayout.TAG, "onInterceptTouchEvent allowIntercept", null, 4, null);
                ViewParent access$getViewParent$p = WeexFrameLayout.access$getViewParent$p(WeexFrameLayout.this);
                if (access$getViewParent$p != null) {
                    ((ViewPager) access$getViewParent$p).requestDisallowInterceptTouchEvent(false);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.view.ViewPager");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexFrameLayout(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static final /* synthetic */ ViewParent access$getViewParent$p(WeexFrameLayout weexFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("a5176671", new Object[]{weexFrameLayout});
        }
        return weexFrameLayout.viewParent;
    }

    public static final /* synthetic */ String access$getWEEX_STATE_CONSUME$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1730e2ee", new Object[0]);
        }
        return WEEX_STATE_CONSUME;
    }

    public static final /* synthetic */ String access$getWEEX_STATE_NOT_CONSUME$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b22fa462", new Object[0]);
        }
        return WEEX_STATE_NOT_CONSUME;
    }

    public static final /* synthetic */ String access$getWEEX_STATE_NOT_EXIST$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ef215dd", new Object[0]);
        }
        return WEEX_STATE_NOT_EXIST;
    }

    public static final /* synthetic */ void access$setViewParent$p(WeexFrameLayout weexFrameLayout, ViewParent viewParent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67bb257b", new Object[]{weexFrameLayout, viewParent});
        } else {
            weexFrameLayout.viewParent = viewParent;
        }
    }

    public static final /* synthetic */ void access$setWEEX_STATE_CONSUME$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2546a8b0", new Object[]{str});
        } else {
            WEEX_STATE_CONSUME = str;
        }
    }

    public static final /* synthetic */ void access$setWEEX_STATE_NOT_CONSUME$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c793bbc", new Object[]{str});
        } else {
            WEEX_STATE_NOT_CONSUME = str;
        }
    }

    public static final /* synthetic */ void access$setWEEX_STATE_NOT_EXIST$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9990c6a1", new Object[]{str});
        } else {
            WEEX_STATE_NOT_EXIST = str;
        }
    }

    private final ViewParent findViewParentIfNeeds(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("307f684b", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewPager) {
            return parent;
        }
        if (parent instanceof View) {
            return findViewParentIfNeeds((View) parent);
        }
        return parent;
    }

    public static /* synthetic */ Object ipc$super(WeexFrameLayout weexFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/view/WeexFrameLayout");
    }

    public final boolean beenConsume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1aa5a2bb", new Object[]{this})).booleanValue();
        }
        return ckf.b(WEEX_STATE_CONSUME, this.mWeexConsumeState);
    }

    public final void setWeexConsume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119aa4ca", new Object[]{this, str});
            return;
        }
        ckf.g(str, "weexConsumeState");
        if (!this.hasUpOrCancel) {
            this.mWeexConsumeState = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    static {
        t2o.a(916455785);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        ckf.g(motionEvent, "event");
        this.viewParent = findViewParentIfNeeds(this);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hasUpOrCancel = false;
            if (this.viewParent instanceof ViewPager) {
                tpu.a.b(tpu.Companion, TAG, "onInterceptTouchEvent disallowIntercept", null, 4, null);
                ViewParent viewParent = this.viewParent;
                if (viewParent != null) {
                    ((ViewPager) viewParent).requestDisallowInterceptTouchEvent(true);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.support.v4.view.ViewPager");
                }
            }
            if (this.viewParent instanceof ViewPager) {
                postDelayed(new b(), 120L);
            }
        } else if (action == 1) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, TAG, "onInterceptTouchEvent event: " + motionEvent.getAction(), null, 4, null);
            setWeexConsume(WEEX_STATE_NOT_EXIST);
            this.hasUpOrCancel = true;
        } else if (action == 3) {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, TAG, "onInterceptTouchEvent event: " + motionEvent.getAction(), null, 4, null);
            this.hasUpOrCancel = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
