package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.s6o;
import tb.t2o;
import tb.tkt;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodePopupWindowController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12394a;
    public final View b;
    public PopupWindow c;
    public FrameLayout d;
    public LinearLayout e;
    public final Animation f;
    public final Animation g;
    public final int i;
    public final View.OnClickListener j;
    public final View.OnClickListener k;
    public boolean h = true;
    public final View.OnClickListener l = new b();
    public final View.OnClickListener m = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                TNodePopupWindowController.a(TNodePopupWindowController.this).dismiss();
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TNodePopupWindowController.f(TNodePopupWindowController.this) != null) {
                TNodePopupWindowController.f(TNodePopupWindowController.this).onClick(view);
                TNodePopupWindowController.this.i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (TNodePopupWindowController.g(TNodePopupWindowController.this) != null) {
                TNodePopupWindowController.g(TNodePopupWindowController.this).onClick(view);
            }
            TNodePopupWindowController.this.i();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MaxHeightScrollView f12398a;

        public d(MaxHeightScrollView maxHeightScrollView) {
            this.f12398a = maxHeightScrollView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int top = this.f12398a.getTop();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 1 && y < top) {
                TNodePopupWindowController.h(TNodePopupWindowController.this).onClick(view);
            }
            return true;
        }
    }

    static {
        t2o.a(503317503);
    }

    public TNodePopupWindowController(Context context, View view, String str, String[] strArr, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.i = 4;
        this.f12394a = context;
        this.b = view;
        this.j = onClickListener;
        this.k = onClickListener2;
        this.i = strArr.length;
        j(str, strArr, onClickListener, onClickListener2);
        k();
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f = translateAnimation;
        translateAnimation.setDuration(250L);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 0.0f, 1, 1.0f);
        this.g = translateAnimation2;
        translateAnimation2.setDuration(250L);
    }

    public static /* synthetic */ PopupWindow a(TNodePopupWindowController tNodePopupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("4bc802f1", new Object[]{tNodePopupWindowController});
        }
        return tNodePopupWindowController.c;
    }

    public static /* synthetic */ boolean b(TNodePopupWindowController tNodePopupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea8cca68", new Object[]{tNodePopupWindowController})).booleanValue();
        }
        return tNodePopupWindowController.h;
    }

    public static /* synthetic */ boolean c(TNodePopupWindowController tNodePopupWindowController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb3b8fb2", new Object[]{tNodePopupWindowController, new Boolean(z)})).booleanValue();
        }
        tNodePopupWindowController.h = z;
        return z;
    }

    public static /* synthetic */ int d(TNodePopupWindowController tNodePopupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb5b48d8", new Object[]{tNodePopupWindowController})).intValue();
        }
        return tNodePopupWindowController.i;
    }

    public static /* synthetic */ LinearLayout e(TNodePopupWindowController tNodePopupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("12da43bd", new Object[]{tNodePopupWindowController});
        }
        return tNodePopupWindowController.e;
    }

    public static /* synthetic */ View.OnClickListener f(TNodePopupWindowController tNodePopupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("377ebf90", new Object[]{tNodePopupWindowController});
        }
        return tNodePopupWindowController.j;
    }

    public static /* synthetic */ View.OnClickListener g(TNodePopupWindowController tNodePopupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("6665dd1", new Object[]{tNodePopupWindowController});
        }
        return tNodePopupWindowController.k;
    }

    public static /* synthetic */ View.OnClickListener h(TNodePopupWindowController tNodePopupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("d54dfc12", new Object[]{tNodePopupWindowController});
        }
        return tNodePopupWindowController.m;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.h = false;
        this.e.startAnimation(this.g);
        this.g.setAnimationListener(new a());
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866df13", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = new PopupWindow(this.f12394a);
        this.c = popupWindow;
        popupWindow.setContentView(this.d);
        this.c.setWidth(-1);
        this.c.setHeight(-1);
        this.c.setFocusable(true);
        this.c.setOutsideTouchable(true);
        this.c.setBackgroundDrawable(new ColorDrawable(2130706432));
        this.c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.flexbox.layoutmanager.view.TNodePopupWindowController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else if (TNodePopupWindowController.b(TNodePopupWindowController.this)) {
                    View childAt = TNodePopupWindowController.e(TNodePopupWindowController.this).getChildAt(TNodePopupWindowController.d(TNodePopupWindowController.this));
                    if (childAt != null) {
                        childAt.performClick();
                    }
                } else {
                    TNodePopupWindowController.c(TNodePopupWindowController.this, true);
                }
            }
        });
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            this.c.showAtLocation(this.b, 81, 0, 0);
            this.e.startAnimation(this.f);
            this.c.update();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void j(String str, String[] strArr, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e0095d", new Object[]{this, str, strArr, onClickListener, onClickListener2});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f12394a);
        this.d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        MaxHeightScrollView maxHeightScrollView = new MaxHeightScrollView(this.f12394a);
        maxHeightScrollView.setMaxHeight(s6o.m() - s6o.g(this.f12394a));
        LinearLayout linearLayout = new LinearLayout(this.f12394a);
        this.e = linearLayout;
        linearLayout.setOrientation(1);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.e.setBackgroundColor(tkt.DEFAULT_SHADOW_COLOR);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            Button button = new Button(this.f12394a);
            button.setText(str);
            button.setBackgroundColor(-1);
            button.setTextColor(Color.parseColor("#999999"));
            button.setLayoutParams(layoutParams);
            this.e.addView(button);
            TextView textView = new TextView(this.f12394a);
            textView.setBackgroundColor(Color.parseColor("#f4f4f4"));
            textView.setHeight(2);
            this.e.addView(textView);
        }
        if (strArr != null) {
            for (String str2 : strArr) {
                Button button2 = new Button(this.f12394a);
                button2.setText(str2);
                button2.setTag(str2);
                button2.setBackgroundColor(-1);
                button2.setTextColor(Color.parseColor("#666666"));
                button2.setLayoutParams(layoutParams);
                button2.setOnClickListener(this.l);
                this.e.addView(button2);
                TextView textView2 = new TextView(this.f12394a);
                textView2.setBackgroundColor(Color.parseColor("#f4f4f4"));
                textView2.setHeight(2);
                this.e.addView(textView2);
            }
        }
        Button button3 = new Button(this.f12394a);
        button3.setText(wmc.CANCEL);
        button3.setBackgroundColor(-1);
        button3.setTextColor(Color.parseColor("#999999"));
        button3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.e.addView(button3);
        maxHeightScrollView.addView(this.e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        this.d.addView(maxHeightScrollView, layoutParams2);
        button3.setOnClickListener(this.m);
        this.d.setOnTouchListener(new d(maxHeightScrollView));
    }
}
