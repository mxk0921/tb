package com.taobao.themis.widget;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import tb.adx;
import tb.bbs;
import tb.ckf;
import tb.idx;
import tb.rhx;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/taobao/themis/widget/WidgetRootView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Ltb/bbs;", "instance", "<init>", "(Landroid/content/Context;Ltb/bbs;)V", "", "targetHeight", "currentHeight", "", "isExpend", "(II)Z", "Ltb/idx;", "getViewConfig", "()Ltb/idx;", "isSurfaceMode", "newConfig", "Ltb/xhv;", "updateSize", "(ZLtb/idx;)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/ref/WeakReference;", "mInstanceRef", "Ljava/lang/ref/WeakReference;", "mWidgetViewConfig", "Ltb/idx;", "Ltb/adx;", "mWidgetTouchEventBridge", "Ltb/adx;", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WidgetRootView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<bbs> mInstanceRef;
    private final adx mWidgetTouchEventBridge;
    private idx mWidgetViewConfig;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            Context context = WidgetRootView.this.getContext();
            if (context != null) {
                int width = rhx.a((Activity) context).width();
                if (WidgetRootView.access$getMWidgetViewConfig$p(WidgetRootView.this).c() != width) {
                    WidgetRootView.access$getMWidgetViewConfig$p(WidgetRootView.this).e(width);
                    WidgetRootView widgetRootView = WidgetRootView.this;
                    widgetRootView.updateSize(false, WidgetRootView.access$getMWidgetViewConfig$p(widgetRootView));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ViewGroup.LayoutParams b;

        public b(ViewGroup.LayoutParams layoutParams) {
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WidgetRootView.this.setLayoutParams(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f13806a;
        public final /* synthetic */ ViewGroup.LayoutParams b;

        public c(View view, ViewGroup.LayoutParams layoutParams) {
            this.f13806a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f13806a.setLayoutParams(this.b);
            }
        }
    }

    static {
        t2o.a(852492303);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRootView(Context context, bbs bbsVar) {
        super(context);
        idx idxVar;
        ckf.g(context, "context");
        ckf.g(bbsVar, "instance");
        this.mInstanceRef = new WeakReference<>(bbsVar);
        adx adxVar = new adx();
        this.mWidgetTouchEventBridge = adxVar;
        adxVar.c(bbsVar);
        idx idxVar2 = (idx) bbsVar.g(idx.class);
        if (idxVar2 == null) {
            idxVar = null;
        } else {
            idxVar = idxVar2.a();
        }
        this.mWidgetViewConfig = idxVar == null ? new idx(-1, -1) : idxVar;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(this.mWidgetViewConfig.d(), this.mWidgetViewConfig.b());
        } else {
            layoutParams.width = this.mWidgetViewConfig.d();
            layoutParams.height = this.mWidgetViewConfig.b();
        }
        setLayoutParams(layoutParams);
        if (TBDeviceUtils.P(getContext()) || TBDeviceUtils.p(getContext())) {
            addOnLayoutChangeListener(new a());
        }
    }

    public static final /* synthetic */ idx access$getMWidgetViewConfig$p(WidgetRootView widgetRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idx) ipChange.ipc$dispatch("fa7b652e", new Object[]{widgetRootView});
        }
        return widgetRootView.mWidgetViewConfig;
    }

    public static /* synthetic */ Object ipc$super(WidgetRootView widgetRootView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/WidgetRootView");
    }

    private final boolean isExpend(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a38f9093", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i > i2) {
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
        this.mWidgetTouchEventBridge.b(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final idx getViewConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idx) ipChange.ipc$dispatch("6d3e3ea6", new Object[]{this});
        }
        return this.mWidgetViewConfig;
    }

    public final void updateSize(boolean z, idx idxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9fef20f", new Object[]{this, new Boolean(z), idxVar});
            return;
        }
        ckf.g(idxVar, "newConfig");
        this.mWidgetViewConfig = idxVar.a();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        ((ViewGroup.LayoutParams) layoutParams2).width = idxVar.d();
        ((ViewGroup.LayoutParams) layoutParams2).height = idxVar.b();
        View childAt = getChildAt(0);
        if (!z || childAt == null) {
            setLayoutParams(layoutParams2);
        } else if (isExpend(idxVar.b(), layoutParams.height)) {
            childAt.setLayoutParams(layoutParams2);
            childAt.postDelayed(new b(layoutParams2), 10L);
        } else {
            setLayoutParams(layoutParams2);
            childAt.postDelayed(new c(childAt, layoutParams2), 10L);
        }
    }
}
