package com.taobao.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DWViewUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int mCutoutHeight = -1;

    static {
        t2o.a(774897675);
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap.Config config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cc237851", new Object[]{drawable});
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static int getContentAreaHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2abca83", new Object[]{activity})).intValue();
        }
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x0020
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    private static int[] getNotchSize(android.content.Context r4) {
        /*
            r0 = 0
            new int[]{r0, r0}
            r1 = move-result
            r4.getClassLoader()
            r4 = move-result
            java.lang.String r2 = "com.huawei.android.util.HwNotchSizeUtil"
            r4.loadClass(r2)
            r4 = move-result
            java.lang.String r2 = "getNotchSize"
            java.lang.Class[] r3 = new java.lang.Class[r0]
            r4.getMethod(r2, r3)
            r2 = move-result
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.invoke(r4, r0)
            r4 = move-result
            int[] r4 = (int[]) r4
            return r4
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.media.DWViewUtil.getNotchSize(android.content.Context):int[]");
    }

    public static int getPortraitScreenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd122ade", new Object[0])).intValue();
        }
        int screenWidth = getScreenWidth();
        int screenHeight = getScreenHeight();
        if (screenWidth > screenHeight) {
            return screenWidth;
        }
        return screenHeight;
    }

    public static int getPortraitScreenWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c7ad2e3", new Object[0])).intValue();
        }
        int screenWidth = getScreenWidth();
        int screenHeight = getScreenHeight();
        if (screenWidth < screenHeight) {
            return screenWidth;
        }
        return screenHeight;
    }

    public static int getRealHeightInPx(Context context) {
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getRealPxByHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dd70c92", new Object[]{new Float(f)})).intValue();
        }
        if (Float.isNaN(f)) {
            return 0;
        }
        float screenHeight = (f * getScreenHeight()) / 750.0f;
        double d = screenHeight;
        if (d <= 0.005d || screenHeight >= 1.0f) {
            return (int) Math.rint(d);
        }
        return 1;
    }

    public static int getRealPxByWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a42f8b19", new Object[]{new Float(f)})).intValue();
        }
        if (Float.isNaN(f)) {
            return 0;
        }
        float screenWidth = (f * getScreenWidth()) / 750.0f;
        double d = screenWidth;
        if (d <= 0.005d || screenWidth >= 1.0f) {
            return (int) Math.rint(d);
        }
        return 1;
    }

    public static int getRealWithInPx(Context context) {
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getScreenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        Application application = MediaSystemUtils.sApplication;
        if (application == null) {
            return 600;
        }
        return ((WindowManager) application.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getHeight();
    }

    public static int getScreenWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        Application application = MediaSystemUtils.sApplication;
        if (application == null) {
            return 600;
        }
        return ((WindowManager) application.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    }

    public static int getVideoHeightInActivityLandscape(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3549ea7", new Object[]{activity})).intValue();
        }
        return getScreenWidth();
    }

    public static int getVideoWidthInActivityLandscape(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3fabb12", new Object[]{activity})).intValue();
        }
        return getRealHeightInPx(activity);
    }

    public static int getVideoWidthInLandscape(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c7af2a1", new Object[]{activity})).intValue();
        }
        int i = Build.VERSION.SDK_INT;
        int realHeightInPx = getRealHeightInPx(activity);
        if (i < 26 || i >= 28) {
            return realHeightInPx;
        }
        return realHeightInPx - getDisplayCutoutHeight(activity);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x0020
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    private static boolean hasDisplayCutoutHuawei(android.content.Context r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.media.DWViewUtil.hasDisplayCutoutHuawei(android.content.Context):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x002d
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    private static boolean hasDisplayCutoutVivo(android.content.Context r5) {
        /*
            r0 = 1
            r1 = 0
            r5.getClassLoader()
            r5 = move-result
            java.lang.String r2 = "android.util.FtFeature"
            r5.loadClass(r2)
            r5 = move-result
            java.lang.String r2 = "isFeatureSupport"
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r1] = r4
            r5.getMethod(r2, r3)
            r2 = move-result
            r3 = 32
            java.lang.Integer.valueOf(r3)
            r3 = move-result
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r3
            r2.invoke(r5, r0)
            r5 = move-result
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            r5 = move-result
            return r5
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.media.DWViewUtil.hasDisplayCutoutVivo(android.content.Context):boolean");
    }

    public static int hideNavigationBar(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18d0ed16", new Object[]{window})).intValue();
        }
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        int systemUiVisibility = viewGroup.getSystemUiVisibility();
        if (systemUiVisibility != 4102) {
            viewGroup.setSystemUiVisibility(4102);
        }
        return systemUiVisibility;
    }

    public static boolean isVerticalScreen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cee8559", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof Activity) || ((Activity) context).getResources().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    public static int px2dip(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void setNavigationBar(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00d8720", new Object[]{window, new Integer(i)});
        } else {
            ((ViewGroup) window.getDecorView()).setSystemUiVisibility(i);
        }
    }

    public static int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r3 = r3.getRootWindowInsets();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        r3 = r3.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getDisplayCutoutHeight(android.app.Activity r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.media.DWViewUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "77ad648b"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
        L_0x0019:
            int r2 = com.taobao.media.DWViewUtil.mCutoutHeight
            r3 = -1
            if (r2 == r3) goto L_0x001f
            return r2
        L_0x001f:
            if (r4 != 0) goto L_0x0022
            return r0
        L_0x0022:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x0045
            android.view.Window r3 = r4.getWindow()
            android.view.View r3 = r3.getDecorView()
            if (r3 == 0) goto L_0x0045
            android.view.WindowInsets r3 = tb.zop.a(r3)
            if (r3 == 0) goto L_0x0045
            android.view.DisplayCutout r3 = tb.sgx.a(r3)
            if (r3 == 0) goto L_0x0045
            int r4 = tb.g3z.a(r3)
            com.taobao.media.DWViewUtil.mCutoutHeight = r4
            return r4
        L_0x0045:
            r3 = 26
            if (r2 < r3) goto L_0x009c
            android.content.pm.PackageManager r2 = r4.getPackageManager()
            java.lang.String r3 = "com.oppo.feature.screen.heteromorphism"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L_0x005a
            r4 = 80
            com.taobao.media.DWViewUtil.mCutoutHeight = r4
            return r4
        L_0x005a:
            boolean r2 = hasDisplayCutoutVivo(r4)
            if (r2 == 0) goto L_0x0069
            r0 = 1104674816(0x41d80000, float:27.0)
            int r4 = dip2px(r4, r0)
            com.taobao.media.DWViewUtil.mCutoutHeight = r4
            return r4
        L_0x0069:
            boolean r2 = hasDisplayCutoutHuawei(r4)
            if (r2 == 0) goto L_0x0078
            int[] r4 = getNotchSize(r4)
            r4 = r4[r1]
            com.taobao.media.DWViewUtil.mCutoutHeight = r4
            return r4
        L_0x0078:
            boolean r1 = hasDisplayCutoutXiaomi(r4)
            if (r1 == 0) goto L_0x009c
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "android"
            java.lang.String r2 = "notch_height"
            java.lang.String r3 = "dimen"
            int r0 = r0.getIdentifier(r2, r3, r1)
            if (r0 <= 0) goto L_0x0099
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelSize(r0)
            com.taobao.media.DWViewUtil.mCutoutHeight = r4
        L_0x0099:
            int r4 = com.taobao.media.DWViewUtil.mCutoutHeight
            return r4
        L_0x009c:
            com.taobao.media.DWViewUtil.mCutoutHeight = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.media.DWViewUtil.getDisplayCutoutHeight(android.app.Activity):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: Exception -> 0x0039
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    private static boolean hasDisplayCutoutXiaomi(android.content.Context r6) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            r6.getClassLoader()
            r6 = move-result
            java.lang.String r3 = "android.os.SystemProperties"
            r6.loadClass(r3)
            r6 = move-result
            java.lang.String r3 = "getInt"
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r2] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r1] = r5
            r6.getMethod(r3, r4)
            r3 = move-result
            java.lang.Integer.valueOf(r2)
            r4 = move-result
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r5 = "ro.miui.notch"
            r0[r2] = r5
            r0[r1] = r4
            r3.invoke(r6, r0)
            r6 = move-result
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            r6 = move-result
            if (r6 != r1) goto L_0x0037
            goto L_0x0038
            r1 = 0
            return r1
        L_0x0039:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.media.DWViewUtil.hasDisplayCutoutXiaomi(android.content.Context):boolean");
    }
}
