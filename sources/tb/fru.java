package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Typeface> f19493a = new HashMap<>();

    static {
        t2o.a(503317439);
    }

    public static Typeface a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("cd237fd5", new Object[]{context});
        }
        HashMap<String, Typeface> hashMap = f19493a;
        Typeface typeface = hashMap.get("default");
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = new TextView(context).getTypeface();
        if (typeface2 == null) {
            typeface2 = Typeface.DEFAULT;
        }
        hashMap.put("default", typeface2);
        return typeface2;
    }

    public static int b(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f38a2d5", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        boolean z = false;
        boolean z2 = false;
        for (String str2 : str.toLowerCase().trim().split(SymbolExpUtil.SYMBOL_VERTICALBAR)) {
            if ("bold".equals(str2)) {
                z = true;
            } else if ("italic".equals(str2)) {
                z2 = true;
            }
        }
        if (z && z2) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        return 0;
    }

    public static Typeface c(Context context, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("be34ea61", new Object[]{context, str2, str2, new Boolean(z), new Boolean(z2)});
        }
        int b = b(str2);
        if (b != 0 || TextUtils.isEmpty(str2) || "normal".equals(str2)) {
            str2 = null;
        }
        if (z2) {
            b = 1;
        }
        if (TextUtils.isEmpty(str2)) {
        }
        if (z) {
            str2 = "uik_iconfont.ttf";
        }
        if (!TextUtils.isEmpty(str2)) {
            Typeface typeface = f19493a.get(str2);
            if (typeface == null) {
                try {
                    typeface = Typeface.createFromAsset(context.getAssets(), str2);
                } catch (Exception unused) {
                }
                if (typeface == null) {
                    typeface = a(context);
                }
                f19493a.put(str2, typeface);
            }
            return Typeface.create(typeface, b);
        } else if (b == 1) {
            return Typeface.SANS_SERIF;
        } else {
            return Typeface.create(a(context), b);
        }
    }
}
