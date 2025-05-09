package tb;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class owo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f25714a = -1;
    public static int b = -1;
    public static float c = -1.0f;

    static {
        t2o.a(444596369);
    }

    public static boolean a() {
        Resources resources;
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("790ef74d", new Object[0])).booleanValue();
        }
        Context a2 = tl7.a();
        if (a2 == null || (resources = a2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null || Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) == g(a2)) {
            return false;
        }
        return true;
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da62ed8", new Object[0]);
            return;
        }
        f25714a = -1;
        c = -1.0f;
        if (tl7.a() != null) {
            g(tl7.a());
            d(tl7.a());
        }
    }

    public static float d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7077e19f", new Object[]{context})).floatValue();
        }
        if (c < 0.0f) {
            c = context.getResources().getDisplayMetrics().density;
        }
        return c;
    }

    public static int e(Context context, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70e78bd7", new Object[]{context, obj, new Integer(i)})).intValue();
        }
        if (obj == null) {
            return i;
        }
        String lowerCase = String.valueOf(obj).toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            if (tl7.f()) {
                ym7.a(tl7.TAG, "size属性为空字符串");
            }
            return i;
        }
        try {
            int g = g(context);
            float d = d(context);
            if (lowerCase.contains("np")) {
                return (int) (Float.parseFloat(lowerCase.replace("np", "")) * d);
            }
            if (lowerCase.contains("ap")) {
                return Math.round(g * (Float.parseFloat(lowerCase.replace("ap", "")) / 375.0f));
            }
            return Math.round(g * (Float.parseFloat(lowerCase) / 375.0f));
        } catch (NumberFormatException unused) {
            if (tl7.f()) {
                ym7.m(tl7.TAG, (String) obj, "写法错误，解析出错");
            }
            return i;
        }
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (b < 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            b = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        return b;
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        if (f25714a < 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f25714a = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        return f25714a;
    }

    public static int h(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20fc282f", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f * context.getResources().getDisplayMetrics().scaledDensity);
    }
}
