package com.alipay.birdnest.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.alipay.android.app.template.KeyboardType;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocumentAssistor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UiUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INPUT_TYPE_VALUE_CHECKBOX = "checkbox";
    public static final String INPUT_TYPE_VALUE_EXTERNAL = "external";
    public static final String INPUT_TYPE_VALUE_EXTERNALALPHABET = "externalalphabet";
    public static final String INPUT_TYPE_VALUE_EXTERNALNUMBER = "externalnumber";
    public static final String INPUT_TYPE_VALUE_IDCARD = "idcard";
    public static final String INPUT_TYPE_VALUE_MONEY = "money";
    public static final String INPUT_TYPE_VALUE_MONEYNOTOP = "moneynotop";
    public static final String INPUT_TYPE_VALUE_MONTH = "month";
    public static final String INPUT_TYPE_VALUE_NUM = "num";
    public static final String INPUT_TYPE_VALUE_NUMBER = "number";
    public static final String INPUT_TYPE_VALUE_PASSWORD = "password";
    public static final String INPUT_TYPE_VALUE_PAYPWD = "paypwd";
    public static final String INPUT_TYPE_VALUE_PAYSPWD = "payspwd";
    public static final String INPUT_TYPE_VALUE_PHONE = "phone";
    public static final String INPUT_TYPE_VALUE_STYLENONE = "stylenone";
    public static final String INPUT_TYPE_VALUE_STYLENONEPAD = "stylenonepad";
    public static final String INPUT_TYPE_VALUE_STYLEPHONE = "stylephone";
    public static final String INPUT_TYPE_VALUE_STYLEPHONEPAD = "stylephonepad";
    public static final String INPUT_TYPE_VALUE_STYLEPOINT = "stylepoint";
    public static final String INPUT_TYPE_VALUE_STYLEPOINTPAD = "stylepointpad";
    public static final String INPUT_TYPE_VALUE_STYLEX = "stylex";
    public static final String INPUT_TYPE_VALUE_STYLEXPAD = "stylexpad";
    public static final String INPUT_TYPE_VALUE_TINYAPPNUMBER = "tinyappnumber";

    public static Bitmap blur(Bitmap bitmap, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b3fd28cf", new Object[]{bitmap, view, new Integer(i)});
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

    public static TemplateKeyboardService genDefaultKeyboardService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateKeyboardService) ipChange.ipc$dispatch("592aaa51", new Object[0]);
        }
        return new TemplateKeyboardService() { // from class: com.alipay.birdnest.util.UiUtil.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f3836a = false;

            @Override // com.alipay.android.app.template.TemplateKeyboardService
            public void destroyKeyboard(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ceb8b1ca", new Object[]{this, view});
                }
            }

            @Override // com.alipay.android.app.template.TemplateKeyboardService
            public boolean hideKeyboard(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("cc85cb86", new Object[]{this, view})).booleanValue();
                }
                UiUtil.hideKeybroad(view.getWindowToken(), view.getContext());
                boolean z = this.f3836a;
                this.f3836a = false;
                return z;
            }

            @Override // com.alipay.android.app.template.TemplateKeyboardService
            public boolean showKeyboard(EditText editText, KeyboardType keyboardType, View view, View view2, boolean z, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9bce61c5", new Object[]{this, editText, keyboardType, view, view2, new Boolean(z), new Integer(i)})).booleanValue();
                }
                UiUtil.showKeybroad(editText, i);
                this.f3836a = true;
                return true;
            }
        };
    }

    public static Drawable getLocalDrawable(String str, Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("618bd756", new Object[]{str, context, new Integer(i), new Integer(i2)}) : getLocalDrawable(str, context, i, i2, false);
    }

    public static Drawable getPaddingDrawable(int i, int i2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2d52a2f2", new Object[]{new Integer(i), new Integer(i2), context});
        }
        if (context != null) {
            Resources resources = context.getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 320;
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, options);
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth() + ((int) (FBDocumentAssistor.getDp() * 6.0f)), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
            canvas.drawBitmap(decodeResource, rect, rect, (Paint) null);
            return new BitmapDrawable(resources, createBitmap);
        }
        throw new IllegalArgumentException("Invalid context");
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

    public static void setAlpha(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b035a251", new Object[]{view, new Float(f)});
        } else {
            view.setAlpha(f);
        }
    }

    public static void showKeybroad(final EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b50f0b", new Object[]{editText, new Integer(i)});
        } else if (editText != null) {
            editText.postDelayed(new Runnable() { // from class: com.alipay.birdnest.util.UiUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                    } catch (Throwable th) {
                        FBLogger.e("UiUtil", th);
                    }
                }
            }, i);
        }
    }

    public static Bitmap toGrayscale(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d06b6459", new Object[]{bitmap});
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Drawable getLocalDrawable(String str, Context context, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7792ec4a", new Object[]{str, context, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        int indexOf = str.indexOf("/");
        String packageName = context.getPackageName();
        if (indexOf > 0) {
            packageName = str.substring(0, indexOf);
        }
        if (TextUtils.equals("com.alipay.android.app.template", context.getPackageName())) {
            packageName = context.getPackageName();
        }
        String substring = str.substring(indexOf + 1);
        if (!TextUtils.isEmpty(substring)) {
            int indexOf2 = substring.indexOf(".");
            if (indexOf2 > 0) {
                substring = substring.substring(0, indexOf2);
            }
            int resourceId = ResUtils.getResourceId(context, substring, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, packageName);
            if (!(resourceId == 0 || resourceId == -1)) {
                if (i != -1 || i2 != -1) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), resourceId);
                    int abs = Math.abs(i - decodeResource.getWidth());
                    if (Math.abs(i2 - decodeResource.getHeight()) < 1 && abs < 1) {
                        return new BitmapDrawable(context.getResources(), decodeResource);
                    }
                    Matrix matrix = new Matrix();
                    matrix.postScale(i / decodeResource.getWidth(), i2 / decodeResource.getHeight());
                    Bitmap createBitmap = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
                    decodeResource.recycle();
                    if (createBitmap != null) {
                        return new BitmapDrawable(context.getResources(), createBitmap);
                    }
                } else if (z) {
                    return new BitmapDrawable(context.getResources(), toGrayscale(BitmapFactory.decodeResource(context.getResources(), resourceId)));
                } else {
                    return context.getResources().getDrawable(resourceId);
                }
            }
        }
        return null;
    }

    public static void hideKeybroad(IBinder iBinder, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f197c5d5", new Object[]{iBinder, context});
        } else {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(iBinder, 2);
        }
    }

    public static String readAssetsFile(String str, AssetManager assetManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe77c6d", new Object[]{str, assetManager});
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStream open = assetManager.open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            char[] cArr = new char[2048];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            bufferedReader.close();
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e) {
                    FBLogger.e("readAssetsFile", e);
                }
            }
        } catch (IOException e2) {
            FBLogger.e("readAssetsFile", e2);
        }
        return sb.toString();
    }

    public static void disableSystemSoftInput(EditText editText) {
        try {
            editText.setShowSoftInputOnFocus(false);
        } catch (Exception e) {
            FBLogger.e("disableSystemSoftInput case 1", e);
        }
        try {
            Method method = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(editText, Boolean.FALSE);
        } catch (Exception e2) {
            FBLogger.e("disableSystemSoftInput case 2", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0121, code lost:
        if (r4.equals(com.alipay.birdnest.util.UiUtil.INPUT_TYPE_VALUE_EXTERNALALPHABET) == false) goto L_0x0021;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alipay.android.app.template.KeyboardType getKeyboardType(java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.birdnest.util.UiUtil.getKeyboardType(java.lang.String):com.alipay.android.app.template.KeyboardType");
    }

    public static StateListDrawable genButtonSelector(Context context, String str, int i, int i2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateListDrawable) ipChange.ipc$dispatch("9fbb7726", new Object[]{context, str, new Integer(i), new Integer(i2), strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        boolean z = true;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str2 = strArr[i3];
            if (!TextUtils.isEmpty(str2)) {
                Drawable localDrawable = getLocalDrawable(str2, context, i, i2);
                boolean z2 = TextUtils.equals(str, INPUT_TYPE_VALUE_CHECKBOX) || TextUtils.equals(str, "radio");
                int i4 = z2 ? 16842912 : 16842919;
                if (i3 == 0) {
                    if (z2) {
                        stateListDrawable.addState(new int[]{-i4}, localDrawable);
                    } else {
                        stateListDrawable.addState(new int[]{16842910, -i4, -16842908}, localDrawable);
                    }
                } else if (i3 == 1) {
                    if (z2) {
                        stateListDrawable.addState(new int[]{i4}, localDrawable);
                    } else {
                        stateListDrawable.addState(new int[]{16842910, i4}, localDrawable);
                        stateListDrawable.addState(new int[]{16842910, 16842908}, localDrawable);
                    }
                } else if (i3 == 2 && !z2) {
                    stateListDrawable.addState(new int[]{-16842910}, localDrawable);
                }
                z = false;
            }
        }
        if (z) {
            return null;
        }
        return stateListDrawable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0101, code lost:
        if (r5.equals(com.alipay.birdnest.util.UiUtil.INPUT_TYPE_VALUE_MONEYNOTOP) == false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isUseDefaultKeyboard(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.birdnest.util.UiUtil.isUseDefaultKeyboard(java.lang.String, java.lang.String):boolean");
    }
}
