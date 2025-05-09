package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.ui.SpecialUiTypeInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class wuu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_CAPTURE = 0;
    public static final int STATE_CONFIRM = 1;

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, SpecialUiTypeInfo> f30942a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a extends TypeReference<HashMap<String, SpecialUiTypeInfo>> {
    }

    static {
        t2o.a(245366980);
    }

    public static String a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67dc4ef8", new Object[]{str, new Integer(i)});
        }
        return str + "_" + i;
    }

    public static int b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ef3c95a", new Object[]{context, str, str2})).intValue();
        }
        String str3 = null;
        if (TextUtils.isEmpty(null)) {
            str3 = context.getPackageName();
        }
        return context.getResources().getIdentifier(str, str2, str3);
    }

    public static String c(Context context, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("708973eb", new Object[]{context, new Integer(i), str, new Integer(i2)});
        }
        String str2 = "zdoc_capture_";
        if (i != 0 && i == 1) {
            str2 = "zdoc_confirm_";
        }
        String g = g(context, str2 + str + "_" + i2);
        if (!TextUtils.isEmpty(g)) {
            return g;
        }
        if (i == 0) {
            return context.getResources().getString(R.string.zdoc_capture);
        }
        if (i == 1) {
            return context.getResources().getString(R.string.zdoc_confirm);
        }
        return g;
    }

    public static int d(Context context, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e793032f", new Object[]{context, new Integer(i), str, new Integer(i2)})).intValue();
        }
        int b = b(context, "layout_manual_" + i, "layout");
        if (b == 0) {
            b = m(context, a(str, i2));
        }
        if (b == 0) {
            b = m(context, String.valueOf(i));
        }
        if (b == 0) {
            return R.layout.layout_manual_stand_frame;
        }
        return b;
    }

    public static String e(Context context, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b778521", new Object[]{context, new Integer(i), str, new Integer(i2)});
        }
        k(context);
        SpecialUiTypeInfo specialUiTypeInfo = f30942a.get(a(str, i2));
        if (specialUiTypeInfo == null) {
            specialUiTypeInfo = f30942a.get(Integer.valueOf(i));
        }
        if (specialUiTypeInfo == null) {
            return h(context, "main_message_", String.valueOf(i));
        }
        return g(context, specialUiTypeInfo.getTestResId());
    }

    public static String f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d5a7efc", new Object[]{context, str});
        }
        try {
            return context.getResources().getString(b(context, str, "string"));
        } catch (Exception e) {
            BioLog.e(e);
            return "";
        }
    }

    public static String g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fa2ef02", new Object[]{context, str});
        }
        return f(context, str);
    }

    public static String h(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fcce3a3", new Object[]{context, str, str2});
        }
        return g(context, str + str2);
    }

    public static String i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42e57a74", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        return context.getResources().getString(R.string.zdoc_success);
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba718c1b", new Object[]{context});
        }
        if (context == null) {
            return "";
        }
        return context.getResources().getString(R.string.zdoc_processing);
    }

    public static void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f1cb5f", new Object[]{context});
        } else {
            l(context, false);
        }
    }

    public static void l(Context context, boolean z) {
        String str;
        HashMap<String, SpecialUiTypeInfo> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6485355", new Object[]{context, new Boolean(z)});
        } else if (z || (hashMap = f30942a) == null || hashMap.isEmpty()) {
            byte[] assetsData = FileUtil.getAssetsData(context.getApplicationContext().getResources(), "special_ui_type.json");
            if (assetsData != null) {
                str = new String(assetsData);
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                f30942a = (HashMap) JSON.parseObject(str, new a(), new Feature[0]);
            }
            if (f30942a == null) {
                f30942a = new HashMap<>();
            }
        }
    }

    public static int m(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b0f606d", new Object[]{context, str})).intValue();
        }
        k(context);
        SpecialUiTypeInfo specialUiTypeInfo = f30942a.get(str);
        if (specialUiTypeInfo != null) {
            return b(context, specialUiTypeInfo.getLayout(), "layout");
        }
        return 0;
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
            return;
        }
        HashMap<String, SpecialUiTypeInfo> hashMap = f30942a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
