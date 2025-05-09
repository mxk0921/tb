package com.alibaba.security.realidentity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.uc.crashsdk.export.LogType;
import java.lang.reflect.InvocationTargetException;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2681a = "e";
    public static final int b = 65536;
    public static final int c = 256;
    public static final int d = 512;
    public static final int e = 1024;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2682a;
        public final /* synthetic */ Animation.AnimationListener b;

        public a(View view, Animation.AnimationListener animationListener) {
            this.f2682a = view;
            this.b = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            this.f2682a.setVisibility(0);
            this.f2682a.setAlpha(1.0f);
            this.f2682a.clearAnimation();
            Animation.AnimationListener animationListener = this.b;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
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
            } else {
                this.f2682a.setVisibility(0);
            }
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue() : (Math.min(b(context), d(context)) / 2) - a(context, 50.0f);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x0020
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    public static boolean e(android.content.Context r3) {
        /*
            r0 = 0
            r3.getClassLoader()
            r3 = move-result
            java.lang.String r1 = "com.huawei.android.util.HwNotchSizeUtil"
            r3.loadClass(r1)
            r3 = move-result
            java.lang.String r1 = "hasNotchInScreen"
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r3.getMethod(r1, r2)
            r1 = move-result
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1.invoke(r3, r2)
            r3 = move-result
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            r3 = move-result
            return r3
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.e.e(android.content.Context):boolean");
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue();
        }
        if (context == null || context.getPackageManager() == null || !SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(Build.MANUFACTURER) || !context.getPackageManager().hasSystemFeature("com.hihonor.hardware.sensor.posture")) {
            return false;
        }
        return true;
    }

    public static boolean h(Context context) {
        Resources resources;
        Configuration configuration;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{context})).booleanValue();
        }
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return false;
        }
        String configuration2 = configuration.toString();
        if (configuration2.contains("hwMultiwindow-magic") || configuration2.contains("hw-magic-windows")) {
            return true;
        }
        return false;
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue();
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null || context.getResources().getConfiguration().screenWidthDp < 600) {
            return false;
        }
        return true;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean f(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0)).intValue() == 1;
        } catch (Exception e2) {
            com.alibaba.security.realidentity.a.a(f2681a, e2);
            return false;
        }
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void b(Window window) {
        try {
            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(window, Integer.valueOf((int) LogType.UNEXP_OTHER));
        } catch (Exception unused) {
        }
    }

    public static void a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb0489", new Object[]{activity, new Integer(i)});
            return;
        }
        if (i >= 0 && i <= 255) {
            try {
                WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                attributes.screenBrightness = i / 255.0f;
                activity.getWindow().setAttributes(attributes);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Window window) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            try {
                Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
                cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 65536);
            } catch (Exception unused) {
            }
        }
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static void a(View view, boolean z) {
        if (view != null && Build.VERSION.SDK_INT > 28) {
            try {
                view.getClass().getMethod("setForceDarkAllowed", Boolean.TYPE).invoke(view, Boolean.valueOf(z));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | Exception unused) {
            }
        }
    }

    public static void a(View view, float f, float f2, int i, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d92085", new Object[]{view, new Float(f), new Float(f2), new Integer(i), animationListener});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setFillBefore(true);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(i);
        alphaAnimation.setAnimationListener(animationListener);
        view.startAnimation(alphaAnimation);
    }

    public static void a(View view, int i, Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782a7605", new Object[]{view, new Integer(i), animationListener});
        } else if (view != null) {
            try {
                a(view, 0.0f, 1.0f, i, new a(view, animationListener));
            } catch (Throwable unused) {
            }
        }
    }
}
