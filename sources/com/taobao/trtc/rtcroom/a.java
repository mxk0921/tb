package com.taobao.trtc.rtcroom;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.taobao.R;
import com.taobao.trtc.utils.TrtcLog;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.aio;
import tb.bio;
import tb.t2o;
import tb.tmu;
import tb.upr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_FLOATING_WINDOW_BORDER_COLOR = -186032;
    public static final int DEFAULT_FLOATING_WINDOW_BORDER_MARGIN = 12;
    public static final int DEFAULT_FLOATING_WINDOW_BORDER_RADIUS = 0;
    public static final int DEFAULT_FLOATING_WINDOW_BORDER_WIDTH = 0;
    public static final int DEFAULT_FLOATING_WINDOW_CLOSE_ICON_DIAMETER = 18;
    public static final int DEFAULT_FLOATING_WINDOW_CLOSE_MARGIN = 6;
    public static final int DEFAULT_FLOATING_WINDOW_HEIGHT = 173;
    public static final int DEFAULT_FLOATING_WINDOW_WIDTH = 96;

    /* renamed from: a  reason: collision with root package name */
    public final bio f13955a;
    public final aio b;
    public CardView c;
    public ImageView d;
    public final Activity e;
    public WindowManager.LayoutParams f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public final AtomicBoolean n = new AtomicBoolean(false);
    public f o;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.trtc.rtcroom.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class View$OnClickListenerC0787a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0787a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            tmu.f("FloatWindowController", "close float window for manual");
            a.this.q("clickClose");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a.this.q("clickMiniWindow");
            if (a.a(a.this) != null) {
                tmu.f("FloatWindowController", "clickMiniWindow, finish other activity");
                a.a(a.this).onMiniWindowClicked();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                a aVar = a.this;
                a.d(aVar, a.f(aVar, motionEvent.getRawX()));
                a aVar2 = a.this;
                a.h(aVar2, a.j(aVar2, motionEvent.getRawY()));
            } else if (action == 1) {
                a.n(a.this);
                if (Math.abs(motionEvent.getRawX() - a.b(a.this)) > 10.0f || Math.abs(motionEvent.getRawY() - a.g(a.this)) > 10.0f) {
                    return true;
                }
            } else if (action == 2) {
                WindowManager.LayoutParams k = a.k(a.this);
                k.x = (int) (k.x + (motionEvent.getRawX() - a.e(a.this)));
                WindowManager.LayoutParams k2 = a.k(a.this);
                k2.y = (int) (k2.y + (motionEvent.getRawY() - a.i(a.this)));
                a.l(a.this).getWindowManager().updateViewLayout(a.m(a.this), a.k(a.this));
                a.f(a.this, motionEvent.getRawX());
                a.j(a.this, motionEvent.getRawY());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/rtcroom/FloatWindowController$4");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), a.o(a.this).h);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WindowManager.LayoutParams f13960a;

        public e(WindowManager.LayoutParams layoutParams) {
            this.f13960a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                a.c(a.this, ((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f13960a.y);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f13961a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public float h;
        public int i;
        public int j;

        static {
            t2o.a(395313602);
        }
    }

    static {
        t2o.a(395313596);
    }

    public a(Activity activity, bio bioVar, aio aioVar) {
        TrtcLog.h("FloatWindowController", "CTOR");
        this.f13955a = bioVar;
        this.b = aioVar;
        this.e = activity;
    }

    public static /* synthetic */ aio a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aio) ipChange.ipc$dispatch("b4e1407", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ float b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3433f933", new Object[]{aVar})).floatValue();
        }
        return aVar.l;
    }

    public static /* synthetic */ void c(a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44ef4b5", new Object[]{aVar, new Integer(i), new Integer(i2)});
        } else {
            aVar.x(i, i2);
        }
    }

    public static /* synthetic */ float d(a aVar, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cc0f9cf", new Object[]{aVar, new Float(f2)})).floatValue();
        }
        aVar.l = f2;
        return f2;
    }

    public static /* synthetic */ float e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e4f77d2", new Object[]{aVar})).floatValue();
        }
        return aVar.j;
    }

    public static /* synthetic */ float f(a aVar, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96154f10", new Object[]{aVar, new Float(f2)})).floatValue();
        }
        aVar.j = f2;
        return f2;
    }

    public static /* synthetic */ float g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686af671", new Object[]{aVar})).floatValue();
        }
        return aVar.m;
    }

    public static /* synthetic */ float h(a aVar, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf69a451", new Object[]{aVar, new Float(f2)})).floatValue();
        }
        aVar.m = f2;
        return f2;
    }

    public static /* synthetic */ float i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82867510", new Object[]{aVar})).floatValue();
        }
        return aVar.k;
    }

    public static /* synthetic */ float j(a aVar, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8bdf992", new Object[]{aVar, new Float(f2)})).floatValue();
        }
        aVar.k = f2;
        return f2;
    }

    public static /* synthetic */ WindowManager.LayoutParams k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("bbd977cf", new Object[]{aVar});
        }
        return aVar.f;
    }

    public static /* synthetic */ Activity l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("fdd82f0a", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ CardView m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardView) ipChange.ipc$dispatch("ae293582", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ void n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf46f9c", new Object[]{aVar});
        } else {
            aVar.t();
        }
    }

    public static /* synthetic */ f o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("8d55142a", new Object[]{aVar});
        }
        return aVar.o;
    }

    public final boolean p(Class cls, String str, boolean z) {
        Field[] declaredFields;
        if (cls == null || TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (str.equals(field.getName()) && Modifier.isStatic(field.getModifiers()) && field.getType() == Boolean.TYPE) {
                        try {
                            tmu.f("FloatWindowController", "[FloattingWindow] set " + str + " from " + field.get(null) + " to " + z);
                            field.set(null, Boolean.valueOf(z));
                        } catch (Throwable unused) {
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee1717e9", new Object[]{this, str})).booleanValue();
        }
        tmu.f("FloatWindowController", "close float window for: " + str);
        if (!this.n.get() || this.e == null) {
            u();
            TrtcLog.i("FloatWindowController", "float window not started or var error");
            return false;
        }
        this.n.set(false);
        WindowManager windowManager = this.e.getWindowManager();
        if (windowManager != null) {
            windowManager.removeView(this.c);
        }
        View w = this.f13955a.w();
        if (w != null) {
            this.c.removeView(w);
            this.f13955a.t(w, false);
        }
        ImageView imageView = this.d;
        if (imageView != null) {
            this.c.removeView(imageView);
        }
        u();
        return true;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            u();
        }
    }

    public final void t() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58d6771", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f;
        int i2 = layoutParams.x;
        int i3 = layoutParams.width;
        int i4 = (i3 / 2) + i2;
        int i5 = this.h;
        if (i4 >= i5 / 2) {
            i = (i5 - i3) - this.g;
        } else {
            i = this.g;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new e(layoutParams));
        ofInt.start();
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e181c5fe", new Object[]{this});
        } else {
            p(upr.class, "canShowMiniLive", true);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29181eb", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.e).sendBroadcast(new Intent("action.com.taobao.taolive.room.start"));
        p(upr.class, "canShowMiniLive", false);
    }

    public final void x(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8ec3e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f;
        layoutParams.x = i;
        layoutParams.y = i2;
        try {
            this.e.getWindowManager().updateViewLayout(this.c, this.f);
        } catch (Exception unused) {
        }
    }

    public boolean s(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dd0a34a", new Object[]{this, fVar})).booleanValue();
        }
        Activity activity = this.e;
        if (activity == null || this.f13955a == null || this.b == null) {
            TrtcLog.i("FloatWindowController", "init failed: var error");
            return false;
        }
        this.o = fVar;
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        this.h = displayMetrics.widthPixels;
        this.i = displayMetrics.heightPixels;
        this.g = fVar.e;
        CardView cardView = new CardView(this.e);
        this.c = cardView;
        if (fVar.g > 0) {
            cardView.setCardBackgroundColor(fVar.f);
            CardView cardView2 = this.c;
            int i = fVar.g;
            cardView2.setContentPadding(i, i, i, i);
            this.c.setRadius(fVar.h);
            this.c.setPreventCornerOverlap(true);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fVar.f13961a, fVar.b);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        this.c.setLayoutParams(layoutParams);
        this.d = new ImageView(this.e);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1728053248);
        gradientDrawable.setShape(1);
        this.d.setBackground(gradientDrawable);
        this.d.setImageResource(R.drawable.float_close);
        this.d.setClickable(true);
        this.d.setOnClickListener(new View$OnClickListenerC0787a());
        this.c.setClickable(true);
        this.c.setOnClickListener(new b());
        this.c.setOnTouchListener(new c());
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
        this.f = layoutParams2;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams2.type = 2038;
        } else {
            layoutParams2.type = 2002;
        }
        layoutParams2.format = -3;
        layoutParams2.flags = 8;
        layoutParams2.gravity = 51;
        int i2 = fVar.f13961a;
        layoutParams2.width = i2;
        int i3 = fVar.b;
        layoutParams2.height = i3;
        layoutParams2.x = (this.h - i2) - fVar.c;
        layoutParams2.y = (this.i - i3) - fVar.d;
        tmu.f("FloatWindowController", "init, float window size: " + fVar.f13961a + "x" + fVar.b + ", borderMargin: " + fVar.e + ", borderClolor: " + Integer.toHexString(fVar.f) + ", borderWidth: " + fVar.g + ", borderRadius: " + fVar.h);
        return true;
    }

    public boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57d98f84", new Object[]{this, str})).booleanValue();
        }
        if (this.f == null || this.e == null || this.c == null || this.n.get()) {
            TrtcLog.j("FloatWindowController", "float window already started or var error");
            return false;
        }
        tmu.f("FloatWindowController", "start float window for: " + str);
        View w = this.f13955a.w();
        if (w != null) {
            this.f13955a.t(w, true);
            w.setOutlineProvider(new d());
            w.setClipToOutline(true);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            this.c.setLayoutParams(layoutParams);
            this.c.addView(w);
        }
        if (this.d != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 53;
            f fVar = this.o;
            int i = fVar.i;
            layoutParams2.height = i;
            layoutParams2.width = i;
            int i2 = fVar.j;
            layoutParams2.rightMargin = i2;
            layoutParams2.topMargin = i2;
            this.c.addView(this.d, layoutParams2);
        }
        try {
            WindowManager windowManager = this.e.getWindowManager();
            if (windowManager != null) {
                windowManager.addView(this.c, this.f);
            }
            this.n.set(true);
            w();
            return true;
        } catch (Throwable th) {
            TrtcLog.i("FloatWindowController", "showFloatWindow, t: " + th.getMessage());
            return false;
        }
    }
}
