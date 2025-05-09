package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pgj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSISTANT_SWITCH_ENABLE = "assistant_switch_enable";
    public static final String CART_SWITCH_NAME = "mtb_setting_cart_sake_enable";
    public static final String JSON_SHAREDPREFERENCES = "json_sharedpreferences";
    public static final String OCR_SWITCH_NAME = "mtb_setting_ocr_enable";

    /* renamed from: a  reason: collision with root package name */
    public static int f26081a = 0;

    static {
        t2o.a(745538202);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5c491d", new Object[]{str, str2});
        } else if (str != null) {
            SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences("json_sharedpreferences", 0).edit();
            if (str2 == null) {
                edit.remove(str);
            } else {
                edit.putString(str, str2);
            }
            edit.commit();
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f637770", new Object[0])).intValue();
        }
        return d() + DensityUtil.dip2px(Globals.getApplication(), 48.0f);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b911318", new Object[]{str});
        }
        return Globals.getApplication().getSharedPreferences("json_sharedpreferences", 0).getString(str, null);
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e57f634", new Object[0])).intValue();
        }
        int i = f26081a;
        if (i > 0) {
            return i;
        }
        int statusBarHeight = SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
        f26081a = statusBarHeight;
        return statusBarHeight;
    }
}
