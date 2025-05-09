package tb;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j5m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_VERSION = "6.0";
    public static final String SDK_VERSION = "1";

    static {
        t2o.a(779092976);
    }

    public static float a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258e00ce", new Object[]{context})).floatValue();
        }
        return k(context) / 375.0f;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[0]);
        }
        return API_VERSION;
    }

    public static JSONObject c(Context context, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e87f6257", new Object[]{context, ux9Var});
        }
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            float g = g(context);
            jSONObject.put("apiVersion", b());
            jSONObject.put("appVersion", e(context));
            jSONObject.put("sdkVersion", "1");
            jSONObject.put("platform", h(context));
            jSONObject.put("scale", g);
            jSONObject.put("apScale", a(context));
            jSONObject.put("safeAreaInsetTop", hw0.j(context));
            jSONObject.put("safeAreaInsetBottom", hw0.d(context));
            jSONObject.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, k(context) / g);
            jSONObject.put("screenHeight", i(context) / g);
            jSONObject.put(yj4.PARAM_SCREEN_ORIENTATION, j(context));
            jSONObject.put("isPad", vc.i(context));
            jSONObject.put("isFoldableScreen", vc.e(context));
            jSONObject.put("bottomRightPocketWidth", vc.b(context) / g);
            jSONObject.put("padMaxHeight", vc.c(context) / g);
            jSONObject.put("isLandscape", vc.f(context));
            jSONObject.put("isDisplayCutout", iba.v(((cdr) ux9Var).j()));
            jSONObject.put("cutoutHeight", iba.f(((cdr) ux9Var).j()));
            jSONObject.put("realCutoutHeight", iba.E(((cdr) ux9Var).j()));
            if (ux9Var != null) {
                jSONObject.put("landscapeContext", ux9Var.c);
            }
            jSONObject.put("appKey", d());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[0]);
        }
        if (v2s.o().f() != null) {
            return v2s.o().f().getAppKey();
        }
        return "";
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e616e24c", new Object[]{context});
        }
        if (context == null) {
            return "1.0";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "1.0";
        }
    }

    public static String f(Context context) {
        Resources resources;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5730a69f", new Object[]{context});
        }
        if (!(context == null || (resources = context.getResources()) == null || (identifier = resources.getIdentifier("build_id", "string", context.getPackageName())) <= 0)) {
            try {
                return resources.getString(identifier);
            } catch (Exception unused) {
            }
        }
        return "unknown";
    }

    public static float g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7077e19f", new Object[]{context})).floatValue();
        }
        if (context != null) {
            return context.getResources().getDisplayMetrics().density;
        }
        return 1.0f;
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1aa913c8", new Object[]{context});
        }
        if (v2s.o().f() != null) {
            return v2s.o().f().getAppName(context);
        }
        return "unknow";
    }

    public static int i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if ("landscape".equals(j(context))) {
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            return i < i2 ? i : i2;
        }
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        return i3 > i4 ? i3 : i4;
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("550de2d", new Object[]{context});
        }
        if (context == null || !(context instanceof Activity) || ((Activity) context).getRequestedOrientation() != 0) {
            return "portrait";
        }
        return "landscape";
    }

    public static int k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if ("landscape".equals(j(context))) {
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            return i > i2 ? i : i2;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        return i3 < i4 ? i3 : i4;
    }

    public static boolean l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("828c6dd", new Object[]{str, str2})).booleanValue();
        }
        if (!yqq.e(str)) {
            yqq.e(str2);
        }
        return false;
    }
}
