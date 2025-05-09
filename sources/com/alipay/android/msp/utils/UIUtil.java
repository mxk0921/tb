package com.alipay.android.msp.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.KeyboardType;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.f7l;
import tb.pg1;
import tb.tkt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UIUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static DisplayMetrics DEFAULT_METRICS = null;
    private static float DP = -1.0f;

    public static Bundle findConsumingViewContentDescription(float f, float f2, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("89fdc0d9", new Object[]{new Float(f), new Float(f2), viewGroup, new Integer(i)}) : findConsumingViewContentDescription(f, f2, viewGroup, i, i - 1, new String[1]);
    }

    private static String findFirstTextViewText(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81cc1f99", new Object[]{viewGroup, new Integer(i)});
        }
        if (viewGroup != null && i >= 0) {
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (textView.getVisibility() == 0 && !TextUtils.isEmpty(textView.getText())) {
                        return textView.getText().toString();
                    }
                } else if (childAt instanceof ViewGroup) {
                    String findFirstTextViewText = findFirstTextViewText((ViewGroup) childAt, i - 1);
                    if (!TextUtils.isEmpty(findFirstTextViewText)) {
                        return findFirstTextViewText;
                    }
                } else {
                    continue;
                }
            }
        }
        return "";
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{context});
        }
        if (DEFAULT_METRICS == null) {
            DEFAULT_METRICS = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(DEFAULT_METRICS);
            }
        }
        return DEFAULT_METRICS;
    }

    public static float getDp(Context context) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29d2a9cf", new Object[]{context})).floatValue();
        }
        if (DP == -1.0f && (displayMetrics = getDisplayMetrics(context)) != null) {
            DP = displayMetrics.density;
        }
        return DP;
    }

    public static KeyboardType getKeyboardType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KeyboardType) ipChange.ipc$dispatch("a43b290c", new Object[]{str});
        }
        KeyboardType keyboardType = KeyboardType.text;
        if (TextUtils.equals(str, UiUtil.INPUT_TYPE_VALUE_MONEY)) {
            return KeyboardType.money;
        }
        return (TextUtils.equals(UiUtil.INPUT_TYPE_VALUE_NUM, str) || TextUtils.equals("number", str) || TextUtils.equals(UiUtil.INPUT_TYPE_VALUE_PAYSPWD, str)) ? KeyboardType.num : keyboardType;
    }

    public static int getNumberOfCPUs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b97e15b", new Object[0])).intValue();
        }
        try {
            return Runtime.getRuntime().availableProcessors();
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public static Drawable getPaddingDrawable(int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("cc829fd5", new Object[]{new Integer(i), context});
        }
        if (context != null) {
            Resources resources = context.getResources();
            int dp = (int) (getDp(context) * 6.0f);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 320;
            try {
                Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
                Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth() + dp, decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
                canvas.drawBitmap(decodeResource, rect, rect, (Paint) null);
                return new BitmapDrawable(resources, createBitmap);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                return null;
            }
        } else {
            throw new IllegalArgumentException("Invalid context");
        }
    }

    private static int[] getRgbByString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6f898794", new Object[]{str});
        }
        int[] iArr = new int[4];
        iArr[3] = 255;
        String[] split = str.substring(str.indexOf(f7l.BRACKET_START_STR) + 1, str.indexOf(f7l.BRACKET_END_STR)).split(",");
        for (int i = 0; i < split.length; i++) {
            if (i == 3) {
                iArr[i] = (int) (Float.parseFloat(split[i].trim()) * 255.0f);
            } else {
                iArr[i] = Integer.parseInt(split[i].trim());
            }
        }
        return iArr;
    }

    public static boolean isGTP8600() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47e931a2", new Object[0])).booleanValue();
        }
        return Build.MANUFACTURER.toLowerCase().equals("samsung") && "gt-p6800".equals(Build.MODEL.toLowerCase());
    }

    public static boolean isOppoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("815a0b6b", new Object[0])).booleanValue();
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        return lowerCase.equals("oppo") || lowerCase.equals(DeviceProperty.ALIAS_ONEPLUS) || lowerCase.equals("tcl");
    }

    public static boolean isPointInsideView(float f, float f2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a54f8a8", new Object[]{new Float(f), new Float(f2), view})).booleanValue();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f < i || f > i + view.getWidth() || f2 < i2 || f2 > i2 + view.getHeight()) {
            return false;
        }
        return true;
    }

    public static boolean isQuickPayTpl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b3208c0", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("QUICKPAY@");
    }

    public static int parseColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("#")) {
                    return Color.parseColor(parseStandarColor(str));
                }
                if (str.startsWith("rgb")) {
                    return parseRgba(str);
                }
            }
            return tkt.DEFAULT_SHADOW_COLOR;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return tkt.DEFAULT_SHADOW_COLOR;
        }
    }

    private static int parseRgba(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb04e9cb", new Object[]{str})).intValue();
        }
        int[] rgbByString = getRgbByString(str);
        return Color.argb(rgbByString[3], rgbByString[0], rgbByString[1], rgbByString[2]);
    }

    private static String parseStandarColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3e69be0", new Object[]{str});
        }
        if (!str.startsWith("#")) {
            return str;
        }
        if (str.length() > 7) {
            return str.substring(0, 7);
        }
        if (str.length() != 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] cArr = new char[7];
        cArr[0] = charArray[0];
        for (int i = 1; i < charArray.length; i++) {
            int i2 = i * 2;
            cArr[i2 - 1] = charArray[i];
            cArr[i2] = charArray[i];
        }
        return new String(cArr);
    }

    public static int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        LogUtil.record(1, "FpFullViewDialog", "Status height:".concat(String.valueOf(dimensionPixelSize)));
        return dimensionPixelSize;
    }

    public static void hideKeyboard(IBinder iBinder, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444c39f1", new Object[]{iBinder, context});
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(iBinder, 2);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private static Bundle findConsumingViewContentDescription(float f, float f2, ViewGroup viewGroup, int i, int i2, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("35ed0295", new Object[]{new Float(f), new Float(f2), viewGroup, new Integer(i), new Integer(i2), strArr});
        }
        if (viewGroup != null && i2 >= 0) {
            int i3 = 0;
            while (true) {
                String str = "";
                if (i3 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (childAt.getVisibility() == 0 && isPointInsideView(f, f2, childAt)) {
                        if (childAt instanceof ViewGroup) {
                            Bundle findConsumingViewContentDescription = findConsumingViewContentDescription(f, f2, (ViewGroup) childAt, i, i2 - 1, strArr);
                            if (findConsumingViewContentDescription != null) {
                                return findConsumingViewContentDescription;
                            }
                        } else if (childAt.isClickable()) {
                            CharSequence contentDescription = childAt.getContentDescription();
                            if (contentDescription != null) {
                                str = contentDescription.toString();
                            }
                            if (TextUtils.isEmpty(str) && (childAt instanceof TextView)) {
                                str = ((TextView) childAt).getText().toString();
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("deep", String.valueOf(i - i2));
                            bundle.putString("label", str);
                            return bundle;
                        } else if (childAt instanceof TextView) {
                            String charSequence = ((TextView) childAt).getText().toString();
                            if (!TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(strArr[0])) {
                                strArr[0] = charSequence;
                            }
                        }
                    }
                    i3++;
                } else if (viewGroup.isClickable()) {
                    CharSequence contentDescription2 = viewGroup.getContentDescription();
                    if (contentDescription2 != null) {
                        str = contentDescription2.toString();
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (TextUtils.isEmpty(strArr[0])) {
                            str = findFirstTextViewText(viewGroup, i - 1);
                        } else {
                            str = strArr[0];
                        }
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("deep", String.valueOf(i - i2));
                    bundle2.putString("label", str);
                    return bundle2;
                }
            }
        }
        return null;
    }

    public static int getHeightOfNavigationBarSpecROM(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("942eb2aa", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey(DrmKey.MANUFACTURER_PAYEE);
        if ((drmValueFromKey != null && (!drmValueFromKey.containsKey(Build.MANUFACTURER) || !drmValueFromKey.containsKey("all"))) || !"Xiaomi".equalsIgnoreCase(Build.MANUFACTURER) || Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
            return 0;
        }
        int i = getScreenSize(context)[1];
        Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return i - displayMetrics.heightPixels;
    }

    public static int[] getScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i = point.x;
            i2 = point.y;
        } catch (Exception unused) {
        }
        return new int[]{i, i2};
    }

    public static boolean isHuaweiMultiWindow(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14181a0d", new Object[]{context})).booleanValue();
        }
        try {
            String configuration = context.getResources().getConfiguration().toString();
            if (!configuration.contains("hwMultiwindow-magic")) {
                if (!configuration.contains("hw-magic-windows")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isPadHuaweiMultiWindow(android.content.Context r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.msp.utils.UIUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "81dfc1ac"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0019:
            android.content.res.Resources r5 = r5.getResources()     // Catch: all -> 0x003c
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch: all -> 0x003c
            java.lang.String r2 = r5.toString()     // Catch: all -> 0x003c
            int r5 = r5.orientation     // Catch: all -> 0x003c
            java.lang.String r3 = "hwMultiwindow-magic"
            boolean r3 = r2.contains(r3)     // Catch: all -> 0x003c
            if (r3 != 0) goto L_0x003e
            java.lang.String r3 = "hw-magic-windows"
            boolean r2 = r2.contains(r3)     // Catch: all -> 0x003c
            if (r2 == 0) goto L_0x003a
            goto L_0x003e
        L_0x003a:
            r2 = 0
            goto L_0x003f
        L_0x003c:
            r5 = move-exception
            goto L_0x0053
        L_0x003e:
            r2 = 1
        L_0x003f:
            java.lang.String r3 = "Huawei"
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch: all -> 0x0051
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: all -> 0x0051
            if (r3 != 0) goto L_0x004a
            return r0
        L_0x004a:
            r3 = 2
            if (r5 != r3) goto L_0x004e
            r0 = 1
        L_0x004e:
            r5 = r2 | r0
            goto L_0x0057
        L_0x0051:
            r5 = move-exception
            r0 = r2
        L_0x0053:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r5)
            r5 = r0
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.utils.UIUtil.isPadHuaweiMultiWindow(android.content.Context):boolean");
    }

    public static boolean isProxyHuaweiMultiWindow(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e672bf2f", new Object[]{configuration})).booleanValue();
        }
        if (configuration == null) {
            return false;
        }
        try {
            String configuration2 = configuration.toString();
            if (!configuration2.contains("hwMultiwindow-magic")) {
                if (!configuration2.contains("hw-magic-windows")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static boolean isUseDefaultKeyboard(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7275eaa", new Object[]{str, str2})).booleanValue();
        }
        return !TextUtils.equals(str, UiUtil.INPUT_TYPE_VALUE_PAYPWD) && !TextUtils.equals(str, UiUtil.INPUT_TYPE_VALUE_PAYSPWD) && !TextUtils.equals(str, UiUtil.INPUT_TYPE_VALUE_MONEY) && !TextUtils.equals(str2, pg1.ATOM_EXT_safe);
    }

    public static void setSafeKeyboardSoftInput(EditText editText) {
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(editText, Boolean.FALSE);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        try {
            Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
            method2.setAccessible(true);
            method2.invoke(editText, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }
}
