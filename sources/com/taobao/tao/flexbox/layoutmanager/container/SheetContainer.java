package com.taobao.tao.flexbox.layoutmanager.container;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SheetContainer extends PopupWindow implements o.r {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout content;
    private FrameLayout eventHolderView;
    private FrameLayout fakeNavBar;
    private boolean isDestroyed;
    private boolean isNavBarShow;
    private boolean isResumeCalled;
    private int navigationBarHeight;
    private TNodeView pageView;
    private FrameLayout rootView;
    private o tNodeEngine;
    private ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener = new a();
    private Application.ActivityLifecycleCallbacks lifecycleCallback = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            Activity activity = (Activity) SheetContainer.access$000(SheetContainer.this).getContext();
            boolean G = s6o.G(activity);
            if (SheetContainer.access$100(SheetContainer.this) != G) {
                SheetContainer.access$102(SheetContainer.this, G);
                if (SheetContainer.access$200(SheetContainer.this) != null && SheetContainer.access$100(SheetContainer.this)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SheetContainer.access$200(SheetContainer.this).getLayoutParams();
                    if (SheetContainer.access$100(SheetContainer.this)) {
                        i = SheetContainer.access$300(SheetContainer.this);
                    }
                    layoutParams.bottomMargin = i;
                    SheetContainer.access$200(SheetContainer.this).setLayoutParams(layoutParams);
                } else if (SheetContainer.access$400(SheetContainer.this) == null) {
                    SheetContainer.access$402(SheetContainer.this, new FrameLayout(activity));
                    SheetContainer.access$400(SheetContainer.this).setBackgroundColor(-1);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, SheetContainer.access$300(SheetContainer.this));
                    layoutParams2.gravity = 80;
                    SheetContainer.access$400(SheetContainer.this).setLayoutParams(layoutParams2);
                    SheetContainer.access$000(SheetContainer.this).addView(SheetContainer.access$400(SheetContainer.this));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            try {
                SheetContainer.access$000(SheetContainer.this).dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
            } catch (Throwable unused) {
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements TNodeView.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutCompleted(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e800489", new Object[]{this, nVar});
                return;
            }
            SheetContainer.access$502(SheetContainer.this, nVar.P());
            SheetContainer.access$602(SheetContainer.this, true);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
        public void onLayoutError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("834776a6", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else if (SheetContainer.access$500(SheetContainer.this) != null) {
                SheetContainer.access$500(SheetContainer.this).E0();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (SheetContainer.access$500(SheetContainer.this) != null) {
                SheetContainer.access$500(SheetContainer.this).G0();
                SheetContainer.access$602(SheetContainer.this, true);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    static {
        t2o.a(503316961);
        t2o.a(503317152);
    }

    public SheetContainer(Activity activity, String str) {
        this.navigationBarHeight = s6o.i(activity);
        this.isNavBarShow = s6o.G(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.content = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.content.setBackgroundColor(0);
        initTNode(activity, str);
        setContentView(this.content);
        setWidth(s6o.B(activity));
        setHeight(s6o.t(activity));
        setFocusable(true);
        setOutsideTouchable(true);
        setClippingEnabled(false);
        fixGlobalWindowEvent(activity);
    }

    public static /* synthetic */ FrameLayout access$000(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b7cdcc8", new Object[]{sheetContainer});
        }
        return sheetContainer.content;
    }

    public static /* synthetic */ boolean access$100(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2df7ae14", new Object[]{sheetContainer})).booleanValue();
        }
        return sheetContainer.isNavBarShow;
    }

    public static /* synthetic */ boolean access$102(SheetContainer sheetContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73a1e5ca", new Object[]{sheetContainer, new Boolean(z)})).booleanValue();
        }
        sheetContainer.isNavBarShow = z;
        return z;
    }

    public static /* synthetic */ TNodeView access$200(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("b594698c", new Object[]{sheetContainer});
        }
        return sheetContainer.pageView;
    }

    public static /* synthetic */ int access$300(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fb86f41", new Object[]{sheetContainer})).intValue();
        }
        return sheetContainer.navigationBarHeight;
    }

    public static /* synthetic */ FrameLayout access$400(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ca59accc", new Object[]{sheetContainer});
        }
        return sheetContainer.fakeNavBar;
    }

    public static /* synthetic */ FrameLayout access$402(SheetContainer sheetContainer, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("9d97de6b", new Object[]{sheetContainer, frameLayout});
        }
        sheetContainer.fakeNavBar = frameLayout;
        return frameLayout;
    }

    public static /* synthetic */ o access$500(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("7c211a2c", new Object[]{sheetContainer});
        }
        return sheetContainer.tNodeEngine;
    }

    public static /* synthetic */ o access$502(SheetContainer sheetContainer, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("2df563c6", new Object[]{sheetContainer, oVar});
        }
        sheetContainer.tNodeEngine = oVar;
        return oVar;
    }

    public static /* synthetic */ boolean access$602(SheetContainer sheetContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e37c660f", new Object[]{sheetContainer, new Boolean(z)})).booleanValue();
        }
        sheetContainer.isResumeCalled = z;
        return z;
    }

    private void fixGlobalWindowEvent(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c10576b", new Object[]{this, activity});
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        if (decorView instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) decorView;
            this.rootView = frameLayout;
            frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
            FrameLayout frameLayout2 = new FrameLayout(activity);
            this.eventHolderView = frameLayout2;
            this.rootView.addView(frameLayout2, -1, -1);
            this.eventHolderView.setOnTouchListener(new b());
        }
    }

    private void initTNode(Activity activity, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdf7e89", new Object[]{this, activity, str});
            return;
        }
        this.pageView = TNodeView.create(activity, this, null, str, null, null, new c());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.isNavBarShow) {
            i = this.navigationBarHeight;
        }
        layoutParams.bottomMargin = i;
        this.content.addView(this.pageView, layoutParams);
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(this.lifecycleCallback);
        }
    }

    public static /* synthetic */ Object ipc$super(SheetContainer sheetContainer, String str, Object... objArr) {
        if (str.hashCode() == -1373052399) {
            super.dismiss();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/container/SheetContainer");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.content;
        if (frameLayout != null && (frameLayout.getContext() instanceof Activity) && Build.VERSION.SDK_INT >= 29) {
            ((Activity) this.content.getContext()).unregisterActivityLifecycleCallbacks(this.lifecycleCallback);
        }
        FrameLayout frameLayout2 = this.rootView;
        if (frameLayout2 != null) {
            frameLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
            FrameLayout frameLayout3 = this.eventHolderView;
            if (frameLayout3 != null) {
                this.rootView.removeView(frameLayout3);
            }
        }
        this.isDestroyed = true;
        o oVar = this.tNodeEngine;
        if (oVar != null) {
            oVar.E0();
            this.tNodeEngine.D0();
        }
        this.tNodeEngine = null;
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        o oVar = this.tNodeEngine;
        if (oVar != null) {
            oVar.o1(0, oVar.d0(), "onclose", null, null, null);
        } else {
            destroy();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.o.r
    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue();
        }
        return true ^ isDestroy();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.o.r
    public boolean isDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        if (this.isDestroyed || !isShowing()) {
            return true;
        }
        return false;
    }

    public boolean isResumeCalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("106b2df", new Object[]{this})).booleanValue();
        }
        return this.isResumeCalled;
    }

    public void show(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7429b556", new Object[]{this, activity});
            return;
        }
        try {
            showAtLocation(activity.getWindow().getDecorView(), 0, 0, 0);
        } catch (WindowManager.BadTokenException unused) {
        }
    }
}
