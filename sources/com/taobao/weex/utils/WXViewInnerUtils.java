package com.taobao.weex.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.flat.widget.Widget;
import com.taobao.weex.ui.flat.widget.WidgetGroup;
import com.taobao.weex.ui.view.border.BorderDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXViewInnerUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIMENSION_UNSET = -1;
    @Deprecated
    public static final int OPAQUE = -1;
    @Deprecated
    public static final int TRANSLUCENT = -3;
    @Deprecated
    public static final int TRANSPARENT = -2;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface Opacity {
    }

    static {
        t2o.a(985661833);
        new AtomicInteger(1);
    }

    public static boolean a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f73a39d2", new Object[]{canvas})).booleanValue();
        }
        return true;
    }

    public static boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5a1d0b7", new Object[]{view})).booleanValue();
        }
        if (Build.VERSION.SDK_INT != 24) {
            return true;
        }
        return false;
    }

    public static boolean c(View view, BorderDrawable borderDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b23dadc6", new Object[]{view, borderDrawable})).booleanValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getBackground() instanceof BorderDrawable) {
                    ((BorderDrawable) childAt.getBackground()).hasImage();
                }
            }
        }
        return true;
    }

    public static void clipCanvasWithinBorderBox(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd05ac6", new Object[]{view, canvas});
        } else if (a(canvas) && b(view)) {
            Drawable background = view.getBackground();
            if (background instanceof BorderDrawable) {
                BorderDrawable borderDrawable = (BorderDrawable) background;
                if (borderDrawable.isRounded() && c(view, borderDrawable)) {
                    canvas.clipPath(borderDrawable.getContentPath(new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight())));
                }
            }
        }
    }

    public static boolean d(Widget widget, BorderDrawable borderDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17f36b30", new Object[]{widget, borderDrawable})).booleanValue();
        }
        if (widget instanceof WidgetGroup) {
            for (Widget widget2 : ((WidgetGroup) widget).getChildren()) {
                widget2.getBackgroundAndBorder().hasImage();
            }
        }
        return true;
    }

    public static int dip2px(float f) {
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        try {
            f2 = WXEnvironment.getApplication().getResources().getDisplayMetrics().density;
        } catch (Exception e) {
            WXLogUtils.e("[WXViewUtils] dip2px:", e);
            f2 = 2.0f;
        }
        float f3 = (f * f2) + 0.5f;
        if (f3 <= 0.0f || f3 >= 1.0f) {
            return (int) f3;
        }
        return 1;
    }

    public static int generateViewId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ed9c66f", new Object[0])).intValue();
        }
        return View.generateViewId();
    }

    public static BorderDrawable getBorderDrawable(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderDrawable) ipChange.ipc$dispatch("93756039", new Object[]{view});
        }
        Drawable background = view.getBackground();
        if (background instanceof BorderDrawable) {
            return (BorderDrawable) background;
        }
        if (!(background instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) background;
        if (layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        Drawable drawable = layerDrawable.getDrawable(0);
        if (drawable instanceof BorderDrawable) {
            return (BorderDrawable) drawable;
        }
        return null;
    }

    public static int getOpacityFromColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47f844b", new Object[]{new Integer(i)})).intValue();
        }
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        if (i2 == 0) {
            return -2;
        }
        return -3;
    }

    @Deprecated
    public static float getRealPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a42f8b16", new Object[]{new Float(f)})).floatValue() : getRealPxByWidth(f, 750);
    }

    @Deprecated
    public static float getRealPxByWidth2(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8dc8daa", new Object[]{new Float(f)})).floatValue() : getRealPxByWidth2(f, 750);
    }

    @Deprecated
    public static float getRealSubPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e7b328e", new Object[]{new Float(f)})).floatValue() : getRealSubPxByWidth(f, 750);
    }

    public static float getScale(WXSDKInstance wXSDKInstance) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("191cbc63", new Object[]{wXSDKInstance})).floatValue();
        }
        if (wXSDKInstance == null) {
            context = WXEnvironment.sApplication;
        } else {
            context = wXSDKInstance.getContext();
        }
        return (getScreenWidth(wXSDKInstance, context) / 750.0f) / getScreenDensity(WXEnvironment.sApplication);
    }

    public static float getScreenDensity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb371fab", new Object[]{context})).floatValue();
        }
        if (context == null) {
            return 3.0f;
        }
        try {
            return context.getResources().getDisplayMetrics().density;
        } catch (Exception e) {
            WXLogUtils.e("getScreenDensityDpi exception:" + e.getMessage());
            return 3.0f;
        }
    }

    public static int getScreenHeight(WXSDKInstance wXSDKInstance, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ac9b0bd", new Object[]{wXSDKInstance, context})).intValue();
        }
        if (wXSDKInstance == null) {
            return WXViewUtils.getScreenHeight(context);
        }
        Rect I = wXSDKInstance.I();
        if (I != null) {
            return I.height();
        }
        if (wXSDKInstance.k0()) {
            return WXViewUtils.getFullScreenHeight(context);
        }
        return WXViewUtils.getScreenHeight(context);
    }

    public static int getScreenWidth(WXSDKInstance wXSDKInstance, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("834e1698", new Object[]{wXSDKInstance, context})).intValue();
        }
        if (wXSDKInstance == null) {
            return WXViewUtils.getScreenWidth(context);
        }
        Rect I = wXSDKInstance.I();
        if (I == null) {
            return WXViewUtils.getScreenWidth(context);
        }
        return I.width();
    }

    @Deprecated
    public static float getWebPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab7eba0", new Object[]{new Float(f)})).floatValue() : getWebPxByWidth(f, 750);
    }

    public static int getWeexHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd9cb882", new Object[]{str})).intValue();
        }
        WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(str);
        if (sDKInstance == null) {
            return -3;
        }
        int weexHeight = sDKInstance.getWeexHeight();
        if (weexHeight >= 0 || weexHeight == -2) {
            return weexHeight;
        }
        return getScreenHeight(sDKInstance, sDKInstance.getContext());
    }

    @Deprecated
    public static float getWeexPxByReal(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62085835", new Object[]{new Float(f)})).floatValue() : getWeexPxByReal(f, 750);
    }

    public static int getWeexWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cc27cd3", new Object[]{str})).intValue();
        }
        WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(str);
        if (sDKInstance == null) {
            return -3;
        }
        int weexWidth = sDKInstance.getWeexWidth();
        if (weexWidth >= 0 || weexWidth == -2) {
            return weexWidth;
        }
        return getScreenWidth(sDKInstance, sDKInstance.getContext());
    }

    public static boolean isViewVisible(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5539870c", new Object[]{view})).booleanValue();
        }
        if (view == null || !view.isAttachedToWindow() || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background != null && background.getAlpha() <= 0) {
            return false;
        }
        return true;
    }

    public static int multiplyColorAlpha(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2025c0d9", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static boolean onScreenArea(View view) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9c7cf97", new Object[]{view})).booleanValue();
        }
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = view.getHeight();
        }
        int i2 = iArr[1];
        if (i2 <= 0 || i2 - WXViewUtils.getScreenHeight(WXEnvironment.sApplication) >= 0) {
            int i3 = iArr[1];
            if (i + i3 <= 0 || i3 > 0) {
                return false;
            }
        }
        return true;
    }

    public static float safeGetRadio(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ac67e45", new Object[]{wXSDKInstance})).floatValue();
        }
        if (wXSDKInstance == null) {
            return 1.0f;
        }
        return (wXSDKInstance.T() * getScreenDensity(wXSDKInstance.getContext())) / 2.0f;
    }

    public static void setBackGround(View view, Drawable drawable, WXComponent wXComponent) {
        WXErrorCode wXErrorCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcbb764", new Object[]{view, drawable, wXComponent});
            return;
        }
        try {
            view.setBackground(drawable);
        } catch (Exception unused) {
            if (wXComponent != null) {
                WXExceptionUtils.commitCriticalExceptionRT(wXComponent.getInstanceId(), WXErrorCode.WX_RENDER_ERR_TEXTURE_SETBACKGROUND, wXComponent.getComponentType() + " setBackGround for android view", wXErrorCode.getErrorMsg() + ": TextureView doesn't support displaying a background drawable!", null);
            }
        }
    }

    public static void updateApplicationScreen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6f11ee", new Object[]{context});
        } else if (context != null && WXEnvironment.sApplication != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            DisplayMetrics displayMetrics2 = WXEnvironment.sApplication.getResources().getDisplayMetrics();
            displayMetrics2.heightPixels = displayMetrics.heightPixels;
            displayMetrics2.widthPixels = displayMetrics.widthPixels;
            displayMetrics2.density = displayMetrics.density;
            displayMetrics2.densityDpi = displayMetrics.densityDpi;
            displayMetrics2.scaledDensity = displayMetrics.scaledDensity;
            displayMetrics2.xdpi = displayMetrics.xdpi;
        }
    }

    @Deprecated
    public static float getRealPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1c24c8d", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float screenWidth = (f * WXViewUtils.getScreenWidth()) / i;
        double d = screenWidth;
        if (d <= 0.005d || screenWidth >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    @Deprecated
    public static int getRealPxByWidth2(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32b59c7c", new Object[]{new Float(f), new Integer(i)})).intValue();
        }
        float screenWidth = (f * WXViewUtils.getScreenWidth()) / i;
        if (screenWidth <= 0.005d || screenWidth >= 1.0f) {
            return ((int) screenWidth) - 1;
        }
        return 1;
    }

    @Deprecated
    public static float getRealSubPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70eb9415", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        float screenWidth = (f * WXViewUtils.getScreenWidth()) / i;
        if (screenWidth <= 0.005d || screenWidth >= 1.0f) {
            return screenWidth;
        }
        return 1.0f;
    }

    @Deprecated
    public static float getWebPxByWidth(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c45fd43", new Object[]{new Float(f), new Integer(i)})).floatValue();
        }
        double d = f;
        if (d < -1.9999d && d > -2.005d) {
            return Float.NaN;
        }
        float screenWidth = (f * i) / WXViewUtils.getScreenWidth();
        if (screenWidth <= 0.005d || screenWidth >= 1.0f) {
            return screenWidth;
        }
        return 1.0f;
    }

    @Deprecated
    public static float getWeexPxByReal(float f, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("df03234e", new Object[]{new Float(f), new Integer(i)})).floatValue() : Float.isNaN(f) ? f : (f * i) / WXViewUtils.getScreenWidth();
    }

    public static float getWebPxByWidth(WXSDKInstance wXSDKInstance, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63f98d91", new Object[]{wXSDKInstance, new Float(f), new Integer(i)})).floatValue();
        }
        double d = f;
        if (d < -1.9999d && d > -2.005d) {
            return Float.NaN;
        }
        if (wXSDKInstance != null && wXSDKInstance.j0()) {
            return f * safeGetRadio(wXSDKInstance);
        }
        float screenWidth = (f * i) / getScreenWidth(wXSDKInstance, wXSDKInstance == null ? WXEnvironment.sApplication : wXSDKInstance.getContext());
        if (screenWidth <= 0.005d || screenWidth >= 1.0f) {
            return screenWidth;
        }
        return 1.0f;
    }

    public static float getRealSubPxByWidth(WXSDKInstance wXSDKInstance, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7b59c7f", new Object[]{wXSDKInstance, new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        if (wXSDKInstance != null && wXSDKInstance.j0()) {
            return f * safeGetRadio(wXSDKInstance);
        }
        float screenWidth = (f * getScreenWidth(wXSDKInstance, wXSDKInstance == null ? WXEnvironment.sApplication : wXSDKInstance.getContext())) / i;
        if (screenWidth <= 0.005d || screenWidth >= 1.0f) {
            return screenWidth;
        }
        return 1.0f;
    }

    public static float getRealPxByWidth(WXSDKInstance wXSDKInstance, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60a5d507", new Object[]{wXSDKInstance, new Float(f), new Integer(i)})).floatValue();
        }
        if (Float.isNaN(f)) {
            return f;
        }
        if (wXSDKInstance != null && wXSDKInstance.j0()) {
            return f * safeGetRadio(wXSDKInstance);
        }
        float screenWidth = (f * getScreenWidth(wXSDKInstance, wXSDKInstance == null ? WXEnvironment.sApplication : wXSDKInstance.getContext())) / i;
        double d = screenWidth;
        if (d <= 0.005d || screenWidth >= 1.0f) {
            return (float) Math.rint(d);
        }
        return 1.0f;
    }

    public static void clipCanvasWithinBorderBox(Widget widget, Canvas canvas) {
        BorderDrawable backgroundAndBorder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed3d330", new Object[]{widget, canvas});
        } else if (a(canvas) && b(null) && (backgroundAndBorder = widget.getBackgroundAndBorder()) != null) {
            if (!backgroundAndBorder.isRounded() || !d(widget, backgroundAndBorder)) {
                canvas.clipRect(widget.getBorderBox());
            } else {
                canvas.clipPath(backgroundAndBorder.getContentPath(new RectF(0.0f, 0.0f, widget.getBorderBox().width(), widget.getBorderBox().height())));
            }
        }
    }
}
