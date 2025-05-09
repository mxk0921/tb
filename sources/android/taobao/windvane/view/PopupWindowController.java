package android.taobao.windvane.view;

import android.content.Context;
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
import java.util.concurrent.atomic.AtomicBoolean;
import tb.jrw;
import tb.t2o;
import tb.tkt;
import tb.wmc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PopupWindowController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1823a;
    public final View b;
    public final AtomicBoolean c;
    public PopupWindow d;
    public FrameLayout e;
    public LinearLayout f;
    public final Animation g;
    public final int h;
    public boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Button f1824a;

        public a(Button button) {
            this.f1824a = button;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int top = PopupWindowController.b(PopupWindowController.this).getTop();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 1 && y < top) {
                this.f1824a.performClick();
            }
            return true;
        }
    }

    static {
        t2o.a(989856452);
    }

    public PopupWindowController(Context context, View view, String[] strArr, View.OnClickListener onClickListener) {
        this(context, view, null, strArr, onClickListener);
    }

    public static /* synthetic */ int a(PopupWindowController popupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac82daa7", new Object[]{popupWindowController})).intValue();
        }
        return popupWindowController.h;
    }

    public static /* synthetic */ LinearLayout b(PopupWindowController popupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("3687874c", new Object[]{popupWindowController});
        }
        return popupWindowController.f;
    }

    public static /* synthetic */ PopupWindow c(PopupWindowController popupWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("6843ebe", new Object[]{popupWindowController});
        }
        return popupWindowController.d;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.d = null;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.c.get()) {
            if (!this.d.isShowing()) {
                this.c.compareAndSet(true, false);
            }
            this.d.dismiss();
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300cdb2b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = z;
        e();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866df13", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = new PopupWindow(this.f1823a);
        this.d = popupWindow;
        popupWindow.setContentView(this.e);
        this.d.setWidth(-1);
        this.d.setHeight(-1);
        this.d.setFocusable(true);
        this.d.setOutsideTouchable(true);
        this.d.setBackgroundDrawable(new ColorDrawable(2130706432));
        this.d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: android.taobao.windvane.view.PopupWindowController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                } else if (PopupWindowController.this.c.compareAndSet(true, false)) {
                    PopupWindowController popupWindowController = PopupWindowController.this;
                    if (popupWindowController.i) {
                        popupWindowController.i = false;
                        return;
                    }
                    View childAt = PopupWindowController.b(popupWindowController).getChildAt(PopupWindowController.a(PopupWindowController.this));
                    if (childAt != null) {
                        childAt.performClick();
                    }
                    PopupWindowController.c(PopupWindowController.this).dismiss();
                }
            }
        });
    }

    public PopupWindowController(Context context, View view, String str, String[] strArr, View.OnClickListener onClickListener) {
        this.c = new AtomicBoolean(false);
        this.h = 4;
        this.f1823a = context;
        this.b = view;
        g(str, strArr, onClickListener);
        h();
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        this.g = translateAnimation;
        translateAnimation.setDuration(250L);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (this.c.compareAndSet(false, true)) {
            try {
                this.d.showAtLocation(this.b, 81, 0, 0);
                this.f.startAnimation(this.g);
                this.d.update();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void g(String str, String[] strArr, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4518595c", new Object[]{this, str, strArr, onClickListener});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f1823a);
        this.e = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this.f1823a);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.f.setLayoutParams(layoutParams);
        this.f.setBackgroundColor(tkt.DEFAULT_SHADOW_COLOR);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            Button button = new Button(this.f1823a);
            button.setText(str);
            button.setBackgroundColor(-657931);
            button.setTextColor(tkt.DEFAULT_SHADOW_COLOR);
            button.setLayoutParams(layoutParams2);
            this.f.addView(button);
            TextView textView = new TextView(this.f1823a);
            textView.setHeight(4);
            this.f.addView(textView);
        }
        if (strArr != null) {
            for (String str2 : strArr) {
                Button button2 = new Button(this.f1823a);
                button2.setText(str2);
                button2.setTag(str2);
                button2.setBackgroundColor(-657931);
                button2.setTextColor(-16777216);
                button2.setLayoutParams(layoutParams2);
                button2.setOnClickListener(onClickListener);
                this.f.addView(button2);
                TextView textView2 = new TextView(this.f1823a);
                textView2.setHeight(2);
                this.f.addView(textView2);
            }
        }
        Button button3 = new Button(this.f1823a);
        button3.setText(jrw.a(wmc.CANCEL));
        button3.setBackgroundColor(-657931);
        button3.setTextColor(tkt.DEFAULT_SHADOW_COLOR);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = 4;
        button3.setLayoutParams(layoutParams3);
        this.f.addView(button3);
        this.e.addView(this.f);
        button3.setOnClickListener(onClickListener);
        this.e.setOnTouchListener(new a(button3));
    }
}
