package com.alipay.android.app.safepaybase.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.android.app.render.api.RenderEnv;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.safepaysdk.BuildConfig;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.lang.reflect.Field;
import tb.pg1;
import tb.zk4;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ResUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f3492a;
    public static String b;
    public static final String c;

    static {
        String str;
        if (RenderEnv.isWallet()) {
            str = BuildConfig.APPLICATION_ID;
        } else {
            str = "com.alipay.android.app";
        }
        b = str;
        c = BuildConfig.APPLICATION_ID;
    }

    public static int a(String str, String str2) {
        Context context = f3492a;
        try {
            String str3 = b;
            int intValue = ((Integer) Class.forName(str3 + ".R$" + str2).getField(str).get(null)).intValue();
            if (intValue > 0) {
                return intValue;
            }
            int resourceId = getResourceId(context, str, str2);
            if (resourceId > 0) {
                return resourceId;
            }
            String str4 = c;
            return ((Integer) Class.forName(str4 + ".R$" + str2).getField(str).get(null)).intValue();
        } catch (Exception unused) {
            return context.getResources().getIdentifier(str, str2, context.getPackageName());
        }
    }

    public static int b(String str, String str2) {
        Context context = f3492a;
        String packageName = getPackageName(context);
        try {
            int resourceId = getResourceId(context, str, str2);
            if (resourceId > 0) {
                return resourceId;
            }
            return ((Integer) Class.forName(packageName + ".R$" + str2).getField(str).get(null)).intValue();
        } catch (Exception unused) {
            return context.getResources().getIdentifier(str, str2, context.getPackageName());
        }
    }

    public static int getAnimId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5449b06", new Object[]{str})).intValue();
        }
        return getResourceId(str, "anim");
    }

    public static int getColorId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ba6b42c", new Object[]{str})).intValue();
        }
        return getResourceId(str, "color");
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return f3492a;
    }

    public static int getDimenId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b62309fa", new Object[]{str})).intValue();
        }
        return getResourceId(str, "dimen");
    }

    public static int getDrawableId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("442f9793", new Object[]{str})).intValue();
        }
        return getResourceId(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
    }

    public static int getId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eeb42d5", new Object[]{str})).intValue();
        }
        return getResourceId(str, "id");
    }

    public static int getLayoutId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("caae939f", new Object[]{str})).intValue();
        }
        return getResourceId(str, "layout");
    }

    public static String getPackageName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b1a51a", new Object[]{context});
        }
        return b;
    }

    public static int getRawId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1260871", new Object[]{str})).intValue();
        }
        return getResourceId(str, pg1.ATOM_raw);
    }

    public static final int[] getResourceDeclareStyleableIntArray(Context context, String str) {
        Field[] fields;
        try {
            for (Field field : Class.forName(getPackageName(context) + ".R$styleable").getFields()) {
                if (field.getName().equals(str)) {
                    return (int[]) field.get(null);
                }
            }
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
        return null;
    }

    public static int getResourceId(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b22610cd", new Object[]{str, str2})).intValue() : RenderEnv.isWallet() ? b(str, str2) : a(str, str2);
    }

    public static int getStringId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f527386", new Object[]{str})).intValue();
        }
        return getResourceId(str, "string");
    }

    public static int getStyleId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91d8187a", new Object[]{str})).intValue();
        }
        return getResourceId(str, "style");
    }

    public static int getStyleableId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d331ca54", new Object[]{str})).intValue();
        }
        return getResourceId(str, "styleable");
    }

    public static int[] getStyleableIds(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("7a312270", new Object[]{str});
        }
        return getResourceDeclareStyleableIntArray(f3492a, str);
    }

    public static int getXmlId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1290360", new Object[]{str})).intValue();
        }
        return getResourceId(str, "xml");
    }

    public static void setPackageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2292780", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static void setUiContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807ab188", new Object[]{context});
        } else if (context != null) {
            f3492a = context.getApplicationContext();
        }
    }

    public static Drawable getPaddingDrawable(int i, int i2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2d52a2f2", new Object[]{new Integer(i), new Integer(i2), context});
        }
        if (context != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            Resources resources = context.getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = 320;
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, options);
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth() + ((int) (displayMetrics.density * 6.0f)), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
            canvas.drawBitmap(decodeResource, rect, rect, (Paint) null);
            return new BitmapDrawable(resources, createBitmap);
        }
        throw new IllegalArgumentException("Invalid context");
    }

    public static int getResourceId(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23b54bc9", new Object[]{context, str, str2})).intValue();
        }
        try {
            return context.getResources().getIdentifier(str, str2, getPackageName(context));
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            return -1;
        }
    }

    public static int getResourceId(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da4b6c13", new Object[]{context, str, str2, str3})).intValue();
        }
        try {
            return f3492a.getResources().getIdentifier(str, str2, str3);
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
            return -1;
        }
    }
}
