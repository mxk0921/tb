package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y45 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HEIGHT = 1;
    public static final int MARGINBOTTOM = 5;
    public static final int MARGINLEFT = 2;
    public static final int MARGINRIGHT = 4;
    public static final int MARGINTOP = 3;
    public static final int WIDTH = 0;

    static {
        t2o.a(444596363);
    }

    public static int a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("265dc943", new Object[]{map})).intValue();
        }
        if (map.containsKey("dGravity")) {
            switch (Integer.valueOf((String) map.get("dGravity")).intValue()) {
                case 0:
                    return 48;
                case 1:
                    return 16;
                case 2:
                    return 80;
                case 3:
                    return 49;
                case 4:
                    return 17;
                case 5:
                    return 81;
                case 6:
                    return 53;
                case 7:
                    return 21;
                case 8:
                    return 85;
            }
        }
        return -1;
    }

    public static int d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable th) {
            if (tl7.f()) {
                ym7.l(tl7.TAG, th, str, "写法错误，解析出错");
            }
            return i;
        }
    }

    public static int[] b(Context context, Map<String, Object> map) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("daac3bb7", new Object[]{context, map});
        }
        String str = (String) map.get("dWidth");
        String str2 = (String) map.get("dHeight");
        if (TextUtils.equals(str, "match_content")) {
            i = -2;
        } else {
            i = TextUtils.equals(str, "match_parent") ? -1 : owo.e(context, str, 0);
        }
        if (TextUtils.equals(str2, "match_content")) {
            i2 = -2;
        } else {
            i2 = TextUtils.equals(str2, "match_parent") ? -1 : owo.e(context, str2, 0);
        }
        return new int[]{i, i2, owo.e(context, map.get("dMarginLeft"), 0), owo.e(context, map.get("dMarginTop"), 0), owo.e(context, map.get("dMarginRight"), 0), owo.e(context, map.get("dMarginBottom"), 0)};
    }

    public static void c(View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d296666b", new Object[]{view, viewGroup});
            return;
        }
        en7 en7Var = (en7) view.getTag(jn7.PROPERTY_KEY);
        if (en7Var != null && (view instanceof ViewGroup)) {
            int[] b = b(view.getContext(), en7Var.b);
            if (viewGroup == null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(b[0], b[1]);
                marginLayoutParams.setMargins(b[2], b[3], b[4], b[5]);
                view.setLayoutParams(marginLayoutParams);
                if (tl7.f()) {
                    ym7.a(tl7.TAG, "reflect layout params fail");
                    return;
                }
                return;
            }
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) bun.b(viewGroup, "generateDefaultLayoutParams", new Object[0]);
            if (layoutParams != null) {
                layoutParams.width = b[0];
                layoutParams.height = b[1];
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(b[2], b[3], b[4], b[5]);
                }
                view.setLayoutParams(layoutParams);
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(b[0], b[1]);
            marginLayoutParams2.setMargins(b[2], b[3], b[4], b[5]);
            view.setLayoutParams(marginLayoutParams2);
            if (tl7.f()) {
                ym7.a(tl7.TAG, "reflect layout params fail");
            }
        }
    }
}
