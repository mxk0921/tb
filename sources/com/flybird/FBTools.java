package com.flybird;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.cc5;
import tb.f7l;
import tb.pg1;
import tb.pgh;
import tb.uca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBTools {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
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
        return Color.argb(iArr[3], iArr[0], iArr[1], iArr[2]);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!str.startsWith("#")) {
            return str;
        }
        if (str.length() > 9) {
            return str.substring(0, 9);
        }
        if (str.length() == 8) {
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

    public static Bitmap blur(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("89a27061", new Object[]{bitmap, new Integer(i)});
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() / 1.0f), (int) (bitmap.getHeight() / 1.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(1.0f, 1.0f);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return doBlur(createBitmap, i, true);
    }

    public static Bitmap doBlur(Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("83631d04", new Object[]{bitmap2, new Integer(i2), new Boolean(z)});
        }
        if (!z) {
            bitmap2 = bitmap2.copy(bitmap.getConfig(), true);
        }
        if (i2 < 1) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2;
        int i7 = i6 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i8 = (i6 + 2) >> 1;
        int i9 = i8 * i8;
        int i10 = i9 * 256;
        int[] iArr7 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr7[i11] = i11 / i9;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(Integer.TYPE, i7, 3);
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            int i16 = -i2;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i16 <= i2) {
                int i26 = iArr2[i14 + Math.min(i4, Math.max(i16, 0))];
                int[] iArr9 = iArr8[i16 + i2];
                iArr9[0] = (i26 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr9[1] = (i26 & 65280) >> 8;
                iArr9[2] = i26 & 255;
                int abs = i12 - Math.abs(i16);
                int i27 = iArr9[0];
                i19 += i27 * abs;
                int i28 = iArr9[1];
                i18 += i28 * abs;
                int i29 = iArr9[2];
                i17 += abs * i29;
                if (i16 > 0) {
                    i25 += i27;
                    i24 += i28;
                    i23 += i29;
                } else {
                    i22 += i27;
                    i21 += i28;
                    i20 += i29;
                }
                i16++;
                bitmap2 = bitmap2;
                height = height;
            }
            int i30 = i2;
            int i31 = 0;
            while (i31 < width) {
                iArr3[i14] = iArr7[i19];
                iArr4[i14] = iArr7[i18];
                iArr5[i14] = iArr7[i17];
                int i32 = i19 - i22;
                int i33 = i18 - i21;
                int i34 = i17 - i20;
                int[] iArr10 = iArr8[((i30 - i2) + i7) % i7];
                int i35 = i22 - iArr10[0];
                int i36 = i21 - iArr10[1];
                int i37 = i20 - iArr10[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr6[i31] = Math.min(i31 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i38 = iArr2[i15 + iArr6[i31]];
                int i39 = (i38 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr10[0] = i39;
                int i40 = (i38 & 65280) >> 8;
                iArr10[1] = i40;
                int i41 = i38 & 255;
                iArr10[2] = i41;
                int i42 = i25 + i39;
                int i43 = i24 + i40;
                int i44 = i23 + i41;
                i19 = i32 + i42;
                i18 = i33 + i43;
                i17 = i34 + i44;
                i30 = (i30 + 1) % i7;
                int[] iArr11 = iArr8[i30 % i7];
                int i45 = iArr11[0];
                i22 = i35 + i45;
                int i46 = iArr11[1];
                i21 = i36 + i46;
                int i47 = iArr11[2];
                i20 = i37 + i47;
                i25 = i42 - i45;
                i24 = i43 - i46;
                i23 = i44 - i47;
                i14++;
                i31++;
                iArr7 = iArr;
            }
            i15 += width;
            i13++;
            bitmap2 = bitmap2;
            height = height;
        }
        int i48 = height;
        int i49 = 0;
        while (i49 < width) {
            int i50 = -i2;
            int i51 = i50 * width;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            while (i50 <= i2) {
                int max = Math.max(0, i51) + i49;
                int[] iArr12 = iArr8[i50 + i2];
                iArr12[0] = iArr3[max];
                iArr12[1] = iArr4[max];
                iArr12[2] = iArr5[max];
                int abs2 = i12 - Math.abs(i50);
                i54 += iArr3[max] * abs2;
                i53 += iArr4[max] * abs2;
                i52 += iArr5[max] * abs2;
                if (i50 > 0) {
                    i60 += iArr12[0];
                    i59 += iArr12[1];
                    i58 += iArr12[2];
                } else {
                    i57 += iArr12[0];
                    i56 += iArr12[1];
                    i55 += iArr12[2];
                }
                if (i50 < i5) {
                    i51 += width;
                }
                i50++;
                iArr6 = iArr6;
            }
            int i61 = i49;
            int i62 = i2;
            int i63 = 0;
            while (i63 < i48) {
                iArr2[i61] = (iArr2[i61] & (-16777216)) | (iArr7[i54] << 16) | (iArr7[i53] << 8) | iArr7[i52];
                int i64 = i54 - i57;
                int i65 = i53 - i56;
                int i66 = i52 - i55;
                int[] iArr13 = iArr8[((i62 - i2) + i7) % i7];
                int i67 = i57 - iArr13[0];
                int i68 = i56 - iArr13[1];
                int i69 = i55 - iArr13[2];
                if (i49 == 0) {
                    iArr6[i63] = Math.min(i63 + i12, i5) * width;
                }
                int i70 = iArr6[i63] + i49;
                int i71 = iArr3[i70];
                iArr13[0] = i71;
                int i72 = iArr4[i70];
                iArr13[1] = i72;
                int i73 = iArr5[i70];
                iArr13[2] = i73;
                int i74 = i60 + i71;
                int i75 = i59 + i72;
                int i76 = i58 + i73;
                i54 = i64 + i74;
                i53 = i65 + i75;
                i52 = i66 + i76;
                i62 = (i62 + 1) % i7;
                int[] iArr14 = iArr8[i62];
                int i77 = iArr14[0];
                i57 = i67 + i77;
                int i78 = iArr14[1];
                i56 = i68 + i78;
                int i79 = iArr14[2];
                i55 = i69 + i79;
                i60 = i74 - i77;
                i59 = i75 - i78;
                i58 = i76 - i79;
                i61 += width;
                i63++;
                i2 = i;
            }
            i49++;
            i2 = i;
            i48 = i48;
            iArr6 = iArr6;
        }
        bitmap2.setPixels(iArr2, 0, width, 0, 0, width, i48);
        return bitmap2;
    }

    public static FBDocument findFbDocFromSysView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBDocument) ipChange.ipc$dispatch("54f91657", new Object[]{view});
        }
        FBView findFbViewFromSysView = findFbViewFromSysView(view);
        if (findFbViewFromSysView == null) {
            return null;
        }
        return findFbViewFromSysView.getFBDocument();
    }

    public static ColorStateList genTextSelector(String[] strArr, BirdNestEngine.ThemeColorProvider themeColorProvider, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("a3d031be", new Object[]{strArr, themeColorProvider, new Integer(i), new Boolean(z)});
        }
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, 4, 4);
        int[] iArr2 = new int[4];
        int i2 = 0;
        boolean z2 = true;
        while (i2 < strArr.length) {
            String str = strArr[i2];
            if (i2 == 0) {
                iArr[0] = new int[]{16842910};
                iArr2[0] = parseColor(str, themeColorProvider, i, z);
            } else if (i2 == 1) {
                iArr[1] = new int[]{16842910, 16842919};
                iArr2[1] = parseColor(str, themeColorProvider, i, z);
                iArr[2] = new int[]{16842910, 16842908};
                iArr2[2] = parseColor(str, themeColorProvider, i, z);
            } else if (i2 == 2) {
                iArr[3] = new int[]{-16842910};
                iArr2[3] = parseColor(str, themeColorProvider, i, z);
            }
            i2++;
            z2 = false;
        }
        if (!z2) {
            return new ColorStateList(iArr, iArr2);
        }
        return null;
    }

    public static Drawable generateBackGroundDrawable(float f, int i, float f2, float[] fArr, String[] strArr, float f3, BirdNestEngine.ThemeColorProvider themeColorProvider, int i2, boolean z) {
        int i3;
        int i4 = i;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("c331c49", new Object[]{new Float(f), new Integer(i4), new Float(f2), fArr, strArr, new Float(f3), themeColorProvider, new Integer(i2), new Boolean(z)});
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        float f4 = 255.0f;
        int i6 = -1;
        float f5 = 0.0f;
        if (strArr == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            if (i4 == -1) {
                i4 = 0;
            }
            if (f > 0.0f) {
                gradientDrawable.setStroke((int) f, i4);
            }
            gradientDrawable.setColor(0);
            if (f2 > 0.0f) {
                gradientDrawable.setCornerRadius(f2);
            } else if (fArr != null) {
                gradientDrawable.setCornerRadii(fArr);
            }
            if (f3 > 0.0f) {
                gradientDrawable.setAlpha((int) (255.0f * f3));
            }
            return gradientDrawable;
        } else if (strArr[1] == null && strArr[2] == null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            if (i4 != -1) {
                gradientDrawable2.setStroke((int) f, i4);
            }
            gradientDrawable2.setColor(parseColor(strArr[0], themeColorProvider, i2, z));
            if (f2 > 0.0f) {
                gradientDrawable2.setCornerRadius(f2);
            } else if (fArr != null) {
                gradientDrawable2.setCornerRadii(fArr);
            }
            if (f3 > 0.0f) {
                gradientDrawable2.setAlpha((int) (f3 * 255.0f));
            }
            return gradientDrawable2;
        } else {
            while (i5 < strArr.length) {
                String str = strArr[i5];
                if (TextUtils.isEmpty(str)) {
                    i3 = 1;
                } else {
                    GradientDrawable gradientDrawable3 = new GradientDrawable();
                    if (i4 != i6) {
                        gradientDrawable3.setStroke((int) f, i4);
                    }
                    gradientDrawable3.setColor(parseColor(str, themeColorProvider, i2, z));
                    if (f2 > f5) {
                        gradientDrawable3.setCornerRadius(f2);
                    } else if (fArr != null) {
                        gradientDrawable3.setCornerRadii(fArr);
                    }
                    if (f3 > f5) {
                        gradientDrawable3.setAlpha((int) (f3 * f4));
                    }
                    if (i5 == 0) {
                        i3 = 1;
                        stateListDrawable.addState(!TextUtils.isEmpty(strArr[1]) ? new int[]{16842910, -16842919} : new int[]{16842910}, gradientDrawable3);
                    } else {
                        i3 = 1;
                        if (i5 == 1) {
                            stateListDrawable.addState(new int[]{16842910, 16842919}, gradientDrawable3);
                        } else if (i5 == 2) {
                            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
                        }
                    }
                }
                i5 += i3;
                f4 = 255.0f;
                i6 = -1;
                f5 = 0.0f;
            }
            return stateListDrawable;
        }
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{context});
        }
        if (BirdNestEngine.useValueCache) {
            return (DisplayMetrics) uca.c("Conf:CtxDisplayMetrics");
        }
        if (context == null) {
            return null;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
            defaultDisplay.getRealMetrics(displayMetrics);
            if (displayMetrics.heightPixels * 9 <= displayMetrics.widthPixels * 16) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            return displayMetrics;
        } catch (Throwable unused) {
            return context.getResources().getDisplayMetrics();
        }
    }

    @Deprecated
    public static float getDp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29d2a9cf", new Object[]{context})).floatValue();
        }
        if (Platform.g != 2) {
            return context.getResources().getDisplayMetrics().density;
        }
        return context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int getLeftFromRoot(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("503ed775", new Object[]{view})).intValue();
        }
        if (view == null) {
            return 0;
        }
        View view2 = (View) view.getParent();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (view2 != null && ((view2 instanceof FBFrameLayout) || (view2 instanceof FBScrollView) || (view2 instanceof FBHScrollView))) {
            return layoutParams.leftMargin + getLeftFromRoot(view2);
        }
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.leftMargin;
    }

    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        return calcScreenHeight(context, getDisplayMetrics(context).heightPixels);
    }

    public static int getScreenWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        return getDisplayMetrics(context).widthPixels;
    }

    public static int getSmartBarHeight(Context context) {
        boolean z;
        boolean equals = Build.MANUFACTURER.equals("Meizu");
        boolean z2 = true;
        boolean z3 = Settings.System.getInt(context.getContentResolver(), "mz_smartbar_auto_hide", 0) == 1;
        if (equals) {
            String str = Build.MODEL;
            if (str == null || !str.startsWith("M1 E")) {
                z2 = false;
            }
            try {
                String str2 = Build.VERSION.INCREMENTAL;
                boolean startsWith = str2.substring(str2.indexOf("OS_") + 3).startsWith("5.");
                String str3 = Build.VERSION.RELEASE;
                z = str3.startsWith("5.") | startsWith | str3.startsWith("6.") | str3.startsWith("7.");
            } catch (Throwable th) {
                FBLogger.e("FBTools", "catch exception ", th);
                z = false;
            }
            if (!z2 && !z3 && !z) {
                try {
                    Class<?> cls = Class.forName("com.android.internal.R$dimen");
                    return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("mz_action_button_min_height").get(cls.newInstance()).toString()));
                } catch (Throwable unused) {
                    return getNormalNavigationBarHeight(context);
                }
            }
        }
        return 0;
    }

    public static int getTopFromRoot(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce33b993", new Object[]{view})).intValue();
        }
        if (view == null) {
            return 0;
        }
        View view2 = (View) view.getParent();
        if (!(view.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (view2 != null && ((view2 instanceof FBFrameLayout) || (view2 instanceof FBScrollView) || (view2 instanceof FBHScrollView))) {
            return layoutParams.topMargin + getTopFromRoot(view2);
        }
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.topMargin;
    }

    public static int parseColor(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue() : parseColor(str, null, 0);
    }

    public static float parseUnit(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39c4618", new Object[]{str})).floatValue();
        }
        float dp = FBDocumentAssistor.getDp();
        if (str.contains("PX")) {
            str2 = str.replaceAll("PX", "");
            dp = 1.0f;
        } else {
            str2 = str.replaceAll("px", "");
        }
        return Float.parseFloat(str2) * dp;
    }

    public static String readAssetsFile(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c857d4fe", new Object[]{str, context});
        }
        return readAssetsFileWithManager(str, context.getAssets());
    }

    public static String readAssetsFileWithManager(String str, AssetManager assetManager) {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("413133f0", new Object[]{str, assetManager});
        }
        StringBuilder sb = new StringBuilder();
        try {
            inputStream = assetManager.open(str);
        } catch (Throwable th) {
            pgh.f("FBTools", "error 1 in reading asset " + str, th);
            inputStream = null;
        }
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            char[] cArr = new char[2048];
            while (true) {
                try {
                    int read = bufferedReader.read(cArr);
                    if (read > 0) {
                        sb.append(cArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        pgh.f("FBTools", "error 2 in reading asset " + str, th2);
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            pgh.f("FBTools", "error 3 in reading asset " + str, e2);
                        }
                    } finally {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            pgh.f("FBTools", "error 3 in reading asset " + str, e3);
                        }
                    }
                }
            }
            try {
                inputStream.close();
            } catch (Throwable th3) {
                pgh.f("FBTools", "error 4 in reading asset " + str, th3);
            }
        }
        return sb.toString();
    }

    public static int calcScreenHeight(Context context, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ebec179d", new Object[]{context, new Integer(i)})).intValue();
        }
        if ((context instanceof Activity) && (((Activity) context).getWindow().getDecorView().getSystemUiVisibility() & 4) != 4) {
            try {
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i2 = context.getResources().getDimensionPixelSize(identifier);
                } else {
                    i2 = ((int) context.getResources().getDisplayMetrics().density) * 24;
                }
            } catch (Throwable th) {
                FBLogger.e("FBTools", th);
            }
        }
        return (i - i2) - getSmartBarHeight(context);
    }

    public static int getNormalNavigationBarHeight(Context context) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79e9a96b", new Object[]{context})).intValue();
        }
        try {
            Resources resources = context.getResources();
            int identifier2 = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier2 > 0 && resources.getBoolean(identifier2) && (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
        } catch (Throwable th) {
            FBLogger.d("FBTools", "getNormalNavigationBarHeight() exception:" + th.getMessage());
        }
        return 0;
    }

    public static int parseColor(String str, BirdNestEngine.ThemeColorProvider themeColorProvider, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e5e5bd6", new Object[]{str, themeColorProvider, new Integer(i)})).intValue() : parseColor(str, themeColorProvider, i, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #0 {Exception -> 0x0064, blocks: (B:10:0x0035, B:12:0x003b, B:14:0x0043, B:15:0x004c, B:17:0x0055, B:20:0x005f), top: B:24:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int parseColor(java.lang.String r4, com.alipay.birdnest.api.BirdNestEngine.ThemeColorProvider r5, int r6, boolean r7) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.flybird.FBTools.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x002c
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
            java.lang.Boolean r6 = new java.lang.Boolean
            r6.<init>(r7)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r4
            r7[r0] = r5
            r4 = 2
            r7[r4] = r3
            r4 = 3
            r7[r4] = r6
            java.lang.String r4 = "9d6dd344"
            java.lang.Object r4 = r2.ipc$dispatch(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            return r4
        L_0x002c:
            if (r5 == 0) goto L_0x0031
            if (r7 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r7 = -7829368(0xffffffffff888888, float:NaN)
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: Exception -> 0x0064
            if (r1 != 0) goto L_0x005a
            java.lang.String r1 = "#"
            boolean r1 = r4.startsWith(r1)     // Catch: Exception -> 0x0064
            if (r1 == 0) goto L_0x004c
            java.lang.String r4 = b(r4)     // Catch: Exception -> 0x0064
            int r1 = android.graphics.Color.parseColor(r4)     // Catch: Exception -> 0x0064
            goto L_0x005d
        L_0x004c:
            java.lang.String r1 = "rgb"
            boolean r1 = r4.startsWith(r1)     // Catch: Exception -> 0x0064
            if (r1 == 0) goto L_0x005a
            int r1 = a(r4)     // Catch: Exception -> 0x0064
            goto L_0x005d
        L_0x005a:
            r1 = -7829368(0xffffffffff888888, float:NaN)
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r1 = r5.mapHexColor(r1, r6)     // Catch: Exception -> 0x0064
        L_0x0063:
            return r1
        L_0x0064:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "failed to parse "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FBTools"
            tb.pgh.e(r5, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBTools.parseColor(java.lang.String, com.alipay.birdnest.api.BirdNestEngine$ThemeColorProvider, int, boolean):int");
    }

    public static FBView findFbViewFromSysView(View view) {
        if (view == null) {
            return null;
        }
        try {
            Field declaredField = View.class.getDeclaredField("mKeyedTags");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                for (int i = 0; i < sparseArray.size(); i++) {
                    Object valueAt = sparseArray.valueAt(i);
                    if (valueAt instanceof FBView) {
                        return (FBView) valueAt;
                    }
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof FBView) {
                        return (FBView) value;
                    }
                }
            }
        } catch (Throwable th) {
            FBLogger.e("FBTools", "cannot get fbView from sysView", th);
        }
        return null;
    }

    public static AnimationSet parseAnimation(Context context, String str) {
        int i;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimationSet) ipChange.ipc$dispatch("3eb142f8", new Object[]{context, str});
        }
        if (str == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            AnimationSet animationSet = new AnimationSet(false);
            for (int i2 = 0; i2 < jSONArray.length(); i2 = i + 1) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (!(jSONObject == null || (string = jSONObject.getString("type")) == null)) {
                    long j = jSONObject.getLong("duration");
                    Object opt = jSONObject.opt("repeatCount");
                    String optString = jSONObject.optString(cc5.REPEAT_MODE);
                    if ("alpha".equals(string)) {
                        jSONArray = jSONArray;
                        AlphaAnimation alphaAnimation = new AlphaAnimation((float) jSONObject.getDouble("fromValue"), (float) jSONObject.getDouble("toValue"));
                        alphaAnimation.setDuration(j);
                        if (opt != null && (opt instanceof String) && "infinite".equals(opt)) {
                            alphaAnimation.setRepeatCount(-1);
                        } else if (opt != null && (opt instanceof Integer)) {
                            alphaAnimation.setRepeatCount(((Integer) opt).intValue());
                        }
                        if (pg1.ATOM_EXT_reverse.equals(optString)) {
                            alphaAnimation.setRepeatMode(2);
                        }
                        animationSet.addAnimation(alphaAnimation);
                    } else {
                        jSONArray = jSONArray;
                        if ("translate".equals(string)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("fromValue");
                            JSONObject jSONObject3 = jSONObject.getJSONObject("toValue");
                            if (!(jSONObject2 == null || jSONObject3 == null)) {
                                float dp = FBDocumentAssistor.getDp();
                                i = i2;
                                jSONArray = jSONArray;
                                TranslateAnimation translateAnimation = new TranslateAnimation(((float) jSONObject2.getDouble("x")) * dp, ((float) jSONObject3.getDouble("x")) * dp, ((float) jSONObject2.getDouble("y")) * dp, ((float) jSONObject3.getDouble("y")) * dp);
                                translateAnimation.setDuration(j);
                                if (opt != null && (opt instanceof String) && "infinite".equals(opt)) {
                                    translateAnimation.setRepeatCount(-1);
                                } else if (opt != null && (opt instanceof Integer)) {
                                    translateAnimation.setRepeatCount(((Integer) opt).intValue());
                                }
                                if (pg1.ATOM_EXT_reverse.equals(optString)) {
                                    translateAnimation.setRepeatMode(2);
                                }
                                animationSet = animationSet;
                                animationSet.addAnimation(translateAnimation);
                            }
                        } else {
                            animationSet = animationSet;
                            i = i2;
                            jSONArray = jSONArray;
                            if ("scale".equals(string)) {
                                float f = (float) jSONObject.getDouble("fromValue");
                                float f2 = (float) jSONObject.getDouble("toValue");
                                ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
                                scaleAnimation.setDuration(j);
                                if (opt != null && (opt instanceof String) && "infinite".equals(opt)) {
                                    scaleAnimation.setRepeatCount(-1);
                                } else if (opt != null && (opt instanceof Integer)) {
                                    scaleAnimation.setRepeatCount(((Integer) opt).intValue());
                                }
                                if (pg1.ATOM_EXT_reverse.equals(optString)) {
                                    scaleAnimation.setRepeatMode(2);
                                }
                                animationSet.addAnimation(scaleAnimation);
                            }
                        }
                    }
                    animationSet = animationSet;
                    i = i2;
                }
                i = i2;
                jSONArray = jSONArray;
                animationSet = animationSet;
            }
            animationSet.setFillAfter(true);
            return animationSet;
        } catch (Throwable th) {
            FBLogger.e("FBTools", th);
            return null;
        }
    }
}
