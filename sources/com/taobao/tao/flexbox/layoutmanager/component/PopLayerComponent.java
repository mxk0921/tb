package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaPositionType;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import java.util.HashMap;
import java.util.Map;
import tb.akt;
import tb.gz0;
import tb.hk8;
import tb.jfw;
import tb.nwv;
import tb.s6o;
import tb.t2o;
import tb.xml;
import tb.yk9;
import tb.zr7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PopLayerComponent extends zr7 implements j, xml {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View anchor;
    private FlatViewGroup anchorView;
    private g animationDialog;
    private Window animationDialogWindow;
    private boolean canBeDrag;
    private yk9 containerFlexNode;
    private int[] lastTouchDownXY = new int[2];
    private h mPopLayerAnimation;
    private boolean showInBottom;
    private String src;
    private PopupWindow window;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class PopLayerContainerView extends FlatViewGroup {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int DISMISS_SCROLL_OFFSET = s6o.c(o.O, 65);
        private int mDownY;
        private boolean mIsBeingDragged;

        static {
            t2o.a(503316788);
        }

        public PopLayerContainerView(Context context) {
            super(context);
        }

        private boolean canScroll(View view, boolean z, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int scrollX = view.getScrollX();
                int scrollY = view.getScrollY();
                int childCount = viewGroup.getChildCount() - 1;
                while (childCount >= 0) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt != null && (i5 = i2 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() * childAt.getScaleX() && (i6 = i3 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom()) {
                        i4 = childCount;
                        if (canScroll(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                            return true;
                        }
                    } else {
                        i4 = childCount;
                    }
                    childCount = i4 - 1;
                }
            }
            if (!z || !view.canScrollVertically(i)) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ Object ipc$super(PopLayerContainerView popLayerContainerView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1447998406) {
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/PopLayerComponent$PopLayerContainerView");
        }

        public String getSrc() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2bd8590b", new Object[]{this});
            }
            return PopLayerComponent.access$1500(PopLayerComponent.this);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            if (!((i) PopLayerComponent.access$1200(PopLayerComponent.this)).x0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mDownY = (int) motionEvent.getRawY();
                this.mIsBeingDragged = false;
            } else if (action == 2) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                int rawY = ((int) motionEvent.getRawY()) - this.mDownY;
                if (Math.abs(rawY) > ViewConfiguration.getTouchSlop()) {
                    if (canScroll(this, false, -rawY, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        this.mIsBeingDragged = false;
                        return false;
                    }
                    this.mIsBeingDragged = true;
                }
            }
            return this.mIsBeingDragged;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
            if (r3 != 3) goto L_0x00a1;
         */
        @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouchEvent(android.view.MotionEvent r12) {
            /*
                r11 = this;
                r0 = 1
                r1 = 0
                r2 = 2
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.PopLayerContainerView.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001c
                java.lang.String r4 = "a9b14c3a"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r1] = r11
                r2[r0] = r12
                java.lang.Object r12 = r3.ipc$dispatch(r4, r2)
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                return r12
            L_0x001c:
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent r3 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.this
                tb.jfw r3 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.access$1300(r3)
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent$i r3 = (com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.i) r3
                boolean r3 = r3.x0
                if (r3 == 0) goto L_0x00a2
                int r3 = r12.getAction()
                if (r3 == 0) goto L_0x009f
                if (r3 == r0) goto L_0x0078
                if (r3 == r2) goto L_0x0037
                r1 = 3
                if (r3 == r1) goto L_0x0078
                goto L_0x00a1
            L_0x0037:
                float r2 = r12.getRawY()
                int r3 = r11.mDownY
                float r3 = (float) r3
                float r2 = r2 - r3
                int r2 = (int) r2
                boolean r3 = r11.mIsBeingDragged
                if (r3 != 0) goto L_0x0064
                int r3 = java.lang.Math.abs(r2)
                int r4 = android.view.ViewConfiguration.getTouchSlop()
                if (r3 <= r4) goto L_0x0064
                int r8 = -r2
                float r3 = r12.getRawX()
                int r9 = (int) r3
                float r12 = r12.getRawY()
                int r10 = (int) r12
                r7 = 0
                r5 = r11
                r6 = r11
                boolean r12 = r5.canScroll(r6, r7, r8, r9, r10)
                if (r12 != 0) goto L_0x0064
                r11.mIsBeingDragged = r0
            L_0x0064:
                boolean r12 = r11.mIsBeingDragged
                if (r12 == 0) goto L_0x00a1
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent r12 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.this
                boolean r12 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.access$1400(r12)
                if (r12 == 0) goto L_0x00a1
                if (r2 >= 0) goto L_0x0073
                r2 = 0
            L_0x0073:
                int r12 = -r2
                r11.scrollTo(r1, r12)
                goto L_0x00a1
            L_0x0078:
                float r1 = r12.getRawY()
                int r2 = r11.mDownY
                float r2 = (float) r2
                float r1 = r1 - r2
                int r1 = (int) r1
                if (r1 <= 0) goto L_0x0093
                int r12 = r11.DISMISS_SCROLL_OFFSET
                if (r1 <= r12) goto L_0x008d
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent r12 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.this
                r12.dismiss()
                goto L_0x00a1
            L_0x008d:
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent r12 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.this
                r12.resume()
                goto L_0x00a1
            L_0x0093:
                int r12 = r12.getAction()
                if (r12 != r0) goto L_0x00a1
                if (r1 != 0) goto L_0x00a1
                r11.performClick()
                goto L_0x00a1
            L_0x009f:
                r11.mIsBeingDragged = r1
            L_0x00a1:
                return r0
            L_0x00a2:
                boolean r12 = super.onTouchEvent(r12)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.PopLayerContainerView.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                view.destroyDrawingCache();
                view.buildDrawingCache();
                if (Color.alpha(view.getDrawingCache().getPixel(PopLayerComponent.access$000(PopLayerComponent.this)[0], PopLayerComponent.access$000(PopLayerComponent.this)[1])) < 200) {
                    PopLayerComponent.this.dismiss();
                }
            } catch (Exception unused) {
                PopLayerComponent.this.dismiss();
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
            if (motionEvent.getAction() == 0) {
                PopLayerComponent.access$000(PopLayerComponent.this)[0] = (int) motionEvent.getX();
                PopLayerComponent.access$000(PopLayerComponent.this)[1] = (int) motionEvent.getY();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements h.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.h.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("beddf223", new Object[]{this});
                return;
            }
            PopLayerComponent.access$100(PopLayerComponent.this).removeView(PopLayerComponent.this.getView());
            PopLayerComponent.access$200(PopLayerComponent.this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            PopLayerComponent.access$100(PopLayerComponent.this).removeView(PopLayerComponent.this.getView());
            PopLayerComponent.access$200(PopLayerComponent.this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PopLayerComponent.access$400(PopLayerComponent.this).P().d1(PopLayerComponent.access$300(PopLayerComponent.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements DialogInterface.OnShowListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
                return;
            }
            PopLayerComponent popLayerComponent = PopLayerComponent.this;
            popLayerComponent.sendMessage(130, PopLayerComponent.access$500(popLayerComponent), "onpageappear", null, null, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            PopLayerComponent.access$200(PopLayerComponent.this);
            PopLayerComponent popLayerComponent = PopLayerComponent.this;
            popLayerComponent.sendMessage(130, PopLayerComponent.access$600(popLayerComponent), "onpagedisappear", null, null, null);
            PopLayerComponent popLayerComponent2 = PopLayerComponent.this;
            popLayerComponent2.sendMessage(Component.MSG_FLAG_DISAPPEAR, PopLayerComponent.access$700(popLayerComponent2), "ondestroy", null, null, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Animation f12072a = gz0.b("bottom");
        public Animation b = gz0.c("bottom");
        public final boolean c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Animation.AnimationListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f12073a;

            public a(c cVar) {
                this.f12073a = cVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                c cVar = this.f12073a;
                if (cVar != null) {
                    cVar.onAnimationEnd(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    return;
                }
                c cVar = this.f12073a;
                if (cVar != null) {
                    cVar.onAnimationRepeat(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    return;
                }
                c cVar = this.f12073a;
                if (cVar != null) {
                    cVar.onAnimationStart(animation);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f12074a;

            public b(View view) {
                this.f12074a = view;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    this.f12074a.setScrollY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public interface c extends Animation.AnimationListener {
            void a();
        }

        static {
            t2o.a(503316784);
        }

        public h(Animation animation, Animation animation2, boolean z) {
            f(animation);
            g(animation2);
            this.c = z;
        }

        public final void a(View view, Animation animation, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39dea116", new Object[]{this, view, animation, cVar});
            } else if (view != null && animation != null) {
                animation.setAnimationListener(new a(cVar));
                view.clearAnimation();
                view.startAnimation(animation);
            } else if (cVar != null) {
                cVar.a();
            }
        }

        public final void b(View view, Animation animation, c cVar) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47dad4e7", new Object[]{this, view, animation, cVar});
            } else if (this.c) {
                a(view, animation, cVar);
            } else if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroup.getChildCount()) {
                        a(viewGroup.getChildAt(i), animation, cVar);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        public void c(View view, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfc1be3a", new Object[]{this, view, cVar});
            } else {
                b(view, this.b, cVar);
            }
        }

        public void d(View view) {
            int scrollY;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1262e3f3", new Object[]{this, view});
            } else if (view != null && (scrollY = view.getScrollY()) != 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(scrollY, 0);
                ofInt.addUpdateListener(new b(view));
                ofInt.setDuration(300L);
                ofInt.start();
            }
        }

        public void e(View view, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("322eef4b", new Object[]{this, view, cVar});
            } else {
                b(view, this.f12072a, cVar);
            }
        }

        public final void f(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0d6dde4", new Object[]{this, animation});
            } else {
                this.f12072a = animation;
            }
        }

        public final void g(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e6428df", new Object[]{this, animation});
            } else {
                this.b = animation;
            }
        }
    }

    static {
        t2o.a(503316774);
        t2o.a(503317092);
        t2o.a(503317097);
    }

    public static /* synthetic */ int[] access$000(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a0b315c0", new Object[]{popLayerComponent});
        }
        return popLayerComponent.lastTouchDownXY;
    }

    public static /* synthetic */ FlatViewGroup access$100(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlatViewGroup) ipChange.ipc$dispatch("b4a70376", new Object[]{popLayerComponent});
        }
        return popLayerComponent.anchorView;
    }

    public static /* synthetic */ jfw access$1200(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("3bcfe1be", new Object[]{popLayerComponent});
        }
        return popLayerComponent.viewParams;
    }

    public static /* synthetic */ jfw access$1300(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("c80c971d", new Object[]{popLayerComponent});
        }
        return popLayerComponent.viewParams;
    }

    public static /* synthetic */ boolean access$1400(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74c3e11b", new Object[]{popLayerComponent})).booleanValue();
        }
        return popLayerComponent.canBeDrag;
    }

    public static /* synthetic */ String access$1500(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aba05f88", new Object[]{popLayerComponent});
        }
        return popLayerComponent.src;
    }

    public static /* synthetic */ void access$200(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a80ada6", new Object[]{popLayerComponent});
        } else {
            popLayerComponent.unwatchPageLifecycle();
        }
    }

    public static /* synthetic */ n access$300(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("3ff120a9", new Object[]{popLayerComponent});
        }
        return popLayerComponent.node;
    }

    public static /* synthetic */ n access$400(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("ce7ca1aa", new Object[]{popLayerComponent});
        }
        return popLayerComponent.node;
    }

    public static /* synthetic */ n access$500(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("5d0822ab", new Object[]{popLayerComponent});
        }
        return popLayerComponent.node;
    }

    public static /* synthetic */ n access$600(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("eb93a3ac", new Object[]{popLayerComponent});
        }
        return popLayerComponent.node;
    }

    public static /* synthetic */ n access$700(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("7a1f24ad", new Object[]{popLayerComponent});
        }
        return popLayerComponent.node;
    }

    public static /* synthetic */ n access$800(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("8aaa5ae", new Object[]{popLayerComponent});
        }
        return popLayerComponent.node;
    }

    public static /* synthetic */ n access$900(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("973626af", new Object[]{popLayerComponent});
        }
        return popLayerComponent.node;
    }

    public static /* synthetic */ Object ipc$super(PopLayerComponent popLayerComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 672946423) {
            super.calculateLayout(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
            return null;
        } else if (hashCode == 1446611556) {
            super.bindEvent();
            return null;
        } else if (hashCode == 2127624665) {
            super.onDetach();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/PopLayerComponent");
        }
    }

    private void unwatchPageLifecycle() {
        o.t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47e4d6c", new Object[]{this});
            return;
        }
        if (akt.i2()) {
            tVar = this.node.P().d0().T();
        } else {
            tVar = this.node.T();
        }
        tVar.a("onpageappear", this);
        tVar.a("onpagedisappear", this);
    }

    private void watchPageLifecycle() {
        o.t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6782793", new Object[]{this});
            return;
        }
        if (akt.i2()) {
            tVar = this.node.P().d0().T();
        } else {
            tVar = this.node.T();
        }
        tVar.b("onpageappear", this);
        tVar.b("onpagedisappear", this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void bindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56398a64", new Object[]{this});
            return;
        }
        super.bindEvent();
        if (getComponentClickListener() == null && !((i) this.viewParams).z0) {
            ViewProxy.setOnClickListener(this.view, new a());
            ViewProxy.setOnTouchListener(this.view, new b());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void calculateLayout(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281c58f7", new Object[]{this, new Float(f2), new Float(f3)});
            return;
        }
        yk9 yk9Var = this.containerFlexNode;
        if (yk9Var != null) {
            yk9Var.s(f2, f3);
        } else {
            super.calculateLayout(f2, f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        g gVar = this.animationDialog;
        if (gVar != null) {
            gVar.dismiss();
        } else {
            PopupWindow popupWindow = this.window;
            if (popupWindow != null) {
                popupWindow.dismiss();
            } else {
                h hVar = this.mPopLayerAnimation;
                if (hVar != 0) {
                    hVar.c(getView(), new c());
                }
            }
        }
        nwv.y0(new d());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public jfw generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfw) ipChange.ipc$dispatch("c0ace32c", new Object[]{this});
        }
        return new i(this);
    }

    public h getPopAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("e39092b3", new Object[]{this});
        }
        return this.mPopLayerAnimation;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onAfterAddToLayoutTree(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d5828a", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (getFlexBoxNode().C() == YogaPositionType.ABSOLUTE) {
            if (this.containerFlexNode == null) {
                this.containerFlexNode = yk9.w();
            }
            o.y c0 = this.node.c0();
            this.containerFlexNode.R(c0.m());
            this.containerFlexNode.O(c0.l());
            getFlexBoxNode().o(this.containerFlexNode, 0);
        }
        return z;
    }

    @Override // tb.zr7, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        PopLayerContainerView popLayerContainerView = new PopLayerContainerView(context);
        popLayerContainerView.bindComponent(this);
        return popLayerContainerView;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        dismiss();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        return onHandleTNodeMessage(gVar.b, gVar.c, gVar.d, null, gVar.e, gVar.g);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
        } else {
            watchPageLifecycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        g gVar = this.animationDialog;
        if (gVar != null) {
            gVar.c();
            return;
        }
        h hVar = this.mPopLayerAnimation;
        if (hVar != 0) {
            hVar.d(getView());
        }
    }

    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            this.src = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public void showInTargetView(FlatViewGroup flatViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506b442", new Object[]{this, flatViewGroup});
            return;
        }
        this.canBeDrag = false;
        this.anchorView = flatViewGroup;
        flatViewGroup.addPopLayerView(getNode(), getFlexBoxNode().D());
        h hVar = new h(gz0.b(((i) this.viewParams).w0), gz0.c(((i) this.viewParams).w0), false);
        this.mPopLayerAnimation = hVar;
        hVar.e(getView(), null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public View f12070a;
        public h b;
        public boolean c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements h.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.h.c
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("beddf223", new Object[]{this});
                } else {
                    g.a(g.this);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                } else {
                    g.b(g.this);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }
        }

        static {
            t2o.a(503316782);
        }

        public g(PopLayerComponent popLayerComponent, Context context, int i) {
            super(context, i);
        }

        public static /* synthetic */ void a(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d72322c", new Object[]{gVar});
            } else {
                super.dismiss();
            }
        }

        public static /* synthetic */ void b(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3679f72d", new Object[]{gVar});
            } else {
                super.dismiss();
            }
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1373052399:
                    super.dismiss();
                    return null;
                case -340027132:
                    super.show();
                    return null;
                case 921927566:
                    super.setContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                    return null;
                case 1683598447:
                    super.setContentView((View) objArr[0]);
                    return null;
                case 1770587104:
                    super.setContentView(((Number) objArr[0]).intValue());
                    return null;
                case 2075560917:
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/PopLayerComponent$AnimationDialog");
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            } else {
                this.b.d(this.f12070a);
            }
        }

        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1147b7c2", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public void dismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            } else {
                this.b.c(this.f12070a, new a());
            }
        }

        @Override // android.app.Dialog, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (this.c && !dispatchTouchEvent && (this.f12070a.getContext() instanceof Activity)) {
                ((Activity) this.f12070a.getContext()).dispatchTouchEvent(motionEvent);
            }
            return dispatchTouchEvent;
        }

        public void e(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61a23336", new Object[]{this, hVar});
            } else {
                this.b = hVar;
            }
        }

        @Override // android.app.Dialog
        public void setContentView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
                return;
            }
            super.setContentView(view);
            this.f12070a = view;
        }

        @Override // android.app.Dialog
        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
                return;
            }
            super.show();
            this.b.e(this.f12070a, null);
        }

        @Override // android.app.Dialog
        public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
                return;
            }
            super.setContentView(view, layoutParams);
            this.f12070a = view;
        }

        @Override // android.app.Dialog
        public void setContentView(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
                return;
            }
            super.setContentView(i);
            this.f12070a = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean x0;
        public String w0 = "bottom";
        public boolean y0 = true;
        public boolean z0 = false;
        public String A0 = "";

        static {
            t2o.a(503316789);
        }

        public i(PopLayerComponent popLayerComponent) {
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == -998046064) {
                super.B((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/PopLayerComponent$PopLayerViewParams");
        }

        @Override // tb.jfw
        public void B(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
                return;
            }
            super.B(context, hashMap);
            Object obj = hashMap.get("pop-direction");
            if (obj != null) {
                this.w0 = (String) obj;
            }
            if ("bottom".equals(this.w0)) {
                this.x0 = nwv.o(hashMap.get("drop-down"), true);
            }
            this.y0 = nwv.o(hashMap.get("enable-dim"), true);
            this.A0 = nwv.I(hashMap.get("soft-input-mode"), "");
            this.z0 = nwv.o(hashMap.get("enable-transfer-event"), false);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        str.hashCode();
        if (!str.equals("onpagedisappear")) {
            if (str.equals("onpageappear") && sendPageLifeCycleMessage(nVar, map)) {
                sendMessage(130, this.node, "onpageappear", null, null, null);
            }
        } else if (sendPageLifeCycleMessage(nVar, map)) {
            sendMessage(130, this.node, "onpagedisappear", null, null, null);
        }
        return false;
    }

    private boolean sendPageLifeCycleMessage(n nVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6add8232", new Object[]{this, nVar, map})).booleanValue();
        }
        if (nVar == this.node) {
            return false;
        }
        if (akt.p2("fixPopLayerLifecycleMsg", true)) {
            return TextUtils.equals(nwv.I(map.get("type"), "page"), "page");
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void show(android.view.View r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.show(android.view.View, boolean):void");
    }
}
